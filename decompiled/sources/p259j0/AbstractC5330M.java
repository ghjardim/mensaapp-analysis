package p259j0;

import android.app.UiModeManager;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.LocaleList;
import android.os.Looper;
import android.os.Parcel;
import android.os.SystemClock;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.Display;
import android.view.WindowManager;
import com.google.android.gms.common.api.C3643a;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import java.io.Closeable;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import org.apache.tika.parser.external.ExternalParsersConfigReaderMetKeys;
import org.apache.tika.utils.XMLReaderUtils;
import p171Y2.AbstractC2920c;
import p171Y2.AbstractC2922e;
import p195b3.AbstractC3522b;
import p195b3.AbstractC3525e;
import p203c3.AbstractC3580j;
import p232g0.AbstractC4336z;
import p232g0.C4295A;
import p232g0.C4327q;
import p232g0.InterfaceC4298D;
import p256j$.util.DesugarTimeZone;
import p256j$.util.Objects;
import p272k4.C5410A;
import p272k4.C5413D;

/* renamed from: j0.M */
/* loaded from: classes.dex */
public abstract class AbstractC5330M {

    /* renamed from: a */
    public static final int f18800a;

    /* renamed from: b */
    public static final String f18801b;

    /* renamed from: c */
    public static final String f18802c;

    /* renamed from: d */
    public static final String f18803d;

    /* renamed from: e */
    public static final String f18804e;

    /* renamed from: f */
    public static final byte[] f18805f;

    /* renamed from: g */
    public static final long[] f18806g;

    /* renamed from: h */
    public static final Pattern f18807h;

    /* renamed from: i */
    public static final Pattern f18808i;

    /* renamed from: j */
    public static final Pattern f18809j;

    /* renamed from: k */
    public static final Pattern f18810k;

    /* renamed from: l */
    public static HashMap f18811l;

    /* renamed from: m */
    public static final String[] f18812m;

    /* renamed from: n */
    public static final String[] f18813n;

    /* renamed from: o */
    public static final int[] f18814o;

    /* renamed from: p */
    public static final int[] f18815p;

    /* renamed from: q */
    public static final int[] f18816q;

    static {
        int i7 = Build.VERSION.SDK_INT;
        f18800a = i7;
        String str = Build.DEVICE;
        f18801b = str;
        String str2 = Build.MANUFACTURER;
        f18802c = str2;
        String str3 = Build.MODEL;
        f18803d = str3;
        f18804e = str + ", " + str3 + ", " + str2 + ", " + i7;
        f18805f = new byte[0];
        f18806g = new long[0];
        f18807h = Pattern.compile("(\\d\\d\\d\\d)\\-(\\d\\d)\\-(\\d\\d)[Tt](\\d\\d):(\\d\\d):(\\d\\d)([\\.,](\\d+))?([Zz]|((\\+|\\-)(\\d?\\d):?(\\d\\d)))?");
        f18808i = Pattern.compile("^(-)?P(([0-9]*)Y)?(([0-9]*)M)?(([0-9]*)D)?(T(([0-9]*)H)?(([0-9]*)M)?(([0-9.]*)S)?)?$");
        f18809j = Pattern.compile("%([A-Fa-f0-9]{2})");
        f18810k = Pattern.compile("(?:.*\\.)?isml?(?:/(manifest(.*))?)?", 2);
        f18812m = new String[]{"alb", "sq", "arm", "hy", "baq", "eu", "bur", "my", "tib", "bo", "chi", "zh", "cze", "cs", "dut", "nl", "ger", "de", "gre", "el", "fre", "fr", "geo", "ka", "ice", "is", "mac", "mk", "mao", "mi", "may", "ms", "per", "fa", "rum", "ro", "scc", "hbs-srp", "slo", "sk", "wel", "cy", "id", "ms-ind", "iw", "he", "heb", "he", "ji", "yi", "arb", "ar-arb", "in", "ms-ind", "ind", "ms-ind", "nb", "no-nob", "nob", "no-nob", "nn", "no-nno", "nno", "no-nno", "tw", "ak-twi", "twi", "ak-twi", "bs", "hbs-bos", "bos", "hbs-bos", "hr", "hbs-hrv", "hrv", "hbs-hrv", "sr", "hbs-srp", "srp", "hbs-srp", "cmn", "zh-cmn", "hak", "zh-hak", "nan", "zh-nan", "hsn", "zh-hsn"};
        f18813n = new String[]{"i-lux", "lb", "i-hak", "zh-hak", "i-navajo", "nv", "no-bok", "no-nob", "no-nyn", "no-nno", "zh-guoyu", "zh-cmn", "zh-hakka", "zh-hak", "zh-min-nan", "zh-nan", "zh-xiang", "zh-hsn"};
        f18814o = new int[]{0, 79764919, 159529838, 222504665, 319059676, 398814059, 445009330, 507990021, 638119352, 583659535, 797628118, 726387553, 890018660, 835552979, 1015980042, 944750013, 1276238704, 1221641927, 1167319070, 1095957929, 1595256236, 1540665371, 1452775106, 1381403509, 1780037320, 1859660671, 1671105958, 1733955601, 2031960084, 2111593891, 1889500026, 1952343757, -1742489888, -1662866601, -1851683442, -1788833735, -1960329156, -1880695413, -2103051438, -2040207643, -1104454824, -1159051537, -1213636554, -1284997759, -1389417084, -1444007885, -1532160278, -1603531939, -734892656, -789352409, -575645954, -646886583, -952755380, -1007220997, -827056094, -898286187, -231047128, -151282273, -71779514, -8804623, -515967244, -436212925, -390279782, -327299027, 881225847, 809987520, 1023691545, 969234094, 662832811, 591600412, 771767749, 717299826, 311336399, 374308984, 453813921, 533576470, 25881363, 88864420, 134795389, 214552010, 2023205639, 2086057648, 1897238633, 1976864222, 1804852699, 1867694188, 1645340341, 1724971778, 1587496639, 1516133128, 1461550545, 1406951526, 1302016099, 1230646740, 1142491917, 1087903418, -1398421865, -1469785312, -1524105735, -1578704818, -1079922613, -1151291908, -1239184603, -1293773166, -1968362705, -1905510760, -2094067647, -2014441994, -1716953613, -1654112188, -1876203875, -1796572374, -525066777, -462094256, -382327159, -302564546, -206542021, -143559028, -97365931, -17609246, -960696225, -1031934488, -817968335, -872425850, -709327229, -780559564, -600130067, -654598054, 1762451694, 1842216281, 1619975040, 1682949687, 2047383090, 2127137669, 1938468188, 2001449195, 1325665622, 1271206113, 1183200824, 1111960463, 1543535498, 1489069629, 1434599652, 1363369299, 622672798, 568075817, 748617968, 677256519, 907627842, 853037301, 1067152940, 995781531, 51762726, 131386257, 177728840, 240578815, 269590778, 349224269, 429104020, 491947555, -248556018, -168932423, -122852000, -60002089, -500490030, -420856475, -341238852, -278395381, -685261898, -739858943, -559578920, -630940305, -1004286614, -1058877219, -845023740, -916395085, -1119974018, -1174433591, -1262701040, -1333941337, -1371866206, -1426332139, -1481064244, -1552294533, -1690935098, -1611170447, -1833673816, -1770699233, -2009983462, -1930228819, -2119160460, -2056179517, 1569362073, 1498123566, 1409854455, 1355396672, 1317987909, 1246755826, 1192025387, 1137557660, 2072149281, 2135122070, 1912620623, 1992383480, 1753615357, 1816598090, 1627664531, 1707420964, 295390185, 358241886, 404320391, 483945776, 43990325, 106832002, 186451547, 266083308, 932423249, 861060070, 1041341759, 986742920, 613929101, 542559546, 756411363, 701822548, -978770311, -1050133554, -869589737, -924188512, -693284699, -764654318, -550540341, -605129092, -475935807, -413084042, -366743377, -287118056, -257573603, -194731862, -114850189, -35218492, -1984365303, -1921392450, -2143631769, -2063868976, -1698919467, -1635936670, -1824608069, -1744851700, -1347415887, -1418654458, -1506661409, -1561119128, -1129027987, -1200260134, -1254728445, -1309196108};
        f18815p = new int[]{0, 4129, 8258, 12387, 16516, 20645, 24774, 28903, 33032, 37161, 41290, 45419, 49548, 53677, 57806, 61935};
        f18816q = new int[]{0, 7, 14, 9, 28, 27, 18, 21, 56, 63, 54, 49, 36, 35, 42, 45, 112, 119, 126, 121, 108, 107, 98, 101, 72, 79, 70, 65, 84, 83, 90, 93, 224, 231, 238, 233, 252, 251, 242, 245, 216, 223, 214, 209, 196, 195, 202, 205, 144, 151, 158, 153, 140, 139, 130, 133, 168, 175, 166, 161, 180, 179, 186, 189, 199, 192, 201, 206, 219, 220, 213, 210, 255, 248, 241, 246, 227, 228, 237, 234, 183, 176, 185, 190, 171, 172, 165, 162, 143, 136, 129, 134, 147, 148, 157, 154, 39, 32, 41, 46, 59, 60, 53, 50, 31, 24, 17, 22, 3, 4, 13, 10, 87, 80, 89, 94, 75, 76, 69, 66, 111, 104, 97, 102, 115, 116, 125, 122, 137, 142, 135, 128, 149, 146, 155, 156, 177, 182, 191, 184, 173, 170, 163, 164, 249, 254, 247, 240, 229, 226, 235, 236, 193, 198, 207, 200, 221, 218, 211, 212, 105, 110, 103, 96, 117, 114, 123, 124, 81, 86, 95, 88, 77, 74, 67, 68, 25, 30, 23, 16, 5, 2, 11, 12, 33, 38, 47, 40, 61, 58, 51, 52, 78, 73, 64, 71, 82, 85, 92, 91, 118, 113, 120, 127, 106, 109, 100, 99, 62, 57, 48, 55, 34, 37, 44, 43, 6, 1, 8, 15, 26, 29, 20, 19, 174, 169, 160, 167, 178, 181, 188, 187, 150, 145, 152, 159, 138, ModuleDescriptor.MODULE_VERSION, 132, 131, 222, 217, 208, 215, 194, 197, 204, 203, 230, 225, 232, 239, 250, 253, 244, 243};
    }

    /* renamed from: A */
    public static Handler m21671A() {
        return m21673B(null);
    }

    /* renamed from: A0 */
    public static boolean m21672A0(int i7) {
        return i7 == 21 || i7 == 1342177280 || i7 == 22 || i7 == 1610612736 || i7 == 4;
    }

    /* renamed from: B */
    public static Handler m21673B(Handler.Callback callback) {
        return m21786z((Looper) AbstractC5332a.m21804i(Looper.myLooper()), callback);
    }

    /* renamed from: B0 */
    public static boolean m21674B0(int i7) {
        return i7 == 3 || i7 == 2 || i7 == 268435456 || i7 == 21 || i7 == 1342177280 || i7 == 22 || i7 == 1610612736 || i7 == 4;
    }

    /* renamed from: C */
    public static Handler m21675C() {
        return m21677D(null);
    }

    /* renamed from: C0 */
    public static boolean m21676C0(Context context) {
        int i7 = f18800a;
        if (i7 >= 29 && context.getApplicationInfo().targetSdkVersion >= 29) {
            if (i7 == 30) {
                String str = f18803d;
                if (AbstractC2920c.m10511a(str, "moto g(20)") || AbstractC2920c.m10511a(str, "rmx3231")) {
                }
            }
            return false;
        }
        return true;
    }

    /* renamed from: D */
    public static Handler m21677D(Handler.Callback callback) {
        return m21786z(m21715W(), callback);
    }

    /* renamed from: D0 */
    public static boolean m21678D0(int i7) {
        return i7 == 10 || i7 == 13;
    }

    /* renamed from: E */
    public static HashMap m21679E() {
        String[] iSOLanguages = Locale.getISOLanguages();
        HashMap hashMap = new HashMap(iSOLanguages.length + f18812m.length);
        int i7 = 0;
        for (String str : iSOLanguages) {
            try {
                String iSO3Language = new Locale(str).getISO3Language();
                if (!TextUtils.isEmpty(iSO3Language)) {
                    hashMap.put(iSO3Language, str);
                }
            } catch (MissingResourceException unused) {
            }
        }
        while (true) {
            String[] strArr = f18812m;
            if (i7 >= strArr.length) {
                return hashMap;
            }
            hashMap.put(strArr[i7], strArr[i7 + 1]);
            i7 += 2;
        }
    }

    /* renamed from: E0 */
    public static boolean m21680E0(Uri uri) {
        String scheme = uri.getScheme();
        return TextUtils.isEmpty(scheme) || "file".equals(scheme);
    }

    /* renamed from: F */
    public static long m21681F(long j7, int i7) {
        return m21725a1(j7, i7, 1000000L, RoundingMode.CEILING);
    }

    /* renamed from: F0 */
    public static boolean m21682F0(Context context) {
        UiModeManager uiModeManager = (UiModeManager) context.getApplicationContext().getSystemService("uimode");
        return uiModeManager != null && uiModeManager.getCurrentModeType() == 4;
    }

    /* renamed from: G */
    public static Uri m21683G(Uri uri) {
        String path = uri.getPath();
        if (path == null) {
            return uri;
        }
        Matcher matcher = f18810k.matcher(path);
        return (matcher.matches() && matcher.group(1) == null) ? Uri.withAppendedPath(uri, "Manifest") : uri;
    }

    /* renamed from: G0 */
    public static boolean m21684G0(Context context) {
        return f18800a >= 20 && context.getPackageManager().hasSystemFeature("android.hardware.type.watch");
    }

    /* renamed from: H */
    public static String m21685H(String str, Object... objArr) {
        return String.format(Locale.US, str, objArr);
    }

    /* renamed from: H0 */
    public static /* synthetic */ Thread m21686H0(String str, Runnable runnable) {
        return new Thread(runnable, str);
    }

    /* renamed from: I */
    public static String m21687I(byte[] bArr) {
        return new String(bArr, AbstractC2922e.f9010c);
    }

    /* renamed from: I0 */
    public static int m21688I0(int[] iArr, int i7) {
        for (int i8 = 0; i8 < iArr.length; i8++) {
            if (iArr[i8] == i7) {
                return i8;
            }
        }
        return -1;
    }

    /* renamed from: J */
    public static String m21689J(byte[] bArr, int i7, int i8) {
        return new String(bArr, i7, i8, AbstractC2922e.f9010c);
    }

    /* renamed from: J0 */
    public static String m21690J0(String str) {
        int i7 = 0;
        while (true) {
            String[] strArr = f18813n;
            if (i7 >= strArr.length) {
                return str;
            }
            if (str.startsWith(strArr[i7])) {
                return strArr[i7 + 1] + str.substring(strArr[i7].length());
            }
            i7 += 2;
        }
    }

    /* renamed from: K */
    public static int m21691K(Context context) {
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        if (audioManager == null) {
            return -1;
        }
        return audioManager.generateAudioSessionId();
    }

    /* renamed from: K0 */
    public static long m21692K0(long j7) {
        return (j7 == -9223372036854775807L || j7 == Long.MIN_VALUE) ? j7 : j7 * 1000;
    }

    /* renamed from: L */
    public static int m21693L(int i7) {
        if (i7 == 20) {
            return 30;
        }
        if (i7 == 22) {
            return 31;
        }
        if (i7 == 30) {
            return 34;
        }
        switch (i7) {
            case 2:
            case 3:
                return 3;
            case 4:
            case 5:
            case 6:
                return 21;
            case 7:
            case 8:
                return 23;
            case 9:
            case 10:
            case 11:
            case C5410A.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
                return 28;
            default:
                switch (i7) {
                    case 14:
                        return 25;
                    case 15:
                    case 16:
                    case 17:
                    case C5413D.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                        return 28;
                    default:
                        return C3643a.e.API_PRIORITY_OTHER;
                }
        }
    }

    /* renamed from: L0 */
    public static ExecutorService m21694L0(final String str) {
        return Executors.newSingleThreadExecutor(new ThreadFactory() { // from class: j0.L
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                Thread m21686H0;
                m21686H0 = AbstractC5330M.m21686H0(str, runnable);
                return m21686H0;
            }
        });
    }

    /* renamed from: M */
    public static AudioFormat m21695M(int i7, int i8, int i9) {
        return new AudioFormat.Builder().setSampleRate(i7).setChannelMask(i8).setEncoding(i9).build();
    }

    /* renamed from: M0 */
    public static String m21696M0(String str) {
        if (str == null) {
            return null;
        }
        String replace = str.replace('_', '-');
        if (!replace.isEmpty() && !replace.equals("und")) {
            str = replace;
        }
        String m10515e = AbstractC2920c.m10515e(str);
        String str2 = m21740f1(m10515e, "-")[0];
        if (f18811l == null) {
            f18811l = m21679E();
        }
        String str3 = (String) f18811l.get(str2);
        if (str3 != null) {
            m10515e = str3 + m10515e.substring(str2.length());
            str2 = str3;
        }
        return ("no".equals(str2) || "i".equals(str2) || "zh".equals(str2)) ? m21690J0(m10515e) : m10515e;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0015 A[RETURN] */
    /* renamed from: N */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int m21697N(int r2) {
        /*
            r0 = 6396(0x18fc, float:8.963E-42)
            switch(r2) {
                case 1: goto L28;
                case 2: goto L25;
                case 3: goto L22;
                case 4: goto L1f;
                case 5: goto L1c;
                case 6: goto L19;
                case 7: goto L16;
                case 8: goto L15;
                case 9: goto L5;
                case 10: goto Lb;
                case 11: goto L5;
                case 12: goto L7;
                default: goto L5;
            }
        L5:
            r2 = 0
            return r2
        L7:
            r2 = 743676(0xb58fc, float:1.042112E-39)
            return r2
        Lb:
            int r2 = p259j0.AbstractC5330M.f18800a
            r1 = 32
            if (r2 < r1) goto L15
            r2 = 737532(0xb40fc, float:1.033502E-39)
            return r2
        L15:
            return r0
        L16:
            r2 = 1276(0x4fc, float:1.788E-42)
            return r2
        L19:
            r2 = 252(0xfc, float:3.53E-43)
            return r2
        L1c:
            r2 = 220(0xdc, float:3.08E-43)
            return r2
        L1f:
            r2 = 204(0xcc, float:2.86E-43)
            return r2
        L22:
            r2 = 28
            return r2
        L25:
            r2 = 12
            return r2
        L28:
            r2 = 4
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p259j0.AbstractC5330M.m21697N(int):int");
    }

    /* renamed from: N0 */
    public static Object[] m21698N0(Object[] objArr, Object obj) {
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length + 1);
        copyOf[objArr.length] = obj;
        return m21750j(copyOf);
    }

    /* renamed from: O */
    public static InterfaceC4298D.b m21699O(InterfaceC4298D interfaceC4298D, InterfaceC4298D.b bVar) {
        boolean mo17972j = interfaceC4298D.mo17972j();
        boolean mo17988z = interfaceC4298D.mo17988z();
        boolean mo17979q = interfaceC4298D.mo17979q();
        boolean mo17952C = interfaceC4298D.mo17952C();
        boolean mo17965P = interfaceC4298D.mo17965P();
        boolean mo17957H = interfaceC4298D.mo17957H();
        boolean m18032q = interfaceC4298D.mo17961L().m18032q();
        boolean z6 = false;
        InterfaceC4298D.b.a m17993d = new InterfaceC4298D.b.a().m17991b(bVar).m17993d(4, !mo17972j).m17993d(5, mo17988z && !mo17972j).m17993d(6, mo17979q && !mo17972j).m17993d(7, !m18032q && (mo17979q || !mo17965P || mo17988z) && !mo17972j).m17993d(8, mo17952C && !mo17972j).m17993d(9, !m18032q && (mo17952C || (mo17965P && mo17957H)) && !mo17972j).m17993d(10, !mo17972j).m17993d(11, mo17988z && !mo17972j);
        if (mo17988z && !mo17972j) {
            z6 = true;
        }
        return m17993d.m17993d(12, z6).m17994e();
    }

    /* renamed from: O0 */
    public static Object[] m21700O0(Object[] objArr, Object[] objArr2) {
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length + objArr2.length);
        System.arraycopy(objArr2, 0, copyOf, objArr.length, objArr2.length);
        return copyOf;
    }

    /* renamed from: P */
    public static int m21701P(ByteBuffer byteBuffer, int i7) {
        int i8 = byteBuffer.getInt(i7);
        return byteBuffer.order() == ByteOrder.BIG_ENDIAN ? i8 : Integer.reverseBytes(i8);
    }

    /* renamed from: P0 */
    public static Object[] m21702P0(Object[] objArr, int i7) {
        AbstractC5332a.m21796a(i7 <= objArr.length);
        return Arrays.copyOf(objArr, i7);
    }

    /* renamed from: Q */
    public static byte[] m21703Q(String str) {
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i7 = 0; i7 < length; i7++) {
            int i8 = i7 * 2;
            bArr[i7] = (byte) ((Character.digit(str.charAt(i8), 16) << 4) + Character.digit(str.charAt(i8 + 1), 16));
        }
        return bArr;
    }

    /* renamed from: Q0 */
    public static Object[] m21704Q0(Object[] objArr, int i7, int i8) {
        AbstractC5332a.m21796a(i7 >= 0);
        AbstractC5332a.m21796a(i8 <= objArr.length);
        return Arrays.copyOfRange(objArr, i7, i8);
    }

    /* renamed from: R */
    public static int m21705R(String str, int i7) {
        int i8 = 0;
        for (String str2 : m21743g1(str)) {
            if (i7 == AbstractC4336z.m18420m(str2)) {
                i8++;
            }
        }
        return i8;
    }

    /* renamed from: R0 */
    public static long m21706R0(String str) {
        Matcher matcher = f18807h.matcher(str);
        if (!matcher.matches()) {
            throw C4295A.m17943a("Invalid date/time format: " + str, null);
        }
        int i7 = 0;
        if (matcher.group(9) != null && !matcher.group(9).equalsIgnoreCase("Z")) {
            i7 = (Integer.parseInt(matcher.group(12)) * 60) + Integer.parseInt(matcher.group(13));
            if ("-".equals(matcher.group(11))) {
                i7 *= -1;
            }
        }
        GregorianCalendar gregorianCalendar = new GregorianCalendar(DesugarTimeZone.getTimeZone("GMT"));
        gregorianCalendar.clear();
        gregorianCalendar.set(Integer.parseInt(matcher.group(1)), Integer.parseInt(matcher.group(2)) - 1, Integer.parseInt(matcher.group(3)), Integer.parseInt(matcher.group(4)), Integer.parseInt(matcher.group(5)), Integer.parseInt(matcher.group(6)));
        if (!TextUtils.isEmpty(matcher.group(8))) {
            gregorianCalendar.set(14, new BigDecimal("0." + matcher.group(8)).movePointRight(3).intValue());
        }
        long timeInMillis = gregorianCalendar.getTimeInMillis();
        return i7 != 0 ? timeInMillis - (i7 * 60000) : timeInMillis;
    }

    /* renamed from: S */
    public static String m21707S(String str, int i7) {
        String[] m21743g1 = m21743g1(str);
        if (m21743g1.length == 0) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (String str2 : m21743g1) {
            if (i7 == AbstractC4336z.m18420m(str2)) {
                if (sb.length() > 0) {
                    sb.append(",");
                }
                sb.append(str2);
            }
        }
        if (sb.length() > 0) {
            return sb.toString();
        }
        return null;
    }

    /* renamed from: S0 */
    public static long m21708S0(String str) {
        Matcher matcher = f18808i.matcher(str);
        if (!matcher.matches()) {
            return (long) (Double.parseDouble(str) * 3600.0d * 1000.0d);
        }
        boolean isEmpty = TextUtils.isEmpty(matcher.group(1));
        String group = matcher.group(3);
        double parseDouble = group != null ? Double.parseDouble(group) * 3.1556908E7d : 0.0d;
        String group2 = matcher.group(5);
        double parseDouble2 = parseDouble + (group2 != null ? Double.parseDouble(group2) * 2629739.0d : 0.0d);
        String group3 = matcher.group(7);
        double parseDouble3 = parseDouble2 + (group3 != null ? Double.parseDouble(group3) * 86400.0d : 0.0d);
        String group4 = matcher.group(10);
        double parseDouble4 = parseDouble3 + (group4 != null ? Double.parseDouble(group4) * 3600.0d : 0.0d);
        String group5 = matcher.group(12);
        double parseDouble5 = parseDouble4 + (group5 != null ? Double.parseDouble(group5) * 60.0d : 0.0d);
        String group6 = matcher.group(14);
        long parseDouble6 = (long) ((parseDouble5 + (group6 != null ? Double.parseDouble(group6) : 0.0d)) * 1000.0d);
        return !isEmpty ? -parseDouble6 : parseDouble6;
    }

    /* renamed from: T */
    public static String m21709T(Context context) {
        TelephonyManager telephonyManager;
        if (context != null && (telephonyManager = (TelephonyManager) context.getSystemService("phone")) != null) {
            String networkCountryIso = telephonyManager.getNetworkCountryIso();
            if (!TextUtils.isEmpty(networkCountryIso)) {
                return AbstractC2920c.m10516f(networkCountryIso);
            }
        }
        return AbstractC2920c.m10516f(Locale.getDefault().getCountry());
    }

    /* renamed from: T0 */
    public static boolean m21710T0(Handler handler, Runnable runnable) {
        if (!handler.getLooper().getThread().isAlive()) {
            return false;
        }
        if (handler.getLooper() != Looper.myLooper()) {
            return handler.post(runnable);
        }
        runnable.run();
        return true;
    }

    /* renamed from: U */
    public static Point m21711U(Context context) {
        DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
        Display display = displayManager != null ? displayManager.getDisplay(0) : null;
        if (display == null) {
            display = ((WindowManager) AbstractC5332a.m21800e((WindowManager) context.getSystemService("window"))).getDefaultDisplay();
        }
        return m21713V(context, display);
    }

    /* renamed from: U0 */
    public static boolean m21712U0(Parcel parcel) {
        return parcel.readInt() != 0;
    }

    /* renamed from: V */
    public static Point m21713V(Context context, Display display) {
        if (display.getDisplayId() == 0 && m21682F0(context)) {
            String m21769q0 = f18800a < 28 ? m21769q0("sys.display-size") : m21769q0("vendor.display-size");
            if (!TextUtils.isEmpty(m21769q0)) {
                try {
                    String[] m21737e1 = m21737e1(m21769q0.trim(), "x");
                    if (m21737e1.length == 2) {
                        int parseInt = Integer.parseInt(m21737e1[0]);
                        int parseInt2 = Integer.parseInt(m21737e1[1]);
                        if (parseInt > 0 && parseInt2 > 0) {
                            return new Point(parseInt, parseInt2);
                        }
                    }
                } catch (NumberFormatException unused) {
                }
                AbstractC5346o.m21862c("Util", "Invalid display size: " + m21769q0);
            }
            if ("Sony".equals(f18802c) && f18803d.startsWith("BRAVIA") && context.getPackageManager().hasSystemFeature("com.sony.dtv.hardware.panel.qfhd")) {
                return new Point(3840, 2160);
            }
        }
        Point point = new Point();
        if (f18800a >= 23) {
            m21717X(display, point);
        } else {
            display.getRealSize(point);
        }
        return point;
    }

    /* renamed from: V0 */
    public static void m21714V0(List list, int i7, int i8) {
        if (i7 < 0 || i8 > list.size() || i7 > i8) {
            throw new IllegalArgumentException();
        }
        if (i7 != i8) {
            list.subList(i7, i8).clear();
        }
    }

    /* renamed from: W */
    public static Looper m21715W() {
        Looper myLooper = Looper.myLooper();
        return myLooper != null ? myLooper : Looper.getMainLooper();
    }

    /* renamed from: W0 */
    public static long m21716W0(long j7, int i7) {
        return m21725a1(j7, 1000000L, i7, RoundingMode.FLOOR);
    }

    /* renamed from: X */
    public static void m21717X(Display display, Point point) {
        Display.Mode mode = display.getMode();
        point.x = mode.getPhysicalWidth();
        point.y = mode.getPhysicalHeight();
    }

    /* renamed from: X0 */
    public static long m21718X0(long j7, long j8, long j9) {
        return m21725a1(j7, j8, j9, RoundingMode.FLOOR);
    }

    /* renamed from: Y */
    public static int m21719Y(int i7) {
        if (i7 == 2 || i7 == 4) {
            return 6005;
        }
        if (i7 == 10) {
            return 6004;
        }
        if (i7 == 7) {
            return 6005;
        }
        if (i7 == 8) {
            return 6003;
        }
        switch (i7) {
            case 15:
                return 6003;
            case 16:
            case C5413D.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                return 6005;
            case 17:
            case 19:
            case XMLReaderUtils.DEFAULT_MAX_ENTITY_EXPANSIONS /* 20 */:
            case 21:
            case 22:
                return 6004;
            default:
                switch (i7) {
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                        return 6002;
                    default:
                        return 6006;
                }
        }
    }

    /* renamed from: Y0 */
    public static long[] m21720Y0(List list, long j7, long j8) {
        return m21731c1(list, j7, j8, RoundingMode.FLOOR);
    }

    /* renamed from: Z */
    public static int m21721Z(String str) {
        String[] m21737e1;
        int length;
        if (str == null || (length = (m21737e1 = m21737e1(str, "_")).length) < 2) {
            return 0;
        }
        String str2 = m21737e1[length - 1];
        boolean z6 = length >= 3 && "neg".equals(m21737e1[length - 2]);
        try {
            int parseInt = Integer.parseInt((String) AbstractC5332a.m21800e(str2));
            return z6 ? -parseInt : parseInt;
        } catch (NumberFormatException unused) {
            return 0;
        }
    }

    /* renamed from: Z0 */
    public static void m21722Z0(long[] jArr, long j7, long j8) {
        m21734d1(jArr, j7, j8, RoundingMode.FLOOR);
    }

    /* renamed from: a0 */
    public static String m21724a0(int i7) {
        if (i7 == 0) {
            return "NO";
        }
        if (i7 == 1) {
            return "NO_UNSUPPORTED_TYPE";
        }
        if (i7 == 2) {
            return "NO_UNSUPPORTED_DRM";
        }
        if (i7 == 3) {
            return "NO_EXCEEDS_CAPABILITIES";
        }
        if (i7 == 4) {
            return "YES";
        }
        throw new IllegalStateException();
    }

    /* renamed from: a1 */
    public static long m21725a1(long j7, long j8, long j9, RoundingMode roundingMode) {
        if (j7 == 0 || j8 == 0) {
            return 0L;
        }
        return (j9 < j8 || j9 % j8 != 0) ? (j9 >= j8 || j8 % j9 != 0) ? (j9 < j7 || j9 % j7 != 0) ? (j9 >= j7 || j7 % j9 != 0) ? m21728b1(j7, j8, j9, roundingMode) : AbstractC3525e.m14168d(j8, AbstractC3525e.m14166b(j7, j9, RoundingMode.UNNECESSARY)) : AbstractC3525e.m14166b(j8, AbstractC3525e.m14166b(j9, j7, RoundingMode.UNNECESSARY), roundingMode) : AbstractC3525e.m14168d(j7, AbstractC3525e.m14166b(j8, j9, RoundingMode.UNNECESSARY)) : AbstractC3525e.m14166b(j7, AbstractC3525e.m14166b(j9, j8, RoundingMode.UNNECESSARY), roundingMode);
    }

    /* renamed from: b */
    public static long m21726b(long j7, long j8, long j9) {
        long j10 = j7 + j8;
        return ((j7 ^ j10) & (j8 ^ j10)) < 0 ? j9 : j10;
    }

    /* renamed from: b0 */
    public static String m21727b0(Locale locale) {
        return f18800a >= 21 ? m21730c0(locale) : locale.toString();
    }

    /* renamed from: b1 */
    public static long m21728b1(long j7, long j8, long j9, RoundingMode roundingMode) {
        long m14168d = AbstractC3525e.m14168d(j7, j8);
        if (m14168d != Long.MAX_VALUE && m14168d != Long.MIN_VALUE) {
            return AbstractC3525e.m14166b(m14168d, j9, roundingMode);
        }
        long m14167c = AbstractC3525e.m14167c(Math.abs(j8), Math.abs(j9));
        RoundingMode roundingMode2 = RoundingMode.UNNECESSARY;
        long m14166b = AbstractC3525e.m14166b(j8, m14167c, roundingMode2);
        long m14166b2 = AbstractC3525e.m14166b(j9, m14167c, roundingMode2);
        long m14167c2 = AbstractC3525e.m14167c(Math.abs(j7), Math.abs(m14166b2));
        long m14166b3 = AbstractC3525e.m14166b(j7, m14167c2, roundingMode2);
        long m14166b4 = AbstractC3525e.m14166b(m14166b2, m14167c2, roundingMode2);
        long m14168d2 = AbstractC3525e.m14168d(m14166b3, m14166b);
        if (m14168d2 != Long.MAX_VALUE && m14168d2 != Long.MIN_VALUE) {
            return AbstractC3525e.m14166b(m14168d2, m14166b4, roundingMode);
        }
        double d7 = m14166b3 * (m14166b / m14166b4);
        if (d7 > 9.223372036854776E18d) {
            return Long.MAX_VALUE;
        }
        if (d7 < -9.223372036854776E18d) {
            return Long.MIN_VALUE;
        }
        return AbstractC3522b.m14155c(d7, roundingMode);
    }

    /* renamed from: c */
    public static boolean m21729c(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    /* renamed from: c0 */
    public static String m21730c0(Locale locale) {
        return locale.toLanguageTag();
    }

    /* renamed from: c1 */
    public static long[] m21731c1(List list, long j7, long j8, RoundingMode roundingMode) {
        int i7;
        int size = list.size();
        long[] jArr = new long[size];
        if (j7 == 0) {
            return jArr;
        }
        int i8 = 0;
        if (j8 >= j7 && j8 % j7 == 0) {
            long m14166b = AbstractC3525e.m14166b(j8, j7, RoundingMode.UNNECESSARY);
            while (i8 < size) {
                jArr[i8] = AbstractC3525e.m14166b(((Long) list.get(i8)).longValue(), m14166b, roundingMode);
                i8++;
            }
            return jArr;
        }
        if (j8 < j7 && j7 % j8 == 0) {
            long m14166b2 = AbstractC3525e.m14166b(j7, j8, RoundingMode.UNNECESSARY);
            while (i8 < size) {
                jArr[i8] = AbstractC3525e.m14168d(((Long) list.get(i8)).longValue(), m14166b2);
                i8++;
            }
            return jArr;
        }
        int i9 = 0;
        while (i9 < size) {
            long longValue = ((Long) list.get(i9)).longValue();
            if (longValue != 0) {
                if (j8 >= longValue && j8 % longValue == 0) {
                    jArr[i9] = AbstractC3525e.m14166b(j7, AbstractC3525e.m14166b(j8, longValue, RoundingMode.UNNECESSARY), roundingMode);
                } else if (j8 >= longValue || longValue % j8 != 0) {
                    i7 = i9;
                    jArr[i7] = m21728b1(longValue, j7, j8, roundingMode);
                    i9 = i7 + 1;
                } else {
                    jArr[i9] = AbstractC3525e.m14168d(j7, AbstractC3525e.m14166b(longValue, j8, RoundingMode.UNNECESSARY));
                }
            }
            i7 = i9;
            i9 = i7 + 1;
        }
        return jArr;
    }

    /* renamed from: d */
    public static int m21732d(long[] jArr, long j7, boolean z6, boolean z7) {
        int i7;
        int i8;
        int binarySearch = Arrays.binarySearch(jArr, j7);
        if (binarySearch < 0) {
            i8 = ~binarySearch;
        } else {
            while (true) {
                i7 = binarySearch + 1;
                if (i7 >= jArr.length || jArr[i7] != j7) {
                    break;
                }
                binarySearch = i7;
            }
            i8 = z6 ? binarySearch : i7;
        }
        return z7 ? Math.min(jArr.length - 1, i8) : i8;
    }

    /* renamed from: d0 */
    public static int m21733d0(Context context) {
        return m21676C0(context) ? 1 : 5;
    }

    /* renamed from: d1 */
    public static void m21734d1(long[] jArr, long j7, long j8, RoundingMode roundingMode) {
        if (j7 == 0) {
            Arrays.fill(jArr, 0L);
            return;
        }
        int i7 = 0;
        if (j8 >= j7 && j8 % j7 == 0) {
            long m14166b = AbstractC3525e.m14166b(j8, j7, RoundingMode.UNNECESSARY);
            while (i7 < jArr.length) {
                jArr[i7] = AbstractC3525e.m14166b(jArr[i7], m14166b, roundingMode);
                i7++;
            }
            return;
        }
        if (j8 < j7 && j7 % j8 == 0) {
            long m14166b2 = AbstractC3525e.m14166b(j7, j8, RoundingMode.UNNECESSARY);
            while (i7 < jArr.length) {
                jArr[i7] = AbstractC3525e.m14168d(jArr[i7], m14166b2);
                i7++;
            }
            return;
        }
        for (int i8 = 0; i8 < jArr.length; i8++) {
            long j9 = jArr[i8];
            if (j9 != 0) {
                if (j8 >= j9 && j8 % j9 == 0) {
                    jArr[i8] = AbstractC3525e.m14166b(j7, AbstractC3525e.m14166b(j8, j9, RoundingMode.UNNECESSARY), roundingMode);
                } else if (j8 >= j9 || j9 % j8 != 0) {
                    jArr[i8] = m21728b1(j9, j7, j8, roundingMode);
                } else {
                    jArr[i8] = AbstractC3525e.m14168d(j7, AbstractC3525e.m14166b(j9, j8, RoundingMode.UNNECESSARY));
                }
            }
        }
    }

    /* renamed from: e */
    public static int m21735e(C5347p c5347p, long j7, boolean z6, boolean z7) {
        int i7;
        int m21875c = c5347p.m21875c() - 1;
        int i8 = 0;
        while (i8 <= m21875c) {
            int i9 = (i8 + m21875c) >>> 1;
            if (c5347p.m21874b(i9) < j7) {
                i8 = i9 + 1;
            } else {
                m21875c = i9 - 1;
            }
        }
        if (z6 && (i7 = m21875c + 1) < c5347p.m21875c() && c5347p.m21874b(i7) == j7) {
            return i7;
        }
        if (z7 && m21875c == -1) {
            return 0;
        }
        return m21875c;
    }

    /* renamed from: e0 */
    public static long m21736e0(long j7, float f7) {
        return f7 == 1.0f ? j7 : Math.round(j7 * f7);
    }

    /* renamed from: e1 */
    public static String[] m21737e1(String str, String str2) {
        return str.split(str2, -1);
    }

    /* renamed from: f */
    public static int m21738f(List list, Comparable comparable, boolean z6, boolean z7) {
        int i7;
        int i8;
        int binarySearch = Collections.binarySearch(list, comparable);
        if (binarySearch < 0) {
            i8 = -(binarySearch + 2);
        } else {
            while (true) {
                i7 = binarySearch - 1;
                if (i7 < 0 || ((Comparable) list.get(i7)).compareTo(comparable) != 0) {
                    break;
                }
                binarySearch = i7;
            }
            i8 = z6 ? binarySearch : i7;
        }
        return z7 ? Math.max(0, i8) : i8;
    }

    /* renamed from: f0 */
    public static long m21739f0(long j7) {
        return j7 == -9223372036854775807L ? System.currentTimeMillis() : j7 + SystemClock.elapsedRealtime();
    }

    /* renamed from: f1 */
    public static String[] m21740f1(String str, String str2) {
        return str.split(str2, 2);
    }

    /* renamed from: g */
    public static int m21741g(int[] iArr, int i7, boolean z6, boolean z7) {
        int i8;
        int i9;
        int binarySearch = Arrays.binarySearch(iArr, i7);
        if (binarySearch < 0) {
            i9 = -(binarySearch + 2);
        } else {
            while (true) {
                i8 = binarySearch - 1;
                if (i8 < 0 || iArr[i8] != i7) {
                    break;
                }
                binarySearch = i8;
            }
            i9 = z6 ? binarySearch : i8;
        }
        return z7 ? Math.max(0, i9) : i9;
    }

    /* renamed from: g0 */
    public static int m21742g0(int i7) {
        if (i7 == 8) {
            return 3;
        }
        if (i7 == 16) {
            return 2;
        }
        if (i7 != 24) {
            return i7 != 32 ? 0 : 22;
        }
        return 21;
    }

    /* renamed from: g1 */
    public static String[] m21743g1(String str) {
        return TextUtils.isEmpty(str) ? new String[0] : m21737e1(str.trim(), "(\\s*,\\s*)");
    }

    /* renamed from: h */
    public static int m21744h(long[] jArr, long j7, boolean z6, boolean z7) {
        int i7;
        int i8;
        int binarySearch = Arrays.binarySearch(jArr, j7);
        if (binarySearch < 0) {
            i8 = -(binarySearch + 2);
        } else {
            while (true) {
                i7 = binarySearch - 1;
                if (i7 < 0 || jArr[i7] != j7) {
                    break;
                }
                binarySearch = i7;
            }
            i8 = z6 ? binarySearch : i7;
        }
        return z7 ? Math.max(0, i8) : i8;
    }

    /* renamed from: h0 */
    public static C4327q m21745h0(int i7, int i8, int i9) {
        return new C4327q.b().m18264o0("audio/raw").m18237N(i8).m18265p0(i9).m18258i0(i7).m18234K();
    }

    /* renamed from: h1 */
    public static long m21746h1(long j7, long j8, long j9) {
        long j10 = j7 - j8;
        return ((j7 ^ j10) & (j8 ^ j7)) < 0 ? j9 : j10;
    }

    /* renamed from: i0 */
    public static int m21748i0(int i7, int i8) {
        if (i7 != 2) {
            if (i7 == 3) {
                return i8;
            }
            if (i7 != 4) {
                if (i7 != 21) {
                    if (i7 != 22) {
                        if (i7 != 268435456) {
                            if (i7 != 1342177280) {
                                if (i7 != 1610612736) {
                                    throw new IllegalArgumentException();
                                }
                            }
                        }
                    }
                }
                return i8 * 3;
            }
            return i8 * 4;
        }
        return i8 * 2;
    }

    /* renamed from: i1 */
    public static String m21749i1(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (int i7 = 0; i7 < bArr.length; i7++) {
            sb.append(Character.forDigit((bArr[i7] >> 4) & 15, 16));
            sb.append(Character.forDigit(bArr[i7] & 15, 16));
        }
        return sb.toString();
    }

    /* renamed from: j0 */
    public static long m21751j0(long j7, float f7) {
        return f7 == 1.0f ? j7 : Math.round(j7 / f7);
    }

    /* renamed from: j1 */
    public static long m21752j1(int i7, int i8) {
        return m21755k1(i8) | (m21755k1(i7) << 32);
    }

    /* renamed from: k */
    public static int m21753k(int i7, int i8) {
        return ((i7 + i8) - 1) / i8;
    }

    /* renamed from: k0 */
    public static List m21754k0(int i7) {
        ArrayList arrayList = new ArrayList();
        if ((i7 & 1) != 0) {
            arrayList.add("main");
        }
        if ((i7 & 2) != 0) {
            arrayList.add("alt");
        }
        if ((i7 & 4) != 0) {
            arrayList.add("supplementary");
        }
        if ((i7 & 8) != 0) {
            arrayList.add("commentary");
        }
        if ((i7 & 16) != 0) {
            arrayList.add("dub");
        }
        if ((i7 & 32) != 0) {
            arrayList.add("emergency");
        }
        if ((i7 & 64) != 0) {
            arrayList.add("caption");
        }
        if ((i7 & 128) != 0) {
            arrayList.add("subtitle");
        }
        if ((i7 & 256) != 0) {
            arrayList.add("sign");
        }
        if ((i7 & 512) != 0) {
            arrayList.add("describes-video");
        }
        if ((i7 & 1024) != 0) {
            arrayList.add("describes-music");
        }
        if ((i7 & 2048) != 0) {
            arrayList.add("enhanced-intelligibility");
        }
        if ((i7 & 4096) != 0) {
            arrayList.add("transcribes-dialog");
        }
        if ((i7 & 8192) != 0) {
            arrayList.add("easy-read");
        }
        if ((i7 & 16384) != 0) {
            arrayList.add("trick-play");
        }
        return arrayList;
    }

    /* renamed from: k1 */
    public static long m21755k1(int i7) {
        return i7 & 4294967295L;
    }

    /* renamed from: l */
    public static long m21756l(long j7, long j8) {
        return ((j7 + j8) - 1) / j8;
    }

    /* renamed from: l0 */
    public static List m21757l0(int i7) {
        ArrayList arrayList = new ArrayList();
        if ((i7 & 4) != 0) {
            arrayList.add("auto");
        }
        if ((i7 & 1) != 0) {
            arrayList.add("default");
        }
        if ((i7 & 2) != 0) {
            arrayList.add("forced");
        }
        return arrayList;
    }

    /* renamed from: l1 */
    public static long m21758l1(long j7) {
        return (j7 == -9223372036854775807L || j7 == Long.MIN_VALUE) ? j7 : j7 / 1000;
    }

    /* renamed from: m */
    public static void m21759m(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: m0 */
    public static int m21760m0(int i7) {
        if (i7 == 13) {
            return 1;
        }
        switch (i7) {
            case 2:
                return 0;
            case 3:
                return 8;
            case 4:
                return 4;
            case 5:
            case 7:
            case 8:
            case 9:
            case 10:
                return 5;
            case 6:
                return 2;
            default:
                return 3;
        }
    }

    /* renamed from: m1 */
    public static void m21761m1(Parcel parcel, boolean z6) {
        parcel.writeInt(z6 ? 1 : 0);
    }

    /* renamed from: n */
    public static int m21762n(long j7, long j8) {
        if (j7 < j8) {
            return -1;
        }
        return j7 == j8 ? 0 : 1;
    }

    /* renamed from: n0 */
    public static String[] m21763n0() {
        String[] m21765o0 = m21765o0();
        for (int i7 = 0; i7 < m21765o0.length; i7++) {
            m21765o0[i7] = m21696M0(m21765o0[i7]);
        }
        return m21765o0;
    }

    /* renamed from: o */
    public static float m21764o(float f7, float f8, float f9) {
        return Math.max(f8, Math.min(f7, f9));
    }

    /* renamed from: o0 */
    public static String[] m21765o0() {
        Configuration configuration = Resources.getSystem().getConfiguration();
        return f18800a >= 24 ? m21767p0(configuration) : new String[]{m21727b0(configuration.locale)};
    }

    /* renamed from: p */
    public static int m21766p(int i7, int i8, int i9) {
        return Math.max(i8, Math.min(i7, i9));
    }

    /* renamed from: p0 */
    public static String[] m21767p0(Configuration configuration) {
        LocaleList locales;
        String languageTags;
        locales = configuration.getLocales();
        languageTags = locales.toLanguageTags();
        return m21737e1(languageTags, ",");
    }

    /* renamed from: q */
    public static long m21768q(long j7, long j8, long j9) {
        return Math.max(j8, Math.min(j7, j9));
    }

    /* renamed from: q0 */
    public static String m21769q0(String str) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getMethod("get", String.class).invoke(cls, str);
        } catch (Exception e7) {
            AbstractC5346o.m21863d("Util", "Failed to read system property " + str, e7);
            return null;
        }
    }

    /* renamed from: r */
    public static boolean m21770r(SparseArray sparseArray, int i7) {
        return sparseArray.indexOfKey(i7) >= 0;
    }

    /* renamed from: r0 */
    public static String m21771r0(int i7) {
        switch (i7) {
            case -2:
                return "none";
            case -1:
                return "unknown";
            case 0:
                return "default";
            case 1:
                return "audio";
            case 2:
                return "video";
            case 3:
                return "text";
            case 4:
                return "image";
            case 5:
                return ExternalParsersConfigReaderMetKeys.METADATA_TAG;
            case 6:
                return "camera motion";
            default:
                if (i7 < 10000) {
                    return "?";
                }
                return "custom (" + i7 + ")";
        }
    }

    /* renamed from: s */
    public static boolean m21772s(Object[] objArr, Object obj) {
        for (Object obj2 : objArr) {
            if (m21729c(obj2, obj)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: s0 */
    public static byte[] m21773s0(String str) {
        return str.getBytes(AbstractC2922e.f9010c);
    }

    /* renamed from: t */
    public static boolean m21774t(SparseArray sparseArray, SparseArray sparseArray2) {
        boolean contentEquals;
        if (sparseArray == null) {
            return sparseArray2 == null;
        }
        if (sparseArray2 == null) {
            return false;
        }
        if (f18800a >= 31) {
            contentEquals = sparseArray.contentEquals(sparseArray2);
            return contentEquals;
        }
        int size = sparseArray.size();
        if (size != sparseArray2.size()) {
            return false;
        }
        for (int i7 = 0; i7 < size; i7++) {
            if (!Objects.equals(sparseArray.valueAt(i7), sparseArray2.get(sparseArray.keyAt(i7)))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: t0 */
    public static int m21775t0(Uri uri) {
        int m21777u0;
        String scheme = uri.getScheme();
        if (scheme != null && AbstractC2920c.m10511a("rtsp", scheme)) {
            return 3;
        }
        String lastPathSegment = uri.getLastPathSegment();
        if (lastPathSegment == null) {
            return 4;
        }
        int lastIndexOf = lastPathSegment.lastIndexOf(46);
        if (lastIndexOf >= 0 && (m21777u0 = m21777u0(lastPathSegment.substring(lastIndexOf + 1))) != 4) {
            return m21777u0;
        }
        Matcher matcher = f18810k.matcher((CharSequence) AbstractC5332a.m21800e(uri.getPath()));
        if (!matcher.matches()) {
            return 4;
        }
        String group = matcher.group(2);
        if (group != null) {
            if (group.contains("format=mpd-time-csf")) {
                return 0;
            }
            if (group.contains("format=m3u8-aapl")) {
                return 2;
            }
        }
        return 1;
    }

    /* renamed from: u */
    public static int m21776u(SparseArray sparseArray) {
        int contentHashCode;
        if (f18800a >= 31) {
            contentHashCode = sparseArray.contentHashCode();
            return contentHashCode;
        }
        int i7 = 17;
        for (int i8 = 0; i8 < sparseArray.size(); i8++) {
            i7 = (((i7 * 31) + sparseArray.keyAt(i8)) * 31) + Objects.hashCode(sparseArray.valueAt(i8));
        }
        return i7;
    }

    /* renamed from: u0 */
    public static int m21777u0(String str) {
        String m10515e = AbstractC2920c.m10515e(str);
        m10515e.hashCode();
        switch (m10515e) {
            case "ism":
            case "isml":
                return 1;
            case "mpd":
                return 0;
            case "m3u8":
                return 2;
            default:
                return 4;
        }
    }

    /* renamed from: v */
    public static int m21778v(byte[] bArr, int i7, int i8, int i9) {
        while (i7 < i8) {
            int m14443b = AbstractC3580j.m14443b(bArr[i7]);
            i9 = m21780w(m14443b & 15, m21780w(m14443b >> 4, i9));
            i7++;
        }
        return i9;
    }

    /* renamed from: v0 */
    public static int m21779v0(Uri uri, String str) {
        if (str == null) {
            return m21775t0(uri);
        }
        switch (str) {
            case "application/x-mpegURL":
                return 2;
            case "application/vnd.ms-sstr+xml":
                return 1;
            case "application/dash+xml":
                return 0;
            case "application/x-rtsp":
                return 3;
            default:
                return 4;
        }
    }

    /* renamed from: w */
    public static int m21780w(int i7, int i8) {
        return (f18815p[(i7 ^ ((i8 >> 12) & 255)) & 255] ^ ((i8 << 4) & 65535)) & 65535;
    }

    /* renamed from: w0 */
    public static boolean m21781w0(C5357z c5357z, C5357z c5357z2, Inflater inflater) {
        if (c5357z.m21942a() <= 0) {
            return false;
        }
        if (c5357z2.m21943b() < c5357z.m21942a()) {
            c5357z2.m21944c(c5357z.m21942a() * 2);
        }
        if (inflater == null) {
            inflater = new Inflater();
        }
        inflater.setInput(c5357z.m21946e(), c5357z.m21947f(), c5357z.m21942a());
        int i7 = 0;
        while (true) {
            try {
                i7 += inflater.inflate(c5357z2.m21946e(), i7, c5357z2.m21943b() - i7);
                if (!inflater.finished()) {
                    if (inflater.needsDictionary() || inflater.needsInput()) {
                        break;
                    }
                    if (i7 == c5357z2.m21943b()) {
                        c5357z2.m21944c(c5357z2.m21943b() * 2);
                    }
                } else {
                    c5357z2.m21938S(i7);
                    inflater.reset();
                    return true;
                }
            } catch (DataFormatException unused) {
                return false;
            } finally {
                inflater.reset();
            }
        }
        return false;
    }

    /* renamed from: x */
    public static int m21782x(byte[] bArr, int i7, int i8, int i9) {
        while (i7 < i8) {
            i9 = f18814o[((i9 >>> 24) ^ (bArr[i7] & 255)) & 255] ^ (i9 << 8);
            i7++;
        }
        return i9;
    }

    /* renamed from: x0 */
    public static String m21783x0(int i7) {
        return Integer.toString(i7, 36);
    }

    /* renamed from: y */
    public static int m21784y(byte[] bArr, int i7, int i8, int i9) {
        while (i7 < i8) {
            i9 = f18816q[i9 ^ (bArr[i7] & 255)];
            i7++;
        }
        return i9;
    }

    /* renamed from: y0 */
    public static boolean m21785y0(Context context) {
        return f18800a >= 23 && context.getPackageManager().hasSystemFeature("android.hardware.type.automotive");
    }

    /* renamed from: z */
    public static Handler m21786z(Looper looper, Handler.Callback callback) {
        return new Handler(looper, callback);
    }

    /* renamed from: z0 */
    public static boolean m21787z0(String str) {
        str.hashCode();
        switch (str) {
            case "image/avif":
                return f18800a >= 34;
            case "image/heic":
            case "image/heif":
                return f18800a >= 26;
            case "image/jpeg":
            case "image/webp":
            case "image/bmp":
            case "image/png":
                return true;
            default:
                return false;
        }
    }

    /* renamed from: i */
    public static Object m21747i(Object obj) {
        return obj;
    }

    /* renamed from: j */
    public static Object[] m21750j(Object[] objArr) {
        return objArr;
    }
}
