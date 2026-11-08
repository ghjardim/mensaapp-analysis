package p368w2;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.app.FragmentManager;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import com.google.android.gms.common.internal.AbstractC3802r;

/* renamed from: w2.c */
/* loaded from: classes.dex */
public class DialogFragmentC6862c extends DialogFragment {

    /* renamed from: a */
    public Dialog f24679a;

    /* renamed from: b */
    public DialogInterface.OnCancelListener f24680b;

    /* renamed from: c */
    public Dialog f24681c;

    /* renamed from: a */
    public static DialogFragmentC6862c m28245a(Dialog dialog, DialogInterface.OnCancelListener onCancelListener) {
        DialogFragmentC6862c dialogFragmentC6862c = new DialogFragmentC6862c();
        Dialog dialog2 = (Dialog) AbstractC3802r.m15130l(dialog, "Cannot display null dialog");
        dialog2.setOnCancelListener(null);
        dialog2.setOnDismissListener(null);
        dialogFragmentC6862c.f24679a = dialog2;
        if (onCancelListener != null) {
            dialogFragmentC6862c.f24680b = onCancelListener;
        }
        return dialogFragmentC6862c;
    }

    @Override // android.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f24680b;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    @Override // android.app.DialogFragment
    public Dialog onCreateDialog(Bundle bundle) {
        Dialog dialog = this.f24679a;
        if (dialog != null) {
            return dialog;
        }
        setShowsDialog(false);
        if (this.f24681c == null) {
            this.f24681c = new AlertDialog.Builder((Context) AbstractC3802r.m15129k(getActivity())).create();
        }
        return this.f24681c;
    }

    @Override // android.app.DialogFragment
    public void show(FragmentManager fragmentManager, String str) {
        super.show(fragmentManager, str);
    }
}
