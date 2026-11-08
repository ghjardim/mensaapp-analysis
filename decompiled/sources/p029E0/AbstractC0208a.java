package p029E0;

import p232g0.C4327q;
import p259j0.AbstractC5332a;
import p276l0.C5497k;
import p276l0.InterfaceC5493g;

/* renamed from: E0.a */
/* loaded from: classes.dex */
public abstract class AbstractC0208a extends AbstractC0220m {

    /* renamed from: k */
    public final long f843k;

    /* renamed from: l */
    public final long f844l;

    /* renamed from: m */
    public C0210c f845m;

    /* renamed from: n */
    public int[] f846n;

    public AbstractC0208a(InterfaceC5493g interfaceC5493g, C5497k c5497k, C4327q c4327q, int i7, Object obj, long j7, long j8, long j9, long j10, long j11) {
        super(interfaceC5493g, c5497k, c4327q, i7, obj, j7, j8, j11);
        this.f843k = j9;
        this.f844l = j10;
    }

    /* renamed from: i */
    public final int m849i(int i7) {
        return ((int[]) AbstractC5332a.m21804i(this.f846n))[i7];
    }

    /* renamed from: j */
    public final C0210c m850j() {
        return (C0210c) AbstractC5332a.m21804i(this.f845m);
    }

    /* renamed from: k */
    public void m851k(C0210c c0210c) {
        this.f845m = c0210c;
        this.f846n = c0210c.m856a();
    }
}
