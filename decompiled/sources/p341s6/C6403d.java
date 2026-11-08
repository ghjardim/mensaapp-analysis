package p341s6;

import java.util.ArrayList;
import java.util.List;
import p333r6.InterfaceC6307g;
import p349t6.C6575m;

/* renamed from: s6.d */
/* loaded from: classes2.dex */
public class C6403d implements InterfaceC6402c {

    /* renamed from: a */
    public EnumC6401b f23117a;

    /* renamed from: b */
    public List f23118b;

    /* renamed from: c */
    public String f23119c;

    /* renamed from: d */
    public C6575m f23120d;

    /* renamed from: e */
    public String f23121e;

    /* renamed from: f */
    public String f23122f;

    /* renamed from: g */
    public Object[] f23123g;

    /* renamed from: h */
    public long f23124h;

    /* renamed from: i */
    public Throwable f23125i;

    /* renamed from: a */
    public void m26735a(InterfaceC6307g interfaceC6307g) {
        if (interfaceC6307g == null) {
            return;
        }
        if (this.f23118b == null) {
            this.f23118b = new ArrayList(2);
        }
        this.f23118b.add(interfaceC6307g);
    }

    /* renamed from: b */
    public EnumC6401b m26736b() {
        return this.f23117a;
    }

    /* renamed from: c */
    public C6575m m26737c() {
        return this.f23120d;
    }

    /* renamed from: d */
    public void m26738d(Object[] objArr) {
        this.f23123g = objArr;
    }

    /* renamed from: e */
    public void m26739e(EnumC6401b enumC6401b) {
        this.f23117a = enumC6401b;
    }

    /* renamed from: f */
    public void m26740f(C6575m c6575m) {
        this.f23120d = c6575m;
    }

    /* renamed from: g */
    public void m26741g(String str) {
        this.f23119c = str;
    }

    /* renamed from: h */
    public void m26742h(String str) {
        this.f23122f = str;
    }

    /* renamed from: i */
    public void m26743i(String str) {
        this.f23121e = str;
    }

    /* renamed from: j */
    public void m26744j(Throwable th) {
        this.f23125i = th;
    }

    /* renamed from: k */
    public void m26745k(long j7) {
        this.f23124h = j7;
    }
}
