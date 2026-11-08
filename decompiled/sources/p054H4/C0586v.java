package p054H4;

import android.os.Build;
import android.util.DisplayMetrics;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;
import p061I4.C0649a;
import p061I4.C0654f;
import p370w4.AbstractC6917b;
import p391z4.C7146a;

/* renamed from: H4.v */
/* loaded from: classes.dex */
public class C0586v {

    /* renamed from: b */
    public static final a f2021b = new a();

    /* renamed from: a */
    public final C0649a f2022a;

    /* renamed from: H4.v$a */
    public static class a {

        /* renamed from: a */
        public final ConcurrentLinkedQueue f2023a = new ConcurrentLinkedQueue();

        /* renamed from: b */
        public b f2024b;

        /* renamed from: c */
        public b f2025c;

        /* renamed from: H4.v$a$a, reason: collision with other inner class name */
        public class C7169a implements C0649a.e {

            /* renamed from: a */
            public final /* synthetic */ b f2026a;

            public C7169a(b bVar) {
                this.f2026a = bVar;
            }

            @Override // p061I4.C0649a.e
            /* renamed from: a */
            public void mo2187a(Object obj) {
                a.this.f2023a.remove(this.f2026a);
                if (a.this.f2023a.isEmpty()) {
                    return;
                }
                AbstractC6917b.m28354b("SettingsChannel", "The queue becomes empty after removing config generation " + String.valueOf(this.f2026a.f2029a));
            }
        }

        /* renamed from: H4.v$a$b */
        public static class b {

            /* renamed from: c */
            public static int f2028c = Integer.MIN_VALUE;

            /* renamed from: a */
            public final int f2029a;

            /* renamed from: b */
            public final DisplayMetrics f2030b;

            public b(DisplayMetrics displayMetrics) {
                int i7 = f2028c;
                f2028c = i7 + 1;
                this.f2029a = i7;
                this.f2030b = displayMetrics;
            }
        }

        /* renamed from: b */
        public C0649a.e m2333b(b bVar) {
            this.f2023a.add(bVar);
            b bVar2 = this.f2025c;
            this.f2025c = bVar;
            if (bVar2 == null) {
                return null;
            }
            return new C7169a(bVar2);
        }

        /* renamed from: c */
        public b m2334c(int i7) {
            b bVar;
            if (this.f2024b == null) {
                this.f2024b = (b) this.f2023a.poll();
            }
            while (true) {
                bVar = this.f2024b;
                if (bVar == null || bVar.f2029a >= i7) {
                    break;
                }
                this.f2024b = (b) this.f2023a.poll();
            }
            if (bVar == null) {
                AbstractC6917b.m28354b("SettingsChannel", "Cannot find config with generation: " + String.valueOf(i7) + ", after exhausting the queue.");
                return null;
            }
            if (bVar.f2029a == i7) {
                return bVar;
            }
            AbstractC6917b.m28354b("SettingsChannel", "Cannot find config with generation: " + String.valueOf(i7) + ", the oldest config is now: " + String.valueOf(this.f2024b.f2029a));
            return null;
        }
    }

    /* renamed from: H4.v$b */
    public static class b {

        /* renamed from: a */
        public final C0649a f2031a;

        /* renamed from: b */
        public Map f2032b = new HashMap();

        /* renamed from: c */
        public DisplayMetrics f2033c;

        public b(C0649a c0649a) {
            this.f2031a = c0649a;
        }

        /* renamed from: a */
        public void m2336a() {
            AbstractC6917b.m28358f("SettingsChannel", "Sending message: \ntextScaleFactor: " + this.f2032b.get("textScaleFactor") + "\nalwaysUse24HourFormat: " + this.f2032b.get("alwaysUse24HourFormat") + "\nplatformBrightness: " + this.f2032b.get("platformBrightness"));
            DisplayMetrics displayMetrics = this.f2033c;
            if (!C0586v.m2330c() || displayMetrics == null) {
                this.f2031a.m2612c(this.f2032b);
                return;
            }
            a.b bVar = new a.b(displayMetrics);
            C0649a.e m2333b = C0586v.f2021b.m2333b(bVar);
            this.f2032b.put("configurationId", Integer.valueOf(bVar.f2029a));
            this.f2031a.m2613d(this.f2032b, m2333b);
        }

        /* renamed from: b */
        public b m2337b(boolean z6) {
            this.f2032b.put("brieflyShowPassword", Boolean.valueOf(z6));
            return this;
        }

        /* renamed from: c */
        public b m2338c(DisplayMetrics displayMetrics) {
            this.f2033c = displayMetrics;
            return this;
        }

        /* renamed from: d */
        public b m2339d(boolean z6) {
            this.f2032b.put("nativeSpellCheckServiceDefined", Boolean.valueOf(z6));
            return this;
        }

        /* renamed from: e */
        public b m2340e(c cVar) {
            this.f2032b.put("platformBrightness", cVar.f2037a);
            return this;
        }

        /* renamed from: f */
        public b m2341f(float f7) {
            this.f2032b.put("textScaleFactor", Float.valueOf(f7));
            return this;
        }

        /* renamed from: g */
        public b m2342g(boolean z6) {
            this.f2032b.put("alwaysUse24HourFormat", Boolean.valueOf(z6));
            return this;
        }
    }

    /* renamed from: H4.v$c */
    public enum c {
        light("light"),
        dark("dark");


        /* renamed from: a */
        public String f2037a;

        c(String str) {
            this.f2037a = str;
        }
    }

    public C0586v(C7146a c7146a) {
        this.f2022a = new C0649a(c7146a, "flutter/settings", C0654f.f2252a);
    }

    /* renamed from: b */
    public static DisplayMetrics m2329b(int i7) {
        a.b m2334c = f2021b.m2334c(i7);
        if (m2334c == null) {
            return null;
        }
        return m2334c.f2030b;
    }

    /* renamed from: c */
    public static boolean m2330c() {
        return Build.VERSION.SDK_INT >= 34;
    }

    /* renamed from: d */
    public b m2331d() {
        return new b(this.f2022a);
    }
}
