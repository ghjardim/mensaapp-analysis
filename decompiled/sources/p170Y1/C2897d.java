package p170Y1;

import java.util.Arrays;
import org.apache.tika.utils.StringUtils;
import p149V1.EnumC2612e;
import p170Y1.AbstractC2908o;

/* renamed from: Y1.d */
/* loaded from: classes.dex */
public final class C2897d extends AbstractC2908o {

    /* renamed from: a */
    public final String f8950a;

    /* renamed from: b */
    public final byte[] f8951b;

    /* renamed from: c */
    public final EnumC2612e f8952c;

    /* renamed from: Y1.d$b */
    public static final class b extends AbstractC2908o.a {

        /* renamed from: a */
        public String f8953a;

        /* renamed from: b */
        public byte[] f8954b;

        /* renamed from: c */
        public EnumC2612e f8955c;

        @Override // p170Y1.AbstractC2908o.a
        /* renamed from: a */
        public AbstractC2908o mo10458a() {
            String str = this.f8953a;
            String str2 = StringUtils.EMPTY;
            if (str == null) {
                str2 = StringUtils.EMPTY + " backendName";
            }
            if (this.f8955c == null) {
                str2 = str2 + " priority";
            }
            if (str2.isEmpty()) {
                return new C2897d(this.f8953a, this.f8954b, this.f8955c);
            }
            throw new IllegalStateException("Missing required properties:" + str2);
        }

        @Override // p170Y1.AbstractC2908o.a
        /* renamed from: b */
        public AbstractC2908o.a mo10459b(String str) {
            if (str == null) {
                throw new NullPointerException("Null backendName");
            }
            this.f8953a = str;
            return this;
        }

        @Override // p170Y1.AbstractC2908o.a
        /* renamed from: c */
        public AbstractC2908o.a mo10460c(byte[] bArr) {
            this.f8954b = bArr;
            return this;
        }

        @Override // p170Y1.AbstractC2908o.a
        /* renamed from: d */
        public AbstractC2908o.a mo10461d(EnumC2612e enumC2612e) {
            if (enumC2612e == null) {
                throw new NullPointerException("Null priority");
            }
            this.f8955c = enumC2612e;
            return this;
        }
    }

    @Override // p170Y1.AbstractC2908o
    /* renamed from: b */
    public String mo10455b() {
        return this.f8950a;
    }

    @Override // p170Y1.AbstractC2908o
    /* renamed from: c */
    public byte[] mo10456c() {
        return this.f8951b;
    }

    @Override // p170Y1.AbstractC2908o
    /* renamed from: d */
    public EnumC2612e mo10457d() {
        return this.f8952c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC2908o)) {
            return false;
        }
        AbstractC2908o abstractC2908o = (AbstractC2908o) obj;
        if (this.f8950a.equals(abstractC2908o.mo10455b())) {
            if (Arrays.equals(this.f8951b, abstractC2908o instanceof C2897d ? ((C2897d) abstractC2908o).f8951b : abstractC2908o.mo10456c()) && this.f8952c.equals(abstractC2908o.mo10457d())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((this.f8950a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f8951b)) * 1000003) ^ this.f8952c.hashCode();
    }

    public C2897d(String str, byte[] bArr, EnumC2612e enumC2612e) {
        this.f8950a = str;
        this.f8951b = bArr;
        this.f8952c = enumC2612e;
    }
}
