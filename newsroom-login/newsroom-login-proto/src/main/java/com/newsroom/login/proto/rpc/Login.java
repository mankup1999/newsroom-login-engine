// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: login.proto

package com.newsroom.login.proto.rpc;

public final class Login {
    private Login() {
    }

    public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {
    }

    public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
        registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
    }

    static final com.google.protobuf.Descriptors.Descriptor internal_static_com_newsroom_login_proto_rpc_LoginRequest_descriptor;
    static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable internal_static_com_newsroom_login_proto_rpc_LoginRequest_fieldAccessorTable;
    static final com.google.protobuf.Descriptors.Descriptor internal_static_com_newsroom_login_proto_rpc_LoginResponse_descriptor;
    static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable internal_static_com_newsroom_login_proto_rpc_LoginResponse_fieldAccessorTable;
    static final com.google.protobuf.Descriptors.Descriptor internal_static_com_newsroom_login_proto_rpc_Data_descriptor;
    static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable internal_static_com_newsroom_login_proto_rpc_Data_fieldAccessorTable;

    public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    private static com.google.protobuf.Descriptors.FileDescriptor descriptor;
    static {
        java.lang.String[] descriptorData = { "\n\013login.proto\022\034com.newsroom.login.proto."
                + "rpc\"=\n\014LoginRequest\022\016\n\006mailID\030\001 \001(\t\022\013\n\003m"
                + "ob\030\002 \001(\t\022\020\n\010password\030\003 \001(\t\"R\n\rLoginRespo"
                + "nse\022\017\n\007success\030\001 \001(\010\0220\n\004data\030\002 \001(\0132\".com"
                + ".newsroom.login.proto.rpc.Data\"\026\n\004Data\022\016"
                + "\n\006userID\030\001 \001(\t2p\n\014LoginService\022`\n\005login\022"
                + "*.com.newsroom.login.proto.rpc.LoginRequ" + "est\032+.com.newsroom.login.proto.rpc.Login"
                + "ResponseB\002P\001b\006proto3" };
        com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner = new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
            public com.google.protobuf.ExtensionRegistry assignDescriptors(
                    com.google.protobuf.Descriptors.FileDescriptor root) {
                descriptor = root;
                return null;
            }
        };
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData,
                new com.google.protobuf.Descriptors.FileDescriptor[] {}, assigner);
        internal_static_com_newsroom_login_proto_rpc_LoginRequest_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_com_newsroom_login_proto_rpc_LoginRequest_fieldAccessorTable = new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                internal_static_com_newsroom_login_proto_rpc_LoginRequest_descriptor,
                new java.lang.String[] { "MailID", "Mob", "Password", });
        internal_static_com_newsroom_login_proto_rpc_LoginResponse_descriptor = getDescriptor().getMessageTypes()
                .get(1);
        internal_static_com_newsroom_login_proto_rpc_LoginResponse_fieldAccessorTable = new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                internal_static_com_newsroom_login_proto_rpc_LoginResponse_descriptor,
                new java.lang.String[] { "Success", "Data", });
        internal_static_com_newsroom_login_proto_rpc_Data_descriptor = getDescriptor().getMessageTypes().get(2);
        internal_static_com_newsroom_login_proto_rpc_Data_fieldAccessorTable = new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                internal_static_com_newsroom_login_proto_rpc_Data_descriptor, new java.lang.String[] { "UserID", });
    }

    // @@protoc_insertion_point(outer_class_scope)
}
