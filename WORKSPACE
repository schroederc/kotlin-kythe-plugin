workspace(name = "jetbrains_kythe_kotlin")

load("@bazel_tools//tools/build_defs/repo:git.bzl", "git_repository", "new_git_repository")
load("@bazel_tools//tools/build_defs/repo:http.bzl", "http_archive")

http_archive(
    name = "io_kythe",
    strip_prefix = "kythe-external",
    urls = ["https://github.com/schroederc/kythe/archive/external.zip"],
)

rules_kotlin_version = "67f4a6050584730ebae7f8a40435a209f8e0b48e"

http_archive(
    name = "io_bazel_rules_kotlin",
    strip_prefix = "rules_kotlin-%s" % rules_kotlin_version,
    type = "zip",
    urls = ["https://github.com/bazelbuild/rules_kotlin/archive/%s.zip" % rules_kotlin_version],
)

load("@io_bazel_rules_kotlin//kotlin:kotlin.bzl", "kotlin_repositories", "kt_register_toolchains")

kotlin_repositories()

kt_register_toolchains()

http_archive(
    name = "google_bazel_common",
    strip_prefix = "bazel-common-e7580d1db7466e6c8403f7826b7558ea5e99bbfd",
    urls = ["https://github.com/google/bazel-common/archive/e7580d1db7466e6c8403f7826b7558ea5e99bbfd.zip"],
)

load("@google_bazel_common//:workspace_defs.bzl", "google_common_workspace_rules")

google_common_workspace_rules()

# FOR PROTOS
http_archive(
    name = "io_bazel_rules_go",
    sha256 = "5f3b0304cdf0c505ec9e5b3c4fc4a87b5ca21b13d8ecc780c97df3d1809b9ce6",
    urls = ["https://github.com/bazelbuild/rules_go/releases/download/0.15.1/rules_go-0.15.1.tar.gz"],
)

git_repository(
    name = "com_google_common_flogger",
    commit = "f6071d2c5cd6c6c4f5fcd9f74bfec4ca972b0423",
    # TODO(schroederc): remove usage of fork once https://github.com/google/flogger/pull/37 is closed
    remote = "https://github.com/schroederc/flogger",
)

maven_jar(
    name = "com_google_re2j_re2j",
    artifact = "com.google.re2j:re2j:1.2",
    sha1 = "4361eed4abe6f84d982cbb26749825f285996dd2",
)

maven_jar(
    name = "com_google_code_gson_gson",
    artifact = "com.google.code.gson:gson:2.8.5",
    sha1 = "f645ed69d595b24d4cf8b3fbb64cc505bede8829",
)

bind(
    name = "gson",  # required by @com_google_protobuf
    actual = "@com_google_code_gson_gson//jar",
)

bind(
    name = "guava",  # required by @com_google_protobuf
    actual = "@io_kythe//third_party/guava",
)

maven_jar(
    name = "org_jetbrains_kotlin_kotlin_compiler",
    artifact = "org.jetbrains.kotlin:kotlin-compiler:1.2.71",
    sha1 = "60ce5683b413a564aaf24a04cc871cb047446674",
)
