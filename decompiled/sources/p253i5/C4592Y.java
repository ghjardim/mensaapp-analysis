package p253i5;

import java.util.ArrayList;

/* renamed from: i5.Y */
/* loaded from: classes2.dex */
public final class C4592Y {

    /* renamed from: a */
    public final ArrayList f16677a = new ArrayList();

    /* renamed from: a */
    public C4592Y m19703a(Object obj) {
        this.f16677a.add(String.valueOf(obj));
        return this;
    }

    /* renamed from: b */
    public C4592Y m19704b(String str, Object obj) {
        this.f16677a.add(str + "=" + obj);
        return this;
    }

    public String toString() {
        return this.f16677a.toString();
    }
}
