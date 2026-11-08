package p006A5;

import kotlin.jvm.internal.AbstractC5457A;
import kotlin.jvm.internal.AbstractC5469l;
import p013B5.AbstractC0057a;
import p013B5.AbstractC0060d;
import p013B5.AbstractC0064h;
import p013B5.AbstractC0066j;
import p069J5.InterfaceC0804p;
import p371w5.AbstractC6928k;
import p392z5.C7162j;
import p392z5.InterfaceC7157e;
import p392z5.InterfaceC7161i;

/* renamed from: A5.b */
/* loaded from: classes2.dex */
public abstract class AbstractC0023b {

    /* renamed from: A5.b$a */
    public static final class a extends AbstractC0066j {

        /* renamed from: a */
        public int f137a;

        /* renamed from: b */
        public final /* synthetic */ InterfaceC0804p f138b;

        /* renamed from: c */
        public final /* synthetic */ Object f139c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC7157e interfaceC7157e, InterfaceC0804p interfaceC0804p, Object obj) {
            super(interfaceC7157e);
            this.f138b = interfaceC0804p;
            this.f139c = obj;
            AbstractC5469l.m23026c(interfaceC7157e, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        }

        @Override // p013B5.AbstractC0057a
        public Object invokeSuspend(Object obj) {
            int i7 = this.f137a;
            if (i7 == 0) {
                this.f137a = 1;
                AbstractC6928k.m28382b(obj);
                AbstractC5469l.m23026c(this.f138b, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted>, kotlin.Any?>");
                return ((InterfaceC0804p) AbstractC5457A.m23004b(this.f138b, 2)).invoke(this.f139c, this);
            }
            if (i7 != 1) {
                throw new IllegalStateException("This coroutine had already completed");
            }
            this.f137a = 2;
            AbstractC6928k.m28382b(obj);
            return obj;
        }
    }

    /* renamed from: A5.b$b */
    public static final class b extends AbstractC0060d {

        /* renamed from: a */
        public int f140a;

        /* renamed from: b */
        public final /* synthetic */ InterfaceC0804p f141b;

        /* renamed from: c */
        public final /* synthetic */ Object f142c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(InterfaceC7157e interfaceC7157e, InterfaceC7161i interfaceC7161i, InterfaceC0804p interfaceC0804p, Object obj) {
            super(interfaceC7157e, interfaceC7161i);
            this.f141b = interfaceC0804p;
            this.f142c = obj;
            AbstractC5469l.m23026c(interfaceC7157e, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        }

        @Override // p013B5.AbstractC0057a
        public Object invokeSuspend(Object obj) {
            int i7 = this.f140a;
            if (i7 == 0) {
                this.f140a = 1;
                AbstractC6928k.m28382b(obj);
                AbstractC5469l.m23026c(this.f141b, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted>, kotlin.Any?>");
                return ((InterfaceC0804p) AbstractC5457A.m23004b(this.f141b, 2)).invoke(this.f142c, this);
            }
            if (i7 != 1) {
                throw new IllegalStateException("This coroutine had already completed");
            }
            this.f140a = 2;
            AbstractC6928k.m28382b(obj);
            return obj;
        }
    }

    /* renamed from: A5.b$c */
    public static final class c extends AbstractC0066j {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(InterfaceC7157e interfaceC7157e) {
            super(interfaceC7157e);
            AbstractC5469l.m23026c(interfaceC7157e, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        }

        @Override // p013B5.AbstractC0057a
        public Object invokeSuspend(Object obj) {
            AbstractC6928k.m28382b(obj);
            return obj;
        }
    }

    /* renamed from: A5.b$d */
    public static final class d extends AbstractC0060d {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(InterfaceC7157e interfaceC7157e, InterfaceC7161i interfaceC7161i) {
            super(interfaceC7157e, interfaceC7161i);
            AbstractC5469l.m23026c(interfaceC7157e, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        }

        @Override // p013B5.AbstractC0057a
        public Object invokeSuspend(Object obj) {
            AbstractC6928k.m28382b(obj);
            return obj;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public static InterfaceC7157e m72a(InterfaceC0804p interfaceC0804p, Object obj, InterfaceC7157e completion) {
        AbstractC5469l.m23028e(interfaceC0804p, "<this>");
        AbstractC5469l.m23028e(completion, "completion");
        InterfaceC7157e m162a = AbstractC0064h.m162a(completion);
        if (interfaceC0804p instanceof AbstractC0057a) {
            return ((AbstractC0057a) interfaceC0804p).create(obj, m162a);
        }
        InterfaceC7161i context = m162a.getContext();
        return context == C7162j.f25439a ? new a(m162a, interfaceC0804p, obj) : new b(m162a, context, interfaceC0804p, obj);
    }

    /* renamed from: b */
    public static final InterfaceC7157e m73b(InterfaceC7157e interfaceC7157e) {
        InterfaceC7161i context = interfaceC7157e.getContext();
        return context == C7162j.f25439a ? new c(interfaceC7157e) : new d(interfaceC7157e, context);
    }

    /* renamed from: c */
    public static InterfaceC7157e m74c(InterfaceC7157e interfaceC7157e) {
        InterfaceC7157e intercepted;
        AbstractC5469l.m23028e(interfaceC7157e, "<this>");
        AbstractC0060d abstractC0060d = interfaceC7157e instanceof AbstractC0060d ? (AbstractC0060d) interfaceC7157e : null;
        return (abstractC0060d == null || (intercepted = abstractC0060d.intercepted()) == null) ? interfaceC7157e : intercepted;
    }

    /* renamed from: d */
    public static Object m75d(InterfaceC0804p interfaceC0804p, Object obj, InterfaceC7157e completion) {
        AbstractC5469l.m23028e(interfaceC0804p, "<this>");
        AbstractC5469l.m23028e(completion, "completion");
        return ((InterfaceC0804p) AbstractC5457A.m23004b(interfaceC0804p, 2)).invoke(obj, m73b(AbstractC0064h.m162a(completion)));
    }
}
