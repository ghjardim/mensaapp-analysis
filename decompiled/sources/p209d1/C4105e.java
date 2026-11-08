package p209d1;

import android.net.Uri;
import android.util.Pair;
import android.util.SparseArray;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import org.apache.tika.pipes.pipesiterator.PipesIterator;
import p078L0.AbstractC0882q;
import p078L0.AbstractC0888w;
import p078L0.C0854L;
import p078L0.C0862U;
import p078L0.C0873h;
import p078L0.InterfaceC0855M;
import p078L0.InterfaceC0861T;
import p078L0.InterfaceC0883r;
import p078L0.InterfaceC0884s;
import p078L0.InterfaceC0885t;
import p078L0.InterfaceC0889x;
import p232g0.AbstractC4317g;
import p232g0.C4295A;
import p232g0.C4318h;
import p232g0.C4323m;
import p249i1.C4531v;
import p249i1.InterfaceC4529t;
import p256j$.util.DesugarCollections;
import p259j0.AbstractC5330M;
import p259j0.AbstractC5332a;
import p259j0.AbstractC5346o;
import p259j0.C5347p;
import p259j0.C5357z;
import p268k0.AbstractC5400d;

/* renamed from: d1.e */
/* loaded from: classes.dex */
public class C4105e implements InterfaceC0883r {

    /* renamed from: e0 */
    public static final InterfaceC0889x f13690e0 = new InterfaceC0889x() { // from class: d1.d
        @Override // p078L0.InterfaceC0889x
        /* renamed from: a */
        public /* synthetic */ InterfaceC0889x mo647a(InterfaceC4529t.a aVar) {
            return AbstractC0888w.m3696c(this, aVar);
        }

        @Override // p078L0.InterfaceC0889x
        /* renamed from: b */
        public final InterfaceC0883r[] mo648b() {
            InterfaceC0883r[] m17233C;
            m17233C = C4105e.m17233C();
            return m17233C;
        }

        @Override // p078L0.InterfaceC0889x
        /* renamed from: c */
        public /* synthetic */ InterfaceC0889x mo649c(boolean z6) {
            return AbstractC0888w.m3695b(this, z6);
        }

        @Override // p078L0.InterfaceC0889x
        /* renamed from: d */
        public /* synthetic */ InterfaceC0883r[] mo650d(Uri uri, Map map) {
            return AbstractC0888w.m3694a(this, uri, map);
        }
    };

    /* renamed from: f0 */
    public static final byte[] f13691f0 = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};

    /* renamed from: g0 */
    public static final byte[] f13692g0 = AbstractC5330M.m21773s0("Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text");

    /* renamed from: h0 */
    public static final byte[] f13693h0 = {68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};

    /* renamed from: i0 */
    public static final byte[] f13694i0 = {87, 69, 66, 86, 84, 84, 10, 10, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 10};

    /* renamed from: j0 */
    public static final UUID f13695j0 = new UUID(72057594037932032L, -9223371306706625679L);

    /* renamed from: k0 */
    public static final Map f13696k0;

    /* renamed from: A */
    public boolean f13697A;

    /* renamed from: B */
    public long f13698B;

    /* renamed from: C */
    public long f13699C;

    /* renamed from: D */
    public long f13700D;

    /* renamed from: E */
    public C5347p f13701E;

    /* renamed from: F */
    public C5347p f13702F;

    /* renamed from: G */
    public boolean f13703G;

    /* renamed from: H */
    public boolean f13704H;

    /* renamed from: I */
    public int f13705I;

    /* renamed from: J */
    public long f13706J;

    /* renamed from: K */
    public long f13707K;

    /* renamed from: L */
    public int f13708L;

    /* renamed from: M */
    public int f13709M;

    /* renamed from: N */
    public int[] f13710N;

    /* renamed from: O */
    public int f13711O;

    /* renamed from: P */
    public int f13712P;

    /* renamed from: Q */
    public int f13713Q;

    /* renamed from: R */
    public int f13714R;

    /* renamed from: S */
    public boolean f13715S;

    /* renamed from: T */
    public long f13716T;

    /* renamed from: U */
    public int f13717U;

    /* renamed from: V */
    public int f13718V;

    /* renamed from: W */
    public int f13719W;

    /* renamed from: X */
    public boolean f13720X;

    /* renamed from: Y */
    public boolean f13721Y;

    /* renamed from: Z */
    public boolean f13722Z;

    /* renamed from: a */
    public final InterfaceC4103c f13723a;

    /* renamed from: a0 */
    public int f13724a0;

    /* renamed from: b */
    public final C4107g f13725b;

    /* renamed from: b0 */
    public byte f13726b0;

    /* renamed from: c */
    public final SparseArray f13727c;

    /* renamed from: c0 */
    public boolean f13728c0;

    /* renamed from: d */
    public final boolean f13729d;

    /* renamed from: d0 */
    public InterfaceC0885t f13730d0;

    /* renamed from: e */
    public final boolean f13731e;

    /* renamed from: f */
    public final InterfaceC4529t.a f13732f;

    /* renamed from: g */
    public final C5357z f13733g;

    /* renamed from: h */
    public final C5357z f13734h;

    /* renamed from: i */
    public final C5357z f13735i;

    /* renamed from: j */
    public final C5357z f13736j;

    /* renamed from: k */
    public final C5357z f13737k;

    /* renamed from: l */
    public final C5357z f13738l;

    /* renamed from: m */
    public final C5357z f13739m;

    /* renamed from: n */
    public final C5357z f13740n;

    /* renamed from: o */
    public final C5357z f13741o;

    /* renamed from: p */
    public final C5357z f13742p;

    /* renamed from: q */
    public ByteBuffer f13743q;

    /* renamed from: r */
    public long f13744r;

    /* renamed from: s */
    public long f13745s;

    /* renamed from: t */
    public long f13746t;

    /* renamed from: u */
    public long f13747u;

    /* renamed from: v */
    public long f13748v;

    /* renamed from: w */
    public c f13749w;

    /* renamed from: x */
    public boolean f13750x;

    /* renamed from: y */
    public int f13751y;

    /* renamed from: z */
    public long f13752z;

    /* renamed from: d1.e$b */
    public final class b implements InterfaceC4102b {
        public b() {
        }

        @Override // p209d1.InterfaceC4102b
        /* renamed from: a */
        public void mo17224a(int i7) {
            C4105e.this.m17258q(i7);
        }

        @Override // p209d1.InterfaceC4102b
        /* renamed from: b */
        public int mo17225b(int i7) {
            return C4105e.this.m17262w(i7);
        }

        @Override // p209d1.InterfaceC4102b
        /* renamed from: c */
        public void mo17226c(int i7, int i8, InterfaceC0884s interfaceC0884s) {
            C4105e.this.m17255n(i7, i8, interfaceC0884s);
        }

        @Override // p209d1.InterfaceC4102b
        /* renamed from: d */
        public boolean mo17227d(int i7) {
            return C4105e.this.m17242B(i7);
        }

        @Override // p209d1.InterfaceC4102b
        /* renamed from: e */
        public void mo17228e(int i7, String str) {
            C4105e.this.m17248J(i7, str);
        }

        @Override // p209d1.InterfaceC4102b
        /* renamed from: f */
        public void mo17229f(int i7, double d7) {
            C4105e.this.m17260t(i7, d7);
        }

        @Override // p209d1.InterfaceC4102b
        /* renamed from: g */
        public void mo17230g(int i7, long j7, long j8) {
            C4105e.this.m17247I(i7, j7, j8);
        }

        @Override // p209d1.InterfaceC4102b
        /* renamed from: h */
        public void mo17231h(int i7, long j7) {
            C4105e.this.m17265z(i7, j7);
        }
    }

    /* renamed from: d1.e$c */
    public static final class c {

        /* renamed from: O */
        public byte[] f13768O;

        /* renamed from: U */
        public C0862U f13774U;

        /* renamed from: V */
        public boolean f13775V;

        /* renamed from: Y */
        public InterfaceC0861T f13778Y;

        /* renamed from: Z */
        public int f13779Z;

        /* renamed from: a */
        public String f13780a;

        /* renamed from: b */
        public String f13781b;

        /* renamed from: c */
        public int f13782c;

        /* renamed from: d */
        public int f13783d;

        /* renamed from: e */
        public int f13784e;

        /* renamed from: f */
        public int f13785f;

        /* renamed from: g */
        public int f13786g;

        /* renamed from: h */
        public boolean f13787h;

        /* renamed from: i */
        public byte[] f13788i;

        /* renamed from: j */
        public InterfaceC0861T.a f13789j;

        /* renamed from: k */
        public byte[] f13790k;

        /* renamed from: l */
        public C4323m f13791l;

        /* renamed from: m */
        public int f13792m = -1;

        /* renamed from: n */
        public int f13793n = -1;

        /* renamed from: o */
        public int f13794o = -1;

        /* renamed from: p */
        public int f13795p = -1;

        /* renamed from: q */
        public int f13796q = -1;

        /* renamed from: r */
        public int f13797r = 0;

        /* renamed from: s */
        public int f13798s = -1;

        /* renamed from: t */
        public float f13799t = 0.0f;

        /* renamed from: u */
        public float f13800u = 0.0f;

        /* renamed from: v */
        public float f13801v = 0.0f;

        /* renamed from: w */
        public byte[] f13802w = null;

        /* renamed from: x */
        public int f13803x = -1;

        /* renamed from: y */
        public boolean f13804y = false;

        /* renamed from: z */
        public int f13805z = -1;

        /* renamed from: A */
        public int f13754A = -1;

        /* renamed from: B */
        public int f13755B = -1;

        /* renamed from: C */
        public int f13756C = PipesIterator.DEFAULT_QUEUE_SIZE;

        /* renamed from: D */
        public int f13757D = 200;

        /* renamed from: E */
        public float f13758E = -1.0f;

        /* renamed from: F */
        public float f13759F = -1.0f;

        /* renamed from: G */
        public float f13760G = -1.0f;

        /* renamed from: H */
        public float f13761H = -1.0f;

        /* renamed from: I */
        public float f13762I = -1.0f;

        /* renamed from: J */
        public float f13763J = -1.0f;

        /* renamed from: K */
        public float f13764K = -1.0f;

        /* renamed from: L */
        public float f13765L = -1.0f;

        /* renamed from: M */
        public float f13766M = -1.0f;

        /* renamed from: N */
        public float f13767N = -1.0f;

        /* renamed from: P */
        public int f13769P = 1;

        /* renamed from: Q */
        public int f13770Q = -1;

        /* renamed from: R */
        public int f13771R = 8000;

        /* renamed from: S */
        public long f13772S = 0;

        /* renamed from: T */
        public long f13773T = 0;

        /* renamed from: W */
        public boolean f13776W = true;

        /* renamed from: X */
        public String f13777X = "eng";

        /* renamed from: k */
        public static Pair m17271k(C5357z c5357z) {
            try {
                c5357z.m21940U(16);
                long m21964w = c5357z.m21964w();
                if (m21964w == 1482049860) {
                    return new Pair("video/divx", null);
                }
                if (m21964w == 859189832) {
                    return new Pair("video/3gpp", null);
                }
                if (m21964w != 826496599) {
                    AbstractC5346o.m21867h("MatroskaExtractor", "Unknown FourCC. Setting mimeType to video/x-unknown");
                    return new Pair("video/x-unknown", null);
                }
                byte[] m21946e = c5357z.m21946e();
                for (int m21947f = c5357z.m21947f() + 20; m21947f < m21946e.length - 4; m21947f++) {
                    if (m21946e[m21947f] == 0 && m21946e[m21947f + 1] == 0 && m21946e[m21947f + 2] == 1 && m21946e[m21947f + 3] == 15) {
                        return new Pair("video/wvc1", Collections.singletonList(Arrays.copyOfRange(m21946e, m21947f, m21946e.length)));
                    }
                }
                throw C4295A.m17943a("Failed to find FourCC VC1 initialization data", null);
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw C4295A.m17943a("Error parsing FourCC private data", null);
            }
        }

        /* renamed from: l */
        public static boolean m17272l(C5357z c5357z) {
            try {
                int m21966y = c5357z.m21966y();
                if (m21966y == 1) {
                    return true;
                }
                if (m21966y != 65534) {
                    return false;
                }
                c5357z.m21939T(24);
                if (c5357z.m21967z() == C4105e.f13695j0.getMostSignificantBits()) {
                    if (c5357z.m21967z() == C4105e.f13695j0.getLeastSignificantBits()) {
                        return true;
                    }
                }
                return false;
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw C4295A.m17943a("Error parsing MS/ACM codec private", null);
            }
        }

        /* renamed from: m */
        public static List m17273m(byte[] bArr) {
            int i7;
            int i8;
            try {
                if (bArr[0] != 2) {
                    throw C4295A.m17943a("Error parsing vorbis codec private", null);
                }
                int i9 = 0;
                int i10 = 1;
                while (true) {
                    i7 = bArr[i10];
                    if ((i7 & 255) != 255) {
                        break;
                    }
                    i9 += 255;
                    i10++;
                }
                int i11 = i10 + 1;
                int i12 = i9 + (i7 & 255);
                int i13 = 0;
                while (true) {
                    i8 = bArr[i11];
                    if ((i8 & 255) != 255) {
                        break;
                    }
                    i13 += 255;
                    i11++;
                }
                int i14 = i11 + 1;
                int i15 = i13 + (i8 & 255);
                if (bArr[i14] != 1) {
                    throw C4295A.m17943a("Error parsing vorbis codec private", null);
                }
                byte[] bArr2 = new byte[i12];
                System.arraycopy(bArr, i14, bArr2, 0, i12);
                int i16 = i14 + i12;
                if (bArr[i16] != 3) {
                    throw C4295A.m17943a("Error parsing vorbis codec private", null);
                }
                int i17 = i16 + i15;
                if (bArr[i17] != 5) {
                    throw C4295A.m17943a("Error parsing vorbis codec private", null);
                }
                byte[] bArr3 = new byte[bArr.length - i17];
                System.arraycopy(bArr, i17, bArr3, 0, bArr.length - i17);
                ArrayList arrayList = new ArrayList(2);
                arrayList.add(bArr2);
                arrayList.add(bArr3);
                return arrayList;
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw C4295A.m17943a("Error parsing vorbis codec private", null);
            }
        }

        /* renamed from: f */
        public final void m17274f() {
            AbstractC5332a.m21800e(this.f13778Y);
        }

        /* renamed from: g */
        public final byte[] m17275g(String str) {
            byte[] bArr = this.f13790k;
            if (bArr != null) {
                return bArr;
            }
            throw C4295A.m17943a("Missing CodecPrivate for codec " + str, null);
        }

        /* renamed from: h */
        public final byte[] m17276h() {
            if (this.f13758E == -1.0f || this.f13759F == -1.0f || this.f13760G == -1.0f || this.f13761H == -1.0f || this.f13762I == -1.0f || this.f13763J == -1.0f || this.f13764K == -1.0f || this.f13765L == -1.0f || this.f13766M == -1.0f || this.f13767N == -1.0f) {
                return null;
            }
            byte[] bArr = new byte[25];
            ByteBuffer order = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
            order.put((byte) 0);
            order.putShort((short) ((this.f13758E * 50000.0f) + 0.5f));
            order.putShort((short) ((this.f13759F * 50000.0f) + 0.5f));
            order.putShort((short) ((this.f13760G * 50000.0f) + 0.5f));
            order.putShort((short) ((this.f13761H * 50000.0f) + 0.5f));
            order.putShort((short) ((this.f13762I * 50000.0f) + 0.5f));
            order.putShort((short) ((this.f13763J * 50000.0f) + 0.5f));
            order.putShort((short) ((this.f13764K * 50000.0f) + 0.5f));
            order.putShort((short) ((this.f13765L * 50000.0f) + 0.5f));
            order.putShort((short) (this.f13766M + 0.5f));
            order.putShort((short) (this.f13767N + 0.5f));
            order.putShort((short) this.f13756C);
            order.putShort((short) this.f13757D);
            return bArr;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Removed duplicated region for block: B:12:0x043f  */
        /* JADX WARN: Removed duplicated region for block: B:17:0x0458  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0467  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x05a4  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x0479  */
        /* JADX WARN: Removed duplicated region for block: B:90:0x045a  */
        /* renamed from: i */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void m17277i(p078L0.InterfaceC0885t r20, int r21) {
            /*
                Method dump skipped, instructions count: 1722
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: p209d1.C4105e.c.m17277i(L0.t, int):void");
        }

        /* renamed from: j */
        public void m17278j() {
            C0862U c0862u = this.f13774U;
            if (c0862u != null) {
                c0862u.m3557a(this.f13778Y, this.f13789j);
            }
        }

        /* renamed from: n */
        public void m17279n() {
            C0862U c0862u = this.f13774U;
            if (c0862u != null) {
                c0862u.m3558b();
            }
        }

        /* renamed from: o */
        public final boolean m17280o(boolean z6) {
            return "A_OPUS".equals(this.f13781b) ? z6 : this.f13785f > 0;
        }
    }

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("htc_video_rotA-000", 0);
        hashMap.put("htc_video_rotA-090", 90);
        hashMap.put("htc_video_rotA-180", 180);
        hashMap.put("htc_video_rotA-270", 270);
        f13696k0 = DesugarCollections.unmodifiableMap(hashMap);
    }

    public C4105e(InterfaceC4529t.a aVar, int i7) {
        this(new C4101a(), i7, aVar);
    }

    /* renamed from: A */
    public static boolean m17232A(String str) {
        str.hashCode();
        switch (str) {
            case "V_MPEG4/ISO/AP":
            case "V_MPEG4/ISO/SP":
            case "A_MS/ACM":
            case "A_TRUEHD":
            case "A_VORBIS":
            case "A_MPEG/L2":
            case "A_MPEG/L3":
            case "V_MS/VFW/FOURCC":
            case "S_DVBSUB":
            case "V_MPEG4/ISO/ASP":
            case "V_MPEG4/ISO/AVC":
            case "S_VOBSUB":
            case "A_DTS/LOSSLESS":
            case "A_AAC":
            case "A_AC3":
            case "A_DTS":
            case "V_AV1":
            case "V_VP8":
            case "V_VP9":
            case "S_HDMV/PGS":
            case "V_THEORA":
            case "A_DTS/EXPRESS":
            case "A_PCM/FLOAT/IEEE":
            case "A_PCM/INT/BIG":
            case "A_PCM/INT/LIT":
            case "S_TEXT/ASS":
            case "V_MPEGH/ISO/HEVC":
            case "S_TEXT/WEBVTT":
            case "S_TEXT/UTF8":
            case "V_MPEG2":
            case "A_EAC3":
            case "A_FLAC":
            case "A_OPUS":
                return true;
            default:
                return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: C */
    public static /* synthetic */ InterfaceC0883r[] m17233C() {
        return new InterfaceC0883r[]{new C4105e(InterfaceC4529t.a.f16172a, 2)};
    }

    /* renamed from: H */
    public static void m17234H(String str, long j7, byte[] bArr) {
        byte[] m17241u;
        int i7;
        str.hashCode();
        switch (str) {
            case "S_TEXT/ASS":
                m17241u = m17241u(j7, "%01d:%02d:%02d:%02d", 10000L);
                i7 = 21;
                break;
            case "S_TEXT/WEBVTT":
                m17241u = m17241u(j7, "%02d:%02d:%02d.%03d", 1000L);
                i7 = 25;
                break;
            case "S_TEXT/UTF8":
                m17241u = m17241u(j7, "%02d:%02d:%02d,%03d", 1000L);
                i7 = 19;
                break;
            default:
                throw new IllegalArgumentException();
        }
        System.arraycopy(m17241u, 0, bArr, i7, m17241u.length);
    }

    /* renamed from: m */
    private void m17239m() {
        AbstractC5332a.m21804i(this.f13730d0);
    }

    /* renamed from: r */
    public static int[] m17240r(int[] iArr, int i7) {
        return iArr == null ? new int[i7] : iArr.length >= i7 ? iArr : new int[Math.max(iArr.length * 2, i7)];
    }

    /* renamed from: u */
    public static byte[] m17241u(long j7, String str, long j8) {
        AbstractC5332a.m21796a(j7 != -9223372036854775807L);
        int i7 = (int) (j7 / 3600000000L);
        long j9 = j7 - (i7 * 3600000000L);
        int i8 = (int) (j9 / 60000000);
        long j10 = j9 - (i8 * 60000000);
        int i9 = (int) (j10 / 1000000);
        return AbstractC5330M.m21773s0(String.format(Locale.US, str, Integer.valueOf(i7), Integer.valueOf(i8), Integer.valueOf(i9), Integer.valueOf((int) ((j10 - (i9 * 1000000)) / j8))));
    }

    /* renamed from: B */
    public boolean m17242B(int i7) {
        return i7 == 357149030 || i7 == 524531317 || i7 == 475249515 || i7 == 374648427;
    }

    /* renamed from: D */
    public final boolean m17243D(C0854L c0854l, long j7) {
        if (this.f13697A) {
            this.f13699C = j7;
            c0854l.f2935a = this.f13698B;
            this.f13697A = false;
            return true;
        }
        if (this.f13750x) {
            long j8 = this.f13699C;
            if (j8 != -1) {
                c0854l.f2935a = j8;
                this.f13699C = -1L;
                return true;
            }
        }
        return false;
    }

    /* renamed from: E */
    public final void m17244E(InterfaceC0884s interfaceC0884s, int i7) {
        if (this.f13735i.m21948g() >= i7) {
            return;
        }
        if (this.f13735i.m21943b() < i7) {
            C5357z c5357z = this.f13735i;
            c5357z.m21944c(Math.max(c5357z.m21943b() * 2, i7));
        }
        interfaceC0884s.readFully(this.f13735i.m21946e(), this.f13735i.m21948g(), i7 - this.f13735i.m21948g());
        this.f13735i.m21938S(i7);
    }

    /* renamed from: F */
    public final void m17245F() {
        this.f13717U = 0;
        this.f13718V = 0;
        this.f13719W = 0;
        this.f13720X = false;
        this.f13721Y = false;
        this.f13722Z = false;
        this.f13724a0 = 0;
        this.f13726b0 = (byte) 0;
        this.f13728c0 = false;
        this.f13738l.m21935P(0);
    }

    /* renamed from: G */
    public final long m17246G(long j7) {
        long j8 = this.f13746t;
        if (j8 != -9223372036854775807L) {
            return AbstractC5330M.m21718X0(j7, j8, 1000L);
        }
        throw C4295A.m17943a("Can't scale timecode prior to timecodeScale being set.", null);
    }

    /* renamed from: I */
    public void m17247I(int i7, long j7, long j8) {
        m17239m();
        if (i7 == 160) {
            this.f13715S = false;
            this.f13716T = 0L;
            return;
        }
        if (i7 == 174) {
            this.f13749w = new c();
            return;
        }
        if (i7 == 187) {
            this.f13703G = false;
            return;
        }
        if (i7 == 19899) {
            this.f13751y = -1;
            this.f13752z = -1L;
            return;
        }
        if (i7 == 20533) {
            m17261v(i7).f13787h = true;
            return;
        }
        if (i7 == 21968) {
            m17261v(i7).f13804y = true;
            return;
        }
        if (i7 == 408125543) {
            long j9 = this.f13745s;
            if (j9 != -1 && j9 != j7) {
                throw C4295A.m17943a("Multiple Segment elements not supported", null);
            }
            this.f13745s = j7;
            this.f13744r = j8;
            return;
        }
        if (i7 == 475249515) {
            this.f13701E = new C5347p();
            this.f13702F = new C5347p();
        } else if (i7 == 524531317 && !this.f13750x) {
            if (this.f13729d && this.f13698B != -1) {
                this.f13697A = true;
            } else {
                this.f13730d0.mo466j(new InterfaceC0855M.b(this.f13748v));
                this.f13750x = true;
            }
        }
    }

    /* renamed from: J */
    public void m17248J(int i7, String str) {
        if (i7 == 134) {
            m17261v(i7).f13781b = str;
            return;
        }
        if (i7 != 17026) {
            if (i7 == 21358) {
                m17261v(i7).f13780a = str;
                return;
            } else {
                if (i7 != 2274716) {
                    return;
                }
                m17261v(i7).f13777X = str;
                return;
            }
        }
        if ("webm".equals(str) || "matroska".equals(str)) {
            return;
        }
        throw C4295A.m17943a("DocType " + str + " not supported", null);
    }

    /* renamed from: K */
    public final int m17249K(InterfaceC0884s interfaceC0884s, c cVar, int i7, boolean z6) {
        int i8;
        if ("S_TEXT/UTF8".equals(cVar.f13781b)) {
            m17250L(interfaceC0884s, f13691f0, i7);
            return m17259s();
        }
        if ("S_TEXT/ASS".equals(cVar.f13781b)) {
            m17250L(interfaceC0884s, f13693h0, i7);
            return m17259s();
        }
        if ("S_TEXT/WEBVTT".equals(cVar.f13781b)) {
            m17250L(interfaceC0884s, f13694i0, i7);
            return m17259s();
        }
        InterfaceC0861T interfaceC0861T = cVar.f13778Y;
        if (!this.f13720X) {
            if (cVar.f13787h) {
                this.f13713Q &= -1073741825;
                if (!this.f13721Y) {
                    interfaceC0884s.readFully(this.f13735i.m21946e(), 0, 1);
                    this.f13717U++;
                    if ((this.f13735i.m21946e()[0] & 128) == 128) {
                        throw C4295A.m17943a("Extension bit is set in signal byte", null);
                    }
                    this.f13726b0 = this.f13735i.m21946e()[0];
                    this.f13721Y = true;
                }
                byte b7 = this.f13726b0;
                if ((b7 & 1) == 1) {
                    boolean z7 = (b7 & 2) == 2;
                    this.f13713Q |= 1073741824;
                    if (!this.f13728c0) {
                        interfaceC0884s.readFully(this.f13740n.m21946e(), 0, 8);
                        this.f13717U += 8;
                        this.f13728c0 = true;
                        this.f13735i.m21946e()[0] = (byte) ((z7 ? 128 : 0) | 8);
                        this.f13735i.m21939T(0);
                        interfaceC0861T.mo560b(this.f13735i, 1, 1);
                        this.f13718V++;
                        this.f13740n.m21939T(0);
                        interfaceC0861T.mo560b(this.f13740n, 8, 1);
                        this.f13718V += 8;
                    }
                    if (z7) {
                        if (!this.f13722Z) {
                            interfaceC0884s.readFully(this.f13735i.m21946e(), 0, 1);
                            this.f13717U++;
                            this.f13735i.m21939T(0);
                            this.f13724a0 = this.f13735i.m21926G();
                            this.f13722Z = true;
                        }
                        int i9 = this.f13724a0 * 4;
                        this.f13735i.m21935P(i9);
                        interfaceC0884s.readFully(this.f13735i.m21946e(), 0, i9);
                        this.f13717U += i9;
                        short s7 = (short) ((this.f13724a0 / 2) + 1);
                        int i10 = (s7 * 6) + 2;
                        ByteBuffer byteBuffer = this.f13743q;
                        if (byteBuffer == null || byteBuffer.capacity() < i10) {
                            this.f13743q = ByteBuffer.allocate(i10);
                        }
                        this.f13743q.position(0);
                        this.f13743q.putShort(s7);
                        int i11 = 0;
                        int i12 = 0;
                        while (true) {
                            i8 = this.f13724a0;
                            if (i11 >= i8) {
                                break;
                            }
                            int m21930K = this.f13735i.m21930K();
                            if (i11 % 2 == 0) {
                                this.f13743q.putShort((short) (m21930K - i12));
                            } else {
                                this.f13743q.putInt(m21930K - i12);
                            }
                            i11++;
                            i12 = m21930K;
                        }
                        int i13 = (i7 - this.f13717U) - i12;
                        if (i8 % 2 == 1) {
                            this.f13743q.putInt(i13);
                        } else {
                            this.f13743q.putShort((short) i13);
                            this.f13743q.putInt(0);
                        }
                        this.f13741o.m21937R(this.f13743q.array(), i10);
                        interfaceC0861T.mo560b(this.f13741o, i10, 1);
                        this.f13718V += i10;
                    }
                }
            } else {
                byte[] bArr = cVar.f13788i;
                if (bArr != null) {
                    this.f13738l.m21937R(bArr, bArr.length);
                }
            }
            if (cVar.m17280o(z6)) {
                this.f13713Q |= 268435456;
                this.f13742p.m21935P(0);
                int m21948g = (this.f13738l.m21948g() + i7) - this.f13717U;
                this.f13735i.m21935P(4);
                this.f13735i.m21946e()[0] = (byte) ((m21948g >> 24) & 255);
                this.f13735i.m21946e()[1] = (byte) ((m21948g >> 16) & 255);
                this.f13735i.m21946e()[2] = (byte) ((m21948g >> 8) & 255);
                this.f13735i.m21946e()[3] = (byte) (m21948g & 255);
                interfaceC0861T.mo560b(this.f13735i, 4, 2);
                this.f13718V += 4;
            }
            this.f13720X = true;
        }
        int m21948g2 = i7 + this.f13738l.m21948g();
        if (!"V_MPEG4/ISO/AVC".equals(cVar.f13781b) && !"V_MPEGH/ISO/HEVC".equals(cVar.f13781b)) {
            if (cVar.f13774U != null) {
                AbstractC5332a.m21802g(this.f13738l.m21948g() == 0);
                cVar.f13774U.m3560d(interfaceC0884s);
            }
            while (true) {
                int i14 = this.f13717U;
                if (i14 >= m21948g2) {
                    break;
                }
                int m17251M = m17251M(interfaceC0884s, interfaceC0861T, m21948g2 - i14);
                this.f13717U += m17251M;
                this.f13718V += m17251M;
            }
        } else {
            byte[] m21946e = this.f13734h.m21946e();
            m21946e[0] = 0;
            m21946e[1] = 0;
            m21946e[2] = 0;
            int i15 = cVar.f13779Z;
            int i16 = 4 - i15;
            while (this.f13717U < m21948g2) {
                int i17 = this.f13719W;
                if (i17 == 0) {
                    m17252N(interfaceC0884s, m21946e, i16, i15);
                    this.f13717U += i15;
                    this.f13734h.m21939T(0);
                    this.f13719W = this.f13734h.m21930K();
                    this.f13733g.m21939T(0);
                    interfaceC0861T.mo564d(this.f13733g, 4);
                    this.f13718V += 4;
                } else {
                    int m17251M2 = m17251M(interfaceC0884s, interfaceC0861T, i17);
                    this.f13717U += m17251M2;
                    this.f13718V += m17251M2;
                    this.f13719W -= m17251M2;
                }
            }
        }
        if ("A_VORBIS".equals(cVar.f13781b)) {
            this.f13736j.m21939T(0);
            interfaceC0861T.mo564d(this.f13736j, 4);
            this.f13718V += 4;
        }
        return m17259s();
    }

    /* renamed from: L */
    public final void m17250L(InterfaceC0884s interfaceC0884s, byte[] bArr, int i7) {
        int length = bArr.length + i7;
        if (this.f13739m.m21943b() < length) {
            this.f13739m.m21936Q(Arrays.copyOf(bArr, length + i7));
        } else {
            System.arraycopy(bArr, 0, this.f13739m.m21946e(), 0, bArr.length);
        }
        interfaceC0884s.readFully(this.f13739m.m21946e(), bArr.length, i7);
        this.f13739m.m21939T(0);
        this.f13739m.m21938S(length);
    }

    /* renamed from: M */
    public final int m17251M(InterfaceC0884s interfaceC0884s, InterfaceC0861T interfaceC0861T, int i7) {
        int m21942a = this.f13738l.m21942a();
        if (m21942a <= 0) {
            return interfaceC0861T.mo558a(interfaceC0884s, i7, false);
        }
        int min = Math.min(i7, m21942a);
        interfaceC0861T.mo564d(this.f13738l, min);
        return min;
    }

    /* renamed from: N */
    public final void m17252N(InterfaceC0884s interfaceC0884s, byte[] bArr, int i7, int i8) {
        int min = Math.min(i8, this.f13738l.m21942a());
        interfaceC0884s.readFully(bArr, i7 + min, i8 - min);
        if (min > 0) {
            this.f13738l.m21953l(bArr, i7, min);
        }
    }

    @Override // p078L0.InterfaceC0883r
    /* renamed from: a */
    public void mo695a(long j7, long j8) {
        this.f13700D = -9223372036854775807L;
        this.f13705I = 0;
        this.f13723a.reset();
        this.f13725b.m17287e();
        m17245F();
        for (int i7 = 0; i7 < this.f13727c.size(); i7++) {
            ((c) this.f13727c.valueAt(i7)).m17279n();
        }
    }

    @Override // p078L0.InterfaceC0883r
    /* renamed from: b */
    public final void mo696b(InterfaceC0885t interfaceC0885t) {
        this.f13730d0 = interfaceC0885t;
        if (this.f13731e) {
            interfaceC0885t = new C4531v(interfaceC0885t, this.f13732f);
        }
        this.f13730d0 = interfaceC0885t;
    }

    @Override // p078L0.InterfaceC0883r
    /* renamed from: d */
    public /* synthetic */ InterfaceC0883r mo697d() {
        return AbstractC0882q.m3688b(this);
    }

    @Override // p078L0.InterfaceC0883r
    /* renamed from: g */
    public /* synthetic */ List mo698g() {
        return AbstractC0882q.m3687a(this);
    }

    @Override // p078L0.InterfaceC0883r
    /* renamed from: h */
    public final int mo699h(InterfaceC0884s interfaceC0884s, C0854L c0854l) {
        this.f13704H = false;
        boolean z6 = true;
        while (z6 && !this.f13704H) {
            z6 = this.f13723a.mo17217a(interfaceC0884s);
            if (z6 && m17243D(c0854l, interfaceC0884s.mo3522u())) {
                return 1;
            }
        }
        if (z6) {
            return 0;
        }
        for (int i7 = 0; i7 < this.f13727c.size(); i7++) {
            c cVar = (c) this.f13727c.valueAt(i7);
            cVar.m17274f();
            cVar.m17278j();
        }
        return -1;
    }

    @Override // p078L0.InterfaceC0883r
    /* renamed from: i */
    public final boolean mo700i(InterfaceC0884s interfaceC0884s) {
        return new C4106f().m17282b(interfaceC0884s);
    }

    /* renamed from: k */
    public final void m17253k(int i7) {
        if (this.f13701E == null || this.f13702F == null) {
            throw C4295A.m17943a("Element " + i7 + " must be in a Cues", null);
        }
    }

    /* renamed from: l */
    public final void m17254l(int i7) {
        if (this.f13749w != null) {
            return;
        }
        throw C4295A.m17943a("Element " + i7 + " must be in a TrackEntry", null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:119:0x0231, code lost:
    
        throw p232g0.C4295A.m17943a("EBML lacing sample size out of range.", null);
     */
    /* renamed from: n */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m17255n(int r22, int r23, p078L0.InterfaceC0884s r24) {
        /*
            Method dump skipped, instructions count: 749
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p209d1.C4105e.m17255n(int, int, L0.s):void");
    }

    /* renamed from: o */
    public final InterfaceC0855M m17256o(C5347p c5347p, C5347p c5347p2) {
        int i7;
        if (this.f13745s == -1 || this.f13748v == -9223372036854775807L || c5347p == null || c5347p.m21875c() == 0 || c5347p2 == null || c5347p2.m21875c() != c5347p.m21875c()) {
            return new InterfaceC0855M.b(this.f13748v);
        }
        int m21875c = c5347p.m21875c();
        int[] iArr = new int[m21875c];
        long[] jArr = new long[m21875c];
        long[] jArr2 = new long[m21875c];
        long[] jArr3 = new long[m21875c];
        int i8 = 0;
        for (int i9 = 0; i9 < m21875c; i9++) {
            jArr3[i9] = c5347p.m21874b(i9);
            jArr[i9] = this.f13745s + c5347p2.m21874b(i9);
        }
        while (true) {
            i7 = m21875c - 1;
            if (i8 >= i7) {
                break;
            }
            int i10 = i8 + 1;
            iArr[i8] = (int) (jArr[i10] - jArr[i8]);
            jArr2[i8] = jArr3[i10] - jArr3[i8];
            i8 = i10;
        }
        iArr[i7] = (int) ((this.f13745s + this.f13744r) - jArr[i7]);
        long j7 = this.f13748v - jArr3[i7];
        jArr2[i7] = j7;
        if (j7 <= 0) {
            AbstractC5346o.m21867h("MatroskaExtractor", "Discarding last cue point with unexpected duration: " + j7);
            iArr = Arrays.copyOf(iArr, i7);
            jArr = Arrays.copyOf(jArr, i7);
            jArr2 = Arrays.copyOf(jArr2, i7);
            jArr3 = Arrays.copyOf(jArr3, i7);
        }
        return new C0873h(iArr, jArr, jArr2, jArr3);
    }

    /* renamed from: p */
    public final void m17257p(c cVar, long j7, int i7, int i8, int i9) {
        C0862U c0862u = cVar.f13774U;
        if (c0862u != null) {
            c0862u.m3559c(cVar.f13778Y, j7, i7, i8, i9, cVar.f13789j);
        } else {
            if ("S_TEXT/UTF8".equals(cVar.f13781b) || "S_TEXT/ASS".equals(cVar.f13781b) || "S_TEXT/WEBVTT".equals(cVar.f13781b)) {
                if (this.f13709M > 1) {
                    AbstractC5346o.m21867h("MatroskaExtractor", "Skipping subtitle sample in laced block.");
                } else {
                    long j8 = this.f13707K;
                    if (j8 == -9223372036854775807L) {
                        AbstractC5346o.m21867h("MatroskaExtractor", "Skipping subtitle sample with no duration.");
                    } else {
                        m17234H(cVar.f13781b, j8, this.f13739m.m21946e());
                        int m21947f = this.f13739m.m21947f();
                        while (true) {
                            if (m21947f >= this.f13739m.m21948g()) {
                                break;
                            }
                            if (this.f13739m.m21946e()[m21947f] == 0) {
                                this.f13739m.m21938S(m21947f);
                                break;
                            }
                            m21947f++;
                        }
                        InterfaceC0861T interfaceC0861T = cVar.f13778Y;
                        C5357z c5357z = this.f13739m;
                        interfaceC0861T.mo564d(c5357z, c5357z.m21948g());
                        i8 += this.f13739m.m21948g();
                    }
                }
            }
            if ((268435456 & i7) != 0) {
                if (this.f13709M > 1) {
                    this.f13742p.m21935P(0);
                } else {
                    int m21948g = this.f13742p.m21948g();
                    cVar.f13778Y.mo560b(this.f13742p, m21948g, 2);
                    i8 += m21948g;
                }
            }
            cVar.f13778Y.mo562c(j7, i7, i8, i9, cVar.f13789j);
        }
        this.f13704H = true;
    }

    /* renamed from: q */
    public void m17258q(int i7) {
        m17239m();
        if (i7 == 160) {
            if (this.f13705I != 2) {
                return;
            }
            c cVar = (c) this.f13727c.get(this.f13711O);
            cVar.m17274f();
            if (this.f13716T > 0 && "A_OPUS".equals(cVar.f13781b)) {
                this.f13742p.m21936Q(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(this.f13716T).array());
            }
            int i8 = 0;
            for (int i9 = 0; i9 < this.f13709M; i9++) {
                i8 += this.f13710N[i9];
            }
            int i10 = 0;
            while (i10 < this.f13709M) {
                long j7 = this.f13706J + ((cVar.f13784e * i10) / PipesIterator.DEFAULT_QUEUE_SIZE);
                int i11 = this.f13713Q;
                if (i10 == 0 && !this.f13715S) {
                    i11 |= 1;
                }
                int i12 = this.f13710N[i10];
                int i13 = i8 - i12;
                m17257p(cVar, j7, i11, i12, i13);
                i10++;
                i8 = i13;
            }
            this.f13705I = 0;
            return;
        }
        if (i7 == 174) {
            c cVar2 = (c) AbstractC5332a.m21804i(this.f13749w);
            String str = cVar2.f13781b;
            if (str == null) {
                throw C4295A.m17943a("CodecId is missing in TrackEntry element", null);
            }
            if (m17232A(str)) {
                cVar2.m17277i(this.f13730d0, cVar2.f13782c);
                this.f13727c.put(cVar2.f13782c, cVar2);
            }
            this.f13749w = null;
            return;
        }
        if (i7 == 19899) {
            int i14 = this.f13751y;
            if (i14 != -1) {
                long j8 = this.f13752z;
                if (j8 != -1) {
                    if (i14 == 475249515) {
                        this.f13698B = j8;
                        return;
                    }
                    return;
                }
            }
            throw C4295A.m17943a("Mandatory element SeekID or SeekPosition not found", null);
        }
        if (i7 == 25152) {
            m17254l(i7);
            c cVar3 = this.f13749w;
            if (cVar3.f13787h) {
                if (cVar3.f13789j == null) {
                    throw C4295A.m17943a("Encrypted Track found but ContentEncKeyID was not found", null);
                }
                cVar3.f13791l = new C4323m(new C4323m.b(AbstractC4317g.f15027a, "video/webm", this.f13749w.f13789j.f2953b));
                return;
            }
            return;
        }
        if (i7 == 28032) {
            m17254l(i7);
            c cVar4 = this.f13749w;
            if (cVar4.f13787h && cVar4.f13788i != null) {
                throw C4295A.m17943a("Combining encryption and compression is not supported", null);
            }
            return;
        }
        if (i7 == 357149030) {
            if (this.f13746t == -9223372036854775807L) {
                this.f13746t = 1000000L;
            }
            long j9 = this.f13747u;
            if (j9 != -9223372036854775807L) {
                this.f13748v = m17246G(j9);
                return;
            }
            return;
        }
        if (i7 == 374648427) {
            if (this.f13727c.size() == 0) {
                throw C4295A.m17943a("No valid tracks were found", null);
            }
            this.f13730d0.mo472q();
        } else {
            if (i7 != 475249515) {
                return;
            }
            if (!this.f13750x) {
                this.f13730d0.mo466j(m17256o(this.f13701E, this.f13702F));
                this.f13750x = true;
            }
            this.f13701E = null;
            this.f13702F = null;
        }
    }

    /* renamed from: s */
    public final int m17259s() {
        int i7 = this.f13718V;
        m17245F();
        return i7;
    }

    /* renamed from: t */
    public void m17260t(int i7, double d7) {
        if (i7 == 181) {
            m17261v(i7).f13771R = (int) d7;
        }
        if (i7 == 17545) {
            this.f13747u = (long) d7;
            return;
        }
        switch (i7) {
            case 21969:
                m17261v(i7).f13758E = (float) d7;
                break;
            case 21970:
                m17261v(i7).f13759F = (float) d7;
                break;
            case 21971:
                m17261v(i7).f13760G = (float) d7;
                break;
            case 21972:
                m17261v(i7).f13761H = (float) d7;
                break;
            case 21973:
                m17261v(i7).f13762I = (float) d7;
                break;
            case 21974:
                m17261v(i7).f13763J = (float) d7;
                break;
            case 21975:
                m17261v(i7).f13764K = (float) d7;
                break;
            case 21976:
                m17261v(i7).f13765L = (float) d7;
                break;
            case 21977:
                m17261v(i7).f13766M = (float) d7;
                break;
            case 21978:
                m17261v(i7).f13767N = (float) d7;
                break;
            default:
                switch (i7) {
                    case 30323:
                        m17261v(i7).f13799t = (float) d7;
                        break;
                    case 30324:
                        m17261v(i7).f13800u = (float) d7;
                        break;
                    case 30325:
                        m17261v(i7).f13801v = (float) d7;
                        break;
                }
        }
    }

    /* renamed from: v */
    public c m17261v(int i7) {
        m17254l(i7);
        return this.f13749w;
    }

    /* renamed from: w */
    public int m17262w(int i7) {
        switch (i7) {
            case 131:
            case 136:
            case 155:
            case 159:
            case 176:
            case 179:
            case 186:
            case 215:
            case 231:
            case 238:
            case 241:
            case 251:
            case 16871:
            case 16980:
            case 17029:
            case 17143:
            case 18401:
            case 18408:
            case 20529:
            case 20530:
            case 21420:
            case 21432:
            case 21680:
            case 21682:
            case 21690:
            case 21930:
            case 21938:
            case 21945:
            case 21946:
            case 21947:
            case 21948:
            case 21949:
            case 21998:
            case 22186:
            case 22203:
            case 25188:
            case 30114:
            case 30321:
            case 2352003:
            case 2807729:
                return 2;
            case 134:
            case 17026:
            case 21358:
            case 2274716:
                return 3;
            case 160:
            case 166:
            case 174:
            case 183:
            case 187:
            case 224:
            case 225:
            case 16868:
            case 18407:
            case 19899:
            case 20532:
            case 20533:
            case 21936:
            case 21968:
            case 25152:
            case 28032:
            case 30113:
            case 30320:
            case 290298740:
            case 357149030:
            case 374648427:
            case 408125543:
            case 440786851:
            case 475249515:
            case 524531317:
                return 1;
            case 161:
            case 163:
            case 165:
            case 16877:
            case 16981:
            case 18402:
            case 21419:
            case 25506:
            case 30322:
                return 4;
            case 181:
            case 17545:
            case 21969:
            case 21970:
            case 21971:
            case 21972:
            case 21973:
            case 21974:
            case 21975:
            case 21976:
            case 21977:
            case 21978:
            case 30323:
            case 30324:
            case 30325:
                return 5;
            default:
                return 0;
        }
    }

    /* renamed from: x */
    public void m17263x(c cVar, InterfaceC0884s interfaceC0884s, int i7) {
        if (cVar.f13786g != 1685485123 && cVar.f13786g != 1685480259) {
            interfaceC0884s.mo3519q(i7);
            return;
        }
        byte[] bArr = new byte[i7];
        cVar.f13768O = bArr;
        interfaceC0884s.readFully(bArr, 0, i7);
    }

    /* renamed from: y */
    public void m17264y(c cVar, int i7, InterfaceC0884s interfaceC0884s, int i8) {
        if (i7 != 4 || !"V_VP9".equals(cVar.f13781b)) {
            interfaceC0884s.mo3519q(i8);
        } else {
            this.f13742p.m21935P(i8);
            interfaceC0884s.readFully(this.f13742p.m21946e(), 0, i8);
        }
    }

    /* renamed from: z */
    public void m17265z(int i7, long j7) {
        if (i7 == 20529) {
            if (j7 == 0) {
                return;
            }
            throw C4295A.m17943a("ContentEncodingOrder " + j7 + " not supported", null);
        }
        if (i7 == 20530) {
            if (j7 == 1) {
                return;
            }
            throw C4295A.m17943a("ContentEncodingScope " + j7 + " not supported", null);
        }
        switch (i7) {
            case 131:
                m17261v(i7).f13783d = (int) j7;
                return;
            case 136:
                m17261v(i7).f13776W = j7 == 1;
                return;
            case 155:
                this.f13707K = m17246G(j7);
                return;
            case 159:
                m17261v(i7).f13769P = (int) j7;
                return;
            case 176:
                m17261v(i7).f13792m = (int) j7;
                return;
            case 179:
                m17253k(i7);
                this.f13701E.m21873a(m17246G(j7));
                return;
            case 186:
                m17261v(i7).f13793n = (int) j7;
                return;
            case 215:
                m17261v(i7).f13782c = (int) j7;
                return;
            case 231:
                this.f13700D = m17246G(j7);
                return;
            case 238:
                this.f13714R = (int) j7;
                return;
            case 241:
                if (this.f13703G) {
                    return;
                }
                m17253k(i7);
                this.f13702F.m21873a(j7);
                this.f13703G = true;
                return;
            case 251:
                this.f13715S = true;
                return;
            case 16871:
                m17261v(i7).f13786g = (int) j7;
                return;
            case 16980:
                if (j7 == 3) {
                    return;
                }
                throw C4295A.m17943a("ContentCompAlgo " + j7 + " not supported", null);
            case 17029:
                if (j7 < 1 || j7 > 2) {
                    throw C4295A.m17943a("DocTypeReadVersion " + j7 + " not supported", null);
                }
                return;
            case 17143:
                if (j7 == 1) {
                    return;
                }
                throw C4295A.m17943a("EBMLReadVersion " + j7 + " not supported", null);
            case 18401:
                if (j7 == 5) {
                    return;
                }
                throw C4295A.m17943a("ContentEncAlgo " + j7 + " not supported", null);
            case 18408:
                if (j7 == 1) {
                    return;
                }
                throw C4295A.m17943a("AESSettingsCipherMode " + j7 + " not supported", null);
            case 21420:
                this.f13752z = j7 + this.f13745s;
                return;
            case 21432:
                int i8 = (int) j7;
                m17254l(i7);
                if (i8 == 0) {
                    this.f13749w.f13803x = 0;
                    return;
                }
                if (i8 == 1) {
                    this.f13749w.f13803x = 2;
                    return;
                } else if (i8 == 3) {
                    this.f13749w.f13803x = 1;
                    return;
                } else {
                    if (i8 != 15) {
                        return;
                    }
                    this.f13749w.f13803x = 3;
                    return;
                }
            case 21680:
                m17261v(i7).f13795p = (int) j7;
                return;
            case 21682:
                m17261v(i7).f13797r = (int) j7;
                return;
            case 21690:
                m17261v(i7).f13796q = (int) j7;
                return;
            case 21930:
                m17261v(i7).f13775V = j7 == 1;
                return;
            case 21938:
                m17254l(i7);
                c cVar = this.f13749w;
                cVar.f13804y = true;
                cVar.f13794o = (int) j7;
                return;
            case 21998:
                m17261v(i7).f13785f = (int) j7;
                return;
            case 22186:
                m17261v(i7).f13772S = j7;
                return;
            case 22203:
                m17261v(i7).f13773T = j7;
                return;
            case 25188:
                m17261v(i7).f13770Q = (int) j7;
                return;
            case 30114:
                this.f13716T = j7;
                return;
            case 30321:
                m17254l(i7);
                int i9 = (int) j7;
                if (i9 == 0) {
                    this.f13749w.f13798s = 0;
                    return;
                }
                if (i9 == 1) {
                    this.f13749w.f13798s = 1;
                    return;
                } else if (i9 == 2) {
                    this.f13749w.f13798s = 2;
                    return;
                } else {
                    if (i9 != 3) {
                        return;
                    }
                    this.f13749w.f13798s = 3;
                    return;
                }
            case 2352003:
                m17261v(i7).f13784e = (int) j7;
                return;
            case 2807729:
                this.f13746t = j7;
                return;
            default:
                switch (i7) {
                    case 21945:
                        m17254l(i7);
                        int i10 = (int) j7;
                        if (i10 == 1) {
                            this.f13749w.f13755B = 2;
                            return;
                        } else {
                            if (i10 != 2) {
                                return;
                            }
                            this.f13749w.f13755B = 1;
                            return;
                        }
                    case 21946:
                        m17254l(i7);
                        int m18144k = C4318h.m18144k((int) j7);
                        if (m18144k != -1) {
                            this.f13749w.f13754A = m18144k;
                            return;
                        }
                        return;
                    case 21947:
                        m17254l(i7);
                        this.f13749w.f13804y = true;
                        int m18143j = C4318h.m18143j((int) j7);
                        if (m18143j != -1) {
                            this.f13749w.f13805z = m18143j;
                            return;
                        }
                        return;
                    case 21948:
                        m17261v(i7).f13756C = (int) j7;
                        return;
                    case 21949:
                        m17261v(i7).f13757D = (int) j7;
                        return;
                    default:
                        return;
                }
        }
    }

    public C4105e(InterfaceC4103c interfaceC4103c, int i7, InterfaceC4529t.a aVar) {
        this.f13745s = -1L;
        this.f13746t = -9223372036854775807L;
        this.f13747u = -9223372036854775807L;
        this.f13748v = -9223372036854775807L;
        this.f13698B = -1L;
        this.f13699C = -1L;
        this.f13700D = -9223372036854775807L;
        this.f13723a = interfaceC4103c;
        interfaceC4103c.mo17218b(new b());
        this.f13732f = aVar;
        this.f13729d = (i7 & 1) == 0;
        this.f13731e = (i7 & 2) == 0;
        this.f13725b = new C4107g();
        this.f13727c = new SparseArray();
        this.f13735i = new C5357z(4);
        this.f13736j = new C5357z(ByteBuffer.allocate(4).putInt(-1).array());
        this.f13737k = new C5357z(4);
        this.f13733g = new C5357z(AbstractC5400d.f19246a);
        this.f13734h = new C5357z(4);
        this.f13738l = new C5357z();
        this.f13739m = new C5357z();
        this.f13740n = new C5357z(8);
        this.f13741o = new C5357z();
        this.f13742p = new C5357z();
        this.f13710N = new int[1];
    }

    @Override // p078L0.InterfaceC0883r
    public final void release() {
    }
}
