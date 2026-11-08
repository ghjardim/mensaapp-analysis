package p171Y2;

/* renamed from: Y2.a */
/* loaded from: classes.dex */
public final class C2918a extends AbstractC2929l {

    /* renamed from: a */
    public static final C2918a f8994a = new C2918a();

    /* renamed from: e */
    public static AbstractC2929l m10504e() {
        return f8994a;
    }

    @Override // p171Y2.AbstractC2929l
    /* renamed from: b */
    public Object mo10505b() {
        throw new IllegalStateException("Optional.get() cannot be called on an absent value");
    }

    @Override // p171Y2.AbstractC2929l
    /* renamed from: c */
    public boolean mo10506c() {
        return false;
    }

    public boolean equals(Object obj) {
        return obj == this;
    }

    public int hashCode() {
        return 2040732332;
    }

    public String toString() {
        return "Optional.absent()";
    }
}
