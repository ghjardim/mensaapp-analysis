package p256j$.p258io;

import java.io.BufferedReader;
import java.io.IOException;
import java.p266io.UncheckedIOException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: j$.io.a */
/* loaded from: classes3.dex */
final class C4816a implements Iterator {

    /* renamed from: a */
    private final BufferedReader f17874a;

    /* renamed from: b */
    String f17875b = null;

    C4816a(BufferedReader bufferedReader) {
        this.f17874a = bufferedReader;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f17875b != null) {
            return true;
        }
        try {
            String readLine = this.f17874a.readLine();
            this.f17875b = readLine;
            return readLine != null;
        } catch (IOException e7) {
            throw new UncheckedIOException(e7);
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f17875b != null || hasNext()) {
            String str = this.f17875b;
            this.f17875b = null;
            return str;
        }
        throw new NoSuchElementException();
    }
}
