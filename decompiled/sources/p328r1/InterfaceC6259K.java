package p328r1;

import android.util.SparseArray;
import java.util.Collections;
import java.util.List;
import org.apache.tika.utils.StringUtils;
import p078L0.InterfaceC0885t;
import p256j$.util.DesugarCollections;
import p259j0.C5322E;
import p259j0.C5357z;

/* renamed from: r1.K */
/* loaded from: classes.dex */
public interface InterfaceC6259K {

    /* renamed from: r1.K$a */
    public static final class a {

        /* renamed from: a */
        public final String f22457a;

        /* renamed from: b */
        public final int f22458b;

        /* renamed from: c */
        public final byte[] f22459c;

        public a(String str, int i7, byte[] bArr) {
            this.f22457a = str;
            this.f22458b = i7;
            this.f22459c = bArr;
        }
    }

    /* renamed from: r1.K$b */
    public static final class b {

        /* renamed from: a */
        public final int f22460a;

        /* renamed from: b */
        public final String f22461b;

        /* renamed from: c */
        public final int f22462c;

        /* renamed from: d */
        public final List f22463d;

        /* renamed from: e */
        public final byte[] f22464e;

        public b(int i7, String str, int i8, List list, byte[] bArr) {
            this.f22460a = i7;
            this.f22461b = str;
            this.f22462c = i8;
            this.f22463d = list == null ? Collections.emptyList() : DesugarCollections.unmodifiableList(list);
            this.f22464e = bArr;
        }

        /* renamed from: a */
        public int m26171a() {
            int i7 = this.f22462c;
            if (i7 != 2) {
                return i7 != 3 ? 0 : 512;
            }
            return 2048;
        }
    }

    /* renamed from: r1.K$c */
    public interface c {
        /* renamed from: a */
        InterfaceC6259K mo26172a(int i7, b bVar);

        /* renamed from: b */
        SparseArray mo26173b();
    }

    /* renamed from: r1.K$d */
    public static final class d {

        /* renamed from: a */
        public final String f22465a;

        /* renamed from: b */
        public final int f22466b;

        /* renamed from: c */
        public final int f22467c;

        /* renamed from: d */
        public int f22468d;

        /* renamed from: e */
        public String f22469e;

        public d(int i7, int i8) {
            this(Integer.MIN_VALUE, i7, i8);
        }

        /* renamed from: a */
        public void m26174a() {
            int i7 = this.f22468d;
            this.f22468d = i7 == Integer.MIN_VALUE ? this.f22466b : i7 + this.f22467c;
            this.f22469e = this.f22465a + this.f22468d;
        }

        /* renamed from: b */
        public String m26175b() {
            m26177d();
            return this.f22469e;
        }

        /* renamed from: c */
        public int m26176c() {
            m26177d();
            return this.f22468d;
        }

        /* renamed from: d */
        public final void m26177d() {
            if (this.f22468d == Integer.MIN_VALUE) {
                throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
            }
        }

        public d(int i7, int i8, int i9) {
            String str;
            if (i7 != Integer.MIN_VALUE) {
                str = i7 + "/";
            } else {
                str = StringUtils.EMPTY;
            }
            this.f22465a = str;
            this.f22466b = i8;
            this.f22467c = i9;
            this.f22468d = Integer.MIN_VALUE;
            this.f22469e = StringUtils.EMPTY;
        }
    }

    /* renamed from: a */
    void mo26133a(C5357z c5357z, int i7);

    /* renamed from: b */
    void mo26134b();

    /* renamed from: c */
    void mo26135c(C5322E c5322e, InterfaceC0885t interfaceC0885t, d dVar);
}
