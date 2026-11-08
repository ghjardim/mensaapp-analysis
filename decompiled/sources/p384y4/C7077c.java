package p384y4;

import io.flutter.embedding.engine.C4660b;
import java.util.HashMap;
import java.util.Map;

/* renamed from: y4.c */
/* loaded from: classes.dex */
public class C7077c {

    /* renamed from: b */
    public static volatile C7077c f25173b;

    /* renamed from: a */
    public final Map f25174a = new HashMap();

    /* renamed from: b */
    public static C7077c m29174b() {
        if (f25173b == null) {
            synchronized (C7077c.class) {
                try {
                    if (f25173b == null) {
                        f25173b = new C7077c();
                    }
                } finally {
                }
            }
        }
        return f25173b;
    }

    /* renamed from: a */
    public C4660b m29175a(String str) {
        return (C4660b) this.f25174a.get(str);
    }
}
