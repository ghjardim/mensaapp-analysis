package io.flutter.plugin.editing;

import android.content.ClipData;
import android.content.ClipDescription;
import android.content.ClipboardManager;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.DynamicLayout;
import android.text.Editable;
import android.text.Layout;
import android.text.Selection;
import android.text.TextPaint;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.InputContentInfo;
import android.view.inputmethod.InputMethodManager;
import com.google.android.gms.common.api.C3643a;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.plugin.editing.C4713n;
import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import org.apache.tika.utils.StringUtils;
import p054H4.C0585u;
import p054H4.C0589y;
import p370w4.AbstractC6917b;

/* renamed from: io.flutter.plugin.editing.m */
/* loaded from: classes.dex */
public class C4712m extends BaseInputConnection implements C4713n.b {

    /* renamed from: a */
    public final View f17459a;

    /* renamed from: b */
    public final int f17460b;

    /* renamed from: c */
    public final C0585u f17461c;

    /* renamed from: d */
    public final C0589y f17462d;

    /* renamed from: e */
    public final C4713n f17463e;

    /* renamed from: f */
    public final EditorInfo f17464f;

    /* renamed from: g */
    public ExtractedTextRequest f17465g;

    /* renamed from: h */
    public boolean f17466h;

    /* renamed from: i */
    public CursorAnchorInfo.Builder f17467i;

    /* renamed from: j */
    public ExtractedText f17468j;

    /* renamed from: k */
    public InputMethodManager f17469k;

    /* renamed from: l */
    public final Layout f17470l;

    /* renamed from: m */
    public C4700a f17471m;

    /* renamed from: n */
    public final a f17472n;

    /* renamed from: o */
    public int f17473o;

    /* renamed from: io.flutter.plugin.editing.m$a */
    public interface a {
        /* renamed from: a */
        boolean mo20381a(KeyEvent keyEvent);
    }

    public C4712m(View view, int i7, C0589y c0589y, C0585u c0585u, a aVar, C4713n c4713n, EditorInfo editorInfo, FlutterJNI flutterJNI) {
        super(view, true);
        this.f17466h = false;
        this.f17468j = new ExtractedText();
        this.f17473o = 0;
        this.f17459a = view;
        this.f17460b = i7;
        this.f17462d = c0589y;
        this.f17461c = c0585u;
        this.f17463e = c4713n;
        c4713n.m20382a(this);
        this.f17464f = editorInfo;
        this.f17472n = aVar;
        this.f17471m = new C4700a(flutterJNI);
        this.f17470l = new DynamicLayout(c4713n, new TextPaint(), C3643a.e.API_PRIORITY_OTHER, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        this.f17469k = (InputMethodManager) view.getContext().getSystemService("input_method");
    }

    @Override // io.flutter.plugin.editing.C4713n.b
    /* renamed from: a */
    public void mo20336a(boolean z6, boolean z7, boolean z8) {
        this.f17469k.updateSelection(this.f17459a, this.f17463e.m20390i(), this.f17463e.m20389h(), this.f17463e.m20388g(), this.f17463e.m20387f());
        ExtractedTextRequest extractedTextRequest = this.f17465g;
        if (extractedTextRequest != null) {
            this.f17469k.updateExtractedText(this.f17459a, extractedTextRequest.token, m20376d(extractedTextRequest));
        }
        if (this.f17466h) {
            this.f17469k.updateCursorAnchorInfo(this.f17459a, m20375c());
        }
    }

    /* renamed from: b */
    public final boolean m20374b(int i7) {
        if (i7 == 16908319) {
            setSelection(0, this.f17463e.length());
            return true;
        }
        if (i7 == 16908320) {
            int selectionStart = Selection.getSelectionStart(this.f17463e);
            int selectionEnd = Selection.getSelectionEnd(this.f17463e);
            if (selectionStart != selectionEnd) {
                int min = Math.min(selectionStart, selectionEnd);
                int max = Math.max(selectionStart, selectionEnd);
                ((ClipboardManager) this.f17459a.getContext().getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("text label?", this.f17463e.subSequence(min, max)));
                this.f17463e.delete(min, max);
                setSelection(min, min);
            }
            return true;
        }
        if (i7 == 16908321) {
            int selectionStart2 = Selection.getSelectionStart(this.f17463e);
            int selectionEnd2 = Selection.getSelectionEnd(this.f17463e);
            if (selectionStart2 != selectionEnd2) {
                ((ClipboardManager) this.f17459a.getContext().getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("text label?", this.f17463e.subSequence(Math.min(selectionStart2, selectionEnd2), Math.max(selectionStart2, selectionEnd2))));
            }
            return true;
        }
        if (i7 != 16908322) {
            return false;
        }
        ClipData primaryClip = ((ClipboardManager) this.f17459a.getContext().getSystemService("clipboard")).getPrimaryClip();
        if (primaryClip != null) {
            CharSequence coerceToText = primaryClip.getItemAt(0).coerceToText(this.f17459a.getContext());
            int max2 = Math.max(0, Selection.getSelectionStart(this.f17463e));
            int max3 = Math.max(0, Selection.getSelectionEnd(this.f17463e));
            int min2 = Math.min(max2, max3);
            int max4 = Math.max(max2, max3);
            if (min2 != max4) {
                this.f17463e.delete(min2, max4);
            }
            this.f17463e.insert(min2, coerceToText);
            int length = min2 + coerceToText.length();
            setSelection(length, length);
        }
        return true;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean beginBatchEdit() {
        this.f17463e.m20383b();
        this.f17473o++;
        return super.beginBatchEdit();
    }

    /* renamed from: c */
    public final CursorAnchorInfo m20375c() {
        CursorAnchorInfo.Builder builder = this.f17467i;
        if (builder == null) {
            this.f17467i = new CursorAnchorInfo.Builder();
        } else {
            builder.reset();
        }
        this.f17467i.setSelectionRange(this.f17463e.m20390i(), this.f17463e.m20389h());
        int m20388g = this.f17463e.m20388g();
        int m20387f = this.f17463e.m20387f();
        if (m20388g < 0 || m20387f <= m20388g) {
            this.f17467i.setComposingText(-1, StringUtils.EMPTY);
        } else {
            this.f17467i.setComposingText(m20388g, this.f17463e.toString().subSequence(m20388g, m20387f));
        }
        return this.f17467i.build();
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean clearMetaKeyStates(int i7) {
        return super.clearMetaKeyStates(i7);
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public void closeConnection() {
        super.closeConnection();
        this.f17463e.m20393l(this);
        while (this.f17473o > 0) {
            endBatchEdit();
            this.f17473o--;
        }
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean commitContent(InputContentInfo inputContentInfo, int i7, Bundle bundle) {
        ClipDescription description;
        Uri contentUri;
        ClipDescription description2;
        if (Build.VERSION.SDK_INT >= 25 && (i7 & 1) != 0) {
            try {
                inputContentInfo.requestPermission();
                description = inputContentInfo.getDescription();
                if (description.getMimeTypeCount() > 0) {
                    inputContentInfo.requestPermission();
                    contentUri = inputContentInfo.getContentUri();
                    description2 = inputContentInfo.getDescription();
                    String mimeType = description2.getMimeType(0);
                    Context context = this.f17459a.getContext();
                    if (contentUri != null) {
                        try {
                            InputStream openInputStream = context.getContentResolver().openInputStream(contentUri);
                            if (openInputStream != null) {
                                byte[] m20380h = m20380h(openInputStream, 65536);
                                HashMap hashMap = new HashMap();
                                hashMap.put("mimeType", mimeType);
                                hashMap.put("data", m20380h);
                                hashMap.put("uri", contentUri.toString());
                                this.f17462d.m2351b(this.f17460b, hashMap);
                                inputContentInfo.releasePermission();
                                return true;
                            }
                        } catch (FileNotFoundException unused) {
                            inputContentInfo.releasePermission();
                            return false;
                        }
                    }
                    inputContentInfo.releasePermission();
                }
            } catch (Exception unused2) {
            }
        }
        return false;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean commitText(CharSequence charSequence, int i7) {
        return super.commitText(charSequence, i7);
    }

    /* renamed from: d */
    public final ExtractedText m20376d(ExtractedTextRequest extractedTextRequest) {
        ExtractedText extractedText = this.f17468j;
        extractedText.startOffset = 0;
        extractedText.partialStartOffset = -1;
        extractedText.partialEndOffset = -1;
        extractedText.selectionStart = this.f17463e.m20390i();
        this.f17468j.selectionEnd = this.f17463e.m20389h();
        this.f17468j.text = (extractedTextRequest == null || (extractedTextRequest.flags & 1) == 0) ? this.f17463e.toString() : this.f17463e;
        return this.f17468j;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean deleteSurroundingText(int i7, int i8) {
        if (this.f17463e.m20390i() == -1) {
            return true;
        }
        return super.deleteSurroundingText(i7, i8);
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean deleteSurroundingTextInCodePoints(int i7, int i8) {
        return super.deleteSurroundingTextInCodePoints(i7, i8);
    }

    /* renamed from: e */
    public final boolean m20377e(boolean z6, boolean z7) {
        int selectionStart = Selection.getSelectionStart(this.f17463e);
        int selectionEnd = Selection.getSelectionEnd(this.f17463e);
        if (selectionStart < 0 || selectionEnd < 0) {
            return false;
        }
        int max = z6 ? Math.max(this.f17471m.m20355b(this.f17463e, selectionEnd), 0) : Math.min(this.f17471m.m20354a(this.f17463e, selectionEnd), this.f17463e.length());
        if (selectionStart != selectionEnd || z7) {
            setSelection(selectionStart, max);
            return true;
        }
        setSelection(max, max);
        return true;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean endBatchEdit() {
        boolean endBatchEdit = super.endBatchEdit();
        this.f17473o--;
        this.f17463e.m20385d();
        return endBatchEdit;
    }

    /* renamed from: f */
    public boolean m20378f(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 0) {
            if (keyEvent.getKeyCode() == 21) {
                return m20377e(true, keyEvent.isShiftPressed());
            }
            if (keyEvent.getKeyCode() == 22) {
                return m20377e(false, keyEvent.isShiftPressed());
            }
            if (keyEvent.getKeyCode() == 19) {
                return m20379g(true, keyEvent.isShiftPressed());
            }
            if (keyEvent.getKeyCode() == 20) {
                return m20379g(false, keyEvent.isShiftPressed());
            }
            if (keyEvent.getKeyCode() == 66 || keyEvent.getKeyCode() == 160) {
                EditorInfo editorInfo = this.f17464f;
                if ((editorInfo.inputType & 131072) == 0) {
                    performEditorAction(editorInfo.imeOptions & 255);
                    return true;
                }
            }
            int selectionStart = Selection.getSelectionStart(this.f17463e);
            int selectionEnd = Selection.getSelectionEnd(this.f17463e);
            int unicodeChar = keyEvent.getUnicodeChar();
            if (selectionStart >= 0 && selectionEnd >= 0 && unicodeChar != 0) {
                int min = Math.min(selectionStart, selectionEnd);
                int max = Math.max(selectionStart, selectionEnd);
                beginBatchEdit();
                if (min != max) {
                    this.f17463e.delete(min, max);
                }
                this.f17463e.insert(min, (CharSequence) String.valueOf((char) unicodeChar));
                int i7 = min + 1;
                setSelection(i7, i7);
                endBatchEdit();
                return true;
            }
        }
        return false;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean finishComposingText() {
        return super.finishComposingText();
    }

    /* renamed from: g */
    public final boolean m20379g(boolean z6, boolean z7) {
        int selectionStart = Selection.getSelectionStart(this.f17463e);
        int selectionEnd = Selection.getSelectionEnd(this.f17463e);
        boolean z8 = false;
        if (selectionStart < 0 || selectionEnd < 0) {
            return false;
        }
        if (selectionStart == selectionEnd && !z7) {
            z8 = true;
        }
        beginBatchEdit();
        if (z8) {
            if (z6) {
                Selection.moveUp(this.f17463e, this.f17470l);
            } else {
                Selection.moveDown(this.f17463e, this.f17470l);
            }
            int selectionStart2 = Selection.getSelectionStart(this.f17463e);
            setSelection(selectionStart2, selectionStart2);
        } else {
            if (z6) {
                Selection.extendUp(this.f17463e, this.f17470l);
            } else {
                Selection.extendDown(this.f17463e, this.f17470l);
            }
            setSelection(Selection.getSelectionStart(this.f17463e), Selection.getSelectionEnd(this.f17463e));
        }
        endBatchEdit();
        return true;
    }

    @Override // android.view.inputmethod.BaseInputConnection
    public Editable getEditable() {
        return this.f17463e;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public ExtractedText getExtractedText(ExtractedTextRequest extractedTextRequest, int i7) {
        boolean z6 = (i7 & 1) != 0;
        if (z6 == (this.f17465g == null)) {
            StringBuilder sb = new StringBuilder();
            sb.append("The input method toggled text monitoring ");
            sb.append(z6 ? "on" : "off");
            AbstractC6917b.m28353a("InputConnectionAdaptor", sb.toString());
        }
        this.f17465g = z6 ? extractedTextRequest : null;
        return m20376d(extractedTextRequest);
    }

    /* renamed from: h */
    public final byte[] m20380h(InputStream inputStream, int i7) {
        int i8;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[i7];
        while (true) {
            try {
                i8 = inputStream.read(bArr);
            } catch (IOException unused) {
                i8 = -1;
            }
            if (i8 == -1) {
                return byteArrayOutputStream.toByteArray();
            }
            byteArrayOutputStream.write(bArr, 0, i8);
        }
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean performContextMenuAction(int i7) {
        beginBatchEdit();
        boolean m20374b = m20374b(i7);
        endBatchEdit();
        return m20374b;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean performEditorAction(int i7) {
        if (i7 == 0) {
            this.f17462d.m2362o(this.f17460b);
        } else if (i7 == 1) {
            this.f17462d.m2354g(this.f17460b);
        } else if (i7 == 2) {
            this.f17462d.m2353f(this.f17460b);
        } else if (i7 == 3) {
            this.f17462d.m2359l(this.f17460b);
        } else if (i7 == 4) {
            this.f17462d.m2360m(this.f17460b);
        } else if (i7 == 5) {
            this.f17462d.m2355h(this.f17460b);
        } else if (i7 != 7) {
            this.f17462d.m2352e(this.f17460b);
        } else {
            this.f17462d.m2357j(this.f17460b);
        }
        return true;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean performPrivateCommand(String str, Bundle bundle) {
        this.f17462d.m2356i(this.f17460b, str, bundle);
        return true;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean requestCursorUpdates(int i7) {
        if ((i7 & 1) != 0) {
            this.f17469k.updateCursorAnchorInfo(this.f17459a, m20375c());
        }
        boolean z6 = (i7 & 2) != 0;
        if (z6 != this.f17466h) {
            StringBuilder sb = new StringBuilder();
            sb.append("The input method toggled cursor monitoring ");
            sb.append(z6 ? "on" : "off");
            AbstractC6917b.m28353a("InputConnectionAdaptor", sb.toString());
        }
        this.f17466h = z6;
        return true;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean sendKeyEvent(KeyEvent keyEvent) {
        return this.f17472n.mo20381a(keyEvent);
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean setComposingRegion(int i7, int i8) {
        return super.setComposingRegion(i7, i8);
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean setComposingText(CharSequence charSequence, int i7) {
        beginBatchEdit();
        boolean commitText = charSequence.length() == 0 ? super.commitText(charSequence, i7) : super.setComposingText(charSequence, i7);
        endBatchEdit();
        return commitText;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean setSelection(int i7, int i8) {
        beginBatchEdit();
        boolean selection = super.setSelection(i7, i8);
        endBatchEdit();
        return selection;
    }

    public C4712m(View view, int i7, C0589y c0589y, C0585u c0585u, a aVar, C4713n c4713n, EditorInfo editorInfo) {
        this(view, i7, c0589y, c0585u, aVar, c4713n, editorInfo, new FlutterJNI());
    }
}
