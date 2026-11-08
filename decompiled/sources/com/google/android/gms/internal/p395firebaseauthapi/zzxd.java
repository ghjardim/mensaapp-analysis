package com.google.android.gms.internal.p395firebaseauthapi;

/* loaded from: classes.dex */
public enum zzxd implements zzakl {
    UNKNOWN_PREFIX(0),
    TINK(1),
    LEGACY(2),
    RAW(3),
    CRUNCHY(4),
    UNRECOGNIZED(-1);

    private final int zzh;

    zzxd(int i7) {
        this.zzh = i7;
    }

    @Override // java.lang.Enum
    public final String toString() {
        StringBuilder sb = new StringBuilder("<");
        sb.append(zzxd.class.getName());
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

    public static zzxd zza(int i7) {
        if (i7 == 0) {
            return UNKNOWN_PREFIX;
        }
        if (i7 == 1) {
            return TINK;
        }
        if (i7 == 2) {
            return LEGACY;
        }
        if (i7 == 3) {
            return RAW;
        }
        if (i7 != 4) {
            return null;
        }
        return CRUNCHY;
    }
}
