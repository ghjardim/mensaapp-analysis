package p346t3;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.AbstractC3802r;
import p382y2.AbstractC7067c;

/* renamed from: t3.O */
/* loaded from: classes.dex */
public class C6483O extends AbstractC6508h implements Cloneable {
    public static final Parcelable.Creator<C6483O> CREATOR = new C6527q0();

    /* renamed from: a */
    public String f23387a;

    /* renamed from: b */
    public String f23388b;

    /* renamed from: c */
    public String f23389c;

    /* renamed from: d */
    public boolean f23390d;

    /* renamed from: e */
    public String f23391e;

    public C6483O(String str, String str2, String str3, boolean z6, String str4) {
        AbstractC3802r.m15120b(((TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) && (TextUtils.isEmpty(str3) || TextUtils.isEmpty(str4))) ? false : true, "Cannot create PhoneAuthCredential without either sessionInfo + smsCode or temporary proof + phoneNumber.");
        this.f23387a = str;
        this.f23388b = str2;
        this.f23389c = str3;
        this.f23390d = z6;
        this.f23391e = str4;
    }

    /* renamed from: B0 */
    public static C6483O m27032B0(String str, String str2) {
        return new C6483O(str, str2, null, true, null);
    }

    /* renamed from: E0 */
    public static C6483O m27033E0(String str, String str2) {
        return new C6483O(null, null, str, true, str2);
    }

    /* renamed from: A0 */
    public String m27034A0() {
        return this.f23388b;
    }

    /* renamed from: C0 */
    public final C6483O m27035C0(boolean z6) {
        this.f23390d = false;
        return this;
    }

    /* renamed from: D0 */
    public final String m27036D0() {
        return this.f23389c;
    }

    /* renamed from: F0 */
    public final boolean m27037F0() {
        return this.f23390d;
    }

    public /* synthetic */ Object clone() {
        return new C6483O(this.f23387a, m27034A0(), this.f23389c, this.f23390d, this.f23391e);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        int m29117a = AbstractC7067c.m29117a(parcel);
        AbstractC7067c.m29108E(parcel, 1, this.f23387a, false);
        AbstractC7067c.m29108E(parcel, 2, m27034A0(), false);
        AbstractC7067c.m29108E(parcel, 4, this.f23389c, false);
        AbstractC7067c.m29123g(parcel, 5, this.f23390d);
        AbstractC7067c.m29108E(parcel, 6, this.f23391e, false);
        AbstractC7067c.m29118b(parcel, m29117a);
    }

    @Override // p346t3.AbstractC6508h
    /* renamed from: x0 */
    public String mo26997x0() {
        return "phone";
    }

    @Override // p346t3.AbstractC6508h
    /* renamed from: y0 */
    public String mo26998y0() {
        return "phone";
    }

    @Override // p346t3.AbstractC6508h
    /* renamed from: z0 */
    public final AbstractC6508h mo26999z0() {
        return (C6483O) clone();
    }

    public final String zzc() {
        return this.f23387a;
    }

    public final String zzd() {
        return this.f23391e;
    }
}
