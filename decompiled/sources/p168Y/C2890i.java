package p168Y;

import kotlin.jvm.internal.AbstractC5469l;
import p161X.AbstractComponentCallbacksC2786p;

/* renamed from: Y.i */
/* loaded from: classes.dex */
public final class C2890i extends AbstractC2888g {

    /* renamed from: b */
    public final AbstractComponentCallbacksC2786p f8892b;

    /* renamed from: c */
    public final int f8893c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2890i(AbstractComponentCallbacksC2786p fragment, AbstractComponentCallbacksC2786p expectedParentFragment, int i7) {
        super(fragment, "Attempting to nest fragment " + fragment + " within the view of parent fragment " + expectedParentFragment + " via container with ID " + i7 + " without using parent's childFragmentManager");
        AbstractC5469l.m23028e(fragment, "fragment");
        AbstractC5469l.m23028e(expectedParentFragment, "expectedParentFragment");
        this.f8892b = expectedParentFragment;
        this.f8893c = i7;
    }
}
