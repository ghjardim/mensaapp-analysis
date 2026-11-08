package p249i1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p078L0.AbstractC0882q;
import p078L0.C0850H;
import p078L0.C0854L;
import p078L0.InterfaceC0861T;
import p078L0.InterfaceC0883r;
import p078L0.InterfaceC0884s;
import p078L0.InterfaceC0885t;
import p203c3.AbstractC3577g;
import p232g0.C4295A;
import p232g0.C4327q;
import p249i1.InterfaceC4529t;
import p259j0.AbstractC5330M;
import p259j0.AbstractC5332a;
import p259j0.C5357z;
import p259j0.InterfaceC5338g;

/* renamed from: i1.o */
/* loaded from: classes.dex */
public class C4524o implements InterfaceC0883r {

    /* renamed from: a */
    public final InterfaceC4529t f16155a;

    /* renamed from: c */
    public final C4327q f16157c;

    /* renamed from: g */
    public InterfaceC0861T f16161g;

    /* renamed from: h */
    public int f16162h;

    /* renamed from: b */
    public final C4513d f16156b = new C4513d();

    /* renamed from: f */
    public byte[] f16160f = AbstractC5330M.f18805f;

    /* renamed from: e */
    public final C5357z f16159e = new C5357z();

    /* renamed from: d */
    public final List f16158d = new ArrayList();

    /* renamed from: i */
    public int f16163i = 0;

    /* renamed from: j */
    public long[] f16164j = AbstractC5330M.f18806g;

    /* renamed from: k */
    public long f16165k = -9223372036854775807L;

    /* renamed from: i1.o$b */
    public static class b implements Comparable {

        /* renamed from: a */
        public final long f16166a;

        /* renamed from: b */
        public final byte[] f16167b;

        @Override // java.lang.Comparable
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public int compareTo(b bVar) {
            return Long.compare(this.f16166a, bVar.f16166a);
        }

        public b(long j7, byte[] bArr) {
            this.f16166a = j7;
            this.f16167b = bArr;
        }
    }

    public C4524o(InterfaceC4529t interfaceC4529t, C4327q c4327q) {
        this.f16155a = interfaceC4529t;
        this.f16157c = c4327q.m18193a().m18264o0("application/x-media3-cues").m18238O(c4327q.f15138n).m18242S(interfaceC4529t.mo19259c()).m18234K();
    }

    @Override // p078L0.InterfaceC0883r
    /* renamed from: a */
    public void mo695a(long j7, long j8) {
        int i7 = this.f16163i;
        AbstractC5332a.m21802g((i7 == 0 || i7 == 5) ? false : true);
        this.f16165k = j8;
        if (this.f16163i == 2) {
            this.f16163i = 1;
        }
        if (this.f16163i == 4) {
            this.f16163i = 3;
        }
    }

    @Override // p078L0.InterfaceC0883r
    /* renamed from: b */
    public void mo696b(InterfaceC0885t interfaceC0885t) {
        AbstractC5332a.m21802g(this.f16163i == 0);
        InterfaceC0861T mo455b = interfaceC0885t.mo455b(0, 3);
        this.f16161g = mo455b;
        mo455b.mo566e(this.f16157c);
        interfaceC0885t.mo472q();
        interfaceC0885t.mo466j(new C0850H(new long[]{0}, new long[]{0}, -9223372036854775807L));
        this.f16163i = 1;
    }

    @Override // p078L0.InterfaceC0883r
    /* renamed from: d */
    public /* synthetic */ InterfaceC0883r mo697d() {
        return AbstractC0882q.m3688b(this);
    }

    /* renamed from: e */
    public final /* synthetic */ void m19244e(C4514e c4514e) {
        b bVar = new b(c4514e.f16146b, this.f16156b.m19217a(c4514e.f16145a, c4514e.f16147c));
        this.f16158d.add(bVar);
        long j7 = this.f16165k;
        if (j7 == -9223372036854775807L || c4514e.f16146b >= j7) {
            m19249m(bVar);
        }
    }

    /* renamed from: f */
    public final void m19245f() {
        try {
            long j7 = this.f16165k;
            this.f16155a.mo19258b(this.f16160f, 0, this.f16162h, j7 != -9223372036854775807L ? InterfaceC4529t.b.m19262c(j7) : InterfaceC4529t.b.m19261b(), new InterfaceC5338g() { // from class: i1.n
                @Override // p259j0.InterfaceC5338g
                public final void accept(Object obj) {
                    C4524o.this.m19244e((C4514e) obj);
                }
            });
            Collections.sort(this.f16158d);
            this.f16164j = new long[this.f16158d.size()];
            for (int i7 = 0; i7 < this.f16158d.size(); i7++) {
                this.f16164j[i7] = ((b) this.f16158d.get(i7)).f16166a;
            }
            this.f16160f = AbstractC5330M.f18805f;
        } catch (RuntimeException e7) {
            throw C4295A.m17943a("SubtitleParser failed.", e7);
        }
    }

    @Override // p078L0.InterfaceC0883r
    /* renamed from: g */
    public /* synthetic */ List mo698g() {
        return AbstractC0882q.m3687a(this);
    }

    @Override // p078L0.InterfaceC0883r
    /* renamed from: h */
    public int mo699h(InterfaceC0884s interfaceC0884s, C0854L c0854l) {
        int i7 = this.f16163i;
        AbstractC5332a.m21802g((i7 == 0 || i7 == 5) ? false : true);
        if (this.f16163i == 1) {
            int m14421d = interfaceC0884s.mo3511a() != -1 ? AbstractC3577g.m14421d(interfaceC0884s.mo3511a()) : 1024;
            if (m14421d > this.f16160f.length) {
                this.f16160f = new byte[m14421d];
            }
            this.f16162h = 0;
            this.f16163i = 2;
        }
        if (this.f16163i == 2 && m19246j(interfaceC0884s)) {
            m19245f();
            this.f16163i = 4;
        }
        if (this.f16163i == 3 && m19247k(interfaceC0884s)) {
            m19248l();
            this.f16163i = 4;
        }
        return this.f16163i == 4 ? -1 : 0;
    }

    @Override // p078L0.InterfaceC0883r
    /* renamed from: i */
    public boolean mo700i(InterfaceC0884s interfaceC0884s) {
        return true;
    }

    /* renamed from: j */
    public final boolean m19246j(InterfaceC0884s interfaceC0884s) {
        byte[] bArr = this.f16160f;
        if (bArr.length == this.f16162h) {
            this.f16160f = Arrays.copyOf(bArr, bArr.length + 1024);
        }
        byte[] bArr2 = this.f16160f;
        int i7 = this.f16162h;
        int read = interfaceC0884s.read(bArr2, i7, bArr2.length - i7);
        if (read != -1) {
            this.f16162h += read;
        }
        long mo3511a = interfaceC0884s.mo3511a();
        return (mo3511a != -1 && ((long) this.f16162h) == mo3511a) || read == -1;
    }

    /* renamed from: k */
    public final boolean m19247k(InterfaceC0884s interfaceC0884s) {
        return interfaceC0884s.mo3516l((interfaceC0884s.mo3511a() > (-1L) ? 1 : (interfaceC0884s.mo3511a() == (-1L) ? 0 : -1)) != 0 ? AbstractC3577g.m14421d(interfaceC0884s.mo3511a()) : 1024) == -1;
    }

    /* renamed from: l */
    public final void m19248l() {
        long j7 = this.f16165k;
        for (int m21744h = j7 == -9223372036854775807L ? 0 : AbstractC5330M.m21744h(this.f16164j, j7, true, true); m21744h < this.f16158d.size(); m21744h++) {
            m19249m((b) this.f16158d.get(m21744h));
        }
    }

    /* renamed from: m */
    public final void m19249m(b bVar) {
        AbstractC5332a.m21804i(this.f16161g);
        int length = bVar.f16167b.length;
        this.f16159e.m21936Q(bVar.f16167b);
        this.f16161g.mo564d(this.f16159e, length);
        this.f16161g.mo562c(bVar.f16166a, 1, length, 0, null);
    }

    @Override // p078L0.InterfaceC0883r
    public void release() {
        if (this.f16163i == 5) {
            return;
        }
        this.f16155a.reset();
        this.f16163i = 5;
    }
}
