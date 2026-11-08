package p108P2;

import com.google.android.gms.internal.measurement.zzhh;
import com.google.android.gms.internal.measurement.zzhi;
import com.google.android.gms.internal.measurement.zzhj;
import com.google.android.gms.internal.measurement.zzhk;
import com.google.android.gms.internal.measurement.zzib;
import com.google.android.gms.internal.measurement.zzic;
import com.google.android.gms.internal.measurement.zzid;
import com.google.android.gms.internal.measurement.zzie;
import com.google.android.gms.internal.measurement.zzpq;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import p334s.C6308a;

/* renamed from: P2.L7 */
/* loaded from: classes.dex */
public final class C1545L7 {

    /* renamed from: a */
    public String f4810a;

    /* renamed from: b */
    public boolean f4811b;

    /* renamed from: c */
    public zzic f4812c;

    /* renamed from: d */
    public BitSet f4813d;

    /* renamed from: e */
    public BitSet f4814e;

    /* renamed from: f */
    public Map f4815f;

    /* renamed from: g */
    public Map f4816g;

    /* renamed from: h */
    public final /* synthetic */ C1703f f4817h;

    public /* synthetic */ C1545L7(C1703f c1703f, String str, AbstractC1694e abstractC1694e) {
        this.f4817h = c1703f;
        this.f4810a = str;
        this.f4811b = true;
        this.f4813d = new BitSet();
        this.f4814e = new BitSet();
        this.f4815f = new C6308a();
        this.f4816g = new C6308a();
    }

    /* renamed from: a */
    public final zzhi m5914a(int i7) {
        ArrayList arrayList;
        List list;
        zzhh zzb = zzhi.zzb();
        zzb.zza(i7);
        zzb.zzc(this.f4811b);
        zzic zzicVar = this.f4812c;
        if (zzicVar != null) {
            zzb.zzd(zzicVar);
        }
        zzib zze = zzic.zze();
        zze.zzb(C1882y7.m6562R(this.f4813d));
        zze.zzd(C1882y7.m6562R(this.f4814e));
        Map map = this.f4815f;
        if (map == null) {
            arrayList = null;
        } else {
            ArrayList arrayList2 = new ArrayList(map.size());
            for (Integer num : this.f4815f.keySet()) {
                int intValue = num.intValue();
                Long l7 = (Long) this.f4815f.get(num);
                if (l7 != null) {
                    zzhj zzc = zzhk.zzc();
                    zzc.zzb(intValue);
                    zzc.zza(l7.longValue());
                    arrayList2.add((zzhk) zzc.zzba());
                }
            }
            arrayList = arrayList2;
        }
        if (arrayList != null) {
            zze.zza(arrayList);
        }
        Map map2 = this.f4816g;
        if (map2 == null) {
            list = Collections.emptyList();
        } else {
            ArrayList arrayList3 = new ArrayList(map2.size());
            for (Integer num2 : this.f4816g.keySet()) {
                zzid zzd = zzie.zzd();
                zzd.zzb(num2.intValue());
                List list2 = (List) this.f4816g.get(num2);
                if (list2 != null) {
                    Collections.sort(list2);
                    zzd.zza(list2);
                }
                arrayList3.add((zzie) zzd.zzba());
            }
            list = arrayList3;
        }
        zze.zzc(list);
        zzb.zzb(zze);
        return (zzhi) zzb.zzba();
    }

    /* renamed from: c */
    public final void m5915c(AbstractC1676c abstractC1676c) {
        int mo5988a = abstractC1676c.mo5988a();
        if (abstractC1676c.f5056c != null) {
            this.f4814e.set(mo5988a, true);
        }
        Boolean bool = abstractC1676c.f5057d;
        if (bool != null) {
            this.f4813d.set(mo5988a, bool.booleanValue());
        }
        if (abstractC1676c.f5058e != null) {
            Map map = this.f4815f;
            Integer valueOf = Integer.valueOf(mo5988a);
            Long l7 = (Long) map.get(valueOf);
            long longValue = abstractC1676c.f5058e.longValue() / 1000;
            if (l7 == null || longValue > l7.longValue()) {
                this.f4815f.put(valueOf, Long.valueOf(longValue));
            }
        }
        if (abstractC1676c.f5059f != null) {
            Map map2 = this.f4816g;
            Integer valueOf2 = Integer.valueOf(mo5988a);
            List list = (List) map2.get(valueOf2);
            if (list == null) {
                list = new ArrayList();
                this.f4816g.put(valueOf2, list);
            }
            if (abstractC1676c.mo5990c()) {
                list.clear();
            }
            zzpq.zzb();
            C1460C3 c1460c3 = this.f4817h.f5129a;
            C1775n m5605B = c1460c3.m5605B();
            String str = this.f4810a;
            C1787o2 c1787o2 = AbstractC1805q2.f5327F0;
            if (m5605B.m6138P(str, c1787o2) && abstractC1676c.mo5989b()) {
                list.clear();
            }
            zzpq.zzb();
            if (!c1460c3.m5605B().m6138P(this.f4810a, c1787o2)) {
                list.add(Long.valueOf(abstractC1676c.f5059f.longValue() / 1000));
                return;
            }
            Long valueOf3 = Long.valueOf(abstractC1676c.f5059f.longValue() / 1000);
            if (list.contains(valueOf3)) {
                return;
            }
            list.add(valueOf3);
        }
    }

    public /* synthetic */ C1545L7(C1703f c1703f, String str, zzic zzicVar, BitSet bitSet, BitSet bitSet2, Map map, Map map2, AbstractC1694e abstractC1694e) {
        this.f4817h = c1703f;
        this.f4810a = str;
        this.f4813d = bitSet;
        this.f4814e = bitSet2;
        this.f4815f = map;
        this.f4816g = new C6308a();
        for (Integer num : map2.keySet()) {
            ArrayList arrayList = new ArrayList();
            arrayList.add((Long) map2.get(num));
            this.f4816g.put(num, arrayList);
        }
        this.f4811b = false;
        this.f4812c = zzicVar;
    }
}
