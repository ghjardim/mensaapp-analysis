package p178Z2;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Comparator;

/* renamed from: Z2.o */
/* loaded from: classes.dex */
public final class C3026o extends AbstractC2999M implements Serializable {

    /* renamed from: a */
    public final Comparator[] f9300a;

    public C3026o(Comparator comparator, Comparator comparator2) {
        this.f9300a = new Comparator[]{comparator, comparator2};
    }

    @Override // p178Z2.AbstractC2999M, java.util.Comparator
    public int compare(Object obj, Object obj2) {
        int i7 = 0;
        while (true) {
            Comparator[] comparatorArr = this.f9300a;
            if (i7 >= comparatorArr.length) {
                return 0;
            }
            int compare = comparatorArr[i7].compare(obj, obj2);
            if (compare != 0) {
                return compare;
            }
            i7++;
        }
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C3026o) {
            return Arrays.equals(this.f9300a, ((C3026o) obj).f9300a);
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(this.f9300a);
    }

    public String toString() {
        return "Ordering.compound(" + Arrays.toString(this.f9300a) + ")";
    }
}
