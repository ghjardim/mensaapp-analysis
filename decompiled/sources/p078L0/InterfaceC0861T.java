package p078L0;

import java.util.Arrays;
import p232g0.C4327q;
import p232g0.InterfaceC4319i;
import p259j0.C5357z;

/* renamed from: L0.T */
/* loaded from: classes.dex */
public interface InterfaceC0861T {

    /* renamed from: L0.T$a */
    public static final class a {

        /* renamed from: a */
        public final int f2952a;

        /* renamed from: b */
        public final byte[] f2953b;

        /* renamed from: c */
        public final int f2954c;

        /* renamed from: d */
        public final int f2955d;

        public a(int i7, byte[] bArr, int i8, int i9) {
            this.f2952a = i7;
            this.f2953b = bArr;
            this.f2954c = i8;
            this.f2955d = i9;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return this.f2952a == aVar.f2952a && this.f2954c == aVar.f2954c && this.f2955d == aVar.f2955d && Arrays.equals(this.f2953b, aVar.f2953b);
        }

        public int hashCode() {
            return (((((this.f2952a * 31) + Arrays.hashCode(this.f2953b)) * 31) + this.f2954c) * 31) + this.f2955d;
        }
    }

    /* renamed from: a */
    int mo558a(InterfaceC4319i interfaceC4319i, int i7, boolean z6);

    /* renamed from: b */
    void mo560b(C5357z c5357z, int i7, int i8);

    /* renamed from: c */
    void mo562c(long j7, int i7, int i8, int i9, a aVar);

    /* renamed from: d */
    void mo564d(C5357z c5357z, int i7);

    /* renamed from: e */
    void mo566e(C4327q c4327q);

    /* renamed from: f */
    int mo568f(InterfaceC4319i interfaceC4319i, int i7, boolean z6, int i8);
}
