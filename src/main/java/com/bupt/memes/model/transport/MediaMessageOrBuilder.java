// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: media.proto

package com.bupt.memes.model.transport;

public interface MediaMessageOrBuilder extends
    // @@protoc_insertion_point(interface_extends:MediaMessage)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string id = 1;</code>
   * @return The id.
   */
  java.lang.String getId();
  /**
   * <code>string id = 1;</code>
   * @return The bytes for id.
   */
  com.google.protobuf.ByteString
      getIdBytes();

  /**
   * <code>int64 timestamp = 2;</code>
   * @return The timestamp.
   */
  long getTimestamp();

  /**
   * <code>.MediaType mediaType = 3;</code>
   * @return The enum numeric value on the wire for mediaType.
   */
  int getMediaTypeValue();
  /**
   * <code>.MediaType mediaType = 3;</code>
   * @return The mediaType.
   */
  com.bupt.memes.model.transport.MediaType getMediaType();

  /**
   * <code>bytes data = 4;</code>
   * @return The data.
   */
  com.google.protobuf.ByteString getData();
}
