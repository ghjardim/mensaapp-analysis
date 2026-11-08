package p354u3;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC3802r;
import com.google.android.gms.internal.p395firebaseauthapi.zzzs;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p219e3.C4176f;
import p346t3.AbstractC6458A;
import p346t3.AbstractC6474I;
import p346t3.AbstractC6476J;
import p346t3.AbstractC6478K;
import p346t3.AbstractC6480L;
import p346t3.C6486S;
import p346t3.C6492Y;
import p346t3.C6543y0;
import p382y2.AbstractC7067c;

/* renamed from: u3.o */
/* loaded from: classes.dex */
public final class C6666o extends AbstractC6478K {
    public static final Parcelable.Creator<C6666o> CREATOR = new C6670q();

    /* renamed from: a */
    public final List f24068a;

    /* renamed from: b */
    public final C6668p f24069b;

    /* renamed from: c */
    public final String f24070c;

    /* renamed from: d */
    public final C6543y0 f24071d;

    /* renamed from: e */
    public final C6654i f24072e;

    /* renamed from: f */
    public final List f24073f;

    public C6666o(List list, C6668p c6668p, String str, C6543y0 c6543y0, C6654i c6654i, List list2) {
        this.f24068a = (List) AbstractC3802r.m15129k(list);
        this.f24069b = (C6668p) AbstractC3802r.m15129k(c6668p);
        this.f24070c = AbstractC3802r.m15123e(str);
        this.f24071d = c6543y0;
        this.f24072e = c6654i;
        this.f24073f = (List) AbstractC3802r.m15129k(list2);
    }

    /* renamed from: C0 */
    public static C6666o m27571C0(zzzs zzzsVar, FirebaseAuth firebaseAuth, AbstractC6458A abstractC6458A) {
        List<AbstractC6476J> zzc = zzzsVar.zzc();
        ArrayList arrayList = new ArrayList();
        for (AbstractC6476J abstractC6476J : zzc) {
            if (abstractC6476J instanceof C6486S) {
                arrayList.add((C6486S) abstractC6476J);
            }
        }
        List<AbstractC6476J> zzc2 = zzzsVar.zzc();
        ArrayList arrayList2 = new ArrayList();
        for (AbstractC6476J abstractC6476J2 : zzc2) {
            if (abstractC6476J2 instanceof C6492Y) {
                arrayList2.add((C6492Y) abstractC6476J2);
            }
        }
        return new C6666o(arrayList, C6668p.m27573z0(zzzsVar.zzc(), zzzsVar.zzb()), firebaseAuth.m15359l().m17533q(), zzzsVar.zza(), (C6654i) abstractC6458A, arrayList2);
    }

    @Override // p346t3.AbstractC6478K
    /* renamed from: A0 */
    public final Task mo27012A0(AbstractC6474I abstractC6474I) {
        return mo27013x0().m15342Z(abstractC6474I, this.f24069b, this.f24072e).continueWithTask(new C6664n(this));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int m29117a = AbstractC7067c.m29117a(parcel);
        AbstractC7067c.m29112I(parcel, 1, this.f24068a, false);
        AbstractC7067c.m29106C(parcel, 2, mo27015z0(), i7, false);
        AbstractC7067c.m29108E(parcel, 3, this.f24070c, false);
        AbstractC7067c.m29106C(parcel, 4, this.f24071d, i7, false);
        AbstractC7067c.m29106C(parcel, 5, this.f24072e, i7, false);
        AbstractC7067c.m29112I(parcel, 6, this.f24073f, false);
        AbstractC7067c.m29118b(parcel, m29117a);
    }

    @Override // p346t3.AbstractC6478K
    /* renamed from: x0 */
    public final FirebaseAuth mo27013x0() {
        return FirebaseAuth.getInstance(C4176f.m17518p(this.f24070c));
    }

    @Override // p346t3.AbstractC6478K
    /* renamed from: y0 */
    public final List mo27014y0() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f24068a.iterator();
        while (it.hasNext()) {
            arrayList.add((C6486S) it.next());
        }
        Iterator it2 = this.f24073f.iterator();
        while (it2.hasNext()) {
            arrayList.add((C6492Y) it2.next());
        }
        return arrayList;
    }

    @Override // p346t3.AbstractC6478K
    /* renamed from: z0 */
    public final AbstractC6480L mo27015z0() {
        return this.f24069b;
    }
}
