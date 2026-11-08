package p346t3;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.AbstractC3802r;
import p382y2.AbstractC7067c;

/* renamed from: t3.j */
/* loaded from: classes.dex */
public class C6512j extends AbstractC6508h {
    public static final Parcelable.Creator<C6512j> CREATOR = new C6459A0();

    /* renamed from: a */
    public String f23449a;

    /* renamed from: b */
    public String f23450b;

    /* renamed from: c */
    public final String f23451c;

    /* renamed from: d */
    public String f23452d;

    /* renamed from: e */
    public boolean f23453e;

    public C6512j(String str, String str2) {
        this(str, str2, null, null, false);
    }

    /* renamed from: B0 */
    public static boolean m27114B0(String str) {
        C6504f m27102c;
        return (TextUtils.isEmpty(str) || (m27102c = C6504f.m27102c(str)) == null || m27102c.m27105b() != 4) ? false : true;
    }

    /* renamed from: A0 */
    public final C6512j m27115A0(AbstractC6458A abstractC6458A) {
        this.f23452d = abstractC6458A.zze();
        this.f23453e = true;
        return this;
    }

    /* renamed from: C0 */
    public final String m27116C0() {
        return this.f23452d;
    }

    /* renamed from: D0 */
    public final boolean m27117D0() {
        return !TextUtils.isEmpty(this.f23451c);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        int m29117a = AbstractC7067c.m29117a(parcel);
        AbstractC7067c.m29108E(parcel, 1, this.f23449a, false);
        AbstractC7067c.m29108E(parcel, 2, this.f23450b, false);
        AbstractC7067c.m29108E(parcel, 3, this.f23451c, false);
        AbstractC7067c.m29108E(parcel, 4, this.f23452d, false);
        AbstractC7067c.m29123g(parcel, 5, this.f23453e);
        AbstractC7067c.m29118b(parcel, m29117a);
    }

    @Override // p346t3.AbstractC6508h
    /* renamed from: x0 */
    public String mo26997x0() {
        return "password";
    }

    @Override // p346t3.AbstractC6508h
    /* renamed from: y0 */
    public String mo26998y0() {
        return !TextUtils.isEmpty(this.f23450b) ? "password" : "emailLink";
    }

    @Override // p346t3.AbstractC6508h
    /* renamed from: z0 */
    public final AbstractC6508h mo26999z0() {
        return new C6512j(this.f23449a, this.f23450b, this.f23451c, this.f23452d, this.f23453e);
    }

    public final String zzc() {
        return this.f23449a;
    }

    public final String zzd() {
        return this.f23450b;
    }

    public final String zze() {
        return this.f23451c;
    }

    public final boolean zzg() {
        return this.f23453e;
    }

    public C6512j(String str, String str2, String str3, String str4, boolean z6) {
        this.f23449a = AbstractC3802r.m15123e(str);
        if (TextUtils.isEmpty(str2) && TextUtils.isEmpty(str3)) {
            throw new IllegalArgumentException("Cannot create an EmailAuthCredential without a password or emailLink.");
        }
        this.f23450b = str2;
        this.f23451c = str3;
        this.f23452d = str4;
        this.f23453e = z6;
    }
}
