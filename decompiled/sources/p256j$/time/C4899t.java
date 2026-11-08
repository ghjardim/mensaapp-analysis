package p256j$.time;

import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.Serializable;
import java.util.regex.Pattern;
import p256j$.com.android.tools.p257r8.AbstractC4815a;
import p256j$.time.temporal.ChronoUnit;

/* renamed from: j$.time.t */
/* loaded from: classes3.dex */
public final class C4899t implements Serializable {

    /* renamed from: d */
    public static final C4899t f18049d = new C4899t(0, 0, 0);
    private static final long serialVersionUID = -3587258372562876L;

    /* renamed from: a */
    private final int f18050a;

    /* renamed from: b */
    private final int f18051b;

    /* renamed from: c */
    private final int f18052c;

    static {
        Pattern.compile("([-+]?)P(?:([-+]?[0-9]+)Y)?(?:([-+]?[0-9]+)M)?(?:([-+]?[0-9]+)W)?(?:([-+]?[0-9]+)D)?", 2);
        AbstractC4815a.m20870h(new Object[]{ChronoUnit.YEARS, ChronoUnit.MONTHS, ChronoUnit.DAYS});
    }

    private C4899t(int i7, int i8, int i9) {
        this.f18050a = i7;
        this.f18051b = i8;
        this.f18052c = i9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4899t)) {
            return false;
        }
        C4899t c4899t = (C4899t) obj;
        return this.f18050a == c4899t.f18050a && this.f18051b == c4899t.f18051b && this.f18052c == c4899t.f18052c;
    }

    public final int hashCode() {
        return Integer.rotateLeft(this.f18052c, 16) + Integer.rotateLeft(this.f18051b, 8) + this.f18050a;
    }

    public final String toString() {
        if (this == f18049d) {
            return "P0D";
        }
        StringBuilder sb = new StringBuilder("P");
        int i7 = this.f18050a;
        if (i7 != 0) {
            sb.append(i7);
            sb.append('Y');
        }
        int i8 = this.f18051b;
        if (i8 != 0) {
            sb.append(i8);
            sb.append('M');
        }
        int i9 = this.f18052c;
        if (i9 != 0) {
            sb.append(i9);
            sb.append('D');
        }
        return sb.toString();
    }

    private Object writeReplace() {
        return new C4920u((byte) 14, this);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    final void writeExternal(ObjectOutput objectOutput) {
        objectOutput.writeInt(this.f18050a);
        objectOutput.writeInt(this.f18051b);
        objectOutput.writeInt(this.f18052c);
    }

    /* renamed from: a */
    static C4899t m21167a(ObjectInput objectInput) {
        int readInt = objectInput.readInt();
        int readInt2 = objectInput.readInt();
        int readInt3 = objectInput.readInt();
        if ((readInt | readInt2 | readInt3) == 0) {
            return f18049d;
        }
        return new C4899t(readInt, readInt2, readInt3);
    }
}
