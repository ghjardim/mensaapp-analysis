package com.google.android.gms.common.internal;

import org.apache.tika.utils.StringUtils;
import p256j$.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.android.gms.common.internal.n */
/* loaded from: classes.dex */
public class C3794n {

    /* renamed from: b */
    public static final C3784i f12527b = new C3784i("LibraryVersion", StringUtils.EMPTY);

    /* renamed from: c */
    public static final C3794n f12528c = new C3794n();

    /* renamed from: a */
    public final ConcurrentHashMap f12529a = new ConcurrentHashMap();

    /* renamed from: a */
    public static C3794n m15095a() {
        return f12528c;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0098  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String m15096b(java.lang.String r9) {
        /*
            r8 = this;
            java.lang.String r0 = "Failed to get app version for libraryName: "
            java.lang.String r1 = "LibraryVersion"
            java.lang.String r2 = "Please provide a valid libraryName"
            com.google.android.gms.common.internal.AbstractC3802r.m15124f(r9, r2)
            j$.util.concurrent.ConcurrentHashMap r2 = r8.f12529a
            boolean r2 = r2.containsKey(r9)
            if (r2 == 0) goto L1a
            j$.util.concurrent.ConcurrentHashMap r0 = r8.f12529a
            java.lang.Object r9 = r0.get(r9)
            java.lang.String r9 = (java.lang.String) r9
            return r9
        L1a:
            java.util.Properties r2 = new java.util.Properties
            r2.<init>()
            r3 = 0
            java.lang.String r4 = "/%s.properties"
            r5 = 1
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch: java.io.IOException -> L75 java.lang.Throwable -> L77
            r6 = 0
            r5[r6] = r9     // Catch: java.io.IOException -> L75 java.lang.Throwable -> L77
            java.lang.String r4 = java.lang.String.format(r4, r5)     // Catch: java.io.IOException -> L75 java.lang.Throwable -> L77
            java.lang.Class<com.google.android.gms.common.internal.n> r5 = com.google.android.gms.common.internal.C3794n.class
            java.io.InputStream r4 = r5.getResourceAsStream(r4)     // Catch: java.io.IOException -> L75 java.lang.Throwable -> L77
            if (r4 == 0) goto L5e
            r2.load(r4)     // Catch: java.lang.Throwable -> L57 java.io.IOException -> L59
            java.lang.String r5 = "version"
            java.lang.String r3 = r2.getProperty(r5, r3)     // Catch: java.lang.Throwable -> L57 java.io.IOException -> L59
            com.google.android.gms.common.internal.i r2 = com.google.android.gms.common.internal.C3794n.f12527b     // Catch: java.lang.Throwable -> L57 java.io.IOException -> L59
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L57 java.io.IOException -> L59
            r5.<init>()     // Catch: java.lang.Throwable -> L57 java.io.IOException -> L59
            r5.append(r9)     // Catch: java.lang.Throwable -> L57 java.io.IOException -> L59
            java.lang.String r6 = " version is "
            r5.append(r6)     // Catch: java.lang.Throwable -> L57 java.io.IOException -> L59
            r5.append(r3)     // Catch: java.lang.Throwable -> L57 java.io.IOException -> L59
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L57 java.io.IOException -> L59
            r2.m15091d(r1, r5)     // Catch: java.lang.Throwable -> L57 java.io.IOException -> L59
            goto L91
        L57:
            r9 = move-exception
            goto L73
        L59:
            r2 = move-exception
            r7 = r4
            r4 = r3
            r3 = r7
            goto L7a
        L5e:
            com.google.android.gms.common.internal.i r2 = com.google.android.gms.common.internal.C3794n.f12527b     // Catch: java.lang.Throwable -> L57 java.io.IOException -> L59
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L57 java.io.IOException -> L59
            r5.<init>()     // Catch: java.lang.Throwable -> L57 java.io.IOException -> L59
            r5.append(r0)     // Catch: java.lang.Throwable -> L57 java.io.IOException -> L59
            r5.append(r9)     // Catch: java.lang.Throwable -> L57 java.io.IOException -> L59
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L57 java.io.IOException -> L59
            r2.m15092e(r1, r5)     // Catch: java.lang.Throwable -> L57 java.io.IOException -> L59
            goto L91
        L73:
            r3 = r4
            goto La7
        L75:
            r2 = move-exception
            goto L79
        L77:
            r9 = move-exception
            goto La7
        L79:
            r4 = r3
        L7a:
            com.google.android.gms.common.internal.i r5 = com.google.android.gms.common.internal.C3794n.f12527b     // Catch: java.lang.Throwable -> L77
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L77
            r6.<init>()     // Catch: java.lang.Throwable -> L77
            r6.append(r0)     // Catch: java.lang.Throwable -> L77
            r6.append(r9)     // Catch: java.lang.Throwable -> L77
            java.lang.String r0 = r6.toString()     // Catch: java.lang.Throwable -> L77
            r5.m15090c(r1, r0, r2)     // Catch: java.lang.Throwable -> L77
            r7 = r4
            r4 = r3
            r3 = r7
        L91:
            if (r4 == 0) goto L96
            p031E2.AbstractC0274j.m1127a(r4)
        L96:
            if (r3 != 0) goto La1
            com.google.android.gms.common.internal.i r0 = com.google.android.gms.common.internal.C3794n.f12527b
            java.lang.String r2 = ".properties file is dropped during release process. Failure to read app version is expected during Google internal testing where locally-built libraries are used"
            r0.m15089b(r1, r2)
            java.lang.String r3 = "UNKNOWN"
        La1:
            j$.util.concurrent.ConcurrentHashMap r0 = r8.f12529a
            r0.put(r9, r3)
            return r3
        La7:
            if (r3 == 0) goto Lac
            p031E2.AbstractC0274j.m1127a(r3)
        Lac:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.C3794n.m15096b(java.lang.String):java.lang.String");
    }
}
