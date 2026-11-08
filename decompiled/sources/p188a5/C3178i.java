package p188a5;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import io.flutter.plugins.urllauncher.WebViewActivity;
import java.util.Collections;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import p188a5.AbstractC3170a;
import p326r.AbstractC6232b;
import p326r.C6233c;

/* renamed from: a5.i */
/* loaded from: classes2.dex */
public final class C3178i implements AbstractC3170a.d {

    /* renamed from: a */
    public final Context f9785a;

    /* renamed from: b */
    public final a f9786b;

    /* renamed from: c */
    public Activity f9787c;

    /* renamed from: a5.i$a */
    public interface a {
        /* renamed from: a */
        String mo11587a(Intent intent);
    }

    public C3178i(Context context, a aVar) {
        this.f9785a = context;
        this.f9786b = aVar;
    }

    /* renamed from: g */
    public static boolean m11589g(Map map) {
        Iterator it = map.keySet().iterator();
        while (it.hasNext()) {
            String lowerCase = ((String) it.next()).toLowerCase(Locale.US);
            lowerCase.hashCode();
            switch (lowerCase) {
                case "accept":
                case "content-language":
                case "content-type":
                case "accept-language":
                default:
                    return true;
            }
        }
        return false;
    }

    /* renamed from: i */
    public static Bundle m11590i(Map map) {
        Bundle bundle = new Bundle();
        for (String str : map.keySet()) {
            bundle.putString(str, (String) map.get(str));
        }
        return bundle;
    }

    /* renamed from: j */
    public static /* synthetic */ String m11591j(Context context, Intent intent) {
        ComponentName resolveActivity = intent.resolveActivity(context.getPackageManager());
        if (resolveActivity == null) {
            return null;
        }
        return resolveActivity.toShortString();
    }

    /* renamed from: k */
    public static boolean m11592k(Context context, Uri uri, Bundle bundle, AbstractC3170a.a aVar) {
        C6233c m26000a = new C6233c.d().m26004e(aVar.m11563b().booleanValue()).m26000a();
        m26000a.f22266a.putExtra("com.android.browser.headers", bundle);
        try {
            m26000a.m25996a(context, uri);
            return true;
        } catch (ActivityNotFoundException unused) {
            return false;
        }
    }

    @Override // p188a5.AbstractC3170a.d
    /* renamed from: a */
    public Boolean mo11566a(String str) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(str));
        return this.f9786b.mo11587a(intent) == null ? Boolean.FALSE : Boolean.valueOf(!"{com.android.fallback/com.android.fallback.Fallback}".equals(r3));
    }

    @Override // p188a5.AbstractC3170a.d
    /* renamed from: b */
    public Boolean mo11567b() {
        return Boolean.valueOf(AbstractC6232b.m25994a(this.f9785a, Collections.emptyList()) != null);
    }

    @Override // p188a5.AbstractC3170a.d
    /* renamed from: c */
    public void mo11568c() {
        this.f9785a.sendBroadcast(new Intent("close action"));
    }

    @Override // p188a5.AbstractC3170a.d
    /* renamed from: d */
    public Boolean mo11569d(String str, Map map) {
        m11593h();
        try {
            this.f9787c.startActivity(new Intent("android.intent.action.VIEW").setData(Uri.parse(str)).putExtra("com.android.browser.headers", m11590i(map)));
            return Boolean.TRUE;
        } catch (ActivityNotFoundException unused) {
            return Boolean.FALSE;
        }
    }

    @Override // p188a5.AbstractC3170a.d
    /* renamed from: e */
    public Boolean mo11570e(String str, Boolean bool, AbstractC3170a.e eVar, AbstractC3170a.a aVar) {
        m11593h();
        Bundle m11590i = m11590i(eVar.m11574d());
        if (bool.booleanValue() && !m11589g(eVar.m11574d())) {
            if (m11592k(this.f9787c, Uri.parse(str), m11590i, aVar)) {
                return Boolean.TRUE;
            }
        }
        try {
            this.f9787c.startActivity(WebViewActivity.m20664a(this.f9787c, str, eVar.m11573c().booleanValue(), eVar.m11572b().booleanValue(), m11590i));
            return Boolean.TRUE;
        } catch (ActivityNotFoundException unused) {
            return Boolean.FALSE;
        }
    }

    /* renamed from: h */
    public final void m11593h() {
        if (this.f9787c == null) {
            throw new AbstractC3170a.b("NO_ACTIVITY", "Launching a URL requires a foreground activity.", null);
        }
    }

    /* renamed from: l */
    public void m11594l(Activity activity) {
        this.f9787c = activity;
    }

    public C3178i(final Context context) {
        this(context, new a() { // from class: a5.h
            @Override // p188a5.C3178i.a
            /* renamed from: a */
            public final String mo11587a(Intent intent) {
                String m11591j;
                m11591j = C3178i.m11591j(context, intent);
                return m11591j;
            }
        });
    }
}
