// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: kythe/proto/storage_service.proto

package com.google.devtools.kythe.proto;

public final class StorageService {
  private StorageService() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n!kythe/proto/storage_service.proto\022\013kyt" +
      "he.proto\032\031kythe/proto/storage.proto2\277\001\n\n" +
      "GraphStore\0228\n\004Read\022\030.kythe.proto.ReadReq" +
      "uest\032\022.kythe.proto.Entry\"\0000\001\0228\n\004Scan\022\030.k" +
      "ythe.proto.ScanRequest\032\022.kythe.proto.Ent" +
      "ry\"\0000\001\022=\n\005Write\022\031.kythe.proto.WriteReque" +
      "st\032\027.kythe.proto.WriteReply\"\0002\216\001\n\021Sharde" +
      "dGraphStore\022=\n\005Count\022\031.kythe.proto.Count" +
      "Request\032\027.kythe.proto.CountReply\"\000\022:\n\005Sh" +
      "ard\022\031.kythe.proto.ShardRequest\032\022.kythe.p" +
      "roto.Entry\"\0000\001B!\n\037com.google.devtools.ky" +
      "the.protob\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.devtools.kythe.proto.Storage.getDescriptor(),
        }, assigner);
    com.google.devtools.kythe.proto.Storage.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
