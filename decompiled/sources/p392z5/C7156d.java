package p392z5;

import java.io.Serializable;
import kotlin.jvm.internal.AbstractC5469l;
import org.apache.tika.utils.StringUtils;
import p069J5.InterfaceC0804p;
import p392z5.InterfaceC7161i;

/* renamed from: z5.d */
/* loaded from: classes2.dex */
public final class C7156d implements InterfaceC7161i, Serializable {

    /* renamed from: a */
    public final InterfaceC7161i f25435a;

    /* renamed from: b */
    public final InterfaceC7161i.b f25436b;

    public C7156d(InterfaceC7161i left, InterfaceC7161i.b element) {
        AbstractC5469l.m23028e(left, "left");
        AbstractC5469l.m23028e(element, "element");
        this.f25435a = left;
        this.f25436b = element;
    }

    /* renamed from: f */
    public static final String m29467f(String acc, InterfaceC7161i.b element) {
        AbstractC5469l.m23028e(acc, "acc");
        AbstractC5469l.m23028e(element, "element");
        if (acc.length() == 0) {
            return element.toString();
        }
        return acc + ", " + element;
    }

    private final int size() {
        int i7 = 2;
        C7156d c7156d = this;
        while (true) {
            InterfaceC7161i interfaceC7161i = c7156d.f25435a;
            c7156d = interfaceC7161i instanceof C7156d ? (C7156d) interfaceC7161i : null;
            if (c7156d == null) {
                return i7;
            }
            i7++;
        }
    }

    /* renamed from: d */
    public final boolean m29468d(InterfaceC7161i.b bVar) {
        return AbstractC5469l.m23024a(get(bVar.getKey()), bVar);
    }

    /* renamed from: e */
    public final boolean m29469e(C7156d c7156d) {
        while (m29468d(c7156d.f25436b)) {
            InterfaceC7161i interfaceC7161i = c7156d.f25435a;
            if (!(interfaceC7161i instanceof C7156d)) {
                AbstractC5469l.m23026c(interfaceC7161i, "null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element");
                return m29468d((InterfaceC7161i.b) interfaceC7161i);
            }
            c7156d = (C7156d) interfaceC7161i;
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C7156d) {
                C7156d c7156d = (C7156d) obj;
                if (c7156d.size() != size() || !c7156d.m29469e(this)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // p392z5.InterfaceC7161i
    public Object fold(Object obj, InterfaceC0804p operation) {
        AbstractC5469l.m23028e(operation, "operation");
        return operation.invoke(this.f25435a.fold(obj, operation), this.f25436b);
    }

    @Override // p392z5.InterfaceC7161i
    public InterfaceC7161i.b get(InterfaceC7161i.c key) {
        AbstractC5469l.m23028e(key, "key");
        C7156d c7156d = this;
        while (true) {
            InterfaceC7161i.b bVar = c7156d.f25436b.get(key);
            if (bVar != null) {
                return bVar;
            }
            InterfaceC7161i interfaceC7161i = c7156d.f25435a;
            if (!(interfaceC7161i instanceof C7156d)) {
                return interfaceC7161i.get(key);
            }
            c7156d = (C7156d) interfaceC7161i;
        }
    }

    public int hashCode() {
        return this.f25435a.hashCode() + this.f25436b.hashCode();
    }

    @Override // p392z5.InterfaceC7161i
    public InterfaceC7161i minusKey(InterfaceC7161i.c key) {
        AbstractC5469l.m23028e(key, "key");
        if (this.f25436b.get(key) != null) {
            return this.f25435a;
        }
        InterfaceC7161i minusKey = this.f25435a.minusKey(key);
        return minusKey == this.f25435a ? this : minusKey == C7162j.f25439a ? this.f25436b : new C7156d(minusKey, this.f25436b);
    }

    @Override // p392z5.InterfaceC7161i
    public InterfaceC7161i plus(InterfaceC7161i interfaceC7161i) {
        return InterfaceC7161i.a.m29474b(this, interfaceC7161i);
    }

    public String toString() {
        return '[' + ((String) fold(StringUtils.EMPTY, new InterfaceC0804p() { // from class: z5.c
            @Override // p069J5.InterfaceC0804p
            public final Object invoke(Object obj, Object obj2) {
                String m29467f;
                m29467f = C7156d.m29467f((String) obj, (InterfaceC7161i.b) obj2);
                return m29467f;
            }
        })) + ']';
    }
}
