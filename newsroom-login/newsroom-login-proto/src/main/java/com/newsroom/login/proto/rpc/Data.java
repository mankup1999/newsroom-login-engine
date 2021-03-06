// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: login.proto

package com.newsroom.login.proto.rpc;

/**
 * Protobuf type {@code com.newsroom.login.proto.rpc.Data}
 */
public final class Data extends com.google.protobuf.GeneratedMessageV3 implements
        // @@protoc_insertion_point(message_implements:com.newsroom.login.proto.rpc.Data)
        DataOrBuilder {
    // Use Data.newBuilder() to construct.
    private Data(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private Data() {
        userID_ = "";
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
        return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
    }

    private Data(com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
        this();
        int mutable_bitField0_ = 0;
        try {
            boolean done = false;
            while (!done) {
                int tag = input.readTag();
                switch (tag) {
                case 0:
                    done = true;
                    break;
                default: {
                    if (!input.skipField(tag)) {
                        done = true;
                    }
                    break;
                }
                case 10: {
                    java.lang.String s = input.readStringRequireUtf8();

                    userID_ = s;
                    break;
                }
                }
            }
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
            throw e.setUnfinishedMessage(this);
        } catch (java.io.IOException e) {
            throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
        } finally {
            makeExtensionsImmutable();
        }
    }

    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
        return com.newsroom.login.proto.rpc.Login.internal_static_com_newsroom_login_proto_rpc_Data_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return com.newsroom.login.proto.rpc.Login.internal_static_com_newsroom_login_proto_rpc_Data_fieldAccessorTable
                .ensureFieldAccessorsInitialized(com.newsroom.login.proto.rpc.Data.class,
                        com.newsroom.login.proto.rpc.Data.Builder.class);
    }

    public static final int USERID_FIELD_NUMBER = 1;
    private volatile java.lang.Object userID_;

    /**
     * <code>string userID = 1;</code>
     */
    public java.lang.String getUserID() {
        java.lang.Object ref = userID_;
        if (ref instanceof java.lang.String) {
            return (java.lang.String) ref;
        } else {
            com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
            java.lang.String s = bs.toStringUtf8();
            userID_ = s;
            return s;
        }
    }

    /**
     * <code>string userID = 1;</code>
     */
    public com.google.protobuf.ByteString getUserIDBytes() {
        java.lang.Object ref = userID_;
        if (ref instanceof java.lang.String) {
            com.google.protobuf.ByteString b = com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
            userID_ = b;
            return b;
        } else {
            return (com.google.protobuf.ByteString) ref;
        }
    }

    private byte memoizedIsInitialized = -1;

    public final boolean isInitialized() {
        byte isInitialized = memoizedIsInitialized;
        if (isInitialized == 1)
            return true;
        if (isInitialized == 0)
            return false;

        memoizedIsInitialized = 1;
        return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
        if (!getUserIDBytes().isEmpty()) {
            com.google.protobuf.GeneratedMessageV3.writeString(output, 1, userID_);
        }
    }

    public int getSerializedSize() {
        int size = memoizedSize;
        if (size != -1)
            return size;

        size = 0;
        if (!getUserIDBytes().isEmpty()) {
            size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, userID_);
        }
        memoizedSize = size;
        return size;
    }

    private static final long serialVersionUID = 0L;

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.newsroom.login.proto.rpc.Data)) {
            return super.equals(obj);
        }
        com.newsroom.login.proto.rpc.Data other = (com.newsroom.login.proto.rpc.Data) obj;

        boolean result = true;
        result = result && getUserID().equals(other.getUserID());
        return result;
    }

    @java.lang.Override
    public int hashCode() {
        if (memoizedHashCode != 0) {
            return memoizedHashCode;
        }
        int hash = 41;
        hash = (19 * hash) + getDescriptor().hashCode();
        hash = (37 * hash) + USERID_FIELD_NUMBER;
        hash = (53 * hash) + getUserID().hashCode();
        hash = (29 * hash) + unknownFields.hashCode();
        memoizedHashCode = hash;
        return hash;
    }

    public static com.newsroom.login.proto.rpc.Data parseFrom(java.nio.ByteBuffer data)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
    }

    public static com.newsroom.login.proto.rpc.Data parseFrom(java.nio.ByteBuffer data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
    }

    public static com.newsroom.login.proto.rpc.Data parseFrom(com.google.protobuf.ByteString data)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
    }

    public static com.newsroom.login.proto.rpc.Data parseFrom(com.google.protobuf.ByteString data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
    }

    public static com.newsroom.login.proto.rpc.Data parseFrom(byte[] data)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
    }

    public static com.newsroom.login.proto.rpc.Data parseFrom(byte[] data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
    }

    public static com.newsroom.login.proto.rpc.Data parseFrom(java.io.InputStream input) throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static com.newsroom.login.proto.rpc.Data parseFrom(java.io.InputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static com.newsroom.login.proto.rpc.Data parseDelimitedFrom(java.io.InputStream input)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
    }

    public static com.newsroom.login.proto.rpc.Data parseDelimitedFrom(java.io.InputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }

    public static com.newsroom.login.proto.rpc.Data parseFrom(com.google.protobuf.CodedInputStream input)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static com.newsroom.login.proto.rpc.Data parseFrom(com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
    }

    public Builder newBuilderForType() {
        return newBuilder();
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(com.newsroom.login.proto.rpc.Data prototype) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    public Builder toBuilder() {
        return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        Builder builder = new Builder(parent);
        return builder;
    }

    /**
     * Protobuf type {@code com.newsroom.login.proto.rpc.Data}
     */
    public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
            // @@protoc_insertion_point(builder_implements:com.newsroom.login.proto.rpc.Data)
            com.newsroom.login.proto.rpc.DataOrBuilder {
        public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
            return com.newsroom.login.proto.rpc.Login.internal_static_com_newsroom_login_proto_rpc_Data_descriptor;
        }

        protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return com.newsroom.login.proto.rpc.Login.internal_static_com_newsroom_login_proto_rpc_Data_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(com.newsroom.login.proto.rpc.Data.class,
                            com.newsroom.login.proto.rpc.Data.Builder.class);
        }

        // Construct using com.newsroom.login.proto.rpc.Data.newBuilder()
        private Builder() {
            maybeForceBuilderInitialization();
        }

        private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            maybeForceBuilderInitialization();
        }

        private void maybeForceBuilderInitialization() {
            if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
            }
        }

        public Builder clear() {
            super.clear();
            userID_ = "";

            return this;
        }

        public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
            return com.newsroom.login.proto.rpc.Login.internal_static_com_newsroom_login_proto_rpc_Data_descriptor;
        }

        public com.newsroom.login.proto.rpc.Data getDefaultInstanceForType() {
            return com.newsroom.login.proto.rpc.Data.getDefaultInstance();
        }

        public com.newsroom.login.proto.rpc.Data build() {
            com.newsroom.login.proto.rpc.Data result = buildPartial();
            if (!result.isInitialized()) {
                throw newUninitializedMessageException(result);
            }
            return result;
        }

        public com.newsroom.login.proto.rpc.Data buildPartial() {
            com.newsroom.login.proto.rpc.Data result = new com.newsroom.login.proto.rpc.Data(this);
            result.userID_ = userID_;
            onBuilt();
            return result;
        }

        public Builder clone() {
            return (Builder) super.clone();
        }

        public Builder setField(com.google.protobuf.Descriptors.FieldDescriptor field, Object value) {
            return (Builder) super.setField(field, value);
        }

        public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
            return (Builder) super.clearField(field);
        }

        public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
            return (Builder) super.clearOneof(oneof);
        }

        public Builder setRepeatedField(com.google.protobuf.Descriptors.FieldDescriptor field, int index,
                Object value) {
            return (Builder) super.setRepeatedField(field, index, value);
        }

        public Builder addRepeatedField(com.google.protobuf.Descriptors.FieldDescriptor field, Object value) {
            return (Builder) super.addRepeatedField(field, value);
        }

        public Builder mergeFrom(com.google.protobuf.Message other) {
            if (other instanceof com.newsroom.login.proto.rpc.Data) {
                return mergeFrom((com.newsroom.login.proto.rpc.Data) other);
            } else {
                super.mergeFrom(other);
                return this;
            }
        }

        public Builder mergeFrom(com.newsroom.login.proto.rpc.Data other) {
            if (other == com.newsroom.login.proto.rpc.Data.getDefaultInstance())
                return this;
            if (!other.getUserID().isEmpty()) {
                userID_ = other.userID_;
                onChanged();
            }
            onChanged();
            return this;
        }

        public final boolean isInitialized() {
            return true;
        }

        public Builder mergeFrom(com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
            com.newsroom.login.proto.rpc.Data parsedMessage = null;
            try {
                parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                parsedMessage = (com.newsroom.login.proto.rpc.Data) e.getUnfinishedMessage();
                throw e.unwrapIOException();
            } finally {
                if (parsedMessage != null) {
                    mergeFrom(parsedMessage);
                }
            }
            return this;
        }

        private java.lang.Object userID_ = "";

        /**
         * <code>string userID = 1;</code>
         */
        public java.lang.String getUserID() {
            java.lang.Object ref = userID_;
            if (!(ref instanceof java.lang.String)) {
                com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
                java.lang.String s = bs.toStringUtf8();
                userID_ = s;
                return s;
            } else {
                return (java.lang.String) ref;
            }
        }

        /**
         * <code>string userID = 1;</code>
         */
        public com.google.protobuf.ByteString getUserIDBytes() {
            java.lang.Object ref = userID_;
            if (ref instanceof String) {
                com.google.protobuf.ByteString b = com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
                userID_ = b;
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
        }

        /**
         * <code>string userID = 1;</code>
         */
        public Builder setUserID(java.lang.String value) {
            if (value == null) {
                throw new NullPointerException();
            }

            userID_ = value;
            onChanged();
            return this;
        }

        /**
         * <code>string userID = 1;</code>
         */
        public Builder clearUserID() {

            userID_ = getDefaultInstance().getUserID();
            onChanged();
            return this;
        }

        /**
         * <code>string userID = 1;</code>
         */
        public Builder setUserIDBytes(com.google.protobuf.ByteString value) {
            if (value == null) {
                throw new NullPointerException();
            }
            checkByteStringIsUtf8(value);

            userID_ = value;
            onChanged();
            return this;
        }

        public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
            return this;
        }

        public final Builder mergeUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
            return this;
        }

        // @@protoc_insertion_point(builder_scope:com.newsroom.login.proto.rpc.Data)
    }

    // @@protoc_insertion_point(class_scope:com.newsroom.login.proto.rpc.Data)
    private static final com.newsroom.login.proto.rpc.Data DEFAULT_INSTANCE;
    static {
        DEFAULT_INSTANCE = new com.newsroom.login.proto.rpc.Data();
    }

    public static com.newsroom.login.proto.rpc.Data getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Data> PARSER = new com.google.protobuf.AbstractParser<Data>() {
        public Data parsePartialFrom(com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return new Data(input, extensionRegistry);
        }
    };

    public static com.google.protobuf.Parser<Data> parser() {
        return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Data> getParserForType() {
        return PARSER;
    }

    public com.newsroom.login.proto.rpc.Data getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

}
