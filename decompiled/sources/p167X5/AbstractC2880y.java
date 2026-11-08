package p167X5;

import kotlin.jvm.internal.AbstractC5470m;
import p069J5.InterfaceC0800l;
import p132S5.AbstractC2332I;
import p371w5.AbstractC6918a;
import p371w5.C6934q;
import p392z5.InterfaceC7161i;

/* renamed from: X5.y */
/* loaded from: classes2.dex */
public abstract class AbstractC2880y {

    /* renamed from: X5.y$a */
    public static final class a extends AbstractC5470m implements InterfaceC0800l {

        /* renamed from: a */
        public final /* synthetic */ InterfaceC0800l f8867a;

        /* renamed from: b */
        public final /* synthetic */ Object f8868b;

        /* renamed from: c */
        public final /* synthetic */ InterfaceC7161i f8869c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC0800l interfaceC0800l, Object obj, InterfaceC7161i interfaceC7161i) {
            super(1);
            this.f8867a = interfaceC0800l;
            this.f8868b = obj;
            this.f8869c = interfaceC7161i;
        }

        /* renamed from: a */
        public final void m10399a(Throwable th) {
            AbstractC2880y.m10396b(this.f8867a, this.f8868b, this.f8869c);
        }

        @Override // p069J5.InterfaceC0800l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m10399a((Throwable) obj);
            return C6934q.f24811a;
        }
    }

    /* renamed from: a */
    public static final InterfaceC0800l m10395a(InterfaceC0800l interfaceC0800l, Object obj, InterfaceC7161i interfaceC7161i) {
        return new a(interfaceC0800l, obj, interfaceC7161i);
    }

    /* renamed from: b */
    public static final void m10396b(InterfaceC0800l interfaceC0800l, Object obj, InterfaceC7161i interfaceC7161i) {
        C2855P m10397c = m10397c(interfaceC0800l, obj, null);
        if (m10397c != null) {
            AbstractC2332I.m7992a(interfaceC7161i, m10397c);
        }
    }

    /* renamed from: c */
    public static final C2855P m10397c(InterfaceC0800l interfaceC0800l, Object obj, C2855P c2855p) {
        try {
            interfaceC0800l.invoke(obj);
        } catch (Throwable th) {
            if (c2855p == null || c2855p.getCause() == th) {
                return new C2855P("Exception in undelivered element handler for " + obj, th);
            }
            AbstractC6918a.m28362a(c2855p, th);
        }
        return c2855p;
    }

    /* renamed from: d */
    public static /* synthetic */ C2855P m10398d(InterfaceC0800l interfaceC0800l, Object obj, C2855P c2855p, int i7, Object obj2) {
        if ((i7 & 2) != 0) {
            c2855p = null;
        }
        return m10397c(interfaceC0800l, obj, c2855p);
    }
}
