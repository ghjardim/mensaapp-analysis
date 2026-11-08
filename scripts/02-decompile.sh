#!/usr/bin/env bash
# Step 4 (doc 11): decompiles base.apk with jadx. Requires jadx on PATH or at tools/jadx/bin/jadx.
# NOTE: the committed decompiled/ was generated with `--deobf` (names like p000A...). To follow the
# reference method (no renaming), run without --deobf into _work/ and compare.
set -euo pipefail
JADX="$(command -v jadx || echo tools/jadx/bin/jadx)"
APK="apk_mensabrasil/base.apk"
"$JADX" -d decompiled --deobf -j 4 "$APK"
