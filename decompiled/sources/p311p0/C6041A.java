package p311p0;

import android.media.AudioTimestamp;
import android.media.AudioTrack;

/* renamed from: p0.A */
/* loaded from: classes.dex */
public final class C6041A {

    /* renamed from: a */
    public final a f21486a;

    /* renamed from: b */
    public int f21487b;

    /* renamed from: c */
    public long f21488c;

    /* renamed from: d */
    public long f21489d;

    /* renamed from: e */
    public long f21490e;

    /* renamed from: f */
    public long f21491f;

    /* renamed from: p0.A$a */
    public static final class a {

        /* renamed from: a */
        public final AudioTrack f21492a;

        /* renamed from: b */
        public final AudioTimestamp f21493b = new AudioTimestamp();

        /* renamed from: c */
        public long f21494c;

        /* renamed from: d */
        public long f21495d;

        /* renamed from: e */
        public long f21496e;

        /* renamed from: f */
        public boolean f21497f;

        /* renamed from: g */
        public long f21498g;

        public a(AudioTrack audioTrack) {
            this.f21492a = audioTrack;
        }

        /* renamed from: a */
        public void m25114a() {
            this.f21497f = true;
        }

        /* renamed from: b */
        public long m25115b() {
            return this.f21496e;
        }

        /* renamed from: c */
        public long m25116c() {
            return this.f21493b.nanoTime / 1000;
        }

        /* renamed from: d */
        public boolean m25117d() {
            boolean timestamp = this.f21492a.getTimestamp(this.f21493b);
            if (timestamp) {
                long j7 = this.f21493b.framePosition;
                long j8 = this.f21495d;
                if (j8 > j7) {
                    if (this.f21497f) {
                        this.f21498g += j8;
                        this.f21497f = false;
                    } else {
                        this.f21494c++;
                    }
                }
                this.f21495d = j7;
                this.f21496e = j7 + this.f21498g + (this.f21494c << 32);
            }
            return timestamp;
        }
    }

    public C6041A(AudioTrack audioTrack) {
        this.f21486a = new a(audioTrack);
        m25112h();
    }

    /* renamed from: a */
    public void m25105a() {
        if (this.f21487b == 4) {
            m25112h();
        }
    }

    /* renamed from: b */
    public void m25106b() {
        a aVar = this.f21486a;
        if (aVar != null) {
            aVar.m25114a();
        }
    }

    /* renamed from: c */
    public long m25107c() {
        a aVar = this.f21486a;
        if (aVar != null) {
            return aVar.m25115b();
        }
        return -1L;
    }

    /* renamed from: d */
    public long m25108d() {
        a aVar = this.f21486a;
        if (aVar != null) {
            return aVar.m25116c();
        }
        return -9223372036854775807L;
    }

    /* renamed from: e */
    public boolean m25109e() {
        return this.f21487b == 2;
    }

    /* renamed from: f */
    public boolean m25110f(long j7) {
        a aVar = this.f21486a;
        if (aVar == null || j7 - this.f21490e < this.f21489d) {
            return false;
        }
        this.f21490e = j7;
        boolean m25117d = aVar.m25117d();
        int i7 = this.f21487b;
        if (i7 != 0) {
            if (i7 != 1) {
                if (i7 != 2) {
                    if (i7 != 3) {
                        if (i7 != 4) {
                            throw new IllegalStateException();
                        }
                    } else if (m25117d) {
                        m25112h();
                    }
                } else if (!m25117d) {
                    m25112h();
                }
            } else if (!m25117d) {
                m25112h();
            } else if (this.f21486a.m25115b() > this.f21491f) {
                m25113i(2);
            }
        } else if (m25117d) {
            if (this.f21486a.m25116c() < this.f21488c) {
                return false;
            }
            this.f21491f = this.f21486a.m25115b();
            m25113i(1);
        } else if (j7 - this.f21488c > 500000) {
            m25113i(3);
        }
        return m25117d;
    }

    /* renamed from: g */
    public void m25111g() {
        m25113i(4);
    }

    /* renamed from: h */
    public void m25112h() {
        if (this.f21486a != null) {
            m25113i(0);
        }
    }

    /* renamed from: i */
    public final void m25113i(int i7) {
        this.f21487b = i7;
        if (i7 == 0) {
            this.f21490e = 0L;
            this.f21491f = -1L;
            this.f21488c = System.nanoTime() / 1000;
            this.f21489d = 10000L;
            return;
        }
        if (i7 == 1) {
            this.f21489d = 10000L;
            return;
        }
        if (i7 == 2 || i7 == 3) {
            this.f21489d = 10000000L;
        } else {
            if (i7 != 4) {
                throw new IllegalStateException();
            }
            this.f21489d = 500000L;
        }
    }
}
