package p384y4;

import io.flutter.embedding.engine.C4659a;
import java.util.HashMap;
import java.util.Map;

/* renamed from: y4.a */
/* loaded from: classes.dex */
public class C7075a {

    /* renamed from: b */
    public static C7075a f25149b;

    /* renamed from: a */
    public final Map f25150a = new HashMap();

    /* renamed from: b */
    public static C7075a m29149b() {
        if (f25149b == null) {
            f25149b = new C7075a();
        }
        return f25149b;
    }

    /* renamed from: a */
    public C4659a m29150a(String str) {
        return (C4659a) this.f25150a.get(str);
    }

    /* renamed from: c */
    public void m29151c(String str, C4659a c4659a) {
        if (c4659a != null) {
            this.f25150a.put(str, c4659a);
        } else {
            this.f25150a.remove(str);
        }
    }

    /* renamed from: d */
    public void m29152d(String str) {
        m29151c(str, null);
    }
}
