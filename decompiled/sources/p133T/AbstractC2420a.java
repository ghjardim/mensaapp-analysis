package p133T;

import android.content.Context;
import java.util.List;
import kotlin.jvm.internal.AbstractC5469l;
import kotlin.jvm.internal.AbstractC5470m;
import p069J5.InterfaceC0800l;
import p083L5.InterfaceC1141a;
import p119R.AbstractC2220b;
import p132S5.AbstractC2336K;
import p132S5.AbstractC2349Q0;
import p132S5.C2363Y;
import p132S5.InterfaceC2334J;
import p378x5.AbstractC7024o;

/* renamed from: T.a */
/* loaded from: classes.dex */
public abstract class AbstractC2420a {

    /* renamed from: T.a$a */
    public static final class a extends AbstractC5470m implements InterfaceC0800l {

        /* renamed from: a */
        public static final a f7161a = new a();

        public a() {
            super(1);
        }

        @Override // p069J5.InterfaceC0800l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List invoke(Context it) {
            AbstractC5469l.m23028e(it, "it");
            return AbstractC7024o.m28861g();
        }
    }

    /* renamed from: a */
    public static final InterfaceC1141a m8205a(String name, AbstractC2220b abstractC2220b, InterfaceC0800l produceMigrations, InterfaceC2334J scope) {
        AbstractC5469l.m23028e(name, "name");
        AbstractC5469l.m23028e(produceMigrations, "produceMigrations");
        AbstractC5469l.m23028e(scope, "scope");
        return new C2422c(name, abstractC2220b, produceMigrations, scope);
    }

    /* renamed from: b */
    public static /* synthetic */ InterfaceC1141a m8206b(String str, AbstractC2220b abstractC2220b, InterfaceC0800l interfaceC0800l, InterfaceC2334J interfaceC2334J, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            abstractC2220b = null;
        }
        if ((i7 & 4) != 0) {
            interfaceC0800l = a.f7161a;
        }
        if ((i7 & 8) != 0) {
            interfaceC2334J = AbstractC2336K.m7996a(C2363Y.m8054b().plus(AbstractC2349Q0.m8020b(null, 1, null)));
        }
        return m8205a(str, abstractC2220b, interfaceC0800l, interfaceC2334J);
    }
}
