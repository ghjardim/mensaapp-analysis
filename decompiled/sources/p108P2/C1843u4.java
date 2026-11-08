package p108P2;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.internal.AbstractC3802r;
import com.google.android.gms.internal.measurement.zzdh;

/* renamed from: P2.u4 */
/* loaded from: classes.dex */
public final class C1843u4 {

    /* renamed from: a */
    public final Context f5539a;

    /* renamed from: b */
    public String f5540b;

    /* renamed from: c */
    public String f5541c;

    /* renamed from: d */
    public String f5542d;

    /* renamed from: e */
    public Boolean f5543e;

    /* renamed from: f */
    public long f5544f;

    /* renamed from: g */
    public zzdh f5545g;

    /* renamed from: h */
    public boolean f5546h;

    /* renamed from: i */
    public final Long f5547i;

    /* renamed from: j */
    public String f5548j;

    public C1843u4(Context context, zzdh zzdhVar, Long l7) {
        this.f5546h = true;
        AbstractC3802r.m15129k(context);
        Context applicationContext = context.getApplicationContext();
        AbstractC3802r.m15129k(applicationContext);
        this.f5539a = applicationContext;
        this.f5547i = l7;
        if (zzdhVar != null) {
            this.f5545g = zzdhVar;
            this.f5540b = zzdhVar.zzf;
            this.f5541c = zzdhVar.zze;
            this.f5542d = zzdhVar.zzd;
            this.f5546h = zzdhVar.zzc;
            this.f5544f = zzdhVar.zzb;
            this.f5548j = zzdhVar.zzh;
            Bundle bundle = zzdhVar.zzg;
            if (bundle != null) {
                this.f5543e = Boolean.valueOf(bundle.getBoolean("dataCollectionDefaultEnabled", true));
            }
        }
    }
}
