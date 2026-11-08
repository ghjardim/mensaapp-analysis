package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.api.C3643a;
import com.google.android.gms.internal.measurement.zzlz;
import com.google.android.gms.internal.measurement.zzmd;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import p256j$.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public abstract class zzmd<MessageType extends zzmd<MessageType, BuilderType>, BuilderType extends zzlz<MessageType, BuilderType>> extends zzko<MessageType, BuilderType> {
    private static final Map zzb = new ConcurrentHashMap();
    private int zzd = -1;
    protected zzof zzc = zzof.zzc();

    private final int zzc(zzns zznsVar) {
        return zznp.zza().zzb(getClass()).zza(this);
    }

    public static zzmd zzci(Class cls) {
        Map map = zzb;
        zzmd zzmdVar = (zzmd) map.get(cls);
        if (zzmdVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                zzmdVar = (zzmd) map.get(cls);
            } catch (ClassNotFoundException e7) {
                throw new IllegalStateException("Class initialization cannot fail.", e7);
            }
        }
        if (zzmdVar == null) {
            zzmdVar = (zzmd) ((zzmd) zzol.zze(cls)).zzl(6, null, null);
            if (zzmdVar == null) {
                throw new IllegalStateException();
            }
            map.put(cls, zzmdVar);
        }
        return zzmdVar;
    }

    public static zzmh zzck() {
        return zzme.zzf();
    }

    public static zzmi zzcl() {
        return zzmw.zzf();
    }

    public static zzmi zzcm(zzmi zzmiVar) {
        int size = zzmiVar.size();
        return zzmiVar.zzd(size + size);
    }

    public static zzmj zzcn() {
        return zznq.zze();
    }

    public static zzmj zzco(zzmj zzmjVar) {
        int size = zzmjVar.size();
        return zzmjVar.zzd(size + size);
    }

    public static Object zzcp(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e7) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e7);
        } catch (InvocationTargetException e8) {
            Throwable cause = e8.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    public static Object zzcq(zznh zznhVar, String str, Object[] objArr) {
        return new zznr(zznhVar, str, objArr);
    }

    public static void zzct(Class cls, zzmd zzmdVar) {
        zzmdVar.zzcs();
        zzb.put(cls, zzmdVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean zzd(zzmd zzmdVar, boolean z6) {
        byte byteValue = ((Byte) zzmdVar.zzl(1, null, null)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean zzk = zznp.zza().zzb(zzmdVar.getClass()).zzk(zzmdVar);
        if (z6) {
            zzmdVar.zzl(2, true != zzk ? null : zzmdVar, null);
        }
        return zzk;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return zznp.zza().zzb(getClass()).zzj(this, (zzmd) obj);
    }

    public final int hashCode() {
        if (zzcw()) {
            return zzce();
        }
        int i7 = this.zza;
        if (i7 != 0) {
            return i7;
        }
        int zzce = zzce();
        this.zza = zzce;
        return zzce;
    }

    public final String toString() {
        return zznj.zza(this, super.toString());
    }

    @Override // com.google.android.gms.internal.measurement.zznh
    public final /* synthetic */ zzng zzcA() {
        return (zzlz) zzl(5, null, null);
    }

    @Override // com.google.android.gms.internal.measurement.zznh
    public final void zzcB(zzlk zzlkVar) {
        zznp.zza().zzb(getClass()).zzi(this, zzll.zza(zzlkVar));
    }

    @Override // com.google.android.gms.internal.measurement.zzni
    public final /* synthetic */ zznh zzcC() {
        return (zzmd) zzl(6, null, null);
    }

    @Override // com.google.android.gms.internal.measurement.zzni
    public final boolean zzcD() {
        return zzd(this, true);
    }

    @Override // com.google.android.gms.internal.measurement.zzko
    public final int zzca(zzns zznsVar) {
        if (zzcw()) {
            int zza = zznsVar.zza(this);
            if (zza >= 0) {
                return zza;
            }
            throw new IllegalStateException("serialized size must be non-negative, was " + zza);
        }
        int i7 = this.zzd & C3643a.e.API_PRIORITY_OTHER;
        if (i7 != Integer.MAX_VALUE) {
            return i7;
        }
        int zza2 = zznsVar.zza(this);
        if (zza2 >= 0) {
            this.zzd = (this.zzd & Integer.MIN_VALUE) | zza2;
            return zza2;
        }
        throw new IllegalStateException("serialized size must be non-negative, was " + zza2);
    }

    public final int zzce() {
        return zznp.zza().zzb(getClass()).zzb(this);
    }

    @Override // com.google.android.gms.internal.measurement.zznh
    public final int zzcf() {
        int i7;
        if (zzcw()) {
            i7 = zzc(null);
            if (i7 < 0) {
                throw new IllegalStateException("serialized size must be non-negative, was " + i7);
            }
        } else {
            i7 = this.zzd & C3643a.e.API_PRIORITY_OTHER;
            if (i7 == Integer.MAX_VALUE) {
                i7 = zzc(null);
                if (i7 < 0) {
                    throw new IllegalStateException("serialized size must be non-negative, was " + i7);
                }
                this.zzd = (this.zzd & Integer.MIN_VALUE) | i7;
            }
        }
        return i7;
    }

    public final zzlz zzcg() {
        return (zzlz) zzl(5, null, null);
    }

    public final zzlz zzch() {
        zzlz zzlzVar = (zzlz) zzl(5, null, null);
        zzlzVar.zzaY(this);
        return zzlzVar;
    }

    public final zzmd zzcj() {
        return (zzmd) zzl(4, null, null);
    }

    public final void zzcr() {
        zznp.zza().zzb(getClass()).zzf(this);
        zzcs();
    }

    public final void zzcs() {
        this.zzd &= C3643a.e.API_PRIORITY_OTHER;
    }

    public final void zzcu(int i7) {
        this.zzd = (this.zzd & Integer.MIN_VALUE) | C3643a.e.API_PRIORITY_OTHER;
    }

    public final boolean zzcw() {
        return (this.zzd & Integer.MIN_VALUE) != 0;
    }

    public abstract Object zzl(int i7, Object obj, Object obj2);
}
