package p070K;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.icu.text.DecimalFormatSymbols;
import android.os.Build;
import android.text.Editable;
import android.text.PrecomputedText;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.PasswordTransformationMethod;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import org.apache.tika.mime.MimeTypes;
import p035F.AbstractC0313l;
import p042G.AbstractC0343e;

/* renamed from: K.g */
/* loaded from: classes.dex */
public abstract class AbstractC0818g {

    /* renamed from: K.g$a */
    public static class a {
        /* renamed from: a */
        public static int m3420a(TextView textView) {
            return textView.getBreakStrategy();
        }

        /* renamed from: b */
        public static int m3421b(TextView textView) {
            return textView.getHyphenationFrequency();
        }

        /* renamed from: c */
        public static void m3422c(TextView textView, int i7) {
            textView.setBreakStrategy(i7);
        }

        /* renamed from: d */
        public static void m3423d(TextView textView, ColorStateList colorStateList) {
            textView.setCompoundDrawableTintList(colorStateList);
        }

        /* renamed from: e */
        public static void m3424e(TextView textView, PorterDuff.Mode mode) {
            textView.setCompoundDrawableTintMode(mode);
        }

        /* renamed from: f */
        public static void m3425f(TextView textView, int i7) {
            textView.setHyphenationFrequency(i7);
        }
    }

    /* renamed from: K.g$b */
    public static class b {
        /* renamed from: a */
        public static DecimalFormatSymbols m3426a(Locale locale) {
            return DecimalFormatSymbols.getInstance(locale);
        }
    }

    /* renamed from: K.g$c */
    public static class c {
        /* renamed from: a */
        public static String[] m3427a(DecimalFormatSymbols decimalFormatSymbols) {
            return decimalFormatSymbols.getDigitStrings();
        }

        /* renamed from: b */
        public static PrecomputedText.Params m3428b(TextView textView) {
            return textView.getTextMetricsParams();
        }

        /* renamed from: c */
        public static void m3429c(TextView textView, int i7) {
            textView.setFirstBaselineToTopHeight(i7);
        }
    }

    /* renamed from: K.g$d */
    public static class d implements ActionMode.Callback {

        /* renamed from: a */
        public final ActionMode.Callback f2837a;

        /* renamed from: b */
        public final TextView f2838b;

        /* renamed from: c */
        public Class f2839c;

        /* renamed from: d */
        public Method f2840d;

        /* renamed from: e */
        public boolean f2841e;

        /* renamed from: f */
        public boolean f2842f = false;

        public d(ActionMode.Callback callback, TextView textView) {
            this.f2837a = callback;
            this.f2838b = textView;
        }

        /* renamed from: a */
        public final Intent m3430a() {
            return new Intent().setAction("android.intent.action.PROCESS_TEXT").setType(MimeTypes.PLAIN_TEXT);
        }

        /* renamed from: b */
        public final Intent m3431b(ResolveInfo resolveInfo, TextView textView) {
            Intent putExtra = m3430a().putExtra("android.intent.extra.PROCESS_TEXT_READONLY", !m3433d(textView));
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            return putExtra.setClassName(activityInfo.packageName, activityInfo.name);
        }

        /* renamed from: c */
        public final List m3432c(Context context, PackageManager packageManager) {
            ArrayList arrayList = new ArrayList();
            if (!(context instanceof Activity)) {
                return arrayList;
            }
            for (ResolveInfo resolveInfo : packageManager.queryIntentActivities(m3430a(), 0)) {
                if (m3434e(resolveInfo, context)) {
                    arrayList.add(resolveInfo);
                }
            }
            return arrayList;
        }

        /* renamed from: d */
        public final boolean m3433d(TextView textView) {
            return (textView instanceof Editable) && textView.onCheckIsTextEditor() && textView.isEnabled();
        }

        /* renamed from: e */
        public final boolean m3434e(ResolveInfo resolveInfo, Context context) {
            if (context.getPackageName().equals(resolveInfo.activityInfo.packageName)) {
                return true;
            }
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            if (!activityInfo.exported) {
                return false;
            }
            String str = activityInfo.permission;
            return str == null || context.checkSelfPermission(str) == 0;
        }

        /* renamed from: f */
        public final void m3435f(Menu menu) {
            Context context = this.f2838b.getContext();
            PackageManager packageManager = context.getPackageManager();
            if (!this.f2842f) {
                this.f2842f = true;
                try {
                    Class<?> cls = Class.forName("com.android.internal.view.menu.MenuBuilder");
                    this.f2839c = cls;
                    this.f2840d = cls.getDeclaredMethod("removeItemAt", Integer.TYPE);
                    this.f2841e = true;
                } catch (ClassNotFoundException | NoSuchMethodException unused) {
                    this.f2839c = null;
                    this.f2840d = null;
                    this.f2841e = false;
                }
            }
            try {
                Method declaredMethod = (this.f2841e && this.f2839c.isInstance(menu)) ? this.f2840d : menu.getClass().getDeclaredMethod("removeItemAt", Integer.TYPE);
                for (int size = menu.size() - 1; size >= 0; size--) {
                    MenuItem item = menu.getItem(size);
                    if (item.getIntent() != null && "android.intent.action.PROCESS_TEXT".equals(item.getIntent().getAction())) {
                        declaredMethod.invoke(menu, Integer.valueOf(size));
                    }
                }
                List m3432c = m3432c(context, packageManager);
                for (int i7 = 0; i7 < m3432c.size(); i7++) {
                    ResolveInfo resolveInfo = (ResolveInfo) m3432c.get(i7);
                    menu.add(0, 0, i7 + 100, resolveInfo.loadLabel(packageManager)).setIntent(m3431b(resolveInfo, this.f2838b)).setShowAsAction(1);
                }
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
            }
        }

        @Override // android.view.ActionMode.Callback
        public boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
            return this.f2837a.onActionItemClicked(actionMode, menuItem);
        }

        @Override // android.view.ActionMode.Callback
        public boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
            return this.f2837a.onCreateActionMode(actionMode, menu);
        }

        @Override // android.view.ActionMode.Callback
        public void onDestroyActionMode(ActionMode actionMode) {
            this.f2837a.onDestroyActionMode(actionMode);
        }

        @Override // android.view.ActionMode.Callback
        public boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
            m3435f(menu);
            return this.f2837a.onPrepareActionMode(actionMode, menu);
        }
    }

    /* renamed from: a */
    public static int m3407a(TextView textView) {
        return textView.getPaddingTop() - textView.getPaint().getFontMetricsInt().top;
    }

    /* renamed from: b */
    public static int m3408b(TextView textView) {
        return textView.getPaddingBottom() + textView.getPaint().getFontMetricsInt().bottom;
    }

    /* renamed from: c */
    public static int m3409c(TextDirectionHeuristic textDirectionHeuristic) {
        TextDirectionHeuristic textDirectionHeuristic2;
        TextDirectionHeuristic textDirectionHeuristic3 = TextDirectionHeuristics.FIRSTSTRONG_RTL;
        if (textDirectionHeuristic == textDirectionHeuristic3 || textDirectionHeuristic == (textDirectionHeuristic2 = TextDirectionHeuristics.FIRSTSTRONG_LTR)) {
            return 1;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.ANYRTL_LTR) {
            return 2;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.LTR) {
            return 3;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.RTL) {
            return 4;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.LOCALE) {
            return 5;
        }
        if (textDirectionHeuristic == textDirectionHeuristic2) {
            return 6;
        }
        return textDirectionHeuristic == textDirectionHeuristic3 ? 7 : 1;
    }

    /* renamed from: d */
    public static TextDirectionHeuristic m3410d(TextView textView) {
        if (textView.getTransformationMethod() instanceof PasswordTransformationMethod) {
            return TextDirectionHeuristics.LTR;
        }
        if (Build.VERSION.SDK_INT >= 28 && (textView.getInputType() & 15) == 3) {
            byte directionality = Character.getDirectionality(c.m3427a(b.m3426a(textView.getTextLocale()))[0].codePointAt(0));
            return (directionality == 1 || directionality == 2) ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR;
        }
        boolean z6 = textView.getLayoutDirection() == 1;
        switch (textView.getTextDirection()) {
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            default:
                if (!z6) {
                    break;
                } else {
                    break;
                }
        }
        return TextDirectionHeuristics.LTR;
    }

    /* renamed from: e */
    public static AbstractC0313l.a m3411e(TextView textView) {
        if (Build.VERSION.SDK_INT >= 28) {
            return new AbstractC0313l.a(c.m3428b(textView));
        }
        AbstractC0313l.a.C7166a c7166a = new AbstractC0313l.a.C7166a(new TextPaint(textView.getPaint()));
        c7166a.m1228b(a.m3420a(textView));
        c7166a.m1229c(a.m3421b(textView));
        c7166a.m1230d(m3410d(textView));
        return c7166a.m1227a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: f */
    public static void m3412f(TextView textView, ColorStateList colorStateList) {
        AbstractC0343e.m1353c(textView);
        if (Build.VERSION.SDK_INT >= 24) {
            a.m3423d(textView, colorStateList);
        } else if (textView instanceof InterfaceC0819h) {
            ((InterfaceC0819h) textView).setSupportCompoundDrawablesTintList(colorStateList);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: g */
    public static void m3413g(TextView textView, PorterDuff.Mode mode) {
        AbstractC0343e.m1353c(textView);
        if (Build.VERSION.SDK_INT >= 24) {
            a.m3424e(textView, mode);
        } else if (textView instanceof InterfaceC0819h) {
            ((InterfaceC0819h) textView).setSupportCompoundDrawablesTintMode(mode);
        }
    }

    /* renamed from: h */
    public static void m3414h(TextView textView, int i7) {
        AbstractC0343e.m1352b(i7);
        if (Build.VERSION.SDK_INT >= 28) {
            c.m3429c(textView, i7);
            return;
        }
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i8 = textView.getIncludeFontPadding() ? fontMetricsInt.top : fontMetricsInt.ascent;
        if (i7 > Math.abs(i8)) {
            textView.setPadding(textView.getPaddingLeft(), i7 + i8, textView.getPaddingRight(), textView.getPaddingBottom());
        }
    }

    /* renamed from: i */
    public static void m3415i(TextView textView, int i7) {
        AbstractC0343e.m1352b(i7);
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i8 = textView.getIncludeFontPadding() ? fontMetricsInt.bottom : fontMetricsInt.descent;
        if (i7 > Math.abs(i8)) {
            textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), i7 - i8);
        }
    }

    /* renamed from: j */
    public static void m3416j(TextView textView, int i7) {
        AbstractC0343e.m1352b(i7);
        if (i7 != textView.getPaint().getFontMetricsInt(null)) {
            textView.setLineSpacing(i7 - r0, 1.0f);
        }
    }

    /* renamed from: k */
    public static void m3417k(TextView textView, AbstractC0313l abstractC0313l) {
        if (Build.VERSION.SDK_INT >= 29) {
            throw null;
        }
        m3411e(textView);
        throw null;
    }

    /* renamed from: l */
    public static void m3418l(TextView textView, AbstractC0313l.a aVar) {
        textView.setTextDirection(m3409c(aVar.m1225d()));
        textView.getPaint().set(aVar.m1226e());
        a.m3422c(textView, aVar.m1223b());
        a.m3425f(textView, aVar.m1224c());
    }

    /* renamed from: m */
    public static ActionMode.Callback m3419m(TextView textView, ActionMode.Callback callback) {
        int i7 = Build.VERSION.SDK_INT;
        return (i7 < 26 || i7 > 27 || (callback instanceof d) || callback == null) ? callback : new d(callback, textView);
    }
}
