package p046G3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: G3.z0 */
/* loaded from: classes.dex */
public class C0464z0 {

    /* renamed from: a */
    public final double[] f1632a;

    public C0464z0(double[] dArr) {
        this.f1632a = dArr == null ? new double[0] : (double[]) dArr.clone();
    }

    /* renamed from: a */
    public double[] m1709a() {
        return (double[]) this.f1632a.clone();
    }

    /* renamed from: b */
    public List m1710b() {
        ArrayList arrayList = new ArrayList(this.f1632a.length);
        int i7 = 0;
        while (true) {
            double[] dArr = this.f1632a;
            if (i7 >= dArr.length) {
                return arrayList;
            }
            arrayList.add(i7, Double.valueOf(dArr[i7]));
            i7++;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f1632a, ((C0464z0) obj).f1632a);
    }

    public int hashCode() {
        return Arrays.hashCode(this.f1632a);
    }
}
