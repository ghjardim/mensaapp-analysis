package p145U4;

import android.net.Uri;
import android.util.Base64;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.storage.C3990f;
import com.google.firebase.storage.C3994j;
import com.google.firebase.storage.C3999o;
import com.google.firebase.storage.C4000p;
import io.flutter.plugins.firebase.core.FlutterFirebasePlugin;
import io.flutter.plugins.firebase.core.FlutterFirebasePluginRegistry;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import org.apache.tika.utils.StringUtils;
import p026D4.InterfaceC0191a;
import p061I4.C0652d;
import p061I4.C0659k;
import p061I4.InterfaceC0651c;
import p145U4.AbstractC2550G;
import p219e3.C4176f;
import p256j$.util.Objects;

/* renamed from: U4.k */
/* loaded from: classes2.dex */
public class C2567k implements FlutterFirebasePlugin, InterfaceC0191a, AbstractC2550G.a {

    /* renamed from: e */
    public static final Map f7528e = new HashMap();

    /* renamed from: f */
    public static final Map f7529f = new HashMap();

    /* renamed from: c */
    public C0659k f7530c;

    /* renamed from: d */
    public InterfaceC0651c f7531d;

    /* renamed from: H */
    public static Map m8665H(Exception exc) {
        HashMap hashMap = new HashMap();
        AbstractC2550G.c m8661c = AbstractC2557a.m8661c(exc);
        hashMap.put("code", m8661c.f7462a);
        hashMap.put("message", m8661c.getMessage());
        return hashMap;
    }

    /* renamed from: L */
    private void m8666L(InterfaceC0651c interfaceC0651c) {
        FlutterFirebasePluginRegistry.registerPlugin("plugins.flutter.io/firebase_storage", this);
        this.f7530c = new C0659k(interfaceC0651c, "plugins.flutter.io/firebase_storage");
        AbstractC2549F.m8552u(interfaceC0651c, this);
        this.f7531d = interfaceC0651c;
    }

    /* renamed from: N */
    public static /* synthetic */ void m8667N(TaskCompletionSource taskCompletionSource) {
        taskCompletionSource.setResult(new HashMap());
    }

    /* renamed from: O */
    public static /* synthetic */ void m8668O(AbstractC2550G.k kVar, Task task) {
        if (task.isSuccessful()) {
            kVar.mo8553a(null);
        } else {
            kVar.mo8554b(AbstractC2557a.m8661c(task.getException()));
        }
    }

    /* renamed from: P */
    public static /* synthetic */ void m8669P(AbstractC2550G.k kVar, Task task) {
        if (task.isSuccessful()) {
            kVar.mo8553a((byte[]) task.getResult());
        } else {
            kVar.mo8554b(AbstractC2557a.m8661c(task.getException()));
        }
    }

    /* renamed from: Q */
    public static /* synthetic */ void m8670Q(AbstractC2550G.k kVar, Task task) {
        if (task.isSuccessful()) {
            kVar.mo8553a(((Uri) task.getResult()).toString());
        } else {
            kVar.mo8554b(AbstractC2557a.m8661c(task.getException()));
        }
    }

    /* renamed from: V */
    public static Map m8671V(C3999o c3999o) {
        if (c3999o == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        if (c3999o.m16048D() != null) {
            hashMap.put("name", c3999o.m16048D());
        }
        if (c3999o.m16053r() != null) {
            hashMap.put("bucket", c3999o.m16053r());
        }
        if (c3999o.m16045A() != null) {
            hashMap.put("generation", c3999o.m16045A());
        }
        if (c3999o.m16047C() != null) {
            hashMap.put("metadataGeneration", c3999o.m16047C());
        }
        hashMap.put("fullPath", c3999o.m16049E());
        hashMap.put("size", Long.valueOf(c3999o.m16050F()));
        hashMap.put("creationTimeMillis", Long.valueOf(c3999o.m16059x()));
        hashMap.put("updatedTimeMillis", Long.valueOf(c3999o.m16051G()));
        if (c3999o.m16046B() != null) {
            hashMap.put("md5Hash", c3999o.m16046B());
        }
        if (c3999o.m16054s() != null) {
            hashMap.put("cacheControl", c3999o.m16054s());
        }
        if (c3999o.m16055t() != null) {
            hashMap.put("contentDisposition", c3999o.m16055t());
        }
        if (c3999o.m16056u() != null) {
            hashMap.put("contentEncoding", c3999o.m16056u());
        }
        if (c3999o.m16057v() != null) {
            hashMap.put("contentLanguage", c3999o.m16057v());
        }
        if (c3999o.m16058w() != null) {
            hashMap.put("contentType", c3999o.m16058w());
        }
        HashMap hashMap2 = new HashMap();
        for (String str : c3999o.m16061z()) {
            if (c3999o.m16060y(str) == null) {
                hashMap2.put(str, StringUtils.EMPTY);
            } else {
                String m16060y = c3999o.m16060y(str);
                Objects.requireNonNull(m16060y);
                hashMap2.put(str, m16060y);
            }
        }
        hashMap.put("customMetadata", hashMap2);
        return hashMap;
    }

    /* renamed from: W */
    private String m8672W(String str, String str2, C0652d.d dVar) {
        C0652d c0652d = new C0652d(this.f7531d, str + "/" + str2);
        c0652d.m2628d(dVar);
        f7528e.put(str2, c0652d);
        f7529f.put(str2, dVar);
        return str2;
    }

    /* renamed from: X */
    private synchronized void m8673X() {
        try {
            for (String str : new ArrayList(f7528e.keySet())) {
                Map map = f7528e;
                C0652d c0652d = (C0652d) map.get(str);
                if (c0652d != null) {
                    c0652d.m2628d(null);
                }
                map.remove(str);
            }
            for (String str2 : new ArrayList(f7529f.keySet())) {
                Map map2 = f7529f;
                C0652d.d dVar = (C0652d.d) map2.get(str2);
                if (dVar != null) {
                    dVar.mo2635a(null);
                }
                map2.remove(str2);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // p026D4.InterfaceC0191a
    /* renamed from: C */
    public void mo782C(InterfaceC0191a.b bVar) {
        m8666L(bVar.m786b());
    }

    /* renamed from: E */
    public AbstractC2550G.f m8680E(C3994j c3994j) {
        ArrayList arrayList = new ArrayList();
        Iterator it = c3994j.m16018b().iterator();
        while (it.hasNext()) {
            arrayList.add(m8682G((C4000p) it.next()));
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = c3994j.m16020d().iterator();
        while (it2.hasNext()) {
            arrayList2.add(m8682G((C4000p) it2.next()));
        }
        return new AbstractC2550G.f.a().m8611b(arrayList).m8612c(c3994j.m16019c()).m8613d(arrayList2).m8610a();
    }

    /* renamed from: F */
    public AbstractC2550G.d m8681F(C3999o c3999o) {
        return new AbstractC2550G.d.a().m8598b(m8671V(c3999o)).m8597a();
    }

    /* renamed from: G */
    public final AbstractC2550G.i m8682G(C4000p c4000p) {
        return new AbstractC2550G.i.a().m8642b(c4000p.m16083j()).m8643c(c4000p.m16090q()).m8644d(c4000p.m16088o()).m8641a();
    }

    /* renamed from: I */
    public C3999o m8683I(AbstractC2550G.g gVar) {
        C3999o.b bVar = new C3999o.b();
        if (gVar.m8619f() != null) {
            bVar.m16069h(gVar.m8619f());
        }
        if (gVar.m8615b() != null) {
            bVar.m16065d(gVar.m8615b());
        }
        if (gVar.m8616c() != null) {
            bVar.m16066e(gVar.m8616c());
        }
        if (gVar.m8617d() != null) {
            bVar.m16067f(gVar.m8617d());
        }
        if (gVar.m8618e() != null) {
            bVar.m16068g(gVar.m8618e());
        }
        Map m8620g = gVar.m8620g();
        if (m8620g != null) {
            for (Map.Entry entry : m8620g.entrySet()) {
                bVar.m16070i((String) entry.getKey(), (String) entry.getValue());
            }
        }
        return bVar.m16062a();
    }

    /* renamed from: J */
    public final C4000p m8684J(AbstractC2550G.h hVar, AbstractC2550G.i iVar) {
        return m8685K(hVar).m16010n(iVar.m8636b());
    }

    /* renamed from: K */
    public final C3990f m8685K(AbstractC2550G.h hVar) {
        return C3990f.m15997f(C4176f.m17518p(hVar.m8629b()), "gs://" + hVar.m8630c());
    }

    /* renamed from: M */
    public final /* synthetic */ void m8686M(TaskCompletionSource taskCompletionSource) {
        C2568l.m8692a();
        taskCompletionSource.setResult(null);
        m8673X();
    }

    /* renamed from: R */
    public final /* synthetic */ void m8687R(AbstractC2550G.k kVar, Task task) {
        if (task.isSuccessful()) {
            kVar.mo8553a(m8681F((C3999o) task.getResult()));
        } else {
            kVar.mo8554b(AbstractC2557a.m8661c(task.getException()));
        }
    }

    /* renamed from: S */
    public final /* synthetic */ void m8688S(AbstractC2550G.k kVar, Task task) {
        if (task.isSuccessful()) {
            kVar.mo8553a(m8680E((C3994j) task.getResult()));
        } else {
            kVar.mo8554b(AbstractC2557a.m8661c(task.getException()));
        }
    }

    /* renamed from: T */
    public final /* synthetic */ void m8689T(AbstractC2550G.k kVar, Task task) {
        if (task.isSuccessful()) {
            kVar.mo8553a(m8680E((C3994j) task.getResult()));
        } else {
            kVar.mo8554b(AbstractC2557a.m8661c(task.getException()));
        }
    }

    /* renamed from: U */
    public final /* synthetic */ void m8690U(AbstractC2550G.k kVar, Task task) {
        if (task.isSuccessful()) {
            kVar.mo8553a(m8681F((C3999o) task.getResult()));
        } else {
            kVar.mo8554b(AbstractC2557a.m8661c(task.getException()));
        }
    }

    /* renamed from: Y */
    public final byte[] m8691Y(String str, int i7) {
        if (i7 == 1) {
            return Base64.decode(str, 0);
        }
        if (i7 != 2) {
            return null;
        }
        return Base64.decode(str, 8);
    }

    @Override // p145U4.AbstractC2550G.a
    /* renamed from: a */
    public void mo8575a(AbstractC2550G.h hVar, AbstractC2550G.i iVar, Long l7, final AbstractC2550G.k kVar) {
        m8685K(hVar).m16010n(iVar.m8636b()).m16084k(l7.longValue()).addOnCompleteListener(new OnCompleteListener() { // from class: U4.e
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                C2567k.m8669P(AbstractC2550G.k.this, task);
            }
        });
    }

    @Override // p145U4.AbstractC2550G.a
    /* renamed from: b */
    public void mo8576b(AbstractC2550G.h hVar, Long l7, AbstractC2550G.k kVar) {
        C2568l m8694e = C2568l.m8694e(l7.intValue());
        if (m8694e == null) {
            kVar.mo8554b(new AbstractC2550G.c("unknown", "Pause operation was called on a task which does not exist.", null));
            return;
        }
        HashMap hashMap = new HashMap();
        try {
            boolean mo15904a0 = m8694e.m8701d().mo15904a0();
            hashMap.put("status", Boolean.valueOf(mo15904a0));
            if (mo15904a0) {
                hashMap.put("snapshot", C2568l.m8696l(m8694e.m8702f()));
            }
            kVar.mo8553a(hashMap);
        } catch (Exception e7) {
            kVar.mo8554b(AbstractC2557a.m8661c(e7));
        }
    }

    @Override // p145U4.AbstractC2550G.a
    /* renamed from: c */
    public void mo8577c(AbstractC2550G.h hVar, AbstractC2550G.i iVar, final AbstractC2550G.k kVar) {
        m8685K(hVar).m16010n(iVar.m8636b()).m16085l().addOnCompleteListener(new OnCompleteListener() { // from class: U4.f
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                C2567k.m8670Q(AbstractC2550G.k.this, task);
            }
        });
    }

    @Override // p145U4.AbstractC2550G.a
    /* renamed from: d */
    public void mo8578d(AbstractC2550G.h hVar, AbstractC2550G.i iVar, AbstractC2550G.g gVar, final AbstractC2550G.k kVar) {
        m8685K(hVar).m16010n(iVar.m8636b()).m16078C(m8683I(gVar)).addOnCompleteListener(new OnCompleteListener() { // from class: U4.g
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                C2567k.this.m8690U(kVar, task);
            }
        });
    }

    @Override // io.flutter.plugins.firebase.core.FlutterFirebasePlugin
    public Task didReinitializeFirebaseCore() {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: U4.b
            @Override // java.lang.Runnable
            public final void run() {
                C2567k.this.m8686M(taskCompletionSource);
            }
        });
        return taskCompletionSource.getTask();
    }

    @Override // p145U4.AbstractC2550G.a
    /* renamed from: e */
    public void mo8579e(AbstractC2550G.h hVar, AbstractC2550G.i iVar, final AbstractC2550G.k kVar) {
        m8685K(hVar).m16010n(iVar.m8636b()).m16081h().addOnCompleteListener(new OnCompleteListener() { // from class: U4.d
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                C2567k.m8668O(AbstractC2550G.k.this, task);
            }
        });
    }

    @Override // p145U4.AbstractC2550G.a
    /* renamed from: f */
    public void mo8580f(AbstractC2550G.h hVar, String str, String str2, AbstractC2550G.k kVar) {
        kVar.mo8553a(m8682G(m8685K(hVar).m16010n(str)));
    }

    @Override // p145U4.AbstractC2550G.a
    /* renamed from: g */
    public void mo8581g(AbstractC2550G.h hVar, AbstractC2550G.i iVar, String str, Long l7, AbstractC2550G.k kVar) {
        C2568l m8693c = C2568l.m8693c(l7.intValue(), m8684J(hVar, iVar), new File(str));
        try {
            String lowerCase = UUID.randomUUID().toString().toLowerCase(Locale.US);
            kVar.mo8553a(m8672W("plugins.flutter.io/firebase_storage/taskEvent", lowerCase, m8693c.m8707n(this.f7530c, lowerCase)));
        } catch (Exception e7) {
            kVar.mo8554b(AbstractC2557a.m8661c(e7));
        }
    }

    @Override // io.flutter.plugins.firebase.core.FlutterFirebasePlugin
    public Task getPluginConstantsForFirebaseApp(C4176f c4176f) {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: U4.c
            @Override // java.lang.Runnable
            public final void run() {
                C2567k.m8667N(TaskCompletionSource.this);
            }
        });
        return taskCompletionSource.getTask();
    }

    @Override // p145U4.AbstractC2550G.a
    /* renamed from: h */
    public void mo8582h(AbstractC2550G.h hVar, Long l7, AbstractC2550G.k kVar) {
        C2568l m8694e = C2568l.m8694e(l7.intValue());
        if (m8694e == null) {
            kVar.mo8554b(new AbstractC2550G.c("unknown", "Resume operation was called on a task which does not exist.", null));
            return;
        }
        try {
            boolean mo15907d0 = m8694e.m8701d().mo15907d0();
            HashMap hashMap = new HashMap();
            hashMap.put("status", Boolean.valueOf(mo15907d0));
            if (mo15907d0) {
                hashMap.put("snapshot", C2568l.m8696l(m8694e.m8702f()));
            }
            kVar.mo8553a(hashMap);
        } catch (Exception e7) {
            kVar.mo8554b(AbstractC2557a.m8661c(e7));
        }
    }

    @Override // p145U4.AbstractC2550G.a
    /* renamed from: i */
    public void mo8583i(AbstractC2550G.h hVar, Long l7, AbstractC2550G.k kVar) {
        m8685K(hVar).m16013q(l7.longValue());
        kVar.mo8553a(null);
    }

    @Override // p145U4.AbstractC2550G.a
    /* renamed from: j */
    public void mo8584j(AbstractC2550G.h hVar, Long l7, AbstractC2550G.k kVar) {
        m8685K(hVar).m16012p(l7.longValue());
        kVar.mo8553a(null);
    }

    @Override // p145U4.AbstractC2550G.a
    /* renamed from: k */
    public void mo8585k(AbstractC2550G.h hVar, AbstractC2550G.i iVar, final AbstractC2550G.k kVar) {
        m8685K(hVar).m16010n(iVar.m8636b()).m16087n().addOnCompleteListener(new OnCompleteListener() { // from class: U4.i
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                C2567k.this.m8687R(kVar, task);
            }
        });
    }

    @Override // p145U4.AbstractC2550G.a
    /* renamed from: l */
    public void mo8586l(AbstractC2550G.h hVar, AbstractC2550G.i iVar, byte[] bArr, AbstractC2550G.g gVar, Long l7, AbstractC2550G.k kVar) {
        C2568l m8698o = C2568l.m8698o(l7.intValue(), m8684J(hVar, iVar), bArr, m8683I(gVar));
        try {
            String lowerCase = UUID.randomUUID().toString().toLowerCase(Locale.US);
            kVar.mo8553a(m8672W("plugins.flutter.io/firebase_storage/taskEvent", lowerCase, m8698o.m8707n(this.f7530c, lowerCase)));
        } catch (Exception e7) {
            kVar.mo8554b(AbstractC2557a.m8661c(e7));
        }
    }

    @Override // p145U4.AbstractC2550G.a
    /* renamed from: m */
    public void mo8587m(AbstractC2550G.h hVar, AbstractC2550G.i iVar, String str, Long l7, AbstractC2550G.g gVar, Long l8, AbstractC2550G.k kVar) {
        C2568l m8698o = C2568l.m8698o(l8.intValue(), m8684J(hVar, iVar), m8691Y(str, l7.intValue()), m8683I(gVar));
        try {
            String lowerCase = UUID.randomUUID().toString().toLowerCase(Locale.US);
            kVar.mo8553a(m8672W("plugins.flutter.io/firebase_storage/taskEvent", lowerCase, m8698o.m8707n(this.f7530c, lowerCase)));
        } catch (Exception e7) {
            kVar.mo8554b(AbstractC2557a.m8661c(e7));
        }
    }

    @Override // p145U4.AbstractC2550G.a
    /* renamed from: n */
    public void mo8588n(AbstractC2550G.h hVar, Long l7, AbstractC2550G.k kVar) {
        C2568l m8694e = C2568l.m8694e(l7.intValue());
        if (m8694e == null) {
            kVar.mo8554b(new AbstractC2550G.c("unknown", "Cancel operation was called on a task which does not exist.", null));
            return;
        }
        try {
            boolean m15929w = m8694e.m8701d().m15929w();
            HashMap hashMap = new HashMap();
            hashMap.put("status", Boolean.valueOf(m15929w));
            if (m15929w) {
                hashMap.put("snapshot", C2568l.m8696l(m8694e.m8702f()));
            }
            kVar.mo8553a(hashMap);
        } catch (Exception e7) {
            kVar.mo8554b(AbstractC2557a.m8661c(e7));
        }
    }

    @Override // p145U4.AbstractC2550G.a
    /* renamed from: o */
    public void mo8589o(AbstractC2550G.h hVar, AbstractC2550G.i iVar, AbstractC2550G.e eVar, final AbstractC2550G.k kVar) {
        C4000p m16010n = m8685K(hVar).m16010n(iVar.m8636b());
        (eVar.m8601c() != null ? m16010n.m16095v(eVar.m8600b().intValue(), eVar.m8601c()) : m16010n.m16094u(eVar.m8600b().intValue())).addOnCompleteListener(new OnCompleteListener() { // from class: U4.j
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                C2567k.this.m8688S(kVar, task);
            }
        });
    }

    @Override // p145U4.AbstractC2550G.a
    /* renamed from: p */
    public void mo8590p(AbstractC2550G.h hVar, AbstractC2550G.i iVar, final AbstractC2550G.k kVar) {
        m8685K(hVar).m16010n(iVar.m8636b()).m16096w().addOnCompleteListener(new OnCompleteListener() { // from class: U4.h
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                C2567k.this.m8689T(kVar, task);
            }
        });
    }

    @Override // p145U4.AbstractC2550G.a
    /* renamed from: q */
    public void mo8591q(AbstractC2550G.h hVar, Long l7, AbstractC2550G.k kVar) {
        m8685K(hVar).m16011o(l7.longValue());
        kVar.mo8553a(null);
    }

    @Override // p145U4.AbstractC2550G.a
    /* renamed from: r */
    public void mo8592r(AbstractC2550G.h hVar, AbstractC2550G.i iVar, String str, AbstractC2550G.g gVar, Long l7, AbstractC2550G.k kVar) {
        C2568l m8699p = C2568l.m8699p(l7.intValue(), m8684J(hVar, iVar), Uri.fromFile(new File(str)), gVar == null ? null : m8683I(gVar));
        try {
            String lowerCase = UUID.randomUUID().toString().toLowerCase(Locale.US);
            kVar.mo8553a(m8672W("plugins.flutter.io/firebase_storage/taskEvent", lowerCase, m8699p.m8707n(this.f7530c, lowerCase)));
        } catch (Exception e7) {
            kVar.mo8554b(AbstractC2557a.m8661c(e7));
        }
    }

    @Override // p145U4.AbstractC2550G.a
    /* renamed from: s */
    public void mo8593s(AbstractC2550G.h hVar, String str, Long l7, AbstractC2550G.k kVar) {
        try {
            m8685K(hVar).m16014r(str, l7.intValue());
            kVar.mo8553a(null);
        } catch (Exception e7) {
            kVar.mo8554b(AbstractC2557a.m8661c(e7));
        }
    }

    @Override // p026D4.InterfaceC0191a
    /* renamed from: y */
    public void mo783y(InterfaceC0191a.b bVar) {
        C2568l.m8692a();
        this.f7530c.m2654e(null);
        AbstractC2549F.m8552u(this.f7531d, null);
        this.f7530c = null;
        this.f7531d = null;
        m8673X();
    }
}
