package p256j$.util.concurrent;

import java.util.Map;
import java.util.concurrent.ConcurrentMap;
import java.util.function.BiConsumer;
import p256j$.util.Objects;

/* renamed from: j$.util.concurrent.u */
/* loaded from: classes3.dex */
public abstract /* synthetic */ class AbstractC4988u {
    /* renamed from: a */
    public static void m21339a(ConcurrentMap concurrentMap, BiConsumer biConsumer) {
        Objects.requireNonNull(biConsumer);
        for (Map.Entry entry : concurrentMap.entrySet()) {
            try {
                biConsumer.accept(entry.getKey(), entry.getValue());
            } catch (IllegalStateException unused) {
            }
        }
    }

    /* renamed from: b */
    static String m21340b(Object obj, Object obj2) {
        String str;
        String obj3;
        String str2 = "null";
        if (obj == null || (str = obj.toString()) == null) {
            str = "null";
        }
        int length = str.length();
        if (obj2 != null && (obj3 = obj2.toString()) != null) {
            str2 = obj3;
        }
        int length2 = str2.length();
        char[] cArr = new char[length + length2 + 1];
        str.getChars(0, length, cArr, 0);
        cArr[length] = '=';
        str2.getChars(0, length2, cArr, length + 1);
        return new String(cArr);
    }
}
