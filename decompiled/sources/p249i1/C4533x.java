package p249i1;

import java.io.EOFException;
import p078L0.AbstractC0860S;
import p078L0.InterfaceC0861T;
import p232g0.AbstractC4336z;
import p232g0.C4327q;
import p232g0.InterfaceC4319i;
import p249i1.InterfaceC4529t;
import p259j0.AbstractC5330M;
import p259j0.AbstractC5332a;
import p259j0.C5357z;
import p259j0.InterfaceC5338g;

/* renamed from: i1.x */
/* loaded from: classes.dex */
public final class C4533x implements InterfaceC0861T {

    /* renamed from: a */
    public final InterfaceC0861T f16185a;

    /* renamed from: b */
    public final InterfaceC4529t.a f16186b;

    /* renamed from: h */
    public InterfaceC4529t f16192h;

    /* renamed from: i */
    public C4327q f16193i;

    /* renamed from: c */
    public final C4513d f16187c = new C4513d();

    /* renamed from: e */
    public int f16189e = 0;

    /* renamed from: f */
    public int f16190f = 0;

    /* renamed from: g */
    public byte[] f16191g = AbstractC5330M.f18805f;

    /* renamed from: d */
    public final C5357z f16188d = new C5357z();

    public C4533x(InterfaceC0861T interfaceC0861T, InterfaceC4529t.a aVar) {
        this.f16185a = interfaceC0861T;
        this.f16186b = aVar;
    }

    @Override // p078L0.InterfaceC0861T
    /* renamed from: a */
    public /* synthetic */ int mo558a(InterfaceC4319i interfaceC4319i, int i7, boolean z6) {
        return AbstractC0860S.m3555a(this, interfaceC4319i, i7, z6);
    }

    @Override // p078L0.InterfaceC0861T
    /* renamed from: b */
    public void mo560b(C5357z c5357z, int i7, int i8) {
        if (this.f16192h == null) {
            this.f16185a.mo560b(c5357z, i7, i8);
            return;
        }
        m19265h(i7);
        c5357z.m21953l(this.f16191g, this.f16190f, i7);
        this.f16190f += i7;
    }

    @Override // p078L0.InterfaceC0861T
    /* renamed from: c */
    public void mo562c(final long j7, final int i7, int i8, int i9, InterfaceC0861T.a aVar) {
        if (this.f16192h == null) {
            this.f16185a.mo562c(j7, i7, i8, i9, aVar);
            return;
        }
        AbstractC5332a.m21797b(aVar == null, "DRM on subtitles is not supported");
        int i10 = (this.f16190f - i9) - i8;
        this.f16192h.mo19258b(this.f16191g, i10, i8, InterfaceC4529t.b.m19261b(), new InterfaceC5338g() { // from class: i1.w
            @Override // p259j0.InterfaceC5338g
            public final void accept(Object obj) {
                C4533x.this.m19266i(j7, i7, (C4514e) obj);
            }
        });
        int i11 = i10 + i8;
        this.f16189e = i11;
        if (i11 == this.f16190f) {
            this.f16189e = 0;
            this.f16190f = 0;
        }
    }

    @Override // p078L0.InterfaceC0861T
    /* renamed from: d */
    public /* synthetic */ void mo564d(C5357z c5357z, int i7) {
        AbstractC0860S.m3556b(this, c5357z, i7);
    }

    @Override // p078L0.InterfaceC0861T
    /* renamed from: e */
    public void mo566e(C4327q c4327q) {
        AbstractC5332a.m21800e(c4327q.f15138n);
        AbstractC5332a.m21796a(AbstractC4336z.m18418k(c4327q.f15138n) == 3);
        if (!c4327q.equals(this.f16193i)) {
            this.f16193i = c4327q;
            this.f16192h = this.f16186b.mo19226a(c4327q) ? this.f16186b.mo19227b(c4327q) : null;
        }
        if (this.f16192h == null) {
            this.f16185a.mo566e(c4327q);
        } else {
            this.f16185a.mo566e(c4327q.m18193a().m18264o0("application/x-media3-cues").m18238O(c4327q.f15138n).m18268s0(Long.MAX_VALUE).m18242S(this.f16186b.mo19228c(c4327q)).m18234K());
        }
    }

    @Override // p078L0.InterfaceC0861T
    /* renamed from: f */
    public int mo568f(InterfaceC4319i interfaceC4319i, int i7, boolean z6, int i8) {
        if (this.f16192h == null) {
            return this.f16185a.mo568f(interfaceC4319i, i7, z6, i8);
        }
        m19265h(i7);
        int read = interfaceC4319i.read(this.f16191g, this.f16190f, i7);
        if (read != -1) {
            this.f16190f += read;
            return read;
        }
        if (z6) {
            return -1;
        }
        throw new EOFException();
    }

    /* renamed from: h */
    public final void m19265h(int i7) {
        int length = this.f16191g.length;
        int i8 = this.f16190f;
        if (length - i8 >= i7) {
            return;
        }
        int i9 = i8 - this.f16189e;
        int max = Math.max(i9 * 2, i7 + i9);
        byte[] bArr = this.f16191g;
        byte[] bArr2 = max <= bArr.length ? bArr : new byte[max];
        System.arraycopy(bArr, this.f16189e, bArr2, 0, i9);
        this.f16189e = 0;
        this.f16190f = i9;
        this.f16191g = bArr2;
    }

    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public final void m19266i(C4514e c4514e, long j7, int i7) {
        AbstractC5332a.m21804i(this.f16193i);
        byte[] m19217a = this.f16187c.m19217a(c4514e.f16145a, c4514e.f16147c);
        this.f16188d.m21936Q(m19217a);
        this.f16185a.mo564d(this.f16188d, m19217a.length);
        long j8 = c4514e.f16146b;
        if (j8 == -9223372036854775807L) {
            AbstractC5332a.m21802g(this.f16193i.f15143s == Long.MAX_VALUE);
        } else {
            long j9 = this.f16193i.f15143s;
            j7 = j9 == Long.MAX_VALUE ? j7 + j8 : j8 + j9;
        }
        this.f16185a.mo562c(j7, i7, m19217a.length, 0, null);
    }

    /* renamed from: k */
    public void m19268k() {
        InterfaceC4529t interfaceC4529t = this.f16192h;
        if (interfaceC4529t != null) {
            interfaceC4529t.reset();
        }
    }
}
