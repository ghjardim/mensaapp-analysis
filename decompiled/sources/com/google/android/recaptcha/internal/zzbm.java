package com.google.android.recaptcha.internal;

import android.content.Context;
import java.io.File;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC5469l;
import org.apache.tika.utils.StringUtils;
import p104O5.C1416c;
import p125R5.AbstractC2291q;
import p378x5.AbstractC7022m;
import p378x5.AbstractC7023n;
import p378x5.AbstractC7025p;
import p378x5.AbstractC7032w;

/* loaded from: classes.dex */
public final class zzbm implements zzaq {
    private final Context zza;
    private final String zzb = "rce_";

    public zzbm(Context context) {
        this.zza = context;
        new zzcd(context);
    }

    @Override // com.google.android.recaptcha.internal.zzaq
    public final String zza(String str) {
        File file = new File(this.zza.getCacheDir(), this.zzb.concat(String.valueOf(str)));
        if (file.exists()) {
            return new String(zzcd.zza(file), StandardCharsets.UTF_8);
        }
        return null;
    }

    @Override // com.google.android.recaptcha.internal.zzaq
    public final void zzb() {
        try {
            File[] listFiles = this.zza.getCacheDir().listFiles();
            if (listFiles != null) {
                ArrayList arrayList = new ArrayList();
                for (File file : listFiles) {
                    if (AbstractC2291q.m7745u(file.getName(), this.zzb, false, 2, null)) {
                        arrayList.add(file);
                    }
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((File) it.next()).delete();
                }
            }
        } catch (Exception unused) {
        }
    }

    @Override // com.google.android.recaptcha.internal.zzaq
    public final void zzc(String str, String str2) {
        C1416c c1416c = new C1416c('A', 'z');
        ArrayList arrayList = new ArrayList(AbstractC7025p.m28868n(c1416c, 10));
        Iterator it = c1416c.iterator();
        while (it.hasNext()) {
            arrayList.add(Character.valueOf(((AbstractC7022m) it).mo5517a()));
        }
        String m28878D = AbstractC7032w.m28878D(AbstractC7023n.m28857c(arrayList).subList(0, 8), StringUtils.EMPTY, null, null, 0, null, null, 62, null);
        File file = new File(this.zza.getCacheDir(), this.zzb.concat(String.valueOf(m28878D)));
        zzcd.zzb(file, String.valueOf(str2).getBytes(StandardCharsets.UTF_8));
        file.renameTo(new File(this.zza.getCacheDir(), this.zzb.concat(String.valueOf(str))));
    }

    @Override // com.google.android.recaptcha.internal.zzaq
    public final boolean zzd(String str) {
        try {
            File[] listFiles = this.zza.getCacheDir().listFiles();
            File file = null;
            if (listFiles != null) {
                int length = listFiles.length;
                int i7 = 0;
                while (true) {
                    if (i7 >= length) {
                        break;
                    }
                    File file2 = listFiles[i7];
                    if (AbstractC5469l.m23024a(file2.getName(), this.zzb + str)) {
                        file = file2;
                        break;
                    }
                    i7++;
                }
            }
            return file != null;
        } catch (Exception unused) {
            return false;
        }
    }
}
