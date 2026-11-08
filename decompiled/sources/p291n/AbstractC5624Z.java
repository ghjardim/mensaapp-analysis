package p291n;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.util.TypedValue;
import p386z.AbstractC7086a;

/* renamed from: n.Z */
/* loaded from: classes.dex */
public abstract class AbstractC5624Z {

    /* renamed from: a */
    public static final ThreadLocal f20382a = new ThreadLocal();

    /* renamed from: b */
    public static final int[] f20383b = {-16842910};

    /* renamed from: c */
    public static final int[] f20384c = {R.attr.state_focused};

    /* renamed from: d */
    public static final int[] f20385d = {R.attr.state_activated};

    /* renamed from: e */
    public static final int[] f20386e = {R.attr.state_pressed};

    /* renamed from: f */
    public static final int[] f20387f = {R.attr.state_checked};

    /* renamed from: g */
    public static final int[] f20388g = {R.attr.state_selected};

    /* renamed from: h */
    public static final int[] f20389h = {-16842919, -16842908};

    /* renamed from: i */
    public static final int[] f20390i = new int[0];

    /* renamed from: j */
    public static final int[] f20391j = new int[1];

    /* renamed from: a */
    public static int m23613a(Context context, int i7) {
        ColorStateList m23616d = m23616d(context, i7);
        if (m23616d != null && m23616d.isStateful()) {
            return m23616d.getColorForState(f20383b, m23616d.getDefaultColor());
        }
        TypedValue m23617e = m23617e();
        context.getTheme().resolveAttribute(R.attr.disabledAlpha, m23617e, true);
        return m23615c(context, i7, m23617e.getFloat());
    }

    /* renamed from: b */
    public static int m23614b(Context context, int i7) {
        int[] iArr = f20391j;
        iArr[0] = i7;
        C5632d0 m23636q = C5632d0.m23636q(context, null, iArr);
        try {
            return m23636q.m23639b(0, 0);
        } finally {
            m23636q.m23653s();
        }
    }

    /* renamed from: c */
    public static int m23615c(Context context, int i7, float f7) {
        return AbstractC7086a.m29191f(m23614b(context, i7), Math.round(Color.alpha(r0) * f7));
    }

    /* renamed from: d */
    public static ColorStateList m23616d(Context context, int i7) {
        int[] iArr = f20391j;
        iArr[0] = i7;
        C5632d0 m23636q = C5632d0.m23636q(context, null, iArr);
        try {
            return m23636q.m23640c(0);
        } finally {
            m23636q.m23653s();
        }
    }

    /* renamed from: e */
    public static TypedValue m23617e() {
        ThreadLocal threadLocal = f20382a;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        threadLocal.set(typedValue2);
        return typedValue2;
    }
}
