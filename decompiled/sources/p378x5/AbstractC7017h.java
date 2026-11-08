package p378x5;

import java.lang.reflect.Array;
import kotlin.jvm.internal.AbstractC5469l;

/* renamed from: x5.h */
/* loaded from: classes2.dex */
public abstract class AbstractC7017h {
    /* renamed from: a */
    public static final Object[] m28791a(Object[] reference, int i7) {
        AbstractC5469l.m23028e(reference, "reference");
        Object newInstance = Array.newInstance(reference.getClass().getComponentType(), i7);
        AbstractC5469l.m23026c(newInstance, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.arrayOfNulls>");
        return (Object[]) newInstance;
    }

    /* renamed from: b */
    public static final void m28792b(int i7, int i8) {
        if (i7 <= i8) {
            return;
        }
        throw new IndexOutOfBoundsException("toIndex (" + i7 + ") is greater than size (" + i8 + ").");
    }
}
