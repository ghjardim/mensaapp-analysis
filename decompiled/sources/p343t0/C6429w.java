package p343t0;

import android.text.TextUtils;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p078L0.AbstractC0882q;
import p078L0.C0854L;
import p078L0.InterfaceC0855M;
import p078L0.InterfaceC0861T;
import p078L0.InterfaceC0883r;
import p078L0.InterfaceC0884s;
import p078L0.InterfaceC0885t;
import p232g0.C4295A;
import p232g0.C4327q;
import p249i1.C4531v;
import p249i1.InterfaceC4529t;
import p259j0.AbstractC5332a;
import p259j0.C5322E;
import p259j0.C5357z;
import p320q1.AbstractC6179h;

/* renamed from: t0.w */
/* loaded from: classes.dex */
public final class C6429w implements InterfaceC0883r {

    /* renamed from: i */
    public static final Pattern f23321i = Pattern.compile("LOCAL:([^,]+)");

    /* renamed from: j */
    public static final Pattern f23322j = Pattern.compile("MPEGTS:(-?\\d+)");

    /* renamed from: a */
    public final String f23323a;

    /* renamed from: b */
    public final C5322E f23324b;

    /* renamed from: d */
    public final InterfaceC4529t.a f23326d;

    /* renamed from: e */
    public final boolean f23327e;

    /* renamed from: f */
    public InterfaceC0885t f23328f;

    /* renamed from: h */
    public int f23330h;

    /* renamed from: c */
    public final C5357z f23325c = new C5357z();

    /* renamed from: g */
    public byte[] f23329g = new byte[1024];

    public C6429w(String str, C5322E c5322e, InterfaceC4529t.a aVar, boolean z6) {
        this.f23323a = str;
        this.f23324b = c5322e;
        this.f23326d = aVar;
        this.f23327e = z6;
    }

    @Override // p078L0.InterfaceC0883r
    /* renamed from: a */
    public void mo695a(long j7, long j8) {
        throw new IllegalStateException();
    }

    @Override // p078L0.InterfaceC0883r
    /* renamed from: b */
    public void mo696b(InterfaceC0885t interfaceC0885t) {
        this.f23328f = this.f23327e ? new C4531v(interfaceC0885t, this.f23326d) : interfaceC0885t;
        interfaceC0885t.mo466j(new InterfaceC0855M.b(-9223372036854775807L));
    }

    /* renamed from: c */
    public final InterfaceC0861T m26912c(long j7) {
        InterfaceC0861T mo455b = this.f23328f.mo455b(0, 3);
        mo455b.mo566e(new C4327q.b().m18264o0("text/vtt").m18254e0(this.f23323a).m18268s0(j7).m18234K());
        this.f23328f.mo472q();
        return mo455b;
    }

    @Override // p078L0.InterfaceC0883r
    /* renamed from: d */
    public /* synthetic */ InterfaceC0883r mo697d() {
        return AbstractC0882q.m3688b(this);
    }

    /* renamed from: e */
    public final void m26913e() {
        C5357z c5357z = new C5357z(this.f23329g);
        AbstractC6179h.m25836e(c5357z);
        long j7 = 0;
        long j8 = 0;
        for (String m21959r = c5357z.m21959r(); !TextUtils.isEmpty(m21959r); m21959r = c5357z.m21959r()) {
            if (m21959r.startsWith("X-TIMESTAMP-MAP")) {
                Matcher matcher = f23321i.matcher(m21959r);
                if (!matcher.find()) {
                    throw C4295A.m17943a("X-TIMESTAMP-MAP doesn't contain local timestamp: " + m21959r, null);
                }
                Matcher matcher2 = f23322j.matcher(m21959r);
                if (!matcher2.find()) {
                    throw C4295A.m17943a("X-TIMESTAMP-MAP doesn't contain media timestamp: " + m21959r, null);
                }
                j8 = AbstractC6179h.m25835d((String) AbstractC5332a.m21800e(matcher.group(1)));
                j7 = C5322E.m21647h(Long.parseLong((String) AbstractC5332a.m21800e(matcher2.group(1))));
            }
        }
        Matcher m25832a = AbstractC6179h.m25832a(c5357z);
        if (m25832a == null) {
            m26912c(0L);
            return;
        }
        long m25835d = AbstractC6179h.m25835d((String) AbstractC5332a.m21800e(m25832a.group(1)));
        long m21651b = this.f23324b.m21651b(C5322E.m21649l((j7 + m25835d) - j8));
        InterfaceC0861T m26912c = m26912c(m21651b - m25835d);
        this.f23325c.m21937R(this.f23329g, this.f23330h);
        m26912c.mo564d(this.f23325c, this.f23330h);
        m26912c.mo562c(m21651b, 1, this.f23330h, 0, null);
    }

    @Override // p078L0.InterfaceC0883r
    /* renamed from: g */
    public /* synthetic */ List mo698g() {
        return AbstractC0882q.m3687a(this);
    }

    @Override // p078L0.InterfaceC0883r
    /* renamed from: h */
    public int mo699h(InterfaceC0884s interfaceC0884s, C0854L c0854l) {
        AbstractC5332a.m21800e(this.f23328f);
        int mo3511a = (int) interfaceC0884s.mo3511a();
        int i7 = this.f23330h;
        byte[] bArr = this.f23329g;
        if (i7 == bArr.length) {
            this.f23329g = Arrays.copyOf(bArr, ((mo3511a != -1 ? mo3511a : bArr.length) * 3) / 2);
        }
        byte[] bArr2 = this.f23329g;
        int i8 = this.f23330h;
        int read = interfaceC0884s.read(bArr2, i8, bArr2.length - i8);
        if (read != -1) {
            int i9 = this.f23330h + read;
            this.f23330h = i9;
            if (mo3511a == -1 || i9 != mo3511a) {
                return 0;
            }
        }
        m26913e();
        return -1;
    }

    @Override // p078L0.InterfaceC0883r
    /* renamed from: i */
    public boolean mo700i(InterfaceC0884s interfaceC0884s) {
        interfaceC0884s.mo3513h(this.f23329g, 0, 6, false);
        this.f23325c.m21937R(this.f23329g, 6);
        if (AbstractC6179h.m25833b(this.f23325c)) {
            return true;
        }
        interfaceC0884s.mo3513h(this.f23329g, 6, 3, false);
        this.f23325c.m21937R(this.f23329g, 9);
        return AbstractC6179h.m25833b(this.f23325c);
    }

    @Override // p078L0.InterfaceC0883r
    public void release() {
    }
}
