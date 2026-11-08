package p368w2;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.util.Log;
import com.google.android.gms.common.internal.AbstractC3802r;

/* renamed from: w2.p */
/* loaded from: classes.dex */
public class C6875p {

    /* renamed from: c */
    public static C6875p f24699c;

    /* renamed from: a */
    public final Context f24700a;

    /* renamed from: b */
    public volatile String f24701b;

    public C6875p(Context context) {
        this.f24700a = context.getApplicationContext();
    }

    /* renamed from: a */
    public static C6875p m28291a(Context context) {
        AbstractC3802r.m15129k(context);
        synchronized (C6875p.class) {
            try {
                if (f24699c == null) {
                    AbstractC6849G.m28221d(context);
                    f24699c = new C6875p(context);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f24699c;
    }

    /* renamed from: d */
    public static final AbstractBinderC6845C m28292d(PackageInfo packageInfo, AbstractBinderC6845C... abstractBinderC6845CArr) {
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr != null) {
            if (signatureArr.length != 1) {
                Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
                return null;
            }
            BinderC6846D binderC6846D = new BinderC6846D(packageInfo.signatures[0].toByteArray());
            for (int i7 = 0; i7 < abstractBinderC6845CArr.length; i7++) {
                if (abstractBinderC6845CArr[i7].equals(binderC6846D)) {
                    return abstractBinderC6845CArr[i7];
                }
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0047 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0039  */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean m28293e(android.content.pm.PackageInfo r4, boolean r5) {
        /*
            r0 = 1
            r1 = 0
            if (r5 == 0) goto L27
            if (r4 == 0) goto L29
            java.lang.String r2 = "com.android.vending"
            java.lang.String r3 = r4.packageName
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L1a
            java.lang.String r2 = r4.packageName
            java.lang.String r3 = "com.google.android.gms"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L27
        L1a:
            android.content.pm.ApplicationInfo r5 = r4.applicationInfo
            if (r5 != 0) goto L20
        L1e:
            r5 = r1
            goto L27
        L20:
            int r5 = r5.flags
            r5 = r5 & 129(0x81, float:1.81E-43)
            if (r5 == 0) goto L1e
            r5 = r0
        L27:
            r2 = r4
            goto L2a
        L29:
            r2 = 0
        L2a:
            if (r4 == 0) goto L48
            android.content.pm.Signature[] r4 = r2.signatures
            if (r4 == 0) goto L48
            if (r5 == 0) goto L39
            w2.C[] r4 = p368w2.AbstractC6848F.f24644a
            w2.C r4 = m28292d(r2, r4)
            goto L45
        L39:
            w2.C[] r4 = p368w2.AbstractC6848F.f24644a
            r4 = r4[r1]
            w2.C[] r5 = new p368w2.AbstractBinderC6845C[r0]
            r5[r1] = r4
            w2.C r4 = m28292d(r2, r5)
        L45:
            if (r4 == 0) goto L48
            return r0
        L48:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p368w2.C6875p.m28293e(android.content.pm.PackageInfo, boolean):boolean");
    }

    /* renamed from: b */
    public boolean m28294b(PackageInfo packageInfo) {
        if (packageInfo == null) {
            return false;
        }
        if (m28293e(packageInfo, false)) {
            return true;
        }
        if (m28293e(packageInfo, true)) {
            if (AbstractC6874o.m28284f(this.f24700a)) {
                return true;
            }
            Log.w("GoogleSignatureVerifier", "Test-keys aren't accepted on this build.");
        }
        return false;
    }

    /* renamed from: c */
    public boolean m28295c(int i7) {
        C6858P m28231c;
        int length;
        String[] packagesForUid = this.f24700a.getPackageManager().getPackagesForUid(i7);
        if (packagesForUid != null && (length = packagesForUid.length) != 0) {
            m28231c = null;
            int i8 = 0;
            while (true) {
                if (i8 >= length) {
                    AbstractC3802r.m15129k(m28231c);
                    break;
                }
                m28231c = m28296f(packagesForUid[i8], false, false);
                if (m28231c.f24668a) {
                    break;
                }
                i8++;
            }
        } else {
            m28231c = C6858P.m28231c("no pkgs");
        }
        m28231c.m28235e();
        return m28231c.f24668a;
    }

    /* renamed from: f */
    public final C6858P m28296f(String str, boolean z6, boolean z7) {
        C6858P m28231c;
        ApplicationInfo applicationInfo;
        if (str == null) {
            return C6858P.m28231c("null pkg");
        }
        if (str.equals(this.f24701b)) {
            return C6858P.m28230b();
        }
        if (AbstractC6849G.m28222e()) {
            m28231c = AbstractC6849G.m28219b(str, AbstractC6874o.m28284f(this.f24700a), false, false);
        } else {
            try {
                PackageInfo packageInfo = this.f24700a.getPackageManager().getPackageInfo(str, 64);
                boolean m28284f = AbstractC6874o.m28284f(this.f24700a);
                if (packageInfo == null) {
                    m28231c = C6858P.m28231c("null pkg");
                } else {
                    Signature[] signatureArr = packageInfo.signatures;
                    if (signatureArr == null || signatureArr.length != 1) {
                        m28231c = C6858P.m28231c("single cert required");
                    } else {
                        BinderC6846D binderC6846D = new BinderC6846D(packageInfo.signatures[0].toByteArray());
                        String str2 = packageInfo.packageName;
                        C6858P m28218a = AbstractC6849G.m28218a(str2, binderC6846D, m28284f, false);
                        m28231c = (!m28218a.f24668a || (applicationInfo = packageInfo.applicationInfo) == null || (applicationInfo.flags & 2) == 0 || !AbstractC6849G.m28218a(str2, binderC6846D, false, true).f24668a) ? m28218a : C6858P.m28231c("debuggable release cert app rejected");
                    }
                }
            } catch (PackageManager.NameNotFoundException e7) {
                return C6858P.m28232d("no pkg ".concat(str), e7);
            }
        }
        if (m28231c.f24668a) {
            this.f24701b = str;
        }
        return m28231c;
    }
}
