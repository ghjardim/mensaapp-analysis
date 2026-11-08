package p070K;

import android.widget.ListView;

/* renamed from: K.e */
/* loaded from: classes.dex */
public class C0816e extends AbstractViewOnTouchListenerC0812a {

    /* renamed from: z */
    public final ListView f2836z;

    public C0816e(ListView listView) {
        super(listView);
        this.f2836z = listView;
    }

    @Override // p070K.AbstractViewOnTouchListenerC0812a
    /* renamed from: a */
    public boolean mo3353a(int i7) {
        return false;
    }

    @Override // p070K.AbstractViewOnTouchListenerC0812a
    /* renamed from: b */
    public boolean mo3354b(int i7) {
        ListView listView = this.f2836z;
        int count = listView.getCount();
        if (count == 0) {
            return false;
        }
        int childCount = listView.getChildCount();
        int firstVisiblePosition = listView.getFirstVisiblePosition();
        int i8 = firstVisiblePosition + childCount;
        if (i7 > 0) {
            if (i8 >= count && listView.getChildAt(childCount - 1).getBottom() <= listView.getHeight()) {
                return false;
            }
        } else {
            if (i7 >= 0) {
                return false;
            }
            if (firstVisiblePosition <= 0 && listView.getChildAt(0).getTop() >= 0) {
                return false;
            }
        }
        return true;
    }

    @Override // p070K.AbstractViewOnTouchListenerC0812a
    /* renamed from: j */
    public void mo3360j(int i7, int i8) {
        this.f2836z.scrollListBy(i8);
    }
}
