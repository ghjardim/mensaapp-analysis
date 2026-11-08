package com.google.android.gms.internal.measurement;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import java.util.Map;
import p052H2.InterfaceC0552a;

/* loaded from: classes.dex */
public final class zzct extends zzbm implements zzcv {
    public zzct(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public final void beginAdUnitExposure(String str, long j7) {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeLong(j7);
        zzc(23, zza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public final void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        zzbo.zzd(zza, bundle);
        zzc(9, zza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public final void clearMeasurementEnabled(long j7) {
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public final void endAdUnitExposure(String str, long j7) {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeLong(j7);
        zzc(24, zza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public final void generateEventId(zzcy zzcyVar) {
        Parcel zza = zza();
        zzbo.zze(zza, zzcyVar);
        zzc(22, zza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public final void getAppInstanceId(zzcy zzcyVar) {
        Parcel zza = zza();
        zzbo.zze(zza, zzcyVar);
        zzc(20, zza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public final void getCachedAppInstanceId(zzcy zzcyVar) {
        Parcel zza = zza();
        zzbo.zze(zza, zzcyVar);
        zzc(19, zza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public final void getConditionalUserProperties(String str, String str2, zzcy zzcyVar) {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        zzbo.zze(zza, zzcyVar);
        zzc(10, zza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public final void getCurrentScreenClass(zzcy zzcyVar) {
        Parcel zza = zza();
        zzbo.zze(zza, zzcyVar);
        zzc(17, zza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public final void getCurrentScreenName(zzcy zzcyVar) {
        Parcel zza = zza();
        zzbo.zze(zza, zzcyVar);
        zzc(16, zza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public final void getGmpAppId(zzcy zzcyVar) {
        Parcel zza = zza();
        zzbo.zze(zza, zzcyVar);
        zzc(21, zza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public final void getMaxUserProperties(String str, zzcy zzcyVar) {
        Parcel zza = zza();
        zza.writeString(str);
        zzbo.zze(zza, zzcyVar);
        zzc(6, zza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public final void getSessionId(zzcy zzcyVar) {
        Parcel zza = zza();
        zzbo.zze(zza, zzcyVar);
        zzc(46, zza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public final void getTestFlag(zzcy zzcyVar, int i7) {
        Parcel zza = zza();
        zzbo.zze(zza, zzcyVar);
        zza.writeInt(i7);
        zzc(38, zza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public final void getUserProperties(String str, String str2, boolean z6, zzcy zzcyVar) {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        int i7 = zzbo.zza;
        zza.writeInt(z6 ? 1 : 0);
        zzbo.zze(zza, zzcyVar);
        zzc(5, zza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public final void initForTests(Map map) {
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public final void initialize(InterfaceC0552a interfaceC0552a, zzdh zzdhVar, long j7) {
        Parcel zza = zza();
        zzbo.zze(zza, interfaceC0552a);
        zzbo.zzd(zza, zzdhVar);
        zza.writeLong(j7);
        zzc(1, zza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public final void isDataCollectionEnabled(zzcy zzcyVar) {
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public final void logEvent(String str, String str2, Bundle bundle, boolean z6, boolean z7, long j7) {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        zzbo.zzd(zza, bundle);
        zza.writeInt(z6 ? 1 : 0);
        zza.writeInt(z7 ? 1 : 0);
        zza.writeLong(j7);
        zzc(2, zza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public final void logEventAndBundle(String str, String str2, Bundle bundle, zzcy zzcyVar, long j7) {
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public final void logHealthData(int i7, String str, InterfaceC0552a interfaceC0552a, InterfaceC0552a interfaceC0552a2, InterfaceC0552a interfaceC0552a3) {
        Parcel zza = zza();
        zza.writeInt(5);
        zza.writeString(str);
        zzbo.zze(zza, interfaceC0552a);
        zzbo.zze(zza, interfaceC0552a2);
        zzbo.zze(zza, interfaceC0552a3);
        zzc(33, zza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public final void onActivityCreated(InterfaceC0552a interfaceC0552a, Bundle bundle, long j7) {
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public final void onActivityCreatedByScionActivityInfo(zzdj zzdjVar, Bundle bundle, long j7) {
        Parcel zza = zza();
        zzbo.zzd(zza, zzdjVar);
        zzbo.zzd(zza, bundle);
        zza.writeLong(j7);
        zzc(53, zza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public final void onActivityDestroyed(InterfaceC0552a interfaceC0552a, long j7) {
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public final void onActivityDestroyedByScionActivityInfo(zzdj zzdjVar, long j7) {
        Parcel zza = zza();
        zzbo.zzd(zza, zzdjVar);
        zza.writeLong(j7);
        zzc(54, zza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public final void onActivityPaused(InterfaceC0552a interfaceC0552a, long j7) {
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public final void onActivityPausedByScionActivityInfo(zzdj zzdjVar, long j7) {
        Parcel zza = zza();
        zzbo.zzd(zza, zzdjVar);
        zza.writeLong(j7);
        zzc(55, zza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public final void onActivityResumed(InterfaceC0552a interfaceC0552a, long j7) {
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public final void onActivityResumedByScionActivityInfo(zzdj zzdjVar, long j7) {
        Parcel zza = zza();
        zzbo.zzd(zza, zzdjVar);
        zza.writeLong(j7);
        zzc(56, zza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public final void onActivitySaveInstanceState(InterfaceC0552a interfaceC0552a, zzcy zzcyVar, long j7) {
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public final void onActivitySaveInstanceStateByScionActivityInfo(zzdj zzdjVar, zzcy zzcyVar, long j7) {
        Parcel zza = zza();
        zzbo.zzd(zza, zzdjVar);
        zzbo.zze(zza, zzcyVar);
        zza.writeLong(j7);
        zzc(57, zza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public final void onActivityStarted(InterfaceC0552a interfaceC0552a, long j7) {
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public final void onActivityStartedByScionActivityInfo(zzdj zzdjVar, long j7) {
        Parcel zza = zza();
        zzbo.zzd(zza, zzdjVar);
        zza.writeLong(j7);
        zzc(51, zza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public final void onActivityStopped(InterfaceC0552a interfaceC0552a, long j7) {
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public final void onActivityStoppedByScionActivityInfo(zzdj zzdjVar, long j7) {
        Parcel zza = zza();
        zzbo.zzd(zza, zzdjVar);
        zza.writeLong(j7);
        zzc(52, zza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public final void performAction(Bundle bundle, zzcy zzcyVar, long j7) {
        Parcel zza = zza();
        zzbo.zzd(zza, bundle);
        zzbo.zze(zza, zzcyVar);
        zza.writeLong(j7);
        zzc(32, zza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public final void registerOnMeasurementEventListener(zzde zzdeVar) {
        Parcel zza = zza();
        zzbo.zze(zza, zzdeVar);
        zzc(35, zza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public final void resetAnalyticsData(long j7) {
        Parcel zza = zza();
        zza.writeLong(j7);
        zzc(12, zza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public final void retrieveAndUploadBatches(zzdb zzdbVar) {
        Parcel zza = zza();
        zzbo.zze(zza, zzdbVar);
        zzc(58, zza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public final void setConditionalUserProperty(Bundle bundle, long j7) {
        Parcel zza = zza();
        zzbo.zzd(zza, bundle);
        zza.writeLong(j7);
        zzc(8, zza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public final void setConsent(Bundle bundle, long j7) {
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public final void setConsentThirdParty(Bundle bundle, long j7) {
        Parcel zza = zza();
        zzbo.zzd(zza, bundle);
        zza.writeLong(j7);
        zzc(45, zza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public final void setCurrentScreen(InterfaceC0552a interfaceC0552a, String str, String str2, long j7) {
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public final void setCurrentScreenByScionActivityInfo(zzdj zzdjVar, String str, String str2, long j7) {
        Parcel zza = zza();
        zzbo.zzd(zza, zzdjVar);
        zza.writeString(str);
        zza.writeString(str2);
        zza.writeLong(j7);
        zzc(50, zza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public final void setDataCollectionEnabled(boolean z6) {
        Parcel zza = zza();
        int i7 = zzbo.zza;
        zza.writeInt(z6 ? 1 : 0);
        zzc(39, zza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public final void setDefaultEventParameters(Bundle bundle) {
        Parcel zza = zza();
        zzbo.zzd(zza, bundle);
        zzc(42, zza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public final void setEventInterceptor(zzde zzdeVar) {
        Parcel zza = zza();
        zzbo.zze(zza, zzdeVar);
        zzc(34, zza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public final void setInstanceIdProvider(zzdg zzdgVar) {
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public final void setMeasurementEnabled(boolean z6, long j7) {
        Parcel zza = zza();
        int i7 = zzbo.zza;
        zza.writeInt(z6 ? 1 : 0);
        zza.writeLong(j7);
        zzc(11, zza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public final void setMinimumSessionDuration(long j7) {
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public final void setSessionTimeoutDuration(long j7) {
        Parcel zza = zza();
        zza.writeLong(j7);
        zzc(14, zza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public final void setSgtmDebugInfo(Intent intent) {
        Parcel zza = zza();
        zzbo.zzd(zza, intent);
        zzc(48, zza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public final void setUserId(String str, long j7) {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeLong(j7);
        zzc(7, zza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public final void setUserProperty(String str, String str2, InterfaceC0552a interfaceC0552a, boolean z6, long j7) {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        zzbo.zze(zza, interfaceC0552a);
        zza.writeInt(z6 ? 1 : 0);
        zza.writeLong(j7);
        zzc(4, zza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public final void unregisterOnMeasurementEventListener(zzde zzdeVar) {
        Parcel zza = zza();
        zzbo.zze(zza, zzdeVar);
        zzc(36, zza);
    }
}
