package p320q1;

import android.text.TextUtils;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import org.apache.tika.utils.StringUtils;
import p171Y2.AbstractC2920c;

/* renamed from: q1.c */
/* loaded from: classes.dex */
public final class C6174c {

    /* renamed from: f */
    public int f22085f;

    /* renamed from: h */
    public int f22087h;

    /* renamed from: o */
    public float f22094o;

    /* renamed from: a */
    public String f22080a = StringUtils.EMPTY;

    /* renamed from: b */
    public String f22081b = StringUtils.EMPTY;

    /* renamed from: c */
    public Set f22082c = Collections.emptySet();

    /* renamed from: d */
    public String f22083d = StringUtils.EMPTY;

    /* renamed from: e */
    public String f22084e = null;

    /* renamed from: g */
    public boolean f22086g = false;

    /* renamed from: i */
    public boolean f22088i = false;

    /* renamed from: j */
    public int f22089j = -1;

    /* renamed from: k */
    public int f22090k = -1;

    /* renamed from: l */
    public int f22091l = -1;

    /* renamed from: m */
    public int f22092m = -1;

    /* renamed from: n */
    public int f22093n = -1;

    /* renamed from: p */
    public int f22095p = -1;

    /* renamed from: q */
    public boolean f22096q = false;

    /* renamed from: B */
    public static int m25764B(int i7, String str, String str2, int i8) {
        if (str.isEmpty() || i7 == -1) {
            return i7;
        }
        if (str.equals(str2)) {
            return i7 + i8;
        }
        return -1;
    }

    /* renamed from: A */
    public C6174c m25765A(boolean z6) {
        this.f22090k = z6 ? 1 : 0;
        return this;
    }

    /* renamed from: a */
    public int m25766a() {
        if (this.f22088i) {
            return this.f22087h;
        }
        throw new IllegalStateException("Background color not defined.");
    }

    /* renamed from: b */
    public boolean m25767b() {
        return this.f22096q;
    }

    /* renamed from: c */
    public int m25768c() {
        if (this.f22086g) {
            return this.f22085f;
        }
        throw new IllegalStateException("Font color not defined");
    }

    /* renamed from: d */
    public String m25769d() {
        return this.f22084e;
    }

    /* renamed from: e */
    public float m25770e() {
        return this.f22094o;
    }

    /* renamed from: f */
    public int m25771f() {
        return this.f22093n;
    }

    /* renamed from: g */
    public int m25772g() {
        return this.f22095p;
    }

    /* renamed from: h */
    public int m25773h(String str, String str2, Set set, String str3) {
        if (this.f22080a.isEmpty() && this.f22081b.isEmpty() && this.f22082c.isEmpty() && this.f22083d.isEmpty()) {
            return TextUtils.isEmpty(str2) ? 1 : 0;
        }
        int m25764B = m25764B(m25764B(m25764B(0, this.f22080a, str, 1073741824), this.f22081b, str2, 2), this.f22083d, str3, 4);
        if (m25764B == -1 || !set.containsAll(this.f22082c)) {
            return 0;
        }
        return m25764B + (this.f22082c.size() * 4);
    }

    /* renamed from: i */
    public int m25774i() {
        int i7 = this.f22091l;
        if (i7 == -1 && this.f22092m == -1) {
            return -1;
        }
        return (i7 == 1 ? 1 : 0) | (this.f22092m == 1 ? 2 : 0);
    }

    /* renamed from: j */
    public boolean m25775j() {
        return this.f22088i;
    }

    /* renamed from: k */
    public boolean m25776k() {
        return this.f22086g;
    }

    /* renamed from: l */
    public boolean m25777l() {
        return this.f22089j == 1;
    }

    /* renamed from: m */
    public boolean m25778m() {
        return this.f22090k == 1;
    }

    /* renamed from: n */
    public C6174c m25779n(int i7) {
        this.f22087h = i7;
        this.f22088i = true;
        return this;
    }

    /* renamed from: o */
    public C6174c m25780o(boolean z6) {
        this.f22091l = z6 ? 1 : 0;
        return this;
    }

    /* renamed from: p */
    public C6174c m25781p(boolean z6) {
        this.f22096q = z6;
        return this;
    }

    /* renamed from: q */
    public C6174c m25782q(int i7) {
        this.f22085f = i7;
        this.f22086g = true;
        return this;
    }

    /* renamed from: r */
    public C6174c m25783r(String str) {
        this.f22084e = str == null ? null : AbstractC2920c.m10515e(str);
        return this;
    }

    /* renamed from: s */
    public C6174c m25784s(float f7) {
        this.f22094o = f7;
        return this;
    }

    /* renamed from: t */
    public C6174c m25785t(int i7) {
        this.f22093n = i7;
        return this;
    }

    /* renamed from: u */
    public C6174c m25786u(boolean z6) {
        this.f22092m = z6 ? 1 : 0;
        return this;
    }

    /* renamed from: v */
    public C6174c m25787v(int i7) {
        this.f22095p = i7;
        return this;
    }

    /* renamed from: w */
    public void m25788w(String[] strArr) {
        this.f22082c = new HashSet(Arrays.asList(strArr));
    }

    /* renamed from: x */
    public void m25789x(String str) {
        this.f22080a = str;
    }

    /* renamed from: y */
    public void m25790y(String str) {
        this.f22081b = str;
    }

    /* renamed from: z */
    public void m25791z(String str) {
        this.f22083d = str;
    }
}
