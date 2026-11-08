package p256j$.time.format;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

/* renamed from: j$.time.format.r */
/* loaded from: classes3.dex */
final class C4881r {

    /* renamed from: a */
    private final Map f18014a;

    C4881r(Map map) {
        Comparator comparator;
        Comparator comparator2;
        this.f18014a = map;
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            HashMap hashMap2 = new HashMap();
            for (Map.Entry entry2 : ((Map) entry.getValue()).entrySet()) {
                String str = (String) entry2.getValue();
                String str2 = (String) entry2.getValue();
                Long l7 = (Long) entry2.getKey();
                int i7 = C4865b.f17976c;
                hashMap2.put(str, new AbstractMap.SimpleImmutableEntry(str2, l7));
            }
            ArrayList arrayList2 = new ArrayList(hashMap2.values());
            comparator2 = C4865b.f17975b;
            Collections.sort(arrayList2, comparator2);
            hashMap.put((EnumC4885v) entry.getKey(), arrayList2);
            arrayList.addAll(arrayList2);
            hashMap.put(null, arrayList);
        }
        comparator = C4865b.f17975b;
        Collections.sort(arrayList, comparator);
    }

    /* renamed from: a */
    final String m21107a(long j7, EnumC4885v enumC4885v) {
        Map map = (Map) this.f18014a.get(enumC4885v);
        if (map != null) {
            return (String) map.get(Long.valueOf(j7));
        }
        return null;
    }
}
