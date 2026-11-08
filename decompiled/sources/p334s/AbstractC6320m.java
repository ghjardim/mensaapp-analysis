package p334s;

import kotlin.jvm.internal.AbstractC5469l;
import p342t.AbstractC6404a;

/* renamed from: s.m */
/* loaded from: classes.dex */
public abstract class AbstractC6320m {

    /* renamed from: a */
    public static final Object f22885a = new Object();

    /* renamed from: c */
    public static final Object m26471c(C6319l c6319l, int i7) {
        Object obj;
        AbstractC5469l.m23028e(c6319l, "<this>");
        int m26746a = AbstractC6404a.m26746a(c6319l.f22882b, c6319l.f22884d, i7);
        if (m26746a < 0 || (obj = c6319l.f22883c[m26746a]) == f22885a) {
            return null;
        }
        return obj;
    }

    /* renamed from: d */
    public static final Object m26472d(C6319l c6319l, int i7, Object obj) {
        Object obj2;
        AbstractC5469l.m23028e(c6319l, "<this>");
        int m26746a = AbstractC6404a.m26746a(c6319l.f22882b, c6319l.f22884d, i7);
        return (m26746a < 0 || (obj2 = c6319l.f22883c[m26746a]) == f22885a) ? obj : obj2;
    }

    /* renamed from: e */
    public static final void m26473e(C6319l c6319l) {
        int i7 = c6319l.f22884d;
        int[] iArr = c6319l.f22882b;
        Object[] objArr = c6319l.f22883c;
        int i8 = 0;
        for (int i9 = 0; i9 < i7; i9++) {
            Object obj = objArr[i9];
            if (obj != f22885a) {
                if (i9 != i8) {
                    iArr[i8] = iArr[i9];
                    objArr[i8] = obj;
                    objArr[i9] = null;
                }
                i8++;
            }
        }
        c6319l.f22881a = false;
        c6319l.f22884d = i8;
    }
}
