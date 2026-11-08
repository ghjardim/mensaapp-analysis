package p146U5;

import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.jvm.internal.AbstractC5469l;
import p167X5.AbstractC2843D;

/* renamed from: U5.j */
/* loaded from: classes2.dex */
public final class C2592j extends AbstractC2843D {

    /* renamed from: e */
    public final C2584b f7612e;

    /* renamed from: f */
    public final /* synthetic */ AtomicReferenceArray f7613f;

    public C2592j(long j7, C2592j c2592j, C2584b c2584b, int i7) {
        super(j7, c2592j, i7);
        this.f7612e = c2584b;
        this.f7613f = new AtomicReferenceArray(AbstractC2585c.f7586b * 2);
    }

    /* renamed from: A */
    public final Object m8859A(int i7) {
        return m8872z().get(i7 * 2);
    }

    /* renamed from: B */
    public final Object m8860B(int i7) {
        return m8872z().get((i7 * 2) + 1);
    }

    /* renamed from: C */
    public final void m8861C(int i7, boolean z6) {
        if (z6) {
            m8871y().m8761P0((this.f8806c * AbstractC2585c.f7586b) + i7);
        }
        m10256t();
    }

    /* renamed from: D */
    public final Object m8862D(int i7) {
        Object m8859A = m8859A(i7);
        m8869w(i7);
        return m8859A;
    }

    /* renamed from: E */
    public final void m8863E(int i7, Object obj) {
        m8872z().set(i7 * 2, obj);
    }

    /* renamed from: F */
    public final void m8864F(int i7, Object obj) {
        m8872z().set((i7 * 2) + 1, obj);
    }

    /* renamed from: G */
    public final void m8865G(int i7, Object obj) {
        m8863E(i7, obj);
    }

    @Override // p167X5.AbstractC2843D
    /* renamed from: r */
    public int mo8866r() {
        return AbstractC2585c.f7586b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x0063, code lost:
    
        m8869w(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0066, code lost:
    
        if (r0 == false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0068, code lost:
    
        r4 = m8871y().f7577b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x006e, code lost:
    
        if (r4 == null) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0070, code lost:
    
        p167X5.AbstractC2880y.m10396b(r4, r5, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0073, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:?, code lost:
    
        return;
     */
    @Override // p167X5.AbstractC2843D
    /* renamed from: s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo8867s(int r4, java.lang.Throwable r5, p392z5.InterfaceC7161i r6) {
        /*
            r3 = this;
            int r5 = p146U5.AbstractC2585c.f7586b
            if (r4 < r5) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            if (r0 == 0) goto La
            int r4 = r4 - r5
        La:
            java.lang.Object r5 = r3.m8859A(r4)
        Le:
            java.lang.Object r1 = r3.m8860B(r4)
            boolean r2 = r1 instanceof p132S5.InterfaceC2366Z0
            if (r2 != 0) goto L74
            boolean r2 = r1 instanceof p146U5.C2603u
            if (r2 == 0) goto L1b
            goto L74
        L1b:
            X5.G r2 = p146U5.AbstractC2585c.m8827j()
            if (r1 == r2) goto L63
            X5.G r2 = p146U5.AbstractC2585c.m8826i()
            if (r1 != r2) goto L28
            goto L63
        L28:
            X5.G r2 = p146U5.AbstractC2585c.m8833p()
            if (r1 == r2) goto Le
            X5.G r2 = p146U5.AbstractC2585c.m8834q()
            if (r1 != r2) goto L35
            goto Le
        L35:
            X5.G r4 = p146U5.AbstractC2585c.m8823f()
            if (r1 == r4) goto L62
            X5.G r4 = p146U5.AbstractC2585c.f7588d
            if (r1 != r4) goto L40
            goto L62
        L40:
            X5.G r4 = p146U5.AbstractC2585c.m8843z()
            if (r1 != r4) goto L47
            return
        L47:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "unexpected state: "
            r5.append(r6)
            r5.append(r1)
            java.lang.String r5 = r5.toString()
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        L62:
            return
        L63:
            r3.m8869w(r4)
            if (r0 == 0) goto L73
            U5.b r4 = r3.m8871y()
            J5.l r4 = r4.f7577b
            if (r4 == 0) goto L73
            p167X5.AbstractC2880y.m10396b(r4, r5, r6)
        L73:
            return
        L74:
            if (r0 == 0) goto L7b
            X5.G r2 = p146U5.AbstractC2585c.m8827j()
            goto L7f
        L7b:
            X5.G r2 = p146U5.AbstractC2585c.m8826i()
        L7f:
            boolean r1 = r3.m8868v(r4, r1, r2)
            if (r1 == 0) goto Le
            r3.m8869w(r4)
            r1 = r0 ^ 1
            r3.m8861C(r4, r1)
            if (r0 == 0) goto L9a
            U5.b r4 = r3.m8871y()
            J5.l r4 = r4.f7577b
            if (r4 == 0) goto L9a
            p167X5.AbstractC2880y.m10396b(r4, r5, r6)
        L9a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p146U5.C2592j.mo8867s(int, java.lang.Throwable, z5.i):void");
    }

    /* renamed from: v */
    public final boolean m8868v(int i7, Object obj, Object obj2) {
        return AbstractC2591i.m8858a(m8872z(), (i7 * 2) + 1, obj, obj2);
    }

    /* renamed from: w */
    public final void m8869w(int i7) {
        m8863E(i7, null);
    }

    /* renamed from: x */
    public final Object m8870x(int i7, Object obj) {
        return m8872z().getAndSet((i7 * 2) + 1, obj);
    }

    /* renamed from: y */
    public final C2584b m8871y() {
        C2584b c2584b = this.f7612e;
        AbstractC5469l.m23025b(c2584b);
        return c2584b;
    }

    /* renamed from: z */
    public final /* synthetic */ AtomicReferenceArray m8872z() {
        return this.f7613f;
    }
}
