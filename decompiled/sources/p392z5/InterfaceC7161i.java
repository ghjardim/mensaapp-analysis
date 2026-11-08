package p392z5;

import kotlin.jvm.internal.AbstractC5469l;
import p069J5.InterfaceC0804p;
import p392z5.InterfaceC7158f;
import p392z5.InterfaceC7161i;

/* renamed from: z5.i */
/* loaded from: classes2.dex */
public interface InterfaceC7161i {

    /* renamed from: z5.i$a */
    public static final class a {
        /* renamed from: b */
        public static InterfaceC7161i m29474b(InterfaceC7161i interfaceC7161i, InterfaceC7161i context) {
            AbstractC5469l.m23028e(context, "context");
            return context == C7162j.f25439a ? interfaceC7161i : (InterfaceC7161i) context.fold(interfaceC7161i, new InterfaceC0804p() { // from class: z5.h
                @Override // p069J5.InterfaceC0804p
                public final Object invoke(Object obj, Object obj2) {
                    InterfaceC7161i m29475c;
                    m29475c = InterfaceC7161i.a.m29475c((InterfaceC7161i) obj, (InterfaceC7161i.b) obj2);
                    return m29475c;
                }
            });
        }

        /* renamed from: c */
        public static InterfaceC7161i m29475c(InterfaceC7161i acc, b element) {
            C7156d c7156d;
            AbstractC5469l.m23028e(acc, "acc");
            AbstractC5469l.m23028e(element, "element");
            InterfaceC7161i minusKey = acc.minusKey(element.getKey());
            C7162j c7162j = C7162j.f25439a;
            if (minusKey == c7162j) {
                return element;
            }
            InterfaceC7158f.b bVar = InterfaceC7158f.f25437m;
            InterfaceC7158f interfaceC7158f = (InterfaceC7158f) minusKey.get(bVar);
            if (interfaceC7158f == null) {
                c7156d = new C7156d(minusKey, element);
            } else {
                InterfaceC7161i minusKey2 = minusKey.minusKey(bVar);
                if (minusKey2 == c7162j) {
                    return new C7156d(element, interfaceC7158f);
                }
                c7156d = new C7156d(new C7156d(minusKey2, element), interfaceC7158f);
            }
            return c7156d;
        }
    }

    /* renamed from: z5.i$b */
    public interface b extends InterfaceC7161i {

        /* renamed from: z5.i$b$a */
        public static final class a {
            /* renamed from: a */
            public static Object m29476a(b bVar, Object obj, InterfaceC0804p operation) {
                AbstractC5469l.m23028e(operation, "operation");
                return operation.invoke(obj, bVar);
            }

            /* renamed from: b */
            public static b m29477b(b bVar, c key) {
                AbstractC5469l.m23028e(key, "key");
                if (!AbstractC5469l.m23024a(bVar.getKey(), key)) {
                    return null;
                }
                AbstractC5469l.m23026c(bVar, "null cannot be cast to non-null type E of kotlin.coroutines.CoroutineContext.Element.get");
                return bVar;
            }

            /* renamed from: c */
            public static InterfaceC7161i m29478c(b bVar, c key) {
                AbstractC5469l.m23028e(key, "key");
                return AbstractC5469l.m23024a(bVar.getKey(), key) ? C7162j.f25439a : bVar;
            }

            /* renamed from: d */
            public static InterfaceC7161i m29479d(b bVar, InterfaceC7161i context) {
                AbstractC5469l.m23028e(context, "context");
                return a.m29474b(bVar, context);
            }
        }

        @Override // p392z5.InterfaceC7161i
        Object fold(Object obj, InterfaceC0804p interfaceC0804p);

        @Override // p392z5.InterfaceC7161i
        b get(c cVar);

        c getKey();

        @Override // p392z5.InterfaceC7161i
        InterfaceC7161i minusKey(c cVar);
    }

    /* renamed from: z5.i$c */
    public interface c {
    }

    Object fold(Object obj, InterfaceC0804p interfaceC0804p);

    b get(c cVar);

    InterfaceC7161i minusKey(c cVar);

    InterfaceC7161i plus(InterfaceC7161i interfaceC7161i);
}
