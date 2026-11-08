package p313p2;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.internal.AbstractC3798p;
import com.google.android.gms.common.internal.AbstractC3802r;
import java.util.List;
import p382y2.AbstractC7065a;
import p382y2.AbstractC7067c;

/* renamed from: p2.a */
/* loaded from: classes.dex */
public final class C6106a extends AbstractC7065a {
    public static final Parcelable.Creator<C6106a> CREATOR = new C6122q();

    /* renamed from: a */
    public final String f21801a;

    /* renamed from: b */
    public final String f21802b;

    /* renamed from: c */
    public final String f21803c;

    /* renamed from: d */
    public final List f21804d;

    /* renamed from: e */
    public final GoogleSignInAccount f21805e;

    /* renamed from: f */
    public final PendingIntent f21806f;

    public C6106a(String str, String str2, String str3, List list, GoogleSignInAccount googleSignInAccount, PendingIntent pendingIntent) {
        this.f21801a = str;
        this.f21802b = str2;
        this.f21803c = str3;
        this.f21804d = (List) AbstractC3802r.m15129k(list);
        this.f21806f = pendingIntent;
        this.f21805e = googleSignInAccount;
    }

    /* renamed from: A0 */
    public String m25443A0() {
        return this.f21801a;
    }

    /* renamed from: B0 */
    public GoogleSignInAccount m25444B0() {
        return this.f21805e;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C6106a)) {
            return false;
        }
        C6106a c6106a = (C6106a) obj;
        return AbstractC3798p.m15099b(this.f21801a, c6106a.f21801a) && AbstractC3798p.m15099b(this.f21802b, c6106a.f21802b) && AbstractC3798p.m15099b(this.f21803c, c6106a.f21803c) && AbstractC3798p.m15099b(this.f21804d, c6106a.f21804d) && AbstractC3798p.m15099b(this.f21806f, c6106a.f21806f) && AbstractC3798p.m15099b(this.f21805e, c6106a.f21805e);
    }

    public int hashCode() {
        return AbstractC3798p.m15100c(this.f21801a, this.f21802b, this.f21803c, this.f21804d, this.f21806f, this.f21805e);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        int m29117a = AbstractC7067c.m29117a(parcel);
        AbstractC7067c.m29108E(parcel, 1, m25443A0(), false);
        AbstractC7067c.m29108E(parcel, 2, m25445x0(), false);
        AbstractC7067c.m29108E(parcel, 3, this.f21803c, false);
        AbstractC7067c.m29110G(parcel, 4, m25446y0(), false);
        AbstractC7067c.m29106C(parcel, 5, m25444B0(), i7, false);
        AbstractC7067c.m29106C(parcel, 6, m25447z0(), i7, false);
        AbstractC7067c.m29118b(parcel, m29117a);
    }

    /* renamed from: x0 */
    public String m25445x0() {
        return this.f21802b;
    }

    /* renamed from: y0 */
    public List m25446y0() {
        return this.f21804d;
    }

    /* renamed from: z0 */
    public PendingIntent m25447z0() {
        return this.f21806f;
    }
}
