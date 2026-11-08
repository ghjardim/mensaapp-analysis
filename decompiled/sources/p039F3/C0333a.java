package p039F3;

import p362v3.AbstractC6750E;

/* renamed from: F3.a */
/* loaded from: classes.dex */
public class C0333a {

    /* renamed from: a */
    public final Class f1283a;

    /* renamed from: b */
    public final Object f1284b;

    public C0333a(Class cls, Object obj) {
        this.f1283a = (Class) AbstractC6750E.m27702b(cls);
        this.f1284b = AbstractC6750E.m27702b(obj);
    }

    /* renamed from: a */
    public Object m1335a() {
        return this.f1284b;
    }

    /* renamed from: b */
    public Class m1336b() {
        return this.f1283a;
    }

    public String toString() {
        return String.format("Event{type: %s, payload: %s}", this.f1283a, this.f1284b);
    }
}
