package p030E1;

import android.animation.ObjectAnimator;
import android.animation.TypeConverter;
import android.graphics.Path;
import android.util.Property;

/* renamed from: E1.f */
/* loaded from: classes.dex */
public abstract class AbstractC0244f {
    /* renamed from: a */
    public static ObjectAnimator m1009a(Object obj, Property property, Path path) {
        return ObjectAnimator.ofObject(obj, (Property<Object, V>) property, (TypeConverter) null, path);
    }
}
