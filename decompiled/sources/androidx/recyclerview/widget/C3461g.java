package androidx.recyclerview.widget;

import androidx.recyclerview.widget.C3455a;
import java.util.List;

/* renamed from: androidx.recyclerview.widget.g */
/* loaded from: classes.dex */
public class C3461g {

    /* renamed from: a */
    public final a f11614a;

    /* renamed from: androidx.recyclerview.widget.g$a */
    public interface a {
        /* renamed from: a */
        void mo13833a(C3455a.b bVar);

        /* renamed from: b */
        C3455a.b mo13834b(int i7, int i8, int i9, Object obj);
    }

    public C3461g(a aVar) {
        this.f11614a = aVar;
    }

    /* renamed from: a */
    public final int m13911a(List list) {
        boolean z6 = false;
        for (int size = list.size() - 1; size >= 0; size--) {
            if (((C3455a.b) list.get(size)).f11526a != 8) {
                z6 = true;
            } else if (z6) {
                return size;
            }
        }
        return -1;
    }

    /* renamed from: b */
    public void m13912b(List list) {
        while (true) {
            int m13911a = m13911a(list);
            if (m13911a == -1) {
                return;
            } else {
                m13914d(list, m13911a, m13911a + 1);
            }
        }
    }

    /* renamed from: c */
    public final void m13913c(List list, int i7, C3455a.b bVar, int i8, C3455a.b bVar2) {
        int i9 = bVar.f11529d;
        int i10 = bVar2.f11527b;
        int i11 = i9 < i10 ? -1 : 0;
        int i12 = bVar.f11527b;
        if (i12 < i10) {
            i11++;
        }
        if (i10 <= i12) {
            bVar.f11527b = i12 + bVar2.f11529d;
        }
        int i13 = bVar2.f11527b;
        if (i13 <= i9) {
            bVar.f11529d = i9 + bVar2.f11529d;
        }
        bVar2.f11527b = i13 + i11;
        list.set(i7, bVar2);
        list.set(i8, bVar);
    }

    /* renamed from: d */
    public final void m13914d(List list, int i7, int i8) {
        C3455a.b bVar = (C3455a.b) list.get(i7);
        C3455a.b bVar2 = (C3455a.b) list.get(i8);
        int i9 = bVar2.f11526a;
        if (i9 == 1) {
            m13913c(list, i7, bVar, i8, bVar2);
        } else if (i9 == 2) {
            m13915e(list, i7, bVar, i8, bVar2);
        } else {
            if (i9 != 4) {
                return;
            }
            m13916f(list, i7, bVar, i8, bVar2);
        }
    }

    /* renamed from: e */
    public void m13915e(List list, int i7, C3455a.b bVar, int i8, C3455a.b bVar2) {
        boolean z6;
        int i9 = bVar.f11527b;
        int i10 = bVar.f11529d;
        boolean z7 = false;
        if (i9 < i10) {
            if (bVar2.f11527b == i9 && bVar2.f11529d == i10 - i9) {
                z6 = false;
                z7 = true;
            } else {
                z6 = false;
            }
        } else if (bVar2.f11527b == i10 + 1 && bVar2.f11529d == i9 - i10) {
            z6 = true;
            z7 = true;
        } else {
            z6 = true;
        }
        int i11 = bVar2.f11527b;
        if (i10 < i11) {
            bVar2.f11527b = i11 - 1;
        } else {
            int i12 = bVar2.f11529d;
            if (i10 < i11 + i12) {
                bVar2.f11529d = i12 - 1;
                bVar.f11526a = 2;
                bVar.f11529d = 1;
                if (bVar2.f11529d == 0) {
                    list.remove(i8);
                    this.f11614a.mo13833a(bVar2);
                    return;
                }
                return;
            }
        }
        int i13 = bVar.f11527b;
        int i14 = bVar2.f11527b;
        C3455a.b bVar3 = null;
        if (i13 <= i14) {
            bVar2.f11527b = i14 + 1;
        } else {
            int i15 = bVar2.f11529d;
            if (i13 < i14 + i15) {
                bVar3 = this.f11614a.mo13834b(2, i13 + 1, (i14 + i15) - i13, null);
                bVar2.f11529d = bVar.f11527b - bVar2.f11527b;
            }
        }
        if (z7) {
            list.set(i7, bVar2);
            list.remove(i8);
            this.f11614a.mo13833a(bVar);
            return;
        }
        if (z6) {
            if (bVar3 != null) {
                int i16 = bVar.f11527b;
                if (i16 > bVar3.f11527b) {
                    bVar.f11527b = i16 - bVar3.f11529d;
                }
                int i17 = bVar.f11529d;
                if (i17 > bVar3.f11527b) {
                    bVar.f11529d = i17 - bVar3.f11529d;
                }
            }
            int i18 = bVar.f11527b;
            if (i18 > bVar2.f11527b) {
                bVar.f11527b = i18 - bVar2.f11529d;
            }
            int i19 = bVar.f11529d;
            if (i19 > bVar2.f11527b) {
                bVar.f11529d = i19 - bVar2.f11529d;
            }
        } else {
            if (bVar3 != null) {
                int i20 = bVar.f11527b;
                if (i20 >= bVar3.f11527b) {
                    bVar.f11527b = i20 - bVar3.f11529d;
                }
                int i21 = bVar.f11529d;
                if (i21 >= bVar3.f11527b) {
                    bVar.f11529d = i21 - bVar3.f11529d;
                }
            }
            int i22 = bVar.f11527b;
            if (i22 >= bVar2.f11527b) {
                bVar.f11527b = i22 - bVar2.f11529d;
            }
            int i23 = bVar.f11529d;
            if (i23 >= bVar2.f11527b) {
                bVar.f11529d = i23 - bVar2.f11529d;
            }
        }
        list.set(i7, bVar2);
        if (bVar.f11527b != bVar.f11529d) {
            list.set(i8, bVar);
        } else {
            list.remove(i8);
        }
        if (bVar3 != null) {
            list.add(i7, bVar3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0027  */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m13916f(java.util.List r9, int r10, androidx.recyclerview.widget.C3455a.b r11, int r12, androidx.recyclerview.widget.C3455a.b r13) {
        /*
            r8 = this;
            int r0 = r11.f11529d
            int r1 = r13.f11527b
            r2 = 4
            r3 = 1
            r4 = 0
            if (r0 >= r1) goto Ld
            int r1 = r1 - r3
            r13.f11527b = r1
            goto L20
        Ld:
            int r5 = r13.f11529d
            int r1 = r1 + r5
            if (r0 >= r1) goto L20
            int r5 = r5 - r3
            r13.f11529d = r5
            androidx.recyclerview.widget.g$a r0 = r8.f11614a
            int r1 = r11.f11527b
            java.lang.Object r5 = r13.f11528c
            androidx.recyclerview.widget.a$b r0 = r0.mo13834b(r2, r1, r3, r5)
            goto L21
        L20:
            r0 = r4
        L21:
            int r1 = r11.f11527b
            int r5 = r13.f11527b
            if (r1 > r5) goto L2b
            int r5 = r5 + r3
            r13.f11527b = r5
            goto L41
        L2b:
            int r6 = r13.f11529d
            int r7 = r5 + r6
            if (r1 >= r7) goto L41
            int r5 = r5 + r6
            int r5 = r5 - r1
            androidx.recyclerview.widget.g$a r4 = r8.f11614a
            int r1 = r1 + r3
            java.lang.Object r3 = r13.f11528c
            androidx.recyclerview.widget.a$b r4 = r4.mo13834b(r2, r1, r5, r3)
            int r1 = r13.f11529d
            int r1 = r1 - r5
            r13.f11529d = r1
        L41:
            r9.set(r12, r11)
            int r11 = r13.f11529d
            if (r11 <= 0) goto L4c
            r9.set(r10, r13)
            goto L54
        L4c:
            r9.remove(r10)
            androidx.recyclerview.widget.g$a r11 = r8.f11614a
            r11.mo13833a(r13)
        L54:
            if (r0 == 0) goto L59
            r9.add(r10, r0)
        L59:
            if (r4 == 0) goto L5e
            r9.add(r10, r4)
        L5e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.C3461g.m13916f(java.util.List, int, androidx.recyclerview.widget.a$b, int, androidx.recyclerview.widget.a$b):void");
    }
}
