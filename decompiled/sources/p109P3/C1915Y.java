package p109P3;

import com.google.protobuf.AbstractC4055i;
import java.util.HashMap;
import java.util.Map;
import p067J3.C0756m;
import p088M3.C1170l;
import p116Q3.AbstractC2133b;
import p376x3.C6950e;

/* renamed from: P3.Y */
/* loaded from: classes.dex */
public final class C1915Y {

    /* renamed from: a */
    public int f5729a = 0;

    /* renamed from: b */
    public final Map f5730b = new HashMap();

    /* renamed from: c */
    public boolean f5731c = true;

    /* renamed from: d */
    public AbstractC4055i f5732d = AbstractC4055i.f13379b;

    /* renamed from: e */
    public boolean f5733e = false;

    /* renamed from: P3.Y$a */
    public static /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f5734a;

        static {
            int[] iArr = new int[C0756m.a.values().length];
            f5734a = iArr;
            try {
                iArr[C0756m.a.ADDED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f5734a[C0756m.a.MODIFIED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f5734a[C0756m.a.REMOVED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* renamed from: a */
    public void m6761a(C1170l c1170l, C0756m.a aVar) {
        this.f5731c = true;
        this.f5730b.put(c1170l, aVar);
    }

    /* renamed from: b */
    public void m6762b() {
        this.f5731c = false;
        this.f5730b.clear();
    }

    /* renamed from: c */
    public boolean m6763c() {
        return this.f5731c;
    }

    /* renamed from: d */
    public boolean m6764d() {
        return this.f5733e;
    }

    /* renamed from: e */
    public boolean m6765e() {
        return this.f5729a != 0;
    }

    /* renamed from: f */
    public void m6766f() {
        this.f5731c = true;
        this.f5733e = true;
    }

    /* renamed from: g */
    public void m6767g() {
        this.f5729a++;
    }

    /* renamed from: h */
    public void m6768h() {
        this.f5729a--;
    }

    /* renamed from: i */
    public void m6769i(C1170l c1170l) {
        this.f5731c = true;
        this.f5730b.remove(c1170l);
    }

    /* renamed from: j */
    public C1914X m6770j() {
        C6950e m4496h = C1170l.m4496h();
        C6950e m4496h2 = C1170l.m4496h();
        C6950e m4496h3 = C1170l.m4496h();
        C6950e c6950e = m4496h;
        C6950e c6950e2 = m4496h2;
        C6950e c6950e3 = m4496h3;
        for (Map.Entry entry : this.f5730b.entrySet()) {
            C1170l c1170l = (C1170l) entry.getKey();
            C0756m.a aVar = (C0756m.a) entry.getValue();
            int i7 = a.f5734a[aVar.ordinal()];
            if (i7 == 1) {
                c6950e = c6950e.m28471e(c1170l);
            } else if (i7 == 2) {
                c6950e2 = c6950e2.m28471e(c1170l);
            } else {
                if (i7 != 3) {
                    throw AbstractC2133b.m7214a("Encountered invalid change type: %s", aVar);
                }
                c6950e3 = c6950e3.m28471e(c1170l);
            }
        }
        return new C1914X(this.f5732d, this.f5733e, c6950e, c6950e2, c6950e3);
    }

    /* renamed from: k */
    public void m6771k(AbstractC4055i abstractC4055i) {
        if (abstractC4055i.isEmpty()) {
            return;
        }
        this.f5731c = true;
        this.f5732d = abstractC4055i;
    }
}
