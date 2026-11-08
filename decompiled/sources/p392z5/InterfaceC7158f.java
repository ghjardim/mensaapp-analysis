package p392z5;

import kotlin.jvm.internal.AbstractC5469l;
import p392z5.InterfaceC7161i;

/* renamed from: z5.f */
/* loaded from: classes2.dex */
public interface InterfaceC7158f extends InterfaceC7161i.b {

    /* renamed from: m */
    public static final b f25437m = b.f25438a;

    /* renamed from: z5.f$a */
    public static final class a {
        /* renamed from: a */
        public static InterfaceC7161i.b m29470a(InterfaceC7158f interfaceC7158f, InterfaceC7161i.c key) {
            AbstractC5469l.m23028e(key, "key");
            if (!(key instanceof AbstractC7154b)) {
                if (InterfaceC7158f.f25437m != key) {
                    return null;
                }
                AbstractC5469l.m23026c(interfaceC7158f, "null cannot be cast to non-null type E of kotlin.coroutines.ContinuationInterceptor.get");
                return interfaceC7158f;
            }
            AbstractC7154b abstractC7154b = (AbstractC7154b) key;
            if (!abstractC7154b.m29464a(interfaceC7158f.getKey())) {
                return null;
            }
            InterfaceC7161i.b m29465b = abstractC7154b.m29465b(interfaceC7158f);
            if (m29465b instanceof InterfaceC7161i.b) {
                return m29465b;
            }
            return null;
        }

        /* renamed from: b */
        public static InterfaceC7161i m29471b(InterfaceC7158f interfaceC7158f, InterfaceC7161i.c key) {
            AbstractC5469l.m23028e(key, "key");
            if (!(key instanceof AbstractC7154b)) {
                return InterfaceC7158f.f25437m == key ? C7162j.f25439a : interfaceC7158f;
            }
            AbstractC7154b abstractC7154b = (AbstractC7154b) key;
            return (!abstractC7154b.m29464a(interfaceC7158f.getKey()) || abstractC7154b.m29465b(interfaceC7158f) == null) ? interfaceC7158f : C7162j.f25439a;
        }
    }

    /* renamed from: z5.f$b */
    public static final class b implements InterfaceC7161i.c {

        /* renamed from: a */
        public static final /* synthetic */ b f25438a = new b();
    }

    /* renamed from: j */
    void mo7986j(InterfaceC7157e interfaceC7157e);

    /* renamed from: m */
    InterfaceC7157e mo7987m(InterfaceC7157e interfaceC7157e);
}
