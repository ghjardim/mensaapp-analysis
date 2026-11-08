package p187a4;

import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.Executor;
import org.apache.tika.utils.StringUtils;

/* renamed from: a4.X */
/* loaded from: classes.dex */
public final class C3130X {

    /* renamed from: a */
    public final SharedPreferences f9647a;

    /* renamed from: b */
    public final String f9648b;

    /* renamed from: c */
    public final String f9649c;

    /* renamed from: e */
    public final Executor f9651e;

    /* renamed from: d */
    public final ArrayDeque f9650d = new ArrayDeque();

    /* renamed from: f */
    public boolean f9652f = false;

    public C3130X(SharedPreferences sharedPreferences, String str, String str2, Executor executor) {
        this.f9647a = sharedPreferences;
        this.f9648b = str;
        this.f9649c = str2;
        this.f9651e = executor;
    }

    /* renamed from: d */
    public static C3130X m11414d(SharedPreferences sharedPreferences, String str, String str2, Executor executor) {
        C3130X c3130x = new C3130X(sharedPreferences, str, str2, executor);
        c3130x.m11417e();
        return c3130x;
    }

    /* renamed from: b */
    public boolean m11415b(String str) {
        boolean m11416c;
        if (TextUtils.isEmpty(str) || str.contains(this.f9649c)) {
            return false;
        }
        synchronized (this.f9650d) {
            m11416c = m11416c(this.f9650d.add(str));
        }
        return m11416c;
    }

    /* renamed from: c */
    public final boolean m11416c(boolean z6) {
        if (z6 && !this.f9652f) {
            m11422j();
        }
        return z6;
    }

    /* renamed from: e */
    public final void m11417e() {
        synchronized (this.f9650d) {
            try {
                this.f9650d.clear();
                String string = this.f9647a.getString(this.f9648b, StringUtils.EMPTY);
                if (!TextUtils.isEmpty(string) && string.contains(this.f9649c)) {
                    String[] split = string.split(this.f9649c, -1);
                    if (split.length == 0) {
                        Log.e("FirebaseMessaging", "Corrupted queue. Please check the queue contents and item separator provided");
                    }
                    for (String str : split) {
                        if (!TextUtils.isEmpty(str)) {
                            this.f9650d.add(str);
                        }
                    }
                }
            } finally {
            }
        }
    }

    /* renamed from: f */
    public String m11418f() {
        String str;
        synchronized (this.f9650d) {
            str = (String) this.f9650d.peek();
        }
        return str;
    }

    /* renamed from: g */
    public boolean m11419g(Object obj) {
        boolean m11416c;
        synchronized (this.f9650d) {
            m11416c = m11416c(this.f9650d.remove(obj));
        }
        return m11416c;
    }

    /* renamed from: h */
    public String m11420h() {
        StringBuilder sb = new StringBuilder();
        Iterator it = this.f9650d.iterator();
        while (it.hasNext()) {
            sb.append((String) it.next());
            sb.append(this.f9649c);
        }
        return sb.toString();
    }

    /* renamed from: i */
    public final void m11421i() {
        synchronized (this.f9650d) {
            this.f9647a.edit().putString(this.f9648b, m11420h()).commit();
        }
    }

    /* renamed from: j */
    public final void m11422j() {
        this.f9651e.execute(new Runnable() { // from class: a4.W
            @Override // java.lang.Runnable
            public final void run() {
                C3130X.this.m11421i();
            }
        });
    }
}
