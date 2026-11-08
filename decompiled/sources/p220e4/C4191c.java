package p220e4;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.common.internal.AbstractC3802r;
import java.util.Random;
import p031E2.C0271g;
import p031E2.InterfaceC0268d;
import p228f4.AbstractC4281e;
import p303o3.InterfaceC5939b;
import p354u3.InterfaceC6640b;

/* renamed from: e4.c */
/* loaded from: classes.dex */
public class C4191c {

    /* renamed from: f */
    public static final Random f14044f = new Random();

    /* renamed from: g */
    public static InterfaceC4193e f14045g = new C4194f();

    /* renamed from: h */
    public static InterfaceC0268d f14046h = C0271g.m1116d();

    /* renamed from: a */
    public final Context f14047a;

    /* renamed from: b */
    public final InterfaceC6640b f14048b;

    /* renamed from: c */
    public final InterfaceC5939b f14049c;

    /* renamed from: d */
    public long f14050d;

    /* renamed from: e */
    public volatile boolean f14051e;

    public C4191c(Context context, InterfaceC6640b interfaceC6640b, InterfaceC5939b interfaceC5939b, long j7) {
        this.f14047a = context;
        this.f14048b = interfaceC6640b;
        this.f14049c = interfaceC5939b;
        this.f14050d = j7;
    }

    /* renamed from: a */
    public void m17591a() {
        this.f14051e = true;
    }

    /* renamed from: b */
    public boolean m17592b(int i7) {
        return (i7 >= 500 && i7 < 600) || i7 == -2 || i7 == 429 || i7 == 408;
    }

    /* renamed from: c */
    public void m17593c() {
        this.f14051e = false;
    }

    /* renamed from: d */
    public void m17594d(AbstractC4281e abstractC4281e) {
        m17595e(abstractC4281e, true);
    }

    /* renamed from: e */
    public void m17595e(AbstractC4281e abstractC4281e, boolean z6) {
        AbstractC3802r.m15129k(abstractC4281e);
        long mo1111b = f14046h.mo1111b() + this.f14050d;
        if (z6) {
            abstractC4281e.m17899B(AbstractC4197i.m17606c(this.f14048b), AbstractC4197i.m17605b(this.f14049c), this.f14047a);
        } else {
            abstractC4281e.m17901D(AbstractC4197i.m17606c(this.f14048b), AbstractC4197i.m17605b(this.f14049c));
        }
        int i7 = 1000;
        while (f14046h.mo1111b() + i7 <= mo1111b && !abstractC4281e.m17922v() && m17592b(abstractC4281e.m17916o())) {
            try {
                f14045g.mo17599a(f14044f.nextInt(250) + i7);
                if (i7 < 30000) {
                    if (abstractC4281e.m17916o() != -2) {
                        i7 *= 2;
                        Log.w("ExponenentialBackoff", "network error occurred, backing off/sleeping.");
                    } else {
                        Log.w("ExponenentialBackoff", "network unavailable, sleeping.");
                        i7 = 1000;
                    }
                }
                if (this.f14051e) {
                    return;
                }
                abstractC4281e.m17903F();
                if (z6) {
                    abstractC4281e.m17899B(AbstractC4197i.m17606c(this.f14048b), AbstractC4197i.m17605b(this.f14049c), this.f14047a);
                } else {
                    abstractC4281e.m17901D(AbstractC4197i.m17606c(this.f14048b), AbstractC4197i.m17605b(this.f14049c));
                }
            } catch (InterruptedException unused) {
                Log.w("ExponenentialBackoff", "thread interrupted during exponential backoff.");
                Thread.currentThread().interrupt();
                return;
            }
        }
    }
}
