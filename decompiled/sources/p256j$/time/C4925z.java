package p256j$.time;

import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import p256j$.time.zone.AbstractC4935j;
import p256j$.time.zone.C4931f;
import p256j$.time.zone.C4932g;
import p256j$.util.Objects;

/* renamed from: j$.time.z */
/* loaded from: classes3.dex */
final class C4925z extends ZoneId {

    /* renamed from: d */
    public static final /* synthetic */ int f18098d = 0;
    private static final long serialVersionUID = 8386373296231747096L;

    /* renamed from: b */
    private final String f18099b;

    /* renamed from: c */
    private final transient C4931f f18100c;

    /* renamed from: O */
    static C4925z m21223O(String str, boolean z6) {
        C4931f c4931f;
        Objects.requireNonNull(str, "zoneId");
        int length = str.length();
        if (length >= 2) {
            for (int i7 = 0; i7 < length; i7++) {
                char charAt = str.charAt(i7);
                if ((charAt < 'a' || charAt > 'z') && ((charAt < 'A' || charAt > 'Z') && ((charAt != '/' || i7 == 0) && ((charAt < '0' || charAt > '9' || i7 == 0) && ((charAt != '~' || i7 == 0) && ((charAt != '.' || i7 == 0) && ((charAt != '_' || i7 == 0) && ((charAt != '+' || i7 == 0) && (charAt != '-' || i7 == 0))))))))) {
                    throw new C4822c("Invalid ID for region-based ZoneId, invalid format: ".concat(str));
                }
            }
            try {
                c4931f = AbstractC4935j.m21252a(str, true);
            } catch (C4932g e7) {
                if (z6) {
                    throw e7;
                }
                c4931f = null;
            }
            return new C4925z(str, c4931f);
        }
        throw new C4822c("Invalid ID for region-based ZoneId, invalid format: ".concat(str));
    }

    C4925z(String str, C4931f c4931f) {
        this.f18099b = str;
        this.f18100c = c4931f;
    }

    @Override // p256j$.time.ZoneId
    /* renamed from: k */
    public final String mo20963k() {
        return this.f18099b;
    }

    @Override // p256j$.time.ZoneId
    /* renamed from: J */
    public final C4931f mo20961J() {
        C4931f c4931f = this.f18100c;
        return c4931f != null ? c4931f : AbstractC4935j.m21252a(this.f18099b, false);
    }

    private Object writeReplace() {
        return new C4920u((byte) 7, this);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    @Override // p256j$.time.ZoneId
    /* renamed from: N */
    final void mo20962N(ObjectOutput objectOutput) {
        objectOutput.writeByte(7);
        objectOutput.writeUTF(this.f18099b);
    }

    /* renamed from: P */
    final void m21224P(DataOutput dataOutput) {
        dataOutput.writeUTF(this.f18099b);
    }
}
