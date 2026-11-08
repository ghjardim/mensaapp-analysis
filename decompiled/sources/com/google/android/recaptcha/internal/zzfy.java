package com.google.android.recaptcha.internal;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import kotlin.jvm.internal.AbstractC5469l;
import p069J5.InterfaceC0804p;
import p378x5.AbstractC7024o;

/* loaded from: classes.dex */
public final class zzfy extends zzfx {
    private final InterfaceC0804p zza;
    private final String zzb;

    public zzfy(InterfaceC0804p interfaceC0804p, String str, Object obj) {
        super(obj);
        this.zza = interfaceC0804p;
        this.zzb = str;
    }

    @Override // com.google.android.recaptcha.internal.zzfx
    public final boolean zza(Object obj, Method method, Object[] objArr) {
        Collection m28861g;
        if (!AbstractC5469l.m23024a(method.getName(), this.zzb)) {
            return false;
        }
        zztf zzf = zzti.zzf();
        if (objArr != null) {
            m28861g = new ArrayList(objArr.length);
            for (Object obj2 : objArr) {
                zztg zzf2 = zzth.zzf();
                zzf2.zzw(obj2.toString());
                m28861g.add((zzth) zzf2.zzk());
            }
        } else {
            m28861g = AbstractC7024o.m28861g();
        }
        zzf.zze(m28861g);
        zzti zztiVar = (zzti) zzf.zzk();
        InterfaceC0804p interfaceC0804p = this.zza;
        byte[] zzd = zztiVar.zzd();
        interfaceC0804p.invoke(objArr, zzkh.zzh().zzi(zzd, 0, zzd.length));
        return true;
    }
}
