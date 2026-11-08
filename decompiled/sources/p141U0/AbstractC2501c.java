package p141U0;

import java.nio.ByteBuffer;
import p232g0.C4334x;
import p259j0.AbstractC5332a;

/* renamed from: U0.c */
/* loaded from: classes.dex */
public abstract class AbstractC2501c implements InterfaceC2499a {
    @Override // p141U0.InterfaceC2499a
    /* renamed from: a */
    public final C4334x mo8456a(C2500b c2500b) {
        ByteBuffer byteBuffer = (ByteBuffer) AbstractC5332a.m21800e(c2500b.f20077d);
        AbstractC5332a.m21796a(byteBuffer.position() == 0 && byteBuffer.hasArray() && byteBuffer.arrayOffset() == 0);
        return mo8457b(c2500b, byteBuffer);
    }

    /* renamed from: b */
    public abstract C4334x mo8457b(C2500b c2500b, ByteBuffer byteBuffer);
}
