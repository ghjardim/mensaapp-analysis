package com.google.android.play.core.integrity;

/* renamed from: com.google.android.play.core.integrity.a */
/* loaded from: classes.dex */
final class C3840a extends AbstractC3856ap {

    /* renamed from: a */
    private String f12640a;

    /* renamed from: b */
    private AbstractC3914y f12641b;

    @Override // com.google.android.play.core.integrity.AbstractC3856ap
    /* renamed from: a */
    public final AbstractC3856ap mo15208a(AbstractC3914y abstractC3914y) {
        this.f12641b = abstractC3914y;
        return this;
    }

    @Override // com.google.android.play.core.integrity.AbstractC3856ap
    /* renamed from: b */
    public final AbstractC3856ap mo15209b(String str) {
        this.f12640a = str;
        return this;
    }

    @Override // com.google.android.play.core.integrity.AbstractC3856ap
    /* renamed from: c */
    public final C3857aq mo15210c() {
        AbstractC3914y abstractC3914y;
        String str = this.f12640a;
        if (str != null && (abstractC3914y = this.f12641b) != null) {
            return new C3857aq(str, abstractC3914y);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f12640a == null) {
            sb.append(" token");
        }
        if (this.f12641b == null) {
            sb.append(" integrityDialogWrapper");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }
}
