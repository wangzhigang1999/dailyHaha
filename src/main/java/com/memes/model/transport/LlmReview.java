// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: llm_review.proto

// Protobuf Java Version: 3.25.1
package com.memes.model.transport;

public final class LlmReview {
    private LlmReview() {
    }

    public static void registerAllExtensions(
            com.google.protobuf.ExtensionRegistryLite registry) {
    }

    public static void registerAllExtensions(
            com.google.protobuf.ExtensionRegistry registry) {
        registerAllExtensions(
                (com.google.protobuf.ExtensionRegistryLite) registry);
    }

    static final com.google.protobuf.Descriptors.Descriptor internal_static_LLMReviewResult_descriptor;
    static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable internal_static_LLMReviewResult_fieldAccessorTable;

    public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    private static com.google.protobuf.Descriptors.FileDescriptor descriptor;
    static {
        java.lang.String[] descriptorData = {
                "\n\020llm_review.proto\032\013media.proto\"\330\001\n\017LLMR" +
                        "eviewResult\022\017\n\007mediaId\030\001 \001(\t\022\023\n\013inputPro" +
                        "mpt\030\002 \001(\t\022\035\n\tmediaType\030\003 \001(\0162\n.MediaType" +
                        "\022\030\n\020mediaDescription\030\004 \001(\t\022\037\n\007outcome\030\005 " +
                        "\001(\0162\016.ReviewOutcome\022\025\n\rfailureReason\030\006 \001" +
                        "(\t\022\027\n\017reviewTimestamp\030\007 \001(\003\022\025\n\rreviewerM" +
                        "odel\030\010 \001(\t*2\n\rReviewOutcome\022\010\n\004PASS\020\000\022\010\n" +
                        "\004FAIL\020\001\022\r\n\tUNDECIDED\020\002B\035\n\031com.memes.mode" +
                        "l.transportP\001b\006proto3"
        };
        descriptor = com.google.protobuf.Descriptors.FileDescriptor
                .internalBuildGeneratedFileFrom(descriptorData,
                        new com.google.protobuf.Descriptors.FileDescriptor[] {
                                com.memes.model.transport.Media.getDescriptor(),
                        });
        internal_static_LLMReviewResult_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_LLMReviewResult_fieldAccessorTable = new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                internal_static_LLMReviewResult_descriptor,
                new java.lang.String[] { "MediaId", "InputPrompt", "MediaType", "MediaDescription", "Outcome", "FailureReason", "ReviewTimestamp",
                        "ReviewerModel", });
        com.memes.model.transport.Media.getDescriptor();
    }

    // @@protoc_insertion_point(outer_class_scope)
}
