package p256j$.time.format;

import org.apache.tika.pipes.PipesConfigBase;
import p256j$.time.C4822c;
import p256j$.time.temporal.InterfaceC4915p;

/* renamed from: j$.time.format.i */
/* loaded from: classes3.dex */
class C4872i implements InterfaceC4869f {

    /* renamed from: f */
    static final long[] f17983f = {0, 10, 100, 1000, 10000, PipesConfigBase.DEFAULT_MAX_FOR_EMIT_BATCH, 1000000, 10000000, 100000000, 1000000000, 10000000000L};

    /* renamed from: a */
    final Enum f17984a;

    /* renamed from: b */
    final int f17985b;

    /* renamed from: c */
    final int f17986c;

    /* renamed from: d */
    private final EnumC4884u f17987d;

    /* renamed from: e */
    final int f17988e;

    /* JADX WARN: Multi-variable type inference failed */
    C4872i(InterfaceC4915p interfaceC4915p, int i7, int i8, EnumC4884u enumC4884u) {
        this.f17984a = (Enum) interfaceC4915p;
        this.f17985b = i7;
        this.f17986c = i8;
        this.f17987d = enumC4884u;
        this.f17988e = 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected C4872i(InterfaceC4915p interfaceC4915p, int i7, int i8, EnumC4884u enumC4884u, int i9) {
        this.f17984a = (Enum) interfaceC4915p;
        this.f17985b = i7;
        this.f17986c = i8;
        this.f17987d = enumC4884u;
        this.f17988e = i9;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [j$.time.temporal.p, java.lang.Enum] */
    /* renamed from: b */
    C4872i mo21074b() {
        return this.f17988e == -1 ? this : new C4872i(this.f17984a, this.f17985b, this.f17986c, this.f17987d, -1);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [j$.time.temporal.p, java.lang.Enum] */
    /* renamed from: c */
    C4872i mo21075c(int i7) {
        int i8 = this.f17988e + i7;
        return new C4872i(this.f17984a, this.f17985b, this.f17986c, this.f17987d, i8);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [j$.time.temporal.p, java.lang.Enum, java.lang.Object] */
    @Override // p256j$.time.format.InterfaceC4869f
    /* renamed from: l */
    public boolean mo21072l(C4879p c4879p, StringBuilder sb) {
        ?? r02 = this.f17984a;
        Long m21104e = c4879p.m21104e(r02);
        if (m21104e == null) {
            return false;
        }
        long longValue = m21104e.longValue();
        C4882s m21101b = c4879p.m21101b();
        String l7 = longValue == Long.MIN_VALUE ? "9223372036854775808" : Long.toString(Math.abs(longValue));
        int length = l7.length();
        int i7 = this.f17986c;
        if (length > i7) {
            throw new C4822c("Field " + ((Object) r02) + " cannot be printed as the value " + longValue + " exceeds the maximum print width of " + i7);
        }
        m21101b.getClass();
        int i8 = this.f17985b;
        EnumC4884u enumC4884u = this.f17987d;
        if (longValue >= 0) {
            int i9 = AbstractC4866c.f17978a[enumC4884u.ordinal()];
            if (i9 != 1) {
                if (i9 == 2) {
                    sb.append('+');
                }
            } else if (i8 < 19 && longValue >= f17983f[i8]) {
                sb.append('+');
            }
        } else {
            int i10 = AbstractC4866c.f17978a[enumC4884u.ordinal()];
            if (i10 == 1 || i10 == 2 || i10 == 3) {
                sb.append('-');
            } else if (i10 == 4) {
                throw new C4822c("Field " + ((Object) r02) + " cannot be printed as the value " + longValue + " cannot be negative according to the SignStyle");
            }
        }
        for (int i11 = 0; i11 < i8 - l7.length(); i11++) {
            sb.append('0');
        }
        sb.append(l7);
        return true;
    }

    public String toString() {
        Enum r02 = this.f17984a;
        int i7 = this.f17986c;
        EnumC4884u enumC4884u = this.f17987d;
        int i8 = this.f17985b;
        if (i8 == 1 && i7 == 19 && enumC4884u == EnumC4884u.NORMAL) {
            return "Value(" + r02 + ")";
        }
        if (i8 == i7 && enumC4884u == EnumC4884u.NOT_NEGATIVE) {
            return "Value(" + r02 + "," + i8 + ")";
        }
        return "Value(" + r02 + "," + i8 + "," + i7 + "," + enumC4884u + ")";
    }
}
