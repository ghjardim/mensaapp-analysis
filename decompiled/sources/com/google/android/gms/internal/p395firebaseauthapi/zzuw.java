package com.google.android.gms.internal.p395firebaseauthapi;

/* loaded from: classes.dex */
public enum zzuw implements zzakl {
    UNKNOWN_CURVE(0),
    NIST_P256(2),
    NIST_P384(3),
    NIST_P521(4),
    CURVE25519(5),
    UNRECOGNIZED(-1);

    private final int zzh;

    zzuw(int i7) {
        this.zzh = i7;
    }

    @Override // java.lang.Enum
    public final String toString() {
        StringBuilder sb = new StringBuilder("<");
        sb.append(zzuw.class.getName());
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

    public static zzuw zza(int i7) {
        if (i7 == 0) {
            return UNKNOWN_CURVE;
        }
        if (i7 == 2) {
            return NIST_P256;
        }
        if (i7 == 3) {
            return NIST_P384;
        }
        if (i7 == 4) {
            return NIST_P521;
        }
        if (i7 != 5) {
            return null;
        }
        return CURVE25519;
    }
}
