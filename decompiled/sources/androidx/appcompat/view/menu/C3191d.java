package androidx.appcompat.view.menu;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.ContextMenu;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import p007B.InterfaceMenuC0025a;
import p372x.AbstractC6935a;

/* renamed from: androidx.appcompat.view.menu.d */
/* loaded from: classes.dex */
public class C3191d implements InterfaceMenuC0025a {

    /* renamed from: A */
    public static final int[] f9891A = {1, 4, 5, 3, 2, 0};

    /* renamed from: a */
    public final Context f9892a;

    /* renamed from: b */
    public final Resources f9893b;

    /* renamed from: c */
    public boolean f9894c;

    /* renamed from: d */
    public boolean f9895d;

    /* renamed from: e */
    public a f9896e;

    /* renamed from: m */
    public ContextMenu.ContextMenuInfo f9904m;

    /* renamed from: n */
    public CharSequence f9905n;

    /* renamed from: o */
    public Drawable f9906o;

    /* renamed from: p */
    public View f9907p;

    /* renamed from: x */
    public C3192e f9915x;

    /* renamed from: z */
    public boolean f9917z;

    /* renamed from: l */
    public int f9903l = 0;

    /* renamed from: q */
    public boolean f9908q = false;

    /* renamed from: r */
    public boolean f9909r = false;

    /* renamed from: s */
    public boolean f9910s = false;

    /* renamed from: t */
    public boolean f9911t = false;

    /* renamed from: u */
    public boolean f9912u = false;

    /* renamed from: v */
    public ArrayList f9913v = new ArrayList();

    /* renamed from: w */
    public CopyOnWriteArrayList f9914w = new CopyOnWriteArrayList();

    /* renamed from: y */
    public boolean f9916y = false;

    /* renamed from: f */
    public ArrayList f9897f = new ArrayList();

    /* renamed from: g */
    public ArrayList f9898g = new ArrayList();

    /* renamed from: h */
    public boolean f9899h = true;

    /* renamed from: i */
    public ArrayList f9900i = new ArrayList();

    /* renamed from: j */
    public ArrayList f9901j = new ArrayList();

    /* renamed from: k */
    public boolean f9902k = true;

    /* renamed from: androidx.appcompat.view.menu.d$a */
    public interface a {
        /* renamed from: a */
        boolean mo11705a(C3191d c3191d, MenuItem menuItem);

        /* renamed from: b */
        void mo11706b(C3191d c3191d);
    }

    /* renamed from: androidx.appcompat.view.menu.d$b */
    public interface b {
        /* renamed from: a */
        boolean mo11609a(C3192e c3192e);
    }

    public C3191d(Context context) {
        this.f9892a = context;
        this.f9893b = context.getResources();
        m11678T(true);
    }

    /* renamed from: m */
    public static int m11657m(ArrayList arrayList, int i7) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (((C3192e) arrayList.get(size)).m11711d() <= i7) {
                return size + 1;
            }
        }
        return 0;
    }

    /* renamed from: x */
    public static int m11658x(int i7) {
        int i8 = ((-65536) & i7) >> 16;
        if (i8 >= 0) {
            int[] iArr = f9891A;
            if (i8 < iArr.length) {
                return (i7 & 65535) | (iArr[i8] << 16);
            }
        }
        throw new IllegalArgumentException("order does not contain a valid category.");
    }

    /* renamed from: A */
    public ArrayList m11659A() {
        if (!this.f9899h) {
            return this.f9898g;
        }
        this.f9898g.clear();
        int size = this.f9897f.size();
        for (int i7 = 0; i7 < size; i7++) {
            C3192e c3192e = (C3192e) this.f9897f.get(i7);
            if (c3192e.isVisible()) {
                this.f9898g.add(c3192e);
            }
        }
        this.f9899h = false;
        this.f9902k = true;
        return this.f9898g;
    }

    /* renamed from: B */
    public boolean mo11660B() {
        return this.f9916y;
    }

    /* renamed from: C */
    public boolean mo11661C() {
        return this.f9894c;
    }

    /* renamed from: D */
    public boolean mo11662D() {
        return this.f9895d;
    }

    /* renamed from: E */
    public void m11663E(C3192e c3192e) {
        this.f9902k = true;
        m11665G(true);
    }

    /* renamed from: F */
    public void m11664F(C3192e c3192e) {
        this.f9899h = true;
        m11665G(true);
    }

    /* renamed from: G */
    public void m11665G(boolean z6) {
        if (this.f9908q) {
            this.f9909r = true;
            if (z6) {
                this.f9910s = true;
                return;
            }
            return;
        }
        if (z6) {
            this.f9899h = true;
            this.f9902k = true;
        }
        m11688h(z6);
    }

    /* renamed from: H */
    public boolean m11666H(MenuItem menuItem, int i7) {
        return m11667I(menuItem, null, i7);
    }

    /* renamed from: I */
    public boolean m11667I(MenuItem menuItem, InterfaceC3194g interfaceC3194g, int i7) {
        C3192e c3192e = (C3192e) menuItem;
        if (c3192e == null || !c3192e.isEnabled()) {
            return false;
        }
        boolean m11717j = c3192e.m11717j();
        c3192e.m11714g();
        if (c3192e.m11716i()) {
            m11717j |= c3192e.expandActionView();
            if (m11717j) {
                m11684d(true);
            }
        } else if (c3192e.hasSubMenu()) {
            if ((i7 & 4) == 0) {
                m11684d(false);
            }
            if (!c3192e.hasSubMenu()) {
                c3192e.m11730w(new SubMenuC3197j(m11698s(), this, c3192e));
            }
            m11717j |= m11689i((SubMenuC3197j) c3192e.getSubMenu(), interfaceC3194g);
            if (!m11717j) {
                m11684d(true);
            }
        } else if ((i7 & 1) == 0) {
            m11684d(true);
        }
        return m11717j;
    }

    /* renamed from: J */
    public final void m11668J(int i7, boolean z6) {
        if (i7 < 0 || i7 >= this.f9897f.size()) {
            return;
        }
        this.f9897f.remove(i7);
        if (z6) {
            m11665G(true);
        }
    }

    /* renamed from: K */
    public void m11669K(InterfaceC3194g interfaceC3194g) {
        Iterator it = this.f9914w.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            InterfaceC3194g interfaceC3194g2 = (InterfaceC3194g) weakReference.get();
            if (interfaceC3194g2 == null || interfaceC3194g2 == interfaceC3194g) {
                this.f9914w.remove(weakReference);
            }
        }
    }

    /* renamed from: L */
    public void mo11670L(a aVar) {
        this.f9896e = aVar;
    }

    /* renamed from: M */
    public void m11671M(MenuItem menuItem) {
        int groupId = menuItem.getGroupId();
        int size = this.f9897f.size();
        m11680V();
        for (int i7 = 0; i7 < size; i7++) {
            C3192e c3192e = (C3192e) this.f9897f.get(i7);
            if (c3192e.getGroupId() == groupId && c3192e.m11719l() && c3192e.isCheckable()) {
                c3192e.m11725r(c3192e == menuItem);
            }
        }
        m11679U();
    }

    /* renamed from: N */
    public C3191d m11672N(int i7) {
        m11674P(0, null, i7, null, null);
        return this;
    }

    /* renamed from: O */
    public C3191d m11673O(Drawable drawable) {
        m11674P(0, null, 0, drawable, null);
        return this;
    }

    /* renamed from: P */
    public final void m11674P(int i7, CharSequence charSequence, int i8, Drawable drawable, View view) {
        Resources m11703y = m11703y();
        if (view != null) {
            this.f9907p = view;
            this.f9905n = null;
            this.f9906o = null;
        } else {
            if (i7 > 0) {
                this.f9905n = m11703y.getText(i7);
            } else if (charSequence != null) {
                this.f9905n = charSequence;
            }
            if (i8 > 0) {
                this.f9906o = AbstractC6935a.getDrawable(m11698s(), i8);
            } else if (drawable != null) {
                this.f9906o = drawable;
            }
            this.f9907p = null;
        }
        m11665G(false);
    }

    /* renamed from: Q */
    public C3191d m11675Q(int i7) {
        m11674P(i7, null, 0, null, null);
        return this;
    }

    /* renamed from: R */
    public C3191d m11676R(CharSequence charSequence) {
        m11674P(0, charSequence, 0, null, null);
        return this;
    }

    /* renamed from: S */
    public C3191d m11677S(View view) {
        m11674P(0, null, 0, null, view);
        return this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0019, code lost:
    
        if (p049H.AbstractC0478E.m1813l(android.view.ViewConfiguration.get(r2.f9892a), r2.f9892a) != false) goto L9;
     */
    /* renamed from: T */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m11678T(boolean r3) {
        /*
            r2 = this;
            if (r3 == 0) goto L1c
            android.content.res.Resources r3 = r2.f9893b
            android.content.res.Configuration r3 = r3.getConfiguration()
            int r3 = r3.keyboard
            r0 = 1
            if (r3 == r0) goto L1c
            android.content.Context r3 = r2.f9892a
            android.view.ViewConfiguration r3 = android.view.ViewConfiguration.get(r3)
            android.content.Context r1 = r2.f9892a
            boolean r3 = p049H.AbstractC0478E.m1813l(r3, r1)
            if (r3 == 0) goto L1c
            goto L1d
        L1c:
            r0 = 0
        L1d:
            r2.f9895d = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.C3191d.m11678T(boolean):void");
    }

    /* renamed from: U */
    public void m11679U() {
        this.f9908q = false;
        if (this.f9909r) {
            this.f9909r = false;
            m11665G(this.f9910s);
        }
    }

    /* renamed from: V */
    public void m11680V() {
        if (this.f9908q) {
            return;
        }
        this.f9908q = true;
        this.f9909r = false;
        this.f9910s = false;
    }

    /* renamed from: a */
    public MenuItem m11681a(int i7, int i8, int i9, CharSequence charSequence) {
        int m11658x = m11658x(i9);
        C3192e m11686f = m11686f(i7, i8, i9, m11658x, charSequence, this.f9903l);
        ContextMenu.ContextMenuInfo contextMenuInfo = this.f9904m;
        if (contextMenuInfo != null) {
            m11686f.m11728u(contextMenuInfo);
        }
        ArrayList arrayList = this.f9897f;
        arrayList.add(m11657m(arrayList, m11658x), m11686f);
        m11665G(true);
        return m11686f;
    }

    @Override // android.view.Menu
    public MenuItem add(CharSequence charSequence) {
        return m11681a(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public int addIntentOptions(int i7, int i8, int i9, ComponentName componentName, Intent[] intentArr, Intent intent, int i10, MenuItem[] menuItemArr) {
        int i11;
        PackageManager packageManager = this.f9892a.getPackageManager();
        List<ResolveInfo> queryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = queryIntentActivityOptions != null ? queryIntentActivityOptions.size() : 0;
        if ((i10 & 1) == 0) {
            removeGroup(i7);
        }
        for (int i12 = 0; i12 < size; i12++) {
            ResolveInfo resolveInfo = queryIntentActivityOptions.get(i12);
            int i13 = resolveInfo.specificIndex;
            Intent intent2 = new Intent(i13 < 0 ? intent : intentArr[i13]);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent2.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            MenuItem intent3 = add(i7, i8, i9, resolveInfo.loadLabel(packageManager)).setIcon(resolveInfo.loadIcon(packageManager)).setIntent(intent2);
            if (menuItemArr != null && (i11 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i11] = intent3;
            }
        }
        return size;
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    /* renamed from: b */
    public void m11682b(InterfaceC3194g interfaceC3194g, Context context) {
        this.f9914w.add(new WeakReference(interfaceC3194g));
        interfaceC3194g.mo11623i(context, this);
        this.f9902k = true;
    }

    /* renamed from: c */
    public void m11683c() {
        a aVar = this.f9896e;
        if (aVar != null) {
            aVar.mo11706b(this);
        }
    }

    @Override // android.view.Menu
    public void clear() {
        C3192e c3192e = this.f9915x;
        if (c3192e != null) {
            mo11685e(c3192e);
        }
        this.f9897f.clear();
        m11665G(true);
    }

    public void clearHeader() {
        this.f9906o = null;
        this.f9905n = null;
        this.f9907p = null;
        m11665G(false);
    }

    @Override // android.view.Menu
    public void close() {
        m11684d(true);
    }

    /* renamed from: d */
    public final void m11684d(boolean z6) {
        if (this.f9912u) {
            return;
        }
        this.f9912u = true;
        Iterator it = this.f9914w.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            InterfaceC3194g interfaceC3194g = (InterfaceC3194g) weakReference.get();
            if (interfaceC3194g == null) {
                this.f9914w.remove(weakReference);
            } else {
                interfaceC3194g.mo11617b(this, z6);
            }
        }
        this.f9912u = false;
    }

    /* renamed from: e */
    public boolean mo11685e(C3192e c3192e) {
        boolean z6 = false;
        if (!this.f9914w.isEmpty() && this.f9915x == c3192e) {
            m11680V();
            Iterator it = this.f9914w.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                InterfaceC3194g interfaceC3194g = (InterfaceC3194g) weakReference.get();
                if (interfaceC3194g == null) {
                    this.f9914w.remove(weakReference);
                } else {
                    z6 = interfaceC3194g.mo11619e(this, c3192e);
                    if (z6) {
                        break;
                    }
                }
            }
            m11679U();
            if (z6) {
                this.f9915x = null;
            }
        }
        return z6;
    }

    /* renamed from: f */
    public final C3192e m11686f(int i7, int i8, int i9, int i10, CharSequence charSequence, int i11) {
        return new C3192e(this, i7, i8, i9, i10, charSequence, i11);
    }

    @Override // android.view.Menu
    public MenuItem findItem(int i7) {
        MenuItem findItem;
        int size = size();
        for (int i8 = 0; i8 < size; i8++) {
            C3192e c3192e = (C3192e) this.f9897f.get(i8);
            if (c3192e.getItemId() == i7) {
                return c3192e;
            }
            if (c3192e.hasSubMenu() && (findItem = c3192e.getSubMenu().findItem(i7)) != null) {
                return findItem;
            }
        }
        return null;
    }

    /* renamed from: g */
    public boolean mo11687g(C3191d c3191d, MenuItem menuItem) {
        a aVar = this.f9896e;
        return aVar != null && aVar.mo11705a(c3191d, menuItem);
    }

    @Override // android.view.Menu
    public MenuItem getItem(int i7) {
        return (MenuItem) this.f9897f.get(i7);
    }

    /* renamed from: h */
    public final void m11688h(boolean z6) {
        if (this.f9914w.isEmpty()) {
            return;
        }
        m11680V();
        Iterator it = this.f9914w.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            InterfaceC3194g interfaceC3194g = (InterfaceC3194g) weakReference.get();
            if (interfaceC3194g == null) {
                this.f9914w.remove(weakReference);
            } else {
                interfaceC3194g.mo11618c(z6);
            }
        }
        m11679U();
    }

    @Override // android.view.Menu
    public boolean hasVisibleItems() {
        if (this.f9917z) {
            return true;
        }
        int size = size();
        for (int i7 = 0; i7 < size; i7++) {
            if (((C3192e) this.f9897f.get(i7)).isVisible()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: i */
    public final boolean m11689i(SubMenuC3197j subMenuC3197j, InterfaceC3194g interfaceC3194g) {
        if (this.f9914w.isEmpty()) {
            return false;
        }
        boolean mo11625k = interfaceC3194g != null ? interfaceC3194g.mo11625k(subMenuC3197j) : false;
        Iterator it = this.f9914w.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            InterfaceC3194g interfaceC3194g2 = (InterfaceC3194g) weakReference.get();
            if (interfaceC3194g2 == null) {
                this.f9914w.remove(weakReference);
            } else if (!mo11625k) {
                mo11625k = interfaceC3194g2.mo11625k(subMenuC3197j);
            }
        }
        return mo11625k;
    }

    @Override // android.view.Menu
    public boolean isShortcutKey(int i7, KeyEvent keyEvent) {
        return m11694o(i7, keyEvent) != null;
    }

    /* renamed from: j */
    public boolean mo11690j(C3192e c3192e) {
        boolean z6 = false;
        if (this.f9914w.isEmpty()) {
            return false;
        }
        m11680V();
        Iterator it = this.f9914w.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            InterfaceC3194g interfaceC3194g = (InterfaceC3194g) weakReference.get();
            if (interfaceC3194g == null) {
                this.f9914w.remove(weakReference);
            } else {
                z6 = interfaceC3194g.mo11621g(this, c3192e);
                if (z6) {
                    break;
                }
            }
        }
        m11679U();
        if (z6) {
            this.f9915x = c3192e;
        }
        return z6;
    }

    /* renamed from: k */
    public int m11691k(int i7) {
        return m11692l(i7, 0);
    }

    /* renamed from: l */
    public int m11692l(int i7, int i8) {
        int size = size();
        if (i8 < 0) {
            i8 = 0;
        }
        while (i8 < size) {
            if (((C3192e) this.f9897f.get(i8)).getGroupId() == i7) {
                return i8;
            }
            i8++;
        }
        return -1;
    }

    /* renamed from: n */
    public int m11693n(int i7) {
        int size = size();
        for (int i8 = 0; i8 < size; i8++) {
            if (((C3192e) this.f9897f.get(i8)).getItemId() == i7) {
                return i8;
            }
        }
        return -1;
    }

    /* renamed from: o */
    public C3192e m11694o(int i7, KeyEvent keyEvent) {
        ArrayList arrayList = this.f9913v;
        arrayList.clear();
        m11695p(arrayList, i7, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return (C3192e) arrayList.get(0);
        }
        boolean mo11661C = mo11661C();
        for (int i8 = 0; i8 < size; i8++) {
            C3192e c3192e = (C3192e) arrayList.get(i8);
            char alphabeticShortcut = mo11661C ? c3192e.getAlphabeticShortcut() : c3192e.getNumericShortcut();
            char[] cArr = keyData.meta;
            if ((alphabeticShortcut == cArr[0] && (metaState & 2) == 0) || ((alphabeticShortcut == cArr[2] && (metaState & 2) != 0) || (mo11661C && alphabeticShortcut == '\b' && i7 == 67))) {
                return c3192e;
            }
        }
        return null;
    }

    /* renamed from: p */
    public void m11695p(List list, int i7, KeyEvent keyEvent) {
        boolean mo11661C = mo11661C();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i7 == 67) {
            int size = this.f9897f.size();
            for (int i8 = 0; i8 < size; i8++) {
                C3192e c3192e = (C3192e) this.f9897f.get(i8);
                if (c3192e.hasSubMenu()) {
                    ((C3191d) c3192e.getSubMenu()).m11695p(list, i7, keyEvent);
                }
                char alphabeticShortcut = mo11661C ? c3192e.getAlphabeticShortcut() : c3192e.getNumericShortcut();
                if ((modifiers & 69647) == ((mo11661C ? c3192e.getAlphabeticModifiers() : c3192e.getNumericModifiers()) & 69647) && alphabeticShortcut != 0) {
                    char[] cArr = keyData.meta;
                    if ((alphabeticShortcut == cArr[0] || alphabeticShortcut == cArr[2] || (mo11661C && alphabeticShortcut == '\b' && i7 == 67)) && c3192e.isEnabled()) {
                        list.add(c3192e);
                    }
                }
            }
        }
    }

    @Override // android.view.Menu
    public boolean performIdentifierAction(int i7, int i8) {
        return m11666H(findItem(i7), i8);
    }

    @Override // android.view.Menu
    public boolean performShortcut(int i7, KeyEvent keyEvent, int i8) {
        C3192e m11694o = m11694o(i7, keyEvent);
        boolean m11666H = m11694o != null ? m11666H(m11694o, i8) : false;
        if ((i8 & 2) != 0) {
            m11684d(true);
        }
        return m11666H;
    }

    /* renamed from: q */
    public void m11696q() {
        ArrayList m11659A = m11659A();
        if (this.f9902k) {
            Iterator it = this.f9914w.iterator();
            boolean z6 = false;
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                InterfaceC3194g interfaceC3194g = (InterfaceC3194g) weakReference.get();
                if (interfaceC3194g == null) {
                    this.f9914w.remove(weakReference);
                } else {
                    z6 |= interfaceC3194g.mo11637d();
                }
            }
            if (z6) {
                this.f9900i.clear();
                this.f9901j.clear();
                int size = m11659A.size();
                for (int i7 = 0; i7 < size; i7++) {
                    C3192e c3192e = (C3192e) m11659A.get(i7);
                    if (c3192e.m11718k()) {
                        this.f9900i.add(c3192e);
                    } else {
                        this.f9901j.add(c3192e);
                    }
                }
            } else {
                this.f9900i.clear();
                this.f9901j.clear();
                this.f9901j.addAll(m11659A());
            }
            this.f9902k = false;
        }
    }

    /* renamed from: r */
    public ArrayList m11697r() {
        m11696q();
        return this.f9900i;
    }

    @Override // android.view.Menu
    public void removeGroup(int i7) {
        int m11691k = m11691k(i7);
        if (m11691k >= 0) {
            int size = this.f9897f.size() - m11691k;
            int i8 = 0;
            while (true) {
                int i9 = i8 + 1;
                if (i8 >= size || ((C3192e) this.f9897f.get(m11691k)).getGroupId() != i7) {
                    break;
                }
                m11668J(m11691k, false);
                i8 = i9;
            }
            m11665G(true);
        }
    }

    @Override // android.view.Menu
    public void removeItem(int i7) {
        m11668J(m11693n(i7), true);
    }

    /* renamed from: s */
    public Context m11698s() {
        return this.f9892a;
    }

    @Override // android.view.Menu
    public void setGroupCheckable(int i7, boolean z6, boolean z7) {
        int size = this.f9897f.size();
        for (int i8 = 0; i8 < size; i8++) {
            C3192e c3192e = (C3192e) this.f9897f.get(i8);
            if (c3192e.getGroupId() == i7) {
                c3192e.m11726s(z7);
                c3192e.setCheckable(z6);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupDividerEnabled(boolean z6) {
        this.f9916y = z6;
    }

    @Override // android.view.Menu
    public void setGroupEnabled(int i7, boolean z6) {
        int size = this.f9897f.size();
        for (int i8 = 0; i8 < size; i8++) {
            C3192e c3192e = (C3192e) this.f9897f.get(i8);
            if (c3192e.getGroupId() == i7) {
                c3192e.setEnabled(z6);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupVisible(int i7, boolean z6) {
        int size = this.f9897f.size();
        boolean z7 = false;
        for (int i8 = 0; i8 < size; i8++) {
            C3192e c3192e = (C3192e) this.f9897f.get(i8);
            if (c3192e.getGroupId() == i7 && c3192e.m11731x(z6)) {
                z7 = true;
            }
        }
        if (z7) {
            m11665G(true);
        }
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z6) {
        this.f9894c = z6;
        m11665G(false);
    }

    @Override // android.view.Menu
    public int size() {
        return this.f9897f.size();
    }

    /* renamed from: t */
    public C3192e m11699t() {
        return this.f9915x;
    }

    /* renamed from: u */
    public CharSequence m11700u() {
        return this.f9905n;
    }

    /* renamed from: v */
    public ArrayList m11701v() {
        m11696q();
        return this.f9901j;
    }

    /* renamed from: w */
    public boolean m11702w() {
        return this.f9911t;
    }

    /* renamed from: y */
    public Resources m11703y() {
        return this.f9893b;
    }

    /* renamed from: z */
    public C3191d mo11704z() {
        return this;
    }

    @Override // android.view.Menu
    public MenuItem add(int i7) {
        return m11681a(0, 0, 0, this.f9893b.getString(i7));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i7) {
        return addSubMenu(0, 0, 0, this.f9893b.getString(i7));
    }

    @Override // android.view.Menu
    public MenuItem add(int i7, int i8, int i9, CharSequence charSequence) {
        return m11681a(i7, i8, i9, charSequence);
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i7, int i8, int i9, CharSequence charSequence) {
        C3192e c3192e = (C3192e) m11681a(i7, i8, i9, charSequence);
        SubMenuC3197j subMenuC3197j = new SubMenuC3197j(this.f9892a, this, c3192e);
        c3192e.m11730w(subMenuC3197j);
        return subMenuC3197j;
    }

    @Override // android.view.Menu
    public MenuItem add(int i7, int i8, int i9, int i10) {
        return m11681a(i7, i8, i9, this.f9893b.getString(i10));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i7, int i8, int i9, int i10) {
        return addSubMenu(i7, i8, i9, this.f9893b.getString(i10));
    }
}
