package p091N;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: N.c */
/* loaded from: classes.dex */
public abstract class AbstractC1241c extends AbstractC1239a {

    /* renamed from: p */
    public int f3915p;

    /* renamed from: q */
    public int f3916q;

    /* renamed from: r */
    public LayoutInflater f3917r;

    public AbstractC1241c(Context context, int i7, Cursor cursor, boolean z6) {
        super(context, cursor, z6);
        this.f3916q = i7;
        this.f3915p = i7;
        this.f3917r = (LayoutInflater) context.getSystemService("layout_inflater");
    }

    @Override // p091N.AbstractC1239a
    /* renamed from: g */
    public View mo4751g(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.f3917r.inflate(this.f3916q, viewGroup, false);
    }

    @Override // p091N.AbstractC1239a
    /* renamed from: h */
    public View mo4752h(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.f3917r.inflate(this.f3915p, viewGroup, false);
    }
}
