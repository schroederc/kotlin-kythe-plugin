// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: kythe/proto/explore.proto

package com.google.devtools.kythe.proto;

public interface CalleesRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:kythe.proto.CalleesRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string function_ticket = 1;</code>
   */
  java.lang.String getFunctionTicket();
  /**
   * <code>string function_ticket = 1;</code>
   */
  com.google.protobuf.ByteString
      getFunctionTicketBytes();

  /**
   * <code>.kythe.proto.NodeFilter node_filter = 2;</code>
   */
  boolean hasNodeFilter();
  /**
   * <code>.kythe.proto.NodeFilter node_filter = 2;</code>
   */
  com.google.devtools.kythe.proto.NodeFilter getNodeFilter();
  /**
   * <code>.kythe.proto.NodeFilter node_filter = 2;</code>
   */
  com.google.devtools.kythe.proto.NodeFilterOrBuilder getNodeFilterOrBuilder();
}
