package p256j$.time;

import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.Serializable;
import org.apache.tika.metadata.TikaCoreProperties;
import org.apache.tika.utils.StringUtils;
import p256j$.time.temporal.AbstractC4911l;
import p256j$.time.temporal.C4918s;
import p256j$.time.temporal.C4919t;
import p256j$.time.temporal.EnumC4900a;
import p256j$.time.temporal.InterfaceC4912m;
import p256j$.time.temporal.InterfaceC4913n;
import p256j$.time.temporal.InterfaceC4915p;
import p256j$.time.temporal.InterfaceC4917r;
import p256j$.time.temporal.Temporal;
import p256j$.time.zone.C4931f;
import p256j$.util.Objects;
import p256j$.util.concurrent.ConcurrentHashMap;

/* loaded from: classes3.dex */
public final class ZoneOffset extends ZoneId implements InterfaceC4912m, InterfaceC4913n, Comparable<ZoneOffset>, Serializable {
    private static final long serialVersionUID = 2357656521762053153L;

    /* renamed from: b */
    private final int f17896b;

    /* renamed from: c */
    private final transient String f17897c;

    /* renamed from: d */
    private static final ConcurrentHashMap f17892d = new ConcurrentHashMap(16, 0.75f, 4);

    /* renamed from: e */
    private static final ConcurrentHashMap f17893e = new ConcurrentHashMap(16, 0.75f, 4);
    public static final ZoneOffset UTC = m20967T(0);

    /* renamed from: f */
    public static final ZoneOffset f17894f = m20967T(-64800);

    /* renamed from: g */
    public static final ZoneOffset f17895g = m20967T(64800);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x008f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a8  */
    /* renamed from: R */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static p256j$.time.ZoneOffset m20965R(java.lang.String r7) {
        /*
            java.lang.String r0 = "offsetId"
            p256j$.util.Objects.requireNonNull(r7, r0)
            j$.util.concurrent.ConcurrentHashMap r0 = p256j$.time.ZoneOffset.f17893e
            java.lang.Object r0 = r0.get(r7)
            j$.time.ZoneOffset r0 = (p256j$.time.ZoneOffset) r0
            if (r0 == 0) goto L10
            return r0
        L10:
            int r0 = r7.length()
            r1 = 2
            r2 = 1
            r3 = 0
            if (r0 == r1) goto L63
            r1 = 3
            if (r0 == r1) goto L7f
            r4 = 5
            if (r0 == r4) goto L5a
            r5 = 6
            r6 = 4
            if (r0 == r5) goto L50
            r5 = 7
            if (r0 == r5) goto L43
            r1 = 9
            if (r0 != r1) goto L37
            int r0 = m20968U(r7, r2, r3)
            int r1 = m20968U(r7, r6, r2)
            int r2 = m20968U(r7, r5, r2)
            goto L85
        L37:
            j$.time.c r0 = new j$.time.c
            java.lang.String r1 = "Invalid ID for ZoneOffset, invalid format: "
            java.lang.String r7 = r1.concat(r7)
            r0.<init>(r7)
            throw r0
        L43:
            int r0 = m20968U(r7, r2, r3)
            int r1 = m20968U(r7, r1, r3)
            int r2 = m20968U(r7, r4, r3)
            goto L85
        L50:
            int r0 = m20968U(r7, r2, r3)
            int r1 = m20968U(r7, r6, r2)
        L58:
            r2 = r3
            goto L85
        L5a:
            int r0 = m20968U(r7, r2, r3)
            int r1 = m20968U(r7, r1, r3)
            goto L58
        L63:
            char r0 = r7.charAt(r3)
            char r7 = r7.charAt(r2)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = "0"
            r1.append(r0)
            r1.append(r7)
            java.lang.String r7 = r1.toString()
        L7f:
            int r0 = m20968U(r7, r2, r3)
            r1 = r3
            r2 = r1
        L85:
            char r3 = r7.charAt(r3)
            r4 = 43
            r5 = 45
            if (r3 == r4) goto L9e
            if (r3 != r5) goto L92
            goto L9e
        L92:
            j$.time.c r0 = new j$.time.c
            java.lang.String r1 = "Invalid ID for ZoneOffset, plus/minus not found when expected: "
            java.lang.String r7 = r1.concat(r7)
            r0.<init>(r7)
            throw r0
        L9e:
            if (r3 != r5) goto La8
            int r7 = -r0
            int r0 = -r1
            int r1 = -r2
            j$.time.ZoneOffset r7 = m20966S(r7, r0, r1)
            return r7
        La8:
            j$.time.ZoneOffset r7 = m20966S(r0, r1, r2)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p256j$.time.ZoneOffset.m20965R(java.lang.String):j$.time.ZoneOffset");
    }

    /* renamed from: U */
    private static int m20968U(String str, int i7, boolean z6) {
        if (z6 && str.charAt(i7 - 1) != ':') {
            throw new C4822c("Invalid ID for ZoneOffset, colon not found when expected: " + ((Object) str));
        }
        char charAt = str.charAt(i7);
        char charAt2 = str.charAt(i7 + 1);
        if (charAt >= '0' && charAt <= '9' && charAt2 >= '0' && charAt2 <= '9') {
            return (charAt2 - '0') + ((charAt - '0') * 10);
        }
        throw new C4822c("Invalid ID for ZoneOffset, non numeric characters found: " + ((Object) str));
    }

    /* renamed from: P */
    public static ZoneOffset m20964P(Temporal temporal) {
        Objects.requireNonNull(temporal, "temporal");
        ZoneOffset zoneOffset = (ZoneOffset) temporal.mo20915w(AbstractC4911l.m21193h());
        if (zoneOffset != null) {
            return zoneOffset;
        }
        throw new C4822c("Unable to obtain ZoneOffset from TemporalAccessor: " + temporal + " of type " + temporal.getClass().getName());
    }

    /* renamed from: S */
    public static ZoneOffset m20966S(int i7, int i8, int i9) {
        if (i7 < -18 || i7 > 18) {
            throw new C4822c("Zone offset hours not in valid range: value " + i7 + " is not in the range -18 to 18");
        }
        if (i7 > 0) {
            if (i8 < 0 || i9 < 0) {
                throw new C4822c("Zone offset minutes and seconds must be positive because hours is positive");
            }
        } else if (i7 < 0) {
            if (i8 > 0 || i9 > 0) {
                throw new C4822c("Zone offset minutes and seconds must be negative because hours is negative");
            }
        } else if ((i8 > 0 && i9 < 0) || (i8 < 0 && i9 > 0)) {
            throw new C4822c("Zone offset minutes and seconds must have the same sign");
        }
        if (i8 < -59 || i8 > 59) {
            throw new C4822c("Zone offset minutes not in valid range: value " + i8 + " is not in the range -59 to 59");
        }
        if (i9 < -59 || i9 > 59) {
            throw new C4822c("Zone offset seconds not in valid range: value " + i9 + " is not in the range -59 to 59");
        }
        if (Math.abs(i7) == 18 && (i8 | i9) != 0) {
            throw new C4822c("Zone offset not in valid range: -18:00 to +18:00");
        }
        return m20967T((i8 * 60) + (i7 * 3600) + i9);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: T */
    public static ZoneOffset m20967T(int i7) {
        if (i7 < -64800 || i7 > 64800) {
            throw new C4822c("Zone offset not in valid range: -18:00 to +18:00");
        }
        if (i7 % 900 == 0) {
            Integer valueOf = Integer.valueOf(i7);
            ConcurrentHashMap concurrentHashMap = f17892d;
            ZoneOffset zoneOffset = (ZoneOffset) concurrentHashMap.get(valueOf);
            if (zoneOffset != null) {
                return zoneOffset;
            }
            concurrentHashMap.putIfAbsent(valueOf, new ZoneOffset(i7));
            ZoneOffset zoneOffset2 = (ZoneOffset) concurrentHashMap.get(valueOf);
            f17893e.putIfAbsent(zoneOffset2.f17897c, zoneOffset2);
            return zoneOffset2;
        }
        return new ZoneOffset(i7);
    }

    private ZoneOffset(int i7) {
        String sb;
        this.f17896b = i7;
        if (i7 == 0) {
            sb = "Z";
        } else {
            int abs = Math.abs(i7);
            StringBuilder sb2 = new StringBuilder();
            int i8 = abs / 3600;
            int i9 = (abs / 60) % 60;
            sb2.append(i7 < 0 ? "-" : "+");
            sb2.append(i8 < 10 ? "0" : StringUtils.EMPTY);
            sb2.append(i8);
            String str = TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER;
            sb2.append(i9 < 10 ? ":0" : TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER);
            sb2.append(i9);
            int i10 = abs % 60;
            if (i10 != 0) {
                sb2.append(i10 < 10 ? ":0" : str);
                sb2.append(i10);
            }
            sb = sb2.toString();
        }
        this.f17897c = sb;
    }

    /* renamed from: Q */
    public final int m20971Q() {
        return this.f17896b;
    }

    @Override // p256j$.time.ZoneId
    /* renamed from: k */
    public final String mo20963k() {
        return this.f17897c;
    }

    @Override // p256j$.time.ZoneId
    /* renamed from: J */
    public final C4931f mo20961J() {
        return C4931f.m21243h(this);
    }

    @Override // p256j$.time.temporal.InterfaceC4912m
    /* renamed from: g */
    public final boolean mo20905g(InterfaceC4915p interfaceC4915p) {
        return interfaceC4915p instanceof EnumC4900a ? interfaceC4915p == EnumC4900a.OFFSET_SECONDS : interfaceC4915p != null && interfaceC4915p.mo21174n(this);
    }

    @Override // p256j$.time.temporal.InterfaceC4912m
    /* renamed from: o */
    public final C4919t mo20912o(InterfaceC4915p interfaceC4915p) {
        return AbstractC4911l.m21189d(this, interfaceC4915p);
    }

    @Override // p256j$.time.temporal.InterfaceC4912m
    /* renamed from: m */
    public final int mo20910m(InterfaceC4915p interfaceC4915p) {
        if (interfaceC4915p == EnumC4900a.OFFSET_SECONDS) {
            return this.f17896b;
        }
        if (interfaceC4915p instanceof EnumC4900a) {
            throw new C4918s(AbstractC4861d.m21057a("Unsupported field: ", interfaceC4915p));
        }
        return AbstractC4911l.m21189d(this, interfaceC4915p).m21200a(mo20914s(interfaceC4915p), interfaceC4915p);
    }

    @Override // p256j$.time.temporal.InterfaceC4912m
    /* renamed from: s */
    public final long mo20914s(InterfaceC4915p interfaceC4915p) {
        if (interfaceC4915p == EnumC4900a.OFFSET_SECONDS) {
            return this.f17896b;
        }
        if (interfaceC4915p instanceof EnumC4900a) {
            throw new C4918s(AbstractC4861d.m21057a("Unsupported field: ", interfaceC4915p));
        }
        return interfaceC4915p.mo21173m(this);
    }

    @Override // p256j$.time.temporal.InterfaceC4912m
    /* renamed from: w */
    public final Object mo20915w(InterfaceC4917r interfaceC4917r) {
        return (interfaceC4917r == AbstractC4911l.m21193h() || interfaceC4917r == AbstractC4911l.m21195j()) ? this : AbstractC4911l.m21188c(this, interfaceC4917r);
    }

    @Override // p256j$.time.temporal.InterfaceC4913n
    /* renamed from: z */
    public final Temporal mo20927z(Temporal temporal) {
        return temporal.mo20902d(this.f17896b, EnumC4900a.OFFSET_SECONDS);
    }

    @Override // java.lang.Comparable
    /* renamed from: O, reason: merged with bridge method [inline-methods] */
    public final int compareTo(ZoneOffset zoneOffset) {
        return zoneOffset.f17896b - this.f17896b;
    }

    @Override // p256j$.time.ZoneId
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ZoneOffset) {
            return this.f17896b == ((ZoneOffset) obj).f17896b;
        }
        return false;
    }

    @Override // p256j$.time.ZoneId
    public final int hashCode() {
        return this.f17896b;
    }

    @Override // p256j$.time.ZoneId
    public final String toString() {
        return this.f17897c;
    }

    private Object writeReplace() {
        return new C4920u((byte) 8, this);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    @Override // p256j$.time.ZoneId
    /* renamed from: N */
    final void mo20962N(ObjectOutput objectOutput) {
        objectOutput.writeByte(8);
        m20972W(objectOutput);
    }

    /* renamed from: W */
    final void m20972W(DataOutput dataOutput) {
        int i7 = this.f17896b;
        int i8 = i7 % 900 == 0 ? i7 / 900 : 127;
        dataOutput.writeByte(i8);
        if (i8 == 127) {
            dataOutput.writeInt(i7);
        }
    }

    /* renamed from: V */
    static ZoneOffset m20969V(ObjectInput objectInput) {
        byte readByte = objectInput.readByte();
        return readByte == Byte.MAX_VALUE ? m20967T(objectInput.readInt()) : m20967T(readByte * 900);
    }
}
