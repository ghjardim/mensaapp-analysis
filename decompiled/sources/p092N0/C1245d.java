package p092N0;

import p259j0.AbstractC5330M;
import p259j0.AbstractC5346o;
import p259j0.C5357z;

/* renamed from: N0.d */
/* loaded from: classes.dex */
public final class C1245d implements InterfaceC1242a {

    /* renamed from: a */
    public final int f3943a;

    /* renamed from: b */
    public final int f3944b;

    /* renamed from: c */
    public final int f3945c;

    /* renamed from: d */
    public final int f3946d;

    /* renamed from: e */
    public final int f3947e;

    /* renamed from: f */
    public final int f3948f;

    public C1245d(int i7, int i8, int i9, int i10, int i11, int i12) {
        this.f3943a = i7;
        this.f3944b = i8;
        this.f3945c = i9;
        this.f3946d = i10;
        this.f3947e = i11;
        this.f3948f = i12;
    }

    /* renamed from: d */
    public static C1245d m4770d(C5357z c5357z) {
        int m21961t = c5357z.m21961t();
        c5357z.m21940U(12);
        int m21961t2 = c5357z.m21961t();
        int m21961t3 = c5357z.m21961t();
        int m21961t4 = c5357z.m21961t();
        c5357z.m21940U(4);
        int m21961t5 = c5357z.m21961t();
        int m21961t6 = c5357z.m21961t();
        c5357z.m21940U(8);
        return new C1245d(m21961t, m21961t2, m21961t3, m21961t4, m21961t5, m21961t6);
    }

    @Override // p092N0.InterfaceC1242a
    /* renamed from: a */
    public int mo4756a() {
        return 1752331379;
    }

    /* renamed from: b */
    public long m4771b() {
        return AbstractC5330M.m21718X0(this.f3947e, this.f3945c * 1000000, this.f3946d);
    }

    /* renamed from: c */
    public int m4772c() {
        int i7 = this.f3943a;
        if (i7 == 1935960438) {
            return 2;
        }
        if (i7 == 1935963489) {
            return 1;
        }
        if (i7 == 1937012852) {
            return 3;
        }
        AbstractC5346o.m21867h("AviStreamHeaderChunk", "Found unsupported streamType fourCC: " + Integer.toHexString(this.f3943a));
        return -1;
    }
}
