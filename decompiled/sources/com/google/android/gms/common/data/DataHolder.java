package com.google.android.gms.common.data;

import android.database.CursorWindow;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.common.annotation.KeepName;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.HashMap;
import org.apache.tika.pipes.pipesiterator.PipesIterator;
import p375x2.C6945b;
import p382y2.AbstractC7065a;
import p382y2.AbstractC7067c;

@KeepName
/* loaded from: classes.dex */
public final class DataHolder extends AbstractC7065a implements Closeable {
    public static final Parcelable.Creator<DataHolder> CREATOR = new C6945b();

    /* renamed from: r */
    public static final C3741a f12418r = new C3742a(new String[0], null);

    /* renamed from: a */
    public final int f12419a;

    /* renamed from: b */
    public final String[] f12420b;

    /* renamed from: c */
    public Bundle f12421c;

    /* renamed from: d */
    public final CursorWindow[] f12422d;

    /* renamed from: e */
    public final int f12423e;

    /* renamed from: f */
    public final Bundle f12424f;

    /* renamed from: n */
    public int[] f12425n;

    /* renamed from: o */
    public int f12426o;

    /* renamed from: p */
    public boolean f12427p = false;

    /* renamed from: q */
    public boolean f12428q = true;

    /* renamed from: com.google.android.gms.common.data.DataHolder$a */
    public static class C3741a {

        /* renamed from: a */
        public final String[] f12429a;

        /* renamed from: b */
        public final ArrayList f12430b = new ArrayList();

        /* renamed from: c */
        public final HashMap f12431c = new HashMap();
    }

    public DataHolder(int i7, String[] strArr, CursorWindow[] cursorWindowArr, int i8, Bundle bundle) {
        this.f12419a = i7;
        this.f12420b = strArr;
        this.f12422d = cursorWindowArr;
        this.f12423e = i8;
        this.f12424f = bundle;
    }

    /* renamed from: A0 */
    public final void m15014A0() {
        this.f12421c = new Bundle();
        int i7 = 0;
        int i8 = 0;
        while (true) {
            String[] strArr = this.f12420b;
            if (i8 >= strArr.length) {
                break;
            }
            this.f12421c.putInt(strArr[i8], i8);
            i8++;
        }
        this.f12425n = new int[this.f12422d.length];
        int i9 = 0;
        while (true) {
            CursorWindow[] cursorWindowArr = this.f12422d;
            if (i7 >= cursorWindowArr.length) {
                this.f12426o = i9;
                return;
            }
            this.f12425n[i7] = i9;
            i9 += this.f12422d[i7].getNumRows() - (i9 - cursorWindowArr[i7].getStartPosition());
            i7++;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        synchronized (this) {
            try {
                if (!this.f12427p) {
                    this.f12427p = true;
                    int i7 = 0;
                    while (true) {
                        CursorWindow[] cursorWindowArr = this.f12422d;
                        if (i7 >= cursorWindowArr.length) {
                            break;
                        }
                        cursorWindowArr[i7].close();
                        i7++;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void finalize() {
        try {
            if (this.f12428q && this.f12422d.length > 0 && !m15017z0()) {
                close();
                Log.e("DataBuffer", "Internal data leak within a DataBuffer object detected!  Be sure to explicitly call release() on all DataBuffer extending objects when you are done with them. (internal object: " + toString() + ")");
            }
        } finally {
            super.finalize();
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        String[] strArr = this.f12420b;
        int m29117a = AbstractC7067c.m29117a(parcel);
        AbstractC7067c.m29109F(parcel, 1, strArr, false);
        AbstractC7067c.m29111H(parcel, 2, this.f12422d, i7, false);
        AbstractC7067c.m29136t(parcel, 3, m15016y0());
        AbstractC7067c.m29126j(parcel, 4, m15015x0(), false);
        AbstractC7067c.m29136t(parcel, PipesIterator.DEFAULT_QUEUE_SIZE, this.f12419a);
        AbstractC7067c.m29118b(parcel, m29117a);
        if ((i7 & 1) != 0) {
            close();
        }
    }

    /* renamed from: x0 */
    public Bundle m15015x0() {
        return this.f12424f;
    }

    /* renamed from: y0 */
    public int m15016y0() {
        return this.f12423e;
    }

    /* renamed from: z0 */
    public boolean m15017z0() {
        boolean z6;
        synchronized (this) {
            z6 = this.f12427p;
        }
        return z6;
    }
}
