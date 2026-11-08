package p108P2;

import com.google.android.gms.internal.measurement.zzim;
import java.util.Collections;
import java.util.Map;

/* renamed from: P2.e7 */
/* loaded from: classes.dex */
public final class C1702e7 {

    /* renamed from: a */
    public final String f5118a;

    /* renamed from: b */
    public final Map f5119b;

    /* renamed from: c */
    public final EnumC1444A5 f5120c;

    /* renamed from: d */
    public final zzim f5121d;

    public C1702e7(String str, Map map, EnumC1444A5 enumC1444A5, zzim zzimVar) {
        this.f5118a = str;
        this.f5119b = map;
        this.f5120c = enumC1444A5;
        this.f5121d = zzimVar;
    }

    /* renamed from: a */
    public final EnumC1444A5 m6059a() {
        return this.f5120c;
    }

    /* renamed from: b */
    public final zzim m6060b() {
        return this.f5121d;
    }

    /* renamed from: c */
    public final String m6061c() {
        return this.f5118a;
    }

    /* renamed from: d */
    public final Map m6062d() {
        Map map = this.f5119b;
        return map == null ? Collections.emptyMap() : map;
    }
}
