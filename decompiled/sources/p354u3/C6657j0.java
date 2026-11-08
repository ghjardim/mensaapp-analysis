package p354u3;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import com.google.android.gms.common.internal.AbstractC3802r;
import com.google.firebase.auth.FirebaseAuth;
import p346t3.AbstractC6458A;
import p346t3.InterfaceC6493Z;

/* renamed from: u3.j0 */
/* loaded from: classes.dex */
public final class C6657j0 implements InterfaceC6493Z {

    /* renamed from: a */
    public final String f24044a;

    /* renamed from: b */
    public final String f24045b;

    /* renamed from: c */
    public final int f24046c;

    /* renamed from: d */
    public final int f24047d;

    /* renamed from: e */
    public final long f24048e;

    /* renamed from: f */
    public String f24049f;

    /* renamed from: g */
    public FirebaseAuth f24050g;

    public C6657j0(String str, String str2, int i7, int i8, long j7, String str3, FirebaseAuth firebaseAuth) {
        AbstractC3802r.m15124f(str3, "sessionInfo cannot be empty.");
        AbstractC3802r.m15130l(firebaseAuth, "firebaseAuth cannot be null.");
        this.f24044a = AbstractC3802r.m15124f(str, "sharedSecretKey cannot be empty. This is required to generate QR code URL.");
        this.f24045b = AbstractC3802r.m15124f(str2, "hashAlgorithm cannot be empty.");
        this.f24046c = i7;
        this.f24047d = i8;
        this.f24048e = j7;
        this.f24049f = str3;
        this.f24050g = firebaseAuth;
    }

    @Override // p346t3.InterfaceC6493Z
    /* renamed from: a */
    public final String mo27052a() {
        return this.f24045b;
    }

    @Override // p346t3.InterfaceC6493Z
    /* renamed from: b */
    public final int mo27053b() {
        return this.f24046c;
    }

    @Override // p346t3.InterfaceC6493Z
    /* renamed from: c */
    public final String mo27054c() {
        return this.f24049f;
    }

    @Override // p346t3.InterfaceC6493Z
    /* renamed from: d */
    public final String mo27055d(String str, String str2) {
        AbstractC3802r.m15124f(str, "accountName cannot be empty.");
        AbstractC3802r.m15124f(str2, "issuer cannot be empty.");
        return String.format(null, "otpauth://totp/%s:%s?secret=%s&issuer=%s&algorithm=%s&digits=%d", str2, str, this.f24044a, str2, this.f24045b, Integer.valueOf(this.f24046c));
    }

    @Override // p346t3.InterfaceC6493Z
    /* renamed from: e */
    public final String mo27056e() {
        return mo27055d(AbstractC3802r.m15124f(((AbstractC6458A) AbstractC3802r.m15130l(this.f24050g.m15361m(), "Current user cannot be null, since user is required to be logged in to enroll for TOTP MFA.")).mo26980f0(), "Email cannot be empty, since verified email is required to use MFA."), this.f24050g.m15359l().m17533q());
    }

    @Override // p346t3.InterfaceC6493Z
    /* renamed from: f */
    public final long mo27057f() {
        return this.f24048e;
    }

    @Override // p346t3.InterfaceC6493Z
    /* renamed from: g */
    public final int mo27058g() {
        return this.f24047d;
    }

    @Override // p346t3.InterfaceC6493Z
    /* renamed from: h */
    public final void mo27059h(String str) {
        AbstractC3802r.m15124f(str, "qrCodeUrl cannot be empty.");
        try {
            m27556j(str);
        } catch (ActivityNotFoundException unused) {
            m27556j("https://play.google.com/store/search?q=otpauth&c=apps");
        }
    }

    @Override // p346t3.InterfaceC6493Z
    /* renamed from: i */
    public final String mo27060i() {
        return this.f24044a;
    }

    /* renamed from: j */
    public final void m27556j(String str) {
        this.f24050g.m15359l().m17532m().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)).addFlags(268435456));
    }
}
