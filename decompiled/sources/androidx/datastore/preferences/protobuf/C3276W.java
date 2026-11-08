package androidx.datastore.preferences.protobuf;

/* renamed from: androidx.datastore.preferences.protobuf.W */
/* loaded from: classes.dex */
public final class C3276W implements InterfaceC3262H {

    /* renamed from: a */
    public final InterfaceC3264J f10417a;

    /* renamed from: b */
    public final String f10418b;

    /* renamed from: c */
    public final Object[] f10419c;

    /* renamed from: d */
    public final int f10420d;

    public C3276W(InterfaceC3264J interfaceC3264J, String str, Object[] objArr) {
        this.f10417a = interfaceC3264J;
        this.f10418b = str;
        this.f10419c = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.f10420d = charAt;
            return;
        }
        int i7 = charAt & 8191;
        int i8 = 13;
        int i9 = 1;
        while (true) {
            int i10 = i9 + 1;
            char charAt2 = str.charAt(i9);
            if (charAt2 < 55296) {
                this.f10420d = i7 | (charAt2 << i8);
                return;
            } else {
                i7 |= (charAt2 & 8191) << i8;
                i8 += 13;
                i9 = i10;
            }
        }
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC3262H
    /* renamed from: a */
    public boolean mo12091a() {
        return (this.f10420d & 2) == 2;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC3262H
    /* renamed from: b */
    public InterfaceC3264J mo12092b() {
        return this.f10417a;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC3262H
    /* renamed from: c */
    public EnumC3273T mo12093c() {
        int i7 = this.f10420d;
        return (i7 & 1) != 0 ? EnumC3273T.PROTO2 : (i7 & 4) == 4 ? EnumC3273T.EDITIONS : EnumC3273T.PROTO3;
    }

    /* renamed from: d */
    public Object[] m12191d() {
        return this.f10419c;
    }

    /* renamed from: e */
    public String m12192e() {
        return this.f10418b;
    }
}
