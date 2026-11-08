package p256j$.time;

import java.io.Externalizable;
import java.io.InvalidClassException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.Serializable;
import java.io.StreamCorruptedException;
import p272k4.C5410A;

/* renamed from: j$.time.u */
/* loaded from: classes3.dex */
final class C4920u implements Externalizable {
    private static final long serialVersionUID = -7683839454370182990L;

    /* renamed from: a */
    private byte f18087a;

    /* renamed from: b */
    private Object f18088b;

    public C4920u() {
    }

    C4920u(byte b7, Object obj) {
        this.f18087a = b7;
        this.f18088b = obj;
    }

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput objectOutput) {
        byte b7 = this.f18087a;
        Object obj = this.f18088b;
        objectOutput.writeByte(b7);
        switch (b7) {
            case 1:
                ((C4863f) obj).writeExternal(objectOutput);
                return;
            case 2:
                ((Instant) obj).m20926S(objectOutput);
                return;
            case 3:
                ((C4888i) obj).m21133h0(objectOutput);
                return;
            case 4:
                ((C4891l) obj).m21154c0(objectOutput);
                return;
            case 5:
                ((LocalDateTime) obj).m20946Z(objectOutput);
                return;
            case 6:
                ((C4819B) obj).m20898P(objectOutput);
                return;
            case 7:
                ((C4925z) obj).m21224P(objectOutput);
                return;
            case 8:
                ((ZoneOffset) obj).m20972W(objectOutput);
                return;
            case 9:
                ((C4898s) obj).writeExternal(objectOutput);
                return;
            case 10:
                ((OffsetDateTime) obj).writeExternal(objectOutput);
                return;
            case 11:
                ((C4922w) obj).m21214M(objectOutput);
                return;
            case C5410A.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
                ((C4924y) obj).m21222P(objectOutput);
                return;
            case 13:
                ((C4895p) obj).m21161J(objectOutput);
                return;
            case 14:
                ((C4899t) obj).writeExternal(objectOutput);
                return;
            default:
                throw new InvalidClassException("Unknown serialized type");
        }
    }

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput objectInput) {
        byte readByte = objectInput.readByte();
        this.f18087a = readByte;
        this.f18088b = m21209b(readByte, objectInput);
    }

    /* renamed from: a */
    static Serializable m21208a(ObjectInput objectInput) {
        return m21209b(objectInput.readByte(), objectInput);
    }

    /* renamed from: b */
    private static Serializable m21209b(byte b7, ObjectInput objectInput) {
        switch (b7) {
            case 1:
                C4863f c4863f = C4863f.f17967c;
                return C4863f.m21062s(objectInput.readLong(), objectInput.readInt());
            case 2:
                Instant instant = Instant.f17882c;
                return Instant.m20919N(objectInput.readLong(), objectInput.readInt());
            case 3:
                C4888i c4888i = C4888i.f18023d;
                return C4888i.m21113V(objectInput.readInt(), objectInput.readByte(), objectInput.readByte());
            case 4:
                return C4891l.m21140X(objectInput);
            case 5:
                LocalDateTime localDateTime = LocalDateTime.f17885c;
                C4888i c4888i2 = C4888i.f18023d;
                return LocalDateTime.m20931Q(C4888i.m21113V(objectInput.readInt(), objectInput.readByte(), objectInput.readByte()), C4891l.m21140X(objectInput));
            case 6:
                return C4819B.m20891M(objectInput);
            case 7:
                int i7 = C4925z.f18098d;
                return ZoneId.m20957K(objectInput.readUTF(), false);
            case 8:
                return ZoneOffset.m20969V(objectInput);
            case 9:
                return C4898s.m21163K(objectInput);
            case 10:
                return OffsetDateTime.m20953L(objectInput);
            case 11:
                int i8 = C4922w.f18091b;
                return C4922w.m21210I(objectInput.readInt());
            case C5410A.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
                int i9 = C4924y.f18095c;
                return C4924y.m21216J(objectInput.readInt(), objectInput.readByte());
            case 13:
                return C4895p.m21160I(objectInput);
            case 14:
                return C4899t.m21167a(objectInput);
            default:
                throw new StreamCorruptedException("Unknown serialized type");
        }
    }

    private Object readResolve() {
        return this.f18088b;
    }
}
