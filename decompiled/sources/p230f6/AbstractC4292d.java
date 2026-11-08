package p230f6;

import com.google.android.gms.common.api.C3643a;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.nio.file.OpenOption;
import java.util.function.IntUnaryOperator;
import p238g6.AbstractC4473e;
import p256j$.util.function.IntUnaryOperator$CC;

/* renamed from: f6.d */
/* loaded from: classes2.dex */
public abstract class AbstractC4292d extends AbstractC4290b {

    /* renamed from: j */
    public static final OpenOption[] f14744j = AbstractC4473e.f15915j;

    /* renamed from: b */
    public int f14745b = 8192;

    /* renamed from: c */
    public int f14746c = 8192;

    /* renamed from: d */
    public int f14747d = C3643a.e.API_PRIORITY_OTHER;

    /* renamed from: e */
    public Charset f14748e = Charset.defaultCharset();

    /* renamed from: f */
    public Charset f14749f = Charset.defaultCharset();

    /* renamed from: g */
    public OpenOption[] f14750g = f14744j;

    /* renamed from: h */
    public final IntUnaryOperator f14751h;

    /* renamed from: i */
    public IntUnaryOperator f14752i;

    public AbstractC4292d() {
        IntUnaryOperator intUnaryOperator = new IntUnaryOperator() { // from class: f6.c
            public /* synthetic */ IntUnaryOperator andThen(IntUnaryOperator intUnaryOperator2) {
                return IntUnaryOperator$CC.$default$andThen(this, intUnaryOperator2);
            }

            @Override // java.util.function.IntUnaryOperator
            public final int applyAsInt(int i7) {
                int m17940j;
                m17940j = AbstractC4292d.this.m17940j(i7);
                return m17940j;
            }

            public /* synthetic */ IntUnaryOperator compose(IntUnaryOperator intUnaryOperator2) {
                return IntUnaryOperator$CC.$default$compose(this, intUnaryOperator2);
            }
        };
        this.f14751h = intUnaryOperator;
        this.f14752i = intUnaryOperator;
    }

    /* renamed from: g */
    public int m17937g() {
        return this.f14745b;
    }

    /* renamed from: h */
    public InputStream m17938h() {
        return m17933b().mo17930d(m17939i());
    }

    /* renamed from: i */
    public OpenOption[] m17939i() {
        return this.f14750g;
    }

    /* renamed from: j */
    public final /* synthetic */ int m17940j(int i7) {
        int i8 = this.f14747d;
        return i7 > i8 ? m17941k(i7, i8) : i7;
    }

    /* renamed from: k */
    public final int m17941k(int i7, int i8) {
        throw new IllegalArgumentException(String.format("Request %,d exceeds maximum %,d", Integer.valueOf(i7), Integer.valueOf(i8)));
    }
}
