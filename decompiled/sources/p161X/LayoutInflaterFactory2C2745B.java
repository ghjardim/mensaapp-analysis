package p161X;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import p154W.AbstractC2652c;
import p168Y.C2884c;

/* renamed from: X.B */
/* loaded from: classes.dex */
public class LayoutInflaterFactory2C2745B implements LayoutInflater.Factory2 {

    /* renamed from: a */
    public final AbstractC2752I f8095a;

    public LayoutInflaterFactory2C2745B(AbstractC2752I abstractC2752I) {
        this.f8095a = abstractC2752I;
    }

    @Override // android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    @Override // android.view.LayoutInflater.Factory2
    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        C2758O m9511v;
        if (C2794x.class.getName().equals(str)) {
            return new C2794x(context, attributeSet, this.f8095a);
        }
        if (!"fragment".equals(str)) {
            return null;
        }
        String attributeValue = attributeSet.getAttributeValue(null, "class");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC2652c.f7864a);
        if (attributeValue == null) {
            attributeValue = obtainStyledAttributes.getString(AbstractC2652c.f7865b);
        }
        int resourceId = obtainStyledAttributes.getResourceId(AbstractC2652c.f7866c, -1);
        String string = obtainStyledAttributes.getString(AbstractC2652c.f7867d);
        obtainStyledAttributes.recycle();
        if (attributeValue == null || !AbstractC2796z.m9971b(context.getClassLoader(), attributeValue)) {
            return null;
        }
        int id = view != null ? view.getId() : 0;
        if (id == -1 && resourceId == -1 && string == null) {
            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
        }
        AbstractComponentCallbacksC2786p m9473h0 = resourceId != -1 ? this.f8095a.m9473h0(resourceId) : null;
        if (m9473h0 == null && string != null) {
            m9473h0 = this.f8095a.m9476i0(string);
        }
        if (m9473h0 == null && id != -1) {
            m9473h0 = this.f8095a.m9473h0(id);
        }
        if (m9473h0 == null) {
            m9473h0 = this.f8095a.m9506t0().mo9528a(context.getClassLoader(), attributeValue);
            m9473h0.f8470w = true;
            m9473h0.f8424F = resourceId != 0 ? resourceId : id;
            m9473h0.f8425G = id;
            m9473h0.f8426H = string;
            m9473h0.f8471x = true;
            AbstractC2752I abstractC2752I = this.f8095a;
            m9473h0.f8420B = abstractC2752I;
            m9473h0.f8421C = abstractC2752I.m9512v0();
            m9473h0.m9809A0(this.f8095a.m9512v0().m9376t(), attributeSet, m9473h0.f8447b);
            m9511v = this.f8095a.m9475i(m9473h0);
            if (AbstractC2752I.m9397I0(2)) {
                Log.v("FragmentManager", "Fragment " + m9473h0 + " has been inflated via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
            }
        } else {
            if (m9473h0.f8471x) {
                throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(id) + " with another fragment for " + attributeValue);
            }
            m9473h0.f8471x = true;
            AbstractC2752I abstractC2752I2 = this.f8095a;
            m9473h0.f8420B = abstractC2752I2;
            m9473h0.f8421C = abstractC2752I2.m9512v0();
            m9473h0.m9809A0(this.f8095a.m9512v0().m9376t(), attributeSet, m9473h0.f8447b);
            m9511v = this.f8095a.m9511v(m9473h0);
            if (AbstractC2752I.m9397I0(2)) {
                Log.v("FragmentManager", "Retained Fragment " + m9473h0 + " has been re-attached via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
            }
        }
        ViewGroup viewGroup = (ViewGroup) view;
        C2884c.m10403g(m9473h0, viewGroup);
        m9473h0.f8434P = viewGroup;
        m9511v.m9574m();
        m9511v.m9571j();
        View view2 = m9473h0.f8435Q;
        if (view2 == null) {
            throw new IllegalStateException("Fragment " + attributeValue + " did not create a view.");
        }
        if (resourceId != 0) {
            view2.setId(resourceId);
        }
        if (m9473h0.f8435Q.getTag() == null) {
            m9473h0.f8435Q.setTag(string);
        }
        m9473h0.f8435Q.addOnAttachStateChangeListener(new a(m9511v));
        return m9473h0.f8435Q;
    }

    /* renamed from: X.B$a */
    public class a implements View.OnAttachStateChangeListener {

        /* renamed from: a */
        public final /* synthetic */ C2758O f8096a;

        public a(C2758O c2758o) {
            this.f8096a = c2758o;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            AbstractComponentCallbacksC2786p m9572k = this.f8096a.m9572k();
            this.f8096a.m9574m();
            AbstractC2768Z.m9656u((ViewGroup) m9572k.f8435Q.getParent(), LayoutInflaterFactory2C2745B.this.f8095a).m9672q();
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }
}
