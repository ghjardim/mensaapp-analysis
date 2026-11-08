package p142U1;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: U1.g */
/* loaded from: classes.dex */
public class C2508g extends AbstractC2505d {

    /* renamed from: j */
    public final C2510i f7354j;

    public C2508g(boolean z6, C2510i c2510i) {
        this.f7340a = z6;
        this.f7354j = c2510i;
        ByteBuffer allocate = ByteBuffer.allocate(4);
        allocate.order(z6 ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
        this.f7341b = c2510i.m8466j(allocate, 16L);
        this.f7342c = c2510i.m8469r(allocate, 28L);
        this.f7343d = c2510i.m8469r(allocate, 32L);
        this.f7344e = c2510i.m8466j(allocate, 42L);
        this.f7345f = c2510i.m8466j(allocate, 44L);
        this.f7346g = c2510i.m8466j(allocate, 46L);
        this.f7347h = c2510i.m8466j(allocate, 48L);
        this.f7348i = c2510i.m8466j(allocate, 50L);
    }

    @Override // p142U1.AbstractC2505d
    /* renamed from: a */
    public AbstractC2504c mo8458a(long j7, int i7) {
        return new C2502a(this.f7354j, this, j7, i7);
    }

    @Override // p142U1.AbstractC2505d
    /* renamed from: b */
    public AbstractC2506e mo8459b(long j7) {
        return new C2511j(this.f7354j, this, j7);
    }

    @Override // p142U1.AbstractC2505d
    /* renamed from: c */
    public AbstractC2507f mo8460c(int i7) {
        return new C2513l(this.f7354j, this, i7);
    }
}
