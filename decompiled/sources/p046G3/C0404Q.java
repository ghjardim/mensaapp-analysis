package p046G3;

import p116Q3.AbstractC2131I;

/* renamed from: G3.Q */
/* loaded from: classes.dex */
public class C0404Q implements Comparable {

    /* renamed from: a */
    public final double f1515a;

    /* renamed from: b */
    public final double f1516b;

    public C0404Q(double d7, double d8) {
        if (Double.isNaN(d7) || d7 < -90.0d || d7 > 90.0d) {
            throw new IllegalArgumentException("Latitude must be in the range of [-90, 90]");
        }
        if (Double.isNaN(d8) || d8 < -180.0d || d8 > 180.0d) {
            throw new IllegalArgumentException("Longitude must be in the range of [-180, 180]");
        }
        this.f1515a = d7;
        this.f1516b = d8;
    }

    @Override // java.lang.Comparable
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public int compareTo(C0404Q c0404q) {
        int m7196k = AbstractC2131I.m7196k(this.f1515a, c0404q.f1515a);
        return m7196k == 0 ? AbstractC2131I.m7196k(this.f1516b, c0404q.f1516b) : m7196k;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C0404Q)) {
            return false;
        }
        C0404Q c0404q = (C0404Q) obj;
        return this.f1515a == c0404q.f1515a && this.f1516b == c0404q.f1516b;
    }

    /* renamed from: f */
    public double m1600f() {
        return this.f1515a;
    }

    /* renamed from: g */
    public double m1601g() {
        return this.f1516b;
    }

    public int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.f1515a);
        int i7 = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
        long doubleToLongBits2 = Double.doubleToLongBits(this.f1516b);
        return (i7 * 31) + ((int) ((doubleToLongBits2 >>> 32) ^ doubleToLongBits2));
    }

    public String toString() {
        return "GeoPoint { latitude=" + this.f1515a + ", longitude=" + this.f1516b + " }";
    }
}
