package com.google.protobuf;

import com.google.protobuf.AbstractC4012A0;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: com.google.protobuf.l */
/* loaded from: classes.dex */
public abstract class AbstractC4061l extends AbstractC4053h {

    /* renamed from: c */
    public static final Logger f13452c = Logger.getLogger(AbstractC4061l.class.getName());

    /* renamed from: d */
    public static final boolean f13453d = AbstractC4090z0.m17089I();

    /* renamed from: a */
    public C4063m f13454a;

    /* renamed from: b */
    public boolean f13455b;

    /* renamed from: com.google.protobuf.l$b */
    public static abstract class b extends AbstractC4061l {

        /* renamed from: e */
        public final byte[] f13456e;

        /* renamed from: f */
        public final int f13457f;

        /* renamed from: g */
        public int f13458g;

        /* renamed from: h */
        public int f13459h;

        public b(int i7) {
            super();
            if (i7 < 0) {
                throw new IllegalArgumentException("bufferSize must be >= 0");
            }
            byte[] bArr = new byte[Math.max(i7, 20)];
            this.f13456e = bArr;
            this.f13457f = bArr.length;
        }

        /* renamed from: W0 */
        public final void m16780W0(byte b7) {
            byte[] bArr = this.f13456e;
            int i7 = this.f13458g;
            this.f13458g = i7 + 1;
            bArr[i7] = b7;
            this.f13459h++;
        }

        /* renamed from: X0 */
        public final void m16781X0(int i7) {
            byte[] bArr = this.f13456e;
            int i8 = this.f13458g;
            int i9 = i8 + 1;
            this.f13458g = i9;
            bArr[i8] = (byte) (i7 & 255);
            int i10 = i8 + 2;
            this.f13458g = i10;
            bArr[i9] = (byte) ((i7 >> 8) & 255);
            int i11 = i8 + 3;
            this.f13458g = i11;
            bArr[i10] = (byte) ((i7 >> 16) & 255);
            this.f13458g = i8 + 4;
            bArr[i11] = (byte) ((i7 >> 24) & 255);
            this.f13459h += 4;
        }

        /* renamed from: Y0 */
        public final void m16782Y0(long j7) {
            byte[] bArr = this.f13456e;
            int i7 = this.f13458g;
            int i8 = i7 + 1;
            this.f13458g = i8;
            bArr[i7] = (byte) (j7 & 255);
            int i9 = i7 + 2;
            this.f13458g = i9;
            bArr[i8] = (byte) ((j7 >> 8) & 255);
            int i10 = i7 + 3;
            this.f13458g = i10;
            bArr[i9] = (byte) ((j7 >> 16) & 255);
            int i11 = i7 + 4;
            this.f13458g = i11;
            bArr[i10] = (byte) (255 & (j7 >> 24));
            int i12 = i7 + 5;
            this.f13458g = i12;
            bArr[i11] = (byte) (((int) (j7 >> 32)) & 255);
            int i13 = i7 + 6;
            this.f13458g = i13;
            bArr[i12] = (byte) (((int) (j7 >> 40)) & 255);
            int i14 = i7 + 7;
            this.f13458g = i14;
            bArr[i13] = (byte) (((int) (j7 >> 48)) & 255);
            this.f13458g = i7 + 8;
            bArr[i14] = (byte) (((int) (j7 >> 56)) & 255);
            this.f13459h += 8;
        }

        /* renamed from: Z0 */
        public final void m16783Z0(int i7) {
            if (i7 >= 0) {
                m16785b1(i7);
            } else {
                m16786c1(i7);
            }
        }

        /* renamed from: a1 */
        public final void m16784a1(int i7, int i8) {
            m16785b1(AbstractC4014B0.m16180c(i7, i8));
        }

        /* renamed from: b1 */
        public final void m16785b1(int i7) {
            if (!AbstractC4061l.f13453d) {
                while ((i7 & (-128)) != 0) {
                    byte[] bArr = this.f13456e;
                    int i8 = this.f13458g;
                    this.f13458g = i8 + 1;
                    bArr[i8] = (byte) ((i7 & 127) | 128);
                    this.f13459h++;
                    i7 >>>= 7;
                }
                byte[] bArr2 = this.f13456e;
                int i9 = this.f13458g;
                this.f13458g = i9 + 1;
                bArr2[i9] = (byte) i7;
                this.f13459h++;
                return;
            }
            long j7 = this.f13458g;
            while ((i7 & (-128)) != 0) {
                byte[] bArr3 = this.f13456e;
                int i10 = this.f13458g;
                this.f13458g = i10 + 1;
                AbstractC4090z0.m17095O(bArr3, i10, (byte) ((i7 & 127) | 128));
                i7 >>>= 7;
            }
            byte[] bArr4 = this.f13456e;
            int i11 = this.f13458g;
            this.f13458g = i11 + 1;
            AbstractC4090z0.m17095O(bArr4, i11, (byte) i7);
            this.f13459h += (int) (this.f13458g - j7);
        }

        /* renamed from: c1 */
        public final void m16786c1(long j7) {
            if (!AbstractC4061l.f13453d) {
                while ((j7 & (-128)) != 0) {
                    byte[] bArr = this.f13456e;
                    int i7 = this.f13458g;
                    this.f13458g = i7 + 1;
                    bArr[i7] = (byte) ((((int) j7) & 127) | 128);
                    this.f13459h++;
                    j7 >>>= 7;
                }
                byte[] bArr2 = this.f13456e;
                int i8 = this.f13458g;
                this.f13458g = i8 + 1;
                bArr2[i8] = (byte) j7;
                this.f13459h++;
                return;
            }
            long j8 = this.f13458g;
            while ((j7 & (-128)) != 0) {
                byte[] bArr3 = this.f13456e;
                int i9 = this.f13458g;
                this.f13458g = i9 + 1;
                AbstractC4090z0.m17095O(bArr3, i9, (byte) ((((int) j7) & 127) | 128));
                j7 >>>= 7;
            }
            byte[] bArr4 = this.f13456e;
            int i10 = this.f13458g;
            this.f13458g = i10 + 1;
            AbstractC4090z0.m17095O(bArr4, i10, (byte) j7);
            this.f13459h += (int) (this.f13458g - j8);
        }

        @Override // com.google.protobuf.AbstractC4061l
        /* renamed from: d0 */
        public final int mo16757d0() {
            throw new UnsupportedOperationException("spaceLeft() can only be called on CodedOutputStreams that are writing to a flat array or ByteBuffer.");
        }
    }

    /* renamed from: com.google.protobuf.l$c */
    public static class c extends AbstractC4061l {

        /* renamed from: e */
        public final byte[] f13460e;

        /* renamed from: f */
        public final int f13461f;

        /* renamed from: g */
        public final int f13462g;

        /* renamed from: h */
        public int f13463h;

        public c(byte[] bArr, int i7, int i8) {
            super();
            if (bArr == null) {
                throw new NullPointerException("buffer");
            }
            int i9 = i7 + i8;
            if ((i7 | i8 | (bArr.length - i9)) < 0) {
                throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), Integer.valueOf(i7), Integer.valueOf(i8)));
            }
            this.f13460e = bArr;
            this.f13461f = i7;
            this.f13463h = i7;
            this.f13462g = i9;
        }

        @Override // com.google.protobuf.AbstractC4061l
        /* renamed from: A0 */
        public final void mo16731A0(int i7) {
            if (i7 >= 0) {
                mo16750T0(i7);
            } else {
                mo16752V0(i7);
            }
        }

        @Override // com.google.protobuf.AbstractC4061l
        /* renamed from: D0 */
        public final void mo16734D0(int i7, InterfaceC4034V interfaceC4034V, InterfaceC4066n0 interfaceC4066n0) {
            mo16748R0(i7, 2);
            mo16750T0(((AbstractC4039a) interfaceC4034V).mo16413l(interfaceC4066n0));
            interfaceC4066n0.mo16377g(interfaceC4034V, this.f13454a);
        }

        @Override // com.google.protobuf.AbstractC4061l
        /* renamed from: E0 */
        public final void mo16735E0(InterfaceC4034V interfaceC4034V) {
            mo16750T0(interfaceC4034V.mo16315b());
            interfaceC4034V.mo16318f(this);
        }

        @Override // com.google.protobuf.AbstractC4061l
        /* renamed from: F0 */
        public final void mo16736F0(int i7, InterfaceC4034V interfaceC4034V) {
            mo16748R0(1, 3);
            mo16749S0(2, i7);
            m16789Y0(3, interfaceC4034V);
            mo16748R0(1, 4);
        }

        @Override // com.google.protobuf.AbstractC4061l
        /* renamed from: G0 */
        public final void mo16737G0(int i7, AbstractC4055i abstractC4055i) {
            mo16748R0(1, 3);
            mo16749S0(2, i7);
            mo16763j0(3, abstractC4055i);
            mo16748R0(1, 4);
        }

        @Override // com.google.protobuf.AbstractC4061l
        /* renamed from: P0 */
        public final void mo16746P0(int i7, String str) {
            mo16748R0(i7, 2);
            mo16747Q0(str);
        }

        @Override // com.google.protobuf.AbstractC4061l
        /* renamed from: Q0 */
        public final void mo16747Q0(String str) {
            int i7 = this.f13463h;
            try {
                int m16700S = AbstractC4061l.m16700S(str.length() * 3);
                int m16700S2 = AbstractC4061l.m16700S(str.length());
                if (m16700S2 == m16700S) {
                    int i8 = i7 + m16700S2;
                    this.f13463h = i8;
                    int m16111i = AbstractC4012A0.m16111i(str, this.f13460e, i8, mo16757d0());
                    this.f13463h = i7;
                    mo16750T0((m16111i - i7) - m16700S2);
                    this.f13463h = m16111i;
                } else {
                    mo16750T0(AbstractC4012A0.m16112j(str));
                    this.f13463h = AbstractC4012A0.m16111i(str, this.f13460e, this.f13463h, mo16757d0());
                }
            } catch (AbstractC4012A0.d e7) {
                this.f13463h = i7;
                m16754Y(str, e7);
            } catch (IndexOutOfBoundsException e8) {
                throw new d(e8);
            }
        }

        @Override // com.google.protobuf.AbstractC4061l
        /* renamed from: R0 */
        public final void mo16748R0(int i7, int i8) {
            mo16750T0(AbstractC4014B0.m16180c(i7, i8));
        }

        @Override // com.google.protobuf.AbstractC4061l
        /* renamed from: S0 */
        public final void mo16749S0(int i7, int i8) {
            mo16748R0(i7, 0);
            mo16750T0(i8);
        }

        @Override // com.google.protobuf.AbstractC4061l
        /* renamed from: T0 */
        public final void mo16750T0(int i7) {
            while ((i7 & (-128)) != 0) {
                try {
                    byte[] bArr = this.f13460e;
                    int i8 = this.f13463h;
                    this.f13463h = i8 + 1;
                    bArr[i8] = (byte) ((i7 & 127) | 128);
                    i7 >>>= 7;
                } catch (IndexOutOfBoundsException e7) {
                    throw new d(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f13463h), Integer.valueOf(this.f13462g), 1), e7);
                }
            }
            byte[] bArr2 = this.f13460e;
            int i9 = this.f13463h;
            this.f13463h = i9 + 1;
            bArr2[i9] = (byte) i7;
        }

        @Override // com.google.protobuf.AbstractC4061l
        /* renamed from: U0 */
        public final void mo16751U0(int i7, long j7) {
            mo16748R0(i7, 0);
            mo16752V0(j7);
        }

        @Override // com.google.protobuf.AbstractC4061l
        /* renamed from: V0 */
        public final void mo16752V0(long j7) {
            if (AbstractC4061l.f13453d && mo16757d0() >= 10) {
                while ((j7 & (-128)) != 0) {
                    byte[] bArr = this.f13460e;
                    int i7 = this.f13463h;
                    this.f13463h = i7 + 1;
                    AbstractC4090z0.m17095O(bArr, i7, (byte) ((((int) j7) & 127) | 128));
                    j7 >>>= 7;
                }
                byte[] bArr2 = this.f13460e;
                int i8 = this.f13463h;
                this.f13463h = 1 + i8;
                AbstractC4090z0.m17095O(bArr2, i8, (byte) j7);
                return;
            }
            while ((j7 & (-128)) != 0) {
                try {
                    byte[] bArr3 = this.f13460e;
                    int i9 = this.f13463h;
                    this.f13463h = i9 + 1;
                    bArr3[i9] = (byte) ((((int) j7) & 127) | 128);
                    j7 >>>= 7;
                } catch (IndexOutOfBoundsException e7) {
                    throw new d(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f13463h), Integer.valueOf(this.f13462g), 1), e7);
                }
            }
            byte[] bArr4 = this.f13460e;
            int i10 = this.f13463h;
            this.f13463h = i10 + 1;
            bArr4[i10] = (byte) j7;
        }

        /* renamed from: W0 */
        public final void m16787W0(ByteBuffer byteBuffer) {
            int remaining = byteBuffer.remaining();
            try {
                byteBuffer.get(this.f13460e, this.f13463h, remaining);
                this.f13463h += remaining;
            } catch (IndexOutOfBoundsException e7) {
                throw new d(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f13463h), Integer.valueOf(this.f13462g), Integer.valueOf(remaining)), e7);
            }
        }

        @Override // com.google.protobuf.AbstractC4061l
        /* renamed from: X */
        public void mo16753X() {
        }

        /* renamed from: X0 */
        public final void m16788X0(byte[] bArr, int i7, int i8) {
            try {
                System.arraycopy(bArr, i7, this.f13460e, this.f13463h, i8);
                this.f13463h += i8;
            } catch (IndexOutOfBoundsException e7) {
                throw new d(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f13463h), Integer.valueOf(this.f13462g), Integer.valueOf(i8)), e7);
            }
        }

        /* renamed from: Y0 */
        public final void m16789Y0(int i7, InterfaceC4034V interfaceC4034V) {
            mo16748R0(i7, 2);
            mo16735E0(interfaceC4034V);
        }

        @Override // com.google.protobuf.AbstractC4053h
        /* renamed from: a */
        public final void mo16489a(ByteBuffer byteBuffer) {
            m16787W0(byteBuffer);
        }

        @Override // com.google.protobuf.AbstractC4061l, com.google.protobuf.AbstractC4053h
        /* renamed from: b */
        public final void mo16490b(byte[] bArr, int i7, int i8) {
            m16788X0(bArr, i7, i8);
        }

        @Override // com.google.protobuf.AbstractC4061l
        /* renamed from: d0 */
        public final int mo16757d0() {
            return this.f13462g - this.f13463h;
        }

        @Override // com.google.protobuf.AbstractC4061l
        /* renamed from: e0 */
        public final void mo16758e0(byte b7) {
            try {
                byte[] bArr = this.f13460e;
                int i7 = this.f13463h;
                this.f13463h = i7 + 1;
                bArr[i7] = b7;
            } catch (IndexOutOfBoundsException e7) {
                throw new d(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f13463h), Integer.valueOf(this.f13462g), 1), e7);
            }
        }

        @Override // com.google.protobuf.AbstractC4061l
        /* renamed from: f0 */
        public final void mo16759f0(int i7, boolean z6) {
            mo16748R0(i7, 0);
            mo16758e0(z6 ? (byte) 1 : (byte) 0);
        }

        @Override // com.google.protobuf.AbstractC4061l
        /* renamed from: i0 */
        public final void mo16762i0(byte[] bArr, int i7, int i8) {
            mo16750T0(i8);
            m16788X0(bArr, i7, i8);
        }

        @Override // com.google.protobuf.AbstractC4061l
        /* renamed from: j0 */
        public final void mo16763j0(int i7, AbstractC4055i abstractC4055i) {
            mo16748R0(i7, 2);
            mo16764k0(abstractC4055i);
        }

        @Override // com.google.protobuf.AbstractC4061l
        /* renamed from: k0 */
        public final void mo16764k0(AbstractC4055i abstractC4055i) {
            mo16750T0(abstractC4055i.size());
            abstractC4055i.mo16433M(this);
        }

        @Override // com.google.protobuf.AbstractC4061l
        /* renamed from: p0 */
        public final void mo16769p0(int i7, int i8) {
            mo16748R0(i7, 5);
            mo16770q0(i8);
        }

        @Override // com.google.protobuf.AbstractC4061l
        /* renamed from: q0 */
        public final void mo16770q0(int i7) {
            try {
                byte[] bArr = this.f13460e;
                int i8 = this.f13463h;
                int i9 = i8 + 1;
                this.f13463h = i9;
                bArr[i8] = (byte) (i7 & 255);
                int i10 = i8 + 2;
                this.f13463h = i10;
                bArr[i9] = (byte) ((i7 >> 8) & 255);
                int i11 = i8 + 3;
                this.f13463h = i11;
                bArr[i10] = (byte) ((i7 >> 16) & 255);
                this.f13463h = i8 + 4;
                bArr[i11] = (byte) ((i7 >> 24) & 255);
            } catch (IndexOutOfBoundsException e7) {
                throw new d(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f13463h), Integer.valueOf(this.f13462g), 1), e7);
            }
        }

        @Override // com.google.protobuf.AbstractC4061l
        /* renamed from: r0 */
        public final void mo16771r0(int i7, long j7) {
            mo16748R0(i7, 1);
            mo16772s0(j7);
        }

        @Override // com.google.protobuf.AbstractC4061l
        /* renamed from: s0 */
        public final void mo16772s0(long j7) {
            try {
                byte[] bArr = this.f13460e;
                int i7 = this.f13463h;
                int i8 = i7 + 1;
                this.f13463h = i8;
                bArr[i7] = (byte) (((int) j7) & 255);
                int i9 = i7 + 2;
                this.f13463h = i9;
                bArr[i8] = (byte) (((int) (j7 >> 8)) & 255);
                int i10 = i7 + 3;
                this.f13463h = i10;
                bArr[i9] = (byte) (((int) (j7 >> 16)) & 255);
                int i11 = i7 + 4;
                this.f13463h = i11;
                bArr[i10] = (byte) (((int) (j7 >> 24)) & 255);
                int i12 = i7 + 5;
                this.f13463h = i12;
                bArr[i11] = (byte) (((int) (j7 >> 32)) & 255);
                int i13 = i7 + 6;
                this.f13463h = i13;
                bArr[i12] = (byte) (((int) (j7 >> 40)) & 255);
                int i14 = i7 + 7;
                this.f13463h = i14;
                bArr[i13] = (byte) (((int) (j7 >> 48)) & 255);
                this.f13463h = i7 + 8;
                bArr[i14] = (byte) (((int) (j7 >> 56)) & 255);
            } catch (IndexOutOfBoundsException e7) {
                throw new d(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f13463h), Integer.valueOf(this.f13462g), 1), e7);
            }
        }

        @Override // com.google.protobuf.AbstractC4061l
        /* renamed from: z0 */
        public final void mo16779z0(int i7, int i8) {
            mo16748R0(i7, 0);
            mo16731A0(i8);
        }
    }

    /* renamed from: com.google.protobuf.l$d */
    public static class d extends IOException {
        public d(Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
        }

        public d(String str, Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.: " + str, th);
        }
    }

    /* renamed from: com.google.protobuf.l$e */
    public static final class e extends b {

        /* renamed from: i */
        public final OutputStream f13464i;

        public e(OutputStream outputStream, int i7) {
            super(i7);
            if (outputStream == null) {
                throw new NullPointerException("out");
            }
            this.f13464i = outputStream;
        }

        @Override // com.google.protobuf.AbstractC4061l
        /* renamed from: A0 */
        public void mo16731A0(int i7) {
            if (i7 >= 0) {
                mo16750T0(i7);
            } else {
                mo16752V0(i7);
            }
        }

        @Override // com.google.protobuf.AbstractC4061l
        /* renamed from: D0 */
        public void mo16734D0(int i7, InterfaceC4034V interfaceC4034V, InterfaceC4066n0 interfaceC4066n0) {
            mo16748R0(i7, 2);
            m16795i1(interfaceC4034V, interfaceC4066n0);
        }

        @Override // com.google.protobuf.AbstractC4061l
        /* renamed from: E0 */
        public void mo16735E0(InterfaceC4034V interfaceC4034V) {
            mo16750T0(interfaceC4034V.mo16315b());
            interfaceC4034V.mo16318f(this);
        }

        @Override // com.google.protobuf.AbstractC4061l
        /* renamed from: F0 */
        public void mo16736F0(int i7, InterfaceC4034V interfaceC4034V) {
            mo16748R0(1, 3);
            mo16749S0(2, i7);
            m16794h1(3, interfaceC4034V);
            mo16748R0(1, 4);
        }

        @Override // com.google.protobuf.AbstractC4061l
        /* renamed from: G0 */
        public void mo16737G0(int i7, AbstractC4055i abstractC4055i) {
            mo16748R0(1, 3);
            mo16749S0(2, i7);
            mo16763j0(3, abstractC4055i);
            mo16748R0(1, 4);
        }

        @Override // com.google.protobuf.AbstractC4061l
        /* renamed from: P0 */
        public void mo16746P0(int i7, String str) {
            mo16748R0(i7, 2);
            mo16747Q0(str);
        }

        @Override // com.google.protobuf.AbstractC4061l
        /* renamed from: Q0 */
        public void mo16747Q0(String str) {
            int m16112j;
            try {
                int length = str.length() * 3;
                int m16700S = AbstractC4061l.m16700S(length);
                int i7 = m16700S + length;
                int i8 = this.f13457f;
                if (i7 > i8) {
                    byte[] bArr = new byte[length];
                    int m16111i = AbstractC4012A0.m16111i(str, bArr, 0, length);
                    mo16750T0(m16111i);
                    mo16490b(bArr, 0, m16111i);
                    return;
                }
                if (i7 > i8 - this.f13458g) {
                    m16790d1();
                }
                int m16700S2 = AbstractC4061l.m16700S(str.length());
                int i9 = this.f13458g;
                try {
                    if (m16700S2 == m16700S) {
                        int i10 = i9 + m16700S2;
                        this.f13458g = i10;
                        int m16111i2 = AbstractC4012A0.m16111i(str, this.f13456e, i10, this.f13457f - i10);
                        this.f13458g = i9;
                        m16112j = (m16111i2 - i9) - m16700S2;
                        m16785b1(m16112j);
                        this.f13458g = m16111i2;
                    } else {
                        m16112j = AbstractC4012A0.m16112j(str);
                        m16785b1(m16112j);
                        this.f13458g = AbstractC4012A0.m16111i(str, this.f13456e, this.f13458g, m16112j);
                    }
                    this.f13459h += m16112j;
                } catch (AbstractC4012A0.d e7) {
                    this.f13459h -= this.f13458g - i9;
                    this.f13458g = i9;
                    throw e7;
                } catch (ArrayIndexOutOfBoundsException e8) {
                    throw new d(e8);
                }
            } catch (AbstractC4012A0.d e9) {
                m16754Y(str, e9);
            }
        }

        @Override // com.google.protobuf.AbstractC4061l
        /* renamed from: R0 */
        public void mo16748R0(int i7, int i8) {
            mo16750T0(AbstractC4014B0.m16180c(i7, i8));
        }

        @Override // com.google.protobuf.AbstractC4061l
        /* renamed from: S0 */
        public void mo16749S0(int i7, int i8) {
            m16791e1(20);
            m16784a1(i7, 0);
            m16785b1(i8);
        }

        @Override // com.google.protobuf.AbstractC4061l
        /* renamed from: T0 */
        public void mo16750T0(int i7) {
            m16791e1(5);
            m16785b1(i7);
        }

        @Override // com.google.protobuf.AbstractC4061l
        /* renamed from: U0 */
        public void mo16751U0(int i7, long j7) {
            m16791e1(20);
            m16784a1(i7, 0);
            m16786c1(j7);
        }

        @Override // com.google.protobuf.AbstractC4061l
        /* renamed from: V0 */
        public void mo16752V0(long j7) {
            m16791e1(10);
            m16786c1(j7);
        }

        @Override // com.google.protobuf.AbstractC4061l
        /* renamed from: X */
        public void mo16753X() {
            if (this.f13458g > 0) {
                m16790d1();
            }
        }

        @Override // com.google.protobuf.AbstractC4053h
        /* renamed from: a */
        public void mo16489a(ByteBuffer byteBuffer) {
            m16792f1(byteBuffer);
        }

        @Override // com.google.protobuf.AbstractC4061l, com.google.protobuf.AbstractC4053h
        /* renamed from: b */
        public void mo16490b(byte[] bArr, int i7, int i8) {
            m16793g1(bArr, i7, i8);
        }

        /* renamed from: d1 */
        public final void m16790d1() {
            this.f13464i.write(this.f13456e, 0, this.f13458g);
            this.f13458g = 0;
        }

        @Override // com.google.protobuf.AbstractC4061l
        /* renamed from: e0 */
        public void mo16758e0(byte b7) {
            if (this.f13458g == this.f13457f) {
                m16790d1();
            }
            m16780W0(b7);
        }

        /* renamed from: e1 */
        public final void m16791e1(int i7) {
            if (this.f13457f - this.f13458g < i7) {
                m16790d1();
            }
        }

        @Override // com.google.protobuf.AbstractC4061l
        /* renamed from: f0 */
        public void mo16759f0(int i7, boolean z6) {
            m16791e1(11);
            m16784a1(i7, 0);
            m16780W0(z6 ? (byte) 1 : (byte) 0);
        }

        /* renamed from: f1 */
        public void m16792f1(ByteBuffer byteBuffer) {
            int remaining = byteBuffer.remaining();
            int i7 = this.f13457f;
            int i8 = this.f13458g;
            if (i7 - i8 >= remaining) {
                byteBuffer.get(this.f13456e, i8, remaining);
                this.f13458g += remaining;
                this.f13459h += remaining;
                return;
            }
            int i9 = i7 - i8;
            byteBuffer.get(this.f13456e, i8, i9);
            int i10 = remaining - i9;
            this.f13458g = this.f13457f;
            this.f13459h += i9;
            m16790d1();
            while (true) {
                int i11 = this.f13457f;
                if (i10 <= i11) {
                    byteBuffer.get(this.f13456e, 0, i10);
                    this.f13458g = i10;
                    this.f13459h += i10;
                    return;
                } else {
                    byteBuffer.get(this.f13456e, 0, i11);
                    this.f13464i.write(this.f13456e, 0, this.f13457f);
                    int i12 = this.f13457f;
                    i10 -= i12;
                    this.f13459h += i12;
                }
            }
        }

        /* renamed from: g1 */
        public void m16793g1(byte[] bArr, int i7, int i8) {
            int i9 = this.f13457f;
            int i10 = this.f13458g;
            if (i9 - i10 >= i8) {
                System.arraycopy(bArr, i7, this.f13456e, i10, i8);
                this.f13458g += i8;
                this.f13459h += i8;
                return;
            }
            int i11 = i9 - i10;
            System.arraycopy(bArr, i7, this.f13456e, i10, i11);
            int i12 = i7 + i11;
            int i13 = i8 - i11;
            this.f13458g = this.f13457f;
            this.f13459h += i11;
            m16790d1();
            if (i13 <= this.f13457f) {
                System.arraycopy(bArr, i12, this.f13456e, 0, i13);
                this.f13458g = i13;
            } else {
                this.f13464i.write(bArr, i12, i13);
            }
            this.f13459h += i13;
        }

        /* renamed from: h1 */
        public void m16794h1(int i7, InterfaceC4034V interfaceC4034V) {
            mo16748R0(i7, 2);
            mo16735E0(interfaceC4034V);
        }

        @Override // com.google.protobuf.AbstractC4061l
        /* renamed from: i0 */
        public void mo16762i0(byte[] bArr, int i7, int i8) {
            mo16750T0(i8);
            m16793g1(bArr, i7, i8);
        }

        /* renamed from: i1 */
        public void m16795i1(InterfaceC4034V interfaceC4034V, InterfaceC4066n0 interfaceC4066n0) {
            mo16750T0(((AbstractC4039a) interfaceC4034V).mo16413l(interfaceC4066n0));
            interfaceC4066n0.mo16377g(interfaceC4034V, this.f13454a);
        }

        @Override // com.google.protobuf.AbstractC4061l
        /* renamed from: j0 */
        public void mo16763j0(int i7, AbstractC4055i abstractC4055i) {
            mo16748R0(i7, 2);
            mo16764k0(abstractC4055i);
        }

        @Override // com.google.protobuf.AbstractC4061l
        /* renamed from: k0 */
        public void mo16764k0(AbstractC4055i abstractC4055i) {
            mo16750T0(abstractC4055i.size());
            abstractC4055i.mo16433M(this);
        }

        @Override // com.google.protobuf.AbstractC4061l
        /* renamed from: p0 */
        public void mo16769p0(int i7, int i8) {
            m16791e1(14);
            m16784a1(i7, 5);
            m16781X0(i8);
        }

        @Override // com.google.protobuf.AbstractC4061l
        /* renamed from: q0 */
        public void mo16770q0(int i7) {
            m16791e1(4);
            m16781X0(i7);
        }

        @Override // com.google.protobuf.AbstractC4061l
        /* renamed from: r0 */
        public void mo16771r0(int i7, long j7) {
            m16791e1(18);
            m16784a1(i7, 1);
            m16782Y0(j7);
        }

        @Override // com.google.protobuf.AbstractC4061l
        /* renamed from: s0 */
        public void mo16772s0(long j7) {
            m16791e1(8);
            m16782Y0(j7);
        }

        @Override // com.google.protobuf.AbstractC4061l
        /* renamed from: z0 */
        public void mo16779z0(int i7, int i8) {
            m16791e1(20);
            m16784a1(i7, 0);
            m16783Z0(i8);
        }
    }

    /* renamed from: A */
    public static int m16682A(int i7) {
        return m16700S(i7) + i7;
    }

    /* renamed from: B */
    public static int m16683B(int i7, InterfaceC4034V interfaceC4034V, InterfaceC4066n0 interfaceC4066n0) {
        return m16698Q(i7) + m16685D(interfaceC4034V, interfaceC4066n0);
    }

    /* renamed from: C */
    public static int m16684C(InterfaceC4034V interfaceC4034V) {
        return m16682A(interfaceC4034V.mo16315b());
    }

    /* renamed from: D */
    public static int m16685D(InterfaceC4034V interfaceC4034V, InterfaceC4066n0 interfaceC4066n0) {
        return m16682A(((AbstractC4039a) interfaceC4034V).mo16413l(interfaceC4066n0));
    }

    /* renamed from: E */
    public static int m16686E(int i7) {
        if (i7 > 4096) {
            return 4096;
        }
        return i7;
    }

    /* renamed from: F */
    public static int m16687F(int i7, AbstractC4055i abstractC4055i) {
        return (m16698Q(1) * 2) + m16699R(2, i7) + m16712h(3, abstractC4055i);
    }

    /* renamed from: G */
    public static int m16688G(int i7, int i8) {
        return m16698Q(i7) + m16689H(i8);
    }

    /* renamed from: H */
    public static int m16689H(int i7) {
        return 4;
    }

    /* renamed from: I */
    public static int m16690I(int i7, long j7) {
        return m16698Q(i7) + m16691J(j7);
    }

    /* renamed from: J */
    public static int m16691J(long j7) {
        return 8;
    }

    /* renamed from: K */
    public static int m16692K(int i7, int i8) {
        return m16698Q(i7) + m16693L(i8);
    }

    /* renamed from: L */
    public static int m16693L(int i7) {
        return m16700S(m16703V(i7));
    }

    /* renamed from: M */
    public static int m16694M(int i7, long j7) {
        return m16698Q(i7) + m16695N(j7);
    }

    /* renamed from: N */
    public static int m16695N(long j7) {
        return m16702U(m16704W(j7));
    }

    /* renamed from: O */
    public static int m16696O(int i7, String str) {
        return m16698Q(i7) + m16697P(str);
    }

    /* renamed from: P */
    public static int m16697P(String str) {
        int length;
        try {
            length = AbstractC4012A0.m16112j(str);
        } catch (AbstractC4012A0.d unused) {
            length = str.getBytes(AbstractC4015C.f13275b).length;
        }
        return m16682A(length);
    }

    /* renamed from: Q */
    public static int m16698Q(int i7) {
        return m16700S(AbstractC4014B0.m16180c(i7, 0));
    }

    /* renamed from: R */
    public static int m16699R(int i7, int i8) {
        return m16698Q(i7) + m16700S(i8);
    }

    /* renamed from: S */
    public static int m16700S(int i7) {
        if ((i7 & (-128)) == 0) {
            return 1;
        }
        if ((i7 & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i7) == 0) {
            return 3;
        }
        return (i7 & (-268435456)) == 0 ? 4 : 5;
    }

    /* renamed from: T */
    public static int m16701T(int i7, long j7) {
        return m16698Q(i7) + m16702U(j7);
    }

    /* renamed from: U */
    public static int m16702U(long j7) {
        int i7;
        if (((-128) & j7) == 0) {
            return 1;
        }
        if (j7 < 0) {
            return 10;
        }
        if (((-34359738368L) & j7) != 0) {
            j7 >>>= 28;
            i7 = 6;
        } else {
            i7 = 2;
        }
        if (((-2097152) & j7) != 0) {
            i7 += 2;
            j7 >>>= 14;
        }
        return (j7 & (-16384)) != 0 ? i7 + 1 : i7;
    }

    /* renamed from: V */
    public static int m16703V(int i7) {
        return (i7 >> 31) ^ (i7 << 1);
    }

    /* renamed from: W */
    public static long m16704W(long j7) {
        return (j7 >> 63) ^ (j7 << 1);
    }

    /* renamed from: a0 */
    public static AbstractC4061l m16705a0(OutputStream outputStream, int i7) {
        return new e(outputStream, i7);
    }

    /* renamed from: b0 */
    public static AbstractC4061l m16706b0(byte[] bArr) {
        return m16708c0(bArr, 0, bArr.length);
    }

    /* renamed from: c0 */
    public static AbstractC4061l m16708c0(byte[] bArr, int i7, int i8) {
        return new c(bArr, i7, i8);
    }

    /* renamed from: e */
    public static int m16709e(int i7, boolean z6) {
        return m16698Q(i7) + m16710f(z6);
    }

    /* renamed from: f */
    public static int m16710f(boolean z6) {
        return 1;
    }

    /* renamed from: g */
    public static int m16711g(byte[] bArr) {
        return m16682A(bArr.length);
    }

    /* renamed from: h */
    public static int m16712h(int i7, AbstractC4055i abstractC4055i) {
        return m16698Q(i7) + m16713i(abstractC4055i);
    }

    /* renamed from: i */
    public static int m16713i(AbstractC4055i abstractC4055i) {
        return m16682A(abstractC4055i.size());
    }

    /* renamed from: j */
    public static int m16714j(int i7, double d7) {
        return m16698Q(i7) + m16715k(d7);
    }

    /* renamed from: k */
    public static int m16715k(double d7) {
        return 8;
    }

    /* renamed from: l */
    public static int m16716l(int i7, int i8) {
        return m16698Q(i7) + m16717m(i8);
    }

    /* renamed from: m */
    public static int m16717m(int i7) {
        return m16728x(i7);
    }

    /* renamed from: n */
    public static int m16718n(int i7, int i8) {
        return m16698Q(i7) + m16719o(i8);
    }

    /* renamed from: o */
    public static int m16719o(int i7) {
        return 4;
    }

    /* renamed from: p */
    public static int m16720p(int i7, long j7) {
        return m16698Q(i7) + m16721q(j7);
    }

    /* renamed from: q */
    public static int m16721q(long j7) {
        return 8;
    }

    /* renamed from: r */
    public static int m16722r(int i7, float f7) {
        return m16698Q(i7) + m16723s(f7);
    }

    /* renamed from: s */
    public static int m16723s(float f7) {
        return 4;
    }

    /* renamed from: t */
    public static int m16724t(int i7, InterfaceC4034V interfaceC4034V, InterfaceC4066n0 interfaceC4066n0) {
        return (m16698Q(i7) * 2) + m16726v(interfaceC4034V, interfaceC4066n0);
    }

    /* renamed from: u */
    public static int m16725u(InterfaceC4034V interfaceC4034V) {
        return interfaceC4034V.mo16315b();
    }

    /* renamed from: v */
    public static int m16726v(InterfaceC4034V interfaceC4034V, InterfaceC4066n0 interfaceC4066n0) {
        return ((AbstractC4039a) interfaceC4034V).mo16413l(interfaceC4066n0);
    }

    /* renamed from: w */
    public static int m16727w(int i7, int i8) {
        return m16698Q(i7) + m16728x(i8);
    }

    /* renamed from: x */
    public static int m16728x(int i7) {
        if (i7 >= 0) {
            return m16700S(i7);
        }
        return 10;
    }

    /* renamed from: y */
    public static int m16729y(int i7, long j7) {
        return m16698Q(i7) + m16730z(j7);
    }

    /* renamed from: z */
    public static int m16730z(long j7) {
        return m16702U(j7);
    }

    /* renamed from: A0 */
    public abstract void mo16731A0(int i7);

    /* renamed from: B0 */
    public final void m16732B0(int i7, long j7) {
        mo16751U0(i7, j7);
    }

    /* renamed from: C0 */
    public final void m16733C0(long j7) {
        mo16752V0(j7);
    }

    /* renamed from: D0 */
    public abstract void mo16734D0(int i7, InterfaceC4034V interfaceC4034V, InterfaceC4066n0 interfaceC4066n0);

    /* renamed from: E0 */
    public abstract void mo16735E0(InterfaceC4034V interfaceC4034V);

    /* renamed from: F0 */
    public abstract void mo16736F0(int i7, InterfaceC4034V interfaceC4034V);

    /* renamed from: G0 */
    public abstract void mo16737G0(int i7, AbstractC4055i abstractC4055i);

    /* renamed from: H0 */
    public final void m16738H0(int i7, int i8) {
        mo16769p0(i7, i8);
    }

    /* renamed from: I0 */
    public final void m16739I0(int i7) {
        mo16770q0(i7);
    }

    /* renamed from: J0 */
    public final void m16740J0(int i7, long j7) {
        mo16771r0(i7, j7);
    }

    /* renamed from: K0 */
    public final void m16741K0(long j7) {
        mo16772s0(j7);
    }

    /* renamed from: L0 */
    public final void m16742L0(int i7, int i8) {
        mo16749S0(i7, m16703V(i8));
    }

    /* renamed from: M0 */
    public final void m16743M0(int i7) {
        mo16750T0(m16703V(i7));
    }

    /* renamed from: N0 */
    public final void m16744N0(int i7, long j7) {
        mo16751U0(i7, m16704W(j7));
    }

    /* renamed from: O0 */
    public final void m16745O0(long j7) {
        mo16752V0(m16704W(j7));
    }

    /* renamed from: P0 */
    public abstract void mo16746P0(int i7, String str);

    /* renamed from: Q0 */
    public abstract void mo16747Q0(String str);

    /* renamed from: R0 */
    public abstract void mo16748R0(int i7, int i8);

    /* renamed from: S0 */
    public abstract void mo16749S0(int i7, int i8);

    /* renamed from: T0 */
    public abstract void mo16750T0(int i7);

    /* renamed from: U0 */
    public abstract void mo16751U0(int i7, long j7);

    /* renamed from: V0 */
    public abstract void mo16752V0(long j7);

    /* renamed from: X */
    public abstract void mo16753X();

    /* renamed from: Y */
    public final void m16754Y(String str, AbstractC4012A0.d dVar) {
        f13452c.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) dVar);
        byte[] bytes = str.getBytes(AbstractC4015C.f13275b);
        try {
            mo16750T0(bytes.length);
            mo16490b(bytes, 0, bytes.length);
        } catch (IndexOutOfBoundsException e7) {
            throw new d(e7);
        }
    }

    /* renamed from: Z */
    public boolean m16755Z() {
        return this.f13455b;
    }

    @Override // com.google.protobuf.AbstractC4053h
    /* renamed from: b */
    public abstract void mo16490b(byte[] bArr, int i7, int i8);

    /* renamed from: d */
    public final void m16756d() {
        if (mo16757d0() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    /* renamed from: d0 */
    public abstract int mo16757d0();

    /* renamed from: e0 */
    public abstract void mo16758e0(byte b7);

    /* renamed from: f0 */
    public abstract void mo16759f0(int i7, boolean z6);

    /* renamed from: g0 */
    public final void m16760g0(boolean z6) {
        mo16758e0(z6 ? (byte) 1 : (byte) 0);
    }

    /* renamed from: h0 */
    public final void m16761h0(byte[] bArr) {
        mo16762i0(bArr, 0, bArr.length);
    }

    /* renamed from: i0 */
    public abstract void mo16762i0(byte[] bArr, int i7, int i8);

    /* renamed from: j0 */
    public abstract void mo16763j0(int i7, AbstractC4055i abstractC4055i);

    /* renamed from: k0 */
    public abstract void mo16764k0(AbstractC4055i abstractC4055i);

    /* renamed from: l0 */
    public final void m16765l0(int i7, double d7) {
        mo16771r0(i7, Double.doubleToRawLongBits(d7));
    }

    /* renamed from: m0 */
    public final void m16766m0(double d7) {
        mo16772s0(Double.doubleToRawLongBits(d7));
    }

    /* renamed from: n0 */
    public final void m16767n0(int i7, int i8) {
        mo16779z0(i7, i8);
    }

    /* renamed from: o0 */
    public final void m16768o0(int i7) {
        mo16731A0(i7);
    }

    /* renamed from: p0 */
    public abstract void mo16769p0(int i7, int i8);

    /* renamed from: q0 */
    public abstract void mo16770q0(int i7);

    /* renamed from: r0 */
    public abstract void mo16771r0(int i7, long j7);

    /* renamed from: s0 */
    public abstract void mo16772s0(long j7);

    /* renamed from: t0 */
    public final void m16773t0(int i7, float f7) {
        mo16769p0(i7, Float.floatToRawIntBits(f7));
    }

    /* renamed from: u0 */
    public final void m16774u0(float f7) {
        mo16770q0(Float.floatToRawIntBits(f7));
    }

    /* renamed from: v0 */
    public final void m16775v0(int i7, InterfaceC4034V interfaceC4034V) {
        mo16748R0(i7, 3);
        m16777x0(interfaceC4034V);
        mo16748R0(i7, 4);
    }

    /* renamed from: w0 */
    public final void m16776w0(int i7, InterfaceC4034V interfaceC4034V, InterfaceC4066n0 interfaceC4066n0) {
        mo16748R0(i7, 3);
        m16778y0(interfaceC4034V, interfaceC4066n0);
        mo16748R0(i7, 4);
    }

    /* renamed from: x0 */
    public final void m16777x0(InterfaceC4034V interfaceC4034V) {
        interfaceC4034V.mo16318f(this);
    }

    /* renamed from: y0 */
    public final void m16778y0(InterfaceC4034V interfaceC4034V, InterfaceC4066n0 interfaceC4066n0) {
        interfaceC4066n0.mo16377g(interfaceC4034V, this.f13454a);
    }

    /* renamed from: z0 */
    public abstract void mo16779z0(int i7, int i8);

    public AbstractC4061l() {
    }
}
