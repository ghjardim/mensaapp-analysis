package p235g3;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.internal.AbstractC3802r;
import com.google.android.gms.internal.measurement.zzff;
import java.util.Map;
import java.util.concurrent.Executor;
import p039F3.C0333a;
import p039F3.InterfaceC0334b;
import p039F3.InterfaceC0336d;
import p101O2.C1295a;
import p219e3.C4172b;
import p219e3.C4176f;
import p243h3.AbstractC4486b;
import p256j$.util.concurrent.ConcurrentHashMap;

/* renamed from: g3.b */
/* loaded from: classes.dex */
public class C4395b implements InterfaceC4394a {

    /* renamed from: c */
    public static volatile InterfaceC4394a f15584c;

    /* renamed from: a */
    public final C1295a f15585a;

    /* renamed from: b */
    public final Map f15586b;

    public C4395b(C1295a c1295a) {
        AbstractC3802r.m15129k(c1295a);
        this.f15585a = c1295a;
        this.f15586b = new ConcurrentHashMap();
    }

    /* renamed from: c */
    public static InterfaceC4394a m18621c(C4176f c4176f, Context context, InterfaceC0336d interfaceC0336d) {
        AbstractC3802r.m15129k(c4176f);
        AbstractC3802r.m15129k(context);
        AbstractC3802r.m15129k(interfaceC0336d);
        AbstractC3802r.m15129k(context.getApplicationContext());
        if (f15584c == null) {
            synchronized (C4395b.class) {
                try {
                    if (f15584c == null) {
                        Bundle bundle = new Bundle(1);
                        if (c4176f.m17538y()) {
                            interfaceC0336d.mo1341d(C4172b.class, new Executor() { // from class: g3.c
                                @Override // java.util.concurrent.Executor
                                public final void execute(Runnable runnable) {
                                    runnable.run();
                                }
                            }, new InterfaceC0334b() { // from class: g3.d
                                @Override // p039F3.InterfaceC0334b
                                /* renamed from: a */
                                public final void mo1337a(C0333a c0333a) {
                                    C4395b.m18622d(c0333a);
                                }
                            });
                            bundle.putBoolean("dataCollectionDefaultEnabled", c4176f.m17537x());
                        }
                        f15584c = new C4395b(zzff.zzg(context, null, null, null, bundle).zzd());
                    }
                } finally {
                }
            }
        }
        return f15584c;
    }

    /* renamed from: d */
    public static /* synthetic */ void m18622d(C0333a c0333a) {
        boolean z6 = ((C4172b) c0333a.m1335a()).f13993a;
        synchronized (C4395b.class) {
            ((C4395b) AbstractC3802r.m15129k(f15584c)).f15585a.m4926c(z6);
        }
    }

    @Override // p235g3.InterfaceC4394a
    /* renamed from: a */
    public void mo18619a(String str, String str2, Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        if (AbstractC4486b.m19099c(str) && AbstractC4486b.m19098b(str2, bundle) && AbstractC4486b.m19097a(str, str2, bundle)) {
            if ("clx".equals(str) && "_ae".equals(str2)) {
                bundle.putLong("_r", 1L);
            }
            this.f15585a.m4924a(str, str2, bundle);
        }
    }

    @Override // p235g3.InterfaceC4394a
    /* renamed from: b */
    public void mo18620b(String str, String str2, Object obj) {
        if (AbstractC4486b.m19099c(str) && AbstractC4486b.m19100d(str, str2)) {
            this.f15585a.m4925b(str, str2, obj);
        }
    }
}
