package p058I1;

import kotlin.jvm.internal.AbstractC5469l;
import p069J5.InterfaceC0800l;
import p371w5.C6925h;
import p378x5.AbstractC7020k;

/* renamed from: I1.f */
/* loaded from: classes.dex */
public final class C0622f extends AbstractC0624h {

    /* renamed from: b */
    public final Object f2169b;

    /* renamed from: c */
    public final String f2170c;

    /* renamed from: d */
    public final String f2171d;

    /* renamed from: e */
    public final InterfaceC0623g f2172e;

    /* renamed from: f */
    public final EnumC0626j f2173f;

    /* renamed from: g */
    public final C0628l f2174g;

    /* renamed from: I1.f$a */
    public /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f2175a;

        static {
            int[] iArr = new int[EnumC0626j.values().length];
            try {
                iArr[EnumC0626j.STRICT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC0626j.LOG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC0626j.QUIET.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f2175a = iArr;
        }
    }

    public C0622f(Object value, String tag, String message, InterfaceC0623g logger, EnumC0626j verificationMode) {
        AbstractC5469l.m23028e(value, "value");
        AbstractC5469l.m23028e(tag, "tag");
        AbstractC5469l.m23028e(message, "message");
        AbstractC5469l.m23028e(logger, "logger");
        AbstractC5469l.m23028e(verificationMode, "verificationMode");
        this.f2169b = value;
        this.f2170c = tag;
        this.f2171d = message;
        this.f2172e = logger;
        this.f2173f = verificationMode;
        C0628l c0628l = new C0628l(m2520b(value, message));
        StackTraceElement[] stackTrace = c0628l.getStackTrace();
        AbstractC5469l.m23027d(stackTrace, "stackTrace");
        c0628l.setStackTrace((StackTraceElement[]) AbstractC7020k.m28843p(stackTrace, 2).toArray(new StackTraceElement[0]));
        this.f2174g = c0628l;
    }

    @Override // p058I1.AbstractC0624h
    /* renamed from: a */
    public Object mo2518a() {
        int i7 = a.f2175a[this.f2173f.ordinal()];
        if (i7 == 1) {
            throw this.f2174g;
        }
        if (i7 == 2) {
            this.f2172e.mo2499a(this.f2170c, m2520b(this.f2169b, this.f2171d));
            return null;
        }
        if (i7 == 3) {
            return null;
        }
        throw new C6925h();
    }

    @Override // p058I1.AbstractC0624h
    /* renamed from: c */
    public AbstractC0624h mo2519c(String message, InterfaceC0800l condition) {
        AbstractC5469l.m23028e(message, "message");
        AbstractC5469l.m23028e(condition, "condition");
        return this;
    }
}
