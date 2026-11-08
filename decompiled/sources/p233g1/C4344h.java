package p233g1;

import java.util.Arrays;
import java.util.List;
import p078L0.AbstractC0853K;
import p078L0.AbstractC0864W;
import p178Z2.AbstractC3033v;
import p232g0.C4327q;
import p232g0.C4334x;
import p233g1.AbstractC4345i;
import p259j0.AbstractC5332a;
import p259j0.C5357z;

/* renamed from: g1.h */
/* loaded from: classes.dex */
public final class C4344h extends AbstractC4345i {

    /* renamed from: o */
    public static final byte[] f15477o = {79, 112, 117, 115, 72, 101, 97, 100};

    /* renamed from: p */
    public static final byte[] f15478p = {79, 112, 117, 115, 84, 97, 103, 115};

    /* renamed from: n */
    public boolean f15479n;

    /* renamed from: n */
    public static boolean m18461n(C5357z c5357z, byte[] bArr) {
        if (c5357z.m21942a() < bArr.length) {
            return false;
        }
        int m21947f = c5357z.m21947f();
        byte[] bArr2 = new byte[bArr.length];
        c5357z.m21953l(bArr2, 0, bArr.length);
        c5357z.m21939T(m21947f);
        return Arrays.equals(bArr2, bArr);
    }

    /* renamed from: o */
    public static boolean m18462o(C5357z c5357z) {
        return m18461n(c5357z, f15477o);
    }

    @Override // p233g1.AbstractC4345i
    /* renamed from: f */
    public long mo18442f(C5357z c5357z) {
        return m18465c(AbstractC0853K.m3546e(c5357z.m21946e()));
    }

    @Override // p233g1.AbstractC4345i
    /* renamed from: i */
    public boolean mo18443i(C5357z c5357z, long j7, AbstractC4345i.b bVar) {
        if (m18461n(c5357z, f15477o)) {
            byte[] copyOf = Arrays.copyOf(c5357z.m21946e(), c5357z.m21948g());
            int m3544c = AbstractC0853K.m3544c(copyOf);
            List m3542a = AbstractC0853K.m3542a(copyOf);
            if (bVar.f15493a != null) {
                return true;
            }
            bVar.f15493a = new C4327q.b().m18264o0("audio/opus").m18237N(m3544c).m18265p0(48000).m18251b0(m3542a).m18234K();
            return true;
        }
        byte[] bArr = f15478p;
        if (!m18461n(c5357z, bArr)) {
            AbstractC5332a.m21804i(bVar.f15493a);
            return false;
        }
        AbstractC5332a.m21804i(bVar.f15493a);
        if (this.f15479n) {
            return true;
        }
        this.f15479n = true;
        c5357z.m21940U(bArr.length);
        C4334x m3569d = AbstractC0864W.m3569d(AbstractC3033v.m11049q(AbstractC0864W.m3576k(c5357z, false, false).f2968b));
        if (m3569d == null) {
            return true;
        }
        bVar.f15493a = bVar.f15493a.m18193a().m18257h0(m3569d.m18399b(bVar.f15493a.f15135k)).m18234K();
        return true;
    }

    @Override // p233g1.AbstractC4345i
    /* renamed from: l */
    public void mo18444l(boolean z6) {
        super.mo18444l(z6);
        if (z6) {
            this.f15479n = false;
        }
    }
}
