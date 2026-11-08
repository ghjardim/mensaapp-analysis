package p346t3;

import com.google.android.gms.common.internal.AbstractC3802r;

/* renamed from: t3.k */
/* loaded from: classes.dex */
public abstract class AbstractC6514k {
    /* renamed from: a */
    public static AbstractC6508h m27118a(String str, String str2) {
        AbstractC3802r.m15123e(str);
        AbstractC3802r.m15123e(str2);
        return new C6512j(str, str2);
    }

    /* renamed from: b */
    public static AbstractC6508h m27119b(String str, String str2) {
        if (C6512j.m27114B0(str2)) {
            return new C6512j(str, null, str2, null, false);
        }
        throw new IllegalArgumentException("Given link is not a valid email link. Please use FirebaseAuth#isSignInWithEmailLink(String) to determine this before calling this function");
    }
}
