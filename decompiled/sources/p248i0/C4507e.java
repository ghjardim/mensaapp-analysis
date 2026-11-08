package p248i0;

import android.os.Bundle;
import p259j0.AbstractC5330M;
import p259j0.AbstractC5332a;

/* renamed from: i0.e */
/* loaded from: classes.dex */
public final class C4507e {

    /* renamed from: c */
    public static final String f16135c = AbstractC5330M.m21783x0(0);

    /* renamed from: d */
    public static final String f16136d = AbstractC5330M.m21783x0(1);

    /* renamed from: a */
    public final String f16137a;

    /* renamed from: b */
    public final int f16138b;

    public C4507e(String str, int i7) {
        this.f16137a = str;
        this.f16138b = i7;
    }

    /* renamed from: a */
    public static C4507e m19209a(Bundle bundle) {
        return new C4507e((String) AbstractC5332a.m21800e(bundle.getString(f16135c)), bundle.getInt(f16136d));
    }

    /* renamed from: b */
    public Bundle m19210b() {
        Bundle bundle = new Bundle();
        bundle.putString(f16135c, this.f16137a);
        bundle.putInt(f16136d, this.f16138b);
        return bundle;
    }
}
