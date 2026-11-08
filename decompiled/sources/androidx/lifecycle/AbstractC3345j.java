package androidx.lifecycle;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.AbstractC5464g;
import kotlin.jvm.internal.AbstractC5469l;

/* renamed from: androidx.lifecycle.j */
/* loaded from: classes.dex */
public abstract class AbstractC3345j {

    /* renamed from: a */
    public AtomicReference f10739a = new AtomicReference(null);

    /* renamed from: androidx.lifecycle.j$a */
    public enum a {
        ON_CREATE,
        ON_START,
        ON_RESUME,
        ON_PAUSE,
        ON_STOP,
        ON_DESTROY,
        ON_ANY;

        public static final C7210a Companion = new C7210a(null);

        /* renamed from: androidx.lifecycle.j$a$a, reason: collision with other inner class name */
        public static final class C7210a {

            /* renamed from: androidx.lifecycle.j$a$a$a, reason: collision with other inner class name */
            public /* synthetic */ class C7211a {

                /* renamed from: a */
                public static final /* synthetic */ int[] f10740a;

                static {
                    int[] iArr = new int[b.values().length];
                    try {
                        iArr[b.CREATED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[b.STARTED.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[b.RESUMED.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[b.DESTROYED.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    try {
                        iArr[b.INITIALIZED.ordinal()] = 5;
                    } catch (NoSuchFieldError unused5) {
                    }
                    f10740a = iArr;
                }
            }

            public /* synthetic */ C7210a(AbstractC5464g abstractC5464g) {
                this();
            }

            /* renamed from: a */
            public final a m12932a(b state) {
                AbstractC5469l.m23028e(state, "state");
                int i7 = C7211a.f10740a[state.ordinal()];
                if (i7 == 1) {
                    return a.ON_DESTROY;
                }
                if (i7 == 2) {
                    return a.ON_STOP;
                }
                if (i7 != 3) {
                    return null;
                }
                return a.ON_PAUSE;
            }

            /* renamed from: b */
            public final a m12933b(b state) {
                AbstractC5469l.m23028e(state, "state");
                int i7 = C7211a.f10740a[state.ordinal()];
                if (i7 == 1) {
                    return a.ON_START;
                }
                if (i7 == 2) {
                    return a.ON_RESUME;
                }
                if (i7 != 5) {
                    return null;
                }
                return a.ON_CREATE;
            }

            public C7210a() {
            }
        }

        /* renamed from: androidx.lifecycle.j$a$b */
        public /* synthetic */ class b {

            /* renamed from: a */
            public static final /* synthetic */ int[] f10741a;

            static {
                int[] iArr = new int[a.values().length];
                try {
                    iArr[a.ON_CREATE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[a.ON_STOP.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[a.ON_START.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[a.ON_PAUSE.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[a.ON_RESUME.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[a.ON_DESTROY.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[a.ON_ANY.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                f10741a = iArr;
            }
        }

        /* renamed from: f */
        public final b m12931f() {
            switch (b.f10741a[ordinal()]) {
                case 1:
                case 2:
                    return b.CREATED;
                case 3:
                case 4:
                    return b.STARTED;
                case 5:
                    return b.RESUMED;
                case 6:
                    return b.DESTROYED;
                default:
                    throw new IllegalArgumentException(this + " has no target state");
            }
        }
    }

    /* renamed from: androidx.lifecycle.j$b */
    public enum b {
        DESTROYED,
        INITIALIZED,
        CREATED,
        STARTED,
        RESUMED;

        /* renamed from: f */
        public final boolean m12935f(b state) {
            AbstractC5469l.m23028e(state, "state");
            return compareTo(state) >= 0;
        }
    }

    /* renamed from: a */
    public abstract void mo12927a(InterfaceC3348m interfaceC3348m);

    /* renamed from: b */
    public abstract b mo12928b();

    /* renamed from: c */
    public abstract void mo12929c(InterfaceC3348m interfaceC3348m);
}
