package p249i1;

import java.util.List;
import p259j0.InterfaceC5338g;

/* renamed from: i1.i */
/* loaded from: classes.dex */
public abstract class AbstractC4518i {
    /* renamed from: a */
    public static int m19229a(InterfaceC4520k interfaceC4520k, long j7) {
        if (j7 == -9223372036854775807L) {
            return 0;
        }
        int mo19221b = interfaceC4520k.mo19221b(j7);
        if (mo19221b == -1) {
            mo19221b = interfaceC4520k.mo19225h();
        }
        return (mo19221b <= 0 || interfaceC4520k.mo19223f(mo19221b + (-1)) != j7) ? mo19221b : mo19221b - 1;
    }

    /* renamed from: b */
    public static void m19230b(InterfaceC4520k interfaceC4520k, int i7, InterfaceC5338g interfaceC5338g) {
        long mo19223f = interfaceC4520k.mo19223f(i7);
        List mo19224g = interfaceC4520k.mo19224g(mo19223f);
        if (mo19224g.isEmpty()) {
            return;
        }
        if (i7 == interfaceC4520k.mo19225h() - 1) {
            throw new IllegalStateException();
        }
        long mo19223f2 = interfaceC4520k.mo19223f(i7 + 1) - interfaceC4520k.mo19223f(i7);
        if (mo19223f2 > 0) {
            interfaceC5338g.accept(new C4514e(mo19224g, mo19223f, mo19223f2));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0043 A[LOOP:0: B:11:0x003d->B:13:0x0043, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m19231c(p249i1.InterfaceC4520k r11, p249i1.InterfaceC4529t.b r12, p259j0.InterfaceC5338g r13) {
        /*
            long r0 = r12.f16174a
            int r0 = m19229a(r11, r0)
            long r1 = r12.f16174a
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            r2 = 0
            if (r1 == 0) goto L3b
            int r1 = r11.mo19225h()
            if (r0 >= r1) goto L3b
            long r3 = r12.f16174a
            java.util.List r6 = r11.mo19224g(r3)
            long r3 = r11.mo19223f(r0)
            boolean r1 = r6.isEmpty()
            if (r1 != 0) goto L3b
            long r7 = r12.f16174a
            int r1 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r1 >= 0) goto L3b
            i1.e r1 = new i1.e
            long r9 = r3 - r7
            r5 = r1
            r5.<init>(r6, r7, r9)
            r13.accept(r1)
            r1 = 1
            goto L3c
        L3b:
            r1 = r2
        L3c:
            r3 = r0
        L3d:
            int r4 = r11.mo19225h()
            if (r3 >= r4) goto L49
            m19230b(r11, r3, r13)
            int r3 = r3 + 1
            goto L3d
        L49:
            boolean r3 = r12.f16175b
            if (r3 == 0) goto L76
            if (r1 == 0) goto L51
            int r0 = r0 + (-1)
        L51:
            if (r2 >= r0) goto L59
            m19230b(r11, r2, r13)
            int r2 = r2 + 1
            goto L51
        L59:
            if (r1 == 0) goto L76
            i1.e r1 = new i1.e
            long r2 = r12.f16174a
            java.util.List r4 = r11.mo19224g(r2)
            long r5 = r11.mo19223f(r0)
            long r2 = r12.f16174a
            long r11 = r11.mo19223f(r0)
            long r7 = r2 - r11
            r3 = r1
            r3.<init>(r4, r5, r7)
            r13.accept(r1)
        L76:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p249i1.AbstractC4518i.m19231c(i1.k, i1.t$b, j0.g):void");
    }
}
