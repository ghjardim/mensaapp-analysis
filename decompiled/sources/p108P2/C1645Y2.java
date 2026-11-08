package p108P2;

import android.content.SharedPreferences;
import com.google.android.gms.common.internal.AbstractC3802r;

/* renamed from: P2.Y2 */
/* loaded from: classes.dex */
public final class C1645Y2 {

    /* renamed from: a */
    public final String f4999a;

    /* renamed from: b */
    public final long f5000b;

    /* renamed from: c */
    public boolean f5001c;

    /* renamed from: d */
    public long f5002d;

    /* renamed from: e */
    public final /* synthetic */ C1680c3 f5003e;

    public C1645Y2(C1680c3 c1680c3, String str, long j7) {
        this.f5003e = c1680c3;
        AbstractC3802r.m15123e(str);
        this.f4999a = str;
        this.f5000b = j7;
    }

    /* renamed from: a */
    public final long m5979a() {
        if (!this.f5001c) {
            this.f5001c = true;
            C1680c3 c1680c3 = this.f5003e;
            this.f5002d = c1680c3.m6003p().getLong(this.f4999a, this.f5000b);
        }
        return this.f5002d;
    }

    /* renamed from: b */
    public final void m5980b(long j7) {
        SharedPreferences.Editor edit = this.f5003e.m6003p().edit();
        edit.putLong(this.f4999a, j7);
        edit.apply();
        this.f5002d = j7;
    }
}
