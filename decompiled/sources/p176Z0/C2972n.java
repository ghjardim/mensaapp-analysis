package p176Z0;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import org.apache.tika.utils.XMLReaderUtils;
import p178Z2.AbstractC3033v;
import p203c3.AbstractC3577g;
import p232g0.C4333w;
import p259j0.AbstractC5330M;
import p259j0.AbstractC5332a;
import p272k4.C5410A;
import p272k4.C5413D;

/* renamed from: Z0.n */
/* loaded from: classes.dex */
public final class C2972n extends AbstractC2967i {
    public static final Parcelable.Creator<C2972n> CREATOR = new a();

    /* renamed from: b */
    public final String f9122b;

    /* renamed from: c */
    public final String f9123c;

    /* renamed from: d */
    public final AbstractC3033v f9124d;

    /* renamed from: Z0.n$a */
    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C2972n createFromParcel(Parcel parcel) {
            return new C2972n(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C2972n[] newArray(int i7) {
            return new C2972n[i7];
        }
    }

    public /* synthetic */ C2972n(Parcel parcel, a aVar) {
        this(parcel);
    }

    /* renamed from: a */
    public static List m10714a(String str) {
        ArrayList arrayList = new ArrayList();
        try {
            if (str.length() >= 10) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(8, 10))));
            } else if (str.length() >= 7) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
            } else if (str.length() >= 4) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
            }
            return arrayList;
        } catch (NumberFormatException unused) {
            return new ArrayList();
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C2972n.class != obj.getClass()) {
            return false;
        }
        C2972n c2972n = (C2972n) obj;
        return AbstractC5330M.m21729c(this.f9110a, c2972n.f9110a) && AbstractC5330M.m21729c(this.f9122b, c2972n.f9122b) && this.f9124d.equals(c2972n.f9124d);
    }

    public int hashCode() {
        int hashCode = (527 + this.f9110a.hashCode()) * 31;
        String str = this.f9122b;
        return ((hashCode + (str != null ? str.hashCode() : 0)) * 31) + this.f9124d.hashCode();
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // p176Z0.AbstractC2967i, p232g0.C4334x.b
    /* renamed from: o */
    public void mo8980o(C4333w.b bVar) {
        String str = this.f9110a;
        str.hashCode();
        char c7 = 65535;
        switch (str.hashCode()) {
            case 82815:
                if (str.equals("TAL")) {
                    c7 = 0;
                    break;
                }
                break;
            case 82878:
                if (str.equals("TCM")) {
                    c7 = 1;
                    break;
                }
                break;
            case 82897:
                if (str.equals("TDA")) {
                    c7 = 2;
                    break;
                }
                break;
            case 83253:
                if (str.equals("TP1")) {
                    c7 = 3;
                    break;
                }
                break;
            case 83254:
                if (str.equals("TP2")) {
                    c7 = 4;
                    break;
                }
                break;
            case 83255:
                if (str.equals("TP3")) {
                    c7 = 5;
                    break;
                }
                break;
            case 83341:
                if (str.equals("TRK")) {
                    c7 = 6;
                    break;
                }
                break;
            case 83378:
                if (str.equals("TT2")) {
                    c7 = 7;
                    break;
                }
                break;
            case 83536:
                if (str.equals("TXT")) {
                    c7 = '\b';
                    break;
                }
                break;
            case 83552:
                if (str.equals("TYE")) {
                    c7 = '\t';
                    break;
                }
                break;
            case 2567331:
                if (str.equals("TALB")) {
                    c7 = '\n';
                    break;
                }
                break;
            case 2569357:
                if (str.equals("TCOM")) {
                    c7 = 11;
                    break;
                }
                break;
            case 2569358:
                if (str.equals("TCON")) {
                    c7 = '\f';
                    break;
                }
                break;
            case 2569891:
                if (str.equals("TDAT")) {
                    c7 = '\r';
                    break;
                }
                break;
            case 2570401:
                if (str.equals("TDRC")) {
                    c7 = 14;
                    break;
                }
                break;
            case 2570410:
                if (str.equals("TDRL")) {
                    c7 = 15;
                    break;
                }
                break;
            case 2571565:
                if (str.equals("TEXT")) {
                    c7 = 16;
                    break;
                }
                break;
            case 2575251:
                if (str.equals("TIT2")) {
                    c7 = 17;
                    break;
                }
                break;
            case 2581512:
                if (str.equals("TPE1")) {
                    c7 = 18;
                    break;
                }
                break;
            case 2581513:
                if (str.equals("TPE2")) {
                    c7 = 19;
                    break;
                }
                break;
            case 2581514:
                if (str.equals("TPE3")) {
                    c7 = 20;
                    break;
                }
                break;
            case 2583398:
                if (str.equals("TRCK")) {
                    c7 = 21;
                    break;
                }
                break;
            case 2590194:
                if (str.equals("TYER")) {
                    c7 = 22;
                    break;
                }
                break;
        }
        try {
            switch (c7) {
                case 0:
                case '\n':
                    bVar.m18368O((CharSequence) this.f9124d.get(0));
                    break;
                case 1:
                case 11:
                    bVar.m18373T((CharSequence) this.f9124d.get(0));
                    break;
                case 2:
                case '\r':
                    String str2 = (String) this.f9124d.get(0);
                    bVar.m18386g0(Integer.valueOf(Integer.parseInt(str2.substring(2, 4)))).m18385f0(Integer.valueOf(Integer.parseInt(str2.substring(0, 2))));
                    break;
                case 3:
                case C5413D.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                    bVar.m18369P((CharSequence) this.f9124d.get(0));
                    break;
                case 4:
                case 19:
                    bVar.m18367N((CharSequence) this.f9124d.get(0));
                    break;
                case 5:
                case XMLReaderUtils.DEFAULT_MAX_ENTITY_EXPANSIONS /* 20 */:
                    bVar.m18374U((CharSequence) this.f9124d.get(0));
                    break;
                case 6:
                case 21:
                    String[] m21737e1 = AbstractC5330M.m21737e1((String) this.f9124d.get(0), "/");
                    bVar.m18396q0(Integer.valueOf(Integer.parseInt(m21737e1[0]))).m18395p0(m21737e1.length > 1 ? Integer.valueOf(Integer.parseInt(m21737e1[1])) : null);
                    break;
                case 7:
                case 17:
                    bVar.m18393n0((CharSequence) this.f9124d.get(0));
                    break;
                case '\b':
                case 16:
                    bVar.m18397r0((CharSequence) this.f9124d.get(0));
                    break;
                case '\t':
                case 22:
                    bVar.m18387h0(Integer.valueOf(Integer.parseInt((String) this.f9124d.get(0))));
                    break;
                case C5410A.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
                    Integer m14432o = AbstractC3577g.m14432o((String) this.f9124d.get(0));
                    if (m14432o != null) {
                        String m10707a = AbstractC2968j.m10707a(m14432o.intValue());
                        if (m10707a != null) {
                            bVar.m18381b0(m10707a);
                            break;
                        }
                    } else {
                        bVar.m18381b0((CharSequence) this.f9124d.get(0));
                        break;
                    }
                    break;
                case 14:
                    List m10714a = m10714a((String) this.f9124d.get(0));
                    int size = m10714a.size();
                    if (size != 1) {
                        if (size != 2) {
                            if (size == 3) {
                                bVar.m18385f0((Integer) m10714a.get(2));
                            }
                        }
                        bVar.m18386g0((Integer) m10714a.get(1));
                    }
                    bVar.m18387h0((Integer) m10714a.get(0));
                    break;
                case 15:
                    List m10714a2 = m10714a((String) this.f9124d.get(0));
                    int size2 = m10714a2.size();
                    if (size2 != 1) {
                        if (size2 != 2) {
                            if (size2 == 3) {
                                bVar.m18388i0((Integer) m10714a2.get(2));
                            }
                        }
                        bVar.m18389j0((Integer) m10714a2.get(1));
                    }
                    bVar.m18390k0((Integer) m10714a2.get(0));
                    break;
            }
        } catch (NumberFormatException | StringIndexOutOfBoundsException unused) {
        }
    }

    @Override // p176Z0.AbstractC2967i
    public String toString() {
        return this.f9110a + ": description=" + this.f9122b + ": values=" + this.f9124d;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        parcel.writeString(this.f9110a);
        parcel.writeString(this.f9122b);
        parcel.writeStringArray((String[]) this.f9124d.toArray(new String[0]));
    }

    public C2972n(String str, String str2, List list) {
        super(str);
        AbstractC5332a.m21796a(!list.isEmpty());
        this.f9122b = str2;
        AbstractC3033v m11048p = AbstractC3033v.m11048p(list);
        this.f9124d = m11048p;
        this.f9123c = (String) m11048p.get(0);
    }

    public C2972n(Parcel parcel) {
        this((String) AbstractC5332a.m21800e(parcel.readString()), parcel.readString(), AbstractC3033v.m11049q((String[]) AbstractC5332a.m21800e(parcel.createStringArray())));
    }
}
