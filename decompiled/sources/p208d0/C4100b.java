package p208d0;

import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import androidx.lifecycle.AbstractC3329L;
import androidx.lifecycle.AbstractC3331N;
import androidx.lifecycle.C3330M;
import androidx.lifecycle.C3332O;
import androidx.lifecycle.C3355t;
import androidx.lifecycle.InterfaceC3349n;
import androidx.lifecycle.InterfaceC3356u;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import p111P5.InterfaceC1969c;
import p192b0.AbstractC3503a;
import p208d0.AbstractC4099a;
import p216e0.AbstractC4150b;
import p334s.C6319l;

/* renamed from: d0.b */
/* loaded from: classes.dex */
public class C4100b extends AbstractC4099a {

    /* renamed from: c */
    public static boolean f13666c = false;

    /* renamed from: a */
    public final InterfaceC3349n f13667a;

    /* renamed from: b */
    public final c f13668b;

    /* renamed from: d0.b$a */
    public static class a extends C3355t implements AbstractC4150b.a {

        /* renamed from: l */
        public final int f13669l;

        /* renamed from: m */
        public final Bundle f13670m;

        /* renamed from: n */
        public final AbstractC4150b f13671n;

        /* renamed from: o */
        public InterfaceC3349n f13672o;

        /* renamed from: p */
        public b f13673p;

        /* renamed from: q */
        public AbstractC4150b f13674q;

        public a(int i7, Bundle bundle, AbstractC4150b abstractC4150b, AbstractC4150b abstractC4150b2) {
            this.f13669l = i7;
            this.f13670m = bundle;
            this.f13671n = abstractC4150b;
            this.f13674q = abstractC4150b2;
            abstractC4150b.m17442r(i7, this);
        }

        @Override // p216e0.AbstractC4150b.a
        /* renamed from: a */
        public void mo17199a(AbstractC4150b abstractC4150b, Object obj) {
            if (C4100b.f13666c) {
                Log.v("LoaderManager", "onLoadComplete: " + this);
            }
            if (Looper.myLooper() == Looper.getMainLooper()) {
                mo12971n(obj);
                return;
            }
            if (C4100b.f13666c) {
                Log.w("LoaderManager", "onLoadComplete was incorrectly called on a background thread");
            }
            mo12969l(obj);
        }

        @Override // androidx.lifecycle.AbstractC3353r
        /* renamed from: j */
        public void mo12967j() {
            if (C4100b.f13666c) {
                Log.v("LoaderManager", "  Starting: " + this);
            }
            this.f13671n.m17445u();
        }

        @Override // androidx.lifecycle.AbstractC3353r
        /* renamed from: k */
        public void mo12968k() {
            if (C4100b.f13666c) {
                Log.v("LoaderManager", "  Stopping: " + this);
            }
            this.f13671n.m17446v();
        }

        @Override // androidx.lifecycle.AbstractC3353r
        /* renamed from: m */
        public void mo12970m(InterfaceC3356u interfaceC3356u) {
            super.mo12970m(interfaceC3356u);
            this.f13672o = null;
            this.f13673p = null;
        }

        @Override // androidx.lifecycle.C3355t, androidx.lifecycle.AbstractC3353r
        /* renamed from: n */
        public void mo12971n(Object obj) {
            super.mo12971n(obj);
            AbstractC4150b abstractC4150b = this.f13674q;
            if (abstractC4150b != null) {
                abstractC4150b.m17443s();
                this.f13674q = null;
            }
        }

        /* renamed from: o */
        public AbstractC4150b m17200o(boolean z6) {
            if (C4100b.f13666c) {
                Log.v("LoaderManager", "  Destroying: " + this);
            }
            this.f13671n.m17429b();
            this.f13671n.m17428a();
            b bVar = this.f13673p;
            if (bVar != null) {
                mo12970m(bVar);
                if (z6) {
                    bVar.m17207d();
                }
            }
            this.f13671n.m17447w(this);
            if ((bVar == null || bVar.m17206c()) && !z6) {
                return this.f13671n;
            }
            this.f13671n.m17443s();
            return this.f13674q;
        }

        /* renamed from: p */
        public void m17201p(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            printWriter.print(str);
            printWriter.print("mId=");
            printWriter.print(this.f13669l);
            printWriter.print(" mArgs=");
            printWriter.println(this.f13670m);
            printWriter.print(str);
            printWriter.print("mLoader=");
            printWriter.println(this.f13671n);
            this.f13671n.mo17419g(str + "  ", fileDescriptor, printWriter, strArr);
            if (this.f13673p != null) {
                printWriter.print(str);
                printWriter.print("mCallbacks=");
                printWriter.println(this.f13673p);
                this.f13673p.m17205b(str + "  ", printWriter);
            }
            printWriter.print(str);
            printWriter.print("mData=");
            printWriter.println(m17202q().m17431d(m12963f()));
            printWriter.print(str);
            printWriter.print("mStarted=");
            printWriter.println(m12964g());
        }

        /* renamed from: q */
        public AbstractC4150b m17202q() {
            return this.f13671n;
        }

        /* renamed from: r */
        public void m17203r() {
            InterfaceC3349n interfaceC3349n = this.f13672o;
            b bVar = this.f13673p;
            if (interfaceC3349n == null || bVar == null) {
                return;
            }
            super.mo12970m(bVar);
            m12965h(interfaceC3349n, bVar);
        }

        /* renamed from: s */
        public AbstractC4150b m17204s(InterfaceC3349n interfaceC3349n, AbstractC4099a.a aVar) {
            b bVar = new b(this.f13671n, aVar);
            m12965h(interfaceC3349n, bVar);
            InterfaceC3356u interfaceC3356u = this.f13673p;
            if (interfaceC3356u != null) {
                mo12970m(interfaceC3356u);
            }
            this.f13672o = interfaceC3349n;
            this.f13673p = bVar;
            return this.f13671n;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(64);
            sb.append("LoaderInfo{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" #");
            sb.append(this.f13669l);
            sb.append(" : ");
            Class<?> cls = this.f13671n.getClass();
            sb.append(cls.getSimpleName());
            sb.append("{");
            sb.append(Integer.toHexString(System.identityHashCode(cls)));
            sb.append("}}");
            return sb.toString();
        }
    }

    /* renamed from: d0.b$b */
    public static class b implements InterfaceC3356u {

        /* renamed from: a */
        public final AbstractC4150b f13675a;

        /* renamed from: b */
        public final AbstractC4099a.a f13676b;

        /* renamed from: c */
        public boolean f13677c = false;

        public b(AbstractC4150b abstractC4150b, AbstractC4099a.a aVar) {
            this.f13675a = abstractC4150b;
            this.f13676b = aVar;
        }

        @Override // androidx.lifecycle.InterfaceC3356u
        /* renamed from: a */
        public void mo8344a(Object obj) {
            if (C4100b.f13666c) {
                Log.v("LoaderManager", "  onLoadFinished in " + this.f13675a + ": " + this.f13675a.m17431d(obj));
            }
            this.f13677c = true;
            this.f13676b.mo17196b(this.f13675a, obj);
        }

        /* renamed from: b */
        public void m17205b(String str, PrintWriter printWriter) {
            printWriter.print(str);
            printWriter.print("mDeliveredData=");
            printWriter.println(this.f13677c);
        }

        /* renamed from: c */
        public boolean m17206c() {
            return this.f13677c;
        }

        /* renamed from: d */
        public void m17207d() {
            if (this.f13677c) {
                if (C4100b.f13666c) {
                    Log.v("LoaderManager", "  Resetting: " + this.f13675a);
                }
                this.f13676b.mo17197c(this.f13675a);
            }
        }

        public String toString() {
            return this.f13676b.toString();
        }
    }

    /* renamed from: d0.b$c */
    public static class c extends AbstractC3329L {

        /* renamed from: d */
        public static final C3330M.c f13678d = new a();

        /* renamed from: b */
        public C6319l f13679b = new C6319l();

        /* renamed from: c */
        public boolean f13680c = false;

        /* renamed from: d0.b$c$a */
        public static class a implements C3330M.c {
            @Override // androidx.lifecycle.C3330M.c
            /* renamed from: a */
            public AbstractC3329L mo9556a(Class cls) {
                return new c();
            }

            @Override // androidx.lifecycle.C3330M.c
            /* renamed from: b */
            public /* synthetic */ AbstractC3329L mo9557b(InterfaceC1969c interfaceC1969c, AbstractC3503a abstractC3503a) {
                return AbstractC3331N.m12901a(this, interfaceC1969c, abstractC3503a);
            }

            @Override // androidx.lifecycle.C3330M.c
            /* renamed from: c */
            public /* synthetic */ AbstractC3329L mo9558c(Class cls, AbstractC3503a abstractC3503a) {
                return AbstractC3331N.m12903c(this, cls, abstractC3503a);
            }
        }

        /* renamed from: g */
        public static c m17208g(C3332O c3332o) {
            return (c) new C3330M(c3332o, f13678d).m12892b(c.class);
        }

        @Override // androidx.lifecycle.AbstractC3329L
        /* renamed from: d */
        public void mo9543d() {
            super.mo9543d();
            int m26467i = this.f13679b.m26467i();
            for (int i7 = 0; i7 < m26467i; i7++) {
                ((a) this.f13679b.m26468j(i7)).m17200o(true);
            }
            this.f13679b.m26461b();
        }

        /* renamed from: e */
        public void m17209e(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            if (this.f13679b.m26467i() > 0) {
                printWriter.print(str);
                printWriter.println("Loaders:");
                String str2 = str + "    ";
                for (int i7 = 0; i7 < this.f13679b.m26467i(); i7++) {
                    a aVar = (a) this.f13679b.m26468j(i7);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(this.f13679b.m26465f(i7));
                    printWriter.print(": ");
                    printWriter.println(aVar.toString());
                    aVar.m17201p(str2, fileDescriptor, printWriter, strArr);
                }
            }
        }

        /* renamed from: f */
        public void m17210f() {
            this.f13680c = false;
        }

        /* renamed from: h */
        public a m17211h(int i7) {
            return (a) this.f13679b.m26463d(i7);
        }

        /* renamed from: i */
        public boolean m17212i() {
            return this.f13680c;
        }

        /* renamed from: j */
        public void m17213j() {
            int m26467i = this.f13679b.m26467i();
            for (int i7 = 0; i7 < m26467i; i7++) {
                ((a) this.f13679b.m26468j(i7)).m17203r();
            }
        }

        /* renamed from: k */
        public void m17214k(int i7, a aVar) {
            this.f13679b.m26466g(i7, aVar);
        }

        /* renamed from: l */
        public void m17215l() {
            this.f13680c = true;
        }
    }

    public C4100b(InterfaceC3349n interfaceC3349n, C3332O c3332o) {
        this.f13667a = interfaceC3349n;
        this.f13668b = c.m17208g(c3332o);
    }

    @Override // p208d0.AbstractC4099a
    /* renamed from: a */
    public void mo17192a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        this.f13668b.m17209e(str, fileDescriptor, printWriter, strArr);
    }

    @Override // p208d0.AbstractC4099a
    /* renamed from: c */
    public AbstractC4150b mo17193c(int i7, Bundle bundle, AbstractC4099a.a aVar) {
        if (this.f13668b.m17212i()) {
            throw new IllegalStateException("Called while creating a loader");
        }
        if (Looper.getMainLooper() != Looper.myLooper()) {
            throw new IllegalStateException("initLoader must be called on the main thread");
        }
        a m17211h = this.f13668b.m17211h(i7);
        if (f13666c) {
            Log.v("LoaderManager", "initLoader in " + this + ": args=" + bundle);
        }
        if (m17211h == null) {
            return m17198e(i7, bundle, aVar, null);
        }
        if (f13666c) {
            Log.v("LoaderManager", "  Re-using existing loader " + m17211h);
        }
        return m17211h.m17204s(this.f13667a, aVar);
    }

    @Override // p208d0.AbstractC4099a
    /* renamed from: d */
    public void mo17194d() {
        this.f13668b.m17213j();
    }

    /* renamed from: e */
    public final AbstractC4150b m17198e(int i7, Bundle bundle, AbstractC4099a.a aVar, AbstractC4150b abstractC4150b) {
        try {
            this.f13668b.m17215l();
            AbstractC4150b mo17195a = aVar.mo17195a(i7, bundle);
            if (mo17195a == null) {
                throw new IllegalArgumentException("Object returned from onCreateLoader must not be null");
            }
            if (mo17195a.getClass().isMemberClass() && !Modifier.isStatic(mo17195a.getClass().getModifiers())) {
                throw new IllegalArgumentException("Object returned from onCreateLoader must not be a non-static inner member class: " + mo17195a);
            }
            a aVar2 = new a(i7, bundle, mo17195a, abstractC4150b);
            if (f13666c) {
                Log.v("LoaderManager", "  Created new loader " + aVar2);
            }
            this.f13668b.m17214k(i7, aVar2);
            this.f13668b.m17210f();
            return aVar2.m17204s(this.f13667a, aVar);
        } catch (Throwable th) {
            this.f13668b.m17210f();
            throw th;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("LoaderManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        Class<?> cls = this.f13667a.getClass();
        sb.append(cls.getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(cls)));
        sb.append("}}");
        return sb.toString();
    }
}
