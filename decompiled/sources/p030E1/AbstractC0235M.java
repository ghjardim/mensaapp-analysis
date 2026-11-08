package p030E1;

import android.graphics.Matrix;
import android.util.Log;
import android.view.View;
import java.lang.reflect.Field;

/* renamed from: E1.M */
/* loaded from: classes.dex */
public abstract class AbstractC0235M {

    /* renamed from: a */
    public static Field f937a;

    /* renamed from: b */
    public static boolean f938b;

    /* renamed from: a */
    public abstract void mo938a(View view);

    /* renamed from: b */
    public abstract float mo939b(View view);

    /* renamed from: c */
    public abstract void mo940c(View view);

    /* renamed from: d */
    public abstract void mo947d(View view, int i7, int i8, int i9, int i10);

    /* renamed from: e */
    public abstract void mo941e(View view, float f7);

    /* renamed from: f */
    public void mo949f(View view, int i7) {
        if (!f938b) {
            try {
                Field declaredField = View.class.getDeclaredField("mViewFlags");
                f937a = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
                Log.i("ViewUtilsBase", "fetchViewFlagsField: ");
            }
            f938b = true;
        }
        Field field = f937a;
        if (field != null) {
            try {
                f937a.setInt(view, i7 | (field.getInt(view) & (-13)));
            } catch (IllegalAccessException unused2) {
            }
        }
    }

    /* renamed from: g */
    public abstract void mo944g(View view, Matrix matrix);

    /* renamed from: h */
    public abstract void mo945h(View view, Matrix matrix);
}
