package p079L1;

import android.app.Activity;
import kotlin.jvm.internal.AbstractC5469l;
import kotlin.jvm.internal.AbstractC5470m;
import p069J5.InterfaceC0800l;

/* renamed from: L1.m */
/* loaded from: classes.dex */
public interface InterfaceC0904m {

    /* renamed from: a */
    public static final a f3151a = a.f3152a;

    /* renamed from: L1.m$a */
    public static final class a {

        /* renamed from: a */
        public static final /* synthetic */ a f3152a = new a();

        /* renamed from: b */
        public static InterfaceC0800l f3153b = C7177a.f3154a;

        /* renamed from: L1.m$a$a, reason: collision with other inner class name */
        public static final class C7177a extends AbstractC5470m implements InterfaceC0800l {

            /* renamed from: a */
            public static final C7177a f3154a = new C7177a();

            public C7177a() {
                super(1);
            }

            @Override // p069J5.InterfaceC0800l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final InterfaceC0904m invoke(InterfaceC0904m it) {
                AbstractC5469l.m23028e(it, "it");
                return it;
            }
        }

        /* renamed from: a */
        public final InterfaceC0904m m3760a() {
            return (InterfaceC0904m) f3153b.invoke(C0907p.f3155b);
        }
    }

    /* renamed from: a */
    C0902k mo3759a(Activity activity);
}
