package io.flutter.plugin.platform;

import android.app.AlertDialog;
import android.app.Presentation;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.MutableContextWrapper;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import android.view.inputmethod.InputMethodManager;
import android.widget.FrameLayout;
import androidx.annotation.Keep;
import p370w4.AbstractC6917b;

@Keep
/* loaded from: classes.dex */
class SingleViewPresentation extends Presentation {
    private static final String TAG = "PlatformViewsController";
    private final C4755a accessibilityEventsDelegate;
    private FrameLayout container;
    private final View.OnFocusChangeListener focusChangeListener;
    private final Context outerContext;
    private C4744a rootView;
    private boolean startFocused;
    private final C4747d state;
    private int viewId;

    /* renamed from: io.flutter.plugin.platform.SingleViewPresentation$a */
    public static class C4744a extends FrameLayout {

        /* renamed from: a */
        public final C4755a f17522a;

        /* renamed from: b */
        public final View f17523b;

        public C4744a(Context context, C4755a c4755a, View view) {
            super(context);
            this.f17522a = c4755a;
            this.f17523b = view;
        }

        @Override // android.view.ViewGroup, android.view.ViewParent
        public boolean requestSendAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            return this.f17522a.m20481b(this.f17523b, view, accessibilityEvent);
        }
    }

    /* renamed from: io.flutter.plugin.platform.SingleViewPresentation$b */
    public static class C4745b extends ContextWrapper {

        /* renamed from: a */
        public final InputMethodManager f17524a;

        public C4745b(Context context) {
            this(context, null);
        }

        @Override // android.content.ContextWrapper, android.content.Context
        public Context createDisplayContext(Display display) {
            return new C4745b(super.createDisplayContext(display), this.f17524a);
        }

        @Override // android.content.ContextWrapper, android.content.Context
        public Object getSystemService(String str) {
            return "input_method".equals(str) ? this.f17524a : super.getSystemService(str);
        }

        public C4745b(Context context, InputMethodManager inputMethodManager) {
            super(context);
            this.f17524a = inputMethodManager == null ? (InputMethodManager) context.getSystemService("input_method") : inputMethodManager;
        }
    }

    /* renamed from: io.flutter.plugin.platform.SingleViewPresentation$c */
    public static class C4746c extends ContextWrapper {

        /* renamed from: a */
        public final C4762d0 f17525a;

        /* renamed from: b */
        public WindowManager f17526b;

        /* renamed from: c */
        public final Context f17527c;

        public C4746c(Context context, C4762d0 c4762d0, Context context2) {
            super(context);
            this.f17525a = c4762d0;
            this.f17527c = context2;
        }

        /* renamed from: a */
        public final WindowManager m20465a() {
            if (this.f17526b == null) {
                this.f17526b = this.f17525a;
            }
            return this.f17526b;
        }

        /* renamed from: b */
        public final boolean m20466b() {
            StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
            for (int i7 = 0; i7 < stackTrace.length && i7 < 11; i7++) {
                if (stackTrace[i7].getClassName().equals(AlertDialog.class.getCanonicalName()) && stackTrace[i7].getMethodName().equals("<init>")) {
                    return true;
                }
            }
            return false;
        }

        @Override // android.content.ContextWrapper, android.content.Context
        public Object getSystemService(String str) {
            return "window".equals(str) ? m20466b() ? this.f17527c.getSystemService(str) : m20465a() : super.getSystemService(str);
        }
    }

    /* renamed from: io.flutter.plugin.platform.SingleViewPresentation$d */
    public static class C4747d {

        /* renamed from: a */
        public InterfaceC4770l f17528a;

        /* renamed from: b */
        public C4762d0 f17529b;

        /* renamed from: c */
        public C4748T f17530c;
    }

    public SingleViewPresentation(Context context, Display display, InterfaceC4770l interfaceC4770l, C4755a c4755a, int i7, View.OnFocusChangeListener onFocusChangeListener) {
        super(new C4745b(context), display);
        this.startFocused = false;
        this.accessibilityEventsDelegate = c4755a;
        this.viewId = i7;
        this.focusChangeListener = onFocusChangeListener;
        this.outerContext = context;
        C4747d c4747d = new C4747d();
        this.state = c4747d;
        c4747d.f17528a = interfaceC4770l;
        getWindow().setFlags(8, 8);
        getWindow().setType(2030);
    }

    public C4747d detachState() {
        FrameLayout frameLayout = this.container;
        if (frameLayout != null) {
            frameLayout.removeAllViews();
        }
        C4744a c4744a = this.rootView;
        if (c4744a != null) {
            c4744a.removeAllViews();
        }
        return this.state;
    }

    public InterfaceC4770l getView() {
        return this.state.f17528a;
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().setBackgroundDrawable(new ColorDrawable(0));
        if (this.state.f17530c == null) {
            this.state.f17530c = new C4748T(getContext());
        }
        if (this.state.f17529b == null) {
            WindowManager windowManager = (WindowManager) getContext().getSystemService("window");
            C4747d c4747d = this.state;
            c4747d.f17529b = new C4762d0(windowManager, c4747d.f17530c);
        }
        this.container = new FrameLayout(getContext());
        C4746c c4746c = new C4746c(getContext(), this.state.f17529b, this.outerContext);
        View mo14452e = this.state.f17528a.mo14452e();
        if (mo14452e.getContext() instanceof MutableContextWrapper) {
            ((MutableContextWrapper) mo14452e.getContext()).setBaseContext(c4746c);
        } else {
            AbstractC6917b.m28359g(TAG, "Unexpected platform view context for view ID " + this.viewId + "; some functionality may not work correctly. When constructing a platform view in the factory, ensure that the view returned from PlatformViewFactory#create returns the provided context from getContext(). If you are unable to associate the view with that context, consider using Hybrid Composition instead.");
        }
        this.container.addView(mo14452e);
        C4744a c4744a = new C4744a(getContext(), this.accessibilityEventsDelegate, mo14452e);
        this.rootView = c4744a;
        c4744a.addView(this.container);
        this.rootView.addView(this.state.f17530c);
        mo14452e.setOnFocusChangeListener(this.focusChangeListener);
        this.rootView.setFocusableInTouchMode(true);
        if (this.startFocused) {
            mo14452e.requestFocus();
        } else {
            this.rootView.requestFocus();
        }
        setContentView(this.rootView);
    }

    public SingleViewPresentation(Context context, Display display, C4755a c4755a, C4747d c4747d, View.OnFocusChangeListener onFocusChangeListener, boolean z6) {
        super(new C4745b(context), display);
        this.startFocused = false;
        this.accessibilityEventsDelegate = c4755a;
        this.state = c4747d;
        this.focusChangeListener = onFocusChangeListener;
        this.outerContext = context;
        getWindow().setFlags(8, 8);
        this.startFocused = z6;
    }
}
