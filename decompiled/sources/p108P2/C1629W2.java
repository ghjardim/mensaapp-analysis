package p108P2;

import android.content.SharedPreferences;
import com.google.android.gms.common.internal.AbstractC3802r;

/* renamed from: P2.W2 */
/* loaded from: classes.dex */
public final class C1629W2 {

    /* renamed from: a */
    public final String f4968a;

    /* renamed from: b */
    public final boolean f4969b;

    /* renamed from: c */
    public boolean f4970c;

    /* renamed from: d */
    public boolean f4971d;

    /* renamed from: e */
    public final /* synthetic */ C1680c3 f4972e;

    public C1629W2(C1680c3 c1680c3, String str, boolean z6) {
        this.f4972e = c1680c3;
        AbstractC3802r.m15123e(str);
        this.f4968a = str;
        this.f4969b = z6;
    }

    /* renamed from: a */
    public final void m5974a(boolean z6) {
        SharedPreferences.Editor edit = this.f4972e.m6003p().edit();
        edit.putBoolean(this.f4968a, z6);
        edit.apply();
        this.f4971d = z6;
    }

    /* renamed from: b */
    public final boolean m5975b() {
        if (!this.f4970c) {
            this.f4970c = true;
            C1680c3 c1680c3 = this.f4972e;
            this.f4971d = c1680c3.m6003p().getBoolean(this.f4968a, this.f4969b);
        }
        return this.f4971d;
    }
}
