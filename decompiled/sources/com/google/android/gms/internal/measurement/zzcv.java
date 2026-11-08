package com.google.android.gms.internal.measurement;

import android.content.Intent;
import android.os.Bundle;
import android.os.IInterface;
import java.util.Map;
import p052H2.InterfaceC0552a;

/* loaded from: classes.dex */
public interface zzcv extends IInterface {
    void beginAdUnitExposure(String str, long j7);

    void clearConditionalUserProperty(String str, String str2, Bundle bundle);

    void clearMeasurementEnabled(long j7);

    void endAdUnitExposure(String str, long j7);

    void generateEventId(zzcy zzcyVar);

    void getAppInstanceId(zzcy zzcyVar);

    void getCachedAppInstanceId(zzcy zzcyVar);

    void getConditionalUserProperties(String str, String str2, zzcy zzcyVar);

    void getCurrentScreenClass(zzcy zzcyVar);

    void getCurrentScreenName(zzcy zzcyVar);

    void getGmpAppId(zzcy zzcyVar);

    void getMaxUserProperties(String str, zzcy zzcyVar);

    void getSessionId(zzcy zzcyVar);

    void getTestFlag(zzcy zzcyVar, int i7);

    void getUserProperties(String str, String str2, boolean z6, zzcy zzcyVar);

    void initForTests(Map map);

    void initialize(InterfaceC0552a interfaceC0552a, zzdh zzdhVar, long j7);

    void isDataCollectionEnabled(zzcy zzcyVar);

    void logEvent(String str, String str2, Bundle bundle, boolean z6, boolean z7, long j7);

    void logEventAndBundle(String str, String str2, Bundle bundle, zzcy zzcyVar, long j7);

    void logHealthData(int i7, String str, InterfaceC0552a interfaceC0552a, InterfaceC0552a interfaceC0552a2, InterfaceC0552a interfaceC0552a3);

    void onActivityCreated(InterfaceC0552a interfaceC0552a, Bundle bundle, long j7);

    void onActivityCreatedByScionActivityInfo(zzdj zzdjVar, Bundle bundle, long j7);

    void onActivityDestroyed(InterfaceC0552a interfaceC0552a, long j7);

    void onActivityDestroyedByScionActivityInfo(zzdj zzdjVar, long j7);

    void onActivityPaused(InterfaceC0552a interfaceC0552a, long j7);

    void onActivityPausedByScionActivityInfo(zzdj zzdjVar, long j7);

    void onActivityResumed(InterfaceC0552a interfaceC0552a, long j7);

    void onActivityResumedByScionActivityInfo(zzdj zzdjVar, long j7);

    void onActivitySaveInstanceState(InterfaceC0552a interfaceC0552a, zzcy zzcyVar, long j7);

    void onActivitySaveInstanceStateByScionActivityInfo(zzdj zzdjVar, zzcy zzcyVar, long j7);

    void onActivityStarted(InterfaceC0552a interfaceC0552a, long j7);

    void onActivityStartedByScionActivityInfo(zzdj zzdjVar, long j7);

    void onActivityStopped(InterfaceC0552a interfaceC0552a, long j7);

    void onActivityStoppedByScionActivityInfo(zzdj zzdjVar, long j7);

    void performAction(Bundle bundle, zzcy zzcyVar, long j7);

    void registerOnMeasurementEventListener(zzde zzdeVar);

    void resetAnalyticsData(long j7);

    void retrieveAndUploadBatches(zzdb zzdbVar);

    void setConditionalUserProperty(Bundle bundle, long j7);

    void setConsent(Bundle bundle, long j7);

    void setConsentThirdParty(Bundle bundle, long j7);

    void setCurrentScreen(InterfaceC0552a interfaceC0552a, String str, String str2, long j7);

    void setCurrentScreenByScionActivityInfo(zzdj zzdjVar, String str, String str2, long j7);

    void setDataCollectionEnabled(boolean z6);

    void setDefaultEventParameters(Bundle bundle);

    void setEventInterceptor(zzde zzdeVar);

    void setInstanceIdProvider(zzdg zzdgVar);

    void setMeasurementEnabled(boolean z6, long j7);

    void setMinimumSessionDuration(long j7);

    void setSessionTimeoutDuration(long j7);

    void setSgtmDebugInfo(Intent intent);

    void setUserId(String str, long j7);

    void setUserProperty(String str, String str2, InterfaceC0552a interfaceC0552a, boolean z6, long j7);

    void unregisterOnMeasurementEventListener(zzde zzdeVar);
}
