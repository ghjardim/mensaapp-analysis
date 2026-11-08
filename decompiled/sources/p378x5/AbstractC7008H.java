package p378x5;

import java.util.Set;
import kotlin.jvm.internal.AbstractC5469l;

/* renamed from: x5.H */
/* loaded from: classes2.dex */
public abstract class AbstractC7008H extends AbstractC7007G {
    /* renamed from: b */
    public static Set m28756b() {
        return C7001A.f25049a;
    }

    /* renamed from: c */
    public static final Set m28757c(Set set) {
        AbstractC5469l.m23028e(set, "<this>");
        int size = set.size();
        return size != 0 ? size != 1 ? set : AbstractC7007G.m28755a(set.iterator().next()) : m28756b();
    }

    /* renamed from: d */
    public static Set m28758d(Object... elements) {
        AbstractC5469l.m23028e(elements, "elements");
        return AbstractC7020k.m28841k0(elements);
    }
}
