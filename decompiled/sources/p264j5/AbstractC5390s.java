package p264j5;

import java.util.Iterator;
import java.util.List;
import java.util.logging.Logger;
import p237g5.AbstractC4412M;
import p237g5.C4424Z;
import p253i5.AbstractC4583T0;
import p281l5.C5542d;

/* renamed from: j5.s */
/* loaded from: classes2.dex */
public abstract class AbstractC5390s {

    /* renamed from: a */
    public static final Logger f19221a = Logger.getLogger(AbstractC5390s.class.getName());

    /* renamed from: a */
    public static C4424Z m22291a(List list) {
        return AbstractC4412M.m18673c(m22292b(list));
    }

    /* renamed from: b */
    public static byte[][] m22292b(List list) {
        byte[][] bArr = new byte[list.size() * 2][];
        Iterator it = list.iterator();
        int i7 = 0;
        while (it.hasNext()) {
            C5542d c5542d = (C5542d) it.next();
            int i8 = i7 + 1;
            bArr[i7] = c5542d.f19976a.mo14535F();
            i7 += 2;
            bArr[i8] = c5542d.f19977b.mo14535F();
        }
        return AbstractC4583T0.m19665e(bArr);
    }

    /* renamed from: c */
    public static C4424Z m22293c(List list) {
        return AbstractC4412M.m18673c(m22292b(list));
    }
}
