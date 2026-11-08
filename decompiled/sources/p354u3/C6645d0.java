package p354u3;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.gms.common.internal.AbstractC3802r;
import com.google.android.gms.internal.p395firebaseauthapi.zzagw;
import com.google.android.gms.internal.p395firebaseauthapi.zzzp;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p003A2.C0019a;
import p219e3.C4176f;
import p256j$.util.Objects;
import p346t3.AbstractC6458A;
import p346t3.AbstractC6476J;
import p346t3.C6486S;
import p346t3.C6492Y;
import p346t3.C6521n0;

/* renamed from: u3.d0 */
/* loaded from: classes.dex */
public final class C6645d0 {

    /* renamed from: a */
    public Context f24001a;

    /* renamed from: b */
    public String f24002b;

    /* renamed from: c */
    public SharedPreferences f24003c;

    /* renamed from: d */
    public C0019a f24004d;

    public C6645d0(Context context, String str) {
        AbstractC3802r.m15129k(context);
        this.f24002b = AbstractC3802r.m15123e(str);
        this.f24001a = context.getApplicationContext();
        this.f24003c = this.f24001a.getSharedPreferences(String.format("com.google.firebase.auth.api.Store.%s", this.f24002b), 0);
        this.f24004d = new C0019a("StorageHelpers", new String[0]);
    }

    /* renamed from: a */
    public final zzagw m27527a(AbstractC6458A abstractC6458A) {
        AbstractC3802r.m15129k(abstractC6458A);
        String string = this.f24003c.getString(String.format("com.google.firebase.auth.GET_TOKEN_RESPONSE.%s", abstractC6458A.mo26979a()), null);
        if (string != null) {
            return zzagw.zzb(string);
        }
        return null;
    }

    /* renamed from: b */
    public final AbstractC6458A m27528b() {
        String string = this.f24003c.getString("com.google.firebase.auth.FIREBASE_USER", null);
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(string);
            if (jSONObject.has("type") && "com.google.firebase.auth.internal.DefaultFirebaseUser".equalsIgnoreCase(jSONObject.optString("type"))) {
                return m27529c(jSONObject);
            }
        } catch (Exception unused) {
        }
        return null;
    }

    /* renamed from: c */
    public final C6654i m27529c(JSONObject jSONObject) {
        JSONArray jSONArray;
        JSONArray jSONArray2;
        C6658k m27557b;
        try {
            String string = jSONObject.getString("cachedTokenState");
            String string2 = jSONObject.getString("applicationName");
            boolean z6 = jSONObject.getBoolean("anonymous");
            String string3 = jSONObject.getString("version");
            String str = string3 != null ? string3 : "2";
            JSONArray jSONArray3 = jSONObject.getJSONArray("userInfos");
            int length = jSONArray3.length();
            if (length == 0) {
                return null;
            }
            ArrayList arrayList = new ArrayList(length);
            for (int i7 = 0; i7 < length; i7++) {
                arrayList.add(C6646e.m27534x0(jSONArray3.getString(i7)));
            }
            C6654i c6654i = new C6654i(C4176f.m17518p(string2), arrayList);
            if (!TextUtils.isEmpty(string)) {
                c6654i.mo26973U0(zzagw.zzb(string));
            }
            if (!z6) {
                c6654i.mo26974V0();
            }
            c6654i.m27548a1(str);
            if (jSONObject.has("userMetadata") && (m27557b = C6658k.m27557b(jSONObject.getJSONObject("userMetadata"))) != null) {
                c6654i.m27550c1(m27557b);
            }
            if (jSONObject.has("userMultiFactorInfo") && (jSONArray2 = jSONObject.getJSONArray("userMultiFactorInfo")) != null) {
                ArrayList arrayList2 = new ArrayList();
                for (int i8 = 0; i8 < jSONArray2.length(); i8++) {
                    JSONObject jSONObject2 = new JSONObject(jSONArray2.getString(i8));
                    String optString = jSONObject2.optString("factorIdKey");
                    arrayList2.add("phone".equals(optString) ? C6486S.m27040A0(jSONObject2) : Objects.equals(optString, "totp") ? C6492Y.m27051A0(jSONObject2) : null);
                }
                c6654i.mo26977Y0(arrayList2);
            }
            if (jSONObject.has("passkeyInfo") && (jSONArray = jSONObject.getJSONArray("passkeyInfo")) != null) {
                ArrayList arrayList3 = new ArrayList();
                for (int i9 = 0; i9 < jSONArray.length(); i9++) {
                    arrayList3.add(C6521n0.m27124z0(new JSONObject(jSONArray.getString(i9))));
                }
                c6654i.mo26975W0(arrayList3);
            }
            return c6654i;
        } catch (zzzp e7) {
            e = e7;
            this.f24004d.m67i(e);
            return null;
        } catch (ArrayIndexOutOfBoundsException e8) {
            e = e8;
            this.f24004d.m67i(e);
            return null;
        } catch (IllegalArgumentException e9) {
            e = e9;
            this.f24004d.m67i(e);
            return null;
        } catch (JSONException e10) {
            e = e10;
            this.f24004d.m67i(e);
            return null;
        }
    }

    /* renamed from: d */
    public final void m27530d(String str) {
        this.f24003c.edit().remove(str).apply();
    }

    /* renamed from: e */
    public final void m27531e(AbstractC6458A abstractC6458A, zzagw zzagwVar) {
        AbstractC3802r.m15129k(abstractC6458A);
        AbstractC3802r.m15129k(zzagwVar);
        this.f24003c.edit().putString(String.format("com.google.firebase.auth.GET_TOKEN_RESPONSE.%s", abstractC6458A.mo26979a()), zzagwVar.zzf()).apply();
    }

    /* renamed from: f */
    public final void m27532f(AbstractC6458A abstractC6458A) {
        AbstractC3802r.m15129k(abstractC6458A);
        String m27533g = m27533g(abstractC6458A);
        if (TextUtils.isEmpty(m27533g)) {
            return;
        }
        this.f24003c.edit().putString("com.google.firebase.auth.FIREBASE_USER", m27533g).apply();
    }

    /* renamed from: g */
    public final String m27533g(AbstractC6458A abstractC6458A) {
        JSONObject jSONObject = new JSONObject();
        if (!C6654i.class.isAssignableFrom(abstractC6458A.getClass())) {
            return null;
        }
        C6654i c6654i = (C6654i) abstractC6458A;
        try {
            jSONObject.put("cachedTokenState", c6654i.zze());
            jSONObject.put("applicationName", c6654i.mo26971S0().m17533q());
            jSONObject.put("type", "com.google.firebase.auth.internal.DefaultFirebaseUser");
            if (c6654i.m27554g1() != null) {
                JSONArray jSONArray = new JSONArray();
                List m27554g1 = c6654i.m27554g1();
                int size = m27554g1.size();
                if (m27554g1.size() > 30) {
                    this.f24004d.m65g("Provider user info list size larger than max size, truncating list to %d. Actual list size: %d", 30, Integer.valueOf(m27554g1.size()));
                    size = 30;
                }
                boolean z6 = false;
                for (int i7 = 0; i7 < size; i7++) {
                    C6646e c6646e = (C6646e) m27554g1.get(i7);
                    if (c6646e.mo27065g().equals("firebase")) {
                        z6 = true;
                    }
                    if (i7 == size - 1 && !z6) {
                        break;
                    }
                    jSONArray.put(c6646e.m27535y0());
                }
                if (!z6) {
                    int i8 = size - 1;
                    while (true) {
                        if (i8 >= m27554g1.size() || i8 < 0) {
                            break;
                        }
                        C6646e c6646e2 = (C6646e) m27554g1.get(i8);
                        if (c6646e2.mo27065g().equals("firebase")) {
                            jSONArray.put(c6646e2.m27535y0());
                            z6 = true;
                            break;
                        }
                        if (i8 == m27554g1.size() - 1) {
                            jSONArray.put(c6646e2.m27535y0());
                        }
                        i8++;
                    }
                    if (!z6) {
                        this.f24004d.m65g("Malformed user object! No Firebase Auth provider id found. Provider user info list size: %d, trimmed size: %d", Integer.valueOf(m27554g1.size()), Integer.valueOf(size));
                        if (m27554g1.size() < 5) {
                            StringBuilder sb = new StringBuilder("Provider user info list:\n");
                            Iterator it = m27554g1.iterator();
                            while (it.hasNext()) {
                                sb.append(String.format("Provider - %s\n", ((C6646e) it.next()).mo27065g()));
                            }
                            this.f24004d.m65g(sb.toString(), new Object[0]);
                        }
                    }
                }
                jSONObject.put("userInfos", jSONArray);
            }
            jSONObject.put("anonymous", c6654i.mo26955D0());
            jSONObject.put("version", "2");
            if (c6654i.mo26985z0() != null) {
                jSONObject.put("userMetadata", ((C6658k) c6654i.mo26985z0()).m27558a());
            }
            List mo27004b = ((C6662m) c6654i.mo26952A0()).mo27004b();
            if (mo27004b != null && !mo27004b.isEmpty()) {
                JSONArray jSONArray2 = new JSONArray();
                for (int i9 = 0; i9 < mo27004b.size(); i9++) {
                    jSONArray2.put(((AbstractC6476J) mo27004b.get(i9)).mo27011z0());
                }
                jSONObject.put("userMultiFactorInfo", jSONArray2);
            }
            List mo26978Z0 = c6654i.mo26978Z0();
            if (mo26978Z0 != null && !mo26978Z0.isEmpty()) {
                JSONArray jSONArray3 = new JSONArray();
                for (int i10 = 0; i10 < mo26978Z0.size(); i10++) {
                    jSONArray3.put(C6521n0.m27123y0((C6521n0) mo26978Z0.get(i10)));
                }
                jSONObject.put("passkeyInfo", jSONArray3);
            }
            return jSONObject.toString();
        } catch (Exception e7) {
            this.f24004d.m66h("Failed to turn object into JSON", e7, new Object[0]);
            throw new zzzp(e7);
        }
    }
}
