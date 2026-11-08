package p097N5;

import java.util.Random;
import kotlin.jvm.internal.AbstractC5469l;
import p090M5.AbstractC1236a;
import p256j$.util.concurrent.ThreadLocalRandom;

/* renamed from: N5.a */
/* loaded from: classes2.dex */
public final class C1289a extends AbstractC1236a {
    @Override // p090M5.AbstractC1236a
    /* renamed from: c */
    public Random mo4743c() {
        ThreadLocalRandom current = ThreadLocalRandom.current();
        AbstractC5469l.m23027d(current, "current(...)");
        return current;
    }
}
