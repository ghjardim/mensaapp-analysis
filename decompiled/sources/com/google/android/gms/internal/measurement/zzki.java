package com.google.android.gms.internal.measurement;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import p171Y2.AbstractC2932o;

/* loaded from: classes.dex */
public abstract class zzki {
    public static final /* synthetic */ int zzc = 0;
    private static final Object zzd = new Object();
    private static volatile zzkg zze = null;
    private static volatile boolean zzf = false;
    private static final AtomicInteger zzg;
    final zzkf zza;
    final String zzb;
    private Object zzh;
    private volatile int zzi = -1;
    private volatile Object zzj;
    private volatile boolean zzk;

    static {
        new AtomicReference();
        AbstractC2932o.m10573p(new Object() { // from class: com.google.android.gms.internal.measurement.zzka
        }, "BuildInfo must be non-null");
        zzg = new AtomicInteger();
    }

    public /* synthetic */ zzki(zzkf zzkfVar, String str, Object obj, boolean z6, zzkh zzkhVar) {
        if (zzkfVar.zza == null) {
            throw new IllegalArgumentException("Must pass a valid SharedPreferences file name or ContentProvider URI");
        }
        this.zza = zzkfVar;
        this.zzb = str;
        this.zzh = obj;
        this.zzk = false;
    }

    public static void zzc() {
        zzg.incrementAndGet();
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0047, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x004c, code lost:
    
        throw r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void zzd(final android.content.Context r3) {
        /*
            com.google.android.gms.internal.measurement.zzkg r0 = com.google.android.gms.internal.measurement.zzki.zze
            if (r0 != 0) goto L4d
            if (r3 != 0) goto L7
            goto L4d
        L7:
            java.lang.Object r0 = com.google.android.gms.internal.measurement.zzki.zzd
            monitor-enter(r0)
            com.google.android.gms.internal.measurement.zzkg r1 = com.google.android.gms.internal.measurement.zzki.zze     // Catch: java.lang.Throwable -> L47
            if (r1 != 0) goto L49
            monitor-enter(r0)     // Catch: java.lang.Throwable -> L47
            com.google.android.gms.internal.measurement.zzkg r1 = com.google.android.gms.internal.measurement.zzki.zze     // Catch: java.lang.Throwable -> L21
            android.content.Context r2 = r3.getApplicationContext()     // Catch: java.lang.Throwable -> L21
            if (r2 == 0) goto L18
            r3 = r2
        L18:
            if (r1 == 0) goto L23
            android.content.Context r2 = r1.zza()     // Catch: java.lang.Throwable -> L21
            if (r2 == r3) goto L43
            goto L23
        L21:
            r3 = move-exception
            goto L45
        L23:
            if (r1 == 0) goto L2e
            com.google.android.gms.internal.measurement.zzjm.zze()     // Catch: java.lang.Throwable -> L21
            com.google.android.gms.internal.measurement.zzkk.zzd()     // Catch: java.lang.Throwable -> L21
            com.google.android.gms.internal.measurement.zzju.zze()     // Catch: java.lang.Throwable -> L21
        L2e:
            com.google.android.gms.internal.measurement.zzjz r1 = new com.google.android.gms.internal.measurement.zzjz     // Catch: java.lang.Throwable -> L21
            r1.<init>()     // Catch: java.lang.Throwable -> L21
            Y2.v r1 = p171Y2.AbstractC2940w.m10611a(r1)     // Catch: java.lang.Throwable -> L21
            com.google.android.gms.internal.measurement.zzjj r2 = new com.google.android.gms.internal.measurement.zzjj     // Catch: java.lang.Throwable -> L21
            r2.<init>(r3, r1)     // Catch: java.lang.Throwable -> L21
            com.google.android.gms.internal.measurement.zzki.zze = r2     // Catch: java.lang.Throwable -> L21
            java.util.concurrent.atomic.AtomicInteger r3 = com.google.android.gms.internal.measurement.zzki.zzg     // Catch: java.lang.Throwable -> L21
            r3.incrementAndGet()     // Catch: java.lang.Throwable -> L21
        L43:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L21
            goto L49
        L45:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L21
            throw r3     // Catch: java.lang.Throwable -> L47
        L47:
            r3 = move-exception
            goto L4b
        L49:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L47
            return
        L4b:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L47
            throw r3
        L4d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzki.zzd(android.content.Context):void");
    }

    public abstract Object zza(Object obj);

    /* JADX WARN: Removed duplicated region for block: B:15:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005b A[Catch: all -> 0x0047, TryCatch #0 {all -> 0x0047, blocks: (B:5:0x000b, B:7:0x000f, B:9:0x0018, B:11:0x001e, B:13:0x0034, B:16:0x0050, B:18:0x005b, B:20:0x0065, B:22:0x008e, B:24:0x0096, B:27:0x00bd, B:30:0x00c5, B:31:0x00c8, B:32:0x00cc, B:33:0x009f, B:35:0x00a3, B:37:0x00b3, B:39:0x00b9, B:43:0x0079, B:46:0x00d0), top: B:4:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009f A[Catch: all -> 0x0047, TryCatch #0 {all -> 0x0047, blocks: (B:5:0x000b, B:7:0x000f, B:9:0x0018, B:11:0x001e, B:13:0x0034, B:16:0x0050, B:18:0x005b, B:20:0x0065, B:22:0x008e, B:24:0x0096, B:27:0x00bd, B:30:0x00c5, B:31:0x00c8, B:32:0x00cc, B:33:0x009f, B:35:0x00a3, B:37:0x00b3, B:39:0x00b9, B:43:0x0079, B:46:0x00d0), top: B:4:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0079 A[Catch: all -> 0x0047, TryCatch #0 {all -> 0x0047, blocks: (B:5:0x000b, B:7:0x000f, B:9:0x0018, B:11:0x001e, B:13:0x0034, B:16:0x0050, B:18:0x005b, B:20:0x0065, B:22:0x008e, B:24:0x0096, B:27:0x00bd, B:30:0x00c5, B:31:0x00c8, B:32:0x00cc, B:33:0x009f, B:35:0x00a3, B:37:0x00b3, B:39:0x00b9, B:43:0x0079, B:46:0x00d0), top: B:4:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object zzb() {
        /*
            r9 = this;
            java.util.concurrent.atomic.AtomicInteger r0 = com.google.android.gms.internal.measurement.zzki.zzg
            int r0 = r0.get()
            int r1 = r9.zzi
            if (r1 >= r0) goto Ld4
            monitor-enter(r9)
            int r1 = r9.zzi     // Catch: java.lang.Throwable -> L47
            if (r1 >= r0) goto Ld0
            com.google.android.gms.internal.measurement.zzkg r1 = com.google.android.gms.internal.measurement.zzki.zze     // Catch: java.lang.Throwable -> L47
            Y2.l r2 = p171Y2.AbstractC2929l.m10552a()     // Catch: java.lang.Throwable -> L47
            r3 = 0
            if (r1 == 0) goto L4a
            Y2.v r4 = r1.zzb()     // Catch: java.lang.Throwable -> L47
            if (r4 == 0) goto L4a
            Y2.v r2 = r1.zzb()     // Catch: java.lang.Throwable -> L47
            java.lang.Object r2 = p171Y2.AbstractC2932o.m10572o(r2)     // Catch: java.lang.Throwable -> L47
            Y2.v r2 = (p171Y2.InterfaceC2939v) r2     // Catch: java.lang.Throwable -> L47
            java.lang.Object r2 = r2.get()     // Catch: java.lang.Throwable -> L47
            Y2.l r2 = (p171Y2.AbstractC2929l) r2     // Catch: java.lang.Throwable -> L47
            boolean r4 = r2.mo10506c()     // Catch: java.lang.Throwable -> L47
            if (r4 == 0) goto L4a
            java.lang.Object r4 = r2.mo10505b()     // Catch: java.lang.Throwable -> L47
            com.google.android.gms.internal.measurement.zzjo r4 = (com.google.android.gms.internal.measurement.zzjo) r4     // Catch: java.lang.Throwable -> L47
            com.google.android.gms.internal.measurement.zzkf r5 = r9.zza     // Catch: java.lang.Throwable -> L47
            android.net.Uri r6 = r5.zza     // Catch: java.lang.Throwable -> L47
            java.lang.String r5 = r5.zzc     // Catch: java.lang.Throwable -> L47
            java.lang.String r7 = r9.zzb     // Catch: java.lang.Throwable -> L47
            java.lang.String r4 = r4.zza(r6, r3, r5, r7)     // Catch: java.lang.Throwable -> L47
            goto L4b
        L47:
            r0 = move-exception
            goto Ld2
        L4a:
            r4 = r3
        L4b:
            if (r1 == 0) goto L4f
            r5 = 1
            goto L50
        L4f:
            r5 = 0
        L50:
            java.lang.String r6 = "Must call PhenotypeFlagInitializer.maybeInit() first"
            p171Y2.AbstractC2932o.m10579v(r5, r6)     // Catch: java.lang.Throwable -> L47
            com.google.android.gms.internal.measurement.zzkf r5 = r9.zza     // Catch: java.lang.Throwable -> L47
            android.net.Uri r6 = r5.zza     // Catch: java.lang.Throwable -> L47
            if (r6 == 0) goto L79
            android.content.Context r7 = r1.zza()     // Catch: java.lang.Throwable -> L47
            boolean r7 = com.google.android.gms.internal.measurement.zzjw.zza(r7, r6)     // Catch: java.lang.Throwable -> L47
            if (r7 == 0) goto L77
            android.content.Context r7 = r1.zza()     // Catch: java.lang.Throwable -> L47
            android.content.ContentResolver r7 = r7.getContentResolver()     // Catch: java.lang.Throwable -> L47
            com.google.android.gms.internal.measurement.zzjy r8 = new com.google.android.gms.internal.measurement.zzjy     // Catch: java.lang.Throwable -> L47
            r8.<init>()     // Catch: java.lang.Throwable -> L47
            com.google.android.gms.internal.measurement.zzjm r6 = com.google.android.gms.internal.measurement.zzjm.zza(r7, r6, r8)     // Catch: java.lang.Throwable -> L47
            goto L8c
        L77:
            r6 = r3
            goto L8c
        L79:
            android.content.Context r6 = r1.zza()     // Catch: java.lang.Throwable -> L47
            java.lang.Object r7 = p171Y2.AbstractC2932o.m10572o(r3)     // Catch: java.lang.Throwable -> L47
            java.lang.String r7 = (java.lang.String) r7     // Catch: java.lang.Throwable -> L47
            com.google.android.gms.internal.measurement.zzjy r8 = new com.google.android.gms.internal.measurement.zzjy     // Catch: java.lang.Throwable -> L47
            r8.<init>()     // Catch: java.lang.Throwable -> L47
            com.google.android.gms.internal.measurement.zzkk r6 = com.google.android.gms.internal.measurement.zzkk.zza(r6, r7, r8)     // Catch: java.lang.Throwable -> L47
        L8c:
            if (r6 == 0) goto L9b
            java.lang.String r7 = r9.zzb     // Catch: java.lang.Throwable -> L47
            java.lang.Object r6 = r6.zzb(r7)     // Catch: java.lang.Throwable -> L47
            if (r6 == 0) goto L9b
            java.lang.Object r6 = r9.zza(r6)     // Catch: java.lang.Throwable -> L47
            goto L9c
        L9b:
            r6 = r3
        L9c:
            if (r6 == 0) goto L9f
            goto Lbd
        L9f:
            boolean r5 = r5.zzd     // Catch: java.lang.Throwable -> L47
            if (r5 != 0) goto Lb7
            android.content.Context r1 = r1.zza()     // Catch: java.lang.Throwable -> L47
            com.google.android.gms.internal.measurement.zzju r1 = com.google.android.gms.internal.measurement.zzju.zza(r1)     // Catch: java.lang.Throwable -> L47
            java.lang.String r5 = r9.zzb     // Catch: java.lang.Throwable -> L47
            java.lang.String r1 = r1.zzb(r5)     // Catch: java.lang.Throwable -> L47
            if (r1 == 0) goto Lb7
            java.lang.Object r3 = r9.zza(r1)     // Catch: java.lang.Throwable -> L47
        Lb7:
            if (r3 != 0) goto Lbc
            java.lang.Object r6 = r9.zzh     // Catch: java.lang.Throwable -> L47
            goto Lbd
        Lbc:
            r6 = r3
        Lbd:
            boolean r1 = r2.mo10506c()     // Catch: java.lang.Throwable -> L47
            if (r1 == 0) goto Lcc
            if (r4 != 0) goto Lc8
            java.lang.Object r6 = r9.zzh     // Catch: java.lang.Throwable -> L47
            goto Lcc
        Lc8:
            java.lang.Object r6 = r9.zza(r4)     // Catch: java.lang.Throwable -> L47
        Lcc:
            r9.zzj = r6     // Catch: java.lang.Throwable -> L47
            r9.zzi = r0     // Catch: java.lang.Throwable -> L47
        Ld0:
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L47
            goto Ld4
        Ld2:
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L47
            throw r0
        Ld4:
            java.lang.Object r0 = r9.zzj
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzki.zzb():java.lang.Object");
    }
}
