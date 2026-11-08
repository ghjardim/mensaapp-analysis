package p351u0;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.TreeMap;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.tika.metadata.TikaCoreProperties;
import org.apache.tika.utils.StringUtils;
import p050H0.C0547p;
import p178Z2.AbstractC2987A;
import p225f1.AbstractC4240o;
import p232g0.AbstractC4317g;
import p232g0.AbstractC4336z;
import p232g0.C4295A;
import p232g0.C4323m;
import p232g0.C4327q;
import p232g0.C4334x;
import p259j0.AbstractC5324G;
import p259j0.AbstractC5330M;
import p259j0.AbstractC5332a;
import p259j0.AbstractC5346o;
import p343t0.C6426t;
import p351u0.C6589f;
import p351u0.C6590g;

/* renamed from: u0.i */
/* loaded from: classes.dex */
public final class C6592i implements C0547p.a {

    /* renamed from: a */
    public final C6590g f23772a;

    /* renamed from: b */
    public final C6589f f23773b;

    /* renamed from: c */
    public static final Pattern f23748c = Pattern.compile("AVERAGE-BANDWIDTH=(\\d+)\\b");

    /* renamed from: d */
    public static final Pattern f23750d = Pattern.compile("VIDEO=\"(.+?)\"");

    /* renamed from: e */
    public static final Pattern f23752e = Pattern.compile("AUDIO=\"(.+?)\"");

    /* renamed from: f */
    public static final Pattern f23754f = Pattern.compile("SUBTITLES=\"(.+?)\"");

    /* renamed from: n */
    public static final Pattern f23759n = Pattern.compile("CLOSED-CAPTIONS=\"(.+?)\"");

    /* renamed from: o */
    public static final Pattern f23760o = Pattern.compile("[^-]BANDWIDTH=(\\d+)\\b");

    /* renamed from: p */
    public static final Pattern f23761p = Pattern.compile("CHANNELS=\"(.+?)\"");

    /* renamed from: q */
    public static final Pattern f23762q = Pattern.compile("CODECS=\"(.+?)\"");

    /* renamed from: r */
    public static final Pattern f23763r = Pattern.compile("RESOLUTION=(\\d+x\\d+)");

    /* renamed from: s */
    public static final Pattern f23764s = Pattern.compile("FRAME-RATE=([\\d\\.]+)\\b");

    /* renamed from: t */
    public static final Pattern f23765t = Pattern.compile("#EXT-X-TARGETDURATION:(\\d+)\\b");

    /* renamed from: u */
    public static final Pattern f23766u = Pattern.compile("DURATION=([\\d\\.]+)\\b");

    /* renamed from: v */
    public static final Pattern f23767v = Pattern.compile("PART-TARGET=([\\d\\.]+)\\b");

    /* renamed from: w */
    public static final Pattern f23768w = Pattern.compile("#EXT-X-VERSION:(\\d+)\\b");

    /* renamed from: x */
    public static final Pattern f23769x = Pattern.compile("#EXT-X-PLAYLIST-TYPE:(.+)\\b");

    /* renamed from: y */
    public static final Pattern f23770y = Pattern.compile("CAN-SKIP-UNTIL=([\\d\\.]+)\\b");

    /* renamed from: z */
    public static final Pattern f23771z = m27443c("CAN-SKIP-DATERANGES");

    /* renamed from: A */
    public static final Pattern f23720A = Pattern.compile("SKIPPED-SEGMENTS=(\\d+)\\b");

    /* renamed from: B */
    public static final Pattern f23721B = Pattern.compile("[:|,]HOLD-BACK=([\\d\\.]+)\\b");

    /* renamed from: C */
    public static final Pattern f23722C = Pattern.compile("PART-HOLD-BACK=([\\d\\.]+)\\b");

    /* renamed from: D */
    public static final Pattern f23723D = m27443c("CAN-BLOCK-RELOAD");

    /* renamed from: E */
    public static final Pattern f23724E = Pattern.compile("#EXT-X-MEDIA-SEQUENCE:(\\d+)\\b");

    /* renamed from: F */
    public static final Pattern f23725F = Pattern.compile("#EXTINF:([\\d\\.]+)\\b");

    /* renamed from: G */
    public static final Pattern f23726G = Pattern.compile("#EXTINF:[\\d\\.]+\\b,(.+)");

    /* renamed from: H */
    public static final Pattern f23727H = Pattern.compile("LAST-MSN=(\\d+)\\b");

    /* renamed from: I */
    public static final Pattern f23728I = Pattern.compile("LAST-PART=(\\d+)\\b");

    /* renamed from: J */
    public static final Pattern f23729J = Pattern.compile("TIME-OFFSET=(-?[\\d\\.]+)\\b");

    /* renamed from: K */
    public static final Pattern f23730K = Pattern.compile("#EXT-X-BYTERANGE:(\\d+(?:@\\d+)?)\\b");

    /* renamed from: L */
    public static final Pattern f23731L = Pattern.compile("BYTERANGE=\"(\\d+(?:@\\d+)?)\\b\"");

    /* renamed from: M */
    public static final Pattern f23732M = Pattern.compile("BYTERANGE-START=(\\d+)\\b");

    /* renamed from: N */
    public static final Pattern f23733N = Pattern.compile("BYTERANGE-LENGTH=(\\d+)\\b");

    /* renamed from: O */
    public static final Pattern f23734O = Pattern.compile("METHOD=(NONE|AES-128|SAMPLE-AES|SAMPLE-AES-CENC|SAMPLE-AES-CTR)\\s*(?:,|$)");

    /* renamed from: P */
    public static final Pattern f23735P = Pattern.compile("KEYFORMAT=\"(.+?)\"");

    /* renamed from: Q */
    public static final Pattern f23736Q = Pattern.compile("KEYFORMATVERSIONS=\"(.+?)\"");

    /* renamed from: R */
    public static final Pattern f23737R = Pattern.compile("URI=\"(.+?)\"");

    /* renamed from: S */
    public static final Pattern f23738S = Pattern.compile("IV=([^,.*]+)");

    /* renamed from: T */
    public static final Pattern f23739T = Pattern.compile("TYPE=(AUDIO|VIDEO|SUBTITLES|CLOSED-CAPTIONS)");

    /* renamed from: U */
    public static final Pattern f23740U = Pattern.compile("TYPE=(PART|MAP)");

    /* renamed from: V */
    public static final Pattern f23741V = Pattern.compile("LANGUAGE=\"(.+?)\"");

    /* renamed from: W */
    public static final Pattern f23742W = Pattern.compile("NAME=\"(.+?)\"");

    /* renamed from: X */
    public static final Pattern f23743X = Pattern.compile("GROUP-ID=\"(.+?)\"");

    /* renamed from: Y */
    public static final Pattern f23744Y = Pattern.compile("CHARACTERISTICS=\"(.+?)\"");

    /* renamed from: Z */
    public static final Pattern f23745Z = Pattern.compile("INSTREAM-ID=\"((?:CC|SERVICE)\\d+)\"");

    /* renamed from: a0 */
    public static final Pattern f23746a0 = m27443c("AUTOSELECT");

    /* renamed from: b0 */
    public static final Pattern f23747b0 = m27443c("DEFAULT");

    /* renamed from: c0 */
    public static final Pattern f23749c0 = m27443c("FORCED");

    /* renamed from: d0 */
    public static final Pattern f23751d0 = m27443c("INDEPENDENT");

    /* renamed from: e0 */
    public static final Pattern f23753e0 = m27443c("GAP");

    /* renamed from: f0 */
    public static final Pattern f23755f0 = m27443c("PRECISE");

    /* renamed from: g0 */
    public static final Pattern f23756g0 = Pattern.compile("VALUE=\"(.+?)\"");

    /* renamed from: h0 */
    public static final Pattern f23757h0 = Pattern.compile("IMPORT=\"(.+?)\"");

    /* renamed from: i0 */
    public static final Pattern f23758i0 = Pattern.compile("\\{\\$([a-zA-Z0-9\\-_]+)\\}");

    /* renamed from: u0.i$a */
    public static final class a extends IOException {
    }

    /* renamed from: u0.i$b */
    public static class b {

        /* renamed from: a */
        public final BufferedReader f23774a;

        /* renamed from: b */
        public final Queue f23775b;

        /* renamed from: c */
        public String f23776c;

        public b(Queue queue, BufferedReader bufferedReader) {
            this.f23775b = queue;
            this.f23774a = bufferedReader;
        }

        /* renamed from: a */
        public boolean m27467a() {
            String trim;
            if (this.f23776c != null) {
                return true;
            }
            if (!this.f23775b.isEmpty()) {
                this.f23776c = (String) AbstractC5332a.m21800e((String) this.f23775b.poll());
                return true;
            }
            do {
                String readLine = this.f23774a.readLine();
                this.f23776c = readLine;
                if (readLine == null) {
                    return false;
                }
                trim = readLine.trim();
                this.f23776c = trim;
            } while (trim.isEmpty());
            return true;
        }

        /* renamed from: b */
        public String m27468b() {
            if (!m27467a()) {
                throw new NoSuchElementException();
            }
            String str = this.f23776c;
            this.f23776c = null;
            return str;
        }
    }

    public C6592i() {
        this(C6590g.f23696n, null);
    }

    /* renamed from: A */
    public static long m27439A(String str, Pattern pattern) {
        return new BigDecimal(m27465z(str, pattern, Collections.emptyMap())).multiply(new BigDecimal(1000000L)).longValue();
    }

    /* renamed from: B */
    public static String m27440B(String str, Map map) {
        Matcher matcher = f23758i0.matcher(str);
        StringBuffer stringBuffer = new StringBuffer();
        while (matcher.find()) {
            String group = matcher.group(1);
            if (map.containsKey(group)) {
                matcher.appendReplacement(stringBuffer, Matcher.quoteReplacement((String) map.get(group)));
            }
        }
        matcher.appendTail(stringBuffer);
        return stringBuffer.toString();
    }

    /* renamed from: C */
    public static int m27441C(BufferedReader bufferedReader, boolean z6, int i7) {
        while (i7 != -1 && Character.isWhitespace(i7) && (z6 || !AbstractC5330M.m21678D0(i7))) {
            i7 = bufferedReader.read();
        }
        return i7;
    }

    /* renamed from: b */
    public static boolean m27442b(BufferedReader bufferedReader) {
        int read = bufferedReader.read();
        if (read == 239) {
            if (bufferedReader.read() != 187 || bufferedReader.read() != 191) {
                return false;
            }
            read = bufferedReader.read();
        }
        int m27441C = m27441C(bufferedReader, true, read);
        for (int i7 = 0; i7 < 7; i7++) {
            if (m27441C != "#EXTM3U".charAt(i7)) {
                return false;
            }
            m27441C = bufferedReader.read();
        }
        return AbstractC5330M.m21678D0(m27441C(bufferedReader, false, m27441C));
    }

    /* renamed from: c */
    public static Pattern m27443c(String str) {
        return Pattern.compile(str + "=(NO|YES)");
    }

    /* renamed from: d */
    public static C4323m m27444d(String str, C4323m.b[] bVarArr) {
        C4323m.b[] bVarArr2 = new C4323m.b[bVarArr.length];
        for (int i7 = 0; i7 < bVarArr.length; i7++) {
            bVarArr2[i7] = bVarArr[i7].m18174b(null);
        }
        return new C4323m(str, bVarArr2);
    }

    /* renamed from: e */
    public static String m27445e(long j7, String str, String str2) {
        if (str == null) {
            return null;
        }
        return str2 != null ? str2 : Long.toHexString(j7);
    }

    /* renamed from: f */
    public static C6590g.b m27446f(ArrayList arrayList, String str) {
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            C6590g.b bVar = (C6590g.b) arrayList.get(i7);
            if (str.equals(bVar.f23714d)) {
                return bVar;
            }
        }
        return null;
    }

    /* renamed from: g */
    public static C6590g.b m27447g(ArrayList arrayList, String str) {
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            C6590g.b bVar = (C6590g.b) arrayList.get(i7);
            if (str.equals(bVar.f23715e)) {
                return bVar;
            }
        }
        return null;
    }

    /* renamed from: h */
    public static C6590g.b m27448h(ArrayList arrayList, String str) {
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            C6590g.b bVar = (C6590g.b) arrayList.get(i7);
            if (str.equals(bVar.f23713c)) {
                return bVar;
            }
        }
        return null;
    }

    /* renamed from: j */
    public static double m27449j(String str, Pattern pattern) {
        return Double.parseDouble(m27465z(str, pattern, Collections.emptyMap()));
    }

    /* renamed from: k */
    public static C4323m.b m27450k(String str, String str2, Map map) {
        String m27460u = m27460u(str, f23736Q, "1", map);
        if ("urn:uuid:edef8ba9-79d6-4ace-a3c8-27dcd51d21ed".equals(str2)) {
            String m27465z = m27465z(str, f23737R, map);
            return new C4323m.b(AbstractC4317g.f15030d, "video/mp4", Base64.decode(m27465z.substring(m27465z.indexOf(44)), 0));
        }
        if ("com.widevine".equals(str2)) {
            return new C4323m.b(AbstractC4317g.f15030d, "hls", AbstractC5330M.m21773s0(str));
        }
        if (!"com.microsoft.playready".equals(str2) || !"1".equals(m27460u)) {
            return null;
        }
        String m27465z2 = m27465z(str, f23737R, map);
        byte[] decode = Base64.decode(m27465z2.substring(m27465z2.indexOf(44)), 0);
        UUID uuid = AbstractC4317g.f15031e;
        return new C4323m.b(uuid, "video/mp4", AbstractC4240o.m17805a(uuid, decode));
    }

    /* renamed from: l */
    public static String m27451l(String str) {
        return ("SAMPLE-AES-CENC".equals(str) || "SAMPLE-AES-CTR".equals(str)) ? "cenc" : "cbcs";
    }

    /* renamed from: m */
    public static int m27452m(String str, Pattern pattern) {
        return Integer.parseInt(m27465z(str, pattern, Collections.emptyMap()));
    }

    /* renamed from: n */
    public static long m27453n(String str, Pattern pattern) {
        return Long.parseLong(m27465z(str, pattern, Collections.emptyMap()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: o */
    public static C6589f m27454o(C6590g c6590g, C6589f c6589f, b bVar, String str) {
        ArrayList arrayList;
        ArrayList arrayList2;
        String str2;
        long j7;
        boolean z6;
        int i7;
        C6589f.b bVar2;
        int i8;
        String m27461v;
        long j8;
        long j9;
        long j10;
        long j11;
        boolean z7;
        Object obj;
        C6590g c6590g2 = c6590g;
        C6589f c6589f2 = c6589f;
        boolean z8 = c6590g2.f23719c;
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        ArrayList arrayList6 = new ArrayList();
        C6589f.f fVar = new C6589f.f(-9223372036854775807L, false, -9223372036854775807L, -9223372036854775807L, false);
        TreeMap treeMap = new TreeMap();
        boolean z9 = false;
        String str3 = StringUtils.EMPTY;
        boolean z10 = z8;
        C6589f.f fVar2 = fVar;
        int i9 = 0;
        boolean z11 = false;
        boolean z12 = false;
        int i10 = 0;
        boolean z13 = false;
        boolean z14 = false;
        int i11 = 0;
        boolean z15 = false;
        String str4 = str3;
        String str5 = null;
        long j12 = -9223372036854775807L;
        long j13 = 0;
        long j14 = 0;
        int i12 = 1;
        long j15 = -9223372036854775807L;
        long j16 = -9223372036854775807L;
        C4323m c4323m = null;
        long j17 = 0;
        Object obj2 = null;
        long j18 = 0;
        long j19 = -1;
        String str6 = null;
        String str7 = null;
        long j20 = 0;
        long j21 = 0;
        C6589f.d dVar = null;
        long j22 = 0;
        long j23 = 0;
        ArrayList arrayList7 = arrayList4;
        C6589f.b bVar3 = null;
        while (bVar.m27467a()) {
            String m27468b = bVar.m27468b();
            if (m27468b.startsWith("#EXT")) {
                arrayList6.add(m27468b);
            }
            if (m27468b.startsWith("#EXT-X-PLAYLIST-TYPE")) {
                String m27465z = m27465z(m27468b, f23769x, hashMap);
                if ("VOD".equals(m27465z)) {
                    i9 = 1;
                } else if ("EVENT".equals(m27465z)) {
                    i9 = 2;
                }
            } else if (m27468b.equals("#EXT-X-I-FRAMES-ONLY")) {
                z15 = true;
            } else if (m27468b.startsWith("#EXT-X-START")) {
                j12 = (long) (m27449j(m27468b, f23729J) * 1000000.0d);
                z11 = m27456q(m27468b, f23755f0, z9);
            } else if (m27468b.startsWith("#EXT-X-SERVER-CONTROL")) {
                fVar2 = m27464y(m27468b);
            } else if (m27468b.startsWith("#EXT-X-PART-INF")) {
                j16 = (long) (m27449j(m27468b, f23767v) * 1000000.0d);
            } else if (m27468b.startsWith("#EXT-X-MAP")) {
                String m27465z2 = m27465z(m27468b, f23737R, hashMap);
                String m27461v2 = m27461v(m27468b, f23731L, hashMap);
                if (m27461v2 != null) {
                    String[] m21737e1 = AbstractC5330M.m21737e1(m27461v2, "@");
                    j19 = Long.parseLong(m21737e1[z9 ? 1 : 0]);
                    if (m21737e1.length > 1) {
                        j17 = Long.parseLong(m21737e1[1]);
                    }
                }
                if (j19 == -1) {
                    j17 = 0;
                }
                String str8 = str6;
                if (str5 != null && str8 == null) {
                    throw C4295A.m17945c("The encryption IV attribute must be present when an initialization segment is encrypted with METHOD=AES-128.", null);
                }
                dVar = new C6589f.d(m27465z2, j17, j19, str5, str8);
                if (j19 != -1) {
                    j17 += j19;
                }
                str6 = str8;
                j19 = -1;
            } else {
                String str9 = str6;
                if (m27468b.startsWith("#EXT-X-TARGETDURATION")) {
                    j15 = 1000000 * m27452m(m27468b, f23765t);
                } else {
                    if (m27468b.startsWith("#EXT-X-MEDIA-SEQUENCE")) {
                        j21 = m27453n(m27468b, f23724E);
                        str6 = str9;
                        j14 = j21;
                    } else if (m27468b.startsWith("#EXT-X-VERSION")) {
                        i12 = m27452m(m27468b, f23768w);
                    } else {
                        if (m27468b.startsWith("#EXT-X-DEFINE")) {
                            String m27461v3 = m27461v(m27468b, f23757h0, hashMap);
                            if (m27461v3 != null) {
                                String str10 = (String) c6590g2.f23705l.get(m27461v3);
                                if (str10 != null) {
                                    hashMap.put(m27461v3, str10);
                                }
                            } else {
                                hashMap.put(m27465z(m27468b, f23742W, hashMap), m27465z(m27468b, f23756g0, hashMap));
                            }
                            arrayList = arrayList7;
                            arrayList2 = arrayList6;
                            str2 = str7;
                            j7 = j21;
                            z6 = false;
                            i7 = i9;
                        } else if (m27468b.startsWith("#EXTINF")) {
                            j22 = m27439A(m27468b, f23725F);
                            str4 = m27460u(m27468b, f23726G, str3, hashMap);
                        } else {
                            String str11 = str3;
                            if (m27468b.startsWith("#EXT-X-SKIP")) {
                                int m27452m = m27452m(m27468b, f23720A);
                                AbstractC5332a.m21802g(c6589f2 != null && arrayList3.isEmpty());
                                int i13 = (int) (j14 - ((C6589f) AbstractC5330M.m21747i(c6589f)).f23661k);
                                int i14 = m27452m + i13;
                                if (i13 < 0 || i14 > c6589f2.f23668r.size()) {
                                    throw new a();
                                }
                                str3 = str11;
                                String str12 = str9;
                                long j24 = j20;
                                while (i13 < i14) {
                                    C6589f.d dVar2 = (C6589f.d) c6589f2.f23668r.get(i13);
                                    ArrayList arrayList8 = arrayList7;
                                    ArrayList arrayList9 = arrayList6;
                                    if (j14 != c6589f2.f23661k) {
                                        dVar2 = dVar2.m27430f(j24, (c6589f2.f23660j - i10) + dVar2.f23683d);
                                    }
                                    arrayList3.add(dVar2);
                                    j24 += dVar2.f23682c;
                                    long j25 = dVar2.f23689q;
                                    if (j25 != -1) {
                                        i8 = i14;
                                        j17 = dVar2.f23688p + j25;
                                    } else {
                                        i8 = i14;
                                    }
                                    int i15 = dVar2.f23683d;
                                    C6589f.d dVar3 = dVar2.f23681b;
                                    C4323m c4323m2 = dVar2.f23685f;
                                    String str13 = dVar2.f23686n;
                                    String str14 = dVar2.f23687o;
                                    if (str14 == null || !str14.equals(Long.toHexString(j21))) {
                                        str12 = dVar2.f23687o;
                                    }
                                    j21++;
                                    i13++;
                                    c6589f2 = c6589f;
                                    obj2 = c4323m2;
                                    str5 = str13;
                                    j18 = j24;
                                    i14 = i8;
                                    i11 = i15;
                                    dVar = dVar3;
                                    arrayList7 = arrayList8;
                                    arrayList6 = arrayList9;
                                }
                                c6590g2 = c6590g;
                                c6589f2 = c6589f;
                                j20 = j24;
                                str6 = str12;
                            } else {
                                ArrayList arrayList10 = arrayList7;
                                arrayList2 = arrayList6;
                                str3 = str11;
                                if (m27468b.startsWith("#EXT-X-KEY")) {
                                    String m27465z3 = m27465z(m27468b, f23734O, hashMap);
                                    String m27460u = m27460u(m27468b, f23735P, "identity", hashMap);
                                    if ("NONE".equals(m27465z3)) {
                                        treeMap.clear();
                                        m27461v = null;
                                        str5 = null;
                                    } else {
                                        m27461v = m27461v(m27468b, f23738S, hashMap);
                                        if (!"identity".equals(m27460u)) {
                                            String str15 = str7;
                                            str7 = str15 == null ? m27451l(m27465z3) : str15;
                                            C4323m.b m27450k = m27450k(m27468b, m27460u, hashMap);
                                            if (m27450k != null) {
                                                treeMap.put(m27460u, m27450k);
                                                str5 = null;
                                            }
                                        } else if ("AES-128".equals(m27465z3)) {
                                            str5 = m27465z(m27468b, f23737R, hashMap);
                                            c6590g2 = c6590g;
                                            c6589f2 = c6589f;
                                            str6 = m27461v;
                                        }
                                        str5 = null;
                                        c6590g2 = c6590g;
                                        c6589f2 = c6589f;
                                        str6 = m27461v;
                                    }
                                    obj2 = str5;
                                    c6590g2 = c6590g;
                                    c6589f2 = c6589f;
                                    str6 = m27461v;
                                } else {
                                    String str16 = str7;
                                    if (m27468b.startsWith("#EXT-X-BYTERANGE")) {
                                        String[] m21737e12 = AbstractC5330M.m21737e1(m27465z(m27468b, f23730K, hashMap), "@");
                                        j19 = Long.parseLong(m21737e12[0]);
                                        if (m21737e12.length > 1) {
                                            j17 = Long.parseLong(m21737e12[1]);
                                        }
                                    } else if (m27468b.startsWith("#EXT-X-DISCONTINUITY-SEQUENCE")) {
                                        i10 = Integer.parseInt(m27468b.substring(m27468b.indexOf(58) + 1));
                                        c6590g2 = c6590g;
                                        c6589f2 = c6589f;
                                        str7 = str16;
                                        str6 = str9;
                                        arrayList7 = arrayList10;
                                        arrayList6 = arrayList2;
                                        z9 = false;
                                        z12 = true;
                                    } else if (m27468b.equals("#EXT-X-DISCONTINUITY")) {
                                        i11++;
                                    } else {
                                        if (m27468b.startsWith("#EXT-X-PROGRAM-DATE-TIME")) {
                                            if (j13 == 0) {
                                                j13 = AbstractC5330M.m21692K0(AbstractC5330M.m21706R0(m27468b.substring(m27468b.indexOf(58) + 1))) - j20;
                                            } else {
                                                i7 = i9;
                                                str2 = str16;
                                            }
                                        } else if (m27468b.equals("#EXT-X-GAP")) {
                                            c6590g2 = c6590g;
                                            c6589f2 = c6589f;
                                            str7 = str16;
                                            str6 = str9;
                                            arrayList7 = arrayList10;
                                            arrayList6 = arrayList2;
                                            z9 = false;
                                            z14 = true;
                                        } else if (m27468b.equals("#EXT-X-INDEPENDENT-SEGMENTS")) {
                                            c6590g2 = c6590g;
                                            c6589f2 = c6589f;
                                            str7 = str16;
                                            str6 = str9;
                                            arrayList7 = arrayList10;
                                            arrayList6 = arrayList2;
                                            z9 = false;
                                            z10 = true;
                                        } else if (m27468b.equals("#EXT-X-ENDLIST")) {
                                            c6590g2 = c6590g;
                                            c6589f2 = c6589f;
                                            str7 = str16;
                                            str6 = str9;
                                            arrayList7 = arrayList10;
                                            arrayList6 = arrayList2;
                                            z9 = false;
                                            z13 = true;
                                        } else if (m27468b.startsWith("#EXT-X-RENDITION-REPORT")) {
                                            i7 = i9;
                                            str2 = str16;
                                            arrayList5.add(new C6589f.c(Uri.parse(AbstractC5324G.m21665e(str, m27465z(m27468b, f23737R, hashMap))), m27459t(m27468b, f23727H, -1L), m27458s(m27468b, f23728I, -1)));
                                        } else {
                                            i7 = i9;
                                            str2 = str16;
                                            if (!m27468b.startsWith("#EXT-X-PRELOAD-HINT")) {
                                                j7 = j21;
                                                if (m27468b.startsWith("#EXT-X-PART")) {
                                                    String m27445e = m27445e(j7, str5, str9);
                                                    String m27465z4 = m27465z(m27468b, f23737R, hashMap);
                                                    long m27449j = (long) (m27449j(m27468b, f23766u) * 1000000.0d);
                                                    C6589f.b bVar4 = bVar3;
                                                    boolean m27456q = m27456q(m27468b, f23751d0, false) | (z10 && arrayList10.isEmpty());
                                                    boolean m27456q2 = m27456q(m27468b, f23753e0, false);
                                                    String m27461v4 = m27461v(m27468b, f23731L, hashMap);
                                                    if (m27461v4 != null) {
                                                        String[] m21737e13 = AbstractC5330M.m21737e1(m27461v4, "@");
                                                        j9 = Long.parseLong(m21737e13[0]);
                                                        if (m21737e13.length > 1) {
                                                            j23 = Long.parseLong(m21737e13[1]);
                                                        }
                                                        j8 = -1;
                                                    } else {
                                                        j8 = -1;
                                                        j9 = -1;
                                                    }
                                                    if (j9 == j8) {
                                                        j23 = 0;
                                                    }
                                                    if (obj2 == null && !treeMap.isEmpty()) {
                                                        C4323m.b[] bVarArr = (C4323m.b[]) treeMap.values().toArray(new C4323m.b[0]);
                                                        C4323m c4323m3 = new C4323m(str2, bVarArr);
                                                        if (c4323m == null) {
                                                            c4323m = m27444d(str2, bVarArr);
                                                        }
                                                        obj2 = c4323m3;
                                                    }
                                                    arrayList10.add(new C6589f.b(m27465z4, dVar, m27449j, i11, j18, obj2, str5, m27445e, j23, j9, m27456q2, m27456q, false));
                                                    j18 += m27449j;
                                                    if (j9 != j8) {
                                                        j23 += j9;
                                                    }
                                                    c6590g2 = c6590g;
                                                    c6589f2 = c6589f;
                                                    str6 = str9;
                                                    i9 = i7;
                                                    bVar3 = bVar4;
                                                    j21 = j7;
                                                    str7 = str2;
                                                    arrayList7 = arrayList10;
                                                    arrayList6 = arrayList2;
                                                } else {
                                                    bVar2 = bVar3;
                                                    arrayList = arrayList10;
                                                    if (m27468b.startsWith("#")) {
                                                        z6 = false;
                                                        c6590g2 = c6590g;
                                                        str6 = str9;
                                                        i9 = i7;
                                                        bVar3 = bVar2;
                                                        j21 = j7;
                                                        str7 = str2;
                                                        arrayList7 = arrayList;
                                                        arrayList6 = arrayList2;
                                                        z9 = z6;
                                                        c6589f2 = c6589f;
                                                    } else {
                                                        String m27445e2 = m27445e(j7, str5, str9);
                                                        long j26 = j7 + 1;
                                                        String m27440B = m27440B(m27468b, hashMap);
                                                        C6589f.d dVar4 = (C6589f.d) hashMap2.get(m27440B);
                                                        if (j19 == -1) {
                                                            j10 = 0;
                                                        } else {
                                                            if (z15 && dVar == null && dVar4 == null) {
                                                                dVar4 = new C6589f.d(m27440B, 0L, j17, null, null);
                                                                hashMap2.put(m27440B, dVar4);
                                                            }
                                                            j10 = j17;
                                                        }
                                                        if (obj2 != null || treeMap.isEmpty()) {
                                                            j11 = j26;
                                                            z7 = false;
                                                            obj = obj2;
                                                        } else {
                                                            j11 = j26;
                                                            z7 = false;
                                                            C4323m.b[] bVarArr2 = (C4323m.b[]) treeMap.values().toArray(new C4323m.b[0]);
                                                            obj = new C4323m(str2, bVarArr2);
                                                            if (c4323m == null) {
                                                                c4323m = m27444d(str2, bVarArr2);
                                                            }
                                                        }
                                                        arrayList3.add(new C6589f.d(m27440B, dVar != null ? dVar : dVar4, str4, j22, i11, j20, obj, str5, m27445e2, j10, j19, z14, arrayList));
                                                        j18 = j20 + j22;
                                                        arrayList7 = new ArrayList();
                                                        if (j19 != -1) {
                                                            j10 += j19;
                                                        }
                                                        j17 = j10;
                                                        c6590g2 = c6590g;
                                                        z14 = z7;
                                                        str6 = str9;
                                                        obj2 = obj;
                                                        str4 = str3;
                                                        j20 = j18;
                                                        i9 = i7;
                                                        bVar3 = bVar2;
                                                        arrayList6 = arrayList2;
                                                        j19 = -1;
                                                        j22 = 0;
                                                        str7 = str2;
                                                        j21 = j11;
                                                        c6589f2 = c6589f;
                                                        z9 = z14;
                                                    }
                                                }
                                            } else if (bVar3 == null && "PART".equals(m27465z(m27468b, f23740U, hashMap))) {
                                                String m27465z5 = m27465z(m27468b, f23737R, hashMap);
                                                long m27459t = m27459t(m27468b, f23732M, -1L);
                                                long m27459t2 = m27459t(m27468b, f23733N, -1L);
                                                long j27 = j21;
                                                String m27445e3 = m27445e(j27, str5, str9);
                                                if (obj2 == null && !treeMap.isEmpty()) {
                                                    C4323m.b[] bVarArr3 = (C4323m.b[]) treeMap.values().toArray(new C4323m.b[0]);
                                                    C4323m c4323m4 = new C4323m(str2, bVarArr3);
                                                    if (c4323m == null) {
                                                        c4323m = m27444d(str2, bVarArr3);
                                                    }
                                                    obj2 = c4323m4;
                                                }
                                                if (m27459t == -1 || m27459t2 != -1) {
                                                    bVar3 = new C6589f.b(m27465z5, dVar, 0L, i11, j18, obj2, str5, m27445e3, m27459t != -1 ? m27459t : 0L, m27459t2, false, false, true);
                                                }
                                                c6590g2 = c6590g;
                                                c6589f2 = c6589f;
                                                j21 = j27;
                                                str6 = str9;
                                                arrayList7 = arrayList10;
                                                i9 = i7;
                                                arrayList6 = arrayList2;
                                                str7 = str2;
                                            }
                                        }
                                        arrayList = arrayList10;
                                        j7 = j21;
                                        z6 = false;
                                    }
                                    c6590g2 = c6590g;
                                    c6589f2 = c6589f;
                                    str7 = str16;
                                    str6 = str9;
                                }
                                arrayList7 = arrayList10;
                                arrayList6 = arrayList2;
                            }
                        }
                        bVar2 = bVar3;
                        c6590g2 = c6590g;
                        str6 = str9;
                        i9 = i7;
                        bVar3 = bVar2;
                        j21 = j7;
                        str7 = str2;
                        arrayList7 = arrayList;
                        arrayList6 = arrayList2;
                        z9 = z6;
                        c6589f2 = c6589f;
                    }
                    z9 = false;
                }
                str6 = str9;
                z9 = false;
            }
        }
        int i16 = i9;
        C6589f.b bVar5 = bVar3;
        ArrayList arrayList11 = arrayList7;
        ArrayList arrayList12 = arrayList6;
        int i17 = z9 ? 1 : 0;
        HashMap hashMap3 = new HashMap();
        for (int i18 = i17; i18 < arrayList5.size(); i18++) {
            C6589f.c cVar = (C6589f.c) arrayList5.get(i18);
            long j28 = cVar.f23676b;
            if (j28 == -1) {
                j28 = (j14 + arrayList3.size()) - (arrayList11.isEmpty() ? 1L : 0L);
            }
            int i19 = cVar.f23677c;
            if (i19 == -1 && j16 != -9223372036854775807L) {
                i19 = (arrayList11.isEmpty() ? ((C6589f.d) AbstractC2987A.m10751d(arrayList3)).f23679t : arrayList11).size() - 1;
            }
            Uri uri = cVar.f23675a;
            hashMap3.put(uri, new C6589f.c(uri, j28, i19));
        }
        if (bVar5 != null) {
            arrayList11.add(bVar5);
        }
        return new C6589f(i16, str, arrayList12, j12, z11, j13, z12, i10, j14, i12, j15, j16, z10, z13, j13 != 0, c4323m, arrayList3, arrayList11, fVar2, hashMap3);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:84:0x0330. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r10v4, types: [boolean] */
    /* renamed from: p */
    public static C6590g m27455p(b bVar, String str) {
        char c7;
        ArrayList arrayList;
        ArrayList arrayList2;
        String str2;
        ArrayList arrayList3;
        int parseInt;
        String str3;
        int i7;
        String str4;
        int i8;
        ArrayList arrayList4;
        ArrayList arrayList5;
        ArrayList arrayList6;
        ArrayList arrayList7;
        ArrayList arrayList8;
        int i9;
        int i10;
        ArrayList arrayList9;
        ArrayList arrayList10;
        Uri m21666f;
        HashMap hashMap;
        String str5 = str;
        int i11 = 1;
        HashMap hashMap2 = new HashMap();
        HashMap hashMap3 = new HashMap();
        ArrayList arrayList11 = new ArrayList();
        ArrayList arrayList12 = new ArrayList();
        ArrayList arrayList13 = new ArrayList();
        ArrayList arrayList14 = new ArrayList();
        ArrayList arrayList15 = new ArrayList();
        ArrayList arrayList16 = new ArrayList();
        ArrayList arrayList17 = new ArrayList();
        ArrayList arrayList18 = new ArrayList();
        int i12 = 0;
        boolean z6 = false;
        while (true) {
            String str6 = "application/x-mpegURL";
            if (!bVar.m27467a()) {
                HashMap hashMap4 = hashMap2;
                ArrayList arrayList19 = arrayList12;
                ArrayList arrayList20 = arrayList13;
                ArrayList arrayList21 = arrayList14;
                ArrayList arrayList22 = arrayList15;
                ArrayList arrayList23 = arrayList16;
                ArrayList arrayList24 = arrayList17;
                ArrayList arrayList25 = arrayList18;
                ArrayList arrayList26 = new ArrayList();
                HashSet hashSet = new HashSet();
                int i13 = 0;
                while (i13 < arrayList11.size()) {
                    C6590g.b bVar2 = (C6590g.b) arrayList11.get(i13);
                    if (hashSet.add(bVar2.f23711a)) {
                        AbstractC5332a.m21802g(bVar2.f23712b.f15135k == null);
                        i8 = 1;
                        arrayList26.add(bVar2.m27438a(bVar2.f23712b.m18193a().m18257h0(new C4334x(new C6426t(null, null, (List) AbstractC5332a.m21800e((ArrayList) hashMap4.get(bVar2.f23711a))))).m18234K()));
                    } else {
                        i8 = 1;
                    }
                    i13 += i8;
                }
                Uri uri = null;
                ArrayList arrayList27 = null;
                C4327q c4327q = null;
                int i14 = 0;
                while (i14 < arrayList23.size()) {
                    ArrayList arrayList28 = arrayList23;
                    String str7 = (String) arrayList28.get(i14);
                    String m27465z = m27465z(str7, f23743X, hashMap3);
                    String m27465z2 = m27465z(str7, f23742W, hashMap3);
                    C4327q.b m18254e0 = new C4327q.b().m18250a0(m27465z + TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER + m27465z2).m18252c0(m27465z2).m18240Q(str6).m18266q0(m27463x(str7)).m18262m0(m27462w(str7, hashMap3)).m18254e0(m27461v(str7, f23741V, hashMap3));
                    String m27461v = m27461v(str7, f23737R, hashMap3);
                    Uri m21666f2 = m27461v == null ? uri : AbstractC5324G.m21666f(str, m27461v);
                    String str8 = str6;
                    arrayList23 = arrayList28;
                    C4334x c4334x = new C4334x(new C6426t(m27465z, m27465z2, Collections.emptyList()));
                    String m27465z3 = m27465z(str7, f23739T, hashMap3);
                    m27465z3.hashCode();
                    switch (m27465z3.hashCode()) {
                        case -959297733:
                            if (m27465z3.equals("SUBTITLES")) {
                                c7 = 0;
                                break;
                            }
                            c7 = 65535;
                            break;
                        case -333210994:
                            if (m27465z3.equals("CLOSED-CAPTIONS")) {
                                c7 = 1;
                                break;
                            }
                            c7 = 65535;
                            break;
                        case 62628790:
                            if (m27465z3.equals("AUDIO")) {
                                c7 = 2;
                                break;
                            }
                            c7 = 65535;
                            break;
                        case 81665115:
                            if (m27465z3.equals("VIDEO")) {
                                c7 = 3;
                                break;
                            }
                            c7 = 65535;
                            break;
                        default:
                            c7 = 65535;
                            break;
                    }
                    switch (c7) {
                        case 0:
                            arrayList = arrayList20;
                            arrayList2 = arrayList19;
                            C6590g.b m27447g = m27447g(arrayList11, m27465z);
                            if (m27447g != null) {
                                String m21707S = AbstractC5330M.m21707S(m27447g.f23712b.f15134j, 3);
                                m18254e0.m18238O(m21707S);
                                str2 = AbstractC4336z.m18414g(m21707S);
                            } else {
                                str2 = null;
                            }
                            if (str2 == null) {
                                str2 = "text/vtt";
                            }
                            m18254e0.m18264o0(str2).m18257h0(c4334x);
                            if (m21666f2 != null) {
                                C6590g.a aVar = new C6590g.a(m21666f2, m18254e0.m18234K(), m27465z, m27465z2);
                                arrayList3 = arrayList21;
                                arrayList3.add(aVar);
                            } else {
                                arrayList3 = arrayList21;
                                AbstractC5346o.m21867h("HlsPlaylistParser", "EXT-X-MEDIA tag with missing mandatory URI attribute: skipping");
                            }
                            i7 = 1;
                            break;
                        case 1:
                            arrayList = arrayList20;
                            arrayList2 = arrayList19;
                            String m27465z4 = m27465z(str7, f23745Z, hashMap3);
                            if (m27465z4.startsWith("CC")) {
                                parseInt = Integer.parseInt(m27465z4.substring(2));
                                str3 = "application/cea-608";
                            } else {
                                parseInt = Integer.parseInt(m27465z4.substring(7));
                                str3 = "application/cea-708";
                            }
                            if (arrayList27 == null) {
                                arrayList27 = new ArrayList();
                            }
                            m18254e0.m18264o0(str3).m18235L(parseInt);
                            arrayList27.add(m18254e0.m18234K());
                            arrayList3 = arrayList21;
                            i7 = 1;
                            break;
                        case 2:
                            arrayList2 = arrayList19;
                            C6590g.b m27446f = m27446f(arrayList11, m27465z);
                            if (m27446f != null) {
                                String m21707S2 = AbstractC5330M.m21707S(m27446f.f23712b.f15134j, 1);
                                m18254e0.m18238O(m21707S2);
                                str4 = AbstractC4336z.m18414g(m21707S2);
                            } else {
                                str4 = null;
                            }
                            String m27461v2 = m27461v(str7, f23761p, hashMap3);
                            if (m27461v2 != null) {
                                m18254e0.m18237N(Integer.parseInt(AbstractC5330M.m21740f1(m27461v2, "/")[0]));
                                if ("audio/eac3".equals(str4) && m27461v2.endsWith("/JOC")) {
                                    m18254e0.m18238O("ec+3");
                                    str4 = "audio/eac3-joc";
                                }
                            }
                            m18254e0.m18264o0(str4);
                            if (m21666f2 == null) {
                                arrayList = arrayList20;
                                if (m27446f != null) {
                                    c4327q = m18254e0.m18234K();
                                    arrayList3 = arrayList21;
                                    i7 = 1;
                                    break;
                                }
                            } else {
                                m18254e0.m18257h0(c4334x);
                                arrayList = arrayList20;
                                arrayList.add(new C6590g.a(m21666f2, m18254e0.m18234K(), m27465z, m27465z2));
                            }
                            arrayList3 = arrayList21;
                            i7 = 1;
                            break;
                        case 3:
                            C6590g.b m27448h = m27448h(arrayList11, m27465z);
                            if (m27448h != null) {
                                C4327q c4327q2 = m27448h.f23712b;
                                String m21707S3 = AbstractC5330M.m21707S(c4327q2.f15134j, 2);
                                m18254e0.m18238O(m21707S3).m18264o0(AbstractC4336z.m18414g(m21707S3)).m18271v0(c4327q2.f15144t).m18248Y(c4327q2.f15145u).m18247X(c4327q2.f15146v);
                            }
                            if (m21666f2 != null) {
                                m18254e0.m18257h0(c4334x);
                                arrayList2 = arrayList19;
                                arrayList2.add(new C6590g.a(m21666f2, m18254e0.m18234K(), m27465z, m27465z2));
                                arrayList3 = arrayList21;
                                arrayList = arrayList20;
                                i7 = 1;
                                break;
                            }
                        default:
                            arrayList3 = arrayList21;
                            arrayList = arrayList20;
                            arrayList2 = arrayList19;
                            i7 = 1;
                            break;
                    }
                    i14 += i7;
                    arrayList19 = arrayList2;
                    arrayList21 = arrayList3;
                    arrayList20 = arrayList;
                    str6 = str8;
                    uri = null;
                }
                return new C6590g(str, arrayList25, arrayList26, arrayList19, arrayList20, arrayList21, arrayList22, c4327q, z6 ? Collections.emptyList() : arrayList27, i12, hashMap3, arrayList24);
            }
            String m27468b = bVar.m27468b();
            if (m27468b.startsWith("#EXT")) {
                arrayList18.add(m27468b);
            }
            boolean startsWith = m27468b.startsWith("#EXT-X-I-FRAME-STREAM-INF");
            if (m27468b.startsWith("#EXT-X-DEFINE")) {
                hashMap3.put(m27465z(m27468b, f23742W, hashMap3), m27465z(m27468b, f23756g0, hashMap3));
            } else if (m27468b.equals("#EXT-X-INDEPENDENT-SEGMENTS")) {
                i12 = i11;
            } else if (m27468b.startsWith("#EXT-X-MEDIA")) {
                arrayList16.add(m27468b);
            } else if (m27468b.startsWith("#EXT-X-SESSION-KEY")) {
                C4323m.b m27450k = m27450k(m27468b, m27460u(m27468b, f23735P, "identity", hashMap3), hashMap3);
                if (m27450k != null) {
                    String m27451l = m27451l(m27465z(m27468b, f23734O, hashMap3));
                    C4323m.b[] bVarArr = new C4323m.b[i11];
                    bVarArr[0] = m27450k;
                    arrayList17.add(new C4323m(m27451l, bVarArr));
                }
            } else if (m27468b.startsWith("#EXT-X-STREAM-INF") || startsWith) {
                z6 |= m27468b.contains("CLOSED-CAPTIONS=NONE");
                int i15 = startsWith ? 16384 : 0;
                int m27452m = m27452m(m27468b, f23760o);
                arrayList4 = arrayList17;
                arrayList5 = arrayList15;
                int m27458s = m27458s(m27468b, f23748c, -1);
                String m27461v3 = m27461v(m27468b, f23762q, hashMap3);
                arrayList6 = arrayList18;
                String m27461v4 = m27461v(m27468b, f23763r, hashMap3);
                if (m27461v4 != null) {
                    arrayList7 = arrayList14;
                    String[] m21737e1 = AbstractC5330M.m21737e1(m27461v4, "x");
                    i10 = Integer.parseInt(m21737e1[0]);
                    i9 = Integer.parseInt(m21737e1[1]);
                    if (i10 <= 0 || i9 <= 0) {
                        i9 = -1;
                        i10 = -1;
                    }
                    arrayList8 = arrayList13;
                } else {
                    arrayList7 = arrayList14;
                    arrayList8 = arrayList13;
                    i9 = -1;
                    i10 = -1;
                }
                String m27461v5 = m27461v(m27468b, f23764s, hashMap3);
                float parseFloat = m27461v5 != null ? Float.parseFloat(m27461v5) : -1.0f;
                arrayList9 = arrayList12;
                String m27461v6 = m27461v(m27468b, f23750d, hashMap3);
                arrayList10 = arrayList16;
                String m27461v7 = m27461v(m27468b, f23752e, hashMap3);
                HashMap hashMap5 = hashMap2;
                String m27461v8 = m27461v(m27468b, f23754f, hashMap3);
                String m27461v9 = m27461v(m27468b, f23759n, hashMap3);
                if (startsWith) {
                    m21666f = AbstractC5324G.m21666f(str5, m27465z(m27468b, f23737R, hashMap3));
                } else {
                    if (!bVar.m27467a()) {
                        throw C4295A.m17945c("#EXT-X-STREAM-INF must be followed by another line", null);
                    }
                    m21666f = AbstractC5324G.m21666f(str5, m27440B(bVar.m27468b(), hashMap3));
                }
                arrayList11.add(new C6590g.b(m21666f, new C4327q.b().m18249Z(arrayList11.size()).m18240Q("application/x-mpegURL").m18238O(m27461v3).m18236M(m27458s).m18259j0(m27452m).m18271v0(i10).m18248Y(i9).m18247X(parseFloat).m18262m0(i15).m18234K(), m27461v6, m27461v7, m27461v8, m27461v9));
                hashMap = hashMap5;
                ArrayList arrayList29 = (ArrayList) hashMap.get(m21666f);
                if (arrayList29 == null) {
                    arrayList29 = new ArrayList();
                    hashMap.put(m21666f, arrayList29);
                }
                arrayList29.add(new C6426t.b(m27458s, m27452m, m27461v6, m27461v7, m27461v8, m27461v9));
                hashMap2 = hashMap;
                arrayList17 = arrayList4;
                arrayList15 = arrayList5;
                arrayList18 = arrayList6;
                arrayList14 = arrayList7;
                arrayList13 = arrayList8;
                arrayList12 = arrayList9;
                arrayList16 = arrayList10;
                i11 = 1;
                str5 = str;
            }
            hashMap = hashMap2;
            arrayList9 = arrayList12;
            arrayList8 = arrayList13;
            arrayList7 = arrayList14;
            arrayList5 = arrayList15;
            arrayList10 = arrayList16;
            arrayList4 = arrayList17;
            arrayList6 = arrayList18;
            hashMap2 = hashMap;
            arrayList17 = arrayList4;
            arrayList15 = arrayList5;
            arrayList18 = arrayList6;
            arrayList14 = arrayList7;
            arrayList13 = arrayList8;
            arrayList12 = arrayList9;
            arrayList16 = arrayList10;
            i11 = 1;
            str5 = str;
        }
    }

    /* renamed from: q */
    public static boolean m27456q(String str, Pattern pattern, boolean z6) {
        Matcher matcher = pattern.matcher(str);
        return matcher.find() ? "YES".equals(matcher.group(1)) : z6;
    }

    /* renamed from: r */
    public static double m27457r(String str, Pattern pattern, double d7) {
        Matcher matcher = pattern.matcher(str);
        return matcher.find() ? Double.parseDouble((String) AbstractC5332a.m21800e(matcher.group(1))) : d7;
    }

    /* renamed from: s */
    public static int m27458s(String str, Pattern pattern, int i7) {
        Matcher matcher = pattern.matcher(str);
        return matcher.find() ? Integer.parseInt((String) AbstractC5332a.m21800e(matcher.group(1))) : i7;
    }

    /* renamed from: t */
    public static long m27459t(String str, Pattern pattern, long j7) {
        Matcher matcher = pattern.matcher(str);
        return matcher.find() ? Long.parseLong((String) AbstractC5332a.m21800e(matcher.group(1))) : j7;
    }

    /* renamed from: u */
    public static String m27460u(String str, Pattern pattern, String str2, Map map) {
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            str2 = (String) AbstractC5332a.m21800e(matcher.group(1));
        }
        return (map.isEmpty() || str2 == null) ? str2 : m27440B(str2, map);
    }

    /* renamed from: v */
    public static String m27461v(String str, Pattern pattern, Map map) {
        return m27460u(str, pattern, null, map);
    }

    /* renamed from: w */
    public static int m27462w(String str, Map map) {
        String m27461v = m27461v(str, f23744Y, map);
        if (TextUtils.isEmpty(m27461v)) {
            return 0;
        }
        String[] m21737e1 = AbstractC5330M.m21737e1(m27461v, ",");
        int i7 = AbstractC5330M.m21772s(m21737e1, "public.accessibility.describes-video") ? 512 : 0;
        if (AbstractC5330M.m21772s(m21737e1, "public.accessibility.transcribes-spoken-dialog")) {
            i7 |= 4096;
        }
        if (AbstractC5330M.m21772s(m21737e1, "public.accessibility.describes-music-and-sound")) {
            i7 |= 1024;
        }
        return AbstractC5330M.m21772s(m21737e1, "public.easy-to-read") ? i7 | 8192 : i7;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* renamed from: x */
    public static int m27463x(String str) {
        boolean m27456q = m27456q(str, f23747b0, false);
        ?? r02 = m27456q;
        if (m27456q(str, f23749c0, false)) {
            r02 = (m27456q ? 1 : 0) | 2;
        }
        return m27456q(str, f23746a0, false) ? r02 | 4 : r02;
    }

    /* renamed from: y */
    public static C6589f.f m27464y(String str) {
        double m27457r = m27457r(str, f23770y, -9.223372036854776E18d);
        long j7 = m27457r == -9.223372036854776E18d ? -9223372036854775807L : (long) (m27457r * 1000000.0d);
        boolean m27456q = m27456q(str, f23771z, false);
        double m27457r2 = m27457r(str, f23721B, -9.223372036854776E18d);
        long j8 = m27457r2 == -9.223372036854776E18d ? -9223372036854775807L : (long) (m27457r2 * 1000000.0d);
        double m27457r3 = m27457r(str, f23722C, -9.223372036854776E18d);
        return new C6589f.f(j7, m27456q, j8, m27457r3 != -9.223372036854776E18d ? (long) (m27457r3 * 1000000.0d) : -9223372036854775807L, m27456q(str, f23723D, false));
    }

    /* renamed from: z */
    public static String m27465z(String str, Pattern pattern, Map map) {
        String m27461v = m27461v(str, pattern, map);
        if (m27461v != null) {
            return m27461v;
        }
        throw C4295A.m17945c("Couldn't match " + pattern.pattern() + " in " + str, null);
    }

    @Override // p050H0.C0547p.a
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public AbstractC6591h mo175a(Uri uri, InputStream inputStream) {
        String trim;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        ArrayDeque arrayDeque = new ArrayDeque();
        try {
            if (!m27442b(bufferedReader)) {
                throw C4295A.m17945c("Input does not start with the #EXTM3U header.", null);
            }
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    AbstractC5330M.m21759m(bufferedReader);
                    throw C4295A.m17945c("Failed to parse the playlist, could not identify any tags.", null);
                }
                trim = readLine.trim();
                if (!trim.isEmpty()) {
                    if (!trim.startsWith("#EXT-X-STREAM-INF")) {
                        if (trim.startsWith("#EXT-X-TARGETDURATION") || trim.startsWith("#EXT-X-MEDIA-SEQUENCE") || trim.startsWith("#EXTINF") || trim.startsWith("#EXT-X-KEY") || trim.startsWith("#EXT-X-BYTERANGE") || trim.equals("#EXT-X-DISCONTINUITY") || trim.equals("#EXT-X-DISCONTINUITY-SEQUENCE") || trim.equals("#EXT-X-ENDLIST")) {
                            break;
                        }
                        arrayDeque.add(trim);
                    } else {
                        arrayDeque.add(trim);
                        return m27455p(new b(arrayDeque, bufferedReader), uri.toString());
                    }
                }
            }
            arrayDeque.add(trim);
            return m27454o(this.f23772a, this.f23773b, new b(arrayDeque, bufferedReader), uri.toString());
        } finally {
            AbstractC5330M.m21759m(bufferedReader);
        }
    }

    public C6592i(C6590g c6590g, C6589f c6589f) {
        this.f23772a = c6590g;
        this.f23773b = c6589f;
    }
}
