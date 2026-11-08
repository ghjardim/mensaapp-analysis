package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.appcompat.view.menu.C3191d;

/* renamed from: androidx.appcompat.view.menu.j */
/* loaded from: classes.dex */
public class SubMenuC3197j extends C3191d implements SubMenu {

    /* renamed from: B */
    public C3191d f9984B;

    /* renamed from: C */
    public C3192e f9985C;

    public SubMenuC3197j(Context context, C3191d c3191d, C3192e c3192e) {
        super(context);
        this.f9984B = c3191d;
        this.f9985C = c3192e;
    }

    @Override // androidx.appcompat.view.menu.C3191d
    /* renamed from: B */
    public boolean mo11660B() {
        return this.f9984B.mo11660B();
    }

    @Override // androidx.appcompat.view.menu.C3191d
    /* renamed from: C */
    public boolean mo11661C() {
        return this.f9984B.mo11661C();
    }

    @Override // androidx.appcompat.view.menu.C3191d
    /* renamed from: D */
    public boolean mo11662D() {
        return this.f9984B.mo11662D();
    }

    @Override // androidx.appcompat.view.menu.C3191d
    /* renamed from: L */
    public void mo11670L(C3191d.a aVar) {
        this.f9984B.mo11670L(aVar);
    }

    /* renamed from: W */
    public Menu m11751W() {
        return this.f9984B;
    }

    @Override // androidx.appcompat.view.menu.C3191d
    /* renamed from: e */
    public boolean mo11685e(C3192e c3192e) {
        return this.f9984B.mo11685e(c3192e);
    }

    @Override // androidx.appcompat.view.menu.C3191d
    /* renamed from: g */
    public boolean mo11687g(C3191d c3191d, MenuItem menuItem) {
        return super.mo11687g(c3191d, menuItem) || this.f9984B.mo11687g(c3191d, menuItem);
    }

    @Override // android.view.SubMenu
    public MenuItem getItem() {
        return this.f9985C;
    }

    @Override // androidx.appcompat.view.menu.C3191d
    /* renamed from: j */
    public boolean mo11690j(C3192e c3192e) {
        return this.f9984B.mo11690j(c3192e);
    }

    @Override // androidx.appcompat.view.menu.C3191d, android.view.Menu
    public void setGroupDividerEnabled(boolean z6) {
        this.f9984B.setGroupDividerEnabled(z6);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(Drawable drawable) {
        return (SubMenu) super.m11673O(drawable);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(CharSequence charSequence) {
        return (SubMenu) super.m11676R(charSequence);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderView(View view) {
        return (SubMenu) super.m11677S(view);
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(Drawable drawable) {
        this.f9985C.setIcon(drawable);
        return this;
    }

    @Override // androidx.appcompat.view.menu.C3191d, android.view.Menu
    public void setQwertyMode(boolean z6) {
        this.f9984B.setQwertyMode(z6);
    }

    @Override // androidx.appcompat.view.menu.C3191d
    /* renamed from: z */
    public C3191d mo11704z() {
        return this.f9984B.mo11704z();
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(int i7) {
        return (SubMenu) super.m11672N(i7);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(int i7) {
        return (SubMenu) super.m11675Q(i7);
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(int i7) {
        this.f9985C.setIcon(i7);
        return this;
    }
}
