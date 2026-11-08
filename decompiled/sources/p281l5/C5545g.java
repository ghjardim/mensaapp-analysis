package p281l5;

import com.google.android.gms.common.api.C3643a;
import java.io.IOException;
import java.util.List;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.tika.fork.ForkServer;
import org.apache.tika.utils.StringUtils;
import p206c6.C3616d;
import p206c6.C3619g;
import p206c6.InterfaceC3609V;
import p206c6.InterfaceC3617e;
import p206c6.InterfaceC3618f;
import p281l5.AbstractC5544f;
import p281l5.InterfaceC5540b;

/* renamed from: l5.g */
/* loaded from: classes2.dex */
public final class C5545g implements InterfaceC5548j {

    /* renamed from: a */
    public static final Logger f20005a = Logger.getLogger(b.class.getName());

    /* renamed from: b */
    public static final C3619g f20006b = C3619g.m14638g("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");

    /* renamed from: l5.g$b */
    public static final class b {

        /* renamed from: a */
        public static final String[] f20013a = {"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};

        /* renamed from: b */
        public static final String[] f20014b = new String[64];

        /* renamed from: c */
        public static final String[] f20015c = new String[256];

        static {
            int i7 = 0;
            int i8 = 0;
            while (true) {
                String[] strArr = f20015c;
                if (i8 >= strArr.length) {
                    break;
                }
                strArr[i8] = String.format("%8s", Integer.toBinaryString(i8)).replace(' ', '0');
                i8++;
            }
            String[] strArr2 = f20014b;
            strArr2[0] = StringUtils.EMPTY;
            strArr2[1] = "END_STREAM";
            int[] iArr = {1};
            strArr2[8] = "PADDED";
            int i9 = iArr[0];
            strArr2[i9 | 8] = strArr2[i9] + "|PADDED";
            strArr2[4] = "END_HEADERS";
            strArr2[32] = "PRIORITY";
            strArr2[36] = "END_HEADERS|PRIORITY";
            int[] iArr2 = {4, 32, 36};
            for (int i10 = 0; i10 < 3; i10++) {
                int i11 = iArr2[i10];
                int i12 = iArr[0];
                String[] strArr3 = f20014b;
                int i13 = i12 | i11;
                strArr3[i13] = strArr3[i12] + '|' + strArr3[i11];
                strArr3[i13 | 8] = strArr3[i12] + '|' + strArr3[i11] + "|PADDED";
            }
            while (true) {
                String[] strArr4 = f20014b;
                if (i7 >= strArr4.length) {
                    return;
                }
                if (strArr4[i7] == null) {
                    strArr4[i7] = f20015c[i7];
                }
                i7++;
            }
        }

        /* renamed from: a */
        public static String m23231a(byte b7, byte b8) {
            if (b8 == 0) {
                return StringUtils.EMPTY;
            }
            if (b7 != 2 && b7 != 3) {
                if (b7 == 4 || b7 == 6) {
                    return b8 == 1 ? "ACK" : f20015c[b8];
                }
                if (b7 != 7 && b7 != 8) {
                    String[] strArr = f20014b;
                    String str = b8 < strArr.length ? strArr[b8] : f20015c[b8];
                    return (b7 != 5 || (b8 & 4) == 0) ? (b7 != 0 || (b8 & 32) == 0) ? str : str.replace("PRIORITY", "COMPRESSED") : str.replace("HEADERS", "PUSH_PROMISE");
                }
            }
            return f20015c[b8];
        }

        /* renamed from: b */
        public static String m23232b(boolean z6, int i7, int i8, byte b7, byte b8) {
            String[] strArr = f20013a;
            return String.format(Locale.US, "%s 0x%08x %5d %-13s %s", z6 ? "<<" : ">>", Integer.valueOf(i7), Integer.valueOf(i8), b7 < strArr.length ? strArr[b7] : String.format("0x%02x", Byte.valueOf(b7)), m23231a(b7, b8));
        }
    }

    /* renamed from: l5.g$c */
    public static final class c implements InterfaceC5540b {

        /* renamed from: a */
        public final InterfaceC3618f f20016a;

        /* renamed from: b */
        public final a f20017b;

        /* renamed from: c */
        public final boolean f20018c;

        /* renamed from: d */
        public final AbstractC5544f.a f20019d;

        public c(InterfaceC3618f interfaceC3618f, int i7, boolean z6) {
            this.f20016a = interfaceC3618f;
            this.f20018c = z6;
            a aVar = new a(interfaceC3618f);
            this.f20017b = aVar;
            this.f20019d = new AbstractC5544f.a(i7, aVar);
        }

        @Override // p281l5.InterfaceC5540b
        /* renamed from: X */
        public boolean mo23185X(InterfaceC5540b.a aVar) {
            try {
                this.f20016a.mo14520s0(9L);
                int m23226m = C5545g.m23226m(this.f20016a);
                if (m23226m < 0 || m23226m > 16384) {
                    throw C5545g.m23224k("FRAME_SIZE_ERROR: %s", Integer.valueOf(m23226m));
                }
                byte readByte = (byte) (this.f20016a.readByte() & ForkServer.ERROR);
                byte readByte2 = (byte) (this.f20016a.readByte() & ForkServer.ERROR);
                int readInt = this.f20016a.readInt() & C3643a.e.API_PRIORITY_OTHER;
                if (C5545g.f20005a.isLoggable(Level.FINE)) {
                    C5545g.f20005a.fine(b.m23232b(true, readInt, m23226m, readByte, readByte2));
                }
                switch (readByte) {
                    case 0:
                        m23233a(aVar, m23226m, readByte2, readInt);
                        return true;
                    case 1:
                        m23236g(aVar, m23226m, readByte2, readInt);
                        return true;
                    case 2:
                        m23239m(aVar, m23226m, readByte2, readInt);
                        return true;
                    case 3:
                        m23241r(aVar, m23226m, readByte2, readInt);
                        return true;
                    case 4:
                        m23242v(aVar, m23226m, readByte2, readInt);
                        return true;
                    case 5:
                        m23240o(aVar, m23226m, readByte2, readInt);
                        return true;
                    case 6:
                        m23237h(aVar, m23226m, readByte2, readInt);
                        return true;
                    case 7:
                        m23234c(aVar, m23226m, readByte2, readInt);
                        return true;
                    case 8:
                        m23243w(aVar, m23226m, readByte2, readInt);
                        return true;
                    default:
                        this.f20016a.skip(m23226m);
                        return true;
                }
            } catch (IOException unused) {
                return false;
            }
        }

        /* renamed from: a */
        public final void m23233a(InterfaceC5540b.a aVar, int i7, byte b7, int i8) {
            boolean z6 = (b7 & 1) != 0;
            if ((b7 & 32) != 0) {
                throw C5545g.m23224k("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA", new Object[0]);
            }
            short readByte = (b7 & 8) != 0 ? (short) (this.f20016a.readByte() & ForkServer.ERROR) : (short) 0;
            aVar.mo22236o(z6, i8, this.f20016a, C5545g.m23225l(i7, b7, readByte), i7);
            this.f20016a.skip(readByte);
        }

        /* renamed from: c */
        public final void m23234c(InterfaceC5540b.a aVar, int i7, byte b7, int i8) {
            if (i7 < 8) {
                throw C5545g.m23224k("TYPE_GOAWAY length < 8: %s", Integer.valueOf(i7));
            }
            if (i8 != 0) {
                throw C5545g.m23224k("TYPE_GOAWAY streamId != 0", new Object[0]);
            }
            int readInt = this.f20016a.readInt();
            int readInt2 = this.f20016a.readInt();
            int i9 = i7 - 8;
            EnumC5539a m23184b = EnumC5539a.m23184b(readInt2);
            if (m23184b == null) {
                throw C5545g.m23224k("TYPE_GOAWAY unexpected error code: %d", Integer.valueOf(readInt2));
            }
            C3619g c3619g = C3619g.f12118e;
            if (i9 > 0) {
                c3619g = this.f20016a.mo14519p(i9);
            }
            aVar.mo22234m(readInt, m23184b, c3619g);
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.f20016a.close();
        }

        /* renamed from: d */
        public final List m23235d(int i7, short s7, byte b7, int i8) {
            a aVar = this.f20017b;
            aVar.f20011e = i7;
            aVar.f20008b = i7;
            aVar.f20012f = s7;
            aVar.f20009c = b7;
            aVar.f20010d = i8;
            this.f20019d.m23203l();
            return this.f20019d.m23196e();
        }

        /* renamed from: g */
        public final void m23236g(InterfaceC5540b.a aVar, int i7, byte b7, int i8) {
            if (i8 == 0) {
                throw C5545g.m23224k("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0", new Object[0]);
            }
            boolean z6 = (b7 & 1) != 0;
            short readByte = (b7 & 8) != 0 ? (short) (this.f20016a.readByte() & ForkServer.ERROR) : (short) 0;
            if ((b7 & 32) != 0) {
                m23238j(aVar, i8);
                i7 -= 5;
            }
            aVar.mo22232k(false, z6, i8, -1, m23235d(C5545g.m23225l(i7, b7, readByte), readByte, b7, i8), EnumC5543e.HTTP_20_HEADERS);
        }

        /* renamed from: h */
        public final void m23237h(InterfaceC5540b.a aVar, int i7, byte b7, int i8) {
            if (i7 != 8) {
                throw C5545g.m23224k("TYPE_PING length != 8: %s", Integer.valueOf(i7));
            }
            if (i8 != 0) {
                throw C5545g.m23224k("TYPE_PING streamId != 0", new Object[0]);
            }
            aVar.mo22230i((b7 & 1) != 0, this.f20016a.readInt(), this.f20016a.readInt());
        }

        /* renamed from: j */
        public final void m23238j(InterfaceC5540b.a aVar, int i7) {
            int readInt = this.f20016a.readInt();
            aVar.mo22235n(i7, readInt & C3643a.e.API_PRIORITY_OTHER, (this.f20016a.readByte() & ForkServer.ERROR) + 1, (Integer.MIN_VALUE & readInt) != 0);
        }

        /* renamed from: m */
        public final void m23239m(InterfaceC5540b.a aVar, int i7, byte b7, int i8) {
            if (i7 != 5) {
                throw C5545g.m23224k("TYPE_PRIORITY length: %d != 5", Integer.valueOf(i7));
            }
            if (i8 == 0) {
                throw C5545g.m23224k("TYPE_PRIORITY streamId == 0", new Object[0]);
            }
            m23238j(aVar, i8);
        }

        /* renamed from: o */
        public final void m23240o(InterfaceC5540b.a aVar, int i7, byte b7, int i8) {
            if (i8 == 0) {
                throw C5545g.m23224k("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0", new Object[0]);
            }
            short readByte = (b7 & 8) != 0 ? (short) (this.f20016a.readByte() & ForkServer.ERROR) : (short) 0;
            aVar.mo22237p(i8, this.f20016a.readInt() & C3643a.e.API_PRIORITY_OTHER, m23235d(C5545g.m23225l(i7 - 4, b7, readByte), readByte, b7, i8));
        }

        /* renamed from: r */
        public final void m23241r(InterfaceC5540b.a aVar, int i7, byte b7, int i8) {
            if (i7 != 4) {
                throw C5545g.m23224k("TYPE_RST_STREAM length: %d != 4", Integer.valueOf(i7));
            }
            if (i8 == 0) {
                throw C5545g.m23224k("TYPE_RST_STREAM streamId == 0", new Object[0]);
            }
            int readInt = this.f20016a.readInt();
            EnumC5539a m23184b = EnumC5539a.m23184b(readInt);
            if (m23184b == null) {
                throw C5545g.m23224k("TYPE_RST_STREAM unexpected error code: %d", Integer.valueOf(readInt));
            }
            aVar.mo22228e(i8, m23184b);
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* renamed from: v */
        public final void m23242v(InterfaceC5540b.a aVar, int i7, byte b7, int i8) {
            if (i8 != 0) {
                throw C5545g.m23224k("TYPE_SETTINGS streamId != 0", new Object[0]);
            }
            if ((b7 & 1) != 0) {
                if (i7 != 0) {
                    throw C5545g.m23224k("FRAME_SIZE_ERROR ack frame should be empty!", new Object[0]);
                }
                aVar.mo22231j();
                return;
            }
            if (i7 % 6 != 0) {
                throw C5545g.m23224k("TYPE_SETTINGS length %% 6 != 0: %s", Integer.valueOf(i7));
            }
            C5547i c5547i = new C5547i();
            for (int i9 = 0; i9 < i7; i9 += 6) {
                short readShort = this.f20016a.readShort();
                int readInt = this.f20016a.readInt();
                switch (readShort) {
                    case 1:
                    case 6:
                        c5547i.m23261e(readShort, 0, readInt);
                    case 2:
                        if (readInt != 0 && readInt != 1) {
                            throw C5545g.m23224k("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1", new Object[0]);
                        }
                        c5547i.m23261e(readShort, 0, readInt);
                    case 3:
                        readShort = 4;
                        c5547i.m23261e(readShort, 0, readInt);
                    case 4:
                        if (readInt < 0) {
                            throw C5545g.m23224k("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1", new Object[0]);
                        }
                        readShort = 7;
                        c5547i.m23261e(readShort, 0, readInt);
                    case 5:
                        if (readInt < 16384 || readInt > 16777215) {
                            throw C5545g.m23224k("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: %s", Integer.valueOf(readInt));
                        }
                        c5547i.m23261e(readShort, 0, readInt);
                        break;
                    default:
                }
            }
            aVar.mo22233l(false, c5547i);
            if (c5547i.m23258b() >= 0) {
                this.f20019d.m23198g(c5547i.m23258b());
            }
        }

        /* renamed from: w */
        public final void m23243w(InterfaceC5540b.a aVar, int i7, byte b7, int i8) {
            if (i7 != 4) {
                throw C5545g.m23224k("TYPE_WINDOW_UPDATE length !=4: %s", Integer.valueOf(i7));
            }
            long readInt = this.f20016a.readInt() & 2147483647L;
            if (readInt == 0) {
                throw C5545g.m23224k("windowSizeIncrement was 0", new Object[0]);
            }
            aVar.mo22229f(i8, readInt);
        }
    }

    /* renamed from: l5.g$d */
    public static final class d implements InterfaceC5541c {

        /* renamed from: a */
        public final InterfaceC3617e f20020a;

        /* renamed from: b */
        public final boolean f20021b;

        /* renamed from: c */
        public final C3616d f20022c;

        /* renamed from: d */
        public final AbstractC5544f.b f20023d;

        /* renamed from: e */
        public int f20024e;

        /* renamed from: f */
        public boolean f20025f;

        public d(InterfaceC3617e interfaceC3617e, boolean z6) {
            this.f20020a = interfaceC3617e;
            this.f20021b = z6;
            C3616d c3616d = new C3616d();
            this.f20022c = c3616d;
            this.f20023d = new AbstractC5544f.b(c3616d);
            this.f20024e = 16384;
        }

        @Override // p281l5.InterfaceC5541c
        /* renamed from: B */
        public synchronized void mo22117B() {
            try {
                if (this.f20025f) {
                    throw new IOException("closed");
                }
                if (this.f20021b) {
                    if (C5545g.f20005a.isLoggable(Level.FINE)) {
                        C5545g.f20005a.fine(String.format(">> CONNECTION %s", C5545g.f20006b.mo14542n()));
                    }
                    this.f20020a.mo14508b0(C5545g.f20006b.mo14535F());
                    this.f20020a.flush();
                }
            } catch (Throwable th) {
                throw th;
            }
        }

        @Override // p281l5.InterfaceC5541c
        /* renamed from: L */
        public synchronized void mo22118L(int i7, EnumC5539a enumC5539a, byte[] bArr) {
            try {
                if (this.f20025f) {
                    throw new IOException("closed");
                }
                if (enumC5539a.f19966a == -1) {
                    throw C5545g.m23223j("errorCode.httpCode == -1", new Object[0]);
                }
                m23245c(0, bArr.length + 8, (byte) 7, (byte) 0);
                this.f20020a.mo14510t(i7);
                this.f20020a.mo14510t(enumC5539a.f19966a);
                if (bArr.length > 0) {
                    this.f20020a.mo14508b0(bArr);
                }
                this.f20020a.flush();
            } catch (Throwable th) {
                throw th;
            }
        }

        @Override // p281l5.InterfaceC5541c
        /* renamed from: U */
        public synchronized void mo22119U(C5547i c5547i) {
            try {
                if (this.f20025f) {
                    throw new IOException("closed");
                }
                int i7 = 0;
                m23245c(0, c5547i.m23262f() * 6, (byte) 4, (byte) 0);
                while (i7 < 10) {
                    if (c5547i.m23260d(i7)) {
                        this.f20020a.mo14509q(i7 == 4 ? 3 : i7 == 7 ? 4 : i7);
                        this.f20020a.mo14510t(c5547i.m23257a(i7));
                    }
                    i7++;
                }
                this.f20020a.flush();
            } catch (Throwable th) {
                throw th;
            }
        }

        /* renamed from: a */
        public void m23244a(int i7, byte b7, C3616d c3616d, int i8) {
            m23245c(i7, i8, (byte) 0, b7);
            if (i8 > 0) {
                this.f20020a.mo14482s(c3616d, i8);
            }
        }

        /* renamed from: c */
        public void m23245c(int i7, int i8, byte b7, byte b8) {
            if (C5545g.f20005a.isLoggable(Level.FINE)) {
                C5545g.f20005a.fine(b.m23232b(false, i7, i8, b7, b8));
            }
            int i9 = this.f20024e;
            if (i8 > i9) {
                throw C5545g.m23223j("FRAME_SIZE_ERROR length > %d: %d", Integer.valueOf(i9), Integer.valueOf(i8));
            }
            if ((Integer.MIN_VALUE & i7) != 0) {
                throw C5545g.m23223j("reserved bit set: %s", Integer.valueOf(i7));
            }
            C5545g.m23227n(this.f20020a, i8);
            this.f20020a.mo14505A(b7 & ForkServer.ERROR);
            this.f20020a.mo14505A(b8 & ForkServer.ERROR);
            this.f20020a.mo14510t(i7 & C3643a.e.API_PRIORITY_OTHER);
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public synchronized void close() {
            this.f20025f = true;
            this.f20020a.close();
        }

        /* renamed from: d */
        public void m23246d(boolean z6, int i7, List list) {
            if (this.f20025f) {
                throw new IOException("closed");
            }
            this.f20023d.m23214e(list);
            long m14618c0 = this.f20022c.m14618c0();
            int min = (int) Math.min(this.f20024e, m14618c0);
            long j7 = min;
            byte b7 = m14618c0 == j7 ? (byte) 4 : (byte) 0;
            if (z6) {
                b7 = (byte) (b7 | 1);
            }
            m23245c(i7, min, (byte) 1, b7);
            this.f20020a.mo14482s(this.f20022c, j7);
            if (m14618c0 > j7) {
                m23247g(i7, m14618c0 - j7);
            }
        }

        @Override // p281l5.InterfaceC5541c
        /* renamed from: e */
        public synchronized void mo22113e(int i7, EnumC5539a enumC5539a) {
            if (this.f20025f) {
                throw new IOException("closed");
            }
            if (enumC5539a.f19966a == -1) {
                throw new IllegalArgumentException();
            }
            m23245c(i7, 4, (byte) 3, (byte) 0);
            this.f20020a.mo14510t(enumC5539a.f19966a);
            this.f20020a.flush();
        }

        @Override // p281l5.InterfaceC5541c
        /* renamed from: f */
        public synchronized void mo22120f(int i7, long j7) {
            if (this.f20025f) {
                throw new IOException("closed");
            }
            if (j7 == 0 || j7 > 2147483647L) {
                throw C5545g.m23223j("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: %s", Long.valueOf(j7));
            }
            m23245c(i7, 4, (byte) 8, (byte) 0);
            this.f20020a.mo14510t((int) j7);
            this.f20020a.flush();
        }

        @Override // p281l5.InterfaceC5541c
        public synchronized void flush() {
            if (this.f20025f) {
                throw new IOException("closed");
            }
            this.f20020a.flush();
        }

        /* renamed from: g */
        public final void m23247g(int i7, long j7) {
            while (j7 > 0) {
                int min = (int) Math.min(this.f20024e, j7);
                long j8 = min;
                j7 -= j8;
                m23245c(i7, min, (byte) 9, j7 == 0 ? (byte) 4 : (byte) 0);
                this.f20020a.mo14482s(this.f20022c, j8);
            }
        }

        @Override // p281l5.InterfaceC5541c
        /* renamed from: g0 */
        public synchronized void mo22121g0(boolean z6, int i7, C3616d c3616d, int i8) {
            if (this.f20025f) {
                throw new IOException("closed");
            }
            m23244a(i7, z6 ? (byte) 1 : (byte) 0, c3616d, i8);
        }

        @Override // p281l5.InterfaceC5541c
        /* renamed from: i */
        public synchronized void mo22114i(boolean z6, int i7, int i8) {
            if (this.f20025f) {
                throw new IOException("closed");
            }
            m23245c(0, 8, (byte) 6, z6 ? (byte) 1 : (byte) 0);
            this.f20020a.mo14510t(i7);
            this.f20020a.mo14510t(i8);
            this.f20020a.flush();
        }

        @Override // p281l5.InterfaceC5541c
        /* renamed from: m0 */
        public synchronized void mo22115m0(C5547i c5547i) {
            if (this.f20025f) {
                throw new IOException("closed");
            }
            this.f20024e = c5547i.m23259c(this.f20024e);
            m23245c(0, 0, (byte) 4, (byte) 1);
            this.f20020a.flush();
        }

        @Override // p281l5.InterfaceC5541c
        /* renamed from: p0 */
        public int mo22122p0() {
            return this.f20024e;
        }

        @Override // p281l5.InterfaceC5541c
        /* renamed from: r0 */
        public synchronized void mo22123r0(boolean z6, boolean z7, int i7, int i8, List list) {
            if (z7) {
                throw new UnsupportedOperationException();
            }
            if (this.f20025f) {
                throw new IOException("closed");
            }
            m23246d(z6, i7, list);
        }
    }

    /* renamed from: j */
    public static IllegalArgumentException m23223j(String str, Object... objArr) {
        throw new IllegalArgumentException(String.format(Locale.US, str, objArr));
    }

    /* renamed from: k */
    public static IOException m23224k(String str, Object... objArr) {
        throw new IOException(String.format(Locale.US, str, objArr));
    }

    /* renamed from: l */
    public static int m23225l(int i7, byte b7, short s7) {
        if ((b7 & 8) != 0) {
            i7--;
        }
        if (s7 <= i7) {
            return (short) (i7 - s7);
        }
        throw m23224k("PROTOCOL_ERROR padding %s > remaining length %s", Short.valueOf(s7), Integer.valueOf(i7));
    }

    /* renamed from: m */
    public static int m23226m(InterfaceC3618f interfaceC3618f) {
        return (interfaceC3618f.readByte() & ForkServer.ERROR) | ((interfaceC3618f.readByte() & ForkServer.ERROR) << 16) | ((interfaceC3618f.readByte() & ForkServer.ERROR) << 8);
    }

    /* renamed from: n */
    public static void m23227n(InterfaceC3617e interfaceC3617e, int i7) {
        interfaceC3617e.mo14505A((i7 >>> 16) & 255);
        interfaceC3617e.mo14505A((i7 >>> 8) & 255);
        interfaceC3617e.mo14505A(i7 & 255);
    }

    @Override // p281l5.InterfaceC5548j
    /* renamed from: a */
    public InterfaceC5540b mo23228a(InterfaceC3618f interfaceC3618f, boolean z6) {
        return new c(interfaceC3618f, 4096, z6);
    }

    @Override // p281l5.InterfaceC5548j
    /* renamed from: b */
    public InterfaceC5541c mo23229b(InterfaceC3617e interfaceC3617e, boolean z6) {
        return new d(interfaceC3617e, z6);
    }

    /* renamed from: l5.g$a */
    public static final class a implements InterfaceC3609V {

        /* renamed from: a */
        public final InterfaceC3618f f20007a;

        /* renamed from: b */
        public int f20008b;

        /* renamed from: c */
        public byte f20009c;

        /* renamed from: d */
        public int f20010d;

        /* renamed from: e */
        public int f20011e;

        /* renamed from: f */
        public short f20012f;

        public a(InterfaceC3618f interfaceC3618f) {
            this.f20007a = interfaceC3618f;
        }

        @Override // p206c6.InterfaceC3609V
        /* renamed from: P */
        public long mo14512P(C3616d c3616d, long j7) {
            while (true) {
                int i7 = this.f20011e;
                if (i7 != 0) {
                    long mo14512P = this.f20007a.mo14512P(c3616d, Math.min(j7, i7));
                    if (mo14512P == -1) {
                        return -1L;
                    }
                    this.f20011e -= (int) mo14512P;
                    return mo14512P;
                }
                this.f20007a.skip(this.f20012f);
                this.f20012f = (short) 0;
                if ((this.f20009c & 4) != 0) {
                    return -1L;
                }
                m23230a();
            }
        }

        /* renamed from: a */
        public final void m23230a() {
            int i7 = this.f20010d;
            int m23226m = C5545g.m23226m(this.f20007a);
            this.f20011e = m23226m;
            this.f20008b = m23226m;
            byte readByte = (byte) (this.f20007a.readByte() & ForkServer.ERROR);
            this.f20009c = (byte) (this.f20007a.readByte() & ForkServer.ERROR);
            if (C5545g.f20005a.isLoggable(Level.FINE)) {
                C5545g.f20005a.fine(b.m23232b(true, this.f20010d, this.f20008b, readByte, this.f20009c));
            }
            int readInt = this.f20007a.readInt() & C3643a.e.API_PRIORITY_OTHER;
            this.f20010d = readInt;
            if (readByte != 9) {
                throw C5545g.m23224k("%s != TYPE_CONTINUATION", Byte.valueOf(readByte));
            }
            if (readInt != i7) {
                throw C5545g.m23224k("TYPE_CONTINUATION streamId changed", new Object[0]);
            }
        }

        @Override // p206c6.InterfaceC3609V, java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
        public void close() {
        }
    }
}
