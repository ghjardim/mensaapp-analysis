package com.google.android.gms.internal.p395firebaseauthapi;

import com.google.android.gms.internal.p395firebaseauthapi.zzwb;
import com.google.android.gms.internal.p395firebaseauthapi.zzwl;
import java.security.GeneralSecurityException;
import java.util.List;

/* loaded from: classes.dex */
public final class zzbs {
    private final zzwl zza;
    private final List<zzbv> zzb;
    private final zznr zzc;

    /*  JADX ERROR: JadxRuntimeException in pass: ProcessVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Method arg registers not loaded: com.google.android.gms.internal.firebase-auth-api.zzbv.<init>(com.google.android.gms.internal.firebase-auth-api.zzbo, com.google.android.gms.internal.firebase-auth-api.zzbq, int, boolean, com.google.android.gms.internal.firebase-auth-api.zzby):void, class status: GENERATED_AND_UNLOADED
        	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:290)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.isArgUnused(ProcessVariables.java:146)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.lambda$isVarUnused$0(ProcessVariables.java:131)
        	at jadx.core.utils.ListUtils.allMatch(ListUtils.java:193)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.isVarUnused(ProcessVariables.java:131)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.processBlock(ProcessVariables.java:82)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:64)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables.removeUnusedResults(ProcessVariables.java:73)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables.visit(ProcessVariables.java:48)
        */
    private static java.util.List<com.google.android.gms.internal.p395firebaseauthapi.zzbv> zzc(com.google.android.gms.internal.p395firebaseauthapi.zzwl r10) {
        /*
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r10.zza()
            r0.<init>(r1)
            java.util.List r1 = r10.zze()
            java.util.Iterator r1 = r1.iterator()
        L11:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L48
            java.lang.Object r2 = r1.next()
            com.google.android.gms.internal.firebase-auth-api.zzwl$zza r2 = (com.google.android.gms.internal.firebase-auth-api.zzwl.zza) r2
            int r6 = r2.zza()
            com.google.android.gms.internal.firebase-auth-api.zzbo r4 = zza(r2)     // Catch: java.security.GeneralSecurityException -> L43
            com.google.android.gms.internal.firebase-auth-api.zzbv r9 = new com.google.android.gms.internal.firebase-auth-api.zzbv     // Catch: java.security.GeneralSecurityException -> L43
            com.google.android.gms.internal.firebase-auth-api.zzwc r2 = r2.zzc()     // Catch: java.security.GeneralSecurityException -> L43
            com.google.android.gms.internal.firebase-auth-api.zzbq r5 = zza(r2)     // Catch: java.security.GeneralSecurityException -> L43
            int r2 = r10.zzb()     // Catch: java.security.GeneralSecurityException -> L43
            if (r6 != r2) goto L38
            r2 = 1
        L36:
            r7 = r2
            goto L3a
        L38:
            r2 = 0
            goto L36
        L3a:
            r8 = 0
            r3 = r9
            r3.<init>(r4, r5, r6, r7)     // Catch: java.security.GeneralSecurityException -> L43
            r0.add(r9)     // Catch: java.security.GeneralSecurityException -> L43
            goto L11
        L43:
            r2 = 0
            r0.add(r2)
            goto L11
        L48:
            java.util.List r10 = p256j$.util.DesugarCollections.unmodifiableList(r0)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p395firebaseauthapi.zzbs.zzc(com.google.android.gms.internal.firebase-auth-api.zzwl):java.util.List");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzd(zzwl zzwlVar) {
        if (zzwlVar == null || zzwlVar.zza() <= 0) {
            throw new GeneralSecurityException("empty keyset");
        }
    }

    public final String toString() {
        return zzcn.zza(this.zza).toString();
    }

    private zzbs(zzwl zzwlVar, List<zzbv> list) {
        this.zza = zzwlVar;
        this.zzb = list;
        this.zzc = zznr.zza;
    }

    private static zzbo zza(zzwl.zza zzaVar) {
        zzpn zza = zzpn.zza(zzaVar.zzb().zzf(), zzaVar.zzb().zze(), zzaVar.zzb().zzb(), zzaVar.zzf(), zzaVar.zzf() == zzxd.RAW ? null : Integer.valueOf(zzaVar.zza()));
        zzom zza2 = zzom.zza();
        zzcm zza3 = zzcm.zza();
        return !zza2.zzb(zza) ? new zznn(zza, zza3) : zza2.zza((zzom) zza, zza3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzwl.zza zzb(zzbo zzboVar, zzbq zzbqVar, int i7) {
        zzwc zzwcVar;
        zzpn zzpnVar = (zzpn) zzom.zza().zza(zzboVar, zzpn.class, zzcm.zza());
        Integer zze = zzpnVar.zze();
        if (zze != null && zze.intValue() != i7) {
            throw new GeneralSecurityException("Wrong ID set for key with ID requirement");
        }
        if (zzbq.zza.equals(zzbqVar)) {
            zzwcVar = zzwc.ENABLED;
        } else if (zzbq.zzb.equals(zzbqVar)) {
            zzwcVar = zzwc.DISABLED;
        } else {
            if (!zzbq.zzc.equals(zzbqVar)) {
                throw new IllegalStateException("Unknown key status");
            }
            zzwcVar = zzwc.DESTROYED;
        }
        return (zzwl.zza) ((zzakg) zzwl.zza.zzd().zza(zzwb.zza().zza(zzpnVar.zzf()).zza(zzpnVar.zzd()).zza(zzpnVar.zza())).zza(zzwcVar).zza(i7).zza(zzpnVar.zzc()).zze());
    }

    private zzbs(zzwl zzwlVar, List<zzbv> list, zznr zznrVar) {
        this.zza = zzwlVar;
        this.zzb = list;
        this.zzc = zznrVar;
    }

    private static zzbq zza(zzwc zzwcVar) {
        int i7 = zzbr.zza[zzwcVar.ordinal()];
        if (i7 == 1) {
            return zzbq.zza;
        }
        if (i7 == 2) {
            return zzbq.zzb;
        }
        if (i7 == 3) {
            return zzbq.zzc;
        }
        throw new GeneralSecurityException("Unknown key status");
    }

    public static final zzbs zza(zzwl zzwlVar) {
        zzd(zzwlVar);
        return new zzbs(zzwlVar, zzc(zzwlVar));
    }

    public static final zzbs zza(zzbp zzbpVar) {
        return new zzbu().zza(new zzbt(zzbpVar.zza()).zzb().zza()).zza();
    }

    public final zzwl zzb() {
        return this.zza;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ProcessVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Method arg registers not loaded: com.google.android.gms.internal.firebase-auth-api.zzbv.<init>(com.google.android.gms.internal.firebase-auth-api.zzbo, com.google.android.gms.internal.firebase-auth-api.zzbq, int, boolean, com.google.android.gms.internal.firebase-auth-api.zzby):void, class status: GENERATED_AND_UNLOADED
        	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:290)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.isArgUnused(ProcessVariables.java:146)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.lambda$isVarUnused$0(ProcessVariables.java:131)
        	at jadx.core.utils.ListUtils.allMatch(ListUtils.java:193)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.isVarUnused(ProcessVariables.java:131)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.processBlock(ProcessVariables.java:82)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:64)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1117)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1117)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1117)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1117)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables.removeUnusedResults(ProcessVariables.java:73)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables.visit(ProcessVariables.java:48)
        */
    public final com.google.android.gms.internal.p395firebaseauthapi.zzbs zza() {
        /*
            r14 = this;
            com.google.android.gms.internal.firebase-auth-api.zzwl r0 = r14.zza
            if (r0 == 0) goto Ldc
            com.google.android.gms.internal.firebase-auth-api.zzwl$zzb r0 = com.google.android.gms.internal.p395firebaseauthapi.zzwl.zzc()
            java.util.ArrayList r1 = new java.util.ArrayList
            java.util.List<com.google.android.gms.internal.firebase-auth-api.zzbv> r2 = r14.zzb
            int r2 = r2.size()
            r1.<init>(r2)
            java.util.List<com.google.android.gms.internal.firebase-auth-api.zzbv> r2 = r14.zzb
            java.util.Iterator r2 = r2.iterator()
            r3 = 0
            r4 = r3
        L1b:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto Lc3
            java.lang.Object r5 = r2.next()
            com.google.android.gms.internal.firebase-auth-api.zzbv r5 = (com.google.android.gms.internal.p395firebaseauthapi.zzbv) r5
            if (r5 == 0) goto L5c
            com.google.android.gms.internal.firebase-auth-api.zzbo r6 = r5.zzb()
            boolean r6 = r6 instanceof com.google.android.gms.internal.p395firebaseauthapi.zzcf
            if (r6 == 0) goto L5c
            com.google.android.gms.internal.firebase-auth-api.zzbo r6 = r5.zzb()
            com.google.android.gms.internal.firebase-auth-api.zzcf r6 = (com.google.android.gms.internal.p395firebaseauthapi.zzcf) r6
            com.google.android.gms.internal.firebase-auth-api.zzbo r6 = r6.zzb()
            com.google.android.gms.internal.firebase-auth-api.zzbv r13 = new com.google.android.gms.internal.firebase-auth-api.zzbv
            com.google.android.gms.internal.firebase-auth-api.zzbq r9 = r5.zzc()
            int r10 = r5.zza()
            boolean r11 = r5.zzd()
            r12 = 0
            r7 = r13
            r8 = r6
            r7.<init>(r8, r9, r10, r11)
            com.google.android.gms.internal.firebase-auth-api.zzbq r7 = r5.zzc()
            int r5 = r5.zza()
            com.google.android.gms.internal.firebase-auth-api.zzwl$zza r5 = zzb(r6, r7, r5)
            goto Lb1
        L5c:
            com.google.android.gms.internal.firebase-auth-api.zzwl r5 = r14.zza
            com.google.android.gms.internal.firebase-auth-api.zzwl$zza r5 = r5.zza(r4)
            com.google.android.gms.internal.firebase-auth-api.zzwb r6 = r5.zzb()
            com.google.android.gms.internal.firebase-auth-api.zzwb$zza r7 = r6.zzb()
            com.google.android.gms.internal.firebase-auth-api.zzwb$zza r8 = com.google.android.gms.internal.firebase-auth-api.zzwb.zza.ASYMMETRIC_PRIVATE
            if (r7 != r8) goto Lbb
            java.lang.String r7 = r6.zzf()
            com.google.android.gms.internal.firebase-auth-api.zzaiw r6 = r6.zze()
            com.google.android.gms.internal.firebase-auth-api.zzwb r6 = com.google.android.gms.internal.p395firebaseauthapi.zzcj.zza(r7, r6)
            com.google.android.gms.internal.firebase-auth-api.zzakg$zzb r5 = r5.zzn()
            com.google.android.gms.internal.firebase-auth-api.zzwl$zza$zza r5 = (com.google.android.gms.internal.firebase-auth-api.zzwl.zza.C7215zza) r5
            com.google.android.gms.internal.firebase-auth-api.zzwl$zza$zza r5 = r5.zza(r6)
            com.google.android.gms.internal.firebase-auth-api.zzaln r5 = r5.zze()
            com.google.android.gms.internal.firebase-auth-api.zzakg r5 = (com.google.android.gms.internal.p395firebaseauthapi.zzakg) r5
            com.google.android.gms.internal.firebase-auth-api.zzwl$zza r5 = (com.google.android.gms.internal.firebase-auth-api.zzwl.zza) r5
            com.google.android.gms.internal.firebase-auth-api.zzbo r7 = zza(r5)     // Catch: java.security.GeneralSecurityException -> Lb0
            int r9 = r5.zza()     // Catch: java.security.GeneralSecurityException -> Lb0
            com.google.android.gms.internal.firebase-auth-api.zzbv r13 = new com.google.android.gms.internal.firebase-auth-api.zzbv     // Catch: java.security.GeneralSecurityException -> Lb0
            com.google.android.gms.internal.firebase-auth-api.zzwc r6 = r5.zzc()     // Catch: java.security.GeneralSecurityException -> Lb0
            com.google.android.gms.internal.firebase-auth-api.zzbq r8 = zza(r6)     // Catch: java.security.GeneralSecurityException -> Lb0
            com.google.android.gms.internal.firebase-auth-api.zzwl r6 = r14.zza     // Catch: java.security.GeneralSecurityException -> Lb0
            int r6 = r6.zzb()     // Catch: java.security.GeneralSecurityException -> Lb0
            if (r9 != r6) goto La9
            r6 = 1
            r10 = r6
            goto Laa
        La9:
            r10 = r3
        Laa:
            r11 = 0
            r6 = r13
            r6.<init>(r7, r8, r9, r10)     // Catch: java.security.GeneralSecurityException -> Lb0
            goto Lb1
        Lb0:
            r13 = 0
        Lb1:
            r0.zza(r5)
            r1.add(r13)
            int r4 = r4 + 1
            goto L1b
        Lbb:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.String r1 = "The keyset contains a non-private key"
            r0.<init>(r1)
            throw r0
        Lc3:
            com.google.android.gms.internal.firebase-auth-api.zzwl r2 = r14.zza
            int r2 = r2.zzb()
            r0.zza(r2)
            com.google.android.gms.internal.firebase-auth-api.zzbs r2 = new com.google.android.gms.internal.firebase-auth-api.zzbs
            com.google.android.gms.internal.firebase-auth-api.zzaln r0 = r0.zze()
            com.google.android.gms.internal.firebase-auth-api.zzakg r0 = (com.google.android.gms.internal.p395firebaseauthapi.zzakg) r0
            com.google.android.gms.internal.firebase-auth-api.zzwl r0 = (com.google.android.gms.internal.p395firebaseauthapi.zzwl) r0
            com.google.android.gms.internal.firebase-auth-api.zznr r3 = r14.zzc
            r2.<init>(r0, r1, r3)
            return r2
        Ldc:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.String r1 = "cleartext keyset is not available"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p395firebaseauthapi.zzbs.zza():com.google.android.gms.internal.firebase-auth-api.zzbs");
    }

    @Deprecated
    public static final zzbs zza(zzca zzcaVar, zzbe zzbeVar, byte[] bArr) {
        zzuz zza = zzcaVar.zza();
        if (zza != null && zza.zzc().zzb() != 0) {
            return zza(zza(zza, zzbeVar, bArr));
        }
        throw new GeneralSecurityException("empty keyset");
    }

    private static zzwl zza(zzuz zzuzVar, zzbe zzbeVar, byte[] bArr) {
        try {
            zzwl zza = zzwl.zza(zzbeVar.zza(zzuzVar.zzc().zzd(), bArr), zzajv.zza());
            zzd(zza);
            return zza;
        } catch (zzakm unused) {
            throw new GeneralSecurityException("invalid keyset, corrupted key material");
        }
    }

    public final <P> P zza(zzbf zzbfVar, Class<P> cls) {
        if (zzbfVar instanceof zzmz) {
            zzmz zzmzVar = (zzmz) zzbfVar;
            Class<?> zza = zzmzVar.zza((Class<?>) cls);
            if (zza != null) {
                return (P) zza(zzmzVar, cls, zza);
            }
            throw new GeneralSecurityException("No wrapper found for " + cls.getName());
        }
        throw new GeneralSecurityException("Currently only subclasses of InternalConfiguration are accepted");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final <B, P> P zza(zzmz zzmzVar, Class<P> cls, Class<B> cls2) {
        zzcn.zzb(this.zza);
        zzpj zza = zzpg.zza(cls2);
        zza.zza(this.zzc);
        for (int i7 = 0; i7 < this.zzb.size(); i7++) {
            zzwl.zza zza2 = this.zza.zza(i7);
            if (zza2.zzc().equals(zzwc.ENABLED)) {
                zzbv zzbvVar = this.zzb.get(i7);
                if (zzbvVar != null) {
                    zzbo zzb = zzbvVar.zzb();
                    try {
                        Object zza3 = zzmzVar.zza(zzb, cls2);
                        if (zza2.zza() == this.zza.zzb()) {
                            zza.zzb(zza3, zzb, zza2);
                        } else {
                            zza.zza(zza3, zzb, zza2);
                        }
                    } catch (GeneralSecurityException e7) {
                        throw new GeneralSecurityException("Unable to get primitive " + String.valueOf(cls2) + " for key of type " + zza2.zzb().zzf() + ", see https://developers.google.com/tink/faq/registration_errors", e7);
                    }
                } else {
                    throw new GeneralSecurityException("Key parsing of key with index " + i7 + " and type_url " + zza2.zzb().zzf() + " failed, unable to get primitive");
                }
            }
        }
        return (P) zzmzVar.zza(zza.zza(), cls);
    }

    @Deprecated
    public final void zza(zzbz zzbzVar) {
        for (zzwl.zza zzaVar : this.zza.zze()) {
            if (zzaVar.zzb().zzb() == zzwb.zza.UNKNOWN_KEYMATERIAL || zzaVar.zzb().zzb() == zzwb.zza.SYMMETRIC || zzaVar.zzb().zzb() == zzwb.zza.ASYMMETRIC_PRIVATE) {
                throw new GeneralSecurityException(String.format("keyset contains key material of type %s for type url %s", zzaVar.zzb().zzb().name(), zzaVar.zzb().zzf()));
            }
        }
        zzbzVar.zza(this.zza);
    }

    @Deprecated
    public final void zza(zzbz zzbzVar, zzbe zzbeVar, byte[] bArr) {
        zzwl zzwlVar = this.zza;
        zzbzVar.zza((zzuz) ((zzakg) zzuz.zza().zza(zzaiw.zza(zzbeVar.zzb(zzwlVar.zzk(), bArr))).zza(zzcn.zza(zzwlVar)).zze()));
    }
}
