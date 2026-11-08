package p291n;

import android.view.textclassifier.TextClassificationManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import p042G.AbstractC0343e;

/* renamed from: n.o */
/* loaded from: classes.dex */
public final class C5649o {

    /* renamed from: a */
    public TextView f20465a;

    /* renamed from: b */
    public TextClassifier f20466b;

    public C5649o(TextView textView) {
        this.f20465a = (TextView) AbstractC0343e.m1353c(textView);
    }

    /* renamed from: a */
    public TextClassifier m23705a() {
        TextClassifier textClassifier;
        TextClassifier textClassifier2;
        TextClassifier textClassifier3 = this.f20466b;
        if (textClassifier3 != null) {
            return textClassifier3;
        }
        TextClassificationManager m23702a = AbstractC5646l.m23702a(this.f20465a.getContext().getSystemService(AbstractC5645k.m23701a()));
        if (m23702a != null) {
            textClassifier2 = m23702a.getTextClassifier();
            return textClassifier2;
        }
        textClassifier = TextClassifier.NO_OP;
        return textClassifier;
    }

    /* renamed from: b */
    public void m23706b(TextClassifier textClassifier) {
        this.f20466b = textClassifier;
    }
}
