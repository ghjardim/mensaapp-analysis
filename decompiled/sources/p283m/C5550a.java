package p283m;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import p000A.AbstractC0000a;
import p007B.InterfaceMenuItemC0026b;
import p372x.AbstractC6935a;

/* renamed from: m.a */
/* loaded from: classes.dex */
public class C5550a implements InterfaceMenuItemC0026b {

    /* renamed from: a */
    public final int f20039a;

    /* renamed from: b */
    public final int f20040b;

    /* renamed from: c */
    public final int f20041c;

    /* renamed from: d */
    public final int f20042d;

    /* renamed from: e */
    public CharSequence f20043e;

    /* renamed from: f */
    public CharSequence f20044f;

    /* renamed from: g */
    public Intent f20045g;

    /* renamed from: h */
    public char f20046h;

    /* renamed from: j */
    public char f20048j;

    /* renamed from: l */
    public Drawable f20050l;

    /* renamed from: n */
    public Context f20052n;

    /* renamed from: o */
    public MenuItem.OnMenuItemClickListener f20053o;

    /* renamed from: p */
    public CharSequence f20054p;

    /* renamed from: q */
    public CharSequence f20055q;

    /* renamed from: i */
    public int f20047i = 4096;

    /* renamed from: k */
    public int f20049k = 4096;

    /* renamed from: m */
    public int f20051m = 0;

    /* renamed from: r */
    public ColorStateList f20056r = null;

    /* renamed from: s */
    public PorterDuff.Mode f20057s = null;

    /* renamed from: t */
    public boolean f20058t = false;

    /* renamed from: u */
    public boolean f20059u = false;

    /* renamed from: v */
    public int f20060v = 16;

    public C5550a(Context context, int i7, int i8, int i9, int i10, CharSequence charSequence) {
        this.f20052n = context;
        this.f20039a = i8;
        this.f20040b = i7;
        this.f20041c = i9;
        this.f20042d = i10;
        this.f20043e = charSequence;
    }

    /* renamed from: a */
    public final void m23263a() {
        Drawable drawable = this.f20050l;
        if (drawable != null) {
            if (this.f20058t || this.f20059u) {
                Drawable m15p = AbstractC0000a.m15p(drawable);
                this.f20050l = m15p;
                Drawable mutate = m15p.mutate();
                this.f20050l = mutate;
                if (this.f20058t) {
                    AbstractC0000a.m12m(mutate, this.f20056r);
                }
                if (this.f20059u) {
                    AbstractC0000a.m13n(this.f20050l, this.f20057s);
                }
            }
        }
    }

    @Override // android.view.MenuItem
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public InterfaceMenuItemC0026b setActionView(int i7) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceMenuItemC0026b setActionView(View view) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public boolean collapseActionView() {
        return false;
    }

    @Override // android.view.MenuItem
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public InterfaceMenuItemC0026b setShowAsActionFlags(int i7) {
        setShowAsAction(i7);
        return this;
    }

    @Override // android.view.MenuItem
    public boolean expandActionView() {
        return false;
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public View getActionView() {
        return null;
    }

    @Override // android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.f20049k;
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.f20048j;
    }

    @Override // android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.f20054p;
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.f20040b;
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        return this.f20050l;
    }

    @Override // android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.f20056r;
    }

    @Override // android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.f20057s;
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.f20045g;
    }

    @Override // android.view.MenuItem
    public int getItemId() {
        return this.f20039a;
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // android.view.MenuItem
    public int getNumericModifiers() {
        return this.f20047i;
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.f20046h;
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.f20042d;
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return null;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitle() {
        return this.f20043e;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f20044f;
        return charSequence != null ? charSequence : this.f20043e;
    }

    @Override // android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.f20055q;
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return false;
    }

    @Override // android.view.MenuItem
    public boolean isActionViewExpanded() {
        return false;
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return (this.f20060v & 1) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return (this.f20060v & 2) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return (this.f20060v & 16) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        return (this.f20060v & 8) == 0;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c7) {
        this.f20048j = Character.toLowerCase(c7);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z6) {
        this.f20060v = (z6 ? 1 : 0) | (this.f20060v & (-2));
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z6) {
        this.f20060v = (z6 ? 2 : 0) | (this.f20060v & (-3));
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z6) {
        this.f20060v = (z6 ? 16 : 0) | (this.f20060v & (-17));
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.f20050l = drawable;
        this.f20051m = 0;
        m23263a();
        return this;
    }

    @Override // p007B.InterfaceMenuItemC0026b, android.view.MenuItem
    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f20056r = colorStateList;
        this.f20058t = true;
        m23263a();
        return this;
    }

    @Override // p007B.InterfaceMenuItemC0026b, android.view.MenuItem
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f20057s = mode;
        this.f20059u = true;
        m23263a();
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.f20045g = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c7) {
        this.f20046h = c7;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f20053o = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c7, char c8) {
        this.f20046h = c7;
        this.f20048j = Character.toLowerCase(c8);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.f20043e = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f20044f = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z6) {
        this.f20060v = (this.f20060v & 8) | (z6 ? 0 : 8);
        return this;
    }

    @Override // p007B.InterfaceMenuItemC0026b, android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c7, int i7) {
        this.f20048j = Character.toLowerCase(c7);
        this.f20049k = KeyEvent.normalizeMetaState(i7);
        return this;
    }

    @Override // android.view.MenuItem
    public InterfaceMenuItemC0026b setContentDescription(CharSequence charSequence) {
        this.f20054p = charSequence;
        return this;
    }

    @Override // p007B.InterfaceMenuItemC0026b, android.view.MenuItem
    public MenuItem setNumericShortcut(char c7, int i7) {
        this.f20046h = c7;
        this.f20047i = KeyEvent.normalizeMetaState(i7);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i7) {
        this.f20043e = this.f20052n.getResources().getString(i7);
        return this;
    }

    @Override // android.view.MenuItem
    public InterfaceMenuItemC0026b setTooltipText(CharSequence charSequence) {
        this.f20055q = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c7, char c8, int i7, int i8) {
        this.f20046h = c7;
        this.f20047i = KeyEvent.normalizeMetaState(i7);
        this.f20048j = Character.toLowerCase(c8);
        this.f20049k = KeyEvent.normalizeMetaState(i8);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i7) {
        this.f20051m = i7;
        this.f20050l = AbstractC6935a.getDrawable(this.f20052n, i7);
        m23263a();
        return this;
    }

    @Override // android.view.MenuItem
    public void setShowAsAction(int i7) {
    }
}
