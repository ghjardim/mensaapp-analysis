package p377x4;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorSpace;
import android.graphics.Paint;
import android.hardware.HardwareBuffer;
import android.media.Image;
import android.media.ImageReader;
import android.os.Build;
import android.view.Surface;
import android.view.View;
import io.flutter.embedding.engine.renderer.FlutterRenderer;
import io.flutter.embedding.engine.renderer.InterfaceC4686n;
import java.nio.ByteBuffer;
import java.util.Locale;
import p370w4.AbstractC6917b;

/* renamed from: x4.r */
/* loaded from: classes.dex */
public class C6992r extends View implements InterfaceC4686n {

    /* renamed from: a */
    public ImageReader f25025a;

    /* renamed from: b */
    public Image f25026b;

    /* renamed from: c */
    public Bitmap f25027c;

    /* renamed from: d */
    public FlutterRenderer f25028d;

    /* renamed from: e */
    public b f25029e;

    /* renamed from: f */
    public boolean f25030f;

    /* renamed from: x4.r$a */
    public static /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f25031a;

        static {
            int[] iArr = new int[b.values().length];
            f25031a = iArr;
            try {
                iArr[b.background.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f25031a[b.overlay.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* renamed from: x4.r$b */
    public enum b {
        background,
        overlay
    }

    public C6992r(Context context, int i7, int i8, b bVar) {
        this(context, m28690h(i7, i8), bVar);
    }

    /* renamed from: h */
    public static ImageReader m28690h(int i7, int i8) {
        int i9;
        int i10;
        ImageReader newInstance;
        if (i7 <= 0) {
            m28691j("ImageReader width must be greater than 0, but given width=%d, set width=1", Integer.valueOf(i7));
            i9 = 1;
        } else {
            i9 = i7;
        }
        if (i8 <= 0) {
            m28691j("ImageReader height must be greater than 0, but given height=%d, set height=1", Integer.valueOf(i8));
            i10 = 1;
        } else {
            i10 = i8;
        }
        if (Build.VERSION.SDK_INT < 29) {
            return ImageReader.newInstance(i9, i10, 1, 3);
        }
        newInstance = ImageReader.newInstance(i9, i10, 1, 3, 768L);
        return newInstance;
    }

    /* renamed from: j */
    public static void m28691j(String str, Object... objArr) {
        AbstractC6917b.m28359g("FlutterImageView", String.format(Locale.US, str, objArr));
    }

    @Override // io.flutter.embedding.engine.renderer.InterfaceC4686n
    /* renamed from: b */
    public void mo20307b(FlutterRenderer flutterRenderer) {
        if (a.f25031a[this.f25029e.ordinal()] == 1) {
            flutterRenderer.m20247C(this.f25025a.getSurface());
        }
        setAlpha(1.0f);
        this.f25028d = flutterRenderer;
        this.f25030f = true;
    }

    @Override // io.flutter.embedding.engine.renderer.InterfaceC4686n
    /* renamed from: c */
    public void mo20308c() {
        if (this.f25030f) {
            setAlpha(0.0f);
            m28692d();
            this.f25027c = null;
            m28693f();
            invalidate();
            this.f25030f = false;
        }
    }

    /* renamed from: d */
    public boolean m28692d() {
        if (!this.f25030f) {
            return false;
        }
        Image acquireLatestImage = this.f25025a.acquireLatestImage();
        if (acquireLatestImage != null) {
            m28693f();
            this.f25026b = acquireLatestImage;
            invalidate();
        }
        return acquireLatestImage != null;
    }

    /* renamed from: f */
    public final void m28693f() {
        Image image = this.f25026b;
        if (image != null) {
            image.close();
            this.f25026b = null;
        }
    }

    /* renamed from: g */
    public void m28694g() {
        this.f25025a.close();
    }

    @Override // io.flutter.embedding.engine.renderer.InterfaceC4686n
    public FlutterRenderer getAttachedRenderer() {
        return this.f25028d;
    }

    public ImageReader getImageReader() {
        return this.f25025a;
    }

    public Surface getSurface() {
        return this.f25025a.getSurface();
    }

    /* renamed from: i */
    public final void m28695i() {
        setAlpha(0.0f);
    }

    /* renamed from: k */
    public void m28696k(int i7, int i8) {
        if (this.f25028d == null) {
            return;
        }
        if (i7 == this.f25025a.getWidth() && i8 == this.f25025a.getHeight()) {
            return;
        }
        m28693f();
        m28694g();
        this.f25025a = m28690h(i7, i8);
    }

    /* renamed from: l */
    public final void m28697l() {
        HardwareBuffer hardwareBuffer;
        ColorSpace.Named named;
        ColorSpace colorSpace;
        Bitmap wrapHardwareBuffer;
        if (Build.VERSION.SDK_INT >= 29) {
            hardwareBuffer = this.f25026b.getHardwareBuffer();
            named = ColorSpace.Named.SRGB;
            colorSpace = ColorSpace.get(named);
            wrapHardwareBuffer = Bitmap.wrapHardwareBuffer(hardwareBuffer, colorSpace);
            this.f25027c = wrapHardwareBuffer;
            hardwareBuffer.close();
            return;
        }
        Image.Plane[] planes = this.f25026b.getPlanes();
        if (planes.length != 1) {
            return;
        }
        Image.Plane plane = planes[0];
        int rowStride = plane.getRowStride() / plane.getPixelStride();
        int height = this.f25026b.getHeight();
        Bitmap bitmap = this.f25027c;
        if (bitmap == null || bitmap.getWidth() != rowStride || this.f25027c.getHeight() != height) {
            this.f25027c = Bitmap.createBitmap(rowStride, height, Bitmap.Config.ARGB_8888);
        }
        ByteBuffer buffer = plane.getBuffer();
        buffer.rewind();
        this.f25027c.copyPixelsFromBuffer(buffer);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f25026b != null) {
            m28697l();
        }
        Bitmap bitmap = this.f25027c;
        if (bitmap != null) {
            canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i7, int i8, int i9, int i10) {
        if (!(i7 == this.f25025a.getWidth() && i8 == this.f25025a.getHeight()) && this.f25029e == b.background && this.f25030f) {
            m28696k(i7, i8);
            this.f25028d.m20247C(this.f25025a.getSurface());
        }
    }

    public C6992r(Context context, ImageReader imageReader, b bVar) {
        super(context, null);
        this.f25030f = false;
        this.f25025a = imageReader;
        this.f25029e = bVar;
        m28695i();
    }

    @Override // io.flutter.embedding.engine.renderer.InterfaceC4686n
    /* renamed from: a */
    public void mo20306a() {
    }

    @Override // io.flutter.embedding.engine.renderer.InterfaceC4686n
    /* renamed from: e */
    public void mo20309e() {
    }
}
