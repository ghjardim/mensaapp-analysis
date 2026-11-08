package p256j$.util.concurrent;

import java.util.concurrent.locks.LockSupport;
import p256j$.sun.misc.C4817a;

/* renamed from: j$.util.concurrent.q */
/* loaded from: classes3.dex */
final class C4984q extends C4979l {

    /* renamed from: h */
    private static final C4817a f18239h;

    /* renamed from: i */
    private static final long f18240i;

    /* renamed from: e */
    C4985r f18241e;

    /* renamed from: f */
    volatile C4985r f18242f;

    /* renamed from: g */
    volatile Thread f18243g;
    volatile int lockState;

    /* renamed from: i */
    static int m21335i(Object obj, Object obj2) {
        int compareTo;
        if (obj == null || obj2 == null || (compareTo = obj.getClass().getName().compareTo(obj2.getClass().getName())) == 0) {
            return System.identityHashCode(obj) <= System.identityHashCode(obj2) ? -1 : 1;
        }
        return compareTo;
    }

    C4984q(C4985r c4985r) {
        super(-2, null, null);
        int i7;
        this.f18242f = c4985r;
        C4985r c4985r2 = null;
        while (c4985r != null) {
            C4985r c4985r3 = (C4985r) c4985r.f18226d;
            c4985r.f18246g = null;
            c4985r.f18245f = null;
            if (c4985r2 == null) {
                c4985r.f18244e = null;
                c4985r.f18248i = false;
            } else {
                Object obj = c4985r.f18224b;
                int i8 = c4985r.f18223a;
                C4985r c4985r4 = c4985r2;
                Class<?> cls = null;
                while (true) {
                    Object obj2 = c4985r4.f18224b;
                    int i9 = c4985r4.f18223a;
                    if (i9 > i8) {
                        i7 = -1;
                    } else if (i9 < i8) {
                        i7 = 1;
                    } else {
                        if (cls != null || (cls = ConcurrentHashMap.m21305c(obj)) != null) {
                            int i10 = ConcurrentHashMap.f18178g;
                            int compareTo = (obj2 == null || obj2.getClass() != cls) ? 0 : ((Comparable) obj).compareTo(obj2);
                            if (compareTo != 0) {
                                i7 = compareTo;
                            }
                        }
                        i7 = m21335i(obj, obj2);
                    }
                    C4985r c4985r5 = i7 <= 0 ? c4985r4.f18245f : c4985r4.f18246g;
                    if (c4985r5 == null) {
                        break;
                    } else {
                        c4985r4 = c4985r5;
                    }
                }
                c4985r.f18244e = c4985r4;
                if (i7 <= 0) {
                    c4985r4.f18245f = c4985r;
                } else {
                    c4985r4.f18246g = c4985r;
                }
                c4985r = m21331c(c4985r2, c4985r);
            }
            c4985r2 = c4985r;
            c4985r = c4985r3;
        }
        this.f18241e = c4985r2;
    }

    /* renamed from: d */
    private final void m21332d() {
        if (f18239h.m20880c(this, f18240i, 0, 1)) {
            return;
        }
        boolean z6 = false;
        while (true) {
            int i7 = this.lockState;
            if ((i7 & (-3)) == 0) {
                if (f18239h.m20880c(this, f18240i, i7, 1)) {
                    break;
                }
            } else if ((i7 & 2) == 0) {
                if (f18239h.m20880c(this, f18240i, i7, i7 | 2)) {
                    this.f18243g = Thread.currentThread();
                    z6 = true;
                }
            } else if (z6) {
                LockSupport.park(this);
            }
        }
        if (z6) {
            this.f18243g = null;
        }
    }

    @Override // p256j$.util.concurrent.C4979l
    /* renamed from: a */
    final C4979l mo21328a(int i7, Object obj) {
        Object obj2;
        Thread thread;
        Thread thread2;
        C4985r c4985r = null;
        if (obj != null) {
            C4979l c4979l = this.f18242f;
            while (c4979l != null) {
                int i8 = this.lockState;
                if ((i8 & 3) != 0) {
                    if (c4979l.f18223a == i7 && ((obj2 = c4979l.f18224b) == obj || (obj2 != null && obj.equals(obj2)))) {
                        return c4979l;
                    }
                    c4979l = c4979l.f18226d;
                } else {
                    C4817a c4817a = f18239h;
                    long j7 = f18240i;
                    if (c4817a.m20880c(this, j7, i8, i8 + 4)) {
                        try {
                            C4985r c4985r2 = this.f18241e;
                            if (c4985r2 != null) {
                                c4985r = c4985r2.m21338b(i7, obj, null);
                            }
                            if (c4817a.m20883f(this, j7) == 6 && (thread2 = this.f18243g) != null) {
                                LockSupport.unpark(thread2);
                            }
                            return c4985r;
                        } catch (Throwable th) {
                            if (f18239h.m20883f(this, f18240i) == 6 && (thread = this.f18243g) != null) {
                                LockSupport.unpark(thread);
                            }
                            throw th;
                        }
                    }
                }
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x00b2, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00ba, code lost:
    
        return r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0070, code lost:
    
        return r3;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x00b7 A[LOOP:0: B:2:0x000c->B:10:0x00b7, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0081 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x007a  */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final p256j$.util.concurrent.C4985r m21336e(int r16, java.lang.Object r17, java.lang.Object r18) {
        /*
            Method dump skipped, instructions count: 187
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p256j$.util.concurrent.C4984q.m21336e(int, java.lang.Object, java.lang.Object):j$.util.concurrent.r");
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0091 A[Catch: all -> 0x0052, TryCatch #0 {all -> 0x0052, blocks: (B:21:0x0030, B:25:0x0039, B:29:0x003f, B:31:0x004d, B:32:0x0068, B:34:0x006e, B:35:0x0070, B:41:0x0091, B:44:0x00a2, B:45:0x0099, B:47:0x009d, B:48:0x00a0, B:49:0x00a8, B:52:0x00b1, B:54:0x00b5, B:56:0x00b9, B:58:0x00bd, B:59:0x00c6, B:61:0x00c0, B:63:0x00c4, B:66:0x00ad, B:68:0x007a, B:70:0x007e, B:71:0x0081, B:72:0x0055, B:74:0x005b, B:76:0x005f, B:77:0x0062, B:78:0x0064), top: B:20:0x0030 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00b5 A[Catch: all -> 0x0052, TryCatch #0 {all -> 0x0052, blocks: (B:21:0x0030, B:25:0x0039, B:29:0x003f, B:31:0x004d, B:32:0x0068, B:34:0x006e, B:35:0x0070, B:41:0x0091, B:44:0x00a2, B:45:0x0099, B:47:0x009d, B:48:0x00a0, B:49:0x00a8, B:52:0x00b1, B:54:0x00b5, B:56:0x00b9, B:58:0x00bd, B:59:0x00c6, B:61:0x00c0, B:63:0x00c4, B:66:0x00ad, B:68:0x007a, B:70:0x007e, B:71:0x0081, B:72:0x0055, B:74:0x005b, B:76:0x005f, B:77:0x0062, B:78:0x0064), top: B:20:0x0030 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00bd A[Catch: all -> 0x0052, TryCatch #0 {all -> 0x0052, blocks: (B:21:0x0030, B:25:0x0039, B:29:0x003f, B:31:0x004d, B:32:0x0068, B:34:0x006e, B:35:0x0070, B:41:0x0091, B:44:0x00a2, B:45:0x0099, B:47:0x009d, B:48:0x00a0, B:49:0x00a8, B:52:0x00b1, B:54:0x00b5, B:56:0x00b9, B:58:0x00bd, B:59:0x00c6, B:61:0x00c0, B:63:0x00c4, B:66:0x00ad, B:68:0x007a, B:70:0x007e, B:71:0x0081, B:72:0x0055, B:74:0x005b, B:76:0x005f, B:77:0x0062, B:78:0x0064), top: B:20:0x0030 }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00c0 A[Catch: all -> 0x0052, TryCatch #0 {all -> 0x0052, blocks: (B:21:0x0030, B:25:0x0039, B:29:0x003f, B:31:0x004d, B:32:0x0068, B:34:0x006e, B:35:0x0070, B:41:0x0091, B:44:0x00a2, B:45:0x0099, B:47:0x009d, B:48:0x00a0, B:49:0x00a8, B:52:0x00b1, B:54:0x00b5, B:56:0x00b9, B:58:0x00bd, B:59:0x00c6, B:61:0x00c0, B:63:0x00c4, B:66:0x00ad, B:68:0x007a, B:70:0x007e, B:71:0x0081, B:72:0x0055, B:74:0x005b, B:76:0x005f, B:77:0x0062, B:78:0x0064), top: B:20:0x0030 }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00ad A[Catch: all -> 0x0052, TryCatch #0 {all -> 0x0052, blocks: (B:21:0x0030, B:25:0x0039, B:29:0x003f, B:31:0x004d, B:32:0x0068, B:34:0x006e, B:35:0x0070, B:41:0x0091, B:44:0x00a2, B:45:0x0099, B:47:0x009d, B:48:0x00a0, B:49:0x00a8, B:52:0x00b1, B:54:0x00b5, B:56:0x00b9, B:58:0x00bd, B:59:0x00c6, B:61:0x00c0, B:63:0x00c4, B:66:0x00ad, B:68:0x007a, B:70:0x007e, B:71:0x0081, B:72:0x0055, B:74:0x005b, B:76:0x005f, B:77:0x0062, B:78:0x0064), top: B:20:0x0030 }] */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final boolean m21337f(p256j$.util.concurrent.C4985r r11) {
        /*
            Method dump skipped, instructions count: 207
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p256j$.util.concurrent.C4984q.m21337f(j$.util.concurrent.r):boolean");
    }

    /* renamed from: g */
    static C4985r m21333g(C4985r c4985r, C4985r c4985r2) {
        C4985r c4985r3;
        if (c4985r2 != null && (c4985r3 = c4985r2.f18246g) != null) {
            C4985r c4985r4 = c4985r3.f18245f;
            c4985r2.f18246g = c4985r4;
            if (c4985r4 != null) {
                c4985r4.f18244e = c4985r2;
            }
            C4985r c4985r5 = c4985r2.f18244e;
            c4985r3.f18244e = c4985r5;
            if (c4985r5 == null) {
                c4985r3.f18248i = false;
                c4985r = c4985r3;
            } else if (c4985r5.f18245f == c4985r2) {
                c4985r5.f18245f = c4985r3;
            } else {
                c4985r5.f18246g = c4985r3;
            }
            c4985r3.f18245f = c4985r2;
            c4985r2.f18244e = c4985r3;
        }
        return c4985r;
    }

    /* renamed from: h */
    static C4985r m21334h(C4985r c4985r, C4985r c4985r2) {
        C4985r c4985r3;
        if (c4985r2 != null && (c4985r3 = c4985r2.f18245f) != null) {
            C4985r c4985r4 = c4985r3.f18246g;
            c4985r2.f18245f = c4985r4;
            if (c4985r4 != null) {
                c4985r4.f18244e = c4985r2;
            }
            C4985r c4985r5 = c4985r2.f18244e;
            c4985r3.f18244e = c4985r5;
            if (c4985r5 == null) {
                c4985r3.f18248i = false;
                c4985r = c4985r3;
            } else if (c4985r5.f18246g == c4985r2) {
                c4985r5.f18246g = c4985r3;
            } else {
                c4985r5.f18245f = c4985r3;
            }
            c4985r3.f18246g = c4985r2;
            c4985r2.f18244e = c4985r3;
        }
        return c4985r;
    }

    /* renamed from: c */
    static C4985r m21331c(C4985r c4985r, C4985r c4985r2) {
        C4985r c4985r3;
        c4985r2.f18248i = true;
        while (true) {
            C4985r c4985r4 = c4985r2.f18244e;
            if (c4985r4 == null) {
                c4985r2.f18248i = false;
                return c4985r2;
            }
            if (!c4985r4.f18248i || (c4985r3 = c4985r4.f18244e) == null) {
                break;
            }
            C4985r c4985r5 = c4985r3.f18245f;
            if (c4985r4 == c4985r5) {
                C4985r c4985r6 = c4985r3.f18246g;
                if (c4985r6 != null && c4985r6.f18248i) {
                    c4985r6.f18248i = false;
                    c4985r4.f18248i = false;
                    c4985r3.f18248i = true;
                    c4985r2 = c4985r3;
                } else {
                    if (c4985r2 == c4985r4.f18246g) {
                        c4985r = m21333g(c4985r, c4985r4);
                        C4985r c4985r7 = c4985r4.f18244e;
                        c4985r3 = c4985r7 == null ? null : c4985r7.f18244e;
                        c4985r4 = c4985r7;
                        c4985r2 = c4985r4;
                    }
                    if (c4985r4 != null) {
                        c4985r4.f18248i = false;
                        if (c4985r3 != null) {
                            c4985r3.f18248i = true;
                            c4985r = m21334h(c4985r, c4985r3);
                        }
                    }
                }
            } else if (c4985r5 != null && c4985r5.f18248i) {
                c4985r5.f18248i = false;
                c4985r4.f18248i = false;
                c4985r3.f18248i = true;
                c4985r2 = c4985r3;
            } else {
                if (c4985r2 == c4985r4.f18245f) {
                    c4985r = m21334h(c4985r, c4985r4);
                    C4985r c4985r8 = c4985r4.f18244e;
                    c4985r3 = c4985r8 == null ? null : c4985r8.f18244e;
                    c4985r4 = c4985r8;
                    c4985r2 = c4985r4;
                }
                if (c4985r4 != null) {
                    c4985r4.f18248i = false;
                    if (c4985r3 != null) {
                        c4985r3.f18248i = true;
                        c4985r = m21333g(c4985r, c4985r3);
                    }
                }
            }
        }
        return c4985r;
    }

    /* renamed from: b */
    static C4985r m21330b(C4985r c4985r, C4985r c4985r2) {
        while (c4985r2 != null && c4985r2 != c4985r) {
            C4985r c4985r3 = c4985r2.f18244e;
            if (c4985r3 == null) {
                c4985r2.f18248i = false;
                return c4985r2;
            }
            if (c4985r2.f18248i) {
                c4985r2.f18248i = false;
                return c4985r;
            }
            C4985r c4985r4 = c4985r3.f18245f;
            if (c4985r4 == c4985r2) {
                C4985r c4985r5 = c4985r3.f18246g;
                if (c4985r5 != null && c4985r5.f18248i) {
                    c4985r5.f18248i = false;
                    c4985r3.f18248i = true;
                    c4985r = m21333g(c4985r, c4985r3);
                    c4985r3 = c4985r2.f18244e;
                    c4985r5 = c4985r3 == null ? null : c4985r3.f18246g;
                }
                if (c4985r5 != null) {
                    C4985r c4985r6 = c4985r5.f18245f;
                    C4985r c4985r7 = c4985r5.f18246g;
                    if ((c4985r7 == null || !c4985r7.f18248i) && (c4985r6 == null || !c4985r6.f18248i)) {
                        c4985r5.f18248i = true;
                    } else {
                        if (c4985r7 == null || !c4985r7.f18248i) {
                            if (c4985r6 != null) {
                                c4985r6.f18248i = false;
                            }
                            c4985r5.f18248i = true;
                            c4985r = m21334h(c4985r, c4985r5);
                            c4985r3 = c4985r2.f18244e;
                            c4985r5 = c4985r3 != null ? c4985r3.f18246g : null;
                        }
                        if (c4985r5 != null) {
                            c4985r5.f18248i = c4985r3 == null ? false : c4985r3.f18248i;
                            C4985r c4985r8 = c4985r5.f18246g;
                            if (c4985r8 != null) {
                                c4985r8.f18248i = false;
                            }
                        }
                        if (c4985r3 != null) {
                            c4985r3.f18248i = false;
                            c4985r = m21333g(c4985r, c4985r3);
                        }
                        c4985r2 = c4985r;
                    }
                }
                c4985r2 = c4985r3;
            } else {
                if (c4985r4 != null && c4985r4.f18248i) {
                    c4985r4.f18248i = false;
                    c4985r3.f18248i = true;
                    c4985r = m21334h(c4985r, c4985r3);
                    c4985r3 = c4985r2.f18244e;
                    c4985r4 = c4985r3 == null ? null : c4985r3.f18245f;
                }
                if (c4985r4 != null) {
                    C4985r c4985r9 = c4985r4.f18245f;
                    C4985r c4985r10 = c4985r4.f18246g;
                    if ((c4985r9 == null || !c4985r9.f18248i) && (c4985r10 == null || !c4985r10.f18248i)) {
                        c4985r4.f18248i = true;
                    } else {
                        if (c4985r9 == null || !c4985r9.f18248i) {
                            if (c4985r10 != null) {
                                c4985r10.f18248i = false;
                            }
                            c4985r4.f18248i = true;
                            c4985r = m21333g(c4985r, c4985r4);
                            c4985r3 = c4985r2.f18244e;
                            c4985r4 = c4985r3 != null ? c4985r3.f18245f : null;
                        }
                        if (c4985r4 != null) {
                            c4985r4.f18248i = c4985r3 == null ? false : c4985r3.f18248i;
                            C4985r c4985r11 = c4985r4.f18245f;
                            if (c4985r11 != null) {
                                c4985r11.f18248i = false;
                            }
                        }
                        if (c4985r3 != null) {
                            c4985r3.f18248i = false;
                            c4985r = m21334h(c4985r, c4985r3);
                        }
                        c4985r2 = c4985r;
                    }
                }
                c4985r2 = c4985r3;
            }
        }
        return c4985r;
    }

    static {
        C4817a m20876h = C4817a.m20876h();
        f18239h = m20876h;
        f18240i = m20876h.m20885j(C4984q.class, "lockState");
    }
}
