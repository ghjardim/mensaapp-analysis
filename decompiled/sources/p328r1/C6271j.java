package p328r1;

import android.util.SparseArray;
import java.util.ArrayList;
import java.util.List;
import p178Z2.AbstractC3033v;
import p232g0.C4327q;
import p259j0.AbstractC5335d;
import p259j0.C5357z;
import p328r1.InterfaceC6259K;

/* renamed from: r1.j */
/* loaded from: classes.dex */
public final class C6271j implements InterfaceC6259K.c {

    /* renamed from: a */
    public final int f22543a;

    /* renamed from: b */
    public final List f22544b;

    public C6271j(int i7) {
        this(i7, AbstractC3033v.m11050t());
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0057  */
    @Override // p328r1.InterfaceC6259K.c
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public p328r1.InterfaceC6259K mo26172a(int r5, p328r1.InterfaceC6259K.b r6) {
        /*
            Method dump skipped, instructions count: 382
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p328r1.C6271j.mo26172a(int, r1.K$b):r1.K");
    }

    @Override // p328r1.InterfaceC6259K.c
    /* renamed from: b */
    public SparseArray mo26173b() {
        return new SparseArray();
    }

    /* renamed from: c */
    public final C6254F m26224c(InterfaceC6259K.b bVar) {
        return new C6254F(m26226e(bVar));
    }

    /* renamed from: d */
    public final C6261M m26225d(InterfaceC6259K.b bVar) {
        return new C6261M(m26226e(bVar));
    }

    /* renamed from: e */
    public final List m26226e(InterfaceC6259K.b bVar) {
        String str;
        int i7;
        if (m26227f(32)) {
            return this.f22544b;
        }
        C5357z c5357z = new C5357z(bVar.f22464e);
        List list = this.f22544b;
        while (c5357z.m21942a() > 0) {
            int m21926G = c5357z.m21926G();
            int m21947f = c5357z.m21947f() + c5357z.m21926G();
            if (m21926G == 134) {
                list = new ArrayList();
                int m21926G2 = c5357z.m21926G() & 31;
                for (int i8 = 0; i8 < m21926G2; i8++) {
                    String m21923D = c5357z.m21923D(3);
                    int m21926G3 = c5357z.m21926G();
                    boolean z6 = (m21926G3 & 128) != 0;
                    if (z6) {
                        i7 = m21926G3 & 63;
                        str = "application/cea-708";
                    } else {
                        str = "application/cea-608";
                        i7 = 1;
                    }
                    byte m21926G4 = (byte) c5357z.m21926G();
                    c5357z.m21940U(1);
                    list.add(new C4327q.b().m18264o0(str).m18254e0(m21923D).m18235L(i7).m18251b0(z6 ? AbstractC5335d.m21809b((m21926G4 & 64) != 0) : null).m18234K());
                }
            }
            c5357z.m21939T(m21947f);
        }
        return list;
    }

    /* renamed from: f */
    public final boolean m26227f(int i7) {
        return (i7 & this.f22543a) != 0;
    }

    public C6271j(int i7, List list) {
        this.f22543a = i7;
        this.f22544b = list;
    }
}
