package org.apache.tika.language.detect;

import java.util.Locale;
import org.apache.tika.utils.StringUtils;

/* loaded from: classes2.dex */
public class LanguageResult {
    public static final LanguageResult NULL = new LanguageResult(StringUtils.EMPTY, LanguageConfidence.NONE, 0.0f);
    private final LanguageConfidence confidence;
    private final String language;
    private final float rawScore;

    public LanguageResult(String str, LanguageConfidence languageConfidence, float f7) {
        this.language = str;
        this.confidence = languageConfidence;
        this.rawScore = f7;
    }

    public LanguageConfidence getConfidence() {
        return this.confidence;
    }

    public String getLanguage() {
        return this.language;
    }

    public float getRawScore() {
        return this.rawScore;
    }

    public boolean isLanguage(String str) {
        String[] split = str.split("\\-");
        String[] split2 = this.language.split("\\-");
        int min = Math.min(split.length, split2.length);
        for (int i7 = 0; i7 < min; i7++) {
            if (!split[i7].equalsIgnoreCase(split2[i7])) {
                return false;
            }
        }
        return true;
    }

    public boolean isReasonablyCertain() {
        return this.confidence == LanguageConfidence.HIGH;
    }

    public boolean isUnknown() {
        return this.confidence == LanguageConfidence.NONE;
    }

    public String toString() {
        return String.format(Locale.US, "%s: %s (%f)", this.language, this.confidence, Float.valueOf(this.rawScore));
    }
}
