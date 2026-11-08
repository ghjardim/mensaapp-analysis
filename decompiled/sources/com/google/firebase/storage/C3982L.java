package com.google.firebase.storage;

import android.app.Activity;
import com.google.android.gms.common.internal.AbstractC3802r;
import com.google.firebase.storage.AbstractC3975E;
import java.util.HashMap;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import p220e4.C4189a;
import p220e4.C4195g;

/* renamed from: com.google.firebase.storage.L */
/* loaded from: classes.dex */
public class C3982L {

    /* renamed from: a */
    public final Queue f13107a = new ConcurrentLinkedQueue();

    /* renamed from: b */
    public final HashMap f13108b = new HashMap();

    /* renamed from: c */
    public AbstractC3975E f13109c;

    /* renamed from: d */
    public int f13110d;

    /* renamed from: e */
    public a f13111e;

    /* renamed from: com.google.firebase.storage.L$a */
    public interface a {
        /* renamed from: a */
        void mo15970a(Object obj, Object obj2);
    }

    public C3982L(AbstractC3975E abstractC3975E, int i7, a aVar) {
        this.f13109c = abstractC3975E;
        this.f13110d = i7;
        this.f13111e = aVar;
    }

    /* renamed from: d */
    public void m15964d(Activity activity, Executor executor, final Object obj) {
        boolean z6;
        C4195g c4195g;
        AbstractC3802r.m15129k(obj);
        synchronized (this.f13109c.m15888J()) {
            try {
                z6 = (this.f13109c.m15880B() & this.f13110d) != 0;
                this.f13107a.add(obj);
                c4195g = new C4195g(executor);
                this.f13108b.put(obj, c4195g);
                if (activity != null) {
                    AbstractC3802r.m15120b(!activity.isDestroyed(), "Activity is already destroyed!");
                    C4189a.m17575a().m17577c(activity, obj, new Runnable() { // from class: com.google.firebase.storage.J
                        @Override // java.lang.Runnable
                        public final void run() {
                            C3982L.this.m15965e(obj);
                        }
                    });
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z6) {
            final AbstractC3975E.a m15910g0 = this.f13109c.m15910g0();
            c4195g.m17600a(new Runnable() { // from class: com.google.firebase.storage.K
                @Override // java.lang.Runnable
                public final void run() {
                    C3982L.this.m15966f(obj, m15910g0);
                }
            });
        }
    }

    /* renamed from: f */
    public final /* synthetic */ void m15966f(Object obj, AbstractC3975E.a aVar) {
        this.f13111e.mo15970a(obj, aVar);
    }

    /* renamed from: g */
    public final /* synthetic */ void m15967g(Object obj, AbstractC3975E.a aVar) {
        this.f13111e.mo15970a(obj, aVar);
    }

    /* renamed from: h */
    public void m15968h() {
        if ((this.f13109c.m15880B() & this.f13110d) != 0) {
            final AbstractC3975E.a m15910g0 = this.f13109c.m15910g0();
            for (final Object obj : this.f13107a) {
                C4195g c4195g = (C4195g) this.f13108b.get(obj);
                if (c4195g != null) {
                    c4195g.m17600a(new Runnable() { // from class: com.google.firebase.storage.I
                        @Override // java.lang.Runnable
                        public final void run() {
                            C3982L.this.m15967g(obj, m15910g0);
                        }
                    });
                }
            }
        }
    }

    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public void m15965e(Object obj) {
        AbstractC3802r.m15129k(obj);
        synchronized (this.f13109c.m15888J()) {
            this.f13108b.remove(obj);
            this.f13107a.remove(obj);
            C4189a.m17575a().m17576b(obj);
        }
    }
}
