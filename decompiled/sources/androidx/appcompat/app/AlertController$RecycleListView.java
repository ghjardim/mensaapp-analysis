package androidx.appcompat.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.ListView;
import p223f.AbstractC4224i;

/* loaded from: classes.dex */
public class AlertController$RecycleListView extends ListView {

    /* renamed from: a */
    public final int f9804a;

    /* renamed from: b */
    public final int f9805b;

    public AlertController$RecycleListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC4224i.f14427z1);
        this.f9805b = obtainStyledAttributes.getDimensionPixelOffset(AbstractC4224i.f14213A1, -1);
        this.f9804a = obtainStyledAttributes.getDimensionPixelOffset(AbstractC4224i.f14217B1, -1);
    }
}
