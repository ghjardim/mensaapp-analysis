package p029E0;

import java.util.NoSuchElementException;

/* renamed from: E0.n */
/* loaded from: classes.dex */
public interface InterfaceC0221n {

    /* renamed from: a */
    public static final InterfaceC0221n f924a = new a();

    /* renamed from: E0.n$a */
    public class a implements InterfaceC0221n {
        @Override // p029E0.InterfaceC0221n
        /* renamed from: a */
        public long mo920a() {
            throw new NoSuchElementException();
        }

        @Override // p029E0.InterfaceC0221n
        /* renamed from: b */
        public long mo921b() {
            throw new NoSuchElementException();
        }

        @Override // p029E0.InterfaceC0221n
        public boolean next() {
            return false;
        }
    }

    /* renamed from: a */
    long mo920a();

    /* renamed from: b */
    long mo921b();

    boolean next();
}
