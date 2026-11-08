package p365w;

import android.app.RemoteInput;

/* renamed from: w.q */
/* loaded from: classes.dex */
public abstract class AbstractC6801q {

    /* renamed from: w.q$a */
    public static class a {
        /* renamed from: a */
        public static RemoteInput m27956a(AbstractC6801q abstractC6801q) {
            throw null;
        }
    }

    /* renamed from: a */
    public static RemoteInput m27954a(AbstractC6801q abstractC6801q) {
        return a.m27956a(abstractC6801q);
    }

    /* renamed from: b */
    public static RemoteInput[] m27955b(AbstractC6801q[] abstractC6801qArr) {
        if (abstractC6801qArr == null) {
            return null;
        }
        RemoteInput[] remoteInputArr = new RemoteInput[abstractC6801qArr.length];
        for (int i7 = 0; i7 < abstractC6801qArr.length; i7++) {
            AbstractC6801q abstractC6801q = abstractC6801qArr[i7];
            remoteInputArr[i7] = m27954a(null);
        }
        return remoteInputArr;
    }
}
