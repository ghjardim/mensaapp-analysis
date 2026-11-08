package p043G0;

import android.os.SystemClock;
import java.util.Arrays;
import java.util.List;
import p022D0.C0165m0;
import p043G0.AbstractC0346A;
import p050H0.InterfaceC0544m;
import p178Z2.AbstractC3033v;
import p232g0.C4304J;
import p232g0.C4306L;

/* renamed from: G0.C */
/* loaded from: classes.dex */
public abstract class AbstractC0348C {
    /* renamed from: a */
    public static C4306L m1371a(AbstractC0346A.a aVar, InterfaceC0347B[] interfaceC0347BArr) {
        List[] listArr = new List[interfaceC0347BArr.length];
        for (int i7 = 0; i7 < interfaceC0347BArr.length; i7++) {
            InterfaceC0347B interfaceC0347B = interfaceC0347BArr[i7];
            listArr[i7] = interfaceC0347B != null ? AbstractC3033v.m11051u(interfaceC0347B) : AbstractC3033v.m11050t();
        }
        return m1372b(aVar, listArr);
    }

    /* renamed from: b */
    public static C4306L m1372b(AbstractC0346A.a aVar, List[] listArr) {
        boolean z6;
        AbstractC3033v.a aVar2 = new AbstractC3033v.a();
        for (int i7 = 0; i7 < aVar.m1366d(); i7++) {
            C0165m0 m1368f = aVar.m1368f(i7);
            List list = listArr[i7];
            for (int i8 = 0; i8 < m1368f.f685a; i8++) {
                C4304J m653b = m1368f.m653b(i8);
                boolean z7 = aVar.m1363a(i7, i8, false) != 0;
                int i9 = m653b.f14850a;
                int[] iArr = new int[i9];
                boolean[] zArr = new boolean[i9];
                for (int i10 = 0; i10 < m653b.f14850a; i10++) {
                    iArr[i10] = aVar.m1369g(i7, i8, i10);
                    int i11 = 0;
                    while (true) {
                        if (i11 >= list.size()) {
                            z6 = false;
                            break;
                        }
                        InterfaceC0347B interfaceC0347B = (InterfaceC0347B) list.get(i11);
                        if (interfaceC0347B.mo389a().equals(m653b) && interfaceC0347B.mo393e(i10) != -1) {
                            z6 = true;
                            break;
                        }
                        i11++;
                    }
                    zArr[i10] = z6;
                }
                aVar2.mo11040a(new C4306L.a(m653b, z7, iArr, zArr));
            }
        }
        C0165m0 m1370h = aVar.m1370h();
        for (int i12 = 0; i12 < m1370h.f685a; i12++) {
            C4304J m653b2 = m1370h.m653b(i12);
            int[] iArr2 = new int[m653b2.f14850a];
            Arrays.fill(iArr2, 0);
            aVar2.mo11040a(new C4306L.a(m653b2, false, iArr2, new boolean[m653b2.f14850a]));
        }
        return new C4306L(aVar2.m11063k());
    }

    /* renamed from: c */
    public static InterfaceC0544m.a m1373c(InterfaceC0375y interfaceC0375y) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        int length = interfaceC0375y.length();
        int i7 = 0;
        for (int i8 = 0; i8 < length; i8++) {
            if (interfaceC0375y.mo395i(i8, elapsedRealtime)) {
                i7++;
            }
        }
        return new InterfaceC0544m.a(1, 0, length, i7);
    }
}
