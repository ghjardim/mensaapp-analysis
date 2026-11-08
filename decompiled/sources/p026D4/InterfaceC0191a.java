package p026D4;

import android.content.Context;
import io.flutter.embedding.engine.C4659a;
import io.flutter.embedding.engine.C4660b;
import io.flutter.plugin.platform.InterfaceC4772n;
import io.flutter.view.TextureRegistry;
import p061I4.InterfaceC0651c;

/* renamed from: D4.a */
/* loaded from: classes.dex */
public interface InterfaceC0191a {

    /* renamed from: D4.a$a */
    public interface a {
        /* renamed from: a */
        String mo784a(String str);
    }

    /* renamed from: D4.a$b */
    public static class b {

        /* renamed from: a */
        public final Context f778a;

        /* renamed from: b */
        public final C4659a f779b;

        /* renamed from: c */
        public final InterfaceC0651c f780c;

        /* renamed from: d */
        public final TextureRegistry f781d;

        /* renamed from: e */
        public final InterfaceC4772n f782e;

        /* renamed from: f */
        public final a f783f;

        /* renamed from: g */
        public final C4660b f784g;

        public b(Context context, C4659a c4659a, InterfaceC0651c interfaceC0651c, TextureRegistry textureRegistry, InterfaceC4772n interfaceC4772n, a aVar, C4660b c4660b) {
            this.f778a = context;
            this.f779b = c4659a;
            this.f780c = interfaceC0651c;
            this.f781d = textureRegistry;
            this.f782e = interfaceC4772n;
            this.f783f = aVar;
            this.f784g = c4660b;
        }

        /* renamed from: a */
        public Context m785a() {
            return this.f778a;
        }

        /* renamed from: b */
        public InterfaceC0651c m786b() {
            return this.f780c;
        }

        /* renamed from: c */
        public a m787c() {
            return this.f783f;
        }

        /* renamed from: d */
        public InterfaceC4772n m788d() {
            return this.f782e;
        }

        /* renamed from: e */
        public TextureRegistry m789e() {
            return this.f781d;
        }
    }

    /* renamed from: C */
    void mo782C(b bVar);

    /* renamed from: y */
    void mo783y(b bVar);
}
