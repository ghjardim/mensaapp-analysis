package p177Z1;

import java.util.Arrays;
import org.apache.tika.utils.StringUtils;
import p177Z1.AbstractC2979f;

/* renamed from: Z1.a */
/* loaded from: classes.dex */
public final class C2974a extends AbstractC2979f {

    /* renamed from: a */
    public final Iterable f9127a;

    /* renamed from: b */
    public final byte[] f9128b;

    /* renamed from: Z1.a$b */
    public static final class b extends AbstractC2979f.a {

        /* renamed from: a */
        public Iterable f9129a;

        /* renamed from: b */
        public byte[] f9130b;

        @Override // p177Z1.AbstractC2979f.a
        /* renamed from: a */
        public AbstractC2979f mo10721a() {
            Iterable iterable = this.f9129a;
            String str = StringUtils.EMPTY;
            if (iterable == null) {
                str = StringUtils.EMPTY + " events";
            }
            if (str.isEmpty()) {
                return new C2974a(this.f9129a, this.f9130b);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // p177Z1.AbstractC2979f.a
        /* renamed from: b */
        public AbstractC2979f.a mo10722b(Iterable iterable) {
            if (iterable == null) {
                throw new NullPointerException("Null events");
            }
            this.f9129a = iterable;
            return this;
        }

        @Override // p177Z1.AbstractC2979f.a
        /* renamed from: c */
        public AbstractC2979f.a mo10723c(byte[] bArr) {
            this.f9130b = bArr;
            return this;
        }
    }

    @Override // p177Z1.AbstractC2979f
    /* renamed from: b */
    public Iterable mo10719b() {
        return this.f9127a;
    }

    @Override // p177Z1.AbstractC2979f
    /* renamed from: c */
    public byte[] mo10720c() {
        return this.f9128b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC2979f)) {
            return false;
        }
        AbstractC2979f abstractC2979f = (AbstractC2979f) obj;
        if (this.f9127a.equals(abstractC2979f.mo10719b())) {
            if (Arrays.equals(this.f9128b, abstractC2979f instanceof C2974a ? ((C2974a) abstractC2979f).f9128b : abstractC2979f.mo10720c())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.f9127a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f9128b);
    }

    public String toString() {
        return "BackendRequest{events=" + this.f9127a + ", extras=" + Arrays.toString(this.f9128b) + "}";
    }

    public C2974a(Iterable iterable, byte[] bArr) {
        this.f9127a = iterable;
        this.f9128b = bArr;
    }
}
