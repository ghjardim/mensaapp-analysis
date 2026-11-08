package p365w;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import androidx.lifecycle.AbstractC3345j;
import androidx.lifecycle.C3350o;
import androidx.lifecycle.FragmentC3361z;
import androidx.lifecycle.InterfaceC3349n;
import kotlin.jvm.internal.AbstractC5469l;
import p049H.AbstractC0515j;
import p334s.C6318k;

/* renamed from: w.e */
/* loaded from: classes.dex */
public abstract class AbstractActivityC6789e extends Activity implements InterfaceC3349n, AbstractC0515j.a {

    /* renamed from: a */
    public final C6318k f24379a = new C6318k(0, 1, null);

    /* renamed from: b */
    public final C3350o f24380b = new C3350o(this);

    /* renamed from: a */
    public AbstractC3345j mo9642a() {
        return this.f24380b;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent event) {
        AbstractC5469l.m23028e(event, "event");
        View decorView = getWindow().getDecorView();
        AbstractC5469l.m23027d(decorView, "window.decorView");
        if (AbstractC0515j.m1964d(decorView, event)) {
            return true;
        }
        return AbstractC0515j.m1965e(this, decorView, this, event);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyShortcutEvent(KeyEvent event) {
        AbstractC5469l.m23028e(event, "event");
        View decorView = getWindow().getDecorView();
        AbstractC5469l.m23027d(decorView, "window.decorView");
        if (AbstractC0515j.m1964d(decorView, event)) {
            return true;
        }
        return super.dispatchKeyShortcutEvent(event);
    }

    @Override // p049H.AbstractC0515j.a
    /* renamed from: m */
    public boolean mo1967m(KeyEvent event) {
        AbstractC5469l.m23028e(event, "event");
        return super.dispatchKeyEvent(event);
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        FragmentC3361z.f10800b.m13001c(this);
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle outState) {
        AbstractC5469l.m23028e(outState, "outState");
        this.f24380b.m12946m(AbstractC3345j.b.CREATED);
        super.onSaveInstanceState(outState);
    }

    /* renamed from: r */
    public final boolean m27838r(String[] strArr) {
        return !m27839s(strArr);
    }

    /* renamed from: s */
    public final boolean m27839s(String[] strArr) {
        if (strArr == null || strArr.length == 0) {
            return false;
        }
        String str = strArr[0];
        switch (str.hashCode()) {
            case -645125871:
                return str.equals("--translation") && Build.VERSION.SDK_INT >= 31;
            case 100470631:
                if (!str.equals("--dump-dumpable")) {
                    return false;
                }
                break;
            case 472614934:
                if (!str.equals("--list-dumpables")) {
                    return false;
                }
                break;
            case 1159329357:
                return str.equals("--contentcapture") && Build.VERSION.SDK_INT >= 29;
            case 1455016274:
                return str.equals("--autofill") && Build.VERSION.SDK_INT >= 26;
            default:
                return false;
        }
        return Build.VERSION.SDK_INT >= 33;
    }
}
