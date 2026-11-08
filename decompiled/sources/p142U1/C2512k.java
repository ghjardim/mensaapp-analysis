package p142U1;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: U1.k */
/* loaded from: classes.dex */
public class C2512k extends AbstractC2506e {
    public C2512k(C2510i c2510i, AbstractC2505d abstractC2505d, long j7) {
        ByteBuffer allocate = ByteBuffer.allocate(8);
        allocate.order(abstractC2505d.f7340a ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
        long j8 = abstractC2505d.f7342c + (j7 * abstractC2505d.f7344e);
        this.f7349a = c2510i.m8469r(allocate, j8);
        this.f7350b = c2510i.m8467m(allocate, 8 + j8);
        this.f7351c = c2510i.m8467m(allocate, 16 + j8);
        this.f7352d = c2510i.m8467m(allocate, j8 + 40);
    }
}
