package p061I4;

import java.util.Map;
import org.json.JSONObject;

/* renamed from: I4.j */
/* loaded from: classes.dex */
public final class C0658j {

    /* renamed from: a */
    public final String f2254a;

    /* renamed from: b */
    public final Object f2255b;

    public C0658j(String str, Object obj) {
        this.f2254a = str;
        this.f2255b = obj;
    }

    /* renamed from: a */
    public Object m2647a(String str) {
        Object obj = this.f2255b;
        if (obj == null) {
            return null;
        }
        if (obj instanceof Map) {
            return ((Map) obj).get(str);
        }
        if (obj instanceof JSONObject) {
            return ((JSONObject) obj).opt(str);
        }
        throw new ClassCastException();
    }

    /* renamed from: b */
    public Object m2648b() {
        return this.f2255b;
    }

    /* renamed from: c */
    public boolean m2649c(String str) {
        Object obj = this.f2255b;
        if (obj == null) {
            return false;
        }
        if (obj instanceof Map) {
            return ((Map) obj).containsKey(str);
        }
        if (obj instanceof JSONObject) {
            return ((JSONObject) obj).has(str);
        }
        throw new ClassCastException();
    }
}
