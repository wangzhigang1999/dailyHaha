// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: embedding.proto

// Protobuf Java Version: 3.25.1
package com.bupt.memes.model.transport;

public final class EmbeddingOuterClass {
  private EmbeddingOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Embedding_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Embedding_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\017embedding.proto\"8\n\tEmbedding\022\n\n\002id\030\001 \001" +
      "(\t\022\021\n\ttimestamp\030\002 \001(\003\022\014\n\004data\030\003 \003(\002B\"\n\036c" +
      "om.bupt.memes.model.transportP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_Embedding_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Embedding_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Embedding_descriptor,
        new java.lang.String[] { "Id", "Timestamp", "Data", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
