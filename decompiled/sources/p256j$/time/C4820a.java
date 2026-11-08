package p256j$.time;

import java.io.ObjectInputStream;
import java.io.Serializable;

/* renamed from: j$.time.a */
/* loaded from: classes3.dex */
final class C4820a extends AbstractC4821b implements Serializable {

    /* renamed from: b */
    static final C4820a f17898b;
    private static final long serialVersionUID = 6740630888130243051L;

    /* renamed from: a */
    private final ZoneOffset f17899a;

    static {
        System.currentTimeMillis();
        f17898b = new C4820a(ZoneOffset.UTC);
    }

    C4820a(ZoneOffset zoneOffset) {
        this.f17899a = zoneOffset;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C4820a)) {
            return false;
        }
        return this.f17899a.equals(((C4820a) obj).f17899a);
    }

    public final int hashCode() {
        return this.f17899a.hashCode() + 1;
    }

    public final String toString() {
        return "SystemClock[" + this.f17899a + "]";
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
    }
}
