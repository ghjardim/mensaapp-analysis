package com.google.android.gms.common.internal;

import android.content.Context;
import android.util.SparseIntArray;
import com.google.android.gms.common.api.C3643a;
import p368w2.C6870k;

/* renamed from: com.google.android.gms.common.internal.I */
/* loaded from: classes.dex */
public final class C3751I {

    /* renamed from: a */
    public final SparseIntArray f12441a = new SparseIntArray();

    /* renamed from: b */
    public C6870k f12442b;

    public C3751I(C6870k c6870k) {
        AbstractC3802r.m15129k(c6870k);
        this.f12442b = c6870k;
    }

    /* renamed from: a */
    public final int m15029a(Context context, int i7) {
        return this.f12441a.get(i7, -1);
    }

    /* renamed from: b */
    public final int m15030b(Context context, C3643a.f fVar) {
        AbstractC3802r.m15129k(context);
        AbstractC3802r.m15129k(fVar);
        int i7 = 0;
        if (!fVar.requiresGooglePlayServices()) {
            return 0;
        }
        int minApkVersion = fVar.getMinApkVersion();
        int m15029a = m15029a(context, minApkVersion);
        if (m15029a == -1) {
            int i8 = 0;
            while (true) {
                if (i8 >= this.f12441a.size()) {
                    i7 = -1;
                    break;
                }
                int keyAt = this.f12441a.keyAt(i8);
                if (keyAt > minApkVersion && this.f12441a.get(keyAt) == 0) {
                    break;
                }
                i8++;
            }
            m15029a = i7 == -1 ? this.f12442b.mo28258h(context, minApkVersion) : i7;
            this.f12441a.put(minApkVersion, m15029a);
        }
        return m15029a;
    }

    /* renamed from: c */
    public final void m15031c() {
        this.f12441a.clear();
    }
}
