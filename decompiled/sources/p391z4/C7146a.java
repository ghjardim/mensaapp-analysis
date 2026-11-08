package p391z4;

import android.content.res.AssetManager;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.view.FlutterCallbackInformation;
import java.nio.ByteBuffer;
import java.util.List;
import p012B4.C0055f;
import p061I4.AbstractC0650b;
import p061I4.C0666r;
import p061I4.InterfaceC0651c;
import p221e5.C4203f;
import p370w4.AbstractC6917b;
import p370w4.C6916a;

/* renamed from: z4.a */
/* loaded from: classes.dex */
public class C7146a implements InterfaceC0651c {

    /* renamed from: a */
    public final FlutterJNI f25384a;

    /* renamed from: b */
    public final AssetManager f25385b;

    /* renamed from: c */
    public final long f25386c;

    /* renamed from: d */
    public final C7148c f25387d;

    /* renamed from: e */
    public final InterfaceC0651c f25388e;

    /* renamed from: f */
    public boolean f25389f;

    /* renamed from: g */
    public String f25390g;

    /* renamed from: h */
    public final InterfaceC0651c.a f25391h;

    /* renamed from: z4.a$a */
    public class a implements InterfaceC0651c.a {
        public a() {
        }

        @Override // p061I4.InterfaceC0651c.a
        /* renamed from: a */
        public void mo2615a(ByteBuffer byteBuffer, InterfaceC0651c.b bVar) {
            C7146a.this.f25390g = C0666r.f2272b.mo2638b(byteBuffer);
            C7146a.m29442h(C7146a.this);
        }
    }

    /* renamed from: z4.a$b */
    public static class b {

        /* renamed from: a */
        public final AssetManager f25393a;

        /* renamed from: b */
        public final String f25394b;

        /* renamed from: c */
        public final FlutterCallbackInformation f25395c;

        public b(AssetManager assetManager, String str, FlutterCallbackInformation flutterCallbackInformation) {
            this.f25393a = assetManager;
            this.f25394b = str;
            this.f25395c = flutterCallbackInformation;
        }

        public String toString() {
            return "DartCallback( bundle path: " + this.f25394b + ", library path: " + this.f25395c.callbackLibraryPath + ", function: " + this.f25395c.callbackName + " )";
        }
    }

    /* renamed from: z4.a$d */
    public static class d implements InterfaceC0651c {

        /* renamed from: a */
        public final C7148c f25399a;

        public /* synthetic */ d(C7148c c7148c, a aVar) {
            this(c7148c);
        }

        @Override // p061I4.InterfaceC0651c
        /* renamed from: a */
        public InterfaceC0651c.c mo2618a(InterfaceC0651c.d dVar) {
            return this.f25399a.mo2618a(dVar);
        }

        @Override // p061I4.InterfaceC0651c
        /* renamed from: b */
        public /* synthetic */ InterfaceC0651c.c mo2619b() {
            return AbstractC0650b.m2617a(this);
        }

        @Override // p061I4.InterfaceC0651c
        /* renamed from: c */
        public void mo2620c(String str, InterfaceC0651c.a aVar) {
            this.f25399a.mo2620c(str, aVar);
        }

        @Override // p061I4.InterfaceC0651c
        /* renamed from: d */
        public void mo2621d(String str, ByteBuffer byteBuffer) {
            this.f25399a.mo2622e(str, byteBuffer, null);
        }

        @Override // p061I4.InterfaceC0651c
        /* renamed from: e */
        public void mo2622e(String str, ByteBuffer byteBuffer, InterfaceC0651c.b bVar) {
            this.f25399a.mo2622e(str, byteBuffer, bVar);
        }

        @Override // p061I4.InterfaceC0651c
        /* renamed from: f */
        public void mo2623f(String str, InterfaceC0651c.a aVar, InterfaceC0651c.c cVar) {
            this.f25399a.mo2623f(str, aVar, cVar);
        }

        public d(C7148c c7148c) {
            this.f25399a = c7148c;
        }
    }

    /* renamed from: z4.a$e */
    public interface e {
    }

    public C7146a(FlutterJNI flutterJNI, AssetManager assetManager, long j7) {
        this.f25389f = false;
        a aVar = new a();
        this.f25391h = aVar;
        this.f25384a = flutterJNI;
        this.f25385b = assetManager;
        this.f25386c = j7;
        C7148c c7148c = new C7148c(flutterJNI);
        this.f25387d = c7148c;
        c7148c.mo2620c("flutter/isolate", aVar);
        this.f25388e = new d(c7148c, null);
        if (flutterJNI.isAttached()) {
            this.f25389f = true;
        }
    }

    /* renamed from: h */
    public static /* synthetic */ e m29442h(C7146a c7146a) {
        c7146a.getClass();
        return null;
    }

    @Override // p061I4.InterfaceC0651c
    /* renamed from: a */
    public InterfaceC0651c.c mo2618a(InterfaceC0651c.d dVar) {
        return this.f25388e.mo2618a(dVar);
    }

    @Override // p061I4.InterfaceC0651c
    /* renamed from: b */
    public /* synthetic */ InterfaceC0651c.c mo2619b() {
        return AbstractC0650b.m2617a(this);
    }

    @Override // p061I4.InterfaceC0651c
    /* renamed from: c */
    public void mo2620c(String str, InterfaceC0651c.a aVar) {
        this.f25388e.mo2620c(str, aVar);
    }

    @Override // p061I4.InterfaceC0651c
    /* renamed from: d */
    public void mo2621d(String str, ByteBuffer byteBuffer) {
        this.f25388e.mo2621d(str, byteBuffer);
    }

    @Override // p061I4.InterfaceC0651c
    /* renamed from: e */
    public void mo2622e(String str, ByteBuffer byteBuffer, InterfaceC0651c.b bVar) {
        this.f25388e.mo2622e(str, byteBuffer, bVar);
    }

    @Override // p061I4.InterfaceC0651c
    /* renamed from: f */
    public void mo2623f(String str, InterfaceC0651c.a aVar, InterfaceC0651c.c cVar) {
        this.f25388e.mo2623f(str, aVar, cVar);
    }

    /* renamed from: i */
    public void m29443i(b bVar) {
        if (this.f25389f) {
            AbstractC6917b.m28359g("DartExecutor", "Attempted to run a DartExecutor that is already running.");
            return;
        }
        C4203f m17621j = C4203f.m17621j("DartExecutor#executeDartCallback");
        try {
            AbstractC6917b.m28358f("DartExecutor", "Executing Dart callback: " + bVar);
            FlutterJNI flutterJNI = this.f25384a;
            String str = bVar.f25394b;
            FlutterCallbackInformation flutterCallbackInformation = bVar.f25395c;
            flutterJNI.runBundleAndSnapshotFromLibrary(str, flutterCallbackInformation.callbackName, flutterCallbackInformation.callbackLibraryPath, bVar.f25393a, null, this.f25386c);
            this.f25389f = true;
            if (m17621j != null) {
                m17621j.close();
            }
        } catch (Throwable th) {
            if (m17621j != null) {
                try {
                    m17621j.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    /* renamed from: j */
    public void m29444j(c cVar, List list) {
        if (this.f25389f) {
            AbstractC6917b.m28359g("DartExecutor", "Attempted to run a DartExecutor that is already running.");
            return;
        }
        C4203f m17621j = C4203f.m17621j("DartExecutor#executeDartEntrypoint");
        try {
            AbstractC6917b.m28358f("DartExecutor", "Executing Dart entrypoint: " + cVar);
            this.f25384a.runBundleAndSnapshotFromLibrary(cVar.f25396a, cVar.f25398c, cVar.f25397b, this.f25385b, list, this.f25386c);
            this.f25389f = true;
            if (m17621j != null) {
                m17621j.close();
            }
        } catch (Throwable th) {
            if (m17621j != null) {
                try {
                    m17621j.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    /* renamed from: k */
    public boolean m29445k() {
        return this.f25389f;
    }

    /* renamed from: l */
    public void m29446l() {
        if (this.f25384a.isAttached()) {
            this.f25384a.notifyLowMemoryWarning();
        }
    }

    /* renamed from: m */
    public void m29447m() {
        AbstractC6917b.m28358f("DartExecutor", "Attached to JNI. Registering the platform message handler for this Dart execution context.");
        this.f25384a.setPlatformMessageHandler(this.f25387d);
    }

    /* renamed from: n */
    public void m29448n() {
        AbstractC6917b.m28358f("DartExecutor", "Detached from JNI. De-registering the platform message handler for this Dart execution context.");
        this.f25384a.setPlatformMessageHandler(null);
    }

    /* renamed from: z4.a$c */
    public static class c {

        /* renamed from: a */
        public final String f25396a;

        /* renamed from: b */
        public final String f25397b;

        /* renamed from: c */
        public final String f25398c;

        public c(String str, String str2) {
            this.f25396a = str;
            this.f25397b = null;
            this.f25398c = str2;
        }

        /* renamed from: a */
        public static c m29449a() {
            C0055f m28349c = C6916a.m28346e().m28349c();
            if (m28349c.m140o()) {
                return new c(m28349c.m135j(), "main");
            }
            throw new AssertionError("DartEntrypoints can only be created once a FlutterEngine is created.");
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            c cVar = (c) obj;
            if (this.f25396a.equals(cVar.f25396a)) {
                return this.f25398c.equals(cVar.f25398c);
            }
            return false;
        }

        public int hashCode() {
            return (this.f25396a.hashCode() * 31) + this.f25398c.hashCode();
        }

        public String toString() {
            return "DartEntrypoint( bundle path: " + this.f25396a + ", function: " + this.f25398c + " )";
        }

        public c(String str, String str2, String str3) {
            this.f25396a = str;
            this.f25397b = str2;
            this.f25398c = str3;
        }
    }
}
