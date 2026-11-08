package p264j5;

import p206c6.C3616d;
import p253i5.InterfaceC4589W0;

/* renamed from: j5.p */
/* loaded from: classes2.dex */
public class C5387p implements InterfaceC4589W0 {

    /* renamed from: a */
    public final C3616d f19205a;

    /* renamed from: b */
    public int f19206b;

    /* renamed from: c */
    public int f19207c;

    public C5387p(C3616d c3616d, int i7) {
        this.f19205a = c3616d;
        this.f19206b = i7;
    }

    @Override // p253i5.InterfaceC4589W0
    /* renamed from: a */
    public void mo19693a(byte[] bArr, int i7, int i8) {
        this.f19205a.m14632x0(bArr, i7, i8);
        this.f19206b -= i8;
        this.f19207c += i8;
    }

    @Override // p253i5.InterfaceC4589W0
    /* renamed from: b */
    public int mo19694b() {
        return this.f19207c;
    }

    @Override // p253i5.InterfaceC4589W0
    /* renamed from: c */
    public int mo19695c() {
        return this.f19206b;
    }

    @Override // p253i5.InterfaceC4589W0
    /* renamed from: d */
    public void mo19696d(byte b7) {
        this.f19205a.mo14505A(b7);
        this.f19206b--;
        this.f19207c++;
    }

    /* renamed from: e */
    public C3616d m22267e() {
        return this.f19205a;
    }

    @Override // p253i5.InterfaceC4589W0
    public void release() {
    }
}
