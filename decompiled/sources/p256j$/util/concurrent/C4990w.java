package p256j$.util.concurrent;

/* renamed from: j$.util.concurrent.w */
/* loaded from: classes3.dex */
final class C4990w extends ThreadLocal {
    @Override // java.lang.ThreadLocal
    protected final Object initialValue() {
        return new ThreadLocalRandom(0);
    }
}
