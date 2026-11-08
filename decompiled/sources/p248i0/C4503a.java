package p248i0;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Layout;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.TextUtils;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import org.apache.tika.utils.StringUtils;
import p171Y2.AbstractC2928k;
import p259j0.AbstractC5330M;
import p259j0.AbstractC5332a;

/* renamed from: i0.a */
/* loaded from: classes.dex */
public final class C4503a {

    /* renamed from: a */
    public final CharSequence f16091a;

    /* renamed from: b */
    public final Layout.Alignment f16092b;

    /* renamed from: c */
    public final Layout.Alignment f16093c;

    /* renamed from: d */
    public final Bitmap f16094d;

    /* renamed from: e */
    public final float f16095e;

    /* renamed from: f */
    public final int f16096f;

    /* renamed from: g */
    public final int f16097g;

    /* renamed from: h */
    public final float f16098h;

    /* renamed from: i */
    public final int f16099i;

    /* renamed from: j */
    public final float f16100j;

    /* renamed from: k */
    public final float f16101k;

    /* renamed from: l */
    public final boolean f16102l;

    /* renamed from: m */
    public final int f16103m;

    /* renamed from: n */
    public final int f16104n;

    /* renamed from: o */
    public final float f16105o;

    /* renamed from: p */
    public final int f16106p;

    /* renamed from: q */
    public final float f16107q;

    /* renamed from: r */
    public static final C4503a f16082r = new b().m19201o(StringUtils.EMPTY).m19187a();

    /* renamed from: s */
    public static final String f16083s = AbstractC5330M.m21783x0(0);

    /* renamed from: t */
    public static final String f16084t = AbstractC5330M.m21783x0(17);

    /* renamed from: u */
    public static final String f16085u = AbstractC5330M.m21783x0(1);

    /* renamed from: v */
    public static final String f16086v = AbstractC5330M.m21783x0(2);

    /* renamed from: w */
    public static final String f16087w = AbstractC5330M.m21783x0(3);

    /* renamed from: x */
    public static final String f16088x = AbstractC5330M.m21783x0(18);

    /* renamed from: y */
    public static final String f16089y = AbstractC5330M.m21783x0(4);

    /* renamed from: z */
    public static final String f16090z = AbstractC5330M.m21783x0(5);

    /* renamed from: A */
    public static final String f16071A = AbstractC5330M.m21783x0(6);

    /* renamed from: B */
    public static final String f16072B = AbstractC5330M.m21783x0(7);

    /* renamed from: C */
    public static final String f16073C = AbstractC5330M.m21783x0(8);

    /* renamed from: D */
    public static final String f16074D = AbstractC5330M.m21783x0(9);

    /* renamed from: E */
    public static final String f16075E = AbstractC5330M.m21783x0(10);

    /* renamed from: F */
    public static final String f16076F = AbstractC5330M.m21783x0(11);

    /* renamed from: G */
    public static final String f16077G = AbstractC5330M.m21783x0(12);

    /* renamed from: H */
    public static final String f16078H = AbstractC5330M.m21783x0(13);

    /* renamed from: I */
    public static final String f16079I = AbstractC5330M.m21783x0(14);

    /* renamed from: J */
    public static final String f16080J = AbstractC5330M.m21783x0(15);

    /* renamed from: K */
    public static final String f16081K = AbstractC5330M.m21783x0(16);

    /* renamed from: i0.a$b */
    public static final class b {

        /* renamed from: a */
        public CharSequence f16108a;

        /* renamed from: b */
        public Bitmap f16109b;

        /* renamed from: c */
        public Layout.Alignment f16110c;

        /* renamed from: d */
        public Layout.Alignment f16111d;

        /* renamed from: e */
        public float f16112e;

        /* renamed from: f */
        public int f16113f;

        /* renamed from: g */
        public int f16114g;

        /* renamed from: h */
        public float f16115h;

        /* renamed from: i */
        public int f16116i;

        /* renamed from: j */
        public int f16117j;

        /* renamed from: k */
        public float f16118k;

        /* renamed from: l */
        public float f16119l;

        /* renamed from: m */
        public float f16120m;

        /* renamed from: n */
        public boolean f16121n;

        /* renamed from: o */
        public int f16122o;

        /* renamed from: p */
        public int f16123p;

        /* renamed from: q */
        public float f16124q;

        /* renamed from: a */
        public C4503a m19187a() {
            return new C4503a(this.f16108a, this.f16110c, this.f16111d, this.f16109b, this.f16112e, this.f16113f, this.f16114g, this.f16115h, this.f16116i, this.f16117j, this.f16118k, this.f16119l, this.f16120m, this.f16121n, this.f16122o, this.f16123p, this.f16124q);
        }

        /* renamed from: b */
        public b m19188b() {
            this.f16121n = false;
            return this;
        }

        /* renamed from: c */
        public int m19189c() {
            return this.f16114g;
        }

        /* renamed from: d */
        public int m19190d() {
            return this.f16116i;
        }

        /* renamed from: e */
        public CharSequence m19191e() {
            return this.f16108a;
        }

        /* renamed from: f */
        public b m19192f(Bitmap bitmap) {
            this.f16109b = bitmap;
            return this;
        }

        /* renamed from: g */
        public b m19193g(float f7) {
            this.f16120m = f7;
            return this;
        }

        /* renamed from: h */
        public b m19194h(float f7, int i7) {
            this.f16112e = f7;
            this.f16113f = i7;
            return this;
        }

        /* renamed from: i */
        public b m19195i(int i7) {
            this.f16114g = i7;
            return this;
        }

        /* renamed from: j */
        public b m19196j(Layout.Alignment alignment) {
            this.f16111d = alignment;
            return this;
        }

        /* renamed from: k */
        public b m19197k(float f7) {
            this.f16115h = f7;
            return this;
        }

        /* renamed from: l */
        public b m19198l(int i7) {
            this.f16116i = i7;
            return this;
        }

        /* renamed from: m */
        public b m19199m(float f7) {
            this.f16124q = f7;
            return this;
        }

        /* renamed from: n */
        public b m19200n(float f7) {
            this.f16119l = f7;
            return this;
        }

        /* renamed from: o */
        public b m19201o(CharSequence charSequence) {
            this.f16108a = charSequence;
            return this;
        }

        /* renamed from: p */
        public b m19202p(Layout.Alignment alignment) {
            this.f16110c = alignment;
            return this;
        }

        /* renamed from: q */
        public b m19203q(float f7, int i7) {
            this.f16118k = f7;
            this.f16117j = i7;
            return this;
        }

        /* renamed from: r */
        public b m19204r(int i7) {
            this.f16123p = i7;
            return this;
        }

        /* renamed from: s */
        public b m19205s(int i7) {
            this.f16122o = i7;
            this.f16121n = true;
            return this;
        }

        public b() {
            this.f16108a = null;
            this.f16109b = null;
            this.f16110c = null;
            this.f16111d = null;
            this.f16112e = -3.4028235E38f;
            this.f16113f = Integer.MIN_VALUE;
            this.f16114g = Integer.MIN_VALUE;
            this.f16115h = -3.4028235E38f;
            this.f16116i = Integer.MIN_VALUE;
            this.f16117j = Integer.MIN_VALUE;
            this.f16118k = -3.4028235E38f;
            this.f16119l = -3.4028235E38f;
            this.f16120m = -3.4028235E38f;
            this.f16121n = false;
            this.f16122o = -16777216;
            this.f16123p = Integer.MIN_VALUE;
        }

        public b(C4503a c4503a) {
            this.f16108a = c4503a.f16091a;
            this.f16109b = c4503a.f16094d;
            this.f16110c = c4503a.f16092b;
            this.f16111d = c4503a.f16093c;
            this.f16112e = c4503a.f16095e;
            this.f16113f = c4503a.f16096f;
            this.f16114g = c4503a.f16097g;
            this.f16115h = c4503a.f16098h;
            this.f16116i = c4503a.f16099i;
            this.f16117j = c4503a.f16104n;
            this.f16118k = c4503a.f16105o;
            this.f16119l = c4503a.f16100j;
            this.f16120m = c4503a.f16101k;
            this.f16121n = c4503a.f16102l;
            this.f16122o = c4503a.f16103m;
            this.f16123p = c4503a.f16106p;
            this.f16124q = c4503a.f16107q;
        }
    }

    /* renamed from: b */
    public static C4503a m19183b(Bundle bundle) {
        b bVar = new b();
        CharSequence charSequence = bundle.getCharSequence(f16083s);
        if (charSequence != null) {
            bVar.m19201o(charSequence);
            ArrayList parcelableArrayList = bundle.getParcelableArrayList(f16084t);
            if (parcelableArrayList != null) {
                SpannableString valueOf = SpannableString.valueOf(charSequence);
                Iterator it = parcelableArrayList.iterator();
                while (it.hasNext()) {
                    AbstractC4505c.m19208c((Bundle) it.next(), valueOf);
                }
                bVar.m19201o(valueOf);
            }
        }
        Layout.Alignment alignment = (Layout.Alignment) bundle.getSerializable(f16085u);
        if (alignment != null) {
            bVar.m19202p(alignment);
        }
        Layout.Alignment alignment2 = (Layout.Alignment) bundle.getSerializable(f16086v);
        if (alignment2 != null) {
            bVar.m19196j(alignment2);
        }
        Bitmap bitmap = (Bitmap) bundle.getParcelable(f16087w);
        if (bitmap != null) {
            bVar.m19192f(bitmap);
        } else {
            byte[] byteArray = bundle.getByteArray(f16088x);
            if (byteArray != null) {
                bVar.m19192f(BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length));
            }
        }
        String str = f16089y;
        if (bundle.containsKey(str)) {
            String str2 = f16090z;
            if (bundle.containsKey(str2)) {
                bVar.m19194h(bundle.getFloat(str), bundle.getInt(str2));
            }
        }
        String str3 = f16071A;
        if (bundle.containsKey(str3)) {
            bVar.m19195i(bundle.getInt(str3));
        }
        String str4 = f16072B;
        if (bundle.containsKey(str4)) {
            bVar.m19197k(bundle.getFloat(str4));
        }
        String str5 = f16073C;
        if (bundle.containsKey(str5)) {
            bVar.m19198l(bundle.getInt(str5));
        }
        String str6 = f16075E;
        if (bundle.containsKey(str6)) {
            String str7 = f16074D;
            if (bundle.containsKey(str7)) {
                bVar.m19203q(bundle.getFloat(str6), bundle.getInt(str7));
            }
        }
        String str8 = f16076F;
        if (bundle.containsKey(str8)) {
            bVar.m19200n(bundle.getFloat(str8));
        }
        String str9 = f16077G;
        if (bundle.containsKey(str9)) {
            bVar.m19193g(bundle.getFloat(str9));
        }
        String str10 = f16078H;
        if (bundle.containsKey(str10)) {
            bVar.m19205s(bundle.getInt(str10));
        }
        if (!bundle.getBoolean(f16079I, false)) {
            bVar.m19188b();
        }
        String str11 = f16080J;
        if (bundle.containsKey(str11)) {
            bVar.m19204r(bundle.getInt(str11));
        }
        String str12 = f16081K;
        if (bundle.containsKey(str12)) {
            bVar.m19199m(bundle.getFloat(str12));
        }
        return bVar.m19187a();
    }

    /* renamed from: a */
    public b m19184a() {
        return new b();
    }

    /* renamed from: c */
    public final Bundle m19185c() {
        Bundle bundle = new Bundle();
        CharSequence charSequence = this.f16091a;
        if (charSequence != null) {
            bundle.putCharSequence(f16083s, charSequence);
            CharSequence charSequence2 = this.f16091a;
            if (charSequence2 instanceof Spanned) {
                ArrayList<? extends Parcelable> m19206a = AbstractC4505c.m19206a((Spanned) charSequence2);
                if (!m19206a.isEmpty()) {
                    bundle.putParcelableArrayList(f16084t, m19206a);
                }
            }
        }
        bundle.putSerializable(f16085u, this.f16092b);
        bundle.putSerializable(f16086v, this.f16093c);
        bundle.putFloat(f16089y, this.f16095e);
        bundle.putInt(f16090z, this.f16096f);
        bundle.putInt(f16071A, this.f16097g);
        bundle.putFloat(f16072B, this.f16098h);
        bundle.putInt(f16073C, this.f16099i);
        bundle.putInt(f16074D, this.f16104n);
        bundle.putFloat(f16075E, this.f16105o);
        bundle.putFloat(f16076F, this.f16100j);
        bundle.putFloat(f16077G, this.f16101k);
        bundle.putBoolean(f16079I, this.f16102l);
        bundle.putInt(f16078H, this.f16103m);
        bundle.putInt(f16080J, this.f16106p);
        bundle.putFloat(f16081K, this.f16107q);
        return bundle;
    }

    /* renamed from: d */
    public Bundle m19186d() {
        Bundle m19185c = m19185c();
        if (this.f16094d != null) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            AbstractC5332a.m21802g(this.f16094d.compress(Bitmap.CompressFormat.PNG, 0, byteArrayOutputStream));
            m19185c.putByteArray(f16088x, byteArrayOutputStream.toByteArray());
        }
        return m19185c;
    }

    public boolean equals(Object obj) {
        Bitmap bitmap;
        Bitmap bitmap2;
        if (this == obj) {
            return true;
        }
        if (obj == null || C4503a.class != obj.getClass()) {
            return false;
        }
        C4503a c4503a = (C4503a) obj;
        return TextUtils.equals(this.f16091a, c4503a.f16091a) && this.f16092b == c4503a.f16092b && this.f16093c == c4503a.f16093c && ((bitmap = this.f16094d) != null ? !((bitmap2 = c4503a.f16094d) == null || !bitmap.sameAs(bitmap2)) : c4503a.f16094d == null) && this.f16095e == c4503a.f16095e && this.f16096f == c4503a.f16096f && this.f16097g == c4503a.f16097g && this.f16098h == c4503a.f16098h && this.f16099i == c4503a.f16099i && this.f16100j == c4503a.f16100j && this.f16101k == c4503a.f16101k && this.f16102l == c4503a.f16102l && this.f16103m == c4503a.f16103m && this.f16104n == c4503a.f16104n && this.f16105o == c4503a.f16105o && this.f16106p == c4503a.f16106p && this.f16107q == c4503a.f16107q;
    }

    public int hashCode() {
        return AbstractC2928k.m10551b(this.f16091a, this.f16092b, this.f16093c, this.f16094d, Float.valueOf(this.f16095e), Integer.valueOf(this.f16096f), Integer.valueOf(this.f16097g), Float.valueOf(this.f16098h), Integer.valueOf(this.f16099i), Float.valueOf(this.f16100j), Float.valueOf(this.f16101k), Boolean.valueOf(this.f16102l), Integer.valueOf(this.f16103m), Integer.valueOf(this.f16104n), Float.valueOf(this.f16105o), Integer.valueOf(this.f16106p), Float.valueOf(this.f16107q));
    }

    public C4503a(CharSequence charSequence, Layout.Alignment alignment, Layout.Alignment alignment2, Bitmap bitmap, float f7, int i7, int i8, float f8, int i9, int i10, float f9, float f10, float f11, boolean z6, int i11, int i12, float f12) {
        if (charSequence == null) {
            AbstractC5332a.m21800e(bitmap);
        } else {
            AbstractC5332a.m21796a(bitmap == null);
        }
        if (charSequence instanceof Spanned) {
            this.f16091a = SpannedString.valueOf(charSequence);
        } else if (charSequence != null) {
            this.f16091a = charSequence.toString();
        } else {
            this.f16091a = null;
        }
        this.f16092b = alignment;
        this.f16093c = alignment2;
        this.f16094d = bitmap;
        this.f16095e = f7;
        this.f16096f = i7;
        this.f16097g = i8;
        this.f16098h = f8;
        this.f16099i = i9;
        this.f16100j = f10;
        this.f16101k = f11;
        this.f16102l = z6;
        this.f16103m = i11;
        this.f16104n = i10;
        this.f16105o = f9;
        this.f16106p = i12;
        this.f16107q = f12;
    }
}
