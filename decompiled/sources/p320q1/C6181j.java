package p320q1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import p248i0.C4503a;
import p249i1.InterfaceC4520k;
import p256j$.util.DesugarCollections;
import p259j0.AbstractC5330M;
import p259j0.AbstractC5332a;

/* renamed from: q1.j */
/* loaded from: classes.dex */
public final class C6181j implements InterfaceC4520k {

    /* renamed from: a */
    public final List f22127a;

    /* renamed from: b */
    public final long[] f22128b;

    /* renamed from: c */
    public final long[] f22129c;

    public C6181j(List list) {
        this.f22127a = DesugarCollections.unmodifiableList(new ArrayList(list));
        this.f22128b = new long[list.size() * 2];
        for (int i7 = 0; i7 < list.size(); i7++) {
            C6175d c6175d = (C6175d) list.get(i7);
            int i8 = i7 * 2;
            long[] jArr = this.f22128b;
            jArr[i8] = c6175d.f22098b;
            jArr[i8 + 1] = c6175d.f22099c;
        }
        long[] jArr2 = this.f22128b;
        long[] copyOf = Arrays.copyOf(jArr2, jArr2.length);
        this.f22129c = copyOf;
        Arrays.sort(copyOf);
    }

    /* renamed from: c */
    public static /* synthetic */ int m25838c(C6175d c6175d, C6175d c6175d2) {
        return Long.compare(c6175d.f22098b, c6175d2.f22098b);
    }

    @Override // p249i1.InterfaceC4520k
    /* renamed from: b */
    public int mo19221b(long j7) {
        int m21732d = AbstractC5330M.m21732d(this.f22129c, j7, false, false);
        if (m21732d < this.f22129c.length) {
            return m21732d;
        }
        return -1;
    }

    @Override // p249i1.InterfaceC4520k
    /* renamed from: f */
    public long mo19223f(int i7) {
        AbstractC5332a.m21796a(i7 >= 0);
        AbstractC5332a.m21796a(i7 < this.f22129c.length);
        return this.f22129c[i7];
    }

    @Override // p249i1.InterfaceC4520k
    /* renamed from: g */
    public List mo19224g(long j7) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i7 = 0; i7 < this.f22127a.size(); i7++) {
            long[] jArr = this.f22128b;
            int i8 = i7 * 2;
            if (jArr[i8] <= j7 && j7 < jArr[i8 + 1]) {
                C6175d c6175d = (C6175d) this.f22127a.get(i7);
                C4503a c4503a = c6175d.f22097a;
                if (c4503a.f16095e == -3.4028235E38f) {
                    arrayList2.add(c6175d);
                } else {
                    arrayList.add(c4503a);
                }
            }
        }
        Collections.sort(arrayList2, new Comparator() { // from class: q1.i
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int m25838c;
                m25838c = C6181j.m25838c((C6175d) obj, (C6175d) obj2);
                return m25838c;
            }
        });
        for (int i9 = 0; i9 < arrayList2.size(); i9++) {
            arrayList.add(((C6175d) arrayList2.get(i9)).f22097a.m19184a().m19194h((-1) - i9, 1).m19187a());
        }
        return arrayList;
    }

    @Override // p249i1.InterfaceC4520k
    /* renamed from: h */
    public int mo19225h() {
        return this.f22129c.length;
    }
}
