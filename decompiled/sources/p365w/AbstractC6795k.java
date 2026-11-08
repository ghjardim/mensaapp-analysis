package p365w;

import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
import p365w.AbstractC6793i;

/* renamed from: w.k */
/* loaded from: classes.dex */
public abstract class AbstractC6795k {

    /* renamed from: a */
    public static final Object f24461a = new Object();

    /* renamed from: b */
    public static final Object f24462b = new Object();

    /* renamed from: a */
    public static Bundle m27945a(AbstractC6793i.a aVar) {
        Bundle bundle = new Bundle();
        IconCompat m27850d = aVar.m27850d();
        bundle.putInt("icon", m27850d != null ? m27850d.m11952e() : 0);
        bundle.putCharSequence("title", aVar.m27854h());
        bundle.putParcelable("actionIntent", aVar.m27847a());
        Bundle bundle2 = aVar.m27849c() != null ? new Bundle(aVar.m27849c()) : new Bundle();
        bundle2.putBoolean("android.support.allowGeneratedReplies", aVar.m27848b());
        bundle.putBundle("extras", bundle2);
        bundle.putParcelableArray("remoteInputs", m27947c(aVar.m27851e()));
        bundle.putBoolean("showsUserInterface", aVar.m27853g());
        bundle.putInt("semanticAction", aVar.m27852f());
        return bundle;
    }

    /* renamed from: b */
    public static Bundle m27946b(AbstractC6801q abstractC6801q) {
        new Bundle();
        throw null;
    }

    /* renamed from: c */
    public static Bundle[] m27947c(AbstractC6801q[] abstractC6801qArr) {
        if (abstractC6801qArr == null) {
            return null;
        }
        Bundle[] bundleArr = new Bundle[abstractC6801qArr.length];
        for (int i7 = 0; i7 < abstractC6801qArr.length; i7++) {
            AbstractC6801q abstractC6801q = abstractC6801qArr[i7];
            bundleArr[i7] = m27946b(null);
        }
        return bundleArr;
    }
}
