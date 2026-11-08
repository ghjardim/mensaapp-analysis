package com.google.android.gms.internal.p395firebaseauthapi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p031E2.AbstractC0281q;
import p256j$.util.DesugarCollections;

/* loaded from: classes.dex */
public final class zzahx {
    private List<String> zza;

    public zzahx() {
        this(null);
    }

    public static zzahx zza() {
        return new zzahx(null);
    }

    public final List<String> zzb() {
        return this.zza;
    }

    private zzahx(List<String> list) {
        this.zza = new ArrayList();
    }

    public zzahx(int i7, List<String> list) {
        if (list != null && !list.isEmpty()) {
            for (int i8 = 0; i8 < list.size(); i8++) {
                list.set(i8, AbstractC0281q.m1144a(list.get(i8)));
            }
            this.zza = DesugarCollections.unmodifiableList(list);
            return;
        }
        this.zza = Collections.emptyList();
    }
}
