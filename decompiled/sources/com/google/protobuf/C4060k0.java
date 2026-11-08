package com.google.protobuf;

/* renamed from: com.google.protobuf.k0 */
/* loaded from: classes.dex */
public final class C4060k0 implements InterfaceC4032T {

    /* renamed from: a */
    public final InterfaceC4034V f13448a;

    /* renamed from: b */
    public final String f13449b;

    /* renamed from: c */
    public final Object[] f13450c;

    /* renamed from: d */
    public final int f13451d;

    public C4060k0(InterfaceC4034V interfaceC4034V, String str, Object[] objArr) {
        this.f13448a = interfaceC4034V;
        this.f13449b = str;
        this.f13450c = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.f13451d = charAt;
            return;
        }
        int i7 = charAt & 8191;
        int i8 = 13;
        int i9 = 1;
        while (true) {
            int i10 = i9 + 1;
            char charAt2 = str.charAt(i9);
            if (charAt2 < 55296) {
                this.f13451d = i7 | (charAt2 << i8);
                return;
            } else {
                i7 |= (charAt2 & 8191) << i8;
                i8 += 13;
                i9 = i10;
            }
        }
    }

    @Override // com.google.protobuf.InterfaceC4032T
    /* renamed from: a */
    public boolean mo16312a() {
        return (this.f13451d & 2) == 2;
    }

    @Override // com.google.protobuf.InterfaceC4032T
    /* renamed from: b */
    public InterfaceC4034V mo16313b() {
        return this.f13448a;
    }

    @Override // com.google.protobuf.InterfaceC4032T
    /* renamed from: c */
    public EnumC4054h0 mo16314c() {
        int i7 = this.f13451d;
        return (i7 & 1) != 0 ? EnumC4054h0.PROTO2 : (i7 & 4) == 4 ? EnumC4054h0.EDITIONS : EnumC4054h0.PROTO3;
    }

    /* renamed from: d */
    public Object[] m16680d() {
        return this.f13450c;
    }

    /* renamed from: e */
    public String m16681e() {
        return this.f13449b;
    }
}
