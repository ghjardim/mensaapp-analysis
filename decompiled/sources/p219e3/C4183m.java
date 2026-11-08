package p219e3;

import com.google.android.gms.common.internal.AbstractC3802r;

/* renamed from: e3.m */
/* loaded from: classes.dex */
public class C4183m extends Exception {
    public C4183m() {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4183m(String str) {
        super(str);
        AbstractC3802r.m15124f(str, "Detail message must not be empty");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4183m(String str, Throwable th) {
        super(str, th);
        AbstractC3802r.m15124f(str, "Detail message must not be empty");
    }
}
