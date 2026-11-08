package androidx.lifecycle;

import android.os.Bundle;
import java.util.Map;
import kotlin.jvm.internal.AbstractC5469l;
import kotlin.jvm.internal.AbstractC5470m;
import p009B1.C0032d;
import p069J5.InterfaceC0789a;
import p371w5.AbstractC6924g;
import p371w5.InterfaceC6923f;

/* renamed from: androidx.lifecycle.G */
/* loaded from: classes.dex */
public final class C3324G implements C0032d.c {

    /* renamed from: a */
    public final C0032d f10700a;

    /* renamed from: b */
    public boolean f10701b;

    /* renamed from: c */
    public Bundle f10702c;

    /* renamed from: d */
    public final InterfaceC6923f f10703d;

    /* renamed from: androidx.lifecycle.G$a */
    public static final class a extends AbstractC5470m implements InterfaceC0789a {

        /* renamed from: a */
        public final /* synthetic */ InterfaceC3333P f10704a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC3333P interfaceC3333P) {
            super(0);
            this.f10704a = interfaceC3333P;
        }

        @Override // p069J5.InterfaceC0789a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C3325H invoke() {
            return AbstractC3323F.m12876e(this.f10704a);
        }
    }

    public C3324G(C0032d savedStateRegistry, InterfaceC3333P viewModelStoreOwner) {
        AbstractC5469l.m23028e(savedStateRegistry, "savedStateRegistry");
        AbstractC5469l.m23028e(viewModelStoreOwner, "viewModelStoreOwner");
        this.f10700a = savedStateRegistry;
        this.f10703d = AbstractC6924g.m28367a(new a(viewModelStoreOwner));
    }

    @Override // p009B1.C0032d.c
    /* renamed from: a */
    public Bundle mo79a() {
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f10702c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        for (Map.Entry entry : m12878c().m12881e().entrySet()) {
            String str = (String) entry.getKey();
            Bundle mo79a = ((C3320C) entry.getValue()).m12865c().mo79a();
            if (!AbstractC5469l.m23024a(mo79a, Bundle.EMPTY)) {
                bundle.putBundle(str, mo79a);
            }
        }
        this.f10701b = false;
        return bundle;
    }

    /* renamed from: b */
    public final Bundle m12877b(String key) {
        AbstractC5469l.m23028e(key, "key");
        m12879d();
        Bundle bundle = this.f10702c;
        Bundle bundle2 = bundle != null ? bundle.getBundle(key) : null;
        Bundle bundle3 = this.f10702c;
        if (bundle3 != null) {
            bundle3.remove(key);
        }
        Bundle bundle4 = this.f10702c;
        if (bundle4 != null && bundle4.isEmpty()) {
            this.f10702c = null;
        }
        return bundle2;
    }

    /* renamed from: c */
    public final C3325H m12878c() {
        return (C3325H) this.f10703d.getValue();
    }

    /* renamed from: d */
    public final void m12879d() {
        if (this.f10701b) {
            return;
        }
        Bundle m83b = this.f10700a.m83b("androidx.lifecycle.internal.SavedStateHandlesProvider");
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f10702c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        if (m83b != null) {
            bundle.putAll(m83b);
        }
        this.f10702c = bundle;
        this.f10701b = true;
        m12878c();
    }
}
