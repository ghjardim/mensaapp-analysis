package p042G;

import kotlin.jvm.internal.AbstractC5469l;

/* renamed from: G.d */
/* loaded from: classes.dex */
public class C0342d implements InterfaceC0341c {

    /* renamed from: a */
    public final Object[] f1287a;

    /* renamed from: b */
    public int f1288b;

    public C0342d(int i7) {
        if (i7 <= 0) {
            throw new IllegalArgumentException("The max pool size must be > 0");
        }
        this.f1287a = new Object[i7];
    }

    @Override // p042G.InterfaceC0341c
    /* renamed from: a */
    public boolean mo1348a(Object instance) {
        AbstractC5469l.m23028e(instance, "instance");
        if (m1350c(instance)) {
            throw new IllegalStateException("Already in the pool!");
        }
        int i7 = this.f1288b;
        Object[] objArr = this.f1287a;
        if (i7 >= objArr.length) {
            return false;
        }
        objArr[i7] = instance;
        this.f1288b = i7 + 1;
        return true;
    }

    @Override // p042G.InterfaceC0341c
    /* renamed from: b */
    public Object mo1349b() {
        int i7 = this.f1288b;
        if (i7 <= 0) {
            return null;
        }
        int i8 = i7 - 1;
        Object obj = this.f1287a[i8];
        AbstractC5469l.m23026c(obj, "null cannot be cast to non-null type T of androidx.core.util.Pools.SimplePool");
        this.f1287a[i8] = null;
        this.f1288b--;
        return obj;
    }

    /* renamed from: c */
    public final boolean m1350c(Object obj) {
        int i7 = this.f1288b;
        for (int i8 = 0; i8 < i7; i8++) {
            if (this.f1287a[i8] == obj) {
                return true;
            }
        }
        return false;
    }
}
