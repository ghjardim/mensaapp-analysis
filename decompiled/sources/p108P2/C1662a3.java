package p108P2;

import android.content.SharedPreferences;
import com.google.android.gms.common.internal.AbstractC3802r;

/* renamed from: P2.a3 */
/* loaded from: classes.dex */
public final class C1662a3 {

    /* renamed from: a */
    public final String f5031a;

    /* renamed from: b */
    public boolean f5032b;

    /* renamed from: c */
    public String f5033c;

    /* renamed from: d */
    public final /* synthetic */ C1680c3 f5034d;

    public C1662a3(C1680c3 c1680c3, String str, String str2) {
        this.f5034d = c1680c3;
        AbstractC3802r.m15123e(str);
        this.f5031a = str;
    }

    /* renamed from: a */
    public final String m5986a() {
        if (!this.f5032b) {
            this.f5032b = true;
            C1680c3 c1680c3 = this.f5034d;
            this.f5033c = c1680c3.m6003p().getString(this.f5031a, null);
        }
        return this.f5033c;
    }

    /* renamed from: b */
    public final void m5987b(String str) {
        SharedPreferences.Editor edit = this.f5034d.m6003p().edit();
        edit.putString(this.f5031a, str);
        edit.apply();
        this.f5033c = str;
    }
}
