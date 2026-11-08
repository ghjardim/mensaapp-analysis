package p328r1;

import p078L0.InterfaceC0861T;
import p078L0.InterfaceC0885t;
import p232g0.C4327q;
import p259j0.AbstractC5330M;
import p259j0.AbstractC5332a;
import p259j0.C5322E;
import p259j0.C5357z;
import p328r1.InterfaceC6259K;

/* renamed from: r1.x */
/* loaded from: classes.dex */
public final class C6285x implements InterfaceC6252D {

    /* renamed from: a */
    public C4327q f22766a;

    /* renamed from: b */
    public C5322E f22767b;

    /* renamed from: c */
    public InterfaceC0861T f22768c;

    public C6285x(String str) {
        this.f22766a = new C4327q.b().m18264o0(str).m18234K();
    }

    @Override // p328r1.InterfaceC6252D
    /* renamed from: a */
    public void mo26131a(C5357z c5357z) {
        m26319b();
        long m21654e = this.f22767b.m21654e();
        long m21655f = this.f22767b.m21655f();
        if (m21654e == -9223372036854775807L || m21655f == -9223372036854775807L) {
            return;
        }
        C4327q c4327q = this.f22766a;
        if (m21655f != c4327q.f15143s) {
            C4327q m18234K = c4327q.m18193a().m18268s0(m21655f).m18234K();
            this.f22766a = m18234K;
            this.f22768c.mo566e(m18234K);
        }
        int m21942a = c5357z.m21942a();
        this.f22768c.mo564d(c5357z, m21942a);
        this.f22768c.mo562c(m21654e, 1, m21942a, 0, null);
    }

    /* renamed from: b */
    public final void m26319b() {
        AbstractC5332a.m21804i(this.f22767b);
        AbstractC5330M.m21747i(this.f22768c);
    }

    @Override // p328r1.InterfaceC6252D
    /* renamed from: c */
    public void mo26132c(C5322E c5322e, InterfaceC0885t interfaceC0885t, InterfaceC6259K.d dVar) {
        this.f22767b = c5322e;
        dVar.m26174a();
        InterfaceC0861T mo455b = interfaceC0885t.mo455b(dVar.m26176c(), 5);
        this.f22768c = mo455b;
        mo455b.mo566e(this.f22766a);
    }
}
