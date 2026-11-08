package p328r1;

import java.util.List;
import p078L0.AbstractC0872g;
import p078L0.InterfaceC0861T;
import p078L0.InterfaceC0885t;
import p232g0.C4327q;
import p259j0.AbstractC5332a;
import p259j0.C5357z;
import p328r1.InterfaceC6259K;

/* renamed from: r1.M */
/* loaded from: classes.dex */
public final class C6261M {

    /* renamed from: a */
    public final List f22470a;

    /* renamed from: b */
    public final InterfaceC0861T[] f22471b;

    public C6261M(List list) {
        this.f22470a = list;
        this.f22471b = new InterfaceC0861T[list.size()];
    }

    /* renamed from: a */
    public void m26182a(long j7, C5357z c5357z) {
        if (c5357z.m21942a() < 9) {
            return;
        }
        int m21957p = c5357z.m21957p();
        int m21957p2 = c5357z.m21957p();
        int m21926G = c5357z.m21926G();
        if (m21957p == 434 && m21957p2 == 1195456820 && m21926G == 3) {
            AbstractC0872g.m3649b(j7, c5357z, this.f22471b);
        }
    }

    /* renamed from: b */
    public void m26183b(InterfaceC0885t interfaceC0885t, InterfaceC6259K.d dVar) {
        for (int i7 = 0; i7 < this.f22471b.length; i7++) {
            dVar.m26174a();
            InterfaceC0861T mo455b = interfaceC0885t.mo455b(dVar.m26176c(), 3);
            C4327q c4327q = (C4327q) this.f22470a.get(i7);
            String str = c4327q.f15138n;
            AbstractC5332a.m21797b("application/cea-608".equals(str) || "application/cea-708".equals(str), "Invalid closed caption MIME type provided: " + str);
            mo455b.mo566e(new C4327q.b().m18250a0(dVar.m26175b()).m18264o0(str).m18266q0(c4327q.f15129e).m18254e0(c4327q.f15128d).m18235L(c4327q.f15119G).m18251b0(c4327q.f15141q).m18234K());
            this.f22471b[i7] = mo455b;
        }
    }
}
