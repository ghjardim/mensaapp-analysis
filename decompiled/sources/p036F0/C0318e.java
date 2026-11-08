package p036F0;

import java.util.ArrayList;
import java.util.List;
import p171Y2.InterfaceC2924g;
import p178Z2.AbstractC2999M;
import p178Z2.AbstractC3033v;
import p249i1.C4514e;
import p259j0.AbstractC5332a;

/* renamed from: F0.e */
/* loaded from: classes.dex */
public final class C0318e implements InterfaceC0314a {

    /* renamed from: b */
    public static final AbstractC2999M f1156b = AbstractC2999M.m10843d().m10847f(new InterfaceC2924g() { // from class: F0.c
        @Override // p171Y2.InterfaceC2924g
        public final Object apply(Object obj) {
            Long m1239h;
            m1239h = C0318e.m1239h((C4514e) obj);
            return m1239h;
        }
    }).m10844a(AbstractC2999M.m10843d().mo10834g().m10847f(new InterfaceC2924g() { // from class: F0.d
        @Override // p171Y2.InterfaceC2924g
        public final Object apply(Object obj) {
            Long m1240i;
            m1240i = C0318e.m1240i((C4514e) obj);
            return m1240i;
        }
    }));

    /* renamed from: a */
    public final List f1157a = new ArrayList();

    /* renamed from: h */
    public static /* synthetic */ Long m1239h(C4514e c4514e) {
        return Long.valueOf(c4514e.f16146b);
    }

    /* renamed from: i */
    public static /* synthetic */ Long m1240i(C4514e c4514e) {
        return Long.valueOf(c4514e.f16147c);
    }

    @Override // p036F0.InterfaceC0314a
    /* renamed from: a */
    public long mo1231a(long j7) {
        int i7 = 0;
        long j8 = -9223372036854775807L;
        while (true) {
            if (i7 >= this.f1157a.size()) {
                break;
            }
            long j9 = ((C4514e) this.f1157a.get(i7)).f16146b;
            long j10 = ((C4514e) this.f1157a.get(i7)).f16148d;
            if (j7 < j9) {
                j8 = j8 == -9223372036854775807L ? j9 : Math.min(j8, j9);
            } else {
                if (j7 < j10) {
                    j8 = j8 == -9223372036854775807L ? j10 : Math.min(j8, j10);
                }
                i7++;
            }
        }
        if (j8 != -9223372036854775807L) {
            return j8;
        }
        return Long.MIN_VALUE;
    }

    @Override // p036F0.InterfaceC0314a
    /* renamed from: b */
    public AbstractC3033v mo1232b(long j7) {
        if (!this.f1157a.isEmpty()) {
            if (j7 >= ((C4514e) this.f1157a.get(0)).f16146b) {
                ArrayList arrayList = new ArrayList();
                for (int i7 = 0; i7 < this.f1157a.size(); i7++) {
                    C4514e c4514e = (C4514e) this.f1157a.get(i7);
                    if (j7 >= c4514e.f16146b && j7 < c4514e.f16148d) {
                        arrayList.add(c4514e);
                    }
                    if (j7 < c4514e.f16146b) {
                        break;
                    }
                }
                AbstractC3033v m11042B = AbstractC3033v.m11042B(f1156b, arrayList);
                AbstractC3033v.a m11045m = AbstractC3033v.m11045m();
                for (int i8 = 0; i8 < m11042B.size(); i8++) {
                    m11045m.m11062j(((C4514e) m11042B.get(i8)).f16145a);
                }
                return m11045m.m11063k();
            }
        }
        return AbstractC3033v.m11050t();
    }

    @Override // p036F0.InterfaceC0314a
    /* renamed from: c */
    public boolean mo1233c(C4514e c4514e, long j7) {
        AbstractC5332a.m21796a(c4514e.f16146b != -9223372036854775807L);
        AbstractC5332a.m21796a(c4514e.f16147c != -9223372036854775807L);
        boolean z6 = c4514e.f16146b <= j7 && j7 < c4514e.f16148d;
        for (int size = this.f1157a.size() - 1; size >= 0; size--) {
            if (c4514e.f16146b >= ((C4514e) this.f1157a.get(size)).f16146b) {
                this.f1157a.add(size + 1, c4514e);
                return z6;
            }
        }
        this.f1157a.add(0, c4514e);
        return z6;
    }

    @Override // p036F0.InterfaceC0314a
    public void clear() {
        this.f1157a.clear();
    }

    @Override // p036F0.InterfaceC0314a
    /* renamed from: d */
    public long mo1234d(long j7) {
        if (this.f1157a.isEmpty()) {
            return -9223372036854775807L;
        }
        if (j7 < ((C4514e) this.f1157a.get(0)).f16146b) {
            return -9223372036854775807L;
        }
        long j8 = ((C4514e) this.f1157a.get(0)).f16146b;
        for (int i7 = 0; i7 < this.f1157a.size(); i7++) {
            long j9 = ((C4514e) this.f1157a.get(i7)).f16146b;
            long j10 = ((C4514e) this.f1157a.get(i7)).f16148d;
            if (j10 > j7) {
                if (j9 > j7) {
                    break;
                }
                j8 = Math.max(j8, j9);
            } else {
                j8 = Math.max(j8, j10);
            }
        }
        return j8;
    }

    @Override // p036F0.InterfaceC0314a
    /* renamed from: e */
    public void mo1235e(long j7) {
        int i7 = 0;
        while (i7 < this.f1157a.size()) {
            long j8 = ((C4514e) this.f1157a.get(i7)).f16146b;
            if (j7 > j8 && j7 > ((C4514e) this.f1157a.get(i7)).f16148d) {
                this.f1157a.remove(i7);
                i7--;
            } else if (j7 < j8) {
                return;
            }
            i7++;
        }
    }
}
