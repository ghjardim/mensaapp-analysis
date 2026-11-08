package p320q1;

import android.text.TextUtils;
import java.util.ArrayList;
import p232g0.C4295A;
import p249i1.AbstractC4518i;
import p249i1.AbstractC4528s;
import p249i1.InterfaceC4520k;
import p249i1.InterfaceC4529t;
import p259j0.C5357z;
import p259j0.InterfaceC5338g;

/* renamed from: q1.g */
/* loaded from: classes.dex */
public final class C6178g implements InterfaceC4529t {

    /* renamed from: a */
    public final C5357z f22124a = new C5357z();

    /* renamed from: b */
    public final C6173b f22125b = new C6173b();

    /* renamed from: d */
    public static int m25830d(C5357z c5357z) {
        int i7 = -1;
        int i8 = 0;
        while (i7 == -1) {
            i8 = c5357z.m21947f();
            String m21959r = c5357z.m21959r();
            i7 = m21959r == null ? 0 : "STYLE".equals(m21959r) ? 2 : m21959r.startsWith("NOTE") ? 1 : 3;
        }
        c5357z.m21939T(i8);
        return i7;
    }

    /* renamed from: e */
    public static void m25831e(C5357z c5357z) {
        while (!TextUtils.isEmpty(c5357z.m21959r())) {
        }
    }

    @Override // p249i1.InterfaceC4529t
    /* renamed from: a */
    public /* synthetic */ InterfaceC4520k mo19257a(byte[] bArr, int i7, int i8) {
        return AbstractC4528s.m19255a(this, bArr, i7, i8);
    }

    @Override // p249i1.InterfaceC4529t
    /* renamed from: b */
    public void mo19258b(byte[] bArr, int i7, int i8, InterfaceC4529t.b bVar, InterfaceC5338g interfaceC5338g) {
        C6175d m25804m;
        this.f22124a.m21937R(bArr, i8 + i7);
        this.f22124a.m21939T(i7);
        ArrayList arrayList = new ArrayList();
        try {
            AbstractC6179h.m25836e(this.f22124a);
            while (!TextUtils.isEmpty(this.f22124a.m21959r())) {
            }
            ArrayList arrayList2 = new ArrayList();
            while (true) {
                int m25830d = m25830d(this.f22124a);
                if (m25830d == 0) {
                    AbstractC4518i.m19231c(new C6181j(arrayList2), bVar, interfaceC5338g);
                    return;
                }
                if (m25830d == 1) {
                    m25831e(this.f22124a);
                } else if (m25830d == 2) {
                    if (!arrayList2.isEmpty()) {
                        throw new IllegalArgumentException("A style block was found after the first cue.");
                    }
                    this.f22124a.m21959r();
                    arrayList.addAll(this.f22125b.m25763d(this.f22124a));
                } else if (m25830d == 3 && (m25804m = AbstractC6176e.m25804m(this.f22124a, arrayList)) != null) {
                    arrayList2.add(m25804m);
                }
            }
        } catch (C4295A e7) {
            throw new IllegalArgumentException(e7);
        }
    }

    @Override // p249i1.InterfaceC4529t
    /* renamed from: c */
    public int mo19259c() {
        return 1;
    }

    @Override // p249i1.InterfaceC4529t
    public /* synthetic */ void reset() {
        AbstractC4528s.m19256b(this);
    }
}
