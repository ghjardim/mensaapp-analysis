package p134T0;

import java.util.List;
import p184a1.C3098a;

/* renamed from: T0.c */
/* loaded from: classes.dex */
public final class C2430c {

    /* renamed from: a */
    public final long f7194a;

    /* renamed from: b */
    public final List f7195b;

    /* renamed from: T0.c$a */
    public static final class a {

        /* renamed from: a */
        public final String f7196a;

        /* renamed from: b */
        public final String f7197b;

        /* renamed from: c */
        public final long f7198c;

        /* renamed from: d */
        public final long f7199d;

        public a(String str, String str2, long j7, long j8) {
            this.f7196a = str;
            this.f7197b = str2;
            this.f7198c = j7;
            this.f7199d = j8;
        }
    }

    public C2430c(long j7, List list) {
        this.f7194a = j7;
        this.f7195b = list;
    }

    /* renamed from: a */
    public C3098a m8279a(long j7) {
        long j8;
        if (this.f7195b.size() < 2) {
            return null;
        }
        long j9 = j7;
        long j10 = -1;
        long j11 = -1;
        long j12 = -1;
        long j13 = -1;
        boolean z6 = false;
        for (int size = this.f7195b.size() - 1; size >= 0; size--) {
            a aVar = (a) this.f7195b.get(size);
            boolean equals = "video/mp4".equals(aVar.f7196a) | z6;
            if (size == 0) {
                j9 -= aVar.f7199d;
                j8 = 0;
            } else {
                j8 = j9 - aVar.f7198c;
            }
            long j14 = j9;
            j9 = j8;
            if (!equals || j9 == j14) {
                z6 = equals;
            } else {
                j13 = j14 - j9;
                j12 = j9;
                z6 = false;
            }
            if (size == 0) {
                j10 = j9;
                j11 = j14;
            }
        }
        if (j12 == -1 || j13 == -1 || j10 == -1 || j11 == -1) {
            return null;
        }
        return new C3098a(j10, j11, this.f7194a, j12, j13);
    }
}
