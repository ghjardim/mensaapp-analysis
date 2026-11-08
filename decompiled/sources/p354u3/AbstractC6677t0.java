package p354u3;

import com.google.android.gms.common.internal.AbstractC3802r;
import com.google.android.gms.internal.p395firebaseauthapi.zzaic;
import p346t3.AbstractC6508h;
import p346t3.C6464D;
import p346t3.C6468F;
import p346t3.C6487T;
import p346t3.C6495a0;
import p346t3.C6516l;
import p346t3.C6543y0;

/* renamed from: u3.t0 */
/* loaded from: classes.dex */
public abstract class AbstractC6677t0 {
    /* renamed from: a */
    public static zzaic m27591a(AbstractC6508h abstractC6508h, String str) {
        AbstractC3802r.m15129k(abstractC6508h);
        if (C6468F.class.isAssignableFrom(abstractC6508h.getClass())) {
            return C6468F.m27001A0((C6468F) abstractC6508h, str);
        }
        if (C6516l.class.isAssignableFrom(abstractC6508h.getClass())) {
            return C6516l.m27120A0((C6516l) abstractC6508h, str);
        }
        if (C6495a0.class.isAssignableFrom(abstractC6508h.getClass())) {
            return C6495a0.m27063A0((C6495a0) abstractC6508h, str);
        }
        if (C6464D.class.isAssignableFrom(abstractC6508h.getClass())) {
            return C6464D.m26996A0((C6464D) abstractC6508h, str);
        }
        if (C6487T.class.isAssignableFrom(abstractC6508h.getClass())) {
            return C6487T.m27042A0((C6487T) abstractC6508h, str);
        }
        if (C6543y0.class.isAssignableFrom(abstractC6508h.getClass())) {
            return C6543y0.m27135D0((C6543y0) abstractC6508h, str);
        }
        throw new IllegalArgumentException("Unsupported credential type.");
    }
}
