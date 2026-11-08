package p064J0;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Surface;
import p259j0.AbstractC5332a;
import p259j0.AbstractC5341j;
import p259j0.AbstractC5346o;
import p259j0.RunnableC5340i;

/* renamed from: J0.o */
/* loaded from: classes.dex */
public final class C0692o extends Surface {

    /* renamed from: d */
    public static int f2395d;

    /* renamed from: e */
    public static boolean f2396e;

    /* renamed from: a */
    public final boolean f2397a;

    /* renamed from: b */
    public final b f2398b;

    /* renamed from: c */
    public boolean f2399c;

    /* renamed from: J0.o$b */
    public static class b extends HandlerThread implements Handler.Callback {

        /* renamed from: a */
        public RunnableC5340i f2400a;

        /* renamed from: b */
        public Handler f2401b;

        /* renamed from: c */
        public Error f2402c;

        /* renamed from: d */
        public RuntimeException f2403d;

        /* renamed from: e */
        public C0692o f2404e;

        public b() {
            super("ExoPlayer:PlaceholderSurface");
        }

        /* renamed from: a */
        public C0692o m2915a(int i7) {
            boolean z6;
            start();
            this.f2401b = new Handler(getLooper(), this);
            this.f2400a = new RunnableC5340i(this.f2401b);
            synchronized (this) {
                z6 = false;
                this.f2401b.obtainMessage(1, i7, 0).sendToTarget();
                while (this.f2404e == null && this.f2403d == null && this.f2402c == null) {
                    try {
                        wait();
                    } catch (InterruptedException unused) {
                        z6 = true;
                    }
                }
            }
            if (z6) {
                Thread.currentThread().interrupt();
            }
            RuntimeException runtimeException = this.f2403d;
            if (runtimeException != null) {
                throw runtimeException;
            }
            Error error = this.f2402c;
            if (error == null) {
                return (C0692o) AbstractC5332a.m21800e(this.f2404e);
            }
            throw error;
        }

        /* renamed from: b */
        public final void m2916b(int i7) {
            AbstractC5332a.m21800e(this.f2400a);
            this.f2400a.m21837h(i7);
            this.f2404e = new C0692o(this, this.f2400a.m21836g(), i7 != 0);
        }

        /* renamed from: c */
        public void m2917c() {
            AbstractC5332a.m21800e(this.f2401b);
            this.f2401b.sendEmptyMessage(2);
        }

        /* renamed from: d */
        public final void m2918d() {
            AbstractC5332a.m21800e(this.f2400a);
            this.f2400a.m21838i();
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i7 = message.what;
            try {
                if (i7 != 1) {
                    if (i7 != 2) {
                        return true;
                    }
                    try {
                        m2918d();
                    } finally {
                        try {
                            return true;
                        } finally {
                        }
                    }
                    return true;
                }
                try {
                    m2916b(message.arg1);
                    synchronized (this) {
                        notify();
                    }
                } catch (AbstractC5341j.a e7) {
                    AbstractC5346o.m21863d("PlaceholderSurface", "Failed to initialize placeholder surface", e7);
                    this.f2403d = new IllegalStateException(e7);
                    synchronized (this) {
                        notify();
                    }
                } catch (Error e8) {
                    AbstractC5346o.m21863d("PlaceholderSurface", "Failed to initialize placeholder surface", e8);
                    this.f2402c = e8;
                    synchronized (this) {
                        notify();
                    }
                } catch (RuntimeException e9) {
                    AbstractC5346o.m21863d("PlaceholderSurface", "Failed to initialize placeholder surface", e9);
                    this.f2403d = e9;
                    synchronized (this) {
                        notify();
                    }
                }
                return true;
            } catch (Throwable th) {
                synchronized (this) {
                    notify();
                    throw th;
                }
            }
        }
    }

    /* renamed from: a */
    public static int m2912a(Context context) {
        if (AbstractC5341j.m21842d(context)) {
            return AbstractC5341j.m21843e() ? 1 : 2;
        }
        return 0;
    }

    /* renamed from: b */
    public static synchronized boolean m2913b(Context context) {
        boolean z6;
        synchronized (C0692o.class) {
            try {
                if (!f2396e) {
                    f2395d = m2912a(context);
                    f2396e = true;
                }
                z6 = f2395d != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z6;
    }

    /* renamed from: c */
    public static C0692o m2914c(Context context, boolean z6) {
        AbstractC5332a.m21802g(!z6 || m2913b(context));
        return new b().m2915a(z6 ? f2395d : 0);
    }

    @Override // android.view.Surface
    public void release() {
        super.release();
        synchronized (this.f2398b) {
            try {
                if (!this.f2399c) {
                    this.f2398b.m2917c();
                    this.f2399c = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public C0692o(b bVar, SurfaceTexture surfaceTexture, boolean z6) {
        super(surfaceTexture);
        this.f2398b = bVar;
        this.f2397a = z6;
    }
}
