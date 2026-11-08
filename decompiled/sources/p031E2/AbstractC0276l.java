package p031E2;

import java.util.HashMap;

/* renamed from: E2.l */
/* loaded from: classes.dex */
public abstract class AbstractC0276l {
    /* renamed from: a */
    public static void m1129a(StringBuilder sb, HashMap hashMap) {
        sb.append("{");
        boolean z6 = true;
        for (String str : hashMap.keySet()) {
            if (!z6) {
                sb.append(",");
            }
            String str2 = (String) hashMap.get(str);
            sb.append("\"");
            sb.append(str);
            sb.append("\":");
            if (str2 == null) {
                sb.append("null");
            } else {
                sb.append("\"");
                sb.append(str2);
                sb.append("\"");
            }
            z6 = false;
        }
        sb.append("}");
    }
}
