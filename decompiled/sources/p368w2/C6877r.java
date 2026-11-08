package p368w2;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import com.google.android.gms.common.internal.AbstractC3802r;
import p161X.AbstractC2752I;
import p161X.DialogInterfaceOnCancelListenerC2784n;

/* renamed from: w2.r */
/* loaded from: classes.dex */
public class C6877r extends DialogInterfaceOnCancelListenerC2784n {

    /* renamed from: B0 */
    public Dialog f24703B0;

    /* renamed from: C0 */
    public DialogInterface.OnCancelListener f24704C0;

    /* renamed from: D0 */
    public Dialog f24705D0;

    /* renamed from: P1 */
    public static C6877r m28297P1(Dialog dialog, DialogInterface.OnCancelListener onCancelListener) {
        C6877r c6877r = new C6877r();
        Dialog dialog2 = (Dialog) AbstractC3802r.m15130l(dialog, "Cannot display null dialog");
        dialog2.setOnCancelListener(null);
        dialog2.setOnDismissListener(null);
        c6877r.f24703B0 = dialog2;
        if (onCancelListener != null) {
            c6877r.f24704C0 = onCancelListener;
        }
        return c6877r;
    }

    @Override // p161X.DialogInterfaceOnCancelListenerC2784n
    /* renamed from: I1 */
    public Dialog mo9785I1(Bundle bundle) {
        Dialog dialog = this.f24703B0;
        if (dialog != null) {
            return dialog;
        }
        m9791M1(false);
        if (this.f24705D0 == null) {
            this.f24705D0 = new AlertDialog.Builder((Context) AbstractC3802r.m15129k(m9902t())).create();
        }
        return this.f24705D0;
    }

    @Override // p161X.DialogInterfaceOnCancelListenerC2784n
    /* renamed from: O1 */
    public void mo9794O1(AbstractC2752I abstractC2752I, String str) {
        super.mo9794O1(abstractC2752I, str);
    }

    @Override // p161X.DialogInterfaceOnCancelListenerC2784n, android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f24704C0;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }
}
