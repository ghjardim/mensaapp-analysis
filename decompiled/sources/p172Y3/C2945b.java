package p172Y3;

import com.google.android.gms.common.internal.AbstractC3798p;

/* renamed from: Y3.b */
/* loaded from: classes.dex */
public class C2945b {

    /* renamed from: a */
    public String f9057a;

    public C2945b(String str) {
        this.f9057a = str;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C2945b) {
            return AbstractC3798p.m15099b(this.f9057a, ((C2945b) obj).f9057a);
        }
        return false;
    }

    public int hashCode() {
        return AbstractC3798p.m15100c(this.f9057a);
    }

    public String toString() {
        return AbstractC3798p.m15101d(this).m15102a("token", this.f9057a).toString();
    }
}
