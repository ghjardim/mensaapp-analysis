package p327r0;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import org.apache.tika.utils.StringUtils;

/* renamed from: r0.n */
/* loaded from: classes.dex */
public final class C6247n {

    /* renamed from: a */
    public final List f22374a;

    /* renamed from: b */
    public final List f22375b;

    /* renamed from: c */
    public final List f22376c;

    public C6247n(List list, List list2, List list3) {
        this.f22374a = list;
        this.f22375b = list2;
        this.f22376c = list3;
    }

    /* renamed from: b */
    public static C6247n m26108b(String str) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        m26109c(str, arrayList, arrayList2, arrayList3);
        return new C6247n(arrayList, arrayList2, arrayList3);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: c */
    public static void m26109c(String str, List list, List list2, List list3) {
        String str2;
        boolean z6;
        list.add(StringUtils.EMPTY);
        int i7 = 0;
        while (i7 < str.length()) {
            int indexOf = str.indexOf("$", i7);
            if (indexOf == -1) {
                list.set(list2.size(), ((String) list.get(list2.size())) + str.substring(i7));
                i7 = str.length();
            } else if (indexOf != i7) {
                list.set(list2.size(), ((String) list.get(list2.size())) + str.substring(i7, indexOf));
                i7 = indexOf;
            } else if (str.startsWith("$$", i7)) {
                list.set(list2.size(), ((String) list.get(list2.size())) + "$");
                i7 += 2;
            } else {
                list3.add(StringUtils.EMPTY);
                int i8 = i7 + 1;
                int indexOf2 = str.indexOf("$", i8);
                String substring = str.substring(i8, indexOf2);
                if (substring.equals("RepresentationID")) {
                    list2.add(1);
                } else {
                    int indexOf3 = substring.indexOf("%0");
                    if (indexOf3 != -1) {
                        str2 = substring.substring(indexOf3);
                        if (!str2.endsWith("d") && !str2.endsWith("x") && !str2.endsWith("X")) {
                            str2 = str2 + "d";
                        }
                        substring = substring.substring(0, indexOf3);
                    } else {
                        str2 = "%01d";
                    }
                    substring.hashCode();
                    switch (substring.hashCode()) {
                        case -1950496919:
                            if (substring.equals("Number")) {
                                z6 = false;
                                break;
                            }
                            z6 = -1;
                            break;
                        case 2606829:
                            if (substring.equals("Time")) {
                                z6 = true;
                                break;
                            }
                            z6 = -1;
                            break;
                        case 38199441:
                            if (substring.equals("Bandwidth")) {
                                z6 = 2;
                                break;
                            }
                            z6 = -1;
                            break;
                        default:
                            z6 = -1;
                            break;
                    }
                    switch (z6) {
                        case false:
                            list2.add(2);
                            break;
                        case true:
                            list2.add(4);
                            break;
                        case true:
                            list2.add(3);
                            break;
                        default:
                            throw new IllegalArgumentException("Invalid template: " + str);
                    }
                    list3.set(list2.size() - 1, str2);
                }
                list.add(StringUtils.EMPTY);
                i7 = indexOf2 + 1;
            }
        }
    }

    /* renamed from: a */
    public String m26110a(String str, long j7, int i7, long j8) {
        StringBuilder sb = new StringBuilder();
        for (int i8 = 0; i8 < this.f22375b.size(); i8++) {
            sb.append((String) this.f22374a.get(i8));
            if (((Integer) this.f22375b.get(i8)).intValue() == 1) {
                sb.append(str);
            } else if (((Integer) this.f22375b.get(i8)).intValue() == 2) {
                sb.append(String.format(Locale.US, (String) this.f22376c.get(i8), Long.valueOf(j7)));
            } else if (((Integer) this.f22375b.get(i8)).intValue() == 3) {
                sb.append(String.format(Locale.US, (String) this.f22376c.get(i8), Integer.valueOf(i7)));
            } else if (((Integer) this.f22375b.get(i8)).intValue() == 4) {
                sb.append(String.format(Locale.US, (String) this.f22376c.get(i8), Long.valueOf(j8)));
            }
        }
        sb.append((String) this.f22374a.get(this.f22375b.size()));
        return sb.toString();
    }
}
