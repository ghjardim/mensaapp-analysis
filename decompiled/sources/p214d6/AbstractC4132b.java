package p214d6;

import kotlin.jvm.internal.AbstractC5469l;
import p206c6.C3616d;
import p206c6.C3619g;
import p371w5.C6934q;

/* renamed from: d6.b */
/* loaded from: classes2.dex */
public abstract class AbstractC4132b {

    /* renamed from: a */
    public static final char[] f13840a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* renamed from: b */
    public static final int m17326b(byte[] bArr, int i7) {
        byte b7;
        int i8;
        int length = bArr.length;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        loop0: while (i9 < length) {
            byte b8 = bArr[i9];
            if (b8 >= 0) {
                int i12 = i11 + 1;
                if (i11 == i7) {
                    return i10;
                }
                if ((b8 != 10 && b8 != 13 && ((b8 >= 0 && b8 < 32) || (Byte.MAX_VALUE <= b8 && b8 < 160))) || b8 == 65533) {
                    return -1;
                }
                i10 += b8 < 65536 ? 1 : 2;
                i9++;
                while (true) {
                    i11 = i12;
                    if (i9 < length && (b7 = bArr[i9]) >= 0) {
                        i9++;
                        i12 = i11 + 1;
                        if (i11 == i7) {
                            return i10;
                        }
                        if ((b7 == 10 || b7 == 13 || ((b7 < 0 || b7 >= 32) && (Byte.MAX_VALUE > b7 || b7 >= 160))) && b7 != 65533) {
                            i10 += b7 < 65536 ? 1 : 2;
                        }
                    }
                }
            } else {
                if ((b8 >> 5) == -2) {
                    int i13 = i9 + 1;
                    if (length <= i13) {
                        if (i11 == i7) {
                            return i10;
                        }
                        return -1;
                    }
                    byte b9 = bArr[i13];
                    if ((b9 & 192) != 128) {
                        if (i11 == i7) {
                            return i10;
                        }
                        return -1;
                    }
                    int i14 = (b9 ^ 3968) ^ (b8 << 6);
                    if (i14 < 128) {
                        if (i11 == i7) {
                            return i10;
                        }
                        return -1;
                    }
                    i8 = i11 + 1;
                    if (i11 == i7) {
                        return i10;
                    }
                    if ((i14 != 10 && i14 != 13 && ((i14 >= 0 && i14 < 32) || (127 <= i14 && i14 < 160))) || i14 == 65533) {
                        return -1;
                    }
                    i10 += i14 < 65536 ? 1 : 2;
                    C6934q c6934q = C6934q.f24811a;
                    i9 += 2;
                } else if ((b8 >> 4) == -2) {
                    int i15 = i9 + 2;
                    if (length <= i15) {
                        if (i11 == i7) {
                            return i10;
                        }
                        return -1;
                    }
                    byte b10 = bArr[i9 + 1];
                    if ((b10 & 192) != 128) {
                        if (i11 == i7) {
                            return i10;
                        }
                        return -1;
                    }
                    byte b11 = bArr[i15];
                    if ((b11 & 192) != 128) {
                        if (i11 == i7) {
                            return i10;
                        }
                        return -1;
                    }
                    int i16 = ((b10 << 6) ^ ((-123008) ^ b11)) ^ (b8 << 12);
                    if (i16 < 2048) {
                        if (i11 == i7) {
                            return i10;
                        }
                        return -1;
                    }
                    if (55296 <= i16 && i16 < 57344) {
                        if (i11 == i7) {
                            return i10;
                        }
                        return -1;
                    }
                    i8 = i11 + 1;
                    if (i11 == i7) {
                        return i10;
                    }
                    if ((i16 != 10 && i16 != 13 && ((i16 >= 0 && i16 < 32) || (127 <= i16 && i16 < 160))) || i16 == 65533) {
                        return -1;
                    }
                    i10 += i16 < 65536 ? 1 : 2;
                    C6934q c6934q2 = C6934q.f24811a;
                    i9 += 3;
                } else {
                    if ((b8 >> 3) != -2) {
                        if (i11 == i7) {
                            return i10;
                        }
                        return -1;
                    }
                    int i17 = i9 + 3;
                    if (length <= i17) {
                        if (i11 == i7) {
                            return i10;
                        }
                        return -1;
                    }
                    byte b12 = bArr[i9 + 1];
                    if ((b12 & 192) != 128) {
                        if (i11 == i7) {
                            return i10;
                        }
                        return -1;
                    }
                    byte b13 = bArr[i9 + 2];
                    if ((b13 & 192) != 128) {
                        if (i11 == i7) {
                            return i10;
                        }
                        return -1;
                    }
                    byte b14 = bArr[i17];
                    if ((b14 & 192) != 128) {
                        if (i11 == i7) {
                            return i10;
                        }
                        return -1;
                    }
                    int i18 = (((b14 ^ 3678080) ^ (b13 << 6)) ^ (b12 << 12)) ^ (b8 << 18);
                    if (i18 > 1114111) {
                        if (i11 == i7) {
                            return i10;
                        }
                        return -1;
                    }
                    if (55296 <= i18 && i18 < 57344) {
                        if (i11 == i7) {
                            return i10;
                        }
                        return -1;
                    }
                    if (i18 < 65536) {
                        if (i11 == i7) {
                            return i10;
                        }
                        return -1;
                    }
                    i8 = i11 + 1;
                    if (i11 == i7) {
                        return i10;
                    }
                    if ((i18 != 10 && i18 != 13 && ((i18 >= 0 && i18 < 32) || (127 <= i18 && i18 < 160))) || i18 == 65533) {
                        return -1;
                    }
                    i10 += i18 < 65536 ? 1 : 2;
                    C6934q c6934q3 = C6934q.f24811a;
                    i9 += 4;
                }
                i11 = i8;
            }
        }
        return i10;
    }

    /* renamed from: c */
    public static final void m17327c(C3619g c3619g, C3616d buffer, int i7, int i8) {
        AbstractC5469l.m23028e(c3619g, "<this>");
        AbstractC5469l.m23028e(buffer, "buffer");
        buffer.m14632x0(c3619g.m14648j(), i7, i8);
    }

    /* renamed from: d */
    public static final char[] m17328d() {
        return f13840a;
    }
}
