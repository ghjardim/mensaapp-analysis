package androidx.appcompat.view.menu;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.InterfaceC3195h;
import org.apache.tika.utils.StringUtils;
import p000A.AbstractC0000a;
import p007B.InterfaceMenuItemC0026b;
import p049H.AbstractC0501b;
import p223f.AbstractC4222g;
import p239h.AbstractC4474a;

/* renamed from: androidx.appcompat.view.menu.e */
/* loaded from: classes.dex */
public final class C3192e implements InterfaceMenuItemC0026b {

    /* renamed from: A */
    public View f9918A;

    /* renamed from: B */
    public MenuItem.OnActionExpandListener f9919B;

    /* renamed from: D */
    public ContextMenu.ContextMenuInfo f9921D;

    /* renamed from: a */
    public final int f9922a;

    /* renamed from: b */
    public final int f9923b;

    /* renamed from: c */
    public final int f9924c;

    /* renamed from: d */
    public final int f9925d;

    /* renamed from: e */
    public CharSequence f9926e;

    /* renamed from: f */
    public CharSequence f9927f;

    /* renamed from: g */
    public Intent f9928g;

    /* renamed from: h */
    public char f9929h;

    /* renamed from: j */
    public char f9931j;

    /* renamed from: l */
    public Drawable f9933l;

    /* renamed from: n */
    public C3191d f9935n;

    /* renamed from: o */
    public SubMenuC3197j f9936o;

    /* renamed from: p */
    public Runnable f9937p;

    /* renamed from: q */
    public MenuItem.OnMenuItemClickListener f9938q;

    /* renamed from: r */
    public CharSequence f9939r;

    /* renamed from: s */
    public CharSequence f9940s;

    /* renamed from: z */
    public int f9947z;

    /* renamed from: i */
    public int f9930i = 4096;

    /* renamed from: k */
    public int f9932k = 4096;

    /* renamed from: m */
    public int f9934m = 0;

    /* renamed from: t */
    public ColorStateList f9941t = null;

    /* renamed from: u */
    public PorterDuff.Mode f9942u = null;

    /* renamed from: v */
    public boolean f9943v = false;

    /* renamed from: w */
    public boolean f9944w = false;

    /* renamed from: x */
    public boolean f9945x = false;

    /* renamed from: y */
    public int f9946y = 16;

    /* renamed from: C */
    public boolean f9920C = false;

    public C3192e(C3191d c3191d, int i7, int i8, int i9, int i10, CharSequence charSequence, int i11) {
        this.f9935n = c3191d;
        this.f9922a = i8;
        this.f9923b = i7;
        this.f9924c = i9;
        this.f9925d = i10;
        this.f9926e = charSequence;
        this.f9947z = i11;
    }

    /* renamed from: b */
    public static void m11707b(StringBuilder sb, int i7, int i8, String str) {
        if ((i7 & i8) == i8) {
            sb.append(str);
        }
    }

    /* renamed from: A */
    public boolean m11708A() {
        return (this.f9947z & 4) == 4;
    }

    /* renamed from: a */
    public void m11709a() {
        this.f9935n.m11663E(this);
    }

    /* renamed from: c */
    public final Drawable m11710c(Drawable drawable) {
        if (drawable != null && this.f9945x && (this.f9943v || this.f9944w)) {
            drawable = AbstractC0000a.m15p(drawable).mutate();
            if (this.f9943v) {
                AbstractC0000a.m12m(drawable, this.f9941t);
            }
            if (this.f9944w) {
                AbstractC0000a.m13n(drawable, this.f9942u);
            }
            this.f9945x = false;
        }
        return drawable;
    }

    @Override // android.view.MenuItem
    public boolean collapseActionView() {
        if ((this.f9947z & 8) == 0) {
            return false;
        }
        if (this.f9918A == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f9919B;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.f9935n.mo11685e(this);
        }
        return false;
    }

    /* renamed from: d */
    public int m11711d() {
        return this.f9925d;
    }

    /* renamed from: e */
    public char m11712e() {
        return this.f9935n.mo11661C() ? this.f9931j : this.f9929h;
    }

    @Override // android.view.MenuItem
    public boolean expandActionView() {
        if (!m11716i()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f9919B;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
            return this.f9935n.mo11690j(this);
        }
        return false;
    }

    /* renamed from: f */
    public String m11713f() {
        char m11712e = m11712e();
        if (m11712e == 0) {
            return StringUtils.EMPTY;
        }
        Resources resources = this.f9935n.m11698s().getResources();
        StringBuilder sb = new StringBuilder();
        if (ViewConfiguration.get(this.f9935n.m11698s()).hasPermanentMenuKey()) {
            sb.append(resources.getString(AbstractC4222g.f14208k));
        }
        int i7 = this.f9935n.mo11661C() ? this.f9932k : this.f9930i;
        m11707b(sb, i7, 65536, resources.getString(AbstractC4222g.f14204g));
        m11707b(sb, i7, 4096, resources.getString(AbstractC4222g.f14200c));
        m11707b(sb, i7, 2, resources.getString(AbstractC4222g.f14199b));
        m11707b(sb, i7, 1, resources.getString(AbstractC4222g.f14205h));
        m11707b(sb, i7, 4, resources.getString(AbstractC4222g.f14207j));
        m11707b(sb, i7, 8, resources.getString(AbstractC4222g.f14203f));
        if (m11712e == '\b') {
            sb.append(resources.getString(AbstractC4222g.f14201d));
        } else if (m11712e == '\n') {
            sb.append(resources.getString(AbstractC4222g.f14202e));
        } else if (m11712e != ' ') {
            sb.append(m11712e);
        } else {
            sb.append(resources.getString(AbstractC4222g.f14206i));
        }
        return sb.toString();
    }

    /* renamed from: g */
    public AbstractC0501b m11714g() {
        return null;
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // android.view.MenuItem
    public View getActionView() {
        View view = this.f9918A;
        if (view != null) {
            return view;
        }
        return null;
    }

    @Override // android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.f9932k;
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.f9931j;
    }

    @Override // android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.f9939r;
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.f9923b;
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        Drawable drawable = this.f9933l;
        if (drawable != null) {
            return m11710c(drawable);
        }
        if (this.f9934m == 0) {
            return null;
        }
        Drawable m19044b = AbstractC4474a.m19044b(this.f9935n.m11698s(), this.f9934m);
        this.f9934m = 0;
        this.f9933l = m19044b;
        return m11710c(m19044b);
    }

    @Override // android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.f9941t;
    }

    @Override // android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.f9942u;
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.f9928g;
    }

    @Override // android.view.MenuItem
    public int getItemId() {
        return this.f9922a;
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.f9921D;
    }

    @Override // android.view.MenuItem
    public int getNumericModifiers() {
        return this.f9930i;
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.f9929h;
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.f9924c;
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return this.f9936o;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitle() {
        return this.f9926e;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f9927f;
        return charSequence != null ? charSequence : this.f9926e;
    }

    @Override // android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.f9940s;
    }

    /* renamed from: h */
    public CharSequence m11715h(InterfaceC3195h.a aVar) {
        return (aVar == null || !aVar.mo11601c()) ? getTitle() : getTitleCondensed();
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return this.f9936o != null;
    }

    /* renamed from: i */
    public boolean m11716i() {
        return ((this.f9947z & 8) == 0 || this.f9918A == null) ? false : true;
    }

    @Override // android.view.MenuItem
    public boolean isActionViewExpanded() {
        return this.f9920C;
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return (this.f9946y & 1) == 1;
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return (this.f9946y & 2) == 2;
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return (this.f9946y & 16) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        return (this.f9946y & 8) == 0;
    }

    /* renamed from: j */
    public boolean m11717j() {
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = this.f9938q;
        if (onMenuItemClickListener != null && onMenuItemClickListener.onMenuItemClick(this)) {
            return true;
        }
        C3191d c3191d = this.f9935n;
        if (c3191d.mo11687g(c3191d, this)) {
            return true;
        }
        Runnable runnable = this.f9937p;
        if (runnable != null) {
            runnable.run();
            return true;
        }
        if (this.f9928g == null) {
            return false;
        }
        try {
            this.f9935n.m11698s().startActivity(this.f9928g);
            return true;
        } catch (ActivityNotFoundException e7) {
            Log.e("MenuItemImpl", "Can't find activity to handle intent; ignoring", e7);
            return false;
        }
    }

    /* renamed from: k */
    public boolean m11718k() {
        return (this.f9946y & 32) == 32;
    }

    /* renamed from: l */
    public boolean m11719l() {
        return (this.f9946y & 4) != 0;
    }

    /* renamed from: m */
    public boolean m11720m() {
        return (this.f9947z & 1) == 1;
    }

    /* renamed from: n */
    public boolean m11721n() {
        return (this.f9947z & 2) == 2;
    }

    @Override // android.view.MenuItem
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public InterfaceMenuItemC0026b setActionView(int i7) {
        Context m11698s = this.f9935n.m11698s();
        setActionView(LayoutInflater.from(m11698s).inflate(i7, (ViewGroup) new LinearLayout(m11698s), false));
        return this;
    }

    @Override // android.view.MenuItem
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public InterfaceMenuItemC0026b setActionView(View view) {
        int i7;
        this.f9918A = view;
        if (view != null && view.getId() == -1 && (i7 = this.f9922a) > 0) {
            view.setId(i7);
        }
        this.f9935n.m11663E(this);
        return this;
    }

    /* renamed from: q */
    public void m11724q(boolean z6) {
        this.f9920C = z6;
        this.f9935n.m11665G(false);
    }

    /* renamed from: r */
    public void m11725r(boolean z6) {
        int i7 = this.f9946y;
        int i8 = (z6 ? 2 : 0) | (i7 & (-3));
        this.f9946y = i8;
        if (i7 != i8) {
            this.f9935n.m11665G(false);
        }
    }

    /* renamed from: s */
    public void m11726s(boolean z6) {
        this.f9946y = (z6 ? 4 : 0) | (this.f9946y & (-5));
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c7) {
        if (this.f9931j == c7) {
            return this;
        }
        this.f9931j = Character.toLowerCase(c7);
        this.f9935n.m11665G(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z6) {
        int i7 = this.f9946y;
        int i8 = (z6 ? 1 : 0) | (i7 & (-2));
        this.f9946y = i8;
        if (i7 != i8) {
            this.f9935n.m11665G(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z6) {
        if ((this.f9946y & 4) != 0) {
            this.f9935n.m11671M(this);
        } else {
            m11725r(z6);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z6) {
        if (z6) {
            this.f9946y |= 16;
        } else {
            this.f9946y &= -17;
        }
        this.f9935n.m11665G(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.f9934m = 0;
        this.f9933l = drawable;
        this.f9945x = true;
        this.f9935n.m11665G(false);
        return this;
    }

    @Override // p007B.InterfaceMenuItemC0026b, android.view.MenuItem
    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f9941t = colorStateList;
        this.f9943v = true;
        this.f9945x = true;
        this.f9935n.m11665G(false);
        return this;
    }

    @Override // p007B.InterfaceMenuItemC0026b, android.view.MenuItem
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f9942u = mode;
        this.f9944w = true;
        this.f9945x = true;
        this.f9935n.m11665G(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.f9928g = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c7) {
        if (this.f9929h == c7) {
            return this;
        }
        this.f9929h = c7;
        this.f9935n.m11665G(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f9919B = onActionExpandListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f9938q = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c7, char c8) {
        this.f9929h = c7;
        this.f9931j = Character.toLowerCase(c8);
        this.f9935n.m11665G(false);
        return this;
    }

    @Override // android.view.MenuItem
    public void setShowAsAction(int i7) {
        int i8 = i7 & 3;
        if (i8 != 0 && i8 != 1 && i8 != 2) {
            throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
        this.f9947z = i7;
        this.f9935n.m11663E(this);
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.f9926e = charSequence;
        this.f9935n.m11665G(false);
        SubMenuC3197j subMenuC3197j = this.f9936o;
        if (subMenuC3197j != null) {
            subMenuC3197j.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f9927f = charSequence;
        this.f9935n.m11665G(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z6) {
        if (m11731x(z6)) {
            this.f9935n.m11664F(this);
        }
        return this;
    }

    /* renamed from: t */
    public void m11727t(boolean z6) {
        if (z6) {
            this.f9946y |= 32;
        } else {
            this.f9946y &= -33;
        }
    }

    public String toString() {
        CharSequence charSequence = this.f9926e;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    /* renamed from: u */
    public void m11728u(ContextMenu.ContextMenuInfo contextMenuInfo) {
        this.f9921D = contextMenuInfo;
    }

    @Override // android.view.MenuItem
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public InterfaceMenuItemC0026b setShowAsActionFlags(int i7) {
        setShowAsAction(i7);
        return this;
    }

    /* renamed from: w */
    public void m11730w(SubMenuC3197j subMenuC3197j) {
        this.f9936o = subMenuC3197j;
        subMenuC3197j.setHeaderTitle(getTitle());
    }

    /* renamed from: x */
    public boolean m11731x(boolean z6) {
        int i7 = this.f9946y;
        int i8 = (z6 ? 0 : 8) | (i7 & (-9));
        this.f9946y = i8;
        return i7 != i8;
    }

    /* renamed from: y */
    public boolean m11732y() {
        return this.f9935n.m11702w();
    }

    /* renamed from: z */
    public boolean m11733z() {
        return this.f9935n.mo11662D() && m11712e() != 0;
    }

    @Override // android.view.MenuItem
    public InterfaceMenuItemC0026b setContentDescription(CharSequence charSequence) {
        this.f9939r = charSequence;
        this.f9935n.m11665G(false);
        return this;
    }

    @Override // android.view.MenuItem
    public InterfaceMenuItemC0026b setTooltipText(CharSequence charSequence) {
        this.f9940s = charSequence;
        this.f9935n.m11665G(false);
        return this;
    }

    @Override // p007B.InterfaceMenuItemC0026b, android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c7, int i7) {
        if (this.f9931j == c7 && this.f9932k == i7) {
            return this;
        }
        this.f9931j = Character.toLowerCase(c7);
        this.f9932k = KeyEvent.normalizeMetaState(i7);
        this.f9935n.m11665G(false);
        return this;
    }

    @Override // p007B.InterfaceMenuItemC0026b, android.view.MenuItem
    public MenuItem setNumericShortcut(char c7, int i7) {
        if (this.f9929h == c7 && this.f9930i == i7) {
            return this;
        }
        this.f9929h = c7;
        this.f9930i = KeyEvent.normalizeMetaState(i7);
        this.f9935n.m11665G(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c7, char c8, int i7, int i8) {
        this.f9929h = c7;
        this.f9930i = KeyEvent.normalizeMetaState(i7);
        this.f9931j = Character.toLowerCase(c8);
        this.f9932k = KeyEvent.normalizeMetaState(i8);
        this.f9935n.m11665G(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i7) {
        this.f9933l = null;
        this.f9934m = i7;
        this.f9945x = true;
        this.f9935n.m11665G(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i7) {
        return setTitle(this.f9935n.m11698s().getString(i7));
    }
}
