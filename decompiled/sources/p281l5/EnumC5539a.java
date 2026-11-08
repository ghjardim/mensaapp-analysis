package p281l5;

/* renamed from: l5.a */
/* loaded from: classes2.dex */
public enum EnumC5539a {
    NO_ERROR(0, -1, 0),
    PROTOCOL_ERROR(1, 1, 1),
    INVALID_STREAM(1, 2, -1),
    UNSUPPORTED_VERSION(1, 4, -1),
    STREAM_IN_USE(1, 8, -1),
    STREAM_ALREADY_CLOSED(1, 9, -1),
    INTERNAL_ERROR(2, 6, 2),
    FLOW_CONTROL_ERROR(3, 7, -1),
    STREAM_CLOSED(5, -1, -1),
    FRAME_TOO_LARGE(6, 11, -1),
    REFUSED_STREAM(7, 3, -1),
    CANCEL(8, 5, -1),
    COMPRESSION_ERROR(9, -1, -1),
    CONNECT_ERROR(10, -1, -1),
    ENHANCE_YOUR_CALM(11, -1, -1),
    INADEQUATE_SECURITY(12, -1, -1),
    HTTP_1_1_REQUIRED(13, -1, -1),
    INVALID_CREDENTIALS(-1, 10, -1);


    /* renamed from: a */
    public final int f19966a;

    /* renamed from: b */
    public final int f19967b;

    /* renamed from: c */
    public final int f19968c;

    EnumC5539a(int i7, int i8, int i9) {
        this.f19966a = i7;
        this.f19967b = i8;
        this.f19968c = i9;
    }

    /* renamed from: b */
    public static EnumC5539a m23184b(int i7) {
        for (EnumC5539a enumC5539a : values()) {
            if (enumC5539a.f19966a == i7) {
                return enumC5539a;
            }
        }
        return null;
    }
}
