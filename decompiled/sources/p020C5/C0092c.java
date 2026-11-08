package p020C5;

import java.io.Serializable;
import kotlin.jvm.internal.AbstractC5469l;
import p378x5.AbstractC7013d;
import p378x5.AbstractC7020k;

/* renamed from: C5.c */
/* loaded from: classes2.dex */
public final class C0092c extends AbstractC7013d implements InterfaceC0090a, Serializable {

    /* renamed from: b */
    public final Enum[] f319b;

    public C0092c(Enum[] entries) {
        AbstractC5469l.m23028e(entries, "entries");
        this.f319b = entries;
    }

    @Override // p378x5.AbstractC7011b
    /* renamed from: b */
    public int mo240b() {
        return this.f319b.length;
    }

    @Override // p378x5.AbstractC7011b, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof Enum) {
            return m241f((Enum) obj);
        }
        return false;
    }

    /* renamed from: f */
    public boolean m241f(Enum element) {
        AbstractC5469l.m23028e(element, "element");
        return ((Enum) AbstractC7020k.m28849v(this.f319b, element.ordinal())) == element;
    }

    @Override // p378x5.AbstractC7013d, java.util.List
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public Enum get(int i7) {
        AbstractC7013d.f25070a.m28768b(i7, this.f319b.length);
        return this.f319b[i7];
    }

    /* renamed from: h */
    public int m243h(Enum element) {
        AbstractC5469l.m23028e(element, "element");
        int ordinal = element.ordinal();
        if (((Enum) AbstractC7020k.m28849v(this.f319b, ordinal)) == element) {
            return ordinal;
        }
        return -1;
    }

    /* renamed from: i */
    public int m244i(Enum element) {
        AbstractC5469l.m23028e(element, "element");
        return indexOf(element);
    }

    @Override // p378x5.AbstractC7013d, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof Enum) {
            return m243h((Enum) obj);
        }
        return -1;
    }

    @Override // p378x5.AbstractC7013d, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof Enum) {
            return m244i((Enum) obj);
        }
        return -1;
    }
}
