package p035F;

import android.os.Build;
import android.os.LocaleList;
import android.text.PrecomputedText;
import android.text.Spannable;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import p042G.AbstractC0340b;

/* renamed from: F.l */
/* loaded from: classes.dex */
public abstract class AbstractC0313l implements Spannable {

    /* renamed from: F.l$a */
    public static final class a {

        /* renamed from: a */
        public final TextPaint f1146a;

        /* renamed from: b */
        public final TextDirectionHeuristic f1147b;

        /* renamed from: c */
        public final int f1148c;

        /* renamed from: d */
        public final int f1149d;

        /* renamed from: e */
        public final PrecomputedText.Params f1150e;

        /* renamed from: F.l$a$a, reason: collision with other inner class name */
        public static class C7166a {

            /* renamed from: a */
            public final TextPaint f1151a;

            /* renamed from: c */
            public int f1153c = 1;

            /* renamed from: d */
            public int f1154d = 1;

            /* renamed from: b */
            public TextDirectionHeuristic f1152b = TextDirectionHeuristics.FIRSTSTRONG_LTR;

            public C7166a(TextPaint textPaint) {
                this.f1151a = textPaint;
            }

            /* renamed from: a */
            public a m1227a() {
                return new a(this.f1151a, this.f1152b, this.f1153c, this.f1154d);
            }

            /* renamed from: b */
            public C7166a m1228b(int i7) {
                this.f1153c = i7;
                return this;
            }

            /* renamed from: c */
            public C7166a m1229c(int i7) {
                this.f1154d = i7;
                return this;
            }

            /* renamed from: d */
            public C7166a m1230d(TextDirectionHeuristic textDirectionHeuristic) {
                this.f1152b = textDirectionHeuristic;
                return this;
            }
        }

        public a(TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic, int i7, int i8) {
            PrecomputedText.Params.Builder breakStrategy;
            PrecomputedText.Params.Builder hyphenationFrequency;
            PrecomputedText.Params.Builder textDirection;
            PrecomputedText.Params build;
            if (Build.VERSION.SDK_INT >= 29) {
                breakStrategy = AbstractC0303b.m1212a(textPaint).setBreakStrategy(i7);
                hyphenationFrequency = breakStrategy.setHyphenationFrequency(i8);
                textDirection = hyphenationFrequency.setTextDirection(textDirectionHeuristic);
                build = textDirection.build();
                this.f1150e = build;
            } else {
                this.f1150e = null;
            }
            this.f1146a = textPaint;
            this.f1147b = textDirectionHeuristic;
            this.f1148c = i7;
            this.f1149d = i8;
        }

        /* renamed from: a */
        public boolean m1222a(a aVar) {
            LocaleList textLocales;
            LocaleList textLocales2;
            boolean equals;
            int i7 = Build.VERSION.SDK_INT;
            if (this.f1148c != aVar.m1223b() || this.f1149d != aVar.m1224c() || this.f1146a.getTextSize() != aVar.m1226e().getTextSize() || this.f1146a.getTextScaleX() != aVar.m1226e().getTextScaleX() || this.f1146a.getTextSkewX() != aVar.m1226e().getTextSkewX() || this.f1146a.getLetterSpacing() != aVar.m1226e().getLetterSpacing() || !TextUtils.equals(this.f1146a.getFontFeatureSettings(), aVar.m1226e().getFontFeatureSettings()) || this.f1146a.getFlags() != aVar.m1226e().getFlags()) {
                return false;
            }
            if (i7 >= 24) {
                textLocales = this.f1146a.getTextLocales();
                textLocales2 = aVar.m1226e().getTextLocales();
                equals = textLocales.equals(textLocales2);
                if (!equals) {
                    return false;
                }
            } else if (!this.f1146a.getTextLocale().equals(aVar.m1226e().getTextLocale())) {
                return false;
            }
            return this.f1146a.getTypeface() == null ? aVar.m1226e().getTypeface() == null : this.f1146a.getTypeface().equals(aVar.m1226e().getTypeface());
        }

        /* renamed from: b */
        public int m1223b() {
            return this.f1148c;
        }

        /* renamed from: c */
        public int m1224c() {
            return this.f1149d;
        }

        /* renamed from: d */
        public TextDirectionHeuristic m1225d() {
            return this.f1147b;
        }

        /* renamed from: e */
        public TextPaint m1226e() {
            return this.f1146a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return m1222a(aVar) && this.f1147b == aVar.m1225d();
        }

        public int hashCode() {
            LocaleList textLocales;
            if (Build.VERSION.SDK_INT < 24) {
                return AbstractC0340b.m1345b(Float.valueOf(this.f1146a.getTextSize()), Float.valueOf(this.f1146a.getTextScaleX()), Float.valueOf(this.f1146a.getTextSkewX()), Float.valueOf(this.f1146a.getLetterSpacing()), Integer.valueOf(this.f1146a.getFlags()), this.f1146a.getTextLocale(), this.f1146a.getTypeface(), Boolean.valueOf(this.f1146a.isElegantTextHeight()), this.f1147b, Integer.valueOf(this.f1148c), Integer.valueOf(this.f1149d));
            }
            Float valueOf = Float.valueOf(this.f1146a.getTextSize());
            Float valueOf2 = Float.valueOf(this.f1146a.getTextScaleX());
            Float valueOf3 = Float.valueOf(this.f1146a.getTextSkewX());
            Float valueOf4 = Float.valueOf(this.f1146a.getLetterSpacing());
            Integer valueOf5 = Integer.valueOf(this.f1146a.getFlags());
            textLocales = this.f1146a.getTextLocales();
            return AbstractC0340b.m1345b(valueOf, valueOf2, valueOf3, valueOf4, valueOf5, textLocales, this.f1146a.getTypeface(), Boolean.valueOf(this.f1146a.isElegantTextHeight()), this.f1147b, Integer.valueOf(this.f1148c), Integer.valueOf(this.f1149d));
        }

        public String toString() {
            String fontVariationSettings;
            LocaleList textLocales;
            StringBuilder sb = new StringBuilder("{");
            sb.append("textSize=" + this.f1146a.getTextSize());
            sb.append(", textScaleX=" + this.f1146a.getTextScaleX());
            sb.append(", textSkewX=" + this.f1146a.getTextSkewX());
            int i7 = Build.VERSION.SDK_INT;
            sb.append(", letterSpacing=" + this.f1146a.getLetterSpacing());
            sb.append(", elegantTextHeight=" + this.f1146a.isElegantTextHeight());
            if (i7 >= 24) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(", textLocale=");
                textLocales = this.f1146a.getTextLocales();
                sb2.append(textLocales);
                sb.append(sb2.toString());
            } else {
                sb.append(", textLocale=" + this.f1146a.getTextLocale());
            }
            sb.append(", typeface=" + this.f1146a.getTypeface());
            if (i7 >= 26) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(", variationSettings=");
                fontVariationSettings = this.f1146a.getFontVariationSettings();
                sb3.append(fontVariationSettings);
                sb.append(sb3.toString());
            }
            sb.append(", textDir=" + this.f1147b);
            sb.append(", breakStrategy=" + this.f1148c);
            sb.append(", hyphenationFrequency=" + this.f1149d);
            sb.append("}");
            return sb.toString();
        }

        public a(PrecomputedText.Params params) {
            TextPaint textPaint;
            TextDirectionHeuristic textDirection;
            int breakStrategy;
            int hyphenationFrequency;
            textPaint = params.getTextPaint();
            this.f1146a = textPaint;
            textDirection = params.getTextDirection();
            this.f1147b = textDirection;
            breakStrategy = params.getBreakStrategy();
            this.f1148c = breakStrategy;
            hyphenationFrequency = params.getHyphenationFrequency();
            this.f1149d = hyphenationFrequency;
            this.f1150e = Build.VERSION.SDK_INT < 29 ? null : params;
        }
    }
}
