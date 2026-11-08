package p275l;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.appcompat.view.menu.C3192e;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import org.xmlpull.v1.XmlPullParserException;
import p007B.InterfaceMenuC0025a;
import p049H.AbstractC0520o;
import p207d.AbstractC4094d;
import p223f.AbstractC4224i;
import p291n.AbstractC5608I;
import p291n.C5632d0;

/* renamed from: l.c */
/* loaded from: classes.dex */
public class C5486c extends MenuInflater {

    /* renamed from: e */
    public static final Class[] f19715e;

    /* renamed from: f */
    public static final Class[] f19716f;

    /* renamed from: a */
    public final Object[] f19717a;

    /* renamed from: b */
    public final Object[] f19718b;

    /* renamed from: c */
    public Context f19719c;

    /* renamed from: d */
    public Object f19720d;

    /* renamed from: l.c$a */
    public static class a implements MenuItem.OnMenuItemClickListener {

        /* renamed from: c */
        public static final Class[] f19721c = {MenuItem.class};

        /* renamed from: a */
        public Object f19722a;

        /* renamed from: b */
        public Method f19723b;

        public a(Object obj, String str) {
            this.f19722a = obj;
            Class<?> cls = obj.getClass();
            try {
                this.f19723b = cls.getMethod(str, f19721c);
            } catch (Exception e7) {
                InflateException inflateException = new InflateException("Couldn't resolve menu item onClick handler " + str + " in class " + cls.getName());
                inflateException.initCause(e7);
                throw inflateException;
            }
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) {
            try {
                if (this.f19723b.getReturnType() == Boolean.TYPE) {
                    return ((Boolean) this.f19723b.invoke(this.f19722a, menuItem)).booleanValue();
                }
                this.f19723b.invoke(this.f19722a, menuItem);
                return true;
            } catch (Exception e7) {
                throw new RuntimeException(e7);
            }
        }
    }

    /* renamed from: l.c$b */
    public class b {

        /* renamed from: A */
        public CharSequence f19724A;

        /* renamed from: B */
        public CharSequence f19725B;

        /* renamed from: C */
        public ColorStateList f19726C = null;

        /* renamed from: D */
        public PorterDuff.Mode f19727D = null;

        /* renamed from: a */
        public Menu f19729a;

        /* renamed from: b */
        public int f19730b;

        /* renamed from: c */
        public int f19731c;

        /* renamed from: d */
        public int f19732d;

        /* renamed from: e */
        public int f19733e;

        /* renamed from: f */
        public boolean f19734f;

        /* renamed from: g */
        public boolean f19735g;

        /* renamed from: h */
        public boolean f19736h;

        /* renamed from: i */
        public int f19737i;

        /* renamed from: j */
        public int f19738j;

        /* renamed from: k */
        public CharSequence f19739k;

        /* renamed from: l */
        public CharSequence f19740l;

        /* renamed from: m */
        public int f19741m;

        /* renamed from: n */
        public char f19742n;

        /* renamed from: o */
        public int f19743o;

        /* renamed from: p */
        public char f19744p;

        /* renamed from: q */
        public int f19745q;

        /* renamed from: r */
        public int f19746r;

        /* renamed from: s */
        public boolean f19747s;

        /* renamed from: t */
        public boolean f19748t;

        /* renamed from: u */
        public boolean f19749u;

        /* renamed from: v */
        public int f19750v;

        /* renamed from: w */
        public int f19751w;

        /* renamed from: x */
        public String f19752x;

        /* renamed from: y */
        public String f19753y;

        /* renamed from: z */
        public String f19754z;

        public b(Menu menu) {
            this.f19729a = menu;
            m23067h();
        }

        /* renamed from: a */
        public void m23060a() {
            this.f19736h = true;
            m23068i(this.f19729a.add(this.f19730b, this.f19737i, this.f19738j, this.f19739k));
        }

        /* renamed from: b */
        public SubMenu m23061b() {
            this.f19736h = true;
            SubMenu addSubMenu = this.f19729a.addSubMenu(this.f19730b, this.f19737i, this.f19738j, this.f19739k);
            m23068i(addSubMenu.getItem());
            return addSubMenu;
        }

        /* renamed from: c */
        public final char m23062c(String str) {
            if (str == null) {
                return (char) 0;
            }
            return str.charAt(0);
        }

        /* renamed from: d */
        public boolean m23063d() {
            return this.f19736h;
        }

        /* renamed from: e */
        public final Object m23064e(String str, Class[] clsArr, Object[] objArr) {
            try {
                Constructor<?> constructor = Class.forName(str, false, C5486c.this.f19719c.getClassLoader()).getConstructor(clsArr);
                constructor.setAccessible(true);
                return constructor.newInstance(objArr);
            } catch (Exception e7) {
                Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e7);
                return null;
            }
        }

        /* renamed from: f */
        public void m23065f(AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = C5486c.this.f19719c.obtainStyledAttributes(attributeSet, AbstractC4224i.f14256L0);
            this.f19730b = obtainStyledAttributes.getResourceId(AbstractC4224i.f14264N0, 0);
            this.f19731c = obtainStyledAttributes.getInt(AbstractC4224i.f14272P0, 0);
            this.f19732d = obtainStyledAttributes.getInt(AbstractC4224i.f14276Q0, 0);
            this.f19733e = obtainStyledAttributes.getInt(AbstractC4224i.f14280R0, 0);
            this.f19734f = obtainStyledAttributes.getBoolean(AbstractC4224i.f14268O0, true);
            this.f19735g = obtainStyledAttributes.getBoolean(AbstractC4224i.f14260M0, true);
            obtainStyledAttributes.recycle();
        }

        /* renamed from: g */
        public void m23066g(AttributeSet attributeSet) {
            C5632d0 m23636q = C5632d0.m23636q(C5486c.this.f19719c, attributeSet, AbstractC4224i.f14284S0);
            this.f19737i = m23636q.m23649l(AbstractC4224i.f14296V0, 0);
            this.f19738j = (m23636q.m23646i(AbstractC4224i.f14308Y0, this.f19731c) & (-65536)) | (m23636q.m23646i(AbstractC4224i.f14312Z0, this.f19732d) & 65535);
            this.f19739k = m23636q.m23651n(AbstractC4224i.f14317a1);
            this.f19740l = m23636q.m23651n(AbstractC4224i.f14322b1);
            this.f19741m = m23636q.m23649l(AbstractC4224i.f14288T0, 0);
            this.f19742n = m23062c(m23636q.m23650m(AbstractC4224i.f14327c1));
            this.f19743o = m23636q.m23646i(AbstractC4224i.f14362j1, 4096);
            this.f19744p = m23062c(m23636q.m23650m(AbstractC4224i.f14332d1));
            this.f19745q = m23636q.m23646i(AbstractC4224i.f14379n1, 4096);
            if (m23636q.m23652o(AbstractC4224i.f14337e1)) {
                this.f19746r = m23636q.m23638a(AbstractC4224i.f14337e1, false) ? 1 : 0;
            } else {
                this.f19746r = this.f19733e;
            }
            this.f19747s = m23636q.m23638a(AbstractC4224i.f14300W0, false);
            this.f19748t = m23636q.m23638a(AbstractC4224i.f14304X0, this.f19734f);
            this.f19749u = m23636q.m23638a(AbstractC4224i.f14292U0, this.f19735g);
            this.f19750v = m23636q.m23646i(AbstractC4224i.f14383o1, -1);
            this.f19754z = m23636q.m23650m(AbstractC4224i.f14342f1);
            this.f19751w = m23636q.m23649l(AbstractC4224i.f14347g1, 0);
            this.f19752x = m23636q.m23650m(AbstractC4224i.f14357i1);
            String m23650m = m23636q.m23650m(AbstractC4224i.f14352h1);
            this.f19753y = m23650m;
            boolean z6 = m23650m != null;
            if (z6 && this.f19751w == 0 && this.f19752x == null) {
                AbstractC4094d.m17162a(m23064e(m23650m, C5486c.f19716f, C5486c.this.f19718b));
            } else if (z6) {
                Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
            }
            this.f19724A = m23636q.m23651n(AbstractC4224i.f14367k1);
            this.f19725B = m23636q.m23651n(AbstractC4224i.f14387p1);
            if (m23636q.m23652o(AbstractC4224i.f14375m1)) {
                this.f19727D = AbstractC5608I.m23499d(m23636q.m23646i(AbstractC4224i.f14375m1, -1), this.f19727D);
            } else {
                this.f19727D = null;
            }
            if (m23636q.m23652o(AbstractC4224i.f14371l1)) {
                this.f19726C = m23636q.m23640c(AbstractC4224i.f14371l1);
            } else {
                this.f19726C = null;
            }
            m23636q.m23653s();
            this.f19736h = false;
        }

        /* renamed from: h */
        public void m23067h() {
            this.f19730b = 0;
            this.f19731c = 0;
            this.f19732d = 0;
            this.f19733e = 0;
            this.f19734f = true;
            this.f19735g = true;
        }

        /* renamed from: i */
        public final void m23068i(MenuItem menuItem) {
            boolean z6 = false;
            menuItem.setChecked(this.f19747s).setVisible(this.f19748t).setEnabled(this.f19749u).setCheckable(this.f19746r >= 1).setTitleCondensed(this.f19740l).setIcon(this.f19741m);
            int i7 = this.f19750v;
            if (i7 >= 0) {
                menuItem.setShowAsAction(i7);
            }
            if (this.f19754z != null) {
                if (C5486c.this.f19719c.isRestricted()) {
                    throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
                }
                menuItem.setOnMenuItemClickListener(new a(C5486c.this.m23058b(), this.f19754z));
            }
            boolean z7 = menuItem instanceof C3192e;
            if (z7) {
            }
            if (this.f19746r >= 2 && z7) {
                ((C3192e) menuItem).m11726s(true);
            }
            String str = this.f19752x;
            if (str != null) {
                menuItem.setActionView((View) m23064e(str, C5486c.f19715e, C5486c.this.f19717a));
                z6 = true;
            }
            int i8 = this.f19751w;
            if (i8 > 0) {
                if (z6) {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
                } else {
                    menuItem.setActionView(i8);
                }
            }
            AbstractC0520o.m1980b(menuItem, this.f19724A);
            AbstractC0520o.m1984f(menuItem, this.f19725B);
            AbstractC0520o.m1979a(menuItem, this.f19742n, this.f19743o);
            AbstractC0520o.m1983e(menuItem, this.f19744p, this.f19745q);
            PorterDuff.Mode mode = this.f19727D;
            if (mode != null) {
                AbstractC0520o.m1982d(menuItem, mode);
            }
            ColorStateList colorStateList = this.f19726C;
            if (colorStateList != null) {
                AbstractC0520o.m1981c(menuItem, colorStateList);
            }
        }
    }

    static {
        Class[] clsArr = {Context.class};
        f19715e = clsArr;
        f19716f = clsArr;
    }

    public C5486c(Context context) {
        super(context);
        this.f19719c = context;
        Object[] objArr = {context};
        this.f19717a = objArr;
        this.f19718b = objArr;
    }

    /* renamed from: a */
    public final Object m23057a(Object obj) {
        return obj instanceof Activity ? obj : obj instanceof ContextWrapper ? m23057a(((ContextWrapper) obj).getBaseContext()) : obj;
    }

    /* renamed from: b */
    public Object m23058b() {
        if (this.f19720d == null) {
            this.f19720d = m23057a(this.f19719c);
        }
        return this.f19720d;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0048, code lost:
    
        if (r15 == 2) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x004b, code lost:
    
        if (r15 == 3) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004f, code lost:
    
        r15 = r13.getName();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0053, code lost:
    
        if (r7 == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0059, code lost:
    
        if (r15.equals(r8) == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x005b, code lost:
    
        r7 = false;
        r8 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00ab, code lost:
    
        r15 = r13.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0062, code lost:
    
        if (r15.equals("group") == false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0064, code lost:
    
        r0.m23067h();
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x006c, code lost:
    
        if (r15.equals("item") == false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0072, code lost:
    
        if (r0.m23063d() != false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0074, code lost:
    
        r0.m23060a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x007c, code lost:
    
        if (r15.equals("menu") == false) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x007e, code lost:
    
        r6 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0080, code lost:
    
        if (r7 == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0083, code lost:
    
        r15 = r13.getName();
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x008b, code lost:
    
        if (r15.equals("group") == false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x008d, code lost:
    
        r0.m23065f(r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0095, code lost:
    
        if (r15.equals("item") == false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0097, code lost:
    
        r0.m23066g(r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x009f, code lost:
    
        if (r15.equals("menu") == false) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00a1, code lost:
    
        m23059c(r13, r14, r0.m23061b());
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00a9, code lost:
    
        r8 = r15;
        r7 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00b7, code lost:
    
        throw new java.lang.RuntimeException("Unexpected end of document");
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00b8, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x003b, code lost:
    
        r6 = false;
        r7 = false;
        r8 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0040, code lost:
    
        if (r6 != false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0042, code lost:
    
        if (r15 == 1) goto L56;
     */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m23059c(org.xmlpull.v1.XmlPullParser r13, android.util.AttributeSet r14, android.view.Menu r15) {
        /*
            r12 = this;
            l.c$b r0 = new l.c$b
            r0.<init>(r15)
            int r15 = r13.getEventType()
        L9:
            r1 = 2
            java.lang.String r2 = "menu"
            r3 = 1
            if (r15 != r1) goto L35
            java.lang.String r15 = r13.getName()
            boolean r4 = r15.equals(r2)
            if (r4 == 0) goto L1e
            int r15 = r13.next()
            goto L3b
        L1e:
            java.lang.RuntimeException r13 = new java.lang.RuntimeException
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r0 = "Expecting menu, got "
            r14.append(r0)
            r14.append(r15)
            java.lang.String r14 = r14.toString()
            r13.<init>(r14)
            throw r13
        L35:
            int r15 = r13.next()
            if (r15 != r3) goto L9
        L3b:
            r4 = 0
            r5 = 0
            r6 = r4
            r7 = r6
            r8 = r5
        L40:
            if (r6 != 0) goto Lb8
            if (r15 == r3) goto Lb0
            java.lang.String r9 = "item"
            java.lang.String r10 = "group"
            if (r15 == r1) goto L80
            r11 = 3
            if (r15 == r11) goto L4f
            goto Lab
        L4f:
            java.lang.String r15 = r13.getName()
            if (r7 == 0) goto L5e
            boolean r11 = r15.equals(r8)
            if (r11 == 0) goto L5e
            r7 = r4
            r8 = r5
            goto Lab
        L5e:
            boolean r10 = r15.equals(r10)
            if (r10 == 0) goto L68
            r0.m23067h()
            goto Lab
        L68:
            boolean r9 = r15.equals(r9)
            if (r9 == 0) goto L78
            boolean r15 = r0.m23063d()
            if (r15 != 0) goto Lab
            r0.m23060a()
            goto Lab
        L78:
            boolean r15 = r15.equals(r2)
            if (r15 == 0) goto Lab
            r6 = r3
            goto Lab
        L80:
            if (r7 == 0) goto L83
            goto Lab
        L83:
            java.lang.String r15 = r13.getName()
            boolean r10 = r15.equals(r10)
            if (r10 == 0) goto L91
            r0.m23065f(r14)
            goto Lab
        L91:
            boolean r9 = r15.equals(r9)
            if (r9 == 0) goto L9b
            r0.m23066g(r14)
            goto Lab
        L9b:
            boolean r9 = r15.equals(r2)
            if (r9 == 0) goto La9
            android.view.SubMenu r15 = r0.m23061b()
            r12.m23059c(r13, r14, r15)
            goto Lab
        La9:
            r8 = r15
            r7 = r3
        Lab:
            int r15 = r13.next()
            goto L40
        Lb0:
            java.lang.RuntimeException r13 = new java.lang.RuntimeException
            java.lang.String r14 = "Unexpected end of document"
            r13.<init>(r14)
            throw r13
        Lb8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p275l.C5486c.m23059c(org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.view.Menu):void");
    }

    @Override // android.view.MenuInflater
    public void inflate(int i7, Menu menu) {
        if (!(menu instanceof InterfaceMenuC0025a)) {
            super.inflate(i7, menu);
            return;
        }
        XmlResourceParser xmlResourceParser = null;
        try {
            try {
                try {
                    xmlResourceParser = this.f19719c.getResources().getLayout(i7);
                    m23059c(xmlResourceParser, Xml.asAttributeSet(xmlResourceParser), menu);
                } catch (IOException e7) {
                    throw new InflateException("Error inflating menu XML", e7);
                }
            } catch (XmlPullParserException e8) {
                throw new InflateException("Error inflating menu XML", e8);
            }
        } finally {
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
        }
    }
}
