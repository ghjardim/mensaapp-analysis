package p168Y;

import android.view.ViewGroup;
import kotlin.jvm.internal.AbstractC5469l;
import p161X.AbstractComponentCallbacksC2786p;

/* renamed from: Y.d */
/* loaded from: classes.dex */
public final class C2885d extends AbstractC2888g {

    /* renamed from: b */
    public final ViewGroup f8889b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2885d(AbstractComponentCallbacksC2786p fragment, ViewGroup viewGroup) {
        super(fragment, "Attempting to use <fragment> tag to add fragment " + fragment + " to container " + viewGroup);
        AbstractC5469l.m23028e(fragment, "fragment");
        this.f8889b = viewGroup;
    }
}
