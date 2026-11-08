package p371w5;

import java.io.Serializable;
import kotlin.jvm.internal.AbstractC5469l;

/* renamed from: w5.i */
/* loaded from: classes2.dex */
public final class C6926i implements Serializable {

    /* renamed from: a */
    public final Object f24801a;

    /* renamed from: b */
    public final Object f24802b;

    public C6926i(Object obj, Object obj2) {
        this.f24801a = obj;
        this.f24802b = obj2;
    }

    /* renamed from: a */
    public final Object m28368a() {
        return this.f24801a;
    }

    /* renamed from: b */
    public final Object m28369b() {
        return this.f24802b;
    }

    /* renamed from: c */
    public final Object m28370c() {
        return this.f24801a;
    }

    /* renamed from: d */
    public final Object m28371d() {
        return this.f24802b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6926i)) {
            return false;
        }
        C6926i c6926i = (C6926i) obj;
        return AbstractC5469l.m23024a(this.f24801a, c6926i.f24801a) && AbstractC5469l.m23024a(this.f24802b, c6926i.f24802b);
    }

    public int hashCode() {
        Object obj = this.f24801a;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.f24802b;
        return hashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    public String toString() {
        return '(' + this.f24801a + ", " + this.f24802b + ')';
    }
}
