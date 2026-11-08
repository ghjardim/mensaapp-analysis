package p068J4;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import android.os.LocaleList;
import java.util.ArrayList;
import java.util.Locale;
import org.apache.tika.utils.StringUtils;
import p054H4.C0576l;

/* renamed from: J4.e */
/* loaded from: classes.dex */
public class C0788e {

    /* renamed from: a */
    public final C0576l f2801a;

    /* renamed from: b */
    public final Context f2802b;

    /* renamed from: c */
    public final C0576l.b f2803c;

    /* renamed from: J4.e$a */
    public class a implements C0576l.b {
        public a() {
        }

        @Override // p054H4.C0576l.b
        /* renamed from: a */
        public String mo2208a(String str, String str2) {
            Context context = C0788e.this.f2802b;
            if (str2 != null) {
                Locale m3347b = C0788e.m3347b(str2);
                Configuration configuration = new Configuration(C0788e.this.f2802b.getResources().getConfiguration());
                configuration.setLocale(m3347b);
                context = C0788e.this.f2802b.createConfigurationContext(configuration);
            }
            int identifier = context.getResources().getIdentifier(str, "string", C0788e.this.f2802b.getPackageName());
            if (identifier != 0) {
                return context.getResources().getString(identifier);
            }
            return null;
        }
    }

    public C0788e(Context context, C0576l c0576l) {
        a aVar = new a();
        this.f2803c = aVar;
        this.f2802b = context;
        this.f2801a = c0576l;
        c0576l.m2207c(aVar);
    }

    /* renamed from: b */
    public static Locale m3347b(String str) {
        String str2;
        String[] split = str.replace('_', '-').split("-", -1);
        String str3 = split[0];
        int length = split.length;
        String str4 = StringUtils.EMPTY;
        int i7 = 1;
        if (length <= 1 || split[1].length() != 4) {
            str2 = StringUtils.EMPTY;
        } else {
            str2 = split[1];
            i7 = 2;
        }
        if (split.length > i7 && split[i7].length() >= 2 && split[i7].length() <= 3) {
            str4 = split[i7];
        }
        return new Locale(str3, str4, str2);
    }

    /* JADX WARN: Incorrect condition in loop: B:28:0x00d2 */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.Locale m3348c(java.util.List r10) {
        /*
            Method dump skipped, instructions count: 388
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p068J4.C0788e.m3348c(java.util.List):java.util.Locale");
    }

    /* renamed from: d */
    public void m3349d(Configuration configuration) {
        LocaleList locales;
        int size;
        Locale locale;
        ArrayList arrayList = new ArrayList();
        if (Build.VERSION.SDK_INT >= 24) {
            locales = configuration.getLocales();
            size = locales.size();
            for (int i7 = 0; i7 < size; i7++) {
                locale = locales.get(i7);
                arrayList.add(locale);
            }
        } else {
            arrayList.add(configuration.locale);
        }
        this.f2801a.m2206b(arrayList);
    }
}
