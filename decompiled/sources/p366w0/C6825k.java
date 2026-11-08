package p366w0;

import android.content.Context;
import p232g0.AbstractC4336z;
import p259j0.AbstractC5330M;
import p259j0.AbstractC5346o;
import p366w0.C6813K;
import p366w0.C6816b;
import p366w0.InterfaceC6827m;

/* renamed from: w0.k */
/* loaded from: classes.dex */
public final class C6825k implements InterfaceC6827m.b {

    /* renamed from: a */
    public final Context f24532a;

    /* renamed from: b */
    public int f24533b = 0;

    /* renamed from: c */
    public boolean f24534c = true;

    public C6825k(Context context) {
        this.f24532a = context;
    }

    @Override // p366w0.InterfaceC6827m.b
    /* renamed from: a */
    public InterfaceC6827m mo28031a(InterfaceC6827m.a aVar) {
        int i7;
        if (AbstractC5330M.f18800a < 23 || !((i7 = this.f24533b) == 1 || (i7 == 0 && m28092b()))) {
            return new C6813K.b().mo28031a(aVar);
        }
        int m18418k = AbstractC4336z.m18418k(aVar.f24537c.f15138n);
        AbstractC5346o.m21865f("DMCodecAdapterFactory", "Creating an asynchronous MediaCodec adapter for track type " + AbstractC5330M.m21771r0(m18418k));
        C6816b.b bVar = new C6816b.b(m18418k);
        bVar.m28052e(this.f24534c);
        return bVar.mo28031a(aVar);
    }

    /* renamed from: b */
    public final boolean m28092b() {
        int i7 = AbstractC5330M.f18800a;
        if (i7 >= 31) {
            return true;
        }
        Context context = this.f24532a;
        return context != null && i7 >= 28 && context.getPackageManager().hasSystemFeature("com.amazon.hardware.tv_screen");
    }
}
