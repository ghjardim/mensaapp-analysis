package p120R0;

import java.util.Collections;
import p078L0.AbstractC0866a;
import p078L0.InterfaceC0861T;
import p120R0.AbstractC2225e;
import p232g0.C4327q;
import p259j0.C5357z;

/* renamed from: R0.a */
/* loaded from: classes.dex */
public final class C2221a extends AbstractC2225e {

    /* renamed from: e */
    public static final int[] f6795e = {5512, 11025, 22050, 44100};

    /* renamed from: b */
    public boolean f6796b;

    /* renamed from: c */
    public boolean f6797c;

    /* renamed from: d */
    public int f6798d;

    public C2221a(InterfaceC0861T interfaceC0861T) {
        super(interfaceC0861T);
    }

    @Override // p120R0.AbstractC2225e
    /* renamed from: b */
    public boolean mo7624b(C5357z c5357z) {
        if (this.f6796b) {
            c5357z.m21940U(1);
        } else {
            int m21926G = c5357z.m21926G();
            int i7 = (m21926G >> 4) & 15;
            this.f6798d = i7;
            if (i7 == 2) {
                this.f6819a.mo566e(new C4327q.b().m18264o0("audio/mpeg").m18237N(1).m18265p0(f6795e[(m21926G >> 2) & 3]).m18234K());
                this.f6797c = true;
            } else if (i7 == 7 || i7 == 8) {
                this.f6819a.mo566e(new C4327q.b().m18264o0(i7 == 7 ? "audio/g711-alaw" : "audio/g711-mlaw").m18237N(1).m18265p0(8000).m18234K());
                this.f6797c = true;
            } else if (i7 != 10) {
                throw new AbstractC2225e.a("Audio format not supported: " + this.f6798d);
            }
            this.f6796b = true;
        }
        return true;
    }

    @Override // p120R0.AbstractC2225e
    /* renamed from: c */
    public boolean mo7625c(C5357z c5357z, long j7) {
        if (this.f6798d == 2) {
            int m21942a = c5357z.m21942a();
            this.f6819a.mo564d(c5357z, m21942a);
            this.f6819a.mo562c(j7, 1, m21942a, 0, null);
            return true;
        }
        int m21926G = c5357z.m21926G();
        if (m21926G != 0 || this.f6797c) {
            if (this.f6798d == 10 && m21926G != 1) {
                return false;
            }
            int m21942a2 = c5357z.m21942a();
            this.f6819a.mo564d(c5357z, m21942a2);
            this.f6819a.mo562c(j7, 1, m21942a2, 0, null);
            return true;
        }
        int m21942a3 = c5357z.m21942a();
        byte[] bArr = new byte[m21942a3];
        c5357z.m21953l(bArr, 0, m21942a3);
        AbstractC0866a.b m3587f = AbstractC0866a.m3587f(bArr);
        this.f6819a.mo566e(new C4327q.b().m18264o0("audio/mp4a-latm").m18238O(m3587f.f2988c).m18237N(m3587f.f2987b).m18265p0(m3587f.f2986a).m18251b0(Collections.singletonList(bArr)).m18234K());
        this.f6797c = true;
        return false;
    }
}
