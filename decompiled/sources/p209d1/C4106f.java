package p209d1;

import org.apache.tika.fork.ForkServer;
import p078L0.InterfaceC0884s;
import p259j0.C5357z;

/* renamed from: d1.f */
/* loaded from: classes.dex */
public final class C4106f {

    /* renamed from: a */
    public final C5357z f13806a = new C5357z(8);

    /* renamed from: b */
    public int f13807b;

    /* renamed from: a */
    public final long m17281a(InterfaceC0884s interfaceC0884s) {
        int i7 = 0;
        interfaceC0884s.mo3521t(this.f13806a.m21946e(), 0, 1);
        int i8 = this.f13806a.m21946e()[0] & ForkServer.ERROR;
        if (i8 == 0) {
            return Long.MIN_VALUE;
        }
        int i9 = 128;
        int i10 = 0;
        while ((i8 & i9) == 0) {
            i9 >>= 1;
            i10++;
        }
        int i11 = i8 & (~i9);
        interfaceC0884s.mo3521t(this.f13806a.m21946e(), 1, i10);
        while (i7 < i10) {
            i7++;
            i11 = (this.f13806a.m21946e()[i7] & ForkServer.ERROR) + (i11 << 8);
        }
        this.f13807b += i10 + 1;
        return i11;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x009a, code lost:
    
        return false;
     */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean m17282b(p078L0.InterfaceC0884s r14) {
        /*
            r13 = this;
            long r0 = r14.mo3511a()
            r2 = -1
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r3 = 1024(0x400, double:5.06E-321)
            if (r2 == 0) goto L12
            int r5 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r5 <= 0) goto L11
            goto L12
        L11:
            r3 = r0
        L12:
            int r3 = (int) r3
            j0.z r4 = r13.f13806a
            byte[] r4 = r4.m21946e()
            r5 = 0
            r6 = 4
            r14.mo3521t(r4, r5, r6)
            j0.z r4 = r13.f13806a
            long r7 = r4.m21928I()
            r13.f13807b = r6
        L26:
            r9 = 440786851(0x1a45dfa3, double:2.1777764E-315)
            int r4 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            r6 = 1
            if (r4 == 0) goto L54
            int r4 = r13.f13807b
            int r4 = r4 + r6
            r13.f13807b = r4
            if (r4 != r3) goto L36
            return r5
        L36:
            j0.z r4 = r13.f13806a
            byte[] r4 = r4.m21946e()
            r14.mo3521t(r4, r5, r6)
            r4 = 8
            long r6 = r7 << r4
            r8 = -256(0xffffffffffffff00, double:NaN)
            long r6 = r6 & r8
            j0.z r4 = r13.f13806a
            byte[] r4 = r4.m21946e()
            r4 = r4[r5]
            r4 = r4 & 255(0xff, float:3.57E-43)
            long r8 = (long) r4
            long r7 = r6 | r8
            goto L26
        L54:
            long r3 = r13.m17281a(r14)
            int r7 = r13.f13807b
            long r7 = (long) r7
            r9 = -9223372036854775808
            int r11 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
            if (r11 == 0) goto La1
            if (r2 == 0) goto L6a
            long r11 = r7 + r3
            int r0 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            if (r0 < 0) goto L6a
            goto La1
        L6a:
            int r0 = r13.f13807b
            long r1 = (long) r0
            long r11 = r7 + r3
            int r1 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r1 >= 0) goto L9b
            long r0 = r13.m17281a(r14)
            int r0 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r0 != 0) goto L7c
            return r5
        L7c:
            long r0 = r13.m17281a(r14)
            r11 = 0
            int r2 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r2 < 0) goto L9a
            r11 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r11 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r11 <= 0) goto L8e
            goto L9a
        L8e:
            if (r2 == 0) goto L6a
            int r0 = (int) r0
            r14.mo3515k(r0)
            int r1 = r13.f13807b
            int r1 = r1 + r0
            r13.f13807b = r1
            goto L6a
        L9a:
            return r5
        L9b:
            long r0 = (long) r0
            int r14 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r14 != 0) goto La1
            r5 = r6
        La1:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p209d1.C4106f.m17282b(L0.s):boolean");
    }
}
