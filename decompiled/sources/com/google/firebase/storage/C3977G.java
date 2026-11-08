package com.google.firebase.storage;

import java.util.concurrent.Executor;
import p369w3.AbstractC6915z;

/* renamed from: com.google.firebase.storage.G */
/* loaded from: classes.dex */
public class C3977G {

    /* renamed from: a */
    public static C3977G f13072a = new C3977G();

    /* renamed from: b */
    public static Executor f13073b;

    /* renamed from: c */
    public static Executor f13074c;

    /* renamed from: d */
    public static Executor f13075d;

    /* renamed from: e */
    public static Executor f13076e;

    /* renamed from: f */
    public static Executor f13077f;

    /* renamed from: b */
    public static C3977G m15939b() {
        return f13072a;
    }

    /* renamed from: d */
    public static void m15940d(Executor executor, Executor executor2) {
        f13073b = AbstractC6915z.m28344a(executor, 5);
        f13075d = AbstractC6915z.m28344a(executor, 3);
        f13074c = AbstractC6915z.m28344a(executor, 2);
        f13076e = AbstractC6915z.m28345b(executor);
        f13077f = executor2;
    }

    /* renamed from: a */
    public Executor m15941a() {
        return f13073b;
    }

    /* renamed from: c */
    public Executor m15942c() {
        return f13077f;
    }

    /* renamed from: e */
    public void m15943e(Runnable runnable) {
        f13076e.execute(runnable);
    }

    /* renamed from: f */
    public void m15944f(Runnable runnable) {
        f13073b.execute(runnable);
    }

    /* renamed from: g */
    public void m15945g(Runnable runnable) {
        f13075d.execute(runnable);
    }

    /* renamed from: h */
    public void m15946h(Runnable runnable) {
        f13074c.execute(runnable);
    }
}
