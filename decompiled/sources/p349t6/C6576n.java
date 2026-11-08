package p349t6;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;
import p256j$.util.concurrent.ConcurrentHashMap;
import p333r6.InterfaceC6301a;
import p333r6.InterfaceC6304d;

/* renamed from: t6.n */
/* loaded from: classes2.dex */
public class C6576n implements InterfaceC6301a {

    /* renamed from: a */
    public volatile boolean f23580a = false;

    /* renamed from: b */
    public final Map f23581b = new ConcurrentHashMap();

    /* renamed from: c */
    public final LinkedBlockingQueue f23582c = new LinkedBlockingQueue();

    @Override // p333r6.InterfaceC6301a
    /* renamed from: a */
    public synchronized InterfaceC6304d mo26355a(String str) {
        C6575m c6575m;
        c6575m = (C6575m) this.f23581b.get(str);
        if (c6575m == null) {
            c6575m = new C6575m(str, this.f23582c, this.f23580a);
            this.f23581b.put(str, c6575m);
        }
        return c6575m;
    }

    /* renamed from: b */
    public void m27309b() {
        this.f23581b.clear();
        this.f23582c.clear();
    }

    /* renamed from: c */
    public LinkedBlockingQueue m27310c() {
        return this.f23582c;
    }

    /* renamed from: d */
    public List m27311d() {
        return new ArrayList(this.f23581b.values());
    }

    /* renamed from: e */
    public void m27312e() {
        this.f23580a = true;
    }
}
