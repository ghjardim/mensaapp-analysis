package p052H2;

import android.os.IBinder;
import com.google.android.gms.common.internal.AbstractC3802r;
import java.lang.reflect.Field;
import p052H2.InterfaceC0552a;

/* renamed from: H2.b */
/* loaded from: classes.dex */
public final class BinderC0553b extends InterfaceC0552a.a {

    /* renamed from: a */
    public final Object f1826a;

    public BinderC0553b(Object obj) {
        this.f1826a = obj;
    }

    /* renamed from: b */
    public static Object m2137b(InterfaceC0552a interfaceC0552a) {
        if (interfaceC0552a instanceof BinderC0553b) {
            return ((BinderC0553b) interfaceC0552a).f1826a;
        }
        IBinder asBinder = interfaceC0552a.asBinder();
        Field[] declaredFields = asBinder.getClass().getDeclaredFields();
        Field field = null;
        int i7 = 0;
        for (Field field2 : declaredFields) {
            if (!field2.isSynthetic()) {
                i7++;
                field = field2;
            }
        }
        if (i7 != 1) {
            throw new IllegalArgumentException("Unexpected number of IObjectWrapper declared fields: " + declaredFields.length);
        }
        AbstractC3802r.m15129k(field);
        if (field.isAccessible()) {
            throw new IllegalArgumentException("IObjectWrapper declared field not private!");
        }
        field.setAccessible(true);
        try {
            return field.get(asBinder);
        } catch (IllegalAccessException e7) {
            throw new IllegalArgumentException("Could not access the field in remoteBinder.", e7);
        } catch (NullPointerException e8) {
            throw new IllegalArgumentException("Binder object is null.", e8);
        }
    }

    /* renamed from: f */
    public static InterfaceC0552a m2138f(Object obj) {
        return new BinderC0553b(obj);
    }
}
