package p031E2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p256j$.util.DesugarCollections;

/* renamed from: E2.e */
/* loaded from: classes.dex */
public abstract class AbstractC0269e {
    /* renamed from: a */
    public static List m1113a(Object obj) {
        return Collections.singletonList(obj);
    }

    /* renamed from: b */
    public static List m1114b(Object... objArr) {
        int length = objArr.length;
        return length != 0 ? length != 1 ? DesugarCollections.unmodifiableList(Arrays.asList(objArr)) : Collections.singletonList(objArr[0]) : Collections.emptyList();
    }
}
