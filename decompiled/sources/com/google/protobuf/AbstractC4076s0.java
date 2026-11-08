package com.google.protobuf;

import p272k4.C5410A;

/* renamed from: com.google.protobuf.s0 */
/* loaded from: classes.dex */
public abstract class AbstractC4076s0 {

    /* renamed from: com.google.protobuf.s0$a */
    public class a implements b {

        /* renamed from: a */
        public final /* synthetic */ AbstractC4055i f13510a;

        public a(AbstractC4055i abstractC4055i) {
            this.f13510a = abstractC4055i;
        }

        @Override // com.google.protobuf.AbstractC4076s0.b
        /* renamed from: a */
        public byte mo16922a(int i7) {
            return this.f13510a.mo16437f(i7);
        }

        @Override // com.google.protobuf.AbstractC4076s0.b
        public int size() {
            return this.f13510a.size();
        }
    }

    /* renamed from: com.google.protobuf.s0$b */
    public interface b {
        /* renamed from: a */
        byte mo16922a(int i7);

        int size();
    }

    /* renamed from: a */
    public static String m16919a(AbstractC4055i abstractC4055i) {
        return m16920b(new a(abstractC4055i));
    }

    /* renamed from: b */
    public static String m16920b(b bVar) {
        StringBuilder sb = new StringBuilder(bVar.size());
        for (int i7 = 0; i7 < bVar.size(); i7++) {
            byte mo16922a = bVar.mo16922a(i7);
            if (mo16922a == 34) {
                sb.append("\\\"");
            } else if (mo16922a == 39) {
                sb.append("\\'");
            } else if (mo16922a != 92) {
                switch (mo16922a) {
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
                        if (mo16922a < 32 || mo16922a > 126) {
                            sb.append('\\');
                            sb.append((char) (((mo16922a >>> 6) & 3) + 48));
                            sb.append((char) (((mo16922a >>> 3) & 7) + 48));
                            sb.append((char) ((mo16922a & 7) + 48));
                            break;
                        } else {
                            sb.append((char) mo16922a);
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
    public static String m16921c(String str) {
        return m16919a(AbstractC4055i.m16502n(str));
    }
}
