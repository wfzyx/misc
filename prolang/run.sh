#!/usr/bin/bash

rm -rf ./out
antlr4 Mu.g4 -o out
javac out/Mu*.java
cd out
cat ../sample_input.mu | grun Mu unit -tree
cd ..
