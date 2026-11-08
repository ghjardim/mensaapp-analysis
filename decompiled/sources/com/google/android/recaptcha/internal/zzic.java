package com.google.android.recaptcha.internal;

import java.net.ConnectException;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class zzic implements zzih {
    private static final boolean zzb(int i7) {
        try {
            new Socket("localhost", i7).close();
            return true;
        } catch (ConnectException unused) {
            return false;
        }
    }

    @Override // com.google.android.recaptcha.internal.zzih
    /* renamed from: cs */
    public final /* synthetic */ Object mo15261cs(Object[] objArr) {
        return zzie.zza(this, objArr);
    }

    @Override // com.google.android.recaptcha.internal.zzih
    public final Object zza(Object... objArr) {
        ArrayList arrayList = new ArrayList(objArr.length);
        for (Object obj : objArr) {
            if (true != (obj instanceof Integer)) {
                obj = null;
            }
            Integer num = (Integer) obj;
            if (num == null) {
                throw new zzce(4, 5, null);
            }
            arrayList.add(Integer.valueOf(num.intValue()));
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            int intValue = ((Number) it.next()).intValue();
            if (zzb(intValue)) {
                arrayList2.add(Integer.valueOf(intValue));
            }
        }
        return arrayList2;
    }
}
