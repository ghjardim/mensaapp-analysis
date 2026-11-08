package p022D0;

import org.apache.tika.utils.StringUtils;
import p171Y2.InterfaceC2924g;
import p178Z2.AbstractC2990D;
import p178Z2.AbstractC3033v;
import p232g0.C4304J;
import p259j0.AbstractC5330M;
import p259j0.AbstractC5346o;

/* renamed from: D0.m0 */
/* loaded from: classes.dex */
public final class C0165m0 {

    /* renamed from: d */
    public static final C0165m0 f683d = new C0165m0(new C4304J[0]);

    /* renamed from: e */
    public static final String f684e = AbstractC5330M.m21783x0(0);

    /* renamed from: a */
    public final int f685a;

    /* renamed from: b */
    public final AbstractC3033v f686b;

    /* renamed from: c */
    public int f687c;

    public C0165m0(C4304J... c4304jArr) {
        this.f686b = AbstractC3033v.m11049q(c4304jArr);
        this.f685a = c4304jArr.length;
        m656f();
    }

    /* renamed from: e */
    public static /* synthetic */ Integer m652e(C4304J c4304j) {
        return Integer.valueOf(c4304j.f14852c);
    }

    /* renamed from: b */
    public C4304J m653b(int i7) {
        return (C4304J) this.f686b.get(i7);
    }

    /* renamed from: c */
    public AbstractC3033v m654c() {
        return AbstractC3033v.m11048p(AbstractC2990D.m10791k(this.f686b, new InterfaceC2924g() { // from class: D0.l0
            @Override // p171Y2.InterfaceC2924g
            public final Object apply(Object obj) {
                Integer m652e;
                m652e = C0165m0.m652e((C4304J) obj);
                return m652e;
            }
        }));
    }

    /* renamed from: d */
    public int m655d(C4304J c4304j) {
        int indexOf = this.f686b.indexOf(c4304j);
        if (indexOf >= 0) {
            return indexOf;
        }
        return -1;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0165m0.class != obj.getClass()) {
            return false;
        }
        C0165m0 c0165m0 = (C0165m0) obj;
        return this.f685a == c0165m0.f685a && this.f686b.equals(c0165m0.f686b);
    }

    /* renamed from: f */
    public final void m656f() {
        int i7 = 0;
        while (i7 < this.f686b.size()) {
            int i8 = i7 + 1;
            for (int i9 = i8; i9 < this.f686b.size(); i9++) {
                if (((C4304J) this.f686b.get(i7)).equals(this.f686b.get(i9))) {
                    AbstractC5346o.m21863d("TrackGroupArray", StringUtils.EMPTY, new IllegalArgumentException("Multiple identical TrackGroups added to one TrackGroupArray."));
                }
            }
            i7 = i8;
        }
    }

    public int hashCode() {
        if (this.f687c == 0) {
            this.f687c = this.f686b.hashCode();
        }
        return this.f687c;
    }
}
