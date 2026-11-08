package androidx.lifecycle;

import androidx.lifecycle.C3330M;
import kotlin.jvm.internal.AbstractC5469l;
import p062I5.AbstractC0667a;
import p111P5.InterfaceC1969c;
import p192b0.AbstractC3503a;
import p200c0.C3567d;

/* renamed from: androidx.lifecycle.N */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC3331N {
    /* renamed from: a */
    public static AbstractC3329L m12901a(C3330M.c cVar, InterfaceC1969c modelClass, AbstractC3503a extras) {
        AbstractC5469l.m23028e(modelClass, "modelClass");
        AbstractC5469l.m23028e(extras, "extras");
        return cVar.mo9558c(AbstractC0667a.m2675a(modelClass), extras);
    }

    /* renamed from: b */
    public static AbstractC3329L m12902b(C3330M.c cVar, Class modelClass) {
        AbstractC5469l.m23028e(modelClass, "modelClass");
        return C3567d.f12028a.m14395c();
    }

    /* renamed from: c */
    public static AbstractC3329L m12903c(C3330M.c cVar, Class modelClass, AbstractC3503a extras) {
        AbstractC5469l.m23028e(modelClass, "modelClass");
        AbstractC5469l.m23028e(extras, "extras");
        return cVar.mo9556a(modelClass);
    }
}
