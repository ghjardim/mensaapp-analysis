package p108P2;

import android.content.SharedPreferences;
import android.util.Pair;
import com.google.android.gms.common.internal.AbstractC3802r;
import org.apache.tika.utils.StringUtils;

/* renamed from: P2.Z2 */
/* loaded from: classes.dex */
public final class C1653Z2 {

    /* renamed from: a */
    public final String f5013a;

    /* renamed from: b */
    public final String f5014b;

    /* renamed from: c */
    public final String f5015c;

    /* renamed from: d */
    public final long f5016d;

    /* renamed from: e */
    public final /* synthetic */ C1680c3 f5017e;

    public /* synthetic */ C1653Z2(C1680c3 c1680c3, String str, long j7, AbstractC1671b3 abstractC1671b3) {
        this.f5017e = c1680c3;
        AbstractC3802r.m15123e("health_monitor");
        AbstractC3802r.m15119a(j7 > 0);
        this.f5013a = "health_monitor:start";
        this.f5014b = "health_monitor:count";
        this.f5015c = "health_monitor:value";
        this.f5016d = j7;
    }

    /* renamed from: a */
    public final Pair m5981a() {
        long abs;
        C1680c3 c1680c3 = this.f5017e;
        c1680c3.mo5762h();
        c1680c3.mo5762h();
        long m5983c = m5983c();
        if (m5983c == 0) {
            m5984d();
            abs = 0;
        } else {
            abs = Math.abs(m5983c - c1680c3.f5129a.mo5626d().mo1110a());
        }
        long j7 = this.f5016d;
        if (abs < j7) {
            return null;
        }
        if (abs > j7 + j7) {
            m5984d();
            return null;
        }
        String string = c1680c3.m6003p().getString(this.f5015c, null);
        long j8 = c1680c3.m6003p().getLong(this.f5014b, 0L);
        m5984d();
        return (string == null || j8 <= 0) ? C1680c3.f5060B : new Pair(string, Long.valueOf(j8));
    }

    /* renamed from: b */
    public final void m5982b(String str, long j7) {
        C1680c3 c1680c3 = this.f5017e;
        c1680c3.mo5762h();
        if (m5983c() == 0) {
            m5984d();
        }
        if (str == null) {
            str = StringUtils.EMPTY;
        }
        SharedPreferences m6003p = c1680c3.m6003p();
        String str2 = this.f5014b;
        long j8 = m6003p.getLong(str2, 0L);
        if (j8 <= 0) {
            SharedPreferences.Editor edit = c1680c3.m6003p().edit();
            edit.putString(this.f5015c, str);
            edit.putLong(str2, 1L);
            edit.apply();
            return;
        }
        long nextLong = c1680c3.f5129a.m5619Q().m5735x().nextLong() & Long.MAX_VALUE;
        long j9 = j8 + 1;
        long j10 = Long.MAX_VALUE / j9;
        SharedPreferences.Editor edit2 = c1680c3.m6003p().edit();
        if (nextLong < j10) {
            edit2.putString(this.f5015c, str);
        }
        edit2.putLong(str2, j9);
        edit2.apply();
    }

    /* renamed from: c */
    public final long m5983c() {
        return this.f5017e.m6003p().getLong(this.f5013a, 0L);
    }

    /* renamed from: d */
    public final void m5984d() {
        C1680c3 c1680c3 = this.f5017e;
        c1680c3.mo5762h();
        long mo1110a = c1680c3.f5129a.mo5626d().mo1110a();
        SharedPreferences.Editor edit = c1680c3.m6003p().edit();
        edit.remove(this.f5014b);
        edit.remove(this.f5015c);
        edit.putLong(this.f5013a, mo1110a);
        edit.apply();
    }
}
