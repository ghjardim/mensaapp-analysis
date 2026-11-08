package p343t0;

import android.net.Uri;
import java.util.LinkedHashMap;
import java.util.Map;
import p259j0.AbstractC5332a;

/* renamed from: t0.e */
/* loaded from: classes.dex */
public final class C6411e {

    /* renamed from: a */
    public final LinkedHashMap f23146a;

    /* renamed from: t0.e$a */
    public class a extends LinkedHashMap {

        /* renamed from: a */
        public final /* synthetic */ int f23147a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i7, float f7, boolean z6, int i8) {
            super(i7, f7, z6);
            this.f23147a = i8;
        }

        @Override // java.util.LinkedHashMap
        public boolean removeEldestEntry(Map.Entry entry) {
            return size() > this.f23147a;
        }
    }

    public C6411e(int i7) {
        this.f23146a = new a(i7 + 1, 1.0f, false, i7);
    }

    /* renamed from: a */
    public byte[] m26778a(Uri uri) {
        if (uri == null) {
            return null;
        }
        return (byte[]) this.f23146a.get(uri);
    }

    /* renamed from: b */
    public byte[] m26779b(Uri uri, byte[] bArr) {
        return (byte[]) this.f23146a.put((Uri) AbstractC5332a.m21800e(uri), (byte[]) AbstractC5332a.m21800e(bArr));
    }

    /* renamed from: c */
    public byte[] m26780c(Uri uri) {
        return (byte[]) this.f23146a.remove(AbstractC5332a.m21800e(uri));
    }
}
