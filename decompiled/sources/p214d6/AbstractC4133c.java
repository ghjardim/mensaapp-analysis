package p214d6;

import java.io.IOException;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC5469l;
import p206c6.AbstractC3622j;
import p206c6.C3601M;
import p378x5.C7016g;

/* renamed from: d6.c */
/* loaded from: classes2.dex */
public abstract class AbstractC4133c {
    /* renamed from: a */
    public static final void m17329a(AbstractC3622j abstractC3622j, C3601M dir, boolean z6) {
        AbstractC5469l.m23028e(abstractC3622j, "<this>");
        AbstractC5469l.m23028e(dir, "dir");
        C7016g c7016g = new C7016g();
        for (C3601M c3601m = dir; c3601m != null && !abstractC3622j.m14680g(c3601m); c3601m = c3601m.m14492m()) {
            c7016g.addFirst(c3601m);
        }
        if (z6 && c7016g.isEmpty()) {
            throw new IOException(dir + " already exist.");
        }
        Iterator<E> it = c7016g.iterator();
        while (it.hasNext()) {
            abstractC3622j.m14678c((C3601M) it.next());
        }
    }

    /* renamed from: b */
    public static final boolean m17330b(AbstractC3622j abstractC3622j, C3601M path) {
        AbstractC5469l.m23028e(abstractC3622j, "<this>");
        AbstractC5469l.m23028e(path, "path");
        return abstractC3622j.mo14466h(path) != null;
    }
}
