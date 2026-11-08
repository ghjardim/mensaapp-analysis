package androidx.preference;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import p352u1.AbstractC6597c;
import p379y.AbstractC7046k;

/* loaded from: classes.dex */
public final class PreferenceScreen extends PreferenceGroup {

    /* renamed from: S */
    public boolean f11225S;

    public PreferenceScreen(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, AbstractC7046k.m29007a(context, AbstractC6597c.f23784f, R.attr.preferenceScreenStyle));
        this.f11225S = true;
    }

    @Override // androidx.preference.Preference
    /* renamed from: x */
    public void mo13400x() {
        if (m13432j() == null && m13431i() == null && m13446K() != 0) {
            m13437o();
            throw null;
        }
    }
}
