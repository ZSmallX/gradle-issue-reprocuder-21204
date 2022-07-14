# Uses `--info` and `--refresh-dependencies` to know which repository it actually uses.
./gradlew --init-script=my-init-script.gradle.kts --info --refresh-dependencies
# Suppose to configure all plugins' maven repository to `google()`. But actually it's still default GradlePortal.
