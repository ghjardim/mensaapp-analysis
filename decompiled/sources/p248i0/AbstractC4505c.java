package p248i0;

import android.os.Bundle;
import android.text.Spannable;
import android.text.Spanned;
import java.util.ArrayList;
import p259j0.AbstractC5330M;
import p259j0.AbstractC5332a;

/* renamed from: i0.c */
/* loaded from: classes.dex */
public abstract class AbstractC4505c {

    /* renamed from: a */
    public static final String f16130a = AbstractC5330M.m21783x0(0);

    /* renamed from: b */
    public static final String f16131b = AbstractC5330M.m21783x0(1);

    /* renamed from: c */
    public static final String f16132c = AbstractC5330M.m21783x0(2);

    /* renamed from: d */
    public static final String f16133d = AbstractC5330M.m21783x0(3);

    /* renamed from: e */
    public static final String f16134e = AbstractC5330M.m21783x0(4);

    /* renamed from: a */
    public static ArrayList m19206a(Spanned spanned) {
        ArrayList arrayList = new ArrayList();
        for (C4507e c4507e : (C4507e[]) spanned.getSpans(0, spanned.length(), C4507e.class)) {
            arrayList.add(m19207b(spanned, c4507e, 1, c4507e.m19210b()));
        }
        for (C4509g c4509g : (C4509g[]) spanned.getSpans(0, spanned.length(), C4509g.class)) {
            arrayList.add(m19207b(spanned, c4509g, 2, c4509g.m19215b()));
        }
        for (C4506d c4506d : (C4506d[]) spanned.getSpans(0, spanned.length(), C4506d.class)) {
            arrayList.add(m19207b(spanned, c4506d, 3, null));
        }
        return arrayList;
    }

    /* renamed from: b */
    public static Bundle m19207b(Spanned spanned, Object obj, int i7, Bundle bundle) {
        Bundle bundle2 = new Bundle();
        bundle2.putInt(f16130a, spanned.getSpanStart(obj));
        bundle2.putInt(f16131b, spanned.getSpanEnd(obj));
        bundle2.putInt(f16132c, spanned.getSpanFlags(obj));
        bundle2.putInt(f16133d, i7);
        if (bundle != null) {
            bundle2.putBundle(f16134e, bundle);
        }
        return bundle2;
    }

    /* renamed from: c */
    public static void m19208c(Bundle bundle, Spannable spannable) {
        int i7 = bundle.getInt(f16130a);
        int i8 = bundle.getInt(f16131b);
        int i9 = bundle.getInt(f16132c);
        int i10 = bundle.getInt(f16133d, -1);
        Bundle bundle2 = bundle.getBundle(f16134e);
        if (i10 == 1) {
            spannable.setSpan(C4507e.m19209a((Bundle) AbstractC5332a.m21800e(bundle2)), i7, i8, i9);
        } else if (i10 == 2) {
            spannable.setSpan(C4509g.m19214a((Bundle) AbstractC5332a.m21800e(bundle2)), i7, i8, i9);
        } else {
            if (i10 != 3) {
                return;
            }
            spannable.setSpan(new C4506d(), i7, i8, i9);
        }
    }
}
