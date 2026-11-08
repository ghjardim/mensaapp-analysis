package p391z4;

import io.flutter.embedding.engine.FlutterJNI;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import p061I4.AbstractC0650b;
import p061I4.InterfaceC0651c;
import p221e5.C4203f;
import p370w4.AbstractC6917b;
import p370w4.C6916a;
import p391z4.C7148c;

/* renamed from: z4.c */
/* loaded from: classes.dex */
public class C7148c implements InterfaceC0651c, InterfaceC7151f {

    /* renamed from: a */
    public final FlutterJNI f25406a;

    /* renamed from: b */
    public final Map f25407b;

    /* renamed from: c */
    public Map f25408c;

    /* renamed from: d */
    public final Object f25409d;

    /* renamed from: e */
    public final AtomicBoolean f25410e;

    /* renamed from: f */
    public final Map f25411f;

    /* renamed from: g */
    public int f25412g;

    /* renamed from: h */
    public final d f25413h;

    /* renamed from: i */
    public WeakHashMap f25414i;

    /* renamed from: j */
    public i f25415j;

    /* renamed from: z4.c$b */
    public static class b {

        /* renamed from: a */
        public final ByteBuffer f25416a;

        /* renamed from: b */
        public int f25417b;

        /* renamed from: c */
        public long f25418c;

        public b(ByteBuffer byteBuffer, int i7, long j7) {
            this.f25416a = byteBuffer;
            this.f25417b = i7;
            this.f25418c = j7;
        }
    }

    /* renamed from: z4.c$c */
    public static class c implements d {

        /* renamed from: a */
        public final ExecutorService f25419a;

        public c(ExecutorService executorService) {
            this.f25419a = executorService;
        }

        @Override // p391z4.C7148c.d
        /* renamed from: a */
        public void mo29457a(Runnable runnable) {
            this.f25419a.execute(runnable);
        }
    }

    /* renamed from: z4.c$d */
    public interface d {
        /* renamed from: a */
        void mo29457a(Runnable runnable);
    }

    /* renamed from: z4.c$e */
    public static class e implements i {

        /* renamed from: a */
        public ExecutorService f25420a = C6916a.m28346e().m28348b();

        @Override // p391z4.C7148c.i
        /* renamed from: a */
        public d mo29458a(InterfaceC0651c.d dVar) {
            return dVar.m2624a() ? new h(this.f25420a) : new c(this.f25420a);
        }
    }

    /* renamed from: z4.c$f */
    public static class f {

        /* renamed from: a */
        public final InterfaceC0651c.a f25421a;

        /* renamed from: b */
        public final d f25422b;

        public f(InterfaceC0651c.a aVar, d dVar) {
            this.f25421a = aVar;
            this.f25422b = dVar;
        }
    }

    /* renamed from: z4.c$g */
    public static class g implements InterfaceC0651c.b {

        /* renamed from: a */
        public final FlutterJNI f25423a;

        /* renamed from: b */
        public final int f25424b;

        /* renamed from: c */
        public final AtomicBoolean f25425c = new AtomicBoolean(false);

        public g(FlutterJNI flutterJNI, int i7) {
            this.f25423a = flutterJNI;
            this.f25424b = i7;
        }

        @Override // p061I4.InterfaceC0651c.b
        /* renamed from: a */
        public void mo2616a(ByteBuffer byteBuffer) {
            if (this.f25425c.getAndSet(true)) {
                throw new IllegalStateException("Reply already submitted");
            }
            if (byteBuffer == null) {
                this.f25423a.invokePlatformMessageEmptyResponseCallback(this.f25424b);
            } else {
                this.f25423a.invokePlatformMessageResponseCallback(this.f25424b, byteBuffer, byteBuffer.position());
            }
        }
    }

    /* renamed from: z4.c$h */
    public static class h implements d {

        /* renamed from: a */
        public final ExecutorService f25426a;

        /* renamed from: b */
        public final ConcurrentLinkedQueue f25427b = new ConcurrentLinkedQueue();

        /* renamed from: c */
        public final AtomicBoolean f25428c = new AtomicBoolean(false);

        public h(ExecutorService executorService) {
            this.f25426a = executorService;
        }

        @Override // p391z4.C7148c.d
        /* renamed from: a */
        public void mo29457a(Runnable runnable) {
            this.f25427b.add(runnable);
            this.f25426a.execute(new Runnable() { // from class: z4.d
                @Override // java.lang.Runnable
                public final void run() {
                    C7148c.h.this.m29462e();
                }
            });
        }

        /* renamed from: d, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public final void m29463f() {
            if (this.f25428c.compareAndSet(false, true)) {
                try {
                    Runnable runnable = (Runnable) this.f25427b.poll();
                    if (runnable != null) {
                        runnable.run();
                    }
                } finally {
                    this.f25428c.set(false);
                    if (!this.f25427b.isEmpty()) {
                        this.f25426a.execute(new Runnable() { // from class: z4.e
                            @Override // java.lang.Runnable
                            public final void run() {
                                C7148c.h.this.m29463f();
                            }
                        });
                    }
                }
            }
        }
    }

    /* renamed from: z4.c$i */
    public interface i {
        /* renamed from: a */
        d mo29458a(InterfaceC0651c.d dVar);
    }

    /* renamed from: z4.c$j */
    public static class j implements InterfaceC0651c.c {
        public j() {
        }
    }

    public C7148c(FlutterJNI flutterJNI, i iVar) {
        this.f25407b = new HashMap();
        this.f25408c = new HashMap();
        this.f25409d = new Object();
        this.f25410e = new AtomicBoolean(false);
        this.f25411f = new HashMap();
        this.f25412g = 1;
        this.f25413h = new C7152g();
        this.f25414i = new WeakHashMap();
        this.f25406a = flutterJNI;
        this.f25415j = iVar;
    }

    /* renamed from: k */
    public static void m29451k(Error error) {
        Thread currentThread = Thread.currentThread();
        if (currentThread.getUncaughtExceptionHandler() == null) {
            throw error;
        }
        currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, error);
    }

    @Override // p061I4.InterfaceC0651c
    /* renamed from: a */
    public InterfaceC0651c.c mo2618a(InterfaceC0651c.d dVar) {
        d mo29458a = this.f25415j.mo29458a(dVar);
        j jVar = new j();
        this.f25414i.put(jVar, mo29458a);
        return jVar;
    }

    @Override // p061I4.InterfaceC0651c
    /* renamed from: b */
    public /* synthetic */ InterfaceC0651c.c mo2619b() {
        return AbstractC0650b.m2617a(this);
    }

    @Override // p061I4.InterfaceC0651c
    /* renamed from: c */
    public void mo2620c(String str, InterfaceC0651c.a aVar) {
        mo2623f(str, aVar, null);
    }

    @Override // p061I4.InterfaceC0651c
    /* renamed from: d */
    public void mo2621d(String str, ByteBuffer byteBuffer) {
        AbstractC6917b.m28358f("DartMessenger", "Sending message over channel '" + str + "'");
        mo2622e(str, byteBuffer, null);
    }

    @Override // p061I4.InterfaceC0651c
    /* renamed from: e */
    public void mo2622e(String str, ByteBuffer byteBuffer, InterfaceC0651c.b bVar) {
        C4203f m17621j = C4203f.m17621j("DartMessenger#send on " + str);
        try {
            AbstractC6917b.m28358f("DartMessenger", "Sending message with callback over channel '" + str + "'");
            int i7 = this.f25412g;
            this.f25412g = i7 + 1;
            if (bVar != null) {
                this.f25411f.put(Integer.valueOf(i7), bVar);
            }
            if (byteBuffer == null) {
                this.f25406a.dispatchEmptyPlatformMessage(str, i7);
            } else {
                this.f25406a.dispatchPlatformMessage(str, byteBuffer, byteBuffer.position(), i7);
            }
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

    @Override // p061I4.InterfaceC0651c
    /* renamed from: f */
    public void mo2623f(String str, InterfaceC0651c.a aVar, InterfaceC0651c.c cVar) {
        d dVar;
        if (aVar == null) {
            AbstractC6917b.m28358f("DartMessenger", "Removing handler for channel '" + str + "'");
            synchronized (this.f25409d) {
                this.f25407b.remove(str);
            }
            return;
        }
        if (cVar != null) {
            dVar = (d) this.f25414i.get(cVar);
            if (dVar == null) {
                throw new IllegalArgumentException("Unrecognized TaskQueue, use BinaryMessenger to create your TaskQueue (ex makeBackgroundTaskQueue).");
            }
        } else {
            dVar = null;
        }
        AbstractC6917b.m28358f("DartMessenger", "Setting handler for channel '" + str + "'");
        synchronized (this.f25409d) {
            try {
                this.f25407b.put(str, new f(aVar, dVar));
                List<b> list = (List) this.f25408c.remove(str);
                if (list == null) {
                    return;
                }
                for (b bVar : list) {
                    m29454j(str, (f) this.f25407b.get(str), bVar.f25416a, bVar.f25417b, bVar.f25418c);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p391z4.InterfaceC7151f
    /* renamed from: g */
    public void mo29452g(int i7, ByteBuffer byteBuffer) {
        AbstractC6917b.m28358f("DartMessenger", "Received message reply from Dart.");
        InterfaceC0651c.b bVar = (InterfaceC0651c.b) this.f25411f.remove(Integer.valueOf(i7));
        if (bVar != null) {
            try {
                AbstractC6917b.m28358f("DartMessenger", "Invoking registered callback for reply from Dart.");
                bVar.mo2616a(byteBuffer);
                if (byteBuffer == null || !byteBuffer.isDirect()) {
                    return;
                }
                byteBuffer.limit(0);
            } catch (Error e7) {
                m29451k(e7);
            } catch (Exception e8) {
                AbstractC6917b.m28355c("DartMessenger", "Uncaught exception in binary message reply handler", e8);
            }
        }
    }

    @Override // p391z4.InterfaceC7151f
    /* renamed from: h */
    public void mo29453h(String str, ByteBuffer byteBuffer, int i7, long j7) {
        f fVar;
        boolean z6;
        AbstractC6917b.m28358f("DartMessenger", "Received message from Dart over channel '" + str + "'");
        synchronized (this.f25409d) {
            try {
                fVar = (f) this.f25407b.get(str);
                z6 = this.f25410e.get() && fVar == null;
                if (z6) {
                    if (!this.f25408c.containsKey(str)) {
                        this.f25408c.put(str, new LinkedList());
                    }
                    ((List) this.f25408c.get(str)).add(new b(byteBuffer, i7, j7));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z6) {
            return;
        }
        m29454j(str, fVar, byteBuffer, i7, j7);
    }

    /* renamed from: j */
    public final void m29454j(final String str, final f fVar, final ByteBuffer byteBuffer, final int i7, final long j7) {
        d dVar = fVar != null ? fVar.f25422b : null;
        C4203f.m17617c("PlatformChannel ScheduleHandler on " + str, i7);
        Runnable runnable = new Runnable() { // from class: z4.b
            @Override // java.lang.Runnable
            public final void run() {
                C7148c.this.m29456m(str, i7, fVar, byteBuffer, j7);
            }
        };
        if (dVar == null) {
            dVar = this.f25413h;
        }
        dVar.mo29457a(runnable);
    }

    /* renamed from: l */
    public final void m29455l(f fVar, ByteBuffer byteBuffer, int i7) {
        if (fVar == null) {
            AbstractC6917b.m28358f("DartMessenger", "No registered handler for message. Responding to Dart with empty reply message.");
            this.f25406a.invokePlatformMessageEmptyResponseCallback(i7);
            return;
        }
        try {
            AbstractC6917b.m28358f("DartMessenger", "Deferring to registered handler to process message.");
            fVar.f25421a.mo2615a(byteBuffer, new g(this.f25406a, i7));
        } catch (Error e7) {
            m29451k(e7);
        } catch (Exception e8) {
            AbstractC6917b.m28355c("DartMessenger", "Uncaught exception in binary message listener", e8);
            this.f25406a.invokePlatformMessageEmptyResponseCallback(i7);
        }
    }

    /* renamed from: m */
    public final /* synthetic */ void m29456m(String str, int i7, f fVar, ByteBuffer byteBuffer, long j7) {
        C4203f.m17620h("PlatformChannel ScheduleHandler on " + str, i7);
        try {
            C4203f m17621j = C4203f.m17621j("DartMessenger#handleMessageFromDart on " + str);
            try {
                m29455l(fVar, byteBuffer, i7);
                if (byteBuffer != null && byteBuffer.isDirect()) {
                    byteBuffer.limit(0);
                }
                if (m17621j != null) {
                    m17621j.close();
                }
            } finally {
            }
        } finally {
            this.f25406a.cleanupMessageData(j7);
        }
    }

    public C7148c(FlutterJNI flutterJNI) {
        this(flutterJNI, new e());
    }
}
