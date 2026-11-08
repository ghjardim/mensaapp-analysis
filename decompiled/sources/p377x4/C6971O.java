package p377x4;

import android.util.LongSparseArray;
import android.view.MotionEvent;
import java.util.PriorityQueue;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: x4.O */
/* loaded from: classes.dex */
public final class C6971O {

    /* renamed from: c */
    public static C6971O f24980c;

    /* renamed from: a */
    public final LongSparseArray f24981a = new LongSparseArray();

    /* renamed from: b */
    public final PriorityQueue f24982b = new PriorityQueue();

    /* renamed from: x4.O$a */
    public static class a {

        /* renamed from: b */
        public static final AtomicLong f24983b = new AtomicLong(0);

        /* renamed from: a */
        public final long f24984a;

        public a(long j7) {
            this.f24984a = j7;
        }

        /* renamed from: b */
        public static a m28574b() {
            return m28575c(f24983b.incrementAndGet());
        }

        /* renamed from: c */
        public static a m28575c(long j7) {
            return new a(j7);
        }

        /* renamed from: d */
        public long m28576d() {
            return this.f24984a;
        }
    }

    /* renamed from: a */
    public static C6971O m28570a() {
        if (f24980c == null) {
            f24980c = new C6971O();
        }
        return f24980c;
    }

    /* renamed from: b */
    public MotionEvent m28571b(a aVar) {
        while (!this.f24982b.isEmpty() && ((Long) this.f24982b.peek()).longValue() < aVar.f24984a) {
            this.f24981a.remove(((Long) this.f24982b.poll()).longValue());
        }
        if (!this.f24982b.isEmpty() && ((Long) this.f24982b.peek()).longValue() == aVar.f24984a) {
            this.f24982b.poll();
        }
        MotionEvent motionEvent = (MotionEvent) this.f24981a.get(aVar.f24984a);
        this.f24981a.remove(aVar.f24984a);
        return motionEvent;
    }

    /* renamed from: c */
    public a m28572c(MotionEvent motionEvent) {
        a m28574b = a.m28574b();
        this.f24981a.put(m28574b.f24984a, MotionEvent.obtain(motionEvent));
        this.f24982b.add(Long.valueOf(m28574b.f24984a));
        return m28574b;
    }
}
