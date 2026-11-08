package p224f0;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

/* renamed from: f0.a */
/* loaded from: classes.dex */
public final class C4225a {

    /* renamed from: f */
    public static final Object f14429f = new Object();

    /* renamed from: g */
    public static C4225a f14430g;

    /* renamed from: a */
    public final Context f14431a;

    /* renamed from: b */
    public final HashMap f14432b = new HashMap();

    /* renamed from: c */
    public final HashMap f14433c = new HashMap();

    /* renamed from: d */
    public final ArrayList f14434d = new ArrayList();

    /* renamed from: e */
    public final Handler f14435e;

    /* renamed from: f0.a$a */
    public class a extends Handler {
        public a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message.what != 1) {
                super.handleMessage(message);
            } else {
                C4225a.this.m17660a();
            }
        }
    }

    /* renamed from: f0.a$b */
    public static final class b {

        /* renamed from: a */
        public final Intent f14437a;

        /* renamed from: b */
        public final ArrayList f14438b;

        public b(Intent intent, ArrayList arrayList) {
            this.f14437a = intent;
            this.f14438b = arrayList;
        }
    }

    /* renamed from: f0.a$c */
    public static final class c {

        /* renamed from: a */
        public final IntentFilter f14439a;

        /* renamed from: b */
        public final BroadcastReceiver f14440b;

        /* renamed from: c */
        public boolean f14441c;

        /* renamed from: d */
        public boolean f14442d;

        public c(IntentFilter intentFilter, BroadcastReceiver broadcastReceiver) {
            this.f14439a = intentFilter;
            this.f14440b = broadcastReceiver;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(128);
            sb.append("Receiver{");
            sb.append(this.f14440b);
            sb.append(" filter=");
            sb.append(this.f14439a);
            if (this.f14442d) {
                sb.append(" DEAD");
            }
            sb.append("}");
            return sb.toString();
        }
    }

    public C4225a(Context context) {
        this.f14431a = context;
        this.f14435e = new a(context.getMainLooper());
    }

    /* renamed from: b */
    public static C4225a m17659b(Context context) {
        C4225a c4225a;
        synchronized (f14429f) {
            try {
                if (f14430g == null) {
                    f14430g = new C4225a(context.getApplicationContext());
                }
                c4225a = f14430g;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c4225a;
    }

    /* renamed from: a */
    public void m17660a() {
        int size;
        b[] bVarArr;
        while (true) {
            synchronized (this.f14432b) {
                try {
                    size = this.f14434d.size();
                    if (size <= 0) {
                        return;
                    }
                    bVarArr = new b[size];
                    this.f14434d.toArray(bVarArr);
                    this.f14434d.clear();
                } catch (Throwable th) {
                    throw th;
                }
            }
            for (int i7 = 0; i7 < size; i7++) {
                b bVar = bVarArr[i7];
                int size2 = bVar.f14438b.size();
                for (int i8 = 0; i8 < size2; i8++) {
                    c cVar = (c) bVar.f14438b.get(i8);
                    if (!cVar.f14442d) {
                        cVar.f14440b.onReceive(this.f14431a, bVar.f14437a);
                    }
                }
            }
        }
    }

    /* renamed from: c */
    public void m17661c(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        synchronized (this.f14432b) {
            try {
                c cVar = new c(intentFilter, broadcastReceiver);
                ArrayList arrayList = (ArrayList) this.f14432b.get(broadcastReceiver);
                if (arrayList == null) {
                    arrayList = new ArrayList(1);
                    this.f14432b.put(broadcastReceiver, arrayList);
                }
                arrayList.add(cVar);
                for (int i7 = 0; i7 < intentFilter.countActions(); i7++) {
                    String action = intentFilter.getAction(i7);
                    ArrayList arrayList2 = (ArrayList) this.f14433c.get(action);
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList(1);
                        this.f14433c.put(action, arrayList2);
                    }
                    arrayList2.add(cVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: d */
    public boolean m17662d(Intent intent) {
        int i7;
        String str;
        ArrayList arrayList;
        ArrayList arrayList2;
        String str2;
        synchronized (this.f14432b) {
            try {
                String action = intent.getAction();
                String resolveTypeIfNeeded = intent.resolveTypeIfNeeded(this.f14431a.getContentResolver());
                Uri data = intent.getData();
                String scheme = intent.getScheme();
                Set<String> categories = intent.getCategories();
                boolean z6 = (intent.getFlags() & 8) != 0;
                if (z6) {
                    Log.v("LocalBroadcastManager", "Resolving type " + resolveTypeIfNeeded + " scheme " + scheme + " of intent " + intent);
                }
                ArrayList arrayList3 = (ArrayList) this.f14433c.get(intent.getAction());
                if (arrayList3 != null) {
                    if (z6) {
                        Log.v("LocalBroadcastManager", "Action list: " + arrayList3);
                    }
                    ArrayList arrayList4 = null;
                    int i8 = 0;
                    while (i8 < arrayList3.size()) {
                        c cVar = (c) arrayList3.get(i8);
                        if (z6) {
                            Log.v("LocalBroadcastManager", "Matching against filter " + cVar.f14439a);
                        }
                        if (cVar.f14441c) {
                            if (z6) {
                                Log.v("LocalBroadcastManager", "  Filter's target already added");
                            }
                            i7 = i8;
                            arrayList2 = arrayList3;
                            str = action;
                            str2 = resolveTypeIfNeeded;
                            arrayList = arrayList4;
                        } else {
                            i7 = i8;
                            str = action;
                            arrayList = arrayList4;
                            arrayList2 = arrayList3;
                            str2 = resolveTypeIfNeeded;
                            int match = cVar.f14439a.match(action, resolveTypeIfNeeded, scheme, data, categories, "LocalBroadcastManager");
                            if (match >= 0) {
                                if (z6) {
                                    Log.v("LocalBroadcastManager", "  Filter matched!  match=0x" + Integer.toHexString(match));
                                }
                                arrayList4 = arrayList == null ? new ArrayList() : arrayList;
                                arrayList4.add(cVar);
                                cVar.f14441c = true;
                                i8 = i7 + 1;
                                action = str;
                                arrayList3 = arrayList2;
                                resolveTypeIfNeeded = str2;
                            } else if (z6) {
                                Log.v("LocalBroadcastManager", "  Filter did not match: " + (match != -4 ? match != -3 ? match != -2 ? match != -1 ? "unknown reason" : "type" : "data" : "action" : "category"));
                            }
                        }
                        arrayList4 = arrayList;
                        i8 = i7 + 1;
                        action = str;
                        arrayList3 = arrayList2;
                        resolveTypeIfNeeded = str2;
                    }
                    ArrayList arrayList5 = arrayList4;
                    if (arrayList5 != null) {
                        for (int i9 = 0; i9 < arrayList5.size(); i9++) {
                            ((c) arrayList5.get(i9)).f14441c = false;
                        }
                        this.f14434d.add(new b(intent, arrayList5));
                        if (!this.f14435e.hasMessages(1)) {
                            this.f14435e.sendEmptyMessage(1);
                        }
                        return true;
                    }
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: e */
    public void m17663e(BroadcastReceiver broadcastReceiver) {
        synchronized (this.f14432b) {
            try {
                ArrayList arrayList = (ArrayList) this.f14432b.remove(broadcastReceiver);
                if (arrayList == null) {
                    return;
                }
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    c cVar = (c) arrayList.get(size);
                    cVar.f14442d = true;
                    for (int i7 = 0; i7 < cVar.f14439a.countActions(); i7++) {
                        String action = cVar.f14439a.getAction(i7);
                        ArrayList arrayList2 = (ArrayList) this.f14433c.get(action);
                        if (arrayList2 != null) {
                            for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
                                c cVar2 = (c) arrayList2.get(size2);
                                if (cVar2.f14440b == broadcastReceiver) {
                                    cVar2.f14442d = true;
                                    arrayList2.remove(size2);
                                }
                            }
                            if (arrayList2.size() <= 0) {
                                this.f14433c.remove(action);
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
