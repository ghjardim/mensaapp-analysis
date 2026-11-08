package p079L1;

import android.graphics.Rect;
import kotlin.jvm.internal.AbstractC5464g;
import kotlin.jvm.internal.AbstractC5469l;
import p058I1.C0618b;
import p079L1.InterfaceC0894c;

/* renamed from: L1.d */
/* loaded from: classes.dex */
public final class C0895d implements InterfaceC0894c {

    /* renamed from: d */
    public static final a f3117d = new a(null);

    /* renamed from: a */
    public final C0618b f3118a;

    /* renamed from: b */
    public final b f3119b;

    /* renamed from: c */
    public final InterfaceC0894c.b f3120c;

    /* renamed from: L1.d$a */
    public static final class a {
        public /* synthetic */ a(AbstractC5464g abstractC5464g) {
            this();
        }

        /* renamed from: a */
        public final void m3722a(C0618b bounds) {
            AbstractC5469l.m23028e(bounds, "bounds");
            if (bounds.m2503d() == 0 && bounds.m2500a() == 0) {
                throw new IllegalArgumentException("Bounds must be non zero");
            }
            if (bounds.m2501b() != 0 && bounds.m2502c() != 0) {
                throw new IllegalArgumentException("Bounding rectangle must start at the top or left window edge for folding features");
            }
        }

        public a() {
        }
    }

    /* renamed from: L1.d$b */
    public static final class b {

        /* renamed from: b */
        public static final a f3121b = new a(null);

        /* renamed from: c */
        public static final b f3122c = new b("FOLD");

        /* renamed from: d */
        public static final b f3123d = new b("HINGE");

        /* renamed from: a */
        public final String f3124a;

        /* renamed from: L1.d$b$a */
        public static final class a {
            public /* synthetic */ a(AbstractC5464g abstractC5464g) {
                this();
            }

            /* renamed from: a */
            public final b m3725a() {
                return b.f3122c;
            }

            /* renamed from: b */
            public final b m3726b() {
                return b.f3123d;
            }

            public a() {
            }
        }

        public b(String str) {
            this.f3124a = str;
        }

        public String toString() {
            return this.f3124a;
        }
    }

    public C0895d(C0618b featureBounds, b type, InterfaceC0894c.b state) {
        AbstractC5469l.m23028e(featureBounds, "featureBounds");
        AbstractC5469l.m23028e(type, "type");
        AbstractC5469l.m23028e(state, "state");
        this.f3118a = featureBounds;
        this.f3119b = type;
        this.f3120c = state;
        f3117d.m3722a(featureBounds);
    }

    @Override // p079L1.InterfaceC0892a
    /* renamed from: a */
    public Rect mo3718a() {
        return this.f3118a.m2505f();
    }

    @Override // p079L1.InterfaceC0894c
    /* renamed from: e */
    public InterfaceC0894c.b mo3720e() {
        return this.f3120c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!AbstractC5469l.m23024a(C0895d.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        AbstractC5469l.m23026c(obj, "null cannot be cast to non-null type androidx.window.layout.HardwareFoldingFeature");
        C0895d c0895d = (C0895d) obj;
        return AbstractC5469l.m23024a(this.f3118a, c0895d.f3118a) && AbstractC5469l.m23024a(this.f3119b, c0895d.f3119b) && AbstractC5469l.m23024a(mo3720e(), c0895d.mo3720e());
    }

    @Override // p079L1.InterfaceC0894c
    /* renamed from: f */
    public InterfaceC0894c.a mo3721f() {
        return (this.f3118a.m2503d() == 0 || this.f3118a.m2500a() == 0) ? InterfaceC0894c.a.f3110c : InterfaceC0894c.a.f3111d;
    }

    public int hashCode() {
        return (((this.f3118a.hashCode() * 31) + this.f3119b.hashCode()) * 31) + mo3720e().hashCode();
    }

    public String toString() {
        return C0895d.class.getSimpleName() + " { " + this.f3118a + ", type=" + this.f3119b + ", state=" + mo3720e() + " }";
    }
}
