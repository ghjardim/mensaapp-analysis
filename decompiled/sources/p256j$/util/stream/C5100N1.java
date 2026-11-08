package p256j$.util.stream;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Supplier;
import java.util.stream.Collector;
import p256j$.util.C5007g;

/* renamed from: j$.util.stream.N1 */
/* loaded from: classes3.dex */
final class C5100N1 extends AbstractC5034A0 {

    /* renamed from: h */
    final /* synthetic */ BinaryOperator f18427h;

    /* renamed from: i */
    final /* synthetic */ BiConsumer f18428i;

    /* renamed from: j */
    final /* synthetic */ Supplier f18429j;

    /* renamed from: k */
    final /* synthetic */ C5216j f18430k;

    @Override // p256j$.util.stream.AbstractC5034A0, p256j$.util.stream.InterfaceC5092L3
    /* renamed from: d */
    public final int mo21424d() {
        Set<Collector.Characteristics> characteristics = this.f18430k.f18634a.characteristics();
        if (characteristics != null && !characteristics.isEmpty()) {
            HashSet hashSet = new HashSet();
            Collector.Characteristics next = characteristics.iterator().next();
            if (next instanceof EnumC5210i) {
                Iterator<Collector.Characteristics> it = characteristics.iterator();
                while (it.hasNext()) {
                    try {
                        EnumC5210i enumC5210i = (EnumC5210i) it.next();
                        hashSet.add(enumC5210i == null ? null : enumC5210i == EnumC5210i.CONCURRENT ? Collector.Characteristics.CONCURRENT : enumC5210i == EnumC5210i.UNORDERED ? Collector.Characteristics.UNORDERED : Collector.Characteristics.IDENTITY_FINISH);
                    } catch (ClassCastException e7) {
                        C5007g.m21365a("java.util.stream.Collector.Characteristics", e7);
                        throw null;
                    }
                }
            } else {
                if (!(next instanceof Collector.Characteristics)) {
                    C5007g.m21365a("java.util.stream.Collector.Characteristics", next.getClass());
                    throw null;
                }
                Iterator<Collector.Characteristics> it2 = characteristics.iterator();
                while (it2.hasNext()) {
                    try {
                        Collector.Characteristics next2 = it2.next();
                        hashSet.add(next2 == null ? null : next2 == Collector.Characteristics.CONCURRENT ? EnumC5210i.CONCURRENT : next2 == Collector.Characteristics.UNORDERED ? EnumC5210i.UNORDERED : EnumC5210i.IDENTITY_FINISH);
                    } catch (ClassCastException e8) {
                        C5007g.m21365a("java.util.stream.Collector.Characteristics", e8);
                        throw null;
                    }
                }
            }
            characteristics = hashSet;
        }
        if (characteristics.contains(EnumC5210i.UNORDERED)) {
            return EnumC5196f3.f18590r;
        }
        return 0;
    }

    @Override // p256j$.util.stream.AbstractC5034A0
    /* renamed from: e0 */
    public final InterfaceC5144W1 mo21425e0() {
        return new C5105O1(this.f18429j, this.f18428i, this.f18427h);
    }

    C5100N1(EnumC5202g3 enumC5202g3, BinaryOperator binaryOperator, BiConsumer biConsumer, Supplier supplier, C5216j c5216j) {
        this.f18427h = binaryOperator;
        this.f18428i = biConsumer;
        this.f18429j = supplier;
        this.f18430k = c5216j;
    }
}
