package p079L1;

import android.app.Activity;
import kotlin.jvm.internal.AbstractC5469l;
import kotlin.jvm.internal.AbstractC5470m;
import p006A5.AbstractC0024c;
import p013B5.AbstractC0068l;
import p042G.InterfaceC0339a;
import p069J5.InterfaceC0789a;
import p069J5.InterfaceC0804p;
import p079L1.C0900i;
import p086M1.InterfaceC1145a;
import p132S5.C2363Y;
import p146U5.AbstractC2598p;
import p146U5.InterfaceC2600r;
import p153V5.AbstractC2633f;
import p153V5.InterfaceC2631d;
import p371w5.AbstractC6928k;
import p371w5.C6934q;
import p381y1.ExecutorC7060k;
import p392z5.InterfaceC7157e;

/* renamed from: L1.i */
/* loaded from: classes.dex */
public final class C0900i implements InterfaceC0897f {

    /* renamed from: b */
    public final InterfaceC0904m f3140b;

    /* renamed from: c */
    public final InterfaceC1145a f3141c;

    /* renamed from: L1.i$a */
    public static final class a extends AbstractC0068l implements InterfaceC0804p {

        /* renamed from: a */
        public int f3142a;

        /* renamed from: b */
        public /* synthetic */ Object f3143b;

        /* renamed from: d */
        public final /* synthetic */ Activity f3145d;

        /* renamed from: L1.i$a$a, reason: collision with other inner class name */
        public static final class C7176a extends AbstractC5470m implements InterfaceC0789a {

            /* renamed from: a */
            public final /* synthetic */ C0900i f3146a;

            /* renamed from: b */
            public final /* synthetic */ InterfaceC0339a f3147b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C7176a(C0900i c0900i, InterfaceC0339a interfaceC0339a) {
                super(0);
                this.f3146a = c0900i;
                this.f3147b = interfaceC0339a;
            }

            /* renamed from: a */
            public final void m3755a() {
                this.f3146a.f3141c.mo4430a(this.f3147b);
            }

            @Override // p069J5.InterfaceC0789a
            public /* bridge */ /* synthetic */ Object invoke() {
                m3755a();
                return C6934q.f24811a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Activity activity, InterfaceC7157e interfaceC7157e) {
            super(2, interfaceC7157e);
            this.f3145d = activity;
        }

        /* renamed from: h */
        public static final void m3753h(InterfaceC2600r interfaceC2600r, C0901j c0901j) {
            interfaceC2600r.mo8787p(c0901j);
        }

        @Override // p013B5.AbstractC0057a
        public final InterfaceC7157e create(Object obj, InterfaceC7157e interfaceC7157e) {
            a aVar = C0900i.this.new a(this.f3145d, interfaceC7157e);
            aVar.f3143b = obj;
            return aVar;
        }

        @Override // p069J5.InterfaceC0804p
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC2600r interfaceC2600r, InterfaceC7157e interfaceC7157e) {
            return ((a) create(interfaceC2600r, interfaceC7157e)).invokeSuspend(C6934q.f24811a);
        }

        @Override // p013B5.AbstractC0057a
        public final Object invokeSuspend(Object obj) {
            Object m76e = AbstractC0024c.m76e();
            int i7 = this.f3142a;
            if (i7 == 0) {
                AbstractC6928k.m28382b(obj);
                final InterfaceC2600r interfaceC2600r = (InterfaceC2600r) this.f3143b;
                InterfaceC0339a interfaceC0339a = new InterfaceC0339a() { // from class: L1.h
                    @Override // p042G.InterfaceC0339a
                    public final void accept(Object obj2) {
                        C0900i.a.m3753h(InterfaceC2600r.this, (C0901j) obj2);
                    }
                };
                C0900i.this.f3141c.mo4431b(this.f3145d, new ExecutorC7060k(), interfaceC0339a);
                C7176a c7176a = new C7176a(C0900i.this, interfaceC0339a);
                this.f3142a = 1;
                if (AbstractC2598p.m8878a(interfaceC2600r, c7176a, this) == m76e) {
                    return m76e;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC6928k.m28382b(obj);
            }
            return C6934q.f24811a;
        }
    }

    public C0900i(InterfaceC0904m windowMetricsCalculator, InterfaceC1145a windowBackend) {
        AbstractC5469l.m23028e(windowMetricsCalculator, "windowMetricsCalculator");
        AbstractC5469l.m23028e(windowBackend, "windowBackend");
        this.f3140b = windowMetricsCalculator;
        this.f3141c = windowBackend;
    }

    @Override // p079L1.InterfaceC0897f
    /* renamed from: a */
    public InterfaceC2631d mo3440a(Activity activity) {
        AbstractC5469l.m23028e(activity, "activity");
        return AbstractC2633f.m9062k(AbstractC2633f.m9054c(new a(activity, null)), C2363Y.m8055c());
    }
}
