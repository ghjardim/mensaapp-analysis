package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

/* loaded from: classes.dex */
public abstract class TwoStatePreference extends Preference {

    /* renamed from: K */
    public boolean f11248K;

    /* renamed from: L */
    public CharSequence f11249L;

    /* renamed from: M */
    public CharSequence f11250M;

    /* renamed from: N */
    public boolean f11251N;

    /* renamed from: O */
    public boolean f11252O;

    public TwoStatePreference(Context context, AttributeSet attributeSet, int i7, int i8) {
        super(context, attributeSet, i7, i8);
    }

    @Override // androidx.preference.Preference
    /* renamed from: H */
    public boolean mo13404H() {
        return (this.f11252O ? this.f11248K : !this.f11248K) || super.mo13404H();
    }

    /* renamed from: J */
    public boolean m13461J() {
        return this.f11248K;
    }

    /* renamed from: K */
    public void m13462K(boolean z6) {
        boolean z7 = this.f11248K != z6;
        if (z7 || !this.f11251N) {
            this.f11248K = z6;
            this.f11251N = true;
            m13422D(z6);
            if (z7) {
                mo13443w(mo13404H());
                mo13403v();
            }
        }
    }

    /* renamed from: L */
    public void m13463L(boolean z6) {
        this.f11252O = z6;
    }

    /* renamed from: M */
    public void m13464M(CharSequence charSequence) {
        this.f11250M = charSequence;
        if (m13461J()) {
            return;
        }
        mo13403v();
    }

    /* renamed from: N */
    public void m13465N(CharSequence charSequence) {
        this.f11249L = charSequence;
        if (m13461J()) {
            mo13403v();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* renamed from: O */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m13466O(android.view.View r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof android.widget.TextView
            if (r0 != 0) goto L5
            return
        L5:
            android.widget.TextView r5 = (android.widget.TextView) r5
            boolean r0 = r4.f11248K
            r1 = 0
            if (r0 == 0) goto L1b
            java.lang.CharSequence r0 = r4.f11249L
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L1b
            java.lang.CharSequence r0 = r4.f11249L
            r5.setText(r0)
        L19:
            r0 = r1
            goto L2e
        L1b:
            boolean r0 = r4.f11248K
            if (r0 != 0) goto L2d
            java.lang.CharSequence r0 = r4.f11250M
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L2d
            java.lang.CharSequence r0 = r4.f11250M
            r5.setText(r0)
            goto L19
        L2d:
            r0 = 1
        L2e:
            if (r0 == 0) goto L3e
            java.lang.CharSequence r2 = r4.mo13417p()
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            if (r3 != 0) goto L3e
            r5.setText(r2)
            r0 = r1
        L3e:
            if (r0 != 0) goto L41
            goto L43
        L41:
            r1 = 8
        L43:
            int r0 = r5.getVisibility()
            if (r1 == r0) goto L4c
            r5.setVisibility(r1)
        L4c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.preference.TwoStatePreference.m13466O(android.view.View):void");
    }

    @Override // androidx.preference.Preference
    /* renamed from: x */
    public void mo13400x() {
        super.mo13400x();
        boolean z6 = !m13461J();
        if (m13427b(Boolean.valueOf(z6))) {
            m13462K(z6);
        }
    }

    @Override // androidx.preference.Preference
    /* renamed from: z */
    public Object mo13406z(TypedArray typedArray, int i7) {
        return Boolean.valueOf(typedArray.getBoolean(i7, false));
    }

    public TwoStatePreference(Context context, AttributeSet attributeSet, int i7) {
        this(context, attributeSet, i7, 0);
    }

    public TwoStatePreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
