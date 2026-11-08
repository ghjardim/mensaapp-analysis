package p233g1;

import java.util.Arrays;
import p078L0.AbstractC0886u;
import p078L0.InterfaceC0884s;
import p259j0.AbstractC5332a;
import p259j0.C5357z;

/* renamed from: g1.e */
/* loaded from: classes.dex */
public final class C4341e {

    /* renamed from: a */
    public final C4342f f15461a = new C4342f();

    /* renamed from: b */
    public final C5357z f15462b = new C5357z(new byte[65025], 0);

    /* renamed from: c */
    public int f15463c = -1;

    /* renamed from: d */
    public int f15464d;

    /* renamed from: e */
    public boolean f15465e;

    /* renamed from: a */
    public final int m18451a(int i7) {
        int i8;
        int i9 = 0;
        this.f15464d = 0;
        do {
            int i10 = this.f15464d;
            int i11 = i7 + i10;
            C4342f c4342f = this.f15461a;
            if (i11 >= c4342f.f15472g) {
                break;
            }
            int[] iArr = c4342f.f15475j;
            this.f15464d = i10 + 1;
            i8 = iArr[i10 + i7];
            i9 += i8;
        } while (i8 == 255);
        return i9;
    }

    /* renamed from: b */
    public C4342f m18452b() {
        return this.f15461a;
    }

    /* renamed from: c */
    public C5357z m18453c() {
        return this.f15462b;
    }

    /* renamed from: d */
    public boolean m18454d(InterfaceC0884s interfaceC0884s) {
        int i7;
        AbstractC5332a.m21802g(interfaceC0884s != null);
        if (this.f15465e) {
            this.f15465e = false;
            this.f15462b.m21935P(0);
        }
        while (!this.f15465e) {
            if (this.f15463c < 0) {
                if (!this.f15461a.m18459c(interfaceC0884s) || !this.f15461a.m18457a(interfaceC0884s, true)) {
                    return false;
                }
                C4342f c4342f = this.f15461a;
                int i8 = c4342f.f15473h;
                if ((c4342f.f15467b & 1) == 1 && this.f15462b.m21948g() == 0) {
                    i8 += m18451a(0);
                    i7 = this.f15464d;
                } else {
                    i7 = 0;
                }
                if (!AbstractC0886u.m3693e(interfaceC0884s, i8)) {
                    return false;
                }
                this.f15463c = i7;
            }
            int m18451a = m18451a(this.f15463c);
            int i9 = this.f15463c + this.f15464d;
            if (m18451a > 0) {
                C5357z c5357z = this.f15462b;
                c5357z.m21944c(c5357z.m21948g() + m18451a);
                if (!AbstractC0886u.m3692d(interfaceC0884s, this.f15462b.m21946e(), this.f15462b.m21948g(), m18451a)) {
                    return false;
                }
                C5357z c5357z2 = this.f15462b;
                c5357z2.m21938S(c5357z2.m21948g() + m18451a);
                this.f15465e = this.f15461a.f15475j[i9 + (-1)] != 255;
            }
            if (i9 == this.f15461a.f15472g) {
                i9 = -1;
            }
            this.f15463c = i9;
        }
        return true;
    }

    /* renamed from: e */
    public void m18455e() {
        this.f15461a.m18458b();
        this.f15462b.m21935P(0);
        this.f15463c = -1;
        this.f15465e = false;
    }

    /* renamed from: f */
    public void m18456f() {
        if (this.f15462b.m21946e().length == 65025) {
            return;
        }
        C5357z c5357z = this.f15462b;
        c5357z.m21937R(Arrays.copyOf(c5357z.m21946e(), Math.max(65025, this.f15462b.m21948g())), this.f15462b.m21948g());
    }
}
