package p207d;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.AbstractC5464g;
import kotlin.jvm.internal.AbstractC5469l;

/* renamed from: d.g */
/* loaded from: classes.dex */
public final class C4097g implements Parcelable {

    /* renamed from: a */
    public final IntentSender f13656a;

    /* renamed from: b */
    public final Intent f13657b;

    /* renamed from: c */
    public final int f13658c;

    /* renamed from: d */
    public final int f13659d;

    /* renamed from: e */
    public static final c f13655e = new c(null);
    public static final Parcelable.Creator<C4097g> CREATOR = new b();

    /* renamed from: d.g$a */
    public static final class a {

        /* renamed from: a */
        public final IntentSender f13660a;

        /* renamed from: b */
        public Intent f13661b;

        /* renamed from: c */
        public int f13662c;

        /* renamed from: d */
        public int f13663d;

        public a(IntentSender intentSender) {
            AbstractC5469l.m23028e(intentSender, "intentSender");
            this.f13660a = intentSender;
        }

        /* renamed from: a */
        public final C4097g m17182a() {
            return new C4097g(this.f13660a, this.f13661b, this.f13662c, this.f13663d);
        }

        /* renamed from: b */
        public final a m17183b(Intent intent) {
            this.f13661b = intent;
            return this;
        }

        /* renamed from: c */
        public final a m17184c(int i7, int i8) {
            this.f13663d = i7;
            this.f13662c = i8;
            return this;
        }
    }

    /* renamed from: d.g$b */
    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C4097g createFromParcel(Parcel inParcel) {
            AbstractC5469l.m23028e(inParcel, "inParcel");
            return new C4097g(inParcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C4097g[] newArray(int i7) {
            return new C4097g[i7];
        }
    }

    /* renamed from: d.g$c */
    public static final class c {
        public /* synthetic */ c(AbstractC5464g abstractC5464g) {
            this();
        }

        public c() {
        }
    }

    public C4097g(IntentSender intentSender, Intent intent, int i7, int i8) {
        AbstractC5469l.m23028e(intentSender, "intentSender");
        this.f13656a = intentSender;
        this.f13657b = intent;
        this.f13658c = i7;
        this.f13659d = i8;
    }

    /* renamed from: a */
    public final Intent m17178a() {
        return this.f13657b;
    }

    /* renamed from: b */
    public final int m17179b() {
        return this.f13658c;
    }

    /* renamed from: c */
    public final int m17180c() {
        return this.f13659d;
    }

    /* renamed from: d */
    public final IntentSender m17181d() {
        return this.f13656a;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int i7) {
        AbstractC5469l.m23028e(dest, "dest");
        dest.writeParcelable(this.f13656a, i7);
        dest.writeParcelable(this.f13657b, i7);
        dest.writeInt(this.f13658c);
        dest.writeInt(this.f13659d);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C4097g(android.os.Parcel r4) {
        /*
            r3 = this;
            java.lang.String r0 = "parcel"
            kotlin.jvm.internal.AbstractC5469l.m23028e(r4, r0)
            java.lang.Class<android.content.IntentSender> r0 = android.content.IntentSender.class
            java.lang.ClassLoader r0 = r0.getClassLoader()
            android.os.Parcelable r0 = r4.readParcelable(r0)
            kotlin.jvm.internal.AbstractC5469l.m23025b(r0)
            android.content.IntentSender r0 = (android.content.IntentSender) r0
            java.lang.Class<android.content.Intent> r1 = android.content.Intent.class
            java.lang.ClassLoader r1 = r1.getClassLoader()
            android.os.Parcelable r1 = r4.readParcelable(r1)
            android.content.Intent r1 = (android.content.Intent) r1
            int r2 = r4.readInt()
            int r4 = r4.readInt()
            r3.<init>(r0, r1, r2, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p207d.C4097g.<init>(android.os.Parcel):void");
    }
}
