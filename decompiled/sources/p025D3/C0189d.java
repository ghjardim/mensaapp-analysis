package p025D3;

import java.io.Writer;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import p011B3.C0044c;
import p011B3.InterfaceC0042a;
import p011B3.InterfaceC0046e;
import p011B3.InterfaceC0047f;
import p011B3.InterfaceC0048g;
import p011B3.InterfaceC0049h;
import p018C3.InterfaceC0087a;
import p018C3.InterfaceC0088b;
import p256j$.util.DesugarTimeZone;

/* renamed from: D3.d */
/* loaded from: classes.dex */
public final class C0189d implements InterfaceC0088b {

    /* renamed from: e */
    public static final InterfaceC0046e f761e = new InterfaceC0046e() { // from class: D3.a
        @Override // p011B3.InterfaceC0043b
        /* renamed from: a */
        public final void mo105a(Object obj, Object obj2) {
            C0189d.m758l(obj, (InterfaceC0047f) obj2);
        }
    };

    /* renamed from: f */
    public static final InterfaceC0048g f762f = new InterfaceC0048g() { // from class: D3.b
        @Override // p011B3.InterfaceC0043b
        /* renamed from: a */
        public final void mo105a(Object obj, Object obj2) {
            ((InterfaceC0049h) obj2).mo115d((String) obj);
        }
    };

    /* renamed from: g */
    public static final InterfaceC0048g f763g = new InterfaceC0048g() { // from class: D3.c
        @Override // p011B3.InterfaceC0043b
        /* renamed from: a */
        public final void mo105a(Object obj, Object obj2) {
            C0189d.m760n((Boolean) obj, (InterfaceC0049h) obj2);
        }
    };

    /* renamed from: h */
    public static final b f764h = new b(null);

    /* renamed from: a */
    public final Map f765a = new HashMap();

    /* renamed from: b */
    public final Map f766b = new HashMap();

    /* renamed from: c */
    public InterfaceC0046e f767c = f761e;

    /* renamed from: d */
    public boolean f768d = false;

    /* renamed from: D3.d$a */
    public class a implements InterfaceC0042a {
        public a() {
        }

        @Override // p011B3.InterfaceC0042a
        /* renamed from: a */
        public void mo104a(Object obj, Writer writer) {
            C0190e c0190e = new C0190e(writer, C0189d.this.f765a, C0189d.this.f766b, C0189d.this.f767c, C0189d.this.f768d);
            c0190e.m769h(obj, false);
            c0190e.m777p();
        }
    }

    /* renamed from: D3.d$b */
    public static final class b implements InterfaceC0048g {

        /* renamed from: a */
        public static final DateFormat f770a;

        static {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
            f770a = simpleDateFormat;
            simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
        }

        public b() {
        }

        @Override // p011B3.InterfaceC0043b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo105a(Date date, InterfaceC0049h interfaceC0049h) {
            interfaceC0049h.mo115d(f770a.format(date));
        }

        public /* synthetic */ b(a aVar) {
            this();
        }
    }

    public C0189d() {
        m765p(String.class, f762f);
        m765p(Boolean.class, f763g);
        m765p(Date.class, f764h);
    }

    /* renamed from: l */
    public static /* synthetic */ void m758l(Object obj, InterfaceC0047f interfaceC0047f) {
        throw new C0044c("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
    }

    /* renamed from: n */
    public static /* synthetic */ void m760n(Boolean bool, InterfaceC0049h interfaceC0049h) {
        interfaceC0049h.mo116e(bool.booleanValue());
    }

    /* renamed from: i */
    public InterfaceC0042a m761i() {
        return new a();
    }

    /* renamed from: j */
    public C0189d m762j(InterfaceC0087a interfaceC0087a) {
        interfaceC0087a.mo235a(this);
        return this;
    }

    /* renamed from: k */
    public C0189d m763k(boolean z6) {
        this.f768d = z6;
        return this;
    }

    @Override // p018C3.InterfaceC0088b
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public C0189d mo236a(Class cls, InterfaceC0046e interfaceC0046e) {
        this.f765a.put(cls, interfaceC0046e);
        this.f766b.remove(cls);
        return this;
    }

    /* renamed from: p */
    public C0189d m765p(Class cls, InterfaceC0048g interfaceC0048g) {
        this.f766b.put(cls, interfaceC0048g);
        this.f765a.remove(cls);
        return this;
    }
}
