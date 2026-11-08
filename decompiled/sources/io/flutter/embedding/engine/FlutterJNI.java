package io.flutter.embedding.engine;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import android.graphics.ImageDecoder;
import android.os.Build;
import android.os.Looper;
import android.util.DisplayMetrics;
import android.util.Size;
import android.util.TypedValue;
import android.view.Surface;
import android.view.SurfaceControl;
import androidx.annotation.Keep;
import io.flutter.embedding.engine.C4659a;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.embedding.engine.mutatorsstack.FlutterMutatorsStack;
import io.flutter.embedding.engine.renderer.InterfaceC4685m;
import io.flutter.embedding.engine.renderer.SurfaceTextureWrapper;
import io.flutter.plugin.platform.C4743S;
import io.flutter.plugin.platform.C4783y;
import io.flutter.view.C4804i;
import io.flutter.view.FlutterCallbackInformation;
import io.flutter.view.TextureRegistry;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import org.apache.tika.utils.StringUtils;
import p005A4.InterfaceC0021a;
import p054H4.C0586v;
import p061I4.C0664p;
import p068J4.C0788e;
import p135T1.AbstractC2436c;
import p221e5.AbstractC4201d;
import p370w4.AbstractC6917b;
import p391z4.InterfaceC7151f;

@Keep
/* loaded from: classes.dex */
public class FlutterJNI {
    private static final String TAG = "FlutterJNI";
    private static InterfaceC4657b asyncWaitForVsyncDelegate = null;
    private static float displayDensity = -1.0f;
    private static float displayHeight = -1.0f;
    private static float displayWidth = -1.0f;
    private static boolean initCalled = false;
    private static boolean loadLibraryCalled = false;
    private static boolean prefetchDefaultFontManagerCalled = false;
    private static float refreshRateFPS = 60.0f;
    private static String vmServiceUri;
    private InterfaceC4656a accessibilityDelegate;
    private InterfaceC0021a deferredComponentManager;
    private C0788e localizationPlugin;
    private Long nativeShellHolderId;
    private InterfaceC7151f platformMessageHandler;
    private C4783y platformViewsController;
    private C4743S platformViewsController2;
    private ReentrantReadWriteLock shellHolderLock = new ReentrantReadWriteLock();
    private final Set<C4659a.b> engineLifecycleListeners = new CopyOnWriteArraySet();
    private final Set<InterfaceC4685m> flutterUiDisplayListeners = new CopyOnWriteArraySet();
    private final Looper mainLooper = Looper.getMainLooper();

    /* renamed from: io.flutter.embedding.engine.FlutterJNI$a */
    public interface InterfaceC4656a {
        /* renamed from: a */
        void mo20189a(ByteBuffer byteBuffer, String[] strArr, ByteBuffer[] byteBufferArr);

        /* renamed from: b */
        void mo20190b(ByteBuffer byteBuffer, String[] strArr);
    }

    /* renamed from: io.flutter.embedding.engine.FlutterJNI$b */
    public interface InterfaceC4657b {
        /* renamed from: a */
        void mo20191a(long j7);
    }

    /* renamed from: io.flutter.embedding.engine.FlutterJNI$c */
    public static class C4658c {
        /* renamed from: a */
        public FlutterJNI m20192a() {
            return new FlutterJNI();
        }
    }

    private static void asyncWaitForVsync(long j7) {
        InterfaceC4657b interfaceC4657b = asyncWaitForVsyncDelegate;
        if (interfaceC4657b == null) {
            throw new IllegalStateException("An AsyncWaitForVsyncDelegate must be registered with FlutterJNI before asyncWaitForVsync() is invoked.");
        }
        interfaceC4657b.mo20191a(j7);
    }

    public static Bitmap decodeImage(ByteBuffer byteBuffer, final long j7) {
        ImageDecoder.Source createSource;
        Bitmap decodeBitmap;
        if (Build.VERSION.SDK_INT >= 28) {
            createSource = ImageDecoder.createSource(byteBuffer);
            try {
                decodeBitmap = ImageDecoder.decodeBitmap(createSource, new ImageDecoder.OnHeaderDecodedListener() { // from class: y4.i
                    @Override // android.graphics.ImageDecoder.OnHeaderDecodedListener
                    public final void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
                        FlutterJNI.lambda$decodeImage$0(j7, imageDecoder, imageInfo, source);
                    }
                });
                return decodeBitmap;
            } catch (IOException e7) {
                AbstractC6917b.m28355c(TAG, "Failed to decode image", e7);
            }
        }
        return null;
    }

    private void ensureAttachedToNative() {
        if (this.nativeShellHolderId == null) {
            throw new RuntimeException("Cannot execute operation because FlutterJNI is not attached to native.");
        }
    }

    private void ensureNotAttachedToNative() {
        if (this.nativeShellHolderId != null) {
            throw new RuntimeException("Cannot execute operation because FlutterJNI is attached to native.");
        }
    }

    private void ensureRunningOnMainThread() {
        if (Looper.myLooper() == this.mainLooper) {
            return;
        }
        throw new RuntimeException("Methods marked with @UiThread must be executed on the main thread. Current thread: " + Thread.currentThread().getName());
    }

    @Deprecated
    public static String getObservatoryUri() {
        return vmServiceUri;
    }

    public static String getVMServiceUri() {
        return vmServiceUri;
    }

    private void handlePlatformMessageResponse(int i7, ByteBuffer byteBuffer) {
        InterfaceC7151f interfaceC7151f = this.platformMessageHandler;
        if (interfaceC7151f != null) {
            interfaceC7151f.mo29452g(i7, byteBuffer);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$decodeImage$0(long j7, ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
        ColorSpace.Named named;
        ColorSpace colorSpace;
        Size size;
        named = ColorSpace.Named.SRGB;
        colorSpace = ColorSpace.get(named);
        imageDecoder.setTargetColorSpace(colorSpace);
        imageDecoder.setAllocator(1);
        size = imageInfo.getSize();
        nativeImageHeaderCallback(j7, size.getWidth(), size.getHeight());
    }

    private native long nativeAttach(FlutterJNI flutterJNI);

    private native void nativeCleanupMessageData(long j7);

    private native void nativeDeferredComponentInstallFailure(int i7, String str, boolean z6);

    private native void nativeDestroy(long j7);

    private native void nativeDispatchEmptyPlatformMessage(long j7, String str, int i7);

    private native void nativeDispatchPlatformMessage(long j7, String str, ByteBuffer byteBuffer, int i7, int i8);

    private native void nativeDispatchPointerDataPacket(long j7, ByteBuffer byteBuffer, int i7);

    private native void nativeDispatchSemanticsAction(long j7, int i7, int i8, ByteBuffer byteBuffer, int i9);

    private native boolean nativeFlutterTextUtilsIsEmoji(int i7);

    private native boolean nativeFlutterTextUtilsIsEmojiModifier(int i7);

    private native boolean nativeFlutterTextUtilsIsEmojiModifierBase(int i7);

    private native boolean nativeFlutterTextUtilsIsRegionalIndicator(int i7);

    private native boolean nativeFlutterTextUtilsIsVariationSelector(int i7);

    private native Bitmap nativeGetBitmap(long j7);

    private native boolean nativeGetIsSoftwareRenderingEnabled();

    public static native void nativeImageHeaderCallback(long j7, int i7, int i8);

    private static native void nativeInit(Context context, String[] strArr, String str, String str2, String str3, long j7, int i7);

    private native void nativeInvokePlatformMessageEmptyResponseCallback(long j7, int i7);

    private native void nativeInvokePlatformMessageResponseCallback(long j7, int i7, ByteBuffer byteBuffer, int i8);

    private native boolean nativeIsSurfaceControlEnabled(long j7);

    private native void nativeLoadDartDeferredLibrary(long j7, int i7, String[] strArr);

    @Deprecated
    public static native FlutterCallbackInformation nativeLookupCallbackInformation(long j7);

    private native void nativeMarkTextureFrameAvailable(long j7, long j8);

    private native void nativeNotifyLowMemoryWarning(long j7);

    private native void nativeOnVsync(long j7, long j8, long j9);

    private static native void nativePrefetchDefaultFontManager();

    private native void nativeRegisterImageTexture(long j7, long j8, WeakReference<TextureRegistry.ImageConsumer> weakReference, boolean z6);

    private native void nativeRegisterTexture(long j7, long j8, WeakReference<SurfaceTextureWrapper> weakReference);

    private native void nativeRunBundleAndSnapshotFromLibrary(long j7, String str, String str2, String str3, AssetManager assetManager, List<String> list, long j8);

    private native void nativeScheduleFrame(long j7);

    private native void nativeSetAccessibilityFeatures(long j7, int i7);

    private native void nativeSetSemanticsEnabled(long j7, boolean z6);

    private native void nativeSetViewportMetrics(long j7, float f7, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20, int i21, int[] iArr, int[] iArr2, int[] iArr3);

    private native FlutterJNI nativeSpawn(long j7, String str, String str2, String str3, List<String> list, long j8);

    private native void nativeSurfaceChanged(long j7, int i7, int i8);

    private native void nativeSurfaceCreated(long j7, Surface surface);

    private native void nativeSurfaceDestroyed(long j7);

    private native void nativeSurfaceWindowChanged(long j7, Surface surface);

    private native void nativeUnregisterTexture(long j7, long j8);

    private native void nativeUpdateDisplayMetrics(long j7);

    private native void nativeUpdateJavaAssetManager(long j7, AssetManager assetManager, String str);

    private native void nativeUpdateRefreshRate(float f7);

    private void onPreEngineRestart() {
        Iterator<C4659a.b> it = this.engineLifecycleListeners.iterator();
        while (it.hasNext()) {
            it.next().mo20223b();
        }
    }

    private void updateCustomAccessibilityActions(ByteBuffer byteBuffer, String[] strArr) {
        ensureRunningOnMainThread();
        InterfaceC4656a interfaceC4656a = this.accessibilityDelegate;
        if (interfaceC4656a != null) {
            interfaceC4656a.mo20190b(byteBuffer, strArr);
        }
    }

    private void updateSemantics(ByteBuffer byteBuffer, String[] strArr, ByteBuffer[] byteBufferArr) {
        ensureRunningOnMainThread();
        InterfaceC4656a interfaceC4656a = this.accessibilityDelegate;
        if (interfaceC4656a != null) {
            interfaceC4656a.mo20189a(byteBuffer, strArr, byteBufferArr);
        }
    }

    public boolean IsSurfaceControlEnabled() {
        return nativeIsSurfaceControlEnabled(this.nativeShellHolderId.longValue());
    }

    public void addEngineLifecycleListener(C4659a.b bVar) {
        ensureRunningOnMainThread();
        this.engineLifecycleListeners.add(bVar);
    }

    public void addIsDisplayingFlutterUiListener(InterfaceC4685m interfaceC4685m) {
        ensureRunningOnMainThread();
        this.flutterUiDisplayListeners.add(interfaceC4685m);
    }

    public void applyTransactions() {
        C4743S c4743s = this.platformViewsController2;
        if (c4743s == null) {
            throw new RuntimeException(StringUtils.EMPTY);
        }
        c4743s.m20448j();
    }

    public void attachToNative() {
        ensureRunningOnMainThread();
        ensureNotAttachedToNative();
        this.shellHolderLock.writeLock().lock();
        try {
            this.nativeShellHolderId = Long.valueOf(performNativeAttach(this));
        } finally {
            this.shellHolderLock.writeLock().unlock();
        }
    }

    public void cleanupMessageData(long j7) {
        nativeCleanupMessageData(j7);
    }

    public String[] computePlatformResolvedLocale(String[] strArr) {
        if (this.localizationPlugin == null) {
            return new String[0];
        }
        ArrayList arrayList = new ArrayList();
        for (int i7 = 0; i7 < strArr.length; i7 += 3) {
            String str = strArr[i7];
            String str2 = strArr[i7 + 1];
            String str3 = strArr[i7 + 2];
            Locale.Builder builder = new Locale.Builder();
            if (!str.isEmpty()) {
                builder.setLanguage(str);
            }
            if (!str2.isEmpty()) {
                builder.setRegion(str2);
            }
            if (!str3.isEmpty()) {
                builder.setScript(str3);
            }
            arrayList.add(builder.build());
        }
        Locale m3348c = this.localizationPlugin.m3348c(arrayList);
        return m3348c == null ? new String[0] : new String[]{m3348c.getLanguage(), m3348c.getCountry(), m3348c.getScript()};
    }

    public FlutterOverlaySurface createOverlaySurface() {
        ensureRunningOnMainThread();
        C4783y c4783y = this.platformViewsController;
        if (c4783y != null) {
            return c4783y.m20598K();
        }
        throw new RuntimeException("platformViewsController must be set before attempting to position an overlay surface");
    }

    public FlutterOverlaySurface createOverlaySurface2() {
        C4743S c4743s = this.platformViewsController2;
        if (c4743s != null) {
            return c4743s.m20454p();
        }
        throw new RuntimeException("platformViewsController must be set before attempting to position an overlay surface");
    }

    public SurfaceControl.Transaction createTransaction() {
        C4743S c4743s = this.platformViewsController2;
        if (c4743s != null) {
            return c4743s.m20455q();
        }
        throw new RuntimeException(StringUtils.EMPTY);
    }

    public void deferredComponentInstallFailure(int i7, String str, boolean z6) {
        ensureRunningOnMainThread();
        nativeDeferredComponentInstallFailure(i7, str, z6);
    }

    public void destroyOverlaySurface2() {
        ensureRunningOnMainThread();
        C4743S c4743s = this.platformViewsController2;
        if (c4743s == null) {
            throw new RuntimeException("platformViewsController must be set before attempting to destroy an overlay surface");
        }
        c4743s.m20456r();
    }

    public void destroyOverlaySurfaces() {
        ensureRunningOnMainThread();
        C4783y c4783y = this.platformViewsController;
        if (c4783y == null) {
            throw new RuntimeException("platformViewsController must be set before attempting to destroy an overlay surface");
        }
        c4783y.m20601N();
    }

    public void detachFromNativeAndReleaseResources() {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        this.shellHolderLock.writeLock().lock();
        try {
            nativeDestroy(this.nativeShellHolderId.longValue());
            this.nativeShellHolderId = null;
        } finally {
            this.shellHolderLock.writeLock().unlock();
        }
    }

    public void dispatchEmptyPlatformMessage(String str, int i7) {
        ensureRunningOnMainThread();
        if (isAttached()) {
            nativeDispatchEmptyPlatformMessage(this.nativeShellHolderId.longValue(), str, i7);
            return;
        }
        AbstractC6917b.m28359g(TAG, "Tried to send a platform message to Flutter, but FlutterJNI was detached from native C++. Could not send. Channel: " + str + ". Response ID: " + i7);
    }

    public void dispatchPlatformMessage(String str, ByteBuffer byteBuffer, int i7, int i8) {
        ensureRunningOnMainThread();
        if (isAttached()) {
            nativeDispatchPlatformMessage(this.nativeShellHolderId.longValue(), str, byteBuffer, i7, i8);
            return;
        }
        AbstractC6917b.m28359g(TAG, "Tried to send a platform message to Flutter, but FlutterJNI was detached from native C++. Could not send. Channel: " + str + ". Response ID: " + i8);
    }

    public void dispatchPointerDataPacket(ByteBuffer byteBuffer, int i7) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeDispatchPointerDataPacket(this.nativeShellHolderId.longValue(), byteBuffer, i7);
    }

    public void dispatchSemanticsAction(int i7, C4804i.g gVar) {
        dispatchSemanticsAction(i7, gVar, null);
    }

    public void endFrame2() {
        C4743S c4743s = this.platformViewsController2;
        if (c4743s == null) {
            throw new RuntimeException(StringUtils.EMPTY);
        }
        c4743s.m20437C();
    }

    public Bitmap getBitmap() {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        return nativeGetBitmap(this.nativeShellHolderId.longValue());
    }

    public boolean getIsSoftwareRenderingEnabled() {
        return nativeGetIsSoftwareRenderingEnabled();
    }

    public float getScaledFontSize(float f7, int i7) {
        DisplayMetrics m2329b = C0586v.m2329b(i7);
        if (m2329b != null) {
            return TypedValue.applyDimension(2, f7, m2329b) / m2329b.density;
        }
        AbstractC6917b.m28354b(TAG, "getScaledFontSize called with configurationId " + String.valueOf(i7) + ", which can't be found.");
        return -1.0f;
    }

    public void handlePlatformMessage(String str, ByteBuffer byteBuffer, int i7, long j7) {
        InterfaceC7151f interfaceC7151f = this.platformMessageHandler;
        if (interfaceC7151f != null) {
            interfaceC7151f.mo29453h(str, byteBuffer, i7, j7);
        } else {
            nativeCleanupMessageData(j7);
        }
    }

    public void hideOverlaySurface2() {
        C4743S c4743s = this.platformViewsController2;
        if (c4743s == null) {
            throw new RuntimeException("platformViewsController must be set before attempting to destroy an overlay surface");
        }
        c4743s.m20461w();
    }

    public void init(Context context, String[] strArr, String str, String str2, String str3, long j7, int i7) {
        if (initCalled) {
            AbstractC6917b.m28359g(TAG, "FlutterJNI.init called more than once");
        }
        nativeInit(context, strArr, str, str2, str3, j7, i7);
        initCalled = true;
    }

    public void invokePlatformMessageEmptyResponseCallback(int i7) {
        this.shellHolderLock.readLock().lock();
        try {
            if (isAttached()) {
                nativeInvokePlatformMessageEmptyResponseCallback(this.nativeShellHolderId.longValue(), i7);
            } else {
                AbstractC6917b.m28359g(TAG, "Tried to send a platform message response, but FlutterJNI was detached from native C++. Could not send. Response ID: " + i7);
            }
            this.shellHolderLock.readLock().unlock();
        } catch (Throwable th) {
            this.shellHolderLock.readLock().unlock();
            throw th;
        }
    }

    public void invokePlatformMessageResponseCallback(int i7, ByteBuffer byteBuffer, int i8) {
        if (!byteBuffer.isDirect()) {
            throw new IllegalArgumentException("Expected a direct ByteBuffer.");
        }
        this.shellHolderLock.readLock().lock();
        try {
            if (isAttached()) {
                nativeInvokePlatformMessageResponseCallback(this.nativeShellHolderId.longValue(), i7, byteBuffer, i8);
            } else {
                AbstractC6917b.m28359g(TAG, "Tried to send a platform message response, but FlutterJNI was detached from native C++. Could not send. Response ID: " + i7);
            }
            this.shellHolderLock.readLock().unlock();
        } catch (Throwable th) {
            this.shellHolderLock.readLock().unlock();
            throw th;
        }
    }

    public boolean isAttached() {
        return this.nativeShellHolderId != null;
    }

    public boolean isCodePointEmoji(int i7) {
        return nativeFlutterTextUtilsIsEmoji(i7);
    }

    public boolean isCodePointEmojiModifier(int i7) {
        return nativeFlutterTextUtilsIsEmojiModifier(i7);
    }

    public boolean isCodePointEmojiModifierBase(int i7) {
        return nativeFlutterTextUtilsIsEmojiModifierBase(i7);
    }

    public boolean isCodePointRegionalIndicator(int i7) {
        return nativeFlutterTextUtilsIsRegionalIndicator(i7);
    }

    public boolean isCodePointVariantSelector(int i7) {
        return nativeFlutterTextUtilsIsVariationSelector(i7);
    }

    public void loadDartDeferredLibrary(int i7, String[] strArr) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeLoadDartDeferredLibrary(this.nativeShellHolderId.longValue(), i7, strArr);
    }

    public void loadLibrary(Context context) {
        if (loadLibraryCalled) {
            AbstractC6917b.m28359g(TAG, "FlutterJNI.loadLibrary called more than once");
        }
        AbstractC2436c.m8293a(context, "flutter");
        loadLibraryCalled = true;
    }

    public void markTextureFrameAvailable(long j7) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeMarkTextureFrameAvailable(this.nativeShellHolderId.longValue(), j7);
    }

    public void notifyLowMemoryWarning() {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeNotifyLowMemoryWarning(this.nativeShellHolderId.longValue());
    }

    public void onBeginFrame() {
        ensureRunningOnMainThread();
        C4783y c4783y = this.platformViewsController;
        if (c4783y == null) {
            throw new RuntimeException("platformViewsController must be set before attempting to begin the frame");
        }
        c4783y.m20617g0();
    }

    public void onDisplayOverlaySurface(int i7, int i8, int i9, int i10, int i11) {
        ensureRunningOnMainThread();
        C4783y c4783y = this.platformViewsController;
        if (c4783y == null) {
            throw new RuntimeException("platformViewsController must be set before attempting to position an overlay surface");
        }
        c4783y.m20619i0(i7, i8, i9, i10, i11);
    }

    public void onDisplayPlatformView(int i7, int i8, int i9, int i10, int i11, int i12, int i13, FlutterMutatorsStack flutterMutatorsStack) {
        ensureRunningOnMainThread();
        C4783y c4783y = this.platformViewsController;
        if (c4783y == null) {
            throw new RuntimeException("platformViewsController must be set before attempting to position a platform view");
        }
        c4783y.m20620j0(i7, i8, i9, i10, i11, i12, i13, flutterMutatorsStack);
    }

    public void onDisplayPlatformView2(int i7, int i8, int i9, int i10, int i11, int i12, int i13, FlutterMutatorsStack flutterMutatorsStack) {
        ensureRunningOnMainThread();
        C4743S c4743s = this.platformViewsController2;
        if (c4743s == null) {
            throw new RuntimeException("platformViewsController must be set before attempting to position a platform view");
        }
        c4743s.m20436B(i7, i8, i9, i10, i11, i12, i13, flutterMutatorsStack);
    }

    public void onEndFrame() {
        ensureRunningOnMainThread();
        C4783y c4783y = this.platformViewsController;
        if (c4783y == null) {
            throw new RuntimeException("platformViewsController must be set before attempting to end the frame");
        }
        c4783y.m20621k0();
    }

    public void onFirstFrame() {
        ensureRunningOnMainThread();
        Iterator<InterfaceC4685m> it = this.flutterUiDisplayListeners.iterator();
        while (it.hasNext()) {
            it.next().mo20283e();
        }
    }

    public void onRenderingStopped() {
        ensureRunningOnMainThread();
        Iterator<InterfaceC4685m> it = this.flutterUiDisplayListeners.iterator();
        while (it.hasNext()) {
            it.next().mo20282c();
        }
    }

    public void onSurfaceChanged(int i7, int i8) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeSurfaceChanged(this.nativeShellHolderId.longValue(), i7, i8);
    }

    public void onSurfaceCreated(Surface surface) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeSurfaceCreated(this.nativeShellHolderId.longValue(), surface);
    }

    public void onSurfaceDestroyed() {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        onRenderingStopped();
        nativeSurfaceDestroyed(this.nativeShellHolderId.longValue());
    }

    public void onSurfaceWindowChanged(Surface surface) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeSurfaceWindowChanged(this.nativeShellHolderId.longValue(), surface);
    }

    public void onVsync(long j7, long j8, long j9) {
        nativeOnVsync(j7, j8, j9);
    }

    public long performNativeAttach(FlutterJNI flutterJNI) {
        return nativeAttach(flutterJNI);
    }

    public void prefetchDefaultFontManager() {
        if (prefetchDefaultFontManagerCalled) {
            AbstractC6917b.m28359g(TAG, "FlutterJNI.prefetchDefaultFontManager called more than once");
        }
        nativePrefetchDefaultFontManager();
        prefetchDefaultFontManagerCalled = true;
    }

    public void registerImageTexture(long j7, TextureRegistry.ImageConsumer imageConsumer, boolean z6) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeRegisterImageTexture(this.nativeShellHolderId.longValue(), j7, new WeakReference<>(imageConsumer), z6);
    }

    public void registerTexture(long j7, SurfaceTextureWrapper surfaceTextureWrapper) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeRegisterTexture(this.nativeShellHolderId.longValue(), j7, new WeakReference<>(surfaceTextureWrapper));
    }

    public void removeEngineLifecycleListener(C4659a.b bVar) {
        ensureRunningOnMainThread();
        this.engineLifecycleListeners.remove(bVar);
    }

    public void removeIsDisplayingFlutterUiListener(InterfaceC4685m interfaceC4685m) {
        ensureRunningOnMainThread();
        this.flutterUiDisplayListeners.remove(interfaceC4685m);
    }

    public void requestDartDeferredLibrary(int i7) {
        AbstractC6917b.m28354b(TAG, "No DeferredComponentManager found. Android setup must be completed before using split AOT deferred components.");
    }

    public void runBundleAndSnapshotFromLibrary(String str, String str2, String str3, AssetManager assetManager, List<String> list, long j7) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeRunBundleAndSnapshotFromLibrary(this.nativeShellHolderId.longValue(), str, str2, str3, assetManager, list, j7);
    }

    public void scheduleFrame() {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeScheduleFrame(this.nativeShellHolderId.longValue());
    }

    public void setAccessibilityDelegate(InterfaceC4656a interfaceC4656a) {
        ensureRunningOnMainThread();
        this.accessibilityDelegate = interfaceC4656a;
    }

    public void setAccessibilityFeatures(int i7) {
        ensureRunningOnMainThread();
        if (isAttached()) {
            setAccessibilityFeaturesInNative(i7);
        }
    }

    public void setAccessibilityFeaturesInNative(int i7) {
        nativeSetAccessibilityFeatures(this.nativeShellHolderId.longValue(), i7);
    }

    public void setAsyncWaitForVsyncDelegate(InterfaceC4657b interfaceC4657b) {
        asyncWaitForVsyncDelegate = interfaceC4657b;
    }

    public void setDeferredComponentManager(InterfaceC0021a interfaceC0021a) {
        ensureRunningOnMainThread();
        if (interfaceC0021a != null) {
            interfaceC0021a.m70a(this);
        }
    }

    public void setLocalizationPlugin(C0788e c0788e) {
        ensureRunningOnMainThread();
        this.localizationPlugin = c0788e;
    }

    public void setPlatformMessageHandler(InterfaceC7151f interfaceC7151f) {
        ensureRunningOnMainThread();
        this.platformMessageHandler = interfaceC7151f;
    }

    public void setPlatformViewsController(C4783y c4783y) {
        ensureRunningOnMainThread();
        this.platformViewsController = c4783y;
    }

    public void setPlatformViewsController2(C4743S c4743s) {
        ensureRunningOnMainThread();
        this.platformViewsController2 = c4743s;
    }

    public void setRefreshRateFPS(float f7) {
        refreshRateFPS = f7;
        updateRefreshRate();
    }

    public void setSemanticsEnabled(boolean z6) {
        ensureRunningOnMainThread();
        if (isAttached()) {
            setSemanticsEnabledInNative(z6);
        }
    }

    public void setSemanticsEnabledInNative(boolean z6) {
        nativeSetSemanticsEnabled(this.nativeShellHolderId.longValue(), z6);
    }

    public void setViewportMetrics(float f7, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20, int i21, int[] iArr, int[] iArr2, int[] iArr3) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeSetViewportMetrics(this.nativeShellHolderId.longValue(), f7, i7, i8, i9, i10, i11, i12, i13, i14, i15, i16, i17, i18, i19, i20, i21, iArr, iArr2, iArr3);
    }

    public void showOverlaySurface2() {
        C4743S c4743s = this.platformViewsController2;
        if (c4743s == null) {
            throw new RuntimeException("platformViewsController must be set before attempting to destroy an overlay surface");
        }
        c4743s.m20441K();
    }

    public FlutterJNI spawn(String str, String str2, String str3, List<String> list, long j7) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        FlutterJNI nativeSpawn = nativeSpawn(this.nativeShellHolderId.longValue(), str, str2, str3, list, j7);
        Long l7 = nativeSpawn.nativeShellHolderId;
        AbstractC4201d.m17615a((l7 == null || l7.longValue() == 0) ? false : true, "Failed to spawn new JNI connected shell from existing shell.");
        return nativeSpawn;
    }

    public void swapTransactions() {
        C4743S c4743s = this.platformViewsController2;
        if (c4743s == null) {
            throw new RuntimeException(StringUtils.EMPTY);
        }
        c4743s.m20442L();
    }

    public void unregisterTexture(long j7) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeUnregisterTexture(this.nativeShellHolderId.longValue(), j7);
    }

    public void updateDisplayMetrics(int i7, float f7, float f8, float f9) {
        displayWidth = f7;
        displayHeight = f8;
        displayDensity = f9;
        if (loadLibraryCalled) {
            nativeUpdateDisplayMetrics(this.nativeShellHolderId.longValue());
        }
    }

    public void updateJavaAssetManager(AssetManager assetManager, String str) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeUpdateJavaAssetManager(this.nativeShellHolderId.longValue(), assetManager, str);
    }

    public void updateRefreshRate() {
        if (loadLibraryCalled) {
            nativeUpdateRefreshRate(refreshRateFPS);
        }
    }

    public void dispatchSemanticsAction(int i7, C4804i.g gVar, Object obj) {
        ByteBuffer byteBuffer;
        int i8;
        ensureAttachedToNative();
        if (obj != null) {
            byteBuffer = C0664p.f2266a.mo2637a(obj);
            i8 = byteBuffer.position();
        } else {
            byteBuffer = null;
            i8 = 0;
        }
        dispatchSemanticsAction(i7, gVar.f17756a, byteBuffer, i8);
    }

    public void dispatchSemanticsAction(int i7, int i8, ByteBuffer byteBuffer, int i9) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeDispatchSemanticsAction(this.nativeShellHolderId.longValue(), i7, i8, byteBuffer, i9);
    }
}
