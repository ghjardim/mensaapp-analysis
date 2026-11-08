package p239h;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import java.util.WeakHashMap;
import p291n.C5619U;

/* renamed from: h.a */
/* loaded from: classes.dex */
public abstract class AbstractC4474a {

    /* renamed from: a */
    public static final ThreadLocal f15917a = new ThreadLocal();

    /* renamed from: b */
    public static final WeakHashMap f15918b = new WeakHashMap(0);

    /* renamed from: c */
    public static final Object f15919c = new Object();

    /* renamed from: a */
    public static ColorStateList m19043a(Context context, int i7) {
        return context.getColorStateList(i7);
    }

    /* renamed from: b */
    public static Drawable m19044b(Context context, int i7) {
        return C5619U.m23557h().m23568j(context, i7);
    }
}
