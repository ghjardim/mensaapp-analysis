package p142U1;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: U1.h */
/* loaded from: classes.dex */
public class C2509h extends AbstractC2505d {

    /* renamed from: j */
    public final C2510i f7355j;

    public C2509h(boolean z6, C2510i c2510i) {
        this.f7340a = z6;
        this.f7355j = c2510i;
        ByteBuffer allocate = ByteBuffer.allocate(8);
        allocate.order(z6 ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
        this.f7341b = c2510i.m8466j(allocate, 16L);
        this.f7342c = c2510i.m8467m(allocate, 32L);
        this.f7343d = c2510i.m8467m(allocate, 40L);
        this.f7344e = c2510i.m8466j(allocate, 54L);
        this.f7345f = c2510i.m8466j(allocate, 56L);
        this.f7346g = c2510i.m8466j(allocate, 58L);
        this.f7347h = c2510i.m8466j(allocate, 60L);
        this.f7348i = c2510i.m8466j(allocate, 62L);
    }

    @Override // p142U1.AbstractC2505d
    /* renamed from: a */
    public AbstractC2504c mo8458a(long j7, int i7) {
        return new C2503b(this.f7355j, this, j7, i7);
    }

    @Override // p142U1.AbstractC2505d
    /* renamed from: b */
    public AbstractC2506e mo8459b(long j7) {
        return new C2512k(this.f7355j, this, j7);
    }

    @Override // p142U1.AbstractC2505d
    /* renamed from: c */
    public AbstractC2507f mo8460c(int i7) {
        return new C2514m(this.f7355j, this, i7);
    }
}
