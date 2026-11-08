package p030E1;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.os.Build;
import android.util.Property;
import android.view.View;
import p049H.AbstractC0475B;

/* renamed from: E1.A */
/* loaded from: classes.dex */
public abstract class AbstractC0223A {

    /* renamed from: a */
    public static final AbstractC0235M f929a;

    /* renamed from: b */
    public static final Property f930b;

    /* renamed from: c */
    public static final Property f931c;

    /* renamed from: E1.A$a */
    public class a extends Property {
        public a(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(View view) {
            return Float.valueOf(AbstractC0223A.m924c(view));
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, Float f7) {
            AbstractC0223A.m928g(view, f7.floatValue());
        }
    }

    /* renamed from: E1.A$b */
    public class b extends Property {
        public b(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Rect get(View view) {
            return AbstractC0475B.m1751j(view);
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, Rect rect) {
            AbstractC0475B.m1734L(view, rect);
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 29) {
            f929a = new C0234L();
        } else {
            f929a = new C0233K();
        }
        f930b = new a(Float.class, "translationAlpha");
        f931c = new b(Rect.class, "clipBounds");
    }

    /* renamed from: a */
    public static void m922a(View view) {
        f929a.mo938a(view);
    }

    /* renamed from: b */
    public static InterfaceC0264z m923b(View view) {
        return new C0263y(view);
    }

    /* renamed from: c */
    public static float m924c(View view) {
        return f929a.mo939b(view);
    }

    /* renamed from: d */
    public static InterfaceC0238P m925d(View view) {
        return new C0237O(view);
    }

    /* renamed from: e */
    public static void m926e(View view) {
        f929a.mo940c(view);
    }

    /* renamed from: f */
    public static void m927f(View view, int i7, int i8, int i9, int i10) {
        f929a.mo947d(view, i7, i8, i9, i10);
    }

    /* renamed from: g */
    public static void m928g(View view, float f7) {
        f929a.mo941e(view, f7);
    }

    /* renamed from: h */
    public static void m929h(View view, int i7) {
        f929a.mo949f(view, i7);
    }

    /* renamed from: i */
    public static void m930i(View view, Matrix matrix) {
        f929a.mo944g(view, matrix);
    }

    /* renamed from: j */
    public static void m931j(View view, Matrix matrix) {
        f929a.mo945h(view, matrix);
    }
}
