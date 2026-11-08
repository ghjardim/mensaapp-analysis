package p168Y;

import kotlin.jvm.internal.AbstractC5469l;
import p161X.AbstractComponentCallbacksC2786p;

/* renamed from: Y.a */
/* loaded from: classes.dex */
public final class C2882a extends AbstractC2888g {

    /* renamed from: b */
    public final String f8870b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2882a(AbstractComponentCallbacksC2786p fragment, String previousFragmentId) {
        super(fragment, "Attempting to reuse fragment " + fragment + " with previous ID " + previousFragmentId);
        AbstractC5469l.m23028e(fragment, "fragment");
        AbstractC5469l.m23028e(previousFragmentId, "previousFragmentId");
        this.f8870b = previousFragmentId;
    }
}
