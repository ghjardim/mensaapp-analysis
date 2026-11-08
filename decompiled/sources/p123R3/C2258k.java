package p123R3;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import org.apache.tika.utils.StringUtils;
import p256j$.time.ZoneOffset;
import p256j$.time.format.DateTimeFormatter;
import p256j$.util.DateRetargetClass;

/* renamed from: R3.k */
/* loaded from: classes.dex */
public class C2258k {

    /* renamed from: a */
    public final SharedPreferences f6877a;

    public C2258k(Context context, String str) {
        this.f6877a = context.getSharedPreferences("FirebaseHeartBeat" + str, 0);
    }

    /* renamed from: a */
    public final synchronized void m7679a() {
        try {
            long j7 = this.f6877a.getLong("fire-count", 0L);
            String str = StringUtils.EMPTY;
            String str2 = null;
            for (Map.Entry<String, ?> entry : this.f6877a.getAll().entrySet()) {
                if (entry.getValue() instanceof Set) {
                    for (String str3 : (Set) entry.getValue()) {
                        if (str2 != null && str2.compareTo(str3) <= 0) {
                        }
                        str = entry.getKey();
                        str2 = str3;
                    }
                }
            }
            HashSet hashSet = new HashSet(this.f6877a.getStringSet(str, new HashSet()));
            hashSet.remove(str2);
            this.f6877a.edit().putStringSet(str, hashSet).putLong("fire-count", j7 - 1).commit();
        } catch (Throwable th) {
            throw th;
        }
    }

    /* renamed from: b */
    public synchronized void m7680b() {
        try {
            SharedPreferences.Editor edit = this.f6877a.edit();
            int i7 = 0;
            for (Map.Entry<String, ?> entry : this.f6877a.getAll().entrySet()) {
                if (entry.getValue() instanceof Set) {
                    Set set = (Set) entry.getValue();
                    String m7682d = m7682d(System.currentTimeMillis());
                    String key = entry.getKey();
                    if (set.contains(m7682d)) {
                        HashSet hashSet = new HashSet();
                        hashSet.add(m7682d);
                        i7++;
                        edit.putStringSet(key, hashSet);
                    } else {
                        edit.remove(key);
                    }
                }
            }
            if (i7 == 0) {
                edit.remove("fire-count");
            } else {
                edit.putLong("fire-count", i7);
            }
            edit.commit();
        } catch (Throwable th) {
            throw th;
        }
    }

    /* renamed from: c */
    public synchronized List m7681c() {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            for (Map.Entry<String, ?> entry : this.f6877a.getAll().entrySet()) {
                if (entry.getValue() instanceof Set) {
                    HashSet hashSet = new HashSet((Set) entry.getValue());
                    hashSet.remove(m7682d(System.currentTimeMillis()));
                    if (!hashSet.isEmpty()) {
                        arrayList.add(AbstractC2259l.m7692a(entry.getKey(), new ArrayList(hashSet)));
                    }
                }
            }
            m7690l(System.currentTimeMillis());
        } catch (Throwable th) {
            throw th;
        }
        return arrayList;
    }

    /* renamed from: d */
    public final synchronized String m7682d(long j7) {
        if (Build.VERSION.SDK_INT >= 26) {
            return DateRetargetClass.toInstant(new Date(j7)).atOffset(ZoneOffset.UTC).toLocalDateTime().format(DateTimeFormatter.ISO_LOCAL_DATE);
        }
        return new SimpleDateFormat("yyyy-MM-dd", Locale.UK).format(new Date(j7));
    }

    /* renamed from: e */
    public final synchronized String m7683e(String str) {
        for (Map.Entry<String, ?> entry : this.f6877a.getAll().entrySet()) {
            if (entry.getValue() instanceof Set) {
                Iterator it = ((Set) entry.getValue()).iterator();
                while (it.hasNext()) {
                    if (str.equals((String) it.next())) {
                        return entry.getKey();
                    }
                }
            }
        }
        return null;
    }

    /* renamed from: f */
    public synchronized boolean m7684f(long j7, long j8) {
        return m7682d(j7).equals(m7682d(j8));
    }

    /* renamed from: g */
    public synchronized void m7685g() {
        String m7682d = m7682d(System.currentTimeMillis());
        this.f6877a.edit().putString("last-used-date", m7682d).commit();
        m7686h(m7682d);
    }

    /* renamed from: h */
    public final synchronized void m7686h(String str) {
        try {
            String m7683e = m7683e(str);
            if (m7683e == null) {
                return;
            }
            HashSet hashSet = new HashSet(this.f6877a.getStringSet(m7683e, new HashSet()));
            hashSet.remove(str);
            if (hashSet.isEmpty()) {
                this.f6877a.edit().remove(m7683e).commit();
            } else {
                this.f6877a.edit().putStringSet(m7683e, hashSet).commit();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* renamed from: i */
    public synchronized boolean m7687i(long j7) {
        return m7688j("fire-global", j7);
    }

    /* renamed from: j */
    public synchronized boolean m7688j(String str, long j7) {
        if (!this.f6877a.contains(str)) {
            this.f6877a.edit().putLong(str, j7).commit();
            return true;
        }
        if (m7684f(this.f6877a.getLong(str, -1L), j7)) {
            return false;
        }
        this.f6877a.edit().putLong(str, j7).commit();
        return true;
    }

    /* renamed from: k */
    public synchronized void m7689k(long j7, String str) {
        String m7682d = m7682d(j7);
        if (this.f6877a.getString("last-used-date", StringUtils.EMPTY).equals(m7682d)) {
            String m7683e = m7683e(m7682d);
            if (m7683e == null) {
                return;
            }
            if (m7683e.equals(str)) {
                return;
            }
            m7691m(str, m7682d);
            return;
        }
        long j8 = this.f6877a.getLong("fire-count", 0L);
        if (j8 + 1 == 30) {
            m7679a();
            j8 = this.f6877a.getLong("fire-count", 0L);
        }
        HashSet hashSet = new HashSet(this.f6877a.getStringSet(str, new HashSet()));
        hashSet.add(m7682d);
        this.f6877a.edit().putStringSet(str, hashSet).putLong("fire-count", j8 + 1).putString("last-used-date", m7682d).commit();
    }

    /* renamed from: l */
    public synchronized void m7690l(long j7) {
        this.f6877a.edit().putLong("fire-global", j7).commit();
    }

    /* renamed from: m */
    public final synchronized void m7691m(String str, String str2) {
        m7686h(str2);
        HashSet hashSet = new HashSet(this.f6877a.getStringSet(str, new HashSet()));
        hashSet.add(str2);
        this.f6877a.edit().putStringSet(str, hashSet).commit();
    }
}
