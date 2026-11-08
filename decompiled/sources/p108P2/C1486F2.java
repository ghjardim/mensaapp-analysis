package p108P2;

import android.os.Bundle;
import com.google.android.gms.common.internal.AbstractC3802r;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;
import p256j$.util.Objects;

/* renamed from: P2.F2 */
/* loaded from: classes.dex */
public final class C1486F2 {

    /* renamed from: b */
    public static final AtomicReference f4670b = new AtomicReference();

    /* renamed from: c */
    public static final AtomicReference f4671c = new AtomicReference();

    /* renamed from: d */
    public static final AtomicReference f4672d = new AtomicReference();

    /* renamed from: a */
    public final InterfaceC1477E2 f4673a;

    public C1486F2(InterfaceC1477E2 interfaceC1477E2) {
        this.f4673a = interfaceC1477E2;
    }

    /* renamed from: g */
    public static final String m5754g(String str, String[] strArr, String[] strArr2, AtomicReference atomicReference) {
        String str2;
        AbstractC3802r.m15129k(strArr);
        AbstractC3802r.m15129k(strArr2);
        AbstractC3802r.m15129k(atomicReference);
        AbstractC3802r.m15119a(strArr.length == strArr2.length);
        for (int i7 = 0; i7 < strArr.length; i7++) {
            if (Objects.equals(str, strArr[i7])) {
                synchronized (atomicReference) {
                    try {
                        String[] strArr3 = (String[]) atomicReference.get();
                        if (strArr3 == null) {
                            strArr3 = new String[strArr2.length];
                            atomicReference.set(strArr3);
                        }
                        str2 = strArr3[i7];
                        if (str2 == null) {
                            str2 = strArr2[i7] + "(" + strArr[i7] + ")";
                            strArr3[i7] = str2;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return str2;
            }
        }
        return str;
    }

    /* renamed from: a */
    public final String m5755a(Object[] objArr) {
        if (objArr == null) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (Object obj : objArr) {
            String m5756b = obj instanceof Bundle ? m5756b((Bundle) obj) : String.valueOf(obj);
            if (m5756b != null) {
                if (sb.length() != 1) {
                    sb.append(", ");
                }
                sb.append(m5756b);
            }
        }
        sb.append("]");
        return sb.toString();
    }

    /* renamed from: b */
    public final String m5756b(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        if (!this.f4673a.zza()) {
            return bundle.toString();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Bundle[{");
        for (String str : bundle.keySet()) {
            if (sb.length() != 8) {
                sb.append(", ");
            }
            sb.append(m5759e(str));
            sb.append("=");
            Object obj = bundle.get(str);
            sb.append(obj instanceof Bundle ? m5755a(new Object[]{obj}) : obj instanceof Object[] ? m5755a((Object[]) obj) : obj instanceof ArrayList ? m5755a(((ArrayList) obj).toArray()) : String.valueOf(obj));
        }
        sb.append("}]");
        return sb.toString();
    }

    /* renamed from: c */
    public final String m5757c(C1519J c1519j) {
        InterfaceC1477E2 interfaceC1477E2 = this.f4673a;
        if (!interfaceC1477E2.zza()) {
            return c1519j.toString();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("origin=");
        sb.append(c1519j.f4760c);
        sb.append(",name=");
        sb.append(m5758d(c1519j.f4758a));
        sb.append(",params=");
        C1501H c1501h = c1519j.f4759b;
        sb.append(c1501h == null ? null : !interfaceC1477E2.zza() ? c1501h.toString() : m5756b(c1501h.m5769z0()));
        return sb.toString();
    }

    /* renamed from: d */
    public final String m5758d(String str) {
        if (str == null) {
            return null;
        }
        return !this.f4673a.zza() ? str : m5754g(str, AbstractC1780n4.f5249c, AbstractC1780n4.f5247a, f4670b);
    }

    /* renamed from: e */
    public final String m5759e(String str) {
        if (str == null) {
            return null;
        }
        return !this.f4673a.zza() ? str : m5754g(str, AbstractC1789o4.f5275b, AbstractC1789o4.f5274a, f4671c);
    }

    /* renamed from: f */
    public final String m5760f(String str) {
        if (str == null) {
            return null;
        }
        if (!this.f4673a.zza()) {
            return str;
        }
        if (!str.startsWith("_exp_")) {
            return m5754g(str, AbstractC1807q4.f5451b, AbstractC1807q4.f5450a, f4672d);
        }
        return "experiment_id(" + str + ")";
    }
}
