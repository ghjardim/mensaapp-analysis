package com.google.android.gms.internal.p395firebaseauthapi;

/* loaded from: classes.dex */
final class zzanf extends zzanc {
    /* JADX WARN: Code restructure failed: missing block: B:12:0x001d, code lost:
    
        return r10 + r0;
     */
    @Override // com.google.android.gms.internal.p395firebaseauthapi.zzanc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int zza(java.lang.String r8, byte[] r9, int r10, int r11) {
        /*
            Method dump skipped, instructions count: 251
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p395firebaseauthapi.zzanf.zza(java.lang.String, byte[], int, int):int");
    }

    @Override // com.google.android.gms.internal.p395firebaseauthapi.zzanc
    public final int zza(int i7, byte[] bArr, int i8, int i9) {
        while (i8 < i9 && bArr[i8] >= 0) {
            i8++;
        }
        if (i8 >= i9) {
            return 0;
        }
        while (i8 < i9) {
            int i10 = i8 + 1;
            byte b7 = bArr[i8];
            if (b7 < 0) {
                if (b7 < -32) {
                    if (i10 >= i9) {
                        return b7;
                    }
                    if (b7 >= -62) {
                        i8 += 2;
                        if (bArr[i10] > -65) {
                        }
                    }
                    return -1;
                }
                if (b7 >= -16) {
                    if (i10 >= i9 - 2) {
                        return zzanb.zza(bArr, i10, i9);
                    }
                    int i11 = i8 + 2;
                    byte b8 = bArr[i10];
                    if (b8 <= -65 && (((b7 << 28) + (b8 + 112)) >> 30) == 0) {
                        int i12 = i8 + 3;
                        if (bArr[i11] <= -65) {
                            i8 += 4;
                            if (bArr[i12] > -65) {
                            }
                        }
                    }
                    return -1;
                }
                if (i10 >= i9 - 1) {
                    return zzanb.zza(bArr, i10, i9);
                }
                int i13 = i8 + 2;
                byte b9 = bArr[i10];
                if (b9 <= -65 && ((b7 != -32 || b9 >= -96) && (b7 != -19 || b9 < -96))) {
                    i8 += 3;
                    if (bArr[i13] > -65) {
                    }
                }
                return -1;
            }
            i8 = i10;
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.p395firebaseauthapi.zzanc
    public final String zza(byte[] bArr, int i7, int i8) {
        if ((i7 | i8 | ((bArr.length - i7) - i8)) >= 0) {
            int i9 = i7 + i8;
            char[] cArr = new char[i8];
            int i10 = 0;
            while (i7 < i9) {
                byte b7 = bArr[i7];
                if (b7 < 0) {
                    break;
                }
                i7++;
                zzand.zza(b7, cArr, i10);
                i10++;
            }
            int i11 = i10;
            while (i7 < i9) {
                int i12 = i7 + 1;
                byte b8 = bArr[i7];
                if (b8 >= 0) {
                    int i13 = i11 + 1;
                    zzand.zza(b8, cArr, i11);
                    while (i12 < i9) {
                        byte b9 = bArr[i12];
                        if (b9 < 0) {
                            break;
                        }
                        i12++;
                        zzand.zza(b9, cArr, i13);
                        i13++;
                    }
                    i11 = i13;
                    i7 = i12;
                } else if (b8 < -32) {
                    if (i12 < i9) {
                        i7 += 2;
                        zzand.zza(b8, bArr[i12], cArr, i11);
                        i11++;
                    } else {
                        throw zzakm.zzd();
                    }
                } else if (b8 < -16) {
                    if (i12 < i9 - 1) {
                        int i14 = i7 + 2;
                        i7 += 3;
                        zzand.zza(b8, bArr[i12], bArr[i14], cArr, i11);
                        i11++;
                    } else {
                        throw zzakm.zzd();
                    }
                } else if (i12 < i9 - 2) {
                    byte b10 = bArr[i12];
                    int i15 = i7 + 3;
                    byte b11 = bArr[i7 + 2];
                    i7 += 4;
                    zzand.zza(b8, b10, b11, bArr[i15], cArr, i11);
                    i11 += 2;
                } else {
                    throw zzakm.zzd();
                }
            }
            return new String(cArr, 0, i11);
        }
        throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i7), Integer.valueOf(i8)));
    }
}
