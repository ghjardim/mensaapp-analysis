package p054H4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import org.apache.tika.parser.external.ExternalParsersConfigReaderMetKeys;
import org.json.JSONException;
import org.json.JSONObject;
import p061I4.C0655g;
import p061I4.C0658j;
import p061I4.C0659k;
import p370w4.AbstractC6917b;
import p391z4.C7146a;

/* renamed from: H4.l */
/* loaded from: classes.dex */
public class C0576l {

    /* renamed from: a */
    public final C0659k f1876a;

    /* renamed from: b */
    public b f1877b;

    /* renamed from: c */
    public final C0659k.c f1878c;

    /* renamed from: H4.l$a */
    public class a implements C0659k.c {
        public a() {
        }

        @Override // p061I4.C0659k.c
        /* renamed from: b */
        public void mo2185b(C0658j c0658j, C0659k.d dVar) {
            if (C0576l.this.f1877b == null) {
                return;
            }
            String str = c0658j.f2254a;
            str.hashCode();
            if (!str.equals("Localization.getStringResource")) {
                dVar.mo2316c();
                return;
            }
            JSONObject jSONObject = (JSONObject) c0658j.m2648b();
            try {
                dVar.mo2314a(C0576l.this.f1877b.mo2208a(jSONObject.getString(ExternalParsersConfigReaderMetKeys.METADATA_KEY_ATTR), jSONObject.has("locale") ? jSONObject.getString("locale") : null));
            } catch (JSONException e7) {
                dVar.mo2315b("error", e7.getMessage(), null);
            }
        }
    }

    /* renamed from: H4.l$b */
    public interface b {
        /* renamed from: a */
        String mo2208a(String str, String str2);
    }

    public C0576l(C7146a c7146a) {
        a aVar = new a();
        this.f1878c = aVar;
        C0659k c0659k = new C0659k(c7146a, "flutter/localization", C0655g.f2253a);
        this.f1876a = c0659k;
        c0659k.m2654e(aVar);
    }

    /* renamed from: b */
    public void m2206b(List list) {
        AbstractC6917b.m28358f("LocalizationChannel", "Sending Locales to Flutter.");
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Locale locale = (Locale) it.next();
            AbstractC6917b.m28358f("LocalizationChannel", "Locale (Language: " + locale.getLanguage() + ", Country: " + locale.getCountry() + ", Variant: " + locale.getVariant() + ")");
            arrayList.add(locale.getLanguage());
            arrayList.add(locale.getCountry());
            arrayList.add(locale.getScript());
            arrayList.add(locale.getVariant());
        }
        this.f1876a.m2652c("setLocale", arrayList);
    }

    /* renamed from: c */
    public void m2207c(b bVar) {
        this.f1877b = bVar;
    }
}
