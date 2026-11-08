package p153V5;

import kotlin.jvm.internal.C5480w;
import p013B5.AbstractC0060d;
import p160W5.C2725a;
import p392z5.InterfaceC7157e;

/* renamed from: V5.m */
/* loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC2640m {

    /* renamed from: V5.m$a */
    public static final class a implements InterfaceC2632e {

        /* renamed from: a */
        public final /* synthetic */ C5480w f7834a;

        public a(C5480w c5480w) {
            this.f7834a = c5480w;
        }

        @Override // p153V5.InterfaceC2632e
        /* renamed from: e */
        public Object mo2989e(Object obj, InterfaceC7157e interfaceC7157e) {
            this.f7834a.f19710a = obj;
            throw new C2725a(this);
        }
    }

    /* renamed from: V5.m$b */
    public static final class b extends AbstractC0060d {

        /* renamed from: a */
        public Object f7835a;

        /* renamed from: b */
        public Object f7836b;

        /* renamed from: c */
        public /* synthetic */ Object f7837c;

        /* renamed from: d */
        public int f7838d;

        public b(InterfaceC7157e interfaceC7157e) {
            super(interfaceC7157e);
        }

        @Override // p013B5.AbstractC0057a
        public final Object invokeSuspend(Object obj) {
            this.f7837c = obj;
            this.f7838d |= Integer.MIN_VALUE;
            return AbstractC2633f.m9060i(null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m9084a(p153V5.InterfaceC2631d r4, p392z5.InterfaceC7157e r5) {
        /*
            boolean r0 = r5 instanceof p153V5.AbstractC2640m.b
            if (r0 == 0) goto L13
            r0 = r5
            V5.m$b r0 = (p153V5.AbstractC2640m.b) r0
            int r1 = r0.f7838d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f7838d = r1
            goto L18
        L13:
            V5.m$b r0 = new V5.m$b
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f7837c
            java.lang.Object r1 = p006A5.AbstractC0024c.m76e()
            int r2 = r0.f7838d
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r4 = r0.f7836b
            V5.m$a r4 = (p153V5.AbstractC2640m.a) r4
            java.lang.Object r0 = r0.f7835a
            kotlin.jvm.internal.w r0 = (kotlin.jvm.internal.C5480w) r0
            p371w5.AbstractC6928k.m28382b(r5)     // Catch: p160W5.C2725a -> L31
            goto L5e
        L31:
            r5 = move-exception
            goto L5b
        L33:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L3b:
            p371w5.AbstractC6928k.m28382b(r5)
            kotlin.jvm.internal.w r5 = new kotlin.jvm.internal.w
            r5.<init>()
            V5.m$a r2 = new V5.m$a
            r2.<init>(r5)
            r0.f7835a = r5     // Catch: p160W5.C2725a -> L57
            r0.f7836b = r2     // Catch: p160W5.C2725a -> L57
            r0.f7838d = r3     // Catch: p160W5.C2725a -> L57
            java.lang.Object r4 = r4.mo7083a(r2, r0)     // Catch: p160W5.C2725a -> L57
            if (r4 != r1) goto L55
            return r1
        L55:
            r0 = r5
            goto L5e
        L57:
            r4 = move-exception
            r0 = r5
            r5 = r4
            r4 = r2
        L5b:
            p160W5.AbstractC2734j.m9361a(r5, r4)
        L5e:
            java.lang.Object r4 = r0.f19710a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p153V5.AbstractC2640m.m9084a(V5.d, z5.e):java.lang.Object");
    }
}
