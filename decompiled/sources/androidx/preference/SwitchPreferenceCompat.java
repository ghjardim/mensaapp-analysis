package androidx.preference;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import android.widget.CompoundButton;
import androidx.appcompat.widget.SwitchCompat;
import p352u1.AbstractC6597c;
import p352u1.AbstractC6598d;
import p352u1.AbstractC6601g;
import p379y.AbstractC7046k;

/* loaded from: classes.dex */
public class SwitchPreferenceCompat extends TwoStatePreference {

    /* renamed from: P */
    public final C3406a f11244P;

    /* renamed from: Q */
    public CharSequence f11245Q;

    /* renamed from: R */
    public CharSequence f11246R;

    /* renamed from: androidx.preference.SwitchPreferenceCompat$a */
    public class C3406a implements CompoundButton.OnCheckedChangeListener {
        public C3406a() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z6) {
            if (SwitchPreferenceCompat.this.m13427b(Boolean.valueOf(z6))) {
                SwitchPreferenceCompat.this.m13462K(z6);
            } else {
                compoundButton.setChecked(!z6);
            }
        }
    }

    public SwitchPreferenceCompat(Context context, AttributeSet attributeSet, int i7, int i8) {
        super(context, attributeSet, i7, i8);
        this.f11244P = new C3406a();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC6601g.f23833U0, i7, i8);
        m13465N(AbstractC7046k.m29021o(obtainStyledAttributes, AbstractC6601g.f23852c1, AbstractC6601g.f23835V0));
        m13464M(AbstractC7046k.m29021o(obtainStyledAttributes, AbstractC6601g.f23849b1, AbstractC6601g.f23837W0));
        m13460Q(AbstractC7046k.m29021o(obtainStyledAttributes, AbstractC6601g.f23858e1, AbstractC6601g.f23841Y0));
        m13459P(AbstractC7046k.m29021o(obtainStyledAttributes, AbstractC6601g.f23855d1, AbstractC6601g.f23843Z0));
        m13463L(AbstractC7046k.m29008b(obtainStyledAttributes, AbstractC6601g.f23846a1, AbstractC6601g.f23839X0, false));
        obtainStyledAttributes.recycle();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: R */
    private void m13457R(View view) {
        boolean z6 = view instanceof SwitchCompat;
        if (z6) {
            ((SwitchCompat) view).setOnCheckedChangeListener(null);
        }
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(this.f11248K);
        }
        if (z6) {
            SwitchCompat switchCompat = (SwitchCompat) view;
            switchCompat.setTextOn(this.f11245Q);
            switchCompat.setTextOff(this.f11246R);
            switchCompat.setOnCheckedChangeListener(this.f11244P);
        }
    }

    /* renamed from: S */
    private void m13458S(View view) {
        if (((AccessibilityManager) m13429g().getSystemService("accessibility")).isEnabled()) {
            m13457R(view.findViewById(AbstractC6598d.f23789a));
            m13466O(view.findViewById(R.id.summary));
        }
    }

    @Override // androidx.preference.Preference
    /* renamed from: C */
    public void mo13397C(View view) {
        super.mo13397C(view);
        m13458S(view);
    }

    /* renamed from: P */
    public void m13459P(CharSequence charSequence) {
        this.f11246R = charSequence;
        mo13403v();
    }

    /* renamed from: Q */
    public void m13460Q(CharSequence charSequence) {
        this.f11245Q = charSequence;
        mo13403v();
    }

    public SwitchPreferenceCompat(Context context, AttributeSet attributeSet, int i7) {
        this(context, attributeSet, i7, 0);
    }

    public SwitchPreferenceCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC6597c.f23787i);
    }
}
