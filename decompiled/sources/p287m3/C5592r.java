package p287m3;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.common.internal.AbstractC3802r;
import p137T3.InterfaceC2447b;
import p262j3.AbstractC5367c;
import p295n3.C5782b;
import p362v3.C6776x;

/* renamed from: m3.r */
/* loaded from: classes.dex */
public class C5592r {

    /* renamed from: b */
    public static final C5782b f20198b = new C5782b(C5592r.class.getSimpleName());

    /* renamed from: a */
    public C6776x f20199a;

    /* renamed from: m3.r$a */
    public static /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f20200a;

        static {
            int[] iArr = new int[b.values().length];
            f20200a = iArr;
            try {
                iArr[b.DEFAULT_APP_CHECK_TOKEN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f20200a[b.UNKNOWN_APP_CHECK_TOKEN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* renamed from: m3.r$b */
    public enum b {
        DEFAULT_APP_CHECK_TOKEN,
        UNKNOWN_APP_CHECK_TOKEN
    }

    public C5592r(final Context context, String str) {
        AbstractC3802r.m15129k(context);
        AbstractC3802r.m15123e(str);
        final String format = String.format("com.google.firebase.appcheck.store.%s", str);
        this.f20199a = new C6776x(new InterfaceC2447b() { // from class: m3.q
            @Override // p137T3.InterfaceC2447b
            public final Object get() {
                Object m23398c;
                m23398c = C5592r.m23398c(context, format);
                return m23398c;
            }
        });
    }

    /* renamed from: c */
    public static /* synthetic */ Object m23398c(Context context, String str) {
        return context.getSharedPreferences(str, 0);
    }

    /* renamed from: b */
    public void m23399b() {
        ((SharedPreferences) this.f20199a.get()).edit().remove("com.google.firebase.appcheck.APP_CHECK_TOKEN").remove("com.google.firebase.appcheck.TOKEN_TYPE").apply();
    }

    /* renamed from: d */
    public AbstractC5367c m23400d() {
        String string = ((SharedPreferences) this.f20199a.get()).getString("com.google.firebase.appcheck.TOKEN_TYPE", null);
        String string2 = ((SharedPreferences) this.f20199a.get()).getString("com.google.firebase.appcheck.APP_CHECK_TOKEN", null);
        if (string != null && string2 != null) {
            try {
                int i7 = a.f20200a[b.valueOf(string).ordinal()];
                if (i7 == 1) {
                    return C5576b.m23345e(string2);
                }
                if (i7 == 2) {
                    return C5576b.m23344d(string2);
                }
                f20198b.m24433d("Reached unreachable section in #retrieveAppCheckToken()");
                return null;
            } catch (IllegalArgumentException e7) {
                f20198b.m24433d("Failed to parse TokenType of stored token  with type [" + string + "] with exception: " + e7.getMessage());
                m23399b();
            }
        }
        return null;
    }

    /* renamed from: e */
    public void m23401e(AbstractC5367c abstractC5367c) {
        if (abstractC5367c instanceof C5576b) {
            ((SharedPreferences) this.f20199a.get()).edit().putString("com.google.firebase.appcheck.APP_CHECK_TOKEN", ((C5576b) abstractC5367c).m23349i()).putString("com.google.firebase.appcheck.TOKEN_TYPE", b.DEFAULT_APP_CHECK_TOKEN.name()).apply();
        } else {
            ((SharedPreferences) this.f20199a.get()).edit().putString("com.google.firebase.appcheck.APP_CHECK_TOKEN", abstractC5367c.mo22072b()).putString("com.google.firebase.appcheck.TOKEN_TYPE", b.UNKNOWN_APP_CHECK_TOKEN.name()).apply();
        }
    }
}
