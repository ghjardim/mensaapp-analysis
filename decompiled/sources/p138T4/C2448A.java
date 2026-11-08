package p138T4;

import android.app.Activity;
import java.util.ArrayList;
import p061I4.InterfaceC0663o;
import p365w.AbstractC6785a;

/* renamed from: T4.A */
/* loaded from: classes2.dex */
public class C2448A implements InterfaceC0663o {

    /* renamed from: d */
    public a f7240d;

    /* renamed from: c */
    public final int f7239c = 240;

    /* renamed from: e */
    public boolean f7241e = false;

    /* renamed from: T4.A$a */
    public interface a {
        /* renamed from: a */
        void mo8314a(int i7);
    }

    /* renamed from: a */
    public void m8313a(Activity activity, a aVar, InterfaceC2458b interfaceC2458b) {
        if (this.f7241e) {
            interfaceC2458b.mo8327a("A request for permissions is already running, please wait for it to finish before doing another request.");
            return;
        }
        if (activity == null) {
            interfaceC2458b.mo8327a("Unable to detect current Android Activity.");
            return;
        }
        this.f7240d = aVar;
        ArrayList arrayList = new ArrayList();
        arrayList.add("android.permission.POST_NOTIFICATIONS");
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        if (this.f7241e) {
            return;
        }
        AbstractC6785a.m27824a(activity, strArr, 240);
        this.f7241e = true;
    }

    @Override // p061I4.InterfaceC0663o
    /* renamed from: b */
    public boolean mo2657b(int i7, String[] strArr, int[] iArr) {
        a aVar;
        int i8 = 0;
        if (!this.f7241e || i7 != 240 || (aVar = this.f7240d) == null) {
            return false;
        }
        this.f7241e = false;
        if (iArr.length > 0 && iArr[0] == 0) {
            i8 = 1;
        }
        aVar.mo8314a(i8);
        return true;
    }
}
