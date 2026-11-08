package io.flutter.embedding.engine.renderer;

import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.hardware.SyncFence;
import android.media.Image;
import android.media.ImageReader;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Surface;
import androidx.annotation.Keep;
import androidx.lifecycle.AbstractC3339d;
import androidx.lifecycle.C3359x;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.InterfaceC3349n;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.embedding.engine.renderer.FlutterRenderer;
import io.flutter.view.AbstractC4812q;
import io.flutter.view.TextureRegistry;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;
import p370w4.AbstractC6917b;

/* loaded from: classes.dex */
public class FlutterRenderer implements TextureRegistry {

    /* renamed from: i */
    public static boolean f17356i = false;

    /* renamed from: j */
    public static boolean f17357j = false;

    /* renamed from: a */
    public final FlutterJNI f17358a;

    /* renamed from: c */
    public Surface f17360c;

    /* renamed from: h */
    public final InterfaceC4685m f17365h;

    /* renamed from: b */
    public final AtomicLong f17359b = new AtomicLong(0);

    /* renamed from: d */
    public boolean f17361d = false;

    /* renamed from: e */
    public final Handler f17362e = new Handler();

    /* renamed from: f */
    public final Set f17363f = new HashSet();

    /* renamed from: g */
    public final List f17364g = new ArrayList();

    @Keep
    public final class ImageReaderSurfaceProducer implements TextureRegistry.SurfaceProducer, TextureRegistry.ImageConsumer, TextureRegistry.InterfaceC4794b {
        private static final boolean CLEANUP_ON_MEMORY_PRESSURE = true;
        private static final int MAX_DEQUEUED_IMAGES = 2;
        private static final int MAX_IMAGES = 6;
        private static final String TAG = "ImageReaderSurfaceProducer";
        private static final boolean VERBOSE_LOGS = false;
        private static final boolean trimOnMemoryPressure = true;

        /* renamed from: id */
        private final long f17366id;
        private boolean released;
        private boolean ignoringFence = false;
        private int requestedWidth = 1;
        private int requestedHeight = 1;
        private boolean createNewReader = true;
        private boolean notifiedDestroy = false;
        private long lastDequeueTime = 0;
        private long lastQueueTime = 0;
        private long lastScheduleTime = 0;
        private int numTrims = 0;
        private final Object lock = new Object();
        private final ArrayDeque<C4664b> imageReaderQueue = new ArrayDeque<>();
        private final HashMap<ImageReader, C4664b> perImageReaders = new HashMap<>();
        private ArrayList<C4663a> lastDequeuedImage = new ArrayList<>();
        private C4664b lastReaderDequeuedFrom = null;
        private TextureRegistry.SurfaceProducer.InterfaceC4792a callback = null;

        /* renamed from: io.flutter.embedding.engine.renderer.FlutterRenderer$ImageReaderSurfaceProducer$a */
        public class C4663a {

            /* renamed from: a */
            public final Image f17367a;

            /* renamed from: b */
            public final long f17368b;

            public C4663a(Image image, long j7) {
                this.f17367a = image;
                this.f17368b = j7;
            }
        }

        /* renamed from: io.flutter.embedding.engine.renderer.FlutterRenderer$ImageReaderSurfaceProducer$b */
        public class C4664b {

            /* renamed from: a */
            public final ImageReader f17370a;

            /* renamed from: b */
            public final ArrayDeque f17371b = new ArrayDeque();

            /* renamed from: c */
            public boolean f17372c = false;

            public C4664b(ImageReader imageReader) {
                this.f17370a = imageReader;
                imageReader.setOnImageAvailableListener(new ImageReader.OnImageAvailableListener() { // from class: io.flutter.embedding.engine.renderer.j
                    @Override // android.media.ImageReader.OnImageAvailableListener
                    public final void onImageAvailable(ImageReader imageReader2) {
                        FlutterRenderer.ImageReaderSurfaceProducer.C4664b.this.m20279g(imageReader2);
                    }
                }, new Handler(Looper.getMainLooper()));
            }

            /* renamed from: c */
            public boolean m20275c() {
                return this.f17371b.isEmpty() && ImageReaderSurfaceProducer.this.lastReaderDequeuedFrom != this;
            }

            /* renamed from: d */
            public void m20276d() {
                this.f17372c = true;
                this.f17370a.close();
                this.f17371b.clear();
            }

            /* renamed from: e */
            public C4663a m20277e() {
                if (this.f17371b.isEmpty()) {
                    return null;
                }
                return (C4663a) this.f17371b.removeFirst();
            }

            /* renamed from: f */
            public boolean m20278f() {
                return this.f17371b.isEmpty();
            }

            /* renamed from: g */
            public final /* synthetic */ void m20279g(ImageReader imageReader) {
                Image image;
                try {
                    image = imageReader.acquireLatestImage();
                } catch (IllegalStateException e7) {
                    AbstractC6917b.m28354b(ImageReaderSurfaceProducer.TAG, "onImageAvailable acquireLatestImage failed: " + e7);
                    image = null;
                }
                if (image == null) {
                    return;
                }
                if (ImageReaderSurfaceProducer.this.released || this.f17372c) {
                    image.close();
                } else {
                    ImageReaderSurfaceProducer.this.onImage(imageReader, image);
                }
            }

            /* renamed from: h */
            public C4663a m20280h(Image image) {
                if (this.f17372c) {
                    return null;
                }
                C4663a c4663a = ImageReaderSurfaceProducer.this.new C4663a(image, System.nanoTime());
                this.f17371b.add(c4663a);
                while (this.f17371b.size() > 2) {
                    ((C4663a) this.f17371b.removeFirst()).f17367a.close();
                }
                return c4663a;
            }
        }

        public ImageReaderSurfaceProducer(long j7) {
            this.f17366id = j7;
        }

        private void cleanup() {
            synchronized (this.lock) {
                try {
                    for (C4664b c4664b : this.perImageReaders.values()) {
                        if (this.lastReaderDequeuedFrom == c4664b) {
                            this.lastReaderDequeuedFrom = null;
                        }
                        c4664b.m20276d();
                    }
                    this.perImageReaders.clear();
                    if (this.lastDequeuedImage.size() > 0) {
                        Iterator<C4663a> it = this.lastDequeuedImage.iterator();
                        while (it.hasNext()) {
                            it.next().f17367a.close();
                        }
                        this.lastDequeuedImage.clear();
                    }
                    C4664b c4664b2 = this.lastReaderDequeuedFrom;
                    if (c4664b2 != null) {
                        c4664b2.m20276d();
                        this.lastReaderDequeuedFrom = null;
                    }
                    this.imageReaderQueue.clear();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        private ImageReader createImageReader() {
            int i7 = Build.VERSION.SDK_INT;
            if (i7 >= 33) {
                return createImageReader33();
            }
            if (i7 >= 29) {
                return createImageReader29();
            }
            throw new UnsupportedOperationException("ImageReaderPlatformViewRenderTarget requires API version 29+");
        }

        private ImageReader createImageReader29() {
            ImageReader newInstance;
            newInstance = ImageReader.newInstance(this.requestedWidth, this.requestedHeight, 34, 6, 256L);
            return newInstance;
        }

        private ImageReader createImageReader33() {
            ImageReader build;
            AbstractC4680h.m20305a();
            ImageReader.Builder m20304a = AbstractC4679g.m20304a(this.requestedWidth, this.requestedHeight);
            m20304a.setMaxImages(6);
            m20304a.setImageFormat(34);
            m20304a.setUsage(256L);
            build = m20304a.build();
            return build;
        }

        private C4664b getActiveReader() {
            synchronized (this.lock) {
                try {
                    if (!this.createNewReader) {
                        return this.imageReaderQueue.peekLast();
                    }
                    this.createNewReader = false;
                    return getOrCreatePerImageReader(createImageReader());
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$dequeueImage$0() {
            if (this.released) {
                return;
            }
            FlutterRenderer.this.m20267w();
        }

        private void maybeWaitOnFence(Image image) {
            if (image == null || this.ignoringFence) {
                return;
            }
            if (Build.VERSION.SDK_INT >= 33) {
                waitOnFence(image);
            } else {
                this.ignoringFence = true;
                AbstractC6917b.m28353a(TAG, "ImageTextureEntry can't wait on the fence on Android < 33");
            }
        }

        private void releaseInternal() {
            cleanup();
            this.released = true;
            FlutterRenderer.this.m20266v(this);
            FlutterRenderer.this.f17364g.remove(this);
        }

        private void waitOnFence(Image image) {
            SyncFence fence;
            try {
                fence = image.getFence();
                fence.awaitForever();
            } catch (IOException unused) {
            }
        }

        @Override // io.flutter.view.TextureRegistry.ImageConsumer
        public Image acquireLatestImage() {
            C4663a dequeueImage = dequeueImage();
            if (dequeueImage == null) {
                return null;
            }
            maybeWaitOnFence(dequeueImage.f17367a);
            return dequeueImage.f17367a;
        }

        public double deltaMillis(long j7) {
            return j7 / 1000000.0d;
        }

        public C4663a dequeueImage() {
            C4663a c4663a;
            boolean z6;
            synchronized (this.lock) {
                try {
                    Iterator<C4664b> it = this.imageReaderQueue.iterator();
                    c4663a = null;
                    while (true) {
                        z6 = false;
                        if (!it.hasNext()) {
                            break;
                        }
                        C4664b next = it.next();
                        C4663a m20277e = next.m20277e();
                        if (m20277e == null) {
                            c4663a = m20277e;
                        } else {
                            while (this.lastDequeuedImage.size() > 2) {
                                this.lastDequeuedImage.remove(0).f17367a.close();
                            }
                            this.lastDequeuedImage.add(m20277e);
                            this.lastReaderDequeuedFrom = next;
                            c4663a = m20277e;
                        }
                    }
                    pruneImageReaderQueue();
                    Iterator<C4664b> it2 = this.imageReaderQueue.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        if (!it2.next().m20278f()) {
                            z6 = true;
                            break;
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (z6) {
                FlutterRenderer.this.f17362e.post(new Runnable() { // from class: io.flutter.embedding.engine.renderer.i
                    @Override // java.lang.Runnable
                    public final void run() {
                        FlutterRenderer.ImageReaderSurfaceProducer.this.lambda$dequeueImage$0();
                    }
                });
            }
            return c4663a;
        }

        public void disableFenceForTest() {
            this.ignoringFence = true;
        }

        public void finalize() {
            try {
                if (this.released) {
                    return;
                }
                releaseInternal();
                FlutterRenderer.this.f17362e.post(new RunnableC4671g(this.f17366id, FlutterRenderer.this.f17358a));
            } finally {
                super.finalize();
            }
        }

        @Override // io.flutter.view.TextureRegistry.SurfaceProducer
        public int getHeight() {
            return this.requestedHeight;
        }

        public C4664b getOrCreatePerImageReader(ImageReader imageReader) {
            C4664b c4664b = this.perImageReaders.get(imageReader);
            if (c4664b != null) {
                return c4664b;
            }
            C4664b c4664b2 = new C4664b(imageReader);
            this.perImageReaders.put(imageReader, c4664b2);
            this.imageReaderQueue.add(c4664b2);
            return c4664b2;
        }

        @Override // io.flutter.view.TextureRegistry.SurfaceProducer
        public Surface getSurface() {
            return getActiveReader().f17370a.getSurface();
        }

        @Override // io.flutter.view.TextureRegistry.SurfaceProducer
        public int getWidth() {
            return this.requestedWidth;
        }

        @Override // io.flutter.view.TextureRegistry.SurfaceProducer
        public boolean handlesCropAndRotation() {
            return false;
        }

        @Override // io.flutter.view.TextureRegistry.SurfaceProducer
        /* renamed from: id */
        public long mo20272id() {
            return this.f17366id;
        }

        public int numImageReaders() {
            int size;
            synchronized (this.lock) {
                size = this.imageReaderQueue.size();
            }
            return size;
        }

        public int numImages() {
            int i7;
            synchronized (this.lock) {
                try {
                    Iterator<C4664b> it = this.imageReaderQueue.iterator();
                    i7 = 0;
                    while (it.hasNext()) {
                        i7 += it.next().f17371b.size();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return i7;
        }

        public int numTrims() {
            int i7;
            synchronized (this.lock) {
                i7 = this.numTrims;
            }
            return i7;
        }

        public void onImage(ImageReader imageReader, Image image) {
            C4663a m20280h;
            synchronized (this.lock) {
                m20280h = getOrCreatePerImageReader(imageReader).m20280h(image);
            }
            if (m20280h == null) {
                return;
            }
            FlutterRenderer.this.m20267w();
        }

        @Override // io.flutter.view.TextureRegistry.InterfaceC4794b
        public void onTrimMemory(int i7) {
            if (i7 < 40) {
                return;
            }
            synchronized (this.lock) {
                this.numTrims++;
            }
            TextureRegistry.SurfaceProducer.InterfaceC4792a interfaceC4792a = this.callback;
            if (interfaceC4792a != null) {
                this.notifiedDestroy = true;
                interfaceC4792a.mo17321a();
            }
            cleanup();
            this.createNewReader = true;
        }

        public int pendingDequeuedImages() {
            return this.lastDequeuedImage.size();
        }

        public void pruneImageReaderQueue() {
            C4664b peekFirst;
            while (this.imageReaderQueue.size() > 1 && (peekFirst = this.imageReaderQueue.peekFirst()) != null && peekFirst.m20275c()) {
                this.imageReaderQueue.removeFirst();
                this.perImageReaders.remove(peekFirst.f17370a);
                peekFirst.m20276d();
            }
        }

        @Override // io.flutter.view.TextureRegistry.SurfaceProducer
        public void release() {
            if (this.released) {
                return;
            }
            releaseInternal();
            FlutterRenderer.this.m20249E(this.f17366id);
        }

        @Override // io.flutter.view.TextureRegistry.SurfaceProducer
        public void scheduleFrame() {
            FlutterRenderer.this.m20267w();
        }

        @Override // io.flutter.view.TextureRegistry.SurfaceProducer
        public void setCallback(TextureRegistry.SurfaceProducer.InterfaceC4792a interfaceC4792a) {
            this.callback = interfaceC4792a;
        }

        @Override // io.flutter.view.TextureRegistry.SurfaceProducer
        public void setSize(int i7, int i8) {
            int max = Math.max(1, i7);
            int max2 = Math.max(1, i8);
            if (this.requestedWidth == max && this.requestedHeight == max2) {
                return;
            }
            this.createNewReader = true;
            this.requestedHeight = max2;
            this.requestedWidth = max;
        }
    }

    @Keep
    public final class ImageTextureRegistryEntry implements TextureRegistry.ImageTextureEntry, TextureRegistry.ImageConsumer {
        private static final String TAG = "ImageTextureRegistryEntry";

        /* renamed from: id */
        private final long f17374id;
        private boolean ignoringFence = false;
        private Image image;
        private boolean released;

        public ImageTextureRegistryEntry(long j7) {
            this.f17374id = j7;
        }

        private void maybeWaitOnFence(Image image) {
            if (image == null || this.ignoringFence) {
                return;
            }
            if (Build.VERSION.SDK_INT >= 33) {
                waitOnFence(image);
            } else {
                this.ignoringFence = true;
                AbstractC6917b.m28353a(TAG, "ImageTextureEntry can't wait on the fence on Android < 33");
            }
        }

        private void waitOnFence(Image image) {
            SyncFence fence;
            try {
                fence = image.getFence();
                fence.awaitForever();
            } catch (IOException unused) {
            }
        }

        @Override // io.flutter.view.TextureRegistry.ImageConsumer
        public Image acquireLatestImage() {
            Image image;
            synchronized (this) {
                image = this.image;
                this.image = null;
            }
            maybeWaitOnFence(image);
            return image;
        }

        public void finalize() {
            try {
                if (this.released) {
                    super.finalize();
                    return;
                }
                Image image = this.image;
                if (image != null) {
                    image.close();
                    this.image = null;
                }
                this.released = true;
                FlutterRenderer.this.f17362e.post(new RunnableC4671g(this.f17374id, FlutterRenderer.this.f17358a));
                super.finalize();
            } catch (Throwable th) {
                super.finalize();
                throw th;
            }
        }

        @Override // io.flutter.view.TextureRegistry.ImageTextureEntry
        /* renamed from: id */
        public long mo20281id() {
            return this.f17374id;
        }

        @Override // io.flutter.view.TextureRegistry.ImageTextureEntry
        public void pushImage(Image image) {
            Image image2;
            if (this.released) {
                return;
            }
            synchronized (this) {
                image2 = this.image;
                this.image = image;
            }
            if (image2 != null) {
                AbstractC6917b.m28354b(TAG, "Dropping PlatformView Frame");
                image2.close();
            }
            if (image != null) {
                FlutterRenderer.this.m20267w();
            }
        }

        @Override // io.flutter.view.TextureRegistry.ImageTextureEntry
        public void release() {
            if (this.released) {
                return;
            }
            this.released = true;
            Image image = this.image;
            if (image != null) {
                image.close();
                this.image = null;
            }
            FlutterRenderer.this.m20249E(this.f17374id);
        }
    }

    /* renamed from: io.flutter.embedding.engine.renderer.FlutterRenderer$a */
    public class C4665a implements InterfaceC4685m {
        public C4665a() {
        }

        @Override // io.flutter.embedding.engine.renderer.InterfaceC4685m
        /* renamed from: c */
        public void mo20282c() {
            FlutterRenderer.this.f17361d = false;
        }

        @Override // io.flutter.embedding.engine.renderer.InterfaceC4685m
        /* renamed from: e */
        public void mo20283e() {
            FlutterRenderer.this.f17361d = true;
        }
    }

    /* renamed from: io.flutter.embedding.engine.renderer.FlutterRenderer$b */
    public class C4666b implements DefaultLifecycleObserver {
        public C4666b() {
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        /* renamed from: a */
        public void mo10166a(InterfaceC3349n interfaceC3349n) {
            AbstractC6917b.m28358f("FlutterRenderer", "onResume called; notifying SurfaceProducers");
            for (ImageReaderSurfaceProducer imageReaderSurfaceProducer : FlutterRenderer.this.f17364g) {
                if (imageReaderSurfaceProducer.callback != null && imageReaderSurfaceProducer.notifiedDestroy) {
                    imageReaderSurfaceProducer.notifiedDestroy = false;
                    imageReaderSurfaceProducer.callback.mo17322b();
                }
            }
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        /* renamed from: c */
        public /* synthetic */ void mo10167c(InterfaceC3349n interfaceC3349n) {
            AbstractC3339d.m12919a(this, interfaceC3349n);
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        /* renamed from: g */
        public /* synthetic */ void mo10168g(InterfaceC3349n interfaceC3349n) {
            AbstractC3339d.m12921c(this, interfaceC3349n);
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        /* renamed from: h */
        public /* synthetic */ void mo10169h(InterfaceC3349n interfaceC3349n) {
            AbstractC3339d.m12923e(this, interfaceC3349n);
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        /* renamed from: j */
        public /* synthetic */ void mo10170j(InterfaceC3349n interfaceC3349n) {
            AbstractC3339d.m12920b(this, interfaceC3349n);
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        /* renamed from: m */
        public /* synthetic */ void mo10171m(InterfaceC3349n interfaceC3349n) {
            AbstractC3339d.m12922d(this, interfaceC3349n);
        }
    }

    /* renamed from: io.flutter.embedding.engine.renderer.FlutterRenderer$c */
    public static final class C4667c {

        /* renamed from: a */
        public final Rect f17377a;

        /* renamed from: b */
        public final EnumC4669e f17378b;

        /* renamed from: c */
        public final EnumC4668d f17379c;

        public C4667c(Rect rect, EnumC4669e enumC4669e, EnumC4668d enumC4668d) {
            this.f17377a = rect;
            this.f17378b = enumC4669e;
            this.f17379c = enumC4668d;
        }
    }

    /* renamed from: io.flutter.embedding.engine.renderer.FlutterRenderer$d */
    public enum EnumC4668d {
        UNKNOWN(0),
        POSTURE_FLAT(1),
        POSTURE_HALF_OPENED(2);


        /* renamed from: a */
        public final int f17384a;

        EnumC4668d(int i7) {
            this.f17384a = i7;
        }
    }

    /* renamed from: io.flutter.embedding.engine.renderer.FlutterRenderer$e */
    public enum EnumC4669e {
        UNKNOWN(0),
        FOLD(1),
        HINGE(2),
        CUTOUT(3);


        /* renamed from: a */
        public final int f17390a;

        EnumC4669e(int i7) {
            this.f17390a = i7;
        }
    }

    /* renamed from: io.flutter.embedding.engine.renderer.FlutterRenderer$f */
    public final class C4670f implements TextureRegistry.SurfaceTextureEntry, TextureRegistry.InterfaceC4794b {

        /* renamed from: a */
        public final long f17391a;

        /* renamed from: b */
        public final SurfaceTextureWrapper f17392b;

        /* renamed from: c */
        public boolean f17393c;

        /* renamed from: d */
        public TextureRegistry.InterfaceC4794b f17394d;

        public C4670f(long j7, SurfaceTexture surfaceTexture) {
            this.f17391a = j7;
            this.f17392b = new SurfaceTextureWrapper(surfaceTexture, new Runnable() { // from class: io.flutter.embedding.engine.renderer.k
                @Override // java.lang.Runnable
                public final void run() {
                    FlutterRenderer.C4670f.this.m20288c();
                }
            });
            surfaceTexture().setOnFrameAvailableListener(new SurfaceTexture.OnFrameAvailableListener() { // from class: io.flutter.embedding.engine.renderer.l
                @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
                public final void onFrameAvailable(SurfaceTexture surfaceTexture2) {
                    FlutterRenderer.C4670f.this.m20289d(surfaceTexture2);
                }
            }, new Handler());
        }

        /* renamed from: c */
        public final /* synthetic */ void m20288c() {
        }

        /* renamed from: d */
        public final /* synthetic */ void m20289d(SurfaceTexture surfaceTexture) {
            if (this.f17393c || !FlutterRenderer.this.f17358a.isAttached()) {
                return;
            }
            this.f17392b.markDirty();
            FlutterRenderer.this.m20267w();
        }

        /* renamed from: e */
        public final void m20290e() {
            FlutterRenderer.this.m20266v(this);
        }

        /* renamed from: f */
        public SurfaceTextureWrapper m20291f() {
            return this.f17392b;
        }

        public void finalize() {
            try {
                if (this.f17393c) {
                    return;
                }
                FlutterRenderer.this.f17362e.post(new RunnableC4671g(this.f17391a, FlutterRenderer.this.f17358a));
            } finally {
                super.finalize();
            }
        }

        @Override // io.flutter.view.TextureRegistry.SurfaceTextureEntry
        /* renamed from: id */
        public long mo20292id() {
            return this.f17391a;
        }

        @Override // io.flutter.view.TextureRegistry.InterfaceC4794b
        public void onTrimMemory(int i7) {
            TextureRegistry.InterfaceC4794b interfaceC4794b = this.f17394d;
            if (interfaceC4794b != null) {
                interfaceC4794b.onTrimMemory(i7);
            }
        }

        @Override // io.flutter.view.TextureRegistry.SurfaceTextureEntry
        public void release() {
            if (this.f17393c) {
                return;
            }
            AbstractC6917b.m28358f("FlutterRenderer", "Releasing a SurfaceTexture (" + this.f17391a + ").");
            this.f17392b.release();
            FlutterRenderer.this.m20249E(this.f17391a);
            m20290e();
            this.f17393c = true;
        }

        @Override // io.flutter.view.TextureRegistry.SurfaceTextureEntry
        public void setOnFrameConsumedListener(TextureRegistry.InterfaceC4793a interfaceC4793a) {
        }

        @Override // io.flutter.view.TextureRegistry.SurfaceTextureEntry
        public void setOnTrimMemoryListener(TextureRegistry.InterfaceC4794b interfaceC4794b) {
            this.f17394d = interfaceC4794b;
        }

        @Override // io.flutter.view.TextureRegistry.SurfaceTextureEntry
        public SurfaceTexture surfaceTexture() {
            return this.f17392b.surfaceTexture();
        }
    }

    /* renamed from: io.flutter.embedding.engine.renderer.FlutterRenderer$g */
    public static final class RunnableC4671g implements Runnable {

        /* renamed from: a */
        public final long f17396a;

        /* renamed from: b */
        public final FlutterJNI f17397b;

        public RunnableC4671g(long j7, FlutterJNI flutterJNI) {
            this.f17396a = j7;
            this.f17397b = flutterJNI;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f17397b.isAttached()) {
                AbstractC6917b.m28358f("FlutterRenderer", "Releasing a Texture (" + this.f17396a + ").");
                this.f17397b.unregisterTexture(this.f17396a);
            }
        }
    }

    /* renamed from: io.flutter.embedding.engine.renderer.FlutterRenderer$h */
    public static final class C4672h {

        /* renamed from: a */
        public float f17398a = 1.0f;

        /* renamed from: b */
        public int f17399b = 0;

        /* renamed from: c */
        public int f17400c = 0;

        /* renamed from: d */
        public int f17401d = 0;

        /* renamed from: e */
        public int f17402e = 0;

        /* renamed from: f */
        public int f17403f = 0;

        /* renamed from: g */
        public int f17404g = 0;

        /* renamed from: h */
        public int f17405h = 0;

        /* renamed from: i */
        public int f17406i = 0;

        /* renamed from: j */
        public int f17407j = 0;

        /* renamed from: k */
        public int f17408k = 0;

        /* renamed from: l */
        public int f17409l = 0;

        /* renamed from: m */
        public int f17410m = 0;

        /* renamed from: n */
        public int f17411n = 0;

        /* renamed from: o */
        public int f17412o = 0;

        /* renamed from: p */
        public int f17413p = -1;

        /* renamed from: q */
        public final List f17414q = new ArrayList();

        /* renamed from: r */
        public final List f17415r = new ArrayList();

        /* renamed from: c */
        public void m20295c(List list) {
            this.f17415r.clear();
            this.f17415r.addAll(list);
        }

        /* renamed from: d */
        public void m20296d(List list) {
            this.f17414q.clear();
            this.f17414q.addAll(list);
        }

        /* renamed from: e */
        public boolean m20297e() {
            return this.f17399b > 0 && this.f17400c > 0 && this.f17398a > 0.0f;
        }
    }

    public FlutterRenderer(FlutterJNI flutterJNI) {
        C4665a c4665a = new C4665a();
        this.f17365h = c4665a;
        this.f17358a = flutterJNI;
        flutterJNI.addIsDisplayingFlutterUiListener(c4665a);
        C3359x.m12980n().mo9642a().mo12927a(new C4666b());
    }

    /* renamed from: A */
    public void m20245A() {
        if (this.f17360c != null) {
            this.f17358a.onSurfaceDestroyed();
            if (this.f17361d) {
                this.f17365h.mo20282c();
            }
            this.f17361d = false;
            this.f17360c = null;
        }
    }

    /* renamed from: B */
    public void m20246B(int i7, int i8) {
        this.f17358a.onSurfaceChanged(i7, i8);
    }

    /* renamed from: C */
    public void m20247C(Surface surface) {
        this.f17360c = surface;
        this.f17358a.onSurfaceWindowChanged(surface);
    }

    /* renamed from: D */
    public final void m20248D(int[] iArr, int i7, Rect rect) {
        iArr[i7] = rect.left;
        iArr[i7 + 1] = rect.top;
        iArr[i7 + 2] = rect.right;
        iArr[i7 + 3] = rect.bottom;
    }

    /* renamed from: E */
    public final void m20249E(long j7) {
        this.f17358a.unregisterTexture(j7);
    }

    @Override // io.flutter.view.TextureRegistry
    /* renamed from: a */
    public TextureRegistry.SurfaceProducer mo20250a(TextureRegistry.EnumC4795c enumC4795c) {
        if (f17356i || Build.VERSION.SDK_INT < 29) {
            TextureRegistry.SurfaceTextureEntry mo20253d = mo20253d();
            C4687o c4687o = new C4687o(mo20253d.mo20292id(), this.f17362e, this.f17358a, mo20253d);
            AbstractC6917b.m28358f("FlutterRenderer", "New SurfaceTextureSurfaceProducer ID: " + mo20253d.mo20292id());
            return c4687o;
        }
        long andIncrement = this.f17359b.getAndIncrement();
        ImageReaderSurfaceProducer imageReaderSurfaceProducer = new ImageReaderSurfaceProducer(andIncrement);
        boolean z6 = enumC4795c == TextureRegistry.EnumC4795c.resetInBackground;
        m20261q(andIncrement, imageReaderSurfaceProducer, z6);
        if (z6) {
            m20255k(imageReaderSurfaceProducer);
        }
        this.f17364g.add(imageReaderSurfaceProducer);
        AbstractC6917b.m28358f("FlutterRenderer", "New ImageReaderSurfaceProducer ID: " + andIncrement);
        return imageReaderSurfaceProducer;
    }

    @Override // io.flutter.view.TextureRegistry
    /* renamed from: b */
    public TextureRegistry.ImageTextureEntry mo20251b() {
        ImageTextureRegistryEntry imageTextureRegistryEntry = new ImageTextureRegistryEntry(this.f17359b.getAndIncrement());
        AbstractC6917b.m28358f("FlutterRenderer", "New ImageTextureEntry ID: " + imageTextureRegistryEntry.mo20281id());
        m20261q(imageTextureRegistryEntry.mo20281id(), imageTextureRegistryEntry, false);
        return imageTextureRegistryEntry;
    }

    @Override // io.flutter.view.TextureRegistry
    /* renamed from: c */
    public /* synthetic */ TextureRegistry.SurfaceProducer mo20252c() {
        return AbstractC4812q.m20850a(this);
    }

    @Override // io.flutter.view.TextureRegistry
    /* renamed from: d */
    public TextureRegistry.SurfaceTextureEntry mo20253d() {
        AbstractC6917b.m28358f("FlutterRenderer", "Creating a SurfaceTexture.");
        return m20263s(new SurfaceTexture(0));
    }

    /* renamed from: j */
    public void m20254j(InterfaceC4685m interfaceC4685m) {
        this.f17358a.addIsDisplayingFlutterUiListener(interfaceC4685m);
        if (this.f17361d) {
            interfaceC4685m.mo20283e();
        }
    }

    /* renamed from: k */
    public void m20255k(TextureRegistry.InterfaceC4794b interfaceC4794b) {
        m20256l();
        this.f17363f.add(new WeakReference(interfaceC4794b));
    }

    /* renamed from: l */
    public final void m20256l() {
        Iterator it = this.f17363f.iterator();
        while (it.hasNext()) {
            if (((TextureRegistry.InterfaceC4794b) ((WeakReference) it.next()).get()) == null) {
                it.remove();
            }
        }
    }

    /* renamed from: m */
    public void m20257m(ByteBuffer byteBuffer, int i7) {
        this.f17358a.dispatchPointerDataPacket(byteBuffer, i7);
    }

    /* renamed from: n */
    public boolean m20258n() {
        return this.f17361d;
    }

    /* renamed from: o */
    public boolean m20259o() {
        return this.f17358a.getIsSoftwareRenderingEnabled();
    }

    /* renamed from: p */
    public void m20260p(int i7) {
        Iterator it = this.f17363f.iterator();
        while (it.hasNext()) {
            TextureRegistry.InterfaceC4794b interfaceC4794b = (TextureRegistry.InterfaceC4794b) ((WeakReference) it.next()).get();
            if (interfaceC4794b != null) {
                interfaceC4794b.onTrimMemory(i7);
            } else {
                it.remove();
            }
        }
    }

    /* renamed from: q */
    public final void m20261q(long j7, TextureRegistry.ImageConsumer imageConsumer, boolean z6) {
        this.f17358a.registerImageTexture(j7, imageConsumer, z6);
    }

    /* renamed from: r */
    public final TextureRegistry.SurfaceTextureEntry m20262r(long j7, SurfaceTexture surfaceTexture) {
        surfaceTexture.detachFromGLContext();
        C4670f c4670f = new C4670f(j7, surfaceTexture);
        AbstractC6917b.m28358f("FlutterRenderer", "New SurfaceTexture ID: " + c4670f.mo20292id());
        m20264t(c4670f.mo20292id(), c4670f.m20291f());
        m20255k(c4670f);
        return c4670f;
    }

    /* renamed from: s */
    public TextureRegistry.SurfaceTextureEntry m20263s(SurfaceTexture surfaceTexture) {
        return m20262r(this.f17359b.getAndIncrement(), surfaceTexture);
    }

    /* renamed from: t */
    public final void m20264t(long j7, SurfaceTextureWrapper surfaceTextureWrapper) {
        this.f17358a.registerTexture(j7, surfaceTextureWrapper);
    }

    /* renamed from: u */
    public void m20265u(InterfaceC4685m interfaceC4685m) {
        this.f17358a.removeIsDisplayingFlutterUiListener(interfaceC4685m);
    }

    /* renamed from: v */
    public void m20266v(TextureRegistry.InterfaceC4794b interfaceC4794b) {
        for (WeakReference weakReference : this.f17363f) {
            if (weakReference.get() == interfaceC4794b) {
                this.f17363f.remove(weakReference);
                return;
            }
        }
    }

    /* renamed from: w */
    public void m20267w() {
        this.f17358a.scheduleFrame();
    }

    /* renamed from: x */
    public void m20268x(boolean z6) {
        this.f17358a.setSemanticsEnabled(z6);
    }

    /* renamed from: y */
    public void m20269y(C4672h c4672h) {
        if (c4672h.m20297e()) {
            AbstractC6917b.m28358f("FlutterRenderer", "Setting viewport metrics\nSize: " + c4672h.f17399b + " x " + c4672h.f17400c + "\nPadding - L: " + c4672h.f17404g + ", T: " + c4672h.f17401d + ", R: " + c4672h.f17402e + ", B: " + c4672h.f17403f + "\nInsets - L: " + c4672h.f17408k + ", T: " + c4672h.f17405h + ", R: " + c4672h.f17406i + ", B: " + c4672h.f17407j + "\nSystem Gesture Insets - L: " + c4672h.f17412o + ", T: " + c4672h.f17409l + ", R: " + c4672h.f17410m + ", B: " + c4672h.f17410m + "\nDisplay Features: " + c4672h.f17414q.size() + "\nDisplay Cutouts: " + c4672h.f17415r.size());
            int size = c4672h.f17414q.size() + c4672h.f17415r.size();
            int[] iArr = new int[size * 4];
            int[] iArr2 = new int[size];
            int[] iArr3 = new int[size];
            for (int i7 = 0; i7 < c4672h.f17414q.size(); i7++) {
                C4667c c4667c = (C4667c) c4672h.f17414q.get(i7);
                m20248D(iArr, i7 * 4, c4667c.f17377a);
                iArr2[i7] = c4667c.f17378b.f17390a;
                iArr3[i7] = c4667c.f17379c.f17384a;
            }
            int size2 = c4672h.f17414q.size() * 4;
            for (int i8 = 0; i8 < c4672h.f17415r.size(); i8++) {
                C4667c c4667c2 = (C4667c) c4672h.f17415r.get(i8);
                m20248D(iArr, (i8 * 4) + size2, c4667c2.f17377a);
                iArr2[c4672h.f17414q.size() + i8] = c4667c2.f17378b.f17390a;
                iArr3[c4672h.f17414q.size() + i8] = c4667c2.f17379c.f17384a;
            }
            this.f17358a.setViewportMetrics(c4672h.f17398a, c4672h.f17399b, c4672h.f17400c, c4672h.f17401d, c4672h.f17402e, c4672h.f17403f, c4672h.f17404g, c4672h.f17405h, c4672h.f17406i, c4672h.f17407j, c4672h.f17408k, c4672h.f17409l, c4672h.f17410m, c4672h.f17411n, c4672h.f17412o, c4672h.f17413p, iArr, iArr2, iArr3);
        }
    }

    /* renamed from: z */
    public void m20270z(Surface surface, boolean z6) {
        if (!z6) {
            m20245A();
        }
        this.f17360c = surface;
        if (z6) {
            this.f17358a.onSurfaceWindowChanged(surface);
        } else {
            this.f17358a.onSurfaceCreated(surface);
        }
    }
}
