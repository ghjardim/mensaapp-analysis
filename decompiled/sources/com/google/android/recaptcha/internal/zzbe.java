package com.google.android.recaptcha.internal;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.os.Build;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC5469l;
import p256j$.util.concurrent.ConcurrentHashMap;
import p371w5.AbstractC6930m;
import p378x5.AbstractC7005E;
import p378x5.AbstractC7008H;

/* loaded from: classes.dex */
public final class zzbe {
    public zzbe() {
        new ConcurrentHashMap();
        zzb();
    }

    public static final Set zza(Context context) {
        try {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Object systemService = context.getSystemService("connectivity");
            AbstractC5469l.m23026c(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
            ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
            NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
            if (networkCapabilities != null && networkCapabilities.hasTransport(1)) {
                linkedHashSet.add(zzqi.TRANSPORT_WIFI);
            }
            if (networkCapabilities != null && networkCapabilities.hasTransport(0)) {
                linkedHashSet.add(zzqi.TRANSPORT_CELLULAR);
            }
            if (networkCapabilities != null && networkCapabilities.hasTransport(4)) {
                linkedHashSet.add(zzqi.TRANSPORT_VPN);
            }
            if (networkCapabilities != null && networkCapabilities.hasTransport(3)) {
                linkedHashSet.add(zzqi.TRANSPORT_ETHERNET);
            }
            if (networkCapabilities != null && networkCapabilities.hasCapability(16)) {
                linkedHashSet.add(zzqi.NET_CAPABILITY_VALIDATED);
            }
            return linkedHashSet;
        } catch (Exception unused) {
            return AbstractC7008H.m28756b();
        }
    }

    private static final Map zzb() {
        Map m28738g = AbstractC7005E.m28738g(AbstractC6930m.m28383a(0, zzqi.NET_CAPABILITY_MMS), AbstractC6930m.m28383a(1, zzqi.NET_CAPABILITY_SUPL), AbstractC6930m.m28383a(2, zzqi.NET_CAPABILITY_DUN), AbstractC6930m.m28383a(3, zzqi.NET_CAPABILITY_FOTA), AbstractC6930m.m28383a(4, zzqi.NET_CAPABILITY_IMS), AbstractC6930m.m28383a(5, zzqi.NET_CAPABILITY_CBS), AbstractC6930m.m28383a(6, zzqi.NET_CAPABILITY_WIFI_P2P), AbstractC6930m.m28383a(7, zzqi.NET_CAPABILITY_IA), AbstractC6930m.m28383a(8, zzqi.NET_CAPABILITY_RCS), AbstractC6930m.m28383a(9, zzqi.NET_CAPABILITY_XCAP), AbstractC6930m.m28383a(10, zzqi.NET_CAPABILITY_EIMS), AbstractC6930m.m28383a(11, zzqi.NET_CAPABILITY_NOT_METERED), AbstractC6930m.m28383a(12, zzqi.NET_CAPABILITY_INTERNET), AbstractC6930m.m28383a(13, zzqi.NET_CAPABILITY_NOT_RESTRICTED), AbstractC6930m.m28383a(14, zzqi.NET_CAPABILITY_TRUSTED), AbstractC6930m.m28383a(15, zzqi.NET_CAPABILITY_NOT_VPN));
        int i7 = Build.VERSION.SDK_INT;
        m28738g.put(17, zzqi.NET_CAPABILITY_CAPTIVE_PORTAL);
        m28738g.put(16, zzqi.NET_CAPABILITY_VALIDATED);
        if (i7 >= 28) {
            m28738g.put(18, zzqi.NET_CAPABILITY_NOT_ROAMING);
            m28738g.put(19, zzqi.NET_CAPABILITY_FOREGROUND);
            m28738g.put(20, zzqi.NET_CAPABILITY_NOT_CONGESTED);
            m28738g.put(21, zzqi.NET_CAPABILITY_NOT_SUSPENDED);
        }
        if (i7 >= 29) {
            m28738g.put(23, zzqi.NET_CAPABILITY_MCX);
        }
        if (i7 >= 30) {
            m28738g.put(25, zzqi.NET_CAPABILITY_TEMPORARILY_NOT_METERED);
        }
        if (i7 >= 31) {
            m28738g.put(32, zzqi.NET_CAPABILITY_HEAD_UNIT);
            m28738g.put(29, zzqi.NET_CAPABILITY_ENTERPRISE);
        }
        if (i7 >= 33) {
            m28738g.put(35, zzqi.NET_CAPABILITY_PRIORITIZE_BANDWIDTH);
            m28738g.put(34, zzqi.NET_CAPABILITY_PRIORITIZE_LATENCY);
            m28738g.put(33, zzqi.NET_CAPABILITY_MMTEL);
        }
        return m28738g;
    }
}
