package p009B1;

import android.os.Bundle;
import androidx.lifecycle.AbstractC3345j;
import kotlin.jvm.internal.AbstractC5464g;
import kotlin.jvm.internal.AbstractC5469l;

/* renamed from: B1.e */
/* loaded from: classes.dex */
public final class C0033e {

    /* renamed from: d */
    public static final a f156d = new a(null);

    /* renamed from: a */
    public final InterfaceC0034f f157a;

    /* renamed from: b */
    public final C0032d f158b;

    /* renamed from: c */
    public boolean f159c;

    /* renamed from: B1.e$a */
    public static final class a {
        public /* synthetic */ a(AbstractC5464g abstractC5464g) {
            this();
        }

        /* renamed from: a */
        public final C0033e m96a(InterfaceC0034f owner) {
            AbstractC5469l.m23028e(owner, "owner");
            return new C0033e(owner, null);
        }

        public a() {
        }
    }

    public /* synthetic */ C0033e(InterfaceC0034f interfaceC0034f, AbstractC5464g abstractC5464g) {
        this(interfaceC0034f);
    }

    /* renamed from: a */
    public static final C0033e m91a(InterfaceC0034f interfaceC0034f) {
        return f156d.m96a(interfaceC0034f);
    }

    /* renamed from: b */
    public final C0032d m92b() {
        return this.f158b;
    }

    /* renamed from: c */
    public final void m93c() {
        AbstractC3345j mo9642a = this.f157a.mo9642a();
        if (mo9642a.mo12928b() != AbstractC3345j.b.INITIALIZED) {
            throw new IllegalStateException("Restarter must be created only during owner's initialization stage");
        }
        mo9642a.mo12927a(new C0030b(this.f157a));
        this.f158b.m85e(mo9642a);
        this.f159c = true;
    }

    /* renamed from: d */
    public final void m94d(Bundle bundle) {
        if (!this.f159c) {
            m93c();
        }
        AbstractC3345j mo9642a = this.f157a.mo9642a();
        if (!mo9642a.mo12928b().m12935f(AbstractC3345j.b.STARTED)) {
            this.f158b.m86f(bundle);
            return;
        }
        throw new IllegalStateException(("performRestore cannot be called when owner is " + mo9642a.mo12928b()).toString());
    }

    /* renamed from: e */
    public final void m95e(Bundle outBundle) {
        AbstractC5469l.m23028e(outBundle, "outBundle");
        this.f158b.m87g(outBundle);
    }

    public C0033e(InterfaceC0034f interfaceC0034f) {
        this.f157a = interfaceC0034f;
        this.f158b = new C0032d();
    }
}
