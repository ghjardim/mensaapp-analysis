package p109P3;

import java.util.Map;
import java.util.Set;
import p088M3.C1181w;

/* renamed from: P3.O */
/* loaded from: classes.dex */
public final class C1906O {

    /* renamed from: a */
    public final C1181w f5678a;

    /* renamed from: b */
    public final Map f5679b;

    /* renamed from: c */
    public final Map f5680c;

    /* renamed from: d */
    public final Map f5681d;

    /* renamed from: e */
    public final Set f5682e;

    public C1906O(C1181w c1181w, Map map, Map map2, Map map3, Set set) {
        this.f5678a = c1181w;
        this.f5679b = map;
        this.f5680c = map2;
        this.f5681d = map3;
        this.f5682e = set;
    }

    /* renamed from: a */
    public Map m6643a() {
        return this.f5681d;
    }

    /* renamed from: b */
    public Set m6644b() {
        return this.f5682e;
    }

    /* renamed from: c */
    public C1181w m6645c() {
        return this.f5678a;
    }

    /* renamed from: d */
    public Map m6646d() {
        return this.f5679b;
    }

    /* renamed from: e */
    public Map m6647e() {
        return this.f5680c;
    }

    public String toString() {
        return "RemoteEvent{snapshotVersion=" + this.f5678a + ", targetChanges=" + this.f5679b + ", targetMismatches=" + this.f5680c + ", documentUpdates=" + this.f5681d + ", resolvedLimboDocuments=" + this.f5682e + '}';
    }
}
