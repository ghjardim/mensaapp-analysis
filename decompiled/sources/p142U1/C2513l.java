package p142U1;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: U1.l */
/* loaded from: classes.dex */
public class C2513l extends AbstractC2507f {
    public C2513l(C2510i c2510i, AbstractC2505d abstractC2505d, int i7) {
        ByteBuffer allocate = ByteBuffer.allocate(4);
        allocate.order(abstractC2505d.f7340a ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
        this.f7353a = c2510i.m8469r(allocate, abstractC2505d.f7343d + (i7 * abstractC2505d.f7346g) + 28);
    }
}
