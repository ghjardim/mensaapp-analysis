package p174Y5;

import kotlin.jvm.internal.AbstractC5457A;
import p006A5.AbstractC0023b;
import p006A5.AbstractC0024c;
import p013B5.AbstractC0057a;
import p013B5.AbstractC0064h;
import p069J5.InterfaceC0804p;
import p132S5.AbstractC2323D0;
import p132S5.C2318B;
import p132S5.C2354T0;
import p167X5.AbstractC2850K;
import p167X5.C2842C;
import p371w5.AbstractC6928k;
import p371w5.C6927j;
import p392z5.InterfaceC7157e;
import p392z5.InterfaceC7161i;

/* renamed from: Y5.b */
/* loaded from: classes2.dex */
public abstract class AbstractC2957b {
    /* renamed from: a */
    public static final void m10659a(InterfaceC0804p interfaceC0804p, Object obj, InterfaceC7157e interfaceC7157e) {
        InterfaceC7157e m162a = AbstractC0064h.m162a(interfaceC7157e);
        try {
            InterfaceC7161i context = interfaceC7157e.getContext();
            Object m10280c = AbstractC2850K.m10280c(context, null);
            try {
                Object m75d = !(interfaceC0804p instanceof AbstractC0057a) ? AbstractC0023b.m75d(interfaceC0804p, obj, m162a) : ((InterfaceC0804p) AbstractC5457A.m23004b(interfaceC0804p, 2)).invoke(obj, m162a);
                AbstractC2850K.m10278a(context, m10280c);
                if (m75d != AbstractC0024c.m76e()) {
                    m162a.resumeWith(C6927j.m28373b(m75d));
                }
            } catch (Throwable th) {
                AbstractC2850K.m10278a(context, m10280c);
                throw th;
            }
        } catch (Throwable th2) {
            C6927j.a aVar = C6927j.f24803b;
            m162a.resumeWith(C6927j.m28373b(AbstractC6928k.m28381a(th2)));
        }
    }

    /* renamed from: b */
    public static final Object m10660b(C2842C c2842c, Object obj, InterfaceC0804p interfaceC0804p) {
        Object c2318b;
        try {
            c2318b = !(interfaceC0804p instanceof AbstractC0057a) ? AbstractC0023b.m75d(interfaceC0804p, obj, c2842c) : ((InterfaceC0804p) AbstractC5457A.m23004b(interfaceC0804p, 2)).invoke(obj, c2842c);
        } catch (Throwable th) {
            c2318b = new C2318B(th, false, 2, null);
        }
        if (c2318b == AbstractC0024c.m76e()) {
            return AbstractC0024c.m76e();
        }
        Object m7924n0 = c2842c.m7924n0(c2318b);
        if (m7924n0 == AbstractC2323D0.f7051b) {
            return AbstractC0024c.m76e();
        }
        if (m7924n0 instanceof C2318B) {
            throw ((C2318B) m7924n0).f7023a;
        }
        return AbstractC2323D0.m7968h(m7924n0);
    }

    /* renamed from: c */
    public static final Object m10661c(C2842C c2842c, Object obj, InterfaceC0804p interfaceC0804p) {
        Object c2318b;
        try {
            c2318b = !(interfaceC0804p instanceof AbstractC0057a) ? AbstractC0023b.m75d(interfaceC0804p, obj, c2842c) : ((InterfaceC0804p) AbstractC5457A.m23004b(interfaceC0804p, 2)).invoke(obj, c2842c);
        } catch (Throwable th) {
            c2318b = new C2318B(th, false, 2, null);
        }
        if (c2318b == AbstractC0024c.m76e()) {
            return AbstractC0024c.m76e();
        }
        Object m7924n0 = c2842c.m7924n0(c2318b);
        if (m7924n0 == AbstractC2323D0.f7051b) {
            return AbstractC0024c.m76e();
        }
        if (m7924n0 instanceof C2318B) {
            Throwable th2 = ((C2318B) m7924n0).f7023a;
            if (!(th2 instanceof C2354T0)) {
                throw th2;
            }
            if (((C2354T0) th2).f7085a != c2842c) {
                throw th2;
            }
            if (c2318b instanceof C2318B) {
                throw ((C2318B) c2318b).f7023a;
            }
        } else {
            c2318b = AbstractC2323D0.m7968h(m7924n0);
        }
        return c2318b;
    }
}
