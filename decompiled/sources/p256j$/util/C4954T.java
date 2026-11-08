package p256j$.util;

import java.util.Collection;
import java.util.Comparator;
import java.util.SortedSet;

/* renamed from: j$.util.T */
/* loaded from: classes3.dex */
final class C4954T extends C5032s0 {

    /* renamed from: f */
    final /* synthetic */ SortedSet f18159f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C4954T(SortedSet sortedSet, Collection collection) {
        super(collection, 21);
        this.f18159f = sortedSet;
    }

    @Override // p256j$.util.C5032s0, p256j$.util.Spliterator
    public final Comparator getComparator() {
        return this.f18159f.comparator();
    }
}
