package p256j$.time.format;

import java.util.Comparator;
import java.util.Map;

/* renamed from: j$.time.format.q */
/* loaded from: classes3.dex */
final class C4880q implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return ((String) ((Map.Entry) obj2).getKey()).length() - ((String) ((Map.Entry) obj).getKey()).length();
    }
}
