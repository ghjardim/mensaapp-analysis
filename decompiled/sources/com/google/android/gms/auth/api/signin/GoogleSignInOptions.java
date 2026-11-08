package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.api.C3643a;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.AbstractC3802r;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p337s2.C6377f;
import p337s2.C6379h;
import p345t2.C6432a;
import p345t2.C6433b;
import p382y2.AbstractC7065a;
import p382y2.AbstractC7067c;

@Deprecated
/* loaded from: classes.dex */
public class GoogleSignInOptions extends AbstractC7065a implements C3643a.d, C3643a.d.b, ReflectedParcelable {
    public static final Parcelable.Creator<GoogleSignInOptions> CREATOR;

    /* renamed from: s */
    public static final GoogleSignInOptions f12204s;

    /* renamed from: t */
    public static final GoogleSignInOptions f12205t;

    /* renamed from: u */
    public static final Scope f12206u = new Scope("profile");

    /* renamed from: v */
    public static final Scope f12207v = new Scope("email");

    /* renamed from: w */
    public static final Scope f12208w = new Scope("openid");

    /* renamed from: x */
    public static final Scope f12209x;

    /* renamed from: y */
    public static final Scope f12210y;

    /* renamed from: z */
    public static final Comparator f12211z;

    /* renamed from: a */
    public final int f12212a;

    /* renamed from: b */
    public final ArrayList f12213b;

    /* renamed from: c */
    public Account f12214c;

    /* renamed from: d */
    public boolean f12215d;

    /* renamed from: e */
    public final boolean f12216e;

    /* renamed from: f */
    public final boolean f12217f;

    /* renamed from: n */
    public String f12218n;

    /* renamed from: o */
    public String f12219o;

    /* renamed from: p */
    public ArrayList f12220p;

    /* renamed from: q */
    public String f12221q;

    /* renamed from: r */
    public Map f12222r;

    static {
        Scope scope = new Scope("https://www.googleapis.com/auth/games_lite");
        f12209x = scope;
        f12210y = new Scope("https://www.googleapis.com/auth/games");
        C3641a c3641a = new C3641a();
        c3641a.m14771c();
        c3641a.m14773e();
        f12204s = c3641a.m14769a();
        C3641a c3641a2 = new C3641a();
        c3641a2.m14774f(scope, new Scope[0]);
        f12205t = c3641a2.m14769a();
        CREATOR = new C6379h();
        f12211z = new C6377f();
    }

    /* renamed from: G0 */
    public static GoogleSignInOptions m14749G0(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("scopes");
        int length = jSONArray.length();
        for (int i7 = 0; i7 < length; i7++) {
            hashSet.add(new Scope(jSONArray.getString(i7)));
        }
        String optString = jSONObject.has("accountName") ? jSONObject.optString("accountName") : null;
        return new GoogleSignInOptions(3, new ArrayList(hashSet), !TextUtils.isEmpty(optString) ? new Account(optString, "com.google") : null, jSONObject.getBoolean("idTokenRequested"), jSONObject.getBoolean("serverAuthRequested"), jSONObject.getBoolean("forceCodeForRefreshToken"), jSONObject.has("serverClientId") ? jSONObject.optString("serverClientId") : null, jSONObject.has("hostedDomain") ? jSONObject.optString("hostedDomain") : null, new HashMap(), (String) null);
    }

    /* renamed from: R0 */
    public static Map m14759R0(List list) {
        HashMap hashMap = new HashMap();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C6432a c6432a = (C6432a) it.next();
                hashMap.put(Integer.valueOf(c6432a.m26914x0()), c6432a);
            }
        }
        return hashMap;
    }

    /* renamed from: A0 */
    public ArrayList m14760A0() {
        return new ArrayList(this.f12213b);
    }

    /* renamed from: B0 */
    public String m14761B0() {
        return this.f12218n;
    }

    /* renamed from: C0 */
    public boolean m14762C0() {
        return this.f12217f;
    }

    /* renamed from: D0 */
    public boolean m14763D0() {
        return this.f12215d;
    }

    /* renamed from: E0 */
    public boolean m14764E0() {
        return this.f12216e;
    }

    /* renamed from: K0 */
    public final String m14765K0() {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONArray jSONArray = new JSONArray();
            Collections.sort(this.f12213b, f12211z);
            Iterator it = this.f12213b.iterator();
            while (it.hasNext()) {
                jSONArray.put(((Scope) it.next()).m14795x0());
            }
            jSONObject.put("scopes", jSONArray);
            Account account = this.f12214c;
            if (account != null) {
                jSONObject.put("accountName", account.name);
            }
            jSONObject.put("idTokenRequested", this.f12215d);
            jSONObject.put("forceCodeForRefreshToken", this.f12217f);
            jSONObject.put("serverAuthRequested", this.f12216e);
            if (!TextUtils.isEmpty(this.f12218n)) {
                jSONObject.put("serverClientId", this.f12218n);
            }
            if (!TextUtils.isEmpty(this.f12219o)) {
                jSONObject.put("hostedDomain", this.f12219o);
            }
            return jSONObject.toString();
        } catch (JSONException e7) {
            throw new RuntimeException(e7);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0048, code lost:
    
        if (r1.equals(r4.m14766x0()) != false) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean equals(java.lang.Object r4) {
        /*
            r3 = this;
            r0 = 0
            if (r4 != 0) goto L4
            return r0
        L4:
            com.google.android.gms.auth.api.signin.GoogleSignInOptions r4 = (com.google.android.gms.auth.api.signin.GoogleSignInOptions) r4     // Catch: java.lang.ClassCastException -> L90
            java.util.ArrayList r1 = r3.f12220p     // Catch: java.lang.ClassCastException -> L90
            boolean r1 = r1.isEmpty()     // Catch: java.lang.ClassCastException -> L90
            if (r1 == 0) goto L90
            java.util.ArrayList r1 = r4.f12220p     // Catch: java.lang.ClassCastException -> L90
            boolean r1 = r1.isEmpty()     // Catch: java.lang.ClassCastException -> L90
            if (r1 != 0) goto L18
            goto L90
        L18:
            java.util.ArrayList r1 = r3.f12213b     // Catch: java.lang.ClassCastException -> L90
            int r1 = r1.size()     // Catch: java.lang.ClassCastException -> L90
            java.util.ArrayList r2 = r4.m14760A0()     // Catch: java.lang.ClassCastException -> L90
            int r2 = r2.size()     // Catch: java.lang.ClassCastException -> L90
            if (r1 != r2) goto L90
            java.util.ArrayList r1 = r3.f12213b     // Catch: java.lang.ClassCastException -> L90
            java.util.ArrayList r2 = r4.m14760A0()     // Catch: java.lang.ClassCastException -> L90
            boolean r1 = r1.containsAll(r2)     // Catch: java.lang.ClassCastException -> L90
            if (r1 != 0) goto L35
            goto L90
        L35:
            android.accounts.Account r1 = r3.f12214c     // Catch: java.lang.ClassCastException -> L90
            if (r1 != 0) goto L40
            android.accounts.Account r1 = r4.m14766x0()     // Catch: java.lang.ClassCastException -> L90
            if (r1 != 0) goto L90
            goto L4a
        L40:
            android.accounts.Account r2 = r4.m14766x0()     // Catch: java.lang.ClassCastException -> L90
            boolean r1 = r1.equals(r2)     // Catch: java.lang.ClassCastException -> L90
            if (r1 == 0) goto L90
        L4a:
            java.lang.String r1 = r3.f12218n     // Catch: java.lang.ClassCastException -> L90
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.ClassCastException -> L90
            if (r1 == 0) goto L5d
            java.lang.String r1 = r4.m14761B0()     // Catch: java.lang.ClassCastException -> L90
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.ClassCastException -> L90
            if (r1 == 0) goto L90
            goto L6a
        L5d:
            java.lang.String r1 = r3.f12218n     // Catch: java.lang.ClassCastException -> L90
            java.lang.String r2 = r4.m14761B0()     // Catch: java.lang.ClassCastException -> L90
            boolean r1 = r1.equals(r2)     // Catch: java.lang.ClassCastException -> L90
            if (r1 != 0) goto L6a
            goto L90
        L6a:
            boolean r1 = r3.f12217f     // Catch: java.lang.ClassCastException -> L90
            boolean r2 = r4.m14762C0()     // Catch: java.lang.ClassCastException -> L90
            if (r1 != r2) goto L90
            boolean r1 = r3.f12215d     // Catch: java.lang.ClassCastException -> L90
            boolean r2 = r4.m14763D0()     // Catch: java.lang.ClassCastException -> L90
            if (r1 != r2) goto L90
            boolean r1 = r3.f12216e     // Catch: java.lang.ClassCastException -> L90
            boolean r2 = r4.m14764E0()     // Catch: java.lang.ClassCastException -> L90
            if (r1 != r2) goto L90
            java.lang.String r1 = r3.f12221q     // Catch: java.lang.ClassCastException -> L90
            java.lang.String r4 = r4.m14768z0()     // Catch: java.lang.ClassCastException -> L90
            boolean r4 = android.text.TextUtils.equals(r1, r4)     // Catch: java.lang.ClassCastException -> L90
            if (r4 == 0) goto L90
            r4 = 1
            return r4
        L90:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.auth.api.signin.GoogleSignInOptions.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.f12213b;
        int size = arrayList2.size();
        for (int i7 = 0; i7 < size; i7++) {
            arrayList.add(((Scope) arrayList2.get(i7)).m14795x0());
        }
        Collections.sort(arrayList);
        C6433b c6433b = new C6433b();
        c6433b.m26915a(arrayList);
        c6433b.m26915a(this.f12214c);
        c6433b.m26915a(this.f12218n);
        c6433b.m26917c(this.f12217f);
        c6433b.m26917c(this.f12215d);
        c6433b.m26917c(this.f12216e);
        c6433b.m26915a(this.f12221q);
        return c6433b.m26916b();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        int i8 = this.f12212a;
        int m29117a = AbstractC7067c.m29117a(parcel);
        AbstractC7067c.m29136t(parcel, 1, i8);
        AbstractC7067c.m29112I(parcel, 2, m14760A0(), false);
        AbstractC7067c.m29106C(parcel, 3, m14766x0(), i7, false);
        AbstractC7067c.m29123g(parcel, 4, m14763D0());
        AbstractC7067c.m29123g(parcel, 5, m14764E0());
        AbstractC7067c.m29123g(parcel, 6, m14762C0());
        AbstractC7067c.m29108E(parcel, 7, m14761B0(), false);
        AbstractC7067c.m29108E(parcel, 8, this.f12219o, false);
        AbstractC7067c.m29112I(parcel, 9, m14767y0(), false);
        AbstractC7067c.m29108E(parcel, 10, m14768z0(), false);
        AbstractC7067c.m29118b(parcel, m29117a);
    }

    /* renamed from: x0 */
    public Account m14766x0() {
        return this.f12214c;
    }

    /* renamed from: y0 */
    public ArrayList m14767y0() {
        return this.f12220p;
    }

    /* renamed from: z0 */
    public String m14768z0() {
        return this.f12221q;
    }

    /* renamed from: com.google.android.gms.auth.api.signin.GoogleSignInOptions$a */
    public static final class C3641a {

        /* renamed from: a */
        public Set f12223a;

        /* renamed from: b */
        public boolean f12224b;

        /* renamed from: c */
        public boolean f12225c;

        /* renamed from: d */
        public boolean f12226d;

        /* renamed from: e */
        public String f12227e;

        /* renamed from: f */
        public Account f12228f;

        /* renamed from: g */
        public String f12229g;

        /* renamed from: h */
        public Map f12230h;

        /* renamed from: i */
        public String f12231i;

        public C3641a() {
            this.f12223a = new HashSet();
            this.f12230h = new HashMap();
        }

        /* renamed from: a */
        public GoogleSignInOptions m14769a() {
            if (this.f12223a.contains(GoogleSignInOptions.f12210y)) {
                Set set = this.f12223a;
                Scope scope = GoogleSignInOptions.f12209x;
                if (set.contains(scope)) {
                    this.f12223a.remove(scope);
                }
            }
            if (this.f12226d && (this.f12228f == null || !this.f12223a.isEmpty())) {
                m14771c();
            }
            return new GoogleSignInOptions(new ArrayList(this.f12223a), this.f12228f, this.f12226d, this.f12224b, this.f12225c, this.f12227e, this.f12229g, this.f12230h, this.f12231i);
        }

        /* renamed from: b */
        public C3641a m14770b() {
            this.f12223a.add(GoogleSignInOptions.f12207v);
            return this;
        }

        /* renamed from: c */
        public C3641a m14771c() {
            this.f12223a.add(GoogleSignInOptions.f12208w);
            return this;
        }

        /* renamed from: d */
        public C3641a m14772d(String str) {
            this.f12226d = true;
            m14779k(str);
            this.f12227e = str;
            return this;
        }

        /* renamed from: e */
        public C3641a m14773e() {
            this.f12223a.add(GoogleSignInOptions.f12206u);
            return this;
        }

        /* renamed from: f */
        public C3641a m14774f(Scope scope, Scope... scopeArr) {
            this.f12223a.add(scope);
            this.f12223a.addAll(Arrays.asList(scopeArr));
            return this;
        }

        /* renamed from: g */
        public C3641a m14775g(String str, boolean z6) {
            this.f12224b = true;
            m14779k(str);
            this.f12227e = str;
            this.f12225c = z6;
            return this;
        }

        /* renamed from: h */
        public C3641a m14776h(String str) {
            this.f12228f = new Account(AbstractC3802r.m15123e(str), "com.google");
            return this;
        }

        /* renamed from: i */
        public C3641a m14777i(String str) {
            this.f12229g = AbstractC3802r.m15123e(str);
            return this;
        }

        /* renamed from: j */
        public C3641a m14778j(String str) {
            this.f12231i = str;
            return this;
        }

        /* renamed from: k */
        public final String m14779k(String str) {
            AbstractC3802r.m15123e(str);
            String str2 = this.f12227e;
            boolean z6 = true;
            if (str2 != null && !str2.equals(str)) {
                z6 = false;
            }
            AbstractC3802r.m15120b(z6, "two different server client ids provided");
            return str;
        }

        public C3641a(GoogleSignInOptions googleSignInOptions) {
            this.f12223a = new HashSet();
            this.f12230h = new HashMap();
            AbstractC3802r.m15129k(googleSignInOptions);
            this.f12223a = new HashSet(googleSignInOptions.f12213b);
            this.f12224b = googleSignInOptions.f12216e;
            this.f12225c = googleSignInOptions.f12217f;
            this.f12226d = googleSignInOptions.f12215d;
            this.f12227e = googleSignInOptions.f12218n;
            this.f12228f = googleSignInOptions.f12214c;
            this.f12229g = googleSignInOptions.f12219o;
            this.f12230h = GoogleSignInOptions.m14759R0(googleSignInOptions.f12220p);
            this.f12231i = googleSignInOptions.f12221q;
        }
    }

    public GoogleSignInOptions(int i7, ArrayList arrayList, Account account, boolean z6, boolean z7, boolean z8, String str, String str2, ArrayList arrayList2, String str3) {
        this(i7, arrayList, account, z6, z7, z8, str, str2, m14759R0(arrayList2), str3);
    }

    public GoogleSignInOptions(int i7, ArrayList arrayList, Account account, boolean z6, boolean z7, boolean z8, String str, String str2, Map map, String str3) {
        this.f12212a = i7;
        this.f12213b = arrayList;
        this.f12214c = account;
        this.f12215d = z6;
        this.f12216e = z7;
        this.f12217f = z8;
        this.f12218n = str;
        this.f12219o = str2;
        this.f12220p = new ArrayList(map.values());
        this.f12222r = map;
        this.f12221q = str3;
    }
}
