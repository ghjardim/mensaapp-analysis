package p354u3;

import android.text.TextUtils;
import com.google.android.gms.common.internal.AbstractC3802r;
import com.google.android.gms.internal.p395firebaseauthapi.zzagz;
import com.google.android.gms.internal.p395firebaseauthapi.zzaia;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p346t3.AbstractC6476J;
import p346t3.C6486S;
import p346t3.C6492Y;

/* renamed from: u3.O */
/* loaded from: classes.dex */
public abstract class AbstractC6627O {
    /* renamed from: a */
    public static List m27504a(List list) {
        if (list == null || list.isEmpty()) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AbstractC6476J m27505b = m27505b((zzagz) it.next());
            if (m27505b != null) {
                arrayList.add(m27505b);
            }
        }
        return arrayList;
    }

    /* renamed from: b */
    public static AbstractC6476J m27505b(zzagz zzagzVar) {
        if (zzagzVar == null) {
            return null;
        }
        if (!TextUtils.isEmpty(zzagzVar.zze())) {
            return new C6486S(zzagzVar.zzd(), zzagzVar.zzc(), zzagzVar.zza(), AbstractC3802r.m15123e(zzagzVar.zze()));
        }
        if (zzagzVar.zzb() != null) {
            return new C6492Y(zzagzVar.zzd(), zzagzVar.zzc(), zzagzVar.zza(), (zzaia) AbstractC3802r.m15130l(zzagzVar.zzb(), "totpInfo cannot be null."));
        }
        return null;
    }
}
