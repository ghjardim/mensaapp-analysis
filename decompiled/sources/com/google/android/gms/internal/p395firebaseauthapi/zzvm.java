package com.google.android.gms.internal.p395firebaseauthapi;

/* loaded from: classes.dex */
public enum zzvm implements zzakl {
    KEM_UNKNOWN(0),
    DHKEM_X25519_HKDF_SHA256(1),
    DHKEM_P256_HKDF_SHA256(2),
    DHKEM_P384_HKDF_SHA384(3),
    DHKEM_P521_HKDF_SHA512(4),
    UNRECOGNIZED(-1);

    private final int zzh;

    zzvm(int i7) {
        this.zzh = i7;
    }

    @Override // java.lang.Enum
    public final String toString() {
        StringBuilder sb = new StringBuilder("<");
        sb.append(zzvm.class.getName());
        sb.append('@');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this != UNRECOGNIZED) {
            sb.append(" number=");
            sb.append(zza());
        }
        sb.append(" name=");
        sb.append(name());
        sb.append('>');
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.p395firebaseauthapi.zzakl
    public final int zza() {
        if (this != UNRECOGNIZED) {
            return this.zzh;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public static zzvm zza(int i7) {
        if (i7 == 0) {
            return KEM_UNKNOWN;
        }
        if (i7 == 1) {
            return DHKEM_X25519_HKDF_SHA256;
        }
        if (i7 == 2) {
            return DHKEM_P256_HKDF_SHA256;
        }
        if (i7 == 3) {
            return DHKEM_P384_HKDF_SHA384;
        }
        if (i7 != 4) {
            return null;
        }
        return DHKEM_P521_HKDF_SHA512;
    }
}
