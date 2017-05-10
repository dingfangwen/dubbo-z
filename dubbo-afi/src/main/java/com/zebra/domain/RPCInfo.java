package com.zebra.domain;

public final class RPCInfo {
  private RPCInfo() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface RPCReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:RPCReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated .RPCReq.RPCHah hahs = 1;</code>
     */
    java.util.List<RPCInfo.RPCReq.RPCHah> 
        getHahsList();
    /**
     * <code>repeated .RPCReq.RPCHah hahs = 1;</code>
     */
    RPCInfo.RPCReq.RPCHah getHahs(int index);
    /**
     * <code>repeated .RPCReq.RPCHah hahs = 1;</code>
     */
    int getHahsCount();
    /**
     * <code>repeated .RPCReq.RPCHah hahs = 1;</code>
     */
    java.util.List<? extends RPCInfo.RPCReq.RPCHahOrBuilder> 
        getHahsOrBuilderList();
    /**
     * <code>repeated .RPCReq.RPCHah hahs = 1;</code>
     */
    RPCInfo.RPCReq.RPCHahOrBuilder getHahsOrBuilder(
            int index);

    /**
     * <code>optional string mname = 2;</code>
     */
    boolean hasMname();
    /**
     * <code>optional string mname = 2;</code>
     */
    String getMname();
    /**
     * <code>optional string mname = 2;</code>
     */
    com.google.protobuf.ByteString
        getMnameBytes();
  }
  /**
   * Protobuf type {@code RPCReq}
   */
  public static final class RPCReq extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:RPCReq)
      RPCReqOrBuilder {
    // Use RPCReq.newBuilder() to construct.
    private RPCReq(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private RPCReq(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final RPCReq defaultInstance;
    public static RPCReq getDefaultInstance() {
      return defaultInstance;
    }

    public RPCReq getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private RPCReq(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      initFields();
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
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 10: {
              if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
                hahs_ = new java.util.ArrayList<RPCInfo.RPCReq.RPCHah>();
                mutable_bitField0_ |= 0x00000001;
              }
              hahs_.add(input.readMessage(RPCInfo.RPCReq.RPCHah.PARSER, extensionRegistry));
              break;
            }
            case 18: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000001;
              mname_ = bs;
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e.getMessage()).setUnfinishedMessage(this);
      } finally {
        if (((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
          hahs_ = java.util.Collections.unmodifiableList(hahs_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return RPCInfo.internal_static_RPCReq_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return RPCInfo.internal_static_RPCReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              RPCInfo.RPCReq.class, RPCInfo.RPCReq.Builder.class);
    }

    public static com.google.protobuf.Parser<RPCReq> PARSER =
        new com.google.protobuf.AbstractParser<RPCReq>() {
      public RPCReq parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new RPCReq(input, extensionRegistry);
      }
    };

    @Override
    public com.google.protobuf.Parser<RPCReq> getParserForType() {
      return PARSER;
    }

    public interface RPCHahOrBuilder extends
        // @@protoc_insertion_point(interface_extends:RPCReq.RPCHah)
        com.google.protobuf.MessageOrBuilder {

      /**
       * <code>required string cellid = 1;</code>
       */
      boolean hasCellid();
      /**
       * <code>required string cellid = 1;</code>
       */
      String getCellid();
      /**
       * <code>required string cellid = 1;</code>
       */
      com.google.protobuf.ByteString
          getCellidBytes();

      /**
       * <code>optional int32 appType = 2;</code>
       */
      boolean hasAppType();
      /**
       * <code>optional int32 appType = 2;</code>
       */
      int getAppType();

      /**
       * <code>optional int32 appSubtype = 3;</code>
       */
      boolean hasAppSubtype();
      /**
       * <code>optional int32 appSubtype = 3;</code>
       */
      int getAppSubtype();

      /**
       * <code>optional string userIP = 4;</code>
       */
      boolean hasUserIP();
      /**
       * <code>optional string userIP = 4;</code>
       */
      String getUserIP();
      /**
       * <code>optional string userIP = 4;</code>
       */
      com.google.protobuf.ByteString
          getUserIPBytes();

      /**
       * <code>optional int32 userPort = 5;</code>
       */
      boolean hasUserPort();
      /**
       * <code>optional int32 userPort = 5;</code>
       */
      int getUserPort();

      /**
       * <code>optional string appServerIP = 6;</code>
       */
      boolean hasAppServerIP();
      /**
       * <code>optional string appServerIP = 6;</code>
       */
      String getAppServerIP();
      /**
       * <code>optional string appServerIP = 6;</code>
       */
      com.google.protobuf.ByteString
          getAppServerIPBytes();

      /**
       * <code>optional int32 appServerPort = 7;</code>
       */
      boolean hasAppServerPort();
      /**
       * <code>optional int32 appServerPort = 7;</code>
       */
      int getAppServerPort();

      /**
       * <code>optional int64 trafficUL = 8;</code>
       */
      boolean hasTrafficUL();
      /**
       * <code>optional int64 trafficUL = 8;</code>
       */
      long getTrafficUL();

      /**
       * <code>optional int64 trafficDL = 9;</code>
       */
      boolean hasTrafficDL();
      /**
       * <code>optional int64 trafficDL = 9;</code>
       */
      long getTrafficDL();

      /**
       * <code>optional int64 retranUL = 10;</code>
       */
      boolean hasRetranUL();
      /**
       * <code>optional int64 retranUL = 10;</code>
       */
      long getRetranUL();

      /**
       * <code>optional int64 retranDL = 11;</code>
       */
      boolean hasRetranDL();
      /**
       * <code>optional int64 retranDL = 11;</code>
       */
      long getRetranDL();

      /**
       * <code>optional string host = 12;</code>
       */
      boolean hasHost();
      /**
       * <code>optional string host = 12;</code>
       */
      String getHost();
      /**
       * <code>optional string host = 12;</code>
       */
      com.google.protobuf.ByteString
          getHostBytes();

      /**
       * <code>optional int64 reportTime = 13;</code>
       */
      boolean hasReportTime();
      /**
       * <code>optional int64 reportTime = 13;</code>
       */
      long getReportTime();

      /**
       * <code>optional int32 sliceType = 14;</code>
       */
      boolean hasSliceType();
      /**
       * <code>optional int32 sliceType = 14;</code>
       */
      int getSliceType();

      /**
       * <code>optional int64 slice = 15;</code>
       */
      boolean hasSlice();
      /**
       * <code>optional int64 slice = 15;</code>
       */
      long getSlice();

      /**
       * <code>optional int64 transDelay = 16;</code>
       */
      boolean hasTransDelay();
      /**
       * <code>optional int64 transDelay = 16;</code>
       */
      long getTransDelay();

      /**
       * <code>optional string shufflekey = 17;</code>
       */
      boolean hasShufflekey();
      /**
       * <code>optional string shufflekey = 17;</code>
       */
      String getShufflekey();
      /**
       * <code>optional string shufflekey = 17;</code>
       */
      com.google.protobuf.ByteString
          getShufflekeyBytes();

      /**
       * <code>optional int64 attempts = 18;</code>
       */
      boolean hasAttempts();
      /**
       * <code>optional int64 attempts = 18;</code>
       */
      long getAttempts();

      /**
       * <code>optional int64 accepts = 19;</code>
       */
      boolean hasAccepts();
      /**
       * <code>optional int64 accepts = 19;</code>
       */
      long getAccepts();

      /**
       * <code>optional int64 failCount = 20;</code>
       */
      boolean hasFailCount();
      /**
       * <code>optional int64 failCount = 20;</code>
       */
      long getFailCount();
    }
    /**
     * Protobuf type {@code RPCReq.RPCHah}
     */
    public static final class RPCHah extends
        com.google.protobuf.GeneratedMessage implements
        // @@protoc_insertion_point(message_implements:RPCReq.RPCHah)
        RPCHahOrBuilder {
      // Use RPCHah.newBuilder() to construct.
      private RPCHah(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
        super(builder);
        this.unknownFields = builder.getUnknownFields();
      }
      private RPCHah(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

      private static final RPCHah defaultInstance;
      public static RPCHah getDefaultInstance() {
        return defaultInstance;
      }

      public RPCHah getDefaultInstanceForType() {
        return defaultInstance;
      }

      private final com.google.protobuf.UnknownFieldSet unknownFields;
      @Override
      public final com.google.protobuf.UnknownFieldSet
          getUnknownFields() {
        return this.unknownFields;
      }
      private RPCHah(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        initFields();
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
                if (!parseUnknownField(input, unknownFields,
                                       extensionRegistry, tag)) {
                  done = true;
                }
                break;
              }
              case 10: {
                com.google.protobuf.ByteString bs = input.readBytes();
                bitField0_ |= 0x00000001;
                cellid_ = bs;
                break;
              }
              case 16: {
                bitField0_ |= 0x00000002;
                appType_ = input.readInt32();
                break;
              }
              case 24: {
                bitField0_ |= 0x00000004;
                appSubtype_ = input.readInt32();
                break;
              }
              case 34: {
                com.google.protobuf.ByteString bs = input.readBytes();
                bitField0_ |= 0x00000008;
                userIP_ = bs;
                break;
              }
              case 40: {
                bitField0_ |= 0x00000010;
                userPort_ = input.readInt32();
                break;
              }
              case 50: {
                com.google.protobuf.ByteString bs = input.readBytes();
                bitField0_ |= 0x00000020;
                appServerIP_ = bs;
                break;
              }
              case 56: {
                bitField0_ |= 0x00000040;
                appServerPort_ = input.readInt32();
                break;
              }
              case 64: {
                bitField0_ |= 0x00000080;
                trafficUL_ = input.readInt64();
                break;
              }
              case 72: {
                bitField0_ |= 0x00000100;
                trafficDL_ = input.readInt64();
                break;
              }
              case 80: {
                bitField0_ |= 0x00000200;
                retranUL_ = input.readInt64();
                break;
              }
              case 88: {
                bitField0_ |= 0x00000400;
                retranDL_ = input.readInt64();
                break;
              }
              case 98: {
                com.google.protobuf.ByteString bs = input.readBytes();
                bitField0_ |= 0x00000800;
                host_ = bs;
                break;
              }
              case 104: {
                bitField0_ |= 0x00001000;
                reportTime_ = input.readInt64();
                break;
              }
              case 112: {
                bitField0_ |= 0x00002000;
                sliceType_ = input.readInt32();
                break;
              }
              case 120: {
                bitField0_ |= 0x00004000;
                slice_ = input.readInt64();
                break;
              }
              case 128: {
                bitField0_ |= 0x00008000;
                transDelay_ = input.readInt64();
                break;
              }
              case 138: {
                com.google.protobuf.ByteString bs = input.readBytes();
                bitField0_ |= 0x00010000;
                shufflekey_ = bs;
                break;
              }
              case 144: {
                bitField0_ |= 0x00020000;
                attempts_ = input.readInt64();
                break;
              }
              case 152: {
                bitField0_ |= 0x00040000;
                accepts_ = input.readInt64();
                break;
              }
              case 160: {
                bitField0_ |= 0x00080000;
                failCount_ = input.readInt64();
                break;
              }
            }
          }
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw e.setUnfinishedMessage(this);
        } catch (java.io.IOException e) {
          throw new com.google.protobuf.InvalidProtocolBufferException(
              e.getMessage()).setUnfinishedMessage(this);
        } finally {
          this.unknownFields = unknownFields.build();
          makeExtensionsImmutable();
        }
      }
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return RPCInfo.internal_static_RPCReq_RPCHah_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return RPCInfo.internal_static_RPCReq_RPCHah_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                RPCInfo.RPCReq.RPCHah.class, RPCInfo.RPCReq.RPCHah.Builder.class);
      }

      public static com.google.protobuf.Parser<RPCHah> PARSER =
          new com.google.protobuf.AbstractParser<RPCHah>() {
        public RPCHah parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new RPCHah(input, extensionRegistry);
        }
      };

      @Override
      public com.google.protobuf.Parser<RPCHah> getParserForType() {
        return PARSER;
      }

      private int bitField0_;
      public static final int CELLID_FIELD_NUMBER = 1;
      private Object cellid_;
      /**
       * <code>required string cellid = 1;</code>
       */
      public boolean hasCellid() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required string cellid = 1;</code>
       */
      public String getCellid() {
        Object ref = cellid_;
        if (ref instanceof String) {
          return (String) ref;
        } else {
          com.google.protobuf.ByteString bs = 
              (com.google.protobuf.ByteString) ref;
          String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            cellid_ = s;
          }
          return s;
        }
      }
      /**
       * <code>required string cellid = 1;</code>
       */
      public com.google.protobuf.ByteString
          getCellidBytes() {
        Object ref = cellid_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (String) ref);
          cellid_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }

      public static final int APPTYPE_FIELD_NUMBER = 2;
      private int appType_;
      /**
       * <code>optional int32 appType = 2;</code>
       */
      public boolean hasAppType() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>optional int32 appType = 2;</code>
       */
      public int getAppType() {
        return appType_;
      }

      public static final int APPSUBTYPE_FIELD_NUMBER = 3;
      private int appSubtype_;
      /**
       * <code>optional int32 appSubtype = 3;</code>
       */
      public boolean hasAppSubtype() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       * <code>optional int32 appSubtype = 3;</code>
       */
      public int getAppSubtype() {
        return appSubtype_;
      }

      public static final int USERIP_FIELD_NUMBER = 4;
      private Object userIP_;
      /**
       * <code>optional string userIP = 4;</code>
       */
      public boolean hasUserIP() {
        return ((bitField0_ & 0x00000008) == 0x00000008);
      }
      /**
       * <code>optional string userIP = 4;</code>
       */
      public String getUserIP() {
        Object ref = userIP_;
        if (ref instanceof String) {
          return (String) ref;
        } else {
          com.google.protobuf.ByteString bs = 
              (com.google.protobuf.ByteString) ref;
          String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            userIP_ = s;
          }
          return s;
        }
      }
      /**
       * <code>optional string userIP = 4;</code>
       */
      public com.google.protobuf.ByteString
          getUserIPBytes() {
        Object ref = userIP_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (String) ref);
          userIP_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }

      public static final int USERPORT_FIELD_NUMBER = 5;
      private int userPort_;
      /**
       * <code>optional int32 userPort = 5;</code>
       */
      public boolean hasUserPort() {
        return ((bitField0_ & 0x00000010) == 0x00000010);
      }
      /**
       * <code>optional int32 userPort = 5;</code>
       */
      public int getUserPort() {
        return userPort_;
      }

      public static final int APPSERVERIP_FIELD_NUMBER = 6;
      private Object appServerIP_;
      /**
       * <code>optional string appServerIP = 6;</code>
       */
      public boolean hasAppServerIP() {
        return ((bitField0_ & 0x00000020) == 0x00000020);
      }
      /**
       * <code>optional string appServerIP = 6;</code>
       */
      public String getAppServerIP() {
        Object ref = appServerIP_;
        if (ref instanceof String) {
          return (String) ref;
        } else {
          com.google.protobuf.ByteString bs = 
              (com.google.protobuf.ByteString) ref;
          String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            appServerIP_ = s;
          }
          return s;
        }
      }
      /**
       * <code>optional string appServerIP = 6;</code>
       */
      public com.google.protobuf.ByteString
          getAppServerIPBytes() {
        Object ref = appServerIP_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (String) ref);
          appServerIP_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }

      public static final int APPSERVERPORT_FIELD_NUMBER = 7;
      private int appServerPort_;
      /**
       * <code>optional int32 appServerPort = 7;</code>
       */
      public boolean hasAppServerPort() {
        return ((bitField0_ & 0x00000040) == 0x00000040);
      }
      /**
       * <code>optional int32 appServerPort = 7;</code>
       */
      public int getAppServerPort() {
        return appServerPort_;
      }

      public static final int TRAFFICUL_FIELD_NUMBER = 8;
      private long trafficUL_;
      /**
       * <code>optional int64 trafficUL = 8;</code>
       */
      public boolean hasTrafficUL() {
        return ((bitField0_ & 0x00000080) == 0x00000080);
      }
      /**
       * <code>optional int64 trafficUL = 8;</code>
       */
      public long getTrafficUL() {
        return trafficUL_;
      }

      public static final int TRAFFICDL_FIELD_NUMBER = 9;
      private long trafficDL_;
      /**
       * <code>optional int64 trafficDL = 9;</code>
       */
      public boolean hasTrafficDL() {
        return ((bitField0_ & 0x00000100) == 0x00000100);
      }
      /**
       * <code>optional int64 trafficDL = 9;</code>
       */
      public long getTrafficDL() {
        return trafficDL_;
      }

      public static final int RETRANUL_FIELD_NUMBER = 10;
      private long retranUL_;
      /**
       * <code>optional int64 retranUL = 10;</code>
       */
      public boolean hasRetranUL() {
        return ((bitField0_ & 0x00000200) == 0x00000200);
      }
      /**
       * <code>optional int64 retranUL = 10;</code>
       */
      public long getRetranUL() {
        return retranUL_;
      }

      public static final int RETRANDL_FIELD_NUMBER = 11;
      private long retranDL_;
      /**
       * <code>optional int64 retranDL = 11;</code>
       */
      public boolean hasRetranDL() {
        return ((bitField0_ & 0x00000400) == 0x00000400);
      }
      /**
       * <code>optional int64 retranDL = 11;</code>
       */
      public long getRetranDL() {
        return retranDL_;
      }

      public static final int HOST_FIELD_NUMBER = 12;
      private Object host_;
      /**
       * <code>optional string host = 12;</code>
       */
      public boolean hasHost() {
        return ((bitField0_ & 0x00000800) == 0x00000800);
      }
      /**
       * <code>optional string host = 12;</code>
       */
      public String getHost() {
        Object ref = host_;
        if (ref instanceof String) {
          return (String) ref;
        } else {
          com.google.protobuf.ByteString bs = 
              (com.google.protobuf.ByteString) ref;
          String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            host_ = s;
          }
          return s;
        }
      }
      /**
       * <code>optional string host = 12;</code>
       */
      public com.google.protobuf.ByteString
          getHostBytes() {
        Object ref = host_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (String) ref);
          host_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }

      public static final int REPORTTIME_FIELD_NUMBER = 13;
      private long reportTime_;
      /**
       * <code>optional int64 reportTime = 13;</code>
       */
      public boolean hasReportTime() {
        return ((bitField0_ & 0x00001000) == 0x00001000);
      }
      /**
       * <code>optional int64 reportTime = 13;</code>
       */
      public long getReportTime() {
        return reportTime_;
      }

      public static final int SLICETYPE_FIELD_NUMBER = 14;
      private int sliceType_;
      /**
       * <code>optional int32 sliceType = 14;</code>
       */
      public boolean hasSliceType() {
        return ((bitField0_ & 0x00002000) == 0x00002000);
      }
      /**
       * <code>optional int32 sliceType = 14;</code>
       */
      public int getSliceType() {
        return sliceType_;
      }

      public static final int SLICE_FIELD_NUMBER = 15;
      private long slice_;
      /**
       * <code>optional int64 slice = 15;</code>
       */
      public boolean hasSlice() {
        return ((bitField0_ & 0x00004000) == 0x00004000);
      }
      /**
       * <code>optional int64 slice = 15;</code>
       */
      public long getSlice() {
        return slice_;
      }

      public static final int TRANSDELAY_FIELD_NUMBER = 16;
      private long transDelay_;
      /**
       * <code>optional int64 transDelay = 16;</code>
       */
      public boolean hasTransDelay() {
        return ((bitField0_ & 0x00008000) == 0x00008000);
      }
      /**
       * <code>optional int64 transDelay = 16;</code>
       */
      public long getTransDelay() {
        return transDelay_;
      }

      public static final int SHUFFLEKEY_FIELD_NUMBER = 17;
      private Object shufflekey_;
      /**
       * <code>optional string shufflekey = 17;</code>
       */
      public boolean hasShufflekey() {
        return ((bitField0_ & 0x00010000) == 0x00010000);
      }
      /**
       * <code>optional string shufflekey = 17;</code>
       */
      public String getShufflekey() {
        Object ref = shufflekey_;
        if (ref instanceof String) {
          return (String) ref;
        } else {
          com.google.protobuf.ByteString bs = 
              (com.google.protobuf.ByteString) ref;
          String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            shufflekey_ = s;
          }
          return s;
        }
      }
      /**
       * <code>optional string shufflekey = 17;</code>
       */
      public com.google.protobuf.ByteString
          getShufflekeyBytes() {
        Object ref = shufflekey_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (String) ref);
          shufflekey_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }

      public static final int ATTEMPTS_FIELD_NUMBER = 18;
      private long attempts_;
      /**
       * <code>optional int64 attempts = 18;</code>
       */
      public boolean hasAttempts() {
        return ((bitField0_ & 0x00020000) == 0x00020000);
      }
      /**
       * <code>optional int64 attempts = 18;</code>
       */
      public long getAttempts() {
        return attempts_;
      }

      public static final int ACCEPTS_FIELD_NUMBER = 19;
      private long accepts_;
      /**
       * <code>optional int64 accepts = 19;</code>
       */
      public boolean hasAccepts() {
        return ((bitField0_ & 0x00040000) == 0x00040000);
      }
      /**
       * <code>optional int64 accepts = 19;</code>
       */
      public long getAccepts() {
        return accepts_;
      }

      public static final int FAILCOUNT_FIELD_NUMBER = 20;
      private long failCount_;
      /**
       * <code>optional int64 failCount = 20;</code>
       */
      public boolean hasFailCount() {
        return ((bitField0_ & 0x00080000) == 0x00080000);
      }
      /**
       * <code>optional int64 failCount = 20;</code>
       */
      public long getFailCount() {
        return failCount_;
      }

      private void initFields() {
        cellid_ = "";
        appType_ = 0;
        appSubtype_ = 0;
        userIP_ = "";
        userPort_ = 0;
        appServerIP_ = "";
        appServerPort_ = 0;
        trafficUL_ = 0L;
        trafficDL_ = 0L;
        retranUL_ = 0L;
        retranDL_ = 0L;
        host_ = "";
        reportTime_ = 0L;
        sliceType_ = 0;
        slice_ = 0L;
        transDelay_ = 0L;
        shufflekey_ = "";
        attempts_ = 0L;
        accepts_ = 0L;
        failCount_ = 0L;
      }
      private byte memoizedIsInitialized = -1;
      public final boolean isInitialized() {
        byte isInitialized = memoizedIsInitialized;
        if (isInitialized == 1) return true;
        if (isInitialized == 0) return false;

        if (!hasCellid()) {
          memoizedIsInitialized = 0;
          return false;
        }
        memoizedIsInitialized = 1;
        return true;
      }

      public void writeTo(com.google.protobuf.CodedOutputStream output)
                          throws java.io.IOException {
        getSerializedSize();
        if (((bitField0_ & 0x00000001) == 0x00000001)) {
          output.writeBytes(1, getCellidBytes());
        }
        if (((bitField0_ & 0x00000002) == 0x00000002)) {
          output.writeInt32(2, appType_);
        }
        if (((bitField0_ & 0x00000004) == 0x00000004)) {
          output.writeInt32(3, appSubtype_);
        }
        if (((bitField0_ & 0x00000008) == 0x00000008)) {
          output.writeBytes(4, getUserIPBytes());
        }
        if (((bitField0_ & 0x00000010) == 0x00000010)) {
          output.writeInt32(5, userPort_);
        }
        if (((bitField0_ & 0x00000020) == 0x00000020)) {
          output.writeBytes(6, getAppServerIPBytes());
        }
        if (((bitField0_ & 0x00000040) == 0x00000040)) {
          output.writeInt32(7, appServerPort_);
        }
        if (((bitField0_ & 0x00000080) == 0x00000080)) {
          output.writeInt64(8, trafficUL_);
        }
        if (((bitField0_ & 0x00000100) == 0x00000100)) {
          output.writeInt64(9, trafficDL_);
        }
        if (((bitField0_ & 0x00000200) == 0x00000200)) {
          output.writeInt64(10, retranUL_);
        }
        if (((bitField0_ & 0x00000400) == 0x00000400)) {
          output.writeInt64(11, retranDL_);
        }
        if (((bitField0_ & 0x00000800) == 0x00000800)) {
          output.writeBytes(12, getHostBytes());
        }
        if (((bitField0_ & 0x00001000) == 0x00001000)) {
          output.writeInt64(13, reportTime_);
        }
        if (((bitField0_ & 0x00002000) == 0x00002000)) {
          output.writeInt32(14, sliceType_);
        }
        if (((bitField0_ & 0x00004000) == 0x00004000)) {
          output.writeInt64(15, slice_);
        }
        if (((bitField0_ & 0x00008000) == 0x00008000)) {
          output.writeInt64(16, transDelay_);
        }
        if (((bitField0_ & 0x00010000) == 0x00010000)) {
          output.writeBytes(17, getShufflekeyBytes());
        }
        if (((bitField0_ & 0x00020000) == 0x00020000)) {
          output.writeInt64(18, attempts_);
        }
        if (((bitField0_ & 0x00040000) == 0x00040000)) {
          output.writeInt64(19, accepts_);
        }
        if (((bitField0_ & 0x00080000) == 0x00080000)) {
          output.writeInt64(20, failCount_);
        }
        getUnknownFields().writeTo(output);
      }

      private int memoizedSerializedSize = -1;
      public int getSerializedSize() {
        int size = memoizedSerializedSize;
        if (size != -1) return size;

        size = 0;
        if (((bitField0_ & 0x00000001) == 0x00000001)) {
          size += com.google.protobuf.CodedOutputStream
            .computeBytesSize(1, getCellidBytes());
        }
        if (((bitField0_ & 0x00000002) == 0x00000002)) {
          size += com.google.protobuf.CodedOutputStream
            .computeInt32Size(2, appType_);
        }
        if (((bitField0_ & 0x00000004) == 0x00000004)) {
          size += com.google.protobuf.CodedOutputStream
            .computeInt32Size(3, appSubtype_);
        }
        if (((bitField0_ & 0x00000008) == 0x00000008)) {
          size += com.google.protobuf.CodedOutputStream
            .computeBytesSize(4, getUserIPBytes());
        }
        if (((bitField0_ & 0x00000010) == 0x00000010)) {
          size += com.google.protobuf.CodedOutputStream
            .computeInt32Size(5, userPort_);
        }
        if (((bitField0_ & 0x00000020) == 0x00000020)) {
          size += com.google.protobuf.CodedOutputStream
            .computeBytesSize(6, getAppServerIPBytes());
        }
        if (((bitField0_ & 0x00000040) == 0x00000040)) {
          size += com.google.protobuf.CodedOutputStream
            .computeInt32Size(7, appServerPort_);
        }
        if (((bitField0_ & 0x00000080) == 0x00000080)) {
          size += com.google.protobuf.CodedOutputStream
            .computeInt64Size(8, trafficUL_);
        }
        if (((bitField0_ & 0x00000100) == 0x00000100)) {
          size += com.google.protobuf.CodedOutputStream
            .computeInt64Size(9, trafficDL_);
        }
        if (((bitField0_ & 0x00000200) == 0x00000200)) {
          size += com.google.protobuf.CodedOutputStream
            .computeInt64Size(10, retranUL_);
        }
        if (((bitField0_ & 0x00000400) == 0x00000400)) {
          size += com.google.protobuf.CodedOutputStream
            .computeInt64Size(11, retranDL_);
        }
        if (((bitField0_ & 0x00000800) == 0x00000800)) {
          size += com.google.protobuf.CodedOutputStream
            .computeBytesSize(12, getHostBytes());
        }
        if (((bitField0_ & 0x00001000) == 0x00001000)) {
          size += com.google.protobuf.CodedOutputStream
            .computeInt64Size(13, reportTime_);
        }
        if (((bitField0_ & 0x00002000) == 0x00002000)) {
          size += com.google.protobuf.CodedOutputStream
            .computeInt32Size(14, sliceType_);
        }
        if (((bitField0_ & 0x00004000) == 0x00004000)) {
          size += com.google.protobuf.CodedOutputStream
            .computeInt64Size(15, slice_);
        }
        if (((bitField0_ & 0x00008000) == 0x00008000)) {
          size += com.google.protobuf.CodedOutputStream
            .computeInt64Size(16, transDelay_);
        }
        if (((bitField0_ & 0x00010000) == 0x00010000)) {
          size += com.google.protobuf.CodedOutputStream
            .computeBytesSize(17, getShufflekeyBytes());
        }
        if (((bitField0_ & 0x00020000) == 0x00020000)) {
          size += com.google.protobuf.CodedOutputStream
            .computeInt64Size(18, attempts_);
        }
        if (((bitField0_ & 0x00040000) == 0x00040000)) {
          size += com.google.protobuf.CodedOutputStream
            .computeInt64Size(19, accepts_);
        }
        if (((bitField0_ & 0x00080000) == 0x00080000)) {
          size += com.google.protobuf.CodedOutputStream
            .computeInt64Size(20, failCount_);
        }
        size += getUnknownFields().getSerializedSize();
        memoizedSerializedSize = size;
        return size;
      }

      private static final long serialVersionUID = 0L;
      @Override
      protected Object writeReplace()
          throws java.io.ObjectStreamException {
        return super.writeReplace();
      }

      public static RPCInfo.RPCReq.RPCHah parseFrom(
          com.google.protobuf.ByteString data)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
      }
      public static RPCInfo.RPCReq.RPCHah parseFrom(
          com.google.protobuf.ByteString data,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
      }
      public static RPCInfo.RPCReq.RPCHah parseFrom(byte[] data)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
      }
      public static RPCInfo.RPCReq.RPCHah parseFrom(
          byte[] data,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
      }
      public static RPCInfo.RPCReq.RPCHah parseFrom(java.io.InputStream input)
          throws java.io.IOException {
        return PARSER.parseFrom(input);
      }
      public static RPCInfo.RPCReq.RPCHah parseFrom(
          java.io.InputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        return PARSER.parseFrom(input, extensionRegistry);
      }
      public static RPCInfo.RPCReq.RPCHah parseDelimitedFrom(java.io.InputStream input)
          throws java.io.IOException {
        return PARSER.parseDelimitedFrom(input);
      }
      public static RPCInfo.RPCReq.RPCHah parseDelimitedFrom(
          java.io.InputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        return PARSER.parseDelimitedFrom(input, extensionRegistry);
      }
      public static RPCInfo.RPCReq.RPCHah parseFrom(
          com.google.protobuf.CodedInputStream input)
          throws java.io.IOException {
        return PARSER.parseFrom(input);
      }
      public static RPCInfo.RPCReq.RPCHah parseFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        return PARSER.parseFrom(input, extensionRegistry);
      }

      public static Builder newBuilder() { return Builder.create(); }
      public Builder newBuilderForType() { return newBuilder(); }
      public static Builder newBuilder(RPCInfo.RPCReq.RPCHah prototype) {
        return newBuilder().mergeFrom(prototype);
      }
      public Builder toBuilder() { return newBuilder(this); }

      @Override
      protected Builder newBuilderForType(
          com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        Builder builder = new Builder(parent);
        return builder;
      }
      /**
       * Protobuf type {@code RPCReq.RPCHah}
       */
      public static final class Builder extends
          com.google.protobuf.GeneratedMessage.Builder<Builder> implements
          // @@protoc_insertion_point(builder_implements:RPCReq.RPCHah)
          RPCInfo.RPCReq.RPCHahOrBuilder {
        public static final com.google.protobuf.Descriptors.Descriptor
            getDescriptor() {
          return RPCInfo.internal_static_RPCReq_RPCHah_descriptor;
        }

        protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
            internalGetFieldAccessorTable() {
          return RPCInfo.internal_static_RPCReq_RPCHah_fieldAccessorTable
              .ensureFieldAccessorsInitialized(
                  RPCInfo.RPCReq.RPCHah.class, RPCInfo.RPCReq.RPCHah.Builder.class);
        }

        // Construct using RPCInfo.RPCReq.RPCHah.newBuilder()
        private Builder() {
          maybeForceBuilderInitialization();
        }

        private Builder(
            com.google.protobuf.GeneratedMessage.BuilderParent parent) {
          super(parent);
          maybeForceBuilderInitialization();
        }
        private void maybeForceBuilderInitialization() {
          if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
          }
        }
        private static Builder create() {
          return new Builder();
        }

        public Builder clear() {
          super.clear();
          cellid_ = "";
          bitField0_ = (bitField0_ & ~0x00000001);
          appType_ = 0;
          bitField0_ = (bitField0_ & ~0x00000002);
          appSubtype_ = 0;
          bitField0_ = (bitField0_ & ~0x00000004);
          userIP_ = "";
          bitField0_ = (bitField0_ & ~0x00000008);
          userPort_ = 0;
          bitField0_ = (bitField0_ & ~0x00000010);
          appServerIP_ = "";
          bitField0_ = (bitField0_ & ~0x00000020);
          appServerPort_ = 0;
          bitField0_ = (bitField0_ & ~0x00000040);
          trafficUL_ = 0L;
          bitField0_ = (bitField0_ & ~0x00000080);
          trafficDL_ = 0L;
          bitField0_ = (bitField0_ & ~0x00000100);
          retranUL_ = 0L;
          bitField0_ = (bitField0_ & ~0x00000200);
          retranDL_ = 0L;
          bitField0_ = (bitField0_ & ~0x00000400);
          host_ = "";
          bitField0_ = (bitField0_ & ~0x00000800);
          reportTime_ = 0L;
          bitField0_ = (bitField0_ & ~0x00001000);
          sliceType_ = 0;
          bitField0_ = (bitField0_ & ~0x00002000);
          slice_ = 0L;
          bitField0_ = (bitField0_ & ~0x00004000);
          transDelay_ = 0L;
          bitField0_ = (bitField0_ & ~0x00008000);
          shufflekey_ = "";
          bitField0_ = (bitField0_ & ~0x00010000);
          attempts_ = 0L;
          bitField0_ = (bitField0_ & ~0x00020000);
          accepts_ = 0L;
          bitField0_ = (bitField0_ & ~0x00040000);
          failCount_ = 0L;
          bitField0_ = (bitField0_ & ~0x00080000);
          return this;
        }

        public Builder clone() {
          return create().mergeFrom(buildPartial());
        }

        public com.google.protobuf.Descriptors.Descriptor
            getDescriptorForType() {
          return RPCInfo.internal_static_RPCReq_RPCHah_descriptor;
        }

        public RPCInfo.RPCReq.RPCHah getDefaultInstanceForType() {
          return RPCInfo.RPCReq.RPCHah.getDefaultInstance();
        }

        public RPCInfo.RPCReq.RPCHah build() {
          RPCInfo.RPCReq.RPCHah result = buildPartial();
          if (!result.isInitialized()) {
            throw newUninitializedMessageException(result);
          }
          return result;
        }

        public RPCInfo.RPCReq.RPCHah buildPartial() {
          RPCInfo.RPCReq.RPCHah result = new RPCInfo.RPCReq.RPCHah(this);
          int from_bitField0_ = bitField0_;
          int to_bitField0_ = 0;
          if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
            to_bitField0_ |= 0x00000001;
          }
          result.cellid_ = cellid_;
          if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
            to_bitField0_ |= 0x00000002;
          }
          result.appType_ = appType_;
          if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
            to_bitField0_ |= 0x00000004;
          }
          result.appSubtype_ = appSubtype_;
          if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
            to_bitField0_ |= 0x00000008;
          }
          result.userIP_ = userIP_;
          if (((from_bitField0_ & 0x00000010) == 0x00000010)) {
            to_bitField0_ |= 0x00000010;
          }
          result.userPort_ = userPort_;
          if (((from_bitField0_ & 0x00000020) == 0x00000020)) {
            to_bitField0_ |= 0x00000020;
          }
          result.appServerIP_ = appServerIP_;
          if (((from_bitField0_ & 0x00000040) == 0x00000040)) {
            to_bitField0_ |= 0x00000040;
          }
          result.appServerPort_ = appServerPort_;
          if (((from_bitField0_ & 0x00000080) == 0x00000080)) {
            to_bitField0_ |= 0x00000080;
          }
          result.trafficUL_ = trafficUL_;
          if (((from_bitField0_ & 0x00000100) == 0x00000100)) {
            to_bitField0_ |= 0x00000100;
          }
          result.trafficDL_ = trafficDL_;
          if (((from_bitField0_ & 0x00000200) == 0x00000200)) {
            to_bitField0_ |= 0x00000200;
          }
          result.retranUL_ = retranUL_;
          if (((from_bitField0_ & 0x00000400) == 0x00000400)) {
            to_bitField0_ |= 0x00000400;
          }
          result.retranDL_ = retranDL_;
          if (((from_bitField0_ & 0x00000800) == 0x00000800)) {
            to_bitField0_ |= 0x00000800;
          }
          result.host_ = host_;
          if (((from_bitField0_ & 0x00001000) == 0x00001000)) {
            to_bitField0_ |= 0x00001000;
          }
          result.reportTime_ = reportTime_;
          if (((from_bitField0_ & 0x00002000) == 0x00002000)) {
            to_bitField0_ |= 0x00002000;
          }
          result.sliceType_ = sliceType_;
          if (((from_bitField0_ & 0x00004000) == 0x00004000)) {
            to_bitField0_ |= 0x00004000;
          }
          result.slice_ = slice_;
          if (((from_bitField0_ & 0x00008000) == 0x00008000)) {
            to_bitField0_ |= 0x00008000;
          }
          result.transDelay_ = transDelay_;
          if (((from_bitField0_ & 0x00010000) == 0x00010000)) {
            to_bitField0_ |= 0x00010000;
          }
          result.shufflekey_ = shufflekey_;
          if (((from_bitField0_ & 0x00020000) == 0x00020000)) {
            to_bitField0_ |= 0x00020000;
          }
          result.attempts_ = attempts_;
          if (((from_bitField0_ & 0x00040000) == 0x00040000)) {
            to_bitField0_ |= 0x00040000;
          }
          result.accepts_ = accepts_;
          if (((from_bitField0_ & 0x00080000) == 0x00080000)) {
            to_bitField0_ |= 0x00080000;
          }
          result.failCount_ = failCount_;
          result.bitField0_ = to_bitField0_;
          onBuilt();
          return result;
        }

        public Builder mergeFrom(com.google.protobuf.Message other) {
          if (other instanceof RPCInfo.RPCReq.RPCHah) {
            return mergeFrom((RPCInfo.RPCReq.RPCHah)other);
          } else {
            super.mergeFrom(other);
            return this;
          }
        }

        public Builder mergeFrom(RPCInfo.RPCReq.RPCHah other) {
          if (other == RPCInfo.RPCReq.RPCHah.getDefaultInstance()) return this;
          if (other.hasCellid()) {
            bitField0_ |= 0x00000001;
            cellid_ = other.cellid_;
            onChanged();
          }
          if (other.hasAppType()) {
            setAppType(other.getAppType());
          }
          if (other.hasAppSubtype()) {
            setAppSubtype(other.getAppSubtype());
          }
          if (other.hasUserIP()) {
            bitField0_ |= 0x00000008;
            userIP_ = other.userIP_;
            onChanged();
          }
          if (other.hasUserPort()) {
            setUserPort(other.getUserPort());
          }
          if (other.hasAppServerIP()) {
            bitField0_ |= 0x00000020;
            appServerIP_ = other.appServerIP_;
            onChanged();
          }
          if (other.hasAppServerPort()) {
            setAppServerPort(other.getAppServerPort());
          }
          if (other.hasTrafficUL()) {
            setTrafficUL(other.getTrafficUL());
          }
          if (other.hasTrafficDL()) {
            setTrafficDL(other.getTrafficDL());
          }
          if (other.hasRetranUL()) {
            setRetranUL(other.getRetranUL());
          }
          if (other.hasRetranDL()) {
            setRetranDL(other.getRetranDL());
          }
          if (other.hasHost()) {
            bitField0_ |= 0x00000800;
            host_ = other.host_;
            onChanged();
          }
          if (other.hasReportTime()) {
            setReportTime(other.getReportTime());
          }
          if (other.hasSliceType()) {
            setSliceType(other.getSliceType());
          }
          if (other.hasSlice()) {
            setSlice(other.getSlice());
          }
          if (other.hasTransDelay()) {
            setTransDelay(other.getTransDelay());
          }
          if (other.hasShufflekey()) {
            bitField0_ |= 0x00010000;
            shufflekey_ = other.shufflekey_;
            onChanged();
          }
          if (other.hasAttempts()) {
            setAttempts(other.getAttempts());
          }
          if (other.hasAccepts()) {
            setAccepts(other.getAccepts());
          }
          if (other.hasFailCount()) {
            setFailCount(other.getFailCount());
          }
          this.mergeUnknownFields(other.getUnknownFields());
          return this;
        }

        public final boolean isInitialized() {
          if (!hasCellid()) {
            
            return false;
          }
          return true;
        }

        public Builder mergeFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
          RPCInfo.RPCReq.RPCHah parsedMessage = null;
          try {
            parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
          } catch (com.google.protobuf.InvalidProtocolBufferException e) {
            parsedMessage = (RPCInfo.RPCReq.RPCHah) e.getUnfinishedMessage();
            throw e;
          } finally {
            if (parsedMessage != null) {
              mergeFrom(parsedMessage);
            }
          }
          return this;
        }
        private int bitField0_;

        private Object cellid_ = "";
        /**
         * <code>required string cellid = 1;</code>
         */
        public boolean hasCellid() {
          return ((bitField0_ & 0x00000001) == 0x00000001);
        }
        /**
         * <code>required string cellid = 1;</code>
         */
        public String getCellid() {
          Object ref = cellid_;
          if (!(ref instanceof String)) {
            com.google.protobuf.ByteString bs =
                (com.google.protobuf.ByteString) ref;
            String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) {
              cellid_ = s;
            }
            return s;
          } else {
            return (String) ref;
          }
        }
        /**
         * <code>required string cellid = 1;</code>
         */
        public com.google.protobuf.ByteString
            getCellidBytes() {
          Object ref = cellid_;
          if (ref instanceof String) {
            com.google.protobuf.ByteString b = 
                com.google.protobuf.ByteString.copyFromUtf8(
                    (String) ref);
            cellid_ = b;
            return b;
          } else {
            return (com.google.protobuf.ByteString) ref;
          }
        }
        /**
         * <code>required string cellid = 1;</code>
         */
        public Builder setCellid(
            String value) {
          if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
          cellid_ = value;
          onChanged();
          return this;
        }
        /**
         * <code>required string cellid = 1;</code>
         */
        public Builder clearCellid() {
          bitField0_ = (bitField0_ & ~0x00000001);
          cellid_ = getDefaultInstance().getCellid();
          onChanged();
          return this;
        }
        /**
         * <code>required string cellid = 1;</code>
         */
        public Builder setCellidBytes(
            com.google.protobuf.ByteString value) {
          if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
          cellid_ = value;
          onChanged();
          return this;
        }

        private int appType_ ;
        /**
         * <code>optional int32 appType = 2;</code>
         */
        public boolean hasAppType() {
          return ((bitField0_ & 0x00000002) == 0x00000002);
        }
        /**
         * <code>optional int32 appType = 2;</code>
         */
        public int getAppType() {
          return appType_;
        }
        /**
         * <code>optional int32 appType = 2;</code>
         */
        public Builder setAppType(int value) {
          bitField0_ |= 0x00000002;
          appType_ = value;
          onChanged();
          return this;
        }
        /**
         * <code>optional int32 appType = 2;</code>
         */
        public Builder clearAppType() {
          bitField0_ = (bitField0_ & ~0x00000002);
          appType_ = 0;
          onChanged();
          return this;
        }

        private int appSubtype_ ;
        /**
         * <code>optional int32 appSubtype = 3;</code>
         */
        public boolean hasAppSubtype() {
          return ((bitField0_ & 0x00000004) == 0x00000004);
        }
        /**
         * <code>optional int32 appSubtype = 3;</code>
         */
        public int getAppSubtype() {
          return appSubtype_;
        }
        /**
         * <code>optional int32 appSubtype = 3;</code>
         */
        public Builder setAppSubtype(int value) {
          bitField0_ |= 0x00000004;
          appSubtype_ = value;
          onChanged();
          return this;
        }
        /**
         * <code>optional int32 appSubtype = 3;</code>
         */
        public Builder clearAppSubtype() {
          bitField0_ = (bitField0_ & ~0x00000004);
          appSubtype_ = 0;
          onChanged();
          return this;
        }

        private Object userIP_ = "";
        /**
         * <code>optional string userIP = 4;</code>
         */
        public boolean hasUserIP() {
          return ((bitField0_ & 0x00000008) == 0x00000008);
        }
        /**
         * <code>optional string userIP = 4;</code>
         */
        public String getUserIP() {
          Object ref = userIP_;
          if (!(ref instanceof String)) {
            com.google.protobuf.ByteString bs =
                (com.google.protobuf.ByteString) ref;
            String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) {
              userIP_ = s;
            }
            return s;
          } else {
            return (String) ref;
          }
        }
        /**
         * <code>optional string userIP = 4;</code>
         */
        public com.google.protobuf.ByteString
            getUserIPBytes() {
          Object ref = userIP_;
          if (ref instanceof String) {
            com.google.protobuf.ByteString b = 
                com.google.protobuf.ByteString.copyFromUtf8(
                    (String) ref);
            userIP_ = b;
            return b;
          } else {
            return (com.google.protobuf.ByteString) ref;
          }
        }
        /**
         * <code>optional string userIP = 4;</code>
         */
        public Builder setUserIP(
            String value) {
          if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000008;
          userIP_ = value;
          onChanged();
          return this;
        }
        /**
         * <code>optional string userIP = 4;</code>
         */
        public Builder clearUserIP() {
          bitField0_ = (bitField0_ & ~0x00000008);
          userIP_ = getDefaultInstance().getUserIP();
          onChanged();
          return this;
        }
        /**
         * <code>optional string userIP = 4;</code>
         */
        public Builder setUserIPBytes(
            com.google.protobuf.ByteString value) {
          if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000008;
          userIP_ = value;
          onChanged();
          return this;
        }

        private int userPort_ ;
        /**
         * <code>optional int32 userPort = 5;</code>
         */
        public boolean hasUserPort() {
          return ((bitField0_ & 0x00000010) == 0x00000010);
        }
        /**
         * <code>optional int32 userPort = 5;</code>
         */
        public int getUserPort() {
          return userPort_;
        }
        /**
         * <code>optional int32 userPort = 5;</code>
         */
        public Builder setUserPort(int value) {
          bitField0_ |= 0x00000010;
          userPort_ = value;
          onChanged();
          return this;
        }
        /**
         * <code>optional int32 userPort = 5;</code>
         */
        public Builder clearUserPort() {
          bitField0_ = (bitField0_ & ~0x00000010);
          userPort_ = 0;
          onChanged();
          return this;
        }

        private Object appServerIP_ = "";
        /**
         * <code>optional string appServerIP = 6;</code>
         */
        public boolean hasAppServerIP() {
          return ((bitField0_ & 0x00000020) == 0x00000020);
        }
        /**
         * <code>optional string appServerIP = 6;</code>
         */
        public String getAppServerIP() {
          Object ref = appServerIP_;
          if (!(ref instanceof String)) {
            com.google.protobuf.ByteString bs =
                (com.google.protobuf.ByteString) ref;
            String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) {
              appServerIP_ = s;
            }
            return s;
          } else {
            return (String) ref;
          }
        }
        /**
         * <code>optional string appServerIP = 6;</code>
         */
        public com.google.protobuf.ByteString
            getAppServerIPBytes() {
          Object ref = appServerIP_;
          if (ref instanceof String) {
            com.google.protobuf.ByteString b = 
                com.google.protobuf.ByteString.copyFromUtf8(
                    (String) ref);
            appServerIP_ = b;
            return b;
          } else {
            return (com.google.protobuf.ByteString) ref;
          }
        }
        /**
         * <code>optional string appServerIP = 6;</code>
         */
        public Builder setAppServerIP(
            String value) {
          if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000020;
          appServerIP_ = value;
          onChanged();
          return this;
        }
        /**
         * <code>optional string appServerIP = 6;</code>
         */
        public Builder clearAppServerIP() {
          bitField0_ = (bitField0_ & ~0x00000020);
          appServerIP_ = getDefaultInstance().getAppServerIP();
          onChanged();
          return this;
        }
        /**
         * <code>optional string appServerIP = 6;</code>
         */
        public Builder setAppServerIPBytes(
            com.google.protobuf.ByteString value) {
          if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000020;
          appServerIP_ = value;
          onChanged();
          return this;
        }

        private int appServerPort_ ;
        /**
         * <code>optional int32 appServerPort = 7;</code>
         */
        public boolean hasAppServerPort() {
          return ((bitField0_ & 0x00000040) == 0x00000040);
        }
        /**
         * <code>optional int32 appServerPort = 7;</code>
         */
        public int getAppServerPort() {
          return appServerPort_;
        }
        /**
         * <code>optional int32 appServerPort = 7;</code>
         */
        public Builder setAppServerPort(int value) {
          bitField0_ |= 0x00000040;
          appServerPort_ = value;
          onChanged();
          return this;
        }
        /**
         * <code>optional int32 appServerPort = 7;</code>
         */
        public Builder clearAppServerPort() {
          bitField0_ = (bitField0_ & ~0x00000040);
          appServerPort_ = 0;
          onChanged();
          return this;
        }

        private long trafficUL_ ;
        /**
         * <code>optional int64 trafficUL = 8;</code>
         */
        public boolean hasTrafficUL() {
          return ((bitField0_ & 0x00000080) == 0x00000080);
        }
        /**
         * <code>optional int64 trafficUL = 8;</code>
         */
        public long getTrafficUL() {
          return trafficUL_;
        }
        /**
         * <code>optional int64 trafficUL = 8;</code>
         */
        public Builder setTrafficUL(long value) {
          bitField0_ |= 0x00000080;
          trafficUL_ = value;
          onChanged();
          return this;
        }
        /**
         * <code>optional int64 trafficUL = 8;</code>
         */
        public Builder clearTrafficUL() {
          bitField0_ = (bitField0_ & ~0x00000080);
          trafficUL_ = 0L;
          onChanged();
          return this;
        }

        private long trafficDL_ ;
        /**
         * <code>optional int64 trafficDL = 9;</code>
         */
        public boolean hasTrafficDL() {
          return ((bitField0_ & 0x00000100) == 0x00000100);
        }
        /**
         * <code>optional int64 trafficDL = 9;</code>
         */
        public long getTrafficDL() {
          return trafficDL_;
        }
        /**
         * <code>optional int64 trafficDL = 9;</code>
         */
        public Builder setTrafficDL(long value) {
          bitField0_ |= 0x00000100;
          trafficDL_ = value;
          onChanged();
          return this;
        }
        /**
         * <code>optional int64 trafficDL = 9;</code>
         */
        public Builder clearTrafficDL() {
          bitField0_ = (bitField0_ & ~0x00000100);
          trafficDL_ = 0L;
          onChanged();
          return this;
        }

        private long retranUL_ ;
        /**
         * <code>optional int64 retranUL = 10;</code>
         */
        public boolean hasRetranUL() {
          return ((bitField0_ & 0x00000200) == 0x00000200);
        }
        /**
         * <code>optional int64 retranUL = 10;</code>
         */
        public long getRetranUL() {
          return retranUL_;
        }
        /**
         * <code>optional int64 retranUL = 10;</code>
         */
        public Builder setRetranUL(long value) {
          bitField0_ |= 0x00000200;
          retranUL_ = value;
          onChanged();
          return this;
        }
        /**
         * <code>optional int64 retranUL = 10;</code>
         */
        public Builder clearRetranUL() {
          bitField0_ = (bitField0_ & ~0x00000200);
          retranUL_ = 0L;
          onChanged();
          return this;
        }

        private long retranDL_ ;
        /**
         * <code>optional int64 retranDL = 11;</code>
         */
        public boolean hasRetranDL() {
          return ((bitField0_ & 0x00000400) == 0x00000400);
        }
        /**
         * <code>optional int64 retranDL = 11;</code>
         */
        public long getRetranDL() {
          return retranDL_;
        }
        /**
         * <code>optional int64 retranDL = 11;</code>
         */
        public Builder setRetranDL(long value) {
          bitField0_ |= 0x00000400;
          retranDL_ = value;
          onChanged();
          return this;
        }
        /**
         * <code>optional int64 retranDL = 11;</code>
         */
        public Builder clearRetranDL() {
          bitField0_ = (bitField0_ & ~0x00000400);
          retranDL_ = 0L;
          onChanged();
          return this;
        }

        private Object host_ = "";
        /**
         * <code>optional string host = 12;</code>
         */
        public boolean hasHost() {
          return ((bitField0_ & 0x00000800) == 0x00000800);
        }
        /**
         * <code>optional string host = 12;</code>
         */
        public String getHost() {
          Object ref = host_;
          if (!(ref instanceof String)) {
            com.google.protobuf.ByteString bs =
                (com.google.protobuf.ByteString) ref;
            String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) {
              host_ = s;
            }
            return s;
          } else {
            return (String) ref;
          }
        }
        /**
         * <code>optional string host = 12;</code>
         */
        public com.google.protobuf.ByteString
            getHostBytes() {
          Object ref = host_;
          if (ref instanceof String) {
            com.google.protobuf.ByteString b = 
                com.google.protobuf.ByteString.copyFromUtf8(
                    (String) ref);
            host_ = b;
            return b;
          } else {
            return (com.google.protobuf.ByteString) ref;
          }
        }
        /**
         * <code>optional string host = 12;</code>
         */
        public Builder setHost(
            String value) {
          if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000800;
          host_ = value;
          onChanged();
          return this;
        }
        /**
         * <code>optional string host = 12;</code>
         */
        public Builder clearHost() {
          bitField0_ = (bitField0_ & ~0x00000800);
          host_ = getDefaultInstance().getHost();
          onChanged();
          return this;
        }
        /**
         * <code>optional string host = 12;</code>
         */
        public Builder setHostBytes(
            com.google.protobuf.ByteString value) {
          if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000800;
          host_ = value;
          onChanged();
          return this;
        }

        private long reportTime_ ;
        /**
         * <code>optional int64 reportTime = 13;</code>
         */
        public boolean hasReportTime() {
          return ((bitField0_ & 0x00001000) == 0x00001000);
        }
        /**
         * <code>optional int64 reportTime = 13;</code>
         */
        public long getReportTime() {
          return reportTime_;
        }
        /**
         * <code>optional int64 reportTime = 13;</code>
         */
        public Builder setReportTime(long value) {
          bitField0_ |= 0x00001000;
          reportTime_ = value;
          onChanged();
          return this;
        }
        /**
         * <code>optional int64 reportTime = 13;</code>
         */
        public Builder clearReportTime() {
          bitField0_ = (bitField0_ & ~0x00001000);
          reportTime_ = 0L;
          onChanged();
          return this;
        }

        private int sliceType_ ;
        /**
         * <code>optional int32 sliceType = 14;</code>
         */
        public boolean hasSliceType() {
          return ((bitField0_ & 0x00002000) == 0x00002000);
        }
        /**
         * <code>optional int32 sliceType = 14;</code>
         */
        public int getSliceType() {
          return sliceType_;
        }
        /**
         * <code>optional int32 sliceType = 14;</code>
         */
        public Builder setSliceType(int value) {
          bitField0_ |= 0x00002000;
          sliceType_ = value;
          onChanged();
          return this;
        }
        /**
         * <code>optional int32 sliceType = 14;</code>
         */
        public Builder clearSliceType() {
          bitField0_ = (bitField0_ & ~0x00002000);
          sliceType_ = 0;
          onChanged();
          return this;
        }

        private long slice_ ;
        /**
         * <code>optional int64 slice = 15;</code>
         */
        public boolean hasSlice() {
          return ((bitField0_ & 0x00004000) == 0x00004000);
        }
        /**
         * <code>optional int64 slice = 15;</code>
         */
        public long getSlice() {
          return slice_;
        }
        /**
         * <code>optional int64 slice = 15;</code>
         */
        public Builder setSlice(long value) {
          bitField0_ |= 0x00004000;
          slice_ = value;
          onChanged();
          return this;
        }
        /**
         * <code>optional int64 slice = 15;</code>
         */
        public Builder clearSlice() {
          bitField0_ = (bitField0_ & ~0x00004000);
          slice_ = 0L;
          onChanged();
          return this;
        }

        private long transDelay_ ;
        /**
         * <code>optional int64 transDelay = 16;</code>
         */
        public boolean hasTransDelay() {
          return ((bitField0_ & 0x00008000) == 0x00008000);
        }
        /**
         * <code>optional int64 transDelay = 16;</code>
         */
        public long getTransDelay() {
          return transDelay_;
        }
        /**
         * <code>optional int64 transDelay = 16;</code>
         */
        public Builder setTransDelay(long value) {
          bitField0_ |= 0x00008000;
          transDelay_ = value;
          onChanged();
          return this;
        }
        /**
         * <code>optional int64 transDelay = 16;</code>
         */
        public Builder clearTransDelay() {
          bitField0_ = (bitField0_ & ~0x00008000);
          transDelay_ = 0L;
          onChanged();
          return this;
        }

        private Object shufflekey_ = "";
        /**
         * <code>optional string shufflekey = 17;</code>
         */
        public boolean hasShufflekey() {
          return ((bitField0_ & 0x00010000) == 0x00010000);
        }
        /**
         * <code>optional string shufflekey = 17;</code>
         */
        public String getShufflekey() {
          Object ref = shufflekey_;
          if (!(ref instanceof String)) {
            com.google.protobuf.ByteString bs =
                (com.google.protobuf.ByteString) ref;
            String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) {
              shufflekey_ = s;
            }
            return s;
          } else {
            return (String) ref;
          }
        }
        /**
         * <code>optional string shufflekey = 17;</code>
         */
        public com.google.protobuf.ByteString
            getShufflekeyBytes() {
          Object ref = shufflekey_;
          if (ref instanceof String) {
            com.google.protobuf.ByteString b = 
                com.google.protobuf.ByteString.copyFromUtf8(
                    (String) ref);
            shufflekey_ = b;
            return b;
          } else {
            return (com.google.protobuf.ByteString) ref;
          }
        }
        /**
         * <code>optional string shufflekey = 17;</code>
         */
        public Builder setShufflekey(
            String value) {
          if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00010000;
          shufflekey_ = value;
          onChanged();
          return this;
        }
        /**
         * <code>optional string shufflekey = 17;</code>
         */
        public Builder clearShufflekey() {
          bitField0_ = (bitField0_ & ~0x00010000);
          shufflekey_ = getDefaultInstance().getShufflekey();
          onChanged();
          return this;
        }
        /**
         * <code>optional string shufflekey = 17;</code>
         */
        public Builder setShufflekeyBytes(
            com.google.protobuf.ByteString value) {
          if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00010000;
          shufflekey_ = value;
          onChanged();
          return this;
        }

        private long attempts_ ;
        /**
         * <code>optional int64 attempts = 18;</code>
         */
        public boolean hasAttempts() {
          return ((bitField0_ & 0x00020000) == 0x00020000);
        }
        /**
         * <code>optional int64 attempts = 18;</code>
         */
        public long getAttempts() {
          return attempts_;
        }
        /**
         * <code>optional int64 attempts = 18;</code>
         */
        public Builder setAttempts(long value) {
          bitField0_ |= 0x00020000;
          attempts_ = value;
          onChanged();
          return this;
        }
        /**
         * <code>optional int64 attempts = 18;</code>
         */
        public Builder clearAttempts() {
          bitField0_ = (bitField0_ & ~0x00020000);
          attempts_ = 0L;
          onChanged();
          return this;
        }

        private long accepts_ ;
        /**
         * <code>optional int64 accepts = 19;</code>
         */
        public boolean hasAccepts() {
          return ((bitField0_ & 0x00040000) == 0x00040000);
        }
        /**
         * <code>optional int64 accepts = 19;</code>
         */
        public long getAccepts() {
          return accepts_;
        }
        /**
         * <code>optional int64 accepts = 19;</code>
         */
        public Builder setAccepts(long value) {
          bitField0_ |= 0x00040000;
          accepts_ = value;
          onChanged();
          return this;
        }
        /**
         * <code>optional int64 accepts = 19;</code>
         */
        public Builder clearAccepts() {
          bitField0_ = (bitField0_ & ~0x00040000);
          accepts_ = 0L;
          onChanged();
          return this;
        }

        private long failCount_ ;
        /**
         * <code>optional int64 failCount = 20;</code>
         */
        public boolean hasFailCount() {
          return ((bitField0_ & 0x00080000) == 0x00080000);
        }
        /**
         * <code>optional int64 failCount = 20;</code>
         */
        public long getFailCount() {
          return failCount_;
        }
        /**
         * <code>optional int64 failCount = 20;</code>
         */
        public Builder setFailCount(long value) {
          bitField0_ |= 0x00080000;
          failCount_ = value;
          onChanged();
          return this;
        }
        /**
         * <code>optional int64 failCount = 20;</code>
         */
        public Builder clearFailCount() {
          bitField0_ = (bitField0_ & ~0x00080000);
          failCount_ = 0L;
          onChanged();
          return this;
        }

        // @@protoc_insertion_point(builder_scope:RPCReq.RPCHah)
      }

      static {
        defaultInstance = new RPCHah(true);
        defaultInstance.initFields();
      }

      // @@protoc_insertion_point(class_scope:RPCReq.RPCHah)
    }

    private int bitField0_;
    public static final int HAHS_FIELD_NUMBER = 1;
    private java.util.List<RPCInfo.RPCReq.RPCHah> hahs_;
    /**
     * <code>repeated .RPCReq.RPCHah hahs = 1;</code>
     */
    public java.util.List<RPCInfo.RPCReq.RPCHah> getHahsList() {
      return hahs_;
    }
    /**
     * <code>repeated .RPCReq.RPCHah hahs = 1;</code>
     */
    public java.util.List<? extends RPCInfo.RPCReq.RPCHahOrBuilder> 
        getHahsOrBuilderList() {
      return hahs_;
    }
    /**
     * <code>repeated .RPCReq.RPCHah hahs = 1;</code>
     */
    public int getHahsCount() {
      return hahs_.size();
    }
    /**
     * <code>repeated .RPCReq.RPCHah hahs = 1;</code>
     */
    public RPCInfo.RPCReq.RPCHah getHahs(int index) {
      return hahs_.get(index);
    }
    /**
     * <code>repeated .RPCReq.RPCHah hahs = 1;</code>
     */
    public RPCInfo.RPCReq.RPCHahOrBuilder getHahsOrBuilder(
        int index) {
      return hahs_.get(index);
    }

    public static final int MNAME_FIELD_NUMBER = 2;
    private Object mname_;
    /**
     * <code>optional string mname = 2;</code>
     */
    public boolean hasMname() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>optional string mname = 2;</code>
     */
    public String getMname() {
      Object ref = mname_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          mname_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string mname = 2;</code>
     */
    public com.google.protobuf.ByteString
        getMnameBytes() {
      Object ref = mname_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        mname_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    private void initFields() {
      hahs_ = java.util.Collections.emptyList();
      mname_ = "";
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      for (int i = 0; i < getHahsCount(); i++) {
        if (!getHahs(i).isInitialized()) {
          memoizedIsInitialized = 0;
          return false;
        }
      }
      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      for (int i = 0; i < hahs_.size(); i++) {
        output.writeMessage(1, hahs_.get(i));
      }
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeBytes(2, getMnameBytes());
      }
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      for (int i = 0; i < hahs_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, hahs_.get(i));
      }
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(2, getMnameBytes());
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @Override
    protected Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }

    public static RPCInfo.RPCReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static RPCInfo.RPCReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static RPCInfo.RPCReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static RPCInfo.RPCReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static RPCInfo.RPCReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static RPCInfo.RPCReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static RPCInfo.RPCReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static RPCInfo.RPCReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static RPCInfo.RPCReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static RPCInfo.RPCReq parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(RPCInfo.RPCReq prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }

    @Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code RPCReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:RPCReq)
        RPCInfo.RPCReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return RPCInfo.internal_static_RPCReq_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return RPCInfo.internal_static_RPCReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                RPCInfo.RPCReq.class, RPCInfo.RPCReq.Builder.class);
      }

      // Construct using RPCInfo.RPCReq.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
          getHahsFieldBuilder();
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        if (hahsBuilder_ == null) {
          hahs_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          hahsBuilder_.clear();
        }
        mname_ = "";
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return RPCInfo.internal_static_RPCReq_descriptor;
      }

      public RPCInfo.RPCReq getDefaultInstanceForType() {
        return RPCInfo.RPCReq.getDefaultInstance();
      }

      public RPCInfo.RPCReq build() {
        RPCInfo.RPCReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public RPCInfo.RPCReq buildPartial() {
        RPCInfo.RPCReq result = new RPCInfo.RPCReq(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (hahsBuilder_ == null) {
          if (((bitField0_ & 0x00000001) == 0x00000001)) {
            hahs_ = java.util.Collections.unmodifiableList(hahs_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.hahs_ = hahs_;
        } else {
          result.hahs_ = hahsBuilder_.build();
        }
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000001;
        }
        result.mname_ = mname_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof RPCInfo.RPCReq) {
          return mergeFrom((RPCInfo.RPCReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(RPCInfo.RPCReq other) {
        if (other == RPCInfo.RPCReq.getDefaultInstance()) return this;
        if (hahsBuilder_ == null) {
          if (!other.hahs_.isEmpty()) {
            if (hahs_.isEmpty()) {
              hahs_ = other.hahs_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureHahsIsMutable();
              hahs_.addAll(other.hahs_);
            }
            onChanged();
          }
        } else {
          if (!other.hahs_.isEmpty()) {
            if (hahsBuilder_.isEmpty()) {
              hahsBuilder_.dispose();
              hahsBuilder_ = null;
              hahs_ = other.hahs_;
              bitField0_ = (bitField0_ & ~0x00000001);
              hahsBuilder_ = 
                com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders ?
                   getHahsFieldBuilder() : null;
            } else {
              hahsBuilder_.addAllMessages(other.hahs_);
            }
          }
        }
        if (other.hasMname()) {
          bitField0_ |= 0x00000002;
          mname_ = other.mname_;
          onChanged();
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        for (int i = 0; i < getHahsCount(); i++) {
          if (!getHahs(i).isInitialized()) {
            
            return false;
          }
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        RPCInfo.RPCReq parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (RPCInfo.RPCReq) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.util.List<RPCInfo.RPCReq.RPCHah> hahs_ =
        java.util.Collections.emptyList();
      private void ensureHahsIsMutable() {
        if (!((bitField0_ & 0x00000001) == 0x00000001)) {
          hahs_ = new java.util.ArrayList<RPCInfo.RPCReq.RPCHah>(hahs_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilder<
          RPCInfo.RPCReq.RPCHah, RPCInfo.RPCReq.RPCHah.Builder, RPCInfo.RPCReq.RPCHahOrBuilder> hahsBuilder_;

      /**
       * <code>repeated .RPCReq.RPCHah hahs = 1;</code>
       */
      public java.util.List<RPCInfo.RPCReq.RPCHah> getHahsList() {
        if (hahsBuilder_ == null) {
          return java.util.Collections.unmodifiableList(hahs_);
        } else {
          return hahsBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .RPCReq.RPCHah hahs = 1;</code>
       */
      public int getHahsCount() {
        if (hahsBuilder_ == null) {
          return hahs_.size();
        } else {
          return hahsBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .RPCReq.RPCHah hahs = 1;</code>
       */
      public RPCInfo.RPCReq.RPCHah getHahs(int index) {
        if (hahsBuilder_ == null) {
          return hahs_.get(index);
        } else {
          return hahsBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .RPCReq.RPCHah hahs = 1;</code>
       */
      public Builder setHahs(
          int index, RPCInfo.RPCReq.RPCHah value) {
        if (hahsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureHahsIsMutable();
          hahs_.set(index, value);
          onChanged();
        } else {
          hahsBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .RPCReq.RPCHah hahs = 1;</code>
       */
      public Builder setHahs(
          int index, RPCInfo.RPCReq.RPCHah.Builder builderForValue) {
        if (hahsBuilder_ == null) {
          ensureHahsIsMutable();
          hahs_.set(index, builderForValue.build());
          onChanged();
        } else {
          hahsBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .RPCReq.RPCHah hahs = 1;</code>
       */
      public Builder addHahs(RPCInfo.RPCReq.RPCHah value) {
        if (hahsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureHahsIsMutable();
          hahs_.add(value);
          onChanged();
        } else {
          hahsBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .RPCReq.RPCHah hahs = 1;</code>
       */
      public Builder addHahs(
          int index, RPCInfo.RPCReq.RPCHah value) {
        if (hahsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureHahsIsMutable();
          hahs_.add(index, value);
          onChanged();
        } else {
          hahsBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .RPCReq.RPCHah hahs = 1;</code>
       */
      public Builder addHahs(
          RPCInfo.RPCReq.RPCHah.Builder builderForValue) {
        if (hahsBuilder_ == null) {
          ensureHahsIsMutable();
          hahs_.add(builderForValue.build());
          onChanged();
        } else {
          hahsBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .RPCReq.RPCHah hahs = 1;</code>
       */
      public Builder addHahs(
          int index, RPCInfo.RPCReq.RPCHah.Builder builderForValue) {
        if (hahsBuilder_ == null) {
          ensureHahsIsMutable();
          hahs_.add(index, builderForValue.build());
          onChanged();
        } else {
          hahsBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .RPCReq.RPCHah hahs = 1;</code>
       */
      public Builder addAllHahs(
          Iterable<? extends RPCInfo.RPCReq.RPCHah> values) {
        if (hahsBuilder_ == null) {
          ensureHahsIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, hahs_);
          onChanged();
        } else {
          hahsBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .RPCReq.RPCHah hahs = 1;</code>
       */
      public Builder clearHahs() {
        if (hahsBuilder_ == null) {
          hahs_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          hahsBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .RPCReq.RPCHah hahs = 1;</code>
       */
      public Builder removeHahs(int index) {
        if (hahsBuilder_ == null) {
          ensureHahsIsMutable();
          hahs_.remove(index);
          onChanged();
        } else {
          hahsBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .RPCReq.RPCHah hahs = 1;</code>
       */
      public RPCInfo.RPCReq.RPCHah.Builder getHahsBuilder(
          int index) {
        return getHahsFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .RPCReq.RPCHah hahs = 1;</code>
       */
      public RPCInfo.RPCReq.RPCHahOrBuilder getHahsOrBuilder(
          int index) {
        if (hahsBuilder_ == null) {
          return hahs_.get(index);  } else {
          return hahsBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .RPCReq.RPCHah hahs = 1;</code>
       */
      public java.util.List<? extends RPCInfo.RPCReq.RPCHahOrBuilder> 
           getHahsOrBuilderList() {
        if (hahsBuilder_ != null) {
          return hahsBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(hahs_);
        }
      }
      /**
       * <code>repeated .RPCReq.RPCHah hahs = 1;</code>
       */
      public RPCInfo.RPCReq.RPCHah.Builder addHahsBuilder() {
        return getHahsFieldBuilder().addBuilder(
            RPCInfo.RPCReq.RPCHah.getDefaultInstance());
      }
      /**
       * <code>repeated .RPCReq.RPCHah hahs = 1;</code>
       */
      public RPCInfo.RPCReq.RPCHah.Builder addHahsBuilder(
          int index) {
        return getHahsFieldBuilder().addBuilder(
            index, RPCInfo.RPCReq.RPCHah.getDefaultInstance());
      }
      /**
       * <code>repeated .RPCReq.RPCHah hahs = 1;</code>
       */
      public java.util.List<RPCInfo.RPCReq.RPCHah.Builder> 
           getHahsBuilderList() {
        return getHahsFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilder<
          RPCInfo.RPCReq.RPCHah, RPCInfo.RPCReq.RPCHah.Builder, RPCInfo.RPCReq.RPCHahOrBuilder> 
          getHahsFieldBuilder() {
        if (hahsBuilder_ == null) {
          hahsBuilder_ = new com.google.protobuf.RepeatedFieldBuilder<
              RPCInfo.RPCReq.RPCHah, RPCInfo.RPCReq.RPCHah.Builder, RPCInfo.RPCReq.RPCHahOrBuilder>(
                  hahs_,
                  ((bitField0_ & 0x00000001) == 0x00000001),
                  getParentForChildren(),
                  isClean());
          hahs_ = null;
        }
        return hahsBuilder_;
      }

      private Object mname_ = "";
      /**
       * <code>optional string mname = 2;</code>
       */
      public boolean hasMname() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>optional string mname = 2;</code>
       */
      public String getMname() {
        Object ref = mname_;
        if (!(ref instanceof String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            mname_ = s;
          }
          return s;
        } else {
          return (String) ref;
        }
      }
      /**
       * <code>optional string mname = 2;</code>
       */
      public com.google.protobuf.ByteString
          getMnameBytes() {
        Object ref = mname_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (String) ref);
          mname_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string mname = 2;</code>
       */
      public Builder setMname(
          String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        mname_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string mname = 2;</code>
       */
      public Builder clearMname() {
        bitField0_ = (bitField0_ & ~0x00000002);
        mname_ = getDefaultInstance().getMname();
        onChanged();
        return this;
      }
      /**
       * <code>optional string mname = 2;</code>
       */
      public Builder setMnameBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        mname_ = value;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:RPCReq)
    }

    static {
      defaultInstance = new RPCReq(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:RPCReq)
  }

  public interface RPCRespOrBuilder extends
      // @@protoc_insertion_point(interface_extends:RPCResp)
      com.google.protobuf.MessageOrBuilder {
  }
  /**
   * Protobuf type {@code RPCResp}
   */
  public static final class RPCResp extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:RPCResp)
      RPCRespOrBuilder {
    // Use RPCResp.newBuilder() to construct.
    private RPCResp(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private RPCResp(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final RPCResp defaultInstance;
    public static RPCResp getDefaultInstance() {
      return defaultInstance;
    }

    public RPCResp getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private RPCResp(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      initFields();
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
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e.getMessage()).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return RPCInfo.internal_static_RPCResp_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return RPCInfo.internal_static_RPCResp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              RPCInfo.RPCResp.class, RPCInfo.RPCResp.Builder.class);
    }

    public static com.google.protobuf.Parser<RPCResp> PARSER =
        new com.google.protobuf.AbstractParser<RPCResp>() {
      public RPCResp parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new RPCResp(input, extensionRegistry);
      }
    };

    @Override
    public com.google.protobuf.Parser<RPCResp> getParserForType() {
      return PARSER;
    }

    private void initFields() {
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
      getSerializedSize();
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @Override
    protected Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }

    public static RPCInfo.RPCResp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static RPCInfo.RPCResp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static RPCInfo.RPCResp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static RPCInfo.RPCResp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static RPCInfo.RPCResp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static RPCInfo.RPCResp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static RPCInfo.RPCResp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static RPCInfo.RPCResp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static RPCInfo.RPCResp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static RPCInfo.RPCResp parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(RPCInfo.RPCResp prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }

    @Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code RPCResp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:RPCResp)
        RPCInfo.RPCRespOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return RPCInfo.internal_static_RPCResp_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return RPCInfo.internal_static_RPCResp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                RPCInfo.RPCResp.class, RPCInfo.RPCResp.Builder.class);
      }

      // Construct using RPCInfo.RPCResp.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return RPCInfo.internal_static_RPCResp_descriptor;
      }

      public RPCInfo.RPCResp getDefaultInstanceForType() {
        return RPCInfo.RPCResp.getDefaultInstance();
      }

      public RPCInfo.RPCResp build() {
        RPCInfo.RPCResp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public RPCInfo.RPCResp buildPartial() {
        RPCInfo.RPCResp result = new RPCInfo.RPCResp(this);
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof RPCInfo.RPCResp) {
          return mergeFrom((RPCInfo.RPCResp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(RPCInfo.RPCResp other) {
        if (other == RPCInfo.RPCResp.getDefaultInstance()) return this;
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        RPCInfo.RPCResp parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (RPCInfo.RPCResp) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      // @@protoc_insertion_point(builder_scope:RPCResp)
    }

    static {
      defaultInstance = new RPCResp(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:RPCResp)
  }

  /**
   * Protobuf service {@code ReduceService}
   */
  public static abstract class ReduceService
      implements com.google.protobuf.Service {
    protected ReduceService() {}

    public interface Interface {
      /**
       * <code>rpc reduce(.RPCReq) returns (.RPCResp);</code>
       */
      public abstract void reduce(
              com.google.protobuf.RpcController controller,
              RPCInfo.RPCReq request,
              com.google.protobuf.RpcCallback<RPCInfo.RPCResp> done);

    }

    public static com.google.protobuf.Service newReflectiveService(
        final Interface impl) {
      return new ReduceService() {
        @Override
        public  void reduce(
            com.google.protobuf.RpcController controller,
            RPCInfo.RPCReq request,
            com.google.protobuf.RpcCallback<RPCInfo.RPCResp> done) {
          impl.reduce(controller, request, done);
        }

      };
    }

    public static com.google.protobuf.BlockingService
        newReflectiveBlockingService(final BlockingInterface impl) {
      return new com.google.protobuf.BlockingService() {
        public final com.google.protobuf.Descriptors.ServiceDescriptor
            getDescriptorForType() {
          return getDescriptor();
        }

        public final com.google.protobuf.Message callBlockingMethod(
            com.google.protobuf.Descriptors.MethodDescriptor method,
            com.google.protobuf.RpcController controller,
            com.google.protobuf.Message request)
            throws com.google.protobuf.ServiceException {
          if (method.getService() != getDescriptor()) {
            throw new IllegalArgumentException(
              "Service.callBlockingMethod() given method descriptor for " +
              "wrong service type.");
          }
          switch(method.getIndex()) {
            case 0:
              return impl.reduce(controller, (RPCInfo.RPCReq)request);
            default:
              throw new AssertionError("Can't get here.");
          }
        }

        public final com.google.protobuf.Message
            getRequestPrototype(
            com.google.protobuf.Descriptors.MethodDescriptor method) {
          if (method.getService() != getDescriptor()) {
            throw new IllegalArgumentException(
              "Service.getRequestPrototype() given method " +
              "descriptor for wrong service type.");
          }
          switch(method.getIndex()) {
            case 0:
              return RPCInfo.RPCReq.getDefaultInstance();
            default:
              throw new AssertionError("Can't get here.");
          }
        }

        public final com.google.protobuf.Message
            getResponsePrototype(
            com.google.protobuf.Descriptors.MethodDescriptor method) {
          if (method.getService() != getDescriptor()) {
            throw new IllegalArgumentException(
              "Service.getResponsePrototype() given method " +
              "descriptor for wrong service type.");
          }
          switch(method.getIndex()) {
            case 0:
              return RPCInfo.RPCResp.getDefaultInstance();
            default:
              throw new AssertionError("Can't get here.");
          }
        }

      };
    }

    /**
     * <code>rpc reduce(.RPCReq) returns (.RPCResp);</code>
     */
    public abstract void reduce(
        com.google.protobuf.RpcController controller,
        RPCInfo.RPCReq request,
        com.google.protobuf.RpcCallback<RPCInfo.RPCResp> done);

    public static final
        com.google.protobuf.Descriptors.ServiceDescriptor
        getDescriptor() {
      return RPCInfo.getDescriptor().getServices().get(0);
    }
    public final com.google.protobuf.Descriptors.ServiceDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }

    public final void callMethod(
        com.google.protobuf.Descriptors.MethodDescriptor method,
        com.google.protobuf.RpcController controller,
        com.google.protobuf.Message request,
        com.google.protobuf.RpcCallback<
          com.google.protobuf.Message> done) {
      if (method.getService() != getDescriptor()) {
        throw new IllegalArgumentException(
          "Service.callMethod() given method descriptor for wrong " +
          "service type.");
      }
      switch(method.getIndex()) {
        case 0:
          this.reduce(controller, (RPCInfo.RPCReq)request,
            com.google.protobuf.RpcUtil.<RPCInfo.RPCResp>specializeCallback(
              done));
          return;
        default:
          throw new AssertionError("Can't get here.");
      }
    }

    public final com.google.protobuf.Message
        getRequestPrototype(
        com.google.protobuf.Descriptors.MethodDescriptor method) {
      if (method.getService() != getDescriptor()) {
        throw new IllegalArgumentException(
          "Service.getRequestPrototype() given method " +
          "descriptor for wrong service type.");
      }
      switch(method.getIndex()) {
        case 0:
          return RPCInfo.RPCReq.getDefaultInstance();
        default:
          throw new AssertionError("Can't get here.");
      }
    }

    public final com.google.protobuf.Message
        getResponsePrototype(
        com.google.protobuf.Descriptors.MethodDescriptor method) {
      if (method.getService() != getDescriptor()) {
        throw new IllegalArgumentException(
          "Service.getResponsePrototype() given method " +
          "descriptor for wrong service type.");
      }
      switch(method.getIndex()) {
        case 0:
          return RPCInfo.RPCResp.getDefaultInstance();
        default:
          throw new AssertionError("Can't get here.");
      }
    }

    public static Stub newStub(
        com.google.protobuf.RpcChannel channel) {
      return new Stub(channel);
    }

    public static final class Stub extends RPCInfo.ReduceService implements Interface {
      private Stub(com.google.protobuf.RpcChannel channel) {
        this.channel = channel;
      }

      private final com.google.protobuf.RpcChannel channel;

      public com.google.protobuf.RpcChannel getChannel() {
        return channel;
      }

      public  void reduce(
          com.google.protobuf.RpcController controller,
          RPCInfo.RPCReq request,
          com.google.protobuf.RpcCallback<RPCInfo.RPCResp> done) {
        channel.callMethod(
          getDescriptor().getMethods().get(0),
          controller,
          request,
          RPCInfo.RPCResp.getDefaultInstance(),
          com.google.protobuf.RpcUtil.generalizeCallback(
            done,
            RPCInfo.RPCResp.class,
            RPCInfo.RPCResp.getDefaultInstance()));
      }
    }

    public static BlockingInterface newBlockingStub(
        com.google.protobuf.BlockingRpcChannel channel) {
      return new BlockingStub(channel);
    }

    public interface BlockingInterface {
      public RPCInfo.RPCResp reduce(
              com.google.protobuf.RpcController controller,
              RPCInfo.RPCReq request)
          throws com.google.protobuf.ServiceException;
    }

    private static final class BlockingStub implements BlockingInterface {
      private BlockingStub(com.google.protobuf.BlockingRpcChannel channel) {
        this.channel = channel;
      }

      private final com.google.protobuf.BlockingRpcChannel channel;

      public RPCInfo.RPCResp reduce(
          com.google.protobuf.RpcController controller,
          RPCInfo.RPCReq request)
          throws com.google.protobuf.ServiceException {
        return (RPCInfo.RPCResp) channel.callBlockingMethod(
          getDescriptor().getMethods().get(0),
          controller,
          request,
          RPCInfo.RPCResp.getDefaultInstance());
      }

    }

    // @@protoc_insertion_point(class_scope:ReduceService)
  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_RPCReq_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_RPCReq_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_RPCReq_RPCHah_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_RPCReq_RPCHah_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_RPCResp_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_RPCResp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    String[] descriptorData = {
      "\n\013zebra.proto\"\257\003\n\006RPCReq\022\034\n\004hahs\030\001 \003(\0132\016" +
      ".RPCReq.RPCHah\022\r\n\005mname\030\002 \001(\t\032\367\002\n\006RPCHah" +
      "\022\016\n\006cellid\030\001 \002(\t\022\017\n\007appType\030\002 \001(\005\022\022\n\napp" +
      "Subtype\030\003 \001(\005\022\016\n\006userIP\030\004 \001(\t\022\020\n\010userPor" +
      "t\030\005 \001(\005\022\023\n\013appServerIP\030\006 \001(\t\022\025\n\rappServe" +
      "rPort\030\007 \001(\005\022\021\n\ttrafficUL\030\010 \001(\003\022\021\n\ttraffi" +
      "cDL\030\t \001(\003\022\020\n\010retranUL\030\n \001(\003\022\020\n\010retranDL\030" +
      "\013 \001(\003\022\014\n\004host\030\014 \001(\t\022\022\n\nreportTime\030\r \001(\003\022" +
      "\021\n\tsliceType\030\016 \001(\005\022\r\n\005slice\030\017 \001(\003\022\022\n\ntra" +
      "nsDelay\030\020 \001(\003\022\022\n\nshufflekey\030\021 \001(\t\022\020\n\010att",
      "empts\030\022 \001(\003\022\017\n\007accepts\030\023 \001(\003\022\021\n\tfailCoun" +
      "t\030\024 \001(\003\"\t\n\007RPCResp2,\n\rReduceService\022\033\n\006r" +
      "educe\022\007.RPCReq\032\010.RPCRespB\035\n\017cn.zebra.dom" +
      "ainB\007RPCInfo\210\001\001"
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
        }, assigner);
    internal_static_RPCReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_RPCReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_RPCReq_descriptor,
        new String[] { "Hahs", "Mname", });
    internal_static_RPCReq_RPCHah_descriptor =
      internal_static_RPCReq_descriptor.getNestedTypes().get(0);
    internal_static_RPCReq_RPCHah_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_RPCReq_RPCHah_descriptor,
        new String[] { "Cellid", "AppType", "AppSubtype", "UserIP", "UserPort", "AppServerIP", "AppServerPort", "TrafficUL", "TrafficDL", "RetranUL", "RetranDL", "Host", "ReportTime", "SliceType", "Slice", "TransDelay", "Shufflekey", "Attempts", "Accepts", "FailCount", });
    internal_static_RPCResp_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_RPCResp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_RPCResp_descriptor,
        new String[] { });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
