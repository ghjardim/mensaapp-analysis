package p049H;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import p207d.AbstractC4094d;

/* renamed from: H.n */
/* loaded from: classes.dex */
public class C0519n {

    /* renamed from: a */
    public final Runnable f1706a;

    /* renamed from: b */
    public final CopyOnWriteArrayList f1707b = new CopyOnWriteArrayList();

    /* renamed from: c */
    public final Map f1708c = new HashMap();

    public C0519n(Runnable runnable) {
        this.f1706a = runnable;
    }

    /* renamed from: a */
    public void m1973a(InterfaceC0521p interfaceC0521p) {
        this.f1707b.add(interfaceC0521p);
        this.f1706a.run();
    }

    /* renamed from: b */
    public void m1974b(Menu menu, MenuInflater menuInflater) {
        Iterator it = this.f1707b.iterator();
        while (it.hasNext()) {
            ((InterfaceC0521p) it.next()).mo1993c(menu, menuInflater);
        }
    }

    /* renamed from: c */
    public void m1975c(Menu menu) {
        Iterator it = this.f1707b.iterator();
        while (it.hasNext()) {
            ((InterfaceC0521p) it.next()).mo1992b(menu);
        }
    }

    /* renamed from: d */
    public boolean m1976d(MenuItem menuItem) {
        Iterator it = this.f1707b.iterator();
        while (it.hasNext()) {
            if (((InterfaceC0521p) it.next()).mo1991a(menuItem)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: e */
    public void m1977e(Menu menu) {
        Iterator it = this.f1707b.iterator();
        while (it.hasNext()) {
            ((InterfaceC0521p) it.next()).mo1994d(menu);
        }
    }

    /* renamed from: f */
    public void m1978f(InterfaceC0521p interfaceC0521p) {
        this.f1707b.remove(interfaceC0521p);
        AbstractC4094d.m17162a(this.f1708c.remove(interfaceC0521p));
        this.f1706a.run();
    }
}
