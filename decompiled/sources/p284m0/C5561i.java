package p284m0;

import java.nio.ByteBuffer;
import p232g0.AbstractC4332v;
import p232g0.C4327q;

/* renamed from: m0.i */
/* loaded from: classes.dex */
public class C5561i extends AbstractC5553a {

    /* renamed from: b */
    public C4327q f20075b;

    /* renamed from: c */
    public final C5555c f20076c;

    /* renamed from: d */
    public ByteBuffer f20077d;

    /* renamed from: e */
    public boolean f20078e;

    /* renamed from: f */
    public long f20079f;

    /* renamed from: n */
    public ByteBuffer f20080n;

    /* renamed from: o */
    public final int f20081o;

    /* renamed from: p */
    public final int f20082p;

    /* renamed from: m0.i$a */
    public static final class a extends IllegalStateException {

        /* renamed from: a */
        public final int f20083a;

        /* renamed from: b */
        public final int f20084b;

        public a(int i7, int i8) {
            super("Buffer too small (" + i7 + " < " + i8 + ")");
            this.f20083a = i7;
            this.f20084b = i8;
        }
    }

    static {
        AbstractC4332v.m18323a("media3.decoder");
    }

    public C5561i(int i7) {
        this(i7, 0);
    }

    /* renamed from: v */
    public static C5561i m23288v() {
        return new C5561i(0);
    }

    @Override // p284m0.AbstractC5553a
    /* renamed from: j */
    public void mo19253j() {
        super.mo19253j();
        ByteBuffer byteBuffer = this.f20077d;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
        ByteBuffer byteBuffer2 = this.f20080n;
        if (byteBuffer2 != null) {
            byteBuffer2.clear();
        }
        this.f20078e = false;
    }

    /* renamed from: r */
    public final ByteBuffer m23289r(int i7) {
        int i8 = this.f20081o;
        if (i8 == 1) {
            return ByteBuffer.allocate(i7);
        }
        if (i8 == 2) {
            return ByteBuffer.allocateDirect(i7);
        }
        ByteBuffer byteBuffer = this.f20077d;
        throw new a(byteBuffer == null ? 0 : byteBuffer.capacity(), i7);
    }

    /* renamed from: s */
    public void m23290s(int i7) {
        int i8 = i7 + this.f20082p;
        ByteBuffer byteBuffer = this.f20077d;
        if (byteBuffer == null) {
            this.f20077d = m23289r(i8);
            return;
        }
        int capacity = byteBuffer.capacity();
        int position = byteBuffer.position();
        int i9 = i8 + position;
        if (capacity >= i9) {
            this.f20077d = byteBuffer;
            return;
        }
        ByteBuffer m23289r = m23289r(i9);
        m23289r.order(byteBuffer.order());
        if (position > 0) {
            byteBuffer.flip();
            m23289r.put(byteBuffer);
        }
        this.f20077d = m23289r;
    }

    /* renamed from: t */
    public final void m23291t() {
        ByteBuffer byteBuffer = this.f20077d;
        if (byteBuffer != null) {
            byteBuffer.flip();
        }
        ByteBuffer byteBuffer2 = this.f20080n;
        if (byteBuffer2 != null) {
            byteBuffer2.flip();
        }
    }

    /* renamed from: u */
    public final boolean m23292u() {
        return m23273k(1073741824);
    }

    /* renamed from: w */
    public void m23293w(int i7) {
        ByteBuffer byteBuffer = this.f20080n;
        if (byteBuffer == null || byteBuffer.capacity() < i7) {
            this.f20080n = ByteBuffer.allocate(i7);
        } else {
            this.f20080n.clear();
        }
    }

    public C5561i(int i7, int i8) {
        this.f20076c = new C5555c();
        this.f20081o = i7;
        this.f20082p = i8;
    }
}
