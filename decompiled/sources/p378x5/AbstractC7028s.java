package p378x5;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import kotlin.jvm.internal.AbstractC5469l;

/* renamed from: x5.s */
/* loaded from: classes2.dex */
public abstract class AbstractC7028s extends AbstractC7027r {
    /* renamed from: o */
    public static final void m28869o(List list, Comparator comparator) {
        AbstractC5469l.m23028e(list, "<this>");
        AbstractC5469l.m23028e(comparator, "comparator");
        if (list.size() > 1) {
            Collections.sort(list, comparator);
        }
    }
}
