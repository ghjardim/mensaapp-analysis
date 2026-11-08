package p031E2;

import android.app.Application;
import android.os.Build;
import android.os.Process;
import android.os.StrictMode;
import com.google.android.gms.common.internal.AbstractC3802r;
import com.google.android.gms.internal.common.zzab;
import com.google.android.gms.internal.common.zzac;
import com.google.android.gms.internal.common.zzj;
import com.google.android.gms.internal.common.zzl;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/* renamed from: E2.p */
/* loaded from: classes.dex */
public abstract class AbstractC0280p {

    /* renamed from: a */
    public static String f1100a;

    /* renamed from: b */
    public static int f1101b;

    /* renamed from: c */
    public static Boolean f1102c;

    /* renamed from: a */
    public static String m1142a() {
        BufferedReader bufferedReader;
        String processName;
        if (f1100a == null) {
            if (Build.VERSION.SDK_INT >= 28) {
                processName = Application.getProcessName();
                f1100a = processName;
            } else {
                int i7 = f1101b;
                if (i7 == 0) {
                    i7 = Process.myPid();
                    f1101b = i7;
                }
                String str = null;
                str = null;
                str = null;
                BufferedReader bufferedReader2 = null;
                if (i7 > 0) {
                    try {
                        String str2 = "/proc/" + i7 + "/cmdline";
                        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                        try {
                            bufferedReader = new BufferedReader(new FileReader(str2));
                            try {
                                String readLine = bufferedReader.readLine();
                                AbstractC3802r.m15129k(readLine);
                                str = readLine.trim();
                            } catch (IOException unused) {
                            } catch (Throwable th) {
                                th = th;
                                bufferedReader2 = bufferedReader;
                                AbstractC0274j.m1127a(bufferedReader2);
                                throw th;
                            }
                        } finally {
                            StrictMode.setThreadPolicy(allowThreadDiskReads);
                        }
                    } catch (IOException unused2) {
                        bufferedReader = null;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                    AbstractC0274j.m1127a(bufferedReader);
                }
                f1100a = str;
            }
        }
        return f1100a;
    }

    /* renamed from: b */
    public static boolean m1143b() {
        boolean isIsolated;
        Boolean bool = f1102c;
        if (bool == null) {
            if (AbstractC0277m.m1135f()) {
                isIsolated = Process.isIsolated();
                bool = Boolean.valueOf(isIsolated);
            } else {
                try {
                    Object zza = zzl.zza(Process.class, "isIsolated", new zzj[0]);
                    Object[] objArr = new Object[0];
                    if (zza == null) {
                        throw new zzac(zzab.zza("expected a non-null reference", objArr));
                    }
                    bool = (Boolean) zza;
                } catch (ReflectiveOperationException unused) {
                    bool = Boolean.FALSE;
                }
            }
            f1102c = bool;
        }
        return bool.booleanValue();
    }
}
