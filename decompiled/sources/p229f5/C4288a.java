package p229f5;

import android.content.Context;
import android.content.pm.Signature;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.Arrays;
import kotlin.jvm.internal.AbstractC5469l;
import kotlin.jvm.internal.C5483z;
import p026D4.InterfaceC0191a;
import p061I4.C0659k;

/* renamed from: f5.a */
/* loaded from: classes2.dex */
public final class C4288a implements C0659k.c, InterfaceC0191a {

    /* renamed from: c */
    public C0659k f14739c;

    /* renamed from: d */
    public Context f14740d;

    @Override // p026D4.InterfaceC0191a
    /* renamed from: C */
    public void mo782C(InterfaceC0191a.b binding) {
        AbstractC5469l.m23028e(binding, "binding");
        this.f14740d = binding.m785a();
        C0659k c0659k = new C0659k(binding.m786b(), "google_api_headers");
        c0659k.m2654e(this);
        this.f14739c = c0659k;
    }

    /* renamed from: a */
    public final void m17927a(Signature signature, C0659k.d dVar) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA1");
            AbstractC5469l.m23027d(messageDigest, "getInstance(...)");
            messageDigest.update(signature.toByteArray());
            byte[] digest = messageDigest.digest();
            AbstractC5469l.m23027d(digest, "digest(...)");
            BigInteger bigInteger = new BigInteger(1, digest);
            C5483z c5483z = C5483z.f19713a;
            String format = String.format("%0" + (digest.length << 1) + 'x', Arrays.copyOf(new Object[]{bigInteger}, 1));
            AbstractC5469l.m23027d(format, "format(format, *args)");
            dVar.mo2314a(format);
        } catch (Exception e7) {
            dVar.mo2315b("PARSE_ERROR", "Failed to parse signature: " + e7.getMessage(), null);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0043, code lost:
    
        r0 = r0.getApkContentsSigners();
     */
    @Override // p061I4.C0659k.c
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo2185b(p061I4.C0658j r6, p061I4.C0659k.d r7) {
        /*
            r5 = this;
            java.lang.String r0 = "ARGUMENT_ERROR"
            java.lang.String r1 = "call"
            kotlin.jvm.internal.AbstractC5469l.m23028e(r6, r1)
            java.lang.String r1 = "result"
            kotlin.jvm.internal.AbstractC5469l.m23028e(r7, r1)
            java.lang.String r1 = r6.f2254a
            java.lang.String r2 = "getSigningCertSha1"
            boolean r1 = kotlin.jvm.internal.AbstractC5469l.m23024a(r1, r2)
            if (r1 == 0) goto Ld3
            r1 = 0
            java.lang.Object r6 = r6.m2648b()     // Catch: java.lang.Exception -> Lb9
            java.lang.String r6 = (java.lang.String) r6     // Catch: java.lang.Exception -> Lb9
            if (r6 == 0) goto Lb3
            int r2 = r6.length()
            if (r2 != 0) goto L27
            goto Lb3
        L27:
            android.content.Context r0 = r5.f14740d     // Catch: java.lang.Exception -> L57 android.content.pm.PackageManager.NameNotFoundException -> L95
            kotlin.jvm.internal.AbstractC5469l.m23025b(r0)     // Catch: java.lang.Exception -> L57 android.content.pm.PackageManager.NameNotFoundException -> L95
            android.content.pm.PackageManager r0 = r0.getPackageManager()     // Catch: java.lang.Exception -> L57 android.content.pm.PackageManager.NameNotFoundException -> L95
            int r2 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Exception -> L57 android.content.pm.PackageManager.NameNotFoundException -> L95
            r3 = 28
            r4 = 0
            if (r2 < r3) goto L5d
            r2 = 134217728(0x8000000, float:3.85186E-34)
            android.content.pm.PackageInfo r0 = r0.getPackageInfo(r6, r2)     // Catch: java.lang.Exception -> L57 android.content.pm.PackageManager.NameNotFoundException -> L95
            android.content.pm.SigningInfo r0 = com.google.android.gms.internal.p395firebaseauthapi.AbstractC3836a.m15196a(r0)     // Catch: java.lang.Exception -> L57 android.content.pm.PackageManager.NameNotFoundException -> L95
            if (r0 == 0) goto Ld6
            android.content.pm.Signature[] r0 = com.google.android.gms.internal.p395firebaseauthapi.AbstractC3837b.m15197a(r0)     // Catch: java.lang.Exception -> L57 android.content.pm.PackageManager.NameNotFoundException -> L95
            if (r0 == 0) goto Ld6
            int r2 = r0.length     // Catch: java.lang.Exception -> L57 android.content.pm.PackageManager.NameNotFoundException -> L95
        L4a:
            if (r4 >= r2) goto L59
            r3 = r0[r4]     // Catch: java.lang.Exception -> L57 android.content.pm.PackageManager.NameNotFoundException -> L95
            kotlin.jvm.internal.AbstractC5469l.m23025b(r3)     // Catch: java.lang.Exception -> L57 android.content.pm.PackageManager.NameNotFoundException -> L95
            r5.m17927a(r3, r7)     // Catch: java.lang.Exception -> L57 android.content.pm.PackageManager.NameNotFoundException -> L95
            int r4 = r4 + 1
            goto L4a
        L57:
            r6 = move-exception
            goto L78
        L59:
            w5.q r6 = p371w5.C6934q.f24811a     // Catch: java.lang.Exception -> L57 android.content.pm.PackageManager.NameNotFoundException -> L95
            goto Ld6
        L5d:
            r2 = 64
            android.content.pm.PackageInfo r0 = r0.getPackageInfo(r6, r2)     // Catch: java.lang.Exception -> L57 android.content.pm.PackageManager.NameNotFoundException -> L95
            android.content.pm.Signature[] r0 = r0.signatures     // Catch: java.lang.Exception -> L57 android.content.pm.PackageManager.NameNotFoundException -> L95
            if (r0 == 0) goto Ld6
            int r2 = r0.length     // Catch: java.lang.Exception -> L57 android.content.pm.PackageManager.NameNotFoundException -> L95
        L68:
            if (r4 >= r2) goto L75
            r3 = r0[r4]     // Catch: java.lang.Exception -> L57 android.content.pm.PackageManager.NameNotFoundException -> L95
            kotlin.jvm.internal.AbstractC5469l.m23025b(r3)     // Catch: java.lang.Exception -> L57 android.content.pm.PackageManager.NameNotFoundException -> L95
            r5.m17927a(r3, r7)     // Catch: java.lang.Exception -> L57 android.content.pm.PackageManager.NameNotFoundException -> L95
            int r4 = r4 + 1
            goto L68
        L75:
            w5.q r6 = p371w5.C6934q.f24811a     // Catch: java.lang.Exception -> L57 android.content.pm.PackageManager.NameNotFoundException -> L95
            goto Ld6
        L78:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "An unexpected error occurred: "
            r0.append(r2)
            java.lang.String r6 = r6.getMessage()
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            java.lang.String r0 = "ERROR"
            r7.mo2315b(r0, r6, r1)
            w5.q r6 = p371w5.C6934q.f24811a
            goto Ld6
        L95:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "Package '"
            r0.append(r2)
            r0.append(r6)
            java.lang.String r6 = "' not found."
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            java.lang.String r0 = "PACKAGE_NOT_FOUND"
            r7.mo2315b(r0, r6, r1)
            w5.q r6 = p371w5.C6934q.f24811a
            goto Ld6
        Lb3:
            java.lang.String r6 = "Package name argument is missing or empty"
            r7.mo2315b(r0, r6, r1)
            return
        Lb9:
            r6 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Failed to retrieve package name argument: "
            r2.append(r3)
            java.lang.String r6 = r6.getMessage()
            r2.append(r6)
            java.lang.String r6 = r2.toString()
            r7.mo2315b(r0, r6, r1)
            return
        Ld3:
            r7.mo2316c()
        Ld6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p229f5.C4288a.mo2185b(I4.j, I4.k$d):void");
    }

    @Override // p026D4.InterfaceC0191a
    /* renamed from: y */
    public void mo783y(InterfaceC0191a.b binding) {
        AbstractC5469l.m23028e(binding, "binding");
        C0659k c0659k = this.f14739c;
        if (c0659k != null) {
            c0659k.m2654e(null);
        }
        this.f14739c = null;
        this.f14740d = null;
    }
}
