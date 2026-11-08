package com.google.android.recaptcha.internal;

import java.lang.reflect.Method;
import java.util.List;
import kotlin.jvm.internal.AbstractC5469l;
import p378x5.AbstractC7019j;
import p378x5.AbstractC7024o;

/* loaded from: classes.dex */
public final class zzga extends zzfx {
    private final zzfz zza;
    private final String zzb;

    public zzga(zzfz zzfzVar, String str, Object obj) {
        super(obj);
        this.zza = zzfzVar;
        this.zzb = str;
    }

    @Override // com.google.android.recaptcha.internal.zzfx
    public final boolean zza(Object obj, Method method, Object[] objArr) {
        List m28861g;
        if (!AbstractC5469l.m23024a(method.getName(), this.zzb)) {
            return false;
        }
        zzfz zzfzVar = this.zza;
        if (objArr == null || (m28861g = AbstractC7019j.m28793c(objArr)) == null) {
            m28861g = AbstractC7024o.m28861g();
        }
        zzfzVar.zzb(m28861g);
        return true;
    }
}
