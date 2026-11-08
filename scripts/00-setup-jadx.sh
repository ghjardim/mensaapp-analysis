#!/usr/bin/env bash
# Step 2 (doc 11): downloads jadx into tools/jadx (not versioned: the zip exceeds 100 MB).
set -euo pipefail
V=1.5.1
mkdir -p tools/jadx && cd tools/jadx
curl -L -o jadx.zip "https://github.com/skylot/jadx/releases/download/v$V/jadx-$V.zip"
unzip -o jadx.zip
./bin/jadx --version
