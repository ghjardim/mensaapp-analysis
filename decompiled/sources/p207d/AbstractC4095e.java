package p207d;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC5457A;
import kotlin.jvm.internal.AbstractC5464g;
import kotlin.jvm.internal.AbstractC5469l;
import kotlin.jvm.internal.AbstractC5470m;
import p021D.AbstractC0095c;
import p069J5.InterfaceC0789a;
import p090M5.AbstractC1238c;
import p118Q5.AbstractC2216i;
import p215e.AbstractC4141a;
import p365w.AbstractC6786b;

/* renamed from: d.e */
/* loaded from: classes.dex */
public abstract class AbstractC4095e {

    /* renamed from: h */
    public static final b f13641h = new b(null);

    /* renamed from: a */
    public final Map f13642a = new LinkedHashMap();

    /* renamed from: b */
    public final Map f13643b = new LinkedHashMap();

    /* renamed from: c */
    public final Map f13644c = new LinkedHashMap();

    /* renamed from: d */
    public final List f13645d = new ArrayList();

    /* renamed from: e */
    public final transient Map f13646e = new LinkedHashMap();

    /* renamed from: f */
    public final Map f13647f = new LinkedHashMap();

    /* renamed from: g */
    public final Bundle f13648g = new Bundle();

    /* renamed from: d.e$a */
    public static final class a {

        /* renamed from: a */
        public final InterfaceC4092b f13649a;

        /* renamed from: b */
        public final AbstractC4141a f13650b;

        public a(InterfaceC4092b callback, AbstractC4141a contract) {
            AbstractC5469l.m23028e(callback, "callback");
            AbstractC5469l.m23028e(contract, "contract");
            this.f13649a = callback;
            this.f13650b = contract;
        }

        /* renamed from: a */
        public final InterfaceC4092b m17175a() {
            return this.f13649a;
        }

        /* renamed from: b */
        public final AbstractC4141a m17176b() {
            return this.f13650b;
        }
    }

    /* renamed from: d.e$b */
    public static final class b {
        public /* synthetic */ b(AbstractC5464g abstractC5464g) {
            this();
        }

        public b() {
        }
    }

    /* renamed from: d.e$c */
    public static final class c extends AbstractC5470m implements InterfaceC0789a {

        /* renamed from: a */
        public static final c f13651a = new c();

        public c() {
            super(0);
        }

        @Override // p069J5.InterfaceC0789a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Integer invoke() {
            return Integer.valueOf(AbstractC1238c.f3902a.mo4742b(2147418112) + 65536);
        }
    }

    /* renamed from: d.e$d */
    public static final class d extends AbstractC4093c {

        /* renamed from: b */
        public final /* synthetic */ String f13653b;

        /* renamed from: c */
        public final /* synthetic */ AbstractC4141a f13654c;

        public d(String str, AbstractC4141a abstractC4141a) {
            this.f13653b = str;
            this.f13654c = abstractC4141a;
        }

        @Override // p207d.AbstractC4093c
        /* renamed from: b */
        public void mo17160b(Object obj, AbstractC6786b abstractC6786b) {
            Object obj2 = AbstractC4095e.this.f13643b.get(this.f13653b);
            AbstractC4141a abstractC4141a = this.f13654c;
            if (obj2 != null) {
                int intValue = ((Number) obj2).intValue();
                AbstractC4095e.this.f13645d.add(this.f13653b);
                try {
                    AbstractC4095e.this.mo14020h(intValue, this.f13654c, obj, abstractC6786b);
                    return;
                } catch (Exception e7) {
                    AbstractC4095e.this.f13645d.remove(this.f13653b);
                    throw e7;
                }
            }
            throw new IllegalStateException(("Attempting to launch an unregistered ActivityResultLauncher with contract " + abstractC4141a + " and input " + obj + ". You must ensure the ActivityResultLauncher is registered before calling launch().").toString());
        }

        @Override // p207d.AbstractC4093c
        /* renamed from: c */
        public void mo17161c() {
            AbstractC4095e.this.m17174m(this.f13653b);
        }
    }

    /* renamed from: c */
    public final void m17165c(int i7, String str) {
        this.f13642a.put(Integer.valueOf(i7), str);
        this.f13643b.put(str, Integer.valueOf(i7));
    }

    /* renamed from: d */
    public final boolean m17166d(int i7, int i8, Intent intent) {
        String str = (String) this.f13642a.get(Integer.valueOf(i7));
        if (str == null) {
            return false;
        }
        m17168f(str, i8, intent, (a) this.f13646e.get(str));
        return true;
    }

    /* renamed from: e */
    public final boolean m17167e(int i7, Object obj) {
        String str = (String) this.f13642a.get(Integer.valueOf(i7));
        if (str == null) {
            return false;
        }
        a aVar = (a) this.f13646e.get(str);
        if ((aVar != null ? aVar.m17175a() : null) == null) {
            this.f13648g.remove(str);
            this.f13647f.put(str, obj);
            return true;
        }
        InterfaceC4092b m17175a = aVar.m17175a();
        AbstractC5469l.m23026c(m17175a, "null cannot be cast to non-null type androidx.activity.result.ActivityResultCallback<O of androidx.activity.result.ActivityResultRegistry.dispatchResult>");
        if (!this.f13645d.remove(str)) {
            return true;
        }
        m17175a.mo9522a(obj);
        return true;
    }

    /* renamed from: f */
    public final void m17168f(String str, int i7, Intent intent, a aVar) {
        if ((aVar != null ? aVar.m17175a() : null) == null || !this.f13645d.contains(str)) {
            this.f13647f.remove(str);
            this.f13648g.putParcelable(str, new C4091a(i7, intent));
        } else {
            aVar.m17175a().mo9522a(aVar.m17176b().mo9534c(i7, intent));
            this.f13645d.remove(str);
        }
    }

    /* renamed from: g */
    public final int m17169g() {
        for (Number number : AbstractC2216i.m7620f(c.f13651a)) {
            if (!this.f13642a.containsKey(Integer.valueOf(number.intValue()))) {
                return number.intValue();
            }
        }
        throw new NoSuchElementException("Sequence contains no element matching the predicate.");
    }

    /* renamed from: h */
    public abstract void mo14020h(int i7, AbstractC4141a abstractC4141a, Object obj, AbstractC6786b abstractC6786b);

    /* renamed from: i */
    public final void m17170i(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        ArrayList<Integer> integerArrayList = bundle.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
        ArrayList<String> stringArrayList = bundle.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
        if (stringArrayList == null || integerArrayList == null) {
            return;
        }
        ArrayList<String> stringArrayList2 = bundle.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
        if (stringArrayList2 != null) {
            this.f13645d.addAll(stringArrayList2);
        }
        Bundle bundle2 = bundle.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT");
        if (bundle2 != null) {
            this.f13648g.putAll(bundle2);
        }
        int size = stringArrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            String str = stringArrayList.get(i7);
            if (this.f13643b.containsKey(str)) {
                Integer num = (Integer) this.f13643b.remove(str);
                if (!this.f13648g.containsKey(str)) {
                    AbstractC5457A.m23003a(this.f13642a).remove(num);
                }
            }
            Integer num2 = integerArrayList.get(i7);
            AbstractC5469l.m23027d(num2, "rcs[i]");
            int intValue = num2.intValue();
            String str2 = stringArrayList.get(i7);
            AbstractC5469l.m23027d(str2, "keys[i]");
            m17165c(intValue, str2);
        }
    }

    /* renamed from: j */
    public final void m17171j(Bundle outState) {
        AbstractC5469l.m23028e(outState, "outState");
        outState.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(this.f13643b.values()));
        outState.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(this.f13643b.keySet()));
        outState.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(this.f13645d));
        outState.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", new Bundle(this.f13648g));
    }

    /* renamed from: k */
    public final AbstractC4093c m17172k(String key, AbstractC4141a contract, InterfaceC4092b callback) {
        AbstractC5469l.m23028e(key, "key");
        AbstractC5469l.m23028e(contract, "contract");
        AbstractC5469l.m23028e(callback, "callback");
        m17173l(key);
        this.f13646e.put(key, new a(callback, contract));
        if (this.f13647f.containsKey(key)) {
            Object obj = this.f13647f.get(key);
            this.f13647f.remove(key);
            callback.mo9522a(obj);
        }
        C4091a c4091a = (C4091a) AbstractC0095c.m250a(this.f13648g, key, C4091a.class);
        if (c4091a != null) {
            this.f13648g.remove(key);
            callback.mo9522a(contract.mo9534c(c4091a.m17155b(), c4091a.m17154a()));
        }
        return new d(key, contract);
    }

    /* renamed from: l */
    public final void m17173l(String str) {
        if (((Integer) this.f13643b.get(str)) != null) {
            return;
        }
        m17165c(m17169g(), str);
    }

    /* renamed from: m */
    public final void m17174m(String key) {
        Integer num;
        AbstractC5469l.m23028e(key, "key");
        if (!this.f13645d.contains(key) && (num = (Integer) this.f13643b.remove(key)) != null) {
            this.f13642a.remove(num);
        }
        this.f13646e.remove(key);
        if (this.f13647f.containsKey(key)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + key + ": " + this.f13647f.get(key));
            this.f13647f.remove(key);
        }
        if (this.f13648g.containsKey(key)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + key + ": " + ((C4091a) AbstractC0095c.m250a(this.f13648g, key, C4091a.class)));
            this.f13648g.remove(key);
        }
        AbstractC4094d.m17162a(this.f13644c.get(key));
    }
}
