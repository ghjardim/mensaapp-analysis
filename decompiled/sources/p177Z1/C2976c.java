package p177Z1;

import android.content.Context;
import p250i2.InterfaceC4534a;

/* renamed from: Z1.c */
/* loaded from: classes.dex */
public final class C2976c extends AbstractC2981h {

    /* renamed from: a */
    public final Context f9133a;

    /* renamed from: b */
    public final InterfaceC4534a f9134b;

    /* renamed from: c */
    public final InterfaceC4534a f9135c;

    /* renamed from: d */
    public final String f9136d;

    public C2976c(Context context, InterfaceC4534a interfaceC4534a, InterfaceC4534a interfaceC4534a2, String str) {
        if (context == null) {
            throw new NullPointerException("Null applicationContext");
        }
        this.f9133a = context;
        if (interfaceC4534a == null) {
            throw new NullPointerException("Null wallClock");
        }
        this.f9134b = interfaceC4534a;
        if (interfaceC4534a2 == null) {
            throw new NullPointerException("Null monotonicClock");
        }
        this.f9135c = interfaceC4534a2;
        if (str == null) {
            throw new NullPointerException("Null backendName");
        }
        this.f9136d = str;
    }

    @Override // p177Z1.AbstractC2981h
    /* renamed from: b */
    public Context mo10726b() {
        return this.f9133a;
    }

    @Override // p177Z1.AbstractC2981h
    /* renamed from: c */
    public String mo10727c() {
        return this.f9136d;
    }

    @Override // p177Z1.AbstractC2981h
    /* renamed from: d */
    public InterfaceC4534a mo10728d() {
        return this.f9135c;
    }

    @Override // p177Z1.AbstractC2981h
    /* renamed from: e */
    public InterfaceC4534a mo10729e() {
        return this.f9134b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC2981h)) {
            return false;
        }
        AbstractC2981h abstractC2981h = (AbstractC2981h) obj;
        return this.f9133a.equals(abstractC2981h.mo10726b()) && this.f9134b.equals(abstractC2981h.mo10729e()) && this.f9135c.equals(abstractC2981h.mo10728d()) && this.f9136d.equals(abstractC2981h.mo10727c());
    }

    public int hashCode() {
        return ((((((this.f9133a.hashCode() ^ 1000003) * 1000003) ^ this.f9134b.hashCode()) * 1000003) ^ this.f9135c.hashCode()) * 1000003) ^ this.f9136d.hashCode();
    }

    public String toString() {
        return "CreationContext{applicationContext=" + this.f9133a + ", wallClock=" + this.f9134b + ", monotonicClock=" + this.f9135c + ", backendName=" + this.f9136d + "}";
    }
}
