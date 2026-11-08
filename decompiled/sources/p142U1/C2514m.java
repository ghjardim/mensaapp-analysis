package p142U1;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: U1.m */
/* loaded from: classes.dex */
public class C2514m extends AbstractC2507f {
    public C2514m(C2510i c2510i, AbstractC2505d abstractC2505d, int i7) {
        ByteBuffer allocate = ByteBuffer.allocate(8);
        allocate.order(abstractC2505d.f7340a ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
        this.f7353a = c2510i.m8469r(allocate, abstractC2505d.f7343d + (i7 * abstractC2505d.f7346g) + 44);
    }
}
