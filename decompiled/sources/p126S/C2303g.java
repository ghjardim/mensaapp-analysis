package p126S;

import kotlin.jvm.internal.AbstractC5469l;
import p013B5.AbstractC0060d;
import p112Q.InterfaceC1979B;
import p206c6.AbstractC3622j;
import p206c6.C3601M;
import p392z5.InterfaceC7157e;

/* renamed from: S.g */
/* loaded from: classes.dex */
public final class C2303g extends C2298b implements InterfaceC1979B {

    /* renamed from: S.g$a */
    public static final class a extends AbstractC0060d {

        /* renamed from: a */
        public Object f6992a;

        /* renamed from: b */
        public Object f6993b;

        /* renamed from: c */
        public Object f6994c;

        /* renamed from: d */
        public /* synthetic */ Object f6995d;

        /* renamed from: f */
        public int f6997f;

        public a(InterfaceC7157e interfaceC7157e) {
            super(interfaceC7157e);
        }

        @Override // p013B5.AbstractC0057a
        public final Object invokeSuspend(Object obj) {
            this.f6995d = obj;
            this.f6997f |= Integer.MIN_VALUE;
            return C2303g.this.mo7028d(null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2303g(AbstractC3622j fileSystem, C3601M path, InterfaceC2299c serializer) {
        super(fileSystem, path, serializer);
        AbstractC5469l.m23028e(fileSystem, "fileSystem");
        AbstractC5469l.m23028e(path, "path");
        AbstractC5469l.m23028e(serializer, "serializer");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(2:3|(8:5|6|7|(1:(3:10|11|12)(2:42|43))(6:44|45|46|47|48|(1:50)(1:51))|13|(2:29|30)|15|(3:17|(2:24|25)|(2:20|21)(1:23))(1:28)))|66|6|7|(0)(0)|13|(0)|15|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0090, code lost:
    
        r9 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0091, code lost:
    
        r10 = r0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0097 A[Catch: all -> 0x0090, TRY_LEAVE, TryCatch #0 {all -> 0x0090, blocks: (B:17:0x0097, B:28:0x00a4, B:41:0x008c, B:38:0x0087), top: B:7:0x0022, inners: #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a4 A[Catch: all -> 0x0090, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0090, blocks: (B:17:0x0097, B:28:0x00a4, B:41:0x008c, B:38:0x0087), top: B:7:0x0022, inners: #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0079 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0087 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v2, types: [S.g$a, z5.e] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r5v1, types: [S.c] */
    @Override // p112Q.InterfaceC1979B
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object mo7028d(java.lang.Object r9, p392z5.InterfaceC7157e r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof p126S.C2303g.a
            if (r0 == 0) goto L13
            r0 = r10
            S.g$a r0 = (p126S.C2303g.a) r0
            int r1 = r0.f6997f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f6997f = r1
            goto L18
        L13:
            S.g$a r0 = new S.g$a
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f6995d
            java.lang.Object r1 = p006A5.AbstractC0024c.m76e()
            int r2 = r0.f6997f
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L40
            if (r2 != r3) goto L38
            java.lang.Object r9 = r0.f6994c
            java.io.Closeable r9 = (java.io.Closeable) r9
            java.lang.Object r1 = r0.f6993b
            c6.h r1 = (p206c6.AbstractC3620h) r1
            java.lang.Object r0 = r0.f6992a
            java.io.Closeable r0 = (java.io.Closeable) r0
            p371w5.AbstractC6928k.m28382b(r10)     // Catch: java.lang.Throwable -> L36
            goto L72
        L36:
            r10 = move-exception
            goto L85
        L38:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L40:
            p371w5.AbstractC6928k.m28382b(r10)
            r8.m7799f()
            c6.j r10 = r8.m7800g()
            c6.M r2 = r8.m7801h()
            c6.h r10 = r10.m14681j(r2)
            r5 = 0
            c6.T r2 = p206c6.AbstractC3620h.m14656D(r10, r5, r3, r4)     // Catch: java.lang.Throwable -> La5
            c6.e r2 = p206c6.AbstractC3596H.m14469a(r2)     // Catch: java.lang.Throwable -> La5
            S.c r5 = r8.m7802i()     // Catch: java.lang.Throwable -> L81
            r0.f6992a = r10     // Catch: java.lang.Throwable -> L81
            r0.f6993b = r10     // Catch: java.lang.Throwable -> L81
            r0.f6994c = r2     // Catch: java.lang.Throwable -> L81
            r0.f6997f = r3     // Catch: java.lang.Throwable -> L81
            java.lang.Object r9 = r5.mo7805c(r9, r2, r0)     // Catch: java.lang.Throwable -> L81
            if (r9 != r1) goto L6f
            return r1
        L6f:
            r0 = r10
            r1 = r0
            r9 = r2
        L72:
            r1.flush()     // Catch: java.lang.Throwable -> L36
            w5.q r10 = p371w5.C6934q.f24811a     // Catch: java.lang.Throwable -> L36
            if (r9 == 0) goto L7f
            r9.close()     // Catch: java.lang.Throwable -> L7d
            goto L7f
        L7d:
            r9 = move-exception
            goto L95
        L7f:
            r9 = r4
            goto L95
        L81:
            r9 = move-exception
            r0 = r10
            r10 = r9
            r9 = r2
        L85:
            if (r9 == 0) goto L93
            r9.close()     // Catch: java.lang.Throwable -> L8b
            goto L93
        L8b:
            r9 = move-exception
            p371w5.AbstractC6918a.m28362a(r10, r9)     // Catch: java.lang.Throwable -> L90
            goto L93
        L90:
            r9 = move-exception
            r10 = r0
            goto La6
        L93:
            r9 = r10
            r10 = r4
        L95:
            if (r9 != 0) goto La4
            kotlin.jvm.internal.AbstractC5469l.m23025b(r10)     // Catch: java.lang.Throwable -> L90
            w5.q r9 = p371w5.C6934q.f24811a     // Catch: java.lang.Throwable -> L90
            if (r0 == 0) goto Lb3
            r0.close()     // Catch: java.lang.Throwable -> La2
            goto Lb3
        La2:
            r4 = move-exception
            goto Lb3
        La4:
            throw r9     // Catch: java.lang.Throwable -> L90
        La5:
            r9 = move-exception
        La6:
            if (r10 == 0) goto Lb0
            r10.close()     // Catch: java.lang.Throwable -> Lac
            goto Lb0
        Lac:
            r10 = move-exception
            p371w5.AbstractC6918a.m28362a(r9, r10)
        Lb0:
            r7 = r4
            r4 = r9
            r9 = r7
        Lb3:
            if (r4 != 0) goto Lbb
            kotlin.jvm.internal.AbstractC5469l.m23025b(r9)
            w5.q r9 = p371w5.C6934q.f24811a
            return r9
        Lbb:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p126S.C2303g.mo7028d(java.lang.Object, z5.e):java.lang.Object");
    }
}
