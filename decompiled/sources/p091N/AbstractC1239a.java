package p091N;

import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import p091N.C1240b;

/* renamed from: N.a */
/* loaded from: classes.dex */
public abstract class AbstractC1239a extends BaseAdapter implements Filterable, C1240b.a {

    /* renamed from: a */
    public boolean f3904a;

    /* renamed from: b */
    public boolean f3905b;

    /* renamed from: c */
    public Cursor f3906c;

    /* renamed from: d */
    public Context f3907d;

    /* renamed from: e */
    public int f3908e;

    /* renamed from: f */
    public a f3909f;

    /* renamed from: n */
    public DataSetObserver f3910n;

    /* renamed from: o */
    public C1240b f3911o;

    /* renamed from: N.a$a */
    public class a extends ContentObserver {
        public a() {
            super(new Handler());
        }

        @Override // android.database.ContentObserver
        public boolean deliverSelfNotifications() {
            return true;
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z6) {
            AbstractC1239a.this.m4753i();
        }
    }

    /* renamed from: N.a$b */
    public class b extends DataSetObserver {
        public b() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            AbstractC1239a abstractC1239a = AbstractC1239a.this;
            abstractC1239a.f3904a = true;
            abstractC1239a.notifyDataSetChanged();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            AbstractC1239a abstractC1239a = AbstractC1239a.this;
            abstractC1239a.f3904a = false;
            abstractC1239a.notifyDataSetInvalidated();
        }
    }

    public AbstractC1239a(Context context, Cursor cursor, boolean z6) {
        m4750f(context, cursor, z6 ? 1 : 2);
    }

    @Override // p091N.C1240b.a
    /* renamed from: a */
    public void mo4746a(Cursor cursor) {
        Cursor m4754j = m4754j(cursor);
        if (m4754j != null) {
            m4754j.close();
        }
    }

    @Override // p091N.C1240b.a
    /* renamed from: b */
    public Cursor mo4747b() {
        return this.f3906c;
    }

    @Override // p091N.C1240b.a
    /* renamed from: c */
    public abstract CharSequence mo4748c(Cursor cursor);

    /* renamed from: e */
    public abstract void mo4749e(View view, Context context, Cursor cursor);

    /* renamed from: f */
    public void m4750f(Context context, Cursor cursor, int i7) {
        if ((i7 & 1) == 1) {
            i7 |= 2;
            this.f3905b = true;
        } else {
            this.f3905b = false;
        }
        boolean z6 = cursor != null;
        this.f3906c = cursor;
        this.f3904a = z6;
        this.f3907d = context;
        this.f3908e = z6 ? cursor.getColumnIndexOrThrow("_id") : -1;
        if ((i7 & 2) == 2) {
            this.f3909f = new a();
            this.f3910n = new b();
        } else {
            this.f3909f = null;
            this.f3910n = null;
        }
        if (z6) {
            a aVar = this.f3909f;
            if (aVar != null) {
                cursor.registerContentObserver(aVar);
            }
            DataSetObserver dataSetObserver = this.f3910n;
            if (dataSetObserver != null) {
                cursor.registerDataSetObserver(dataSetObserver);
            }
        }
    }

    /* renamed from: g */
    public abstract View mo4751g(Context context, Cursor cursor, ViewGroup viewGroup);

    @Override // android.widget.Adapter
    public int getCount() {
        Cursor cursor;
        if (!this.f3904a || (cursor = this.f3906c) == null) {
            return 0;
        }
        return cursor.getCount();
    }

    @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i7, View view, ViewGroup viewGroup) {
        if (!this.f3904a) {
            return null;
        }
        this.f3906c.moveToPosition(i7);
        if (view == null) {
            view = mo4751g(this.f3907d, this.f3906c, viewGroup);
        }
        mo4749e(view, this.f3907d, this.f3906c);
        return view;
    }

    @Override // android.widget.Filterable
    public Filter getFilter() {
        if (this.f3911o == null) {
            this.f3911o = new C1240b(this);
        }
        return this.f3911o;
    }

    @Override // android.widget.Adapter
    public Object getItem(int i7) {
        Cursor cursor;
        if (!this.f3904a || (cursor = this.f3906c) == null) {
            return null;
        }
        cursor.moveToPosition(i7);
        return this.f3906c;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i7) {
        Cursor cursor;
        if (this.f3904a && (cursor = this.f3906c) != null && cursor.moveToPosition(i7)) {
            return this.f3906c.getLong(this.f3908e);
        }
        return 0L;
    }

    @Override // android.widget.Adapter
    public View getView(int i7, View view, ViewGroup viewGroup) {
        if (!this.f3904a) {
            throw new IllegalStateException("this should only be called when the cursor is valid");
        }
        if (this.f3906c.moveToPosition(i7)) {
            if (view == null) {
                view = mo4752h(this.f3907d, this.f3906c, viewGroup);
            }
            mo4749e(view, this.f3907d, this.f3906c);
            return view;
        }
        throw new IllegalStateException("couldn't move cursor to position " + i7);
    }

    /* renamed from: h */
    public abstract View mo4752h(Context context, Cursor cursor, ViewGroup viewGroup);

    /* renamed from: i */
    public void m4753i() {
        Cursor cursor;
        if (!this.f3905b || (cursor = this.f3906c) == null || cursor.isClosed()) {
            return;
        }
        this.f3904a = this.f3906c.requery();
    }

    /* renamed from: j */
    public Cursor m4754j(Cursor cursor) {
        Cursor cursor2 = this.f3906c;
        if (cursor == cursor2) {
            return null;
        }
        if (cursor2 != null) {
            a aVar = this.f3909f;
            if (aVar != null) {
                cursor2.unregisterContentObserver(aVar);
            }
            DataSetObserver dataSetObserver = this.f3910n;
            if (dataSetObserver != null) {
                cursor2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.f3906c = cursor;
        if (cursor != null) {
            a aVar2 = this.f3909f;
            if (aVar2 != null) {
                cursor.registerContentObserver(aVar2);
            }
            DataSetObserver dataSetObserver2 = this.f3910n;
            if (dataSetObserver2 != null) {
                cursor.registerDataSetObserver(dataSetObserver2);
            }
            this.f3908e = cursor.getColumnIndexOrThrow("_id");
            this.f3904a = true;
            notifyDataSetChanged();
        } else {
            this.f3908e = -1;
            this.f3904a = false;
            notifyDataSetInvalidated();
        }
        return cursor2;
    }
}
