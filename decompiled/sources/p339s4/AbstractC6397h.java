package p339s4;

import java.util.HashMap;
import java.util.Map;
import p323q4.C6197D;

/* renamed from: s4.h */
/* loaded from: classes.dex */
public abstract class AbstractC6397h {
    /* renamed from: a */
    public static Map m26719a(InterfaceC6394e interfaceC6394e) {
        C6197D mo26701d = interfaceC6394e.mo26701d();
        if (mo26701d == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("sql", mo26701d.m25898c());
        hashMap.put("arguments", mo26701d.m25897b());
        return hashMap;
    }
}
