package p256j$.time.chrono;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.Serializable;
import p256j$.com.android.tools.p257r8.AbstractC4815a;
import p256j$.time.temporal.ChronoUnit;
import p256j$.util.Objects;

/* renamed from: j$.time.chrono.h */
/* loaded from: classes3.dex */
final class C4842h implements Serializable {

    /* renamed from: e */
    public static final /* synthetic */ int f17925e = 0;
    private static final long serialVersionUID = 57387258289L;

    /* renamed from: a */
    private final InterfaceC4848n f17926a;

    /* renamed from: b */
    final int f17927b;

    /* renamed from: c */
    final int f17928c;

    /* renamed from: d */
    final int f17929d;

    static {
        AbstractC4815a.m20870h(new Object[]{ChronoUnit.YEARS, ChronoUnit.MONTHS, ChronoUnit.DAYS});
    }

    C4842h(InterfaceC4848n interfaceC4848n, int i7, int i8, int i9) {
        Objects.requireNonNull(interfaceC4848n, "chrono");
        this.f17926a = interfaceC4848n;
        this.f17927b = i7;
        this.f17928c = i8;
        this.f17929d = i9;
    }

    public final String toString() {
        InterfaceC4848n interfaceC4848n = this.f17926a;
        int i7 = this.f17929d;
        int i8 = this.f17928c;
        int i9 = this.f17927b;
        if (i9 == 0 && i8 == 0 && i7 == 0) {
            return interfaceC4848n.toString() + " P0D";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(interfaceC4848n.toString());
        sb.append(" P");
        if (i9 != 0) {
            sb.append(i9);
            sb.append('Y');
        }
        if (i8 != 0) {
            sb.append(i8);
            sb.append('M');
        }
        if (i7 != 0) {
            sb.append(i7);
            sb.append('D');
        }
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4842h)) {
            return false;
        }
        C4842h c4842h = (C4842h) obj;
        return this.f17927b == c4842h.f17927b && this.f17928c == c4842h.f17928c && this.f17929d == c4842h.f17929d && this.f17926a.equals(c4842h.f17926a);
    }

    public final int hashCode() {
        return this.f17926a.hashCode() ^ (Integer.rotateLeft(this.f17929d, 16) + (Integer.rotateLeft(this.f17928c, 8) + this.f17927b));
    }

    protected Object writeReplace() {
        return new C4829G((byte) 9, this);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    final void writeExternal(ObjectOutput objectOutput) {
        objectOutput.writeUTF(this.f17926a.mo20984k());
        objectOutput.writeInt(this.f17927b);
        objectOutput.writeInt(this.f17928c);
        objectOutput.writeInt(this.f17929d);
    }
}
