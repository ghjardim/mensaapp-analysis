package p017C2;

import com.google.android.gms.common.internal.AbstractC3798p;
import com.google.android.gms.common.internal.AbstractC3802r;
import p017C2.AbstractC0076a;
import p382y2.InterfaceC7068d;

/* renamed from: C2.b */
/* loaded from: classes.dex */
public abstract class AbstractC0077b extends AbstractC0076a implements InterfaceC7068d {
    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!getClass().isInstance(obj)) {
            return false;
        }
        AbstractC0076a abstractC0076a = (AbstractC0076a) obj;
        for (AbstractC0076a.a aVar : getFieldMappings().values()) {
            if (isFieldSet(aVar)) {
                if (!abstractC0076a.isFieldSet(aVar) || !AbstractC3798p.m15099b(getFieldValue(aVar), abstractC0076a.getFieldValue(aVar))) {
                    return false;
                }
            } else if (abstractC0076a.isFieldSet(aVar)) {
                return false;
            }
        }
        return true;
    }

    @Override // p017C2.AbstractC0076a
    public Object getValueObject(String str) {
        return null;
    }

    public int hashCode() {
        int i7 = 0;
        for (AbstractC0076a.a aVar : getFieldMappings().values()) {
            if (isFieldSet(aVar)) {
                i7 = (i7 * 31) + AbstractC3802r.m15129k(getFieldValue(aVar)).hashCode();
            }
        }
        return i7;
    }

    @Override // p017C2.AbstractC0076a
    public boolean isPrimitiveFieldSet(String str) {
        return false;
    }
}
