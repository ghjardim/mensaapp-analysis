package p161X;

import android.util.Log;
import java.io.PrintWriter;
import java.util.ArrayList;
import org.apache.tika.utils.StringUtils;
import p161X.AbstractC2752I;
import p161X.AbstractC2760Q;

/* renamed from: X.a */
/* loaded from: classes.dex */
public final class C2769a extends AbstractC2760Q implements AbstractC2752I.l {

    /* renamed from: t */
    public final AbstractC2752I f8310t;

    /* renamed from: u */
    public boolean f8311u;

    /* renamed from: v */
    public int f8312v;

    /* renamed from: w */
    public boolean f8313w;

    public C2769a(AbstractC2752I abstractC2752I) {
        super(abstractC2752I.m9506t0(), abstractC2752I.m9512v0() != null ? abstractC2752I.m9512v0().m9376t().getClassLoader() : null);
        this.f8312v = -1;
        this.f8313w = false;
        this.f8310t = abstractC2752I;
    }

    @Override // p161X.AbstractC2752I.l
    /* renamed from: a */
    public boolean mo9539a(ArrayList arrayList, ArrayList arrayList2) {
        if (AbstractC2752I.m9397I0(2)) {
            Log.v("FragmentManager", "Run: " + this);
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (!this.f8220i) {
            return true;
        }
        this.f8310t.m9472h(this);
        return true;
    }

    @Override // p161X.AbstractC2760Q
    /* renamed from: f */
    public int mo9615f() {
        return m9714o(false);
    }

    @Override // p161X.AbstractC2760Q
    /* renamed from: g */
    public int mo9616g() {
        return m9714o(true);
    }

    @Override // p161X.AbstractC2760Q
    /* renamed from: h */
    public void mo9617h() {
        m9619j();
        this.f8310t.m9461b0(this, false);
    }

    @Override // p161X.AbstractC2760Q
    /* renamed from: i */
    public void mo9618i() {
        m9619j();
        this.f8310t.m9461b0(this, true);
    }

    @Override // p161X.AbstractC2760Q
    /* renamed from: k */
    public void mo9620k(int i7, AbstractComponentCallbacksC2786p abstractComponentCallbacksC2786p, String str, int i8) {
        super.mo9620k(i7, abstractComponentCallbacksC2786p, str, i8);
        abstractComponentCallbacksC2786p.f8420B = this.f8310t;
    }

    @Override // p161X.AbstractC2760Q
    /* renamed from: l */
    public AbstractC2760Q mo9621l(AbstractComponentCallbacksC2786p abstractComponentCallbacksC2786p) {
        AbstractC2752I abstractC2752I = abstractComponentCallbacksC2786p.f8420B;
        if (abstractC2752I == null || abstractC2752I == this.f8310t) {
            return super.mo9621l(abstractComponentCallbacksC2786p);
        }
        throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + abstractComponentCallbacksC2786p.toString() + " is already attached to a FragmentManager.");
    }

    /* renamed from: n */
    public void m9713n(int i7) {
        if (this.f8220i) {
            if (AbstractC2752I.m9397I0(2)) {
                Log.v("FragmentManager", "Bump nesting in " + this + " by " + i7);
            }
            int size = this.f8214c.size();
            for (int i8 = 0; i8 < size; i8++) {
                AbstractC2760Q.a aVar = (AbstractC2760Q.a) this.f8214c.get(i8);
                AbstractComponentCallbacksC2786p abstractComponentCallbacksC2786p = aVar.f8232b;
                if (abstractComponentCallbacksC2786p != null) {
                    abstractComponentCallbacksC2786p.f8419A += i7;
                    if (AbstractC2752I.m9397I0(2)) {
                        Log.v("FragmentManager", "Bump nesting of " + aVar.f8232b + " to " + aVar.f8232b.f8419A);
                    }
                }
            }
        }
    }

    /* renamed from: o */
    public int m9714o(boolean z6) {
        if (this.f8311u) {
            throw new IllegalStateException("commit already called");
        }
        if (AbstractC2752I.m9397I0(2)) {
            Log.v("FragmentManager", "Commit: " + this);
            PrintWriter printWriter = new PrintWriter(new C2765W("FragmentManager"));
            m9715p("  ", printWriter);
            printWriter.close();
        }
        this.f8311u = true;
        if (this.f8220i) {
            this.f8312v = this.f8310t.m9481k();
        } else {
            this.f8312v = -1;
        }
        this.f8310t.m9455Y(this, z6);
        return this.f8312v;
    }

    /* renamed from: p */
    public void m9715p(String str, PrintWriter printWriter) {
        m9716q(str, printWriter, true);
    }

    /* renamed from: q */
    public void m9716q(String str, PrintWriter printWriter, boolean z6) {
        String str2;
        if (z6) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.f8222k);
            printWriter.print(" mIndex=");
            printWriter.print(this.f8312v);
            printWriter.print(" mCommitted=");
            printWriter.println(this.f8311u);
            if (this.f8219h != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f8219h));
            }
            if (this.f8215d != 0 || this.f8216e != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f8215d));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f8216e));
            }
            if (this.f8217f != 0 || this.f8218g != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f8217f));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.f8218g));
            }
            if (this.f8223l != 0 || this.f8224m != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.f8223l));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.f8224m);
            }
            if (this.f8225n != 0 || this.f8226o != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.f8225n));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.f8226o);
            }
        }
        if (this.f8214c.isEmpty()) {
            return;
        }
        printWriter.print(str);
        printWriter.println("Operations:");
        int size = this.f8214c.size();
        for (int i7 = 0; i7 < size; i7++) {
            AbstractC2760Q.a aVar = (AbstractC2760Q.a) this.f8214c.get(i7);
            switch (aVar.f8231a) {
                case 0:
                    str2 = "NULL";
                    break;
                case 1:
                    str2 = "ADD";
                    break;
                case 2:
                    str2 = "REPLACE";
                    break;
                case 3:
                    str2 = "REMOVE";
                    break;
                case 4:
                    str2 = "HIDE";
                    break;
                case 5:
                    str2 = "SHOW";
                    break;
                case 6:
                    str2 = "DETACH";
                    break;
                case 7:
                    str2 = "ATTACH";
                    break;
                case 8:
                    str2 = "SET_PRIMARY_NAV";
                    break;
                case 9:
                    str2 = "UNSET_PRIMARY_NAV";
                    break;
                case 10:
                    str2 = "OP_SET_MAX_LIFECYCLE";
                    break;
                default:
                    str2 = "cmd=" + aVar.f8231a;
                    break;
            }
            printWriter.print(str);
            printWriter.print("  Op #");
            printWriter.print(i7);
            printWriter.print(": ");
            printWriter.print(str2);
            printWriter.print(StringUtils.SPACE);
            printWriter.println(aVar.f8232b);
            if (z6) {
                if (aVar.f8234d != 0 || aVar.f8235e != 0) {
                    printWriter.print(str);
                    printWriter.print("enterAnim=#");
                    printWriter.print(Integer.toHexString(aVar.f8234d));
                    printWriter.print(" exitAnim=#");
                    printWriter.println(Integer.toHexString(aVar.f8235e));
                }
                if (aVar.f8236f != 0 || aVar.f8237g != 0) {
                    printWriter.print(str);
                    printWriter.print("popEnterAnim=#");
                    printWriter.print(Integer.toHexString(aVar.f8236f));
                    printWriter.print(" popExitAnim=#");
                    printWriter.println(Integer.toHexString(aVar.f8237g));
                }
            }
        }
    }

    /* renamed from: r */
    public void m9717r() {
        int size = this.f8214c.size();
        for (int i7 = 0; i7 < size; i7++) {
            AbstractC2760Q.a aVar = (AbstractC2760Q.a) this.f8214c.get(i7);
            AbstractComponentCallbacksC2786p abstractComponentCallbacksC2786p = aVar.f8232b;
            if (abstractComponentCallbacksC2786p != null) {
                abstractComponentCallbacksC2786p.f8469v = this.f8313w;
                abstractComponentCallbacksC2786p.m9915y1(false);
                abstractComponentCallbacksC2786p.m9912x1(this.f8219h);
                abstractComponentCallbacksC2786p.m9810A1(this.f8227p, this.f8228q);
            }
            switch (aVar.f8231a) {
                case 1:
                    abstractComponentCallbacksC2786p.m9907u1(aVar.f8234d, aVar.f8235e, aVar.f8236f, aVar.f8237g);
                    this.f8310t.m9492o1(abstractComponentCallbacksC2786p, false);
                    this.f8310t.m9475i(abstractComponentCallbacksC2786p);
                    break;
                case 2:
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + aVar.f8231a);
                case 3:
                    abstractComponentCallbacksC2786p.m9907u1(aVar.f8234d, aVar.f8235e, aVar.f8236f, aVar.f8237g);
                    this.f8310t.m9474h1(abstractComponentCallbacksC2786p);
                    break;
                case 4:
                    abstractComponentCallbacksC2786p.m9907u1(aVar.f8234d, aVar.f8235e, aVar.f8236f, aVar.f8237g);
                    this.f8310t.m9419F0(abstractComponentCallbacksC2786p);
                    break;
                case 5:
                    abstractComponentCallbacksC2786p.m9907u1(aVar.f8234d, aVar.f8235e, aVar.f8236f, aVar.f8237g);
                    this.f8310t.m9492o1(abstractComponentCallbacksC2786p, false);
                    this.f8310t.m9504s1(abstractComponentCallbacksC2786p);
                    break;
                case 6:
                    abstractComponentCallbacksC2786p.m9907u1(aVar.f8234d, aVar.f8235e, aVar.f8236f, aVar.f8237g);
                    this.f8310t.m9514w(abstractComponentCallbacksC2786p);
                    break;
                case 7:
                    abstractComponentCallbacksC2786p.m9907u1(aVar.f8234d, aVar.f8235e, aVar.f8236f, aVar.f8237g);
                    this.f8310t.m9492o1(abstractComponentCallbacksC2786p, false);
                    this.f8310t.m9484m(abstractComponentCallbacksC2786p);
                    break;
                case 8:
                    this.f8310t.m9498q1(abstractComponentCallbacksC2786p);
                    break;
                case 9:
                    this.f8310t.m9498q1(null);
                    break;
                case 10:
                    this.f8310t.m9495p1(abstractComponentCallbacksC2786p, aVar.f8239i);
                    break;
            }
        }
    }

    /* renamed from: s */
    public void m9718s() {
        for (int size = this.f8214c.size() - 1; size >= 0; size--) {
            AbstractC2760Q.a aVar = (AbstractC2760Q.a) this.f8214c.get(size);
            AbstractComponentCallbacksC2786p abstractComponentCallbacksC2786p = aVar.f8232b;
            if (abstractComponentCallbacksC2786p != null) {
                abstractComponentCallbacksC2786p.f8469v = this.f8313w;
                abstractComponentCallbacksC2786p.m9915y1(true);
                abstractComponentCallbacksC2786p.m9912x1(AbstractC2752I.m9408l1(this.f8219h));
                abstractComponentCallbacksC2786p.m9810A1(this.f8228q, this.f8227p);
            }
            switch (aVar.f8231a) {
                case 1:
                    abstractComponentCallbacksC2786p.m9907u1(aVar.f8234d, aVar.f8235e, aVar.f8236f, aVar.f8237g);
                    this.f8310t.m9492o1(abstractComponentCallbacksC2786p, true);
                    this.f8310t.m9474h1(abstractComponentCallbacksC2786p);
                    break;
                case 2:
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + aVar.f8231a);
                case 3:
                    abstractComponentCallbacksC2786p.m9907u1(aVar.f8234d, aVar.f8235e, aVar.f8236f, aVar.f8237g);
                    this.f8310t.m9475i(abstractComponentCallbacksC2786p);
                    break;
                case 4:
                    abstractComponentCallbacksC2786p.m9907u1(aVar.f8234d, aVar.f8235e, aVar.f8236f, aVar.f8237g);
                    this.f8310t.m9504s1(abstractComponentCallbacksC2786p);
                    break;
                case 5:
                    abstractComponentCallbacksC2786p.m9907u1(aVar.f8234d, aVar.f8235e, aVar.f8236f, aVar.f8237g);
                    this.f8310t.m9492o1(abstractComponentCallbacksC2786p, true);
                    this.f8310t.m9419F0(abstractComponentCallbacksC2786p);
                    break;
                case 6:
                    abstractComponentCallbacksC2786p.m9907u1(aVar.f8234d, aVar.f8235e, aVar.f8236f, aVar.f8237g);
                    this.f8310t.m9484m(abstractComponentCallbacksC2786p);
                    break;
                case 7:
                    abstractComponentCallbacksC2786p.m9907u1(aVar.f8234d, aVar.f8235e, aVar.f8236f, aVar.f8237g);
                    this.f8310t.m9492o1(abstractComponentCallbacksC2786p, true);
                    this.f8310t.m9514w(abstractComponentCallbacksC2786p);
                    break;
                case 8:
                    this.f8310t.m9498q1(null);
                    break;
                case 9:
                    this.f8310t.m9498q1(abstractComponentCallbacksC2786p);
                    break;
                case 10:
                    this.f8310t.m9495p1(abstractComponentCallbacksC2786p, aVar.f8238h);
                    break;
            }
        }
    }

    /* renamed from: t */
    public AbstractComponentCallbacksC2786p m9719t(ArrayList arrayList, AbstractComponentCallbacksC2786p abstractComponentCallbacksC2786p) {
        AbstractComponentCallbacksC2786p abstractComponentCallbacksC2786p2 = abstractComponentCallbacksC2786p;
        int i7 = 0;
        while (i7 < this.f8214c.size()) {
            AbstractC2760Q.a aVar = (AbstractC2760Q.a) this.f8214c.get(i7);
            int i8 = aVar.f8231a;
            if (i8 != 1) {
                if (i8 == 2) {
                    AbstractComponentCallbacksC2786p abstractComponentCallbacksC2786p3 = aVar.f8232b;
                    int i9 = abstractComponentCallbacksC2786p3.f8425G;
                    boolean z6 = false;
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        AbstractComponentCallbacksC2786p abstractComponentCallbacksC2786p4 = (AbstractComponentCallbacksC2786p) arrayList.get(size);
                        if (abstractComponentCallbacksC2786p4.f8425G == i9) {
                            if (abstractComponentCallbacksC2786p4 == abstractComponentCallbacksC2786p3) {
                                z6 = true;
                            } else {
                                if (abstractComponentCallbacksC2786p4 == abstractComponentCallbacksC2786p2) {
                                    this.f8214c.add(i7, new AbstractC2760Q.a(9, abstractComponentCallbacksC2786p4, true));
                                    i7++;
                                    abstractComponentCallbacksC2786p2 = null;
                                }
                                AbstractC2760Q.a aVar2 = new AbstractC2760Q.a(3, abstractComponentCallbacksC2786p4, true);
                                aVar2.f8234d = aVar.f8234d;
                                aVar2.f8236f = aVar.f8236f;
                                aVar2.f8235e = aVar.f8235e;
                                aVar2.f8237g = aVar.f8237g;
                                this.f8214c.add(i7, aVar2);
                                arrayList.remove(abstractComponentCallbacksC2786p4);
                                i7++;
                            }
                        }
                    }
                    if (z6) {
                        this.f8214c.remove(i7);
                        i7--;
                    } else {
                        aVar.f8231a = 1;
                        aVar.f8233c = true;
                        arrayList.add(abstractComponentCallbacksC2786p3);
                    }
                } else if (i8 == 3 || i8 == 6) {
                    arrayList.remove(aVar.f8232b);
                    AbstractComponentCallbacksC2786p abstractComponentCallbacksC2786p5 = aVar.f8232b;
                    if (abstractComponentCallbacksC2786p5 == abstractComponentCallbacksC2786p2) {
                        this.f8214c.add(i7, new AbstractC2760Q.a(9, abstractComponentCallbacksC2786p5));
                        i7++;
                        abstractComponentCallbacksC2786p2 = null;
                    }
                } else if (i8 != 7) {
                    if (i8 == 8) {
                        this.f8214c.add(i7, new AbstractC2760Q.a(9, abstractComponentCallbacksC2786p2, true));
                        aVar.f8233c = true;
                        i7++;
                        abstractComponentCallbacksC2786p2 = aVar.f8232b;
                    }
                }
                i7++;
            }
            arrayList.add(aVar.f8232b);
            i7++;
        }
        return abstractComponentCallbacksC2786p2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.f8312v >= 0) {
            sb.append(" #");
            sb.append(this.f8312v);
        }
        if (this.f8222k != null) {
            sb.append(StringUtils.SPACE);
            sb.append(this.f8222k);
        }
        sb.append("}");
        return sb.toString();
    }

    /* renamed from: u */
    public String m9720u() {
        return this.f8222k;
    }

    /* renamed from: v */
    public void m9721v() {
        if (this.f8230s != null) {
            for (int i7 = 0; i7 < this.f8230s.size(); i7++) {
                ((Runnable) this.f8230s.get(i7)).run();
            }
            this.f8230s = null;
        }
    }

    /* renamed from: w */
    public AbstractComponentCallbacksC2786p m9722w(ArrayList arrayList, AbstractComponentCallbacksC2786p abstractComponentCallbacksC2786p) {
        for (int size = this.f8214c.size() - 1; size >= 0; size--) {
            AbstractC2760Q.a aVar = (AbstractC2760Q.a) this.f8214c.get(size);
            int i7 = aVar.f8231a;
            if (i7 != 1) {
                if (i7 != 3) {
                    switch (i7) {
                        case 8:
                            abstractComponentCallbacksC2786p = null;
                            break;
                        case 9:
                            abstractComponentCallbacksC2786p = aVar.f8232b;
                            break;
                        case 10:
                            aVar.f8239i = aVar.f8238h;
                            break;
                    }
                }
                arrayList.add(aVar.f8232b);
            }
            arrayList.remove(aVar.f8232b);
        }
        return abstractComponentCallbacksC2786p;
    }
}
