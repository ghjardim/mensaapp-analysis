package p148V0;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import p141U0.AbstractC2501c;
import p141U0.C2500b;
import p171Y2.AbstractC2922e;
import p232g0.C4334x;
import p259j0.C5356y;

/* renamed from: V0.b */
/* loaded from: classes.dex */
public final class C2607b extends AbstractC2501c {
    /* renamed from: c */
    public static C4334x m8984c(C5356y c5356y) {
        c5356y.m21918r(12);
        int m21904d = (c5356y.m21904d() + c5356y.m21908h(12)) - 4;
        c5356y.m21918r(44);
        c5356y.m21919s(c5356y.m21908h(12));
        c5356y.m21918r(16);
        ArrayList arrayList = new ArrayList();
        while (true) {
            String str = null;
            if (c5356y.m21904d() >= m21904d) {
                break;
            }
            c5356y.m21918r(48);
            int m21908h = c5356y.m21908h(8);
            c5356y.m21918r(4);
            int m21904d2 = c5356y.m21904d() + c5356y.m21908h(12);
            String str2 = null;
            while (c5356y.m21904d() < m21904d2) {
                int m21908h2 = c5356y.m21908h(8);
                int m21908h3 = c5356y.m21908h(8);
                int m21904d3 = c5356y.m21904d() + m21908h3;
                if (m21908h2 == 2) {
                    int m21908h4 = c5356y.m21908h(16);
                    c5356y.m21918r(8);
                    if (m21908h4 == 3) {
                        while (c5356y.m21904d() < m21904d3) {
                            str = c5356y.m21912l(c5356y.m21908h(8), AbstractC2922e.f9008a);
                            int m21908h5 = c5356y.m21908h(8);
                            for (int i7 = 0; i7 < m21908h5; i7++) {
                                c5356y.m21919s(c5356y.m21908h(8));
                            }
                        }
                    }
                } else if (m21908h2 == 21) {
                    str2 = c5356y.m21912l(m21908h3, AbstractC2922e.f9008a);
                }
                c5356y.m21916p(m21904d3 * 8);
            }
            c5356y.m21916p(m21904d2 * 8);
            if (str != null && str2 != null) {
                arrayList.add(new C2606a(m21908h, str + str2));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new C4334x(arrayList);
    }

    @Override // p141U0.AbstractC2501c
    /* renamed from: b */
    public C4334x mo8457b(C2500b c2500b, ByteBuffer byteBuffer) {
        if (byteBuffer.get() == 116) {
            return m8984c(new C5356y(byteBuffer.array(), byteBuffer.limit()));
        }
        return null;
    }
}
