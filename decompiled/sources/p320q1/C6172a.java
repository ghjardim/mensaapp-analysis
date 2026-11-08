package p320q1;

import java.util.ArrayList;
import java.util.Collections;
import org.apache.tika.utils.StringUtils;
import p248i0.C4503a;
import p249i1.AbstractC4528s;
import p249i1.C4514e;
import p249i1.InterfaceC4520k;
import p249i1.InterfaceC4529t;
import p259j0.AbstractC5330M;
import p259j0.AbstractC5332a;
import p259j0.C5357z;
import p259j0.InterfaceC5338g;

/* renamed from: q1.a */
/* loaded from: classes.dex */
public final class C6172a implements InterfaceC4529t {

    /* renamed from: a */
    public final C5357z f22075a = new C5357z();

    /* renamed from: d */
    public static C4503a m25749d(C5357z c5357z, int i7) {
        CharSequence charSequence = null;
        C4503a.b bVar = null;
        while (i7 > 0) {
            AbstractC5332a.m21797b(i7 >= 8, "Incomplete vtt cue box header found.");
            int m21957p = c5357z.m21957p();
            int m21957p2 = c5357z.m21957p();
            int i8 = m21957p - 8;
            String m21689J = AbstractC5330M.m21689J(c5357z.m21946e(), c5357z.m21947f(), i8);
            c5357z.m21940U(i8);
            i7 = (i7 - 8) - i8;
            if (m21957p2 == 1937011815) {
                bVar = AbstractC6176e.m25806o(m21689J);
            } else if (m21957p2 == 1885436268) {
                charSequence = AbstractC6176e.m25808q(null, m21689J.trim(), Collections.emptyList());
            }
        }
        if (charSequence == null) {
            charSequence = StringUtils.EMPTY;
        }
        return bVar != null ? bVar.m19201o(charSequence).m19187a() : AbstractC6176e.m25803l(charSequence);
    }

    @Override // p249i1.InterfaceC4529t
    /* renamed from: a */
    public /* synthetic */ InterfaceC4520k mo19257a(byte[] bArr, int i7, int i8) {
        return AbstractC4528s.m19255a(this, bArr, i7, i8);
    }

    @Override // p249i1.InterfaceC4529t
    /* renamed from: b */
    public void mo19258b(byte[] bArr, int i7, int i8, InterfaceC4529t.b bVar, InterfaceC5338g interfaceC5338g) {
        this.f22075a.m21937R(bArr, i8 + i7);
        this.f22075a.m21939T(i7);
        ArrayList arrayList = new ArrayList();
        while (this.f22075a.m21942a() > 0) {
            AbstractC5332a.m21797b(this.f22075a.m21942a() >= 8, "Incomplete Mp4Webvtt Top Level box header found.");
            int m21957p = this.f22075a.m21957p();
            if (this.f22075a.m21957p() == 1987343459) {
                arrayList.add(m25749d(this.f22075a, m21957p - 8));
            } else {
                this.f22075a.m21940U(m21957p - 8);
            }
        }
        interfaceC5338g.accept(new C4514e(arrayList, -9223372036854775807L, -9223372036854775807L));
    }

    @Override // p249i1.InterfaceC4529t
    /* renamed from: c */
    public int mo19259c() {
        return 2;
    }

    @Override // p249i1.InterfaceC4529t
    public /* synthetic */ void reset() {
        AbstractC4528s.m19256b(this);
    }
}
