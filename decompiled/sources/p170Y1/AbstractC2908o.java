package p170Y1;

import android.util.Base64;
import org.apache.tika.utils.StringUtils;
import p149V1.EnumC2612e;
import p170Y1.C2897d;

/* renamed from: Y1.o */
/* loaded from: classes.dex */
public abstract class AbstractC2908o {

    /* renamed from: Y1.o$a */
    public static abstract class a {
        /* renamed from: a */
        public abstract AbstractC2908o mo10458a();

        /* renamed from: b */
        public abstract a mo10459b(String str);

        /* renamed from: c */
        public abstract a mo10460c(byte[] bArr);

        /* renamed from: d */
        public abstract a mo10461d(EnumC2612e enumC2612e);
    }

    /* renamed from: a */
    public static a m10487a() {
        return new C2897d.b().mo10461d(EnumC2612e.DEFAULT);
    }

    /* renamed from: b */
    public abstract String mo10455b();

    /* renamed from: c */
    public abstract byte[] mo10456c();

    /* renamed from: d */
    public abstract EnumC2612e mo10457d();

    /* renamed from: e */
    public boolean m10488e() {
        return mo10456c() != null;
    }

    /* renamed from: f */
    public AbstractC2908o m10489f(EnumC2612e enumC2612e) {
        return m10487a().mo10459b(mo10455b()).mo10461d(enumC2612e).mo10460c(mo10456c()).mo10458a();
    }

    public final String toString() {
        return String.format("TransportContext(%s, %s, %s)", mo10455b(), mo10457d(), mo10456c() == null ? StringUtils.EMPTY : Base64.encodeToString(mo10456c(), 2));
    }
}
