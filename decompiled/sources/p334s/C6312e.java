package p334s;

import kotlin.jvm.internal.AbstractC5464g;
import p378x5.AbstractC7019j;

/* renamed from: s.e */
/* loaded from: classes.dex */
public final class C6312e {

    /* renamed from: a */
    public int[] f22865a;

    /* renamed from: b */
    public int f22866b;

    /* renamed from: c */
    public int f22867c;

    /* renamed from: d */
    public int f22868d;

    public C6312e() {
        this(0, 1, null);
    }

    /* renamed from: a */
    public final void m26432a(int i7) {
        int[] iArr = this.f22865a;
        int i8 = this.f22867c;
        iArr[i8] = i7;
        int i9 = this.f22868d & (i8 + 1);
        this.f22867c = i9;
        if (i9 == this.f22866b) {
            m26434c();
        }
    }

    /* renamed from: b */
    public final void m26433b() {
        this.f22867c = this.f22866b;
    }

    /* renamed from: c */
    public final void m26434c() {
        int[] iArr = this.f22865a;
        int length = iArr.length;
        int i7 = this.f22866b;
        int i8 = length - i7;
        int i9 = length << 1;
        if (i9 < 0) {
            throw new RuntimeException("Max array capacity exceeded");
        }
        int[] iArr2 = new int[i9];
        AbstractC7019j.m28795e(iArr, iArr2, 0, i7, length);
        AbstractC7019j.m28795e(this.f22865a, iArr2, i8, 0, this.f22866b);
        this.f22865a = iArr2;
        this.f22866b = 0;
        this.f22867c = length;
        this.f22868d = i9 - 1;
    }

    /* renamed from: d */
    public final boolean m26435d() {
        return this.f22866b == this.f22867c;
    }

    /* renamed from: e */
    public final int m26436e() {
        int i7 = this.f22866b;
        if (i7 == this.f22867c) {
            C6313f c6313f = C6313f.f22869a;
            throw new ArrayIndexOutOfBoundsException();
        }
        int i8 = this.f22865a[i7];
        this.f22866b = (i7 + 1) & this.f22868d;
        return i8;
    }

    public C6312e(int i7) {
        if (i7 < 1) {
            throw new IllegalArgumentException("capacity must be >= 1");
        }
        if (i7 > 1073741824) {
            throw new IllegalArgumentException("capacity must be <= 2^30");
        }
        i7 = Integer.bitCount(i7) != 1 ? Integer.highestOneBit(i7 - 1) << 1 : i7;
        this.f22868d = i7 - 1;
        this.f22865a = new int[i7];
    }

    public /* synthetic */ C6312e(int i7, int i8, AbstractC5464g abstractC5464g) {
        this((i8 & 1) != 0 ? 8 : i7);
    }
}
