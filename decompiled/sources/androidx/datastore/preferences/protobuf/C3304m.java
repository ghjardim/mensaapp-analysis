package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.AbstractC3311t;
import java.util.Collections;
import java.util.Map;
import p207d.AbstractC4094d;

/* renamed from: androidx.datastore.preferences.protobuf.m */
/* loaded from: classes.dex */
public class C3304m {

    /* renamed from: b */
    public static volatile C3304m f10570b;

    /* renamed from: c */
    public static final C3304m f10571c = new C3304m(true);

    /* renamed from: a */
    public final Map f10572a = Collections.emptyMap();

    /* renamed from: androidx.datastore.preferences.protobuf.m$a */
    public static final class a {

        /* renamed from: a */
        public final Object f10573a;

        /* renamed from: b */
        public final int f10574b;

        public a(Object obj, int i7) {
            this.f10573a = obj;
            this.f10574b = i7;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f10573a == aVar.f10573a && this.f10574b == aVar.f10574b;
        }

        public int hashCode() {
            return (System.identityHashCode(this.f10573a) * 65535) + this.f10574b;
        }
    }

    public C3304m(boolean z6) {
    }

    /* renamed from: b */
    public static C3304m m12753b() {
        if (C3274U.f10411d) {
            return f10571c;
        }
        C3304m c3304m = f10570b;
        if (c3304m == null) {
            synchronized (C3304m.class) {
                try {
                    c3304m = f10570b;
                    if (c3304m == null) {
                        c3304m = AbstractC3302l.m12750a();
                        f10570b = c3304m;
                    }
                } finally {
                }
            }
        }
        return c3304m;
    }

    /* renamed from: a */
    public AbstractC3311t.c m12754a(InterfaceC3264J interfaceC3264J, int i7) {
        AbstractC4094d.m17162a(this.f10572a.get(new a(interfaceC3264J, i7)));
        return null;
    }
}
