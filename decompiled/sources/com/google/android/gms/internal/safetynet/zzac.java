package com.google.android.gms.internal.safetynet;

import com.google.android.gms.common.api.InterfaceC3729l;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p122R2.C2230b;
import p122R2.C2231c;

/* loaded from: classes.dex */
public final class zzac implements InterfaceC3729l {
    private Status zza;
    private final C2230b zzb;
    private String zzc;
    private long zzd;
    private byte[] zze;

    public zzac(Status status, C2230b c2230b) {
        this.zza = status;
        this.zzb = c2230b;
        this.zzc = null;
        if (c2230b != null) {
            this.zzc = c2230b.m7651A0();
            this.zzd = c2230b.m7654y0();
            this.zze = c2230b.m7652B0();
        } else if (status.m14799D0()) {
            this.zza = new Status(8);
        }
    }

    public final List<C2231c> getDetectedThreats() {
        ArrayList arrayList = new ArrayList();
        String str = this.zzc;
        if (str != null) {
            try {
                JSONArray jSONArray = new JSONObject(str).getJSONArray("matches");
                for (int i7 = 0; i7 < jSONArray.length(); i7++) {
                    try {
                        arrayList.add(new C2231c(Integer.parseInt(jSONArray.getJSONObject(i7).getString("threat_type"))));
                    } catch (NumberFormatException | JSONException unused) {
                    }
                }
            } catch (JSONException unused2) {
            }
        }
        return arrayList;
    }

    public final long getLastUpdateTimeMs() {
        return this.zzd;
    }

    public final String getMetadata() {
        return this.zzc;
    }

    public final byte[] getState() {
        return this.zze;
    }

    @Override // com.google.android.gms.common.api.InterfaceC3729l
    public final Status getStatus() {
        return this.zza;
    }
}
