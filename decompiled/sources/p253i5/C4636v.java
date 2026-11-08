package p253i5;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.InvalidMarkException;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.Queue;

/* renamed from: i5.v */
/* loaded from: classes2.dex */
public class C4636v extends AbstractC4596b {

    /* renamed from: f */
    public static final f f17265f = new a();

    /* renamed from: n */
    public static final f f17266n = new b();

    /* renamed from: o */
    public static final f f17267o = new c();

    /* renamed from: p */
    public static final f f17268p = new d();

    /* renamed from: q */
    public static final g f17269q = new e();

    /* renamed from: a */
    public final Deque f17270a;

    /* renamed from: b */
    public Deque f17271b;

    /* renamed from: c */
    public int f17272c;

    /* renamed from: d */
    public final Queue f17273d;

    /* renamed from: e */
    public boolean f17274e;

    /* renamed from: i5.v$a */
    public class a implements f {
        @Override // p253i5.C4636v.g
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public int mo20160a(InterfaceC4645z0 interfaceC4645z0, int i7, Void r32, int i8) {
            return interfaceC4645z0.readUnsignedByte();
        }
    }

    /* renamed from: i5.v$b */
    public class b implements f {
        @Override // p253i5.C4636v.g
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public int mo20160a(InterfaceC4645z0 interfaceC4645z0, int i7, Void r32, int i8) {
            interfaceC4645z0.skipBytes(i7);
            return 0;
        }
    }

    /* renamed from: i5.v$c */
    public class c implements f {
        @Override // p253i5.C4636v.g
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public int mo20160a(InterfaceC4645z0 interfaceC4645z0, int i7, byte[] bArr, int i8) {
            interfaceC4645z0.mo19333Q(bArr, i8, i7);
            return i8 + i7;
        }
    }

    /* renamed from: i5.v$d */
    public class d implements f {
        @Override // p253i5.C4636v.g
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public int mo20160a(InterfaceC4645z0 interfaceC4645z0, int i7, ByteBuffer byteBuffer, int i8) {
            int limit = byteBuffer.limit();
            byteBuffer.limit(byteBuffer.position() + i7);
            interfaceC4645z0.mo19338t0(byteBuffer);
            byteBuffer.limit(limit);
            return 0;
        }
    }

    /* renamed from: i5.v$e */
    public class e implements g {
        @Override // p253i5.C4636v.g
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public int mo20160a(InterfaceC4645z0 interfaceC4645z0, int i7, OutputStream outputStream, int i8) {
            interfaceC4645z0.mo19337h0(outputStream, i7);
            return 0;
        }
    }

    /* renamed from: i5.v$f */
    public interface f extends g {
    }

    /* renamed from: i5.v$g */
    public interface g {
        /* renamed from: a */
        int mo20160a(InterfaceC4645z0 interfaceC4645z0, int i7, Object obj, int i8);
    }

    public C4636v(int i7) {
        this.f17273d = new ArrayDeque(2);
        this.f17270a = new ArrayDeque(i7);
    }

    @Override // p253i5.InterfaceC4645z0
    /* renamed from: Q */
    public void mo19333Q(byte[] bArr, int i7, int i8) {
        m20159o(f17267o, i8, bArr, i7);
    }

    @Override // p253i5.AbstractC4596b, p253i5.InterfaceC4645z0
    /* renamed from: V */
    public void mo19334V() {
        if (this.f17271b == null) {
            this.f17271b = new ArrayDeque(Math.min(this.f17270a.size(), 16));
        }
        while (!this.f17271b.isEmpty()) {
            ((InterfaceC4645z0) this.f17271b.remove()).close();
        }
        this.f17274e = true;
        InterfaceC4645z0 interfaceC4645z0 = (InterfaceC4645z0) this.f17270a.peek();
        if (interfaceC4645z0 != null) {
            interfaceC4645z0.mo19334V();
        }
    }

    @Override // p253i5.InterfaceC4645z0
    /* renamed from: b */
    public int mo19335b() {
        return this.f17272c;
    }

    @Override // p253i5.AbstractC4596b, p253i5.InterfaceC4645z0, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        while (!this.f17270a.isEmpty()) {
            ((InterfaceC4645z0) this.f17270a.remove()).close();
        }
        if (this.f17271b != null) {
            while (!this.f17271b.isEmpty()) {
                ((InterfaceC4645z0) this.f17271b.remove()).close();
            }
        }
    }

    /* renamed from: d */
    public void m20154d(InterfaceC4645z0 interfaceC4645z0) {
        boolean z6 = this.f17274e && this.f17270a.isEmpty();
        m20157j(interfaceC4645z0);
        if (z6) {
            ((InterfaceC4645z0) this.f17270a.peek()).mo19334V();
        }
    }

    /* renamed from: g */
    public final void m20155g() {
        if (!this.f17274e) {
            ((InterfaceC4645z0) this.f17270a.remove()).close();
            return;
        }
        this.f17271b.add((InterfaceC4645z0) this.f17270a.remove());
        InterfaceC4645z0 interfaceC4645z0 = (InterfaceC4645z0) this.f17270a.peek();
        if (interfaceC4645z0 != null) {
            interfaceC4645z0.mo19334V();
        }
    }

    /* renamed from: h */
    public final void m20156h() {
        if (((InterfaceC4645z0) this.f17270a.peek()).mo19335b() == 0) {
            m20155g();
        }
    }

    @Override // p253i5.InterfaceC4645z0
    /* renamed from: h0 */
    public void mo19337h0(OutputStream outputStream, int i7) {
        m20158m(f17269q, i7, outputStream, 0);
    }

    /* renamed from: j */
    public final void m20157j(InterfaceC4645z0 interfaceC4645z0) {
        if (!(interfaceC4645z0 instanceof C4636v)) {
            this.f17270a.add(interfaceC4645z0);
            this.f17272c += interfaceC4645z0.mo19335b();
            return;
        }
        C4636v c4636v = (C4636v) interfaceC4645z0;
        while (!c4636v.f17270a.isEmpty()) {
            this.f17270a.add((InterfaceC4645z0) c4636v.f17270a.remove());
        }
        this.f17272c += c4636v.f17272c;
        c4636v.f17272c = 0;
        c4636v.close();
    }

    /* renamed from: m */
    public final int m20158m(g gVar, int i7, Object obj, int i8) {
        m19793a(i7);
        if (!this.f17270a.isEmpty()) {
            m20156h();
        }
        while (i7 > 0 && !this.f17270a.isEmpty()) {
            InterfaceC4645z0 interfaceC4645z0 = (InterfaceC4645z0) this.f17270a.peek();
            int min = Math.min(i7, interfaceC4645z0.mo19335b());
            i8 = gVar.mo20160a(interfaceC4645z0, min, obj, i8);
            i7 -= min;
            this.f17272c -= min;
            m20156h();
        }
        if (i7 <= 0) {
            return i8;
        }
        throw new AssertionError("Failed executing read operation");
    }

    @Override // p253i5.AbstractC4596b, p253i5.InterfaceC4645z0
    public boolean markSupported() {
        Iterator it = this.f17270a.iterator();
        while (it.hasNext()) {
            if (!((InterfaceC4645z0) it.next()).markSupported()) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: o */
    public final int m20159o(f fVar, int i7, Object obj, int i8) {
        try {
            return m20158m(fVar, i7, obj, i8);
        } catch (IOException e7) {
            throw new AssertionError(e7);
        }
    }

    @Override // p253i5.InterfaceC4645z0
    public int readUnsignedByte() {
        return m20159o(f17265f, 1, null, 0);
    }

    @Override // p253i5.AbstractC4596b, p253i5.InterfaceC4645z0
    public void reset() {
        if (!this.f17274e) {
            throw new InvalidMarkException();
        }
        InterfaceC4645z0 interfaceC4645z0 = (InterfaceC4645z0) this.f17270a.peek();
        if (interfaceC4645z0 != null) {
            int mo19335b = interfaceC4645z0.mo19335b();
            interfaceC4645z0.reset();
            this.f17272c += interfaceC4645z0.mo19335b() - mo19335b;
        }
        while (true) {
            InterfaceC4645z0 interfaceC4645z02 = (InterfaceC4645z0) this.f17271b.pollLast();
            if (interfaceC4645z02 == null) {
                return;
            }
            interfaceC4645z02.reset();
            this.f17270a.addFirst(interfaceC4645z02);
            this.f17272c += interfaceC4645z02.mo19335b();
        }
    }

    @Override // p253i5.InterfaceC4645z0
    public void skipBytes(int i7) {
        m20159o(f17266n, i7, null, 0);
    }

    @Override // p253i5.InterfaceC4645z0
    /* renamed from: t0 */
    public void mo19338t0(ByteBuffer byteBuffer) {
        m20159o(f17268p, byteBuffer.remaining(), byteBuffer, 0);
    }

    @Override // p253i5.InterfaceC4645z0
    /* renamed from: u */
    public InterfaceC4645z0 mo19339u(int i7) {
        InterfaceC4645z0 interfaceC4645z0;
        int i8;
        InterfaceC4645z0 interfaceC4645z02;
        if (i7 <= 0) {
            return AbstractC4546A0.m19327a();
        }
        m19793a(i7);
        this.f17272c -= i7;
        InterfaceC4645z0 interfaceC4645z03 = null;
        C4636v c4636v = null;
        while (true) {
            InterfaceC4645z0 interfaceC4645z04 = (InterfaceC4645z0) this.f17270a.peek();
            int mo19335b = interfaceC4645z04.mo19335b();
            if (mo19335b > i7) {
                interfaceC4645z02 = interfaceC4645z04.mo19339u(i7);
                i8 = 0;
            } else {
                if (this.f17274e) {
                    interfaceC4645z0 = interfaceC4645z04.mo19339u(mo19335b);
                    m20155g();
                } else {
                    interfaceC4645z0 = (InterfaceC4645z0) this.f17270a.poll();
                }
                InterfaceC4645z0 interfaceC4645z05 = interfaceC4645z0;
                i8 = i7 - mo19335b;
                interfaceC4645z02 = interfaceC4645z05;
            }
            if (interfaceC4645z03 == null) {
                interfaceC4645z03 = interfaceC4645z02;
            } else {
                if (c4636v == null) {
                    c4636v = new C4636v(i8 != 0 ? Math.min(this.f17270a.size() + 2, 16) : 2);
                    c4636v.m20154d(interfaceC4645z03);
                    interfaceC4645z03 = c4636v;
                }
                c4636v.m20154d(interfaceC4645z02);
            }
            if (i8 <= 0) {
                return interfaceC4645z03;
            }
            i7 = i8;
        }
    }

    public C4636v() {
        this.f17273d = new ArrayDeque(2);
        this.f17270a = new ArrayDeque();
    }
}
