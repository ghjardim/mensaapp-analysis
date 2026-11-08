package p109P3;

import com.google.protobuf.AbstractC4055i;
import java.util.List;
import p088M3.C1170l;
import p088M3.C1177s;
import p116Q3.AbstractC2133b;
import p237g5.C4448l0;

/* renamed from: P3.a0 */
/* loaded from: classes.dex */
public abstract class AbstractC1918a0 {

    /* renamed from: P3.a0$b */
    public static final class b extends AbstractC1918a0 {

        /* renamed from: a */
        public final List f5738a;

        /* renamed from: b */
        public final List f5739b;

        /* renamed from: c */
        public final C1170l f5740c;

        /* renamed from: d */
        public final C1177s f5741d;

        public b(List list, List list2, C1170l c1170l, C1177s c1177s) {
            super();
            this.f5738a = list;
            this.f5739b = list2;
            this.f5740c = c1170l;
            this.f5741d = c1177s;
        }

        /* renamed from: a */
        public C1170l m6788a() {
            return this.f5740c;
        }

        /* renamed from: b */
        public C1177s m6789b() {
            return this.f5741d;
        }

        /* renamed from: c */
        public List m6790c() {
            return this.f5739b;
        }

        /* renamed from: d */
        public List m6791d() {
            return this.f5738a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || b.class != obj.getClass()) {
                return false;
            }
            b bVar = (b) obj;
            if (!this.f5738a.equals(bVar.f5738a) || !this.f5739b.equals(bVar.f5739b) || !this.f5740c.equals(bVar.f5740c)) {
                return false;
            }
            C1177s c1177s = this.f5741d;
            C1177s c1177s2 = bVar.f5741d;
            return c1177s != null ? c1177s.equals(c1177s2) : c1177s2 == null;
        }

        public int hashCode() {
            int hashCode = ((((this.f5738a.hashCode() * 31) + this.f5739b.hashCode()) * 31) + this.f5740c.hashCode()) * 31;
            C1177s c1177s = this.f5741d;
            return hashCode + (c1177s != null ? c1177s.hashCode() : 0);
        }

        public String toString() {
            return "DocumentChange{updatedTargetIds=" + this.f5738a + ", removedTargetIds=" + this.f5739b + ", key=" + this.f5740c + ", newDocument=" + this.f5741d + '}';
        }
    }

    /* renamed from: P3.a0$c */
    public static final class c extends AbstractC1918a0 {

        /* renamed from: a */
        public final int f5742a;

        /* renamed from: b */
        public final C1939s f5743b;

        public c(int i7, C1939s c1939s) {
            super();
            this.f5742a = i7;
            this.f5743b = c1939s;
        }

        /* renamed from: a */
        public C1939s m6792a() {
            return this.f5743b;
        }

        /* renamed from: b */
        public int m6793b() {
            return this.f5742a;
        }

        public String toString() {
            return "ExistenceFilterWatchChange{targetId=" + this.f5742a + ", existenceFilter=" + this.f5743b + '}';
        }
    }

    /* renamed from: P3.a0$d */
    public static final class d extends AbstractC1918a0 {

        /* renamed from: a */
        public final e f5744a;

        /* renamed from: b */
        public final List f5745b;

        /* renamed from: c */
        public final AbstractC4055i f5746c;

        /* renamed from: d */
        public final C4448l0 f5747d;

        public d(e eVar, List list, AbstractC4055i abstractC4055i, C4448l0 c4448l0) {
            super();
            AbstractC2133b.m7217d(c4448l0 == null || eVar == e.Removed, "Got cause for a target change that was not a removal", new Object[0]);
            this.f5744a = eVar;
            this.f5745b = list;
            this.f5746c = abstractC4055i;
            if (c4448l0 == null || c4448l0.m18961o()) {
                this.f5747d = null;
            } else {
                this.f5747d = c4448l0;
            }
        }

        /* renamed from: a */
        public C4448l0 m6794a() {
            return this.f5747d;
        }

        /* renamed from: b */
        public e m6795b() {
            return this.f5744a;
        }

        /* renamed from: c */
        public AbstractC4055i m6796c() {
            return this.f5746c;
        }

        /* renamed from: d */
        public List m6797d() {
            return this.f5745b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || d.class != obj.getClass()) {
                return false;
            }
            d dVar = (d) obj;
            if (this.f5744a != dVar.f5744a || !this.f5745b.equals(dVar.f5745b) || !this.f5746c.equals(dVar.f5746c)) {
                return false;
            }
            C4448l0 c4448l0 = this.f5747d;
            return c4448l0 != null ? dVar.f5747d != null && c4448l0.m18959m().equals(dVar.f5747d.m18959m()) : dVar.f5747d == null;
        }

        public int hashCode() {
            int hashCode = ((((this.f5744a.hashCode() * 31) + this.f5745b.hashCode()) * 31) + this.f5746c.hashCode()) * 31;
            C4448l0 c4448l0 = this.f5747d;
            return hashCode + (c4448l0 != null ? c4448l0.m18959m().hashCode() : 0);
        }

        public String toString() {
            return "WatchTargetChange{changeType=" + this.f5744a + ", targetIds=" + this.f5745b + '}';
        }
    }

    /* renamed from: P3.a0$e */
    public enum e {
        NoChange,
        Added,
        Removed,
        Current,
        Reset
    }

    public AbstractC1918a0() {
    }
}
