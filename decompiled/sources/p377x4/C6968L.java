package p377x4;

import android.view.KeyEvent;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import p061I4.InterfaceC0651c;
import p256j$.util.DesugarCollections;
import p370w4.AbstractC6917b;
import p377x4.AbstractC6970N;
import p377x4.C6964H;
import p377x4.C6969M;

/* renamed from: x4.L */
/* loaded from: classes.dex */
public class C6968L implements C6969M.d {

    /* renamed from: a */
    public final InterfaceC0651c f24954a;

    /* renamed from: b */
    public final HashMap f24955b = new HashMap();

    /* renamed from: c */
    public final HashMap f24956c = new HashMap();

    /* renamed from: d */
    public final C6969M.b f24957d = new C6969M.b();

    /* renamed from: x4.L$a */
    public static /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f24958a;

        static {
            int[] iArr = new int[C6964H.b.values().length];
            f24958a = iArr;
            try {
                iArr[C6964H.b.kDown.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f24958a[C6964H.b.kUp.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f24958a[C6964H.b.kRepeat.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public C6968L(InterfaceC0651c interfaceC0651c) {
        this.f24954a = interfaceC0651c;
        for (AbstractC6970N.e eVar : AbstractC6970N.m28569a()) {
            this.f24956c.put(Long.valueOf(eVar.f24978c), eVar);
        }
    }

    /* renamed from: e */
    public static C6964H.b m28549e(KeyEvent keyEvent) {
        boolean z6 = keyEvent.getRepeatCount() > 0;
        int action = keyEvent.getAction();
        if (action == 0) {
            return z6 ? C6964H.b.kRepeat : C6964H.b.kDown;
        }
        if (action == 1) {
            return C6964H.b.kUp;
        }
        throw new AssertionError("Unexpected event type");
    }

    /* renamed from: j */
    public static long m28550j(long j7, long j8) {
        return (j7 & 4294967295L) | j8;
    }

    /* renamed from: k */
    public static /* synthetic */ void m28551k(C6969M.d.a aVar, ByteBuffer byteBuffer) {
        Boolean bool = Boolean.FALSE;
        if (byteBuffer != null) {
            byteBuffer.rewind();
            if (byteBuffer.capacity() != 0) {
                bool = Boolean.valueOf(byteBuffer.get() != 0);
            }
        } else {
            AbstractC6917b.m28359g("KeyEmbedderResponder", "A null reply was received when sending a key event to the framework.");
        }
        aVar.mo28568a(bool.booleanValue());
    }

    @Override // p377x4.C6969M.d
    /* renamed from: a */
    public void mo28540a(KeyEvent keyEvent, C6969M.d.a aVar) {
        if (m28555i(keyEvent, aVar)) {
            return;
        }
        m28561q(true, 0L, 0L, 0L);
        aVar.mo28568a(true);
    }

    /* renamed from: f */
    public final Long m28552f(KeyEvent keyEvent) {
        Long l7 = (Long) AbstractC6970N.f24970b.get(Long.valueOf(keyEvent.getKeyCode()));
        return l7 != null ? l7 : Long.valueOf(m28550j(keyEvent.getKeyCode(), 73014444032L));
    }

    /* renamed from: g */
    public final Long m28553g(KeyEvent keyEvent) {
        long scanCode = keyEvent.getScanCode();
        if (scanCode == 0) {
            return Long.valueOf(m28550j(keyEvent.getKeyCode(), 73014444032L));
        }
        Long l7 = (Long) AbstractC6970N.f24969a.get(Long.valueOf(scanCode));
        return l7 != null ? l7 : Long.valueOf(m28550j(keyEvent.getScanCode(), 73014444032L));
    }

    /* renamed from: h */
    public Map m28554h() {
        return DesugarCollections.unmodifiableMap(this.f24955b);
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0148 A[LOOP:2: B:61:0x0142->B:63:0x0148, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x011d  */
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m28555i(android.view.KeyEvent r18, p377x4.C6969M.d.a r19) {
        /*
            Method dump skipped, instructions count: 339
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p377x4.C6968L.m28555i(android.view.KeyEvent, x4.M$d$a):boolean");
    }

    /* renamed from: l */
    public final /* synthetic */ void m28556l(AbstractC6970N.c cVar, long j7, KeyEvent keyEvent) {
        m28561q(false, Long.valueOf(cVar.f24973b), Long.valueOf(j7), keyEvent.getEventTime());
    }

    /* renamed from: m */
    public final /* synthetic */ void m28557m(AbstractC6970N.c cVar, long j7, KeyEvent keyEvent) {
        m28561q(false, Long.valueOf(cVar.f24973b), Long.valueOf(j7), keyEvent.getEventTime());
    }

    /* renamed from: n */
    public final void m28558n(C6964H c6964h, final C6969M.d.a aVar) {
        this.f24954a.mo2622e("flutter/keydata", c6964h.m28541a(), aVar == null ? null : new InterfaceC0651c.b() { // from class: x4.I
            @Override // p061I4.InterfaceC0651c.b
            /* renamed from: a */
            public final void mo2616a(ByteBuffer byteBuffer) {
                C6968L.m28551k(C6969M.d.a.this, byteBuffer);
            }
        });
    }

    /* renamed from: o */
    public void m28559o(AbstractC6970N.d dVar, boolean z6, long j7, final long j8, final KeyEvent keyEvent, ArrayList arrayList) {
        AbstractC6970N.c[] cVarArr = dVar.f24975b;
        boolean[] zArr = new boolean[cVarArr.length];
        Boolean[] boolArr = new Boolean[cVarArr.length];
        int i7 = 0;
        boolean z7 = false;
        while (true) {
            AbstractC6970N.c[] cVarArr2 = dVar.f24975b;
            boolean z8 = true;
            if (i7 >= cVarArr2.length) {
                break;
            }
            final AbstractC6970N.c cVar = cVarArr2[i7];
            boolean containsKey = this.f24955b.containsKey(Long.valueOf(cVar.f24972a));
            zArr[i7] = containsKey;
            if (cVar.f24973b == j7) {
                int i8 = a.f24958a[m28549e(keyEvent).ordinal()];
                if (i8 != 1) {
                    if (i8 == 2) {
                        boolArr[i7] = Boolean.valueOf(zArr[i7]);
                    } else if (i8 == 3) {
                        if (!z6) {
                            arrayList.add(new Runnable() { // from class: x4.K
                                @Override // java.lang.Runnable
                                public final void run() {
                                    C6968L.this.m28557m(cVar, j8, keyEvent);
                                }
                            });
                        }
                        boolArr[i7] = Boolean.valueOf(zArr[i7]);
                    }
                    i7++;
                } else {
                    boolArr[i7] = Boolean.FALSE;
                    if (!z6) {
                        arrayList.add(new Runnable() { // from class: x4.J
                            @Override // java.lang.Runnable
                            public final void run() {
                                C6968L.this.m28556l(cVar, j8, keyEvent);
                            }
                        });
                    }
                }
            } else if (!z7 && !containsKey) {
                z8 = false;
            }
            z7 = z8;
            i7++;
        }
        if (z6) {
            for (int i9 = 0; i9 < dVar.f24975b.length; i9++) {
                if (boolArr[i9] == null) {
                    if (z7) {
                        boolArr[i9] = Boolean.valueOf(zArr[i9]);
                    } else {
                        boolArr[i9] = Boolean.TRUE;
                        z7 = true;
                    }
                }
            }
            if (!z7) {
                boolArr[0] = Boolean.TRUE;
            }
        } else {
            for (int i10 = 0; i10 < dVar.f24975b.length; i10++) {
                if (boolArr[i10] == null) {
                    boolArr[i10] = Boolean.FALSE;
                }
            }
        }
        for (int i11 = 0; i11 < dVar.f24975b.length; i11++) {
            if (zArr[i11] != boolArr[i11].booleanValue()) {
                AbstractC6970N.c cVar2 = dVar.f24975b[i11];
                m28561q(boolArr[i11].booleanValue(), Long.valueOf(cVar2.f24973b), Long.valueOf(cVar2.f24972a), keyEvent.getEventTime());
            }
        }
    }

    /* renamed from: p */
    public void m28560p(AbstractC6970N.e eVar, boolean z6, long j7, KeyEvent keyEvent) {
        if (eVar.f24978c == j7 || eVar.f24979d == z6) {
            return;
        }
        boolean containsKey = this.f24955b.containsKey(Long.valueOf(eVar.f24977b));
        boolean z7 = !containsKey;
        if (!containsKey) {
            eVar.f24979d = !eVar.f24979d;
        }
        m28561q(z7, Long.valueOf(eVar.f24978c), Long.valueOf(eVar.f24977b), keyEvent.getEventTime());
        if (containsKey) {
            eVar.f24979d = !eVar.f24979d;
        }
        m28561q(containsKey, Long.valueOf(eVar.f24978c), Long.valueOf(eVar.f24977b), keyEvent.getEventTime());
    }

    /* renamed from: q */
    public final void m28561q(boolean z6, Long l7, Long l8, long j7) {
        C6964H c6964h = new C6964H();
        c6964h.f24926a = j7;
        c6964h.f24927b = z6 ? C6964H.b.kDown : C6964H.b.kUp;
        c6964h.f24929d = l7.longValue();
        c6964h.f24928c = l8.longValue();
        c6964h.f24932g = null;
        c6964h.f24930e = true;
        c6964h.f24931f = C6964H.a.kKeyboard;
        if (l8.longValue() != 0 && l7.longValue() != 0) {
            if (!z6) {
                l7 = null;
            }
            m28562r(l8, l7);
        }
        m28558n(c6964h, null);
    }

    /* renamed from: r */
    public void m28562r(Long l7, Long l8) {
        if (l8 != null) {
            if (((Long) this.f24955b.put(l7, l8)) != null) {
                throw new AssertionError("The key was not empty");
            }
        } else if (((Long) this.f24955b.remove(l7)) == null) {
            throw new AssertionError("The key was empty");
        }
    }
}
