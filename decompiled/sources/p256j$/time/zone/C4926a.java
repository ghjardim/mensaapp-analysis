package p256j$.time.zone;

import java.io.Externalizable;
import java.io.InvalidClassException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.Serializable;
import java.io.StreamCorruptedException;
import java.util.TimeZone;
import org.apache.tika.fork.ForkServer;
import p256j$.time.ZoneOffset;

/* renamed from: j$.time.zone.a */
/* loaded from: classes3.dex */
final class C4926a implements Externalizable {
    private static final long serialVersionUID = -8885321777449118786L;

    /* renamed from: a */
    private byte f18101a;

    /* renamed from: b */
    private Serializable f18102b;

    public C4926a() {
    }

    C4926a(byte b7, Serializable serializable) {
        this.f18101a = b7;
        this.f18102b = serializable;
    }

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput objectOutput) {
        byte b7 = this.f18101a;
        Serializable serializable = this.f18102b;
        objectOutput.writeByte(b7);
        if (b7 == 1) {
            ((C4931f) serializable).writeExternal(objectOutput);
            return;
        }
        if (b7 == 2) {
            ((C4927b) serializable).writeExternal(objectOutput);
        } else if (b7 == 3) {
            ((C4930e) serializable).writeExternal(objectOutput);
        } else {
            if (b7 == 100) {
                ((C4931f) serializable).m21249k(objectOutput);
                return;
            }
            throw new InvalidClassException("Unknown serialized type");
        }
    }

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput objectInput) {
        Serializable m21245j;
        byte readByte = objectInput.readByte();
        this.f18101a = readByte;
        if (readByte == 1) {
            m21245j = C4931f.m21245j(objectInput);
        } else if (readByte == 2) {
            long m21225a = m21225a(objectInput);
            ZoneOffset m21226b = m21226b(objectInput);
            ZoneOffset m21226b2 = m21226b(objectInput);
            if (m21226b.equals(m21226b2)) {
                throw new IllegalArgumentException("Offsets must not be equal");
            }
            m21245j = new C4927b(m21225a, m21226b, m21226b2);
        } else if (readByte == 3) {
            m21245j = C4930e.m21237b(objectInput);
        } else {
            if (readByte != 100) {
                throw new StreamCorruptedException("Unknown serialized type");
            }
            m21245j = new C4931f(TimeZone.getTimeZone(objectInput.readUTF()));
        }
        this.f18102b = m21245j;
    }

    private Object readResolve() {
        return this.f18102b;
    }

    /* renamed from: d */
    static void m21228d(ZoneOffset zoneOffset, ObjectOutput objectOutput) {
        int m20971Q = zoneOffset.m20971Q();
        int i7 = m20971Q % 900 == 0 ? m20971Q / 900 : 127;
        objectOutput.writeByte(i7);
        if (i7 == 127) {
            objectOutput.writeInt(m20971Q);
        }
    }

    /* renamed from: b */
    static ZoneOffset m21226b(ObjectInput objectInput) {
        byte readByte = objectInput.readByte();
        return readByte == Byte.MAX_VALUE ? ZoneOffset.m20967T(objectInput.readInt()) : ZoneOffset.m20967T(readByte * 900);
    }

    /* renamed from: c */
    static void m21227c(long j7, ObjectOutput objectOutput) {
        if (j7 >= -4575744000L && j7 < 10413792000L && j7 % 900 == 0) {
            int i7 = (int) ((j7 + 4575744000L) / 900);
            objectOutput.writeByte((i7 >>> 16) & 255);
            objectOutput.writeByte((i7 >>> 8) & 255);
            objectOutput.writeByte(i7 & 255);
            return;
        }
        objectOutput.writeByte(255);
        objectOutput.writeLong(j7);
    }

    /* renamed from: a */
    static long m21225a(ObjectInput objectInput) {
        if ((objectInput.readByte() & ForkServer.ERROR) == 255) {
            return objectInput.readLong();
        }
        return ((((r0 << 16) + ((objectInput.readByte() & ForkServer.ERROR) << 8)) + (objectInput.readByte() & ForkServer.ERROR)) * 900) - 4575744000L;
    }
}
