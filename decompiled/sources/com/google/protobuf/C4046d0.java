package com.google.protobuf;

import com.google.protobuf.AbstractC4055i;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;

/* renamed from: com.google.protobuf.d0 */
/* loaded from: classes.dex */
public final class C4046d0 extends AbstractC4055i.h {

    /* renamed from: e */
    public final ByteBuffer f13362e;

    public C4046d0(ByteBuffer byteBuffer) {
        AbstractC4015C.m16184b(byteBuffer, "buffer");
        this.f13362e = byteBuffer.slice().order(ByteOrder.nativeOrder());
    }

    @Override // com.google.protobuf.AbstractC4055i
    /* renamed from: B */
    public AbstractC4055i mo16431B(int i7, int i8) {
        try {
            return new C4046d0(m16435O(i7, i8));
        } catch (ArrayIndexOutOfBoundsException e7) {
            throw e7;
        } catch (IndexOutOfBoundsException e8) {
            throw new ArrayIndexOutOfBoundsException(e8.getMessage());
        }
    }

    @Override // com.google.protobuf.AbstractC4055i
    /* renamed from: F */
    public String mo16432F(Charset charset) {
        byte[] m16504C;
        int length;
        int i7;
        if (this.f13362e.hasArray()) {
            m16504C = this.f13362e.array();
            i7 = this.f13362e.arrayOffset() + this.f13362e.position();
            length = this.f13362e.remaining();
        } else {
            m16504C = m16504C();
            length = m16504C.length;
            i7 = 0;
        }
        return new String(m16504C, i7, length, charset);
    }

    @Override // com.google.protobuf.AbstractC4055i
    /* renamed from: M */
    public void mo16433M(AbstractC4053h abstractC4053h) {
        abstractC4053h.mo16489a(this.f13362e.slice());
    }

    @Override // com.google.protobuf.AbstractC4055i.h
    /* renamed from: N */
    public boolean mo16434N(AbstractC4055i abstractC4055i, int i7, int i8) {
        return mo16431B(0, i8).equals(abstractC4055i.mo16431B(i7, i8 + i7));
    }

    /* renamed from: O */
    public final ByteBuffer m16435O(int i7, int i8) {
        if (i7 < this.f13362e.position() || i8 > this.f13362e.limit() || i7 > i8) {
            throw new IllegalArgumentException(String.format("Invalid indices [%d, %d]", Integer.valueOf(i7), Integer.valueOf(i8)));
        }
        ByteBuffer slice = this.f13362e.slice();
        AbstractC4019F.m16253b(slice, i7 - this.f13362e.position());
        AbstractC4019F.m16252a(slice, i8 - this.f13362e.position());
        return slice;
    }

    @Override // com.google.protobuf.AbstractC4055i
    /* renamed from: b */
    public ByteBuffer mo16436b() {
        return this.f13362e.asReadOnlyBuffer();
    }

    @Override // com.google.protobuf.AbstractC4055i
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC4055i)) {
            return false;
        }
        AbstractC4055i abstractC4055i = (AbstractC4055i) obj;
        if (size() != abstractC4055i.size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        return obj instanceof C4046d0 ? this.f13362e.equals(((C4046d0) obj).f13362e) : obj instanceof C4064m0 ? obj.equals(this) : this.f13362e.equals(abstractC4055i.mo16436b());
    }

    @Override // com.google.protobuf.AbstractC4055i
    /* renamed from: f */
    public byte mo16437f(int i7) {
        try {
            return this.f13362e.get(i7);
        } catch (ArrayIndexOutOfBoundsException e7) {
            throw e7;
        } catch (IndexOutOfBoundsException e8) {
            throw new ArrayIndexOutOfBoundsException(e8.getMessage());
        }
    }

    @Override // com.google.protobuf.AbstractC4055i
    /* renamed from: p */
    public void mo16438p(byte[] bArr, int i7, int i8, int i9) {
        ByteBuffer slice = this.f13362e.slice();
        AbstractC4019F.m16253b(slice, i7);
        slice.get(bArr, i8, i9);
    }

    @Override // com.google.protobuf.AbstractC4055i
    /* renamed from: r */
    public byte mo16439r(int i7) {
        return mo16437f(i7);
    }

    @Override // com.google.protobuf.AbstractC4055i
    public int size() {
        return this.f13362e.remaining();
    }

    @Override // com.google.protobuf.AbstractC4055i
    /* renamed from: t */
    public boolean mo16440t() {
        return AbstractC4012A0.m16120r(this.f13362e);
    }

    @Override // com.google.protobuf.AbstractC4055i
    /* renamed from: w */
    public AbstractC4057j mo16441w() {
        return AbstractC4057j.m16528j(this.f13362e, true);
    }

    @Override // com.google.protobuf.AbstractC4055i
    /* renamed from: x */
    public int mo16442x(int i7, int i8, int i9) {
        for (int i10 = i8; i10 < i8 + i9; i10++) {
            i7 = (i7 * 31) + this.f13362e.get(i10);
        }
        return i7;
    }

    @Override // com.google.protobuf.AbstractC4055i
    /* renamed from: y */
    public int mo16443y(int i7, int i8, int i9) {
        return AbstractC4012A0.m16123u(i7, this.f13362e, i8, i9 + i8);
    }
}
