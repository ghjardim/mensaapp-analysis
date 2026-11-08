package p370w4;

import io.flutter.embedding.engine.FlutterJNI;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import p005A4.InterfaceC0021a;
import p012B4.C0055f;

/* renamed from: w4.a */
/* loaded from: classes.dex */
public final class C6916a {

    /* renamed from: d */
    public static C6916a f24784d;

    /* renamed from: e */
    public static boolean f24785e;

    /* renamed from: a */
    public C0055f f24786a;

    /* renamed from: b */
    public FlutterJNI.C4658c f24787b;

    /* renamed from: c */
    public ExecutorService f24788c;

    /* renamed from: w4.a$b */
    public static final class b {

        /* renamed from: a */
        public C0055f f24789a;

        /* renamed from: b */
        public FlutterJNI.C4658c f24790b;

        /* renamed from: c */
        public ExecutorService f24791c;

        /* renamed from: w4.a$b$a */
        public class a implements ThreadFactory {

            /* renamed from: a */
            public int f24792a;

            public a() {
                this.f24792a = 0;
            }

            @Override // java.util.concurrent.ThreadFactory
            public Thread newThread(Runnable runnable) {
                Thread thread = new Thread(runnable);
                StringBuilder sb = new StringBuilder();
                sb.append("flutter-worker-");
                int i7 = this.f24792a;
                this.f24792a = i7 + 1;
                sb.append(i7);
                thread.setName(sb.toString());
                return thread;
            }
        }

        /* renamed from: a */
        public C6916a m28351a() {
            m28352b();
            return new C6916a(this.f24789a, null, this.f24790b, this.f24791c);
        }

        /* renamed from: b */
        public final void m28352b() {
            if (this.f24790b == null) {
                this.f24790b = new FlutterJNI.C4658c();
            }
            if (this.f24791c == null) {
                this.f24791c = Executors.newCachedThreadPool(new a());
            }
            if (this.f24789a == null) {
                this.f24789a = new C0055f(this.f24790b.m20192a(), this.f24791c);
            }
        }
    }

    /* renamed from: e */
    public static C6916a m28346e() {
        f24785e = true;
        if (f24784d == null) {
            f24784d = new b().m28351a();
        }
        return f24784d;
    }

    /* renamed from: a */
    public InterfaceC0021a m28347a() {
        return null;
    }

    /* renamed from: b */
    public ExecutorService m28348b() {
        return this.f24788c;
    }

    /* renamed from: c */
    public C0055f m28349c() {
        return this.f24786a;
    }

    /* renamed from: d */
    public FlutterJNI.C4658c m28350d() {
        return this.f24787b;
    }

    public C6916a(C0055f c0055f, InterfaceC0021a interfaceC0021a, FlutterJNI.C4658c c4658c, ExecutorService executorService) {
        this.f24786a = c0055f;
        this.f24787b = c4658c;
        this.f24788c = executorService;
    }
}
