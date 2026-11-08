package p167X5;

import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC5464g;
import kotlin.jvm.internal.AbstractC5469l;

/* renamed from: X5.m */
/* loaded from: classes2.dex */
public abstract class AbstractC2868m {
    /* renamed from: b */
    public static /* synthetic */ Object m10339b(Object obj, int i7, AbstractC5464g abstractC5464g) {
        if ((i7 & 1) != 0) {
            obj = null;
        }
        return m10338a(obj);
    }

    /* renamed from: c */
    public static final Object m10340c(Object obj, Object obj2) {
        if (obj == null) {
            return m10338a(obj2);
        }
        if (obj instanceof ArrayList) {
            AbstractC5469l.m23026c(obj, "null cannot be cast to non-null type java.util.ArrayList<E of kotlinx.coroutines.internal.InlineList>{ kotlin.collections.TypeAliasesKt.ArrayList<E of kotlinx.coroutines.internal.InlineList> }");
            ((ArrayList) obj).add(obj2);
            return m10338a(obj);
        }
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(obj);
        arrayList.add(obj2);
        return m10338a(arrayList);
    }

    /* renamed from: a */
    public static Object m10338a(Object obj) {
        return obj;
    }
}
