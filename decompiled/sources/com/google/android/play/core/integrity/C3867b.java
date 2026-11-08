package com.google.android.play.core.integrity;

/* renamed from: com.google.android.play.core.integrity.b */
/* loaded from: classes.dex */
final class C3867b extends AbstractC3884bq {

    /* renamed from: a */
    private String f12693a;

    /* renamed from: b */
    private AbstractC3914y f12694b;

    @Override // com.google.android.play.core.integrity.AbstractC3884bq
    /* renamed from: a */
    public final AbstractC3884bq mo15227a(AbstractC3914y abstractC3914y) {
        this.f12694b = abstractC3914y;
        return this;
    }

    @Override // com.google.android.play.core.integrity.AbstractC3884bq
    /* renamed from: b */
    public final AbstractC3884bq mo15228b(String str) {
        if (str == null) {
            throw new NullPointerException("Null token");
        }
        this.f12693a = str;
        return this;
    }

    @Override // com.google.android.play.core.integrity.AbstractC3884bq
    /* renamed from: c */
    public final C3885br mo15229c() {
        AbstractC3914y abstractC3914y;
        String str = this.f12693a;
        if (str != null && (abstractC3914y = this.f12694b) != null) {
            return new C3885br(str, abstractC3914y);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f12693a == null) {
            sb.append(" token");
        }
        if (this.f12694b == null) {
            sb.append(" integrityDialogWrapper");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }
}
