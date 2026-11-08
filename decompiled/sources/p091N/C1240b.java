package p091N;

import android.database.Cursor;
import android.widget.Filter;

/* renamed from: N.b */
/* loaded from: classes.dex */
public class C1240b extends Filter {

    /* renamed from: a */
    public a f3914a;

    /* renamed from: N.b$a */
    public interface a {
        /* renamed from: a */
        void mo4746a(Cursor cursor);

        /* renamed from: b */
        Cursor mo4747b();

        /* renamed from: c */
        CharSequence mo4748c(Cursor cursor);

        /* renamed from: d */
        Cursor mo4755d(CharSequence charSequence);
    }

    public C1240b(a aVar) {
        this.f3914a = aVar;
    }

    @Override // android.widget.Filter
    public CharSequence convertResultToString(Object obj) {
        return this.f3914a.mo4748c((Cursor) obj);
    }

    @Override // android.widget.Filter
    public Filter.FilterResults performFiltering(CharSequence charSequence) {
        Cursor mo4755d = this.f3914a.mo4755d(charSequence);
        Filter.FilterResults filterResults = new Filter.FilterResults();
        if (mo4755d != null) {
            filterResults.count = mo4755d.getCount();
            filterResults.values = mo4755d;
        } else {
            filterResults.count = 0;
            filterResults.values = null;
        }
        return filterResults;
    }

    @Override // android.widget.Filter
    public void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        Cursor mo4747b = this.f3914a.mo4747b();
        Object obj = filterResults.values;
        if (obj == null || obj == mo4747b) {
            return;
        }
        this.f3914a.mo4746a((Cursor) obj);
    }
}
