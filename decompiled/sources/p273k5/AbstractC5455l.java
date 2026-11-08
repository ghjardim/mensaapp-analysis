package p273k5;

import java.lang.reflect.Array;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p256j$.util.DesugarCollections;

/* renamed from: k5.l */
/* loaded from: classes2.dex */
public abstract class AbstractC5455l {

    /* renamed from: a */
    public static final String[] f19691a = new String[0];

    /* renamed from: b */
    public static final Charset f19692b = Charset.forName("UTF-8");

    /* renamed from: a */
    public static List m23000a(Object[] objArr) {
        return DesugarCollections.unmodifiableList(Arrays.asList((Object[]) objArr.clone()));
    }

    /* renamed from: b */
    public static List m23001b(Object[] objArr, Object[] objArr2) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : objArr) {
            int length = objArr2.length;
            int i7 = 0;
            while (true) {
                if (i7 < length) {
                    Object obj2 = objArr2[i7];
                    if (obj.equals(obj2)) {
                        arrayList.add(obj2);
                        break;
                    }
                    i7++;
                }
            }
        }
        return arrayList;
    }

    /* renamed from: c */
    public static Object[] m23002c(Class cls, Object[] objArr, Object[] objArr2) {
        List m23001b = m23001b(objArr, objArr2);
        return m23001b.toArray((Object[]) Array.newInstance((Class<?>) cls, m23001b.size()));
    }
}
