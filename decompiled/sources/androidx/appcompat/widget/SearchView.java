package androidx.appcompat.widget;

import android.app.PendingIntent;
import android.app.SearchableInfo;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import android.widget.TextView;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import org.apache.tika.utils.StringUtils;
import p049H.AbstractC0475B;
import p091N.AbstractC1239a;
import p098O.AbstractC1290a;
import p223f.AbstractC4216a;
import p223f.AbstractC4218c;
import p223f.AbstractC4220e;
import p223f.AbstractC4221f;
import p223f.AbstractC4222g;
import p223f.AbstractC4224i;
import p275l.InterfaceC5485b;
import p291n.AbstractC5629c;
import p291n.AbstractC5636f0;
import p291n.AbstractC5644j0;
import p291n.C5632d0;
import p291n.ViewOnClickListenerC5623Y;

/* loaded from: classes.dex */
public class SearchView extends AbstractC3236b implements InterfaceC5485b {

    /* renamed from: u0 */
    public static final C3220k f10067u0 = new C3220k();

    /* renamed from: A */
    public final ImageView f10068A;

    /* renamed from: B */
    public final ImageView f10069B;

    /* renamed from: C */
    public final ImageView f10070C;

    /* renamed from: D */
    public final ImageView f10071D;

    /* renamed from: E */
    public final View f10072E;

    /* renamed from: F */
    public C3225p f10073F;

    /* renamed from: G */
    public Rect f10074G;

    /* renamed from: H */
    public Rect f10075H;

    /* renamed from: I */
    public int[] f10076I;

    /* renamed from: J */
    public int[] f10077J;

    /* renamed from: K */
    public final ImageView f10078K;

    /* renamed from: L */
    public final Drawable f10079L;

    /* renamed from: M */
    public final int f10080M;

    /* renamed from: N */
    public final int f10081N;

    /* renamed from: O */
    public final Intent f10082O;

    /* renamed from: P */
    public final Intent f10083P;

    /* renamed from: Q */
    public final CharSequence f10084Q;

    /* renamed from: R */
    public View.OnFocusChangeListener f10085R;

    /* renamed from: S */
    public View.OnClickListener f10086S;

    /* renamed from: T */
    public boolean f10087T;

    /* renamed from: U */
    public boolean f10088U;

    /* renamed from: V */
    public AbstractC1239a f10089V;

    /* renamed from: W */
    public boolean f10090W;

    /* renamed from: a0 */
    public CharSequence f10091a0;

    /* renamed from: b0 */
    public boolean f10092b0;

    /* renamed from: c0 */
    public boolean f10093c0;

    /* renamed from: d0 */
    public int f10094d0;

    /* renamed from: e0 */
    public boolean f10095e0;

    /* renamed from: f0 */
    public CharSequence f10096f0;

    /* renamed from: g0 */
    public CharSequence f10097g0;

    /* renamed from: h0 */
    public boolean f10098h0;

    /* renamed from: i0 */
    public int f10099i0;

    /* renamed from: j0 */
    public SearchableInfo f10100j0;

    /* renamed from: k0 */
    public Bundle f10101k0;

    /* renamed from: l0 */
    public final Runnable f10102l0;

    /* renamed from: m0 */
    public Runnable f10103m0;

    /* renamed from: n0 */
    public final WeakHashMap f10104n0;

    /* renamed from: o0 */
    public final View.OnClickListener f10105o0;

    /* renamed from: p0 */
    public View.OnKeyListener f10106p0;

    /* renamed from: q0 */
    public final TextView.OnEditorActionListener f10107q0;

    /* renamed from: r0 */
    public final AdapterView.OnItemClickListener f10108r0;

    /* renamed from: s0 */
    public final AdapterView.OnItemSelectedListener f10109s0;

    /* renamed from: t0 */
    public TextWatcher f10110t0;

    /* renamed from: w */
    public final SearchAutoComplete f10111w;

    /* renamed from: x */
    public final View f10112x;

    /* renamed from: y */
    public final View f10113y;

    /* renamed from: z */
    public final View f10114z;

    public static class SearchAutoComplete extends AbstractC5629c {

        /* renamed from: d */
        public int f10115d;

        /* renamed from: e */
        public SearchView f10116e;

        /* renamed from: f */
        public boolean f10117f;

        /* renamed from: n */
        public final Runnable f10118n;

        /* renamed from: androidx.appcompat.widget.SearchView$SearchAutoComplete$a */
        public class RunnableC3209a implements Runnable {
            public RunnableC3209a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                SearchAutoComplete.this.m11830b();
            }
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
            this(context, attributeSet, AbstractC4216a.f14081g);
        }

        private int getSearchViewTextMinWidthDp() {
            Configuration configuration = getResources().getConfiguration();
            int i7 = configuration.screenWidthDp;
            int i8 = configuration.screenHeightDp;
            if (i7 >= 960 && i8 >= 720 && configuration.orientation == 2) {
                return 256;
            }
            if (i7 < 600) {
                return (i7 < 640 || i8 < 480) ? 160 : 192;
            }
            return 192;
        }

        /* renamed from: a */
        public boolean m11829a() {
            return TextUtils.getTrimmedLength(getText()) == 0;
        }

        /* renamed from: b */
        public void m11830b() {
            if (this.f10117f) {
                ((InputMethodManager) getContext().getSystemService("input_method")).showSoftInput(this, 0);
                this.f10117f = false;
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public boolean enoughToFilter() {
            return this.f10115d <= 0 || super.enoughToFilter();
        }

        @Override // p291n.AbstractC5629c, android.widget.TextView, android.view.View
        public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (this.f10117f) {
                removeCallbacks(this.f10118n);
                post(this.f10118n);
            }
            return onCreateInputConnection;
        }

        @Override // android.view.View
        public void onFinishInflate() {
            super.onFinishInflate();
            setMinWidth((int) TypedValue.applyDimension(1, getSearchViewTextMinWidthDp(), getResources().getDisplayMetrics()));
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public void onFocusChanged(boolean z6, int i7, Rect rect) {
            super.onFocusChanged(z6, i7, rect);
            this.f10116e.m11812W();
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public boolean onKeyPreIme(int i7, KeyEvent keyEvent) {
            if (i7 == 4) {
                if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                    KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
                    if (keyDispatcherState != null) {
                        keyDispatcherState.startTracking(keyEvent, this);
                    }
                    return true;
                }
                if (keyEvent.getAction() == 1) {
                    KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                    if (keyDispatcherState2 != null) {
                        keyDispatcherState2.handleUpEvent(keyEvent);
                    }
                    if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                        this.f10116e.clearFocus();
                        setImeVisibility(false);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(i7, keyEvent);
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public void onWindowFocusChanged(boolean z6) {
            super.onWindowFocusChanged(z6);
            if (z6 && this.f10116e.hasFocus() && getVisibility() == 0) {
                this.f10117f = true;
                if (SearchView.m11790J(getContext())) {
                    SearchView.f10067u0.m11833c(this, true);
                }
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public void performCompletion() {
        }

        @Override // android.widget.AutoCompleteTextView
        public void replaceText(CharSequence charSequence) {
        }

        public void setImeVisibility(boolean z6) {
            InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
            if (!z6) {
                this.f10117f = false;
                removeCallbacks(this.f10118n);
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            } else {
                if (!inputMethodManager.isActive(this)) {
                    this.f10117f = true;
                    return;
                }
                this.f10117f = false;
                removeCallbacks(this.f10118n);
                inputMethodManager.showSoftInput(this, 0);
            }
        }

        public void setSearchView(SearchView searchView) {
            this.f10116e = searchView;
        }

        @Override // android.widget.AutoCompleteTextView
        public void setThreshold(int i7) {
            super.setThreshold(i7);
            this.f10115d = i7;
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet, int i7) {
            super(context, attributeSet, i7);
            this.f10118n = new RunnableC3209a();
            this.f10115d = getThreshold();
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$a */
    public class C3210a implements TextWatcher {
        public C3210a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i7, int i8, int i9) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i7, int i8, int i9) {
            SearchView.this.m11811V(charSequence);
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$b */
    public class RunnableC3211b implements Runnable {
        public RunnableC3211b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            SearchView.this.m11820c0();
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$c */
    public class RunnableC3212c implements Runnable {
        public RunnableC3212c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractC1239a abstractC1239a = SearchView.this.f10089V;
            if (abstractC1239a instanceof ViewOnClickListenerC5623Y) {
                abstractC1239a.mo4746a(null);
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$d */
    public class ViewOnFocusChangeListenerC3213d implements View.OnFocusChangeListener {
        public ViewOnFocusChangeListenerC3213d() {
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z6) {
            SearchView searchView = SearchView.this;
            View.OnFocusChangeListener onFocusChangeListener = searchView.f10085R;
            if (onFocusChangeListener != null) {
                onFocusChangeListener.onFocusChange(searchView, z6);
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$e */
    public class ViewOnLayoutChangeListenerC3214e implements View.OnLayoutChangeListener {
        public ViewOnLayoutChangeListenerC3214e() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14) {
            SearchView.this.m11827y();
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$f */
    public class ViewOnClickListenerC3215f implements View.OnClickListener {
        public ViewOnClickListenerC3215f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            SearchView searchView = SearchView.this;
            if (view == searchView.f10068A) {
                searchView.m11808S();
                return;
            }
            if (view == searchView.f10070C) {
                searchView.m11804O();
                return;
            }
            if (view == searchView.f10069B) {
                searchView.m11809T();
            } else if (view == searchView.f10071D) {
                searchView.m11813X();
            } else if (view == searchView.f10111w) {
                searchView.m11795E();
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$g */
    public class ViewOnKeyListenerC3216g implements View.OnKeyListener {
        public ViewOnKeyListenerC3216g() {
        }

        @Override // android.view.View.OnKeyListener
        public boolean onKey(View view, int i7, KeyEvent keyEvent) {
            SearchView searchView = SearchView.this;
            if (searchView.f10100j0 == null) {
                return false;
            }
            if (searchView.f10111w.isPopupShowing() && SearchView.this.f10111w.getListSelection() != -1) {
                return SearchView.this.m11810U(view, i7, keyEvent);
            }
            if (SearchView.this.f10111w.m11829a() || !keyEvent.hasNoModifiers() || keyEvent.getAction() != 1 || i7 != 66) {
                return false;
            }
            view.cancelLongPress();
            SearchView searchView2 = SearchView.this;
            searchView2.m11802M(0, null, searchView2.f10111w.getText().toString());
            return true;
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$h */
    public class C3217h implements TextView.OnEditorActionListener {
        public C3217h() {
        }

        @Override // android.widget.TextView.OnEditorActionListener
        public boolean onEditorAction(TextView textView, int i7, KeyEvent keyEvent) {
            SearchView.this.m11809T();
            return true;
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$i */
    public class C3218i implements AdapterView.OnItemClickListener {
        public C3218i() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView adapterView, View view, int i7, long j7) {
            SearchView.this.m11805P(i7, 0, null);
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$j */
    public class C3219j implements AdapterView.OnItemSelectedListener {
        public C3219j() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView adapterView, View view, int i7, long j7) {
            SearchView.this.m11806Q(i7);
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView adapterView) {
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$k */
    public static class C3220k {

        /* renamed from: a */
        public Method f10130a;

        /* renamed from: b */
        public Method f10131b;

        /* renamed from: c */
        public Method f10132c;

        public C3220k() {
            try {
                Method declaredMethod = AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", null);
                this.f10130a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            try {
                Method declaredMethod2 = AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", null);
                this.f10131b = declaredMethod2;
                declaredMethod2.setAccessible(true);
            } catch (NoSuchMethodException unused2) {
            }
            try {
                Method method = AutoCompleteTextView.class.getMethod("ensureImeVisible", Boolean.TYPE);
                this.f10132c = method;
                method.setAccessible(true);
            } catch (NoSuchMethodException unused3) {
            }
        }

        /* renamed from: a */
        public void m11831a(AutoCompleteTextView autoCompleteTextView) {
            Method method = this.f10131b;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, null);
                } catch (Exception unused) {
                }
            }
        }

        /* renamed from: b */
        public void m11832b(AutoCompleteTextView autoCompleteTextView) {
            Method method = this.f10130a;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, null);
                } catch (Exception unused) {
                }
            }
        }

        /* renamed from: c */
        public void m11833c(AutoCompleteTextView autoCompleteTextView, boolean z6) {
            Method method = this.f10132c;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, Boolean.valueOf(z6));
                } catch (Exception unused) {
                }
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$l */
    public interface InterfaceC3221l {
    }

    /* renamed from: androidx.appcompat.widget.SearchView$m */
    public interface InterfaceC3222m {
    }

    /* renamed from: androidx.appcompat.widget.SearchView$n */
    public interface InterfaceC3223n {
    }

    /* renamed from: androidx.appcompat.widget.SearchView$o */
    public static class C3224o extends AbstractC1290a {
        public static final Parcelable.Creator<C3224o> CREATOR = new a();

        /* renamed from: c */
        public boolean f10133c;

        /* renamed from: androidx.appcompat.widget.SearchView$o$a */
        public static class a implements Parcelable.ClassLoaderCreator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public C3224o createFromParcel(Parcel parcel) {
                return new C3224o(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public C3224o createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new C3224o(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public C3224o[] newArray(int i7) {
                return new C3224o[i7];
            }
        }

        public C3224o(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "SearchView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " isIconified=" + this.f10133c + "}";
        }

        @Override // p098O.AbstractC1290a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i7) {
            super.writeToParcel(parcel, i7);
            parcel.writeValue(Boolean.valueOf(this.f10133c));
        }

        public C3224o(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f10133c = ((Boolean) parcel.readValue(null)).booleanValue();
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$p */
    public static class C3225p extends TouchDelegate {

        /* renamed from: a */
        public final View f10134a;

        /* renamed from: b */
        public final Rect f10135b;

        /* renamed from: c */
        public final Rect f10136c;

        /* renamed from: d */
        public final Rect f10137d;

        /* renamed from: e */
        public final int f10138e;

        /* renamed from: f */
        public boolean f10139f;

        public C3225p(Rect rect, Rect rect2, View view) {
            super(rect, view);
            this.f10138e = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
            this.f10135b = new Rect();
            this.f10137d = new Rect();
            this.f10136c = new Rect();
            m11837a(rect, rect2);
            this.f10134a = view;
        }

        /* renamed from: a */
        public void m11837a(Rect rect, Rect rect2) {
            this.f10135b.set(rect);
            this.f10137d.set(rect);
            Rect rect3 = this.f10137d;
            int i7 = this.f10138e;
            rect3.inset(-i7, -i7);
            this.f10136c.set(rect2);
        }

        @Override // android.view.TouchDelegate
        public boolean onTouchEvent(MotionEvent motionEvent) {
            boolean z6;
            boolean z7;
            int x6 = (int) motionEvent.getX();
            int y6 = (int) motionEvent.getY();
            int action = motionEvent.getAction();
            boolean z8 = true;
            if (action != 0) {
                if (action == 1 || action == 2) {
                    z7 = this.f10139f;
                    if (z7 && !this.f10137d.contains(x6, y6)) {
                        z8 = z7;
                        z6 = false;
                    }
                } else {
                    if (action == 3) {
                        z7 = this.f10139f;
                        this.f10139f = false;
                    }
                    z6 = true;
                    z8 = false;
                }
                z8 = z7;
                z6 = true;
            } else {
                if (this.f10135b.contains(x6, y6)) {
                    this.f10139f = true;
                    z6 = true;
                }
                z6 = true;
                z8 = false;
            }
            if (!z8) {
                return false;
            }
            if (!z6 || this.f10136c.contains(x6, y6)) {
                Rect rect = this.f10136c;
                motionEvent.setLocation(x6 - rect.left, y6 - rect.top);
            } else {
                motionEvent.setLocation(this.f10134a.getWidth() / 2, this.f10134a.getHeight() / 2);
            }
            return this.f10134a.dispatchTouchEvent(motionEvent);
        }
    }

    public SearchView(Context context) {
        this(context, null);
    }

    /* renamed from: J */
    public static boolean m11790J(Context context) {
        return context.getResources().getConfiguration().orientation == 2;
    }

    private int getPreferredHeight() {
        return getContext().getResources().getDimensionPixelSize(AbstractC4218c.f14105e);
    }

    private int getPreferredWidth() {
        return getContext().getResources().getDimensionPixelSize(AbstractC4218c.f14106f);
    }

    private void setQuery(CharSequence charSequence) {
        this.f10111w.setText(charSequence);
        this.f10111w.setSelection(TextUtils.isEmpty(charSequence) ? 0 : charSequence.length());
    }

    /* renamed from: A */
    public final Intent m11791A(Cursor cursor, int i7, String str) {
        int i8;
        String m23595o;
        try {
            String m23595o2 = ViewOnClickListenerC5623Y.m23595o(cursor, "suggest_intent_action");
            if (m23595o2 == null) {
                m23595o2 = this.f10100j0.getSuggestIntentAction();
            }
            if (m23595o2 == null) {
                m23595o2 = "android.intent.action.SEARCH";
            }
            String str2 = m23595o2;
            String m23595o3 = ViewOnClickListenerC5623Y.m23595o(cursor, "suggest_intent_data");
            if (m23595o3 == null) {
                m23595o3 = this.f10100j0.getSuggestIntentData();
            }
            if (m23595o3 != null && (m23595o = ViewOnClickListenerC5623Y.m23595o(cursor, "suggest_intent_data_id")) != null) {
                m23595o3 = m23595o3 + "/" + Uri.encode(m23595o);
            }
            return m11828z(str2, m23595o3 == null ? null : Uri.parse(m23595o3), ViewOnClickListenerC5623Y.m23595o(cursor, "suggest_intent_extra_data"), ViewOnClickListenerC5623Y.m23595o(cursor, "suggest_intent_query"), i7, str);
        } catch (RuntimeException e7) {
            try {
                i8 = cursor.getPosition();
            } catch (RuntimeException unused) {
                i8 = -1;
            }
            Log.w("SearchView", "Search suggestions cursor at row " + i8 + " returned exception.", e7);
            return null;
        }
    }

    /* renamed from: B */
    public final Intent m11792B(Intent intent, SearchableInfo searchableInfo) {
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        Intent intent2 = new Intent("android.intent.action.SEARCH");
        intent2.setComponent(searchActivity);
        PendingIntent activity = PendingIntent.getActivity(getContext(), 0, intent2, 1073741824);
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f10101k0;
        if (bundle2 != null) {
            bundle.putParcelable("app_data", bundle2);
        }
        Intent intent3 = new Intent(intent);
        Resources resources = getResources();
        String string = searchableInfo.getVoiceLanguageModeId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageModeId()) : "free_form";
        String string2 = searchableInfo.getVoicePromptTextId() != 0 ? resources.getString(searchableInfo.getVoicePromptTextId()) : null;
        String string3 = searchableInfo.getVoiceLanguageId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageId()) : null;
        int voiceMaxResults = searchableInfo.getVoiceMaxResults() != 0 ? searchableInfo.getVoiceMaxResults() : 1;
        intent3.putExtra("android.speech.extra.LANGUAGE_MODEL", string);
        intent3.putExtra("android.speech.extra.PROMPT", string2);
        intent3.putExtra("android.speech.extra.LANGUAGE", string3);
        intent3.putExtra("android.speech.extra.MAX_RESULTS", voiceMaxResults);
        intent3.putExtra("calling_package", searchActivity != null ? searchActivity.flattenToShortString() : null);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT", activity);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE", bundle);
        return intent3;
    }

    /* renamed from: C */
    public final Intent m11793C(Intent intent, SearchableInfo searchableInfo) {
        Intent intent2 = new Intent(intent);
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        intent2.putExtra("calling_package", searchActivity == null ? null : searchActivity.flattenToShortString());
        return intent2;
    }

    /* renamed from: D */
    public final void m11794D() {
        this.f10111w.dismissDropDown();
    }

    /* renamed from: E */
    public void m11795E() {
        if (Build.VERSION.SDK_INT >= 29) {
            this.f10111w.refreshAutoCompleteResults();
            return;
        }
        C3220k c3220k = f10067u0;
        c3220k.m11832b(this.f10111w);
        c3220k.m11831a(this.f10111w);
    }

    /* renamed from: F */
    public final void m11796F(View view, Rect rect) {
        view.getLocationInWindow(this.f10076I);
        getLocationInWindow(this.f10077J);
        int[] iArr = this.f10076I;
        int i7 = iArr[1];
        int[] iArr2 = this.f10077J;
        int i8 = i7 - iArr2[1];
        int i9 = iArr[0] - iArr2[0];
        rect.set(i9, i8, view.getWidth() + i9, view.getHeight() + i8);
    }

    /* renamed from: G */
    public final CharSequence m11797G(CharSequence charSequence) {
        if (!this.f10087T || this.f10079L == null) {
            return charSequence;
        }
        int textSize = (int) (this.f10111w.getTextSize() * 1.25d);
        this.f10079L.setBounds(0, 0, textSize, textSize);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("   ");
        spannableStringBuilder.setSpan(new ImageSpan(this.f10079L), 1, 2, 33);
        spannableStringBuilder.append(charSequence);
        return spannableStringBuilder;
    }

    /* renamed from: H */
    public final boolean m11798H() {
        SearchableInfo searchableInfo = this.f10100j0;
        if (searchableInfo == null || !searchableInfo.getVoiceSearchEnabled()) {
            return false;
        }
        Intent intent = this.f10100j0.getVoiceSearchLaunchWebSearch() ? this.f10082O : this.f10100j0.getVoiceSearchLaunchRecognizer() ? this.f10083P : null;
        return (intent == null || getContext().getPackageManager().resolveActivity(intent, 65536) == null) ? false : true;
    }

    /* renamed from: I */
    public boolean m11799I() {
        return this.f10088U;
    }

    /* renamed from: K */
    public final boolean m11800K() {
        return (this.f10090W || this.f10095e0) && !m11799I();
    }

    /* renamed from: L */
    public final void m11801L(Intent intent) {
        if (intent == null) {
            return;
        }
        try {
            getContext().startActivity(intent);
        } catch (RuntimeException e7) {
            Log.e("SearchView", "Failed launch activity: " + intent, e7);
        }
    }

    /* renamed from: M */
    public void m11802M(int i7, String str, String str2) {
        getContext().startActivity(m11828z("android.intent.action.SEARCH", null, null, str2, i7, str));
    }

    /* renamed from: N */
    public final boolean m11803N(int i7, int i8, String str) {
        Cursor mo4747b = this.f10089V.mo4747b();
        if (mo4747b == null || !mo4747b.moveToPosition(i7)) {
            return false;
        }
        m11801L(m11791A(mo4747b, i8, str));
        return true;
    }

    /* renamed from: O */
    public void m11804O() {
        if (!TextUtils.isEmpty(this.f10111w.getText())) {
            this.f10111w.setText(StringUtils.EMPTY);
            this.f10111w.requestFocus();
            this.f10111w.setImeVisibility(true);
        } else if (this.f10087T) {
            clearFocus();
            m11825h0(true);
        }
    }

    /* renamed from: P */
    public boolean m11805P(int i7, int i8, String str) {
        m11803N(i7, 0, null);
        this.f10111w.setImeVisibility(false);
        m11794D();
        return true;
    }

    /* renamed from: Q */
    public boolean m11806Q(int i7) {
        m11815Z(i7);
        return true;
    }

    /* renamed from: R */
    public void m11807R(CharSequence charSequence) {
        setQuery(charSequence);
    }

    /* renamed from: S */
    public void m11808S() {
        m11825h0(false);
        this.f10111w.requestFocus();
        this.f10111w.setImeVisibility(true);
        View.OnClickListener onClickListener = this.f10086S;
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
    }

    /* renamed from: T */
    public void m11809T() {
        Editable text = this.f10111w.getText();
        if (text == null || TextUtils.getTrimmedLength(text) <= 0) {
            return;
        }
        if (this.f10100j0 != null) {
            m11802M(0, null, text.toString());
        }
        this.f10111w.setImeVisibility(false);
        m11794D();
    }

    /* renamed from: U */
    public boolean m11810U(View view, int i7, KeyEvent keyEvent) {
        if (this.f10100j0 != null && this.f10089V != null && keyEvent.getAction() == 0 && keyEvent.hasNoModifiers()) {
            if (i7 == 66 || i7 == 84 || i7 == 61) {
                return m11805P(this.f10111w.getListSelection(), 0, null);
            }
            if (i7 == 21 || i7 == 22) {
                this.f10111w.setSelection(i7 == 21 ? 0 : this.f10111w.length());
                this.f10111w.setListSelection(0);
                this.f10111w.clearListSelection();
                f10067u0.m11833c(this.f10111w, true);
                return true;
            }
            if (i7 == 19) {
                this.f10111w.getListSelection();
                return false;
            }
        }
        return false;
    }

    /* renamed from: V */
    public void m11811V(CharSequence charSequence) {
        Editable text = this.f10111w.getText();
        this.f10097g0 = text;
        boolean isEmpty = TextUtils.isEmpty(text);
        m11824g0(!isEmpty);
        m11826i0(isEmpty);
        m11818b0();
        m11823f0();
        this.f10096f0 = charSequence.toString();
    }

    /* renamed from: W */
    public void m11812W() {
        m11825h0(m11799I());
        m11814Y();
        if (this.f10111w.hasFocus()) {
            m11795E();
        }
    }

    /* renamed from: X */
    public void m11813X() {
        SearchableInfo searchableInfo = this.f10100j0;
        if (searchableInfo == null) {
            return;
        }
        try {
            if (searchableInfo.getVoiceSearchLaunchWebSearch()) {
                getContext().startActivity(m11793C(this.f10082O, searchableInfo));
            } else if (searchableInfo.getVoiceSearchLaunchRecognizer()) {
                getContext().startActivity(m11792B(this.f10083P, searchableInfo));
            }
        } catch (ActivityNotFoundException unused) {
            Log.w("SearchView", "Could not find voice search activity");
        }
    }

    /* renamed from: Y */
    public final void m11814Y() {
        post(this.f10102l0);
    }

    /* renamed from: Z */
    public final void m11815Z(int i7) {
        Editable text = this.f10111w.getText();
        Cursor mo4747b = this.f10089V.mo4747b();
        if (mo4747b == null) {
            return;
        }
        if (!mo4747b.moveToPosition(i7)) {
            setQuery(text);
            return;
        }
        CharSequence mo4748c = this.f10089V.mo4748c(mo4747b);
        if (mo4748c != null) {
            setQuery(mo4748c);
        } else {
            setQuery(text);
        }
    }

    /* renamed from: a0 */
    public void m11816a0(CharSequence charSequence, boolean z6) {
        this.f10111w.setText(charSequence);
        if (charSequence != null) {
            SearchAutoComplete searchAutoComplete = this.f10111w;
            searchAutoComplete.setSelection(searchAutoComplete.length());
            this.f10097g0 = charSequence;
        }
        if (!z6 || TextUtils.isEmpty(charSequence)) {
            return;
        }
        m11809T();
    }

    @Override // p275l.InterfaceC5485b
    /* renamed from: b */
    public void mo11817b() {
        if (this.f10098h0) {
            return;
        }
        this.f10098h0 = true;
        int imeOptions = this.f10111w.getImeOptions();
        this.f10099i0 = imeOptions;
        this.f10111w.setImeOptions(imeOptions | 33554432);
        this.f10111w.setText(StringUtils.EMPTY);
        setIconified(false);
    }

    /* renamed from: b0 */
    public final void m11818b0() {
        boolean isEmpty = TextUtils.isEmpty(this.f10111w.getText());
        this.f10070C.setVisibility(!isEmpty || (this.f10087T && !this.f10098h0) ? 0 : 8);
        Drawable drawable = this.f10070C.getDrawable();
        if (drawable != null) {
            drawable.setState(!isEmpty ? ViewGroup.ENABLED_STATE_SET : ViewGroup.EMPTY_STATE_SET);
        }
    }

    @Override // p275l.InterfaceC5485b
    /* renamed from: c */
    public void mo11819c() {
        m11816a0(StringUtils.EMPTY, false);
        clearFocus();
        m11825h0(true);
        this.f10111w.setImeOptions(this.f10099i0);
        this.f10098h0 = false;
    }

    /* renamed from: c0 */
    public void m11820c0() {
        int[] iArr = this.f10111w.hasFocus() ? ViewGroup.FOCUSED_STATE_SET : ViewGroup.EMPTY_STATE_SET;
        Drawable background = this.f10113y.getBackground();
        if (background != null) {
            background.setState(iArr);
        }
        Drawable background2 = this.f10114z.getBackground();
        if (background2 != null) {
            background2.setState(iArr);
        }
        invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void clearFocus() {
        this.f10093c0 = true;
        super.clearFocus();
        this.f10111w.clearFocus();
        this.f10111w.setImeVisibility(false);
        this.f10093c0 = false;
    }

    /* renamed from: d0 */
    public final void m11821d0() {
        CharSequence queryHint = getQueryHint();
        SearchAutoComplete searchAutoComplete = this.f10111w;
        if (queryHint == null) {
            queryHint = StringUtils.EMPTY;
        }
        searchAutoComplete.setHint(m11797G(queryHint));
    }

    /* renamed from: e0 */
    public final void m11822e0() {
        this.f10111w.setThreshold(this.f10100j0.getSuggestThreshold());
        this.f10111w.setImeOptions(this.f10100j0.getImeOptions());
        int inputType = this.f10100j0.getInputType();
        if ((inputType & 15) == 1) {
            inputType &= -65537;
            if (this.f10100j0.getSuggestAuthority() != null) {
                inputType |= 589824;
            }
        }
        this.f10111w.setInputType(inputType);
        AbstractC1239a abstractC1239a = this.f10089V;
        if (abstractC1239a != null) {
            abstractC1239a.mo4746a(null);
        }
        if (this.f10100j0.getSuggestAuthority() != null) {
            ViewOnClickListenerC5623Y viewOnClickListenerC5623Y = new ViewOnClickListenerC5623Y(getContext(), this, this.f10100j0, this.f10104n0);
            this.f10089V = viewOnClickListenerC5623Y;
            this.f10111w.setAdapter(viewOnClickListenerC5623Y);
            ((ViewOnClickListenerC5623Y) this.f10089V).m23610x(this.f10092b0 ? 2 : 1);
        }
    }

    /* renamed from: f0 */
    public final void m11823f0() {
        this.f10114z.setVisibility((m11800K() && (this.f10069B.getVisibility() == 0 || this.f10071D.getVisibility() == 0)) ? 0 : 8);
    }

    /* renamed from: g0 */
    public final void m11824g0(boolean z6) {
        this.f10069B.setVisibility((this.f10090W && m11800K() && hasFocus() && (z6 || !this.f10095e0)) ? 0 : 8);
    }

    public int getImeOptions() {
        return this.f10111w.getImeOptions();
    }

    public int getInputType() {
        return this.f10111w.getInputType();
    }

    public int getMaxWidth() {
        return this.f10094d0;
    }

    public CharSequence getQuery() {
        return this.f10111w.getText();
    }

    public CharSequence getQueryHint() {
        CharSequence charSequence = this.f10091a0;
        if (charSequence != null) {
            return charSequence;
        }
        SearchableInfo searchableInfo = this.f10100j0;
        return (searchableInfo == null || searchableInfo.getHintId() == 0) ? this.f10084Q : getContext().getText(this.f10100j0.getHintId());
    }

    public int getSuggestionCommitIconResId() {
        return this.f10081N;
    }

    public int getSuggestionRowLayout() {
        return this.f10080M;
    }

    public AbstractC1239a getSuggestionsAdapter() {
        return this.f10089V;
    }

    /* renamed from: h0 */
    public final void m11825h0(boolean z6) {
        this.f10088U = z6;
        int i7 = 8;
        int i8 = z6 ? 0 : 8;
        boolean isEmpty = TextUtils.isEmpty(this.f10111w.getText());
        this.f10068A.setVisibility(i8);
        m11824g0(!isEmpty);
        this.f10112x.setVisibility(z6 ? 8 : 0);
        if (this.f10078K.getDrawable() != null && !this.f10087T) {
            i7 = 0;
        }
        this.f10078K.setVisibility(i7);
        m11818b0();
        m11826i0(isEmpty);
        m11823f0();
    }

    /* renamed from: i0 */
    public final void m11826i0(boolean z6) {
        int i7 = 8;
        if (this.f10095e0 && !m11799I() && z6) {
            this.f10069B.setVisibility(8);
            i7 = 0;
        }
        this.f10071D.setVisibility(i7);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        removeCallbacks(this.f10102l0);
        post(this.f10103m0);
        super.onDetachedFromWindow();
    }

    @Override // androidx.appcompat.widget.AbstractC3236b, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z6, int i7, int i8, int i9, int i10) {
        super.onLayout(z6, i7, i8, i9, i10);
        if (z6) {
            m11796F(this.f10111w, this.f10074G);
            Rect rect = this.f10075H;
            Rect rect2 = this.f10074G;
            rect.set(rect2.left, 0, rect2.right, i10 - i8);
            C3225p c3225p = this.f10073F;
            if (c3225p != null) {
                c3225p.m11837a(this.f10075H, this.f10074G);
                return;
            }
            C3225p c3225p2 = new C3225p(this.f10075H, this.f10074G, this.f10111w);
            this.f10073F = c3225p2;
            setTouchDelegate(c3225p2);
        }
    }

    @Override // androidx.appcompat.widget.AbstractC3236b, android.view.View
    public void onMeasure(int i7, int i8) {
        int i9;
        if (m11799I()) {
            super.onMeasure(i7, i8);
            return;
        }
        int mode = View.MeasureSpec.getMode(i7);
        int size = View.MeasureSpec.getSize(i7);
        if (mode == Integer.MIN_VALUE) {
            int i10 = this.f10094d0;
            size = i10 > 0 ? Math.min(i10, size) : Math.min(getPreferredWidth(), size);
        } else if (mode == 0) {
            size = this.f10094d0;
            if (size <= 0) {
                size = getPreferredWidth();
            }
        } else if (mode == 1073741824 && (i9 = this.f10094d0) > 0) {
            size = Math.min(i9, size);
        }
        int mode2 = View.MeasureSpec.getMode(i8);
        int size2 = View.MeasureSpec.getSize(i8);
        if (mode2 == Integer.MIN_VALUE) {
            size2 = Math.min(getPreferredHeight(), size2);
        } else if (mode2 == 0) {
            size2 = getPreferredHeight();
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C3224o)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C3224o c3224o = (C3224o) parcelable;
        super.onRestoreInstanceState(c3224o.m4904a());
        m11825h0(c3224o.f10133c);
        requestLayout();
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        C3224o c3224o = new C3224o(super.onSaveInstanceState());
        c3224o.f10133c = m11799I();
        return c3224o;
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z6) {
        super.onWindowFocusChanged(z6);
        m11814Y();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean requestFocus(int i7, Rect rect) {
        if (this.f10093c0 || !isFocusable()) {
            return false;
        }
        if (m11799I()) {
            return super.requestFocus(i7, rect);
        }
        boolean requestFocus = this.f10111w.requestFocus(i7, rect);
        if (requestFocus) {
            m11825h0(false);
        }
        return requestFocus;
    }

    public void setAppSearchData(Bundle bundle) {
        this.f10101k0 = bundle;
    }

    public void setIconified(boolean z6) {
        if (z6) {
            m11804O();
        } else {
            m11808S();
        }
    }

    public void setIconifiedByDefault(boolean z6) {
        if (this.f10087T == z6) {
            return;
        }
        this.f10087T = z6;
        m11825h0(z6);
        m11821d0();
    }

    public void setImeOptions(int i7) {
        this.f10111w.setImeOptions(i7);
    }

    public void setInputType(int i7) {
        this.f10111w.setInputType(i7);
    }

    public void setMaxWidth(int i7) {
        this.f10094d0 = i7;
        requestLayout();
    }

    public void setOnCloseListener(InterfaceC3221l interfaceC3221l) {
    }

    public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.f10085R = onFocusChangeListener;
    }

    public void setOnQueryTextListener(InterfaceC3222m interfaceC3222m) {
    }

    public void setOnSearchClickListener(View.OnClickListener onClickListener) {
        this.f10086S = onClickListener;
    }

    public void setOnSuggestionListener(InterfaceC3223n interfaceC3223n) {
    }

    public void setQueryHint(CharSequence charSequence) {
        this.f10091a0 = charSequence;
        m11821d0();
    }

    public void setQueryRefinementEnabled(boolean z6) {
        this.f10092b0 = z6;
        AbstractC1239a abstractC1239a = this.f10089V;
        if (abstractC1239a instanceof ViewOnClickListenerC5623Y) {
            ((ViewOnClickListenerC5623Y) abstractC1239a).m23610x(z6 ? 2 : 1);
        }
    }

    public void setSearchableInfo(SearchableInfo searchableInfo) {
        this.f10100j0 = searchableInfo;
        if (searchableInfo != null) {
            m11822e0();
            m11821d0();
        }
        boolean m11798H = m11798H();
        this.f10095e0 = m11798H;
        if (m11798H) {
            this.f10111w.setPrivateImeOptions("nm");
        }
        m11825h0(m11799I());
    }

    public void setSubmitButtonEnabled(boolean z6) {
        this.f10090W = z6;
        m11825h0(m11799I());
    }

    public void setSuggestionsAdapter(AbstractC1239a abstractC1239a) {
        this.f10089V = abstractC1239a;
        this.f10111w.setAdapter(abstractC1239a);
    }

    /* renamed from: y */
    public void m11827y() {
        if (this.f10072E.getWidth() > 1) {
            Resources resources = getContext().getResources();
            int paddingLeft = this.f10113y.getPaddingLeft();
            Rect rect = new Rect();
            boolean m23700b = AbstractC5644j0.m23700b(this);
            int dimensionPixelSize = this.f10087T ? resources.getDimensionPixelSize(AbstractC4218c.f14103c) + resources.getDimensionPixelSize(AbstractC4218c.f14104d) : 0;
            this.f10111w.getDropDownBackground().getPadding(rect);
            this.f10111w.setDropDownHorizontalOffset(m23700b ? -rect.left : paddingLeft - (rect.left + dimensionPixelSize));
            this.f10111w.setDropDownWidth((((this.f10072E.getWidth() + rect.left) + rect.right) + dimensionPixelSize) - paddingLeft);
        }
    }

    /* renamed from: z */
    public final Intent m11828z(String str, Uri uri, String str2, String str3, int i7, String str4) {
        Intent intent = new Intent(str);
        intent.addFlags(268435456);
        if (uri != null) {
            intent.setData(uri);
        }
        intent.putExtra("user_query", this.f10097g0);
        if (str3 != null) {
            intent.putExtra("query", str3);
        }
        if (str2 != null) {
            intent.putExtra("intent_extra_data_key", str2);
        }
        Bundle bundle = this.f10101k0;
        if (bundle != null) {
            intent.putExtra("app_data", bundle);
        }
        if (i7 != 0) {
            intent.putExtra("action_key", i7);
            intent.putExtra("action_msg", str4);
        }
        intent.setComponent(this.f10100j0.getSearchActivity());
        return intent;
    }

    public SearchView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC4216a.f14090p);
    }

    public SearchView(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        this.f10074G = new Rect();
        this.f10075H = new Rect();
        this.f10076I = new int[2];
        this.f10077J = new int[2];
        this.f10102l0 = new RunnableC3211b();
        this.f10103m0 = new RunnableC3212c();
        this.f10104n0 = new WeakHashMap();
        ViewOnClickListenerC3215f viewOnClickListenerC3215f = new ViewOnClickListenerC3215f();
        this.f10105o0 = viewOnClickListenerC3215f;
        this.f10106p0 = new ViewOnKeyListenerC3216g();
        C3217h c3217h = new C3217h();
        this.f10107q0 = c3217h;
        C3218i c3218i = new C3218i();
        this.f10108r0 = c3218i;
        C3219j c3219j = new C3219j();
        this.f10109s0 = c3219j;
        this.f10110t0 = new C3210a();
        C5632d0 m23637r = C5632d0.m23637r(context, attributeSet, AbstractC4224i.f14221C1, i7, 0);
        LayoutInflater.from(context).inflate(m23637r.m23649l(AbstractC4224i.f14261M1, AbstractC4221f.f14196l), (ViewGroup) this, true);
        SearchAutoComplete searchAutoComplete = (SearchAutoComplete) findViewById(AbstractC4220e.f14178t);
        this.f10111w = searchAutoComplete;
        searchAutoComplete.setSearchView(this);
        this.f10112x = findViewById(AbstractC4220e.f14174p);
        View findViewById = findViewById(AbstractC4220e.f14177s);
        this.f10113y = findViewById;
        View findViewById2 = findViewById(AbstractC4220e.f14184z);
        this.f10114z = findViewById2;
        ImageView imageView = (ImageView) findViewById(AbstractC4220e.f14172n);
        this.f10068A = imageView;
        ImageView imageView2 = (ImageView) findViewById(AbstractC4220e.f14175q);
        this.f10069B = imageView2;
        ImageView imageView3 = (ImageView) findViewById(AbstractC4220e.f14173o);
        this.f10070C = imageView3;
        ImageView imageView4 = (ImageView) findViewById(AbstractC4220e.f14179u);
        this.f10071D = imageView4;
        ImageView imageView5 = (ImageView) findViewById(AbstractC4220e.f14176r);
        this.f10078K = imageView5;
        AbstractC0475B.m1731I(findViewById, m23637r.m23643f(AbstractC4224i.f14265N1));
        AbstractC0475B.m1731I(findViewById2, m23637r.m23643f(AbstractC4224i.f14281R1));
        imageView.setImageDrawable(m23637r.m23643f(AbstractC4224i.f14277Q1));
        imageView2.setImageDrawable(m23637r.m23643f(AbstractC4224i.f14253K1));
        imageView3.setImageDrawable(m23637r.m23643f(AbstractC4224i.f14241H1));
        imageView4.setImageDrawable(m23637r.m23643f(AbstractC4224i.f14289T1));
        imageView5.setImageDrawable(m23637r.m23643f(AbstractC4224i.f14277Q1));
        this.f10079L = m23637r.m23643f(AbstractC4224i.f14273P1);
        AbstractC5636f0.m23670a(imageView, getResources().getString(AbstractC4222g.f14209l));
        this.f10080M = m23637r.m23649l(AbstractC4224i.f14285S1, AbstractC4221f.f14195k);
        this.f10081N = m23637r.m23649l(AbstractC4224i.f14245I1, 0);
        imageView.setOnClickListener(viewOnClickListenerC3215f);
        imageView3.setOnClickListener(viewOnClickListenerC3215f);
        imageView2.setOnClickListener(viewOnClickListenerC3215f);
        imageView4.setOnClickListener(viewOnClickListenerC3215f);
        searchAutoComplete.setOnClickListener(viewOnClickListenerC3215f);
        searchAutoComplete.addTextChangedListener(this.f10110t0);
        searchAutoComplete.setOnEditorActionListener(c3217h);
        searchAutoComplete.setOnItemClickListener(c3218i);
        searchAutoComplete.setOnItemSelectedListener(c3219j);
        searchAutoComplete.setOnKeyListener(this.f10106p0);
        searchAutoComplete.setOnFocusChangeListener(new ViewOnFocusChangeListenerC3213d());
        setIconifiedByDefault(m23637r.m23638a(AbstractC4224i.f14257L1, true));
        int m23642e = m23637r.m23642e(AbstractC4224i.f14229E1, -1);
        if (m23642e != -1) {
            setMaxWidth(m23642e);
        }
        this.f10084Q = m23637r.m23651n(AbstractC4224i.f14249J1);
        this.f10091a0 = m23637r.m23651n(AbstractC4224i.f14269O1);
        int m23646i = m23637r.m23646i(AbstractC4224i.f14237G1, -1);
        if (m23646i != -1) {
            setImeOptions(m23646i);
        }
        int m23646i2 = m23637r.m23646i(AbstractC4224i.f14233F1, -1);
        if (m23646i2 != -1) {
            setInputType(m23646i2);
        }
        setFocusable(m23637r.m23638a(AbstractC4224i.f14225D1, true));
        m23637r.m23653s();
        Intent intent = new Intent("android.speech.action.WEB_SEARCH");
        this.f10082O = intent;
        intent.addFlags(268435456);
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        Intent intent2 = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        this.f10083P = intent2;
        intent2.addFlags(268435456);
        View findViewById3 = findViewById(searchAutoComplete.getDropDownAnchor());
        this.f10072E = findViewById3;
        if (findViewById3 != null) {
            findViewById3.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC3214e());
        }
        m11825h0(this.f10087T);
        m11821d0();
    }
}
