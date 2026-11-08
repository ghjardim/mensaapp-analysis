package com.google.android.gms.fido.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.fido.common.Transport;

/* loaded from: classes.dex */
public enum Transport implements ReflectedParcelable {
    BLUETOOTH_CLASSIC("bt"),
    BLUETOOTH_LOW_ENERGY("ble"),
    NFC("nfc"),
    USB("usb"),
    INTERNAL("internal"),
    HYBRID("cable");

    public static final Parcelable.Creator<Transport> CREATOR = new Parcelable.Creator() { // from class: com.google.android.gms.fido.common.a
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
            try {
                return Transport.m15178b(parcel.readString());
            } catch (Transport.C3831a e7) {
                throw new RuntimeException(e7);
            }
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i7) {
            return new Transport[i7];
        }
    };

    /* renamed from: a */
    public final String f12613a;

    /* renamed from: com.google.android.gms.fido.common.Transport$a */
    public static class C3831a extends Exception {
        public C3831a(String str) {
            super(str);
        }
    }

    Transport(String str) {
        this.f12613a = str;
    }

    /* renamed from: b */
    public static Transport m15178b(String str) {
        for (Transport transport : values()) {
            if (str.equals(transport.f12613a)) {
                return transport;
            }
        }
        if (str.equals("hybrid")) {
            return HYBRID;
        }
        throw new C3831a(String.format("Transport %s not supported", str));
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f12613a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        parcel.writeString(this.f12613a);
    }
}
