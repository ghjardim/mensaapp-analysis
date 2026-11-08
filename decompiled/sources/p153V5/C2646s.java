package p153V5;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.AbstractC5469l;
import p013B5.AbstractC0060d;
import p146U5.EnumC2583a;
import p160W5.AbstractC2726b;
import p160W5.AbstractC2728d;
import p160W5.AbstractC2737m;
import p160W5.InterfaceC2735k;
import p167X5.C2846G;
import p371w5.C6934q;
import p392z5.InterfaceC7157e;
import p392z5.InterfaceC7161i;

/* renamed from: V5.s */
/* loaded from: classes2.dex */
public final class C2646s extends AbstractC2726b implements InterfaceC2641n, InterfaceC2631d, InterfaceC2735k {

    /* renamed from: e */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f7841e = AtomicReferenceFieldUpdater.newUpdater(C2646s.class, Object.class, "_state$volatile");
    private volatile /* synthetic */ Object _state$volatile;

    /* renamed from: d */
    public int f7842d;

    /* renamed from: V5.s$a */
    public static final class a extends AbstractC0060d {

        /* renamed from: a */
        public Object f7843a;

        /* renamed from: b */
        public Object f7844b;

        /* renamed from: c */
        public Object f7845c;

        /* renamed from: d */
        public Object f7846d;

        /* renamed from: e */
        public Object f7847e;

        /* renamed from: f */
        public /* synthetic */ Object f7848f;

        /* renamed from: o */
        public int f7850o;

        public a(InterfaceC7157e interfaceC7157e) {
            super(interfaceC7157e);
        }

        @Override // p013B5.AbstractC0057a
        public final Object invokeSuspend(Object obj) {
            this.f7848f = obj;
            this.f7850o |= Integer.MIN_VALUE;
            return C2646s.this.mo7083a(null, this);
        }
    }

    public C2646s(Object obj) {
        this._state$volatile = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0099 A[Catch: all -> 0x0042, TryCatch #0 {all -> 0x0042, blocks: (B:14:0x003e, B:15:0x008f, B:17:0x0099, B:19:0x009e, B:21:0x00bf, B:23:0x00c5, B:27:0x00a4, B:30:0x00ab, B:39:0x005f, B:41:0x0071, B:42:0x0080), top: B:7:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x009e A[Catch: all -> 0x0042, TryCatch #0 {all -> 0x0042, blocks: (B:14:0x003e, B:15:0x008f, B:17:0x0099, B:19:0x009e, B:21:0x00bf, B:23:0x00c5, B:27:0x00a4, B:30:0x00ab, B:39:0x005f, B:41:0x0071, B:42:0x0080), top: B:7:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00c5 A[Catch: all -> 0x0042, TRY_LEAVE, TryCatch #0 {all -> 0x0042, blocks: (B:14:0x003e, B:15:0x008f, B:17:0x0099, B:19:0x009e, B:21:0x00bf, B:23:0x00c5, B:27:0x00a4, B:30:0x00ab, B:39:0x005f, B:41:0x0071, B:42:0x0080), top: B:7:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00bd A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x00c3 -> B:15:0x008f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x00d5 -> B:15:0x008f). Please report as a decompilation issue!!! */
    @Override // p153V5.InterfaceC2631d
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object mo7083a(p153V5.InterfaceC2632e r11, p392z5.InterfaceC7157e r12) {
        /*
            Method dump skipped, instructions count: 220
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p153V5.C2646s.mo7083a(V5.e, z5.e):java.lang.Object");
    }

    @Override // p153V5.InterfaceC2641n
    /* renamed from: b */
    public boolean mo9085b(Object obj, Object obj2) {
        if (obj == null) {
            obj = AbstractC2737m.f8069a;
        }
        if (obj2 == null) {
            obj2 = AbstractC2737m.f8069a;
        }
        return m9093m(obj, obj2);
    }

    @Override // p160W5.InterfaceC2735k
    /* renamed from: c */
    public InterfaceC2631d mo9088c(InterfaceC7161i interfaceC7161i, int i7, EnumC2583a enumC2583a) {
        return AbstractC2647t.m9097d(this, interfaceC7161i, i7, enumC2583a);
    }

    @Override // p153V5.InterfaceC2632e
    /* renamed from: e */
    public Object mo2989e(Object obj, InterfaceC7157e interfaceC7157e) {
        setValue(obj);
        return C6934q.f24811a;
    }

    @Override // p153V5.InterfaceC2641n
    public Object getValue() {
        C2846G c2846g = AbstractC2737m.f8069a;
        Object obj = f7841e.get(this);
        if (obj == c2846g) {
            return null;
        }
        return obj;
    }

    @Override // p160W5.AbstractC2726b
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public C2648u mo9089f() {
        return new C2648u();
    }

    @Override // p160W5.AbstractC2726b
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public C2648u[] mo9090g(int i7) {
        return new C2648u[i7];
    }

    /* renamed from: m */
    public final boolean m9093m(Object obj, Object obj2) {
        int i7;
        AbstractC2728d[] m9344i;
        synchronized (this) {
            Object obj3 = f7841e.get(this);
            if (obj != null && !AbstractC5469l.m23024a(obj3, obj)) {
                return false;
            }
            if (AbstractC5469l.m23024a(obj3, obj2)) {
                return true;
            }
            f7841e.set(this, obj2);
            int i8 = this.f7842d;
            if ((i8 & 1) != 0) {
                this.f7842d = i8 + 2;
                return true;
            }
            int i9 = i8 + 1;
            this.f7842d = i9;
            AbstractC2728d[] m9344i2 = m9344i();
            C6934q c6934q = C6934q.f24811a;
            while (true) {
                C2648u[] c2648uArr = (C2648u[]) m9344i2;
                if (c2648uArr != null) {
                    for (C2648u c2648u : c2648uArr) {
                        if (c2648u != null) {
                            c2648u.m9104g();
                        }
                    }
                }
                synchronized (this) {
                    i7 = this.f7842d;
                    if (i7 == i9) {
                        this.f7842d = i9 + 1;
                        return true;
                    }
                    m9344i = m9344i();
                    C6934q c6934q2 = C6934q.f24811a;
                }
                m9344i2 = m9344i;
                i9 = i7;
            }
        }
    }

    @Override // p153V5.InterfaceC2641n
    public void setValue(Object obj) {
        if (obj == null) {
            obj = AbstractC2737m.f8069a;
        }
        m9093m(null, obj);
    }
}
