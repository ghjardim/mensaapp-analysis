package p022D0;

import java.util.Arrays;
import java.util.Random;

/* renamed from: D0.e0 */
/* loaded from: classes.dex */
public interface InterfaceC0149e0 {

    /* renamed from: D0.e0$a */
    public static class a implements InterfaceC0149e0 {

        /* renamed from: a */
        public final Random f585a;

        /* renamed from: b */
        public final int[] f586b;

        /* renamed from: c */
        public final int[] f587c;

        public a(int i7) {
            this(i7, new Random());
        }

        /* renamed from: i */
        public static int[] m606i(int i7, Random random) {
            int[] iArr = new int[i7];
            int i8 = 0;
            while (i8 < i7) {
                int i9 = i8 + 1;
                int nextInt = random.nextInt(i9);
                iArr[i8] = iArr[nextInt];
                iArr[nextInt] = i8;
                i8 = i9;
            }
            return iArr;
        }

        @Override // p022D0.InterfaceC0149e0
        /* renamed from: a */
        public int mo598a() {
            return this.f586b.length;
        }

        @Override // p022D0.InterfaceC0149e0
        /* renamed from: b */
        public InterfaceC0149e0 mo599b(int i7, int i8) {
            int i9 = i8 - i7;
            int[] iArr = new int[this.f586b.length - i9];
            int i10 = 0;
            int i11 = 0;
            while (true) {
                int[] iArr2 = this.f586b;
                if (i10 >= iArr2.length) {
                    return new a(iArr, new Random(this.f585a.nextLong()));
                }
                int i12 = iArr2[i10];
                if (i12 < i7 || i12 >= i8) {
                    int i13 = i10 - i11;
                    if (i12 >= i7) {
                        i12 -= i9;
                    }
                    iArr[i13] = i12;
                } else {
                    i11++;
                }
                i10++;
            }
        }

        @Override // p022D0.InterfaceC0149e0
        /* renamed from: c */
        public int mo600c() {
            int[] iArr = this.f586b;
            if (iArr.length > 0) {
                return iArr[0];
            }
            return -1;
        }

        @Override // p022D0.InterfaceC0149e0
        /* renamed from: d */
        public int mo601d(int i7) {
            int i8 = this.f587c[i7] - 1;
            if (i8 >= 0) {
                return this.f586b[i8];
            }
            return -1;
        }

        @Override // p022D0.InterfaceC0149e0
        /* renamed from: e */
        public int mo602e(int i7) {
            int i8 = this.f587c[i7] + 1;
            int[] iArr = this.f586b;
            if (i8 < iArr.length) {
                return iArr[i8];
            }
            return -1;
        }

        @Override // p022D0.InterfaceC0149e0
        /* renamed from: f */
        public InterfaceC0149e0 mo603f(int i7, int i8) {
            int[] iArr = new int[i8];
            int[] iArr2 = new int[i8];
            int i9 = 0;
            int i10 = 0;
            while (i10 < i8) {
                iArr[i10] = this.f585a.nextInt(this.f586b.length + 1);
                int i11 = i10 + 1;
                int nextInt = this.f585a.nextInt(i11);
                iArr2[i10] = iArr2[nextInt];
                iArr2[nextInt] = i10 + i7;
                i10 = i11;
            }
            Arrays.sort(iArr);
            int[] iArr3 = new int[this.f586b.length + i8];
            int i12 = 0;
            int i13 = 0;
            while (true) {
                int[] iArr4 = this.f586b;
                if (i9 >= iArr4.length + i8) {
                    return new a(iArr3, new Random(this.f585a.nextLong()));
                }
                if (i12 >= i8 || i13 != iArr[i12]) {
                    int i14 = i13 + 1;
                    int i15 = iArr4[i13];
                    iArr3[i9] = i15;
                    if (i15 >= i7) {
                        iArr3[i9] = i15 + i8;
                    }
                    i13 = i14;
                } else {
                    iArr3[i9] = iArr2[i12];
                    i12++;
                }
                i9++;
            }
        }

        @Override // p022D0.InterfaceC0149e0
        /* renamed from: g */
        public int mo604g() {
            int[] iArr = this.f586b;
            if (iArr.length > 0) {
                return iArr[iArr.length - 1];
            }
            return -1;
        }

        @Override // p022D0.InterfaceC0149e0
        /* renamed from: h */
        public InterfaceC0149e0 mo605h() {
            return new a(0, new Random(this.f585a.nextLong()));
        }

        public a(int i7, Random random) {
            this(m606i(i7, random), random);
        }

        public a(int[] iArr, Random random) {
            this.f586b = iArr;
            this.f585a = random;
            this.f587c = new int[iArr.length];
            for (int i7 = 0; i7 < iArr.length; i7++) {
                this.f587c[iArr[i7]] = i7;
            }
        }
    }

    /* renamed from: a */
    int mo598a();

    /* renamed from: b */
    InterfaceC0149e0 mo599b(int i7, int i8);

    /* renamed from: c */
    int mo600c();

    /* renamed from: d */
    int mo601d(int i7);

    /* renamed from: e */
    int mo602e(int i7);

    /* renamed from: f */
    InterfaceC0149e0 mo603f(int i7, int i8);

    /* renamed from: g */
    int mo604g();

    /* renamed from: h */
    InterfaceC0149e0 mo605h();
}
