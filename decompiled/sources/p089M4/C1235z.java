package p089M4;

import kotlin.jvm.internal.AbstractC5469l;

/* renamed from: M4.z */
/* loaded from: classes2.dex */
public final class C1235z extends Throwable {

    /* renamed from: a */
    public final String f3898a;

    /* renamed from: b */
    public final String f3899b;

    /* renamed from: c */
    public final Object f3900c;

    public C1235z(String code, String str, Object obj) {
        AbstractC5469l.m23028e(code, "code");
        this.f3898a = code;
        this.f3899b = str;
        this.f3900c = obj;
    }

    /* renamed from: a */
    public final String m4740a() {
        return this.f3898a;
    }

    /* renamed from: b */
    public final Object m4741b() {
        return this.f3900c;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.f3899b;
    }
}
