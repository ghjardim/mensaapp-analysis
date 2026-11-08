package p192b0;

import androidx.lifecycle.AbstractC3329L;
import androidx.lifecycle.C3330M;
import kotlin.jvm.internal.AbstractC5469l;
import p062I5.AbstractC0667a;
import p111P5.InterfaceC1969c;

/* renamed from: b0.e */
/* loaded from: classes.dex */
public abstract class AbstractC3507e {
    /* renamed from: a */
    public static final AbstractC3329L m14085a(C3330M.c factory, InterfaceC1969c modelClass, AbstractC3503a extras) {
        AbstractC5469l.m23028e(factory, "factory");
        AbstractC5469l.m23028e(modelClass, "modelClass");
        AbstractC5469l.m23028e(extras, "extras");
        try {
            try {
                return factory.mo9557b(modelClass, extras);
            } catch (AbstractMethodError unused) {
                return factory.mo9556a(AbstractC0667a.m2675a(modelClass));
            }
        } catch (AbstractMethodError unused2) {
            return factory.mo9558c(AbstractC0667a.m2675a(modelClass), extras);
        }
    }
}
