package p328r1;

import java.util.Collections;
import java.util.List;
import p078L0.InterfaceC0861T;
import p078L0.InterfaceC0885t;
import p232g0.C4327q;
import p259j0.AbstractC5332a;
import p259j0.C5357z;
import p328r1.InterfaceC6259K;

/* renamed from: r1.l */
/* loaded from: classes.dex */
public final class C6273l implements InterfaceC6274m {

    /* renamed from: a */
    public final List f22561a;

    /* renamed from: b */
    public final InterfaceC0861T[] f22562b;

    /* renamed from: c */
    public boolean f22563c;

    /* renamed from: d */
    public int f22564d;

    /* renamed from: e */
    public int f22565e;

    /* renamed from: f */
    public long f22566f = -9223372036854775807L;

    public C6273l(List list) {
        this.f22561a = list;
        this.f22562b = new InterfaceC0861T[list.size()];
    }

    @Override // p328r1.InterfaceC6274m
    /* renamed from: a */
    public void mo26186a(C5357z c5357z) {
        if (this.f22563c) {
            if (this.f22564d != 2 || m26234f(c5357z, 32)) {
                if (this.f22564d != 1 || m26234f(c5357z, 0)) {
                    int m21947f = c5357z.m21947f();
                    int m21942a = c5357z.m21942a();
                    for (InterfaceC0861T interfaceC0861T : this.f22562b) {
                        c5357z.m21939T(m21947f);
                        interfaceC0861T.mo564d(c5357z, m21942a);
                    }
                    this.f22565e += m21942a;
                }
            }
        }
    }

    @Override // p328r1.InterfaceC6274m
    /* renamed from: b */
    public void mo26187b() {
        this.f22563c = false;
        this.f22566f = -9223372036854775807L;
    }

    @Override // p328r1.InterfaceC6274m
    /* renamed from: c */
    public void mo26188c(InterfaceC0885t interfaceC0885t, InterfaceC6259K.d dVar) {
        for (int i7 = 0; i7 < this.f22562b.length; i7++) {
            InterfaceC6259K.a aVar = (InterfaceC6259K.a) this.f22561a.get(i7);
            dVar.m26174a();
            InterfaceC0861T mo455b = interfaceC0885t.mo455b(dVar.m26176c(), 3);
            mo455b.mo566e(new C4327q.b().m18250a0(dVar.m26175b()).m18264o0("application/dvbsubs").m18251b0(Collections.singletonList(aVar.f22459c)).m18254e0(aVar.f22457a).m18234K());
            this.f22562b[i7] = mo455b;
        }
    }

    @Override // p328r1.InterfaceC6274m
    /* renamed from: d */
    public void mo26189d(boolean z6) {
        if (this.f22563c) {
            AbstractC5332a.m21802g(this.f22566f != -9223372036854775807L);
            for (InterfaceC0861T interfaceC0861T : this.f22562b) {
                interfaceC0861T.mo562c(this.f22566f, 1, this.f22565e, 0, null);
            }
            this.f22563c = false;
        }
    }

    @Override // p328r1.InterfaceC6274m
    /* renamed from: e */
    public void mo26190e(long j7, int i7) {
        if ((i7 & 4) == 0) {
            return;
        }
        this.f22563c = true;
        this.f22566f = j7;
        this.f22565e = 0;
        this.f22564d = 2;
    }

    /* renamed from: f */
    public final boolean m26234f(C5357z c5357z, int i7) {
        if (c5357z.m21942a() == 0) {
            return false;
        }
        if (c5357z.m21926G() != i7) {
            this.f22563c = false;
        }
        this.f22564d--;
        return this.f22563c;
    }
}
