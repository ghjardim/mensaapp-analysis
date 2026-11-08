package p313p2;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC3798p;
import com.google.android.gms.common.internal.AbstractC3802r;
import p080L2.C0980t;
import p382y2.AbstractC7065a;
import p382y2.AbstractC7067c;

/* renamed from: p2.l */
/* loaded from: classes.dex */
public final class C6117l extends AbstractC7065a {
    public static final Parcelable.Creator<C6117l> CREATOR = new C6103E();

    /* renamed from: a */
    public final String f21869a;

    /* renamed from: b */
    public final String f21870b;

    /* renamed from: c */
    public final String f21871c;

    /* renamed from: d */
    public final String f21872d;

    /* renamed from: e */
    public final Uri f21873e;

    /* renamed from: f */
    public final String f21874f;

    /* renamed from: n */
    public final String f21875n;

    /* renamed from: o */
    public final String f21876o;

    /* renamed from: p */
    public final C0980t f21877p;

    public C6117l(String str, String str2, String str3, String str4, Uri uri, String str5, String str6, String str7, C0980t c0980t) {
        this.f21869a = (String) AbstractC3802r.m15129k(str);
        this.f21870b = str2;
        this.f21871c = str3;
        this.f21872d = str4;
        this.f21873e = uri;
        this.f21874f = str5;
        this.f21875n = str6;
        this.f21876o = str7;
        this.f21877p = c0980t;
    }

    /* renamed from: A0 */
    public String m25513A0() {
        return this.f21869a;
    }

    /* renamed from: B0 */
    public String m25514B0() {
        return this.f21874f;
    }

    /* renamed from: C0 */
    public Uri m25515C0() {
        return this.f21873e;
    }

    /* renamed from: D0 */
    public C0980t m25516D0() {
        return this.f21877p;
    }

    /* renamed from: M */
    public String m25517M() {
        return this.f21870b;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C6117l)) {
            return false;
        }
        C6117l c6117l = (C6117l) obj;
        return AbstractC3798p.m15099b(this.f21869a, c6117l.f21869a) && AbstractC3798p.m15099b(this.f21870b, c6117l.f21870b) && AbstractC3798p.m15099b(this.f21871c, c6117l.f21871c) && AbstractC3798p.m15099b(this.f21872d, c6117l.f21872d) && AbstractC3798p.m15099b(this.f21873e, c6117l.f21873e) && AbstractC3798p.m15099b(this.f21874f, c6117l.f21874f) && AbstractC3798p.m15099b(this.f21875n, c6117l.f21875n) && AbstractC3798p.m15099b(this.f21876o, c6117l.f21876o) && AbstractC3798p.m15099b(this.f21877p, c6117l.f21877p);
    }

    public int hashCode() {
        return AbstractC3798p.m15100c(this.f21869a, this.f21870b, this.f21871c, this.f21872d, this.f21873e, this.f21874f, this.f21875n, this.f21876o, this.f21877p);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        int m29117a = AbstractC7067c.m29117a(parcel);
        AbstractC7067c.m29108E(parcel, 1, m25513A0(), false);
        AbstractC7067c.m29108E(parcel, 2, m25517M(), false);
        AbstractC7067c.m29108E(parcel, 3, m25520y0(), false);
        AbstractC7067c.m29108E(parcel, 4, m25518x0(), false);
        AbstractC7067c.m29106C(parcel, 5, m25515C0(), i7, false);
        AbstractC7067c.m29108E(parcel, 6, m25514B0(), false);
        AbstractC7067c.m29108E(parcel, 7, m25521z0(), false);
        AbstractC7067c.m29108E(parcel, 8, m25519y(), false);
        AbstractC7067c.m29106C(parcel, 9, m25516D0(), i7, false);
        AbstractC7067c.m29118b(parcel, m29117a);
    }

    /* renamed from: x0 */
    public String m25518x0() {
        return this.f21872d;
    }

    /* renamed from: y */
    public String m25519y() {
        return this.f21876o;
    }

    /* renamed from: y0 */
    public String m25520y0() {
        return this.f21871c;
    }

    /* renamed from: z0 */
    public String m25521z0() {
        return this.f21875n;
    }
}
