package p220e4;

import android.util.Log;
import java.io.InputStream;

/* renamed from: e4.b */
/* loaded from: classes.dex */
public class C4190b {

    /* renamed from: f */
    public static final Runtime f14038f = Runtime.getRuntime();

    /* renamed from: a */
    public final InputStream f14039a;

    /* renamed from: b */
    public byte[] f14040b;

    /* renamed from: c */
    public int f14041c = 0;

    /* renamed from: e */
    public boolean f14043e = true;

    /* renamed from: d */
    public boolean f14042d = false;

    public C4190b(InputStream inputStream, int i7) {
        this.f14039a = inputStream;
        this.f14040b = new byte[i7];
    }

    /* renamed from: a */
    public int m17584a(int i7) {
        int i8 = this.f14041c;
        int i9 = 0;
        if (i7 <= i8) {
            int i10 = i8 - i7;
            this.f14041c = i10;
            byte[] bArr = this.f14040b;
            System.arraycopy(bArr, i7, bArr, 0, i10);
            return i7;
        }
        this.f14041c = 0;
        while (i9 < i7) {
            int skip = (int) this.f14039a.skip(i7 - i9);
            if (skip > 0) {
                i9 += skip;
            } else if (skip != 0) {
                continue;
            } else {
                if (this.f14039a.read() == -1) {
                    break;
                }
                i9++;
            }
        }
        return i9;
    }

    /* renamed from: b */
    public int m17585b() {
        return this.f14041c;
    }

    /* renamed from: c */
    public void m17586c() {
        this.f14039a.close();
    }

    /* renamed from: d */
    public int m17587d(int i7) {
        if (i7 > this.f14040b.length) {
            i7 = Math.min(i7, m17590g(i7));
        }
        while (true) {
            int i8 = this.f14041c;
            if (i8 >= i7) {
                break;
            }
            int read = this.f14039a.read(this.f14040b, i8, i7 - i8);
            if (read == -1) {
                this.f14042d = true;
                break;
            }
            this.f14041c += read;
        }
        return this.f14041c;
    }

    /* renamed from: e */
    public byte[] m17588e() {
        return this.f14040b;
    }

    /* renamed from: f */
    public boolean m17589f() {
        return this.f14042d;
    }

    /* renamed from: g */
    public final int m17590g(int i7) {
        int max = Math.max(this.f14040b.length * 2, i7);
        Runtime runtime = f14038f;
        long maxMemory = runtime.maxMemory() - (runtime.totalMemory() - runtime.freeMemory());
        if (!this.f14043e || max >= maxMemory) {
            Log.w("AdaptiveStreamBuffer", "Turning off adaptive buffer resizing to conserve memory.");
        } else {
            try {
                byte[] bArr = new byte[max];
                System.arraycopy(this.f14040b, 0, bArr, 0, this.f14041c);
                this.f14040b = bArr;
            } catch (OutOfMemoryError unused) {
                Log.w("AdaptiveStreamBuffer", "Turning off adaptive buffer resizing due to low memory.");
                this.f14043e = false;
            }
        }
        return this.f14040b.length;
    }
}
