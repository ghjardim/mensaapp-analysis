package p170Y1;

import org.apache.tika.utils.StringUtils;
import p149V1.AbstractC2611d;
import p149V1.C2610c;
import p149V1.InterfaceC2614g;
import p170Y1.AbstractC2907n;

/* renamed from: Y1.c */
/* loaded from: classes.dex */
public final class C2896c extends AbstractC2907n {

    /* renamed from: a */
    public final AbstractC2908o f8940a;

    /* renamed from: b */
    public final String f8941b;

    /* renamed from: c */
    public final AbstractC2611d f8942c;

    /* renamed from: d */
    public final InterfaceC2614g f8943d;

    /* renamed from: e */
    public final C2610c f8944e;

    /* renamed from: Y1.c$b */
    public static final class b extends AbstractC2907n.a {

        /* renamed from: a */
        public AbstractC2908o f8945a;

        /* renamed from: b */
        public String f8946b;

        /* renamed from: c */
        public AbstractC2611d f8947c;

        /* renamed from: d */
        public InterfaceC2614g f8948d;

        /* renamed from: e */
        public C2610c f8949e;

        @Override // p170Y1.AbstractC2907n.a
        /* renamed from: a */
        public AbstractC2907n mo10449a() {
            AbstractC2908o abstractC2908o = this.f8945a;
            String str = StringUtils.EMPTY;
            if (abstractC2908o == null) {
                str = StringUtils.EMPTY + " transportContext";
            }
            if (this.f8946b == null) {
                str = str + " transportName";
            }
            if (this.f8947c == null) {
                str = str + " event";
            }
            if (this.f8948d == null) {
                str = str + " transformer";
            }
            if (this.f8949e == null) {
                str = str + " encoding";
            }
            if (str.isEmpty()) {
                return new C2896c(this.f8945a, this.f8946b, this.f8947c, this.f8948d, this.f8949e);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // p170Y1.AbstractC2907n.a
        /* renamed from: b */
        public AbstractC2907n.a mo10450b(C2610c c2610c) {
            if (c2610c == null) {
                throw new NullPointerException("Null encoding");
            }
            this.f8949e = c2610c;
            return this;
        }

        @Override // p170Y1.AbstractC2907n.a
        /* renamed from: c */
        public AbstractC2907n.a mo10451c(AbstractC2611d abstractC2611d) {
            if (abstractC2611d == null) {
                throw new NullPointerException("Null event");
            }
            this.f8947c = abstractC2611d;
            return this;
        }

        @Override // p170Y1.AbstractC2907n.a
        /* renamed from: d */
        public AbstractC2907n.a mo10452d(InterfaceC2614g interfaceC2614g) {
            if (interfaceC2614g == null) {
                throw new NullPointerException("Null transformer");
            }
            this.f8948d = interfaceC2614g;
            return this;
        }

        @Override // p170Y1.AbstractC2907n.a
        /* renamed from: e */
        public AbstractC2907n.a mo10453e(AbstractC2908o abstractC2908o) {
            if (abstractC2908o == null) {
                throw new NullPointerException("Null transportContext");
            }
            this.f8945a = abstractC2908o;
            return this;
        }

        @Override // p170Y1.AbstractC2907n.a
        /* renamed from: f */
        public AbstractC2907n.a mo10454f(String str) {
            if (str == null) {
                throw new NullPointerException("Null transportName");
            }
            this.f8946b = str;
            return this;
        }
    }

    @Override // p170Y1.AbstractC2907n
    /* renamed from: b */
    public C2610c mo10444b() {
        return this.f8944e;
    }

    @Override // p170Y1.AbstractC2907n
    /* renamed from: c */
    public AbstractC2611d mo10445c() {
        return this.f8942c;
    }

    @Override // p170Y1.AbstractC2907n
    /* renamed from: e */
    public InterfaceC2614g mo10446e() {
        return this.f8943d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC2907n)) {
            return false;
        }
        AbstractC2907n abstractC2907n = (AbstractC2907n) obj;
        return this.f8940a.equals(abstractC2907n.mo10447f()) && this.f8941b.equals(abstractC2907n.mo10448g()) && this.f8942c.equals(abstractC2907n.mo10445c()) && this.f8943d.equals(abstractC2907n.mo10446e()) && this.f8944e.equals(abstractC2907n.mo10444b());
    }

    @Override // p170Y1.AbstractC2907n
    /* renamed from: f */
    public AbstractC2908o mo10447f() {
        return this.f8940a;
    }

    @Override // p170Y1.AbstractC2907n
    /* renamed from: g */
    public String mo10448g() {
        return this.f8941b;
    }

    public int hashCode() {
        return ((((((((this.f8940a.hashCode() ^ 1000003) * 1000003) ^ this.f8941b.hashCode()) * 1000003) ^ this.f8942c.hashCode()) * 1000003) ^ this.f8943d.hashCode()) * 1000003) ^ this.f8944e.hashCode();
    }

    public String toString() {
        return "SendRequest{transportContext=" + this.f8940a + ", transportName=" + this.f8941b + ", event=" + this.f8942c + ", transformer=" + this.f8943d + ", encoding=" + this.f8944e + "}";
    }

    public C2896c(AbstractC2908o abstractC2908o, String str, AbstractC2611d abstractC2611d, InterfaceC2614g interfaceC2614g, C2610c c2610c) {
        this.f8940a = abstractC2908o;
        this.f8941b = str;
        this.f8942c = abstractC2611d;
        this.f8943d = interfaceC2614g;
        this.f8944e = c2610c;
    }
}
