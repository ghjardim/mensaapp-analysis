package p022D0;

import p078L0.C0854L;
import p078L0.InterfaceC0883r;
import p078L0.InterfaceC0884s;
import p078L0.InterfaceC0889x;
import p217e1.C4157f;
import p259j0.AbstractC5332a;

/* renamed from: D0.d */
/* loaded from: classes.dex */
public final class C0146d implements InterfaceC0131Q {

    /* renamed from: a */
    public final InterfaceC0889x f572a;

    /* renamed from: b */
    public InterfaceC0883r f573b;

    /* renamed from: c */
    public InterfaceC0884s f574c;

    public C0146d(InterfaceC0889x interfaceC0889x) {
        this.f572a = interfaceC0889x;
    }

    /* renamed from: g */
    public static /* synthetic */ String m590g(InterfaceC0883r interfaceC0883r) {
        return interfaceC0883r.mo697d().getClass().getSimpleName();
    }

    @Override // p022D0.InterfaceC0131Q
    /* renamed from: a */
    public void mo417a(long j7, long j8) {
        ((InterfaceC0883r) AbstractC5332a.m21800e(this.f573b)).mo695a(j7, j8);
    }

    @Override // p022D0.InterfaceC0131Q
    /* renamed from: b */
    public int mo418b(C0854L c0854l) {
        return ((InterfaceC0883r) AbstractC5332a.m21800e(this.f573b)).mo699h((InterfaceC0884s) AbstractC5332a.m21800e(this.f574c), c0854l);
    }

    @Override // p022D0.InterfaceC0131Q
    /* renamed from: c */
    public long mo419c() {
        InterfaceC0884s interfaceC0884s = this.f574c;
        if (interfaceC0884s != null) {
            return interfaceC0884s.mo3522u();
        }
        return -1L;
    }

    @Override // p022D0.InterfaceC0131Q
    /* renamed from: d */
    public void mo420d() {
        InterfaceC0883r interfaceC0883r = this.f573b;
        if (interfaceC0883r == null) {
            return;
        }
        InterfaceC0883r mo697d = interfaceC0883r.mo697d();
        if (mo697d instanceof C4157f) {
            ((C4157f) mo697d).m17475l();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x004d, code lost:
    
        if (r6.mo3522u() != r11) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0050, code lost:
    
        r2 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0078, code lost:
    
        if (r6.mo3522u() != r11) goto L23;
     */
    @Override // p022D0.InterfaceC0131Q
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo421e(p232g0.InterfaceC4319i r8, android.net.Uri r9, java.util.Map r10, long r11, long r13, p078L0.InterfaceC0885t r15) {
        /*
            r7 = this;
            L0.j r6 = new L0.j
            r0 = r6
            r1 = r8
            r2 = r11
            r4 = r13
            r0.<init>(r1, r2, r4)
            r7.f574c = r6
            L0.r r8 = r7.f573b
            if (r8 == 0) goto L10
            return
        L10:
            L0.x r8 = r7.f572a
            L0.r[] r8 = r8.mo650d(r9, r10)
            int r10 = r8.length
            Z2.v$a r10 = p178Z2.AbstractC3033v.m11046n(r10)
            int r13 = r8.length
            r14 = 0
            r0 = 1
            if (r13 != r0) goto L25
            r8 = r8[r14]
            r7.f573b = r8
            goto L82
        L25:
            int r13 = r8.length
            r1 = r14
        L27:
            if (r1 >= r13) goto L7e
            r2 = r8[r1]
            boolean r3 = r2.mo700i(r6)     // Catch: java.lang.Throwable -> L3a java.io.EOFException -> L6e
            if (r3 == 0) goto L3c
            r7.f573b = r2     // Catch: java.lang.Throwable -> L3a java.io.EOFException -> L6e
            p259j0.AbstractC5332a.m21802g(r0)
            r6.mo3518p()
            goto L7e
        L3a:
            r8 = move-exception
            goto L5a
        L3c:
            java.util.List r2 = r2.mo698g()     // Catch: java.lang.Throwable -> L3a java.io.EOFException -> L6e
            r10.m11062j(r2)     // Catch: java.lang.Throwable -> L3a java.io.EOFException -> L6e
            L0.r r2 = r7.f573b
            if (r2 != 0) goto L52
            long r2 = r6.mo3522u()
            int r2 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            if (r2 != 0) goto L50
            goto L52
        L50:
            r2 = r14
            goto L53
        L52:
            r2 = r0
        L53:
            p259j0.AbstractC5332a.m21802g(r2)
            r6.mo3518p()
            goto L7b
        L5a:
            L0.r r9 = r7.f573b
            if (r9 != 0) goto L66
            long r9 = r6.mo3522u()
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 != 0) goto L67
        L66:
            r14 = r0
        L67:
            p259j0.AbstractC5332a.m21802g(r14)
            r6.mo3518p()
            throw r8
        L6e:
            L0.r r2 = r7.f573b
            if (r2 != 0) goto L52
            long r2 = r6.mo3522u()
            int r2 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            if (r2 != 0) goto L50
            goto L52
        L7b:
            int r1 = r1 + 1
            goto L27
        L7e:
            L0.r r11 = r7.f573b
            if (r11 == 0) goto L88
        L82:
            L0.r r8 = r7.f573b
            r8.mo696b(r15)
            return
        L88:
            D0.n0 r11 = new D0.n0
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r13 = "None of the available extractors ("
            r12.append(r13)
            java.lang.String r13 = ", "
            Y2.h r13 = p171Y2.C2925h.m10526g(r13)
            Z2.v r8 = p178Z2.AbstractC3033v.m11049q(r8)
            D0.c r14 = new D0.c
            r14.<init>()
            java.util.List r8 = p178Z2.AbstractC2990D.m10791k(r8, r14)
            java.lang.String r8 = r13.m10530d(r8)
            r12.append(r8)
            java.lang.String r8 = ") could read the stream."
            r12.append(r8)
            java.lang.String r8 = r12.toString()
            java.lang.Object r9 = p259j0.AbstractC5332a.m21800e(r9)
            android.net.Uri r9 = (android.net.Uri) r9
            Z2.v r10 = r10.m11063k()
            r11.<init>(r8, r9, r10)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: p022D0.C0146d.mo421e(g0.i, android.net.Uri, java.util.Map, long, long, L0.t):void");
    }

    @Override // p022D0.InterfaceC0131Q
    public void release() {
        InterfaceC0883r interfaceC0883r = this.f573b;
        if (interfaceC0883r != null) {
            interfaceC0883r.release();
            this.f573b = null;
        }
        this.f574c = null;
    }
}
