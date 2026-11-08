package androidx.preference;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import p352u1.AbstractC6597c;
import p379y.AbstractC7046k;

/* loaded from: classes.dex */
public class PreferenceCategory extends PreferenceGroup {
    public PreferenceCategory(Context context, AttributeSet attributeSet, int i7, int i8) {
        super(context, attributeSet, i7, i8);
    }

    @Override // androidx.preference.Preference
    /* renamed from: H */
    public boolean mo13404H() {
        return !super.mo13441t();
    }

    @Override // androidx.preference.Preference
    /* renamed from: t */
    public boolean mo13441t() {
        return false;
    }

    public PreferenceCategory(Context context, AttributeSet attributeSet, int i7) {
        this(context, attributeSet, i7, 0);
    }

    public PreferenceCategory(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC7046k.m29007a(context, AbstractC6597c.f23783e, R.attr.preferenceCategoryStyle));
    }
}
