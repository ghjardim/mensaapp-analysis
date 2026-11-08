package p323q4;

import android.os.Handler;
import android.os.HandlerThread;

/* renamed from: q4.s */
/* loaded from: classes.dex */
public class C6217s implements InterfaceC6213o {

    /* renamed from: a */
    public final String f22221a;

    /* renamed from: b */
    public final int f22222b;

    /* renamed from: c */
    public HandlerThread f22223c;

    /* renamed from: d */
    public Handler f22224d;

    public C6217s(String str, int i7) {
        this.f22221a = str;
        this.f22222b = i7;
    }

    @Override // p323q4.InterfaceC6213o
    /* renamed from: a */
    public /* synthetic */ void mo25964a(C6207i c6207i, Runnable runnable) {
        AbstractC6212n.m25962a(this, c6207i, runnable);
    }

    @Override // p323q4.InterfaceC6213o
    /* renamed from: b */
    public void mo25965b(C6209k c6209k) {
        this.f22224d.post(c6209k.f22201b);
    }

    @Override // p323q4.InterfaceC6213o
    /* renamed from: c */
    public void mo25966c() {
        HandlerThread handlerThread = this.f22223c;
        if (handlerThread != null) {
            handlerThread.quit();
            this.f22223c = null;
            this.f22224d = null;
        }
    }

    @Override // p323q4.InterfaceC6213o
    public void start() {
        HandlerThread handlerThread = new HandlerThread(this.f22221a, this.f22222b);
        this.f22223c = handlerThread;
        handlerThread.start();
        this.f22224d = new Handler(this.f22223c.getLooper());
    }
}
