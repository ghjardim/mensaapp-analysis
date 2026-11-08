package p123R3;

import android.content.Context;
import android.util.Base64OutputStream;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.io.ByteArrayOutputStream;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.zip.GZIPOutputStream;
import org.apache.tika.utils.StringUtils;
import org.json.JSONArray;
import org.json.JSONObject;
import p021D.AbstractC0114v;
import p123R3.InterfaceC2257j;
import p137T3.InterfaceC2447b;
import p212d4.InterfaceC4127i;
import p219e3.C4176f;
import p251i3.InterfaceC4540a;
import p362v3.C6751F;
import p362v3.C6755c;
import p362v3.C6770r;
import p362v3.InterfaceC6757e;
import p362v3.InterfaceC6760h;

/* renamed from: R3.f */
/* loaded from: classes.dex */
public class C2253f implements InterfaceC2256i, InterfaceC2257j {

    /* renamed from: a */
    public final InterfaceC2447b f6866a;

    /* renamed from: b */
    public final Context f6867b;

    /* renamed from: c */
    public final InterfaceC2447b f6868c;

    /* renamed from: d */
    public final Set f6869d;

    /* renamed from: e */
    public final Executor f6870e;

    public C2253f(final Context context, final String str, Set set, InterfaceC2447b interfaceC2447b, Executor executor) {
        this(new InterfaceC2447b() { // from class: R3.c
            @Override // p137T3.InterfaceC2447b
            public final Object get() {
                C2258k m7670j;
                m7670j = C2253f.m7670j(context, str);
                return m7670j;
            }
        }, set, executor, interfaceC2447b, context);
    }

    /* renamed from: g */
    public static C6755c m7668g() {
        final C6751F m27705a = C6751F.m27705a(InterfaceC4540a.class, Executor.class);
        return C6755c.m27719d(C2253f.class, InterfaceC2256i.class, InterfaceC2257j.class).m27737b(C6770r.m27798k(Context.class)).m27737b(C6770r.m27798k(C4176f.class)).m27737b(C6770r.m27801n(InterfaceC2254g.class)).m27737b(C6770r.m27800m(InterfaceC4127i.class)).m27737b(C6770r.m27799l(m27705a)).m27741f(new InterfaceC6760h() { // from class: R3.b
            @Override // p362v3.InterfaceC6760h
            /* renamed from: a */
            public final Object mo1598a(InterfaceC6757e interfaceC6757e) {
                C2253f m7669h;
                m7669h = C2253f.m7669h(C6751F.this, interfaceC6757e);
                return m7669h;
            }
        }).m27739d();
    }

    /* renamed from: h */
    public static /* synthetic */ C2253f m7669h(C6751F c6751f, InterfaceC6757e interfaceC6757e) {
        return new C2253f((Context) interfaceC6757e.mo27707a(Context.class), ((C4176f) interfaceC6757e.mo27707a(C4176f.class)).m17535s(), interfaceC6757e.mo27711e(InterfaceC2254g.class), interfaceC6757e.mo27708b(InterfaceC4127i.class), (Executor) interfaceC6757e.mo27715i(c6751f));
    }

    /* renamed from: j */
    public static /* synthetic */ C2258k m7670j(Context context, String str) {
        return new C2258k(context, str);
    }

    @Override // p123R3.InterfaceC2256i
    /* renamed from: a */
    public Task mo7671a() {
        return !AbstractC0114v.m284a(this.f6867b) ? Tasks.forResult(StringUtils.EMPTY) : Tasks.call(this.f6870e, new Callable() { // from class: R3.d
            @Override // java.util.concurrent.Callable
            public final Object call() {
                String m7673i;
                m7673i = C2253f.this.m7673i();
                return m7673i;
            }
        });
    }

    @Override // p123R3.InterfaceC2257j
    /* renamed from: b */
    public synchronized InterfaceC2257j.a mo7672b(String str) {
        long currentTimeMillis = System.currentTimeMillis();
        C2258k c2258k = (C2258k) this.f6866a.get();
        if (!c2258k.m7687i(currentTimeMillis)) {
            return InterfaceC2257j.a.NONE;
        }
        c2258k.m7685g();
        return InterfaceC2257j.a.GLOBAL;
    }

    /* renamed from: i */
    public final /* synthetic */ String m7673i() {
        String byteArrayOutputStream;
        synchronized (this) {
            try {
                C2258k c2258k = (C2258k) this.f6866a.get();
                List m7681c = c2258k.m7681c();
                c2258k.m7680b();
                JSONArray jSONArray = new JSONArray();
                for (int i7 = 0; i7 < m7681c.size(); i7++) {
                    AbstractC2259l abstractC2259l = (AbstractC2259l) m7681c.get(i7);
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("agent", abstractC2259l.mo7663c());
                    jSONObject.put("dates", new JSONArray((Collection) abstractC2259l.mo7662b()));
                    jSONArray.put(jSONObject);
                }
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("heartbeats", jSONArray);
                jSONObject2.put("version", "2");
                ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                Base64OutputStream base64OutputStream = new Base64OutputStream(byteArrayOutputStream2, 11);
                try {
                    GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(base64OutputStream);
                    try {
                        gZIPOutputStream.write(jSONObject2.toString().getBytes("UTF-8"));
                        gZIPOutputStream.close();
                        base64OutputStream.close();
                        byteArrayOutputStream = byteArrayOutputStream2.toString("UTF-8");
                    } finally {
                    }
                } finally {
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return byteArrayOutputStream;
    }

    /* renamed from: k */
    public final /* synthetic */ Void m7674k() {
        synchronized (this) {
            ((C2258k) this.f6866a.get()).m7689k(System.currentTimeMillis(), ((InterfaceC4127i) this.f6868c.get()).mo17307a());
        }
        return null;
    }

    /* renamed from: l */
    public Task m7675l() {
        return this.f6869d.size() <= 0 ? Tasks.forResult(null) : !AbstractC0114v.m284a(this.f6867b) ? Tasks.forResult(null) : Tasks.call(this.f6870e, new Callable() { // from class: R3.e
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Void m7674k;
                m7674k = C2253f.this.m7674k();
                return m7674k;
            }
        });
    }

    public C2253f(InterfaceC2447b interfaceC2447b, Set set, Executor executor, InterfaceC2447b interfaceC2447b2, Context context) {
        this.f6866a = interfaceC2447b;
        this.f6869d = set;
        this.f6870e = executor;
        this.f6868c = interfaceC2447b2;
        this.f6867b = context;
    }
}
