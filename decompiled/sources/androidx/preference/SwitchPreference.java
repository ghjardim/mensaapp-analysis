package androidx.preference;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import android.widget.CompoundButton;
import android.widget.Switch;
import p352u1.AbstractC6597c;
import p352u1.AbstractC6601g;
import p379y.AbstractC7046k;

/* loaded from: classes.dex */
public class SwitchPreference extends TwoStatePreference {

    /* renamed from: P */
    public final C3405a f11240P;

    /* renamed from: Q */
    public CharSequence f11241Q;

    /* renamed from: R */
    public CharSequence f11242R;

    /* renamed from: androidx.preference.SwitchPreference$a */
    public class C3405a implements CompoundButton.OnCheckedChangeListener {
        public C3405a() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z6) {
            if (SwitchPreference.this.m13427b(Boolean.valueOf(z6))) {
                SwitchPreference.this.m13462K(z6);
            } else {
                compoundButton.setChecked(!z6);
            }
        }
    }

    public SwitchPreference(Context context, AttributeSet attributeSet, int i7, int i8) {
        super(context, attributeSet, i7, i8);
        this.f11240P = new C3405a();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC6601g.f23811J0, i7, i8);
        m13465N(AbstractC7046k.m29021o(obtainStyledAttributes, AbstractC6601g.f23827R0, AbstractC6601g.f23813K0));
        m13464M(AbstractC7046k.m29021o(obtainStyledAttributes, AbstractC6601g.f23825Q0, AbstractC6601g.f23815L0));
        m13455Q(AbstractC7046k.m29021o(obtainStyledAttributes, AbstractC6601g.f23831T0, AbstractC6601g.f23819N0));
        m13454P(AbstractC7046k.m29021o(obtainStyledAttributes, AbstractC6601g.f23829S0, AbstractC6601g.f23821O0));
        m13463L(AbstractC7046k.m29008b(obtainStyledAttributes, AbstractC6601g.f23823P0, AbstractC6601g.f23817M0, false));
        obtainStyledAttributes.recycle();
    }

    /* renamed from: S */
    private void m13453S(View view) {
        if (((AccessibilityManager) m13429g().getSystemService("accessibility")).isEnabled()) {
            m13456R(view.findViewById(R.id.switch_widget));
            m13466O(view.findViewById(R.id.summary));
        }
    }

    @Override // androidx.preference.Preference
    /* renamed from: C */
    public void mo13397C(View view) {
        super.mo13397C(view);
        m13453S(view);
    }

    /* renamed from: P */
    public void m13454P(CharSequence charSequence) {
        this.f11242R = charSequence;
        mo13403v();
    }

    /* renamed from: Q */
    public void m13455Q(CharSequence charSequence) {
        this.f11241Q = charSequence;
        mo13403v();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: R */
    public final void m13456R(View view) {
        boolean z6 = view instanceof Switch;
        if (z6) {
            ((Switch) view).setOnCheckedChangeListener(null);
        }
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(this.f11248K);
        }
        if (z6) {
            Switch r42 = (Switch) view;
            r42.setTextOn(this.f11241Q);
            r42.setTextOff(this.f11242R);
            r42.setOnCheckedChangeListener(this.f11240P);
        }
    }

    public SwitchPreference(Context context, AttributeSet attributeSet, int i7) {
        this(context, attributeSet, i7, 0);
    }

    public SwitchPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC7046k.m29007a(context, AbstractC6597c.f23788j, R.attr.switchPreferenceStyle));
    }
}
