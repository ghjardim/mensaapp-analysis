package p256j$.time.chrono;

import java.io.Externalizable;
import java.io.InvalidClassException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.StreamCorruptedException;
import p256j$.time.C4888i;
import p256j$.time.C4891l;
import p256j$.time.ZoneId;
import p256j$.time.ZoneOffset;
import p256j$.time.temporal.AbstractC4911l;
import p256j$.time.temporal.EnumC4900a;

/* renamed from: j$.time.chrono.G */
/* loaded from: classes3.dex */
final class C4829G implements Externalizable {
    private static final long serialVersionUID = -6103370247208168577L;

    /* renamed from: a */
    private byte f17910a;

    /* renamed from: b */
    private Object f17911b;

    public C4829G() {
    }

    C4829G(byte b7, Object obj) {
        this.f17910a = b7;
        this.f17911b = obj;
    }

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput objectOutput) {
        byte b7 = this.f17910a;
        Object obj = this.f17911b;
        objectOutput.writeByte(b7);
        switch (b7) {
            case 1:
                objectOutput.writeUTF(((AbstractC4835a) obj).mo20984k());
                return;
            case 2:
                ((C4841g) obj).writeExternal(objectOutput);
                return;
            case 3:
                ((C4847m) obj).writeExternal(objectOutput);
                return;
            case 4:
                C4860z c4860z = (C4860z) obj;
                c4860z.getClass();
                objectOutput.writeInt(AbstractC4911l.m21186a(c4860z, EnumC4900a.YEAR));
                objectOutput.writeByte(AbstractC4911l.m21186a(c4860z, EnumC4900a.MONTH_OF_YEAR));
                objectOutput.writeByte(AbstractC4911l.m21186a(c4860z, EnumC4900a.DAY_OF_MONTH));
                return;
            case 5:
                ((C4823A) obj).m20978G(objectOutput);
                return;
            case 6:
                ((C4853s) obj).writeExternal(objectOutput);
                return;
            case 7:
                C4827E c4827e = (C4827E) obj;
                c4827e.getClass();
                objectOutput.writeInt(AbstractC4911l.m21186a(c4827e, EnumC4900a.YEAR));
                objectOutput.writeByte(AbstractC4911l.m21186a(c4827e, EnumC4900a.MONTH_OF_YEAR));
                objectOutput.writeByte(AbstractC4911l.m21186a(c4827e, EnumC4900a.DAY_OF_MONTH));
                return;
            case 8:
                C4833K c4833k = (C4833K) obj;
                c4833k.getClass();
                objectOutput.writeInt(AbstractC4911l.m21186a(c4833k, EnumC4900a.YEAR));
                objectOutput.writeByte(AbstractC4911l.m21186a(c4833k, EnumC4900a.MONTH_OF_YEAR));
                objectOutput.writeByte(AbstractC4911l.m21186a(c4833k, EnumC4900a.DAY_OF_MONTH));
                return;
            case 9:
                ((C4842h) obj).writeExternal(objectOutput);
                return;
            default:
                throw new InvalidClassException("Unknown serialized type");
        }
    }

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput objectInput) {
        Object m21002l;
        byte readByte = objectInput.readByte();
        this.f17910a = readByte;
        switch (readByte) {
            case 1:
                int i7 = AbstractC4835a.f17920c;
                m21002l = AbstractC4835a.m21002l(objectInput.readUTF());
                break;
            case 2:
                m21002l = ((InterfaceC4836b) objectInput.readObject()).mo20998u((C4891l) objectInput.readObject());
                break;
            case 3:
                m21002l = ((InterfaceC4839e) objectInput.readObject()).mo20950p((ZoneOffset) objectInput.readObject()).mo20908j((ZoneId) objectInput.readObject());
                break;
            case 4:
                C4888i c4888i = C4860z.f17961d;
                int readInt = objectInput.readInt();
                byte readByte2 = objectInput.readByte();
                byte readByte3 = objectInput.readByte();
                C4858x.f17959d.getClass();
                m21002l = new C4860z(C4888i.m21113V(readInt, readByte2, readByte3));
                break;
            case 5:
                C4823A c4823a = C4823A.f17900d;
                m21002l = C4823A.m20977y(objectInput.readByte());
                break;
            case 6:
                C4851q c4851q = (C4851q) objectInput.readObject();
                int readInt2 = objectInput.readInt();
                byte readByte4 = objectInput.readByte();
                byte readByte5 = objectInput.readByte();
                c4851q.getClass();
                m21002l = C4853s.m21047Q(c4851q, readInt2, readByte4, readByte5);
                break;
            case 7:
                int readInt3 = objectInput.readInt();
                byte readByte6 = objectInput.readByte();
                byte readByte7 = objectInput.readByte();
                C4825C.f17906d.getClass();
                m21002l = new C4827E(C4888i.m21113V(readInt3 + 1911, readByte6, readByte7));
                break;
            case 8:
                int readInt4 = objectInput.readInt();
                byte readByte8 = objectInput.readByte();
                byte readByte9 = objectInput.readByte();
                C4831I.f17913d.getClass();
                m21002l = new C4833K(C4888i.m21113V(readInt4 - 543, readByte8, readByte9));
                break;
            case 9:
                int i8 = C4842h.f17925e;
                m21002l = new C4842h(AbstractC4835a.m21002l(objectInput.readUTF()), objectInput.readInt(), objectInput.readInt(), objectInput.readInt());
                break;
            default:
                throw new StreamCorruptedException("Unknown serialized type");
        }
        this.f17911b = m21002l;
    }

    private Object readResolve() {
        return this.f17911b;
    }
}
