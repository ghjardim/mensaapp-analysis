package p256j$.util.stream;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.IntFunction;
import p256j$.util.Objects;
import p256j$.util.Spliterator;
import p256j$.util.concurrent.ConcurrentHashMap;

/* renamed from: j$.util.stream.n */
/* loaded from: classes3.dex */
final class C5240n extends AbstractC5213i2 {
    /* renamed from: Y */
    static C5114Q0 m21582Y(AbstractC5168b abstractC5168b, Spliterator spliterator) {
        C5251p c5251p = new C5251p(19);
        C5251p c5251p2 = new C5251p(20);
        C5251p c5251p3 = new C5251p(21);
        Objects.requireNonNull(c5251p);
        Objects.requireNonNull(c5251p2);
        Objects.requireNonNull(c5251p3);
        return new C5114Q0((Collection) new C5065G1(EnumC5202g3.REFERENCE, c5251p3, c5251p2, c5251p, 3).mo21423c(abstractC5168b, spliterator));
    }

    @Override // p256j$.util.stream.AbstractC5168b
    /* renamed from: O */
    final InterfaceC5094M0 mo21471O(AbstractC5168b abstractC5168b, Spliterator spliterator, IntFunction intFunction) {
        if (EnumC5196f3.DISTINCT.m21557o(abstractC5168b.m21520K())) {
            return abstractC5168b.m21515C(spliterator, false, intFunction);
        }
        if (EnumC5196f3.ORDERED.m21557o(abstractC5168b.m21520K())) {
            return m21582Y(abstractC5168b, spliterator);
        }
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        C5262r0 c5262r0 = new C5262r0(2, atomicBoolean, concurrentHashMap);
        Objects.requireNonNull(c5262r0);
        new C5108P(c5262r0, false).m21490e(abstractC5168b, spliterator);
        Set keySet = concurrentHashMap.keySet();
        if (atomicBoolean.get()) {
            HashSet hashSet = new HashSet(keySet);
            hashSet.add(null);
            keySet = hashSet;
        }
        return new C5114Q0(keySet);
    }

    @Override // p256j$.util.stream.AbstractC5168b
    /* renamed from: P */
    final Spliterator mo21489P(AbstractC5168b abstractC5168b, Spliterator spliterator) {
        if (EnumC5196f3.DISTINCT.m21557o(abstractC5168b.m21520K())) {
            return abstractC5168b.m21526X(spliterator);
        }
        if (EnumC5196f3.ORDERED.m21557o(abstractC5168b.m21520K())) {
            return m21582Y(abstractC5168b, spliterator).spliterator();
        }
        return new C5250o3(abstractC5168b.m21526X(spliterator));
    }

    @Override // p256j$.util.stream.AbstractC5168b
    /* renamed from: R */
    final InterfaceC5264r2 mo21472R(int i7, InterfaceC5264r2 interfaceC5264r2) {
        Objects.requireNonNull(interfaceC5264r2);
        if (EnumC5196f3.DISTINCT.m21557o(i7)) {
            return interfaceC5264r2;
        }
        if (EnumC5196f3.SORTED.m21557o(i7)) {
            return new C5228l(interfaceC5264r2);
        }
        return new C5234m(interfaceC5264r2);
    }
}
