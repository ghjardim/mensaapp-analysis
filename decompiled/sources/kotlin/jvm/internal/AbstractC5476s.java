package kotlin.jvm.internal;

import p111P5.InterfaceC1968b;
import p111P5.InterfaceC1975i;

/* renamed from: kotlin.jvm.internal.s */
/* loaded from: classes2.dex */
public abstract class AbstractC5476s extends AbstractC5460c implements InterfaceC1975i {

    /* renamed from: a */
    public final boolean f19706a;

    public AbstractC5476s(Object obj, Class cls, String str, String str2, int i7) {
        super(obj, cls, str, str2, (i7 & 1) == 1);
        this.f19706a = (i7 & 2) == 2;
    }

    @Override // kotlin.jvm.internal.AbstractC5460c
    public InterfaceC1968b compute() {
        return this.f19706a ? this : super.compute();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC5476s) {
            AbstractC5476s abstractC5476s = (AbstractC5476s) obj;
            return getOwner().equals(abstractC5476s.getOwner()) && getName().equals(abstractC5476s.getName()) && getSignature().equals(abstractC5476s.getSignature()) && AbstractC5469l.m23024a(getBoundReceiver(), abstractC5476s.getBoundReceiver());
        }
        if (obj instanceof InterfaceC1975i) {
            return obj.equals(compute());
        }
        return false;
    }

    @Override // kotlin.jvm.internal.AbstractC5460c
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public InterfaceC1975i getReflected() {
        if (this.f19706a) {
            throw new UnsupportedOperationException("Kotlin reflection is not yet supported for synthetic Java properties. Please follow/upvote https://youtrack.jetbrains.com/issue/KT-55980");
        }
        return (InterfaceC1975i) super.getReflected();
    }

    public int hashCode() {
        return (((getOwner().hashCode() * 31) + getName().hashCode()) * 31) + getSignature().hashCode();
    }

    public String toString() {
        InterfaceC1968b compute = compute();
        if (compute != this) {
            return compute.toString();
        }
        return "property " + getName() + " (Kotlin reflection is not available)";
    }
}
