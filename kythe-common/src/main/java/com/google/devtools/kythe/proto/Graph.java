// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: kythe/proto/explore.proto

package com.google.devtools.kythe.proto;

/**
 * Protobuf type {@code kythe.proto.Graph}
 */
public  final class Graph extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:kythe.proto.Graph)
    GraphOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Graph.newBuilder() to construct.
  private Graph(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Graph() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Graph(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
          case 10: {
            if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
              nodes_ = com.google.protobuf.MapField.newMapField(
                  NodesDefaultEntryHolder.defaultEntry);
              mutable_bitField0_ |= 0x00000001;
            }
            com.google.protobuf.MapEntry<java.lang.String, com.google.devtools.kythe.proto.GraphNode>
            nodes__ = input.readMessage(
                NodesDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
            nodes_.getMutableMap().put(
                nodes__.getKey(), nodes__.getValue());
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.devtools.kythe.proto.Explore.internal_static_kythe_proto_Graph_descriptor;
  }

  @SuppressWarnings({"rawtypes"})
  protected com.google.protobuf.MapField internalGetMapField(
      int number) {
    switch (number) {
      case 1:
        return internalGetNodes();
      default:
        throw new RuntimeException(
            "Invalid map field number: " + number);
    }
  }
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.devtools.kythe.proto.Explore.internal_static_kythe_proto_Graph_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.devtools.kythe.proto.Graph.class, com.google.devtools.kythe.proto.Graph.Builder.class);
  }

  public static final int NODES_FIELD_NUMBER = 1;
  private static final class NodesDefaultEntryHolder {
    static final com.google.protobuf.MapEntry<
        java.lang.String, com.google.devtools.kythe.proto.GraphNode> defaultEntry =
            com.google.protobuf.MapEntry
            .<java.lang.String, com.google.devtools.kythe.proto.GraphNode>newDefaultInstance(
                com.google.devtools.kythe.proto.Explore.internal_static_kythe_proto_Graph_NodesEntry_descriptor, 
                com.google.protobuf.WireFormat.FieldType.STRING,
                "",
                com.google.protobuf.WireFormat.FieldType.MESSAGE,
                com.google.devtools.kythe.proto.GraphNode.getDefaultInstance());
  }
  private com.google.protobuf.MapField<
      java.lang.String, com.google.devtools.kythe.proto.GraphNode> nodes_;
  private com.google.protobuf.MapField<java.lang.String, com.google.devtools.kythe.proto.GraphNode>
  internalGetNodes() {
    if (nodes_ == null) {
      return com.google.protobuf.MapField.emptyMapField(
          NodesDefaultEntryHolder.defaultEntry);
    }
    return nodes_;
  }

  public int getNodesCount() {
    return internalGetNodes().getMap().size();
  }
  /**
   * <pre>
   * semantic ticket -&gt; node/topology data
   * </pre>
   *
   * <code>map&lt;string, .kythe.proto.GraphNode&gt; nodes = 1;</code>
   */

  public boolean containsNodes(
      java.lang.String key) {
    if (key == null) { throw new java.lang.NullPointerException(); }
    return internalGetNodes().getMap().containsKey(key);
  }
  /**
   * Use {@link #getNodesMap()} instead.
   */
  @java.lang.Deprecated
  public java.util.Map<java.lang.String, com.google.devtools.kythe.proto.GraphNode> getNodes() {
    return getNodesMap();
  }
  /**
   * <pre>
   * semantic ticket -&gt; node/topology data
   * </pre>
   *
   * <code>map&lt;string, .kythe.proto.GraphNode&gt; nodes = 1;</code>
   */

  public java.util.Map<java.lang.String, com.google.devtools.kythe.proto.GraphNode> getNodesMap() {
    return internalGetNodes().getMap();
  }
  /**
   * <pre>
   * semantic ticket -&gt; node/topology data
   * </pre>
   *
   * <code>map&lt;string, .kythe.proto.GraphNode&gt; nodes = 1;</code>
   */

  public com.google.devtools.kythe.proto.GraphNode getNodesOrDefault(
      java.lang.String key,
      com.google.devtools.kythe.proto.GraphNode defaultValue) {
    if (key == null) { throw new java.lang.NullPointerException(); }
    java.util.Map<java.lang.String, com.google.devtools.kythe.proto.GraphNode> map =
        internalGetNodes().getMap();
    return map.containsKey(key) ? map.get(key) : defaultValue;
  }
  /**
   * <pre>
   * semantic ticket -&gt; node/topology data
   * </pre>
   *
   * <code>map&lt;string, .kythe.proto.GraphNode&gt; nodes = 1;</code>
   */

  public com.google.devtools.kythe.proto.GraphNode getNodesOrThrow(
      java.lang.String key) {
    if (key == null) { throw new java.lang.NullPointerException(); }
    java.util.Map<java.lang.String, com.google.devtools.kythe.proto.GraphNode> map =
        internalGetNodes().getMap();
    if (!map.containsKey(key)) {
      throw new java.lang.IllegalArgumentException();
    }
    return map.get(key);
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    com.google.protobuf.GeneratedMessageV3
      .serializeStringMapTo(
        output,
        internalGetNodes(),
        NodesDefaultEntryHolder.defaultEntry,
        1);
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (java.util.Map.Entry<java.lang.String, com.google.devtools.kythe.proto.GraphNode> entry
         : internalGetNodes().getMap().entrySet()) {
      com.google.protobuf.MapEntry<java.lang.String, com.google.devtools.kythe.proto.GraphNode>
      nodes__ = NodesDefaultEntryHolder.defaultEntry.newBuilderForType()
          .setKey(entry.getKey())
          .setValue(entry.getValue())
          .build();
      size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, nodes__);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.google.devtools.kythe.proto.Graph)) {
      return super.equals(obj);
    }
    com.google.devtools.kythe.proto.Graph other = (com.google.devtools.kythe.proto.Graph) obj;

    boolean result = true;
    result = result && internalGetNodes().equals(
        other.internalGetNodes());
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (!internalGetNodes().getMap().isEmpty()) {
      hash = (37 * hash) + NODES_FIELD_NUMBER;
      hash = (53 * hash) + internalGetNodes().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.devtools.kythe.proto.Graph parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.devtools.kythe.proto.Graph parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.devtools.kythe.proto.Graph parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.devtools.kythe.proto.Graph parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.devtools.kythe.proto.Graph parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.devtools.kythe.proto.Graph parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.devtools.kythe.proto.Graph parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.devtools.kythe.proto.Graph parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.devtools.kythe.proto.Graph parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.devtools.kythe.proto.Graph parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.devtools.kythe.proto.Graph parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.devtools.kythe.proto.Graph parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.google.devtools.kythe.proto.Graph prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
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
   * Protobuf type {@code kythe.proto.Graph}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:kythe.proto.Graph)
      com.google.devtools.kythe.proto.GraphOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.devtools.kythe.proto.Explore.internal_static_kythe_proto_Graph_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMapField(
        int number) {
      switch (number) {
        case 1:
          return internalGetNodes();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMutableMapField(
        int number) {
      switch (number) {
        case 1:
          return internalGetMutableNodes();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.devtools.kythe.proto.Explore.internal_static_kythe_proto_Graph_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.devtools.kythe.proto.Graph.class, com.google.devtools.kythe.proto.Graph.Builder.class);
    }

    // Construct using com.google.devtools.kythe.proto.Graph.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    public Builder clear() {
      super.clear();
      internalGetMutableNodes().clear();
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.devtools.kythe.proto.Explore.internal_static_kythe_proto_Graph_descriptor;
    }

    public com.google.devtools.kythe.proto.Graph getDefaultInstanceForType() {
      return com.google.devtools.kythe.proto.Graph.getDefaultInstance();
    }

    public com.google.devtools.kythe.proto.Graph build() {
      com.google.devtools.kythe.proto.Graph result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.google.devtools.kythe.proto.Graph buildPartial() {
      com.google.devtools.kythe.proto.Graph result = new com.google.devtools.kythe.proto.Graph(this);
      int from_bitField0_ = bitField0_;
      result.nodes_ = internalGetNodes();
      result.nodes_.makeImmutable();
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.devtools.kythe.proto.Graph) {
        return mergeFrom((com.google.devtools.kythe.proto.Graph)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.devtools.kythe.proto.Graph other) {
      if (other == com.google.devtools.kythe.proto.Graph.getDefaultInstance()) return this;
      internalGetMutableNodes().mergeFrom(
          other.internalGetNodes());
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.google.devtools.kythe.proto.Graph parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.devtools.kythe.proto.Graph) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private com.google.protobuf.MapField<
        java.lang.String, com.google.devtools.kythe.proto.GraphNode> nodes_;
    private com.google.protobuf.MapField<java.lang.String, com.google.devtools.kythe.proto.GraphNode>
    internalGetNodes() {
      if (nodes_ == null) {
        return com.google.protobuf.MapField.emptyMapField(
            NodesDefaultEntryHolder.defaultEntry);
      }
      return nodes_;
    }
    private com.google.protobuf.MapField<java.lang.String, com.google.devtools.kythe.proto.GraphNode>
    internalGetMutableNodes() {
      onChanged();;
      if (nodes_ == null) {
        nodes_ = com.google.protobuf.MapField.newMapField(
            NodesDefaultEntryHolder.defaultEntry);
      }
      if (!nodes_.isMutable()) {
        nodes_ = nodes_.copy();
      }
      return nodes_;
    }

    public int getNodesCount() {
      return internalGetNodes().getMap().size();
    }
    /**
     * <pre>
     * semantic ticket -&gt; node/topology data
     * </pre>
     *
     * <code>map&lt;string, .kythe.proto.GraphNode&gt; nodes = 1;</code>
     */

    public boolean containsNodes(
        java.lang.String key) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      return internalGetNodes().getMap().containsKey(key);
    }
    /**
     * Use {@link #getNodesMap()} instead.
     */
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, com.google.devtools.kythe.proto.GraphNode> getNodes() {
      return getNodesMap();
    }
    /**
     * <pre>
     * semantic ticket -&gt; node/topology data
     * </pre>
     *
     * <code>map&lt;string, .kythe.proto.GraphNode&gt; nodes = 1;</code>
     */

    public java.util.Map<java.lang.String, com.google.devtools.kythe.proto.GraphNode> getNodesMap() {
      return internalGetNodes().getMap();
    }
    /**
     * <pre>
     * semantic ticket -&gt; node/topology data
     * </pre>
     *
     * <code>map&lt;string, .kythe.proto.GraphNode&gt; nodes = 1;</code>
     */

    public com.google.devtools.kythe.proto.GraphNode getNodesOrDefault(
        java.lang.String key,
        com.google.devtools.kythe.proto.GraphNode defaultValue) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      java.util.Map<java.lang.String, com.google.devtools.kythe.proto.GraphNode> map =
          internalGetNodes().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     * <pre>
     * semantic ticket -&gt; node/topology data
     * </pre>
     *
     * <code>map&lt;string, .kythe.proto.GraphNode&gt; nodes = 1;</code>
     */

    public com.google.devtools.kythe.proto.GraphNode getNodesOrThrow(
        java.lang.String key) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      java.util.Map<java.lang.String, com.google.devtools.kythe.proto.GraphNode> map =
          internalGetNodes().getMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return map.get(key);
    }

    public Builder clearNodes() {
      internalGetMutableNodes().getMutableMap()
          .clear();
      return this;
    }
    /**
     * <pre>
     * semantic ticket -&gt; node/topology data
     * </pre>
     *
     * <code>map&lt;string, .kythe.proto.GraphNode&gt; nodes = 1;</code>
     */

    public Builder removeNodes(
        java.lang.String key) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      internalGetMutableNodes().getMutableMap()
          .remove(key);
      return this;
    }
    /**
     * Use alternate mutation accessors instead.
     */
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, com.google.devtools.kythe.proto.GraphNode>
    getMutableNodes() {
      return internalGetMutableNodes().getMutableMap();
    }
    /**
     * <pre>
     * semantic ticket -&gt; node/topology data
     * </pre>
     *
     * <code>map&lt;string, .kythe.proto.GraphNode&gt; nodes = 1;</code>
     */
    public Builder putNodes(
        java.lang.String key,
        com.google.devtools.kythe.proto.GraphNode value) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      if (value == null) { throw new java.lang.NullPointerException(); }
      internalGetMutableNodes().getMutableMap()
          .put(key, value);
      return this;
    }
    /**
     * <pre>
     * semantic ticket -&gt; node/topology data
     * </pre>
     *
     * <code>map&lt;string, .kythe.proto.GraphNode&gt; nodes = 1;</code>
     */

    public Builder putAllNodes(
        java.util.Map<java.lang.String, com.google.devtools.kythe.proto.GraphNode> values) {
      internalGetMutableNodes().getMutableMap()
          .putAll(values);
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:kythe.proto.Graph)
  }

  // @@protoc_insertion_point(class_scope:kythe.proto.Graph)
  private static final com.google.devtools.kythe.proto.Graph DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.devtools.kythe.proto.Graph();
  }

  public static com.google.devtools.kythe.proto.Graph getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Graph>
      PARSER = new com.google.protobuf.AbstractParser<Graph>() {
    public Graph parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Graph(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Graph> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Graph> getParserForType() {
    return PARSER;
  }

  public com.google.devtools.kythe.proto.Graph getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

