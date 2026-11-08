package p368w2;

import android.content.Intent;

/* renamed from: w2.s */
/* loaded from: classes.dex */
public abstract class AbstractC6878s extends Exception {

    /* renamed from: a */
    public final Intent f24706a;

    public AbstractC6878s(String str, Intent intent) {
        super(str);
        this.f24706a = intent;
    }

    /* renamed from: a */
    public Intent m28298a() {
        return new Intent(this.f24706a);
    }
}
