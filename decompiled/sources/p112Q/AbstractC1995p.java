package p112Q;

import kotlin.jvm.internal.AbstractC5464g;
import kotlin.jvm.internal.AbstractC5469l;
import p069J5.InterfaceC0804p;
import p132S5.InterfaceC2412w;
import p392z5.InterfaceC7161i;

/* renamed from: Q.p */
/* loaded from: classes.dex */
public abstract class AbstractC1995p {

    /* renamed from: Q.p$a */
    public static final class a extends AbstractC1995p {

        /* renamed from: a */
        public final InterfaceC0804p f6158a;

        /* renamed from: b */
        public final InterfaceC2412w f6159b;

        /* renamed from: c */
        public final AbstractC2001v f6160c;

        /* renamed from: d */
        public final InterfaceC7161i f6161d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC0804p transform, InterfaceC2412w ack, AbstractC2001v abstractC2001v, InterfaceC7161i callerContext) {
            super(null);
            AbstractC5469l.m23028e(transform, "transform");
            AbstractC5469l.m23028e(ack, "ack");
            AbstractC5469l.m23028e(callerContext, "callerContext");
            this.f6158a = transform;
            this.f6159b = ack;
            this.f6160c = abstractC2001v;
            this.f6161d = callerContext;
        }

        /* renamed from: a */
        public final InterfaceC2412w m7110a() {
            return this.f6159b;
        }

        /* renamed from: b */
        public final InterfaceC7161i m7111b() {
            return this.f6161d;
        }

        /* renamed from: c */
        public AbstractC2001v m7112c() {
            return this.f6160c;
        }

        /* renamed from: d */
        public final InterfaceC0804p m7113d() {
            return this.f6158a;
        }
    }

    public /* synthetic */ AbstractC1995p(AbstractC5464g abstractC5464g) {
        this();
    }

    public AbstractC1995p() {
    }
}
