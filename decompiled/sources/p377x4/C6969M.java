package p377x4;

import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import com.google.android.gms.common.api.C3643a;
import io.flutter.plugin.editing.C4712m;
import java.util.HashSet;
import java.util.Map;
import p054H4.C0573i;
import p054H4.C0574j;
import p061I4.InterfaceC0651c;
import p370w4.AbstractC6917b;

/* renamed from: x4.M */
/* loaded from: classes.dex */
public class C6969M implements C4712m.a, C0574j.b {

    /* renamed from: a */
    public final d[] f24959a;

    /* renamed from: b */
    public final HashSet f24960b = new HashSet();

    /* renamed from: c */
    public final e f24961c;

    /* renamed from: x4.M$b */
    public static class b {

        /* renamed from: a */
        public int f24962a = 0;

        /* renamed from: a */
        public Character m28566a(int i7) {
            char c7 = (char) i7;
            if ((Integer.MIN_VALUE & i7) != 0) {
                int i8 = i7 & C3643a.e.API_PRIORITY_OTHER;
                int i9 = this.f24962a;
                if (i9 != 0) {
                    this.f24962a = KeyCharacterMap.getDeadChar(i9, i8);
                } else {
                    this.f24962a = i8;
                }
            } else {
                int i10 = this.f24962a;
                if (i10 != 0) {
                    int deadChar = KeyCharacterMap.getDeadChar(i10, i7);
                    if (deadChar > 0) {
                        c7 = (char) deadChar;
                    }
                    this.f24962a = 0;
                }
            }
            return Character.valueOf(c7);
        }
    }

    /* renamed from: x4.M$c */
    public class c {

        /* renamed from: a */
        public final KeyEvent f24963a;

        /* renamed from: b */
        public int f24964b;

        /* renamed from: c */
        public boolean f24965c = false;

        /* renamed from: x4.M$c$a */
        public class a implements d.a {

            /* renamed from: a */
            public boolean f24967a;

            public a() {
                this.f24967a = false;
            }

            @Override // p377x4.C6969M.d.a
            /* renamed from: a */
            public void mo28568a(boolean z6) {
                if (this.f24967a) {
                    throw new IllegalStateException("The onKeyEventHandledCallback should be called exactly once.");
                }
                this.f24967a = true;
                c cVar = c.this;
                int i7 = cVar.f24964b - 1;
                cVar.f24964b = i7;
                boolean z7 = z6 | cVar.f24965c;
                cVar.f24965c = z7;
                if (i7 != 0 || z7) {
                    return;
                }
                C6969M.this.m28565e(cVar.f24963a);
            }
        }

        public c(KeyEvent keyEvent) {
            this.f24964b = C6969M.this.f24959a.length;
            this.f24963a = keyEvent;
        }

        /* renamed from: a */
        public d.a m28567a() {
            return new a();
        }
    }

    /* renamed from: x4.M$d */
    public interface d {

        /* renamed from: x4.M$d$a */
        public interface a {
            /* renamed from: a */
            void mo28568a(boolean z6);
        }

        /* renamed from: a */
        void mo28540a(KeyEvent keyEvent, a aVar);
    }

    /* renamed from: x4.M$e */
    public interface e {
        /* renamed from: b */
        void mo28514b(KeyEvent keyEvent);

        /* renamed from: c */
        boolean mo28515c(KeyEvent keyEvent);

        InterfaceC0651c getBinaryMessenger();
    }

    public C6969M(e eVar) {
        this.f24961c = eVar;
        this.f24959a = new d[]{new C6968L(eVar.getBinaryMessenger()), new C6963G(new C0573i(eVar.getBinaryMessenger()))};
        new C0574j(eVar.getBinaryMessenger()).m2195b(this);
    }

    @Override // io.flutter.plugin.editing.C4712m.a
    /* renamed from: a */
    public boolean mo20381a(KeyEvent keyEvent) {
        if (this.f24960b.remove(keyEvent)) {
            return false;
        }
        if (this.f24959a.length <= 0) {
            m28565e(keyEvent);
            return true;
        }
        c cVar = new c(keyEvent);
        for (d dVar : this.f24959a) {
            dVar.mo28540a(keyEvent, cVar.m28567a());
        }
        return true;
    }

    @Override // p054H4.C0574j.b
    /* renamed from: b */
    public Map mo2196b() {
        return ((C6968L) this.f24959a[0]).m28554h();
    }

    /* renamed from: d */
    public void m28564d() {
        int size = this.f24960b.size();
        if (size > 0) {
            AbstractC6917b.m28359g("KeyboardManager", "A KeyboardManager was destroyed with " + String.valueOf(size) + " unhandled redispatch event(s).");
        }
    }

    /* renamed from: e */
    public final void m28565e(KeyEvent keyEvent) {
        e eVar = this.f24961c;
        if (eVar == null || eVar.mo28515c(keyEvent)) {
            return;
        }
        this.f24960b.add(keyEvent);
        this.f24961c.mo28514b(keyEvent);
        if (this.f24960b.remove(keyEvent)) {
            AbstractC6917b.m28359g("KeyboardManager", "A redispatched key event was consumed before reaching KeyboardManager");
        }
    }
}
