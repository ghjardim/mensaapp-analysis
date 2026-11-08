package p363v4;

import android.content.Context;
import android.content.pm.InstallSourceInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import android.os.Build;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import kotlin.jvm.internal.AbstractC5464g;
import kotlin.jvm.internal.AbstractC5469l;
import org.apache.tika.fork.ForkServer;
import p026D4.InterfaceC0191a;
import p061I4.C0659k;
import p378x5.AbstractC7020k;

/* renamed from: v4.e */
/* loaded from: classes.dex */
public final class C6783e implements C0659k.c, InterfaceC0191a {

    /* renamed from: e */
    public static final a f24375e = new a(null);

    /* renamed from: c */
    public Context f24376c;

    /* renamed from: d */
    public C0659k f24377d;

    /* renamed from: v4.e$a */
    public static final class a {
        public /* synthetic */ a(AbstractC5464g abstractC5464g) {
            this();
        }

        public a() {
        }
    }

    @Override // p026D4.InterfaceC0191a
    /* renamed from: C */
    public void mo782C(InterfaceC0191a.b binding) {
        AbstractC5469l.m23028e(binding, "binding");
        this.f24376c = binding.m785a();
        C0659k c0659k = new C0659k(binding.m786b(), "dev.fluttercommunity.plus/package_info");
        this.f24377d = c0659k;
        AbstractC5469l.m23025b(c0659k);
        c0659k.m2654e(this);
    }

    /* renamed from: a */
    public final String m27819a(byte[] bArr) {
        char[] cArr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        char[] cArr2 = new char[bArr.length * 2];
        int length = bArr.length;
        for (int i7 = 0; i7 < length; i7++) {
            byte b7 = bArr[i7];
            int i8 = i7 * 2;
            cArr2[i8] = cArr[(b7 & ForkServer.ERROR) >>> 4];
            cArr2[i8 + 1] = cArr[b7 & 15];
        }
        return new String(cArr2);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0081 A[Catch: NameNotFoundException -> 0x0050, TryCatch #0 {NameNotFoundException -> 0x0050, blocks: (B:3:0x000a, B:5:0x0014, B:8:0x0043, B:10:0x0049, B:13:0x0053, B:16:0x006c, B:18:0x0081, B:20:0x0088, B:21:0x008d, B:26:0x0091), top: B:2:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0088 A[Catch: NameNotFoundException -> 0x0050, TryCatch #0 {NameNotFoundException -> 0x0050, blocks: (B:3:0x000a, B:5:0x0014, B:8:0x0043, B:10:0x0049, B:13:0x0053, B:16:0x006c, B:18:0x0081, B:20:0x0088, B:21:0x008d, B:26:0x0091), top: B:2:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006b  */
    @Override // p061I4.C0659k.c
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo2185b(p061I4.C0658j r8, p061I4.C0659k.d r9) {
        /*
            r7 = this;
            java.lang.String r0 = "call"
            kotlin.jvm.internal.AbstractC5469l.m23028e(r8, r0)
            java.lang.String r0 = "result"
            kotlin.jvm.internal.AbstractC5469l.m23028e(r9, r0)
            java.lang.String r8 = r8.f2254a     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L50
            java.lang.String r0 = "getAll"
            boolean r8 = kotlin.jvm.internal.AbstractC5469l.m23024a(r8, r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L50
            if (r8 == 0) goto L91
            android.content.Context r8 = r7.f24376c     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L50
            kotlin.jvm.internal.AbstractC5469l.m23025b(r8)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L50
            android.content.pm.PackageManager r8 = r8.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L50
            android.content.Context r0 = r7.f24376c     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L50
            kotlin.jvm.internal.AbstractC5469l.m23025b(r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L50
            java.lang.String r0 = r0.getPackageName()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L50
            r1 = 0
            android.content.pm.PackageInfo r0 = r8.getPackageInfo(r0, r1)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L50
            kotlin.jvm.internal.AbstractC5469l.m23025b(r8)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L50
            java.lang.String r1 = r7.m27820c(r8)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L50
            java.lang.String r2 = r7.m27821d()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L50
            java.util.HashMap r3 = new java.util.HashMap     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L50
            r3.<init>()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L50
            java.lang.String r4 = "appName"
            android.content.pm.ApplicationInfo r5 = r0.applicationInfo     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L50
            java.lang.String r6 = ""
            if (r5 == 0) goto L52
            java.lang.CharSequence r8 = r5.loadLabel(r8)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L50
            if (r8 == 0) goto L52
            java.lang.String r8 = r8.toString()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L50
            if (r8 != 0) goto L53
            goto L52
        L50:
            r8 = move-exception
            goto L95
        L52:
            r8 = r6
        L53:
            r3.put(r4, r8)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L50
            java.lang.String r8 = "packageName"
            android.content.Context r4 = r7.f24376c     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L50
            kotlin.jvm.internal.AbstractC5469l.m23025b(r4)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L50
            java.lang.String r4 = r4.getPackageName()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L50
            r3.put(r8, r4)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L50
            java.lang.String r8 = "version"
            java.lang.String r4 = r0.versionName     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L50
            if (r4 != 0) goto L6b
            goto L6c
        L6b:
            r6 = r4
        L6c:
            r3.put(r8, r6)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L50
            java.lang.String r8 = "buildNumber"
            kotlin.jvm.internal.AbstractC5469l.m23025b(r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L50
            long r4 = r7.m27822e(r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L50
            java.lang.String r0 = java.lang.String.valueOf(r4)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L50
            r3.put(r8, r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L50
            if (r1 == 0) goto L86
            java.lang.String r8 = "buildSignature"
            r3.put(r8, r1)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L50
        L86:
            if (r2 == 0) goto L8d
            java.lang.String r8 = "installerStore"
            r3.put(r8, r2)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L50
        L8d:
            r9.mo2314a(r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L50
            goto L9f
        L91:
            r9.mo2316c()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L50
            goto L9f
        L95:
            java.lang.String r8 = r8.getMessage()
            r0 = 0
            java.lang.String r1 = "Name not found"
            r9.mo2315b(r1, r8, r0)
        L9f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p363v4.C6783e.mo2185b(I4.j, I4.k$d):void");
    }

    /* renamed from: c */
    public final String m27820c(PackageManager packageManager) {
        SigningInfo signingInfo;
        boolean hasMultipleSigners;
        Signature[] signingCertificateHistory;
        Signature[] apkContentsSigners;
        String str = null;
        try {
            if (Build.VERSION.SDK_INT >= 28) {
                Context context = this.f24376c;
                AbstractC5469l.m23025b(context);
                signingInfo = packageManager.getPackageInfo(context.getPackageName(), 134217728).signingInfo;
                if (signingInfo == null) {
                    return null;
                }
                hasMultipleSigners = signingInfo.hasMultipleSigners();
                if (hasMultipleSigners) {
                    apkContentsSigners = signingInfo.getApkContentsSigners();
                    AbstractC5469l.m23027d(apkContentsSigners, "getApkContentsSigners(...)");
                    byte[] byteArray = ((Signature) AbstractC7020k.m28846s(apkContentsSigners)).toByteArray();
                    AbstractC5469l.m23027d(byteArray, "toByteArray(...)");
                    str = m27823f(byteArray);
                } else {
                    signingCertificateHistory = signingInfo.getSigningCertificateHistory();
                    AbstractC5469l.m23027d(signingCertificateHistory, "getSigningCertificateHistory(...)");
                    byte[] byteArray2 = ((Signature) AbstractC7020k.m28846s(signingCertificateHistory)).toByteArray();
                    AbstractC5469l.m23027d(byteArray2, "toByteArray(...)");
                    str = m27823f(byteArray2);
                }
            } else {
                Context context2 = this.f24376c;
                AbstractC5469l.m23025b(context2);
                Signature[] signatureArr = packageManager.getPackageInfo(context2.getPackageName(), 64).signatures;
                if (signatureArr != null && signatureArr.length != 0 && AbstractC7020k.m28846s(signatureArr) != null) {
                    byte[] byteArray3 = ((Signature) AbstractC7020k.m28846s(signatureArr)).toByteArray();
                    AbstractC5469l.m23027d(byteArray3, "toByteArray(...)");
                    str = m27823f(byteArray3);
                }
            }
        } catch (PackageManager.NameNotFoundException | NoSuchAlgorithmException unused) {
        }
        return str;
    }

    /* renamed from: d */
    public final String m27821d() {
        InstallSourceInfo installSourceInfo;
        String initiatingPackageName;
        Context context = this.f24376c;
        AbstractC5469l.m23025b(context);
        PackageManager packageManager = context.getPackageManager();
        Context context2 = this.f24376c;
        AbstractC5469l.m23025b(context2);
        String packageName = context2.getPackageName();
        if (Build.VERSION.SDK_INT < 30) {
            return packageManager.getInstallerPackageName(packageName);
        }
        installSourceInfo = packageManager.getInstallSourceInfo(packageName);
        initiatingPackageName = installSourceInfo.getInitiatingPackageName();
        return initiatingPackageName;
    }

    /* renamed from: e */
    public final long m27822e(PackageInfo packageInfo) {
        long longVersionCode;
        if (Build.VERSION.SDK_INT < 28) {
            return packageInfo.versionCode;
        }
        longVersionCode = packageInfo.getLongVersionCode();
        return longVersionCode;
    }

    /* renamed from: f */
    public final String m27823f(byte[] bArr) {
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        messageDigest.update(bArr);
        byte[] digest = messageDigest.digest();
        AbstractC5469l.m23025b(digest);
        return m27819a(digest);
    }

    @Override // p026D4.InterfaceC0191a
    /* renamed from: y */
    public void mo783y(InterfaceC0191a.b binding) {
        AbstractC5469l.m23028e(binding, "binding");
        this.f24376c = null;
        C0659k c0659k = this.f24377d;
        AbstractC5469l.m23025b(c0659k);
        c0659k.m2654e(null);
        this.f24377d = null;
    }
}
