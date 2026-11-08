package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import p382y2.AbstractC7066b;

/* renamed from: com.google.android.gms.common.internal.n0 */
/* loaded from: classes.dex */
public final class C3795n0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m29075M = AbstractC7066b.m29075M(parcel);
        C3806t c3806t = null;
        int[] iArr = null;
        int[] iArr2 = null;
        boolean z6 = false;
        boolean z7 = false;
        int i7 = 0;
        while (parcel.dataPosition() < m29075M) {
            int m29066D = AbstractC7066b.m29066D(parcel);
            switch (AbstractC7066b.m29100w(m29066D)) {
                case 1:
                    c3806t = (C3806t) AbstractC7066b.m29093p(parcel, m29066D, C3806t.CREATOR);
                    break;
                case 2:
                    z6 = AbstractC7066b.m29101x(parcel, m29066D);
                    break;
                case 3:
                    z7 = AbstractC7066b.m29101x(parcel, m29066D);
                    break;
                case 4:
                    iArr = AbstractC7066b.m29088k(parcel, m29066D);
                    break;
                case 5:
                    i7 = AbstractC7066b.m29068F(parcel, m29066D);
                    break;
                case 6:
                    iArr2 = AbstractC7066b.m29088k(parcel, m29066D);
                    break;
                default:
                    AbstractC7066b.m29074L(parcel, m29066D);
                    break;
            }
        }
        AbstractC7066b.m29099v(parcel, m29075M);
        return new C3776e(c3806t, z6, z7, iArr, i7, iArr2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new C3776e[i7];
    }
}
