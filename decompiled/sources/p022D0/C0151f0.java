package p022D0;

import android.net.Uri;
import p232g0.AbstractC4303I;
import p232g0.C4331u;
import p259j0.AbstractC5332a;

/* renamed from: D0.f0 */
/* loaded from: classes.dex */
public final class C0151f0 extends AbstractC4303I {

    /* renamed from: r */
    public static final Object f604r = new Object();

    /* renamed from: s */
    public static final C4331u f605s = new C4331u.c().m18278c("SinglePeriodTimeline").m18282g(Uri.EMPTY).m18276a();

    /* renamed from: e */
    public final long f606e;

    /* renamed from: f */
    public final long f607f;

    /* renamed from: g */
    public final long f608g;

    /* renamed from: h */
    public final long f609h;

    /* renamed from: i */
    public final long f610i;

    /* renamed from: j */
    public final long f611j;

    /* renamed from: k */
    public final long f612k;

    /* renamed from: l */
    public final boolean f613l;

    /* renamed from: m */
    public final boolean f614m;

    /* renamed from: n */
    public final boolean f615n;

    /* renamed from: o */
    public final Object f616o;

    /* renamed from: p */
    public final C4331u f617p;

    /* renamed from: q */
    public final C4331u.g f618q;

    public C0151f0(long j7, boolean z6, boolean z7, boolean z8, Object obj, C4331u c4331u) {
        this(j7, j7, 0L, 0L, z6, z7, z8, obj, c4331u);
    }

    @Override // p232g0.AbstractC4303I
    /* renamed from: b */
    public int mo302b(Object obj) {
        return f604r.equals(obj) ? 0 : -1;
    }

    @Override // p232g0.AbstractC4303I
    /* renamed from: g */
    public AbstractC4303I.b mo303g(int i7, AbstractC4303I.b bVar, boolean z6) {
        AbstractC5332a.m21798c(i7, 0, 1);
        return bVar.m18052s(null, z6 ? f604r : null, 0, this.f609h, -this.f611j);
    }

    @Override // p232g0.AbstractC4303I
    /* renamed from: i */
    public int mo307i() {
        return 1;
    }

    @Override // p232g0.AbstractC4303I
    /* renamed from: m */
    public Object mo304m(int i7) {
        AbstractC5332a.m21798c(i7, 0, 1);
        return f604r;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x002b, code lost:
    
        if (r1 > r3) goto L10;
     */
    @Override // p232g0.AbstractC4303I
    /* renamed from: o */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public p232g0.AbstractC4303I.c mo305o(int r25, p232g0.AbstractC4303I.c r26, long r27) {
        /*
            r24 = this;
            r0 = r24
            r1 = 0
            r2 = 1
            r3 = r25
            p259j0.AbstractC5332a.m21798c(r3, r1, r2)
            long r1 = r0.f612k
            boolean r14 = r0.f614m
            if (r14 == 0) goto L2e
            boolean r3 = r0.f615n
            if (r3 != 0) goto L2e
            r3 = 0
            int r3 = (r27 > r3 ? 1 : (r27 == r3 ? 0 : -1))
            if (r3 == 0) goto L2e
            long r3 = r0.f610i
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L27
        L24:
            r16 = r5
            goto L30
        L27:
            long r1 = r1 + r27
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r3 <= 0) goto L2e
            goto L24
        L2e:
            r16 = r1
        L30:
            java.lang.Object r4 = p232g0.AbstractC4303I.c.f14822q
            g0.u r5 = r0.f617p
            java.lang.Object r6 = r0.f616o
            long r7 = r0.f606e
            long r9 = r0.f607f
            long r11 = r0.f608g
            boolean r13 = r0.f613l
            g0.u$g r15 = r0.f618q
            long r1 = r0.f610i
            r18 = r1
            r21 = 0
            long r1 = r0.f611j
            r22 = r1
            r20 = 0
            r3 = r26
            g0.I$c r1 = r3.m18060g(r4, r5, r6, r7, r9, r11, r13, r14, r15, r16, r18, r20, r21, r22)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p022D0.C0151f0.mo305o(int, g0.I$c, long):g0.I$c");
    }

    @Override // p232g0.AbstractC4303I
    /* renamed from: p */
    public int mo308p() {
        return 1;
    }

    public C0151f0(long j7, long j8, long j9, long j10, boolean z6, boolean z7, boolean z8, Object obj, C4331u c4331u) {
        this(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, j7, j8, j9, j10, z6, z7, false, obj, c4331u, z8 ? c4331u.f15214d : null);
    }

    public C0151f0(long j7, long j8, long j9, long j10, long j11, long j12, long j13, boolean z6, boolean z7, boolean z8, Object obj, C4331u c4331u, C4331u.g gVar) {
        this.f606e = j7;
        this.f607f = j8;
        this.f608g = j9;
        this.f609h = j10;
        this.f610i = j11;
        this.f611j = j12;
        this.f612k = j13;
        this.f613l = z6;
        this.f614m = z7;
        this.f615n = z8;
        this.f616o = obj;
        this.f617p = (C4331u) AbstractC5332a.m21800e(c4331u);
        this.f618q = gVar;
    }
}
