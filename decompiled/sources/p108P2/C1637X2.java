package p108P2;

import android.content.SharedPreferences;
import android.os.Bundle;
import com.google.android.gms.common.internal.AbstractC3802r;
import com.google.android.gms.internal.measurement.zzqr;
import java.util.Arrays;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: P2.X2 */
/* loaded from: classes.dex */
public final class C1637X2 {

    /* renamed from: a */
    public final String f4982a;

    /* renamed from: b */
    public final Bundle f4983b;

    /* renamed from: c */
    public Bundle f4984c;

    /* renamed from: d */
    public final /* synthetic */ C1680c3 f4985d;

    public C1637X2(C1680c3 c1680c3, String str, Bundle bundle) {
        this.f4985d = c1680c3;
        AbstractC3802r.m15123e(str);
        this.f4982a = str;
        this.f4983b = new Bundle();
    }

    /* renamed from: a */
    public final Bundle m5977a() {
        char c7;
        if (this.f4984c == null) {
            C1680c3 c1680c3 = this.f4985d;
            String string = c1680c3.m6003p().getString(this.f4982a, null);
            if (string != null) {
                try {
                    Bundle bundle = new Bundle();
                    JSONArray jSONArray = new JSONArray(string);
                    for (int i7 = 0; i7 < jSONArray.length(); i7++) {
                        try {
                            JSONObject jSONObject = jSONArray.getJSONObject(i7);
                            String string2 = jSONObject.getString("n");
                            String string3 = jSONObject.getString("t");
                            int hashCode = string3.hashCode();
                            if (hashCode == 100) {
                                if (string3.equals("d")) {
                                    c7 = 1;
                                }
                                c7 = 65535;
                            } else if (hashCode == 108) {
                                if (string3.equals("l")) {
                                    c7 = 2;
                                }
                                c7 = 65535;
                            } else if (hashCode == 115) {
                                if (string3.equals("s")) {
                                    c7 = 0;
                                }
                                c7 = 65535;
                            } else if (hashCode != 3352) {
                                if (hashCode == 3445 && string3.equals("la")) {
                                    c7 = 4;
                                }
                                c7 = 65535;
                            } else {
                                if (string3.equals("ia")) {
                                    c7 = 3;
                                }
                                c7 = 65535;
                            }
                            if (c7 == 0) {
                                bundle.putString(string2, jSONObject.getString("v"));
                            } else if (c7 == 1) {
                                bundle.putDouble(string2, Double.parseDouble(jSONObject.getString("v")));
                            } else if (c7 == 2) {
                                bundle.putLong(string2, Long.parseLong(jSONObject.getString("v")));
                            } else if (c7 == 3) {
                                zzqr.zzb();
                                if (c1680c3.f5129a.m5605B().m6138P(null, AbstractC1805q2.f5363X0)) {
                                    JSONArray jSONArray2 = new JSONArray(jSONObject.getString("v"));
                                    int length = jSONArray2.length();
                                    int[] iArr = new int[length];
                                    for (int i8 = 0; i8 < length; i8++) {
                                        iArr[i8] = jSONArray2.optInt(i8);
                                    }
                                    bundle.putIntArray(string2, iArr);
                                }
                            } else if (c7 != 4) {
                                c1680c3.f5129a.mo5624b().m5936r().m5903b("Unrecognized persisted bundle type. Type", string3);
                            } else {
                                zzqr.zzb();
                                if (c1680c3.f5129a.m5605B().m6138P(null, AbstractC1805q2.f5363X0)) {
                                    JSONArray jSONArray3 = new JSONArray(jSONObject.getString("v"));
                                    int length2 = jSONArray3.length();
                                    long[] jArr = new long[length2];
                                    for (int i9 = 0; i9 < length2; i9++) {
                                        jArr[i9] = jSONArray3.optLong(i9);
                                    }
                                    bundle.putLongArray(string2, jArr);
                                }
                            }
                        } catch (NumberFormatException | JSONException unused) {
                            this.f4985d.f5129a.mo5624b().m5936r().m5902a("Error reading value from SharedPreferences. Value dropped");
                        }
                    }
                    this.f4984c = bundle;
                } catch (JSONException unused2) {
                    this.f4985d.f5129a.mo5624b().m5936r().m5902a("Error loading bundle from SharedPreferences. Values will be lost");
                }
            }
            if (this.f4984c == null) {
                this.f4984c = this.f4983b;
            }
        }
        return new Bundle((Bundle) AbstractC3802r.m15129k(this.f4984c));
    }

    /* renamed from: b */
    public final void m5978b(Bundle bundle) {
        C1680c3 c1680c3;
        JSONObject jSONObject;
        C1460C3 c1460c3;
        Bundle bundle2 = bundle == null ? new Bundle() : new Bundle(bundle);
        C1680c3 c1680c32 = this.f4985d;
        SharedPreferences.Editor edit = c1680c32.m6003p().edit();
        if (bundle2.size() == 0) {
            edit.remove(this.f4982a);
        } else {
            String str = this.f4982a;
            JSONArray jSONArray = new JSONArray();
            for (String str2 : bundle2.keySet()) {
                Object obj = bundle2.get(str2);
                if (obj != null) {
                    try {
                        jSONObject = new JSONObject();
                        jSONObject.put("n", str2);
                        zzqr.zzb();
                        c1460c3 = c1680c32.f5129a;
                        c1680c3 = c1680c32;
                    } catch (JSONException e7) {
                        e = e7;
                        c1680c3 = c1680c32;
                    }
                    if (c1460c3.m5605B().m6138P(null, AbstractC1805q2.f5363X0)) {
                        try {
                        } catch (JSONException e8) {
                            e = e8;
                            this.f4985d.f5129a.mo5624b().m5936r().m5903b("Cannot serialize bundle value to SharedPreferences", e);
                            c1680c32 = c1680c3;
                        }
                        if (obj instanceof String) {
                            jSONObject.put("v", obj.toString());
                            jSONObject.put("t", "s");
                        } else if (obj instanceof Long) {
                            jSONObject.put("v", obj.toString());
                            jSONObject.put("t", "l");
                        } else if (obj instanceof int[]) {
                            jSONObject.put("v", Arrays.toString((int[]) obj));
                            jSONObject.put("t", "ia");
                        } else if (obj instanceof long[]) {
                            jSONObject.put("v", Arrays.toString((long[]) obj));
                            jSONObject.put("t", "la");
                        } else if (obj instanceof Double) {
                            jSONObject.put("v", obj.toString());
                            jSONObject.put("t", "d");
                        } else {
                            c1460c3.mo5624b().m5936r().m5903b("Cannot serialize bundle value to SharedPreferences. Type", obj.getClass());
                            c1680c32 = c1680c3;
                        }
                        jSONArray.put(jSONObject);
                        c1680c32 = c1680c3;
                    } else {
                        jSONObject.put("v", obj.toString());
                        if (obj instanceof String) {
                            jSONObject.put("t", "s");
                        } else if (obj instanceof Long) {
                            jSONObject.put("t", "l");
                        } else if (obj instanceof Double) {
                            jSONObject.put("t", "d");
                        } else {
                            c1460c3.mo5624b().m5936r().m5903b("Cannot serialize bundle value to SharedPreferences. Type", obj.getClass());
                            c1680c32 = c1680c3;
                        }
                        jSONArray.put(jSONObject);
                        c1680c32 = c1680c3;
                    }
                }
            }
            edit.putString(str, jSONArray.toString());
        }
        edit.apply();
        this.f4984c = bundle2;
    }
}
