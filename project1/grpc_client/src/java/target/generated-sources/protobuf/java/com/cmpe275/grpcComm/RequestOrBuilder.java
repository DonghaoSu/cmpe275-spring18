// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: data.proto

package com.cmpe275.grpcComm;

public interface RequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:grpcComm.Request)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional string fromSender = 1;</code>
   */
  java.lang.String getFromSender();
  /**
   * <code>optional string fromSender = 1;</code>
   */
  com.google.protobuf.ByteString
      getFromSenderBytes();

  /**
   * <code>optional string toReceiver = 2;</code>
   */
  java.lang.String getToReceiver();
  /**
   * <code>optional string toReceiver = 2;</code>
   */
  com.google.protobuf.ByteString
      getToReceiverBytes();

  /**
   * <code>optional string originalSender = 3;</code>
   */
  java.lang.String getOriginalSender();
  /**
   * <code>optional string originalSender = 3;</code>
   */
  com.google.protobuf.ByteString
      getOriginalSenderBytes();

  /**
   * <code>optional .grpcComm.PingRequest ping = 6;</code>
   */
  com.cmpe275.grpcComm.PingRequest getPing();
  /**
   * <code>optional .grpcComm.PingRequest ping = 6;</code>
   */
  com.cmpe275.grpcComm.PingRequestOrBuilder getPingOrBuilder();

  /**
   * <code>optional .grpcComm.PutRequest putRequest = 7;</code>
   */
  com.cmpe275.grpcComm.PutRequest getPutRequest();
  /**
   * <code>optional .grpcComm.PutRequest putRequest = 7;</code>
   */
  com.cmpe275.grpcComm.PutRequestOrBuilder getPutRequestOrBuilder();

  /**
   * <code>optional .grpcComm.GetRequest getRequest = 8;</code>
   */
  com.cmpe275.grpcComm.GetRequest getGetRequest();
  /**
   * <code>optional .grpcComm.GetRequest getRequest = 8;</code>
   */
  com.cmpe275.grpcComm.GetRequestOrBuilder getGetRequestOrBuilder();

  public com.cmpe275.grpcComm.Request.PayloadCase getPayloadCase();
}
