package p328r1;

import p078L0.InterfaceC0861T;
import p078L0.InterfaceC0885t;
import p232g0.C4327q;
import p259j0.AbstractC5332a;
import p259j0.AbstractC5346o;
import p259j0.C5357z;
import p328r1.InterfaceC6259K;

/* renamed from: r1.r */
/* loaded from: classes.dex */
public final class C6279r implements InterfaceC6274m {

    /* renamed from: b */
    public InterfaceC0861T f22693b;

    /* renamed from: c */
    public boolean f22694c;

    /* renamed from: e */
    public int f22696e;

    /* renamed from: f */
    public int f22697f;

    /* renamed from: a */
    public final C5357z f22692a = new C5357z(10);

    /* renamed from: d */
    public long f22695d = -9223372036854775807L;

    @Override // p328r1.InterfaceC6274m
    /* renamed from: a */
    public void mo26186a(C5357z c5357z) {
        AbstractC5332a.m21804i(this.f22693b);
        if (this.f22694c) {
            int m21942a = c5357z.m21942a();
            int i7 = this.f22697f;
            if (i7 < 10) {
                int min = Math.min(m21942a, 10 - i7);
                System.arraycopy(c5357z.m21946e(), c5357z.m21947f(), this.f22692a.m21946e(), this.f22697f, min);
                if (this.f22697f + min == 10) {
                    this.f22692a.m21939T(0);
                    if (73 != this.f22692a.m21926G() || 68 != this.f22692a.m21926G() || 51 != this.f22692a.m21926G()) {
                        AbstractC5346o.m21867h("Id3Reader", "Discarding invalid ID3 tag");
                        this.f22694c = false;
                        return;
                    } else {
                        this.f22692a.m21940U(3);
                        this.f22696e = this.f22692a.m21925F() + 10;
                    }
                }
            }
            int min2 = Math.min(m21942a, this.f22696e - this.f22697f);
            this.f22693b.mo564d(c5357z, min2);
            this.f22697f += min2;
        }
    }

    @Override // p328r1.InterfaceC6274m
    /* renamed from: b */
    public void mo26187b() {
        this.f22694c = false;
        this.f22695d = -9223372036854775807L;
    }

    @Override // p328r1.InterfaceC6274m
    /* renamed from: c */
    public void mo26188c(InterfaceC0885t interfaceC0885t, InterfaceC6259K.d dVar) {
        dVar.m26174a();
        InterfaceC0861T mo455b = interfaceC0885t.mo455b(dVar.m26176c(), 5);
        this.f22693b = mo455b;
        mo455b.mo566e(new C4327q.b().m18250a0(dVar.m26175b()).m18264o0("application/id3").m18234K());
    }

    @Override // p328r1.InterfaceC6274m
    /* renamed from: d */
    public void mo26189d(boolean z6) {
        int i7;
        AbstractC5332a.m21804i(this.f22693b);
        if (this.f22694c && (i7 = this.f22696e) != 0 && this.f22697f == i7) {
            AbstractC5332a.m21802g(this.f22695d != -9223372036854775807L);
            this.f22693b.mo562c(this.f22695d, 1, this.f22696e, 0, null);
            this.f22694c = false;
        }
    }

    @Override // p328r1.InterfaceC6274m
    /* renamed from: e */
    public void mo26190e(long j7, int i7) {
        if ((i7 & 4) == 0) {
            return;
        }
        this.f22694c = true;
        this.f22695d = j7;
        this.f22696e = 0;
        this.f22697f = 0;
    }
}
