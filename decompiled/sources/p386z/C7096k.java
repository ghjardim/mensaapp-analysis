package p386z;

import android.graphics.Typeface;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: z.k */
/* loaded from: classes.dex */
public class C7096k extends C7095j {
    @Override // p386z.C7095j
    /* renamed from: j */
    public Typeface mo29242j(Object obj) {
        try {
            Object newInstance = Array.newInstance((Class<?>) this.f25199g, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.f25205m.invoke(null, newInstance, "sans-serif", -1, -1);
        } catch (IllegalAccessException | InvocationTargetException e7) {
            throw new RuntimeException(e7);
        }
    }

    @Override // p386z.C7095j
    /* renamed from: v */
    public Method mo29252v(Class cls) {
        Class cls2 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", Array.newInstance((Class<?>) cls, 1).getClass(), String.class, cls2, cls2);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }
}
