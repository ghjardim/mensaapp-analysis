package androidx.datastore.preferences.protobuf;

import p272k4.C5410A;

/* renamed from: androidx.datastore.preferences.protobuf.d0 */
/* loaded from: classes.dex */
public abstract class AbstractC3287d0 {

    /* renamed from: androidx.datastore.preferences.protobuf.d0$a */
    public class a implements b {

        /* renamed from: a */
        public final /* synthetic */ AbstractC3290f f10447a;

        public a(AbstractC3290f abstractC3290f) {
            this.f10447a = abstractC3290f;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC3287d0.b
        /* renamed from: a */
        public byte mo12331a(int i7) {
            return this.f10447a.mo12343b(i7);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC3287d0.b
        public int size() {
            return this.f10447a.size();
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.d0$b */
    public interface b {
        /* renamed from: a */
        byte mo12331a(int i7);

        int size();
    }

    /* renamed from: a */
    public static String m12328a(AbstractC3290f abstractC3290f) {
        return m12329b(new a(abstractC3290f));
    }

    /* renamed from: b */
    public static String m12329b(b bVar) {
        StringBuilder sb = new StringBuilder(bVar.size());
        for (int i7 = 0; i7 < bVar.size(); i7++) {
            byte mo12331a = bVar.mo12331a(i7);
            if (mo12331a == 34) {
                sb.append("\\\"");
            } else if (mo12331a == 39) {
                sb.append("\\'");
            } else if (mo12331a != 92) {
                switch (mo12331a) {
                    case 7:
                        sb.append("\\a");
                        break;
                    case 8:
                        sb.append("\\b");
                        break;
                    case 9:
                        sb.append("\\t");
                        break;
                    case 10:
                        sb.append("\\n");
                        break;
                    case 11:
                        sb.append("\\v");
                        break;
                    case C5410A.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
                        sb.append("\\f");
                        break;
                    case 13:
                        sb.append("\\r");
                        break;
                    default:
                        if (mo12331a < 32 || mo12331a > 126) {
                            sb.append('\\');
                            sb.append((char) (((mo12331a >>> 6) & 3) + 48));
                            sb.append((char) (((mo12331a >>> 3) & 7) + 48));
                            sb.append((char) ((mo12331a & 7) + 48));
                            break;
                        } else {
                            sb.append((char) mo12331a);
                            break;
                        }
                        break;
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }

    /* renamed from: c */
    public static String m12330c(String str) {
        return m12328a(AbstractC3290f.m12339i(str));
    }
}
