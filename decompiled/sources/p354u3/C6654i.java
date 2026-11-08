package p354u3;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC3802r;
import com.google.android.gms.internal.p395firebaseauthapi.zzagw;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.apache.tika.utils.StringUtils;
import p219e3.C4176f;
import p346t3.AbstractC6458A;
import p346t3.AbstractC6472H;
import p346t3.C6462C;
import p346t3.C6543y0;
import p346t3.InterfaceC6460B;
import p346t3.InterfaceC6499c0;
import p382y2.AbstractC7067c;

/* renamed from: u3.i */
/* loaded from: classes.dex */
public class C6654i extends AbstractC6458A {
    public static final Parcelable.Creator<C6654i> CREATOR = new C6652h();

    /* renamed from: a */
    public zzagw f24031a;

    /* renamed from: b */
    public C6646e f24032b;

    /* renamed from: c */
    public String f24033c;

    /* renamed from: d */
    public String f24034d;

    /* renamed from: e */
    public List f24035e;

    /* renamed from: f */
    public List f24036f;

    /* renamed from: n */
    public String f24037n;

    /* renamed from: o */
    public Boolean f24038o;

    /* renamed from: p */
    public C6658k f24039p;

    /* renamed from: q */
    public boolean f24040q;

    /* renamed from: r */
    public C6543y0 f24041r;

    /* renamed from: s */
    public C6626N f24042s;

    /* renamed from: t */
    public List f24043t;

    public C6654i(C4176f c4176f, List list) {
        AbstractC3802r.m15129k(c4176f);
        this.f24033c = c4176f.m17533q();
        this.f24034d = "com.google.firebase.auth.internal.DefaultFirebaseUser";
        this.f24037n = "2";
        mo26972T0(list);
    }

    @Override // p346t3.AbstractC6458A
    /* renamed from: A0 */
    public /* synthetic */ AbstractC6472H mo26952A0() {
        return new C6662m(this);
    }

    @Override // p346t3.AbstractC6458A
    /* renamed from: B0 */
    public List mo26953B0() {
        return this.f24035e;
    }

    @Override // p346t3.AbstractC6458A
    /* renamed from: C0 */
    public String mo26954C0() {
        Map map;
        zzagw zzagwVar = this.f24031a;
        if (zzagwVar == null || zzagwVar.zzc() == null || (map = (Map) AbstractC6625M.m27502a(this.f24031a.zzc()).m26989b().get("firebase")) == null) {
            return null;
        }
        return (String) map.get("tenant");
    }

    @Override // p346t3.AbstractC6458A
    /* renamed from: D0 */
    public boolean mo26955D0() {
        C6462C m27502a;
        Boolean bool = this.f24038o;
        if (bool == null || bool.booleanValue()) {
            zzagw zzagwVar = this.f24031a;
            String str = StringUtils.EMPTY;
            if (zzagwVar != null && (m27502a = AbstractC6625M.m27502a(zzagwVar.zzc())) != null) {
                str = m27502a.m26992e();
            }
            boolean z6 = true;
            if (mo26953B0().size() > 1 || (str != null && str.equals("custom"))) {
                z6 = false;
            }
            this.f24038o = Boolean.valueOf(z6);
        }
        return this.f24038o.booleanValue();
    }

    @Override // p346t3.AbstractC6458A, p346t3.InterfaceC6499c0
    /* renamed from: M */
    public String mo26964M() {
        return this.f24032b.mo26964M();
    }

    @Override // p346t3.AbstractC6458A
    /* renamed from: S0 */
    public final C4176f mo26971S0() {
        return C4176f.m17518p(this.f24033c);
    }

    @Override // p346t3.AbstractC6458A
    /* renamed from: T0 */
    public final synchronized AbstractC6458A mo26972T0(List list) {
        try {
            AbstractC3802r.m15129k(list);
            this.f24035e = new ArrayList(list.size());
            this.f24036f = new ArrayList(list.size());
            for (int i7 = 0; i7 < list.size(); i7++) {
                InterfaceC6499c0 interfaceC6499c0 = (InterfaceC6499c0) list.get(i7);
                if (interfaceC6499c0.mo27065g().equals("firebase")) {
                    this.f24032b = (C6646e) interfaceC6499c0;
                } else {
                    this.f24036f.add(interfaceC6499c0.mo27065g());
                }
                this.f24035e.add((C6646e) interfaceC6499c0);
            }
            if (this.f24032b == null) {
                this.f24032b = (C6646e) this.f24035e.get(0);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this;
    }

    @Override // p346t3.AbstractC6458A
    /* renamed from: U0 */
    public final void mo26973U0(zzagw zzagwVar) {
        this.f24031a = (zzagw) AbstractC3802r.m15129k(zzagwVar);
    }

    @Override // p346t3.AbstractC6458A
    /* renamed from: V0 */
    public final /* synthetic */ AbstractC6458A mo26974V0() {
        this.f24038o = Boolean.FALSE;
        return this;
    }

    @Override // p346t3.AbstractC6458A
    /* renamed from: W0 */
    public final void mo26975W0(List list) {
        if (list == null) {
            list = new ArrayList();
        }
        this.f24043t = list;
    }

    @Override // p346t3.AbstractC6458A
    /* renamed from: X0 */
    public final zzagw mo26976X0() {
        return this.f24031a;
    }

    @Override // p346t3.AbstractC6458A
    /* renamed from: Y0 */
    public final void mo26977Y0(List list) {
        this.f24042s = C6626N.m27503x0(list);
    }

    @Override // p346t3.AbstractC6458A
    /* renamed from: Z0 */
    public final List mo26978Z0() {
        return this.f24043t;
    }

    @Override // p346t3.AbstractC6458A, p346t3.InterfaceC6499c0
    /* renamed from: a */
    public String mo26979a() {
        return this.f24032b.mo26979a();
    }

    /* renamed from: a1 */
    public final C6654i m27548a1(String str) {
        this.f24037n = str;
        return this;
    }

    /* renamed from: b1 */
    public final void m27549b1(C6543y0 c6543y0) {
        this.f24041r = c6543y0;
    }

    /* renamed from: c1 */
    public final void m27550c1(C6658k c6658k) {
        this.f24039p = c6658k;
    }

    /* renamed from: d1 */
    public final void m27551d1(boolean z6) {
        this.f24040q = z6;
    }

    /* renamed from: e1 */
    public final C6543y0 m27552e1() {
        return this.f24041r;
    }

    @Override // p346t3.AbstractC6458A, p346t3.InterfaceC6499c0
    /* renamed from: f0 */
    public String mo26980f0() {
        return this.f24032b.mo26980f0();
    }

    /* renamed from: f1 */
    public final List m27553f1() {
        C6626N c6626n = this.f24042s;
        return c6626n != null ? c6626n.zza() : new ArrayList();
    }

    @Override // p346t3.InterfaceC6499c0
    /* renamed from: g */
    public String mo27065g() {
        return this.f24032b.mo27065g();
    }

    /* renamed from: g1 */
    public final List m27554g1() {
        return this.f24035e;
    }

    /* renamed from: h1 */
    public final boolean m27555h1() {
        return this.f24040q;
    }

    @Override // p346t3.AbstractC6458A, p346t3.InterfaceC6499c0
    /* renamed from: m */
    public Uri mo26981m() {
        return this.f24032b.mo26981m();
    }

    @Override // p346t3.InterfaceC6499c0
    /* renamed from: r */
    public boolean mo27066r() {
        return this.f24032b.mo27066r();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        int m29117a = AbstractC7067c.m29117a(parcel);
        AbstractC7067c.m29106C(parcel, 1, mo26976X0(), i7, false);
        AbstractC7067c.m29106C(parcel, 2, this.f24032b, i7, false);
        AbstractC7067c.m29108E(parcel, 3, this.f24033c, false);
        AbstractC7067c.m29108E(parcel, 4, this.f24034d, false);
        AbstractC7067c.m29112I(parcel, 5, this.f24035e, false);
        AbstractC7067c.m29110G(parcel, 6, zzg(), false);
        AbstractC7067c.m29108E(parcel, 7, this.f24037n, false);
        AbstractC7067c.m29125i(parcel, 8, Boolean.valueOf(mo26955D0()), false);
        AbstractC7067c.m29106C(parcel, 9, mo26985z0(), i7, false);
        AbstractC7067c.m29123g(parcel, 10, this.f24040q);
        AbstractC7067c.m29106C(parcel, 11, this.f24041r, i7, false);
        AbstractC7067c.m29106C(parcel, 12, this.f24042s, i7, false);
        AbstractC7067c.m29112I(parcel, 13, mo26978Z0(), false);
        AbstractC7067c.m29118b(parcel, m29117a);
    }

    @Override // p346t3.AbstractC6458A, p346t3.InterfaceC6499c0
    /* renamed from: y */
    public String mo26983y() {
        return this.f24032b.mo26983y();
    }

    @Override // p346t3.AbstractC6458A
    /* renamed from: z0 */
    public InterfaceC6460B mo26985z0() {
        return this.f24039p;
    }

    @Override // p346t3.AbstractC6458A
    public final String zzd() {
        return mo26976X0().zzc();
    }

    @Override // p346t3.AbstractC6458A
    public final String zze() {
        return this.f24031a.zzf();
    }

    @Override // p346t3.AbstractC6458A
    public final List zzg() {
        return this.f24036f;
    }

    public C6654i(zzagw zzagwVar, C6646e c6646e, String str, String str2, List list, List list2, String str3, Boolean bool, C6658k c6658k, boolean z6, C6543y0 c6543y0, C6626N c6626n, List list3) {
        this.f24031a = zzagwVar;
        this.f24032b = c6646e;
        this.f24033c = str;
        this.f24034d = str2;
        this.f24035e = list;
        this.f24036f = list2;
        this.f24037n = str3;
        this.f24038o = bool;
        this.f24039p = c6658k;
        this.f24040q = z6;
        this.f24041r = c6543y0;
        this.f24042s = c6626n;
        this.f24043t = list3;
    }
}
