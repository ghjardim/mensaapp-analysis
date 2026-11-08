package androidx.preference;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import androidx.preference.Preference;
import p352u1.AbstractC6597c;
import p352u1.AbstractC6600f;
import p352u1.AbstractC6601g;
import p379y.AbstractC7046k;

/* loaded from: classes.dex */
public class EditTextPreference extends DialogPreference {

    /* renamed from: Q */
    public String f11175Q;

    /* renamed from: androidx.preference.EditTextPreference$a */
    public static final class C3398a implements Preference.InterfaceC3401b {

        /* renamed from: a */
        public static C3398a f11176a;

        /* renamed from: b */
        public static C3398a m13407b() {
            if (f11176a == null) {
                f11176a = new C3398a();
            }
            return f11176a;
        }

        @Override // androidx.preference.Preference.InterfaceC3401b
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public CharSequence mo13408a(EditTextPreference editTextPreference) {
            return TextUtils.isEmpty(editTextPreference.m13405J()) ? editTextPreference.m13429g().getString(AbstractC6600f.f23791a) : editTextPreference.m13405J();
        }
    }

    public EditTextPreference(Context context, AttributeSet attributeSet, int i7, int i8) {
        super(context, attributeSet, i7, i8);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC6601g.f23891v, i7, i8);
        int i9 = AbstractC6601g.f23893w;
        if (AbstractC7046k.m29008b(obtainStyledAttributes, i9, i9, false)) {
            m13425G(C3398a.m13407b());
        }
        obtainStyledAttributes.recycle();
    }

    @Override // androidx.preference.Preference
    /* renamed from: H */
    public boolean mo13404H() {
        return TextUtils.isEmpty(this.f11175Q) || super.mo13404H();
    }

    /* renamed from: J */
    public String m13405J() {
        return this.f11175Q;
    }

    @Override // androidx.preference.Preference
    /* renamed from: z */
    public Object mo13406z(TypedArray typedArray, int i7) {
        return typedArray.getString(i7);
    }

    public EditTextPreference(Context context, AttributeSet attributeSet, int i7) {
        this(context, attributeSet, i7, 0);
    }

    public EditTextPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC7046k.m29007a(context, AbstractC6597c.f23782d, R.attr.editTextPreferenceStyle));
    }
}
