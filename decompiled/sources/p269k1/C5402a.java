package p269k1;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.List;
import org.apache.tika.utils.XMLReaderUtils;
import p178Z2.AbstractC3033v;
import p248i0.C4503a;
import p249i1.AbstractC4528s;
import p249i1.C4514e;
import p249i1.InterfaceC4520k;
import p249i1.InterfaceC4529t;
import p259j0.AbstractC5330M;
import p259j0.AbstractC5346o;
import p259j0.C5356y;
import p259j0.C5357z;
import p259j0.InterfaceC5338g;
import p272k4.C5413D;

/* renamed from: k1.a */
/* loaded from: classes.dex */
public final class C5402a implements InterfaceC4529t {

    /* renamed from: h */
    public static final byte[] f19294h = {0, 7, 8, 15};

    /* renamed from: i */
    public static final byte[] f19295i = {0, 119, -120, -1};

    /* renamed from: j */
    public static final byte[] f19296j = {0, 17, 34, 51, 68, 85, 102, 119, -120, -103, -86, -69, -52, -35, -18, -1};

    /* renamed from: a */
    public final Paint f19297a;

    /* renamed from: b */
    public final Paint f19298b;

    /* renamed from: c */
    public final Canvas f19299c;

    /* renamed from: d */
    public final b f19300d;

    /* renamed from: e */
    public final a f19301e;

    /* renamed from: f */
    public final h f19302f;

    /* renamed from: g */
    public Bitmap f19303g;

    /* renamed from: k1.a$a */
    public static final class a {

        /* renamed from: a */
        public final int f19304a;

        /* renamed from: b */
        public final int[] f19305b;

        /* renamed from: c */
        public final int[] f19306c;

        /* renamed from: d */
        public final int[] f19307d;

        public a(int i7, int[] iArr, int[] iArr2, int[] iArr3) {
            this.f19304a = i7;
            this.f19305b = iArr;
            this.f19306c = iArr2;
            this.f19307d = iArr3;
        }
    }

    /* renamed from: k1.a$b */
    public static final class b {

        /* renamed from: a */
        public final int f19308a;

        /* renamed from: b */
        public final int f19309b;

        /* renamed from: c */
        public final int f19310c;

        /* renamed from: d */
        public final int f19311d;

        /* renamed from: e */
        public final int f19312e;

        /* renamed from: f */
        public final int f19313f;

        public b(int i7, int i8, int i9, int i10, int i11, int i12) {
            this.f19308a = i7;
            this.f19309b = i8;
            this.f19310c = i9;
            this.f19311d = i10;
            this.f19312e = i11;
            this.f19313f = i12;
        }
    }

    /* renamed from: k1.a$c */
    public static final class c {

        /* renamed from: a */
        public final int f19314a;

        /* renamed from: b */
        public final boolean f19315b;

        /* renamed from: c */
        public final byte[] f19316c;

        /* renamed from: d */
        public final byte[] f19317d;

        public c(int i7, boolean z6, byte[] bArr, byte[] bArr2) {
            this.f19314a = i7;
            this.f19315b = z6;
            this.f19316c = bArr;
            this.f19317d = bArr2;
        }
    }

    /* renamed from: k1.a$d */
    public static final class d {

        /* renamed from: a */
        public final int f19318a;

        /* renamed from: b */
        public final int f19319b;

        /* renamed from: c */
        public final int f19320c;

        /* renamed from: d */
        public final SparseArray f19321d;

        public d(int i7, int i8, int i9, SparseArray sparseArray) {
            this.f19318a = i7;
            this.f19319b = i8;
            this.f19320c = i9;
            this.f19321d = sparseArray;
        }
    }

    /* renamed from: k1.a$e */
    public static final class e {

        /* renamed from: a */
        public final int f19322a;

        /* renamed from: b */
        public final int f19323b;

        public e(int i7, int i8) {
            this.f19322a = i7;
            this.f19323b = i8;
        }
    }

    /* renamed from: k1.a$f */
    public static final class f {

        /* renamed from: a */
        public final int f19324a;

        /* renamed from: b */
        public final boolean f19325b;

        /* renamed from: c */
        public final int f19326c;

        /* renamed from: d */
        public final int f19327d;

        /* renamed from: e */
        public final int f19328e;

        /* renamed from: f */
        public final int f19329f;

        /* renamed from: g */
        public final int f19330g;

        /* renamed from: h */
        public final int f19331h;

        /* renamed from: i */
        public final int f19332i;

        /* renamed from: j */
        public final int f19333j;

        /* renamed from: k */
        public final SparseArray f19334k;

        public f(int i7, boolean z6, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, SparseArray sparseArray) {
            this.f19324a = i7;
            this.f19325b = z6;
            this.f19326c = i8;
            this.f19327d = i9;
            this.f19328e = i10;
            this.f19329f = i11;
            this.f19330g = i12;
            this.f19331h = i13;
            this.f19332i = i14;
            this.f19333j = i15;
            this.f19334k = sparseArray;
        }

        /* renamed from: a */
        public void m22363a(f fVar) {
            SparseArray sparseArray = fVar.f19334k;
            for (int i7 = 0; i7 < sparseArray.size(); i7++) {
                this.f19334k.put(sparseArray.keyAt(i7), (g) sparseArray.valueAt(i7));
            }
        }
    }

    /* renamed from: k1.a$g */
    public static final class g {

        /* renamed from: a */
        public final int f19335a;

        /* renamed from: b */
        public final int f19336b;

        /* renamed from: c */
        public final int f19337c;

        /* renamed from: d */
        public final int f19338d;

        /* renamed from: e */
        public final int f19339e;

        /* renamed from: f */
        public final int f19340f;

        public g(int i7, int i8, int i9, int i10, int i11, int i12) {
            this.f19335a = i7;
            this.f19336b = i8;
            this.f19337c = i9;
            this.f19338d = i10;
            this.f19339e = i11;
            this.f19340f = i12;
        }
    }

    /* renamed from: k1.a$h */
    public static final class h {

        /* renamed from: a */
        public final int f19341a;

        /* renamed from: b */
        public final int f19342b;

        /* renamed from: c */
        public final SparseArray f19343c = new SparseArray();

        /* renamed from: d */
        public final SparseArray f19344d = new SparseArray();

        /* renamed from: e */
        public final SparseArray f19345e = new SparseArray();

        /* renamed from: f */
        public final SparseArray f19346f = new SparseArray();

        /* renamed from: g */
        public final SparseArray f19347g = new SparseArray();

        /* renamed from: h */
        public b f19348h;

        /* renamed from: i */
        public d f19349i;

        public h(int i7, int i8) {
            this.f19341a = i7;
            this.f19342b = i8;
        }

        /* renamed from: a */
        public void m22364a() {
            this.f19343c.clear();
            this.f19344d.clear();
            this.f19345e.clear();
            this.f19346f.clear();
            this.f19347g.clear();
            this.f19348h = null;
            this.f19349i = null;
        }
    }

    public C5402a(List list) {
        C5357z c5357z = new C5357z((byte[]) list.get(0));
        int m21932M = c5357z.m21932M();
        int m21932M2 = c5357z.m21932M();
        Paint paint = new Paint();
        this.f19297a = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        paint.setPathEffect(null);
        Paint paint2 = new Paint();
        this.f19298b = paint2;
        paint2.setStyle(Paint.Style.FILL);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
        paint2.setPathEffect(null);
        this.f19299c = new Canvas();
        this.f19300d = new b(719, 575, 0, 719, 0, 575);
        this.f19301e = new a(0, m22347e(), m22348f(), m22349g());
        this.f19302f = new h(m21932M, m21932M2);
    }

    /* renamed from: d */
    public static byte[] m22346d(int i7, int i8, C5356y c5356y) {
        byte[] bArr = new byte[i7];
        for (int i9 = 0; i9 < i7; i9++) {
            bArr[i9] = (byte) c5356y.m21908h(i8);
        }
        return bArr;
    }

    /* renamed from: e */
    public static int[] m22347e() {
        return new int[]{0, -1, -16777216, -8421505};
    }

    /* renamed from: f */
    public static int[] m22348f() {
        int[] iArr = new int[16];
        iArr[0] = 0;
        for (int i7 = 1; i7 < 16; i7++) {
            if (i7 < 8) {
                iArr[i7] = m22350h(255, (i7 & 1) != 0 ? 255 : 0, (i7 & 2) != 0 ? 255 : 0, (i7 & 4) != 0 ? 255 : 0);
            } else {
                iArr[i7] = m22350h(255, (i7 & 1) != 0 ? 127 : 0, (i7 & 2) != 0 ? 127 : 0, (i7 & 4) == 0 ? 0 : 127);
            }
        }
        return iArr;
    }

    /* renamed from: g */
    public static int[] m22349g() {
        int[] iArr = new int[256];
        iArr[0] = 0;
        for (int i7 = 0; i7 < 256; i7++) {
            if (i7 < 8) {
                iArr[i7] = m22350h(63, (i7 & 1) != 0 ? 255 : 0, (i7 & 2) != 0 ? 255 : 0, (i7 & 4) == 0 ? 0 : 255);
            } else {
                int i8 = i7 & 136;
                if (i8 == 0) {
                    iArr[i7] = m22350h(255, ((i7 & 1) != 0 ? 85 : 0) + ((i7 & 16) != 0 ? 170 : 0), ((i7 & 2) != 0 ? 85 : 0) + ((i7 & 32) != 0 ? 170 : 0), ((i7 & 4) == 0 ? 0 : 85) + ((i7 & 64) == 0 ? 0 : 170));
                } else if (i8 == 8) {
                    iArr[i7] = m22350h(127, ((i7 & 1) != 0 ? 85 : 0) + ((i7 & 16) != 0 ? 170 : 0), ((i7 & 2) != 0 ? 85 : 0) + ((i7 & 32) != 0 ? 170 : 0), ((i7 & 4) == 0 ? 0 : 85) + ((i7 & 64) == 0 ? 0 : 170));
                } else if (i8 == 128) {
                    iArr[i7] = m22350h(255, ((i7 & 1) != 0 ? 43 : 0) + 127 + ((i7 & 16) != 0 ? 85 : 0), ((i7 & 2) != 0 ? 43 : 0) + 127 + ((i7 & 32) != 0 ? 85 : 0), ((i7 & 4) == 0 ? 0 : 43) + 127 + ((i7 & 64) == 0 ? 0 : 85));
                } else if (i8 == 136) {
                    iArr[i7] = m22350h(255, ((i7 & 1) != 0 ? 43 : 0) + ((i7 & 16) != 0 ? 85 : 0), ((i7 & 2) != 0 ? 43 : 0) + ((i7 & 32) != 0 ? 85 : 0), ((i7 & 4) == 0 ? 0 : 43) + ((i7 & 64) == 0 ? 0 : 85));
                }
            }
        }
        return iArr;
    }

    /* renamed from: h */
    public static int m22350h(int i7, int i8, int i9, int i10) {
        return (i7 << 24) | (i8 << 16) | (i9 << 8) | i10;
    }

    /* renamed from: i */
    public static int m22351i(C5356y c5356y, int[] iArr, byte[] bArr, int i7, int i8, Paint paint, Canvas canvas) {
        boolean z6;
        int i9;
        int m21908h;
        int m21908h2;
        int i10 = i7;
        boolean z7 = false;
        while (true) {
            int m21908h3 = c5356y.m21908h(2);
            if (m21908h3 != 0) {
                z6 = z7;
                i9 = 1;
            } else {
                if (c5356y.m21907g()) {
                    m21908h = c5356y.m21908h(3) + 3;
                    m21908h2 = c5356y.m21908h(2);
                } else {
                    if (c5356y.m21907g()) {
                        z6 = z7;
                        i9 = 1;
                    } else {
                        int m21908h4 = c5356y.m21908h(2);
                        if (m21908h4 == 0) {
                            z6 = true;
                        } else if (m21908h4 == 1) {
                            z6 = z7;
                            i9 = 2;
                        } else if (m21908h4 == 2) {
                            m21908h = c5356y.m21908h(4) + 12;
                            m21908h2 = c5356y.m21908h(2);
                        } else if (m21908h4 != 3) {
                            z6 = z7;
                        } else {
                            m21908h = c5356y.m21908h(8) + 29;
                            m21908h2 = c5356y.m21908h(2);
                        }
                        m21908h3 = 0;
                        i9 = 0;
                    }
                    m21908h3 = 0;
                }
                z6 = z7;
                i9 = m21908h;
                m21908h3 = m21908h2;
            }
            if (i9 != 0 && paint != null) {
                if (bArr != null) {
                    m21908h3 = bArr[m21908h3];
                }
                paint.setColor(iArr[m21908h3]);
                canvas.drawRect(i10, i8, i10 + i9, i8 + 1, paint);
            }
            i10 += i9;
            if (z6) {
                return i10;
            }
            z7 = z6;
        }
    }

    /* renamed from: j */
    public static int m22352j(C5356y c5356y, int[] iArr, byte[] bArr, int i7, int i8, Paint paint, Canvas canvas) {
        boolean z6;
        int i9;
        int m21908h;
        int m21908h2;
        int i10 = i7;
        boolean z7 = false;
        while (true) {
            int m21908h3 = c5356y.m21908h(4);
            if (m21908h3 != 0) {
                z6 = z7;
                i9 = 1;
            } else if (c5356y.m21907g()) {
                if (c5356y.m21907g()) {
                    int m21908h4 = c5356y.m21908h(2);
                    if (m21908h4 == 0) {
                        z6 = z7;
                        i9 = 1;
                    } else if (m21908h4 == 1) {
                        z6 = z7;
                        i9 = 2;
                    } else if (m21908h4 == 2) {
                        m21908h = c5356y.m21908h(4) + 9;
                        m21908h2 = c5356y.m21908h(4);
                    } else if (m21908h4 != 3) {
                        z6 = z7;
                        m21908h3 = 0;
                        i9 = 0;
                    } else {
                        m21908h = c5356y.m21908h(8) + 25;
                        m21908h2 = c5356y.m21908h(4);
                    }
                    m21908h3 = 0;
                } else {
                    m21908h = c5356y.m21908h(2) + 4;
                    m21908h2 = c5356y.m21908h(4);
                }
                z6 = z7;
                i9 = m21908h;
                m21908h3 = m21908h2;
            } else {
                int m21908h5 = c5356y.m21908h(3);
                if (m21908h5 != 0) {
                    z6 = z7;
                    i9 = m21908h5 + 2;
                    m21908h3 = 0;
                } else {
                    z6 = true;
                    m21908h3 = 0;
                    i9 = 0;
                }
            }
            if (i9 != 0 && paint != null) {
                if (bArr != null) {
                    m21908h3 = bArr[m21908h3];
                }
                paint.setColor(iArr[m21908h3]);
                canvas.drawRect(i10, i8, i10 + i9, i8 + 1, paint);
            }
            i10 += i9;
            if (z6) {
                return i10;
            }
            z7 = z6;
        }
    }

    /* renamed from: k */
    public static int m22353k(C5356y c5356y, int[] iArr, byte[] bArr, int i7, int i8, Paint paint, Canvas canvas) {
        boolean z6;
        int m21908h;
        int i9 = i7;
        boolean z7 = false;
        while (true) {
            int m21908h2 = c5356y.m21908h(8);
            if (m21908h2 != 0) {
                z6 = z7;
                m21908h = 1;
            } else if (c5356y.m21907g()) {
                z6 = z7;
                m21908h = c5356y.m21908h(7);
                m21908h2 = c5356y.m21908h(8);
            } else {
                int m21908h3 = c5356y.m21908h(7);
                if (m21908h3 != 0) {
                    z6 = z7;
                    m21908h = m21908h3;
                    m21908h2 = 0;
                } else {
                    z6 = true;
                    m21908h2 = 0;
                    m21908h = 0;
                }
            }
            if (m21908h != 0 && paint != null) {
                if (bArr != null) {
                    m21908h2 = bArr[m21908h2];
                }
                paint.setColor(iArr[m21908h2]);
                canvas.drawRect(i9, i8, i9 + m21908h, i8 + 1, paint);
            }
            i9 += m21908h;
            if (z6) {
                return i9;
            }
            z7 = z6;
        }
    }

    /* renamed from: l */
    public static void m22354l(byte[] bArr, int[] iArr, int i7, int i8, int i9, Paint paint, Canvas canvas) {
        byte[] bArr2;
        byte[] bArr3;
        byte[] bArr4;
        C5356y c5356y = new C5356y(bArr);
        int i10 = i8;
        int i11 = i9;
        byte[] bArr5 = null;
        byte[] bArr6 = null;
        byte[] bArr7 = null;
        while (c5356y.m21902b() != 0) {
            int m21908h = c5356y.m21908h(8);
            if (m21908h != 240) {
                switch (m21908h) {
                    case 16:
                        if (i7 != 3) {
                            if (i7 != 2) {
                                bArr2 = null;
                                i10 = m22351i(c5356y, iArr, bArr2, i10, i11, paint, canvas);
                                c5356y.m21903c();
                                break;
                            } else {
                                bArr3 = bArr7 == null ? f19294h : bArr7;
                            }
                        } else {
                            bArr3 = bArr5 == null ? f19295i : bArr5;
                        }
                        bArr2 = bArr3;
                        i10 = m22351i(c5356y, iArr, bArr2, i10, i11, paint, canvas);
                        c5356y.m21903c();
                    case 17:
                        if (i7 == 3) {
                            bArr4 = bArr6 == null ? f19296j : bArr6;
                        } else {
                            bArr4 = null;
                        }
                        i10 = m22352j(c5356y, iArr, bArr4, i10, i11, paint, canvas);
                        c5356y.m21903c();
                        break;
                    case C5413D.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                        i10 = m22353k(c5356y, iArr, null, i10, i11, paint, canvas);
                        break;
                    default:
                        switch (m21908h) {
                            case 32:
                                bArr7 = m22346d(4, 4, c5356y);
                                break;
                            case 33:
                                bArr5 = m22346d(4, 8, c5356y);
                                break;
                            case 34:
                                bArr6 = m22346d(16, 8, c5356y);
                                break;
                        }
                }
            } else {
                i11 += 2;
                i10 = i8;
            }
        }
    }

    /* renamed from: m */
    public static void m22355m(c cVar, a aVar, int i7, int i8, int i9, Paint paint, Canvas canvas) {
        int[] iArr = i7 == 3 ? aVar.f19307d : i7 == 2 ? aVar.f19306c : aVar.f19305b;
        m22354l(cVar.f19316c, iArr, i7, i8, i9, paint, canvas);
        m22354l(cVar.f19317d, iArr, i7, i8, i9 + 1, paint, canvas);
    }

    /* renamed from: o */
    public static a m22356o(C5356y c5356y, int i7) {
        int m21908h;
        int i8;
        int m21908h2;
        int i9;
        int i10;
        int i11 = 8;
        int m21908h3 = c5356y.m21908h(8);
        c5356y.m21918r(8);
        int i12 = 2;
        int i13 = i7 - 2;
        int[] m22347e = m22347e();
        int[] m22348f = m22348f();
        int[] m22349g = m22349g();
        while (i13 > 0) {
            int m21908h4 = c5356y.m21908h(i11);
            int m21908h5 = c5356y.m21908h(i11);
            int[] iArr = (m21908h5 & 128) != 0 ? m22347e : (m21908h5 & 64) != 0 ? m22348f : m22349g;
            if ((m21908h5 & 1) != 0) {
                i9 = c5356y.m21908h(i11);
                i10 = c5356y.m21908h(i11);
                m21908h = c5356y.m21908h(i11);
                m21908h2 = c5356y.m21908h(i11);
                i8 = i13 - 6;
            } else {
                int m21908h6 = c5356y.m21908h(6) << i12;
                int m21908h7 = c5356y.m21908h(4) << 4;
                m21908h = c5356y.m21908h(4) << 4;
                i8 = i13 - 4;
                m21908h2 = c5356y.m21908h(i12) << 6;
                i9 = m21908h6;
                i10 = m21908h7;
            }
            if (i9 == 0) {
                m21908h2 = 255;
                i10 = 0;
                m21908h = 0;
            }
            double d7 = i9;
            double d8 = i10 - 128;
            double d9 = m21908h - 128;
            iArr[m21908h4] = m22350h((byte) (255 - (m21908h2 & 255)), AbstractC5330M.m21766p((int) (d7 + (1.402d * d8)), 0, 255), AbstractC5330M.m21766p((int) ((d7 - (0.34414d * d9)) - (d8 * 0.71414d)), 0, 255), AbstractC5330M.m21766p((int) (d7 + (d9 * 1.772d)), 0, 255));
            i13 = i8;
            m21908h3 = m21908h3;
            i11 = 8;
            i12 = 2;
        }
        return new a(m21908h3, m22347e, m22348f, m22349g);
    }

    /* renamed from: p */
    public static b m22357p(C5356y c5356y) {
        int i7;
        int i8;
        int i9;
        int i10;
        c5356y.m21918r(4);
        boolean m21907g = c5356y.m21907g();
        c5356y.m21918r(3);
        int m21908h = c5356y.m21908h(16);
        int m21908h2 = c5356y.m21908h(16);
        if (m21907g) {
            int m21908h3 = c5356y.m21908h(16);
            int m21908h4 = c5356y.m21908h(16);
            int m21908h5 = c5356y.m21908h(16);
            i10 = c5356y.m21908h(16);
            i9 = m21908h4;
            i8 = m21908h5;
            i7 = m21908h3;
        } else {
            i7 = 0;
            i8 = 0;
            i9 = m21908h;
            i10 = m21908h2;
        }
        return new b(m21908h, m21908h2, i7, i9, i8, i10);
    }

    /* renamed from: q */
    public static c m22358q(C5356y c5356y) {
        byte[] bArr;
        int m21908h = c5356y.m21908h(16);
        c5356y.m21918r(4);
        int m21908h2 = c5356y.m21908h(2);
        boolean m21907g = c5356y.m21907g();
        c5356y.m21918r(1);
        byte[] bArr2 = AbstractC5330M.f18805f;
        if (m21908h2 == 1) {
            c5356y.m21918r(c5356y.m21908h(8) * 16);
        } else if (m21908h2 == 0) {
            int m21908h3 = c5356y.m21908h(16);
            int m21908h4 = c5356y.m21908h(16);
            if (m21908h3 > 0) {
                bArr2 = new byte[m21908h3];
                c5356y.m21911k(bArr2, 0, m21908h3);
            }
            if (m21908h4 > 0) {
                bArr = new byte[m21908h4];
                c5356y.m21911k(bArr, 0, m21908h4);
                return new c(m21908h, m21907g, bArr2, bArr);
            }
        }
        bArr = bArr2;
        return new c(m21908h, m21907g, bArr2, bArr);
    }

    /* renamed from: r */
    public static d m22359r(C5356y c5356y, int i7) {
        int m21908h = c5356y.m21908h(8);
        int m21908h2 = c5356y.m21908h(4);
        int m21908h3 = c5356y.m21908h(2);
        c5356y.m21918r(2);
        int i8 = i7 - 2;
        SparseArray sparseArray = new SparseArray();
        while (i8 > 0) {
            int m21908h4 = c5356y.m21908h(8);
            c5356y.m21918r(8);
            i8 -= 6;
            sparseArray.put(m21908h4, new e(c5356y.m21908h(16), c5356y.m21908h(16)));
        }
        return new d(m21908h, m21908h2, m21908h3, sparseArray);
    }

    /* renamed from: s */
    public static f m22360s(C5356y c5356y, int i7) {
        int i8;
        int i9;
        int i10;
        int m21908h = c5356y.m21908h(8);
        c5356y.m21918r(4);
        boolean m21907g = c5356y.m21907g();
        c5356y.m21918r(3);
        int i11 = 16;
        int m21908h2 = c5356y.m21908h(16);
        int m21908h3 = c5356y.m21908h(16);
        int m21908h4 = c5356y.m21908h(3);
        int m21908h5 = c5356y.m21908h(3);
        int i12 = 2;
        c5356y.m21918r(2);
        int m21908h6 = c5356y.m21908h(8);
        int m21908h7 = c5356y.m21908h(8);
        int m21908h8 = c5356y.m21908h(4);
        int m21908h9 = c5356y.m21908h(2);
        c5356y.m21918r(2);
        int i13 = i7 - 10;
        SparseArray sparseArray = new SparseArray();
        while (i13 > 0) {
            int m21908h10 = c5356y.m21908h(i11);
            int m21908h11 = c5356y.m21908h(i12);
            int m21908h12 = c5356y.m21908h(i12);
            int m21908h13 = c5356y.m21908h(12);
            int i14 = m21908h9;
            c5356y.m21918r(4);
            int m21908h14 = c5356y.m21908h(12);
            int i15 = i13 - 6;
            if (m21908h11 != 1) {
                i8 = 2;
                if (m21908h11 != 2) {
                    i10 = 0;
                    i9 = 0;
                    i13 = i15;
                    sparseArray.put(m21908h10, new g(m21908h11, m21908h12, m21908h13, m21908h14, i10, i9));
                    i12 = i8;
                    m21908h9 = i14;
                    i11 = 16;
                }
            } else {
                i8 = 2;
            }
            i13 -= 8;
            i10 = c5356y.m21908h(8);
            i9 = c5356y.m21908h(8);
            sparseArray.put(m21908h10, new g(m21908h11, m21908h12, m21908h13, m21908h14, i10, i9));
            i12 = i8;
            m21908h9 = i14;
            i11 = 16;
        }
        return new f(m21908h, m21907g, m21908h2, m21908h3, m21908h4, m21908h5, m21908h6, m21908h7, m21908h8, m21908h9, sparseArray);
    }

    /* renamed from: t */
    public static void m22361t(C5356y c5356y, h hVar) {
        f fVar;
        int m21908h = c5356y.m21908h(8);
        int m21908h2 = c5356y.m21908h(16);
        int m21908h3 = c5356y.m21908h(16);
        int m21904d = c5356y.m21904d() + m21908h3;
        if (m21908h3 * 8 > c5356y.m21902b()) {
            AbstractC5346o.m21867h("DvbParser", "Data field length exceeds limit");
            c5356y.m21918r(c5356y.m21902b());
            return;
        }
        switch (m21908h) {
            case 16:
                if (m21908h2 == hVar.f19341a) {
                    d dVar = hVar.f19349i;
                    d m22359r = m22359r(c5356y, m21908h3);
                    if (m22359r.f19320c == 0) {
                        if (dVar != null && dVar.f19319b != m22359r.f19319b) {
                            hVar.f19349i = m22359r;
                            break;
                        }
                    } else {
                        hVar.f19349i = m22359r;
                        hVar.f19343c.clear();
                        hVar.f19344d.clear();
                        hVar.f19345e.clear();
                        break;
                    }
                }
                break;
            case 17:
                d dVar2 = hVar.f19349i;
                if (m21908h2 == hVar.f19341a && dVar2 != null) {
                    f m22360s = m22360s(c5356y, m21908h3);
                    if (dVar2.f19320c == 0 && (fVar = (f) hVar.f19343c.get(m22360s.f19324a)) != null) {
                        m22360s.m22363a(fVar);
                    }
                    hVar.f19343c.put(m22360s.f19324a, m22360s);
                    break;
                }
                break;
            case C5413D.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                if (m21908h2 != hVar.f19341a) {
                    if (m21908h2 == hVar.f19342b) {
                        a m22356o = m22356o(c5356y, m21908h3);
                        hVar.f19346f.put(m22356o.f19304a, m22356o);
                        break;
                    }
                } else {
                    a m22356o2 = m22356o(c5356y, m21908h3);
                    hVar.f19344d.put(m22356o2.f19304a, m22356o2);
                    break;
                }
                break;
            case 19:
                if (m21908h2 != hVar.f19341a) {
                    if (m21908h2 == hVar.f19342b) {
                        c m22358q = m22358q(c5356y);
                        hVar.f19347g.put(m22358q.f19314a, m22358q);
                        break;
                    }
                } else {
                    c m22358q2 = m22358q(c5356y);
                    hVar.f19345e.put(m22358q2.f19314a, m22358q2);
                    break;
                }
                break;
            case XMLReaderUtils.DEFAULT_MAX_ENTITY_EXPANSIONS /* 20 */:
                if (m21908h2 == hVar.f19341a) {
                    hVar.f19348h = m22357p(c5356y);
                    break;
                }
                break;
        }
        c5356y.m21919s(m21904d - c5356y.m21904d());
    }

    @Override // p249i1.InterfaceC4529t
    /* renamed from: a */
    public /* synthetic */ InterfaceC4520k mo19257a(byte[] bArr, int i7, int i8) {
        return AbstractC4528s.m19255a(this, bArr, i7, i8);
    }

    @Override // p249i1.InterfaceC4529t
    /* renamed from: b */
    public void mo19258b(byte[] bArr, int i7, int i8, InterfaceC4529t.b bVar, InterfaceC5338g interfaceC5338g) {
        C5356y c5356y = new C5356y(bArr, i8 + i7);
        c5356y.m21916p(i7);
        interfaceC5338g.accept(m22362n(c5356y));
    }

    @Override // p249i1.InterfaceC4529t
    /* renamed from: c */
    public int mo19259c() {
        return 2;
    }

    /* renamed from: n */
    public final C4514e m22362n(C5356y c5356y) {
        int i7;
        SparseArray sparseArray;
        while (c5356y.m21902b() >= 48 && c5356y.m21908h(8) == 15) {
            m22361t(c5356y, this.f19302f);
        }
        h hVar = this.f19302f;
        d dVar = hVar.f19349i;
        if (dVar == null) {
            return new C4514e(AbstractC3033v.m11050t(), -9223372036854775807L, -9223372036854775807L);
        }
        b bVar = hVar.f19348h;
        if (bVar == null) {
            bVar = this.f19300d;
        }
        Bitmap bitmap = this.f19303g;
        if (bitmap == null || bVar.f19308a + 1 != bitmap.getWidth() || bVar.f19309b + 1 != this.f19303g.getHeight()) {
            Bitmap createBitmap = Bitmap.createBitmap(bVar.f19308a + 1, bVar.f19309b + 1, Bitmap.Config.ARGB_8888);
            this.f19303g = createBitmap;
            this.f19299c.setBitmap(createBitmap);
        }
        ArrayList arrayList = new ArrayList();
        SparseArray sparseArray2 = dVar.f19321d;
        for (int i8 = 0; i8 < sparseArray2.size(); i8++) {
            this.f19299c.save();
            e eVar = (e) sparseArray2.valueAt(i8);
            f fVar = (f) this.f19302f.f19343c.get(sparseArray2.keyAt(i8));
            int i9 = eVar.f19322a + bVar.f19310c;
            int i10 = eVar.f19323b + bVar.f19312e;
            this.f19299c.clipRect(i9, i10, Math.min(fVar.f19326c + i9, bVar.f19311d), Math.min(fVar.f19327d + i10, bVar.f19313f));
            a aVar = (a) this.f19302f.f19344d.get(fVar.f19330g);
            if (aVar == null && (aVar = (a) this.f19302f.f19346f.get(fVar.f19330g)) == null) {
                aVar = this.f19301e;
            }
            SparseArray sparseArray3 = fVar.f19334k;
            int i11 = 0;
            while (i11 < sparseArray3.size()) {
                int keyAt = sparseArray3.keyAt(i11);
                g gVar = (g) sparseArray3.valueAt(i11);
                c cVar = (c) this.f19302f.f19345e.get(keyAt);
                c cVar2 = cVar == null ? (c) this.f19302f.f19347g.get(keyAt) : cVar;
                if (cVar2 != null) {
                    i7 = i11;
                    sparseArray = sparseArray3;
                    m22355m(cVar2, aVar, fVar.f19329f, gVar.f19337c + i9, i10 + gVar.f19338d, cVar2.f19315b ? null : this.f19297a, this.f19299c);
                } else {
                    i7 = i11;
                    sparseArray = sparseArray3;
                }
                i11 = i7 + 1;
                sparseArray3 = sparseArray;
            }
            if (fVar.f19325b) {
                int i12 = fVar.f19329f;
                this.f19298b.setColor(i12 == 3 ? aVar.f19307d[fVar.f19331h] : i12 == 2 ? aVar.f19306c[fVar.f19332i] : aVar.f19305b[fVar.f19333j]);
                this.f19299c.drawRect(i9, i10, fVar.f19326c + i9, fVar.f19327d + i10, this.f19298b);
            }
            arrayList.add(new C4503a.b().m19192f(Bitmap.createBitmap(this.f19303g, i9, i10, fVar.f19326c, fVar.f19327d)).m19197k(i9 / bVar.f19308a).m19198l(0).m19194h(i10 / bVar.f19309b, 0).m19195i(0).m19200n(fVar.f19326c / bVar.f19308a).m19193g(fVar.f19327d / bVar.f19309b).m19187a());
            this.f19299c.drawColor(0, PorterDuff.Mode.CLEAR);
            this.f19299c.restore();
        }
        return new C4514e(arrayList, -9223372036854775807L, -9223372036854775807L);
    }

    @Override // p249i1.InterfaceC4529t
    public void reset() {
        this.f19302f.m22364a();
    }
}
