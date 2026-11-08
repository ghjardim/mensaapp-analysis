package p256j$.util;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedMap;

/* loaded from: classes3.dex */
public class DesugarCollections {
    public static <T> Collection<T> unmodifiableCollection(Collection<? extends T> collection) {
        return new C5021n(collection);
    }

    public static <T> Set<T> unmodifiableSet(Set<? extends T> set) {
        return new C5312w(set);
    }

    public static <T> List<T> unmodifiableList(List<? extends T> list) {
        if (!(list instanceof RandomAccess)) {
            return new C5025p(list);
        }
        return new C5310v(list);
    }

    public static <K, V> Map<K, V> unmodifiableMap(Map<? extends K, ? extends V> map) {
        return new C5308u(map);
    }

    public static <K, V> SortedMap<K, V> unmodifiableSortedMap(SortedMap<K, ? extends V> sortedMap) {
        return new C5313x(sortedMap);
    }

    public static <T> Set<T> synchronizedSet(Set<T> set) {
        return new C5017l(set);
    }

    public static <T> List<T> synchronizedList(List<T> list) {
        if (!(list instanceof RandomAccess)) {
            return new C5011i(list);
        }
        return new C5015k(list);
    }

    public static <K, V> Map<K, V> synchronizedMap(Map<K, V> map) {
        return new C5013j(map);
    }
}
