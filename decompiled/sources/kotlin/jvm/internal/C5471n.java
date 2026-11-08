package kotlin.jvm.internal;

/* renamed from: kotlin.jvm.internal.n */
/* loaded from: classes2.dex */
public final class C5471n implements InterfaceC5461d {

    /* renamed from: a */
    public final Class f19704a;

    /* renamed from: b */
    public final String f19705b;

    public C5471n(Class jClass, String moduleName) {
        AbstractC5469l.m23028e(jClass, "jClass");
        AbstractC5469l.m23028e(moduleName, "moduleName");
        this.f19704a = jClass;
        this.f19705b = moduleName;
    }

    @Override // kotlin.jvm.internal.InterfaceC5461d
    /* renamed from: c */
    public Class mo23014c() {
        return this.f19704a;
    }

    public boolean equals(Object obj) {
        return (obj instanceof C5471n) && AbstractC5469l.m23024a(mo23014c(), ((C5471n) obj).mo23014c());
    }

    public int hashCode() {
        return mo23014c().hashCode();
    }

    public String toString() {
        return mo23014c() + " (Kotlin reflection is not available)";
    }
}
