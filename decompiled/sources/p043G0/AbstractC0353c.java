package p043G0;

import android.os.SystemClock;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import p029E0.AbstractC0212e;
import p232g0.C4304J;
import p232g0.C4327q;
import p259j0.AbstractC5330M;
import p259j0.AbstractC5332a;

/* renamed from: G0.c */
/* loaded from: classes.dex */
public abstract class AbstractC0353c implements InterfaceC0375y {

    /* renamed from: a */
    public final C4304J f1332a;

    /* renamed from: b */
    public final int f1333b;

    /* renamed from: c */
    public final int[] f1334c;

    /* renamed from: d */
    public final int f1335d;

    /* renamed from: e */
    public final C4327q[] f1336e;

    /* renamed from: f */
    public final long[] f1337f;

    /* renamed from: g */
    public int f1338g;

    public AbstractC0353c(C4304J c4304j, int... iArr) {
        this(c4304j, iArr, 0);
    }

    /* renamed from: g */
    public static /* synthetic */ int m1404g(C4327q c4327q, C4327q c4327q2) {
        return c4327q2.f15133i - c4327q.f15133i;
    }

    @Override // p043G0.InterfaceC0347B
    /* renamed from: a */
    public final C4304J mo389a() {
        return this.f1332a;
    }

    @Override // p043G0.InterfaceC0347B
    /* renamed from: b */
    public final C4327q mo390b(int i7) {
        return this.f1336e[i7];
    }

    @Override // p043G0.InterfaceC0347B
    /* renamed from: c */
    public final int mo391c(int i7) {
        return this.f1334c[i7];
    }

    @Override // p043G0.InterfaceC0347B
    /* renamed from: d */
    public final int mo392d(C4327q c4327q) {
        for (int i7 = 0; i7 < this.f1333b; i7++) {
            if (this.f1336e[i7] == c4327q) {
                return i7;
            }
        }
        return -1;
    }

    @Override // p043G0.InterfaceC0347B
    /* renamed from: e */
    public final int mo393e(int i7) {
        for (int i8 = 0; i8 < this.f1333b; i8++) {
            if (this.f1334c[i8] == i7) {
                return i8;
            }
        }
        return -1;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AbstractC0353c abstractC0353c = (AbstractC0353c) obj;
        return this.f1332a.equals(abstractC0353c.f1332a) && Arrays.equals(this.f1334c, abstractC0353c.f1334c);
    }

    public int hashCode() {
        if (this.f1338g == 0) {
            this.f1338g = (System.identityHashCode(this.f1332a) * 31) + Arrays.hashCode(this.f1334c);
        }
        return this.f1338g;
    }

    @Override // p043G0.InterfaceC0375y
    /* renamed from: i */
    public boolean mo395i(int i7, long j7) {
        return this.f1337f[i7] > j7;
    }

    @Override // p043G0.InterfaceC0375y
    /* renamed from: j */
    public /* synthetic */ boolean mo396j(long j7, AbstractC0212e abstractC0212e, List list) {
        return AbstractC0374x.m1527d(this, j7, abstractC0212e, list);
    }

    @Override // p043G0.InterfaceC0375y
    /* renamed from: l */
    public /* synthetic */ void mo398l(boolean z6) {
        AbstractC0374x.m1525b(this, z6);
    }

    @Override // p043G0.InterfaceC0347B
    public final int length() {
        return this.f1334c.length;
    }

    @Override // p043G0.InterfaceC0375y
    /* renamed from: o */
    public int mo401o(long j7, List list) {
        return list.size();
    }

    @Override // p043G0.InterfaceC0375y
    /* renamed from: p */
    public final int mo402p() {
        return this.f1334c[mo397k()];
    }

    @Override // p043G0.InterfaceC0375y
    /* renamed from: q */
    public final C4327q mo403q() {
        return this.f1336e[mo397k()];
    }

    @Override // p043G0.InterfaceC0375y
    /* renamed from: s */
    public boolean mo405s(int i7, long j7) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        boolean mo395i = mo395i(i7, elapsedRealtime);
        int i8 = 0;
        while (i8 < this.f1333b && !mo395i) {
            mo395i = (i8 == i7 || mo395i(i8, elapsedRealtime)) ? false : true;
            i8++;
        }
        if (!mo395i) {
            return false;
        }
        long[] jArr = this.f1337f;
        jArr[i7] = Math.max(jArr[i7], AbstractC5330M.m21726b(elapsedRealtime, j7, Long.MAX_VALUE));
        return true;
    }

    @Override // p043G0.InterfaceC0375y
    /* renamed from: v */
    public /* synthetic */ void mo408v() {
        AbstractC0374x.m1524a(this);
    }

    @Override // p043G0.InterfaceC0375y
    /* renamed from: w */
    public /* synthetic */ void mo409w() {
        AbstractC0374x.m1526c(this);
    }

    public AbstractC0353c(C4304J c4304j, int[] iArr, int i7) {
        int i8 = 0;
        AbstractC5332a.m21802g(iArr.length > 0);
        this.f1335d = i7;
        this.f1332a = (C4304J) AbstractC5332a.m21800e(c4304j);
        int length = iArr.length;
        this.f1333b = length;
        this.f1336e = new C4327q[length];
        for (int i9 = 0; i9 < iArr.length; i9++) {
            this.f1336e[i9] = c4304j.m18064a(iArr[i9]);
        }
        Arrays.sort(this.f1336e, new Comparator() { // from class: G0.b
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int m1404g;
                m1404g = AbstractC0353c.m1404g((C4327q) obj, (C4327q) obj2);
                return m1404g;
            }
        });
        this.f1334c = new int[this.f1333b];
        while (true) {
            int i10 = this.f1333b;
            if (i8 >= i10) {
                this.f1337f = new long[i10];
                return;
            } else {
                this.f1334c[i8] = c4304j.m18065b(this.f1336e[i8]);
                i8++;
            }
        }
    }

    @Override // p043G0.InterfaceC0375y
    /* renamed from: h */
    public void mo394h() {
    }

    @Override // p043G0.InterfaceC0375y
    /* renamed from: m */
    public void mo399m() {
    }

    @Override // p043G0.InterfaceC0375y
    /* renamed from: t */
    public void mo406t(float f7) {
    }
}
