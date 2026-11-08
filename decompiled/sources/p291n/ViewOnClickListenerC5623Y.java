package p291n;

import android.R;
import android.app.SearchManager;
import android.app.SearchableInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.SearchView;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.WeakHashMap;
import org.apache.tika.utils.StringUtils;
import p091N.AbstractC1241c;
import p223f.AbstractC4216a;
import p223f.AbstractC4220e;
import p372x.AbstractC6935a;

/* renamed from: n.Y */
/* loaded from: classes.dex */
public class ViewOnClickListenerC5623Y extends AbstractC1241c implements View.OnClickListener {

    /* renamed from: A */
    public ColorStateList f20362A;

    /* renamed from: B */
    public int f20363B;

    /* renamed from: C */
    public int f20364C;

    /* renamed from: D */
    public int f20365D;

    /* renamed from: E */
    public int f20366E;

    /* renamed from: F */
    public int f20367F;

    /* renamed from: G */
    public int f20368G;

    /* renamed from: s */
    public final SearchManager f20369s;

    /* renamed from: t */
    public final SearchView f20370t;

    /* renamed from: u */
    public final SearchableInfo f20371u;

    /* renamed from: v */
    public final Context f20372v;

    /* renamed from: w */
    public final WeakHashMap f20373w;

    /* renamed from: x */
    public final int f20374x;

    /* renamed from: y */
    public boolean f20375y;

    /* renamed from: z */
    public int f20376z;

    /* renamed from: n.Y$a */
    public static final class a {

        /* renamed from: a */
        public final TextView f20377a;

        /* renamed from: b */
        public final TextView f20378b;

        /* renamed from: c */
        public final ImageView f20379c;

        /* renamed from: d */
        public final ImageView f20380d;

        /* renamed from: e */
        public final ImageView f20381e;

        public a(View view) {
            this.f20377a = (TextView) view.findViewById(R.id.text1);
            this.f20378b = (TextView) view.findViewById(R.id.text2);
            this.f20379c = (ImageView) view.findViewById(R.id.icon1);
            this.f20380d = (ImageView) view.findViewById(R.id.icon2);
            this.f20381e = (ImageView) view.findViewById(AbstractC4220e.f14169k);
        }
    }

    public ViewOnClickListenerC5623Y(Context context, SearchView searchView, SearchableInfo searchableInfo, WeakHashMap weakHashMap) {
        super(context, searchView.getSuggestionRowLayout(), null, true);
        this.f20375y = false;
        this.f20376z = 1;
        this.f20363B = -1;
        this.f20364C = -1;
        this.f20365D = -1;
        this.f20366E = -1;
        this.f20367F = -1;
        this.f20368G = -1;
        this.f20369s = (SearchManager) this.f3907d.getSystemService("search");
        this.f20370t = searchView;
        this.f20371u = searchableInfo;
        this.f20374x = searchView.getSuggestionCommitIconResId();
        this.f20372v = context;
        this.f20373w = weakHashMap;
    }

    /* renamed from: o */
    public static String m23595o(Cursor cursor, String str) {
        return m23596w(cursor, cursor.getColumnIndex(str));
    }

    /* renamed from: w */
    public static String m23596w(Cursor cursor, int i7) {
        if (i7 == -1) {
            return null;
        }
        try {
            return cursor.getString(i7);
        } catch (Exception e7) {
            Log.e("SuggestionsAdapter", "unexpected error retrieving valid column from cursor, did the remote process die?", e7);
            return null;
        }
    }

    /* renamed from: A */
    public final void m23597A(String str, Drawable drawable) {
        if (drawable != null) {
            this.f20373w.put(str, drawable.getConstantState());
        }
    }

    /* renamed from: B */
    public final void m23598B(Cursor cursor) {
        Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras != null) {
            extras.getBoolean("in_progress");
        }
    }

    @Override // p091N.AbstractC1239a, p091N.C1240b.a
    /* renamed from: a */
    public void mo4746a(Cursor cursor) {
        if (this.f20375y) {
            Log.w("SuggestionsAdapter", "Tried to change cursor after adapter was closed.");
            if (cursor != null) {
                cursor.close();
                return;
            }
            return;
        }
        try {
            super.mo4746a(cursor);
            if (cursor != null) {
                this.f20363B = cursor.getColumnIndex("suggest_text_1");
                this.f20364C = cursor.getColumnIndex("suggest_text_2");
                this.f20365D = cursor.getColumnIndex("suggest_text_2_url");
                this.f20366E = cursor.getColumnIndex("suggest_icon_1");
                this.f20367F = cursor.getColumnIndex("suggest_icon_2");
                this.f20368G = cursor.getColumnIndex("suggest_flags");
            }
        } catch (Exception e7) {
            Log.e("SuggestionsAdapter", "error changing cursor and caching columns", e7);
        }
    }

    @Override // p091N.AbstractC1239a, p091N.C1240b.a
    /* renamed from: c */
    public CharSequence mo4748c(Cursor cursor) {
        String m23595o;
        String m23595o2;
        if (cursor == null) {
            return null;
        }
        String m23595o3 = m23595o(cursor, "suggest_intent_query");
        if (m23595o3 != null) {
            return m23595o3;
        }
        if (this.f20371u.shouldRewriteQueryFromData() && (m23595o2 = m23595o(cursor, "suggest_intent_data")) != null) {
            return m23595o2;
        }
        if (!this.f20371u.shouldRewriteQueryFromText() || (m23595o = m23595o(cursor, "suggest_text_1")) == null) {
            return null;
        }
        return m23595o;
    }

    @Override // p091N.C1240b.a
    /* renamed from: d */
    public Cursor mo4755d(CharSequence charSequence) {
        String charSequence2 = charSequence == null ? StringUtils.EMPTY : charSequence.toString();
        if (this.f20370t.getVisibility() == 0 && this.f20370t.getWindowVisibility() == 0) {
            try {
                Cursor m23609v = m23609v(this.f20371u, charSequence2, 50);
                if (m23609v != null) {
                    m23609v.getCount();
                    return m23609v;
                }
            } catch (RuntimeException e7) {
                Log.w("SuggestionsAdapter", "Search suggestions query threw an exception.", e7);
            }
        }
        return null;
    }

    @Override // p091N.AbstractC1239a
    /* renamed from: e */
    public void mo4749e(View view, Context context, Cursor cursor) {
        a aVar = (a) view.getTag();
        int i7 = this.f20368G;
        int i8 = i7 != -1 ? cursor.getInt(i7) : 0;
        if (aVar.f20377a != null) {
            m23612z(aVar.f20377a, m23596w(cursor, this.f20363B));
        }
        if (aVar.f20378b != null) {
            String m23596w = m23596w(cursor, this.f20365D);
            CharSequence m23600l = m23596w != null ? m23600l(m23596w) : m23596w(cursor, this.f20364C);
            if (TextUtils.isEmpty(m23600l)) {
                TextView textView = aVar.f20377a;
                if (textView != null) {
                    textView.setSingleLine(false);
                    aVar.f20377a.setMaxLines(2);
                }
            } else {
                TextView textView2 = aVar.f20377a;
                if (textView2 != null) {
                    textView2.setSingleLine(true);
                    aVar.f20377a.setMaxLines(1);
                }
            }
            m23612z(aVar.f20378b, m23600l);
        }
        ImageView imageView = aVar.f20379c;
        if (imageView != null) {
            m23611y(imageView, m23607t(cursor), 4);
        }
        ImageView imageView2 = aVar.f20380d;
        if (imageView2 != null) {
            m23611y(imageView2, m23608u(cursor), 8);
        }
        int i9 = this.f20376z;
        if (i9 != 2 && (i9 != 1 || (i8 & 1) == 0)) {
            aVar.f20381e.setVisibility(8);
            return;
        }
        aVar.f20381e.setVisibility(0);
        aVar.f20381e.setTag(aVar.f20377a.getText());
        aVar.f20381e.setOnClickListener(this);
    }

    @Override // p091N.AbstractC1239a, android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i7, View view, ViewGroup viewGroup) {
        try {
            return super.getDropDownView(i7, view, viewGroup);
        } catch (RuntimeException e7) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e7);
            View mo4751g = mo4751g(this.f3907d, this.f3906c, viewGroup);
            if (mo4751g != null) {
                ((a) mo4751g.getTag()).f20377a.setText(e7.toString());
            }
            return mo4751g;
        }
    }

    @Override // p091N.AbstractC1239a, android.widget.Adapter
    public View getView(int i7, View view, ViewGroup viewGroup) {
        try {
            return super.getView(i7, view, viewGroup);
        } catch (RuntimeException e7) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e7);
            View mo4752h = mo4752h(this.f3907d, this.f3906c, viewGroup);
            if (mo4752h != null) {
                ((a) mo4752h.getTag()).f20377a.setText(e7.toString());
            }
            return mo4752h;
        }
    }

    @Override // p091N.AbstractC1241c, p091N.AbstractC1239a
    /* renamed from: h */
    public View mo4752h(Context context, Cursor cursor, ViewGroup viewGroup) {
        View mo4752h = super.mo4752h(context, cursor, viewGroup);
        mo4752h.setTag(new a(mo4752h));
        ((ImageView) mo4752h.findViewById(AbstractC4220e.f14169k)).setImageResource(this.f20374x);
        return mo4752h;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public boolean hasStableIds() {
        return false;
    }

    /* renamed from: k */
    public final Drawable m23599k(String str) {
        Drawable.ConstantState constantState = (Drawable.ConstantState) this.f20373w.get(str);
        if (constantState == null) {
            return null;
        }
        return constantState.newDrawable();
    }

    /* renamed from: l */
    public final CharSequence m23600l(CharSequence charSequence) {
        if (this.f20362A == null) {
            TypedValue typedValue = new TypedValue();
            this.f3907d.getTheme().resolveAttribute(AbstractC4216a.f14092r, typedValue, true);
            this.f20362A = this.f3907d.getResources().getColorStateList(typedValue.resourceId);
        }
        SpannableString spannableString = new SpannableString(charSequence);
        spannableString.setSpan(new TextAppearanceSpan(null, 0, 0, this.f20362A, null), 0, charSequence.length(), 33);
        return spannableString;
    }

    /* renamed from: m */
    public final Drawable m23601m(ComponentName componentName) {
        PackageManager packageManager = this.f3907d.getPackageManager();
        try {
            ActivityInfo activityInfo = packageManager.getActivityInfo(componentName, 128);
            int iconResource = activityInfo.getIconResource();
            if (iconResource == 0) {
                return null;
            }
            Drawable drawable = packageManager.getDrawable(componentName.getPackageName(), iconResource, activityInfo.applicationInfo);
            if (drawable != null) {
                return drawable;
            }
            Log.w("SuggestionsAdapter", "Invalid icon resource " + iconResource + " for " + componentName.flattenToShortString());
            return null;
        } catch (PackageManager.NameNotFoundException e7) {
            Log.w("SuggestionsAdapter", e7.toString());
            return null;
        }
    }

    /* renamed from: n */
    public final Drawable m23602n(ComponentName componentName) {
        String flattenToShortString = componentName.flattenToShortString();
        if (!this.f20373w.containsKey(flattenToShortString)) {
            Drawable m23601m = m23601m(componentName);
            this.f20373w.put(flattenToShortString, m23601m != null ? m23601m.getConstantState() : null);
            return m23601m;
        }
        Drawable.ConstantState constantState = (Drawable.ConstantState) this.f20373w.get(flattenToShortString);
        if (constantState == null) {
            return null;
        }
        return constantState.newDrawable(this.f20372v.getResources());
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        m23598B(mo4747b());
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetInvalidated() {
        super.notifyDataSetInvalidated();
        m23598B(mo4747b());
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        Object tag = view.getTag();
        if (tag instanceof CharSequence) {
            this.f20370t.m11807R((CharSequence) tag);
        }
    }

    /* renamed from: p */
    public final Drawable m23603p(Cursor cursor) {
        Drawable m23602n = m23602n(this.f20371u.getSearchActivity());
        return m23602n != null ? m23602n : this.f3907d.getPackageManager().getDefaultActivityIcon();
    }

    /* renamed from: q */
    public final Drawable m23604q(Uri uri) {
        try {
            if ("android.resource".equals(uri.getScheme())) {
                try {
                    return m23605r(uri);
                } catch (Resources.NotFoundException unused) {
                    throw new FileNotFoundException("Resource does not exist: " + uri);
                }
            }
            InputStream openInputStream = this.f20372v.getContentResolver().openInputStream(uri);
            if (openInputStream == null) {
                throw new FileNotFoundException("Failed to open " + uri);
            }
            try {
                return Drawable.createFromStream(openInputStream, null);
            } finally {
                try {
                    openInputStream.close();
                } catch (IOException e7) {
                    Log.e("SuggestionsAdapter", "Error closing icon stream for " + uri, e7);
                }
            }
        } catch (FileNotFoundException e8) {
            Log.w("SuggestionsAdapter", "Icon not found: " + uri + ", " + e8.getMessage());
            return null;
        }
        Log.w("SuggestionsAdapter", "Icon not found: " + uri + ", " + e8.getMessage());
        return null;
    }

    /* renamed from: r */
    public Drawable m23605r(Uri uri) {
        int parseInt;
        String authority = uri.getAuthority();
        if (TextUtils.isEmpty(authority)) {
            throw new FileNotFoundException("No authority: " + uri);
        }
        try {
            Resources resourcesForApplication = this.f3907d.getPackageManager().getResourcesForApplication(authority);
            List<String> pathSegments = uri.getPathSegments();
            if (pathSegments == null) {
                throw new FileNotFoundException("No path: " + uri);
            }
            int size = pathSegments.size();
            if (size == 1) {
                try {
                    parseInt = Integer.parseInt(pathSegments.get(0));
                } catch (NumberFormatException unused) {
                    throw new FileNotFoundException("Single path segment is not a resource ID: " + uri);
                }
            } else {
                if (size != 2) {
                    throw new FileNotFoundException("More than two path segments: " + uri);
                }
                parseInt = resourcesForApplication.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
            }
            if (parseInt != 0) {
                return resourcesForApplication.getDrawable(parseInt);
            }
            throw new FileNotFoundException("No resource found for: " + uri);
        } catch (PackageManager.NameNotFoundException unused2) {
            throw new FileNotFoundException("No package found for authority: " + uri);
        }
    }

    /* renamed from: s */
    public final Drawable m23606s(String str) {
        if (str == null || str.isEmpty() || "0".equals(str)) {
            return null;
        }
        try {
            int parseInt = Integer.parseInt(str);
            String str2 = "android.resource://" + this.f20372v.getPackageName() + "/" + parseInt;
            Drawable m23599k = m23599k(str2);
            if (m23599k != null) {
                return m23599k;
            }
            Drawable drawable = AbstractC6935a.getDrawable(this.f20372v, parseInt);
            m23597A(str2, drawable);
            return drawable;
        } catch (Resources.NotFoundException unused) {
            Log.w("SuggestionsAdapter", "Icon resource not found: " + str);
            return null;
        } catch (NumberFormatException unused2) {
            Drawable m23599k2 = m23599k(str);
            if (m23599k2 != null) {
                return m23599k2;
            }
            Drawable m23604q = m23604q(Uri.parse(str));
            m23597A(str, m23604q);
            return m23604q;
        }
    }

    /* renamed from: t */
    public final Drawable m23607t(Cursor cursor) {
        int i7 = this.f20366E;
        if (i7 == -1) {
            return null;
        }
        Drawable m23606s = m23606s(cursor.getString(i7));
        return m23606s != null ? m23606s : m23603p(cursor);
    }

    /* renamed from: u */
    public final Drawable m23608u(Cursor cursor) {
        int i7 = this.f20367F;
        if (i7 == -1) {
            return null;
        }
        return m23606s(cursor.getString(i7));
    }

    /* renamed from: v */
    public Cursor m23609v(SearchableInfo searchableInfo, String str, int i7) {
        String suggestAuthority;
        String[] strArr = null;
        if (searchableInfo == null || (suggestAuthority = searchableInfo.getSuggestAuthority()) == null) {
            return null;
        }
        Uri.Builder fragment = new Uri.Builder().scheme("content").authority(suggestAuthority).query(StringUtils.EMPTY).fragment(StringUtils.EMPTY);
        String suggestPath = searchableInfo.getSuggestPath();
        if (suggestPath != null) {
            fragment.appendEncodedPath(suggestPath);
        }
        fragment.appendPath("search_suggest_query");
        String suggestSelection = searchableInfo.getSuggestSelection();
        if (suggestSelection != null) {
            strArr = new String[]{str};
        } else {
            fragment.appendPath(str);
        }
        String[] strArr2 = strArr;
        if (i7 > 0) {
            fragment.appendQueryParameter("limit", String.valueOf(i7));
        }
        return this.f3907d.getContentResolver().query(fragment.build(), null, suggestSelection, strArr2, null);
    }

    /* renamed from: x */
    public void m23610x(int i7) {
        this.f20376z = i7;
    }

    /* renamed from: y */
    public final void m23611y(ImageView imageView, Drawable drawable, int i7) {
        imageView.setImageDrawable(drawable);
        if (drawable == null) {
            imageView.setVisibility(i7);
            return;
        }
        imageView.setVisibility(0);
        drawable.setVisible(false, false);
        drawable.setVisible(true, false);
    }

    /* renamed from: z */
    public final void m23612z(TextView textView, CharSequence charSequence) {
        textView.setText(charSequence);
        if (TextUtils.isEmpty(charSequence)) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
        }
    }
}
