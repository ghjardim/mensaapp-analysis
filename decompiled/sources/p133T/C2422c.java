package p133T;

import android.content.Context;
import java.io.File;
import java.util.List;
import kotlin.jvm.internal.AbstractC5469l;
import kotlin.jvm.internal.AbstractC5470m;
import p069J5.InterfaceC0789a;
import p069J5.InterfaceC0800l;
import p083L5.InterfaceC1141a;
import p111P5.InterfaceC1975i;
import p112Q.InterfaceC1987h;
import p119R.AbstractC2220b;
import p132S5.InterfaceC2334J;
import p140U.C2493e;

/* renamed from: T.c */
/* loaded from: classes.dex */
public final class C2422c implements InterfaceC1141a {

    /* renamed from: a */
    public final String f7162a;

    /* renamed from: b */
    public final InterfaceC0800l f7163b;

    /* renamed from: c */
    public final InterfaceC2334J f7164c;

    /* renamed from: d */
    public final Object f7165d;

    /* renamed from: e */
    public volatile InterfaceC1987h f7166e;

    /* renamed from: T.c$a */
    public static final class a extends AbstractC5470m implements InterfaceC0789a {

        /* renamed from: a */
        public final /* synthetic */ Context f7167a;

        /* renamed from: b */
        public final /* synthetic */ C2422c f7168b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context, C2422c c2422c) {
            super(0);
            this.f7167a = context;
            this.f7168b = c2422c;
        }

        @Override // p069J5.InterfaceC0789a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final File invoke() {
            Context applicationContext = this.f7167a;
            AbstractC5469l.m23027d(applicationContext, "applicationContext");
            return AbstractC2421b.m8208a(applicationContext, this.f7168b.f7162a);
        }
    }

    public C2422c(String name, AbstractC2220b abstractC2220b, InterfaceC0800l produceMigrations, InterfaceC2334J scope) {
        AbstractC5469l.m23028e(name, "name");
        AbstractC5469l.m23028e(produceMigrations, "produceMigrations");
        AbstractC5469l.m23028e(scope, "scope");
        this.f7162a = name;
        this.f7163b = produceMigrations;
        this.f7164c = scope;
        this.f7165d = new Object();
    }

    @Override // p083L5.InterfaceC1141a
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC1987h mo4412a(Context thisRef, InterfaceC1975i property) {
        InterfaceC1987h interfaceC1987h;
        AbstractC5469l.m23028e(thisRef, "thisRef");
        AbstractC5469l.m23028e(property, "property");
        InterfaceC1987h interfaceC1987h2 = this.f7166e;
        if (interfaceC1987h2 != null) {
            return interfaceC1987h2;
        }
        synchronized (this.f7165d) {
            try {
                if (this.f7166e == null) {
                    Context applicationContext = thisRef.getApplicationContext();
                    C2493e c2493e = C2493e.f7329a;
                    InterfaceC0800l interfaceC0800l = this.f7163b;
                    AbstractC5469l.m23027d(applicationContext, "applicationContext");
                    this.f7166e = c2493e.m8435b(null, (List) interfaceC0800l.invoke(applicationContext), this.f7164c, new a(applicationContext, this));
                }
                interfaceC1987h = this.f7166e;
                AbstractC5469l.m23025b(interfaceC1987h);
            } catch (Throwable th) {
                throw th;
            }
        }
        return interfaceC1987h;
    }
}
