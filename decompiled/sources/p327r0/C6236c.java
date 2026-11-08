package p327r0;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import p232g0.C4302H;
import p259j0.AbstractC5330M;
import p380y0.InterfaceC7048a;

/* renamed from: r0.c */
/* loaded from: classes.dex */
public class C6236c implements InterfaceC7048a {

    /* renamed from: a */
    public final long f22288a;

    /* renamed from: b */
    public final long f22289b;

    /* renamed from: c */
    public final long f22290c;

    /* renamed from: d */
    public final boolean f22291d;

    /* renamed from: e */
    public final long f22292e;

    /* renamed from: f */
    public final long f22293f;

    /* renamed from: g */
    public final long f22294g;

    /* renamed from: h */
    public final long f22295h;

    /* renamed from: i */
    public final C6248o f22296i;

    /* renamed from: j */
    public final C6245l f22297j;

    /* renamed from: k */
    public final Uri f22298k;

    /* renamed from: l */
    public final C6241h f22299l;

    /* renamed from: m */
    public final List f22300m;

    public C6236c(long j7, long j8, long j9, boolean z6, long j10, long j11, long j12, long j13, C6241h c6241h, C6248o c6248o, C6245l c6245l, Uri uri, List list) {
        this.f22288a = j7;
        this.f22289b = j8;
        this.f22290c = j9;
        this.f22291d = z6;
        this.f22292e = j10;
        this.f22293f = j11;
        this.f22294g = j12;
        this.f22295h = j13;
        this.f22299l = c6241h;
        this.f22296i = c6248o;
        this.f22298k = uri;
        this.f22297j = c6245l;
        this.f22300m = list == null ? Collections.emptyList() : list;
    }

    /* renamed from: c */
    public static ArrayList m26005c(List list, LinkedList linkedList) {
        C4302H c4302h = (C4302H) linkedList.poll();
        int i7 = c4302h.f14797a;
        ArrayList arrayList = new ArrayList();
        do {
            int i8 = c4302h.f14798b;
            C6234a c6234a = (C6234a) list.get(i8);
            List list2 = c6234a.f22280c;
            ArrayList arrayList2 = new ArrayList();
            do {
                arrayList2.add((AbstractC6243j) list2.get(c4302h.f14799c));
                c4302h = (C4302H) linkedList.poll();
                if (c4302h.f14797a != i7) {
                    break;
                }
            } while (c4302h.f14798b == i8);
            arrayList.add(new C6234a(c6234a.f22278a, c6234a.f22279b, arrayList2, c6234a.f22281d, c6234a.f22282e, c6234a.f22283f));
        } while (c4302h.f14797a == i7);
        linkedList.addFirst(c4302h);
        return arrayList;
    }

    @Override // p380y0.InterfaceC7048a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C6236c mo168a(List list) {
        LinkedList linkedList = new LinkedList(list);
        Collections.sort(linkedList);
        linkedList.add(new C4302H(-1, -1, -1));
        ArrayList arrayList = new ArrayList();
        long j7 = 0;
        int i7 = 0;
        while (true) {
            if (i7 >= m26008e()) {
                break;
            }
            if (((C4302H) linkedList.peek()).f14797a != i7) {
                long m26009f = m26009f(i7);
                if (m26009f != -9223372036854775807L) {
                    j7 += m26009f;
                }
            } else {
                C6240g m26007d = m26007d(i7);
                arrayList.add(new C6240g(m26007d.f22323a, m26007d.f22324b - j7, m26005c(m26007d.f22325c, linkedList), m26007d.f22326d));
            }
            i7++;
        }
        long j8 = this.f22289b;
        return new C6236c(this.f22288a, j8 != -9223372036854775807L ? j8 - j7 : -9223372036854775807L, this.f22290c, this.f22291d, this.f22292e, this.f22293f, this.f22294g, this.f22295h, this.f22299l, this.f22296i, this.f22297j, this.f22298k, arrayList);
    }

    /* renamed from: d */
    public final C6240g m26007d(int i7) {
        return (C6240g) this.f22300m.get(i7);
    }

    /* renamed from: e */
    public final int m26008e() {
        return this.f22300m.size();
    }

    /* renamed from: f */
    public final long m26009f(int i7) {
        long j7;
        long j8;
        if (i7 == this.f22300m.size() - 1) {
            j7 = this.f22289b;
            if (j7 == -9223372036854775807L) {
                return -9223372036854775807L;
            }
            j8 = ((C6240g) this.f22300m.get(i7)).f22324b;
        } else {
            j7 = ((C6240g) this.f22300m.get(i7 + 1)).f22324b;
            j8 = ((C6240g) this.f22300m.get(i7)).f22324b;
        }
        return j7 - j8;
    }

    /* renamed from: g */
    public final long m26010g(int i7) {
        return AbstractC5330M.m21692K0(m26009f(i7));
    }
}
