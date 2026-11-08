package p126S;

import kotlin.jvm.internal.AbstractC5469l;
import p013B5.AbstractC0060d;
import p112Q.InterfaceC1997r;
import p206c6.AbstractC3622j;
import p206c6.C3601M;
import p392z5.InterfaceC7157e;

/* renamed from: S.b */
/* loaded from: classes.dex */
public class C2298b implements InterfaceC1997r {

    /* renamed from: a */
    public final AbstractC3622j f6952a;

    /* renamed from: b */
    public final C3601M f6953b;

    /* renamed from: c */
    public final InterfaceC2299c f6954c;

    /* renamed from: d */
    public final C2297a f6955d;

    /* renamed from: S.b$a */
    public static final class a extends AbstractC0060d {

        /* renamed from: a */
        public Object f6956a;

        /* renamed from: b */
        public Object f6957b;

        /* renamed from: c */
        public /* synthetic */ Object f6958c;

        /* renamed from: e */
        public int f6960e;

        public a(InterfaceC7157e interfaceC7157e) {
            super(interfaceC7157e);
        }

        @Override // p013B5.AbstractC0057a
        public final Object invokeSuspend(Object obj) {
            this.f6958c = obj;
            this.f6960e |= Integer.MIN_VALUE;
            return C2298b.m7798j(C2298b.this, this);
        }
    }

    public C2298b(AbstractC3622j fileSystem, C3601M path, InterfaceC2299c serializer) {
        AbstractC5469l.m23028e(fileSystem, "fileSystem");
        AbstractC5469l.m23028e(path, "path");
        AbstractC5469l.m23028e(serializer, "serializer");
        this.f6952a = fileSystem;
        this.f6953b = path;
        this.f6954c = serializer;
        this.f6955d = new C2297a(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00bf A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00cb A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0090 A[Catch: FileNotFoundException -> 0x008a, TryCatch #8 {FileNotFoundException -> 0x008a, blocks: (B:40:0x0090, B:42:0x0094, B:55:0x0086, B:52:0x0081), top: B:51:0x0081, inners: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0094 A[Catch: FileNotFoundException -> 0x008a, TRY_LEAVE, TryCatch #8 {FileNotFoundException -> 0x008a, blocks: (B:40:0x0090, B:42:0x0094, B:55:0x0086, B:52:0x0081), top: B:51:0x0081, inners: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0072 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0081 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ java.lang.Object m7798j(p126S.C2298b r7, p392z5.InterfaceC7157e r8) {
        /*
            Method dump skipped, instructions count: 229
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p126S.C2298b.m7798j(S.b, z5.e):java.lang.Object");
    }

    @Override // p112Q.InterfaceC1997r
    /* renamed from: c */
    public Object mo7115c(InterfaceC7157e interfaceC7157e) {
        return m7798j(this, interfaceC7157e);
    }

    @Override // p112Q.InterfaceC1981b
    public void close() {
        this.f6955d.m7797b(true);
    }

    /* renamed from: f */
    public final void m7799f() {
        if (this.f6955d.m7796a()) {
            throw new IllegalStateException("This scope has already been closed.");
        }
    }

    /* renamed from: g */
    public final AbstractC3622j m7800g() {
        return this.f6952a;
    }

    /* renamed from: h */
    public final C3601M m7801h() {
        return this.f6953b;
    }

    /* renamed from: i */
    public final InterfaceC2299c m7802i() {
        return this.f6954c;
    }
}
