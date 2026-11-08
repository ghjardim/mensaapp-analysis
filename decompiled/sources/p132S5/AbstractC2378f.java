package p132S5;

import p013B5.AbstractC0060d;
import p378x5.AbstractC7024o;
import p392z5.InterfaceC7157e;

/* renamed from: S5.f */
/* loaded from: classes2.dex */
public abstract class AbstractC2378f {

    /* renamed from: S5.f$a */
    public static final class a extends AbstractC0060d {

        /* renamed from: a */
        public Object f7114a;

        /* renamed from: b */
        public int f7115b;

        /* renamed from: c */
        public int f7116c;

        /* renamed from: d */
        public /* synthetic */ Object f7117d;

        /* renamed from: e */
        public int f7118e;

        public a(InterfaceC7157e interfaceC7157e) {
            super(interfaceC7157e);
        }

        @Override // p013B5.AbstractC0057a
        public final Object invokeSuspend(Object obj) {
            this.f7117d = obj;
            this.f7118e |= Integer.MIN_VALUE;
            return AbstractC2378f.m8086c(null, this);
        }
    }

    /* renamed from: S5.f$b */
    public static final class b extends AbstractC0060d {

        /* renamed from: a */
        public Object f7119a;

        /* renamed from: b */
        public /* synthetic */ Object f7120b;

        /* renamed from: c */
        public int f7121c;

        public b(InterfaceC7157e interfaceC7157e) {
            super(interfaceC7157e);
        }

        @Override // p013B5.AbstractC0057a
        public final Object invokeSuspend(Object obj) {
            this.f7120b = obj;
            this.f7121c |= Integer.MIN_VALUE;
            return AbstractC2378f.m8085b(null, this);
        }
    }

    /* renamed from: a */
    public static final Object m8084a(InterfaceC2348Q[] interfaceC2348QArr, InterfaceC7157e interfaceC7157e) {
        return interfaceC2348QArr.length == 0 ? AbstractC7024o.m28861g() : new C2376e(interfaceC2348QArr).m8065c(interfaceC7157e);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m8085b(java.util.Collection r4, p392z5.InterfaceC7157e r5) {
        /*
            boolean r0 = r5 instanceof p132S5.AbstractC2378f.b
            if (r0 == 0) goto L13
            r0 = r5
            S5.f$b r0 = (p132S5.AbstractC2378f.b) r0
            int r1 = r0.f7121c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f7121c = r1
            goto L18
        L13:
            S5.f$b r0 = new S5.f$b
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f7120b
            java.lang.Object r1 = p006A5.AbstractC0024c.m76e()
            int r2 = r0.f7121c
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r4 = r0.f7119a
            java.util.Iterator r4 = (java.util.Iterator) r4
            p371w5.AbstractC6928k.m28382b(r5)
            goto L3c
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L35:
            p371w5.AbstractC6928k.m28382b(r5)
            java.util.Iterator r4 = r4.iterator()
        L3c:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L53
            java.lang.Object r5 = r4.next()
            S5.u0 r5 = (p132S5.InterfaceC2409u0) r5
            r0.f7119a = r4
            r0.f7121c = r3
            java.lang.Object r5 = r5.join(r0)
            if (r5 != r1) goto L3c
            return r1
        L53:
            w5.q r4 = p371w5.C6934q.f24811a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p132S5.AbstractC2378f.m8085b(java.util.Collection, z5.e):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0052 -> B:10:0x0055). Please report as a decompilation issue!!! */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m8086c(p132S5.InterfaceC2409u0[] r6, p392z5.InterfaceC7157e r7) {
        /*
            boolean r0 = r7 instanceof p132S5.AbstractC2378f.a
            if (r0 == 0) goto L13
            r0 = r7
            S5.f$a r0 = (p132S5.AbstractC2378f.a) r0
            int r1 = r0.f7118e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f7118e = r1
            goto L18
        L13:
            S5.f$a r0 = new S5.f$a
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f7117d
            java.lang.Object r1 = p006A5.AbstractC0024c.m76e()
            int r2 = r0.f7118e
            r3 = 1
            if (r2 == 0) goto L3a
            if (r2 != r3) goto L32
            int r6 = r0.f7116c
            int r2 = r0.f7115b
            java.lang.Object r4 = r0.f7114a
            S5.u0[] r4 = (p132S5.InterfaceC2409u0[]) r4
            p371w5.AbstractC6928k.m28382b(r7)
            r7 = r4
            goto L55
        L32:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3a:
            p371w5.AbstractC6928k.m28382b(r7)
            int r7 = r6.length
            r2 = 0
            r5 = r7
            r7 = r6
            r6 = r5
        L42:
            if (r2 >= r6) goto L57
            r4 = r7[r2]
            r0.f7114a = r7
            r0.f7115b = r2
            r0.f7116c = r6
            r0.f7118e = r3
            java.lang.Object r4 = r4.join(r0)
            if (r4 != r1) goto L55
            return r1
        L55:
            int r2 = r2 + r3
            goto L42
        L57:
            w5.q r6 = p371w5.C6934q.f24811a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p132S5.AbstractC2378f.m8086c(S5.u0[], z5.e):java.lang.Object");
    }
}
