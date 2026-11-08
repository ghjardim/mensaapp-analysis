package p161X;

import android.util.Log;
import java.io.Writer;

/* renamed from: X.W */
/* loaded from: classes.dex */
public final class C2765W extends Writer {

    /* renamed from: a */
    public final String f8270a;

    /* renamed from: b */
    public StringBuilder f8271b = new StringBuilder(128);

    public C2765W(String str) {
        this.f8270a = str;
    }

    /* renamed from: a */
    public final void m9651a() {
        if (this.f8271b.length() > 0) {
            Log.d(this.f8270a, this.f8271b.toString());
            StringBuilder sb = this.f8271b;
            sb.delete(0, sb.length());
        }
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        m9651a();
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() {
        m9651a();
    }

    @Override // java.io.Writer
    public void write(char[] cArr, int i7, int i8) {
        for (int i9 = 0; i9 < i8; i9++) {
            char c7 = cArr[i7 + i9];
            if (c7 == '\n') {
                m9651a();
            } else {
                this.f8271b.append(c7);
            }
        }
    }
}
