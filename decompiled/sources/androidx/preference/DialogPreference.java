package androidx.preference;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import p352u1.AbstractC6597c;
import p352u1.AbstractC6601g;
import p379y.AbstractC7046k;

/* loaded from: classes.dex */
public abstract class DialogPreference extends Preference {

    /* renamed from: K */
    public CharSequence f11164K;

    /* renamed from: L */
    public CharSequence f11165L;

    /* renamed from: M */
    public Drawable f11166M;

    /* renamed from: N */
    public CharSequence f11167N;

    /* renamed from: O */
    public CharSequence f11168O;

    /* renamed from: P */
    public int f11169P;

    public DialogPreference(Context context, AttributeSet attributeSet, int i7, int i8) {
        super(context, attributeSet, i7, i8);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC6601g.f23865i, i7, i8);
        String m29021o = AbstractC7046k.m29021o(obtainStyledAttributes, AbstractC6601g.f23885s, AbstractC6601g.f23867j);
        this.f11164K = m29021o;
        if (m29021o == null) {
            this.f11164K = m13439r();
        }
        this.f11165L = AbstractC7046k.m29021o(obtainStyledAttributes, AbstractC6601g.f23883r, AbstractC6601g.f23869k);
        this.f11166M = AbstractC7046k.m29009c(obtainStyledAttributes, AbstractC6601g.f23879p, AbstractC6601g.f23871l);
        this.f11167N = AbstractC7046k.m29021o(obtainStyledAttributes, AbstractC6601g.f23889u, AbstractC6601g.f23873m);
        this.f11168O = AbstractC7046k.m29021o(obtainStyledAttributes, AbstractC6601g.f23887t, AbstractC6601g.f23875n);
        this.f11169P = AbstractC7046k.m29020n(obtainStyledAttributes, AbstractC6601g.f23881q, AbstractC6601g.f23877o, 0);
        obtainStyledAttributes.recycle();
    }

    @Override // androidx.preference.Preference
    /* renamed from: x */
    public void mo13400x() {
        m13437o();
        throw null;
    }

    public DialogPreference(Context context, AttributeSet attributeSet, int i7) {
        this(context, attributeSet, i7, 0);
    }

    public DialogPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC7046k.m29007a(context, AbstractC6597c.f23780b, R.attr.dialogPreferenceStyle));
    }
}
