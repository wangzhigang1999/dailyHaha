// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: embedding.proto

// Protobuf Java Version: 3.25.1
package com.bupt.memes.model.transport;

/**
 * Protobuf type {@code Embedding}
 */
public final class Embedding extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:Embedding)
    EmbeddingOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Embedding.newBuilder() to construct.
  private Embedding(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Embedding() {
    id_ = "";
    data_ = emptyFloatList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Embedding();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.bupt.memes.model.transport.EmbeddingOuterClass.internal_static_Embedding_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.bupt.memes.model.transport.EmbeddingOuterClass.internal_static_Embedding_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.bupt.memes.model.transport.Embedding.class, com.bupt.memes.model.transport.Embedding.Builder.class);
  }

  public static final int ID_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object id_ = "";
  /**
   * <code>string id = 1;</code>
   * @return The id.
   */
  @java.lang.Override
  public java.lang.String getId() {
    java.lang.Object ref = id_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      id_ = s;
      return s;
    }
  }
  /**
   * <code>string id = 1;</code>
   * @return The bytes for id.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getIdBytes() {
    java.lang.Object ref = id_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      id_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TIMESTAMP_FIELD_NUMBER = 2;
  private long timestamp_ = 0L;
  /**
   * <code>int64 timestamp = 2;</code>
   * @return The timestamp.
   */
  @java.lang.Override
  public long getTimestamp() {
    return timestamp_;
  }

  public static final int DATA_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private com.google.protobuf.Internal.FloatList data_ =
      emptyFloatList();
  /**
   * <code>repeated float data = 3;</code>
   * @return A list containing the data.
   */
  @java.lang.Override
  public java.util.List<java.lang.Float>
      getDataList() {
    return data_;
  }
  /**
   * <code>repeated float data = 3;</code>
   * @return The count of data.
   */
  public int getDataCount() {
    return data_.size();
  }
  /**
   * <code>repeated float data = 3;</code>
   * @param index The index of the element to return.
   * @return The data at the given index.
   */
  public float getData(int index) {
    return data_.getFloat(index);
  }
  private int dataMemoizedSerializedSize = -1;

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    getSerializedSize();
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(id_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, id_);
    }
    if (timestamp_ != 0L) {
      output.writeInt64(2, timestamp_);
    }
    if (getDataList().size() > 0) {
      output.writeUInt32NoTag(26);
      output.writeUInt32NoTag(dataMemoizedSerializedSize);
    }
    for (int i = 0; i < data_.size(); i++) {
      output.writeFloatNoTag(data_.getFloat(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(id_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, id_);
    }
    if (timestamp_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, timestamp_);
    }
    {
      int dataSize = 0;
      dataSize = 4 * getDataList().size();
      size += dataSize;
      if (!getDataList().isEmpty()) {
        size += 1;
        size += com.google.protobuf.CodedOutputStream
            .computeInt32SizeNoTag(dataSize);
      }
      dataMemoizedSerializedSize = dataSize;
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.bupt.memes.model.transport.Embedding)) {
      return super.equals(obj);
    }
    com.bupt.memes.model.transport.Embedding other = (com.bupt.memes.model.transport.Embedding) obj;

    if (!getId()
        .equals(other.getId())) return false;
    if (getTimestamp()
        != other.getTimestamp()) return false;
    if (!getDataList()
        .equals(other.getDataList())) return false;
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + ID_FIELD_NUMBER;
    hash = (53 * hash) + getId().hashCode();
    hash = (37 * hash) + TIMESTAMP_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getTimestamp());
    if (getDataCount() > 0) {
      hash = (37 * hash) + DATA_FIELD_NUMBER;
      hash = (53 * hash) + getDataList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.bupt.memes.model.transport.Embedding parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.bupt.memes.model.transport.Embedding parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.bupt.memes.model.transport.Embedding parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.bupt.memes.model.transport.Embedding parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.bupt.memes.model.transport.Embedding parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.bupt.memes.model.transport.Embedding parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.bupt.memes.model.transport.Embedding parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.bupt.memes.model.transport.Embedding parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.bupt.memes.model.transport.Embedding parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.bupt.memes.model.transport.Embedding parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.bupt.memes.model.transport.Embedding parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.bupt.memes.model.transport.Embedding parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.bupt.memes.model.transport.Embedding prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code Embedding}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:Embedding)
      com.bupt.memes.model.transport.EmbeddingOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.bupt.memes.model.transport.EmbeddingOuterClass.internal_static_Embedding_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.bupt.memes.model.transport.EmbeddingOuterClass.internal_static_Embedding_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.bupt.memes.model.transport.Embedding.class, com.bupt.memes.model.transport.Embedding.Builder.class);
    }

    // Construct using com.bupt.memes.model.transport.Embedding.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      id_ = "";
      timestamp_ = 0L;
      data_ = emptyFloatList();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.bupt.memes.model.transport.EmbeddingOuterClass.internal_static_Embedding_descriptor;
    }

    @java.lang.Override
    public com.bupt.memes.model.transport.Embedding getDefaultInstanceForType() {
      return com.bupt.memes.model.transport.Embedding.getDefaultInstance();
    }

    @java.lang.Override
    public com.bupt.memes.model.transport.Embedding build() {
      com.bupt.memes.model.transport.Embedding result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.bupt.memes.model.transport.Embedding buildPartial() {
      com.bupt.memes.model.transport.Embedding result = new com.bupt.memes.model.transport.Embedding(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.bupt.memes.model.transport.Embedding result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.id_ = id_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.timestamp_ = timestamp_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        data_.makeImmutable();
        result.data_ = data_;
      }
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.bupt.memes.model.transport.Embedding) {
        return mergeFrom((com.bupt.memes.model.transport.Embedding)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.bupt.memes.model.transport.Embedding other) {
      if (other == com.bupt.memes.model.transport.Embedding.getDefaultInstance()) return this;
      if (!other.getId().isEmpty()) {
        id_ = other.id_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.getTimestamp() != 0L) {
        setTimestamp(other.getTimestamp());
      }
      if (!other.data_.isEmpty()) {
        if (data_.isEmpty()) {
          data_ = other.data_;
          data_.makeImmutable();
          bitField0_ |= 0x00000004;
        } else {
          ensureDataIsMutable();
          data_.addAll(other.data_);
        }
        onChanged();
      }
      this.mergeUnknownFields(other.getUnknownFields());
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10: {
              id_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 16: {
              timestamp_ = input.readInt64();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            case 29: {
              float v = input.readFloat();
              ensureDataIsMutable();
              data_.addFloat(v);
              break;
            } // case 29
            case 26: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              int alloc = length > 4096 ? 4096 : length;
              ensureDataIsMutable(alloc / 4);
              while (input.getBytesUntilLimit() > 0) {
                data_.addFloat(input.readFloat());
              }
              input.popLimit(limit);
              break;
            } // case 26
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }
    private int bitField0_;

    private java.lang.Object id_ = "";
    /**
     * <code>string id = 1;</code>
     * @return The id.
     */
    public java.lang.String getId() {
      java.lang.Object ref = id_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        id_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string id = 1;</code>
     * @return The bytes for id.
     */
    public com.google.protobuf.ByteString
        getIdBytes() {
      java.lang.Object ref = id_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        id_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string id = 1;</code>
     * @param value The id to set.
     * @return This builder for chaining.
     */
    public Builder setId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      id_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>string id = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearId() {
      id_ = getDefaultInstance().getId();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>string id = 1;</code>
     * @param value The bytes for id to set.
     * @return This builder for chaining.
     */
    public Builder setIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      id_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private long timestamp_ ;
    /**
     * <code>int64 timestamp = 2;</code>
     * @return The timestamp.
     */
    @java.lang.Override
    public long getTimestamp() {
      return timestamp_;
    }
    /**
     * <code>int64 timestamp = 2;</code>
     * @param value The timestamp to set.
     * @return This builder for chaining.
     */
    public Builder setTimestamp(long value) {

      timestamp_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>int64 timestamp = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearTimestamp() {
      bitField0_ = (bitField0_ & ~0x00000002);
      timestamp_ = 0L;
      onChanged();
      return this;
    }

    private com.google.protobuf.Internal.FloatList data_ = emptyFloatList();
    private void ensureDataIsMutable() {
      if (!data_.isModifiable()) {
        data_ = makeMutableCopy(data_);
      }
      bitField0_ |= 0x00000004;
    }
    private void ensureDataIsMutable(int capacity) {
      if (!data_.isModifiable()) {
        data_ = makeMutableCopy(data_, capacity);
      }
      bitField0_ |= 0x00000004;
    }
    /**
     * <code>repeated float data = 3;</code>
     * @return A list containing the data.
     */
    public java.util.List<java.lang.Float>
        getDataList() {
      data_.makeImmutable();
      return data_;
    }
    /**
     * <code>repeated float data = 3;</code>
     * @return The count of data.
     */
    public int getDataCount() {
      return data_.size();
    }
    /**
     * <code>repeated float data = 3;</code>
     * @param index The index of the element to return.
     * @return The data at the given index.
     */
    public float getData(int index) {
      return data_.getFloat(index);
    }
    /**
     * <code>repeated float data = 3;</code>
     * @param index The index to set the value at.
     * @param value The data to set.
     * @return This builder for chaining.
     */
    public Builder setData(
        int index, float value) {

      ensureDataIsMutable();
      data_.setFloat(index, value);
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>repeated float data = 3;</code>
     * @param value The data to add.
     * @return This builder for chaining.
     */
    public Builder addData(float value) {

      ensureDataIsMutable();
      data_.addFloat(value);
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>repeated float data = 3;</code>
     * @param values The data to add.
     * @return This builder for chaining.
     */
    public Builder addAllData(
        java.lang.Iterable<? extends java.lang.Float> values) {
      ensureDataIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, data_);
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>repeated float data = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearData() {
      data_ = emptyFloatList();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:Embedding)
  }

  // @@protoc_insertion_point(class_scope:Embedding)
  private static final com.bupt.memes.model.transport.Embedding DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.bupt.memes.model.transport.Embedding();
  }

  public static com.bupt.memes.model.transport.Embedding getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Embedding>
      PARSER = new com.google.protobuf.AbstractParser<Embedding>() {
    @java.lang.Override
    public Embedding parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<Embedding> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Embedding> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.bupt.memes.model.transport.Embedding getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

