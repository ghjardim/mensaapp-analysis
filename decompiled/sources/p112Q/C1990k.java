package p112Q;

import kotlin.jvm.internal.AbstractC5469l;
import p153V5.AbstractC2647t;
import p153V5.InterfaceC2631d;
import p153V5.InterfaceC2641n;

/* renamed from: Q.k */
/* loaded from: classes.dex */
public final class C1990k {

    /* renamed from: a */
    public final InterfaceC2641n f6156a;

    public C1990k() {
        C2005z c2005z = C2005z.f6198b;
        AbstractC5469l.m23026c(c2005z, "null cannot be cast to non-null type androidx.datastore.core.State<T of androidx.datastore.core.DataStoreInMemoryCache>");
        this.f6156a = AbstractC2647t.m9094a(c2005z);
    }

    /* renamed from: a */
    public final AbstractC2001v m7100a() {
        return (AbstractC2001v) this.f6156a.getValue();
    }

    /* renamed from: b */
    public final InterfaceC2631d m7101b() {
        return this.f6156a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0029, code lost:
    
        if (r6.m7126a() > r2.m7126a()) goto L13;
     */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final p112Q.AbstractC2001v m7102c(p112Q.AbstractC2001v r6) {
        /*
            r5 = this;
            java.lang.String r0 = "newState"
            kotlin.jvm.internal.AbstractC5469l.m23028e(r6, r0)
            V5.n r0 = r5.f6156a
        L7:
            java.lang.Object r1 = r0.getValue()
            r2 = r1
            Q.v r2 = (p112Q.AbstractC2001v) r2
            boolean r3 = r2 instanceof p112Q.C1996q
            if (r3 == 0) goto L14
            r3 = 1
            goto L1a
        L14:
            Q.z r3 = p112Q.C2005z.f6198b
            boolean r3 = kotlin.jvm.internal.AbstractC5469l.m23024a(r2, r3)
        L1a:
            if (r3 == 0) goto L1d
            goto L2b
        L1d:
            boolean r3 = r2 instanceof p112Q.C1984e
            if (r3 == 0) goto L2d
            int r3 = r6.m7126a()
            int r4 = r2.m7126a()
            if (r3 <= r4) goto L31
        L2b:
            r2 = r6
            goto L31
        L2d:
            boolean r3 = r2 instanceof p112Q.C1991l
            if (r3 == 0) goto L38
        L31:
            boolean r1 = r0.mo9085b(r1, r2)
            if (r1 == 0) goto L7
            return r2
        L38:
            w5.h r6 = new w5.h
            r6.<init>()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p112Q.C1990k.m7102c(Q.v):Q.v");
    }
}
