#!/usr/bin/env bash
# Step 1 (tiktok_analysis doc 11): pulls all APKs (base + splits) from the phone via adb.
# Usage: scripts/01-pull-apk.sh [package]   (default: com.mensabrasil.app)
set -euo pipefail
PKG="${1:-com.mensabrasil.app}"
OUT="apk_mensabrasil"
mkdir -p "$OUT"
adb shell pm path "$PKG" | sed 's/package://' | tr -d '\r' | while read -r p; do
  adb pull "$p" "$OUT/"
done
adb shell dumpsys package "$PKG" | grep -E 'versionName|versionCode'
sha256sum "$OUT"/*.apk
echo "Compare with docs/_evidence/apk-integrity.txt"
echo "Certificate: apksigner verify --print-certs $OUT/base.apk"
