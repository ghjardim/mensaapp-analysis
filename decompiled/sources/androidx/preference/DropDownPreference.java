package androidx.preference;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import p352u1.AbstractC6597c;

/* loaded from: classes.dex */
public class DropDownPreference extends ListPreference {

    /* renamed from: V */
    public final Context f11170V;

    /* renamed from: W */
    public final ArrayAdapter f11171W;

    /* renamed from: X */
    public Spinner f11172X;

    /* renamed from: Y */
    public final AdapterView.OnItemSelectedListener f11173Y;

    /* renamed from: androidx.preference.DropDownPreference$a */
    public class C3397a implements AdapterView.OnItemSelectedListener {
        public C3397a() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView adapterView, View view, int i7, long j7) {
            if (i7 >= 0) {
                String charSequence = DropDownPreference.this.m13413M()[i7].toString();
                if (charSequence.equals(DropDownPreference.this.m13414N()) || !DropDownPreference.this.m13427b(charSequence)) {
                    return;
                }
                DropDownPreference.this.m13416P(charSequence);
            }
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView adapterView) {
        }
    }

    public DropDownPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC6597c.f23781c);
    }

    /* renamed from: Q */
    public ArrayAdapter m13401Q() {
        return new ArrayAdapter(this.f11170V, R.layout.simple_spinner_dropdown_item);
    }

    /* renamed from: R */
    public final void m13402R() {
        this.f11171W.clear();
        if (m13411K() != null) {
            for (CharSequence charSequence : m13411K()) {
                this.f11171W.add(charSequence.toString());
            }
        }
    }

    @Override // androidx.preference.Preference
    /* renamed from: v */
    public void mo13403v() {
        super.mo13403v();
        ArrayAdapter arrayAdapter = this.f11171W;
        if (arrayAdapter != null) {
            arrayAdapter.notifyDataSetChanged();
        }
    }

    @Override // androidx.preference.DialogPreference, androidx.preference.Preference
    /* renamed from: x */
    public void mo13400x() {
        this.f11172X.performClick();
    }

    public DropDownPreference(Context context, AttributeSet attributeSet, int i7) {
        this(context, attributeSet, i7, 0);
    }

    public DropDownPreference(Context context, AttributeSet attributeSet, int i7, int i8) {
        super(context, attributeSet, i7, i8);
        this.f11173Y = new C3397a();
        this.f11170V = context;
        this.f11171W = m13401Q();
        m13402R();
    }
}
