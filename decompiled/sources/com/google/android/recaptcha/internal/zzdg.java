package com.google.android.recaptcha.internal;

import p006A5.AbstractC0024c;
import p013B5.AbstractC0068l;
import p069J5.InterfaceC0804p;
import p132S5.AbstractC2358V0;
import p132S5.C2354T0;
import p132S5.InterfaceC2334J;
import p371w5.AbstractC6928k;
import p371w5.C6934q;
import p392z5.InterfaceC7157e;

/* loaded from: classes.dex */
final class zzdg extends AbstractC0068l implements InterfaceC0804p {
    Object zza;
    int zzb;
    final /* synthetic */ zzdt zzc;
    final /* synthetic */ String zzd;
    final /* synthetic */ long zze;
    final /* synthetic */ zzsp zzf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdg(zzdt zzdtVar, String str, long j7, zzsp zzspVar, InterfaceC7157e interfaceC7157e) {
        super(2, interfaceC7157e);
        this.zzc = zzdtVar;
        this.zzd = str;
        this.zze = j7;
        this.zzf = zzspVar;
    }

    @Override // p013B5.AbstractC0057a
    public final InterfaceC7157e create(Object obj, InterfaceC7157e interfaceC7157e) {
        return new zzdg(this.zzc, this.zzd, this.zze, this.zzf, interfaceC7157e);
    }

    @Override // p069J5.InterfaceC0804p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzdg) create((InterfaceC2334J) obj, (InterfaceC7157e) obj2)).invokeSuspend(C6934q.f24811a);
    }

    @Override // p013B5.AbstractC0057a
    public final Object invokeSuspend(Object obj) {
        zzek zzu;
        zzen zzenVar;
        Exception e7;
        zzbd e8;
        C2354T0 e9;
        zzbd zzs;
        zzbd zzs2;
        zzbd zzs3;
        Object m76e = AbstractC0024c.m76e();
        if (this.zzb != 0) {
            zzenVar = (zzen) this.zza;
            try {
                AbstractC6928k.m28382b(obj);
            } catch (C2354T0 e10) {
                e9 = e10;
                zzs3 = this.zzc.zzs(e9, new zzbd(zzbb.zzc, zzba.zzb, e9.getMessage()));
                zzenVar.zzb(zzs3);
                throw zzs3;
            } catch (zzbd e11) {
                e8 = e11;
                zzs2 = this.zzc.zzs(e8, e8);
                zzenVar.zzb(zzs2);
                throw zzs2;
            } catch (Exception e12) {
                e7 = e12;
                zzs = this.zzc.zzs(e7, new zzbd(zzbb.zzc, zzba.zzZ, e7.getMessage()));
                zzenVar.zzb(zzs);
                throw zzs;
            }
        } else {
            AbstractC6928k.m28382b(obj);
            zzu = this.zzc.zzu(this.zzd);
            zzen zzf = zzu.zzf(28);
            try {
                long j7 = this.zze;
                zzdf zzdfVar = new zzdf(this.zzc, this.zzf, zzf, null);
                this.zza = zzf;
                this.zzb = 1;
                Object m8039c = AbstractC2358V0.m8039c(j7, zzdfVar, this);
                if (m8039c == m76e) {
                    return m76e;
                }
                zzenVar = zzf;
                obj = m8039c;
            } catch (C2354T0 e13) {
                zzenVar = zzf;
                e9 = e13;
                zzs3 = this.zzc.zzs(e9, new zzbd(zzbb.zzc, zzba.zzb, e9.getMessage()));
                zzenVar.zzb(zzs3);
                throw zzs3;
            } catch (zzbd e14) {
                zzenVar = zzf;
                e8 = e14;
                zzs2 = this.zzc.zzs(e8, e8);
                zzenVar.zzb(zzs2);
                throw zzs2;
            } catch (Exception e15) {
                zzenVar = zzf;
                e7 = e15;
                zzs = this.zzc.zzs(e7, new zzbd(zzbb.zzc, zzba.zzZ, e7.getMessage()));
                zzenVar.zzb(zzs);
                throw zzs;
            }
        }
        return (zzsr) obj;
    }
}
