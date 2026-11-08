package p125R5;

import kotlin.jvm.internal.AbstractC5469l;
import p069J5.InterfaceC0800l;

/* renamed from: R5.g */
/* loaded from: classes2.dex */
public abstract class AbstractC2281g {
    /* renamed from: a */
    public static void m7725a(Appendable appendable, Object obj, InterfaceC0800l interfaceC0800l) {
        AbstractC5469l.m23028e(appendable, "<this>");
        if (interfaceC0800l != null) {
            appendable.append((CharSequence) interfaceC0800l.invoke(obj));
            return;
        }
        if (obj == null ? true : obj instanceof CharSequence) {
            appendable.append((CharSequence) obj);
        } else if (obj instanceof Character) {
            appendable.append(((Character) obj).charValue());
        } else {
            appendable.append(obj.toString());
        }
    }
}
