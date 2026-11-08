package p345t2;

/* renamed from: t2.b */
/* loaded from: classes.dex */
public class C6433b {

    /* renamed from: a */
    public int f23337a = 1;

    /* renamed from: a */
    public C6433b m26915a(Object obj) {
        this.f23337a = (this.f23337a * 31) + (obj == null ? 0 : obj.hashCode());
        return this;
    }

    /* renamed from: b */
    public int m26916b() {
        return this.f23337a;
    }

    /* renamed from: c */
    public final C6433b m26917c(boolean z6) {
        this.f23337a = (this.f23337a * 31) + (z6 ? 1 : 0);
        return this;
    }
}
