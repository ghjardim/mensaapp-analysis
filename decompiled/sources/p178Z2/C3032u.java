package p178Z2;

import java.io.Serializable;

/* renamed from: Z2.u */
/* loaded from: classes.dex */
public class C3032u extends AbstractC3016e implements Serializable {

    /* renamed from: a */
    public final Object f9306a;

    /* renamed from: b */
    public final Object f9307b;

    public C3032u(Object obj, Object obj2) {
        this.f9306a = obj;
        this.f9307b = obj2;
    }

    @Override // p178Z2.AbstractC3016e, java.util.Map.Entry
    public final Object getKey() {
        return this.f9306a;
    }

    @Override // p178Z2.AbstractC3016e, java.util.Map.Entry
    public final Object getValue() {
        return this.f9307b;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }
}
