#!/usr/bin/env bash
set -e

echo "Cleaning"
./gradlew clean
echo "Run 1"
./gradlew run
sed -i.bu 's/changeme/changememe/g' src/main/kotlin/Foo.kt
rm src/main/kotlin/Foo.kt.bu
echo "Run 2"
./gradlew run
