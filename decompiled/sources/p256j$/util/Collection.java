package p256j$.util;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedSet;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import p256j$.util.stream.AbstractC5034A0;
import p256j$.util.stream.Stream;

/* loaded from: classes3.dex */
public interface Collection<E> {
    void forEach(Consumer<? super E> consumer);

    Stream<E> parallelStream();

    boolean removeIf(Predicate<? super E> predicate);

    Spliterator<E> spliterator();

    Stream<E> stream();

    <T> T[] toArray(IntFunction<T[]> intFunction);

    /* renamed from: j$.util.Collection$-EL, reason: invalid class name */
    public final /* synthetic */ class EL {
        /* renamed from: b */
        public static /* synthetic */ Stream m21260b(java.util.Collection collection) {
            return collection instanceof Collection ? ((Collection) collection).parallelStream() : CC.$default$parallelStream(collection);
        }

        public static /* synthetic */ Stream stream(java.util.Collection collection) {
            return collection instanceof Collection ? ((Collection) collection).stream() : CC.$default$stream(collection);
        }

        /* renamed from: c */
        public static Spliterator m21261c(java.util.Collection collection) {
            if (collection instanceof Collection) {
                return ((Collection) collection).spliterator();
            }
            if (collection instanceof LinkedHashSet) {
                return Spliterators.spliterator((LinkedHashSet) collection, 17);
            }
            if (collection instanceof SortedSet) {
                SortedSet sortedSet = (SortedSet) collection;
                return new C4954T(sortedSet, sortedSet);
            }
            if (collection instanceof Set) {
                return Spliterators.spliterator((Set) collection, 1);
            }
            if (!(collection instanceof List)) {
                return Spliterators.spliterator(collection, 0);
            }
            List list = (List) collection;
            return list instanceof RandomAccess ? new C4961a(list) : Spliterators.spliterator(list, 16);
        }

        /* renamed from: a */
        public static void m21259a(java.util.Collection collection, Consumer consumer) {
            if (collection instanceof Collection) {
                ((Collection) collection).forEach(consumer);
                return;
            }
            Objects.requireNonNull(consumer);
            Iterator<E> it = collection.iterator();
            while (it.hasNext()) {
                consumer.accept(it.next());
            }
        }
    }

    /* renamed from: j$.util.Collection$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static boolean $default$removeIf(java.util.Collection collection, Predicate predicate) {
            Objects.requireNonNull(predicate);
            Iterator<E> it = collection.iterator();
            boolean z6 = false;
            while (it.hasNext()) {
                if (predicate.test(it.next())) {
                    it.remove();
                    z6 = true;
                }
            }
            return z6;
        }

        public static Stream $default$stream(java.util.Collection collection) {
            return AbstractC5034A0.m21401f0(EL.m21261c(collection), false);
        }

        public static Stream $default$parallelStream(java.util.Collection collection) {
            return AbstractC5034A0.m21401f0(EL.m21261c(collection), true);
        }
    }
}
