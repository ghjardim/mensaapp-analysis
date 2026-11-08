package p319q0;

import java.util.Map;
import p276l0.C5497k;
import p327r0.AbstractC6243j;
import p327r0.C6235b;
import p327r0.C6242i;

/* renamed from: q0.h */
/* loaded from: classes.dex */
public abstract class AbstractC6169h {
    /* renamed from: a */
    public static C5497k m25744a(AbstractC6243j abstractC6243j, String str, C6242i c6242i, int i7, Map map) {
        return new C5497k.b().m23094i(c6242i.m26088b(str)).m23093h(c6242i.f22333a).m23092g(c6242i.f22334b).m23091f(m25745b(abstractC6243j, c6242i)).m23087b(i7).m23090e(map).m23086a();
    }

    /* renamed from: b */
    public static String m25745b(AbstractC6243j abstractC6243j, C6242i c6242i) {
        String mo26091k = abstractC6243j.mo26091k();
        return mo26091k != null ? mo26091k : c6242i.m26088b(((C6235b) abstractC6243j.f22339c.get(0)).f22284a).toString();
    }
}
