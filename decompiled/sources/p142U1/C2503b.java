package p142U1;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: U1.b */
/* loaded from: classes.dex */
public class C2503b extends AbstractC2504c {
    public C2503b(C2510i c2510i, AbstractC2505d abstractC2505d, long j7, int i7) {
        ByteBuffer allocate = ByteBuffer.allocate(8);
        allocate.order(abstractC2505d.f7340a ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
        long j8 = j7 + (i7 * 16);
        this.f7338a = c2510i.m8467m(allocate, j8);
        this.f7339b = c2510i.m8467m(allocate, j8 + 8);
    }
}
