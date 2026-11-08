package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.os.Parcelable;
import p044G1.AbstractC0377a;

/* loaded from: classes.dex */
public class IconCompatParcelizer {
    public static IconCompat read(AbstractC0377a abstractC0377a) {
        IconCompat iconCompat = new IconCompat();
        iconCompat.f10307a = abstractC0377a.m1557p(iconCompat.f10307a, 1);
        iconCompat.f10309c = abstractC0377a.m1551j(iconCompat.f10309c, 2);
        iconCompat.f10310d = abstractC0377a.m1559r(iconCompat.f10310d, 3);
        iconCompat.f10311e = abstractC0377a.m1557p(iconCompat.f10311e, 4);
        iconCompat.f10312f = abstractC0377a.m1557p(iconCompat.f10312f, 5);
        iconCompat.f10313g = (ColorStateList) abstractC0377a.m1559r(iconCompat.f10313g, 6);
        iconCompat.f10315i = abstractC0377a.m1561t(iconCompat.f10315i, 7);
        iconCompat.f10316j = abstractC0377a.m1561t(iconCompat.f10316j, 8);
        iconCompat.m11957j();
        return iconCompat;
    }

    public static void write(IconCompat iconCompat, AbstractC0377a abstractC0377a) {
        abstractC0377a.m1565x(true, true);
        iconCompat.m11958k(abstractC0377a.m1547f());
        int i7 = iconCompat.f10307a;
        if (-1 != i7) {
            abstractC0377a.m1533F(i7, 1);
        }
        byte[] bArr = iconCompat.f10309c;
        if (bArr != null) {
            abstractC0377a.m1529B(bArr, 2);
        }
        Parcelable parcelable = iconCompat.f10310d;
        if (parcelable != null) {
            abstractC0377a.m1535H(parcelable, 3);
        }
        int i8 = iconCompat.f10311e;
        if (i8 != 0) {
            abstractC0377a.m1533F(i8, 4);
        }
        int i9 = iconCompat.f10312f;
        if (i9 != 0) {
            abstractC0377a.m1533F(i9, 5);
        }
        ColorStateList colorStateList = iconCompat.f10313g;
        if (colorStateList != null) {
            abstractC0377a.m1535H(colorStateList, 6);
        }
        String str = iconCompat.f10315i;
        if (str != null) {
            abstractC0377a.m1537J(str, 7);
        }
        String str2 = iconCompat.f10316j;
        if (str2 != null) {
            abstractC0377a.m1537J(str2, 8);
        }
    }
}
