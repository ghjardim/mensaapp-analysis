package p256j$.util.stream;

/* renamed from: j$.util.stream.d */
/* loaded from: classes3.dex */
abstract class AbstractC5180d {

    /* renamed from: a */
    protected final int f18555a;

    /* renamed from: b */
    protected int f18556b;

    /* renamed from: c */
    protected int f18557c;

    /* renamed from: d */
    protected long[] f18558d;

    public abstract void clear();

    protected AbstractC5180d() {
        this.f18555a = 4;
    }

    protected AbstractC5180d(int i7) {
        if (i7 < 0) {
            throw new IllegalArgumentException("Illegal Capacity: " + i7);
        }
        this.f18555a = Math.max(4, 32 - Integer.numberOfLeadingZeros(i7 - 1));
    }

    public final long count() {
        int i7 = this.f18557c;
        if (i7 == 0) {
            return this.f18556b;
        }
        return this.f18558d[i7] + this.f18556b;
    }
}
