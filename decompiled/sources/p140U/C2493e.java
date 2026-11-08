package p140U;

import java.io.File;
import java.util.List;
import kotlin.jvm.internal.AbstractC5469l;
import kotlin.jvm.internal.AbstractC5470m;
import p048G5.AbstractC0472g;
import p069J5.InterfaceC0789a;
import p112Q.C1988i;
import p112Q.InterfaceC1987h;
import p112Q.InterfaceC2002w;
import p119R.AbstractC2220b;
import p126S.C2300d;
import p132S5.InterfaceC2334J;
import p206c6.AbstractC3622j;
import p206c6.C3601M;

/* renamed from: U.e */
/* loaded from: classes.dex */
public final class C2493e {

    /* renamed from: a */
    public static final C2493e f7329a = new C2493e();

    /* renamed from: U.e$a */
    public static final class a extends AbstractC5470m implements InterfaceC0789a {

        /* renamed from: a */
        public final /* synthetic */ InterfaceC0789a f7330a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC0789a interfaceC0789a) {
            super(0);
            this.f7330a = interfaceC0789a;
        }

        @Override // p069J5.InterfaceC0789a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C3601M invoke() {
            File file = (File) this.f7330a.invoke();
            if (AbstractC5469l.m23024a(AbstractC0472g.m1719c(file), "preferences_pb")) {
                C3601M.a aVar = C3601M.f12052b;
                File absoluteFile = file.getAbsoluteFile();
                AbstractC5469l.m23027d(absoluteFile, "file.absoluteFile");
                return C3601M.a.m14499d(aVar, absoluteFile, false, 1, null);
            }
            throw new IllegalStateException(("File extension for file: " + file + " does not match required extension for Preferences file: preferences_pb").toString());
        }
    }

    /* renamed from: a */
    public final InterfaceC1987h m8434a(InterfaceC2002w storage, AbstractC2220b abstractC2220b, List migrations, InterfaceC2334J scope) {
        AbstractC5469l.m23028e(storage, "storage");
        AbstractC5469l.m23028e(migrations, "migrations");
        AbstractC5469l.m23028e(scope, "scope");
        return new C2492d(C1988i.f6005a.m7044a(storage, abstractC2220b, migrations, scope));
    }

    /* renamed from: b */
    public final InterfaceC1987h m8435b(AbstractC2220b abstractC2220b, List migrations, InterfaceC2334J scope, InterfaceC0789a produceFile) {
        AbstractC5469l.m23028e(migrations, "migrations");
        AbstractC5469l.m23028e(scope, "scope");
        AbstractC5469l.m23028e(produceFile, "produceFile");
        return new C2492d(m8434a(new C2300d(AbstractC3622j.f12141b, C2498j.f7335a, null, new a(produceFile), 4, null), abstractC2220b, migrations, scope));
    }
}
