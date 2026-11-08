package p216e0;

import android.content.Context;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* renamed from: e0.b */
/* loaded from: classes.dex */
public abstract class AbstractC4150b {

    /* renamed from: a */
    public int f13895a;

    /* renamed from: b */
    public a f13896b;

    /* renamed from: c */
    public Context f13897c;

    /* renamed from: d */
    public boolean f13898d = false;

    /* renamed from: e */
    public boolean f13899e = false;

    /* renamed from: f */
    public boolean f13900f = true;

    /* renamed from: g */
    public boolean f13901g = false;

    /* renamed from: h */
    public boolean f13902h = false;

    /* renamed from: e0.b$a */
    public interface a {
        /* renamed from: a */
        void mo17199a(AbstractC4150b abstractC4150b, Object obj);
    }

    public AbstractC4150b(Context context) {
        this.f13897c = context.getApplicationContext();
    }

    /* renamed from: a */
    public void m17428a() {
        this.f13899e = true;
        m17437k();
    }

    /* renamed from: b */
    public boolean m17429b() {
        return mo17420l();
    }

    /* renamed from: c */
    public void m17430c() {
        this.f13902h = false;
    }

    /* renamed from: d */
    public String m17431d(Object obj) {
        StringBuilder sb = new StringBuilder(64);
        if (obj == null) {
            sb.append("null");
        } else {
            Class<?> cls = obj.getClass();
            sb.append(cls.getSimpleName());
            sb.append("{");
            sb.append(Integer.toHexString(System.identityHashCode(cls)));
            sb.append("}");
        }
        return sb.toString();
    }

    /* renamed from: f */
    public void m17433f(Object obj) {
        a aVar = this.f13896b;
        if (aVar != null) {
            aVar.mo17199a(this, obj);
        }
    }

    /* renamed from: g */
    public void mo17419g(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mId=");
        printWriter.print(this.f13895a);
        printWriter.print(" mListener=");
        printWriter.println(this.f13896b);
        if (this.f13898d || this.f13901g || this.f13902h) {
            printWriter.print(str);
            printWriter.print("mStarted=");
            printWriter.print(this.f13898d);
            printWriter.print(" mContentChanged=");
            printWriter.print(this.f13901g);
            printWriter.print(" mProcessingChange=");
            printWriter.println(this.f13902h);
        }
        if (this.f13899e || this.f13900f) {
            printWriter.print(str);
            printWriter.print("mAbandoned=");
            printWriter.print(this.f13899e);
            printWriter.print(" mReset=");
            printWriter.println(this.f13900f);
        }
    }

    /* renamed from: h */
    public void m17434h() {
        mo17421n();
    }

    /* renamed from: i */
    public boolean m17435i() {
        return this.f13899e;
    }

    /* renamed from: j */
    public boolean m17436j() {
        return this.f13898d;
    }

    /* renamed from: l */
    public abstract boolean mo17420l();

    /* renamed from: m */
    public void m17438m() {
        if (this.f13898d) {
            m17434h();
        } else {
            this.f13901g = true;
        }
    }

    /* renamed from: p */
    public abstract void mo17440p();

    /* renamed from: r */
    public void m17442r(int i7, a aVar) {
        if (this.f13896b != null) {
            throw new IllegalStateException("There is already a listener registered");
        }
        this.f13896b = aVar;
        this.f13895a = i7;
    }

    /* renamed from: s */
    public void m17443s() {
        m17439o();
        this.f13900f = true;
        this.f13898d = false;
        this.f13899e = false;
        this.f13901g = false;
        this.f13902h = false;
    }

    /* renamed from: t */
    public void m17444t() {
        if (this.f13902h) {
            m17438m();
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(64);
        Class<?> cls = getClass();
        sb.append(cls.getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(cls)));
        sb.append(" id=");
        sb.append(this.f13895a);
        sb.append("}");
        return sb.toString();
    }

    /* renamed from: u */
    public final void m17445u() {
        this.f13898d = true;
        this.f13900f = false;
        this.f13899e = false;
        mo17440p();
    }

    /* renamed from: v */
    public void m17446v() {
        this.f13898d = false;
        m17441q();
    }

    /* renamed from: w */
    public void m17447w(a aVar) {
        a aVar2 = this.f13896b;
        if (aVar2 == null) {
            throw new IllegalStateException("No listener register");
        }
        if (aVar2 != aVar) {
            throw new IllegalArgumentException("Attempting to unregister the wrong listener");
        }
        this.f13896b = null;
    }

    /* renamed from: e */
    public void m17432e() {
    }

    /* renamed from: k */
    public void m17437k() {
    }

    /* renamed from: n */
    public void mo17421n() {
    }

    /* renamed from: o */
    public void m17439o() {
    }

    /* renamed from: q */
    public void m17441q() {
    }
}
