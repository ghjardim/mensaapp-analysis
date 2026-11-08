package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Log;
import com.google.android.gms.common.api.C3643a;
import java.util.ArrayList;
import java.util.List;
import p334s.C6318k;
import p352u1.AbstractC6601g;
import p379y.AbstractC7046k;

/* loaded from: classes.dex */
public abstract class PreferenceGroup extends Preference {

    /* renamed from: K */
    public final C6318k f11216K;

    /* renamed from: L */
    public final Handler f11217L;

    /* renamed from: M */
    public final List f11218M;

    /* renamed from: N */
    public boolean f11219N;

    /* renamed from: O */
    public int f11220O;

    /* renamed from: P */
    public boolean f11221P;

    /* renamed from: Q */
    public int f11222Q;

    /* renamed from: R */
    public final Runnable f11223R;

    /* renamed from: androidx.preference.PreferenceGroup$a */
    public class RunnableC3402a implements Runnable {
        public RunnableC3402a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (this) {
                PreferenceGroup.this.f11216K.clear();
            }
        }
    }

    public PreferenceGroup(Context context, AttributeSet attributeSet, int i7, int i8) {
        super(context, attributeSet, i7, i8);
        this.f11216K = new C6318k();
        this.f11217L = new Handler(Looper.getMainLooper());
        this.f11219N = true;
        this.f11220O = 0;
        this.f11221P = false;
        this.f11222Q = C3643a.e.API_PRIORITY_OTHER;
        this.f11223R = new RunnableC3402a();
        this.f11218M = new ArrayList();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC6601g.f23892v0, i7, i8);
        int i9 = AbstractC6601g.f23896x0;
        this.f11219N = AbstractC7046k.m29008b(obtainStyledAttributes, i9, i9, true);
        if (obtainStyledAttributes.hasValue(AbstractC6601g.f23894w0)) {
            int i10 = AbstractC6601g.f23894w0;
            m13447L(AbstractC7046k.m29010d(obtainStyledAttributes, i10, i10, C3643a.e.API_PRIORITY_OTHER));
        }
        obtainStyledAttributes.recycle();
    }

    /* renamed from: J */
    public Preference m13445J(int i7) {
        return (Preference) this.f11218M.get(i7);
    }

    /* renamed from: K */
    public int m13446K() {
        return this.f11218M.size();
    }

    /* renamed from: L */
    public void m13447L(int i7) {
        if (i7 != Integer.MAX_VALUE && !m13440s()) {
            Log.e("PreferenceGroup", getClass().getSimpleName() + " should have a key defined if it contains an expandable preference");
        }
        this.f11222Q = i7;
    }

    @Override // androidx.preference.Preference
    /* renamed from: w */
    public void mo13443w(boolean z6) {
        super.mo13443w(z6);
        int m13446K = m13446K();
        for (int i7 = 0; i7 < m13446K; i7++) {
            m13445J(i7).m13420A(this, z6);
        }
    }

    public PreferenceGroup(Context context, AttributeSet attributeSet, int i7) {
        this(context, attributeSet, i7, 0);
    }

    public PreferenceGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
