package p200c0;

import androidx.lifecycle.AbstractC3329L;
import kotlin.jvm.internal.AbstractC5469l;

/* renamed from: c0.a */
/* loaded from: classes.dex */
public final class C3564a {

    /* renamed from: a */
    public static final C3564a f12023a = new C3564a();

    /* renamed from: a */
    public final AbstractC3329L m14385a(Class modelClass) {
        AbstractC5469l.m23028e(modelClass, "modelClass");
        try {
            Object newInstance = modelClass.getDeclaredConstructor(null).newInstance(null);
            AbstractC5469l.m23027d(newInstance, "{\n            modelClass…).newInstance()\n        }");
            return (AbstractC3329L) newInstance;
        } catch (IllegalAccessException e7) {
            throw new RuntimeException("Cannot create an instance of " + modelClass, e7);
        } catch (InstantiationException e8) {
            throw new RuntimeException("Cannot create an instance of " + modelClass, e8);
        } catch (NoSuchMethodException e9) {
            throw new RuntimeException("Cannot create an instance of " + modelClass, e9);
        }
    }
}
