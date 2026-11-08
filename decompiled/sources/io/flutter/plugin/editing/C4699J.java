package io.flutter.plugin.editing;

import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillManager;
import android.view.autofill.AutofillValue;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import io.flutter.plugin.editing.C4713n;
import io.flutter.plugin.platform.C4743S;
import io.flutter.plugin.platform.C4783y;
import java.util.HashMap;
import p054H4.C0585u;
import p054H4.C0589y;
import p063J.AbstractC0670b;
import p370w4.AbstractC6917b;
import p377x4.C6969M;

/* renamed from: io.flutter.plugin.editing.J */
/* loaded from: classes.dex */
public class C4699J implements C4713n.b {

    /* renamed from: a */
    public final View f17429a;

    /* renamed from: b */
    public final InputMethodManager f17430b;

    /* renamed from: c */
    public final AutofillManager f17431c;

    /* renamed from: d */
    public final C0585u f17432d;

    /* renamed from: e */
    public final C0589y f17433e;

    /* renamed from: f */
    public c f17434f = new c(c.a.NO_TARGET, 0);

    /* renamed from: g */
    public C0589y.b f17435g;

    /* renamed from: h */
    public SparseArray f17436h;

    /* renamed from: i */
    public C4713n f17437i;

    /* renamed from: j */
    public boolean f17438j;

    /* renamed from: k */
    public InputConnection f17439k;

    /* renamed from: l */
    public C4783y f17440l;

    /* renamed from: m */
    public C4743S f17441m;

    /* renamed from: n */
    public Rect f17442n;

    /* renamed from: o */
    public ImeSyncDeferringInsetsCallback f17443o;

    /* renamed from: p */
    public C0589y.e f17444p;

    /* renamed from: q */
    public boolean f17445q;

    /* renamed from: io.flutter.plugin.editing.J$a */
    public class a implements C0589y.f {
        public a() {
        }

        @Override // p054H4.C0589y.f
        /* renamed from: a */
        public void mo2376a() {
            C4699J c4699j = C4699J.this;
            c4699j.m20333E(c4699j.f17429a);
        }

        @Override // p054H4.C0589y.f
        /* renamed from: b */
        public void mo2377b(String str, Bundle bundle) {
            C4699J.this.m20329A(str, bundle);
        }

        @Override // p054H4.C0589y.f
        /* renamed from: c */
        public void mo2378c(int i7, boolean z6) {
            C4699J.this.m20330B(i7, z6);
        }

        @Override // p054H4.C0589y.f
        /* renamed from: d */
        public void mo2379d(int i7, C0589y.b bVar) {
            C4699J.this.m20331C(i7, bVar);
        }

        @Override // p054H4.C0589y.f
        /* renamed from: e */
        public void mo2380e(double d7, double d8, double[] dArr) {
            C4699J.this.m20351z(d7, d8, dArr);
        }

        @Override // p054H4.C0589y.f
        /* renamed from: f */
        public void mo2381f() {
            C4699J.this.m20348w();
        }

        @Override // p054H4.C0589y.f
        /* renamed from: g */
        public void mo2382g(boolean z6) {
            if (Build.VERSION.SDK_INT < 26 || C4699J.this.f17431c == null) {
                return;
            }
            if (z6) {
                C4699J.this.f17431c.commit();
            } else {
                C4699J.this.f17431c.cancel();
            }
        }

        @Override // p054H4.C0589y.f
        /* renamed from: h */
        public void mo2383h() {
            C4699J.this.m20339l();
        }

        @Override // p054H4.C0589y.f
        /* renamed from: i */
        public void mo2384i(C0589y.e eVar) {
            C4699J c4699j = C4699J.this;
            c4699j.m20332D(c4699j.f17429a, eVar);
        }

        @Override // p054H4.C0589y.f
        /* renamed from: j */
        public void mo2385j() {
            if (C4699J.this.f17434f.f17451a == c.a.PHYSICAL_DISPLAY_PLATFORM_VIEW) {
                C4699J.this.m20349x();
            } else {
                C4699J c4699j = C4699J.this;
                c4699j.m20344r(c4699j.f17429a);
            }
        }
    }

    /* renamed from: io.flutter.plugin.editing.J$b */
    public class b implements d {

        /* renamed from: a */
        public final /* synthetic */ boolean f17447a;

        /* renamed from: b */
        public final /* synthetic */ double[] f17448b;

        /* renamed from: c */
        public final /* synthetic */ double[] f17449c;

        public b(boolean z6, double[] dArr, double[] dArr2) {
            this.f17447a = z6;
            this.f17448b = dArr;
            this.f17449c = dArr2;
        }

        @Override // io.flutter.plugin.editing.C4699J.d
        /* renamed from: a */
        public void mo20352a(double d7, double d8) {
            double d9 = 1.0d;
            if (!this.f17447a) {
                double[] dArr = this.f17448b;
                d9 = 1.0d / (((dArr[3] * d7) + (dArr[7] * d8)) + dArr[15]);
            }
            double[] dArr2 = this.f17448b;
            double d10 = ((dArr2[0] * d7) + (dArr2[4] * d8) + dArr2[12]) * d9;
            double d11 = ((dArr2[1] * d7) + (dArr2[5] * d8) + dArr2[13]) * d9;
            double[] dArr3 = this.f17449c;
            if (d10 < dArr3[0]) {
                dArr3[0] = d10;
            } else if (d10 > dArr3[1]) {
                dArr3[1] = d10;
            }
            if (d11 < dArr3[2]) {
                dArr3[2] = d11;
            } else if (d11 > dArr3[3]) {
                dArr3[3] = d11;
            }
        }
    }

    /* renamed from: io.flutter.plugin.editing.J$c */
    public static class c {

        /* renamed from: a */
        public a f17451a;

        /* renamed from: b */
        public int f17452b;

        /* renamed from: io.flutter.plugin.editing.J$c$a */
        public enum a {
            NO_TARGET,
            FRAMEWORK_CLIENT,
            VIRTUAL_DISPLAY_PLATFORM_VIEW,
            PHYSICAL_DISPLAY_PLATFORM_VIEW
        }

        public c(a aVar, int i7) {
            this.f17451a = aVar;
            this.f17452b = i7;
        }
    }

    /* renamed from: io.flutter.plugin.editing.J$d */
    public interface d {
        /* renamed from: a */
        void mo20352a(double d7, double d8);
    }

    public C4699J(View view, C0589y c0589y, C0585u c0585u, C4783y c4783y, C4743S c4743s) {
        this.f17429a = view;
        this.f17437i = new C4713n(null, view);
        this.f17430b = (InputMethodManager) view.getContext().getSystemService("input_method");
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 26) {
            this.f17431c = AbstractC4693F.m20315a(view.getContext().getSystemService(AbstractC4692E.m20314a()));
        } else {
            this.f17431c = null;
        }
        if (i7 >= 30) {
            ImeSyncDeferringInsetsCallback imeSyncDeferringInsetsCallback = new ImeSyncDeferringInsetsCallback(view);
            this.f17443o = imeSyncDeferringInsetsCallback;
            imeSyncDeferringInsetsCallback.install();
        }
        this.f17433e = c0589y;
        c0589y.m2361n(new a());
        c0589y.m2358k();
        this.f17432d = c0585u;
        this.f17440l = c4783y;
        c4783y.m20591D(this);
        this.f17441m = c4743s;
        c4743s.m20450l(this);
    }

    /* renamed from: m */
    public static boolean m20327m(C0589y.e eVar, C0589y.e eVar2) {
        int i7 = eVar.f2076e - eVar.f2075d;
        if (i7 != eVar2.f2076e - eVar2.f2075d) {
            return true;
        }
        for (int i8 = 0; i8 < i7; i8++) {
            if (eVar.f2072a.charAt(eVar.f2075d + i8) != eVar2.f2072a.charAt(eVar2.f2075d + i8)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0077  */
    /* renamed from: s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int m20328s(p054H4.C0589y.c r1, boolean r2, boolean r3, boolean r4, boolean r5, p054H4.C0589y.d r6) {
        /*
            H4.y$g r5 = r1.f2063a
            H4.y$g r0 = p054H4.C0589y.g.DATETIME
            if (r5 != r0) goto L8
            r1 = 4
            return r1
        L8:
            H4.y$g r0 = p054H4.C0589y.g.NUMBER
            if (r5 != r0) goto L1b
            boolean r2 = r1.f2064b
            if (r2 == 0) goto L13
            r2 = 4098(0x1002, float:5.743E-42)
            goto L14
        L13:
            r2 = 2
        L14:
            boolean r1 = r1.f2065c
            if (r1 == 0) goto L1a
            r2 = r2 | 8192(0x2000, float:1.148E-41)
        L1a:
            return r2
        L1b:
            H4.y$g r1 = p054H4.C0589y.g.PHONE
            if (r5 != r1) goto L21
            r1 = 3
            return r1
        L21:
            H4.y$g r1 = p054H4.C0589y.g.NONE
            if (r5 != r1) goto L27
            r1 = 0
            return r1
        L27:
            H4.y$g r1 = p054H4.C0589y.g.MULTILINE
            if (r5 != r1) goto L2f
            r1 = 131073(0x20001, float:1.83672E-40)
            goto L5d
        L2f:
            H4.y$g r1 = p054H4.C0589y.g.EMAIL_ADDRESS
            if (r5 == r1) goto L5b
            H4.y$g r1 = p054H4.C0589y.g.TWITTER
            if (r5 != r1) goto L38
            goto L5b
        L38:
            H4.y$g r1 = p054H4.C0589y.g.URL
            if (r5 == r1) goto L58
            H4.y$g r1 = p054H4.C0589y.g.WEB_SEARCH
            if (r5 != r1) goto L41
            goto L58
        L41:
            H4.y$g r1 = p054H4.C0589y.g.VISIBLE_PASSWORD
            if (r5 != r1) goto L48
            r1 = 145(0x91, float:2.03E-43)
            goto L5d
        L48:
            H4.y$g r1 = p054H4.C0589y.g.NAME
            if (r5 != r1) goto L4f
            r1 = 97
            goto L5d
        L4f:
            H4.y$g r1 = p054H4.C0589y.g.POSTAL_ADDRESS
            if (r5 != r1) goto L56
            r1 = 113(0x71, float:1.58E-43)
            goto L5d
        L56:
            r1 = 1
            goto L5d
        L58:
            r1 = 17
            goto L5d
        L5b:
            r1 = 33
        L5d:
            if (r2 == 0) goto L64
            r2 = 524416(0x80080, float:7.34863E-40)
        L62:
            r1 = r1 | r2
            goto L70
        L64:
            if (r3 == 0) goto L6a
            r2 = 32768(0x8000, float:4.5918E-41)
            r1 = r1 | r2
        L6a:
            if (r4 != 0) goto L70
            r2 = 524432(0x80090, float:7.34886E-40)
            goto L62
        L70:
            H4.y$d r2 = p054H4.C0589y.d.CHARACTERS
            if (r6 != r2) goto L77
            r1 = r1 | 4096(0x1000, float:5.74E-42)
            goto L84
        L77:
            H4.y$d r2 = p054H4.C0589y.d.WORDS
            if (r6 != r2) goto L7e
            r1 = r1 | 8192(0x2000, float:1.148E-41)
            goto L84
        L7e:
            H4.y$d r2 = p054H4.C0589y.d.SENTENCES
            if (r6 != r2) goto L84
            r1 = r1 | 16384(0x4000, float:2.2959E-41)
        L84:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: io.flutter.plugin.editing.C4699J.m20328s(H4.y$c, boolean, boolean, boolean, boolean, H4.y$d):int");
    }

    /* renamed from: A */
    public void m20329A(String str, Bundle bundle) {
        this.f17430b.sendAppPrivateCommand(this.f17429a, str, bundle);
    }

    /* renamed from: B */
    public final void m20330B(int i7, boolean z6) {
        if (!z6) {
            this.f17434f = new c(c.a.PHYSICAL_DISPLAY_PLATFORM_VIEW, i7);
            this.f17439k = null;
        } else {
            this.f17429a.requestFocus();
            this.f17434f = new c(c.a.VIRTUAL_DISPLAY_PLATFORM_VIEW, i7);
            this.f17430b.restartInput(this.f17429a);
            this.f17438j = false;
        }
    }

    /* renamed from: C */
    public void m20331C(int i7, C0589y.b bVar) {
        m20349x();
        this.f17435g = bVar;
        this.f17434f = new c(c.a.FRAMEWORK_CLIENT, i7);
        this.f17437i.m20393l(this);
        C0589y.b.a aVar = bVar.f2056j;
        this.f17437i = new C4713n(aVar != null ? aVar.f2061c : null, this.f17429a);
        m20335G(bVar);
        this.f17438j = true;
        m20334F();
        this.f17442n = null;
        this.f17437i.m20382a(this);
    }

    /* renamed from: D */
    public void m20332D(View view, C0589y.e eVar) {
        C0589y.e eVar2;
        if (!this.f17438j && (eVar2 = this.f17444p) != null && eVar2.m2374b()) {
            boolean m20327m = m20327m(this.f17444p, eVar);
            this.f17438j = m20327m;
            if (m20327m) {
                AbstractC6917b.m28357e("TextInputPlugin", "Composing region changed by the framework. Restarting the input method.");
            }
        }
        this.f17444p = eVar;
        this.f17437i.m20395n(eVar);
        if (this.f17438j) {
            this.f17430b.restartInput(view);
            this.f17438j = false;
        }
    }

    /* renamed from: E */
    public void m20333E(View view) {
        C0589y.c cVar;
        C0589y.b bVar = this.f17435g;
        if (bVar != null && (cVar = bVar.f2053g) != null && cVar.f2063a == C0589y.g.NONE) {
            m20344r(view);
        } else {
            view.requestFocus();
            this.f17430b.showSoftInput(view, 0);
        }
    }

    /* renamed from: F */
    public void m20334F() {
        if (this.f17434f.f17451a == c.a.VIRTUAL_DISPLAY_PLATFORM_VIEW) {
            this.f17445q = false;
        }
    }

    /* renamed from: G */
    public final void m20335G(C0589y.b bVar) {
        AutofillValue forText;
        if (Build.VERSION.SDK_INT < 26) {
            return;
        }
        if (bVar == null || bVar.f2056j == null) {
            this.f17436h = null;
            return;
        }
        C0589y.b[] bVarArr = bVar.f2058l;
        SparseArray sparseArray = new SparseArray();
        this.f17436h = sparseArray;
        if (bVarArr == null) {
            sparseArray.put(bVar.f2056j.f2059a.hashCode(), bVar);
            return;
        }
        for (C0589y.b bVar2 : bVarArr) {
            C0589y.b.a aVar = bVar2.f2056j;
            if (aVar != null) {
                this.f17436h.put(aVar.f2059a.hashCode(), bVar2);
                AutofillManager autofillManager = this.f17431c;
                View view = this.f17429a;
                int hashCode = aVar.f2059a.hashCode();
                forText = AutofillValue.forText(aVar.f2061c.f2072a);
                autofillManager.notifyValueChanged(view, hashCode, forText);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x004d, code lost:
    
        if (r7 == r1.f2076e) goto L22;
     */
    @Override // io.flutter.plugin.editing.C4713n.b
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo20336a(boolean r9, boolean r10, boolean r11) {
        /*
            r8 = this;
            if (r9 == 0) goto Lb
            io.flutter.plugin.editing.n r9 = r8.f17437i
            java.lang.String r9 = r9.toString()
            r8.m20347v(r9)
        Lb:
            io.flutter.plugin.editing.n r9 = r8.f17437i
            int r9 = r9.m20390i()
            io.flutter.plugin.editing.n r10 = r8.f17437i
            int r10 = r10.m20389h()
            io.flutter.plugin.editing.n r11 = r8.f17437i
            int r11 = r11.m20388g()
            io.flutter.plugin.editing.n r0 = r8.f17437i
            int r7 = r0.m20387f()
            io.flutter.plugin.editing.n r0 = r8.f17437i
            java.util.ArrayList r0 = r0.m20386e()
            H4.y$e r1 = r8.f17444p
            if (r1 == 0) goto La7
            io.flutter.plugin.editing.n r1 = r8.f17437i
            java.lang.String r1 = r1.toString()
            H4.y$e r2 = r8.f17444p
            java.lang.String r2 = r2.f2072a
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L50
            H4.y$e r1 = r8.f17444p
            int r2 = r1.f2073b
            if (r9 != r2) goto L50
            int r2 = r1.f2074c
            if (r10 != r2) goto L50
            int r2 = r1.f2075d
            if (r11 != r2) goto L50
            int r1 = r1.f2076e
            if (r7 != r1) goto L50
            goto La7
        L50:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "send EditingState to flutter: "
            r1.append(r2)
            io.flutter.plugin.editing.n r2 = r8.f17437i
            java.lang.String r2 = r2.toString()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "TextInputPlugin"
            p370w4.AbstractC6917b.m28358f(r2, r1)
            H4.y$b r1 = r8.f17435g
            boolean r1 = r1.f2051e
            if (r1 == 0) goto L81
            H4.y r1 = r8.f17433e
            io.flutter.plugin.editing.J$c r2 = r8.f17434f
            int r2 = r2.f17452b
            r1.m2364q(r2, r0)
            io.flutter.plugin.editing.n r0 = r8.f17437i
            r0.m20384c()
            goto L94
        L81:
            H4.y r0 = r8.f17433e
            io.flutter.plugin.editing.J$c r1 = r8.f17434f
            int r1 = r1.f17452b
            io.flutter.plugin.editing.n r2 = r8.f17437i
            java.lang.String r2 = r2.toString()
            r3 = r9
            r4 = r10
            r5 = r11
            r6 = r7
            r0.m2363p(r1, r2, r3, r4, r5, r6)
        L94:
            H4.y$e r6 = new H4.y$e
            io.flutter.plugin.editing.n r0 = r8.f17437i
            java.lang.String r1 = r0.toString()
            r0 = r6
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r7
            r0.<init>(r1, r2, r3, r4, r5)
            r8.f17444p = r6
            goto Lac
        La7:
            io.flutter.plugin.editing.n r9 = r8.f17437i
            r9.m20384c()
        Lac:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.flutter.plugin.editing.C4699J.mo20336a(boolean, boolean, boolean):void");
    }

    /* renamed from: j */
    public void m20337j(SparseArray sparseArray) {
        C0589y.b bVar;
        C0589y.b.a aVar;
        C0589y.b.a aVar2;
        CharSequence textValue;
        if (Build.VERSION.SDK_INT < 26 || (bVar = this.f17435g) == null || this.f17436h == null || (aVar = bVar.f2056j) == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        for (int i7 = 0; i7 < sparseArray.size(); i7++) {
            C0589y.b bVar2 = (C0589y.b) this.f17436h.get(sparseArray.keyAt(i7));
            if (bVar2 != null && (aVar2 = bVar2.f2056j) != null) {
                textValue = AbstractC4694G.m20316a(sparseArray.valueAt(i7)).getTextValue();
                String charSequence = textValue.toString();
                C0589y.e eVar = new C0589y.e(charSequence, charSequence.length(), charSequence.length(), -1, -1);
                if (aVar2.f2059a.equals(aVar.f2059a)) {
                    this.f17437i.m20395n(eVar);
                } else {
                    hashMap.put(aVar2.f2059a, eVar);
                }
            }
        }
        this.f17433e.m2365r(this.f17434f.f17452b, hashMap);
    }

    /* renamed from: k */
    public void m20338k(int i7) {
        c cVar = this.f17434f;
        c.a aVar = cVar.f17451a;
        if ((aVar == c.a.VIRTUAL_DISPLAY_PLATFORM_VIEW || aVar == c.a.PHYSICAL_DISPLAY_PLATFORM_VIEW) && cVar.f17452b == i7) {
            this.f17434f = new c(c.a.NO_TARGET, 0);
            m20349x();
            this.f17430b.hideSoftInputFromWindow(this.f17429a.getApplicationWindowToken(), 0);
            this.f17430b.restartInput(this.f17429a);
            this.f17438j = false;
        }
    }

    /* renamed from: l */
    public void m20339l() {
        if (this.f17434f.f17451a == c.a.VIRTUAL_DISPLAY_PLATFORM_VIEW) {
            return;
        }
        this.f17437i.m20393l(this);
        m20349x();
        this.f17435g = null;
        m20335G(null);
        this.f17434f = new c(c.a.NO_TARGET, 0);
        m20334F();
        this.f17442n = null;
    }

    /* renamed from: n */
    public InputConnection m20340n(View view, C6969M c6969m, EditorInfo editorInfo) {
        c cVar = this.f17434f;
        c.a aVar = cVar.f17451a;
        if (aVar == c.a.NO_TARGET) {
            this.f17439k = null;
            return null;
        }
        if (aVar == c.a.PHYSICAL_DISPLAY_PLATFORM_VIEW) {
            return null;
        }
        if (aVar == c.a.VIRTUAL_DISPLAY_PLATFORM_VIEW) {
            if (this.f17445q) {
                return this.f17439k;
            }
            InputConnection onCreateInputConnection = this.f17440l.mo20445b(cVar.f17452b).onCreateInputConnection(editorInfo);
            this.f17439k = onCreateInputConnection;
            return onCreateInputConnection;
        }
        C0589y.b bVar = this.f17435g;
        int m20328s = m20328s(bVar.f2053g, bVar.f2047a, bVar.f2048b, bVar.f2049c, bVar.f2050d, bVar.f2052f);
        editorInfo.inputType = m20328s;
        editorInfo.imeOptions = 33554432;
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 26 && !this.f17435g.f2050d) {
            editorInfo.imeOptions = 33554432 | 16777216;
        }
        Integer num = this.f17435g.f2054h;
        int intValue = num == null ? (m20328s & 131072) != 0 ? 1 : 6 : num.intValue();
        C0589y.b bVar2 = this.f17435g;
        String str = bVar2.f2055i;
        if (str != null) {
            editorInfo.actionLabel = str;
            editorInfo.actionId = intValue;
        }
        editorInfo.imeOptions = intValue | editorInfo.imeOptions;
        String[] strArr = bVar2.f2057k;
        if (strArr != null) {
            AbstractC0670b.m2679a(editorInfo, strArr);
        }
        if (i7 >= 34) {
            AbstractC0670b.m2680b(editorInfo, true);
        }
        C4712m c4712m = new C4712m(view, this.f17434f.f17452b, this.f17433e, this.f17432d, c6969m, this.f17437i, editorInfo);
        editorInfo.initialSelStart = this.f17437i.m20390i();
        editorInfo.initialSelEnd = this.f17437i.m20389h();
        this.f17439k = c4712m;
        return c4712m;
    }

    /* renamed from: o */
    public void m20341o() {
        this.f17440l.m20604Q();
        this.f17441m.m20459u();
        this.f17433e.m2361n(null);
        m20349x();
        this.f17437i.m20393l(this);
        ImeSyncDeferringInsetsCallback imeSyncDeferringInsetsCallback = this.f17443o;
        if (imeSyncDeferringInsetsCallback != null) {
            imeSyncDeferringInsetsCallback.remove();
        }
    }

    /* renamed from: p */
    public InputMethodManager m20342p() {
        return this.f17430b;
    }

    /* renamed from: q */
    public boolean m20343q(KeyEvent keyEvent) {
        InputConnection inputConnection;
        if (!m20342p().isAcceptingText() || (inputConnection = this.f17439k) == null) {
            return false;
        }
        return inputConnection instanceof C4712m ? ((C4712m) inputConnection).m20378f(keyEvent) : inputConnection.sendKeyEvent(keyEvent);
    }

    /* renamed from: r */
    public final void m20344r(View view) {
        m20349x();
        this.f17430b.hideSoftInputFromWindow(view.getApplicationWindowToken(), 0);
    }

    /* renamed from: t */
    public void m20345t() {
        if (this.f17434f.f17451a == c.a.VIRTUAL_DISPLAY_PLATFORM_VIEW) {
            this.f17445q = true;
        }
    }

    /* renamed from: u */
    public final boolean m20346u() {
        return this.f17436h != null;
    }

    /* renamed from: v */
    public final void m20347v(String str) {
        AutofillValue forText;
        if (Build.VERSION.SDK_INT < 26 || this.f17431c == null || !m20346u()) {
            return;
        }
        String str2 = this.f17435g.f2056j.f2059a;
        AutofillManager autofillManager = this.f17431c;
        View view = this.f17429a;
        int hashCode = str2.hashCode();
        forText = AutofillValue.forText(str);
        autofillManager.notifyValueChanged(view, hashCode, forText);
    }

    /* renamed from: w */
    public final void m20348w() {
        if (Build.VERSION.SDK_INT < 26 || this.f17431c == null || !m20346u()) {
            return;
        }
        String str = this.f17435g.f2056j.f2059a;
        int[] iArr = new int[2];
        this.f17429a.getLocationOnScreen(iArr);
        Rect rect = new Rect(this.f17442n);
        rect.offset(iArr[0], iArr[1]);
        this.f17431c.notifyViewEntered(this.f17429a, str.hashCode(), rect);
    }

    /* renamed from: x */
    public final void m20349x() {
        C0589y.b bVar;
        if (Build.VERSION.SDK_INT < 26 || this.f17431c == null || (bVar = this.f17435g) == null || bVar.f2056j == null || !m20346u()) {
            return;
        }
        this.f17431c.notifyViewExited(this.f17429a, this.f17435g.f2056j.f2059a.hashCode());
    }

    /* renamed from: y */
    public void m20350y(ViewStructure viewStructure, int i7) {
        AutofillId autofillId;
        AutofillValue forText;
        Rect rect;
        AutofillValue forText2;
        if (Build.VERSION.SDK_INT < 26 || !m20346u()) {
            return;
        }
        String str = this.f17435g.f2056j.f2059a;
        autofillId = viewStructure.getAutofillId();
        for (int i8 = 0; i8 < this.f17436h.size(); i8++) {
            int keyAt = this.f17436h.keyAt(i8);
            C0589y.b.a aVar = ((C0589y.b) this.f17436h.valueAt(i8)).f2056j;
            if (aVar != null) {
                viewStructure.addChildCount(1);
                ViewStructure newChild = viewStructure.newChild(i8);
                newChild.setAutofillId(autofillId, keyAt);
                String[] strArr = aVar.f2060b;
                if (strArr.length > 0) {
                    newChild.setAutofillHints(strArr);
                }
                newChild.setAutofillType(1);
                newChild.setVisibility(0);
                String str2 = aVar.f2062d;
                if (str2 != null) {
                    newChild.setHint(str2);
                }
                if (str.hashCode() != keyAt || (rect = this.f17442n) == null) {
                    newChild.setDimens(0, 0, 0, 0, 1, 1);
                    forText = AutofillValue.forText(aVar.f2061c.f2072a);
                    newChild.setAutofillValue(forText);
                } else {
                    newChild.setDimens(rect.left, rect.top, 0, 0, rect.width(), this.f17442n.height());
                    forText2 = AutofillValue.forText(this.f17437i);
                    newChild.setAutofillValue(forText2);
                }
            }
        }
    }

    /* renamed from: z */
    public final void m20351z(double d7, double d8, double[] dArr) {
        double[] dArr2 = new double[4];
        boolean z6 = dArr[3] == 0.0d && dArr[7] == 0.0d && dArr[15] == 1.0d;
        double d9 = dArr[12];
        double d10 = dArr[15];
        double d11 = d9 / d10;
        dArr2[1] = d11;
        dArr2[0] = d11;
        double d12 = dArr[13] / d10;
        dArr2[3] = d12;
        dArr2[2] = d12;
        b bVar = new b(z6, dArr, dArr2);
        bVar.mo20352a(d7, 0.0d);
        bVar.mo20352a(d7, d8);
        bVar.mo20352a(0.0d, d8);
        double d13 = this.f17429a.getContext().getResources().getDisplayMetrics().density;
        this.f17442n = new Rect((int) (dArr2[0] * d13), (int) (dArr2[2] * d13), (int) Math.ceil(dArr2[1] * d13), (int) Math.ceil(dArr2[3] * d13));
    }
}
