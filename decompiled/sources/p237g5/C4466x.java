package p237g5;

import java.net.SocketAddress;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p171Y2.AbstractC2932o;
import p237g5.C4425a;
import p256j$.util.DesugarCollections;

/* renamed from: g5.x */
/* loaded from: classes2.dex */
public final class C4466x {

    /* renamed from: d */
    public static final C4425a.c f15902d = C4425a.c.m18825a("io.grpc.EquivalentAddressGroup.ATTR_AUTHORITY_OVERRIDE");

    /* renamed from: a */
    public final List f15903a;

    /* renamed from: b */
    public final C4425a f15904b;

    /* renamed from: c */
    public final int f15905c;

    public C4466x(List list, C4425a c4425a) {
        AbstractC2932o.m10562e(!list.isEmpty(), "addrs is empty");
        List unmodifiableList = DesugarCollections.unmodifiableList(new ArrayList(list));
        this.f15903a = unmodifiableList;
        this.f15904b = (C4425a) AbstractC2932o.m10573p(c4425a, "attrs");
        this.f15905c = unmodifiableList.hashCode();
    }

    /* renamed from: a */
    public List m19034a() {
        return this.f15903a;
    }

    /* renamed from: b */
    public C4425a m19035b() {
        return this.f15904b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4466x)) {
            return false;
        }
        C4466x c4466x = (C4466x) obj;
        if (this.f15903a.size() != c4466x.f15903a.size()) {
            return false;
        }
        for (int i7 = 0; i7 < this.f15903a.size(); i7++) {
            if (!((SocketAddress) this.f15903a.get(i7)).equals(c4466x.f15903a.get(i7))) {
                return false;
            }
        }
        return this.f15904b.equals(c4466x.f15904b);
    }

    public int hashCode() {
        return this.f15905c;
    }

    public String toString() {
        return "[" + this.f15903a + "/" + this.f15904b + "]";
    }

    public C4466x(SocketAddress socketAddress) {
        this(socketAddress, C4425a.f15691c);
    }

    public C4466x(SocketAddress socketAddress, C4425a c4425a) {
        this(Collections.singletonList(socketAddress), c4425a);
    }
}
