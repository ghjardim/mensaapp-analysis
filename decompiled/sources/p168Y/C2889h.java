package p168Y;

import android.view.ViewGroup;
import kotlin.jvm.internal.AbstractC5469l;
import p161X.AbstractComponentCallbacksC2786p;

/* renamed from: Y.h */
/* loaded from: classes.dex */
public final class C2889h extends AbstractC2888g {

    /* renamed from: b */
    public final ViewGroup f8891b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2889h(AbstractComponentCallbacksC2786p fragment, ViewGroup container) {
        super(fragment, "Attempting to add fragment " + fragment + " to container " + container + " which is not a FragmentContainerView");
        AbstractC5469l.m23028e(fragment, "fragment");
        AbstractC5469l.m23028e(container, "container");
        this.f8891b = container;
    }
}
