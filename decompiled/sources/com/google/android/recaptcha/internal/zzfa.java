package com.google.android.recaptcha.internal;

import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.zip.GZIPInputStream;
import kotlin.jvm.internal.AbstractC5469l;
import p048G5.AbstractC0473h;
import p371w5.AbstractC6924g;
import p371w5.InterfaceC6923f;

/* loaded from: classes.dex */
public final class zzfa implements zzey {
    private final InterfaceC6923f zza;

    public zzfa() {
        int i7 = zzav.zza;
        this.zza = AbstractC6924g.m28367a(zzez.zza);
    }

    @Override // com.google.android.recaptcha.internal.zzey
    public final zzsc zza(String str, zzto zztoVar) {
        zzew zzewVar = null;
        try {
            try {
                try {
                    zzewVar = ((zzex) this.zza.getValue()).zza(str);
                    zzewVar.zzc();
                    zzewVar.zze(zztoVar.zzd());
                    zzsc zzscVar = (zzsc) zzewVar.zza(zzsc.zzi());
                    zzewVar.zzd();
                    return zzscVar;
                } catch (zzbd e7) {
                    if (zzewVar == null) {
                        throw e7;
                    }
                    if (!AbstractC5469l.m23024a(e7.zza(), zzba.zzau)) {
                        throw e7;
                    }
                    try {
                        throw zzbc.zza(zztu.zzg(zzewVar.zzb().getErrorStream()).zzi());
                    } catch (Exception e8) {
                        throw new zzbd(zzbb.zzc, zzba.zzG, e8.getMessage());
                    }
                }
            } catch (Exception e9) {
                throw new zzbd(zzbb.zzc, zzba.zzF, e9.getMessage());
            }
        } catch (Throwable th) {
            if (zzewVar != null) {
                zzewVar.zzd();
            }
            throw th;
        }
    }

    @Override // com.google.android.recaptcha.internal.zzey
    public final String zzb(String str) {
        try {
            try {
                URLConnection openConnection = new URL(str).openConnection();
                AbstractC5469l.m23026c(openConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
                HttpURLConnection httpURLConnection = (HttpURLConnection) openConnection;
                httpURLConnection.setRequestMethod("GET");
                httpURLConnection.setDoInput(true);
                httpURLConnection.setRequestProperty("Accept", "application/x-protobuffer");
                httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
                httpURLConnection.connect();
                if (httpURLConnection.getResponseCode() != 200) {
                    throw new zzbd(zzbb.zzc, new zzba(httpURLConnection.getResponseCode()), null);
                }
                try {
                    return AbstractC0473h.m1722c(AbstractC5469l.m23024a("gzip", httpURLConnection.getContentEncoding()) ? new InputStreamReader(new GZIPInputStream(httpURLConnection.getInputStream())) : new InputStreamReader(httpURLConnection.getInputStream()));
                } catch (Exception unused) {
                    throw new zzbd(zzbb.zzc, zzba.zzP, null);
                }
            } catch (Exception unused2) {
                throw new zzbd(zzbb.zzc, zzba.zzO, null);
            }
        } catch (Exception unused3) {
            throw new zzbd(zzbb.zzb, zzba.zzN, null);
        }
    }
}
