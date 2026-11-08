package p132S5;

/* renamed from: S5.d0 */
/* loaded from: classes2.dex */
public final class C2375d0 implements InterfaceC2399p0 {

    /* renamed from: a */
    public final boolean f7102a;

    public C2375d0(boolean z6) {
        this.f7102a = z6;
    }

    @Override // p132S5.InterfaceC2399p0
    /* renamed from: c */
    public C2331H0 mo7865c() {
        return null;
    }

    @Override // p132S5.InterfaceC2399p0
    public boolean isActive() {
        return this.f7102a;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Empty{");
        sb.append(isActive() ? "Active" : "New");
        sb.append('}');
        return sb.toString();
    }
}
