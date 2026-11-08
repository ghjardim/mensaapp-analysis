package p029E0;

import p022D0.C0143b0;
import p029E0.InterfaceC0213f;
import p078L0.C0879n;
import p078L0.InterfaceC0861T;
import p259j0.AbstractC5346o;

/* renamed from: E0.c */
/* loaded from: classes.dex */
public final class C0210c implements InterfaceC0213f.b {

    /* renamed from: a */
    public final int[] f850a;

    /* renamed from: b */
    public final C0143b0[] f851b;

    public C0210c(int[] iArr, C0143b0[] c0143b0Arr) {
        this.f850a = iArr;
        this.f851b = c0143b0Arr;
    }

    /* renamed from: a */
    public int[] m856a() {
        int[] iArr = new int[this.f851b.length];
        int i7 = 0;
        while (true) {
            C0143b0[] c0143b0Arr = this.f851b;
            if (i7 >= c0143b0Arr.length) {
                return iArr;
            }
            iArr[i7] = c0143b0Arr[i7].m540H();
            i7++;
        }
    }

    @Override // p029E0.InterfaceC0213f.b
    /* renamed from: b */
    public InterfaceC0861T mo857b(int i7, int i8) {
        int i9 = 0;
        while (true) {
            int[] iArr = this.f850a;
            if (i9 >= iArr.length) {
                AbstractC5346o.m21862c("BaseMediaChunkOutput", "Unmatched track of type: " + i8);
                return new C0879n();
            }
            if (i8 == iArr[i9]) {
                return this.f851b[i9];
            }
            i9++;
        }
    }

    /* renamed from: c */
    public void m858c(long j7) {
        for (C0143b0 c0143b0 : this.f851b) {
            c0143b0.m561b0(j7);
        }
    }
}
