package p109P3;

import p123R3.InterfaceC2257j;
import p137T3.InterfaceC2447b;
import p212d4.InterfaceC4127i;
import p219e3.C4185o;
import p237g5.C4424Z;

/* renamed from: P3.t */
/* loaded from: classes.dex */
public class C1940t implements InterfaceC1901J {

    /* renamed from: d */
    public static final C4424Z.g f5850d;

    /* renamed from: e */
    public static final C4424Z.g f5851e;

    /* renamed from: f */
    public static final C4424Z.g f5852f;

    /* renamed from: a */
    public final InterfaceC2447b f5853a;

    /* renamed from: b */
    public final InterfaceC2447b f5854b;

    /* renamed from: c */
    public final C4185o f5855c;

    static {
        C4424Z.d dVar = C4424Z.f15677e;
        f5850d = C4424Z.g.m18802e("x-firebase-client-log-type", dVar);
        f5851e = C4424Z.g.m18802e("x-firebase-client", dVar);
        f5852f = C4424Z.g.m18802e("x-firebase-gmpid", dVar);
    }

    public C1940t(InterfaceC2447b interfaceC2447b, InterfaceC2447b interfaceC2447b2, C4185o c4185o) {
        this.f5854b = interfaceC2447b;
        this.f5853a = interfaceC2447b2;
        this.f5855c = c4185o;
    }

    @Override // p109P3.InterfaceC1901J
    /* renamed from: a */
    public void mo6617a(C4424Z c4424z) {
        if (this.f5853a.get() == null || this.f5854b.get() == null) {
            return;
        }
        int m7678f = ((InterfaceC2257j) this.f5853a.get()).mo7672b("fire-fst").m7678f();
        if (m7678f != 0) {
            c4424z.m18788p(f5850d, Integer.toString(m7678f));
        }
        c4424z.m18788p(f5851e, ((InterfaceC4127i) this.f5854b.get()).mo17307a());
        m6907b(c4424z);
    }

    /* renamed from: b */
    public final void m6907b(C4424Z c4424z) {
        C4185o c4185o = this.f5855c;
        if (c4185o == null) {
            return;
        }
        String m17548c = c4185o.m17548c();
        if (m17548c.length() != 0) {
            c4424z.m18788p(f5852f, m17548c);
        }
    }
}
