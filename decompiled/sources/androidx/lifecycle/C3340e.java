package androidx.lifecycle;

import androidx.lifecycle.AbstractC3345j;
import kotlin.jvm.internal.AbstractC5469l;

/* renamed from: androidx.lifecycle.e */
/* loaded from: classes.dex */
public final class C3340e implements InterfaceC3347l {

    /* renamed from: a */
    public final DefaultLifecycleObserver f10733a;

    /* renamed from: b */
    public final InterfaceC3347l f10734b;

    /* renamed from: androidx.lifecycle.e$a */
    public /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f10735a;

        static {
            int[] iArr = new int[AbstractC3345j.a.values().length];
            try {
                iArr[AbstractC3345j.a.ON_CREATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AbstractC3345j.a.ON_START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AbstractC3345j.a.ON_RESUME.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AbstractC3345j.a.ON_PAUSE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[AbstractC3345j.a.ON_STOP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[AbstractC3345j.a.ON_DESTROY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[AbstractC3345j.a.ON_ANY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f10735a = iArr;
        }
    }

    public C3340e(DefaultLifecycleObserver defaultLifecycleObserver, InterfaceC3347l interfaceC3347l) {
        AbstractC5469l.m23028e(defaultLifecycleObserver, "defaultLifecycleObserver");
        this.f10733a = defaultLifecycleObserver;
        this.f10734b = interfaceC3347l;
    }

    @Override // androidx.lifecycle.InterfaceC3347l
    /* renamed from: d */
    public void mo78d(InterfaceC3349n source, AbstractC3345j.a event) {
        AbstractC5469l.m23028e(source, "source");
        AbstractC5469l.m23028e(event, "event");
        switch (a.f10735a[event.ordinal()]) {
            case 1:
                this.f10733a.mo10167c(source);
                break;
            case 2:
                this.f10733a.mo10171m(source);
                break;
            case 3:
                this.f10733a.mo10166a(source);
                break;
            case 4:
                this.f10733a.mo10168g(source);
                break;
            case 5:
                this.f10733a.mo10169h(source);
                break;
            case 6:
                this.f10733a.mo10170j(source);
                break;
            case 7:
                throw new IllegalArgumentException("ON_ANY must not been send by anybody");
        }
        InterfaceC3347l interfaceC3347l = this.f10734b;
        if (interfaceC3347l != null) {
            interfaceC3347l.mo78d(source, event);
        }
    }
}
