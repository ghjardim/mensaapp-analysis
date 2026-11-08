package p291n;

import android.content.res.AssetFileDescriptor;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Movie;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import java.io.InputStream;

/* renamed from: n.V */
/* loaded from: classes.dex */
public abstract class AbstractC5620V extends Resources {

    /* renamed from: a */
    public final Resources f20353a;

    public AbstractC5620V(Resources resources) {
        super(resources.getAssets(), resources.getDisplayMetrics(), resources.getConfiguration());
        this.f20353a = resources;
    }

    @Override // android.content.res.Resources
    public XmlResourceParser getAnimation(int i7) {
        return this.f20353a.getAnimation(i7);
    }

    @Override // android.content.res.Resources
    public boolean getBoolean(int i7) {
        return this.f20353a.getBoolean(i7);
    }

    @Override // android.content.res.Resources
    public int getColor(int i7) {
        return this.f20353a.getColor(i7);
    }

    @Override // android.content.res.Resources
    public ColorStateList getColorStateList(int i7) {
        return this.f20353a.getColorStateList(i7);
    }

    @Override // android.content.res.Resources
    public Configuration getConfiguration() {
        return this.f20353a.getConfiguration();
    }

    @Override // android.content.res.Resources
    public float getDimension(int i7) {
        return this.f20353a.getDimension(i7);
    }

    @Override // android.content.res.Resources
    public int getDimensionPixelOffset(int i7) {
        return this.f20353a.getDimensionPixelOffset(i7);
    }

    @Override // android.content.res.Resources
    public int getDimensionPixelSize(int i7) {
        return this.f20353a.getDimensionPixelSize(i7);
    }

    @Override // android.content.res.Resources
    public DisplayMetrics getDisplayMetrics() {
        return this.f20353a.getDisplayMetrics();
    }

    @Override // android.content.res.Resources
    public Drawable getDrawable(int i7) {
        return this.f20353a.getDrawable(i7);
    }

    @Override // android.content.res.Resources
    public Drawable getDrawableForDensity(int i7, int i8) {
        return this.f20353a.getDrawableForDensity(i7, i8);
    }

    @Override // android.content.res.Resources
    public float getFraction(int i7, int i8, int i9) {
        return this.f20353a.getFraction(i7, i8, i9);
    }

    @Override // android.content.res.Resources
    public int getIdentifier(String str, String str2, String str3) {
        return this.f20353a.getIdentifier(str, str2, str3);
    }

    @Override // android.content.res.Resources
    public int[] getIntArray(int i7) {
        return this.f20353a.getIntArray(i7);
    }

    @Override // android.content.res.Resources
    public int getInteger(int i7) {
        return this.f20353a.getInteger(i7);
    }

    @Override // android.content.res.Resources
    public XmlResourceParser getLayout(int i7) {
        return this.f20353a.getLayout(i7);
    }

    @Override // android.content.res.Resources
    public Movie getMovie(int i7) {
        return this.f20353a.getMovie(i7);
    }

    @Override // android.content.res.Resources
    public String getQuantityString(int i7, int i8, Object... objArr) {
        return this.f20353a.getQuantityString(i7, i8, objArr);
    }

    @Override // android.content.res.Resources
    public CharSequence getQuantityText(int i7, int i8) {
        return this.f20353a.getQuantityText(i7, i8);
    }

    @Override // android.content.res.Resources
    public String getResourceEntryName(int i7) {
        return this.f20353a.getResourceEntryName(i7);
    }

    @Override // android.content.res.Resources
    public String getResourceName(int i7) {
        return this.f20353a.getResourceName(i7);
    }

    @Override // android.content.res.Resources
    public String getResourcePackageName(int i7) {
        return this.f20353a.getResourcePackageName(i7);
    }

    @Override // android.content.res.Resources
    public String getResourceTypeName(int i7) {
        return this.f20353a.getResourceTypeName(i7);
    }

    @Override // android.content.res.Resources
    public String getString(int i7) {
        return this.f20353a.getString(i7);
    }

    @Override // android.content.res.Resources
    public String[] getStringArray(int i7) {
        return this.f20353a.getStringArray(i7);
    }

    @Override // android.content.res.Resources
    public CharSequence getText(int i7) {
        return this.f20353a.getText(i7);
    }

    @Override // android.content.res.Resources
    public CharSequence[] getTextArray(int i7) {
        return this.f20353a.getTextArray(i7);
    }

    @Override // android.content.res.Resources
    public void getValue(int i7, TypedValue typedValue, boolean z6) {
        this.f20353a.getValue(i7, typedValue, z6);
    }

    @Override // android.content.res.Resources
    public void getValueForDensity(int i7, int i8, TypedValue typedValue, boolean z6) {
        this.f20353a.getValueForDensity(i7, i8, typedValue, z6);
    }

    @Override // android.content.res.Resources
    public XmlResourceParser getXml(int i7) {
        return this.f20353a.getXml(i7);
    }

    @Override // android.content.res.Resources
    public TypedArray obtainAttributes(AttributeSet attributeSet, int[] iArr) {
        return this.f20353a.obtainAttributes(attributeSet, iArr);
    }

    @Override // android.content.res.Resources
    public TypedArray obtainTypedArray(int i7) {
        return this.f20353a.obtainTypedArray(i7);
    }

    @Override // android.content.res.Resources
    public InputStream openRawResource(int i7) {
        return this.f20353a.openRawResource(i7);
    }

    @Override // android.content.res.Resources
    public AssetFileDescriptor openRawResourceFd(int i7) {
        return this.f20353a.openRawResourceFd(i7);
    }

    @Override // android.content.res.Resources
    public void parseBundleExtra(String str, AttributeSet attributeSet, Bundle bundle) {
        this.f20353a.parseBundleExtra(str, attributeSet, bundle);
    }

    @Override // android.content.res.Resources
    public void parseBundleExtras(XmlResourceParser xmlResourceParser, Bundle bundle) {
        this.f20353a.parseBundleExtras(xmlResourceParser, bundle);
    }

    @Override // android.content.res.Resources
    public void updateConfiguration(Configuration configuration, DisplayMetrics displayMetrics) {
        super.updateConfiguration(configuration, displayMetrics);
        Resources resources = this.f20353a;
        if (resources != null) {
            resources.updateConfiguration(configuration, displayMetrics);
        }
    }

    @Override // android.content.res.Resources
    public Drawable getDrawable(int i7, Resources.Theme theme) {
        return this.f20353a.getDrawable(i7, theme);
    }

    @Override // android.content.res.Resources
    public Drawable getDrawableForDensity(int i7, int i8, Resources.Theme theme) {
        return this.f20353a.getDrawableForDensity(i7, i8, theme);
    }

    @Override // android.content.res.Resources
    public String getQuantityString(int i7, int i8) {
        return this.f20353a.getQuantityString(i7, i8);
    }

    @Override // android.content.res.Resources
    public String getString(int i7, Object... objArr) {
        return this.f20353a.getString(i7, objArr);
    }

    @Override // android.content.res.Resources
    public CharSequence getText(int i7, CharSequence charSequence) {
        return this.f20353a.getText(i7, charSequence);
    }

    @Override // android.content.res.Resources
    public void getValue(String str, TypedValue typedValue, boolean z6) {
        this.f20353a.getValue(str, typedValue, z6);
    }

    @Override // android.content.res.Resources
    public InputStream openRawResource(int i7, TypedValue typedValue) {
        return this.f20353a.openRawResource(i7, typedValue);
    }
}
