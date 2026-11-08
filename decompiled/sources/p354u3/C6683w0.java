package p354u3;

/* renamed from: u3.w0 */
/* loaded from: classes.dex */
public final class C6683w0 extends AbstractC6675s0 {

    /* renamed from: a */
    public final String f24097a;

    /* renamed from: b */
    public final String f24098b;

    /* renamed from: c */
    public final String f24099c;

    @Override // p354u3.AbstractC6675s0
    /* renamed from: b */
    public final String mo27584b() {
        return this.f24098b;
    }

    @Override // p354u3.AbstractC6675s0
    /* renamed from: c */
    public final String mo27585c() {
        return this.f24099c;
    }

    @Override // p354u3.AbstractC6675s0
    /* renamed from: d */
    public final String mo27586d() {
        return this.f24097a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC6675s0) {
            AbstractC6675s0 abstractC6675s0 = (AbstractC6675s0) obj;
            String str = this.f24097a;
            if (str != null ? str.equals(abstractC6675s0.mo27586d()) : abstractC6675s0.mo27586d() == null) {
                String str2 = this.f24098b;
                if (str2 != null ? str2.equals(abstractC6675s0.mo27584b()) : abstractC6675s0.mo27584b() == null) {
                    String str3 = this.f24099c;
                    if (str3 != null ? str3.equals(abstractC6675s0.mo27585c()) : abstractC6675s0.mo27585c() == null) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f24097a;
        int hashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        String str2 = this.f24098b;
        int hashCode2 = (hashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f24099c;
        return hashCode2 ^ (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        return "AttestationResult{recaptchaV2Token=" + this.f24097a + ", playIntegrityToken=" + this.f24098b + ", recaptchaEnterpriseToken=" + this.f24099c + "}";
    }

    public C6683w0(String str, String str2, String str3) {
        this.f24097a = str;
        this.f24098b = str2;
        this.f24099c = str3;
    }
}
