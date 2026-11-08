package p191b;

import android.app.Activity;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.lifecycle.AbstractC3345j;
import androidx.lifecycle.InterfaceC3347l;
import androidx.lifecycle.InterfaceC3349n;
import java.lang.reflect.Field;
import kotlin.jvm.internal.AbstractC5464g;
import kotlin.jvm.internal.AbstractC5469l;
import kotlin.jvm.internal.AbstractC5470m;
import p069J5.InterfaceC0789a;
import p371w5.AbstractC6924g;
import p371w5.InterfaceC6923f;

/* renamed from: b.v */
/* loaded from: classes.dex */
public final class C3498v implements InterfaceC3347l {

    /* renamed from: b */
    public static final c f11731b = new c(null);

    /* renamed from: c */
    public static final InterfaceC6923f f11732c = AbstractC6924g.m28367a(b.f11734a);

    /* renamed from: a */
    public final Activity f11733a;

    /* renamed from: b.v$a */
    public static abstract class a {
        public /* synthetic */ a(AbstractC5464g abstractC5464g) {
            this();
        }

        /* renamed from: a */
        public abstract boolean mo14039a(InputMethodManager inputMethodManager);

        /* renamed from: b */
        public abstract Object mo14040b(InputMethodManager inputMethodManager);

        /* renamed from: c */
        public abstract View mo14041c(InputMethodManager inputMethodManager);

        public a() {
        }
    }

    /* renamed from: b.v$b */
    public static final class b extends AbstractC5470m implements InterfaceC0789a {

        /* renamed from: a */
        public static final b f11734a = new b();

        public b() {
            super(0);
        }

        @Override // p069J5.InterfaceC0789a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final a invoke() {
            try {
                Field servedViewField = InputMethodManager.class.getDeclaredField("mServedView");
                servedViewField.setAccessible(true);
                Field nextServedViewField = InputMethodManager.class.getDeclaredField("mNextServedView");
                nextServedViewField.setAccessible(true);
                Field hField = InputMethodManager.class.getDeclaredField("mH");
                hField.setAccessible(true);
                AbstractC5469l.m23027d(hField, "hField");
                AbstractC5469l.m23027d(servedViewField, "servedViewField");
                AbstractC5469l.m23027d(nextServedViewField, "nextServedViewField");
                return new e(hField, servedViewField, nextServedViewField);
            } catch (NoSuchFieldException unused) {
                return d.f11735a;
            }
        }
    }

    /* renamed from: b.v$c */
    public static final class c {
        public /* synthetic */ c(AbstractC5464g abstractC5464g) {
            this();
        }

        /* renamed from: a */
        public final a m14043a() {
            return (a) C3498v.f11732c.getValue();
        }

        public c() {
        }
    }

    /* renamed from: b.v$d */
    public static final class d extends a {

        /* renamed from: a */
        public static final d f11735a = new d();

        public d() {
            super(null);
        }

        @Override // p191b.C3498v.a
        /* renamed from: a */
        public boolean mo14039a(InputMethodManager inputMethodManager) {
            AbstractC5469l.m23028e(inputMethodManager, "<this>");
            return false;
        }

        @Override // p191b.C3498v.a
        /* renamed from: b */
        public Object mo14040b(InputMethodManager inputMethodManager) {
            AbstractC5469l.m23028e(inputMethodManager, "<this>");
            return null;
        }

        @Override // p191b.C3498v.a
        /* renamed from: c */
        public View mo14041c(InputMethodManager inputMethodManager) {
            AbstractC5469l.m23028e(inputMethodManager, "<this>");
            return null;
        }
    }

    /* renamed from: b.v$e */
    public static final class e extends a {

        /* renamed from: a */
        public final Field f11736a;

        /* renamed from: b */
        public final Field f11737b;

        /* renamed from: c */
        public final Field f11738c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Field hField, Field servedViewField, Field nextServedViewField) {
            super(null);
            AbstractC5469l.m23028e(hField, "hField");
            AbstractC5469l.m23028e(servedViewField, "servedViewField");
            AbstractC5469l.m23028e(nextServedViewField, "nextServedViewField");
            this.f11736a = hField;
            this.f11737b = servedViewField;
            this.f11738c = nextServedViewField;
        }

        @Override // p191b.C3498v.a
        /* renamed from: a */
        public boolean mo14039a(InputMethodManager inputMethodManager) {
            AbstractC5469l.m23028e(inputMethodManager, "<this>");
            try {
                this.f11738c.set(inputMethodManager, null);
                return true;
            } catch (IllegalAccessException unused) {
                return false;
            }
        }

        @Override // p191b.C3498v.a
        /* renamed from: b */
        public Object mo14040b(InputMethodManager inputMethodManager) {
            AbstractC5469l.m23028e(inputMethodManager, "<this>");
            try {
                return this.f11736a.get(inputMethodManager);
            } catch (IllegalAccessException unused) {
                return null;
            }
        }

        @Override // p191b.C3498v.a
        /* renamed from: c */
        public View mo14041c(InputMethodManager inputMethodManager) {
            AbstractC5469l.m23028e(inputMethodManager, "<this>");
            try {
                return (View) this.f11737b.get(inputMethodManager);
            } catch (ClassCastException | IllegalAccessException unused) {
                return null;
            }
        }
    }

    public C3498v(Activity activity) {
        AbstractC5469l.m23028e(activity, "activity");
        this.f11733a = activity;
    }

    @Override // androidx.lifecycle.InterfaceC3347l
    /* renamed from: d */
    public void mo78d(InterfaceC3349n source, AbstractC3345j.a event) {
        AbstractC5469l.m23028e(source, "source");
        AbstractC5469l.m23028e(event, "event");
        if (event != AbstractC3345j.a.ON_DESTROY) {
            return;
        }
        Object systemService = this.f11733a.getSystemService("input_method");
        AbstractC5469l.m23026c(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        InputMethodManager inputMethodManager = (InputMethodManager) systemService;
        a m14043a = f11731b.m14043a();
        Object mo14040b = m14043a.mo14040b(inputMethodManager);
        if (mo14040b == null) {
            return;
        }
        synchronized (mo14040b) {
            View mo14041c = m14043a.mo14041c(inputMethodManager);
            if (mo14041c == null) {
                return;
            }
            if (mo14041c.isAttachedToWindow()) {
                return;
            }
            boolean mo14039a = m14043a.mo14039a(inputMethodManager);
            if (mo14039a) {
                inputMethodManager.isActive();
            }
        }
    }
}
