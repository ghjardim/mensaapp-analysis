package p264j5;

import com.google.android.gms.common.api.C3643a;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import org.apache.tika.metadata.ClimateForcast;
import p171Y2.AbstractC2932o;
import p206c6.C3616d;
import p281l5.InterfaceC5541c;

/* renamed from: j5.r */
/* loaded from: classes2.dex */
public class C5389r {

    /* renamed from: a */
    public final d f19208a;

    /* renamed from: b */
    public final InterfaceC5541c f19209b;

    /* renamed from: c */
    public int f19210c = 65535;

    /* renamed from: d */
    public final c f19211d = new c(0, 65535, null);

    /* renamed from: j5.r$b */
    public interface b {
        /* renamed from: b */
        void m22276b(int i7);
    }

    /* renamed from: j5.r$c */
    public final class c {

        /* renamed from: b */
        public Runnable f19213b;

        /* renamed from: c */
        public final int f19214c;

        /* renamed from: d */
        public int f19215d;

        /* renamed from: e */
        public int f19216e;

        /* renamed from: f */
        public final b f19217f;

        /* renamed from: a */
        public final C3616d f19212a = new C3616d();

        /* renamed from: g */
        public boolean f19218g = false;

        public c(int i7, int i8, b bVar) {
            this.f19214c = i7;
            this.f19215d = i8;
            this.f19217f = bVar;
        }

        /* renamed from: a */
        public void m22277a(int i7) {
            this.f19216e += i7;
        }

        /* renamed from: b */
        public int m22278b() {
            return this.f19216e;
        }

        /* renamed from: c */
        public void m22279c() {
            this.f19216e = 0;
        }

        /* renamed from: d */
        public void m22280d(C3616d c3616d, int i7, boolean z6) {
            this.f19212a.mo14482s(c3616d, i7);
            this.f19218g |= z6;
        }

        /* renamed from: e */
        public boolean m22281e() {
            return this.f19212a.m14618c0() > 0;
        }

        /* renamed from: f */
        public int m22282f(int i7) {
            if (i7 <= 0 || C3643a.e.API_PRIORITY_OTHER - i7 >= this.f19215d) {
                int i8 = this.f19215d + i7;
                this.f19215d = i8;
                return i8;
            }
            throw new IllegalArgumentException("Window size overflow for stream: " + this.f19214c);
        }

        /* renamed from: g */
        public int m22283g() {
            return Math.max(0, Math.min(this.f19215d, (int) this.f19212a.m14618c0()));
        }

        /* renamed from: h */
        public int m22284h() {
            return m22283g() - this.f19216e;
        }

        /* renamed from: i */
        public int m22285i() {
            return this.f19215d;
        }

        /* renamed from: j */
        public int m22286j() {
            return Math.min(this.f19215d, C5389r.this.f19211d.m22285i());
        }

        /* renamed from: k */
        public void m22287k(C3616d c3616d, int i7, boolean z6) {
            do {
                int min = Math.min(i7, C5389r.this.f19209b.mo22122p0());
                int i8 = -min;
                C5389r.this.f19211d.m22282f(i8);
                m22282f(i8);
                try {
                    C5389r.this.f19209b.mo22121g0(c3616d.m14618c0() == ((long) min) && z6, this.f19214c, c3616d, min);
                    this.f19217f.m22276b(min);
                    i7 -= min;
                } catch (IOException e7) {
                    throw new RuntimeException(e7);
                }
            } while (i7 > 0);
        }

        /* renamed from: l */
        public int m22288l(int i7, e eVar) {
            Runnable runnable;
            int min = Math.min(i7, m22286j());
            int i8 = 0;
            while (m22281e() && min > 0) {
                if (min >= this.f19212a.m14618c0()) {
                    i8 += (int) this.f19212a.m14618c0();
                    C3616d c3616d = this.f19212a;
                    m22287k(c3616d, (int) c3616d.m14618c0(), this.f19218g);
                } else {
                    i8 += min;
                    m22287k(this.f19212a, min, false);
                }
                eVar.m22290b();
                min = Math.min(i7 - i8, m22286j());
            }
            if (!m22281e() && (runnable = this.f19213b) != null) {
                runnable.run();
                this.f19213b = null;
            }
            return i8;
        }
    }

    /* renamed from: j5.r$d */
    public interface d {
        /* renamed from: a */
        c[] mo22212a();
    }

    /* renamed from: j5.r$e */
    public static final class e {

        /* renamed from: a */
        public int f19220a;

        public e() {
        }

        /* renamed from: a */
        public boolean m22289a() {
            return this.f19220a > 0;
        }

        /* renamed from: b */
        public void m22290b() {
            this.f19220a++;
        }
    }

    public C5389r(d dVar, InterfaceC5541c interfaceC5541c) {
        this.f19208a = (d) AbstractC2932o.m10573p(dVar, "transport");
        this.f19209b = (InterfaceC5541c) AbstractC2932o.m10573p(interfaceC5541c, "frameWriter");
    }

    /* renamed from: c */
    public c m22270c(b bVar, int i7) {
        return new c(i7, this.f19210c, (b) AbstractC2932o.m10573p(bVar, "stream"));
    }

    /* renamed from: d */
    public void m22271d(boolean z6, c cVar, C3616d c3616d, boolean z7) {
        AbstractC2932o.m10573p(c3616d, ClimateForcast.SOURCE);
        int m22286j = cVar.m22286j();
        boolean m22281e = cVar.m22281e();
        int m14618c0 = (int) c3616d.m14618c0();
        if (m22281e || m22286j < m14618c0) {
            if (!m22281e && m22286j > 0) {
                cVar.m22287k(c3616d, m22286j, false);
            }
            cVar.m22280d(c3616d, (int) c3616d.m14618c0(), z6);
        } else {
            cVar.m22287k(c3616d, m14618c0, z6);
        }
        if (z7) {
            m22272e();
        }
    }

    /* renamed from: e */
    public void m22272e() {
        try {
            this.f19209b.flush();
        } catch (IOException e7) {
            throw new RuntimeException(e7);
        }
    }

    /* renamed from: f */
    public boolean m22273f(int i7) {
        if (i7 < 0) {
            throw new IllegalArgumentException("Invalid initial window size: " + i7);
        }
        int i8 = i7 - this.f19210c;
        this.f19210c = i7;
        for (c cVar : this.f19208a.mo22212a()) {
            cVar.m22282f(i8);
        }
        return i8 > 0;
    }

    /* renamed from: g */
    public int m22274g(c cVar, int i7) {
        if (cVar == null) {
            int m22282f = this.f19211d.m22282f(i7);
            m22275h();
            return m22282f;
        }
        int m22282f2 = cVar.m22282f(i7);
        e eVar = new e();
        cVar.m22288l(cVar.m22286j(), eVar);
        if (eVar.m22289a()) {
            m22272e();
        }
        return m22282f2;
    }

    /* renamed from: h */
    public void m22275h() {
        int i7;
        c[] mo22212a = this.f19208a.mo22212a();
        Collections.shuffle(Arrays.asList(mo22212a));
        int m22285i = this.f19211d.m22285i();
        int length = mo22212a.length;
        while (true) {
            i7 = 0;
            if (length <= 0 || m22285i <= 0) {
                break;
            }
            int ceil = (int) Math.ceil(m22285i / length);
            for (int i8 = 0; i8 < length && m22285i > 0; i8++) {
                c cVar = mo22212a[i8];
                int min = Math.min(m22285i, Math.min(cVar.m22284h(), ceil));
                if (min > 0) {
                    cVar.m22277a(min);
                    m22285i -= min;
                }
                if (cVar.m22284h() > 0) {
                    mo22212a[i7] = cVar;
                    i7++;
                }
            }
            length = i7;
        }
        e eVar = new e();
        c[] mo22212a2 = this.f19208a.mo22212a();
        int length2 = mo22212a2.length;
        while (i7 < length2) {
            c cVar2 = mo22212a2[i7];
            cVar2.m22288l(cVar2.m22278b(), eVar);
            cVar2.m22279c();
            i7++;
        }
        if (eVar.m22289a()) {
            m22272e();
        }
    }
}
