package androidx.preference;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import androidx.preference.Preference;
import org.apache.tika.utils.StringUtils;
import p352u1.AbstractC6597c;
import p352u1.AbstractC6600f;
import p352u1.AbstractC6601g;
import p379y.AbstractC7046k;

/* loaded from: classes.dex */
public class ListPreference extends DialogPreference {

    /* renamed from: Q */
    public CharSequence[] f11177Q;

    /* renamed from: R */
    public CharSequence[] f11178R;

    /* renamed from: S */
    public String f11179S;

    /* renamed from: T */
    public String f11180T;

    /* renamed from: U */
    public boolean f11181U;

    /* renamed from: androidx.preference.ListPreference$a */
    public static final class C3399a implements Preference.InterfaceC3401b {

        /* renamed from: a */
        public static C3399a f11182a;

        /* renamed from: b */
        public static C3399a m13418b() {
            if (f11182a == null) {
                f11182a = new C3399a();
            }
            return f11182a;
        }

        @Override // androidx.preference.Preference.InterfaceC3401b
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public CharSequence mo13408a(ListPreference listPreference) {
            return TextUtils.isEmpty(listPreference.m13412L()) ? listPreference.m13429g().getString(AbstractC6600f.f23791a) : listPreference.m13412L();
        }
    }

    public ListPreference(Context context, AttributeSet attributeSet, int i7, int i8) {
        super(context, attributeSet, i7, i8);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC6601g.f23895x, i7, i8);
        this.f11177Q = AbstractC7046k.m29023q(obtainStyledAttributes, AbstractC6601g.f23792A, AbstractC6601g.f23897y);
        this.f11178R = AbstractC7046k.m29023q(obtainStyledAttributes, AbstractC6601g.f23794B, AbstractC6601g.f23899z);
        int i9 = AbstractC6601g.f23796C;
        if (AbstractC7046k.m29008b(obtainStyledAttributes, i9, i9, false)) {
            m13425G(C3399a.m13418b());
        }
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, AbstractC6601g.f23808I, i7, i8);
        this.f11180T = AbstractC7046k.m29021o(obtainStyledAttributes2, AbstractC6601g.f23882q0, AbstractC6601g.f23824Q);
        obtainStyledAttributes2.recycle();
    }

    /* renamed from: J */
    public int m13410J(String str) {
        CharSequence[] charSequenceArr;
        if (str == null || (charSequenceArr = this.f11178R) == null) {
            return -1;
        }
        for (int length = charSequenceArr.length - 1; length >= 0; length--) {
            if (TextUtils.equals(this.f11178R[length].toString(), str)) {
                return length;
            }
        }
        return -1;
    }

    /* renamed from: K */
    public CharSequence[] m13411K() {
        return this.f11177Q;
    }

    /* renamed from: L */
    public CharSequence m13412L() {
        CharSequence[] charSequenceArr;
        int m13415O = m13415O();
        if (m13415O < 0 || (charSequenceArr = this.f11177Q) == null) {
            return null;
        }
        return charSequenceArr[m13415O];
    }

    /* renamed from: M */
    public CharSequence[] m13413M() {
        return this.f11178R;
    }

    /* renamed from: N */
    public String m13414N() {
        return this.f11179S;
    }

    /* renamed from: O */
    public final int m13415O() {
        return m13410J(this.f11179S);
    }

    /* renamed from: P */
    public void m13416P(String str) {
        boolean equals = TextUtils.equals(this.f11179S, str);
        if (equals && this.f11181U) {
            return;
        }
        this.f11179S = str;
        this.f11181U = true;
        m13424F(str);
        if (equals) {
            return;
        }
        mo13403v();
    }

    @Override // androidx.preference.Preference
    /* renamed from: p */
    public CharSequence mo13417p() {
        if (m13438q() != null) {
            return m13438q().mo13408a(this);
        }
        CharSequence m13412L = m13412L();
        CharSequence mo13417p = super.mo13417p();
        String str = this.f11180T;
        if (str == null) {
            return mo13417p;
        }
        if (m13412L == null) {
            m13412L = StringUtils.EMPTY;
        }
        String format = String.format(str, m13412L);
        if (TextUtils.equals(format, mo13417p)) {
            return mo13417p;
        }
        Log.w("ListPreference", "Setting a summary with a String formatting marker is no longer supported. You should use a SummaryProvider instead.");
        return format;
    }

    @Override // androidx.preference.Preference
    /* renamed from: z */
    public Object mo13406z(TypedArray typedArray, int i7) {
        return typedArray.getString(i7);
    }

    public ListPreference(Context context, AttributeSet attributeSet, int i7) {
        this(context, attributeSet, i7, 0);
    }

    public ListPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC7046k.m29007a(context, AbstractC6597c.f23780b, R.attr.dialogPreferenceStyle));
    }
}
