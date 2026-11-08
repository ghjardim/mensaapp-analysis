package p142U1;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: U1.j */
/* loaded from: classes.dex */
public class C2511j extends AbstractC2506e {
    public C2511j(C2510i c2510i, AbstractC2505d abstractC2505d, long j7) {
        ByteBuffer allocate = ByteBuffer.allocate(4);
        allocate.order(abstractC2505d.f7340a ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
        long j8 = abstractC2505d.f7342c + (j7 * abstractC2505d.f7344e);
        this.f7349a = c2510i.m8469r(allocate, j8);
        this.f7350b = c2510i.m8469r(allocate, 4 + j8);
        this.f7351c = c2510i.m8469r(allocate, 8 + j8);
        this.f7352d = c2510i.m8469r(allocate, j8 + 20);
    }
}
