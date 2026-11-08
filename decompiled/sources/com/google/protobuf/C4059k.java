package com.google.protobuf;

import com.google.android.gms.common.api.C3643a;
import com.google.protobuf.AbstractC4014B0;
import java.util.List;
import p272k4.C5410A;

/* renamed from: com.google.protobuf.k */
/* loaded from: classes.dex */
public final class C4059k implements InterfaceC4062l0 {

    /* renamed from: a */
    public final AbstractC4057j f13443a;

    /* renamed from: b */
    public int f13444b;

    /* renamed from: c */
    public int f13445c;

    /* renamed from: d */
    public int f13446d = 0;

    /* renamed from: com.google.protobuf.k$a */
    public static /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f13447a;

        static {
            int[] iArr = new int[AbstractC4014B0.b.values().length];
            f13447a = iArr;
            try {
                iArr[AbstractC4014B0.b.f13251q.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f13447a[AbstractC4014B0.b.f13255u.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f13447a[AbstractC4014B0.b.f13244c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f13447a[AbstractC4014B0.b.f13257w.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f13447a[AbstractC4014B0.b.f13250p.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f13447a[AbstractC4014B0.b.f13249o.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f13447a[AbstractC4014B0.b.f13245d.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f13447a[AbstractC4014B0.b.f13248n.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f13447a[AbstractC4014B0.b.f13246e.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f13447a[AbstractC4014B0.b.f13254t.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f13447a[AbstractC4014B0.b.f13258x.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f13447a[AbstractC4014B0.b.f13259y.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f13447a[AbstractC4014B0.b.f13260z.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f13447a[AbstractC4014B0.b.f13242A.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f13447a[AbstractC4014B0.b.f13252r.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f13447a[AbstractC4014B0.b.f13256v.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f13447a[AbstractC4014B0.b.f13247f.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
        }
    }

    public C4059k(AbstractC4057j abstractC4057j) {
        AbstractC4057j abstractC4057j2 = (AbstractC4057j) AbstractC4015C.m16184b(abstractC4057j, "input");
        this.f13443a = abstractC4057j2;
        abstractC4057j2.f13396d = this;
    }

    /* renamed from: O */
    public static C4059k m16628O(AbstractC4057j abstractC4057j) {
        C4059k c4059k = abstractC4057j.f13396d;
        return c4059k != null ? c4059k : new C4059k(abstractC4057j);
    }

    @Override // com.google.protobuf.InterfaceC4062l0
    /* renamed from: A */
    public void mo16629A(List list) {
        int mo16536E;
        int mo16536E2;
        if (!(list instanceof AbstractC4083w)) {
            int m16179b = AbstractC4014B0.m16179b(this.f13444b);
            if (m16179b == 2) {
                int mo16537F = this.f13443a.mo16537F();
                m16652Y(mo16537F);
                int mo16545e = this.f13443a.mo16545e() + mo16537F;
                do {
                    list.add(Float.valueOf(this.f13443a.mo16555v()));
                } while (this.f13443a.mo16545e() < mo16545e);
                return;
            }
            if (m16179b != 5) {
                throw C4017D.m16240e();
            }
            do {
                list.add(Float.valueOf(this.f13443a.mo16555v()));
                if (this.f13443a.mo16546f()) {
                    return;
                } else {
                    mo16536E = this.f13443a.mo16536E();
                }
            } while (mo16536E == this.f13444b);
            this.f13446d = mo16536E;
            return;
        }
        AbstractC4083w abstractC4083w = (AbstractC4083w) list;
        int m16179b2 = AbstractC4014B0.m16179b(this.f13444b);
        if (m16179b2 == 2) {
            int mo16537F2 = this.f13443a.mo16537F();
            m16652Y(mo16537F2);
            int mo16545e2 = this.f13443a.mo16545e() + mo16537F2;
            do {
                abstractC4083w.m16985b(this.f13443a.mo16555v());
            } while (this.f13443a.mo16545e() < mo16545e2);
            return;
        }
        if (m16179b2 != 5) {
            throw C4017D.m16240e();
        }
        do {
            abstractC4083w.m16985b(this.f13443a.mo16555v());
            if (this.f13443a.mo16546f()) {
                return;
            } else {
                mo16536E2 = this.f13443a.mo16536E();
            }
        } while (mo16536E2 == this.f13444b);
        this.f13446d = mo16536E2;
    }

    @Override // com.google.protobuf.InterfaceC4062l0
    /* renamed from: B */
    public int mo16630B() {
        m16651X(0);
        return this.f13443a.mo16556w();
    }

    @Override // com.google.protobuf.InterfaceC4062l0
    /* renamed from: C */
    public boolean mo16631C() {
        int i7;
        if (this.f13443a.mo16546f() || (i7 = this.f13444b) == this.f13445c) {
            return false;
        }
        return this.f13443a.mo16541J(i7);
    }

    @Override // com.google.protobuf.InterfaceC4062l0
    /* renamed from: D */
    public int mo16632D() {
        m16651X(5);
        return this.f13443a.mo16558y();
    }

    @Override // com.google.protobuf.InterfaceC4062l0
    /* renamed from: E */
    public void mo16633E(List list) {
        int mo16536E;
        if (AbstractC4014B0.m16179b(this.f13444b) != 2) {
            throw C4017D.m16240e();
        }
        do {
            list.add(mo16679z());
            if (this.f13443a.mo16546f()) {
                return;
            } else {
                mo16536E = this.f13443a.mo16536E();
            }
        } while (mo16536E == this.f13444b);
        this.f13446d = mo16536E;
    }

    @Override // com.google.protobuf.InterfaceC4062l0
    /* renamed from: F */
    public void mo16634F(List list) {
        int mo16536E;
        int mo16536E2;
        if (!(list instanceof AbstractC4065n)) {
            int m16179b = AbstractC4014B0.m16179b(this.f13444b);
            if (m16179b == 1) {
                do {
                    list.add(Double.valueOf(this.f13443a.mo16551r()));
                    if (this.f13443a.mo16546f()) {
                        return;
                    } else {
                        mo16536E = this.f13443a.mo16536E();
                    }
                } while (mo16536E == this.f13444b);
                this.f13446d = mo16536E;
                return;
            }
            if (m16179b != 2) {
                throw C4017D.m16240e();
            }
            int mo16537F = this.f13443a.mo16537F();
            m16653Z(mo16537F);
            int mo16545e = this.f13443a.mo16545e() + mo16537F;
            do {
                list.add(Double.valueOf(this.f13443a.mo16551r()));
            } while (this.f13443a.mo16545e() < mo16545e);
            return;
        }
        AbstractC4065n abstractC4065n = (AbstractC4065n) list;
        int m16179b2 = AbstractC4014B0.m16179b(this.f13444b);
        if (m16179b2 == 1) {
            do {
                abstractC4065n.m16819b(this.f13443a.mo16551r());
                if (this.f13443a.mo16546f()) {
                    return;
                } else {
                    mo16536E2 = this.f13443a.mo16536E();
                }
            } while (mo16536E2 == this.f13444b);
            this.f13446d = mo16536E2;
            return;
        }
        if (m16179b2 != 2) {
            throw C4017D.m16240e();
        }
        int mo16537F2 = this.f13443a.mo16537F();
        m16653Z(mo16537F2);
        int mo16545e2 = this.f13443a.mo16545e() + mo16537F2;
        do {
            abstractC4065n.m16819b(this.f13443a.mo16551r());
        } while (this.f13443a.mo16545e() < mo16545e2);
    }

    @Override // com.google.protobuf.InterfaceC4062l0
    /* renamed from: G */
    public long mo16635G() {
        m16651X(0);
        return this.f13443a.mo16557x();
    }

    @Override // com.google.protobuf.InterfaceC4062l0
    /* renamed from: H */
    public String mo16636H() {
        m16651X(2);
        return this.f13443a.mo16535D();
    }

    @Override // com.google.protobuf.InterfaceC4062l0
    /* renamed from: I */
    public void mo16637I(List list) {
        int mo16536E;
        int mo16536E2;
        if (!(list instanceof AbstractC4025L)) {
            int m16179b = AbstractC4014B0.m16179b(this.f13444b);
            if (m16179b == 1) {
                do {
                    list.add(Long.valueOf(this.f13443a.mo16554u()));
                    if (this.f13443a.mo16546f()) {
                        return;
                    } else {
                        mo16536E = this.f13443a.mo16536E();
                    }
                } while (mo16536E == this.f13444b);
                this.f13446d = mo16536E;
                return;
            }
            if (m16179b != 2) {
                throw C4017D.m16240e();
            }
            int mo16537F = this.f13443a.mo16537F();
            m16653Z(mo16537F);
            int mo16545e = this.f13443a.mo16545e() + mo16537F;
            do {
                list.add(Long.valueOf(this.f13443a.mo16554u()));
            } while (this.f13443a.mo16545e() < mo16545e);
            return;
        }
        AbstractC4025L abstractC4025L = (AbstractC4025L) list;
        int m16179b2 = AbstractC4014B0.m16179b(this.f13444b);
        if (m16179b2 == 1) {
            do {
                abstractC4025L.m16274b(this.f13443a.mo16554u());
                if (this.f13443a.mo16546f()) {
                    return;
                } else {
                    mo16536E2 = this.f13443a.mo16536E();
                }
            } while (mo16536E2 == this.f13444b);
            this.f13446d = mo16536E2;
            return;
        }
        if (m16179b2 != 2) {
            throw C4017D.m16240e();
        }
        int mo16537F2 = this.f13443a.mo16537F();
        m16653Z(mo16537F2);
        int mo16545e2 = this.f13443a.mo16545e() + mo16537F2;
        do {
            abstractC4025L.m16274b(this.f13443a.mo16554u());
        } while (this.f13443a.mo16545e() < mo16545e2);
    }

    @Override // com.google.protobuf.InterfaceC4062l0
    /* renamed from: J */
    public void mo16638J(List list, InterfaceC4066n0 interfaceC4066n0, C4071q c4071q) {
        int mo16536E;
        if (AbstractC4014B0.m16179b(this.f13444b) != 3) {
            throw C4017D.m16240e();
        }
        int i7 = this.f13444b;
        do {
            list.add(m16646S(interfaceC4066n0, c4071q));
            if (this.f13443a.mo16546f() || this.f13446d != 0) {
                return;
            } else {
                mo16536E = this.f13443a.mo16536E();
            }
        } while (mo16536E == i7);
        this.f13446d = mo16536E;
    }

    @Override // com.google.protobuf.InterfaceC4062l0
    /* renamed from: K */
    public void mo16639K(Object obj, InterfaceC4066n0 interfaceC4066n0, C4071q c4071q) {
        m16651X(3);
        m16643P(obj, interfaceC4066n0, c4071q);
    }

    @Override // com.google.protobuf.InterfaceC4062l0
    /* renamed from: L */
    public void mo16640L(List list, InterfaceC4066n0 interfaceC4066n0, C4071q c4071q) {
        int mo16536E;
        if (AbstractC4014B0.m16179b(this.f13444b) != 2) {
            throw C4017D.m16240e();
        }
        int i7 = this.f13444b;
        do {
            list.add(m16647T(interfaceC4066n0, c4071q));
            if (this.f13443a.mo16546f() || this.f13446d != 0) {
                return;
            } else {
                mo16536E = this.f13443a.mo16536E();
            }
        } while (mo16536E == i7);
        this.f13446d = mo16536E;
    }

    @Override // com.google.protobuf.InterfaceC4062l0
    /* renamed from: M */
    public void mo16641M(Object obj, InterfaceC4066n0 interfaceC4066n0, C4071q c4071q) {
        m16651X(2);
        m16644Q(obj, interfaceC4066n0, c4071q);
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x005e, code lost:
    
        r8.put(r2, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0061, code lost:
    
        r7.f13443a.mo16547n(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0066, code lost:
    
        return;
     */
    @Override // com.google.protobuf.InterfaceC4062l0
    /* renamed from: N */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo16642N(java.util.Map r8, com.google.protobuf.C4027N.a r9, com.google.protobuf.C4071q r10) {
        /*
            r7 = this;
            r0 = 2
            r7.m16651X(r0)
            com.google.protobuf.j r1 = r7.f13443a
            int r1 = r1.mo16537F()
            com.google.protobuf.j r2 = r7.f13443a
            int r1 = r2.mo16548o(r1)
            java.lang.Object r2 = r9.f13323b
            java.lang.Object r3 = r9.f13325d
        L14:
            int r4 = r7.mo16676w()     // Catch: java.lang.Throwable -> L3a
            r5 = 2147483647(0x7fffffff, float:NaN)
            if (r4 == r5) goto L5e
            com.google.protobuf.j r5 = r7.f13443a     // Catch: java.lang.Throwable -> L3a
            boolean r5 = r5.mo16546f()     // Catch: java.lang.Throwable -> L3a
            if (r5 == 0) goto L26
            goto L5e
        L26:
            r5 = 1
            java.lang.String r6 = "Unable to parse map entry."
            if (r4 == r5) goto L49
            if (r4 == r0) goto L3c
            boolean r4 = r7.mo16631C()     // Catch: java.lang.Throwable -> L3a com.google.protobuf.C4017D.a -> L51
            if (r4 == 0) goto L34
            goto L14
        L34:
            com.google.protobuf.D r4 = new com.google.protobuf.D     // Catch: java.lang.Throwable -> L3a com.google.protobuf.C4017D.a -> L51
            r4.<init>(r6)     // Catch: java.lang.Throwable -> L3a com.google.protobuf.C4017D.a -> L51
            throw r4     // Catch: java.lang.Throwable -> L3a com.google.protobuf.C4017D.a -> L51
        L3a:
            r8 = move-exception
            goto L67
        L3c:
            com.google.protobuf.B0$b r4 = r9.f13324c     // Catch: java.lang.Throwable -> L3a com.google.protobuf.C4017D.a -> L51
            java.lang.Object r5 = r9.f13325d     // Catch: java.lang.Throwable -> L3a com.google.protobuf.C4017D.a -> L51
            java.lang.Class r5 = r5.getClass()     // Catch: java.lang.Throwable -> L3a com.google.protobuf.C4017D.a -> L51
            java.lang.Object r3 = r7.m16645R(r4, r5, r10)     // Catch: java.lang.Throwable -> L3a com.google.protobuf.C4017D.a -> L51
            goto L14
        L49:
            com.google.protobuf.B0$b r4 = r9.f13322a     // Catch: java.lang.Throwable -> L3a com.google.protobuf.C4017D.a -> L51
            r5 = 0
            java.lang.Object r2 = r7.m16645R(r4, r5, r5)     // Catch: java.lang.Throwable -> L3a com.google.protobuf.C4017D.a -> L51
            goto L14
        L51:
            boolean r4 = r7.mo16631C()     // Catch: java.lang.Throwable -> L3a
            if (r4 == 0) goto L58
            goto L14
        L58:
            com.google.protobuf.D r8 = new com.google.protobuf.D     // Catch: java.lang.Throwable -> L3a
            r8.<init>(r6)     // Catch: java.lang.Throwable -> L3a
            throw r8     // Catch: java.lang.Throwable -> L3a
        L5e:
            r8.put(r2, r3)     // Catch: java.lang.Throwable -> L3a
            com.google.protobuf.j r8 = r7.f13443a
            r8.mo16547n(r1)
            return
        L67:
            com.google.protobuf.j r9 = r7.f13443a
            r9.mo16547n(r1)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C4059k.mo16642N(java.util.Map, com.google.protobuf.N$a, com.google.protobuf.q):void");
    }

    /* renamed from: P */
    public final void m16643P(Object obj, InterfaceC4066n0 interfaceC4066n0, C4071q c4071q) {
        int i7 = this.f13445c;
        this.f13445c = AbstractC4014B0.m16180c(AbstractC4014B0.m16178a(this.f13444b), 4);
        try {
            interfaceC4066n0.mo16379h(obj, this, c4071q);
            if (this.f13444b == this.f13445c) {
            } else {
                throw C4017D.m16243h();
            }
        } finally {
            this.f13445c = i7;
        }
    }

    /* renamed from: Q */
    public final void m16644Q(Object obj, InterfaceC4066n0 interfaceC4066n0, C4071q c4071q) {
        int mo16537F = this.f13443a.mo16537F();
        AbstractC4057j abstractC4057j = this.f13443a;
        if (abstractC4057j.f13393a >= abstractC4057j.f13394b) {
            throw C4017D.m16244i();
        }
        int mo16548o = abstractC4057j.mo16548o(mo16537F);
        this.f13443a.f13393a++;
        interfaceC4066n0.mo16379h(obj, this, c4071q);
        this.f13443a.mo16543a(0);
        r5.f13393a--;
        this.f13443a.mo16547n(mo16548o);
    }

    /* renamed from: R */
    public final Object m16645R(AbstractC4014B0.b bVar, Class cls, C4071q c4071q) {
        switch (a.f13447a[bVar.ordinal()]) {
            case 1:
                return Boolean.valueOf(mo16661h());
            case 2:
                return mo16679z();
            case 3:
                return Double.valueOf(readDouble());
            case 4:
                return Integer.valueOf(mo16669p());
            case 5:
                return Integer.valueOf(mo16660g());
            case 6:
                return Long.valueOf(mo16656c());
            case 7:
                return Float.valueOf(readFloat());
            case 8:
                return Integer.valueOf(mo16630B());
            case 9:
                return Long.valueOf(mo16635G());
            case 10:
                return m16648U(cls, c4071q);
            case 11:
                return Integer.valueOf(mo16632D());
            case C5410A.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
                return Long.valueOf(mo16662i());
            case 13:
                return Integer.valueOf(mo16672s());
            case 14:
                return Long.valueOf(mo16673t());
            case 15:
                return mo16636H();
            case 16:
                return Integer.valueOf(mo16664k());
            case 17:
                return Long.valueOf(mo16655b());
            default:
                throw new IllegalArgumentException("unsupported field type.");
        }
    }

    /* renamed from: S */
    public final Object m16646S(InterfaceC4066n0 interfaceC4066n0, C4071q c4071q) {
        Object newInstance = interfaceC4066n0.newInstance();
        m16643P(newInstance, interfaceC4066n0, c4071q);
        interfaceC4066n0.mo16367b(newInstance);
        return newInstance;
    }

    /* renamed from: T */
    public final Object m16647T(InterfaceC4066n0 interfaceC4066n0, C4071q c4071q) {
        Object newInstance = interfaceC4066n0.newInstance();
        m16644Q(newInstance, interfaceC4066n0, c4071q);
        interfaceC4066n0.mo16367b(newInstance);
        return newInstance;
    }

    /* renamed from: U */
    public Object m16648U(Class cls, C4071q c4071q) {
        m16651X(2);
        return m16647T(C4056i0.m16519a().m16521c(cls), c4071q);
    }

    /* renamed from: V */
    public void m16649V(List list, boolean z6) {
        int mo16536E;
        int mo16536E2;
        if (AbstractC4014B0.m16179b(this.f13444b) != 2) {
            throw C4017D.m16240e();
        }
        if (!(list instanceof InterfaceC4023J) || z6) {
            do {
                list.add(z6 ? mo16636H() : mo16675v());
                if (this.f13443a.mo16546f()) {
                    return;
                } else {
                    mo16536E = this.f13443a.mo16536E();
                }
            } while (mo16536E == this.f13444b);
            this.f13446d = mo16536E;
            return;
        }
        InterfaceC4023J interfaceC4023J = (InterfaceC4023J) list;
        do {
            interfaceC4023J.mo16265v(mo16679z());
            if (this.f13443a.mo16546f()) {
                return;
            } else {
                mo16536E2 = this.f13443a.mo16536E();
            }
        } while (mo16536E2 == this.f13444b);
        this.f13446d = mo16536E2;
    }

    /* renamed from: W */
    public final void m16650W(int i7) {
        if (this.f13443a.mo16545e() != i7) {
            throw C4017D.m16246m();
        }
    }

    /* renamed from: X */
    public final void m16651X(int i7) {
        if (AbstractC4014B0.m16179b(this.f13444b) != i7) {
            throw C4017D.m16240e();
        }
    }

    /* renamed from: Y */
    public final void m16652Y(int i7) {
        if ((i7 & 3) != 0) {
            throw C4017D.m16243h();
        }
    }

    /* renamed from: Z */
    public final void m16653Z(int i7) {
        if ((i7 & 7) != 0) {
            throw C4017D.m16243h();
        }
    }

    @Override // com.google.protobuf.InterfaceC4062l0
    /* renamed from: a */
    public void mo16654a(List list) {
        int mo16536E;
        int mo16536E2;
        if (!(list instanceof C4013B)) {
            int m16179b = AbstractC4014B0.m16179b(this.f13444b);
            if (m16179b == 0) {
                do {
                    list.add(Integer.valueOf(this.f13443a.mo16532A()));
                    if (this.f13443a.mo16546f()) {
                        return;
                    } else {
                        mo16536E = this.f13443a.mo16536E();
                    }
                } while (mo16536E == this.f13444b);
                this.f13446d = mo16536E;
                return;
            }
            if (m16179b != 2) {
                throw C4017D.m16240e();
            }
            int mo16545e = this.f13443a.mo16545e() + this.f13443a.mo16537F();
            do {
                list.add(Integer.valueOf(this.f13443a.mo16532A()));
            } while (this.f13443a.mo16545e() < mo16545e);
            m16650W(mo16545e);
            return;
        }
        C4013B c4013b = (C4013B) list;
        int m16179b2 = AbstractC4014B0.m16179b(this.f13444b);
        if (m16179b2 == 0) {
            do {
                c4013b.m16170f(this.f13443a.mo16532A());
                if (this.f13443a.mo16546f()) {
                    return;
                } else {
                    mo16536E2 = this.f13443a.mo16536E();
                }
            } while (mo16536E2 == this.f13444b);
            this.f13446d = mo16536E2;
            return;
        }
        if (m16179b2 != 2) {
            throw C4017D.m16240e();
        }
        int mo16545e2 = this.f13443a.mo16545e() + this.f13443a.mo16537F();
        do {
            c4013b.m16170f(this.f13443a.mo16532A());
        } while (this.f13443a.mo16545e() < mo16545e2);
        m16650W(mo16545e2);
    }

    @Override // com.google.protobuf.InterfaceC4062l0
    /* renamed from: b */
    public long mo16655b() {
        m16651X(0);
        return this.f13443a.mo16538G();
    }

    @Override // com.google.protobuf.InterfaceC4062l0
    /* renamed from: c */
    public long mo16656c() {
        m16651X(1);
        return this.f13443a.mo16554u();
    }

    @Override // com.google.protobuf.InterfaceC4062l0
    /* renamed from: d */
    public void mo16657d(List list) {
        int mo16536E;
        int mo16536E2;
        if (!(list instanceof C4013B)) {
            int m16179b = AbstractC4014B0.m16179b(this.f13444b);
            if (m16179b == 2) {
                int mo16537F = this.f13443a.mo16537F();
                m16652Y(mo16537F);
                int mo16545e = this.f13443a.mo16545e() + mo16537F;
                do {
                    list.add(Integer.valueOf(this.f13443a.mo16558y()));
                } while (this.f13443a.mo16545e() < mo16545e);
                return;
            }
            if (m16179b != 5) {
                throw C4017D.m16240e();
            }
            do {
                list.add(Integer.valueOf(this.f13443a.mo16558y()));
                if (this.f13443a.mo16546f()) {
                    return;
                } else {
                    mo16536E = this.f13443a.mo16536E();
                }
            } while (mo16536E == this.f13444b);
            this.f13446d = mo16536E;
            return;
        }
        C4013B c4013b = (C4013B) list;
        int m16179b2 = AbstractC4014B0.m16179b(this.f13444b);
        if (m16179b2 == 2) {
            int mo16537F2 = this.f13443a.mo16537F();
            m16652Y(mo16537F2);
            int mo16545e2 = this.f13443a.mo16545e() + mo16537F2;
            do {
                c4013b.m16170f(this.f13443a.mo16558y());
            } while (this.f13443a.mo16545e() < mo16545e2);
            return;
        }
        if (m16179b2 != 5) {
            throw C4017D.m16240e();
        }
        do {
            c4013b.m16170f(this.f13443a.mo16558y());
            if (this.f13443a.mo16546f()) {
                return;
            } else {
                mo16536E2 = this.f13443a.mo16536E();
            }
        } while (mo16536E2 == this.f13444b);
        this.f13446d = mo16536E2;
    }

    @Override // com.google.protobuf.InterfaceC4062l0
    /* renamed from: e */
    public void mo16658e(List list) {
        int mo16536E;
        int mo16536E2;
        if (!(list instanceof AbstractC4025L)) {
            int m16179b = AbstractC4014B0.m16179b(this.f13444b);
            if (m16179b == 0) {
                do {
                    list.add(Long.valueOf(this.f13443a.mo16533B()));
                    if (this.f13443a.mo16546f()) {
                        return;
                    } else {
                        mo16536E = this.f13443a.mo16536E();
                    }
                } while (mo16536E == this.f13444b);
                this.f13446d = mo16536E;
                return;
            }
            if (m16179b != 2) {
                throw C4017D.m16240e();
            }
            int mo16545e = this.f13443a.mo16545e() + this.f13443a.mo16537F();
            do {
                list.add(Long.valueOf(this.f13443a.mo16533B()));
            } while (this.f13443a.mo16545e() < mo16545e);
            m16650W(mo16545e);
            return;
        }
        AbstractC4025L abstractC4025L = (AbstractC4025L) list;
        int m16179b2 = AbstractC4014B0.m16179b(this.f13444b);
        if (m16179b2 == 0) {
            do {
                abstractC4025L.m16274b(this.f13443a.mo16533B());
                if (this.f13443a.mo16546f()) {
                    return;
                } else {
                    mo16536E2 = this.f13443a.mo16536E();
                }
            } while (mo16536E2 == this.f13444b);
            this.f13446d = mo16536E2;
            return;
        }
        if (m16179b2 != 2) {
            throw C4017D.m16240e();
        }
        int mo16545e2 = this.f13443a.mo16545e() + this.f13443a.mo16537F();
        do {
            abstractC4025L.m16274b(this.f13443a.mo16533B());
        } while (this.f13443a.mo16545e() < mo16545e2);
        m16650W(mo16545e2);
    }

    @Override // com.google.protobuf.InterfaceC4062l0
    /* renamed from: f */
    public void mo16659f(List list) {
        int mo16536E;
        int mo16536E2;
        if (!(list instanceof C4013B)) {
            int m16179b = AbstractC4014B0.m16179b(this.f13444b);
            if (m16179b == 0) {
                do {
                    list.add(Integer.valueOf(this.f13443a.mo16537F()));
                    if (this.f13443a.mo16546f()) {
                        return;
                    } else {
                        mo16536E = this.f13443a.mo16536E();
                    }
                } while (mo16536E == this.f13444b);
                this.f13446d = mo16536E;
                return;
            }
            if (m16179b != 2) {
                throw C4017D.m16240e();
            }
            int mo16545e = this.f13443a.mo16545e() + this.f13443a.mo16537F();
            do {
                list.add(Integer.valueOf(this.f13443a.mo16537F()));
            } while (this.f13443a.mo16545e() < mo16545e);
            m16650W(mo16545e);
            return;
        }
        C4013B c4013b = (C4013B) list;
        int m16179b2 = AbstractC4014B0.m16179b(this.f13444b);
        if (m16179b2 == 0) {
            do {
                c4013b.m16170f(this.f13443a.mo16537F());
                if (this.f13443a.mo16546f()) {
                    return;
                } else {
                    mo16536E2 = this.f13443a.mo16536E();
                }
            } while (mo16536E2 == this.f13444b);
            this.f13446d = mo16536E2;
            return;
        }
        if (m16179b2 != 2) {
            throw C4017D.m16240e();
        }
        int mo16545e2 = this.f13443a.mo16545e() + this.f13443a.mo16537F();
        do {
            c4013b.m16170f(this.f13443a.mo16537F());
        } while (this.f13443a.mo16545e() < mo16545e2);
        m16650W(mo16545e2);
    }

    @Override // com.google.protobuf.InterfaceC4062l0
    /* renamed from: g */
    public int mo16660g() {
        m16651X(5);
        return this.f13443a.mo16553t();
    }

    @Override // com.google.protobuf.InterfaceC4062l0
    /* renamed from: h */
    public boolean mo16661h() {
        m16651X(0);
        return this.f13443a.mo16549p();
    }

    @Override // com.google.protobuf.InterfaceC4062l0
    /* renamed from: i */
    public long mo16662i() {
        m16651X(1);
        return this.f13443a.mo16559z();
    }

    @Override // com.google.protobuf.InterfaceC4062l0
    /* renamed from: j */
    public void mo16663j(List list) {
        int mo16536E;
        int mo16536E2;
        if (!(list instanceof AbstractC4025L)) {
            int m16179b = AbstractC4014B0.m16179b(this.f13444b);
            if (m16179b == 0) {
                do {
                    list.add(Long.valueOf(this.f13443a.mo16538G()));
                    if (this.f13443a.mo16546f()) {
                        return;
                    } else {
                        mo16536E = this.f13443a.mo16536E();
                    }
                } while (mo16536E == this.f13444b);
                this.f13446d = mo16536E;
                return;
            }
            if (m16179b != 2) {
                throw C4017D.m16240e();
            }
            int mo16545e = this.f13443a.mo16545e() + this.f13443a.mo16537F();
            do {
                list.add(Long.valueOf(this.f13443a.mo16538G()));
            } while (this.f13443a.mo16545e() < mo16545e);
            m16650W(mo16545e);
            return;
        }
        AbstractC4025L abstractC4025L = (AbstractC4025L) list;
        int m16179b2 = AbstractC4014B0.m16179b(this.f13444b);
        if (m16179b2 == 0) {
            do {
                abstractC4025L.m16274b(this.f13443a.mo16538G());
                if (this.f13443a.mo16546f()) {
                    return;
                } else {
                    mo16536E2 = this.f13443a.mo16536E();
                }
            } while (mo16536E2 == this.f13444b);
            this.f13446d = mo16536E2;
            return;
        }
        if (m16179b2 != 2) {
            throw C4017D.m16240e();
        }
        int mo16545e2 = this.f13443a.mo16545e() + this.f13443a.mo16537F();
        do {
            abstractC4025L.m16274b(this.f13443a.mo16538G());
        } while (this.f13443a.mo16545e() < mo16545e2);
        m16650W(mo16545e2);
    }

    @Override // com.google.protobuf.InterfaceC4062l0
    /* renamed from: k */
    public int mo16664k() {
        m16651X(0);
        return this.f13443a.mo16537F();
    }

    @Override // com.google.protobuf.InterfaceC4062l0
    /* renamed from: l */
    public void mo16665l(List list) {
        int mo16536E;
        int mo16536E2;
        if (!(list instanceof AbstractC4025L)) {
            int m16179b = AbstractC4014B0.m16179b(this.f13444b);
            if (m16179b == 0) {
                do {
                    list.add(Long.valueOf(this.f13443a.mo16557x()));
                    if (this.f13443a.mo16546f()) {
                        return;
                    } else {
                        mo16536E = this.f13443a.mo16536E();
                    }
                } while (mo16536E == this.f13444b);
                this.f13446d = mo16536E;
                return;
            }
            if (m16179b != 2) {
                throw C4017D.m16240e();
            }
            int mo16545e = this.f13443a.mo16545e() + this.f13443a.mo16537F();
            do {
                list.add(Long.valueOf(this.f13443a.mo16557x()));
            } while (this.f13443a.mo16545e() < mo16545e);
            m16650W(mo16545e);
            return;
        }
        AbstractC4025L abstractC4025L = (AbstractC4025L) list;
        int m16179b2 = AbstractC4014B0.m16179b(this.f13444b);
        if (m16179b2 == 0) {
            do {
                abstractC4025L.m16274b(this.f13443a.mo16557x());
                if (this.f13443a.mo16546f()) {
                    return;
                } else {
                    mo16536E2 = this.f13443a.mo16536E();
                }
            } while (mo16536E2 == this.f13444b);
            this.f13446d = mo16536E2;
            return;
        }
        if (m16179b2 != 2) {
            throw C4017D.m16240e();
        }
        int mo16545e2 = this.f13443a.mo16545e() + this.f13443a.mo16537F();
        do {
            abstractC4025L.m16274b(this.f13443a.mo16557x());
        } while (this.f13443a.mo16545e() < mo16545e2);
        m16650W(mo16545e2);
    }

    @Override // com.google.protobuf.InterfaceC4062l0
    /* renamed from: m */
    public void mo16666m(List list) {
        int mo16536E;
        int mo16536E2;
        if (!(list instanceof AbstractC4025L)) {
            int m16179b = AbstractC4014B0.m16179b(this.f13444b);
            if (m16179b == 1) {
                do {
                    list.add(Long.valueOf(this.f13443a.mo16559z()));
                    if (this.f13443a.mo16546f()) {
                        return;
                    } else {
                        mo16536E = this.f13443a.mo16536E();
                    }
                } while (mo16536E == this.f13444b);
                this.f13446d = mo16536E;
                return;
            }
            if (m16179b != 2) {
                throw C4017D.m16240e();
            }
            int mo16537F = this.f13443a.mo16537F();
            m16653Z(mo16537F);
            int mo16545e = this.f13443a.mo16545e() + mo16537F;
            do {
                list.add(Long.valueOf(this.f13443a.mo16559z()));
            } while (this.f13443a.mo16545e() < mo16545e);
            return;
        }
        AbstractC4025L abstractC4025L = (AbstractC4025L) list;
        int m16179b2 = AbstractC4014B0.m16179b(this.f13444b);
        if (m16179b2 == 1) {
            do {
                abstractC4025L.m16274b(this.f13443a.mo16559z());
                if (this.f13443a.mo16546f()) {
                    return;
                } else {
                    mo16536E2 = this.f13443a.mo16536E();
                }
            } while (mo16536E2 == this.f13444b);
            this.f13446d = mo16536E2;
            return;
        }
        if (m16179b2 != 2) {
            throw C4017D.m16240e();
        }
        int mo16537F2 = this.f13443a.mo16537F();
        m16653Z(mo16537F2);
        int mo16545e2 = this.f13443a.mo16545e() + mo16537F2;
        do {
            abstractC4025L.m16274b(this.f13443a.mo16559z());
        } while (this.f13443a.mo16545e() < mo16545e2);
    }

    @Override // com.google.protobuf.InterfaceC4062l0
    /* renamed from: n */
    public void mo16667n(List list) {
        int mo16536E;
        int mo16536E2;
        if (!(list instanceof C4013B)) {
            int m16179b = AbstractC4014B0.m16179b(this.f13444b);
            if (m16179b == 0) {
                do {
                    list.add(Integer.valueOf(this.f13443a.mo16556w()));
                    if (this.f13443a.mo16546f()) {
                        return;
                    } else {
                        mo16536E = this.f13443a.mo16536E();
                    }
                } while (mo16536E == this.f13444b);
                this.f13446d = mo16536E;
                return;
            }
            if (m16179b != 2) {
                throw C4017D.m16240e();
            }
            int mo16545e = this.f13443a.mo16545e() + this.f13443a.mo16537F();
            do {
                list.add(Integer.valueOf(this.f13443a.mo16556w()));
            } while (this.f13443a.mo16545e() < mo16545e);
            m16650W(mo16545e);
            return;
        }
        C4013B c4013b = (C4013B) list;
        int m16179b2 = AbstractC4014B0.m16179b(this.f13444b);
        if (m16179b2 == 0) {
            do {
                c4013b.m16170f(this.f13443a.mo16556w());
                if (this.f13443a.mo16546f()) {
                    return;
                } else {
                    mo16536E2 = this.f13443a.mo16536E();
                }
            } while (mo16536E2 == this.f13444b);
            this.f13446d = mo16536E2;
            return;
        }
        if (m16179b2 != 2) {
            throw C4017D.m16240e();
        }
        int mo16545e2 = this.f13443a.mo16545e() + this.f13443a.mo16537F();
        do {
            c4013b.m16170f(this.f13443a.mo16556w());
        } while (this.f13443a.mo16545e() < mo16545e2);
        m16650W(mo16545e2);
    }

    @Override // com.google.protobuf.InterfaceC4062l0
    /* renamed from: o */
    public void mo16668o(List list) {
        int mo16536E;
        int mo16536E2;
        if (!(list instanceof C4013B)) {
            int m16179b = AbstractC4014B0.m16179b(this.f13444b);
            if (m16179b == 0) {
                do {
                    list.add(Integer.valueOf(this.f13443a.mo16552s()));
                    if (this.f13443a.mo16546f()) {
                        return;
                    } else {
                        mo16536E = this.f13443a.mo16536E();
                    }
                } while (mo16536E == this.f13444b);
                this.f13446d = mo16536E;
                return;
            }
            if (m16179b != 2) {
                throw C4017D.m16240e();
            }
            int mo16545e = this.f13443a.mo16545e() + this.f13443a.mo16537F();
            do {
                list.add(Integer.valueOf(this.f13443a.mo16552s()));
            } while (this.f13443a.mo16545e() < mo16545e);
            m16650W(mo16545e);
            return;
        }
        C4013B c4013b = (C4013B) list;
        int m16179b2 = AbstractC4014B0.m16179b(this.f13444b);
        if (m16179b2 == 0) {
            do {
                c4013b.m16170f(this.f13443a.mo16552s());
                if (this.f13443a.mo16546f()) {
                    return;
                } else {
                    mo16536E2 = this.f13443a.mo16536E();
                }
            } while (mo16536E2 == this.f13444b);
            this.f13446d = mo16536E2;
            return;
        }
        if (m16179b2 != 2) {
            throw C4017D.m16240e();
        }
        int mo16545e2 = this.f13443a.mo16545e() + this.f13443a.mo16537F();
        do {
            c4013b.m16170f(this.f13443a.mo16552s());
        } while (this.f13443a.mo16545e() < mo16545e2);
        m16650W(mo16545e2);
    }

    @Override // com.google.protobuf.InterfaceC4062l0
    /* renamed from: p */
    public int mo16669p() {
        m16651X(0);
        return this.f13443a.mo16552s();
    }

    @Override // com.google.protobuf.InterfaceC4062l0
    /* renamed from: q */
    public int mo16670q() {
        return this.f13444b;
    }

    @Override // com.google.protobuf.InterfaceC4062l0
    /* renamed from: r */
    public void mo16671r(List list) {
        int mo16536E;
        int mo16536E2;
        if (!(list instanceof C4013B)) {
            int m16179b = AbstractC4014B0.m16179b(this.f13444b);
            if (m16179b == 2) {
                int mo16537F = this.f13443a.mo16537F();
                m16652Y(mo16537F);
                int mo16545e = this.f13443a.mo16545e() + mo16537F;
                do {
                    list.add(Integer.valueOf(this.f13443a.mo16553t()));
                } while (this.f13443a.mo16545e() < mo16545e);
                return;
            }
            if (m16179b != 5) {
                throw C4017D.m16240e();
            }
            do {
                list.add(Integer.valueOf(this.f13443a.mo16553t()));
                if (this.f13443a.mo16546f()) {
                    return;
                } else {
                    mo16536E = this.f13443a.mo16536E();
                }
            } while (mo16536E == this.f13444b);
            this.f13446d = mo16536E;
            return;
        }
        C4013B c4013b = (C4013B) list;
        int m16179b2 = AbstractC4014B0.m16179b(this.f13444b);
        if (m16179b2 == 2) {
            int mo16537F2 = this.f13443a.mo16537F();
            m16652Y(mo16537F2);
            int mo16545e2 = this.f13443a.mo16545e() + mo16537F2;
            do {
                c4013b.m16170f(this.f13443a.mo16553t());
            } while (this.f13443a.mo16545e() < mo16545e2);
            return;
        }
        if (m16179b2 != 5) {
            throw C4017D.m16240e();
        }
        do {
            c4013b.m16170f(this.f13443a.mo16553t());
            if (this.f13443a.mo16546f()) {
                return;
            } else {
                mo16536E2 = this.f13443a.mo16536E();
            }
        } while (mo16536E2 == this.f13444b);
        this.f13446d = mo16536E2;
    }

    @Override // com.google.protobuf.InterfaceC4062l0
    public double readDouble() {
        m16651X(1);
        return this.f13443a.mo16551r();
    }

    @Override // com.google.protobuf.InterfaceC4062l0
    public float readFloat() {
        m16651X(5);
        return this.f13443a.mo16555v();
    }

    @Override // com.google.protobuf.InterfaceC4062l0
    /* renamed from: s */
    public int mo16672s() {
        m16651X(0);
        return this.f13443a.mo16532A();
    }

    @Override // com.google.protobuf.InterfaceC4062l0
    /* renamed from: t */
    public long mo16673t() {
        m16651X(0);
        return this.f13443a.mo16533B();
    }

    @Override // com.google.protobuf.InterfaceC4062l0
    /* renamed from: u */
    public void mo16674u(List list) {
        int mo16536E;
        int mo16536E2;
        if (!(list instanceof AbstractC4051g)) {
            int m16179b = AbstractC4014B0.m16179b(this.f13444b);
            if (m16179b == 0) {
                do {
                    list.add(Boolean.valueOf(this.f13443a.mo16549p()));
                    if (this.f13443a.mo16546f()) {
                        return;
                    } else {
                        mo16536E = this.f13443a.mo16536E();
                    }
                } while (mo16536E == this.f13444b);
                this.f13446d = mo16536E;
                return;
            }
            if (m16179b != 2) {
                throw C4017D.m16240e();
            }
            int mo16545e = this.f13443a.mo16545e() + this.f13443a.mo16537F();
            do {
                list.add(Boolean.valueOf(this.f13443a.mo16549p()));
            } while (this.f13443a.mo16545e() < mo16545e);
            m16650W(mo16545e);
            return;
        }
        AbstractC4051g abstractC4051g = (AbstractC4051g) list;
        int m16179b2 = AbstractC4014B0.m16179b(this.f13444b);
        if (m16179b2 == 0) {
            do {
                abstractC4051g.m16488b(this.f13443a.mo16549p());
                if (this.f13443a.mo16546f()) {
                    return;
                } else {
                    mo16536E2 = this.f13443a.mo16536E();
                }
            } while (mo16536E2 == this.f13444b);
            this.f13446d = mo16536E2;
            return;
        }
        if (m16179b2 != 2) {
            throw C4017D.m16240e();
        }
        int mo16545e2 = this.f13443a.mo16545e() + this.f13443a.mo16537F();
        do {
            abstractC4051g.m16488b(this.f13443a.mo16549p());
        } while (this.f13443a.mo16545e() < mo16545e2);
        m16650W(mo16545e2);
    }

    @Override // com.google.protobuf.InterfaceC4062l0
    /* renamed from: v */
    public String mo16675v() {
        m16651X(2);
        return this.f13443a.mo16534C();
    }

    @Override // com.google.protobuf.InterfaceC4062l0
    /* renamed from: w */
    public int mo16676w() {
        int i7 = this.f13446d;
        if (i7 != 0) {
            this.f13444b = i7;
            this.f13446d = 0;
        } else {
            this.f13444b = this.f13443a.mo16536E();
        }
        int i8 = this.f13444b;
        return (i8 == 0 || i8 == this.f13445c) ? C3643a.e.API_PRIORITY_OTHER : AbstractC4014B0.m16178a(i8);
    }

    @Override // com.google.protobuf.InterfaceC4062l0
    /* renamed from: x */
    public void mo16677x(List list) {
        m16649V(list, false);
    }

    @Override // com.google.protobuf.InterfaceC4062l0
    /* renamed from: y */
    public void mo16678y(List list) {
        m16649V(list, true);
    }

    @Override // com.google.protobuf.InterfaceC4062l0
    /* renamed from: z */
    public AbstractC4055i mo16679z() {
        m16651X(2);
        return this.f13443a.mo16550q();
    }
}
