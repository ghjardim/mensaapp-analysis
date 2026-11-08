package com.google.android.gms.internal.p395firebaseauthapi;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.C3794n;
import java.util.List;
import org.apache.tika.pipes.pipesiterator.PipesIterator;

/* loaded from: classes.dex */
public final class zzaed {
    private final int zza;

    private zzaed(String str) {
        this.zza = zza(str);
    }

    private static int zza(String str) {
        try {
            List<String> zza = zzv.zza("[.-]").zza((CharSequence) str);
            if (zza.size() == 1) {
                return Integer.parseInt(str);
            }
            if (zza.size() >= 3) {
                return (Integer.parseInt(zza.get(0)) * 1000000) + (Integer.parseInt(zza.get(1)) * PipesIterator.DEFAULT_QUEUE_SIZE) + Integer.parseInt(zza.get(2));
            }
            return -1;
        } catch (IllegalArgumentException e7) {
            if (!Log.isLoggable("LibraryVersionContainer", 3)) {
                return -1;
            }
            Log.d("LibraryVersionContainer", String.format("Version code parsing failed for: %s with exception %s.", str, e7));
            return -1;
        }
    }

    public final String zzb() {
        return String.format("X%s", Integer.toString(this.zza));
    }

    public static zzaed zza() {
        String m15096b = C3794n.m15095a().m15096b("firebase-auth");
        if (TextUtils.isEmpty(m15096b) || m15096b.equals("UNKNOWN")) {
            m15096b = "-1";
        }
        return new zzaed(m15096b);
    }
}
