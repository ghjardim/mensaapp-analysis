package p378x5;

import com.google.android.gms.common.api.C3643a;
import java.util.Collections;
import java.util.Map;
import kotlin.jvm.internal.AbstractC5469l;
import p371w5.C6926i;

/* renamed from: x5.D */
/* loaded from: classes2.dex */
public abstract class AbstractC7004D extends AbstractC7003C {
    /* renamed from: a */
    public static int m28732a(int i7) {
        return i7 < 0 ? i7 : i7 < 3 ? i7 + 1 : i7 < 1073741824 ? (int) ((i7 / 0.75f) + 1.0f) : C3643a.e.API_PRIORITY_OTHER;
    }

    /* renamed from: b */
    public static Map m28733b(C6926i pair) {
        AbstractC5469l.m23028e(pair, "pair");
        Map singletonMap = Collections.singletonMap(pair.m28370c(), pair.m28371d());
        AbstractC5469l.m23027d(singletonMap, "singletonMap(...)");
        return singletonMap;
    }

    /* renamed from: c */
    public static final Map m28734c(Map map) {
        AbstractC5469l.m23028e(map, "<this>");
        Map.Entry entry = (Map.Entry) map.entrySet().iterator().next();
        Map singletonMap = Collections.singletonMap(entry.getKey(), entry.getValue());
        AbstractC5469l.m23027d(singletonMap, "with(...)");
        return singletonMap;
    }
}
