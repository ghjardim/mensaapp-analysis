package androidx.preference;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import android.widget.CompoundButton;
import p352u1.AbstractC6597c;
import p352u1.AbstractC6601g;
import p379y.AbstractC7046k;

/* loaded from: classes.dex */
public class CheckBoxPreference extends TwoStatePreference {

    /* renamed from: P */
    public final C3396a f11162P;

    /* renamed from: androidx.preference.CheckBoxPreference$a */
    public class C3396a implements CompoundButton.OnCheckedChangeListener {
        public C3396a() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z6) {
            if (CheckBoxPreference.this.m13427b(Boolean.valueOf(z6))) {
                CheckBoxPreference.this.m13462K(z6);
            } else {
                compoundButton.setChecked(!z6);
            }
        }
    }

    public CheckBoxPreference(Context context, AttributeSet attributeSet, int i7) {
        this(context, attributeSet, i7, 0);
    }

    @Override // androidx.preference.Preference
    /* renamed from: C */
    public void mo13397C(View view) {
        super.mo13397C(view);
        m13399Q(view);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: P */
    public final void m13398P(View view) {
        boolean z6 = view instanceof CompoundButton;
        if (z6) {
            ((CompoundButton) view).setOnCheckedChangeListener(null);
        }
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(this.f11248K);
        }
        if (z6) {
            ((CompoundButton) view).setOnCheckedChangeListener(this.f11162P);
        }
    }

    /* renamed from: Q */
    public final void m13399Q(View view) {
        if (((AccessibilityManager) m13429g().getSystemService("accessibility")).isEnabled()) {
            m13398P(view.findViewById(R.id.checkbox));
            m13466O(view.findViewById(R.id.summary));
        }
    }

    public CheckBoxPreference(Context context, AttributeSet attributeSet, int i7, int i8) {
        super(context, attributeSet, i7, i8);
        this.f11162P = new C3396a();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC6601g.f23847b, i7, i8);
        m13465N(AbstractC7046k.m29021o(obtainStyledAttributes, AbstractC6601g.f23863h, AbstractC6601g.f23850c));
        m13464M(AbstractC7046k.m29021o(obtainStyledAttributes, AbstractC6601g.f23861g, AbstractC6601g.f23853d));
        m13463L(AbstractC7046k.m29008b(obtainStyledAttributes, AbstractC6601g.f23859f, AbstractC6601g.f23856e, false));
        obtainStyledAttributes.recycle();
    }

    public CheckBoxPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC7046k.m29007a(context, AbstractC6597c.f23779a, R.attr.checkBoxPreferenceStyle));
    }
}
