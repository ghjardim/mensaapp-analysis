package p287m3;

import android.app.Application;
import android.content.Context;
import com.google.android.gms.common.api.internal.ComponentCallbacks2C3682c;
import com.google.android.gms.common.internal.AbstractC3802r;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import p262j3.AbstractC5367c;
import p295n3.InterfaceC5781a;

/* renamed from: m3.s */
/* loaded from: classes.dex */
public final class C5593s {

    /* renamed from: a */
    public final C5587m f20204a;

    /* renamed from: b */
    public final InterfaceC5781a f20205b;

    /* renamed from: c */
    public volatile boolean f20206c;

    /* renamed from: d */
    public volatile int f20207d;

    /* renamed from: e */
    public volatile long f20208e;

    /* renamed from: f */
    public volatile boolean f20209f;

    /* renamed from: m3.s$a */
    public class a implements ComponentCallbacks2C3682c.a {

        /* renamed from: a */
        public final /* synthetic */ C5587m f20210a;

        /* renamed from: b */
        public final /* synthetic */ InterfaceC5781a f20211b;

        public a(C5587m c5587m, InterfaceC5781a interfaceC5781a) {
            this.f20210a = c5587m;
            this.f20211b = interfaceC5781a;
        }

        @Override // com.google.android.gms.common.api.internal.ComponentCallbacks2C3682c.a
        /* renamed from: a */
        public void mo14842a(boolean z6) {
            C5593s.this.f20206c = z6;
            if (z6) {
                this.f20210a.m23376c();
            } else if (C5593s.this.m23409g()) {
                this.f20210a.m23380g(C5593s.this.f20208e - this.f20211b.mo24428a());
            }
        }
    }

    public C5593s(Context context, C5584j c5584j, Executor executor, ScheduledExecutorService scheduledExecutorService) {
        this((Context) AbstractC3802r.m15129k(context), new C5587m((C5584j) AbstractC3802r.m15129k(c5584j), executor, scheduledExecutorService), new InterfaceC5781a.a());
    }

    /* renamed from: d */
    public void m23406d(AbstractC5367c abstractC5367c) {
        C5576b m23344d = abstractC5367c instanceof C5576b ? (C5576b) abstractC5367c : C5576b.m23344d(abstractC5367c.mo22072b());
        this.f20208e = m23344d.m23348h() + ((long) (m23344d.m23347f() * 0.5d)) + 300000;
        if (this.f20208e > m23344d.mo22071a()) {
            this.f20208e = m23344d.mo22071a() - 60000;
        }
        if (m23409g()) {
            this.f20204a.m23380g(this.f20208e - this.f20205b.mo24428a());
        }
    }

    /* renamed from: e */
    public void m23407e(int i7) {
        if (this.f20207d == 0 && i7 > 0) {
            this.f20207d = i7;
            if (m23409g()) {
                this.f20204a.m23380g(this.f20208e - this.f20205b.mo24428a());
            }
        } else if (this.f20207d > 0 && i7 == 0) {
            this.f20204a.m23376c();
        }
        this.f20207d = i7;
    }

    /* renamed from: f */
    public void m23408f(boolean z6) {
        this.f20209f = z6;
    }

    /* renamed from: g */
    public final boolean m23409g() {
        return this.f20209f && !this.f20206c && this.f20207d > 0 && this.f20208e != -1;
    }

    public C5593s(Context context, C5587m c5587m, InterfaceC5781a interfaceC5781a) {
        this.f20204a = c5587m;
        this.f20205b = interfaceC5781a;
        this.f20208e = -1L;
        ComponentCallbacks2C3682c.m14906c((Application) context.getApplicationContext());
        ComponentCallbacks2C3682c.m14905b().m14907a(new a(c5587m, interfaceC5781a));
    }
}
