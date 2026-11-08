package p212d4;

import java.util.HashSet;
import java.util.Set;
import p256j$.util.DesugarCollections;

/* renamed from: d4.d */
/* loaded from: classes.dex */
public class C4122d {

    /* renamed from: b */
    public static volatile C4122d f13831b;

    /* renamed from: a */
    public final Set f13832a = new HashSet();

    /* renamed from: a */
    public static C4122d m17308a() {
        C4122d c4122d = f13831b;
        if (c4122d == null) {
            synchronized (C4122d.class) {
                try {
                    c4122d = f13831b;
                    if (c4122d == null) {
                        c4122d = new C4122d();
                        f13831b = c4122d;
                    }
                } finally {
                }
            }
        }
        return c4122d;
    }

    /* renamed from: b */
    public Set m17309b() {
        Set unmodifiableSet;
        synchronized (this.f13832a) {
            unmodifiableSet = DesugarCollections.unmodifiableSet(this.f13832a);
        }
        return unmodifiableSet;
    }
}
