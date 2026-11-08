package p126S;

import kotlin.jvm.internal.AbstractC5469l;
import p013B5.AbstractC0060d;
import p069J5.InterfaceC0789a;
import p112Q.InterfaceC1993n;
import p112Q.InterfaceC2003x;
import p198b6.AbstractC3558c;
import p198b6.InterfaceC3556a;
import p206c6.AbstractC3622j;
import p206c6.C3601M;
import p392z5.InterfaceC7157e;

/* renamed from: S.e */
/* loaded from: classes.dex */
public final class C2301e implements InterfaceC2003x {

    /* renamed from: a */
    public final AbstractC3622j f6972a;

    /* renamed from: b */
    public final C3601M f6973b;

    /* renamed from: c */
    public final InterfaceC2299c f6974c;

    /* renamed from: d */
    public final InterfaceC1993n f6975d;

    /* renamed from: e */
    public final InterfaceC0789a f6976e;

    /* renamed from: f */
    public final C2297a f6977f;

    /* renamed from: g */
    public final InterfaceC3556a f6978g;

    /* renamed from: S.e$a */
    public static final class a extends AbstractC0060d {

        /* renamed from: a */
        public Object f6979a;

        /* renamed from: b */
        public Object f6980b;

        /* renamed from: c */
        public boolean f6981c;

        /* renamed from: d */
        public /* synthetic */ Object f6982d;

        /* renamed from: f */
        public int f6984f;

        public a(InterfaceC7157e interfaceC7157e) {
            super(interfaceC7157e);
        }

        @Override // p013B5.AbstractC0057a
        public final Object invokeSuspend(Object obj) {
            this.f6982d = obj;
            this.f6984f |= Integer.MIN_VALUE;
            return C2301e.this.mo7128a(null, this);
        }
    }

    /* renamed from: S.e$b */
    public static final class b extends AbstractC0060d {

        /* renamed from: a */
        public Object f6985a;

        /* renamed from: b */
        public Object f6986b;

        /* renamed from: c */
        public Object f6987c;

        /* renamed from: d */
        public Object f6988d;

        /* renamed from: e */
        public /* synthetic */ Object f6989e;

        /* renamed from: n */
        public int f6991n;

        public b(InterfaceC7157e interfaceC7157e) {
            super(interfaceC7157e);
        }

        @Override // p013B5.AbstractC0057a
        public final Object invokeSuspend(Object obj) {
            this.f6989e = obj;
            this.f6991n |= Integer.MIN_VALUE;
            return C2301e.this.mo7130e(null, this);
        }
    }

    public C2301e(AbstractC3622j fileSystem, C3601M path, InterfaceC2299c serializer, InterfaceC1993n coordinator, InterfaceC0789a onClose) {
        AbstractC5469l.m23028e(fileSystem, "fileSystem");
        AbstractC5469l.m23028e(path, "path");
        AbstractC5469l.m23028e(serializer, "serializer");
        AbstractC5469l.m23028e(coordinator, "coordinator");
        AbstractC5469l.m23028e(onClose, "onClose");
        this.f6972a = fileSystem;
        this.f6973b = path;
        this.f6974c = serializer;
        this.f6975d = coordinator;
        this.f6976e = onClose;
        this.f6977f = new C2297a(false);
        this.f6978g = AbstractC3558c.m14354b(false, 1, null);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:(2:3|(8:5|6|7|(1:(3:10|11|12)(2:32|33))(6:34|35|36|37|38|(1:40)(1:41))|13|14|15|(2:(1:18)|19)(1:21)))|7|(0)(0)|13|14|15|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0072, code lost:
    
        r1 = th;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007d A[Catch: all -> 0x007e, TRY_ENTER, TRY_LEAVE, TryCatch #4 {all -> 0x007e, blocks: (B:21:0x007d, B:28:0x008e, B:31:0x008b, B:27:0x0086), top: B:7:0x0022, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /* JADX WARN: Type inference failed for: r0v11, types: [S.e] */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v2, types: [S.e$a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [S.e] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r10v0, types: [J5.q] */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v14, types: [boolean] */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v7 */
    @Override // p112Q.InterfaceC2003x
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object mo7128a(p069J5.InterfaceC0805q r10, p392z5.InterfaceC7157e r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof p126S.C2301e.a
            if (r0 == 0) goto L13
            r0 = r11
            S.e$a r0 = (p126S.C2301e.a) r0
            int r1 = r0.f6984f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f6984f = r1
            goto L18
        L13:
            S.e$a r0 = new S.e$a
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.f6982d
            java.lang.Object r1 = p006A5.AbstractC0024c.m76e()
            int r2 = r0.f6984f
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L3e
            if (r2 != r3) goto L36
            boolean r10 = r0.f6981c
            java.lang.Object r1 = r0.f6980b
            Q.b r1 = (p112Q.InterfaceC1981b) r1
            java.lang.Object r0 = r0.f6979a
            S.e r0 = (p126S.C2301e) r0
            p371w5.AbstractC6928k.m28382b(r11)     // Catch: java.lang.Throwable -> L34
            goto L6d
        L34:
            r11 = move-exception
            goto L86
        L36:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L3e:
            p371w5.AbstractC6928k.m28382b(r11)
            r9.m7816f()
            b6.a r11 = r9.f6978g
            boolean r11 = p198b6.InterfaceC3556a.a.m14337a(r11, r4, r3, r4)
            S.b r2 = new S.b     // Catch: java.lang.Throwable -> L8f
            c6.j r5 = r9.f6972a     // Catch: java.lang.Throwable -> L8f
            c6.M r6 = r9.f6973b     // Catch: java.lang.Throwable -> L8f
            S.c r7 = r9.f6974c     // Catch: java.lang.Throwable -> L8f
            r2.<init>(r5, r6, r7)     // Catch: java.lang.Throwable -> L8f
            java.lang.Boolean r5 = p013B5.AbstractC0058b.m149a(r11)     // Catch: java.lang.Throwable -> L80
            r0.f6979a = r9     // Catch: java.lang.Throwable -> L80
            r0.f6980b = r2     // Catch: java.lang.Throwable -> L80
            r0.f6981c = r11     // Catch: java.lang.Throwable -> L80
            r0.f6984f = r3     // Catch: java.lang.Throwable -> L80
            java.lang.Object r10 = r10.mo3350c(r2, r5, r0)     // Catch: java.lang.Throwable -> L80
            if (r10 != r1) goto L68
            return r1
        L68:
            r0 = r9
            r1 = r2
            r8 = r11
            r11 = r10
            r10 = r8
        L6d:
            r1.close()     // Catch: java.lang.Throwable -> L72
            r1 = r4
            goto L73
        L72:
            r1 = move-exception
        L73:
            if (r1 != 0) goto L7d
            if (r10 == 0) goto L7c
            b6.a r10 = r0.f6978g
            p198b6.InterfaceC3556a.a.m14338b(r10, r4, r3, r4)
        L7c:
            return r11
        L7d:
            throw r1     // Catch: java.lang.Throwable -> L7e
        L7e:
            r11 = move-exception
            goto L94
        L80:
            r10 = move-exception
            r0 = r9
            r1 = r2
            r8 = r11
            r11 = r10
            r10 = r8
        L86:
            r1.close()     // Catch: java.lang.Throwable -> L8a
            goto L8e
        L8a:
            r1 = move-exception
            p371w5.AbstractC6918a.m28362a(r11, r1)     // Catch: java.lang.Throwable -> L7e
        L8e:
            throw r11     // Catch: java.lang.Throwable -> L7e
        L8f:
            r10 = move-exception
            r0 = r9
            r8 = r11
            r11 = r10
            r10 = r8
        L94:
            if (r10 == 0) goto L9b
            b6.a r10 = r0.f6978g
            p198b6.InterfaceC3556a.a.m14338b(r10, r4, r3, r4)
        L9b:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: p126S.C2301e.mo7128a(J5.q, z5.e):java.lang.Object");
    }

    @Override // p112Q.InterfaceC2003x
    /* renamed from: b */
    public InterfaceC1993n mo7129b() {
        return this.f6975d;
    }

    @Override // p112Q.InterfaceC1981b
    public void close() {
        this.f6977f.m7797b(true);
        this.f6976e.invoke();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00cf A[Catch: all -> 0x00df, IOException -> 0x00e2, TRY_ENTER, TryCatch #2 {IOException -> 0x00e2, blocks: (B:19:0x00cf, B:21:0x00d7, B:26:0x00ef, B:33:0x00fe, B:36:0x00fb), top: B:7:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ef A[Catch: all -> 0x00df, IOException -> 0x00e2, TRY_ENTER, TRY_LEAVE, TryCatch #2 {IOException -> 0x00e2, blocks: (B:19:0x00cf, B:21:0x00d7, B:26:0x00ef, B:33:0x00fe, B:36:0x00fb), top: B:7:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    @Override // p112Q.InterfaceC2003x
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object mo7130e(p069J5.InterfaceC0804p r10, p392z5.InterfaceC7157e r11) {
        /*
            Method dump skipped, instructions count: 284
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p126S.C2301e.mo7130e(J5.p, z5.e):java.lang.Object");
    }

    /* renamed from: f */
    public final void m7816f() {
        if (this.f6977f.m7796a()) {
            throw new IllegalStateException("StorageConnection has already been disposed.");
        }
    }
}
