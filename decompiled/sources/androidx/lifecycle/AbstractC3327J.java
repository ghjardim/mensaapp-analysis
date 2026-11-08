package androidx.lifecycle;

import android.app.Application;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.AbstractC5469l;
import p378x5.AbstractC7020k;
import p378x5.AbstractC7023n;
import p378x5.AbstractC7024o;

/* renamed from: androidx.lifecycle.J */
/* loaded from: classes.dex */
public abstract class AbstractC3327J {

    /* renamed from: a */
    public static final List f10711a = AbstractC7024o.m28864j(Application.class, C3320C.class);

    /* renamed from: b */
    public static final List f10712b = AbstractC7023n.m28856b(C3320C.class);

    /* renamed from: c */
    public static final Constructor m12886c(Class modelClass, List signature) {
        AbstractC5469l.m23028e(modelClass, "modelClass");
        AbstractC5469l.m23028e(signature, "signature");
        Constructor<?>[] constructors = modelClass.getConstructors();
        AbstractC5469l.m23027d(constructors, "modelClass.constructors");
        for (Constructor<?> constructor : constructors) {
            Class<?>[] parameterTypes = constructor.getParameterTypes();
            AbstractC5469l.m23027d(parameterTypes, "constructor.parameterTypes");
            List m28832b0 = AbstractC7020k.m28832b0(parameterTypes);
            if (AbstractC5469l.m23024a(signature, m28832b0)) {
                AbstractC5469l.m23026c(constructor, "null cannot be cast to non-null type java.lang.reflect.Constructor<T of androidx.lifecycle.SavedStateViewModelFactoryKt.findMatchingConstructor>");
                return constructor;
            }
            if (signature.size() == m28832b0.size() && m28832b0.containsAll(signature)) {
                throw new UnsupportedOperationException("Class " + modelClass.getSimpleName() + " must have parameters in the proper order: " + signature);
            }
        }
        return null;
    }

    /* renamed from: d */
    public static final AbstractC3329L m12887d(Class modelClass, Constructor constructor, Object... params) {
        AbstractC5469l.m23028e(modelClass, "modelClass");
        AbstractC5469l.m23028e(constructor, "constructor");
        AbstractC5469l.m23028e(params, "params");
        try {
            return (AbstractC3329L) constructor.newInstance(Arrays.copyOf(params, params.length));
        } catch (IllegalAccessException e7) {
            throw new RuntimeException("Failed to access " + modelClass, e7);
        } catch (InstantiationException e8) {
            throw new RuntimeException("A " + modelClass + " cannot be instantiated.", e8);
        } catch (InvocationTargetException e9) {
            throw new RuntimeException("An exception happened in constructor of " + modelClass, e9.getCause());
        }
    }
}
