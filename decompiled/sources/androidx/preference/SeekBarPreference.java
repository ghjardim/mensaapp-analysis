package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;
import p352u1.AbstractC6597c;
import p352u1.AbstractC6601g;

/* loaded from: classes.dex */
public class SeekBarPreference extends Preference {

    /* renamed from: K */
    public int f11226K;

    /* renamed from: L */
    public int f11227L;

    /* renamed from: M */
    public int f11228M;

    /* renamed from: N */
    public int f11229N;

    /* renamed from: O */
    public boolean f11230O;

    /* renamed from: P */
    public SeekBar f11231P;

    /* renamed from: Q */
    public TextView f11232Q;

    /* renamed from: R */
    public boolean f11233R;

    /* renamed from: S */
    public boolean f11234S;

    /* renamed from: T */
    public boolean f11235T;

    /* renamed from: U */
    public final SeekBar.OnSeekBarChangeListener f11236U;

    /* renamed from: V */
    public final View.OnKeyListener f11237V;

    /* renamed from: androidx.preference.SeekBarPreference$a */
    public class C3403a implements SeekBar.OnSeekBarChangeListener {
        public C3403a() {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar seekBar, int i7, boolean z6) {
            if (z6) {
                SeekBarPreference seekBarPreference = SeekBarPreference.this;
                if (seekBarPreference.f11235T || !seekBarPreference.f11230O) {
                    seekBarPreference.m13451M(seekBar);
                    return;
                }
            }
            SeekBarPreference seekBarPreference2 = SeekBarPreference.this;
            seekBarPreference2.m13452N(i7 + seekBarPreference2.f11227L);
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(SeekBar seekBar) {
            SeekBarPreference.this.f11230O = true;
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(SeekBar seekBar) {
            SeekBarPreference.this.f11230O = false;
            int progress = seekBar.getProgress();
            SeekBarPreference seekBarPreference = SeekBarPreference.this;
            if (progress + seekBarPreference.f11227L != seekBarPreference.f11226K) {
                seekBarPreference.m13451M(seekBar);
            }
        }
    }

    /* renamed from: androidx.preference.SeekBarPreference$b */
    public class ViewOnKeyListenerC3404b implements View.OnKeyListener {
        public ViewOnKeyListenerC3404b() {
        }

        @Override // android.view.View.OnKeyListener
        public boolean onKey(View view, int i7, KeyEvent keyEvent) {
            if (keyEvent.getAction() != 0) {
                return false;
            }
            SeekBarPreference seekBarPreference = SeekBarPreference.this;
            if ((!seekBarPreference.f11233R && (i7 == 21 || i7 == 22)) || i7 == 23 || i7 == 66) {
                return false;
            }
            SeekBar seekBar = seekBarPreference.f11231P;
            if (seekBar != null) {
                return seekBar.onKeyDown(i7, keyEvent);
            }
            Log.e("SeekBarPreference", "SeekBar view is null and hence cannot be adjusted.");
            return false;
        }
    }

    public SeekBarPreference(Context context, AttributeSet attributeSet, int i7, int i8) {
        super(context, attributeSet, i7, i8);
        this.f11236U = new C3403a();
        this.f11237V = new ViewOnKeyListenerC3404b();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC6601g.f23797C0, i7, i8);
        this.f11227L = obtainStyledAttributes.getInt(AbstractC6601g.f23803F0, 0);
        m13448J(obtainStyledAttributes.getInt(AbstractC6601g.f23799D0, 100));
        m13449K(obtainStyledAttributes.getInt(AbstractC6601g.f23805G0, 0));
        this.f11233R = obtainStyledAttributes.getBoolean(AbstractC6601g.f23801E0, true);
        this.f11234S = obtainStyledAttributes.getBoolean(AbstractC6601g.f23807H0, false);
        this.f11235T = obtainStyledAttributes.getBoolean(AbstractC6601g.f23809I0, false);
        obtainStyledAttributes.recycle();
    }

    /* renamed from: J */
    public final void m13448J(int i7) {
        int i8 = this.f11227L;
        if (i7 < i8) {
            i7 = i8;
        }
        if (i7 != this.f11228M) {
            this.f11228M = i7;
            mo13403v();
        }
    }

    /* renamed from: K */
    public final void m13449K(int i7) {
        if (i7 != this.f11229N) {
            this.f11229N = Math.min(this.f11228M - this.f11227L, Math.abs(i7));
            mo13403v();
        }
    }

    /* renamed from: L */
    public final void m13450L(int i7, boolean z6) {
        int i8 = this.f11227L;
        if (i7 < i8) {
            i7 = i8;
        }
        int i9 = this.f11228M;
        if (i7 > i9) {
            i7 = i9;
        }
        if (i7 != this.f11226K) {
            this.f11226K = i7;
            m13452N(i7);
            m13423E(i7);
            if (z6) {
                mo13403v();
            }
        }
    }

    /* renamed from: M */
    public void m13451M(SeekBar seekBar) {
        int progress = this.f11227L + seekBar.getProgress();
        if (progress != this.f11226K) {
            if (m13427b(Integer.valueOf(progress))) {
                m13450L(progress, false);
            } else {
                seekBar.setProgress(this.f11226K - this.f11227L);
                m13452N(this.f11226K);
            }
        }
    }

    /* renamed from: N */
    public void m13452N(int i7) {
        TextView textView = this.f11232Q;
        if (textView != null) {
            textView.setText(String.valueOf(i7));
        }
    }

    @Override // androidx.preference.Preference
    /* renamed from: z */
    public Object mo13406z(TypedArray typedArray, int i7) {
        return Integer.valueOf(typedArray.getInt(i7, 0));
    }

    public SeekBarPreference(Context context, AttributeSet attributeSet, int i7) {
        this(context, attributeSet, i7, 0);
    }

    public SeekBarPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC6597c.f23786h);
    }
}
