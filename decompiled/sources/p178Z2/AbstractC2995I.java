package p178Z2;

import java.util.AbstractCollection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p171Y2.AbstractC2932o;
import p171Y2.InterfaceC2939v;

/* renamed from: Z2.I */
/* loaded from: classes.dex */
public abstract class AbstractC2995I {

    /* renamed from: Z2.I$a */
    public static class a extends AbstractC3014c {

        /* renamed from: n */
        public transient InterfaceC2939v f9181n;

        public a(Map map, InterfaceC2939v interfaceC2939v) {
            super(map);
            this.f9181n = (InterfaceC2939v) AbstractC2932o.m10572o(interfaceC2939v);
        }

        @Override // p178Z2.AbstractC3015d
        /* renamed from: B, reason: merged with bridge method [inline-methods] */
        public List mo10832r() {
            return (List) this.f9181n.get();
        }

        @Override // p178Z2.AbstractC3017f
        /* renamed from: e */
        public Map mo10830e() {
            return m10906t();
        }

        @Override // p178Z2.AbstractC3017f
        /* renamed from: g */
        public Set mo10831g() {
            return m10907u();
        }
    }

    /* renamed from: Z2.I$b */
    public static abstract class b extends AbstractCollection {
        /* renamed from: a */
        public abstract InterfaceC2993G mo10833a();

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            mo10833a().clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return mo10833a().mo10817c(entry.getKey(), entry.getValue());
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean remove(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return mo10833a().remove(entry.getKey(), entry.getValue());
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return mo10833a().size();
        }
    }

    /* renamed from: a */
    public static boolean m10827a(InterfaceC2993G interfaceC2993G, Object obj) {
        if (obj == interfaceC2993G) {
            return true;
        }
        if (obj instanceof InterfaceC2993G) {
            return interfaceC2993G.mo10816b().equals(((InterfaceC2993G) obj).mo10816b());
        }
        return false;
    }

    /* renamed from: b */
    public static InterfaceC2989C m10828b(Map map, InterfaceC2939v interfaceC2939v) {
        return new a(map, interfaceC2939v);
    }
}
