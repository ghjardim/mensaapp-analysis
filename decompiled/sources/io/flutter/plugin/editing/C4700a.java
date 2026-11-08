package io.flutter.plugin.editing;

import io.flutter.embedding.engine.FlutterJNI;

/* renamed from: io.flutter.plugin.editing.a */
/* loaded from: classes.dex */
public class C4700a {

    /* renamed from: a */
    public final FlutterJNI f17458a;

    public C4700a(FlutterJNI flutterJNI) {
        this.f17458a = flutterJNI;
    }

    /* renamed from: a */
    public int m20354a(CharSequence charSequence, int i7) {
        int charCount;
        int length = charSequence.length();
        int i8 = length - 1;
        if (i7 >= i8) {
            return length;
        }
        int codePointAt = Character.codePointAt(charSequence, i7);
        int charCount2 = Character.charCount(codePointAt);
        int i9 = i7 + charCount2;
        int i10 = 0;
        if (i9 == 0) {
            return 0;
        }
        if (codePointAt == 10) {
            if (Character.codePointAt(charSequence, i9) == 13) {
                charCount2++;
            }
            return i7 + charCount2;
        }
        if (m20360g(codePointAt)) {
            if (i9 >= i8 || !m20360g(Character.codePointAt(charSequence, i9))) {
                return i9;
            }
            int i11 = i7;
            while (i11 > 0 && m20360g(Character.codePointBefore(charSequence, i7))) {
                i11 -= Character.charCount(Character.codePointBefore(charSequence, i7));
                i10++;
            }
            if (i10 % 2 == 0) {
                charCount2 += 2;
            }
            return i7 + charCount2;
        }
        if (m20359f(codePointAt)) {
            charCount2 += Character.charCount(codePointAt);
        }
        if (codePointAt == 8419) {
            int codePointBefore = Character.codePointBefore(charSequence, i9);
            int charCount3 = i9 + Character.charCount(codePointBefore);
            if (charCount3 < length && m20362i(codePointBefore)) {
                int codePointAt2 = Character.codePointAt(charSequence, charCount3);
                if (m20359f(codePointAt2)) {
                    charCount2 += Character.charCount(codePointBefore) + Character.charCount(codePointAt2);
                }
            } else if (m20359f(codePointBefore)) {
                charCount2 += Character.charCount(codePointBefore);
            }
            return i7 + charCount2;
        }
        if (m20356c(codePointAt)) {
            boolean z6 = false;
            int i12 = 0;
            do {
                if (z6) {
                    charCount2 += Character.charCount(codePointAt) + i12 + 1;
                    z6 = false;
                }
                if (m20357d(codePointAt)) {
                    break;
                }
                if (i9 < length) {
                    codePointAt = Character.codePointAt(charSequence, i9);
                    i9 += Character.charCount(codePointAt);
                    if (codePointAt != 8419) {
                        if (!m20357d(codePointAt)) {
                            if (!m20362i(codePointAt)) {
                                if (codePointAt == 8205) {
                                    codePointAt = Character.codePointAt(charSequence, i9);
                                    i9 += Character.charCount(codePointAt);
                                    if (i9 >= length || !m20362i(codePointAt)) {
                                        i12 = 0;
                                    } else {
                                        codePointAt = Character.codePointAt(charSequence, i9);
                                        int charCount4 = Character.charCount(codePointAt);
                                        i9 += Character.charCount(codePointAt);
                                        i12 = charCount4;
                                    }
                                    z6 = true;
                                    if (i9 < length || !z6) {
                                        break;
                                        break;
                                    }
                                }
                            } else {
                                charCount = Character.charCount(codePointAt);
                            }
                        } else {
                            charCount = Character.charCount(codePointAt);
                        }
                        charCount2 += charCount;
                        break;
                    }
                    int codePointBefore2 = Character.codePointBefore(charSequence, i9);
                    int charCount5 = i9 + Character.charCount(codePointBefore2);
                    if (charCount5 < length && m20362i(codePointBefore2)) {
                        int codePointAt3 = Character.codePointAt(charSequence, charCount5);
                        if (m20359f(codePointAt3)) {
                            charCount2 += Character.charCount(codePointBefore2) + Character.charCount(codePointAt3);
                        }
                    } else if (m20359f(codePointBefore2)) {
                        charCount2 += Character.charCount(codePointBefore2);
                    }
                    return i7 + charCount2;
                }
                i12 = 0;
                if (i9 < length) {
                    break;
                }
            } while (m20356c(codePointAt));
        }
        return i7 + charCount2;
    }

    /* renamed from: b */
    public int m20355b(CharSequence charSequence, int i7) {
        int codePointBefore;
        int charCount;
        int charCount2;
        int i8 = 0;
        int i9 = 1;
        if (i7 <= 1 || (charCount2 = i7 - (charCount = Character.charCount((codePointBefore = Character.codePointBefore(charSequence, i7))))) == 0) {
            return 0;
        }
        if (codePointBefore == 10) {
            if (Character.codePointBefore(charSequence, charCount2) == 13) {
                charCount++;
            }
            return i7 - charCount;
        }
        if (m20360g(codePointBefore)) {
            int codePointBefore2 = Character.codePointBefore(charSequence, charCount2);
            int charCount3 = charCount2 - Character.charCount(codePointBefore2);
            while (charCount3 > 0 && m20360g(codePointBefore2)) {
                codePointBefore2 = Character.codePointBefore(charSequence, charCount3);
                charCount3 -= Character.charCount(codePointBefore2);
                i9++;
            }
            if (i9 % 2 == 0) {
                charCount += 2;
            }
            return i7 - charCount;
        }
        if (codePointBefore == 8419) {
            int codePointBefore3 = Character.codePointBefore(charSequence, charCount2);
            int charCount4 = charCount2 - Character.charCount(codePointBefore3);
            if (charCount4 > 0 && m20362i(codePointBefore3)) {
                int codePointBefore4 = Character.codePointBefore(charSequence, charCount4);
                if (m20359f(codePointBefore4)) {
                    charCount += Character.charCount(codePointBefore3) + Character.charCount(codePointBefore4);
                }
            } else if (m20359f(codePointBefore3)) {
                charCount += Character.charCount(codePointBefore3);
            }
            return i7 - charCount;
        }
        if (codePointBefore == 917631) {
            codePointBefore = Character.codePointBefore(charSequence, charCount2);
            int charCount5 = Character.charCount(codePointBefore);
            while (true) {
                charCount2 -= charCount5;
                if (charCount2 <= 0 || !m20361h(codePointBefore)) {
                    break;
                }
                charCount += Character.charCount(codePointBefore);
                codePointBefore = Character.codePointBefore(charSequence, charCount2);
                charCount5 = Character.charCount(codePointBefore);
            }
            if (!m20356c(codePointBefore)) {
                return i7 - 2;
            }
            charCount += Character.charCount(codePointBefore);
        }
        if (m20362i(codePointBefore)) {
            codePointBefore = Character.codePointBefore(charSequence, charCount2);
            if (!m20356c(codePointBefore)) {
                return i7 - charCount;
            }
            charCount += Character.charCount(codePointBefore);
            charCount2 -= charCount;
        }
        if (m20356c(codePointBefore)) {
            boolean z6 = false;
            int i10 = 0;
            while (true) {
                if (z6) {
                    charCount += Character.charCount(codePointBefore) + i10 + 1;
                    z6 = false;
                }
                if (m20357d(codePointBefore)) {
                    int codePointBefore5 = Character.codePointBefore(charSequence, charCount2);
                    int charCount6 = charCount2 - Character.charCount(codePointBefore5);
                    if (charCount6 > 0 && m20362i(codePointBefore5)) {
                        codePointBefore5 = Character.codePointBefore(charSequence, charCount6);
                        if (!m20356c(codePointBefore5)) {
                            return i7 - charCount;
                        }
                        i8 = Character.charCount(codePointBefore5);
                        Character.charCount(codePointBefore5);
                    }
                    if (m20358e(codePointBefore5)) {
                        charCount += i8 + Character.charCount(codePointBefore5);
                    }
                } else {
                    if (charCount2 > 0) {
                        codePointBefore = Character.codePointBefore(charSequence, charCount2);
                        charCount2 -= Character.charCount(codePointBefore);
                        if (codePointBefore == 8205) {
                            codePointBefore = Character.codePointBefore(charSequence, charCount2);
                            charCount2 -= Character.charCount(codePointBefore);
                            if (charCount2 <= 0 || !m20362i(codePointBefore)) {
                                i10 = 0;
                            } else {
                                codePointBefore = Character.codePointBefore(charSequence, charCount2);
                                int charCount7 = Character.charCount(codePointBefore);
                                charCount2 -= Character.charCount(codePointBefore);
                                i10 = charCount7;
                            }
                            z6 = true;
                            if (charCount2 != 0 || !z6 || !m20356c(codePointBefore)) {
                                break;
                                break;
                            }
                        }
                    }
                    i10 = 0;
                    if (charCount2 != 0) {
                        break;
                    }
                }
            }
        }
        return i7 - charCount;
    }

    /* renamed from: c */
    public boolean m20356c(int i7) {
        return this.f17458a.isCodePointEmoji(i7);
    }

    /* renamed from: d */
    public boolean m20357d(int i7) {
        return this.f17458a.isCodePointEmojiModifier(i7);
    }

    /* renamed from: e */
    public boolean m20358e(int i7) {
        return this.f17458a.isCodePointEmojiModifierBase(i7);
    }

    /* renamed from: f */
    public boolean m20359f(int i7) {
        return (48 <= i7 && i7 <= 57) || i7 == 35 || i7 == 42;
    }

    /* renamed from: g */
    public boolean m20360g(int i7) {
        return this.f17458a.isCodePointRegionalIndicator(i7);
    }

    /* renamed from: h */
    public boolean m20361h(int i7) {
        return 917536 <= i7 && i7 <= 917630;
    }

    /* renamed from: i */
    public boolean m20362i(int i7) {
        return this.f17458a.isCodePointVariantSelector(i7);
    }
}
