package com.google.android.gms.measurement;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Keep;
import com.google.android.gms.common.internal.AbstractC3802r;
import com.google.android.gms.internal.measurement.zzdh;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.apache.tika.mime.MimeTypesReaderMetKeys;
import p094N2.AbstractC1259c;
import p094N2.C1257a;
import p094N2.C1258b;
import p108P2.AbstractC1735i4;
import p108P2.C1460C3;
import p108P2.InterfaceC1808q5;

@Deprecated
/* loaded from: classes.dex */
public class AppMeasurement {

    /* renamed from: b */
    public static volatile AppMeasurement f12630b;

    /* renamed from: a */
    public final AbstractC1259c f12631a;

    public static class ConditionalUserProperty {

        @Keep
        public boolean mActive;

        @Keep
        public String mAppId;

        @Keep
        public long mCreationTimestamp;

        @Keep
        public String mExpiredEventName;

        @Keep
        public Bundle mExpiredEventParams;

        @Keep
        public String mName;

        @Keep
        public String mOrigin;

        @Keep
        public long mTimeToLive;

        @Keep
        public String mTimedOutEventName;

        @Keep
        public Bundle mTimedOutEventParams;

        @Keep
        public String mTriggerEventName;

        @Keep
        public long mTriggerTimeout;

        @Keep
        public String mTriggeredEventName;

        @Keep
        public Bundle mTriggeredEventParams;

        @Keep
        public long mTriggeredTimestamp;

        @Keep
        public Object mValue;

        public ConditionalUserProperty(Bundle bundle) {
            AbstractC3802r.m15129k(bundle);
            this.mAppId = (String) AbstractC1735i4.m6087a(bundle, "app_id", String.class, null);
            this.mOrigin = (String) AbstractC1735i4.m6087a(bundle, "origin", String.class, null);
            this.mName = (String) AbstractC1735i4.m6087a(bundle, "name", String.class, null);
            this.mValue = AbstractC1735i4.m6087a(bundle, MimeTypesReaderMetKeys.MATCH_VALUE_ATTR, Object.class, null);
            this.mTriggerEventName = (String) AbstractC1735i4.m6087a(bundle, "trigger_event_name", String.class, null);
            this.mTriggerTimeout = ((Long) AbstractC1735i4.m6087a(bundle, "trigger_timeout", Long.class, 0L)).longValue();
            this.mTimedOutEventName = (String) AbstractC1735i4.m6087a(bundle, "timed_out_event_name", String.class, null);
            this.mTimedOutEventParams = (Bundle) AbstractC1735i4.m6087a(bundle, "timed_out_event_params", Bundle.class, null);
            this.mTriggeredEventName = (String) AbstractC1735i4.m6087a(bundle, "triggered_event_name", String.class, null);
            this.mTriggeredEventParams = (Bundle) AbstractC1735i4.m6087a(bundle, "triggered_event_params", Bundle.class, null);
            this.mTimeToLive = ((Long) AbstractC1735i4.m6087a(bundle, "time_to_live", Long.class, 0L)).longValue();
            this.mExpiredEventName = (String) AbstractC1735i4.m6087a(bundle, "expired_event_name", String.class, null);
            this.mExpiredEventParams = (Bundle) AbstractC1735i4.m6087a(bundle, "expired_event_params", Bundle.class, null);
            this.mActive = ((Boolean) AbstractC1735i4.m6087a(bundle, "active", Boolean.class, Boolean.FALSE)).booleanValue();
            this.mCreationTimestamp = ((Long) AbstractC1735i4.m6087a(bundle, "creation_timestamp", Long.class, 0L)).longValue();
            this.mTriggeredTimestamp = ((Long) AbstractC1735i4.m6087a(bundle, "triggered_timestamp", Long.class, 0L)).longValue();
        }
    }

    public AppMeasurement(C1460C3 c1460c3) {
        this.f12631a = new C1257a(c1460c3);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Keep
    @Deprecated
    public static AppMeasurement getInstance(Context context) {
        if (f12630b == null) {
            synchronized (AppMeasurement.class) {
                if (f12630b == null) {
                    InterfaceC1808q5 interfaceC1808q5 = (InterfaceC1808q5) FirebaseAnalytics.class.getDeclaredMethod("getScionFrontendApiImplementation", Context.class, Bundle.class).invoke(null, context, null);
                    if (interfaceC1808q5 != null) {
                        f12630b = new AppMeasurement(interfaceC1808q5);
                    } else {
                        f12630b = new AppMeasurement(C1460C3.m5596J(context, new zzdh(0L, 0L, true, null, null, null, null, null), null));
                    }
                }
            }
        }
        return f12630b;
    }

    @Keep
    public void beginAdUnitExposure(String str) {
        this.f12631a.mo4813e(str);
    }

    @Keep
    public void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        this.f12631a.mo4814f(str, str2, bundle);
    }

    @Keep
    public void endAdUnitExposure(String str) {
        this.f12631a.mo4815g(str);
    }

    @Keep
    public long generateEventId() {
        return this.f12631a.zzb();
    }

    @Keep
    public String getAppInstanceId() {
        return this.f12631a.zzh();
    }

    @Keep
    public List<ConditionalUserProperty> getConditionalUserProperties(String str, String str2) {
        List mo4809a = this.f12631a.mo4809a(str, str2);
        ArrayList arrayList = new ArrayList(mo4809a == null ? 0 : mo4809a.size());
        Iterator it = mo4809a.iterator();
        while (it.hasNext()) {
            arrayList.add(new ConditionalUserProperty((Bundle) it.next()));
        }
        return arrayList;
    }

    @Keep
    public String getCurrentScreenClass() {
        return this.f12631a.zzi();
    }

    @Keep
    public String getCurrentScreenName() {
        return this.f12631a.zzj();
    }

    @Keep
    public String getGmpAppId() {
        return this.f12631a.zzk();
    }

    @Keep
    public int getMaxUserProperties(String str) {
        return this.f12631a.zza(str);
    }

    @Keep
    public Map<String, Object> getUserProperties(String str, String str2, boolean z6) {
        return this.f12631a.mo4810b(str, str2, z6);
    }

    @Keep
    public void logEventInternal(String str, String str2, Bundle bundle) {
        this.f12631a.mo4812d(str, str2, bundle);
    }

    @Keep
    public void setConditionalUserProperty(ConditionalUserProperty conditionalUserProperty) {
        AbstractC3802r.m15129k(conditionalUserProperty);
        Bundle bundle = new Bundle();
        String str = conditionalUserProperty.mAppId;
        if (str != null) {
            bundle.putString("app_id", str);
        }
        String str2 = conditionalUserProperty.mOrigin;
        if (str2 != null) {
            bundle.putString("origin", str2);
        }
        String str3 = conditionalUserProperty.mName;
        if (str3 != null) {
            bundle.putString("name", str3);
        }
        Object obj = conditionalUserProperty.mValue;
        if (obj != null) {
            AbstractC1735i4.m6088b(bundle, obj);
        }
        String str4 = conditionalUserProperty.mTriggerEventName;
        if (str4 != null) {
            bundle.putString("trigger_event_name", str4);
        }
        bundle.putLong("trigger_timeout", conditionalUserProperty.mTriggerTimeout);
        String str5 = conditionalUserProperty.mTimedOutEventName;
        if (str5 != null) {
            bundle.putString("timed_out_event_name", str5);
        }
        Bundle bundle2 = conditionalUserProperty.mTimedOutEventParams;
        if (bundle2 != null) {
            bundle.putBundle("timed_out_event_params", bundle2);
        }
        String str6 = conditionalUserProperty.mTriggeredEventName;
        if (str6 != null) {
            bundle.putString("triggered_event_name", str6);
        }
        Bundle bundle3 = conditionalUserProperty.mTriggeredEventParams;
        if (bundle3 != null) {
            bundle.putBundle("triggered_event_params", bundle3);
        }
        bundle.putLong("time_to_live", conditionalUserProperty.mTimeToLive);
        String str7 = conditionalUserProperty.mExpiredEventName;
        if (str7 != null) {
            bundle.putString("expired_event_name", str7);
        }
        Bundle bundle4 = conditionalUserProperty.mExpiredEventParams;
        if (bundle4 != null) {
            bundle.putBundle("expired_event_params", bundle4);
        }
        AbstractC1259c abstractC1259c = this.f12631a;
        bundle.putLong("creation_timestamp", conditionalUserProperty.mCreationTimestamp);
        bundle.putBoolean("active", conditionalUserProperty.mActive);
        bundle.putLong("triggered_timestamp", conditionalUserProperty.mTriggeredTimestamp);
        abstractC1259c.mo4811c(bundle);
    }

    public AppMeasurement(InterfaceC1808q5 interfaceC1808q5) {
        this.f12631a = new C1258b(interfaceC1808q5);
    }
}
