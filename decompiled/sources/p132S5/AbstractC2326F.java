package p132S5;

import kotlin.jvm.internal.AbstractC5470m;
import kotlin.jvm.internal.C5480w;
import p013B5.InterfaceC0061e;
import p069J5.InterfaceC0804p;
import p392z5.C7162j;
import p392z5.InterfaceC7157e;
import p392z5.InterfaceC7158f;
import p392z5.InterfaceC7161i;

/* renamed from: S5.F */
/* loaded from: classes2.dex */
public abstract class AbstractC2326F {

    /* renamed from: S5.F$a */
    public static final class a extends AbstractC5470m implements InterfaceC0804p {

        /* renamed from: a */
        public static final a f7058a = new a();

        public a() {
            super(2);
        }

        @Override // p069J5.InterfaceC0804p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC7161i invoke(InterfaceC7161i interfaceC7161i, InterfaceC7161i.b bVar) {
            return interfaceC7161i.plus(bVar);
        }
    }

    /* renamed from: S5.F$b */
    public static final class b extends AbstractC5470m implements InterfaceC0804p {

        /* renamed from: a */
        public final /* synthetic */ C5480w f7059a;

        /* renamed from: b */
        public final /* synthetic */ boolean f7060b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C5480w c5480w, boolean z6) {
            super(2);
            this.f7059a = c5480w;
            this.f7060b = z6;
        }

        @Override // p069J5.InterfaceC0804p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC7161i invoke(InterfaceC7161i interfaceC7161i, InterfaceC7161i.b bVar) {
            return interfaceC7161i.plus(bVar);
        }
    }

    /* renamed from: S5.F$c */
    public static final class c extends AbstractC5470m implements InterfaceC0804p {

        /* renamed from: a */
        public static final c f7061a = new c();

        public c() {
            super(2);
        }

        /* renamed from: a */
        public final Boolean m7982a(boolean z6, InterfaceC7161i.b bVar) {
            return Boolean.valueOf(z6);
        }

        @Override // p069J5.InterfaceC0804p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return m7982a(((Boolean) obj).booleanValue(), (InterfaceC7161i.b) obj2);
        }
    }

    /* renamed from: a */
    public static final InterfaceC7161i m7973a(InterfaceC7161i interfaceC7161i, InterfaceC7161i interfaceC7161i2, boolean z6) {
        boolean m7975c = m7975c(interfaceC7161i);
        boolean m7975c2 = m7975c(interfaceC7161i2);
        if (!m7975c && !m7975c2) {
            return interfaceC7161i.plus(interfaceC7161i2);
        }
        C5480w c5480w = new C5480w();
        c5480w.f19710a = interfaceC7161i2;
        C7162j c7162j = C7162j.f25439a;
        InterfaceC7161i interfaceC7161i3 = (InterfaceC7161i) interfaceC7161i.fold(c7162j, new b(c5480w, z6));
        if (m7975c2) {
            c5480w.f19710a = ((InterfaceC7161i) c5480w.f19710a).fold(c7162j, a.f7058a);
        }
        return interfaceC7161i3.plus((InterfaceC7161i) c5480w.f19710a);
    }

    /* renamed from: b */
    public static final String m7974b(InterfaceC7161i interfaceC7161i) {
        return null;
    }

    /* renamed from: c */
    public static final boolean m7975c(InterfaceC7161i interfaceC7161i) {
        return ((Boolean) interfaceC7161i.fold(Boolean.FALSE, c.f7061a)).booleanValue();
    }

    /* renamed from: d */
    public static final InterfaceC7161i m7976d(InterfaceC2334J interfaceC2334J, InterfaceC7161i interfaceC7161i) {
        InterfaceC7161i m7973a = m7973a(interfaceC2334J.mo7995l(), interfaceC7161i, true);
        return (m7973a == C2363Y.m8053a() || m7973a.get(InterfaceC7158f.f25437m) != null) ? m7973a : m7973a.plus(C2363Y.m8053a());
    }

    /* renamed from: e */
    public static final InterfaceC7161i m7977e(InterfaceC7161i interfaceC7161i, InterfaceC7161i interfaceC7161i2) {
        return !m7975c(interfaceC7161i2) ? interfaceC7161i.plus(interfaceC7161i2) : m7973a(interfaceC7161i, interfaceC7161i2, false);
    }

    /* renamed from: f */
    public static final C2362X0 m7978f(InterfaceC0061e interfaceC0061e) {
        while (!(interfaceC0061e instanceof C2357V) && (interfaceC0061e = interfaceC0061e.getCallerFrame()) != null) {
            if (interfaceC0061e instanceof C2362X0) {
                return (C2362X0) interfaceC0061e;
            }
        }
        return null;
    }

    /* renamed from: g */
    public static final C2362X0 m7979g(InterfaceC7157e interfaceC7157e, InterfaceC7161i interfaceC7161i, Object obj) {
        if (!(interfaceC7157e instanceof InterfaceC0061e) || interfaceC7161i.get(C2364Y0.f7095a) == null) {
            return null;
        }
        C2362X0 m7978f = m7978f((InterfaceC0061e) interfaceC7157e);
        if (m7978f != null) {
            m7978f.m8052S0(interfaceC7161i, obj);
        }
        return m7978f;
    }
}
