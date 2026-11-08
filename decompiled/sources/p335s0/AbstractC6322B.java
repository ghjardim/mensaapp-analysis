package p335s0;

import android.media.DeniedByServerException;
import android.media.MediaDrm;
import android.media.MediaDrmResetException;
import android.media.NotProvisionedException;
import p259j0.AbstractC5330M;
import p335s0.C6348h;

/* renamed from: s0.B */
/* loaded from: classes.dex */
public abstract class AbstractC6322B {

    /* renamed from: s0.B$a */
    public static final class a {
        /* renamed from: a */
        public static boolean m26478a(Throwable th) {
            return th instanceof MediaDrm.MediaDrmStateException;
        }

        /* renamed from: b */
        public static int m26479b(Throwable th) {
            return AbstractC5330M.m21719Y(AbstractC5330M.m21721Z(((MediaDrm.MediaDrmStateException) th).getDiagnosticInfo()));
        }
    }

    /* renamed from: s0.B$b */
    public static final class b {
        /* renamed from: a */
        public static boolean m26480a(Throwable th) {
            return th instanceof MediaDrmResetException;
        }
    }

    /* renamed from: a */
    public static int m26475a(Throwable th, int i7) {
        int i8 = AbstractC5330M.f18800a;
        if (i8 >= 21 && a.m26478a(th)) {
            return a.m26479b(th);
        }
        if (i8 >= 23 && b.m26480a(th)) {
            return 6006;
        }
        if ((th instanceof NotProvisionedException) || m26476b(th)) {
            return 6002;
        }
        if (th instanceof DeniedByServerException) {
            return 6007;
        }
        if (th instanceof C6339T) {
            return 6001;
        }
        if (th instanceof C6348h.e) {
            return 6003;
        }
        if (th instanceof C6336P) {
            return 6008;
        }
        if (i7 == 1) {
            return 6006;
        }
        if (i7 == 2) {
            return 6004;
        }
        if (i7 == 3) {
            return 6002;
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: b */
    public static boolean m26476b(Throwable th) {
        return AbstractC5330M.f18800a == 34 && (th instanceof NoSuchMethodError) && th.getMessage() != null && th.getMessage().contains("Landroid/media/NotProvisionedException;.<init>(");
    }

    /* renamed from: c */
    public static boolean m26477c(Throwable th) {
        return AbstractC5330M.f18800a == 34 && (th instanceof NoSuchMethodError) && th.getMessage() != null && th.getMessage().contains("Landroid/media/ResourceBusyException;.<init>(");
    }
}
