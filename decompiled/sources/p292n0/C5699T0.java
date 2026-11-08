package p292n0;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import p022D0.AbstractC0177w;
import p022D0.InterfaceC0149e0;
import p232g0.AbstractC4303I;
import p232g0.C4311a;
import p259j0.AbstractC5330M;

/* renamed from: n0.T0 */
/* loaded from: classes.dex */
public final class C5699T0 extends AbstractC5712a {

    /* renamed from: h */
    public final int f20624h;

    /* renamed from: i */
    public final int f20625i;

    /* renamed from: j */
    public final int[] f20626j;

    /* renamed from: k */
    public final int[] f20627k;

    /* renamed from: l */
    public final AbstractC4303I[] f20628l;

    /* renamed from: m */
    public final Object[] f20629m;

    /* renamed from: n */
    public final HashMap f20630n;

    /* renamed from: n0.T0$a */
    public class a extends AbstractC0177w {

        /* renamed from: f */
        public final AbstractC4303I.c f20631f;

        public a(AbstractC4303I abstractC4303I) {
            super(abstractC4303I);
            this.f20631f = new AbstractC4303I.c();
        }

        @Override // p022D0.AbstractC0177w, p232g0.AbstractC4303I
        /* renamed from: g */
        public AbstractC4303I.b mo303g(int i7, AbstractC4303I.b bVar, boolean z6) {
            AbstractC4303I.b mo303g = super.mo303g(i7, bVar, z6);
            if (super.m18031n(mo303g.f14811c, this.f20631f).m18059f()) {
                mo303g.m18053t(bVar.f14809a, bVar.f14810b, bVar.f14811c, bVar.f14812d, bVar.f14813e, C4311a.f14976g, true);
            } else {
                mo303g.f14814f = true;
            }
            return mo303g;
        }
    }

    public C5699T0(Collection collection, InterfaceC0149e0 interfaceC0149e0) {
        this(m23885G(collection), m23886H(collection), interfaceC0149e0);
    }

    /* renamed from: G */
    public static AbstractC4303I[] m23885G(Collection collection) {
        AbstractC4303I[] abstractC4303IArr = new AbstractC4303I[collection.size()];
        Iterator it = collection.iterator();
        int i7 = 0;
        while (it.hasNext()) {
            abstractC4303IArr[i7] = ((InterfaceC5666C0) it.next()).mo23795b();
            i7++;
        }
        return abstractC4303IArr;
    }

    /* renamed from: H */
    public static Object[] m23886H(Collection collection) {
        Object[] objArr = new Object[collection.size()];
        Iterator it = collection.iterator();
        int i7 = 0;
        while (it.hasNext()) {
            objArr[i7] = ((InterfaceC5666C0) it.next()).mo23794a();
            i7++;
        }
        return objArr;
    }

    @Override // p292n0.AbstractC5712a
    /* renamed from: A */
    public int mo23887A(int i7) {
        return this.f20627k[i7];
    }

    @Override // p292n0.AbstractC5712a
    /* renamed from: D */
    public AbstractC4303I mo23888D(int i7) {
        return this.f20628l[i7];
    }

    /* renamed from: E */
    public C5699T0 m23889E(InterfaceC0149e0 interfaceC0149e0) {
        AbstractC4303I[] abstractC4303IArr = new AbstractC4303I[this.f20628l.length];
        int i7 = 0;
        while (true) {
            AbstractC4303I[] abstractC4303IArr2 = this.f20628l;
            if (i7 >= abstractC4303IArr2.length) {
                return new C5699T0(abstractC4303IArr, this.f20629m, interfaceC0149e0);
            }
            abstractC4303IArr[i7] = new a(abstractC4303IArr2[i7]);
            i7++;
        }
    }

    /* renamed from: F */
    public List m23890F() {
        return Arrays.asList(this.f20628l);
    }

    @Override // p232g0.AbstractC4303I
    /* renamed from: i */
    public int mo307i() {
        return this.f20625i;
    }

    @Override // p232g0.AbstractC4303I
    /* renamed from: p */
    public int mo308p() {
        return this.f20624h;
    }

    @Override // p292n0.AbstractC5712a
    /* renamed from: s */
    public int mo23891s(Object obj) {
        Integer num = (Integer) this.f20630n.get(obj);
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    @Override // p292n0.AbstractC5712a
    /* renamed from: t */
    public int mo23892t(int i7) {
        return AbstractC5330M.m21741g(this.f20626j, i7 + 1, false, false);
    }

    @Override // p292n0.AbstractC5712a
    /* renamed from: u */
    public int mo23893u(int i7) {
        return AbstractC5330M.m21741g(this.f20627k, i7 + 1, false, false);
    }

    @Override // p292n0.AbstractC5712a
    /* renamed from: x */
    public Object mo23894x(int i7) {
        return this.f20629m[i7];
    }

    @Override // p292n0.AbstractC5712a
    /* renamed from: z */
    public int mo23895z(int i7) {
        return this.f20626j[i7];
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5699T0(AbstractC4303I[] abstractC4303IArr, Object[] objArr, InterfaceC0149e0 interfaceC0149e0) {
        super(false, interfaceC0149e0);
        int i7 = 0;
        int length = abstractC4303IArr.length;
        this.f20628l = abstractC4303IArr;
        this.f20626j = new int[length];
        this.f20627k = new int[length];
        this.f20629m = objArr;
        this.f20630n = new HashMap();
        int length2 = abstractC4303IArr.length;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        while (i7 < length2) {
            AbstractC4303I abstractC4303I = abstractC4303IArr[i7];
            this.f20628l[i10] = abstractC4303I;
            this.f20627k[i10] = i8;
            this.f20626j[i10] = i9;
            i8 += abstractC4303I.mo308p();
            i9 += this.f20628l[i10].mo307i();
            this.f20630n.put(objArr[i10], Integer.valueOf(i10));
            i7++;
            i10++;
        }
        this.f20624h = i8;
        this.f20625i = i9;
    }
}
