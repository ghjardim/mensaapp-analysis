package com.google.android.gms.internal.safetynet;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.gms.common.api.AbstractC3648f;
import com.google.android.gms.common.internal.AbstractC3780g;
import com.google.android.gms.common.internal.C3774d;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.List;
import org.apache.tika.utils.StringUtils;

/* loaded from: classes.dex */
public final class zzaf extends AbstractC3780g {
    private final Context zze;

    public zzaf(Context context, Looper looper, C3774d c3774d, AbstractC3648f.a aVar, AbstractC3648f.b bVar) {
        super(context, looper, 45, c3774d, aVar, bVar);
        this.zze = context;
    }

    @Override // com.google.android.gms.common.internal.AbstractC3772c
    public final /* bridge */ /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.safetynet.internal.ISafetyNetService");
        return queryLocalInterface instanceof zzh ? (zzh) queryLocalInterface : new zzh(iBinder);
    }

    @Override // com.google.android.gms.common.internal.AbstractC3772c
    public final int getMinApkVersion() {
        return 12200000;
    }

    @Override // com.google.android.gms.common.internal.AbstractC3772c
    public final String getServiceDescriptor() {
        return "com.google.android.gms.safetynet.internal.ISafetyNetService";
    }

    @Override // com.google.android.gms.common.internal.AbstractC3772c
    public final String getStartServiceAction() {
        return "com.google.android.gms.safetynet.service.START";
    }

    @Override // com.google.android.gms.common.internal.AbstractC3772c
    public final boolean usesClientTelemetry() {
        return true;
    }

    @VisibleForTesting
    public final String zzp(String str) {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            PackageManager packageManager = this.zze.getPackageManager();
            if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(this.zze.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null) {
                return StringUtils.EMPTY;
            }
            String str2 = (String) bundle.get(str);
            return str2 == null ? StringUtils.EMPTY : str2;
        } catch (PackageManager.NameNotFoundException unused) {
            return StringUtils.EMPTY;
        }
    }

    public final void zzq(zzg zzgVar, List<Integer> list, int i7, String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            str2 = zzp("com.google.android.safetynet.API_KEY");
        }
        String str3 = str2;
        int[] iArr = new int[list.size()];
        for (int i8 = 0; i8 < list.size(); i8++) {
            iArr[i8] = list.get(i8).intValue();
        }
        ((zzh) getService()).zzh(zzgVar, str3, iArr, i7, str);
    }
}
