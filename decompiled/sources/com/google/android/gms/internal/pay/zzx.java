package com.google.android.gms.internal.pay;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import com.google.android.gms.common.api.AbstractC3647e;
import com.google.android.gms.common.api.C3643a;
import com.google.android.gms.common.api.C3734q;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.AbstractC3720v;
import com.google.android.gms.common.api.internal.InterfaceC3712r;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import p115Q2.AbstractC2055W0;
import p115Q2.AbstractC2065b;
import p115Q2.C2011A;
import p115Q2.C2021F;
import p115Q2.C2038N0;
import p115Q2.C2062a;
import p115Q2.C2072d0;
import p115Q2.C2079f1;
import p115Q2.C2085h1;
import p115Q2.C2086i;
import p115Q2.C2087i0;
import p115Q2.C2091k;
import p115Q2.C2092k0;
import p115Q2.InterfaceC2068c;
import p207d.AbstractC4093c;

/* loaded from: classes.dex */
public final class zzx extends AbstractC3647e implements InterfaceC2068c {
    public static final /* synthetic */ int zza = 0;

    public zzx(Activity activity) {
        super(activity, AbstractC2065b.f6385f, (C3643a.d) C3643a.d.f12262l, AbstractC3647e.a.f12263c);
    }

    public final Task<C2062a> checkReadinessForEmoney(final String str, final String str2) {
        return doRead(AbstractC3720v.m14985a().m14991b(new InterfaceC3712r() { // from class: com.google.android.gms.internal.pay.zzn
            @Override // com.google.android.gms.common.api.internal.InterfaceC3712r
            public final void accept(Object obj, Object obj2) {
                zzg zzgVar = (zzg) ((zzab) obj).getService();
                C2038N0 c2038n0 = new C2038N0();
                c2038n0.m7157b(str);
                c2038n0.m7156a(str2);
                zzgVar.zzc(c2038n0.m7158c(), new zzt(zzx.this, (TaskCompletionSource) obj2));
            }
        }).m14993d(AbstractC2055W0.f6363y0).m14992c(false).m14994e(7337).m14990a());
    }

    @Override // p115Q2.InterfaceC2068c
    public final Task<Integer> getPayApiAvailabilityStatus(int i7) {
        C2079f1 c2079f1 = new C2079f1();
        c2079f1.m7166a(i7);
        final C2085h1 m7167b = c2079f1.m7167b();
        return doRead(AbstractC3720v.m14985a().m14991b(new InterfaceC3712r() { // from class: com.google.android.gms.internal.pay.zzo
            @Override // com.google.android.gms.common.api.internal.InterfaceC3712r
            public final void accept(Object obj, Object obj2) {
                ((zzg) ((zzab) obj).getService()).zzd(C2085h1.this, new zzw((TaskCompletionSource) obj2));
            }
        }).m14993d(AbstractC2055W0.f6326g).m14992c(false).m14994e(7289).m14990a());
    }

    public final Task<PendingIntent> getPendingIntentForWalletOnWear(String str, int i7) {
        C2086i c2086i = new C2086i();
        c2086i.m7169a(i7);
        c2086i.m7170b(str);
        final C2091k m7171c = c2086i.m7171c();
        return doRead(AbstractC3720v.m14985a().m14991b(new InterfaceC3712r() { // from class: com.google.android.gms.internal.pay.zzm
            @Override // com.google.android.gms.common.api.internal.InterfaceC3712r
            public final void accept(Object obj, Object obj2) {
                ((zzg) ((zzab) obj).getService()).zze(m7171c, new zzr(zzx.this, (TaskCompletionSource) obj2));
            }
        }).m14993d(AbstractC2055W0.f6333j0).m14992c(false).m14994e(7319).m14990a());
    }

    public final InterfaceC2068c.a getProductName() {
        ActivityInfo activityInfo;
        ResolveInfo resolveActivity = getApplicationContext().getPackageManager().resolveActivity(new Intent("com.google.android.gms.pay.brand.WALLET").setPackage("com.google.android.gms"), 65536);
        return (resolveActivity == null || (activityInfo = resolveActivity.activityInfo) == null || !activityInfo.exported) ? InterfaceC2068c.a.GOOGLE_PAY : InterfaceC2068c.a.GOOGLE_WALLET;
    }

    public final Task<Void> notifyCardTapEvent(final String str) {
        return doWrite(AbstractC3720v.m14985a().m14991b(new InterfaceC3712r() { // from class: com.google.android.gms.internal.pay.zzp
            @Override // com.google.android.gms.common.api.internal.InterfaceC3712r
            public final void accept(Object obj, Object obj2) {
                zzg zzgVar = (zzg) ((zzab) obj).getService();
                C2011A c2011a = new C2011A();
                c2011a.m7150a(str);
                zzgVar.zzf(c2011a.m7151b(), new zzs(zzx.this, (TaskCompletionSource) obj2));
            }
        }).m14993d(AbstractC2055W0.f6359w0).m14992c(false).m14994e(7334).m14990a());
    }

    public final Task<Void> notifyEmoneyCardStatusUpdate(final String str) {
        return doWrite(AbstractC3720v.m14985a().m14991b(new InterfaceC3712r() { // from class: com.google.android.gms.internal.pay.zzi
            @Override // com.google.android.gms.common.api.internal.InterfaceC3712r
            public final void accept(Object obj, Object obj2) {
                zzg zzgVar = (zzg) ((zzab) obj).getService();
                C2021F c2021f = new C2021F();
                c2021f.m7153a(str);
                zzgVar.zzg(c2021f.m7154b(), new zzv(zzx.this, (TaskCompletionSource) obj2));
            }
        }).m14993d(AbstractC2055W0.f6286A0).m14992c(false).m14994e(7339).m14990a());
    }

    public final Task<Void> pushEmoneyCard(final String str, final AbstractC4093c abstractC4093c) {
        return doWrite(AbstractC3720v.m14985a().m14991b(new InterfaceC3712r() { // from class: com.google.android.gms.internal.pay.zzq
            @Override // com.google.android.gms.common.api.internal.InterfaceC3712r
            public final void accept(Object obj, Object obj2) {
                zzg zzgVar = (zzg) ((zzab) obj).getService();
                C2072d0 c2072d0 = new C2072d0();
                c2072d0.m7163a(str);
                zzgVar.zzh(c2072d0.m7164b(), new zzu(zzx.this, abstractC4093c, (TaskCompletionSource) obj2));
            }
        }).m14993d(AbstractC2055W0.f6365z0).m14992c(false).m14994e(7338).m14990a());
    }

    @Override // p115Q2.InterfaceC2068c
    public final void savePasses(String str, Activity activity, int i7) {
        C2087i0 c2087i0 = new C2087i0();
        c2087i0.m7172a(str);
        final C2092k0 m7174c = c2087i0.m7174c();
        final zzz zzzVar = new zzz(activity, i7);
        doRead(AbstractC3720v.m14985a().m14991b(new InterfaceC3712r() { // from class: com.google.android.gms.internal.pay.zzh
            @Override // com.google.android.gms.common.api.internal.InterfaceC3712r
            public final void accept(Object obj, Object obj2) {
                ((zzg) ((zzab) obj).getService()).zzi(C2092k0.this, zzzVar);
            }
        }).m14993d(AbstractC2055W0.f6287B).m14992c(false).m14994e(7288).m14990a()).addOnFailureListener(new OnFailureListener() { // from class: com.google.android.gms.internal.pay.zzj
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                zzz zzzVar2 = zzz.this;
                if (exc instanceof C3734q) {
                    zzzVar2.zzh(new Status(1));
                } else {
                    zzzVar2.zzh(new Status(3));
                }
            }
        });
    }

    public final void savePassesJwt(String str, Activity activity, int i7) {
        C2087i0 c2087i0 = new C2087i0();
        c2087i0.m7173b(str);
        final C2092k0 m7174c = c2087i0.m7174c();
        final zzz zzzVar = new zzz(activity, i7);
        doRead(AbstractC3720v.m14985a().m14991b(new InterfaceC3712r() { // from class: com.google.android.gms.internal.pay.zzk
            @Override // com.google.android.gms.common.api.internal.InterfaceC3712r
            public final void accept(Object obj, Object obj2) {
                ((zzg) ((zzab) obj).getService()).zzi(C2092k0.this, zzzVar);
            }
        }).m14993d(AbstractC2055W0.f6289C).m14992c(false).m14994e(7295).m14990a()).addOnFailureListener(new OnFailureListener() { // from class: com.google.android.gms.internal.pay.zzl
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                zzz zzzVar2 = zzz.this;
                if (exc instanceof C3734q) {
                    zzzVar2.zzh(new Status(1));
                } else {
                    zzzVar2.zzh(new Status(3));
                }
            }
        });
    }

    public zzx(Context context) {
        super(context, AbstractC2065b.f6385f, C3643a.d.f12262l, AbstractC3647e.a.f12263c);
    }
}
