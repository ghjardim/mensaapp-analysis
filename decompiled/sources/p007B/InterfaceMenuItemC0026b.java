package p007B;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.view.MenuItem;

/* renamed from: B.b */
/* loaded from: classes.dex */
public interface InterfaceMenuItemC0026b extends MenuItem {
    @Override // android.view.MenuItem
    MenuItem setAlphabeticShortcut(char c7, int i7);

    @Override // android.view.MenuItem
    InterfaceMenuItemC0026b setContentDescription(CharSequence charSequence);

    @Override // android.view.MenuItem
    MenuItem setIconTintList(ColorStateList colorStateList);

    @Override // android.view.MenuItem
    MenuItem setIconTintMode(PorterDuff.Mode mode);

    @Override // android.view.MenuItem
    MenuItem setNumericShortcut(char c7, int i7);

    @Override // android.view.MenuItem
    InterfaceMenuItemC0026b setTooltipText(CharSequence charSequence);
}
