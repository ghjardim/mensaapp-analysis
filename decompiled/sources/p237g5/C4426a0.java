package p237g5;

import java.io.InputStream;
import java.util.concurrent.atomic.AtomicReferenceArray;
import p171Y2.AbstractC2926i;
import p171Y2.AbstractC2932o;

/* renamed from: g5.a0 */
/* loaded from: classes2.dex */
public final class C4426a0 {

    /* renamed from: a */
    public final d f15696a;

    /* renamed from: b */
    public final String f15697b;

    /* renamed from: c */
    public final String f15698c;

    /* renamed from: d */
    public final c f15699d;

    /* renamed from: e */
    public final c f15700e;

    /* renamed from: f */
    public final Object f15701f;

    /* renamed from: g */
    public final boolean f15702g;

    /* renamed from: h */
    public final boolean f15703h;

    /* renamed from: i */
    public final boolean f15704i;

    /* renamed from: j */
    public final AtomicReferenceArray f15705j;

    /* renamed from: g5.a0$b */
    public static final class b {

        /* renamed from: a */
        public c f15706a;

        /* renamed from: b */
        public c f15707b;

        /* renamed from: c */
        public d f15708c;

        /* renamed from: d */
        public String f15709d;

        /* renamed from: e */
        public boolean f15710e;

        /* renamed from: f */
        public boolean f15711f;

        /* renamed from: g */
        public Object f15712g;

        /* renamed from: h */
        public boolean f15713h;

        /* renamed from: a */
        public C4426a0 m18836a() {
            return new C4426a0(this.f15708c, this.f15709d, this.f15706a, this.f15707b, this.f15712g, this.f15710e, this.f15711f, this.f15713h);
        }

        /* renamed from: b */
        public b m18837b(String str) {
            this.f15709d = str;
            return this;
        }

        /* renamed from: c */
        public b m18838c(c cVar) {
            this.f15706a = cVar;
            return this;
        }

        /* renamed from: d */
        public b m18839d(c cVar) {
            this.f15707b = cVar;
            return this;
        }

        /* renamed from: e */
        public b m18840e(boolean z6) {
            this.f15713h = z6;
            return this;
        }

        /* renamed from: f */
        public b m18841f(d dVar) {
            this.f15708c = dVar;
            return this;
        }

        public b() {
        }
    }

    /* renamed from: g5.a0$c */
    public interface c {
        /* renamed from: a */
        Object mo18842a(InputStream inputStream);

        /* renamed from: b */
        InputStream mo18843b(Object obj);
    }

    /* renamed from: g5.a0$d */
    public enum d {
        UNARY,
        CLIENT_STREAMING,
        SERVER_STREAMING,
        BIDI_STREAMING,
        UNKNOWN;

        /* renamed from: b */
        public final boolean m18844b() {
            return this == UNARY || this == SERVER_STREAMING;
        }
    }

    /* renamed from: a */
    public static String m18826a(String str) {
        int lastIndexOf = ((String) AbstractC2932o.m10573p(str, "fullMethodName")).lastIndexOf(47);
        if (lastIndexOf == -1) {
            return null;
        }
        return str.substring(0, lastIndexOf);
    }

    /* renamed from: b */
    public static String m18827b(String str, String str2) {
        return ((String) AbstractC2932o.m10573p(str, "fullServiceName")) + "/" + ((String) AbstractC2932o.m10573p(str2, "methodName"));
    }

    /* renamed from: g */
    public static b m18828g() {
        return m18829h(null, null);
    }

    /* renamed from: h */
    public static b m18829h(c cVar, c cVar2) {
        return new b().m18838c(cVar).m18839d(cVar2);
    }

    /* renamed from: c */
    public String m18830c() {
        return this.f15697b;
    }

    /* renamed from: d */
    public String m18831d() {
        return this.f15698c;
    }

    /* renamed from: e */
    public d m18832e() {
        return this.f15696a;
    }

    /* renamed from: f */
    public boolean m18833f() {
        return this.f15703h;
    }

    /* renamed from: i */
    public Object m18834i(InputStream inputStream) {
        return this.f15700e.mo18842a(inputStream);
    }

    /* renamed from: j */
    public InputStream m18835j(Object obj) {
        return this.f15699d.mo18843b(obj);
    }

    public String toString() {
        return AbstractC2926i.m10535c(this).m10540d("fullMethodName", this.f15697b).m10540d("type", this.f15696a).m10541e("idempotent", this.f15702g).m10541e("safe", this.f15703h).m10541e("sampledToLocalTracing", this.f15704i).m10540d("requestMarshaller", this.f15699d).m10540d("responseMarshaller", this.f15700e).m10540d("schemaDescriptor", this.f15701f).m10548m().toString();
    }

    public C4426a0(d dVar, String str, c cVar, c cVar2, Object obj, boolean z6, boolean z7, boolean z8) {
        this.f15705j = new AtomicReferenceArray(2);
        this.f15696a = (d) AbstractC2932o.m10573p(dVar, "type");
        this.f15697b = (String) AbstractC2932o.m10573p(str, "fullMethodName");
        this.f15698c = m18826a(str);
        this.f15699d = (c) AbstractC2932o.m10573p(cVar, "requestMarshaller");
        this.f15700e = (c) AbstractC2932o.m10573p(cVar2, "responseMarshaller");
        this.f15701f = obj;
        this.f15702g = z6;
        this.f15703h = z7;
        this.f15704i = z8;
    }
}
