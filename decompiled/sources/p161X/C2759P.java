package p161X;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.P */
/* loaded from: classes.dex */
public class C2759P {

    /* renamed from: a */
    public final ArrayList f8208a = new ArrayList();

    /* renamed from: b */
    public final HashMap f8209b = new HashMap();

    /* renamed from: c */
    public final HashMap f8210c = new HashMap();

    /* renamed from: d */
    public C2755L f8211d;

    /* renamed from: A */
    public void m9583A(C2755L c2755l) {
        this.f8211d = c2755l;
    }

    /* renamed from: B */
    public Bundle m9584B(String str, Bundle bundle) {
        return bundle != null ? (Bundle) this.f8210c.put(str, bundle) : (Bundle) this.f8210c.remove(str);
    }

    /* renamed from: a */
    public void m9585a(AbstractComponentCallbacksC2786p abstractComponentCallbacksC2786p) {
        if (this.f8208a.contains(abstractComponentCallbacksC2786p)) {
            throw new IllegalStateException("Fragment already added: " + abstractComponentCallbacksC2786p);
        }
        synchronized (this.f8208a) {
            this.f8208a.add(abstractComponentCallbacksC2786p);
        }
        abstractComponentCallbacksC2786p.f8466s = true;
    }

    /* renamed from: b */
    public void m9586b() {
        this.f8209b.values().removeAll(Collections.singleton(null));
    }

    /* renamed from: c */
    public boolean m9587c(String str) {
        return this.f8209b.get(str) != null;
    }

    /* renamed from: d */
    public void m9588d(int i7) {
        for (C2758O c2758o : this.f8209b.values()) {
            if (c2758o != null) {
                c2758o.m9580s(i7);
            }
        }
    }

    /* renamed from: e */
    public void m9589e(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        String str2 = str + "    ";
        if (!this.f8209b.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (C2758O c2758o : this.f8209b.values()) {
                printWriter.print(str);
                if (c2758o != null) {
                    AbstractComponentCallbacksC2786p m9572k = c2758o.m9572k();
                    printWriter.println(m9572k);
                    m9572k.mo9877k(str2, fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        int size = this.f8208a.size();
        if (size > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i7 = 0; i7 < size; i7++) {
                AbstractComponentCallbacksC2786p abstractComponentCallbacksC2786p = (AbstractComponentCallbacksC2786p) this.f8208a.get(i7);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i7);
                printWriter.print(": ");
                printWriter.println(abstractComponentCallbacksC2786p.toString());
            }
        }
    }

    /* renamed from: f */
    public AbstractComponentCallbacksC2786p m9590f(String str) {
        C2758O c2758o = (C2758O) this.f8209b.get(str);
        if (c2758o != null) {
            return c2758o.m9572k();
        }
        return null;
    }

    /* renamed from: g */
    public AbstractComponentCallbacksC2786p m9591g(int i7) {
        for (int size = this.f8208a.size() - 1; size >= 0; size--) {
            AbstractComponentCallbacksC2786p abstractComponentCallbacksC2786p = (AbstractComponentCallbacksC2786p) this.f8208a.get(size);
            if (abstractComponentCallbacksC2786p != null && abstractComponentCallbacksC2786p.f8424F == i7) {
                return abstractComponentCallbacksC2786p;
            }
        }
        for (C2758O c2758o : this.f8209b.values()) {
            if (c2758o != null) {
                AbstractComponentCallbacksC2786p m9572k = c2758o.m9572k();
                if (m9572k.f8424F == i7) {
                    return m9572k;
                }
            }
        }
        return null;
    }

    /* renamed from: h */
    public AbstractComponentCallbacksC2786p m9592h(String str) {
        if (str != null) {
            for (int size = this.f8208a.size() - 1; size >= 0; size--) {
                AbstractComponentCallbacksC2786p abstractComponentCallbacksC2786p = (AbstractComponentCallbacksC2786p) this.f8208a.get(size);
                if (abstractComponentCallbacksC2786p != null && str.equals(abstractComponentCallbacksC2786p.f8426H)) {
                    return abstractComponentCallbacksC2786p;
                }
            }
        }
        if (str == null) {
            return null;
        }
        for (C2758O c2758o : this.f8209b.values()) {
            if (c2758o != null) {
                AbstractComponentCallbacksC2786p m9572k = c2758o.m9572k();
                if (str.equals(m9572k.f8426H)) {
                    return m9572k;
                }
            }
        }
        return null;
    }

    /* renamed from: i */
    public AbstractComponentCallbacksC2786p m9593i(String str) {
        AbstractComponentCallbacksC2786p m9882m;
        for (C2758O c2758o : this.f8209b.values()) {
            if (c2758o != null && (m9882m = c2758o.m9572k().m9882m(str)) != null) {
                return m9882m;
            }
        }
        return null;
    }

    /* renamed from: j */
    public int m9594j(AbstractComponentCallbacksC2786p abstractComponentCallbacksC2786p) {
        View view;
        View view2;
        ViewGroup viewGroup = abstractComponentCallbacksC2786p.f8434P;
        if (viewGroup == null) {
            return -1;
        }
        int indexOf = this.f8208a.indexOf(abstractComponentCallbacksC2786p);
        for (int i7 = indexOf - 1; i7 >= 0; i7--) {
            AbstractComponentCallbacksC2786p abstractComponentCallbacksC2786p2 = (AbstractComponentCallbacksC2786p) this.f8208a.get(i7);
            if (abstractComponentCallbacksC2786p2.f8434P == viewGroup && (view2 = abstractComponentCallbacksC2786p2.f8435Q) != null) {
                return viewGroup.indexOfChild(view2) + 1;
            }
        }
        while (true) {
            indexOf++;
            if (indexOf >= this.f8208a.size()) {
                return -1;
            }
            AbstractComponentCallbacksC2786p abstractComponentCallbacksC2786p3 = (AbstractComponentCallbacksC2786p) this.f8208a.get(indexOf);
            if (abstractComponentCallbacksC2786p3.f8434P == viewGroup && (view = abstractComponentCallbacksC2786p3.f8435Q) != null) {
                return viewGroup.indexOfChild(view);
            }
        }
    }

    /* renamed from: k */
    public List m9595k() {
        ArrayList arrayList = new ArrayList();
        for (C2758O c2758o : this.f8209b.values()) {
            if (c2758o != null) {
                arrayList.add(c2758o);
            }
        }
        return arrayList;
    }

    /* renamed from: l */
    public List m9596l() {
        ArrayList arrayList = new ArrayList();
        for (C2758O c2758o : this.f8209b.values()) {
            if (c2758o != null) {
                arrayList.add(c2758o.m9572k());
            } else {
                arrayList.add(null);
            }
        }
        return arrayList;
    }

    /* renamed from: m */
    public HashMap m9597m() {
        return this.f8210c;
    }

    /* renamed from: n */
    public C2758O m9598n(String str) {
        return (C2758O) this.f8209b.get(str);
    }

    /* renamed from: o */
    public List m9599o() {
        ArrayList arrayList;
        if (this.f8208a.isEmpty()) {
            return Collections.emptyList();
        }
        synchronized (this.f8208a) {
            arrayList = new ArrayList(this.f8208a);
        }
        return arrayList;
    }

    /* renamed from: p */
    public C2755L m9600p() {
        return this.f8211d;
    }

    /* renamed from: q */
    public Bundle m9601q(String str) {
        return (Bundle) this.f8210c.get(str);
    }

    /* renamed from: r */
    public void m9602r(C2758O c2758o) {
        AbstractComponentCallbacksC2786p m9572k = c2758o.m9572k();
        if (m9587c(m9572k.f8455f)) {
            return;
        }
        this.f8209b.put(m9572k.f8455f, c2758o);
        if (m9572k.f8430L) {
            if (m9572k.f8429K) {
                this.f8211d.m9544e(m9572k);
            } else {
                this.f8211d.m9553o(m9572k);
            }
            m9572k.f8430L = false;
        }
        if (AbstractC2752I.m9397I0(2)) {
            Log.v("FragmentManager", "Added fragment to active set " + m9572k);
        }
    }

    /* renamed from: s */
    public void m9603s(C2758O c2758o) {
        AbstractComponentCallbacksC2786p m9572k = c2758o.m9572k();
        if (m9572k.f8429K) {
            this.f8211d.m9553o(m9572k);
        }
        if (this.f8209b.get(m9572k.f8455f) == c2758o && ((C2758O) this.f8209b.put(m9572k.f8455f, null)) != null && AbstractC2752I.m9397I0(2)) {
            Log.v("FragmentManager", "Removed fragment from active set " + m9572k);
        }
    }

    /* renamed from: t */
    public void m9604t() {
        Iterator it = this.f8208a.iterator();
        while (it.hasNext()) {
            C2758O c2758o = (C2758O) this.f8209b.get(((AbstractComponentCallbacksC2786p) it.next()).f8455f);
            if (c2758o != null) {
                c2758o.m9574m();
            }
        }
        for (C2758O c2758o2 : this.f8209b.values()) {
            if (c2758o2 != null) {
                c2758o2.m9574m();
                AbstractComponentCallbacksC2786p m9572k = c2758o2.m9572k();
                if (m9572k.f8467t && !m9572k.m9859b0()) {
                    if (m9572k.f8469v && !this.f8210c.containsKey(m9572k.f8455f)) {
                        m9584B(m9572k.f8455f, c2758o2.m9578q());
                    }
                    m9603s(c2758o2);
                }
            }
        }
    }

    /* renamed from: u */
    public void m9605u(AbstractComponentCallbacksC2786p abstractComponentCallbacksC2786p) {
        synchronized (this.f8208a) {
            this.f8208a.remove(abstractComponentCallbacksC2786p);
        }
        abstractComponentCallbacksC2786p.f8466s = false;
    }

    /* renamed from: v */
    public void m9606v() {
        this.f8209b.clear();
    }

    /* renamed from: w */
    public void m9607w(List list) {
        this.f8208a.clear();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                AbstractComponentCallbacksC2786p m9590f = m9590f(str);
                if (m9590f == null) {
                    throw new IllegalStateException("No instantiated fragment for (" + str + ")");
                }
                if (AbstractC2752I.m9397I0(2)) {
                    Log.v("FragmentManager", "restoreSaveState: added (" + str + "): " + m9590f);
                }
                m9585a(m9590f);
            }
        }
    }

    /* renamed from: x */
    public void m9608x(HashMap hashMap) {
        this.f8210c.clear();
        this.f8210c.putAll(hashMap);
    }

    /* renamed from: y */
    public ArrayList m9609y() {
        ArrayList arrayList = new ArrayList(this.f8209b.size());
        for (C2758O c2758o : this.f8209b.values()) {
            if (c2758o != null) {
                AbstractComponentCallbacksC2786p m9572k = c2758o.m9572k();
                m9584B(m9572k.f8455f, c2758o.m9578q());
                arrayList.add(m9572k.f8455f);
                if (AbstractC2752I.m9397I0(2)) {
                    Log.v("FragmentManager", "Saved state of " + m9572k + ": " + m9572k.f8447b);
                }
            }
        }
        return arrayList;
    }

    /* renamed from: z */
    public ArrayList m9610z() {
        synchronized (this.f8208a) {
            try {
                if (this.f8208a.isEmpty()) {
                    return null;
                }
                ArrayList arrayList = new ArrayList(this.f8208a.size());
                Iterator it = this.f8208a.iterator();
                while (it.hasNext()) {
                    AbstractComponentCallbacksC2786p abstractComponentCallbacksC2786p = (AbstractComponentCallbacksC2786p) it.next();
                    arrayList.add(abstractComponentCallbacksC2786p.f8455f);
                    if (AbstractC2752I.m9397I0(2)) {
                        Log.v("FragmentManager", "saveAllState: adding fragment (" + abstractComponentCallbacksC2786p.f8455f + "): " + abstractComponentCallbacksC2786p);
                    }
                }
                return arrayList;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
