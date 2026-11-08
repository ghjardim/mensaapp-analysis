package p392z5;

import kotlin.jvm.internal.AbstractC5469l;
import p069J5.InterfaceC0800l;
import p392z5.InterfaceC7161i;

/* renamed from: z5.b */
/* loaded from: classes2.dex */
public abstract class AbstractC7154b implements InterfaceC7161i.c {

    /* renamed from: a */
    public final InterfaceC0800l f25433a;

    /* renamed from: b */
    public final InterfaceC7161i.c f25434b;

    public AbstractC7154b(InterfaceC7161i.c baseKey, InterfaceC0800l safeCast) {
        AbstractC5469l.m23028e(baseKey, "baseKey");
        AbstractC5469l.m23028e(safeCast, "safeCast");
        this.f25433a = safeCast;
        this.f25434b = baseKey instanceof AbstractC7154b ? ((AbstractC7154b) baseKey).f25434b : baseKey;
    }

    /* renamed from: a */
    public final boolean m29464a(InterfaceC7161i.c key) {
        AbstractC5469l.m23028e(key, "key");
        return key == this || this.f25434b == key;
    }

    /* renamed from: b */
    public final InterfaceC7161i.b m29465b(InterfaceC7161i.b element) {
        AbstractC5469l.m23028e(element, "element");
        return (InterfaceC7161i.b) this.f25433a.invoke(element);
    }
}
