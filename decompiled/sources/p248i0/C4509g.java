package p248i0;

import android.os.Bundle;
import p259j0.AbstractC5330M;

/* renamed from: i0.g */
/* loaded from: classes.dex */
public final class C4509g {

    /* renamed from: d */
    public static final String f16139d = AbstractC5330M.m21783x0(0);

    /* renamed from: e */
    public static final String f16140e = AbstractC5330M.m21783x0(1);

    /* renamed from: f */
    public static final String f16141f = AbstractC5330M.m21783x0(2);

    /* renamed from: a */
    public int f16142a;

    /* renamed from: b */
    public int f16143b;

    /* renamed from: c */
    public final int f16144c;

    public C4509g(int i7, int i8, int i9) {
        this.f16142a = i7;
        this.f16143b = i8;
        this.f16144c = i9;
    }

    /* renamed from: a */
    public static C4509g m19214a(Bundle bundle) {
        return new C4509g(bundle.getInt(f16139d), bundle.getInt(f16140e), bundle.getInt(f16141f));
    }

    /* renamed from: b */
    public Bundle m19215b() {
        Bundle bundle = new Bundle();
        bundle.putInt(f16139d, this.f16142a);
        bundle.putInt(f16140e, this.f16143b);
        bundle.putInt(f16141f, this.f16144c);
        return bundle;
    }
}
