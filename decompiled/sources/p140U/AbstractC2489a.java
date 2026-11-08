package p140U;

import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC5469l;
import p256j$.util.DesugarCollections;
import p378x5.AbstractC7032w;

/* renamed from: U.a */
/* loaded from: classes.dex */
public abstract class AbstractC2489a {
    /* renamed from: a */
    public static final Set m8419a(Set set) {
        AbstractC5469l.m23028e(set, "set");
        Set unmodifiableSet = DesugarCollections.unmodifiableSet(AbstractC7032w.m28893S(set));
        AbstractC5469l.m23027d(unmodifiableSet, "unmodifiableSet(set.toSet())");
        return unmodifiableSet;
    }

    /* renamed from: b */
    public static final Map m8420b(Map map) {
        AbstractC5469l.m23028e(map, "map");
        Map unmodifiableMap = DesugarCollections.unmodifiableMap(map);
        AbstractC5469l.m23027d(unmodifiableMap, "unmodifiableMap(map)");
        return unmodifiableMap;
    }
}
