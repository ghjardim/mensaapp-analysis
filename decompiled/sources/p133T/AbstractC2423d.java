package p133T;

import androidx.datastore.preferences.protobuf.C3313v;
import java.io.InputStream;
import kotlin.jvm.internal.AbstractC5464g;
import kotlin.jvm.internal.AbstractC5469l;
import p112Q.C1982c;

/* renamed from: T.d */
/* loaded from: classes.dex */
public abstract class AbstractC2423d {

    /* renamed from: a */
    public static final a f7169a = new a(null);

    /* renamed from: T.d$a */
    public static final class a {
        public /* synthetic */ a(AbstractC5464g abstractC5464g) {
            this();
        }

        /* renamed from: a */
        public final C2425f m8212a(InputStream input) {
            AbstractC5469l.m23028e(input, "input");
            try {
                C2425f m8216V = C2425f.m8216V(input);
                AbstractC5469l.m23027d(m8216V, "{\n                Prefer…From(input)\n            }");
                return m8216V;
            } catch (C3313v e7) {
                throw new C1982c("Unable to parse preferences proto.", e7);
            }
        }

        public a() {
        }
    }
}
