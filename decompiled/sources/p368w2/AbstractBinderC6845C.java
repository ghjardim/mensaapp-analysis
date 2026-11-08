package p368w2;

import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.AbstractBinderC3819z0;
import com.google.android.gms.common.internal.AbstractC3802r;
import com.google.android.gms.common.internal.InterfaceC3763V;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import p052H2.BinderC0553b;
import p052H2.InterfaceC0552a;

/* renamed from: w2.C */
/* loaded from: classes.dex */
public abstract class AbstractBinderC6845C extends AbstractBinderC3819z0 {

    /* renamed from: a */
    public final int f24640a;

    public AbstractBinderC6845C(byte[] bArr) {
        AbstractC3802r.m15119a(bArr.length == 25);
        this.f24640a = Arrays.hashCode(bArr);
    }

    /* renamed from: b */
    public static byte[] m28216b(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e7) {
            throw new AssertionError(e7);
        }
    }

    public final boolean equals(Object obj) {
        InterfaceC0552a zzd;
        if (obj != null && (obj instanceof InterfaceC3763V)) {
            try {
                InterfaceC3763V interfaceC3763V = (InterfaceC3763V) obj;
                if (interfaceC3763V.zzc() == this.f24640a && (zzd = interfaceC3763V.zzd()) != null) {
                    return Arrays.equals(mo28217f(), (byte[]) BinderC0553b.m2137b(zzd));
                }
                return false;
            } catch (RemoteException e7) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e7);
            }
        }
        return false;
    }

    /* renamed from: f */
    public abstract byte[] mo28217f();

    public final int hashCode() {
        return this.f24640a;
    }

    @Override // com.google.android.gms.common.internal.InterfaceC3763V
    public final int zzc() {
        return this.f24640a;
    }

    @Override // com.google.android.gms.common.internal.InterfaceC3763V
    public final InterfaceC0552a zzd() {
        return BinderC0553b.m2138f(mo28217f());
    }
}
