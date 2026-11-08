package p079L1;

import java.util.List;
import kotlin.jvm.internal.AbstractC5469l;
import p378x5.AbstractC7032w;

/* renamed from: L1.j */
/* loaded from: classes.dex */
public final class C0901j {

    /* renamed from: a */
    public final List f3148a;

    public C0901j(List displayFeatures) {
        AbstractC5469l.m23028e(displayFeatures, "displayFeatures");
        this.f3148a = displayFeatures;
    }

    /* renamed from: a */
    public final List m3756a() {
        return this.f3148a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !AbstractC5469l.m23024a(C0901j.class, obj.getClass())) {
            return false;
        }
        return AbstractC5469l.m23024a(this.f3148a, ((C0901j) obj).f3148a);
    }

    public int hashCode() {
        return this.f3148a.hashCode();
    }

    public String toString() {
        return AbstractC7032w.m28878D(this.f3148a, ", ", "WindowLayoutInfo{ DisplayFeatures[", "] }", 0, null, null, 56, null);
    }
}
