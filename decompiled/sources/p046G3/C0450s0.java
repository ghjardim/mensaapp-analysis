package p046G3;

import android.app.Activity;
import java.util.concurrent.Executor;
import p116Q3.AbstractC2147p;
import p116Q3.AbstractC2157z;

/* renamed from: G3.s0 */
/* loaded from: classes.dex */
public final class C0450s0 {

    /* renamed from: a */
    public final EnumC0418c0 f1600a;

    /* renamed from: b */
    public final EnumC0406T f1601b;

    /* renamed from: c */
    public final Executor f1602c;

    /* renamed from: d */
    public final Activity f1603d;

    /* renamed from: G3.s0$b */
    public static class b {

        /* renamed from: a */
        public EnumC0418c0 f1604a = EnumC0418c0.EXCLUDE;

        /* renamed from: b */
        public EnumC0406T f1605b = EnumC0406T.DEFAULT;

        /* renamed from: c */
        public Executor f1606c = AbstractC2147p.f6507a;

        /* renamed from: d */
        public Activity f1607d = null;

        /* renamed from: e */
        public C0450s0 m1669e() {
            return new C0450s0(this);
        }

        /* renamed from: f */
        public b m1670f(EnumC0418c0 enumC0418c0) {
            AbstractC2157z.m7330c(enumC0418c0, "metadataChanges must not be null.");
            this.f1604a = enumC0418c0;
            return this;
        }

        /* renamed from: g */
        public b m1671g(EnumC0406T enumC0406T) {
            AbstractC2157z.m7330c(enumC0406T, "listen source must not be null.");
            this.f1605b = enumC0406T;
            return this;
        }
    }

    /* renamed from: a */
    public Activity m1661a() {
        return this.f1603d;
    }

    /* renamed from: b */
    public Executor m1662b() {
        return this.f1602c;
    }

    /* renamed from: c */
    public EnumC0418c0 m1663c() {
        return this.f1600a;
    }

    /* renamed from: d */
    public EnumC0406T m1664d() {
        return this.f1601b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0450s0.class != obj.getClass()) {
            return false;
        }
        C0450s0 c0450s0 = (C0450s0) obj;
        return this.f1600a == c0450s0.f1600a && this.f1601b == c0450s0.f1601b && this.f1602c.equals(c0450s0.f1602c) && this.f1603d.equals(c0450s0.f1603d);
    }

    public int hashCode() {
        int hashCode = ((((this.f1600a.hashCode() * 31) + this.f1601b.hashCode()) * 31) + this.f1602c.hashCode()) * 31;
        Activity activity = this.f1603d;
        return hashCode + (activity != null ? activity.hashCode() : 0);
    }

    public String toString() {
        return "SnapshotListenOptions{metadataChanges=" + this.f1600a + ", source=" + this.f1601b + ", executor=" + this.f1602c + ", activity=" + this.f1603d + '}';
    }

    public C0450s0(b bVar) {
        this.f1600a = bVar.f1604a;
        this.f1601b = bVar.f1605b;
        this.f1602c = bVar.f1606c;
        this.f1603d = bVar.f1607d;
    }
}
