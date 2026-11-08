package p249i1;

import android.util.SparseArray;
import p078L0.InterfaceC0855M;
import p078L0.InterfaceC0861T;
import p078L0.InterfaceC0885t;
import p249i1.InterfaceC4529t;

/* renamed from: i1.v */
/* loaded from: classes.dex */
public final class C4531v implements InterfaceC0885t {

    /* renamed from: a */
    public final InterfaceC0885t f16179a;

    /* renamed from: b */
    public final InterfaceC4529t.a f16180b;

    /* renamed from: c */
    public final SparseArray f16181c = new SparseArray();

    public C4531v(InterfaceC0885t interfaceC0885t, InterfaceC4529t.a aVar) {
        this.f16179a = interfaceC0885t;
        this.f16180b = aVar;
    }

    /* renamed from: a */
    public void m19263a() {
        for (int i7 = 0; i7 < this.f16181c.size(); i7++) {
            ((C4533x) this.f16181c.valueAt(i7)).m19268k();
        }
    }

    @Override // p078L0.InterfaceC0885t
    /* renamed from: b */
    public InterfaceC0861T mo455b(int i7, int i8) {
        if (i8 != 3) {
            return this.f16179a.mo455b(i7, i8);
        }
        C4533x c4533x = (C4533x) this.f16181c.get(i7);
        if (c4533x != null) {
            return c4533x;
        }
        C4533x c4533x2 = new C4533x(this.f16179a.mo455b(i7, i8), this.f16180b);
        this.f16181c.put(i7, c4533x2);
        return c4533x2;
    }

    @Override // p078L0.InterfaceC0885t
    /* renamed from: j */
    public void mo466j(InterfaceC0855M interfaceC0855M) {
        this.f16179a.mo466j(interfaceC0855M);
    }

    @Override // p078L0.InterfaceC0885t
    /* renamed from: q */
    public void mo472q() {
        this.f16179a.mo472q();
    }
}
