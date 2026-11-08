package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.AbstractC3301k0;
import com.google.android.gms.common.api.C3643a;
import java.util.List;
import p272k4.C5410A;

/* renamed from: androidx.datastore.preferences.protobuf.h */
/* loaded from: classes.dex */
public final class C3294h implements InterfaceC3277X {

    /* renamed from: a */
    public final AbstractC3292g f10489a;

    /* renamed from: b */
    public int f10490b;

    /* renamed from: c */
    public int f10491c;

    /* renamed from: d */
    public int f10492d = 0;

    /* renamed from: androidx.datastore.preferences.protobuf.h$a */
    public static /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f10493a;

        static {
            int[] iArr = new int[AbstractC3301k0.b.values().length];
            f10493a = iArr;
            try {
                iArr[AbstractC3301k0.b.f10543q.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f10493a[AbstractC3301k0.b.f10547u.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f10493a[AbstractC3301k0.b.f10536c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f10493a[AbstractC3301k0.b.f10549w.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f10493a[AbstractC3301k0.b.f10542p.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f10493a[AbstractC3301k0.b.f10541o.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f10493a[AbstractC3301k0.b.f10537d.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f10493a[AbstractC3301k0.b.f10540n.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f10493a[AbstractC3301k0.b.f10538e.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f10493a[AbstractC3301k0.b.f10546t.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f10493a[AbstractC3301k0.b.f10550x.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f10493a[AbstractC3301k0.b.f10551y.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f10493a[AbstractC3301k0.b.f10552z.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f10493a[AbstractC3301k0.b.f10534A.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f10493a[AbstractC3301k0.b.f10544r.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f10493a[AbstractC3301k0.b.f10548v.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f10493a[AbstractC3301k0.b.f10539f.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
        }
    }

    public C3294h(AbstractC3292g abstractC3292g) {
        AbstractC3292g abstractC3292g2 = (AbstractC3292g) AbstractC3312u.m12835b(abstractC3292g, "input");
        this.f10489a = abstractC3292g2;
        abstractC3292g2.f10464d = this;
    }

    /* renamed from: O */
    public static C3294h m12463O(AbstractC3292g abstractC3292g) {
        C3294h c3294h = abstractC3292g.f10464d;
        return c3294h != null ? c3294h : new C3294h(abstractC3292g);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC3277X
    /* renamed from: A */
    public void mo12193A(List list) {
        int mo12388C;
        int m12746b = AbstractC3301k0.m12746b(this.f10490b);
        if (m12746b == 2) {
            int mo12389D = this.f10489a.mo12389D();
            m12473Y(mo12389D);
            int mo12395e = this.f10489a.mo12395e() + mo12389D;
            do {
                list.add(Float.valueOf(this.f10489a.mo12405t()));
            } while (this.f10489a.mo12395e() < mo12395e);
            return;
        }
        if (m12746b != 5) {
            throw C3313v.m12845e();
        }
        do {
            list.add(Float.valueOf(this.f10489a.mo12405t()));
            if (this.f10489a.mo12396f()) {
                return;
            } else {
                mo12388C = this.f10489a.mo12388C();
            }
        } while (mo12388C == this.f10490b);
        this.f10492d = mo12388C;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC3277X
    /* renamed from: B */
    public int mo12194B() {
        m12472X(0);
        return this.f10489a.mo12406u();
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC3277X
    /* renamed from: C */
    public boolean mo12195C() {
        int i7;
        if (this.f10489a.mo12396f() || (i7 = this.f10490b) == this.f10491c) {
            return false;
        }
        return this.f10489a.mo12391F(i7);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC3277X
    /* renamed from: D */
    public int mo12196D() {
        m12472X(5);
        return this.f10489a.mo12408w();
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC3277X
    /* renamed from: E */
    public void mo12197E(List list) {
        int mo12388C;
        if (AbstractC3301k0.m12746b(this.f10490b) != 2) {
            throw C3313v.m12845e();
        }
        do {
            list.add(mo12232z());
            if (this.f10489a.mo12396f()) {
                return;
            } else {
                mo12388C = this.f10489a.mo12388C();
            }
        } while (mo12388C == this.f10490b);
        this.f10492d = mo12388C;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC3277X
    /* renamed from: F */
    public void mo12198F(List list) {
        int mo12388C;
        int m12746b = AbstractC3301k0.m12746b(this.f10490b);
        if (m12746b == 1) {
            do {
                list.add(Double.valueOf(this.f10489a.mo12401p()));
                if (this.f10489a.mo12396f()) {
                    return;
                } else {
                    mo12388C = this.f10489a.mo12388C();
                }
            } while (mo12388C == this.f10490b);
            this.f10492d = mo12388C;
            return;
        }
        if (m12746b != 2) {
            throw C3313v.m12845e();
        }
        int mo12389D = this.f10489a.mo12389D();
        m12474Z(mo12389D);
        int mo12395e = this.f10489a.mo12395e() + mo12389D;
        do {
            list.add(Double.valueOf(this.f10489a.mo12401p()));
        } while (this.f10489a.mo12395e() < mo12395e);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC3277X
    /* renamed from: G */
    public long mo12199G() {
        m12472X(0);
        return this.f10489a.mo12407v();
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC3277X
    /* renamed from: H */
    public String mo12200H() {
        m12472X(2);
        return this.f10489a.mo12387B();
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC3277X
    /* renamed from: I */
    public void mo12201I(List list) {
        int mo12388C;
        int m12746b = AbstractC3301k0.m12746b(this.f10490b);
        if (m12746b == 1) {
            do {
                list.add(Long.valueOf(this.f10489a.mo12404s()));
                if (this.f10489a.mo12396f()) {
                    return;
                } else {
                    mo12388C = this.f10489a.mo12388C();
                }
            } while (mo12388C == this.f10490b);
            this.f10492d = mo12388C;
            return;
        }
        if (m12746b != 2) {
            throw C3313v.m12845e();
        }
        int mo12389D = this.f10489a.mo12389D();
        m12474Z(mo12389D);
        int mo12395e = this.f10489a.mo12395e() + mo12389D;
        do {
            list.add(Long.valueOf(this.f10489a.mo12404s()));
        } while (this.f10489a.mo12395e() < mo12395e);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC3277X
    /* renamed from: J */
    public void mo12202J(Object obj, InterfaceC3278Y interfaceC3278Y, C3304m c3304m) {
        m12472X(2);
        m12465Q(obj, interfaceC3278Y, c3304m);
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x005e, code lost:
    
        r8.put(r2, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0061, code lost:
    
        r7.f10489a.mo12397l(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0066, code lost:
    
        return;
     */
    @Override // androidx.datastore.preferences.protobuf.InterfaceC3277X
    /* renamed from: K */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo12203K(java.util.Map r8, androidx.datastore.preferences.protobuf.C3257C.a r9, androidx.datastore.preferences.protobuf.C3304m r10) {
        /*
            r7 = this;
            r0 = 2
            r7.m12472X(r0)
            androidx.datastore.preferences.protobuf.g r1 = r7.f10489a
            int r1 = r1.mo12389D()
            androidx.datastore.preferences.protobuf.g r2 = r7.f10489a
            int r1 = r2.mo12398m(r1)
            java.lang.Object r2 = r9.f10373b
            java.lang.Object r3 = r9.f10375d
        L14:
            int r4 = r7.mo12229w()     // Catch: java.lang.Throwable -> L3a
            r5 = 2147483647(0x7fffffff, float:NaN)
            if (r4 == r5) goto L5e
            androidx.datastore.preferences.protobuf.g r5 = r7.f10489a     // Catch: java.lang.Throwable -> L3a
            boolean r5 = r5.mo12396f()     // Catch: java.lang.Throwable -> L3a
            if (r5 == 0) goto L26
            goto L5e
        L26:
            r5 = 1
            java.lang.String r6 = "Unable to parse map entry."
            if (r4 == r5) goto L49
            if (r4 == r0) goto L3c
            boolean r4 = r7.mo12195C()     // Catch: java.lang.Throwable -> L3a androidx.datastore.preferences.protobuf.C3313v.a -> L51
            if (r4 == 0) goto L34
            goto L14
        L34:
            androidx.datastore.preferences.protobuf.v r4 = new androidx.datastore.preferences.protobuf.v     // Catch: java.lang.Throwable -> L3a androidx.datastore.preferences.protobuf.C3313v.a -> L51
            r4.<init>(r6)     // Catch: java.lang.Throwable -> L3a androidx.datastore.preferences.protobuf.C3313v.a -> L51
            throw r4     // Catch: java.lang.Throwable -> L3a androidx.datastore.preferences.protobuf.C3313v.a -> L51
        L3a:
            r8 = move-exception
            goto L67
        L3c:
            androidx.datastore.preferences.protobuf.k0$b r4 = r9.f10374c     // Catch: java.lang.Throwable -> L3a androidx.datastore.preferences.protobuf.C3313v.a -> L51
            java.lang.Object r5 = r9.f10375d     // Catch: java.lang.Throwable -> L3a androidx.datastore.preferences.protobuf.C3313v.a -> L51
            java.lang.Class r5 = r5.getClass()     // Catch: java.lang.Throwable -> L3a androidx.datastore.preferences.protobuf.C3313v.a -> L51
            java.lang.Object r3 = r7.m12466R(r4, r5, r10)     // Catch: java.lang.Throwable -> L3a androidx.datastore.preferences.protobuf.C3313v.a -> L51
            goto L14
        L49:
            androidx.datastore.preferences.protobuf.k0$b r4 = r9.f10372a     // Catch: java.lang.Throwable -> L3a androidx.datastore.preferences.protobuf.C3313v.a -> L51
            r5 = 0
            java.lang.Object r2 = r7.m12466R(r4, r5, r5)     // Catch: java.lang.Throwable -> L3a androidx.datastore.preferences.protobuf.C3313v.a -> L51
            goto L14
        L51:
            boolean r4 = r7.mo12195C()     // Catch: java.lang.Throwable -> L3a
            if (r4 == 0) goto L58
            goto L14
        L58:
            androidx.datastore.preferences.protobuf.v r8 = new androidx.datastore.preferences.protobuf.v     // Catch: java.lang.Throwable -> L3a
            r8.<init>(r6)     // Catch: java.lang.Throwable -> L3a
            throw r8     // Catch: java.lang.Throwable -> L3a
        L5e:
            r8.put(r2, r3)     // Catch: java.lang.Throwable -> L3a
            androidx.datastore.preferences.protobuf.g r8 = r7.f10489a
            r8.mo12397l(r1)
            return
        L67:
            androidx.datastore.preferences.protobuf.g r9 = r7.f10489a
            r9.mo12397l(r1)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.C3294h.mo12203K(java.util.Map, androidx.datastore.preferences.protobuf.C$a, androidx.datastore.preferences.protobuf.m):void");
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC3277X
    /* renamed from: L */
    public void mo12204L(Object obj, InterfaceC3278Y interfaceC3278Y, C3304m c3304m) {
        m12472X(3);
        m12464P(obj, interfaceC3278Y, c3304m);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC3277X
    /* renamed from: M */
    public void mo12205M(List list, InterfaceC3278Y interfaceC3278Y, C3304m c3304m) {
        int mo12388C;
        if (AbstractC3301k0.m12746b(this.f10490b) != 3) {
            throw C3313v.m12845e();
        }
        int i7 = this.f10490b;
        do {
            list.add(m12467S(interfaceC3278Y, c3304m));
            if (this.f10489a.mo12396f() || this.f10492d != 0) {
                return;
            } else {
                mo12388C = this.f10489a.mo12388C();
            }
        } while (mo12388C == i7);
        this.f10492d = mo12388C;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC3277X
    /* renamed from: N */
    public void mo12206N(List list, InterfaceC3278Y interfaceC3278Y, C3304m c3304m) {
        int mo12388C;
        if (AbstractC3301k0.m12746b(this.f10490b) != 2) {
            throw C3313v.m12845e();
        }
        int i7 = this.f10490b;
        do {
            list.add(m12468T(interfaceC3278Y, c3304m));
            if (this.f10489a.mo12396f() || this.f10492d != 0) {
                return;
            } else {
                mo12388C = this.f10489a.mo12388C();
            }
        } while (mo12388C == i7);
        this.f10492d = mo12388C;
    }

    /* renamed from: P */
    public final void m12464P(Object obj, InterfaceC3278Y interfaceC3278Y, C3304m c3304m) {
        int i7 = this.f10491c;
        this.f10491c = AbstractC3301k0.m12747c(AbstractC3301k0.m12745a(this.f10490b), 4);
        try {
            interfaceC3278Y.mo12151g(obj, this, c3304m);
            if (this.f10490b == this.f10491c) {
            } else {
                throw C3313v.m12848h();
            }
        } finally {
            this.f10491c = i7;
        }
    }

    /* renamed from: Q */
    public final void m12465Q(Object obj, InterfaceC3278Y interfaceC3278Y, C3304m c3304m) {
        int mo12389D = this.f10489a.mo12389D();
        AbstractC3292g abstractC3292g = this.f10489a;
        if (abstractC3292g.f10461a >= abstractC3292g.f10462b) {
            throw C3313v.m12849i();
        }
        int mo12398m = abstractC3292g.mo12398m(mo12389D);
        this.f10489a.f10461a++;
        interfaceC3278Y.mo12151g(obj, this, c3304m);
        this.f10489a.mo12393a(0);
        r5.f10461a--;
        this.f10489a.mo12397l(mo12398m);
    }

    /* renamed from: R */
    public final Object m12466R(AbstractC3301k0.b bVar, Class cls, C3304m c3304m) {
        switch (a.f10493a[bVar.ordinal()]) {
            case 1:
                return Boolean.valueOf(mo12214h());
            case 2:
                return mo12232z();
            case 3:
                return Double.valueOf(readDouble());
            case 4:
                return Integer.valueOf(mo12222p());
            case 5:
                return Integer.valueOf(mo12213g());
            case 6:
                return Long.valueOf(mo12209c());
            case 7:
                return Float.valueOf(readFloat());
            case 8:
                return Integer.valueOf(mo12194B());
            case 9:
                return Long.valueOf(mo12199G());
            case 10:
                return m12469U(cls, c3304m);
            case 11:
                return Integer.valueOf(mo12196D());
            case C5410A.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
                return Long.valueOf(mo12215i());
            case 13:
                return Integer.valueOf(mo12225s());
            case 14:
                return Long.valueOf(mo12226t());
            case 15:
                return mo12200H();
            case 16:
                return Integer.valueOf(mo12217k());
            case 17:
                return Long.valueOf(mo12208b());
            default:
                throw new IllegalArgumentException("unsupported field type.");
        }
    }

    /* renamed from: S */
    public final Object m12467S(InterfaceC3278Y interfaceC3278Y, C3304m c3304m) {
        Object newInstance = interfaceC3278Y.newInstance();
        m12464P(newInstance, interfaceC3278Y, c3304m);
        interfaceC3278Y.mo12142b(newInstance);
        return newInstance;
    }

    /* renamed from: T */
    public final Object m12468T(InterfaceC3278Y interfaceC3278Y, C3304m c3304m) {
        Object newInstance = interfaceC3278Y.newInstance();
        m12465Q(newInstance, interfaceC3278Y, c3304m);
        interfaceC3278Y.mo12142b(newInstance);
        return newInstance;
    }

    /* renamed from: U */
    public Object m12469U(Class cls, C3304m c3304m) {
        m12472X(2);
        return m12468T(C3274U.m12181a().m12183c(cls), c3304m);
    }

    /* renamed from: V */
    public void m12470V(List list, boolean z6) {
        int mo12388C;
        if (AbstractC3301k0.m12746b(this.f10490b) != 2) {
            throw C3313v.m12845e();
        }
        do {
            list.add(z6 ? mo12200H() : mo12228v());
            if (this.f10489a.mo12396f()) {
                return;
            } else {
                mo12388C = this.f10489a.mo12388C();
            }
        } while (mo12388C == this.f10490b);
        this.f10492d = mo12388C;
    }

    /* renamed from: W */
    public final void m12471W(int i7) {
        if (this.f10489a.mo12395e() != i7) {
            throw C3313v.m12851m();
        }
    }

    /* renamed from: X */
    public final void m12472X(int i7) {
        if (AbstractC3301k0.m12746b(this.f10490b) != i7) {
            throw C3313v.m12845e();
        }
    }

    /* renamed from: Y */
    public final void m12473Y(int i7) {
        if ((i7 & 3) != 0) {
            throw C3313v.m12848h();
        }
    }

    /* renamed from: Z */
    public final void m12474Z(int i7) {
        if ((i7 & 7) != 0) {
            throw C3313v.m12848h();
        }
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC3277X
    /* renamed from: a */
    public void mo12207a(List list) {
        int mo12388C;
        int m12746b = AbstractC3301k0.m12746b(this.f10490b);
        if (m12746b == 0) {
            do {
                list.add(Integer.valueOf(this.f10489a.mo12410y()));
                if (this.f10489a.mo12396f()) {
                    return;
                } else {
                    mo12388C = this.f10489a.mo12388C();
                }
            } while (mo12388C == this.f10490b);
            this.f10492d = mo12388C;
            return;
        }
        if (m12746b != 2) {
            throw C3313v.m12845e();
        }
        int mo12395e = this.f10489a.mo12395e() + this.f10489a.mo12389D();
        do {
            list.add(Integer.valueOf(this.f10489a.mo12410y()));
        } while (this.f10489a.mo12395e() < mo12395e);
        m12471W(mo12395e);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC3277X
    /* renamed from: b */
    public long mo12208b() {
        m12472X(0);
        return this.f10489a.mo12390E();
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC3277X
    /* renamed from: c */
    public long mo12209c() {
        m12472X(1);
        return this.f10489a.mo12404s();
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC3277X
    /* renamed from: d */
    public void mo12210d(List list) {
        int mo12388C;
        int m12746b = AbstractC3301k0.m12746b(this.f10490b);
        if (m12746b == 2) {
            int mo12389D = this.f10489a.mo12389D();
            m12473Y(mo12389D);
            int mo12395e = this.f10489a.mo12395e() + mo12389D;
            do {
                list.add(Integer.valueOf(this.f10489a.mo12408w()));
            } while (this.f10489a.mo12395e() < mo12395e);
            return;
        }
        if (m12746b != 5) {
            throw C3313v.m12845e();
        }
        do {
            list.add(Integer.valueOf(this.f10489a.mo12408w()));
            if (this.f10489a.mo12396f()) {
                return;
            } else {
                mo12388C = this.f10489a.mo12388C();
            }
        } while (mo12388C == this.f10490b);
        this.f10492d = mo12388C;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC3277X
    /* renamed from: e */
    public void mo12211e(List list) {
        int mo12388C;
        int m12746b = AbstractC3301k0.m12746b(this.f10490b);
        if (m12746b == 0) {
            do {
                list.add(Long.valueOf(this.f10489a.mo12411z()));
                if (this.f10489a.mo12396f()) {
                    return;
                } else {
                    mo12388C = this.f10489a.mo12388C();
                }
            } while (mo12388C == this.f10490b);
            this.f10492d = mo12388C;
            return;
        }
        if (m12746b != 2) {
            throw C3313v.m12845e();
        }
        int mo12395e = this.f10489a.mo12395e() + this.f10489a.mo12389D();
        do {
            list.add(Long.valueOf(this.f10489a.mo12411z()));
        } while (this.f10489a.mo12395e() < mo12395e);
        m12471W(mo12395e);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC3277X
    /* renamed from: f */
    public void mo12212f(List list) {
        int mo12388C;
        int m12746b = AbstractC3301k0.m12746b(this.f10490b);
        if (m12746b == 0) {
            do {
                list.add(Integer.valueOf(this.f10489a.mo12389D()));
                if (this.f10489a.mo12396f()) {
                    return;
                } else {
                    mo12388C = this.f10489a.mo12388C();
                }
            } while (mo12388C == this.f10490b);
            this.f10492d = mo12388C;
            return;
        }
        if (m12746b != 2) {
            throw C3313v.m12845e();
        }
        int mo12395e = this.f10489a.mo12395e() + this.f10489a.mo12389D();
        do {
            list.add(Integer.valueOf(this.f10489a.mo12389D()));
        } while (this.f10489a.mo12395e() < mo12395e);
        m12471W(mo12395e);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC3277X
    /* renamed from: g */
    public int mo12213g() {
        m12472X(5);
        return this.f10489a.mo12403r();
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC3277X
    /* renamed from: h */
    public boolean mo12214h() {
        m12472X(0);
        return this.f10489a.mo12399n();
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC3277X
    /* renamed from: i */
    public long mo12215i() {
        m12472X(1);
        return this.f10489a.mo12409x();
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC3277X
    /* renamed from: j */
    public void mo12216j(List list) {
        int mo12388C;
        int m12746b = AbstractC3301k0.m12746b(this.f10490b);
        if (m12746b == 0) {
            do {
                list.add(Long.valueOf(this.f10489a.mo12390E()));
                if (this.f10489a.mo12396f()) {
                    return;
                } else {
                    mo12388C = this.f10489a.mo12388C();
                }
            } while (mo12388C == this.f10490b);
            this.f10492d = mo12388C;
            return;
        }
        if (m12746b != 2) {
            throw C3313v.m12845e();
        }
        int mo12395e = this.f10489a.mo12395e() + this.f10489a.mo12389D();
        do {
            list.add(Long.valueOf(this.f10489a.mo12390E()));
        } while (this.f10489a.mo12395e() < mo12395e);
        m12471W(mo12395e);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC3277X
    /* renamed from: k */
    public int mo12217k() {
        m12472X(0);
        return this.f10489a.mo12389D();
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC3277X
    /* renamed from: l */
    public void mo12218l(List list) {
        int mo12388C;
        int m12746b = AbstractC3301k0.m12746b(this.f10490b);
        if (m12746b == 0) {
            do {
                list.add(Long.valueOf(this.f10489a.mo12407v()));
                if (this.f10489a.mo12396f()) {
                    return;
                } else {
                    mo12388C = this.f10489a.mo12388C();
                }
            } while (mo12388C == this.f10490b);
            this.f10492d = mo12388C;
            return;
        }
        if (m12746b != 2) {
            throw C3313v.m12845e();
        }
        int mo12395e = this.f10489a.mo12395e() + this.f10489a.mo12389D();
        do {
            list.add(Long.valueOf(this.f10489a.mo12407v()));
        } while (this.f10489a.mo12395e() < mo12395e);
        m12471W(mo12395e);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC3277X
    /* renamed from: m */
    public void mo12219m(List list) {
        int mo12388C;
        int m12746b = AbstractC3301k0.m12746b(this.f10490b);
        if (m12746b == 1) {
            do {
                list.add(Long.valueOf(this.f10489a.mo12409x()));
                if (this.f10489a.mo12396f()) {
                    return;
                } else {
                    mo12388C = this.f10489a.mo12388C();
                }
            } while (mo12388C == this.f10490b);
            this.f10492d = mo12388C;
            return;
        }
        if (m12746b != 2) {
            throw C3313v.m12845e();
        }
        int mo12389D = this.f10489a.mo12389D();
        m12474Z(mo12389D);
        int mo12395e = this.f10489a.mo12395e() + mo12389D;
        do {
            list.add(Long.valueOf(this.f10489a.mo12409x()));
        } while (this.f10489a.mo12395e() < mo12395e);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC3277X
    /* renamed from: n */
    public void mo12220n(List list) {
        int mo12388C;
        int m12746b = AbstractC3301k0.m12746b(this.f10490b);
        if (m12746b == 0) {
            do {
                list.add(Integer.valueOf(this.f10489a.mo12406u()));
                if (this.f10489a.mo12396f()) {
                    return;
                } else {
                    mo12388C = this.f10489a.mo12388C();
                }
            } while (mo12388C == this.f10490b);
            this.f10492d = mo12388C;
            return;
        }
        if (m12746b != 2) {
            throw C3313v.m12845e();
        }
        int mo12395e = this.f10489a.mo12395e() + this.f10489a.mo12389D();
        do {
            list.add(Integer.valueOf(this.f10489a.mo12406u()));
        } while (this.f10489a.mo12395e() < mo12395e);
        m12471W(mo12395e);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC3277X
    /* renamed from: o */
    public void mo12221o(List list) {
        int mo12388C;
        int m12746b = AbstractC3301k0.m12746b(this.f10490b);
        if (m12746b == 0) {
            do {
                list.add(Integer.valueOf(this.f10489a.mo12402q()));
                if (this.f10489a.mo12396f()) {
                    return;
                } else {
                    mo12388C = this.f10489a.mo12388C();
                }
            } while (mo12388C == this.f10490b);
            this.f10492d = mo12388C;
            return;
        }
        if (m12746b != 2) {
            throw C3313v.m12845e();
        }
        int mo12395e = this.f10489a.mo12395e() + this.f10489a.mo12389D();
        do {
            list.add(Integer.valueOf(this.f10489a.mo12402q()));
        } while (this.f10489a.mo12395e() < mo12395e);
        m12471W(mo12395e);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC3277X
    /* renamed from: p */
    public int mo12222p() {
        m12472X(0);
        return this.f10489a.mo12402q();
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC3277X
    /* renamed from: q */
    public int mo12223q() {
        return this.f10490b;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC3277X
    /* renamed from: r */
    public void mo12224r(List list) {
        int mo12388C;
        int m12746b = AbstractC3301k0.m12746b(this.f10490b);
        if (m12746b == 2) {
            int mo12389D = this.f10489a.mo12389D();
            m12473Y(mo12389D);
            int mo12395e = this.f10489a.mo12395e() + mo12389D;
            do {
                list.add(Integer.valueOf(this.f10489a.mo12403r()));
            } while (this.f10489a.mo12395e() < mo12395e);
            return;
        }
        if (m12746b != 5) {
            throw C3313v.m12845e();
        }
        do {
            list.add(Integer.valueOf(this.f10489a.mo12403r()));
            if (this.f10489a.mo12396f()) {
                return;
            } else {
                mo12388C = this.f10489a.mo12388C();
            }
        } while (mo12388C == this.f10490b);
        this.f10492d = mo12388C;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC3277X
    public double readDouble() {
        m12472X(1);
        return this.f10489a.mo12401p();
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC3277X
    public float readFloat() {
        m12472X(5);
        return this.f10489a.mo12405t();
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC3277X
    /* renamed from: s */
    public int mo12225s() {
        m12472X(0);
        return this.f10489a.mo12410y();
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC3277X
    /* renamed from: t */
    public long mo12226t() {
        m12472X(0);
        return this.f10489a.mo12411z();
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC3277X
    /* renamed from: u */
    public void mo12227u(List list) {
        int mo12388C;
        int m12746b = AbstractC3301k0.m12746b(this.f10490b);
        if (m12746b == 0) {
            do {
                list.add(Boolean.valueOf(this.f10489a.mo12399n()));
                if (this.f10489a.mo12396f()) {
                    return;
                } else {
                    mo12388C = this.f10489a.mo12388C();
                }
            } while (mo12388C == this.f10490b);
            this.f10492d = mo12388C;
            return;
        }
        if (m12746b != 2) {
            throw C3313v.m12845e();
        }
        int mo12395e = this.f10489a.mo12395e() + this.f10489a.mo12389D();
        do {
            list.add(Boolean.valueOf(this.f10489a.mo12399n()));
        } while (this.f10489a.mo12395e() < mo12395e);
        m12471W(mo12395e);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC3277X
    /* renamed from: v */
    public String mo12228v() {
        m12472X(2);
        return this.f10489a.mo12386A();
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC3277X
    /* renamed from: w */
    public int mo12229w() {
        int i7 = this.f10492d;
        if (i7 != 0) {
            this.f10490b = i7;
            this.f10492d = 0;
        } else {
            this.f10490b = this.f10489a.mo12388C();
        }
        int i8 = this.f10490b;
        return (i8 == 0 || i8 == this.f10491c) ? C3643a.e.API_PRIORITY_OTHER : AbstractC3301k0.m12745a(i8);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC3277X
    /* renamed from: x */
    public void mo12230x(List list) {
        m12470V(list, false);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC3277X
    /* renamed from: y */
    public void mo12231y(List list) {
        m12470V(list, true);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC3277X
    /* renamed from: z */
    public AbstractC3290f mo12232z() {
        m12472X(2);
        return this.f10489a.mo12400o();
    }
}
