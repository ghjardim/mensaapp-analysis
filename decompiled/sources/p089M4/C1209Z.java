package p089M4;

import android.util.Log;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC5469l;
import p378x5.AbstractC7002B;
import p378x5.AbstractC7020k;
import p378x5.AbstractC7023n;
import p378x5.AbstractC7024o;

/* renamed from: M4.Z */
/* loaded from: classes2.dex */
public final class C1209Z {

    /* renamed from: a */
    public static final C1209Z f3869a = new C1209Z();

    /* renamed from: a */
    public final boolean m4686a(Object obj, Object obj2) {
        if ((obj instanceof byte[]) && (obj2 instanceof byte[])) {
            return Arrays.equals((byte[]) obj, (byte[]) obj2);
        }
        if ((obj instanceof int[]) && (obj2 instanceof int[])) {
            return Arrays.equals((int[]) obj, (int[]) obj2);
        }
        if ((obj instanceof long[]) && (obj2 instanceof long[])) {
            return Arrays.equals((long[]) obj, (long[]) obj2);
        }
        if ((obj instanceof double[]) && (obj2 instanceof double[])) {
            return Arrays.equals((double[]) obj, (double[]) obj2);
        }
        if ((obj instanceof Object[]) && (obj2 instanceof Object[])) {
            Object[] objArr = (Object[]) obj;
            Object[] objArr2 = (Object[]) obj2;
            if (objArr.length != objArr2.length) {
                return false;
            }
            Iterable m28847t = AbstractC7020k.m28847t(objArr);
            if (!(m28847t instanceof Collection) || !((Collection) m28847t).isEmpty()) {
                Iterator it = m28847t.iterator();
                while (it.hasNext()) {
                    int mo5523a = ((AbstractC7002B) it).mo5523a();
                    if (!f3869a.m4686a(objArr[mo5523a], objArr2[mo5523a])) {
                        return false;
                    }
                }
            }
            return true;
        }
        if ((obj instanceof List) && (obj2 instanceof List)) {
            List list = (List) obj;
            List list2 = (List) obj2;
            if (list.size() != list2.size()) {
                return false;
            }
            Iterable m28862h = AbstractC7024o.m28862h((Collection) obj);
            if (!(m28862h instanceof Collection) || !((Collection) m28862h).isEmpty()) {
                Iterator it2 = m28862h.iterator();
                while (it2.hasNext()) {
                    int mo5523a2 = ((AbstractC7002B) it2).mo5523a();
                    if (!f3869a.m4686a(list.get(mo5523a2), list2.get(mo5523a2))) {
                        return false;
                    }
                }
            }
            return true;
        }
        if (!(obj instanceof Map) || !(obj2 instanceof Map)) {
            return AbstractC5469l.m23024a(obj, obj2);
        }
        Map map = (Map) obj;
        Map map2 = (Map) obj2;
        if (map.size() != map2.size()) {
            return false;
        }
        if (!map.isEmpty()) {
            for (Map.Entry entry : map.entrySet()) {
                if (!map2.containsKey(entry.getKey()) || !f3869a.m4686a(entry.getValue(), map2.get(entry.getKey()))) {
                    return false;
                }
            }
        }
        return true;
    }

    /* renamed from: b */
    public final List m4687b(Throwable exception) {
        AbstractC5469l.m23028e(exception, "exception");
        if (exception instanceof C1235z) {
            C1235z c1235z = (C1235z) exception;
            return AbstractC7024o.m28864j(c1235z.m4740a(), c1235z.getMessage(), c1235z.m4741b());
        }
        return AbstractC7024o.m28864j(exception.getClass().getSimpleName(), exception.toString(), "Cause: " + exception.getCause() + ", Stacktrace: " + Log.getStackTraceString(exception));
    }

    /* renamed from: c */
    public final List m4688c(Object obj) {
        return AbstractC7023n.m28856b(obj);
    }
}
