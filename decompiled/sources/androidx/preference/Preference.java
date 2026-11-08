package androidx.preference;

import android.R;
import android.content.Context;
import android.content.Intent;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.gms.common.api.C3643a;
import java.util.List;
import p352u1.AbstractC6595a;
import p352u1.AbstractC6596b;
import p352u1.AbstractC6597c;
import p352u1.AbstractC6599e;
import p352u1.AbstractC6601g;
import p379y.AbstractC7046k;

/* loaded from: classes.dex */
public class Preference implements Comparable<Preference> {

    /* renamed from: A */
    public boolean f11186A;

    /* renamed from: B */
    public boolean f11187B;

    /* renamed from: C */
    public boolean f11188C;

    /* renamed from: D */
    public boolean f11189D;

    /* renamed from: E */
    public boolean f11190E;

    /* renamed from: F */
    public int f11191F;

    /* renamed from: G */
    public int f11192G;

    /* renamed from: H */
    public List f11193H;

    /* renamed from: I */
    public InterfaceC3401b f11194I;

    /* renamed from: J */
    public final View.OnClickListener f11195J;

    /* renamed from: a */
    public final Context f11196a;

    /* renamed from: b */
    public int f11197b;

    /* renamed from: c */
    public int f11198c;

    /* renamed from: d */
    public CharSequence f11199d;

    /* renamed from: e */
    public CharSequence f11200e;

    /* renamed from: f */
    public int f11201f;

    /* renamed from: n */
    public String f11202n;

    /* renamed from: o */
    public Intent f11203o;

    /* renamed from: p */
    public String f11204p;

    /* renamed from: q */
    public boolean f11205q;

    /* renamed from: r */
    public boolean f11206r;

    /* renamed from: s */
    public boolean f11207s;

    /* renamed from: t */
    public String f11208t;

    /* renamed from: u */
    public Object f11209u;

    /* renamed from: v */
    public boolean f11210v;

    /* renamed from: w */
    public boolean f11211w;

    /* renamed from: x */
    public boolean f11212x;

    /* renamed from: y */
    public boolean f11213y;

    /* renamed from: z */
    public boolean f11214z;

    /* renamed from: androidx.preference.Preference$a */
    public class ViewOnClickListenerC3400a implements View.OnClickListener {
        public ViewOnClickListenerC3400a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Preference.this.mo13397C(view);
        }
    }

    /* renamed from: androidx.preference.Preference$b */
    public interface InterfaceC3401b {
        /* renamed from: a */
        CharSequence mo13408a(Preference preference);
    }

    public Preference(Context context, AttributeSet attributeSet, int i7, int i8) {
        this.f11197b = C3643a.e.API_PRIORITY_OTHER;
        this.f11198c = 0;
        this.f11205q = true;
        this.f11206r = true;
        this.f11207s = true;
        this.f11210v = true;
        this.f11211w = true;
        this.f11212x = true;
        this.f11213y = true;
        this.f11214z = true;
        this.f11187B = true;
        this.f11190E = true;
        this.f11191F = AbstractC6599e.f23790a;
        this.f11195J = new ViewOnClickListenerC3400a();
        this.f11196a = context;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC6601g.f23808I, i7, i8);
        this.f11201f = AbstractC7046k.m29020n(obtainStyledAttributes, AbstractC6601g.f23862g0, AbstractC6601g.f23810J, 0);
        this.f11202n = AbstractC7046k.m29021o(obtainStyledAttributes, AbstractC6601g.f23868j0, AbstractC6601g.f23822P);
        this.f11199d = AbstractC7046k.m29022p(obtainStyledAttributes, AbstractC6601g.f23884r0, AbstractC6601g.f23818N);
        this.f11200e = AbstractC7046k.m29022p(obtainStyledAttributes, AbstractC6601g.f23882q0, AbstractC6601g.f23824Q);
        this.f11197b = AbstractC7046k.m29010d(obtainStyledAttributes, AbstractC6601g.f23872l0, AbstractC6601g.f23826R, C3643a.e.API_PRIORITY_OTHER);
        this.f11204p = AbstractC7046k.m29021o(obtainStyledAttributes, AbstractC6601g.f23860f0, AbstractC6601g.f23836W);
        this.f11191F = AbstractC7046k.m29020n(obtainStyledAttributes, AbstractC6601g.f23870k0, AbstractC6601g.f23816M, AbstractC6599e.f23790a);
        this.f11192G = AbstractC7046k.m29020n(obtainStyledAttributes, AbstractC6601g.f23886s0, AbstractC6601g.f23828S, 0);
        this.f11205q = AbstractC7046k.m29008b(obtainStyledAttributes, AbstractC6601g.f23857e0, AbstractC6601g.f23814L, true);
        this.f11206r = AbstractC7046k.m29008b(obtainStyledAttributes, AbstractC6601g.f23876n0, AbstractC6601g.f23820O, true);
        this.f11207s = AbstractC7046k.m29008b(obtainStyledAttributes, AbstractC6601g.f23874m0, AbstractC6601g.f23812K, true);
        this.f11208t = AbstractC7046k.m29021o(obtainStyledAttributes, AbstractC6601g.f23851c0, AbstractC6601g.f23830T);
        int i9 = AbstractC6601g.f23842Z;
        this.f11213y = AbstractC7046k.m29008b(obtainStyledAttributes, i9, i9, this.f11206r);
        int i10 = AbstractC6601g.f23845a0;
        this.f11214z = AbstractC7046k.m29008b(obtainStyledAttributes, i10, i10, this.f11206r);
        if (obtainStyledAttributes.hasValue(AbstractC6601g.f23848b0)) {
            this.f11209u = mo13406z(obtainStyledAttributes, AbstractC6601g.f23848b0);
        } else if (obtainStyledAttributes.hasValue(AbstractC6601g.f23832U)) {
            this.f11209u = mo13406z(obtainStyledAttributes, AbstractC6601g.f23832U);
        }
        this.f11190E = AbstractC7046k.m29008b(obtainStyledAttributes, AbstractC6601g.f23878o0, AbstractC6601g.f23834V, true);
        boolean hasValue = obtainStyledAttributes.hasValue(AbstractC6601g.f23880p0);
        this.f11186A = hasValue;
        if (hasValue) {
            this.f11187B = AbstractC7046k.m29008b(obtainStyledAttributes, AbstractC6601g.f23880p0, AbstractC6601g.f23838X, true);
        }
        this.f11188C = AbstractC7046k.m29008b(obtainStyledAttributes, AbstractC6601g.f23864h0, AbstractC6601g.f23840Y, false);
        int i11 = AbstractC6601g.f23866i0;
        this.f11212x = AbstractC7046k.m29008b(obtainStyledAttributes, i11, i11, true);
        int i12 = AbstractC6601g.f23854d0;
        this.f11189D = AbstractC7046k.m29008b(obtainStyledAttributes, i12, i12, false);
        obtainStyledAttributes.recycle();
    }

    /* renamed from: A */
    public void m13420A(Preference preference, boolean z6) {
        if (this.f11211w == z6) {
            this.f11211w = !z6;
            mo13443w(mo13404H());
            mo13403v();
        }
    }

    /* renamed from: B */
    public void m13421B() {
        if (mo13441t() && m13442u()) {
            mo13400x();
            m13437o();
            if (this.f11203o != null) {
                m13429g().startActivity(this.f11203o);
            }
        }
    }

    /* renamed from: C */
    public void mo13397C(View view) {
        m13421B();
    }

    /* renamed from: D */
    public boolean m13422D(boolean z6) {
        if (!m13426I()) {
            return false;
        }
        if (z6 == m13433k(!z6)) {
            return true;
        }
        m13436n();
        Object obj = null;
        obj.getClass();
        throw null;
    }

    /* renamed from: E */
    public boolean m13423E(int i7) {
        if (!m13426I()) {
            return false;
        }
        if (i7 == m13434l(~i7)) {
            return true;
        }
        m13436n();
        Object obj = null;
        obj.getClass();
        throw null;
    }

    /* renamed from: F */
    public boolean m13424F(String str) {
        if (!m13426I()) {
            return false;
        }
        Object obj = null;
        if (TextUtils.equals(str, m13435m(null))) {
            return true;
        }
        m13436n();
        obj.getClass();
        throw null;
    }

    /* renamed from: G */
    public final void m13425G(InterfaceC3401b interfaceC3401b) {
        this.f11194I = interfaceC3401b;
        mo13403v();
    }

    /* renamed from: H */
    public boolean mo13404H() {
        return !mo13441t();
    }

    /* renamed from: I */
    public boolean m13426I() {
        return false;
    }

    /* renamed from: b */
    public boolean m13427b(Object obj) {
        return true;
    }

    @Override // java.lang.Comparable
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public int compareTo(Preference preference) {
        int i7 = this.f11197b;
        int i8 = preference.f11197b;
        if (i7 != i8) {
            return i7 - i8;
        }
        CharSequence charSequence = this.f11199d;
        CharSequence charSequence2 = preference.f11199d;
        if (charSequence == charSequence2) {
            return 0;
        }
        if (charSequence == null) {
            return 1;
        }
        if (charSequence2 == null) {
            return -1;
        }
        return charSequence.toString().compareToIgnoreCase(preference.f11199d.toString());
    }

    /* renamed from: g */
    public Context m13429g() {
        return this.f11196a;
    }

    /* renamed from: h */
    public StringBuilder m13430h() {
        StringBuilder sb = new StringBuilder();
        CharSequence m13439r = m13439r();
        if (!TextUtils.isEmpty(m13439r)) {
            sb.append(m13439r);
            sb.append(' ');
        }
        CharSequence mo13417p = mo13417p();
        if (!TextUtils.isEmpty(mo13417p)) {
            sb.append(mo13417p);
            sb.append(' ');
        }
        if (sb.length() > 0) {
            sb.setLength(sb.length() - 1);
        }
        return sb;
    }

    /* renamed from: i */
    public String m13431i() {
        return this.f11204p;
    }

    /* renamed from: j */
    public Intent m13432j() {
        return this.f11203o;
    }

    /* renamed from: k */
    public boolean m13433k(boolean z6) {
        if (!m13426I()) {
            return z6;
        }
        m13436n();
        Object obj = null;
        obj.getClass();
        throw null;
    }

    /* renamed from: l */
    public int m13434l(int i7) {
        if (!m13426I()) {
            return i7;
        }
        m13436n();
        Object obj = null;
        obj.getClass();
        throw null;
    }

    /* renamed from: m */
    public String m13435m(String str) {
        if (!m13426I()) {
            return str;
        }
        m13436n();
        Object obj = null;
        obj.getClass();
        throw null;
    }

    /* renamed from: n */
    public AbstractC6595a m13436n() {
        return null;
    }

    /* renamed from: o */
    public AbstractC6596b m13437o() {
        return null;
    }

    /* renamed from: p */
    public CharSequence mo13417p() {
        return m13438q() != null ? m13438q().mo13408a(this) : this.f11200e;
    }

    /* renamed from: q */
    public final InterfaceC3401b m13438q() {
        return this.f11194I;
    }

    /* renamed from: r */
    public CharSequence m13439r() {
        return this.f11199d;
    }

    /* renamed from: s */
    public boolean m13440s() {
        return !TextUtils.isEmpty(this.f11202n);
    }

    /* renamed from: t */
    public boolean mo13441t() {
        return this.f11205q && this.f11210v && this.f11211w;
    }

    public String toString() {
        return m13430h().toString();
    }

    /* renamed from: u */
    public boolean m13442u() {
        return this.f11206r;
    }

    /* renamed from: v */
    public void mo13403v() {
    }

    /* renamed from: w */
    public void mo13443w(boolean z6) {
        List list = this.f11193H;
        if (list == null) {
            return;
        }
        int size = list.size();
        for (int i7 = 0; i7 < size; i7++) {
            ((Preference) list.get(i7)).m13444y(this, z6);
        }
    }

    /* renamed from: x */
    public void mo13400x() {
    }

    /* renamed from: y */
    public void m13444y(Preference preference, boolean z6) {
        if (this.f11210v == z6) {
            this.f11210v = !z6;
            mo13443w(mo13404H());
            mo13403v();
        }
    }

    /* renamed from: z */
    public Object mo13406z(TypedArray typedArray, int i7) {
        return null;
    }

    public Preference(Context context, AttributeSet attributeSet, int i7) {
        this(context, attributeSet, i7, 0);
    }

    public Preference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC7046k.m29007a(context, AbstractC6597c.f23785g, R.attr.preferenceStyle));
    }
}
