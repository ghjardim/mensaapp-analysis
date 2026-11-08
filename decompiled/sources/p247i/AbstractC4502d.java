package p247i;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.StateSet;
import p247i.AbstractC4500b;

/* renamed from: i.d */
/* loaded from: classes.dex */
public abstract class AbstractC4502d extends AbstractC4500b {

    /* renamed from: u */
    public a f16068u;

    /* renamed from: v */
    public boolean f16069v;

    /* renamed from: i.d$a */
    public static class a extends AbstractC4500b.c {

        /* renamed from: J */
        public int[][] f16070J;

        public a(a aVar, AbstractC4502d abstractC4502d, Resources resources) {
            super(aVar, abstractC4502d, resources);
            if (aVar != null) {
                this.f16070J = aVar.f16070J;
            } else {
                this.f16070J = new int[m19159f()][];
            }
        }

        /* renamed from: A */
        public int m19181A(int[] iArr) {
            int[][] iArr2 = this.f16070J;
            int m19161h = m19161h();
            for (int i7 = 0; i7 < m19161h; i7++) {
                if (StateSet.stateSetMatches(iArr2[i7], iArr)) {
                    return i7;
                }
            }
            return -1;
        }

        @Override // p247i.AbstractC4500b.c
        /* renamed from: o */
        public void mo19168o(int i7, int i8) {
            super.mo19168o(i7, i8);
            int[][] iArr = new int[i8][];
            System.arraycopy(this.f16070J, 0, iArr, 0, i7);
            this.f16070J = iArr;
        }

        @Override // p247i.AbstractC4500b.c
        /* renamed from: r */
        public abstract void mo19140r();

        /* renamed from: z */
        public int m19182z(int[] iArr, Drawable drawable) {
            int m19154a = m19154a(drawable);
            this.f16070J[m19154a] = iArr;
            return m19154a;
        }
    }

    public AbstractC4502d(a aVar) {
        if (aVar != null) {
            mo19121h(aVar);
        }
    }

    @Override // p247i.AbstractC4500b, android.graphics.drawable.Drawable
    public void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
        onStateChange(getState());
    }

    @Override // p247i.AbstractC4500b
    /* renamed from: h */
    public void mo19121h(AbstractC4500b.c cVar) {
        super.mo19121h(cVar);
        if (cVar instanceof a) {
            this.f16068u = (a) cVar;
        }
    }

    /* renamed from: j */
    public int[] m19180j(AttributeSet attributeSet) {
        int attributeCount = attributeSet.getAttributeCount();
        int[] iArr = new int[attributeCount];
        int i7 = 0;
        for (int i8 = 0; i8 < attributeCount; i8++) {
            int attributeNameResource = attributeSet.getAttributeNameResource(i8);
            if (attributeNameResource != 0 && attributeNameResource != 16842960 && attributeNameResource != 16843161) {
                int i9 = i7 + 1;
                if (!attributeSet.getAttributeBooleanValue(i8, false)) {
                    attributeNameResource = -attributeNameResource;
                }
                iArr[i7] = attributeNameResource;
                i7 = i9;
            }
        }
        return StateSet.trimStateSet(iArr, i7);
    }

    @Override // p247i.AbstractC4500b, android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.f16069v && super.mutate() == this) {
            this.f16068u.mo19140r();
            this.f16069v = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public abstract boolean onStateChange(int[] iArr);
}
