package p029E0;

import p232g0.C4327q;
import p259j0.AbstractC5332a;
import p276l0.C5497k;
import p276l0.InterfaceC5493g;

/* renamed from: E0.m */
/* loaded from: classes.dex */
public abstract class AbstractC0220m extends AbstractC0212e {

    /* renamed from: j */
    public final long f923j;

    public AbstractC0220m(InterfaceC5493g interfaceC5493g, C5497k c5497k, C4327q c4327q, int i7, Object obj, long j7, long j8, long j9) {
        super(interfaceC5493g, c5497k, 1, c4327q, i7, obj, j7, j8);
        AbstractC5332a.m21800e(c4327q);
        this.f923j = j9;
    }

    /* renamed from: g */
    public long mo912g() {
        long j7 = this.f923j;
        if (j7 != -1) {
            return 1 + j7;
        }
        return -1L;
    }

    /* renamed from: h */
    public abstract boolean mo913h();
}
