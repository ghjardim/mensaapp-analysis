package p341s6;

/* renamed from: s6.b */
/* loaded from: classes2.dex */
public enum EnumC6401b {
    ERROR(40, "ERROR"),
    WARN(30, "WARN"),
    INFO(20, "INFO"),
    DEBUG(10, "DEBUG"),
    TRACE(0, "TRACE");


    /* renamed from: a */
    public final int f23115a;

    /* renamed from: b */
    public final String f23116b;

    EnumC6401b(int i7, String str) {
        this.f23115a = i7;
        this.f23116b = str;
    }

    /* renamed from: f */
    public int m26734f() {
        return this.f23115a;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f23116b;
    }
}
