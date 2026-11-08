package androidx.profileinstaller;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import p256j$.util.Objects;
import p350u.C6583d;

/* renamed from: androidx.profileinstaller.d */
/* loaded from: classes.dex */
public abstract class AbstractC3414d {

    /* renamed from: a */
    public static final C6583d f11269a = C6583d.m27354w();

    /* renamed from: b */
    public static final Object f11270b = new Object();

    /* renamed from: c */
    public static c f11271c = null;

    /* renamed from: androidx.profileinstaller.d$a */
    public static class a {
        /* renamed from: a */
        public static PackageInfo m13517a(PackageManager packageManager, Context context) {
            return packageManager.getPackageInfo(context.getPackageName(), PackageManager.PackageInfoFlags.of(0L));
        }
    }

    /* renamed from: androidx.profileinstaller.d$b */
    public static class b {

        /* renamed from: a */
        public final int f11272a;

        /* renamed from: b */
        public final int f11273b;

        /* renamed from: c */
        public final long f11274c;

        /* renamed from: d */
        public final long f11275d;

        public b(int i7, int i8, long j7, long j8) {
            this.f11272a = i7;
            this.f11273b = i8;
            this.f11274c = j7;
            this.f11275d = j8;
        }

        /* renamed from: a */
        public static b m13518a(File file) {
            DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
            try {
                b bVar = new b(dataInputStream.readInt(), dataInputStream.readInt(), dataInputStream.readLong(), dataInputStream.readLong());
                dataInputStream.close();
                return bVar;
            } catch (Throwable th) {
                try {
                    dataInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }

        /* renamed from: b */
        public void m13519b(File file) {
            file.delete();
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(file));
            try {
                dataOutputStream.writeInt(this.f11272a);
                dataOutputStream.writeInt(this.f11273b);
                dataOutputStream.writeLong(this.f11274c);
                dataOutputStream.writeLong(this.f11275d);
                dataOutputStream.close();
            } catch (Throwable th) {
                try {
                    dataOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f11273b == bVar.f11273b && this.f11274c == bVar.f11274c && this.f11272a == bVar.f11272a && this.f11275d == bVar.f11275d;
        }

        public int hashCode() {
            return Objects.hash(Integer.valueOf(this.f11273b), Long.valueOf(this.f11274c), Integer.valueOf(this.f11272a), Long.valueOf(this.f11275d));
        }
    }

    /* renamed from: androidx.profileinstaller.d$c */
    public static class c {

        /* renamed from: a */
        public final int f11276a;

        /* renamed from: b */
        public final boolean f11277b;

        /* renamed from: c */
        public final boolean f11278c;

        public c(int i7, boolean z6, boolean z7) {
            this.f11276a = i7;
            this.f11278c = z7;
            this.f11277b = z6;
        }
    }

    /* renamed from: a */
    public static long m13514a(Context context) {
        PackageManager packageManager = context.getApplicationContext().getPackageManager();
        return Build.VERSION.SDK_INT >= 33 ? a.m13517a(packageManager, context).lastUpdateTime : packageManager.getPackageInfo(context.getPackageName(), 0).lastUpdateTime;
    }

    /* renamed from: b */
    public static c m13515b(int i7, boolean z6, boolean z7) {
        c cVar = new c(i7, z6, z7);
        f11271c = cVar;
        f11269a.mo27332s(cVar);
        return f11271c;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(20:14|(1:79)(1:18)|19|(1:78)(1:23)|24|25|26|(2:63|64)(1:28)|29|(8:36|(1:40)|(1:47)|48|(2:55|56)|52|53|54)|(1:62)|(1:40)|(3:42|45|47)|48|(1:50)|55|56|52|53|54) */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00cf, code lost:
    
        r3 = 196608;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00a0, code lost:
    
        r3 = 1;
     */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static androidx.profileinstaller.AbstractC3414d.c m13516c(android.content.Context r18, boolean r19) {
        /*
            Method dump skipped, instructions count: 233
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.profileinstaller.AbstractC3414d.m13516c(android.content.Context, boolean):androidx.profileinstaller.d$c");
    }
}
