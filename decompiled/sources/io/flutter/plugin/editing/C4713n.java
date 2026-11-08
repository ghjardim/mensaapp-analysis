package io.flutter.plugin.editing;

import android.text.Editable;
import android.text.Selection;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;
import java.util.ArrayList;
import java.util.Iterator;
import p054H4.C0589y;
import p370w4.AbstractC6917b;

/* renamed from: io.flutter.plugin.editing.n */
/* loaded from: classes.dex */
public class C4713n extends SpannableStringBuilder {

    /* renamed from: a */
    public int f17474a = 0;

    /* renamed from: b */
    public int f17475b = 0;

    /* renamed from: c */
    public ArrayList f17476c = new ArrayList();

    /* renamed from: d */
    public ArrayList f17477d = new ArrayList();

    /* renamed from: e */
    public ArrayList f17478e = new ArrayList();

    /* renamed from: f */
    public String f17479f;

    /* renamed from: n */
    public String f17480n;

    /* renamed from: o */
    public int f17481o;

    /* renamed from: p */
    public int f17482p;

    /* renamed from: q */
    public int f17483q;

    /* renamed from: r */
    public int f17484r;

    /* renamed from: s */
    public BaseInputConnection f17485s;

    /* renamed from: io.flutter.plugin.editing.n$a */
    public class a extends BaseInputConnection {

        /* renamed from: a */
        public final /* synthetic */ Editable f17486a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(View view, boolean z6, Editable editable) {
            super(view, z6);
            this.f17486a = editable;
        }

        @Override // android.view.inputmethod.BaseInputConnection
        public Editable getEditable() {
            return this.f17486a;
        }
    }

    /* renamed from: io.flutter.plugin.editing.n$b */
    public interface b {
        /* renamed from: a */
        void mo20336a(boolean z6, boolean z7, boolean z8);
    }

    public C4713n(C0589y.e eVar, View view) {
        this.f17485s = new a(view, true, this);
        if (eVar != null) {
            m20395n(eVar);
        }
    }

    /* renamed from: a */
    public void m20382a(b bVar) {
        if (this.f17475b > 0) {
            AbstractC6917b.m28354b("ListenableEditingState", "adding a listener " + bVar.toString() + " in a listener callback");
        }
        if (this.f17474a <= 0) {
            this.f17476c.add(bVar);
        } else {
            AbstractC6917b.m28359g("ListenableEditingState", "a listener was added to EditingState while a batch edit was in progress");
            this.f17477d.add(bVar);
        }
    }

    /* renamed from: b */
    public void m20383b() {
        this.f17474a++;
        if (this.f17475b > 0) {
            AbstractC6917b.m28354b("ListenableEditingState", "editing state should not be changed in a listener callback");
        }
        if (this.f17474a != 1 || this.f17476c.isEmpty()) {
            return;
        }
        this.f17480n = toString();
        this.f17481o = m20390i();
        this.f17482p = m20389h();
        this.f17483q = m20388g();
        this.f17484r = m20387f();
    }

    /* renamed from: c */
    public void m20384c() {
        this.f17478e.clear();
    }

    /* renamed from: d */
    public void m20385d() {
        int i7 = this.f17474a;
        if (i7 == 0) {
            AbstractC6917b.m28354b("ListenableEditingState", "endBatchEdit called without a matching beginBatchEdit");
            return;
        }
        if (i7 == 1) {
            Iterator it = this.f17477d.iterator();
            while (it.hasNext()) {
                m20391j((b) it.next(), true, true, true);
            }
            if (!this.f17476c.isEmpty()) {
                AbstractC6917b.m28358f("ListenableEditingState", "didFinishBatchEdit with " + String.valueOf(this.f17476c.size()) + " listener(s)");
                m20392k(!toString().equals(this.f17480n), (this.f17481o == m20390i() && this.f17482p == m20389h()) ? false : true, (this.f17483q == m20388g() && this.f17484r == m20387f()) ? false : true);
            }
        }
        this.f17476c.addAll(this.f17477d);
        this.f17477d.clear();
        this.f17474a--;
    }

    /* renamed from: e */
    public ArrayList m20386e() {
        ArrayList arrayList = new ArrayList(this.f17478e);
        this.f17478e.clear();
        return arrayList;
    }

    /* renamed from: f */
    public final int m20387f() {
        return BaseInputConnection.getComposingSpanEnd(this);
    }

    /* renamed from: g */
    public final int m20388g() {
        return BaseInputConnection.getComposingSpanStart(this);
    }

    /* renamed from: h */
    public final int m20389h() {
        return Selection.getSelectionEnd(this);
    }

    /* renamed from: i */
    public final int m20390i() {
        return Selection.getSelectionStart(this);
    }

    /* renamed from: j */
    public final void m20391j(b bVar, boolean z6, boolean z7, boolean z8) {
        this.f17475b++;
        bVar.mo20336a(z6, z7, z8);
        this.f17475b--;
    }

    /* renamed from: k */
    public final void m20392k(boolean z6, boolean z7, boolean z8) {
        if (z6 || z7 || z8) {
            Iterator it = this.f17476c.iterator();
            while (it.hasNext()) {
                m20391j((b) it.next(), z6, z7, z8);
            }
        }
    }

    /* renamed from: l */
    public void m20393l(b bVar) {
        if (this.f17475b > 0) {
            AbstractC6917b.m28354b("ListenableEditingState", "removing a listener " + bVar.toString() + " in a listener callback");
        }
        this.f17476c.remove(bVar);
        if (this.f17474a > 0) {
            this.f17477d.remove(bVar);
        }
    }

    /* renamed from: m */
    public void m20394m(int i7, int i8) {
        if (i7 < 0 || i7 >= i8) {
            BaseInputConnection.removeComposingSpans(this);
        } else {
            this.f17485s.setComposingRegion(i7, i8);
        }
    }

    /* renamed from: n */
    public void m20395n(C0589y.e eVar) {
        m20383b();
        replace(0, length(), (CharSequence) eVar.f2072a);
        if (eVar.m2375c()) {
            Selection.setSelection(this, eVar.f2073b, eVar.f2074c);
        } else {
            Selection.removeSelection(this);
        }
        m20394m(eVar.f2075d, eVar.f2076e);
        m20384c();
        m20385d();
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public void setSpan(Object obj, int i7, int i8, int i9) {
        super.setSpan(obj, i7, i8, i9);
        this.f17478e.add(new C4719t(toString(), m20390i(), m20389h(), m20388g(), m20387f()));
    }

    @Override // android.text.SpannableStringBuilder, java.lang.CharSequence
    public String toString() {
        String str = this.f17479f;
        if (str != null) {
            return str;
        }
        String spannableStringBuilder = super.toString();
        this.f17479f = spannableStringBuilder;
        return spannableStringBuilder;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public SpannableStringBuilder replace(int i7, int i8, CharSequence charSequence, int i9, int i10) {
        boolean z6;
        boolean z7;
        if (this.f17475b > 0) {
            AbstractC6917b.m28354b("ListenableEditingState", "editing state should not be changed in a listener callback");
        }
        String c4713n = toString();
        int i11 = i8 - i7;
        boolean z8 = i11 != i10 - i9;
        for (int i12 = 0; i12 < i11 && !z8; i12++) {
            z8 |= charAt(i7 + i12) != charSequence.charAt(i9 + i12);
        }
        if (z8) {
            this.f17479f = null;
        }
        int m20390i = m20390i();
        int m20389h = m20389h();
        int m20388g = m20388g();
        int m20387f = m20387f();
        SpannableStringBuilder replace = super.replace(i7, i8, charSequence, i9, i10);
        boolean z9 = z8;
        this.f17478e.add(new C4719t(c4713n, i7, i8, charSequence, m20390i(), m20389h(), m20388g(), m20387f()));
        if (this.f17474a > 0) {
            return replace;
        }
        boolean z10 = (m20390i() == m20390i && m20389h() == m20389h) ? false : true;
        if (m20388g() == m20388g && m20387f() == m20387f) {
            z6 = z9;
            z7 = false;
        } else {
            z6 = z9;
            z7 = true;
        }
        m20392k(z6, z10, z7);
        return replace;
    }
}
