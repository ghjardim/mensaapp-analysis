package p032E3;

import p032E3.InterfaceC0292d;

/* renamed from: E3.a */
/* loaded from: classes.dex */
public final class C0289a {

    /* renamed from: a */
    public int f1114a;

    /* renamed from: b */
    public InterfaceC0292d.a f1115b = InterfaceC0292d.a.DEFAULT;

    /* renamed from: E3.a$a */
    public static final class a implements InterfaceC0292d {

        /* renamed from: a */
        public final int f1116a;

        /* renamed from: b */
        public final InterfaceC0292d.a f1117b;

        public a(int i7, InterfaceC0292d.a aVar) {
            this.f1116a = i7;
            this.f1117b = aVar;
        }

        @Override // java.lang.annotation.Annotation
        public Class annotationType() {
            return InterfaceC0292d.class;
        }

        @Override // java.lang.annotation.Annotation
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof InterfaceC0292d)) {
                return false;
            }
            InterfaceC0292d interfaceC0292d = (InterfaceC0292d) obj;
            return this.f1116a == interfaceC0292d.tag() && this.f1117b.equals(interfaceC0292d.intEncoding());
        }

        @Override // java.lang.annotation.Annotation
        public int hashCode() {
            return (14552422 ^ this.f1116a) + (this.f1117b.hashCode() ^ 2041407134);
        }

        @Override // p032E3.InterfaceC0292d
        public InterfaceC0292d.a intEncoding() {
            return this.f1117b;
        }

        @Override // p032E3.InterfaceC0292d
        public int tag() {
            return this.f1116a;
        }

        @Override // java.lang.annotation.Annotation
        public String toString() {
            return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.f1116a + "intEncoding=" + this.f1117b + ')';
        }
    }

    /* renamed from: b */
    public static C0289a m1156b() {
        return new C0289a();
    }

    /* renamed from: a */
    public InterfaceC0292d m1157a() {
        return new a(this.f1114a, this.f1115b);
    }

    /* renamed from: c */
    public C0289a m1158c(int i7) {
        this.f1114a = i7;
        return this;
    }
}
