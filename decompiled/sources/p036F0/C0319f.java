package p036F0;

import java.util.ArrayList;
import p178Z2.AbstractC2987A;
import p178Z2.AbstractC3033v;
import p249i1.C4514e;

/* renamed from: F0.f */
/* loaded from: classes.dex */
public final class C0319f implements InterfaceC0314a {

    /* renamed from: a */
    public final ArrayList f1158a = new ArrayList();

    @Override // p036F0.InterfaceC0314a
    /* renamed from: a */
    public long mo1231a(long j7) {
        if (this.f1158a.isEmpty()) {
            return Long.MIN_VALUE;
        }
        if (j7 < ((C4514e) this.f1158a.get(0)).f16146b) {
            return ((C4514e) this.f1158a.get(0)).f16146b;
        }
        for (int i7 = 1; i7 < this.f1158a.size(); i7++) {
            C4514e c4514e = (C4514e) this.f1158a.get(i7);
            if (j7 < c4514e.f16146b) {
                long j8 = ((C4514e) this.f1158a.get(i7 - 1)).f16148d;
                return (j8 == -9223372036854775807L || j8 <= j7 || j8 >= c4514e.f16146b) ? c4514e.f16146b : j8;
            }
        }
        long j9 = ((C4514e) AbstractC2987A.m10751d(this.f1158a)).f16148d;
        if (j9 == -9223372036854775807L || j7 >= j9) {
            return Long.MIN_VALUE;
        }
        return j9;
    }

    @Override // p036F0.InterfaceC0314a
    /* renamed from: b */
    public AbstractC3033v mo1232b(long j7) {
        int m1241f = m1241f(j7);
        if (m1241f == 0) {
            return AbstractC3033v.m11050t();
        }
        C4514e c4514e = (C4514e) this.f1158a.get(m1241f - 1);
        long j8 = c4514e.f16148d;
        return (j8 == -9223372036854775807L || j7 < j8) ? c4514e.f16145a : AbstractC3033v.m11050t();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002f  */
    @Override // p036F0.InterfaceC0314a
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean mo1233c(p249i1.C4514e r10, long r11) {
        /*
            r9 = this;
            long r0 = r10.f16146b
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r1 = 0
            r4 = 1
            if (r0 == 0) goto Lf
            r0 = r4
            goto L10
        Lf:
            r0 = r1
        L10:
            p259j0.AbstractC5332a.m21796a(r0)
            long r5 = r10.f16146b
            int r0 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            if (r0 > 0) goto L25
            long r5 = r10.f16148d
            int r0 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r0 == 0) goto L23
            int r0 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1))
            if (r0 >= 0) goto L25
        L23:
            r0 = r4
            goto L26
        L25:
            r0 = r1
        L26:
            java.util.ArrayList r2 = r9.f1158a
            int r2 = r2.size()
            int r2 = r2 - r4
        L2d:
            if (r2 < 0) goto L58
            long r5 = r10.f16146b
            java.util.ArrayList r3 = r9.f1158a
            java.lang.Object r3 = r3.get(r2)
            i1.e r3 = (p249i1.C4514e) r3
            long r7 = r3.f16146b
            int r3 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r3 < 0) goto L46
            java.util.ArrayList r11 = r9.f1158a
            int r2 = r2 + r4
            r11.add(r2, r10)
            return r0
        L46:
            java.util.ArrayList r3 = r9.f1158a
            java.lang.Object r3 = r3.get(r2)
            i1.e r3 = (p249i1.C4514e) r3
            long r5 = r3.f16146b
            int r3 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            if (r3 > 0) goto L55
            r0 = r1
        L55:
            int r2 = r2 + (-1)
            goto L2d
        L58:
            java.util.ArrayList r11 = r9.f1158a
            r11.add(r1, r10)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p036F0.C0319f.mo1233c(i1.e, long):boolean");
    }

    @Override // p036F0.InterfaceC0314a
    public void clear() {
        this.f1158a.clear();
    }

    @Override // p036F0.InterfaceC0314a
    /* renamed from: d */
    public long mo1234d(long j7) {
        if (this.f1158a.isEmpty() || j7 < ((C4514e) this.f1158a.get(0)).f16146b) {
            return -9223372036854775807L;
        }
        for (int i7 = 1; i7 < this.f1158a.size(); i7++) {
            long j8 = ((C4514e) this.f1158a.get(i7)).f16146b;
            if (j7 == j8) {
                return j8;
            }
            if (j7 < j8) {
                C4514e c4514e = (C4514e) this.f1158a.get(i7 - 1);
                long j9 = c4514e.f16148d;
                return (j9 == -9223372036854775807L || j9 > j7) ? c4514e.f16146b : j9;
            }
        }
        C4514e c4514e2 = (C4514e) AbstractC2987A.m10751d(this.f1158a);
        long j10 = c4514e2.f16148d;
        return (j10 == -9223372036854775807L || j7 < j10) ? c4514e2.f16146b : j10;
    }

    @Override // p036F0.InterfaceC0314a
    /* renamed from: e */
    public void mo1235e(long j7) {
        int m1241f = m1241f(j7);
        if (m1241f > 0) {
            this.f1158a.subList(0, m1241f).clear();
        }
    }

    /* renamed from: f */
    public final int m1241f(long j7) {
        for (int i7 = 0; i7 < this.f1158a.size(); i7++) {
            if (j7 < ((C4514e) this.f1158a.get(i7)).f16146b) {
                return i7;
            }
        }
        return this.f1158a.size();
    }
}
