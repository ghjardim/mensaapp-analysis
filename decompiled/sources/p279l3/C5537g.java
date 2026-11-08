package p279l3;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.common.internal.AbstractC3802r;

/* renamed from: l3.g */
/* loaded from: classes.dex */
public class C5537g {

    /* renamed from: a */
    public final SharedPreferences f19945a;

    public C5537g(Context context, String str) {
        AbstractC3802r.m15129k(context);
        AbstractC3802r.m15123e(str);
        this.f19945a = context.getSharedPreferences(String.format("com.google.firebase.appcheck.debug.store.%s", str), 0);
    }

    /* renamed from: a */
    public String m23182a() {
        return this.f19945a.getString("com.google.firebase.appcheck.debug.DEBUG_SECRET", null);
    }

    /* renamed from: b */
    public void m23183b(String str) {
        this.f19945a.edit().putString("com.google.firebase.appcheck.debug.DEBUG_SECRET", str).apply();
    }
}
