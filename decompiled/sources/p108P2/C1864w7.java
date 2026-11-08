package p108P2;

import android.os.Bundle;
import com.google.android.gms.internal.measurement.zzhv;
import java.util.Map;
import org.apache.tika.utils.StringUtils;

/* renamed from: P2.w7 */
/* loaded from: classes.dex */
public final class C1864w7 {

    /* renamed from: a */
    public final long f5593a;

    /* renamed from: b */
    public final zzhv f5594b;

    /* renamed from: c */
    public final String f5595c;

    /* renamed from: d */
    public final Map f5596d;

    /* renamed from: e */
    public final EnumC1444A5 f5597e;

    /* renamed from: f */
    public final long f5598f;

    /* renamed from: g */
    public final long f5599g;

    /* renamed from: h */
    public final int f5600h;

    public /* synthetic */ C1864w7(long j7, zzhv zzhvVar, String str, Map map, EnumC1444A5 enumC1444A5, long j8, long j9, long j10, int i7, AbstractC1855v7 abstractC1855v7) {
        this.f5593a = j7;
        this.f5594b = zzhvVar;
        this.f5595c = str;
        this.f5596d = map;
        this.f5597e = enumC1444A5;
        this.f5598f = j9;
        this.f5599g = j10;
        this.f5600h = i7;
    }

    /* renamed from: a */
    public final int m6460a() {
        return this.f5600h;
    }

    /* renamed from: b */
    public final long m6461b() {
        return this.f5599g;
    }

    /* renamed from: c */
    public final long m6462c() {
        return this.f5593a;
    }

    /* renamed from: d */
    public final EnumC1444A5 m6463d() {
        return this.f5597e;
    }

    /* renamed from: e */
    public final C1641X6 m6464e() {
        Bundle bundle = new Bundle();
        for (Map.Entry entry : this.f5596d.entrySet()) {
            bundle.putString((String) entry.getKey(), (String) entry.getValue());
        }
        long j7 = this.f5593a;
        zzhv zzhvVar = this.f5594b;
        String str = this.f5595c;
        EnumC1444A5 enumC1444A5 = this.f5597e;
        return new C1641X6(j7, zzhvVar.zzcd(), str, bundle, enumC1444A5.zza(), this.f5598f, StringUtils.EMPTY);
    }

    /* renamed from: f */
    public final C1702e7 m6465f() {
        return new C1702e7(this.f5595c, this.f5596d, this.f5597e, null);
    }

    /* renamed from: g */
    public final zzhv m6466g() {
        return this.f5594b;
    }

    /* renamed from: h */
    public final String m6467h() {
        return this.f5595c;
    }
}
