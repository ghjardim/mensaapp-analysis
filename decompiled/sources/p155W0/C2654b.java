package p155W0;

import java.nio.ByteBuffer;
import java.util.Arrays;
import p141U0.AbstractC2501c;
import p141U0.C2500b;
import p232g0.C4334x;
import p259j0.AbstractC5332a;
import p259j0.C5357z;

/* renamed from: W0.b */
/* loaded from: classes.dex */
public final class C2654b extends AbstractC2501c {
    @Override // p141U0.AbstractC2501c
    /* renamed from: b */
    public C4334x mo8457b(C2500b c2500b, ByteBuffer byteBuffer) {
        return new C4334x(m9108c(new C5357z(byteBuffer.array(), byteBuffer.limit())));
    }

    /* renamed from: c */
    public C2653a m9108c(C5357z c5357z) {
        return new C2653a((String) AbstractC5332a.m21800e(c5357z.m21920A()), (String) AbstractC5332a.m21800e(c5357z.m21920A()), c5357z.m21967z(), c5357z.m21967z(), Arrays.copyOfRange(c5357z.m21946e(), c5357z.m21947f(), c5357z.m21948g()));
    }
}
