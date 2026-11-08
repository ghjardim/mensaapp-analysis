package p058I1;

import kotlin.jvm.internal.AbstractC5464g;
import kotlin.jvm.internal.AbstractC5469l;
import p069J5.InterfaceC0800l;

/* renamed from: I1.h */
/* loaded from: classes.dex */
public abstract class AbstractC0624h {

    /* renamed from: a */
    public static final a f2176a = new a(null);

    /* renamed from: I1.h$a */
    public static final class a {
        public /* synthetic */ a(AbstractC5464g abstractC5464g) {
            this();
        }

        /* renamed from: b */
        public static /* synthetic */ AbstractC0624h m2521b(a aVar, Object obj, String str, EnumC0626j enumC0626j, InterfaceC0623g interfaceC0623g, int i7, Object obj2) {
            if ((i7 & 2) != 0) {
                enumC0626j = C0619c.f2159a.m2506a();
            }
            if ((i7 & 4) != 0) {
                interfaceC0623g = C0617a.f2154a;
            }
            return aVar.m2522a(obj, str, enumC0626j, interfaceC0623g);
        }

        /* renamed from: a */
        public final AbstractC0624h m2522a(Object obj, String tag, EnumC0626j verificationMode, InterfaceC0623g logger) {
            AbstractC5469l.m23028e(obj, "<this>");
            AbstractC5469l.m23028e(tag, "tag");
            AbstractC5469l.m23028e(verificationMode, "verificationMode");
            AbstractC5469l.m23028e(logger, "logger");
            return new C0625i(obj, tag, verificationMode, logger);
        }

        public a() {
        }
    }

    /* renamed from: a */
    public abstract Object mo2518a();

    /* renamed from: b */
    public final String m2520b(Object value, String message) {
        AbstractC5469l.m23028e(value, "value");
        AbstractC5469l.m23028e(message, "message");
        return message + " value: " + value;
    }

    /* renamed from: c */
    public abstract AbstractC0624h mo2519c(String str, InterfaceC0800l interfaceC0800l);
}
