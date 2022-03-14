#!/usr/bin/bash

rm -rf ./out
antlr4 Mu.g4 -o out
javac out/Mu*.java
cd out
cat ../in.ccc | grun Mu unit -gui
cd ..
