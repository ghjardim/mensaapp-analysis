package com.google.android.gms.auth.api.signin;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.AbstractC3802r;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p031E2.C0271g;
import p031E2.InterfaceC0268d;
import p337s2.C6376e;
import p382y2.AbstractC7065a;
import p382y2.AbstractC7067c;

@Deprecated
/* loaded from: classes.dex */
public class GoogleSignInAccount extends AbstractC7065a implements ReflectedParcelable {
    public static final Parcelable.Creator<GoogleSignInAccount> CREATOR = new C6376e();

    /* renamed from: u */
    public static final InterfaceC0268d f12190u = C0271g.m1116d();

    /* renamed from: a */
    public final int f12191a;

    /* renamed from: b */
    public final String f12192b;

    /* renamed from: c */
    public final String f12193c;

    /* renamed from: d */
    public final String f12194d;

    /* renamed from: e */
    public final String f12195e;

    /* renamed from: f */
    public final Uri f12196f;

    /* renamed from: n */
    public String f12197n;

    /* renamed from: o */
    public final long f12198o;

    /* renamed from: p */
    public final String f12199p;

    /* renamed from: q */
    public final List f12200q;

    /* renamed from: r */
    public final String f12201r;

    /* renamed from: s */
    public final String f12202s;

    /* renamed from: t */
    public final Set f12203t = new HashSet();

    public GoogleSignInAccount(int i7, String str, String str2, String str3, String str4, Uri uri, String str5, long j7, String str6, List list, String str7, String str8) {
        this.f12191a = i7;
        this.f12192b = str;
        this.f12193c = str2;
        this.f12194d = str3;
        this.f12195e = str4;
        this.f12196f = uri;
        this.f12197n = str5;
        this.f12198o = j7;
        this.f12199p = str6;
        this.f12200q = list;
        this.f12201r = str7;
        this.f12202s = str8;
    }

    /* renamed from: F0 */
    public static GoogleSignInAccount m14733F0(String str, String str2, String str3, String str4, String str5, String str6, Uri uri, Long l7, String str7, Set set) {
        return new GoogleSignInAccount(3, str, str2, str3, str4, uri, null, l7.longValue(), AbstractC3802r.m15123e(str7), new ArrayList((Collection) AbstractC3802r.m15129k(set)), str5, str6);
    }

    /* renamed from: G0 */
    public static GoogleSignInAccount m14734G0(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        String optString = jSONObject.optString("photoUrl");
        Uri parse = !TextUtils.isEmpty(optString) ? Uri.parse(optString) : null;
        long parseLong = Long.parseLong(jSONObject.getString("expirationTime"));
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("grantedScopes");
        int length = jSONArray.length();
        for (int i7 = 0; i7 < length; i7++) {
            hashSet.add(new Scope(jSONArray.getString(i7)));
        }
        GoogleSignInAccount m14733F0 = m14733F0(jSONObject.optString("id"), jSONObject.has("tokenId") ? jSONObject.optString("tokenId") : null, jSONObject.has("email") ? jSONObject.optString("email") : null, jSONObject.has("displayName") ? jSONObject.optString("displayName") : null, jSONObject.has("givenName") ? jSONObject.optString("givenName") : null, jSONObject.has("familyName") ? jSONObject.optString("familyName") : null, parse, Long.valueOf(parseLong), jSONObject.getString("obfuscatedIdentifier"), hashSet);
        m14733F0.f12197n = jSONObject.has("serverAuthCode") ? jSONObject.optString("serverAuthCode") : null;
        return m14733F0;
    }

    /* renamed from: A0 */
    public String m14735A0() {
        return this.f12192b;
    }

    /* renamed from: B0 */
    public String m14736B0() {
        return this.f12193c;
    }

    /* renamed from: C0 */
    public Set m14737C0() {
        HashSet hashSet = new HashSet(this.f12200q);
        hashSet.addAll(this.f12203t);
        return hashSet;
    }

    /* renamed from: D0 */
    public String m14738D0() {
        return this.f12197n;
    }

    /* renamed from: E0 */
    public boolean m14739E0() {
        return f12190u.mo1110a() / 1000 >= this.f12198o + (-300);
    }

    /* renamed from: H0 */
    public final String m14740H0() {
        return this.f12199p;
    }

    /* renamed from: I0 */
    public final String m14741I0() {
        JSONObject jSONObject = new JSONObject();
        try {
            if (m14735A0() != null) {
                jSONObject.put("id", m14735A0());
            }
            if (m14736B0() != null) {
                jSONObject.put("tokenId", m14736B0());
            }
            if (m14743f0() != null) {
                jSONObject.put("email", m14743f0());
            }
            if (m14742M() != null) {
                jSONObject.put("displayName", m14742M());
            }
            if (m14746y0() != null) {
                jSONObject.put("givenName", m14746y0());
            }
            if (m14745x0() != null) {
                jSONObject.put("familyName", m14745x0());
            }
            Uri m14744m = m14744m();
            if (m14744m != null) {
                jSONObject.put("photoUrl", m14744m.toString());
            }
            if (m14738D0() != null) {
                jSONObject.put("serverAuthCode", m14738D0());
            }
            jSONObject.put("expirationTime", this.f12198o);
            jSONObject.put("obfuscatedIdentifier", this.f12199p);
            JSONArray jSONArray = new JSONArray();
            List list = this.f12200q;
            Scope[] scopeArr = (Scope[]) list.toArray(new Scope[list.size()]);
            Arrays.sort(scopeArr, new Comparator() { // from class: s2.d
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    Parcelable.Creator<GoogleSignInAccount> creator = GoogleSignInAccount.CREATOR;
                    return ((Scope) obj).m14795x0().compareTo(((Scope) obj2).m14795x0());
                }
            });
            for (Scope scope : scopeArr) {
                jSONArray.put(scope.m14795x0());
            }
            jSONObject.put("grantedScopes", jSONArray);
            jSONObject.remove("serverAuthCode");
            return jSONObject.toString();
        } catch (JSONException e7) {
            throw new RuntimeException(e7);
        }
    }

    /* renamed from: M */
    public String m14742M() {
        return this.f12195e;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GoogleSignInAccount)) {
            return false;
        }
        GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) obj;
        return googleSignInAccount.f12199p.equals(this.f12199p) && googleSignInAccount.m14737C0().equals(m14737C0());
    }

    /* renamed from: f0 */
    public String m14743f0() {
        return this.f12194d;
    }

    public int hashCode() {
        return ((this.f12199p.hashCode() + 527) * 31) + m14737C0().hashCode();
    }

    /* renamed from: m */
    public Uri m14744m() {
        return this.f12196f;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        int m29117a = AbstractC7067c.m29117a(parcel);
        AbstractC7067c.m29136t(parcel, 1, this.f12191a);
        AbstractC7067c.m29108E(parcel, 2, m14735A0(), false);
        AbstractC7067c.m29108E(parcel, 3, m14736B0(), false);
        AbstractC7067c.m29108E(parcel, 4, m14743f0(), false);
        AbstractC7067c.m29108E(parcel, 5, m14742M(), false);
        AbstractC7067c.m29106C(parcel, 6, m14744m(), i7, false);
        AbstractC7067c.m29108E(parcel, 7, m14738D0(), false);
        AbstractC7067c.m29140x(parcel, 8, this.f12198o);
        AbstractC7067c.m29108E(parcel, 9, this.f12199p, false);
        AbstractC7067c.m29112I(parcel, 10, this.f12200q, false);
        AbstractC7067c.m29108E(parcel, 11, m14746y0(), false);
        AbstractC7067c.m29108E(parcel, 12, m14745x0(), false);
        AbstractC7067c.m29118b(parcel, m29117a);
    }

    /* renamed from: x0 */
    public String m14745x0() {
        return this.f12202s;
    }

    /* renamed from: y0 */
    public String m14746y0() {
        return this.f12201r;
    }

    /* renamed from: z0 */
    public Set m14747z0() {
        return new HashSet(this.f12200q);
    }
}
