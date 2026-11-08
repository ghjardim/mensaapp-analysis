package androidx.preference;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import java.util.HashSet;
import java.util.Set;
import p352u1.AbstractC6597c;
import p352u1.AbstractC6601g;
import p379y.AbstractC7046k;

/* loaded from: classes.dex */
public class MultiSelectListPreference extends DialogPreference {

    /* renamed from: Q */
    public CharSequence[] f11183Q;

    /* renamed from: R */
    public CharSequence[] f11184R;

    /* renamed from: S */
    public Set f11185S;

    public MultiSelectListPreference(Context context, AttributeSet attributeSet, int i7, int i8) {
        super(context, attributeSet, i7, i8);
        this.f11185S = new HashSet();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC6601g.f23798D, i7, i8);
        this.f11183Q = AbstractC7046k.m29023q(obtainStyledAttributes, AbstractC6601g.f23804G, AbstractC6601g.f23800E);
        this.f11184R = AbstractC7046k.m29023q(obtainStyledAttributes, AbstractC6601g.f23806H, AbstractC6601g.f23802F);
        obtainStyledAttributes.recycle();
    }

    @Override // androidx.preference.Preference
    /* renamed from: z */
    public Object mo13406z(TypedArray typedArray, int i7) {
        CharSequence[] textArray = typedArray.getTextArray(i7);
        HashSet hashSet = new HashSet();
        for (CharSequence charSequence : textArray) {
            hashSet.add(charSequence.toString());
        }
        return hashSet;
    }

    public MultiSelectListPreference(Context context, AttributeSet attributeSet, int i7) {
        this(context, attributeSet, i7, 0);
    }

    public MultiSelectListPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC7046k.m29007a(context, AbstractC6597c.f23780b, R.attr.dialogPreferenceStyle));
    }
}
