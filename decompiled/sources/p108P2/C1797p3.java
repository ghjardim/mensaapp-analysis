package p108P2;

import com.google.android.gms.internal.measurement.zzo;
import java.util.Map;

/* renamed from: P2.p3 */
/* loaded from: classes.dex */
public final class C1797p3 implements zzo {

    /* renamed from: a */
    public final /* synthetic */ String f5285a;

    /* renamed from: b */
    public final /* synthetic */ C1806q3 f5286b;

    public C1797p3(C1806q3 c1806q3, String str) {
        this.f5285a = str;
        this.f5286b = c1806q3;
    }

    @Override // com.google.android.gms.internal.measurement.zzo
    public final String zza(String str) {
        Map map;
        map = this.f5286b.f5439d;
        Map map2 = (Map) map.get(this.f5285a);
        if (map2 == null || !map2.containsKey(str)) {
            return null;
        }
        return (String) map2.get(str);
    }
}
