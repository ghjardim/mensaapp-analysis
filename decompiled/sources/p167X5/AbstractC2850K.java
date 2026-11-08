package p167X5;

import kotlin.jvm.internal.AbstractC5469l;
import kotlin.jvm.internal.AbstractC5470m;
import p069J5.InterfaceC0804p;
import p132S5.InterfaceC2350R0;
import p392z5.InterfaceC7161i;

/* renamed from: X5.K */
/* loaded from: classes2.dex */
public abstract class AbstractC2850K {

    /* renamed from: a */
    public static final C2846G f8812a = new C2846G("NO_THREAD_ELEMENTS");

    /* renamed from: b */
    public static final InterfaceC0804p f8813b = a.f8816a;

    /* renamed from: c */
    public static final InterfaceC0804p f8814c = b.f8817a;

    /* renamed from: d */
    public static final InterfaceC0804p f8815d = c.f8818a;

    /* renamed from: X5.K$a */
    public static final class a extends AbstractC5470m implements InterfaceC0804p {

        /* renamed from: a */
        public static final a f8816a = new a();

        public a() {
            super(2);
        }

        @Override // p069J5.InterfaceC0804p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object obj, InterfaceC7161i.b bVar) {
            if (!(bVar instanceof InterfaceC2350R0)) {
                return obj;
            }
            Integer num = obj instanceof Integer ? (Integer) obj : null;
            int intValue = num != null ? num.intValue() : 1;
            return intValue == 0 ? bVar : Integer.valueOf(intValue + 1);
        }
    }

    /* renamed from: X5.K$b */
    public static final class b extends AbstractC5470m implements InterfaceC0804p {

        /* renamed from: a */
        public static final b f8817a = new b();

        public b() {
            super(2);
        }

        @Override // p069J5.InterfaceC0804p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC2350R0 invoke(InterfaceC2350R0 interfaceC2350R0, InterfaceC7161i.b bVar) {
            if (interfaceC2350R0 != null) {
                return interfaceC2350R0;
            }
            if (bVar instanceof InterfaceC2350R0) {
                return (InterfaceC2350R0) bVar;
            }
            return null;
        }
    }

    /* renamed from: X5.K$c */
    public static final class c extends AbstractC5470m implements InterfaceC0804p {

        /* renamed from: a */
        public static final c f8818a = new c();

        public c() {
            super(2);
        }

        @Override // p069J5.InterfaceC0804p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C2854O invoke(C2854O c2854o, InterfaceC7161i.b bVar) {
            if (bVar instanceof InterfaceC2350R0) {
                InterfaceC2350R0 interfaceC2350R0 = (InterfaceC2350R0) bVar;
                c2854o.m10299a(interfaceC2350R0, interfaceC2350R0.m8022h(c2854o.f8821a));
            }
            return c2854o;
        }
    }

    /* renamed from: a */
    public static final void m10278a(InterfaceC7161i interfaceC7161i, Object obj) {
        if (obj == f8812a) {
            return;
        }
        if (obj instanceof C2854O) {
            ((C2854O) obj).m10300b(interfaceC7161i);
            return;
        }
        Object fold = interfaceC7161i.fold(null, f8814c);
        AbstractC5469l.m23026c(fold, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        ((InterfaceC2350R0) fold).m8021c(interfaceC7161i, obj);
    }

    /* renamed from: b */
    public static final Object m10279b(InterfaceC7161i interfaceC7161i) {
        Object fold = interfaceC7161i.fold(0, f8813b);
        AbstractC5469l.m23025b(fold);
        return fold;
    }

    /* renamed from: c */
    public static final Object m10280c(InterfaceC7161i interfaceC7161i, Object obj) {
        if (obj == null) {
            obj = m10279b(interfaceC7161i);
        }
        if (obj == 0) {
            return f8812a;
        }
        if (obj instanceof Integer) {
            return interfaceC7161i.fold(new C2854O(interfaceC7161i, ((Number) obj).intValue()), f8815d);
        }
        AbstractC5469l.m23026c(obj, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        return ((InterfaceC2350R0) obj).m8022h(interfaceC7161i);
    }
}
