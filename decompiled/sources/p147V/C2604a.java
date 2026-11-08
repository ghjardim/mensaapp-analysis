package p147V;

import android.content.res.AssetManager;
import android.media.MediaDataSource;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.system.OsConstants;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.api.C3643a;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.CRC32;
import org.apache.tika.metadata.TikaCoreProperties;
import org.apache.tika.utils.StringUtils;
import p147V.AbstractC2605b;
import p256j$.util.DesugarTimeZone;
import p272k4.C5410A;

/* renamed from: V.a */
/* loaded from: classes.dex */
public class C2604a {

    /* renamed from: U */
    public static SimpleDateFormat f7642U;

    /* renamed from: V */
    public static SimpleDateFormat f7643V;

    /* renamed from: Z */
    public static final e[] f7647Z;

    /* renamed from: a0 */
    public static final e[] f7648a0;

    /* renamed from: b0 */
    public static final e[] f7649b0;

    /* renamed from: c0 */
    public static final e[] f7650c0;

    /* renamed from: d0 */
    public static final e[] f7651d0;

    /* renamed from: e0 */
    public static final e f7652e0;

    /* renamed from: f0 */
    public static final e[] f7653f0;

    /* renamed from: g0 */
    public static final e[] f7654g0;

    /* renamed from: h0 */
    public static final e[] f7655h0;

    /* renamed from: i0 */
    public static final e[] f7656i0;

    /* renamed from: j0 */
    public static final e[][] f7657j0;

    /* renamed from: k0 */
    public static final e[] f7658k0;

    /* renamed from: l0 */
    public static final HashMap[] f7659l0;

    /* renamed from: m0 */
    public static final HashMap[] f7660m0;

    /* renamed from: n0 */
    public static final HashSet f7661n0;

    /* renamed from: o0 */
    public static final HashMap f7662o0;

    /* renamed from: p0 */
    public static final Charset f7663p0;

    /* renamed from: q0 */
    public static final byte[] f7664q0;

    /* renamed from: r0 */
    public static final byte[] f7665r0;

    /* renamed from: s0 */
    public static final Pattern f7666s0;

    /* renamed from: t0 */
    public static final Pattern f7667t0;

    /* renamed from: u0 */
    public static final Pattern f7668u0;

    /* renamed from: v0 */
    public static final Pattern f7670v0;

    /* renamed from: a */
    public String f7675a;

    /* renamed from: b */
    public FileDescriptor f7676b;

    /* renamed from: c */
    public AssetManager.AssetInputStream f7677c;

    /* renamed from: d */
    public int f7678d;

    /* renamed from: e */
    public boolean f7679e;

    /* renamed from: f */
    public final HashMap[] f7680f;

    /* renamed from: g */
    public Set f7681g;

    /* renamed from: h */
    public ByteOrder f7682h;

    /* renamed from: i */
    public boolean f7683i;

    /* renamed from: j */
    public boolean f7684j;

    /* renamed from: k */
    public boolean f7685k;

    /* renamed from: l */
    public int f7686l;

    /* renamed from: m */
    public int f7687m;

    /* renamed from: n */
    public byte[] f7688n;

    /* renamed from: o */
    public int f7689o;

    /* renamed from: p */
    public int f7690p;

    /* renamed from: q */
    public int f7691q;

    /* renamed from: r */
    public int f7692r;

    /* renamed from: s */
    public int f7693s;

    /* renamed from: t */
    public boolean f7694t;

    /* renamed from: u */
    public boolean f7695u;

    /* renamed from: v */
    public static final boolean f7669v = Log.isLoggable("ExifInterface", 3);

    /* renamed from: w */
    public static final List f7671w = Arrays.asList(1, 6, 3, 8);

    /* renamed from: x */
    public static final List f7672x = Arrays.asList(2, 7, 4, 5);

    /* renamed from: y */
    public static final int[] f7673y = {8, 8, 8};

    /* renamed from: z */
    public static final int[] f7674z = {4};

    /* renamed from: A */
    public static final int[] f7622A = {8};

    /* renamed from: B */
    public static final byte[] f7623B = {-1, -40, -1};

    /* renamed from: C */
    public static final byte[] f7624C = {102, 116, 121, 112};

    /* renamed from: D */
    public static final byte[] f7625D = {109, 105, 102, 49};

    /* renamed from: E */
    public static final byte[] f7626E = {104, 101, 105, 99};

    /* renamed from: F */
    public static final byte[] f7627F = {79, 76, 89, 77, 80, 0};

    /* renamed from: G */
    public static final byte[] f7628G = {79, 76, 89, 77, 80, 85, 83, 0, 73, 73};

    /* renamed from: H */
    public static final byte[] f7629H = {-119, 80, 78, 71, 13, 10, 26, 10};

    /* renamed from: I */
    public static final byte[] f7630I = {101, 88, 73, 102};

    /* renamed from: J */
    public static final byte[] f7631J = {73, 72, 68, 82};

    /* renamed from: K */
    public static final byte[] f7632K = {73, 69, 78, 68};

    /* renamed from: L */
    public static final byte[] f7633L = {82, 73, 70, 70};

    /* renamed from: M */
    public static final byte[] f7634M = {87, 69, 66, 80};

    /* renamed from: N */
    public static final byte[] f7635N = {69, 88, 73, 70};

    /* renamed from: O */
    public static final byte[] f7636O = {-99, 1, 42};

    /* renamed from: P */
    public static final byte[] f7637P = "VP8X".getBytes(Charset.defaultCharset());

    /* renamed from: Q */
    public static final byte[] f7638Q = "VP8L".getBytes(Charset.defaultCharset());

    /* renamed from: R */
    public static final byte[] f7639R = "VP8 ".getBytes(Charset.defaultCharset());

    /* renamed from: S */
    public static final byte[] f7640S = "ANIM".getBytes(Charset.defaultCharset());

    /* renamed from: T */
    public static final byte[] f7641T = "ANMF".getBytes(Charset.defaultCharset());

    /* renamed from: W */
    public static final String[] f7644W = {StringUtils.EMPTY, "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};

    /* renamed from: X */
    public static final int[] f7645X = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};

    /* renamed from: Y */
    public static final byte[] f7646Y = {65, 83, 67, 73, 73, 0, 0, 0};

    /* renamed from: V.a$c */
    public static class c extends FilterOutputStream {

        /* renamed from: a */
        public final OutputStream f7704a;

        /* renamed from: b */
        public ByteOrder f7705b;

        public c(OutputStream outputStream, ByteOrder byteOrder) {
            super(outputStream);
            this.f7704a = outputStream;
            this.f7705b = byteOrder;
        }

        /* renamed from: a */
        public void m8944a(ByteOrder byteOrder) {
            this.f7705b = byteOrder;
        }

        /* renamed from: c */
        public void m8945c(int i7) {
            this.f7704a.write(i7);
        }

        /* renamed from: d */
        public void m8946d(int i7) {
            ByteOrder byteOrder = this.f7705b;
            if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                this.f7704a.write(i7 & 255);
                this.f7704a.write((i7 >>> 8) & 255);
                this.f7704a.write((i7 >>> 16) & 255);
                this.f7704a.write((i7 >>> 24) & 255);
                return;
            }
            if (byteOrder == ByteOrder.BIG_ENDIAN) {
                this.f7704a.write((i7 >>> 24) & 255);
                this.f7704a.write((i7 >>> 16) & 255);
                this.f7704a.write((i7 >>> 8) & 255);
                this.f7704a.write(i7 & 255);
            }
        }

        /* renamed from: g */
        public void m8947g(short s7) {
            ByteOrder byteOrder = this.f7705b;
            if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                this.f7704a.write(s7 & 255);
                this.f7704a.write((s7 >>> 8) & 255);
            } else if (byteOrder == ByteOrder.BIG_ENDIAN) {
                this.f7704a.write((s7 >>> 8) & 255);
                this.f7704a.write(s7 & 255);
            }
        }

        /* renamed from: h */
        public void m8948h(long j7) {
            if (j7 > 4294967295L) {
                throw new IllegalArgumentException("val is larger than the maximum value of a 32-bit unsigned integer");
            }
            m8946d((int) j7);
        }

        /* renamed from: j */
        public void m8949j(int i7) {
            if (i7 > 65535) {
                throw new IllegalArgumentException("val is larger than the maximum value of a 16-bit unsigned integer");
            }
            m8947g((short) i7);
        }

        @Override // java.io.FilterOutputStream, java.io.OutputStream
        public void write(byte[] bArr) {
            this.f7704a.write(bArr);
        }

        @Override // java.io.FilterOutputStream, java.io.OutputStream
        public void write(byte[] bArr, int i7, int i8) {
            this.f7704a.write(bArr, i7, i8);
        }
    }

    /* renamed from: V.a$d */
    public static class d {

        /* renamed from: a */
        public final int f7706a;

        /* renamed from: b */
        public final int f7707b;

        /* renamed from: c */
        public final long f7708c;

        /* renamed from: d */
        public final byte[] f7709d;

        public d(int i7, int i8, byte[] bArr) {
            this(i7, i8, -1L, bArr);
        }

        /* renamed from: a */
        public static d m8950a(String str) {
            if (str.length() == 1 && str.charAt(0) >= '0' && str.charAt(0) <= '1') {
                return new d(1, 1, new byte[]{(byte) (str.charAt(0) - '0')});
            }
            byte[] bytes = str.getBytes(C2604a.f7663p0);
            return new d(1, bytes.length, bytes);
        }

        /* renamed from: b */
        public static d m8951b(double[] dArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[C2604a.f7645X[12] * dArr.length]);
            wrap.order(byteOrder);
            for (double d7 : dArr) {
                wrap.putDouble(d7);
            }
            return new d(12, dArr.length, wrap.array());
        }

        /* renamed from: c */
        public static d m8952c(int[] iArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[C2604a.f7645X[9] * iArr.length]);
            wrap.order(byteOrder);
            for (int i7 : iArr) {
                wrap.putInt(i7);
            }
            return new d(9, iArr.length, wrap.array());
        }

        /* renamed from: d */
        public static d m8953d(f[] fVarArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[C2604a.f7645X[10] * fVarArr.length]);
            wrap.order(byteOrder);
            for (f fVar : fVarArr) {
                wrap.putInt((int) fVar.f7714a);
                wrap.putInt((int) fVar.f7715b);
            }
            return new d(10, fVarArr.length, wrap.array());
        }

        /* renamed from: e */
        public static d m8954e(String str) {
            byte[] bytes = (str + (char) 0).getBytes(C2604a.f7663p0);
            return new d(2, bytes.length, bytes);
        }

        /* renamed from: f */
        public static d m8955f(long j7, ByteOrder byteOrder) {
            return m8956g(new long[]{j7}, byteOrder);
        }

        /* renamed from: g */
        public static d m8956g(long[] jArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[C2604a.f7645X[4] * jArr.length]);
            wrap.order(byteOrder);
            for (long j7 : jArr) {
                wrap.putInt((int) j7);
            }
            return new d(4, jArr.length, wrap.array());
        }

        /* renamed from: h */
        public static d m8957h(f fVar, ByteOrder byteOrder) {
            return m8958i(new f[]{fVar}, byteOrder);
        }

        /* renamed from: i */
        public static d m8958i(f[] fVarArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[C2604a.f7645X[5] * fVarArr.length]);
            wrap.order(byteOrder);
            for (f fVar : fVarArr) {
                wrap.putInt((int) fVar.f7714a);
                wrap.putInt((int) fVar.f7715b);
            }
            return new d(5, fVarArr.length, wrap.array());
        }

        /* renamed from: j */
        public static d m8959j(int i7, ByteOrder byteOrder) {
            return m8960k(new int[]{i7}, byteOrder);
        }

        /* renamed from: k */
        public static d m8960k(int[] iArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[C2604a.f7645X[3] * iArr.length]);
            wrap.order(byteOrder);
            for (int i7 : iArr) {
                wrap.putShort((short) i7);
            }
            return new d(3, iArr.length, wrap.array());
        }

        /* renamed from: l */
        public double m8961l(ByteOrder byteOrder) {
            Object m8964o = m8964o(byteOrder);
            if (m8964o == null) {
                throw new NumberFormatException("NULL can't be converted to a double value");
            }
            if (m8964o instanceof String) {
                return Double.parseDouble((String) m8964o);
            }
            if (m8964o instanceof long[]) {
                if (((long[]) m8964o).length == 1) {
                    return r5[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (m8964o instanceof int[]) {
                if (((int[]) m8964o).length == 1) {
                    return r5[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (m8964o instanceof double[]) {
                double[] dArr = (double[]) m8964o;
                if (dArr.length == 1) {
                    return dArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (!(m8964o instanceof f[])) {
                throw new NumberFormatException("Couldn't find a double value");
            }
            f[] fVarArr = (f[]) m8964o;
            if (fVarArr.length == 1) {
                return fVarArr[0].m8967a();
            }
            throw new NumberFormatException("There are more than one component");
        }

        /* renamed from: m */
        public int m8962m(ByteOrder byteOrder) {
            Object m8964o = m8964o(byteOrder);
            if (m8964o == null) {
                throw new NumberFormatException("NULL can't be converted to a integer value");
            }
            if (m8964o instanceof String) {
                return Integer.parseInt((String) m8964o);
            }
            if (m8964o instanceof long[]) {
                long[] jArr = (long[]) m8964o;
                if (jArr.length == 1) {
                    return (int) jArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (!(m8964o instanceof int[])) {
                throw new NumberFormatException("Couldn't find a integer value");
            }
            int[] iArr = (int[]) m8964o;
            if (iArr.length == 1) {
                return iArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        }

        /* renamed from: n */
        public String m8963n(ByteOrder byteOrder) {
            Object m8964o = m8964o(byteOrder);
            if (m8964o == null) {
                return null;
            }
            if (m8964o instanceof String) {
                return (String) m8964o;
            }
            StringBuilder sb = new StringBuilder();
            int i7 = 0;
            if (m8964o instanceof long[]) {
                long[] jArr = (long[]) m8964o;
                while (i7 < jArr.length) {
                    sb.append(jArr[i7]);
                    i7++;
                    if (i7 != jArr.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            }
            if (m8964o instanceof int[]) {
                int[] iArr = (int[]) m8964o;
                while (i7 < iArr.length) {
                    sb.append(iArr[i7]);
                    i7++;
                    if (i7 != iArr.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            }
            if (m8964o instanceof double[]) {
                double[] dArr = (double[]) m8964o;
                while (i7 < dArr.length) {
                    sb.append(dArr[i7]);
                    i7++;
                    if (i7 != dArr.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            }
            if (!(m8964o instanceof f[])) {
                return null;
            }
            f[] fVarArr = (f[]) m8964o;
            while (i7 < fVarArr.length) {
                sb.append(fVarArr[i7].f7714a);
                sb.append('/');
                sb.append(fVarArr[i7].f7715b);
                i7++;
                if (i7 != fVarArr.length) {
                    sb.append(",");
                }
            }
            return sb.toString();
        }

        /* JADX WARN: Not initialized variable reg: 5, insn: 0x0030: MOVE (r4 I:??[OBJECT, ARRAY]) = (r5 I:??[OBJECT, ARRAY]) (LINE:49), block:B:166:0x0030 */
        /* JADX WARN: Removed duplicated region for block: B:169:0x018f A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* renamed from: o */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object m8964o(java.nio.ByteOrder r12) {
            /*
                Method dump skipped, instructions count: 436
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: p147V.C2604a.d.m8964o(java.nio.ByteOrder):java.lang.Object");
        }

        /* renamed from: p */
        public int m8965p() {
            return C2604a.f7645X[this.f7706a] * this.f7707b;
        }

        public String toString() {
            return "(" + C2604a.f7644W[this.f7706a] + ", data length:" + this.f7709d.length + ")";
        }

        public d(int i7, int i8, long j7, byte[] bArr) {
            this.f7706a = i7;
            this.f7707b = i8;
            this.f7708c = j7;
            this.f7709d = bArr;
        }
    }

    /* renamed from: V.a$f */
    public static class f {

        /* renamed from: a */
        public final long f7714a;

        /* renamed from: b */
        public final long f7715b;

        public f(double d7) {
            this((long) (d7 * 10000.0d), 10000L);
        }

        /* renamed from: a */
        public double m8967a() {
            return this.f7714a / this.f7715b;
        }

        public String toString() {
            return this.f7714a + "/" + this.f7715b;
        }

        public f(long j7, long j8) {
            if (j8 == 0) {
                this.f7714a = 0L;
                this.f7715b = 1L;
            } else {
                this.f7714a = j7;
                this.f7715b = j8;
            }
        }
    }

    static {
        e[] eVarArr = {new e("NewSubfileType", 254, 4), new e("SubfileType", 255, 4), new e("ImageWidth", 256, 3, 4), new e("ImageLength", 257, 3, 4), new e("BitsPerSample", 258, 3), new e("Compression", 259, 3), new e("PhotometricInterpretation", 262, 3), new e("ImageDescription", 270, 2), new e("Make", 271, 2), new e("Model", 272, 2), new e("StripOffsets", 273, 3, 4), new e("Orientation", 274, 3), new e("SamplesPerPixel", 277, 3), new e("RowsPerStrip", 278, 3, 4), new e("StripByteCounts", 279, 3, 4), new e("XResolution", 282, 5), new e("YResolution", 283, 5), new e("PlanarConfiguration", 284, 3), new e("ResolutionUnit", 296, 3), new e("TransferFunction", 301, 3), new e("Software", 305, 2), new e("DateTime", 306, 2), new e("Artist", 315, 2), new e("WhitePoint", 318, 5), new e("PrimaryChromaticities", 319, 5), new e("SubIFDPointer", 330, 4), new e("JPEGInterchangeFormat", 513, 4), new e("JPEGInterchangeFormatLength", 514, 4), new e("YCbCrCoefficients", 529, 5), new e("YCbCrSubSampling", 530, 3), new e("YCbCrPositioning", 531, 3), new e("ReferenceBlackWhite", 532, 5), new e("Copyright", 33432, 2), new e("ExifIFDPointer", 34665, 4), new e("GPSInfoIFDPointer", 34853, 4), new e("SensorTopBorder", 4, 4), new e("SensorLeftBorder", 5, 4), new e("SensorBottomBorder", 6, 4), new e("SensorRightBorder", 7, 4), new e("ISO", 23, 3), new e("JpgFromRaw", 46, 7), new e("Xmp", 700, 1)};
        f7647Z = eVarArr;
        e[] eVarArr2 = {new e("ExposureTime", 33434, 5), new e("FNumber", 33437, 5), new e("ExposureProgram", 34850, 3), new e("SpectralSensitivity", 34852, 2), new e("PhotographicSensitivity", 34855, 3), new e("OECF", 34856, 7), new e("SensitivityType", 34864, 3), new e("StandardOutputSensitivity", 34865, 4), new e("RecommendedExposureIndex", 34866, 4), new e("ISOSpeed", 34867, 4), new e("ISOSpeedLatitudeyyy", 34868, 4), new e("ISOSpeedLatitudezzz", 34869, 4), new e("ExifVersion", 36864, 2), new e("DateTimeOriginal", 36867, 2), new e("DateTimeDigitized", 36868, 2), new e("OffsetTime", 36880, 2), new e("OffsetTimeOriginal", 36881, 2), new e("OffsetTimeDigitized", 36882, 2), new e("ComponentsConfiguration", 37121, 7), new e("CompressedBitsPerPixel", 37122, 5), new e("ShutterSpeedValue", 37377, 10), new e("ApertureValue", 37378, 5), new e("BrightnessValue", 37379, 10), new e("ExposureBiasValue", 37380, 10), new e("MaxApertureValue", 37381, 5), new e("SubjectDistance", 37382, 5), new e("MeteringMode", 37383, 3), new e("LightSource", 37384, 3), new e("Flash", 37385, 3), new e("FocalLength", 37386, 5), new e("SubjectArea", 37396, 3), new e("MakerNote", 37500, 7), new e("UserComment", 37510, 7), new e("SubSecTime", 37520, 2), new e("SubSecTimeOriginal", 37521, 2), new e("SubSecTimeDigitized", 37522, 2), new e("FlashpixVersion", 40960, 7), new e("ColorSpace", 40961, 3), new e("PixelXDimension", 40962, 3, 4), new e("PixelYDimension", 40963, 3, 4), new e("RelatedSoundFile", 40964, 2), new e("InteroperabilityIFDPointer", 40965, 4), new e("FlashEnergy", 41483, 5), new e("SpatialFrequencyResponse", 41484, 7), new e("FocalPlaneXResolution", 41486, 5), new e("FocalPlaneYResolution", 41487, 5), new e("FocalPlaneResolutionUnit", 41488, 3), new e("SubjectLocation", 41492, 3), new e("ExposureIndex", 41493, 5), new e("SensingMethod", 41495, 3), new e("FileSource", 41728, 7), new e("SceneType", 41729, 7), new e("CFAPattern", 41730, 7), new e("CustomRendered", 41985, 3), new e("ExposureMode", 41986, 3), new e("WhiteBalance", 41987, 3), new e("DigitalZoomRatio", 41988, 5), new e("FocalLengthIn35mmFilm", 41989, 3), new e("SceneCaptureType", 41990, 3), new e("GainControl", 41991, 3), new e("Contrast", 41992, 3), new e("Saturation", 41993, 3), new e("Sharpness", 41994, 3), new e("DeviceSettingDescription", 41995, 7), new e("SubjectDistanceRange", 41996, 3), new e("ImageUniqueID", 42016, 2), new e("CameraOwnerName", 42032, 2), new e("BodySerialNumber", 42033, 2), new e("LensSpecification", 42034, 5), new e("LensMake", 42035, 2), new e("LensModel", 42036, 2), new e("Gamma", 42240, 5), new e("DNGVersion", 50706, 1), new e("DefaultCropSize", 50720, 3, 4)};
        f7648a0 = eVarArr2;
        e[] eVarArr3 = {new e("GPSVersionID", 0, 1), new e("GPSLatitudeRef", 1, 2), new e("GPSLatitude", 2, 5, 10), new e("GPSLongitudeRef", 3, 2), new e("GPSLongitude", 4, 5, 10), new e("GPSAltitudeRef", 5, 1), new e("GPSAltitude", 6, 5), new e("GPSTimeStamp", 7, 5), new e("GPSSatellites", 8, 2), new e("GPSStatus", 9, 2), new e("GPSMeasureMode", 10, 2), new e("GPSDOP", 11, 5), new e("GPSSpeedRef", 12, 2), new e("GPSSpeed", 13, 5), new e("GPSTrackRef", 14, 2), new e("GPSTrack", 15, 5), new e("GPSImgDirectionRef", 16, 2), new e("GPSImgDirection", 17, 5), new e("GPSMapDatum", 18, 2), new e("GPSDestLatitudeRef", 19, 2), new e("GPSDestLatitude", 20, 5), new e("GPSDestLongitudeRef", 21, 2), new e("GPSDestLongitude", 22, 5), new e("GPSDestBearingRef", 23, 2), new e("GPSDestBearing", 24, 5), new e("GPSDestDistanceRef", 25, 2), new e("GPSDestDistance", 26, 5), new e("GPSProcessingMethod", 27, 7), new e("GPSAreaInformation", 28, 7), new e("GPSDateStamp", 29, 2), new e("GPSDifferential", 30, 3), new e("GPSHPositioningError", 31, 5)};
        f7649b0 = eVarArr3;
        e[] eVarArr4 = {new e("InteroperabilityIndex", 1, 2)};
        f7650c0 = eVarArr4;
        e[] eVarArr5 = {new e("NewSubfileType", 254, 4), new e("SubfileType", 255, 4), new e("ThumbnailImageWidth", 256, 3, 4), new e("ThumbnailImageLength", 257, 3, 4), new e("BitsPerSample", 258, 3), new e("Compression", 259, 3), new e("PhotometricInterpretation", 262, 3), new e("ImageDescription", 270, 2), new e("Make", 271, 2), new e("Model", 272, 2), new e("StripOffsets", 273, 3, 4), new e("ThumbnailOrientation", 274, 3), new e("SamplesPerPixel", 277, 3), new e("RowsPerStrip", 278, 3, 4), new e("StripByteCounts", 279, 3, 4), new e("XResolution", 282, 5), new e("YResolution", 283, 5), new e("PlanarConfiguration", 284, 3), new e("ResolutionUnit", 296, 3), new e("TransferFunction", 301, 3), new e("Software", 305, 2), new e("DateTime", 306, 2), new e("Artist", 315, 2), new e("WhitePoint", 318, 5), new e("PrimaryChromaticities", 319, 5), new e("SubIFDPointer", 330, 4), new e("JPEGInterchangeFormat", 513, 4), new e("JPEGInterchangeFormatLength", 514, 4), new e("YCbCrCoefficients", 529, 5), new e("YCbCrSubSampling", 530, 3), new e("YCbCrPositioning", 531, 3), new e("ReferenceBlackWhite", 532, 5), new e("Copyright", 33432, 2), new e("ExifIFDPointer", 34665, 4), new e("GPSInfoIFDPointer", 34853, 4), new e("DNGVersion", 50706, 1), new e("DefaultCropSize", 50720, 3, 4)};
        f7651d0 = eVarArr5;
        f7652e0 = new e("StripOffsets", 273, 3);
        e[] eVarArr6 = {new e("ThumbnailImage", 256, 7), new e("CameraSettingsIFDPointer", 8224, 4), new e("ImageProcessingIFDPointer", 8256, 4)};
        f7653f0 = eVarArr6;
        e[] eVarArr7 = {new e("PreviewImageStart", 257, 4), new e("PreviewImageLength", 258, 4)};
        f7654g0 = eVarArr7;
        e[] eVarArr8 = {new e("AspectFrame", 4371, 3)};
        f7655h0 = eVarArr8;
        e[] eVarArr9 = {new e("ColorSpace", 55, 3)};
        f7656i0 = eVarArr9;
        e[][] eVarArr10 = {eVarArr, eVarArr2, eVarArr3, eVarArr4, eVarArr5, eVarArr, eVarArr6, eVarArr7, eVarArr8, eVarArr9};
        f7657j0 = eVarArr10;
        f7658k0 = new e[]{new e("SubIFDPointer", 330, 4), new e("ExifIFDPointer", 34665, 4), new e("GPSInfoIFDPointer", 34853, 4), new e("InteroperabilityIFDPointer", 40965, 4), new e("CameraSettingsIFDPointer", 8224, 1), new e("ImageProcessingIFDPointer", 8256, 1)};
        f7659l0 = new HashMap[eVarArr10.length];
        f7660m0 = new HashMap[eVarArr10.length];
        f7661n0 = new HashSet(Arrays.asList("FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance", "GPSTimeStamp"));
        f7662o0 = new HashMap();
        Charset forName = Charset.forName("US-ASCII");
        f7663p0 = forName;
        f7664q0 = "Exif\u0000\u0000".getBytes(forName);
        f7665r0 = "http://ns.adobe.com/xap/1.0/\u0000".getBytes(forName);
        Locale locale = Locale.US;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", locale);
        f7642U = simpleDateFormat;
        simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", locale);
        f7643V = simpleDateFormat2;
        simpleDateFormat2.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
        int i7 = 0;
        while (true) {
            e[][] eVarArr11 = f7657j0;
            if (i7 >= eVarArr11.length) {
                HashMap hashMap = f7662o0;
                e[] eVarArr12 = f7658k0;
                hashMap.put(Integer.valueOf(eVarArr12[0].f7710a), 5);
                hashMap.put(Integer.valueOf(eVarArr12[1].f7710a), 1);
                hashMap.put(Integer.valueOf(eVarArr12[2].f7710a), 2);
                hashMap.put(Integer.valueOf(eVarArr12[3].f7710a), 3);
                hashMap.put(Integer.valueOf(eVarArr12[4].f7710a), 7);
                hashMap.put(Integer.valueOf(eVarArr12[5].f7710a), 8);
                f7666s0 = Pattern.compile(".*[1-9].*");
                f7667t0 = Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");
                f7668u0 = Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                f7670v0 = Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                return;
            }
            f7659l0[i7] = new HashMap();
            f7660m0[i7] = new HashMap();
            for (e eVar : eVarArr11[i7]) {
                f7659l0[i7].put(Integer.valueOf(eVar.f7710a), eVar);
                f7660m0[i7].put(eVar.f7711b, eVar);
            }
            i7++;
        }
    }

    public C2604a(String str) {
        e[][] eVarArr = f7657j0;
        this.f7680f = new HashMap[eVarArr.length];
        this.f7681g = new HashSet(eVarArr.length);
        this.f7682h = ByteOrder.BIG_ENDIAN;
        if (str == null) {
            throw new NullPointerException("filename cannot be null");
        }
        m8937w(str);
    }

    /* renamed from: E */
    public static boolean m8884E(FileDescriptor fileDescriptor) {
        try {
            AbstractC2605b.a.m8977c(fileDescriptor, 0L, OsConstants.SEEK_CUR);
            return true;
        } catch (Exception unused) {
            if (!f7669v) {
                return false;
            }
            Log.d("ExifInterface", "The file descriptor for the given input is not seekable");
            return false;
        }
    }

    /* renamed from: G */
    public static boolean m8885G(int i7) {
        return i7 == 4 || i7 == 13 || i7 == 14;
    }

    /* renamed from: Y */
    public static boolean m8886Y(int i7) {
        return (i7 == 4 || i7 == 9 || i7 == 13 || i7 == 14) ? false : true;
    }

    /* renamed from: t */
    public static Pair m8887t(String str) {
        if (str.contains(",")) {
            String[] split = str.split(",", -1);
            Pair m8887t = m8887t(split[0]);
            if (((Integer) m8887t.first).intValue() == 2) {
                return m8887t;
            }
            for (int i7 = 1; i7 < split.length; i7++) {
                Pair m8887t2 = m8887t(split[i7]);
                int intValue = (((Integer) m8887t2.first).equals(m8887t.first) || ((Integer) m8887t2.second).equals(m8887t.first)) ? ((Integer) m8887t.first).intValue() : -1;
                int intValue2 = (((Integer) m8887t.second).intValue() == -1 || !(((Integer) m8887t2.first).equals(m8887t.second) || ((Integer) m8887t2.second).equals(m8887t.second))) ? -1 : ((Integer) m8887t.second).intValue();
                if (intValue == -1 && intValue2 == -1) {
                    return new Pair(2, -1);
                }
                if (intValue == -1) {
                    m8887t = new Pair(Integer.valueOf(intValue2), -1);
                } else if (intValue2 == -1) {
                    m8887t = new Pair(Integer.valueOf(intValue), -1);
                }
            }
            return m8887t;
        }
        if (!str.contains("/")) {
            try {
                try {
                    long parseLong = Long.parseLong(str);
                    return (parseLong < 0 || parseLong > 65535) ? parseLong < 0 ? new Pair(9, -1) : new Pair(4, -1) : new Pair(3, 4);
                } catch (NumberFormatException unused) {
                    return new Pair(2, -1);
                }
            } catch (NumberFormatException unused2) {
                Double.parseDouble(str);
                return new Pair(12, -1);
            }
        }
        String[] split2 = str.split("/", -1);
        if (split2.length == 2) {
            try {
                long parseDouble = (long) Double.parseDouble(split2[0]);
                long parseDouble2 = (long) Double.parseDouble(split2[1]);
                if (parseDouble >= 0 && parseDouble2 >= 0) {
                    if (parseDouble <= 2147483647L && parseDouble2 <= 2147483647L) {
                        return new Pair(10, 5);
                    }
                    return new Pair(5, -1);
                }
                return new Pair(10, -1);
            } catch (NumberFormatException unused3) {
            }
        }
        return new Pair(2, -1);
    }

    /* renamed from: x */
    public static boolean m8888x(BufferedInputStream bufferedInputStream) {
        byte[] bArr = f7664q0;
        bufferedInputStream.mark(bArr.length);
        byte[] bArr2 = new byte[bArr.length];
        bufferedInputStream.read(bArr2);
        bufferedInputStream.reset();
        int i7 = 0;
        while (true) {
            byte[] bArr3 = f7664q0;
            if (i7 >= bArr3.length) {
                return true;
            }
            if (bArr2[i7] != bArr3[i7]) {
                return false;
            }
            i7++;
        }
    }

    /* renamed from: z */
    public static boolean m8889z(byte[] bArr) {
        int i7 = 0;
        while (true) {
            byte[] bArr2 = f7623B;
            if (i7 >= bArr2.length) {
                return true;
            }
            if (bArr[i7] != bArr2[i7]) {
                return false;
            }
            i7++;
        }
    }

    /* renamed from: A */
    public final boolean m8890A(byte[] bArr) {
        b bVar = null;
        try {
            b bVar2 = new b(bArr);
            try {
                ByteOrder m8900M = m8900M(bVar2);
                this.f7682h = m8900M;
                bVar2.m8942g(m8900M);
                short readShort = bVar2.readShort();
                boolean z6 = readShort == 20306 || readShort == 21330;
                bVar2.close();
                return z6;
            } catch (Exception unused) {
                bVar = bVar2;
                if (bVar != null) {
                    bVar.close();
                }
                return false;
            } catch (Throwable th) {
                th = th;
                bVar = bVar2;
                if (bVar != null) {
                    bVar.close();
                }
                throw th;
            }
        } catch (Exception unused2) {
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* renamed from: B */
    public final boolean m8891B(byte[] bArr) {
        int i7 = 0;
        while (true) {
            byte[] bArr2 = f7629H;
            if (i7 >= bArr2.length) {
                return true;
            }
            if (bArr[i7] != bArr2[i7]) {
                return false;
            }
            i7++;
        }
    }

    /* renamed from: C */
    public final boolean m8892C(byte[] bArr) {
        byte[] bytes = "FUJIFILMCCD-RAW".getBytes(Charset.defaultCharset());
        for (int i7 = 0; i7 < bytes.length; i7++) {
            if (bArr[i7] != bytes[i7]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: D */
    public final boolean m8893D(byte[] bArr) {
        b bVar = null;
        try {
            b bVar2 = new b(bArr);
            try {
                ByteOrder m8900M = m8900M(bVar2);
                this.f7682h = m8900M;
                bVar2.m8942g(m8900M);
                boolean z6 = bVar2.readShort() == 85;
                bVar2.close();
                return z6;
            } catch (Exception unused) {
                bVar = bVar2;
                if (bVar != null) {
                    bVar.close();
                }
                return false;
            } catch (Throwable th) {
                th = th;
                bVar = bVar2;
                if (bVar != null) {
                    bVar.close();
                }
                throw th;
            }
        } catch (Exception unused2) {
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* renamed from: F */
    public final boolean m8894F(HashMap hashMap) {
        d dVar;
        int m8962m;
        d dVar2 = (d) hashMap.get("BitsPerSample");
        if (dVar2 != null) {
            int[] iArr = (int[]) dVar2.m8964o(this.f7682h);
            int[] iArr2 = f7673y;
            if (Arrays.equals(iArr2, iArr)) {
                return true;
            }
            if (this.f7678d == 3 && (dVar = (d) hashMap.get("PhotometricInterpretation")) != null && (((m8962m = dVar.m8962m(this.f7682h)) == 1 && Arrays.equals(iArr, f7622A)) || (m8962m == 6 && Arrays.equals(iArr, iArr2)))) {
                return true;
            }
        }
        if (!f7669v) {
            return false;
        }
        Log.d("ExifInterface", "Unsupported data type value");
        return false;
    }

    /* renamed from: H */
    public final boolean m8895H(HashMap hashMap) {
        d dVar = (d) hashMap.get("ImageLength");
        d dVar2 = (d) hashMap.get("ImageWidth");
        if (dVar == null || dVar2 == null) {
            return false;
        }
        return dVar.m8962m(this.f7682h) <= 512 && dVar2.m8962m(this.f7682h) <= 512;
    }

    /* renamed from: I */
    public final boolean m8896I(byte[] bArr) {
        int i7 = 0;
        while (true) {
            byte[] bArr2 = f7633L;
            if (i7 >= bArr2.length) {
                int i8 = 0;
                while (true) {
                    byte[] bArr3 = f7634M;
                    if (i8 >= bArr3.length) {
                        return true;
                    }
                    if (bArr[f7633L.length + i8 + 4] != bArr3[i8]) {
                        return false;
                    }
                    i8++;
                }
            } else {
                if (bArr[i7] != bArr2[i7]) {
                    return false;
                }
                i7++;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x009f A[Catch: all -> 0x0015, TRY_LEAVE, TryCatch #0 {all -> 0x0015, blocks: (B:4:0x0004, B:6:0x0009, B:8:0x001e, B:10:0x0022, B:11:0x0030, B:13:0x0038, B:15:0x0041, B:16:0x0061, B:23:0x0045, B:25:0x004b, B:28:0x0052, B:31:0x005a, B:32:0x005e, B:33:0x006b, B:35:0x0075, B:38:0x007d, B:41:0x0085, B:44:0x008d, B:53:0x009b, B:55:0x009f), top: B:3:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:? A[RETURN, SYNTHETIC] */
    /* renamed from: J */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m8897J(java.io.InputStream r5) {
        /*
            r4 = this;
            if (r5 == 0) goto Lb8
            r0 = 0
            r1 = r0
        L4:
            V.a$e[][] r2 = p147V.C2604a.f7657j0     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            int r2 = r2.length     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            if (r1 >= r2) goto L1e
            java.util.HashMap[] r2 = r4.f7680f     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            java.util.HashMap r3 = new java.util.HashMap     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            r3.<init>()     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            r2[r1] = r3     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            int r1 = r1 + 1
            goto L4
        L15:
            r5 = move-exception
            goto Lad
        L18:
            r5 = move-exception
            goto L9b
        L1b:
            r5 = move-exception
            goto L9b
        L1e:
            boolean r1 = r4.f7679e     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            if (r1 != 0) goto L30
            java.io.BufferedInputStream r1 = new java.io.BufferedInputStream     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            r2 = 5000(0x1388, float:7.006E-42)
            r1.<init>(r5, r2)     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            int r5 = r4.m8924i(r1)     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            r4.f7678d = r5     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            r5 = r1
        L30:
            int r1 = r4.f7678d     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            boolean r1 = m8886Y(r1)     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            if (r1 == 0) goto L6b
            V.a$g r0 = new V.a$g     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            r0.<init>(r5)     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            boolean r5 = r4.f7679e     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            if (r5 == 0) goto L45
            r4.m8931p(r0)     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            goto L61
        L45:
            int r5 = r4.f7678d     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            r1 = 12
            if (r5 != r1) goto L4f
            r4.m8922g(r0)     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            goto L61
        L4f:
            r1 = 7
            if (r5 != r1) goto L56
            r4.m8925j(r0)     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            goto L61
        L56:
            r1 = 10
            if (r5 != r1) goto L5e
            r4.m8930o(r0)     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            goto L61
        L5e:
            r4.m8928m(r0)     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
        L61:
            int r5 = r4.f7690p     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            long r1 = (long) r5     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            r0.m8968j(r1)     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            r4.m8911X(r0)     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            goto L90
        L6b:
            V.a$b r1 = new V.a$b     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            r1.<init>(r5)     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            int r5 = r4.f7678d     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            r2 = 4
            if (r5 != r2) goto L79
            r4.m8923h(r1, r0, r0)     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            goto L90
        L79:
            r0 = 13
            if (r5 != r0) goto L81
            r4.m8926k(r1)     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            goto L90
        L81:
            r0 = 9
            if (r5 != r0) goto L89
            r4.m8927l(r1)     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            goto L90
        L89:
            r0 = 14
            if (r5 != r0) goto L90
            r4.m8934s(r1)     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
        L90:
            r4.m8913a()
            boolean r5 = p147V.C2604a.f7669v
            if (r5 == 0) goto Lac
        L97:
            r4.m8899L()
            goto Lac
        L9b:
            boolean r0 = p147V.C2604a.f7669v     // Catch: java.lang.Throwable -> L15
            if (r0 == 0) goto La6
            java.lang.String r1 = "ExifInterface"
            java.lang.String r2 = "Invalid image: ExifInterface got an unsupported image format file(ExifInterface supports JPEG and some RAW image formats only) or a corrupted JPEG file to ExifInterface."
            android.util.Log.w(r1, r2, r5)     // Catch: java.lang.Throwable -> L15
        La6:
            r4.m8913a()
            if (r0 == 0) goto Lac
            goto L97
        Lac:
            return
        Lad:
            r4.m8913a()
            boolean r0 = p147V.C2604a.f7669v
            if (r0 == 0) goto Lb7
            r4.m8899L()
        Lb7:
            throw r5
        Lb8:
            java.lang.NullPointerException r5 = new java.lang.NullPointerException
            java.lang.String r0 = "inputstream shouldn't be null"
            r5.<init>(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p147V.C2604a.m8897J(java.io.InputStream):void");
    }

    /* renamed from: K */
    public final void m8898K(b bVar) {
        ByteOrder m8900M = m8900M(bVar);
        this.f7682h = m8900M;
        bVar.m8942g(m8900M);
        int readUnsignedShort = bVar.readUnsignedShort();
        int i7 = this.f7678d;
        if (i7 != 7 && i7 != 10 && readUnsignedShort != 42) {
            throw new IOException("Invalid start code: " + Integer.toHexString(readUnsignedShort));
        }
        int readInt = bVar.readInt();
        if (readInt < 8) {
            throw new IOException("Invalid first Ifd offset: " + readInt);
        }
        int i8 = readInt - 8;
        if (i8 > 0) {
            bVar.m8943h(i8);
        }
    }

    /* renamed from: L */
    public final void m8899L() {
        for (int i7 = 0; i7 < this.f7680f.length; i7++) {
            Log.d("ExifInterface", "The size of tag group[" + i7 + "]: " + this.f7680f[i7].size());
            for (Map.Entry entry : this.f7680f[i7].entrySet()) {
                d dVar = (d) entry.getValue();
                Log.d("ExifInterface", "tagName: " + ((String) entry.getKey()) + ", tagType: " + dVar.toString() + ", tagValue: '" + dVar.m8963n(this.f7682h) + "'");
            }
        }
    }

    /* renamed from: M */
    public final ByteOrder m8900M(b bVar) {
        short readShort = bVar.readShort();
        if (readShort == 18761) {
            if (f7669v) {
                Log.d("ExifInterface", "readExifSegment: Byte Align II");
            }
            return ByteOrder.LITTLE_ENDIAN;
        }
        if (readShort == 19789) {
            if (f7669v) {
                Log.d("ExifInterface", "readExifSegment: Byte Align MM");
            }
            return ByteOrder.BIG_ENDIAN;
        }
        throw new IOException("Invalid byte order: " + Integer.toHexString(readShort));
    }

    /* renamed from: N */
    public final void m8901N(byte[] bArr, int i7) {
        g gVar = new g(bArr);
        m8898K(gVar);
        m8902O(gVar, i7);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0243  */
    /* renamed from: O */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m8902O(p147V.C2604a.g r29, int r30) {
        /*
            Method dump skipped, instructions count: 985
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p147V.C2604a.m8902O(V.a$g, int):void");
    }

    /* renamed from: P */
    public final void m8903P(String str) {
        for (int i7 = 0; i7 < f7657j0.length; i7++) {
            this.f7680f[i7].remove(str);
        }
    }

    /* renamed from: Q */
    public final void m8904Q(int i7, String str, String str2) {
        if (this.f7680f[i7].isEmpty() || this.f7680f[i7].get(str) == null) {
            return;
        }
        HashMap hashMap = this.f7680f[i7];
        hashMap.put(str2, hashMap.get(str));
        this.f7680f[i7].remove(str);
    }

    /* renamed from: R */
    public final void m8905R(g gVar, int i7) {
        d dVar = (d) this.f7680f[i7].get("ImageLength");
        d dVar2 = (d) this.f7680f[i7].get("ImageWidth");
        if (dVar == null || dVar2 == null) {
            d dVar3 = (d) this.f7680f[i7].get("JPEGInterchangeFormat");
            d dVar4 = (d) this.f7680f[i7].get("JPEGInterchangeFormatLength");
            if (dVar3 == null || dVar4 == null) {
                return;
            }
            int m8962m = dVar3.m8962m(this.f7682h);
            int m8962m2 = dVar3.m8962m(this.f7682h);
            gVar.m8968j(m8962m);
            byte[] bArr = new byte[m8962m2];
            gVar.readFully(bArr);
            m8923h(new b(bArr), m8962m, i7);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x00f1 A[Catch: all -> 0x0101, Exception -> 0x0104, TryCatch #20 {Exception -> 0x0104, all -> 0x0101, blocks: (B:58:0x00ed, B:60:0x00f1, B:62:0x010e, B:66:0x0106), top: B:57:0x00ed }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0106 A[Catch: all -> 0x0101, Exception -> 0x0104, TryCatch #20 {Exception -> 0x0104, all -> 0x0101, blocks: (B:58:0x00ed, B:60:0x00f1, B:62:0x010e, B:66:0x0106), top: B:57:0x00ed }] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0152  */
    /* renamed from: S */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m8906S() {
        /*
            Method dump skipped, instructions count: 378
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p147V.C2604a.m8906S():void");
    }

    /* renamed from: T */
    public final void m8907T(InputStream inputStream, OutputStream outputStream) {
        if (f7669v) {
            Log.d("ExifInterface", "saveJpegAttributes starting with (inputStream: " + inputStream + ", outputStream: " + outputStream + ")");
        }
        b bVar = new b(inputStream);
        c cVar = new c(outputStream, ByteOrder.BIG_ENDIAN);
        if (bVar.readByte() != -1) {
            throw new IOException("Invalid marker");
        }
        cVar.m8945c(-1);
        if (bVar.readByte() != -40) {
            throw new IOException("Invalid marker");
        }
        cVar.m8945c(-40);
        d dVar = (m8919d("Xmp") == null || !this.f7695u) ? null : (d) this.f7680f[0].remove("Xmp");
        cVar.m8945c(-1);
        cVar.m8945c(-31);
        m8918c0(cVar);
        if (dVar != null) {
            this.f7680f[0].put("Xmp", dVar);
        }
        byte[] bArr = new byte[4096];
        while (bVar.readByte() == -1) {
            byte readByte = bVar.readByte();
            if (readByte == -39 || readByte == -38) {
                cVar.m8945c(-1);
                cVar.m8945c(readByte);
                AbstractC2605b.m8972d(bVar, cVar);
                return;
            }
            if (readByte != -31) {
                cVar.m8945c(-1);
                cVar.m8945c(readByte);
                int readUnsignedShort = bVar.readUnsignedShort();
                cVar.m8949j(readUnsignedShort);
                int i7 = readUnsignedShort - 2;
                if (i7 < 0) {
                    throw new IOException("Invalid length");
                }
                while (i7 > 0) {
                    int read = bVar.read(bArr, 0, Math.min(i7, 4096));
                    if (read >= 0) {
                        cVar.write(bArr, 0, read);
                        i7 -= read;
                    }
                }
            } else {
                int readUnsignedShort2 = bVar.readUnsignedShort();
                int i8 = readUnsignedShort2 - 2;
                if (i8 < 0) {
                    throw new IOException("Invalid length");
                }
                byte[] bArr2 = new byte[6];
                if (i8 >= 6) {
                    bVar.readFully(bArr2);
                    if (Arrays.equals(bArr2, f7664q0)) {
                        bVar.m8943h(readUnsignedShort2 - 8);
                    }
                }
                cVar.m8945c(-1);
                cVar.m8945c(readByte);
                cVar.m8949j(readUnsignedShort2);
                if (i8 >= 6) {
                    i8 = readUnsignedShort2 - 8;
                    cVar.write(bArr2);
                }
                while (i8 > 0) {
                    int read2 = bVar.read(bArr, 0, Math.min(i8, 4096));
                    if (read2 >= 0) {
                        cVar.write(bArr, 0, read2);
                        i8 -= read2;
                    }
                }
            }
        }
        throw new IOException("Invalid marker");
    }

    /* renamed from: U */
    public final void m8908U(InputStream inputStream, OutputStream outputStream) {
        ByteArrayOutputStream byteArrayOutputStream;
        if (f7669v) {
            Log.d("ExifInterface", "savePngAttributes starting with (inputStream: " + inputStream + ", outputStream: " + outputStream + ")");
        }
        b bVar = new b(inputStream);
        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
        c cVar = new c(outputStream, byteOrder);
        AbstractC2605b.m8973e(bVar, cVar, f7629H.length);
        if (this.f7690p == 0) {
            int readInt = bVar.readInt();
            cVar.m8946d(readInt);
            AbstractC2605b.m8973e(bVar, cVar, readInt + 8);
        } else {
            AbstractC2605b.m8973e(bVar, cVar, (r2 - r7.length) - 8);
            bVar.m8943h(bVar.readInt() + 8);
        }
        ByteArrayOutputStream byteArrayOutputStream2 = null;
        try {
            byteArrayOutputStream = new ByteArrayOutputStream();
        } catch (Throwable th) {
            th = th;
        }
        try {
            c cVar2 = new c(byteArrayOutputStream, byteOrder);
            m8918c0(cVar2);
            byte[] byteArray = ((ByteArrayOutputStream) cVar2.f7704a).toByteArray();
            cVar.write(byteArray);
            CRC32 crc32 = new CRC32();
            crc32.update(byteArray, 4, byteArray.length - 4);
            cVar.m8946d((int) crc32.getValue());
            AbstractC2605b.m8970b(byteArrayOutputStream);
            AbstractC2605b.m8972d(bVar, cVar);
        } catch (Throwable th2) {
            th = th2;
            byteArrayOutputStream2 = byteArrayOutputStream;
            AbstractC2605b.m8970b(byteArrayOutputStream2);
            throw th;
        }
    }

    /* renamed from: V */
    public final void m8909V(InputStream inputStream, OutputStream outputStream) {
        ByteArrayOutputStream byteArrayOutputStream;
        int i7;
        int i8;
        int i9;
        boolean z6;
        if (f7669v) {
            Log.d("ExifInterface", "saveWebpAttributes starting with (inputStream: " + inputStream + ", outputStream: " + outputStream + ")");
        }
        ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
        b bVar = new b(inputStream, byteOrder);
        c cVar = new c(outputStream, byteOrder);
        byte[] bArr = f7633L;
        AbstractC2605b.m8973e(bVar, cVar, bArr.length);
        byte[] bArr2 = f7634M;
        bVar.m8943h(bArr2.length + 4);
        ByteArrayOutputStream byteArrayOutputStream2 = null;
        try {
            try {
                byteArrayOutputStream = new ByteArrayOutputStream();
            } catch (Exception e7) {
                e = e7;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            c cVar2 = new c(byteArrayOutputStream, byteOrder);
            int i10 = this.f7690p;
            if (i10 != 0) {
                AbstractC2605b.m8973e(bVar, cVar2, (i10 - ((bArr.length + 4) + bArr2.length)) - 8);
                bVar.m8943h(4);
                int readInt = bVar.readInt();
                if (readInt % 2 != 0) {
                    readInt++;
                }
                bVar.m8943h(readInt);
                m8918c0(cVar2);
            } else {
                byte[] bArr3 = new byte[4];
                bVar.readFully(bArr3);
                byte[] bArr4 = f7637P;
                boolean z7 = true;
                if (Arrays.equals(bArr3, bArr4)) {
                    int readInt2 = bVar.readInt();
                    byte[] bArr5 = new byte[readInt2 % 2 == 1 ? readInt2 + 1 : readInt2];
                    bVar.readFully(bArr5);
                    byte b7 = (byte) (8 | bArr5[0]);
                    bArr5[0] = b7;
                    boolean z8 = ((b7 >> 1) & 1) == 1;
                    cVar2.write(bArr4);
                    cVar2.m8946d(readInt2);
                    cVar2.write(bArr5);
                    if (z8) {
                        m8915b(bVar, cVar2, f7640S, null);
                        while (true) {
                            byte[] bArr6 = new byte[4];
                            try {
                                bVar.readFully(bArr6);
                                z6 = !Arrays.equals(bArr6, f7641T);
                            } catch (EOFException unused) {
                                z6 = true;
                            }
                            if (z6) {
                                break;
                            } else {
                                m8917c(bVar, cVar2, bArr6);
                            }
                        }
                        m8918c0(cVar2);
                    } else {
                        m8915b(bVar, cVar2, f7639R, f7638Q);
                        m8918c0(cVar2);
                    }
                } else {
                    byte[] bArr7 = f7639R;
                    if (Arrays.equals(bArr3, bArr7) || Arrays.equals(bArr3, f7638Q)) {
                        int readInt3 = bVar.readInt();
                        int i11 = readInt3 % 2 == 1 ? readInt3 + 1 : readInt3;
                        byte[] bArr8 = new byte[3];
                        if (Arrays.equals(bArr3, bArr7)) {
                            bVar.readFully(bArr8);
                            byte[] bArr9 = new byte[3];
                            bVar.readFully(bArr9);
                            if (!Arrays.equals(f7636O, bArr9)) {
                                throw new IOException("Error checking VP8 signature");
                            }
                            int readInt4 = bVar.readInt();
                            i9 = (readInt4 << 2) >> 18;
                            i11 -= 10;
                            i7 = (readInt4 << 18) >> 18;
                            i8 = readInt4;
                            z7 = false;
                        } else if (!Arrays.equals(bArr3, f7638Q)) {
                            i7 = 0;
                            z7 = false;
                            i8 = 0;
                            i9 = 0;
                        } else {
                            if (bVar.readByte() != 47) {
                                throw new IOException("Error checking VP8L signature");
                            }
                            i8 = bVar.readInt();
                            i7 = (i8 & 16383) + 1;
                            i9 = ((i8 & 268419072) >>> 14) + 1;
                            if ((i8 & 268435456) == 0) {
                                z7 = false;
                            }
                            i11 -= 5;
                        }
                        cVar2.write(bArr4);
                        cVar2.m8946d(10);
                        byte[] bArr10 = new byte[10];
                        if (z7) {
                            bArr10[0] = (byte) (bArr10[0] | 16);
                        }
                        bArr10[0] = (byte) (bArr10[0] | 8);
                        int i12 = i7 - 1;
                        int i13 = i9 - 1;
                        bArr10[4] = (byte) i12;
                        bArr10[5] = (byte) (i12 >> 8);
                        bArr10[6] = (byte) (i12 >> 16);
                        bArr10[7] = (byte) i13;
                        bArr10[8] = (byte) (i13 >> 8);
                        bArr10[9] = (byte) (i13 >> 16);
                        cVar2.write(bArr10);
                        cVar2.write(bArr3);
                        cVar2.m8946d(readInt3);
                        if (Arrays.equals(bArr3, bArr7)) {
                            cVar2.write(bArr8);
                            cVar2.write(f7636O);
                            cVar2.m8946d(i8);
                        } else if (Arrays.equals(bArr3, f7638Q)) {
                            cVar2.write(47);
                            cVar2.m8946d(i8);
                        }
                        AbstractC2605b.m8973e(bVar, cVar2, i11);
                        m8918c0(cVar2);
                    }
                }
            }
            AbstractC2605b.m8972d(bVar, cVar2);
            int size = byteArrayOutputStream.size();
            byte[] bArr11 = f7634M;
            cVar.m8946d(size + bArr11.length);
            cVar.write(bArr11);
            byteArrayOutputStream.writeTo(cVar);
            AbstractC2605b.m8970b(byteArrayOutputStream);
        } catch (Exception e8) {
            e = e8;
            byteArrayOutputStream2 = byteArrayOutputStream;
            throw new IOException("Failed to save WebP file", e);
        } catch (Throwable th2) {
            th = th2;
            byteArrayOutputStream2 = byteArrayOutputStream;
            AbstractC2605b.m8970b(byteArrayOutputStream2);
            throw th;
        }
    }

    /* renamed from: W */
    public void m8910W(String str, String str2) {
        e eVar;
        int i7;
        int i8;
        String str3 = str;
        String str4 = str2;
        if (str3 == null) {
            throw new NullPointerException("tag shouldn't be null");
        }
        if (("DateTime".equals(str3) || "DateTimeOriginal".equals(str3) || "DateTimeDigitized".equals(str3)) && str4 != null) {
            boolean find = f7668u0.matcher(str4).find();
            boolean find2 = f7670v0.matcher(str4).find();
            if (str2.length() != 19 || (!find && !find2)) {
                Log.w("ExifInterface", "Invalid value for " + str3 + " : " + str4);
                return;
            }
            if (find2) {
                str4 = str4.replaceAll("-", TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER);
            }
        }
        if ("ISOSpeedRatings".equals(str3)) {
            if (f7669v) {
                Log.d("ExifInterface", "setAttribute: Replacing TAG_ISO_SPEED_RATINGS with TAG_PHOTOGRAPHIC_SENSITIVITY.");
            }
            str3 = "PhotographicSensitivity";
        }
        int i9 = 2;
        int i10 = 1;
        if (str4 != null && f7661n0.contains(str3)) {
            if (str3.equals("GPSTimeStamp")) {
                Matcher matcher = f7667t0.matcher(str4);
                if (!matcher.find()) {
                    Log.w("ExifInterface", "Invalid value for " + str3 + " : " + str4);
                    return;
                }
                str4 = Integer.parseInt(matcher.group(1)) + "/1," + Integer.parseInt(matcher.group(2)) + "/1," + Integer.parseInt(matcher.group(3)) + "/1";
            } else {
                try {
                    str4 = new f(Double.parseDouble(str4)).toString();
                } catch (NumberFormatException unused) {
                    Log.w("ExifInterface", "Invalid value for " + str3 + " : " + str4);
                    return;
                }
            }
        }
        int i11 = 0;
        int i12 = 0;
        while (i12 < f7657j0.length) {
            if ((i12 != 4 || this.f7683i) && (eVar = (e) f7660m0[i12].get(str3)) != null) {
                if (str4 == null) {
                    this.f7680f[i12].remove(str3);
                } else {
                    Pair m8887t = m8887t(str4);
                    int i13 = -1;
                    if (eVar.f7712c == ((Integer) m8887t.first).intValue() || eVar.f7712c == ((Integer) m8887t.second).intValue()) {
                        i7 = eVar.f7712c;
                    } else {
                        int i14 = eVar.f7713d;
                        if (i14 == -1 || !(i14 == ((Integer) m8887t.first).intValue() || eVar.f7713d == ((Integer) m8887t.second).intValue())) {
                            int i15 = eVar.f7712c;
                            if (i15 == i10 || i15 == 7 || i15 == i9) {
                                i7 = i15;
                            } else if (f7669v) {
                                StringBuilder sb = new StringBuilder();
                                sb.append("Given tag (");
                                sb.append(str3);
                                sb.append(") value didn't match with one of expected formats: ");
                                String[] strArr = f7644W;
                                sb.append(strArr[eVar.f7712c]);
                                int i16 = eVar.f7713d;
                                String str5 = StringUtils.EMPTY;
                                sb.append(i16 == -1 ? StringUtils.EMPTY : ", " + strArr[eVar.f7713d]);
                                sb.append(" (guess: ");
                                sb.append(strArr[((Integer) m8887t.first).intValue()]);
                                if (((Integer) m8887t.second).intValue() != -1) {
                                    str5 = ", " + strArr[((Integer) m8887t.second).intValue()];
                                }
                                sb.append(str5);
                                sb.append(")");
                                Log.d("ExifInterface", sb.toString());
                            }
                        } else {
                            i7 = eVar.f7713d;
                        }
                    }
                    switch (i7) {
                        case 1:
                            i8 = i10;
                            this.f7680f[i12].put(str3, d.m8950a(str4));
                            break;
                        case 2:
                        case 7:
                            i8 = i10;
                            this.f7680f[i12].put(str3, d.m8954e(str4));
                            break;
                        case 3:
                            i8 = i10;
                            String[] split = str4.split(",", -1);
                            int[] iArr = new int[split.length];
                            for (int i17 = 0; i17 < split.length; i17++) {
                                iArr[i17] = Integer.parseInt(split[i17]);
                            }
                            this.f7680f[i12].put(str3, d.m8960k(iArr, this.f7682h));
                            break;
                        case 4:
                            i8 = i10;
                            String[] split2 = str4.split(",", -1);
                            long[] jArr = new long[split2.length];
                            for (int i18 = 0; i18 < split2.length; i18++) {
                                jArr[i18] = Long.parseLong(split2[i18]);
                            }
                            this.f7680f[i12].put(str3, d.m8956g(jArr, this.f7682h));
                            break;
                        case 5:
                            String[] split3 = str4.split(",", -1);
                            f[] fVarArr = new f[split3.length];
                            int i19 = 0;
                            while (i19 < split3.length) {
                                String[] split4 = split3[i19].split("/", i13);
                                fVarArr[i19] = new f((long) Double.parseDouble(split4[0]), (long) Double.parseDouble(split4[1]));
                                i19++;
                                i13 = -1;
                            }
                            i8 = 1;
                            this.f7680f[i12].put(str3, d.m8958i(fVarArr, this.f7682h));
                            break;
                        case 6:
                        case 8:
                        case 11:
                        default:
                            if (f7669v) {
                                Log.d("ExifInterface", "Data format isn't one of expected formats: " + i7);
                                break;
                            }
                            break;
                        case 9:
                            String[] split5 = str4.split(",", -1);
                            int[] iArr2 = new int[split5.length];
                            for (int i20 = 0; i20 < split5.length; i20++) {
                                iArr2[i20] = Integer.parseInt(split5[i20]);
                            }
                            this.f7680f[i12].put(str3, d.m8952c(iArr2, this.f7682h));
                            i8 = 1;
                            break;
                        case 10:
                            String[] split6 = str4.split(",", -1);
                            f[] fVarArr2 = new f[split6.length];
                            int i21 = i11;
                            while (i21 < split6.length) {
                                String[] split7 = split6[i21].split("/", -1);
                                fVarArr2[i21] = new f((long) Double.parseDouble(split7[i11]), (long) Double.parseDouble(split7[i10]));
                                i21++;
                                split6 = split6;
                                i11 = 0;
                                i10 = 1;
                            }
                            this.f7680f[i12].put(str3, d.m8953d(fVarArr2, this.f7682h));
                            i8 = 1;
                            break;
                        case C5410A.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
                            String[] split8 = str4.split(",", -1);
                            double[] dArr = new double[split8.length];
                            for (int i22 = i11; i22 < split8.length; i22++) {
                                dArr[i22] = Double.parseDouble(split8[i22]);
                            }
                            this.f7680f[i12].put(str3, d.m8951b(dArr, this.f7682h));
                            break;
                    }
                    i12++;
                    i10 = i8;
                    i9 = 2;
                    i11 = 0;
                }
            }
            i8 = i10;
            i12++;
            i10 = i8;
            i9 = 2;
            i11 = 0;
        }
    }

    /* renamed from: X */
    public final void m8911X(b bVar) {
        HashMap hashMap = this.f7680f[4];
        d dVar = (d) hashMap.get("Compression");
        if (dVar == null) {
            this.f7689o = 6;
            m8935u(bVar, hashMap);
            return;
        }
        int m8962m = dVar.m8962m(this.f7682h);
        this.f7689o = m8962m;
        if (m8962m != 1) {
            if (m8962m == 6) {
                m8935u(bVar, hashMap);
                return;
            } else if (m8962m != 7) {
                return;
            }
        }
        if (m8894F(hashMap)) {
            m8936v(bVar, hashMap);
        }
    }

    /* renamed from: Z */
    public final void m8912Z(int i7, int i8) {
        if (this.f7680f[i7].isEmpty() || this.f7680f[i8].isEmpty()) {
            if (f7669v) {
                Log.d("ExifInterface", "Cannot perform swap since only one image data exists");
                return;
            }
            return;
        }
        d dVar = (d) this.f7680f[i7].get("ImageLength");
        d dVar2 = (d) this.f7680f[i7].get("ImageWidth");
        d dVar3 = (d) this.f7680f[i8].get("ImageLength");
        d dVar4 = (d) this.f7680f[i8].get("ImageWidth");
        if (dVar == null || dVar2 == null) {
            if (f7669v) {
                Log.d("ExifInterface", "First image does not contain valid size information");
                return;
            }
            return;
        }
        if (dVar3 == null || dVar4 == null) {
            if (f7669v) {
                Log.d("ExifInterface", "Second image does not contain valid size information");
                return;
            }
            return;
        }
        int m8962m = dVar.m8962m(this.f7682h);
        int m8962m2 = dVar2.m8962m(this.f7682h);
        int m8962m3 = dVar3.m8962m(this.f7682h);
        int m8962m4 = dVar4.m8962m(this.f7682h);
        if (m8962m >= m8962m3 || m8962m2 >= m8962m4) {
            return;
        }
        HashMap[] hashMapArr = this.f7680f;
        HashMap hashMap = hashMapArr[i7];
        hashMapArr[i7] = hashMapArr[i8];
        hashMapArr[i8] = hashMap;
    }

    /* renamed from: a */
    public final void m8913a() {
        String m8919d = m8919d("DateTimeOriginal");
        if (m8919d != null && m8919d("DateTime") == null) {
            this.f7680f[0].put("DateTime", d.m8954e(m8919d));
        }
        if (m8919d("ImageWidth") == null) {
            this.f7680f[0].put("ImageWidth", d.m8955f(0L, this.f7682h));
        }
        if (m8919d("ImageLength") == null) {
            this.f7680f[0].put("ImageLength", d.m8955f(0L, this.f7682h));
        }
        if (m8919d("Orientation") == null) {
            this.f7680f[0].put("Orientation", d.m8955f(0L, this.f7682h));
        }
        if (m8919d("LightSource") == null) {
            this.f7680f[1].put("LightSource", d.m8955f(0L, this.f7682h));
        }
    }

    /* renamed from: a0 */
    public final void m8914a0(g gVar, int i7) {
        d m8959j;
        d m8959j2;
        d dVar = (d) this.f7680f[i7].get("DefaultCropSize");
        d dVar2 = (d) this.f7680f[i7].get("SensorTopBorder");
        d dVar3 = (d) this.f7680f[i7].get("SensorLeftBorder");
        d dVar4 = (d) this.f7680f[i7].get("SensorBottomBorder");
        d dVar5 = (d) this.f7680f[i7].get("SensorRightBorder");
        if (dVar == null) {
            if (dVar2 == null || dVar3 == null || dVar4 == null || dVar5 == null) {
                m8905R(gVar, i7);
                return;
            }
            int m8962m = dVar2.m8962m(this.f7682h);
            int m8962m2 = dVar4.m8962m(this.f7682h);
            int m8962m3 = dVar5.m8962m(this.f7682h);
            int m8962m4 = dVar3.m8962m(this.f7682h);
            if (m8962m2 <= m8962m || m8962m3 <= m8962m4) {
                return;
            }
            d m8959j3 = d.m8959j(m8962m2 - m8962m, this.f7682h);
            d m8959j4 = d.m8959j(m8962m3 - m8962m4, this.f7682h);
            this.f7680f[i7].put("ImageLength", m8959j3);
            this.f7680f[i7].put("ImageWidth", m8959j4);
            return;
        }
        if (dVar.f7706a == 5) {
            f[] fVarArr = (f[]) dVar.m8964o(this.f7682h);
            if (fVarArr == null || fVarArr.length != 2) {
                Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(fVarArr));
                return;
            }
            m8959j = d.m8957h(fVarArr[0], this.f7682h);
            m8959j2 = d.m8957h(fVarArr[1], this.f7682h);
        } else {
            int[] iArr = (int[]) dVar.m8964o(this.f7682h);
            if (iArr == null || iArr.length != 2) {
                Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(iArr));
                return;
            }
            m8959j = d.m8959j(iArr[0], this.f7682h);
            m8959j2 = d.m8959j(iArr[1], this.f7682h);
        }
        this.f7680f[i7].put("ImageWidth", m8959j);
        this.f7680f[i7].put("ImageLength", m8959j2);
    }

    /* renamed from: b */
    public final void m8915b(b bVar, c cVar, byte[] bArr, byte[] bArr2) {
        while (true) {
            byte[] bArr3 = new byte[4];
            bVar.readFully(bArr3);
            m8917c(bVar, cVar, bArr3);
            if (Arrays.equals(bArr3, bArr)) {
                return;
            }
            if (bArr2 != null && Arrays.equals(bArr3, bArr2)) {
                return;
            }
        }
    }

    /* renamed from: b0 */
    public final void m8916b0() {
        m8912Z(0, 5);
        m8912Z(0, 4);
        m8912Z(5, 4);
        d dVar = (d) this.f7680f[1].get("PixelXDimension");
        d dVar2 = (d) this.f7680f[1].get("PixelYDimension");
        if (dVar != null && dVar2 != null) {
            this.f7680f[0].put("ImageWidth", dVar);
            this.f7680f[0].put("ImageLength", dVar2);
        }
        if (this.f7680f[4].isEmpty() && m8895H(this.f7680f[5])) {
            HashMap[] hashMapArr = this.f7680f;
            hashMapArr[4] = hashMapArr[5];
            hashMapArr[5] = new HashMap();
        }
        if (!m8895H(this.f7680f[4])) {
            Log.d("ExifInterface", "No image meets the size requirements of a thumbnail image.");
        }
        m8904Q(0, "ThumbnailOrientation", "Orientation");
        m8904Q(0, "ThumbnailImageLength", "ImageLength");
        m8904Q(0, "ThumbnailImageWidth", "ImageWidth");
        m8904Q(5, "ThumbnailOrientation", "Orientation");
        m8904Q(5, "ThumbnailImageLength", "ImageLength");
        m8904Q(5, "ThumbnailImageWidth", "ImageWidth");
        m8904Q(4, "Orientation", "ThumbnailOrientation");
        m8904Q(4, "ImageLength", "ThumbnailImageLength");
        m8904Q(4, "ImageWidth", "ThumbnailImageWidth");
    }

    /* renamed from: c */
    public final void m8917c(b bVar, c cVar, byte[] bArr) {
        int readInt = bVar.readInt();
        cVar.write(bArr);
        cVar.m8946d(readInt);
        if (readInt % 2 == 1) {
            readInt++;
        }
        AbstractC2605b.m8973e(bVar, cVar, readInt);
    }

    /* renamed from: c0 */
    public final int m8918c0(c cVar) {
        e[][] eVarArr = f7657j0;
        int[] iArr = new int[eVarArr.length];
        int[] iArr2 = new int[eVarArr.length];
        for (e eVar : f7658k0) {
            m8903P(eVar.f7711b);
        }
        if (this.f7683i) {
            if (this.f7684j) {
                m8903P("StripOffsets");
                m8903P("StripByteCounts");
            } else {
                m8903P("JPEGInterchangeFormat");
                m8903P("JPEGInterchangeFormatLength");
            }
        }
        for (int i7 = 0; i7 < f7657j0.length; i7++) {
            for (Object obj : this.f7680f[i7].entrySet().toArray()) {
                Map.Entry entry = (Map.Entry) obj;
                if (entry.getValue() == null) {
                    this.f7680f[i7].remove(entry.getKey());
                }
            }
        }
        if (!this.f7680f[1].isEmpty()) {
            this.f7680f[0].put(f7658k0[1].f7711b, d.m8955f(0L, this.f7682h));
        }
        if (!this.f7680f[2].isEmpty()) {
            this.f7680f[0].put(f7658k0[2].f7711b, d.m8955f(0L, this.f7682h));
        }
        if (!this.f7680f[3].isEmpty()) {
            this.f7680f[1].put(f7658k0[3].f7711b, d.m8955f(0L, this.f7682h));
        }
        if (this.f7683i) {
            if (this.f7684j) {
                this.f7680f[4].put("StripOffsets", d.m8959j(0, this.f7682h));
                this.f7680f[4].put("StripByteCounts", d.m8959j(this.f7687m, this.f7682h));
            } else {
                this.f7680f[4].put("JPEGInterchangeFormat", d.m8955f(0L, this.f7682h));
                this.f7680f[4].put("JPEGInterchangeFormatLength", d.m8955f(this.f7687m, this.f7682h));
            }
        }
        for (int i8 = 0; i8 < f7657j0.length; i8++) {
            Iterator it = this.f7680f[i8].entrySet().iterator();
            int i9 = 0;
            while (it.hasNext()) {
                int m8965p = ((d) ((Map.Entry) it.next()).getValue()).m8965p();
                if (m8965p > 4) {
                    i9 += m8965p;
                }
            }
            iArr2[i8] = iArr2[i8] + i9;
        }
        int i10 = 8;
        for (int i11 = 0; i11 < f7657j0.length; i11++) {
            if (!this.f7680f[i11].isEmpty()) {
                iArr[i11] = i10;
                i10 += (this.f7680f[i11].size() * 12) + 6 + iArr2[i11];
            }
        }
        if (this.f7683i) {
            if (this.f7684j) {
                this.f7680f[4].put("StripOffsets", d.m8959j(i10, this.f7682h));
            } else {
                this.f7680f[4].put("JPEGInterchangeFormat", d.m8955f(i10, this.f7682h));
            }
            this.f7686l = i10;
            i10 += this.f7687m;
        }
        if (this.f7678d == 4) {
            i10 += 8;
        }
        if (f7669v) {
            for (int i12 = 0; i12 < f7657j0.length; i12++) {
                Log.d("ExifInterface", String.format("index: %d, offsets: %d, tag count: %d, data sizes: %d, total size: %d", Integer.valueOf(i12), Integer.valueOf(iArr[i12]), Integer.valueOf(this.f7680f[i12].size()), Integer.valueOf(iArr2[i12]), Integer.valueOf(i10)));
            }
        }
        if (!this.f7680f[1].isEmpty()) {
            this.f7680f[0].put(f7658k0[1].f7711b, d.m8955f(iArr[1], this.f7682h));
        }
        if (!this.f7680f[2].isEmpty()) {
            this.f7680f[0].put(f7658k0[2].f7711b, d.m8955f(iArr[2], this.f7682h));
        }
        if (!this.f7680f[3].isEmpty()) {
            this.f7680f[1].put(f7658k0[3].f7711b, d.m8955f(iArr[3], this.f7682h));
        }
        int i13 = this.f7678d;
        if (i13 == 4) {
            if (i10 > 65535) {
                throw new IllegalStateException("Size of exif data (" + i10 + " bytes) exceeds the max size of a JPEG APP1 segment (65536 bytes)");
            }
            cVar.m8949j(i10);
            cVar.write(f7664q0);
        } else if (i13 == 13) {
            cVar.m8946d(i10);
            cVar.write(f7630I);
        } else if (i13 == 14) {
            cVar.write(f7635N);
            cVar.m8946d(i10);
        }
        cVar.m8947g(this.f7682h == ByteOrder.BIG_ENDIAN ? (short) 19789 : (short) 18761);
        cVar.m8944a(this.f7682h);
        cVar.m8949j(42);
        cVar.m8948h(8L);
        for (int i14 = 0; i14 < f7657j0.length; i14++) {
            if (!this.f7680f[i14].isEmpty()) {
                cVar.m8949j(this.f7680f[i14].size());
                int size = iArr[i14] + 2 + (this.f7680f[i14].size() * 12) + 4;
                for (Map.Entry entry2 : this.f7680f[i14].entrySet()) {
                    int i15 = ((e) f7660m0[i14].get(entry2.getKey())).f7710a;
                    d dVar = (d) entry2.getValue();
                    int m8965p2 = dVar.m8965p();
                    cVar.m8949j(i15);
                    cVar.m8949j(dVar.f7706a);
                    cVar.m8946d(dVar.f7707b);
                    if (m8965p2 > 4) {
                        cVar.m8948h(size);
                        size += m8965p2;
                    } else {
                        cVar.write(dVar.f7709d);
                        if (m8965p2 < 4) {
                            while (m8965p2 < 4) {
                                cVar.m8945c(0);
                                m8965p2++;
                            }
                        }
                    }
                }
                if (i14 != 0 || this.f7680f[4].isEmpty()) {
                    cVar.m8948h(0L);
                } else {
                    cVar.m8948h(iArr[4]);
                }
                Iterator it2 = this.f7680f[i14].entrySet().iterator();
                while (it2.hasNext()) {
                    byte[] bArr = ((d) ((Map.Entry) it2.next()).getValue()).f7709d;
                    if (bArr.length > 4) {
                        cVar.write(bArr, 0, bArr.length);
                    }
                }
            }
        }
        if (this.f7683i) {
            cVar.write(m8933r());
        }
        if (this.f7678d == 14 && i10 % 2 == 1) {
            cVar.m8945c(0);
        }
        cVar.m8944a(ByteOrder.BIG_ENDIAN);
        return i10;
    }

    /* renamed from: d */
    public String m8919d(String str) {
        if (str == null) {
            throw new NullPointerException("tag shouldn't be null");
        }
        d m8921f = m8921f(str);
        if (m8921f != null) {
            if (!f7661n0.contains(str)) {
                return m8921f.m8963n(this.f7682h);
            }
            if (str.equals("GPSTimeStamp")) {
                int i7 = m8921f.f7706a;
                if (i7 != 5 && i7 != 10) {
                    Log.w("ExifInterface", "GPS Timestamp format is not rational. format=" + m8921f.f7706a);
                    return null;
                }
                f[] fVarArr = (f[]) m8921f.m8964o(this.f7682h);
                if (fVarArr == null || fVarArr.length != 3) {
                    Log.w("ExifInterface", "Invalid GPS Timestamp array. array=" + Arrays.toString(fVarArr));
                    return null;
                }
                f fVar = fVarArr[0];
                Integer valueOf = Integer.valueOf((int) (fVar.f7714a / fVar.f7715b));
                f fVar2 = fVarArr[1];
                Integer valueOf2 = Integer.valueOf((int) (fVar2.f7714a / fVar2.f7715b));
                f fVar3 = fVarArr[2];
                return String.format("%02d:%02d:%02d", valueOf, valueOf2, Integer.valueOf((int) (fVar3.f7714a / fVar3.f7715b)));
            }
            try {
                return Double.toString(m8921f.m8961l(this.f7682h));
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    /* renamed from: e */
    public int m8920e(String str, int i7) {
        if (str == null) {
            throw new NullPointerException("tag shouldn't be null");
        }
        d m8921f = m8921f(str);
        if (m8921f == null) {
            return i7;
        }
        try {
            return m8921f.m8962m(this.f7682h);
        } catch (NumberFormatException unused) {
            return i7;
        }
    }

    /* renamed from: f */
    public final d m8921f(String str) {
        if (str == null) {
            throw new NullPointerException("tag shouldn't be null");
        }
        if ("ISOSpeedRatings".equals(str)) {
            if (f7669v) {
                Log.d("ExifInterface", "getExifAttribute: Replacing TAG_ISO_SPEED_RATINGS with TAG_PHOTOGRAPHIC_SENSITIVITY.");
            }
            str = "PhotographicSensitivity";
        }
        for (int i7 = 0; i7 < f7657j0.length; i7++) {
            d dVar = (d) this.f7680f[i7].get(str);
            if (dVar != null) {
                return dVar;
            }
        }
        return null;
    }

    /* renamed from: g */
    public final void m8922g(g gVar) {
        String str;
        String str2;
        String str3;
        if (Build.VERSION.SDK_INT < 28) {
            throw new UnsupportedOperationException("Reading EXIF from HEIF files is supported from SDK 28 and above");
        }
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            try {
                AbstractC2605b.b.m8978a(mediaMetadataRetriever, new a(gVar));
                String extractMetadata = mediaMetadataRetriever.extractMetadata(33);
                String extractMetadata2 = mediaMetadataRetriever.extractMetadata(34);
                String extractMetadata3 = mediaMetadataRetriever.extractMetadata(26);
                String extractMetadata4 = mediaMetadataRetriever.extractMetadata(17);
                if ("yes".equals(extractMetadata3)) {
                    str = mediaMetadataRetriever.extractMetadata(29);
                    str2 = mediaMetadataRetriever.extractMetadata(30);
                    str3 = mediaMetadataRetriever.extractMetadata(31);
                } else if ("yes".equals(extractMetadata4)) {
                    str = mediaMetadataRetriever.extractMetadata(18);
                    str2 = mediaMetadataRetriever.extractMetadata(19);
                    str3 = mediaMetadataRetriever.extractMetadata(24);
                } else {
                    str = null;
                    str2 = null;
                    str3 = null;
                }
                if (str != null) {
                    this.f7680f[0].put("ImageWidth", d.m8959j(Integer.parseInt(str), this.f7682h));
                }
                if (str2 != null) {
                    this.f7680f[0].put("ImageLength", d.m8959j(Integer.parseInt(str2), this.f7682h));
                }
                if (str3 != null) {
                    int parseInt = Integer.parseInt(str3);
                    this.f7680f[0].put("Orientation", d.m8959j(parseInt != 90 ? parseInt != 180 ? parseInt != 270 ? 1 : 8 : 3 : 6, this.f7682h));
                }
                if (extractMetadata != null && extractMetadata2 != null) {
                    int parseInt2 = Integer.parseInt(extractMetadata);
                    int parseInt3 = Integer.parseInt(extractMetadata2);
                    if (parseInt3 <= 6) {
                        throw new IOException("Invalid exif length");
                    }
                    gVar.m8968j(parseInt2);
                    byte[] bArr = new byte[6];
                    gVar.readFully(bArr);
                    int i7 = parseInt2 + 6;
                    int i8 = parseInt3 - 6;
                    if (!Arrays.equals(bArr, f7664q0)) {
                        throw new IOException("Invalid identifier");
                    }
                    byte[] bArr2 = new byte[i8];
                    gVar.readFully(bArr2);
                    this.f7690p = i7;
                    m8901N(bArr2, 0);
                }
                if (f7669v) {
                    Log.d("ExifInterface", "Heif meta: " + str + "x" + str2 + ", rotation " + str3);
                }
                mediaMetadataRetriever.release();
            } catch (RuntimeException unused) {
                throw new UnsupportedOperationException("Failed to read EXIF from HEIF file. Given stream is either malformed or unsupported.");
            }
        } catch (Throwable th) {
            mediaMetadataRetriever.release();
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:66:0x0186, code lost:
    
        r22.m8942g(r21.f7682h);
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x018b, code lost:
    
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0170 A[LOOP:0: B:9:0x0037->B:33:0x0170, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0177 A[SYNTHETIC] */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m8923h(p147V.C2604a.b r22, int r23, int r24) {
        /*
            Method dump skipped, instructions count: 522
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p147V.C2604a.m8923h(V.a$b, int, int):void");
    }

    /* renamed from: i */
    public final int m8924i(BufferedInputStream bufferedInputStream) {
        bufferedInputStream.mark(5000);
        byte[] bArr = new byte[5000];
        bufferedInputStream.read(bArr);
        bufferedInputStream.reset();
        if (m8889z(bArr)) {
            return 4;
        }
        if (m8892C(bArr)) {
            return 9;
        }
        if (m8938y(bArr)) {
            return 12;
        }
        if (m8890A(bArr)) {
            return 7;
        }
        if (m8893D(bArr)) {
            return 10;
        }
        if (m8891B(bArr)) {
            return 13;
        }
        return m8896I(bArr) ? 14 : 0;
    }

    /* renamed from: j */
    public final void m8925j(g gVar) {
        int i7;
        int i8;
        m8928m(gVar);
        d dVar = (d) this.f7680f[1].get("MakerNote");
        if (dVar != null) {
            g gVar2 = new g(dVar.f7709d);
            gVar2.m8942g(this.f7682h);
            byte[] bArr = f7627F;
            byte[] bArr2 = new byte[bArr.length];
            gVar2.readFully(bArr2);
            gVar2.m8968j(0L);
            byte[] bArr3 = f7628G;
            byte[] bArr4 = new byte[bArr3.length];
            gVar2.readFully(bArr4);
            if (Arrays.equals(bArr2, bArr)) {
                gVar2.m8968j(8L);
            } else if (Arrays.equals(bArr4, bArr3)) {
                gVar2.m8968j(12L);
            }
            m8902O(gVar2, 6);
            d dVar2 = (d) this.f7680f[7].get("PreviewImageStart");
            d dVar3 = (d) this.f7680f[7].get("PreviewImageLength");
            if (dVar2 != null && dVar3 != null) {
                this.f7680f[5].put("JPEGInterchangeFormat", dVar2);
                this.f7680f[5].put("JPEGInterchangeFormatLength", dVar3);
            }
            d dVar4 = (d) this.f7680f[8].get("AspectFrame");
            if (dVar4 != null) {
                int[] iArr = (int[]) dVar4.m8964o(this.f7682h);
                if (iArr == null || iArr.length != 4) {
                    Log.w("ExifInterface", "Invalid aspect frame values. frame=" + Arrays.toString(iArr));
                    return;
                }
                int i9 = iArr[2];
                int i10 = iArr[0];
                if (i9 <= i10 || (i7 = iArr[3]) <= (i8 = iArr[1])) {
                    return;
                }
                int i11 = (i9 - i10) + 1;
                int i12 = (i7 - i8) + 1;
                if (i11 < i12) {
                    int i13 = i11 + i12;
                    i12 = i13 - i12;
                    i11 = i13 - i12;
                }
                d m8959j = d.m8959j(i11, this.f7682h);
                d m8959j2 = d.m8959j(i12, this.f7682h);
                this.f7680f[0].put("ImageWidth", m8959j);
                this.f7680f[0].put("ImageLength", m8959j2);
            }
        }
    }

    /* renamed from: k */
    public final void m8926k(b bVar) {
        if (f7669v) {
            Log.d("ExifInterface", "getPngAttributes starting with: " + bVar);
        }
        bVar.m8942g(ByteOrder.BIG_ENDIAN);
        byte[] bArr = f7629H;
        bVar.m8943h(bArr.length);
        int length = bArr.length;
        while (true) {
            try {
                int readInt = bVar.readInt();
                byte[] bArr2 = new byte[4];
                bVar.readFully(bArr2);
                int i7 = length + 8;
                if (i7 == 16 && !Arrays.equals(bArr2, f7631J)) {
                    throw new IOException("Encountered invalid PNG file--IHDR chunk should appearas the first chunk");
                }
                if (Arrays.equals(bArr2, f7632K)) {
                    return;
                }
                if (Arrays.equals(bArr2, f7630I)) {
                    byte[] bArr3 = new byte[readInt];
                    bVar.readFully(bArr3);
                    int readInt2 = bVar.readInt();
                    CRC32 crc32 = new CRC32();
                    crc32.update(bArr2);
                    crc32.update(bArr3);
                    if (((int) crc32.getValue()) == readInt2) {
                        this.f7690p = i7;
                        m8901N(bArr3, 0);
                        m8916b0();
                        m8911X(new b(bArr3));
                        return;
                    }
                    throw new IOException("Encountered invalid CRC value for PNG-EXIF chunk.\n recorded CRC value: " + readInt2 + ", calculated CRC value: " + crc32.getValue());
                }
                int i8 = readInt + 4;
                bVar.m8943h(i8);
                length = i7 + i8;
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt PNG file.");
            }
        }
    }

    /* renamed from: l */
    public final void m8927l(b bVar) {
        boolean z6 = f7669v;
        if (z6) {
            Log.d("ExifInterface", "getRafAttributes starting with: " + bVar);
        }
        bVar.m8943h(84);
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[4];
        byte[] bArr3 = new byte[4];
        bVar.readFully(bArr);
        bVar.readFully(bArr2);
        bVar.readFully(bArr3);
        int i7 = ByteBuffer.wrap(bArr).getInt();
        int i8 = ByteBuffer.wrap(bArr2).getInt();
        int i9 = ByteBuffer.wrap(bArr3).getInt();
        byte[] bArr4 = new byte[i8];
        bVar.m8943h(i7 - bVar.m8940c());
        bVar.readFully(bArr4);
        m8923h(new b(bArr4), i7, 5);
        bVar.m8943h(i9 - bVar.m8940c());
        bVar.m8942g(ByteOrder.BIG_ENDIAN);
        int readInt = bVar.readInt();
        if (z6) {
            Log.d("ExifInterface", "numberOfDirectoryEntry: " + readInt);
        }
        for (int i10 = 0; i10 < readInt; i10++) {
            int readUnsignedShort = bVar.readUnsignedShort();
            int readUnsignedShort2 = bVar.readUnsignedShort();
            if (readUnsignedShort == f7652e0.f7710a) {
                short readShort = bVar.readShort();
                short readShort2 = bVar.readShort();
                d m8959j = d.m8959j(readShort, this.f7682h);
                d m8959j2 = d.m8959j(readShort2, this.f7682h);
                this.f7680f[0].put("ImageLength", m8959j);
                this.f7680f[0].put("ImageWidth", m8959j2);
                if (f7669v) {
                    Log.d("ExifInterface", "Updated to length: " + ((int) readShort) + ", width: " + ((int) readShort2));
                    return;
                }
                return;
            }
            bVar.m8943h(readUnsignedShort2);
        }
    }

    /* renamed from: m */
    public final void m8928m(g gVar) {
        d dVar;
        m8898K(gVar);
        m8902O(gVar, 0);
        m8914a0(gVar, 0);
        m8914a0(gVar, 5);
        m8914a0(gVar, 4);
        m8916b0();
        if (this.f7678d != 8 || (dVar = (d) this.f7680f[1].get("MakerNote")) == null) {
            return;
        }
        g gVar2 = new g(dVar.f7709d);
        gVar2.m8942g(this.f7682h);
        gVar2.m8943h(6);
        m8902O(gVar2, 9);
        d dVar2 = (d) this.f7680f[9].get("ColorSpace");
        if (dVar2 != null) {
            this.f7680f[1].put("ColorSpace", dVar2);
        }
    }

    /* renamed from: n */
    public int m8929n() {
        switch (m8920e("Orientation", 1)) {
            case 3:
            case 4:
                return 180;
            case 5:
            case 8:
                return 270;
            case 6:
            case 7:
                return 90;
            default:
                return 0;
        }
    }

    /* renamed from: o */
    public final void m8930o(g gVar) {
        if (f7669v) {
            Log.d("ExifInterface", "getRw2Attributes starting with: " + gVar);
        }
        m8928m(gVar);
        d dVar = (d) this.f7680f[0].get("JpgFromRaw");
        if (dVar != null) {
            m8923h(new b(dVar.f7709d), (int) dVar.f7708c, 5);
        }
        d dVar2 = (d) this.f7680f[0].get("ISO");
        d dVar3 = (d) this.f7680f[1].get("PhotographicSensitivity");
        if (dVar2 == null || dVar3 != null) {
            return;
        }
        this.f7680f[1].put("PhotographicSensitivity", dVar2);
    }

    /* renamed from: p */
    public final void m8931p(g gVar) {
        byte[] bArr = f7664q0;
        gVar.m8943h(bArr.length);
        byte[] bArr2 = new byte[gVar.available()];
        gVar.readFully(bArr2);
        this.f7690p = bArr.length;
        m8901N(bArr2, 0);
    }

    /* renamed from: q */
    public byte[] m8932q() {
        int i7 = this.f7689o;
        if (i7 == 6 || i7 == 7) {
            return m8933r();
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0095  */
    /* renamed from: r */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public byte[] m8933r() {
        /*
            r8 = this;
            java.lang.String r0 = "ExifInterface"
            boolean r1 = r8.f7683i
            r2 = 0
            if (r1 != 0) goto L8
            return r2
        L8:
            byte[] r1 = r8.f7688n
            if (r1 == 0) goto Ld
            return r1
        Ld:
            android.content.res.AssetManager$AssetInputStream r1 = r8.f7677c     // Catch: java.lang.Throwable -> L3b java.lang.Exception -> L3e
            if (r1 == 0) goto L2f
            boolean r3 = r1.markSupported()     // Catch: java.lang.Throwable -> L1c java.lang.Exception -> L21
            if (r3 == 0) goto L26
            r1.reset()     // Catch: java.lang.Throwable -> L1c java.lang.Exception -> L21
        L1a:
            r3 = r2
            goto L58
        L1c:
            r0 = move-exception
            r3 = r2
        L1e:
            r2 = r1
            goto L90
        L21:
            r3 = move-exception
            r4 = r3
            r3 = r2
            goto L82
        L26:
            java.lang.String r3 = "Cannot read thumbnail from inputstream without mark/reset support"
            android.util.Log.d(r0, r3)     // Catch: java.lang.Throwable -> L1c java.lang.Exception -> L21
            p147V.AbstractC2605b.m8970b(r1)
            return r2
        L2f:
            java.lang.String r1 = r8.f7675a     // Catch: java.lang.Throwable -> L3b java.lang.Exception -> L3e
            if (r1 == 0) goto L43
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L3b java.lang.Exception -> L3e
            java.lang.String r3 = r8.f7675a     // Catch: java.lang.Throwable -> L3b java.lang.Exception -> L3e
            r1.<init>(r3)     // Catch: java.lang.Throwable -> L3b java.lang.Exception -> L3e
            goto L1a
        L3b:
            r0 = move-exception
            r3 = r2
            goto L90
        L3e:
            r3 = move-exception
            r1 = r2
            r4 = r3
            r3 = r1
            goto L82
        L43:
            java.io.FileDescriptor r1 = r8.f7676b     // Catch: java.lang.Throwable -> L3b java.lang.Exception -> L3e
            java.io.FileDescriptor r1 = p147V.AbstractC2605b.a.m8976b(r1)     // Catch: java.lang.Throwable -> L3b java.lang.Exception -> L3e
            int r3 = android.system.OsConstants.SEEK_SET     // Catch: java.lang.Throwable -> L7b java.lang.Exception -> L7e
            r4 = 0
            p147V.AbstractC2605b.a.m8977c(r1, r4, r3)     // Catch: java.lang.Throwable -> L7b java.lang.Exception -> L7e
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L7b java.lang.Exception -> L7e
            r3.<init>(r1)     // Catch: java.lang.Throwable -> L7b java.lang.Exception -> L7e
            r7 = r3
            r3 = r1
            r1 = r7
        L58:
            V.a$b r4 = new V.a$b     // Catch: java.lang.Throwable -> L77 java.lang.Exception -> L79
            r4.<init>(r1)     // Catch: java.lang.Throwable -> L77 java.lang.Exception -> L79
            int r5 = r8.f7686l     // Catch: java.lang.Throwable -> L77 java.lang.Exception -> L79
            int r6 = r8.f7690p     // Catch: java.lang.Throwable -> L77 java.lang.Exception -> L79
            int r5 = r5 + r6
            r4.m8943h(r5)     // Catch: java.lang.Throwable -> L77 java.lang.Exception -> L79
            int r5 = r8.f7687m     // Catch: java.lang.Throwable -> L77 java.lang.Exception -> L79
            byte[] r5 = new byte[r5]     // Catch: java.lang.Throwable -> L77 java.lang.Exception -> L79
            r4.readFully(r5)     // Catch: java.lang.Throwable -> L77 java.lang.Exception -> L79
            r8.f7688n = r5     // Catch: java.lang.Throwable -> L77 java.lang.Exception -> L79
            p147V.AbstractC2605b.m8970b(r1)
            if (r3 == 0) goto L76
            p147V.AbstractC2605b.m8969a(r3)
        L76:
            return r5
        L77:
            r0 = move-exception
            goto L1e
        L79:
            r4 = move-exception
            goto L82
        L7b:
            r0 = move-exception
            r3 = r1
            goto L90
        L7e:
            r3 = move-exception
            r4 = r3
            r3 = r1
            r1 = r2
        L82:
            java.lang.String r5 = "Encountered exception while getting thumbnail"
            android.util.Log.d(r0, r5, r4)     // Catch: java.lang.Throwable -> L77
            p147V.AbstractC2605b.m8970b(r1)
            if (r3 == 0) goto L8f
            p147V.AbstractC2605b.m8969a(r3)
        L8f:
            return r2
        L90:
            p147V.AbstractC2605b.m8970b(r2)
            if (r3 == 0) goto L98
            p147V.AbstractC2605b.m8969a(r3)
        L98:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p147V.C2604a.m8933r():byte[]");
    }

    /* renamed from: s */
    public final void m8934s(b bVar) {
        if (f7669v) {
            Log.d("ExifInterface", "getWebpAttributes starting with: " + bVar);
        }
        bVar.m8942g(ByteOrder.LITTLE_ENDIAN);
        bVar.m8943h(f7633L.length);
        int readInt = bVar.readInt() + 8;
        byte[] bArr = f7634M;
        bVar.m8943h(bArr.length);
        int length = bArr.length + 8;
        while (true) {
            try {
                byte[] bArr2 = new byte[4];
                bVar.readFully(bArr2);
                int readInt2 = bVar.readInt();
                int i7 = length + 8;
                if (Arrays.equals(f7635N, bArr2)) {
                    byte[] bArr3 = new byte[readInt2];
                    bVar.readFully(bArr3);
                    this.f7690p = i7;
                    m8901N(bArr3, 0);
                    m8911X(new b(bArr3));
                    return;
                }
                if (readInt2 % 2 == 1) {
                    readInt2++;
                }
                length = i7 + readInt2;
                if (length == readInt) {
                    return;
                }
                if (length > readInt) {
                    throw new IOException("Encountered WebP file with invalid chunk size");
                }
                bVar.m8943h(readInt2);
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt WebP file.");
            }
        }
    }

    /* renamed from: u */
    public final void m8935u(b bVar, HashMap hashMap) {
        d dVar = (d) hashMap.get("JPEGInterchangeFormat");
        d dVar2 = (d) hashMap.get("JPEGInterchangeFormatLength");
        if (dVar == null || dVar2 == null) {
            return;
        }
        int m8962m = dVar.m8962m(this.f7682h);
        int m8962m2 = dVar2.m8962m(this.f7682h);
        if (this.f7678d == 7) {
            m8962m += this.f7691q;
        }
        if (m8962m > 0 && m8962m2 > 0) {
            this.f7683i = true;
            if (this.f7675a == null && this.f7677c == null && this.f7676b == null) {
                byte[] bArr = new byte[m8962m2];
                bVar.m8943h(m8962m);
                bVar.readFully(bArr);
                this.f7688n = bArr;
            }
            this.f7686l = m8962m;
            this.f7687m = m8962m2;
        }
        if (f7669v) {
            Log.d("ExifInterface", "Setting thumbnail attributes with offset: " + m8962m + ", length: " + m8962m2);
        }
    }

    /* renamed from: v */
    public final void m8936v(b bVar, HashMap hashMap) {
        byte[] bArr;
        d dVar = (d) hashMap.get("StripOffsets");
        d dVar2 = (d) hashMap.get("StripByteCounts");
        if (dVar == null || dVar2 == null) {
            return;
        }
        long[] m8971c = AbstractC2605b.m8971c(dVar.m8964o(this.f7682h));
        long[] m8971c2 = AbstractC2605b.m8971c(dVar2.m8964o(this.f7682h));
        if (m8971c == null || m8971c.length == 0) {
            Log.w("ExifInterface", "stripOffsets should not be null or have zero length.");
            return;
        }
        if (m8971c2 == null || m8971c2.length == 0) {
            Log.w("ExifInterface", "stripByteCounts should not be null or have zero length.");
            return;
        }
        if (m8971c.length != m8971c2.length) {
            Log.w("ExifInterface", "stripOffsets and stripByteCounts should have same length.");
            return;
        }
        long j7 = 0;
        for (long j8 : m8971c2) {
            j7 += j8;
        }
        int i7 = (int) j7;
        byte[] bArr2 = new byte[i7];
        this.f7685k = true;
        this.f7684j = true;
        this.f7683i = true;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        while (i8 < m8971c.length) {
            int i11 = (int) m8971c[i8];
            int i12 = (int) m8971c2[i8];
            if (i8 < m8971c.length - 1) {
                bArr = bArr2;
                if (i11 + i12 != m8971c[i8 + 1]) {
                    this.f7685k = false;
                }
            } else {
                bArr = bArr2;
            }
            int i13 = i11 - i9;
            if (i13 < 0) {
                Log.d("ExifInterface", "Invalid strip offset value");
                return;
            }
            try {
                bVar.m8943h(i13);
                int i14 = i9 + i13;
                byte[] bArr3 = new byte[i12];
                try {
                    bVar.readFully(bArr3);
                    i9 = i14 + i12;
                    byte[] bArr4 = bArr;
                    System.arraycopy(bArr3, 0, bArr4, i10, i12);
                    i10 += i12;
                    i8++;
                    bArr2 = bArr4;
                } catch (EOFException unused) {
                    Log.d("ExifInterface", "Failed to read " + i12 + " bytes.");
                    return;
                }
            } catch (EOFException unused2) {
                Log.d("ExifInterface", "Failed to skip " + i13 + " bytes.");
                return;
            }
        }
        this.f7688n = bArr2;
        if (this.f7685k) {
            this.f7686l = (int) m8971c[0];
            this.f7687m = i7;
        }
    }

    /* renamed from: w */
    public final void m8937w(String str) {
        FileInputStream fileInputStream;
        if (str == null) {
            throw new NullPointerException("filename cannot be null");
        }
        FileInputStream fileInputStream2 = null;
        this.f7677c = null;
        this.f7675a = str;
        try {
            fileInputStream = new FileInputStream(str);
        } catch (Throwable th) {
            th = th;
        }
        try {
            if (m8884E(fileInputStream.getFD())) {
                this.f7676b = fileInputStream.getFD();
            } else {
                this.f7676b = null;
            }
            m8897J(fileInputStream);
            AbstractC2605b.m8970b(fileInputStream);
        } catch (Throwable th2) {
            th = th2;
            fileInputStream2 = fileInputStream;
            AbstractC2605b.m8970b(fileInputStream2);
            throw th;
        }
    }

    /* renamed from: y */
    public final boolean m8938y(byte[] bArr) {
        b bVar;
        long readInt;
        byte[] bArr2;
        long j7;
        b bVar2 = null;
        try {
            try {
                bVar = new b(bArr);
            } catch (Exception e7) {
                e = e7;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            readInt = bVar.readInt();
            bArr2 = new byte[4];
            bVar.readFully(bArr2);
        } catch (Exception e8) {
            e = e8;
            bVar2 = bVar;
            if (f7669v) {
                Log.d("ExifInterface", "Exception parsing HEIF file type box.", e);
            }
            if (bVar2 != null) {
                bVar2.close();
            }
            return false;
        } catch (Throwable th2) {
            th = th2;
            bVar2 = bVar;
            if (bVar2 != null) {
                bVar2.close();
            }
            throw th;
        }
        if (!Arrays.equals(bArr2, f7624C)) {
            bVar.close();
            return false;
        }
        if (readInt == 1) {
            readInt = bVar.readLong();
            j7 = 16;
            if (readInt < 16) {
                bVar.close();
                return false;
            }
        } else {
            j7 = 8;
        }
        if (readInt > bArr.length) {
            readInt = bArr.length;
        }
        long j8 = readInt - j7;
        if (j8 < 8) {
            bVar.close();
            return false;
        }
        byte[] bArr3 = new byte[4];
        boolean z6 = false;
        boolean z7 = false;
        for (long j9 = 0; j9 < j8 / 4; j9++) {
            try {
                bVar.readFully(bArr3);
                if (j9 != 1) {
                    if (Arrays.equals(bArr3, f7625D)) {
                        z6 = true;
                    } else if (Arrays.equals(bArr3, f7626E)) {
                        z7 = true;
                    }
                    if (z6 && z7) {
                        bVar.close();
                        return true;
                    }
                }
            } catch (EOFException unused) {
                bVar.close();
                return false;
            }
        }
        bVar.close();
        return false;
    }

    /* renamed from: V.a$b */
    public static class b extends InputStream implements DataInput {

        /* renamed from: a */
        public final DataInputStream f7699a;

        /* renamed from: b */
        public int f7700b;

        /* renamed from: c */
        public ByteOrder f7701c;

        /* renamed from: d */
        public byte[] f7702d;

        /* renamed from: e */
        public int f7703e;

        public b(byte[] bArr) {
            this(new ByteArrayInputStream(bArr), ByteOrder.BIG_ENDIAN);
            this.f7703e = bArr.length;
        }

        /* renamed from: a */
        public int m8939a() {
            return this.f7703e;
        }

        @Override // java.io.InputStream
        public int available() {
            return this.f7699a.available();
        }

        /* renamed from: c */
        public int m8940c() {
            return this.f7700b;
        }

        /* renamed from: d */
        public long m8941d() {
            return readInt() & 4294967295L;
        }

        /* renamed from: g */
        public void m8942g(ByteOrder byteOrder) {
            this.f7701c = byteOrder;
        }

        /* renamed from: h */
        public void m8943h(int i7) {
            int i8 = 0;
            while (i8 < i7) {
                int i9 = i7 - i8;
                int skip = (int) this.f7699a.skip(i9);
                if (skip <= 0) {
                    if (this.f7702d == null) {
                        this.f7702d = new byte[8192];
                    }
                    skip = this.f7699a.read(this.f7702d, 0, Math.min(8192, i9));
                    if (skip == -1) {
                        throw new EOFException("Reached EOF while skipping " + i7 + " bytes.");
                    }
                }
                i8 += skip;
            }
            this.f7700b += i8;
        }

        @Override // java.io.InputStream
        public void mark(int i7) {
            throw new UnsupportedOperationException("Mark is currently unsupported");
        }

        @Override // java.io.InputStream
        public int read() {
            this.f7700b++;
            return this.f7699a.read();
        }

        @Override // java.io.DataInput
        public boolean readBoolean() {
            this.f7700b++;
            return this.f7699a.readBoolean();
        }

        @Override // java.io.DataInput
        public byte readByte() {
            this.f7700b++;
            int read = this.f7699a.read();
            if (read >= 0) {
                return (byte) read;
            }
            throw new EOFException();
        }

        @Override // java.io.DataInput
        public char readChar() {
            this.f7700b += 2;
            return this.f7699a.readChar();
        }

        @Override // java.io.DataInput
        public double readDouble() {
            return Double.longBitsToDouble(readLong());
        }

        @Override // java.io.DataInput
        public float readFloat() {
            return Float.intBitsToFloat(readInt());
        }

        @Override // java.io.DataInput
        public void readFully(byte[] bArr, int i7, int i8) {
            this.f7700b += i8;
            this.f7699a.readFully(bArr, i7, i8);
        }

        @Override // java.io.DataInput
        public int readInt() {
            this.f7700b += 4;
            int read = this.f7699a.read();
            int read2 = this.f7699a.read();
            int read3 = this.f7699a.read();
            int read4 = this.f7699a.read();
            if ((read | read2 | read3 | read4) < 0) {
                throw new EOFException();
            }
            ByteOrder byteOrder = this.f7701c;
            if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                return (read4 << 24) + (read3 << 16) + (read2 << 8) + read;
            }
            if (byteOrder == ByteOrder.BIG_ENDIAN) {
                return (read << 24) + (read2 << 16) + (read3 << 8) + read4;
            }
            throw new IOException("Invalid byte order: " + this.f7701c);
        }

        @Override // java.io.DataInput
        public String readLine() {
            Log.d("ExifInterface", "Currently unsupported");
            return null;
        }

        @Override // java.io.DataInput
        public long readLong() {
            this.f7700b += 8;
            int read = this.f7699a.read();
            int read2 = this.f7699a.read();
            int read3 = this.f7699a.read();
            int read4 = this.f7699a.read();
            int read5 = this.f7699a.read();
            int read6 = this.f7699a.read();
            int read7 = this.f7699a.read();
            int read8 = this.f7699a.read();
            if ((read | read2 | read3 | read4 | read5 | read6 | read7 | read8) < 0) {
                throw new EOFException();
            }
            ByteOrder byteOrder = this.f7701c;
            if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                return (read8 << 56) + (read7 << 48) + (read6 << 40) + (read5 << 32) + (read4 << 24) + (read3 << 16) + (read2 << 8) + read;
            }
            if (byteOrder == ByteOrder.BIG_ENDIAN) {
                return (read << 56) + (read2 << 48) + (read3 << 40) + (read4 << 32) + (read5 << 24) + (read6 << 16) + (read7 << 8) + read8;
            }
            throw new IOException("Invalid byte order: " + this.f7701c);
        }

        @Override // java.io.DataInput
        public short readShort() {
            this.f7700b += 2;
            int read = this.f7699a.read();
            int read2 = this.f7699a.read();
            if ((read | read2) < 0) {
                throw new EOFException();
            }
            ByteOrder byteOrder = this.f7701c;
            if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                return (short) ((read2 << 8) + read);
            }
            if (byteOrder == ByteOrder.BIG_ENDIAN) {
                return (short) ((read << 8) + read2);
            }
            throw new IOException("Invalid byte order: " + this.f7701c);
        }

        @Override // java.io.DataInput
        public String readUTF() {
            this.f7700b += 2;
            return this.f7699a.readUTF();
        }

        @Override // java.io.DataInput
        public int readUnsignedByte() {
            this.f7700b++;
            return this.f7699a.readUnsignedByte();
        }

        @Override // java.io.DataInput
        public int readUnsignedShort() {
            this.f7700b += 2;
            int read = this.f7699a.read();
            int read2 = this.f7699a.read();
            if ((read | read2) < 0) {
                throw new EOFException();
            }
            ByteOrder byteOrder = this.f7701c;
            if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                return (read2 << 8) + read;
            }
            if (byteOrder == ByteOrder.BIG_ENDIAN) {
                return (read << 8) + read2;
            }
            throw new IOException("Invalid byte order: " + this.f7701c);
        }

        @Override // java.io.InputStream
        public void reset() {
            throw new UnsupportedOperationException("Reset is currently unsupported");
        }

        @Override // java.io.DataInput
        public int skipBytes(int i7) {
            throw new UnsupportedOperationException("skipBytes is currently unsupported");
        }

        public b(InputStream inputStream) {
            this(inputStream, ByteOrder.BIG_ENDIAN);
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i7, int i8) {
            int read = this.f7699a.read(bArr, i7, i8);
            this.f7700b += read;
            return read;
        }

        @Override // java.io.DataInput
        public void readFully(byte[] bArr) {
            this.f7700b += bArr.length;
            this.f7699a.readFully(bArr);
        }

        public b(InputStream inputStream, ByteOrder byteOrder) {
            DataInputStream dataInputStream = new DataInputStream(inputStream);
            this.f7699a = dataInputStream;
            dataInputStream.mark(0);
            this.f7700b = 0;
            this.f7701c = byteOrder;
            this.f7703e = inputStream instanceof b ? ((b) inputStream).m8939a() : -1;
        }
    }

    /* renamed from: V.a$g */
    public static class g extends b {
        public g(byte[] bArr) {
            super(bArr);
            this.f7699a.mark(C3643a.e.API_PRIORITY_OTHER);
        }

        /* renamed from: j */
        public void m8968j(long j7) {
            int i7 = this.f7700b;
            if (i7 > j7) {
                this.f7700b = 0;
                this.f7699a.reset();
            } else {
                j7 -= i7;
            }
            m8943h((int) j7);
        }

        public g(InputStream inputStream) {
            super(inputStream);
            if (inputStream.markSupported()) {
                this.f7699a.mark(C3643a.e.API_PRIORITY_OTHER);
                return;
            }
            throw new IllegalArgumentException("Cannot create SeekableByteOrderedDataInputStream with stream that does not support mark/reset");
        }
    }

    /* renamed from: V.a$e */
    public static class e {

        /* renamed from: a */
        public final int f7710a;

        /* renamed from: b */
        public final String f7711b;

        /* renamed from: c */
        public final int f7712c;

        /* renamed from: d */
        public final int f7713d;

        public e(String str, int i7, int i8) {
            this.f7711b = str;
            this.f7710a = i7;
            this.f7712c = i8;
            this.f7713d = -1;
        }

        /* renamed from: a */
        public boolean m8966a(int i7) {
            int i8;
            int i9 = this.f7712c;
            if (i9 == 7 || i7 == 7 || i9 == i7 || (i8 = this.f7713d) == i7) {
                return true;
            }
            if ((i9 == 4 || i8 == 4) && i7 == 3) {
                return true;
            }
            if ((i9 == 9 || i8 == 9) && i7 == 8) {
                return true;
            }
            return (i9 == 12 || i8 == 12) && i7 == 11;
        }

        public e(String str, int i7, int i8, int i9) {
            this.f7711b = str;
            this.f7710a = i7;
            this.f7712c = i8;
            this.f7713d = i9;
        }
    }

    public C2604a(InputStream inputStream) {
        this(inputStream, 0);
    }

    public C2604a(InputStream inputStream, int i7) {
        e[][] eVarArr = f7657j0;
        this.f7680f = new HashMap[eVarArr.length];
        this.f7681g = new HashSet(eVarArr.length);
        this.f7682h = ByteOrder.BIG_ENDIAN;
        if (inputStream != null) {
            this.f7675a = null;
            if (i7 == 1) {
                BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream, f7664q0.length);
                if (!m8888x(bufferedInputStream)) {
                    Log.w("ExifInterface", "Given data does not follow the structure of an Exif-only data.");
                    return;
                }
                this.f7679e = true;
                this.f7677c = null;
                this.f7676b = null;
                inputStream = bufferedInputStream;
            } else if (inputStream instanceof AssetManager.AssetInputStream) {
                this.f7677c = (AssetManager.AssetInputStream) inputStream;
                this.f7676b = null;
            } else {
                if (inputStream instanceof FileInputStream) {
                    FileInputStream fileInputStream = (FileInputStream) inputStream;
                    if (m8884E(fileInputStream.getFD())) {
                        this.f7677c = null;
                        this.f7676b = fileInputStream.getFD();
                    }
                }
                this.f7677c = null;
                this.f7676b = null;
            }
            m8897J(inputStream);
            return;
        }
        throw new NullPointerException("inputStream cannot be null");
    }

    /* renamed from: V.a$a */
    public class a extends MediaDataSource {

        /* renamed from: a */
        public long f7696a;

        /* renamed from: b */
        public final /* synthetic */ g f7697b;

        public a(g gVar) {
            this.f7697b = gVar;
        }

        @Override // android.media.MediaDataSource
        public long getSize() {
            return -1L;
        }

        @Override // android.media.MediaDataSource
        public int readAt(long j7, byte[] bArr, int i7, int i8) {
            if (i8 == 0) {
                return 0;
            }
            if (j7 < 0) {
                return -1;
            }
            try {
                long j8 = this.f7696a;
                if (j8 != j7) {
                    if (j8 >= 0 && j7 >= j8 + this.f7697b.available()) {
                        return -1;
                    }
                    this.f7697b.m8968j(j7);
                    this.f7696a = j7;
                }
                if (i8 > this.f7697b.available()) {
                    i8 = this.f7697b.available();
                }
                int read = this.f7697b.read(bArr, i7, i8);
                if (read >= 0) {
                    this.f7696a += read;
                    return read;
                }
            } catch (IOException unused) {
            }
            this.f7696a = -1L;
            return -1;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }
    }
}
