package io.flutter.plugin.editing;

import android.view.textservice.SentenceSuggestionsInfo;
import android.view.textservice.SpellCheckerSession;
import android.view.textservice.SuggestionsInfo;
import android.view.textservice.TextInfo;
import android.view.textservice.TextServicesManager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import org.apache.tika.utils.StringUtils;
import p054H4.C0587w;
import p061I4.C0659k;
import p068J4.C0788e;

/* renamed from: io.flutter.plugin.editing.s */
/* loaded from: classes.dex */
public class SpellCheckerSessionSpellCheckerSessionListenerC4718s implements C0587w.b, SpellCheckerSession.SpellCheckerSessionListener {

    /* renamed from: a */
    public final C0587w f17491a;

    /* renamed from: b */
    public final TextServicesManager f17492b;

    /* renamed from: c */
    public SpellCheckerSession f17493c;

    /* renamed from: d */
    public C0659k.d f17494d;

    public SpellCheckerSessionSpellCheckerSessionListenerC4718s(TextServicesManager textServicesManager, C0587w c0587w) {
        this.f17492b = textServicesManager;
        this.f17491a = c0587w;
        c0587w.m2345b(this);
    }

    @Override // p054H4.C0587w.b
    /* renamed from: a */
    public void mo2346a(String str, String str2, C0659k.d dVar) {
        if (this.f17494d != null) {
            dVar.mo2315b("error", "Previous spell check request still pending.", null);
        } else {
            this.f17494d = dVar;
            m20400c(str, str2);
        }
    }

    /* renamed from: b */
    public void m20399b() {
        this.f17491a.m2345b(null);
        SpellCheckerSession spellCheckerSession = this.f17493c;
        if (spellCheckerSession != null) {
            spellCheckerSession.close();
        }
    }

    /* renamed from: c */
    public void m20400c(String str, String str2) {
        Locale m3347b = C0788e.m3347b(str);
        if (this.f17493c == null) {
            this.f17493c = this.f17492b.newSpellCheckerSession(null, m3347b, this, true);
        }
        this.f17493c.getSentenceSuggestions(new TextInfo[]{new TextInfo(str2)}, 5);
    }

    @Override // android.view.textservice.SpellCheckerSession.SpellCheckerSessionListener
    public void onGetSentenceSuggestions(SentenceSuggestionsInfo[] sentenceSuggestionsInfoArr) {
        if (sentenceSuggestionsInfoArr.length == 0) {
            this.f17494d.mo2314a(new ArrayList());
            this.f17494d = null;
            return;
        }
        ArrayList arrayList = new ArrayList();
        SentenceSuggestionsInfo sentenceSuggestionsInfo = sentenceSuggestionsInfoArr[0];
        if (sentenceSuggestionsInfo == null) {
            this.f17494d.mo2314a(new ArrayList());
            this.f17494d = null;
            return;
        }
        for (int i7 = 0; i7 < sentenceSuggestionsInfo.getSuggestionsCount(); i7++) {
            SuggestionsInfo suggestionsInfoAt = sentenceSuggestionsInfo.getSuggestionsInfoAt(i7);
            int suggestionsCount = suggestionsInfoAt.getSuggestionsCount();
            if (suggestionsCount > 0) {
                HashMap hashMap = new HashMap();
                int offsetAt = sentenceSuggestionsInfo.getOffsetAt(i7);
                int lengthAt = sentenceSuggestionsInfo.getLengthAt(i7) + offsetAt;
                hashMap.put("startIndex", Integer.valueOf(offsetAt));
                hashMap.put("endIndex", Integer.valueOf(lengthAt));
                ArrayList arrayList2 = new ArrayList();
                boolean z6 = false;
                for (int i8 = 0; i8 < suggestionsCount; i8++) {
                    String suggestionAt = suggestionsInfoAt.getSuggestionAt(i8);
                    if (!suggestionAt.equals(StringUtils.EMPTY)) {
                        arrayList2.add(suggestionAt);
                        z6 = true;
                    }
                }
                if (z6) {
                    hashMap.put("suggestions", arrayList2);
                    arrayList.add(hashMap);
                }
            }
        }
        this.f17494d.mo2314a(arrayList);
        this.f17494d = null;
    }

    @Override // android.view.textservice.SpellCheckerSession.SpellCheckerSessionListener
    public void onGetSuggestions(SuggestionsInfo[] suggestionsInfoArr) {
    }
}
