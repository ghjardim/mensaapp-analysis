package p178Z2;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import p256j$.util.DesugarCollections;

/* renamed from: Z2.c */
/* loaded from: classes.dex */
public abstract class AbstractC3014c extends AbstractC3015d implements InterfaceC2989C {
    public AbstractC3014c(Map map) {
        super(map);
    }

    @Override // p178Z2.AbstractC3015d, p178Z2.InterfaceC2993G
    /* renamed from: A, reason: merged with bridge method [inline-methods] */
    public List get(Object obj) {
        return (List) super.get(obj);
    }

    @Override // p178Z2.AbstractC3017f, p178Z2.InterfaceC2993G
    /* renamed from: b */
    public Map mo10816b() {
        return super.mo10816b();
    }

    @Override // p178Z2.AbstractC3017f
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // p178Z2.AbstractC3015d, p178Z2.InterfaceC2993G
    public boolean put(Object obj, Object obj2) {
        return super.put(obj, obj2);
    }

    @Override // p178Z2.AbstractC3015d
    /* renamed from: x */
    public Collection mo10891x(Collection collection) {
        return DesugarCollections.unmodifiableList((List) collection);
    }

    @Override // p178Z2.AbstractC3015d
    /* renamed from: y */
    public Collection mo10892y(Object obj, Collection collection) {
        return m10909z(obj, (List) collection, null);
    }
}
