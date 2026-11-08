package p256j$.time.zone;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.Serializable;
import java.util.Collections;
import java.util.List;
import p256j$.com.android.tools.p257r8.AbstractC4815a;
import p256j$.time.C4863f;
import p256j$.time.LocalDateTime;
import p256j$.time.ZoneOffset;
import p256j$.time.chrono.AbstractC4843i;

/* renamed from: j$.time.zone.b */
/* loaded from: classes3.dex */
public final class C4927b implements Comparable, Serializable {
    private static final long serialVersionUID = -6946044323557704546L;

    /* renamed from: a */
    private final long f18103a;

    /* renamed from: b */
    private final LocalDateTime f18104b;

    /* renamed from: c */
    private final ZoneOffset f18105c;

    /* renamed from: d */
    private final ZoneOffset f18106d;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Long.compare(this.f18103a, ((C4927b) obj).f18103a);
    }

    C4927b(LocalDateTime localDateTime, ZoneOffset zoneOffset, ZoneOffset zoneOffset2) {
        localDateTime.getClass();
        this.f18103a = AbstractC4843i.m21030n(localDateTime, zoneOffset);
        this.f18104b = localDateTime;
        this.f18105c = zoneOffset;
        this.f18106d = zoneOffset2;
    }

    C4927b(long j7, ZoneOffset zoneOffset, ZoneOffset zoneOffset2) {
        this.f18103a = j7;
        this.f18104b = LocalDateTime.m20932R(j7, 0, zoneOffset);
        this.f18105c = zoneOffset;
        this.f18106d = zoneOffset2;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new C4926a((byte) 2, this);
    }

    final void writeExternal(ObjectOutput objectOutput) {
        C4926a.m21227c(this.f18103a, objectOutput);
        C4926a.m21228d(this.f18105c, objectOutput);
        C4926a.m21228d(this.f18106d, objectOutput);
    }

    /* renamed from: H */
    public final long m21229H() {
        return this.f18103a;
    }

    /* renamed from: m */
    public final LocalDateTime m21231m() {
        return this.f18104b;
    }

    /* renamed from: s */
    public final ZoneOffset m21234s() {
        return this.f18105c;
    }

    /* renamed from: o */
    public final ZoneOffset m21233o() {
        return this.f18106d;
    }

    /* renamed from: l */
    public final LocalDateTime m21230l() {
        return this.f18104b.m20942T(this.f18106d.m20971Q() - this.f18105c.m20971Q());
    }

    /* renamed from: n */
    public final C4863f m21232n() {
        return C4863f.m21061o(this.f18106d.m20971Q() - this.f18105c.m20971Q());
    }

    /* renamed from: z */
    public final boolean m21236z() {
        return this.f18106d.m20971Q() > this.f18105c.m20971Q();
    }

    /* renamed from: w */
    final List m21235w() {
        return m21236z() ? Collections.emptyList() : AbstractC4815a.m20870h(new Object[]{this.f18105c, this.f18106d});
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C4927b)) {
            return false;
        }
        C4927b c4927b = (C4927b) obj;
        return this.f18103a == c4927b.f18103a && this.f18105c.equals(c4927b.f18105c) && this.f18106d.equals(c4927b.f18106d);
    }

    public final int hashCode() {
        return (this.f18104b.hashCode() ^ this.f18105c.hashCode()) ^ Integer.rotateLeft(this.f18106d.hashCode(), 16);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Transition[");
        sb.append(m21236z() ? "Gap" : "Overlap");
        sb.append(" at ");
        sb.append(this.f18104b);
        sb.append(this.f18105c);
        sb.append(" to ");
        sb.append(this.f18106d);
        sb.append(']');
        return sb.toString();
    }
}
