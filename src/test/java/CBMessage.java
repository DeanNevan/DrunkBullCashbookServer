// source: CBMessage.proto

public final class CBMessage {
  private CBMessage() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  /**
   * Protobuf enum {@code Type}
   */
  public enum Type
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>UNKNOWN = 0;</code>
     */
    UNKNOWN(0),
    /**
     * <code>CONNECT = 1;</code>
     */
    CONNECT(1),
    /**
     * <code>HEARTBEAT = 2;</code>
     */
    HEARTBEAT(2),
    /**
     * <code>CREATE_GROUP = 3;</code>
     */
    CREATE_GROUP(3),
    /**
     * <code>ENTER_GROUP = 4;</code>
     */
    ENTER_GROUP(4),
    /**
     * <code>ADD_RECORD = 5;</code>
     */
    ADD_RECORD(5),
    /**
     * <code>REMOVE_RECORD = 6;</code>
     */
    REMOVE_RECORD(6),
    /**
     * <code>ADD_ACCOUNT = 7;</code>
     */
    ADD_ACCOUNT(7),
    /**
     * <code>REMOVE_ACCOUNT = 8;</code>
     */
    REMOVE_ACCOUNT(8),
    /**
     * <code>GET_ACCOUNTS = 9;</code>
     */
    GET_ACCOUNTS(9),
    /**
     * <code>EDIT_NICKNAME = 10;</code>
     */
    EDIT_NICKNAME(10),
    /**
     * <code>GET_RECORDS = 11;</code>
     */
    GET_RECORDS(11),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>UNKNOWN = 0;</code>
     */
    public static final int UNKNOWN_VALUE = 0;
    /**
     * <code>CONNECT = 1;</code>
     */
    public static final int CONNECT_VALUE = 1;
    /**
     * <code>HEARTBEAT = 2;</code>
     */
    public static final int HEARTBEAT_VALUE = 2;
    /**
     * <code>CREATE_GROUP = 3;</code>
     */
    public static final int CREATE_GROUP_VALUE = 3;
    /**
     * <code>ENTER_GROUP = 4;</code>
     */
    public static final int ENTER_GROUP_VALUE = 4;
    /**
     * <code>ADD_RECORD = 5;</code>
     */
    public static final int ADD_RECORD_VALUE = 5;
    /**
     * <code>REMOVE_RECORD = 6;</code>
     */
    public static final int REMOVE_RECORD_VALUE = 6;
    /**
     * <code>ADD_ACCOUNT = 7;</code>
     */
    public static final int ADD_ACCOUNT_VALUE = 7;
    /**
     * <code>REMOVE_ACCOUNT = 8;</code>
     */
    public static final int REMOVE_ACCOUNT_VALUE = 8;
    /**
     * <code>GET_ACCOUNTS = 9;</code>
     */
    public static final int GET_ACCOUNTS_VALUE = 9;
    /**
     * <code>EDIT_NICKNAME = 10;</code>
     */
    public static final int EDIT_NICKNAME_VALUE = 10;
    /**
     * <code>GET_RECORDS = 11;</code>
     */
    public static final int GET_RECORDS_VALUE = 11;


    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @Deprecated
    public static Type valueOf(int value) {
      return forNumber(value);
    }

    public static Type forNumber(int value) {
      switch (value) {
        case 0: return UNKNOWN;
        case 1: return CONNECT;
        case 2: return HEARTBEAT;
        case 3: return CREATE_GROUP;
        case 4: return ENTER_GROUP;
        case 5: return ADD_RECORD;
        case 6: return REMOVE_RECORD;
        case 7: return ADD_ACCOUNT;
        case 8: return REMOVE_ACCOUNT;
        case 9: return GET_ACCOUNTS;
        case 10: return EDIT_NICKNAME;
        case 11: return GET_RECORDS;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<Type>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        Type> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<Type>() {
            public Type findValueByNumber(int number) {
              return Type.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return CBMessage.getDescriptor().getEnumTypes().get(0);
    }

    private static final Type[] VALUES = values();

    public static Type valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private Type(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:Type)
  }

  /**
   * Protobuf enum {@code SortType}
   */
  public enum SortType
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>SORT_ID = 0;</code>
     */
    SORT_ID(0),
    /**
     * <code>SORT_TITLE = 1;</code>
     */
    SORT_TITLE(1),
    /**
     * <code>SORT_MONEY = 2;</code>
     */
    SORT_MONEY(2),
    /**
     * <code>SORT_USERNAME = 3;</code>
     */
    SORT_USERNAME(3),
    /**
     * <code>SORT_DATE = 4;</code>
     */
    SORT_DATE(4),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>SORT_ID = 0;</code>
     */
    public static final int SORT_ID_VALUE = 0;
    /**
     * <code>SORT_TITLE = 1;</code>
     */
    public static final int SORT_TITLE_VALUE = 1;
    /**
     * <code>SORT_MONEY = 2;</code>
     */
    public static final int SORT_MONEY_VALUE = 2;
    /**
     * <code>SORT_USERNAME = 3;</code>
     */
    public static final int SORT_USERNAME_VALUE = 3;
    /**
     * <code>SORT_DATE = 4;</code>
     */
    public static final int SORT_DATE_VALUE = 4;


    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @Deprecated
    public static SortType valueOf(int value) {
      return forNumber(value);
    }

    public static SortType forNumber(int value) {
      switch (value) {
        case 0: return SORT_ID;
        case 1: return SORT_TITLE;
        case 2: return SORT_MONEY;
        case 3: return SORT_USERNAME;
        case 4: return SORT_DATE;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<SortType>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        SortType> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<SortType>() {
            public SortType findValueByNumber(int number) {
              return SortType.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return CBMessage.getDescriptor().getEnumTypes().get(1);
    }

    private static final SortType[] VALUES = values();

    public static SortType valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private SortType(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:SortType)
  }

  /**
   * Protobuf enum {@code SearchType}
   */
  public enum SearchType
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>SEARCH_ID = 0;</code>
     */
    SEARCH_ID(0),
    /**
     * <code>SEARCH_TITLE = 1;</code>
     */
    SEARCH_TITLE(1),
    /**
     * <code>SEARCH_MONEY = 2;</code>
     */
    SEARCH_MONEY(2),
    /**
     * <code>SEARCH_USERNAME = 3;</code>
     */
    SEARCH_USERNAME(3),
    /**
     * <code>SEARCH_DATE = 4;</code>
     */
    SEARCH_DATE(4),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>SEARCH_ID = 0;</code>
     */
    public static final int SEARCH_ID_VALUE = 0;
    /**
     * <code>SEARCH_TITLE = 1;</code>
     */
    public static final int SEARCH_TITLE_VALUE = 1;
    /**
     * <code>SEARCH_MONEY = 2;</code>
     */
    public static final int SEARCH_MONEY_VALUE = 2;
    /**
     * <code>SEARCH_USERNAME = 3;</code>
     */
    public static final int SEARCH_USERNAME_VALUE = 3;
    /**
     * <code>SEARCH_DATE = 4;</code>
     */
    public static final int SEARCH_DATE_VALUE = 4;


    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @Deprecated
    public static SearchType valueOf(int value) {
      return forNumber(value);
    }

    public static SearchType forNumber(int value) {
      switch (value) {
        case 0: return SEARCH_ID;
        case 1: return SEARCH_TITLE;
        case 2: return SEARCH_MONEY;
        case 3: return SEARCH_USERNAME;
        case 4: return SEARCH_DATE;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<SearchType>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        SearchType> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<SearchType>() {
            public SearchType findValueByNumber(int number) {
              return SearchType.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return CBMessage.getDescriptor().getEnumTypes().get(2);
    }

    private static final SearchType[] VALUES = values();

    public static SearchType valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private SearchType(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:SearchType)
  }

  public interface UserOrBuilder extends
      // @@protoc_insertion_point(interface_extends:User)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>string groupname = 1;</code>
     */
    String getGroupname();
    /**
     * <code>string groupname = 1;</code>
     */
    com.google.protobuf.ByteString
        getGroupnameBytes();

    /**
     * <code>string username = 2;</code>
     */
    String getUsername();
    /**
     * <code>string username = 2;</code>
     */
    com.google.protobuf.ByteString
        getUsernameBytes();

    /**
     * <code>string nickname = 3;</code>
     */
    String getNickname();
    /**
     * <code>string nickname = 3;</code>
     */
    com.google.protobuf.ByteString
        getNicknameBytes();

    /**
     * <code>string password = 4;</code>
     */
    String getPassword();
    /**
     * <code>string password = 4;</code>
     */
    com.google.protobuf.ByteString
        getPasswordBytes();

    /**
     * <code>bool admin = 5;</code>
     */
    boolean getAdmin();

    /**
     * <code>bool read = 6;</code>
     */
    boolean getRead();

    /**
     * <code>bool write = 7;</code>
     */
    boolean getWrite();
  }
  /**
   * Protobuf type {@code User}
   */
  public  static final class User extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:User)
      UserOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use User.newBuilder() to construct.
    private User(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private User() {
      groupname_ = "";
      username_ = "";
      nickname_ = "";
      password_ = "";
    }

    @Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private User(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new NullPointerException();
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
            case 10: {
              String s = input.readStringRequireUtf8();

              groupname_ = s;
              break;
            }
            case 18: {
              String s = input.readStringRequireUtf8();

              username_ = s;
              break;
            }
            case 26: {
              String s = input.readStringRequireUtf8();

              nickname_ = s;
              break;
            }
            case 34: {
              String s = input.readStringRequireUtf8();

              password_ = s;
              break;
            }
            case 40: {

              admin_ = input.readBool();
              break;
            }
            case 48: {

              read_ = input.readBool();
              break;
            }
            case 56: {

              write_ = input.readBool();
              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
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
            e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return CBMessage.internal_static_User_descriptor;
    }

    @Override
    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return CBMessage.internal_static_User_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              User.class, Builder.class);
    }

    public static final int GROUPNAME_FIELD_NUMBER = 1;
    private volatile Object groupname_;
    /**
     * <code>string groupname = 1;</code>
     */
    public String getGroupname() {
      Object ref = groupname_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        groupname_ = s;
        return s;
      }
    }
    /**
     * <code>string groupname = 1;</code>
     */
    public com.google.protobuf.ByteString
        getGroupnameBytes() {
      Object ref = groupname_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        groupname_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int USERNAME_FIELD_NUMBER = 2;
    private volatile Object username_;
    /**
     * <code>string username = 2;</code>
     */
    public String getUsername() {
      Object ref = username_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        username_ = s;
        return s;
      }
    }
    /**
     * <code>string username = 2;</code>
     */
    public com.google.protobuf.ByteString
        getUsernameBytes() {
      Object ref = username_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        username_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int NICKNAME_FIELD_NUMBER = 3;
    private volatile Object nickname_;
    /**
     * <code>string nickname = 3;</code>
     */
    public String getNickname() {
      Object ref = nickname_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        nickname_ = s;
        return s;
      }
    }
    /**
     * <code>string nickname = 3;</code>
     */
    public com.google.protobuf.ByteString
        getNicknameBytes() {
      Object ref = nickname_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        nickname_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int PASSWORD_FIELD_NUMBER = 4;
    private volatile Object password_;
    /**
     * <code>string password = 4;</code>
     */
    public String getPassword() {
      Object ref = password_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        password_ = s;
        return s;
      }
    }
    /**
     * <code>string password = 4;</code>
     */
    public com.google.protobuf.ByteString
        getPasswordBytes() {
      Object ref = password_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        password_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int ADMIN_FIELD_NUMBER = 5;
    private boolean admin_;
    /**
     * <code>bool admin = 5;</code>
     */
    public boolean getAdmin() {
      return admin_;
    }

    public static final int READ_FIELD_NUMBER = 6;
    private boolean read_;
    /**
     * <code>bool read = 6;</code>
     */
    public boolean getRead() {
      return read_;
    }

    public static final int WRITE_FIELD_NUMBER = 7;
    private boolean write_;
    /**
     * <code>bool write = 7;</code>
     */
    public boolean getWrite() {
      return write_;
    }

    private byte memoizedIsInitialized = -1;
    @Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (!getGroupnameBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, groupname_);
      }
      if (!getUsernameBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, username_);
      }
      if (!getNicknameBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 3, nickname_);
      }
      if (!getPasswordBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 4, password_);
      }
      if (admin_ != false) {
        output.writeBool(5, admin_);
      }
      if (read_ != false) {
        output.writeBool(6, read_);
      }
      if (write_ != false) {
        output.writeBool(7, write_);
      }
      unknownFields.writeTo(output);
    }

    @Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!getGroupnameBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, groupname_);
      }
      if (!getUsernameBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, username_);
      }
      if (!getNicknameBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, nickname_);
      }
      if (!getPasswordBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, password_);
      }
      if (admin_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(5, admin_);
      }
      if (read_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(6, read_);
      }
      if (write_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(7, write_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @Override
    public boolean equals(final Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof User)) {
        return super.equals(obj);
      }
      User other = (User) obj;

      if (!getGroupname()
          .equals(other.getGroupname())) return false;
      if (!getUsername()
          .equals(other.getUsername())) return false;
      if (!getNickname()
          .equals(other.getNickname())) return false;
      if (!getPassword()
          .equals(other.getPassword())) return false;
      if (getAdmin()
          != other.getAdmin()) return false;
      if (getRead()
          != other.getRead()) return false;
      if (getWrite()
          != other.getWrite()) return false;
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + GROUPNAME_FIELD_NUMBER;
      hash = (53 * hash) + getGroupname().hashCode();
      hash = (37 * hash) + USERNAME_FIELD_NUMBER;
      hash = (53 * hash) + getUsername().hashCode();
      hash = (37 * hash) + NICKNAME_FIELD_NUMBER;
      hash = (53 * hash) + getNickname().hashCode();
      hash = (37 * hash) + PASSWORD_FIELD_NUMBER;
      hash = (53 * hash) + getPassword().hashCode();
      hash = (37 * hash) + ADMIN_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getAdmin());
      hash = (37 * hash) + READ_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getRead());
      hash = (37 * hash) + WRITE_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getWrite());
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static User parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static User parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static User parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static User parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static User parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static User parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static User parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static User parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static User parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static User parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static User parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static User parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(User prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @Override
    protected Builder newBuilderForType(
        BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code User}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:User)
        UserOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return CBMessage.internal_static_User_descriptor;
      }

      @Override
      protected FieldAccessorTable
          internalGetFieldAccessorTable() {
        return CBMessage.internal_static_User_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                User.class, Builder.class);
      }

      // Construct using CBMessage.User.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      @Override
      public Builder clear() {
        super.clear();
        groupname_ = "";

        username_ = "";

        nickname_ = "";

        password_ = "";

        admin_ = false;

        read_ = false;

        write_ = false;

        return this;
      }

      @Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return CBMessage.internal_static_User_descriptor;
      }

      @Override
      public User getDefaultInstanceForType() {
        return User.getDefaultInstance();
      }

      @Override
      public User build() {
        User result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @Override
      public User buildPartial() {
        User result = new User(this);
        result.groupname_ = groupname_;
        result.username_ = username_;
        result.nickname_ = nickname_;
        result.password_ = password_;
        result.admin_ = admin_;
        result.read_ = read_;
        result.write_ = write_;
        onBuilt();
        return result;
      }

      @Override
      public Builder clone() {
        return super.clone();
      }
      @Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return super.setField(field, value);
      }
      @Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return super.addRepeatedField(field, value);
      }
      @Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof User) {
          return mergeFrom((User)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(User other) {
        if (other == User.getDefaultInstance()) return this;
        if (!other.getGroupname().isEmpty()) {
          groupname_ = other.groupname_;
          onChanged();
        }
        if (!other.getUsername().isEmpty()) {
          username_ = other.username_;
          onChanged();
        }
        if (!other.getNickname().isEmpty()) {
          nickname_ = other.nickname_;
          onChanged();
        }
        if (!other.getPassword().isEmpty()) {
          password_ = other.password_;
          onChanged();
        }
        if (other.getAdmin() != false) {
          setAdmin(other.getAdmin());
        }
        if (other.getRead() != false) {
          setRead(other.getRead());
        }
        if (other.getWrite() != false) {
          setWrite(other.getWrite());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @Override
      public final boolean isInitialized() {
        return true;
      }

      @Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        User parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (User) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private Object groupname_ = "";
      /**
       * <code>string groupname = 1;</code>
       */
      public String getGroupname() {
        Object ref = groupname_;
        if (!(ref instanceof String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          String s = bs.toStringUtf8();
          groupname_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      /**
       * <code>string groupname = 1;</code>
       */
      public com.google.protobuf.ByteString
          getGroupnameBytes() {
        Object ref = groupname_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (String) ref);
          groupname_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string groupname = 1;</code>
       */
      public Builder setGroupname(
          String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        groupname_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string groupname = 1;</code>
       */
      public Builder clearGroupname() {
        
        groupname_ = getDefaultInstance().getGroupname();
        onChanged();
        return this;
      }
      /**
       * <code>string groupname = 1;</code>
       */
      public Builder setGroupnameBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        groupname_ = value;
        onChanged();
        return this;
      }

      private Object username_ = "";
      /**
       * <code>string username = 2;</code>
       */
      public String getUsername() {
        Object ref = username_;
        if (!(ref instanceof String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          String s = bs.toStringUtf8();
          username_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      /**
       * <code>string username = 2;</code>
       */
      public com.google.protobuf.ByteString
          getUsernameBytes() {
        Object ref = username_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (String) ref);
          username_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string username = 2;</code>
       */
      public Builder setUsername(
          String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        username_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string username = 2;</code>
       */
      public Builder clearUsername() {
        
        username_ = getDefaultInstance().getUsername();
        onChanged();
        return this;
      }
      /**
       * <code>string username = 2;</code>
       */
      public Builder setUsernameBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        username_ = value;
        onChanged();
        return this;
      }

      private Object nickname_ = "";
      /**
       * <code>string nickname = 3;</code>
       */
      public String getNickname() {
        Object ref = nickname_;
        if (!(ref instanceof String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          String s = bs.toStringUtf8();
          nickname_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      /**
       * <code>string nickname = 3;</code>
       */
      public com.google.protobuf.ByteString
          getNicknameBytes() {
        Object ref = nickname_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (String) ref);
          nickname_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string nickname = 3;</code>
       */
      public Builder setNickname(
          String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        nickname_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string nickname = 3;</code>
       */
      public Builder clearNickname() {
        
        nickname_ = getDefaultInstance().getNickname();
        onChanged();
        return this;
      }
      /**
       * <code>string nickname = 3;</code>
       */
      public Builder setNicknameBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        nickname_ = value;
        onChanged();
        return this;
      }

      private Object password_ = "";
      /**
       * <code>string password = 4;</code>
       */
      public String getPassword() {
        Object ref = password_;
        if (!(ref instanceof String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          String s = bs.toStringUtf8();
          password_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      /**
       * <code>string password = 4;</code>
       */
      public com.google.protobuf.ByteString
          getPasswordBytes() {
        Object ref = password_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (String) ref);
          password_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string password = 4;</code>
       */
      public Builder setPassword(
          String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        password_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string password = 4;</code>
       */
      public Builder clearPassword() {
        
        password_ = getDefaultInstance().getPassword();
        onChanged();
        return this;
      }
      /**
       * <code>string password = 4;</code>
       */
      public Builder setPasswordBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        password_ = value;
        onChanged();
        return this;
      }

      private boolean admin_ ;
      /**
       * <code>bool admin = 5;</code>
       */
      public boolean getAdmin() {
        return admin_;
      }
      /**
       * <code>bool admin = 5;</code>
       */
      public Builder setAdmin(boolean value) {
        
        admin_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool admin = 5;</code>
       */
      public Builder clearAdmin() {
        
        admin_ = false;
        onChanged();
        return this;
      }

      private boolean read_ ;
      /**
       * <code>bool read = 6;</code>
       */
      public boolean getRead() {
        return read_;
      }
      /**
       * <code>bool read = 6;</code>
       */
      public Builder setRead(boolean value) {
        
        read_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool read = 6;</code>
       */
      public Builder clearRead() {
        
        read_ = false;
        onChanged();
        return this;
      }

      private boolean write_ ;
      /**
       * <code>bool write = 7;</code>
       */
      public boolean getWrite() {
        return write_;
      }
      /**
       * <code>bool write = 7;</code>
       */
      public Builder setWrite(boolean value) {
        
        write_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool write = 7;</code>
       */
      public Builder clearWrite() {
        
        write_ = false;
        onChanged();
        return this;
      }
      @Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:User)
    }

    // @@protoc_insertion_point(class_scope:User)
    private static final User DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new User();
    }

    public static User getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<User>
        PARSER = new com.google.protobuf.AbstractParser<User>() {
      @Override
      public User parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new User(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<User> parser() {
      return PARSER;
    }

    @Override
    public com.google.protobuf.Parser<User> getParserForType() {
      return PARSER;
    }

    @Override
    public User getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface RecordOrBuilder extends
      // @@protoc_insertion_point(interface_extends:Record)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>int32 id = 1;</code>
     */
    int getId();

    /**
     * <code>string groupname = 2;</code>
     */
    String getGroupname();
    /**
     * <code>string groupname = 2;</code>
     */
    com.google.protobuf.ByteString
        getGroupnameBytes();

    /**
     * <code>string username = 3;</code>
     */
    String getUsername();
    /**
     * <code>string username = 3;</code>
     */
    com.google.protobuf.ByteString
        getUsernameBytes();

    /**
     * <code>string title = 4;</code>
     */
    String getTitle();
    /**
     * <code>string title = 4;</code>
     */
    com.google.protobuf.ByteString
        getTitleBytes();

    /**
     * <code>string comment = 5;</code>
     */
    String getComment();
    /**
     * <code>string comment = 5;</code>
     */
    com.google.protobuf.ByteString
        getCommentBytes();

    /**
     * <code>double money = 6;</code>
     */
    double getMoney();

    /**
     * <code>int64 date = 7;</code>
     */
    long getDate();

    /**
     * <code>repeated string images_data = 8;</code>
     */
    java.util.List<String>
        getImagesDataList();
    /**
     * <code>repeated string images_data = 8;</code>
     */
    int getImagesDataCount();
    /**
     * <code>repeated string images_data = 8;</code>
     */
    String getImagesData(int index);
    /**
     * <code>repeated string images_data = 8;</code>
     */
    com.google.protobuf.ByteString
        getImagesDataBytes(int index);
  }
  /**
   * Protobuf type {@code Record}
   */
  public  static final class Record extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:Record)
      RecordOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Record.newBuilder() to construct.
    private Record(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Record() {
      groupname_ = "";
      username_ = "";
      title_ = "";
      comment_ = "";
      imagesData_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    }

    @Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private Record(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new NullPointerException();
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
            case 8: {

              id_ = input.readInt32();
              break;
            }
            case 18: {
              String s = input.readStringRequireUtf8();

              groupname_ = s;
              break;
            }
            case 26: {
              String s = input.readStringRequireUtf8();

              username_ = s;
              break;
            }
            case 34: {
              String s = input.readStringRequireUtf8();

              title_ = s;
              break;
            }
            case 42: {
              String s = input.readStringRequireUtf8();

              comment_ = s;
              break;
            }
            case 49: {

              money_ = input.readDouble();
              break;
            }
            case 56: {

              date_ = input.readInt64();
              break;
            }
            case 66: {
              String s = input.readStringRequireUtf8();
              if (!((mutable_bitField0_ & 0x00000080) != 0)) {
                imagesData_ = new com.google.protobuf.LazyStringArrayList();
                mutable_bitField0_ |= 0x00000080;
              }
              imagesData_.add(s);
              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
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
            e).setUnfinishedMessage(this);
      } finally {
        if (((mutable_bitField0_ & 0x00000080) != 0)) {
          imagesData_ = imagesData_.getUnmodifiableView();
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return CBMessage.internal_static_Record_descriptor;
    }

    @Override
    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return CBMessage.internal_static_Record_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              Record.class, Builder.class);
    }

    private int bitField0_;
    public static final int ID_FIELD_NUMBER = 1;
    private int id_;
    /**
     * <code>int32 id = 1;</code>
     */
    public int getId() {
      return id_;
    }

    public static final int GROUPNAME_FIELD_NUMBER = 2;
    private volatile Object groupname_;
    /**
     * <code>string groupname = 2;</code>
     */
    public String getGroupname() {
      Object ref = groupname_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        groupname_ = s;
        return s;
      }
    }
    /**
     * <code>string groupname = 2;</code>
     */
    public com.google.protobuf.ByteString
        getGroupnameBytes() {
      Object ref = groupname_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        groupname_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int USERNAME_FIELD_NUMBER = 3;
    private volatile Object username_;
    /**
     * <code>string username = 3;</code>
     */
    public String getUsername() {
      Object ref = username_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        username_ = s;
        return s;
      }
    }
    /**
     * <code>string username = 3;</code>
     */
    public com.google.protobuf.ByteString
        getUsernameBytes() {
      Object ref = username_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        username_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int TITLE_FIELD_NUMBER = 4;
    private volatile Object title_;
    /**
     * <code>string title = 4;</code>
     */
    public String getTitle() {
      Object ref = title_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        title_ = s;
        return s;
      }
    }
    /**
     * <code>string title = 4;</code>
     */
    public com.google.protobuf.ByteString
        getTitleBytes() {
      Object ref = title_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        title_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int COMMENT_FIELD_NUMBER = 5;
    private volatile Object comment_;
    /**
     * <code>string comment = 5;</code>
     */
    public String getComment() {
      Object ref = comment_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        comment_ = s;
        return s;
      }
    }
    /**
     * <code>string comment = 5;</code>
     */
    public com.google.protobuf.ByteString
        getCommentBytes() {
      Object ref = comment_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        comment_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int MONEY_FIELD_NUMBER = 6;
    private double money_;
    /**
     * <code>double money = 6;</code>
     */
    public double getMoney() {
      return money_;
    }

    public static final int DATE_FIELD_NUMBER = 7;
    private long date_;
    /**
     * <code>int64 date = 7;</code>
     */
    public long getDate() {
      return date_;
    }

    public static final int IMAGES_DATA_FIELD_NUMBER = 8;
    private com.google.protobuf.LazyStringList imagesData_;
    /**
     * <code>repeated string images_data = 8;</code>
     */
    public com.google.protobuf.ProtocolStringList
        getImagesDataList() {
      return imagesData_;
    }
    /**
     * <code>repeated string images_data = 8;</code>
     */
    public int getImagesDataCount() {
      return imagesData_.size();
    }
    /**
     * <code>repeated string images_data = 8;</code>
     */
    public String getImagesData(int index) {
      return imagesData_.get(index);
    }
    /**
     * <code>repeated string images_data = 8;</code>
     */
    public com.google.protobuf.ByteString
        getImagesDataBytes(int index) {
      return imagesData_.getByteString(index);
    }

    private byte memoizedIsInitialized = -1;
    @Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (id_ != 0) {
        output.writeInt32(1, id_);
      }
      if (!getGroupnameBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, groupname_);
      }
      if (!getUsernameBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 3, username_);
      }
      if (!getTitleBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 4, title_);
      }
      if (!getCommentBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 5, comment_);
      }
      if (money_ != 0D) {
        output.writeDouble(6, money_);
      }
      if (date_ != 0L) {
        output.writeInt64(7, date_);
      }
      for (int i = 0; i < imagesData_.size(); i++) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 8, imagesData_.getRaw(i));
      }
      unknownFields.writeTo(output);
    }

    @Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (id_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(1, id_);
      }
      if (!getGroupnameBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, groupname_);
      }
      if (!getUsernameBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, username_);
      }
      if (!getTitleBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, title_);
      }
      if (!getCommentBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, comment_);
      }
      if (money_ != 0D) {
        size += com.google.protobuf.CodedOutputStream
          .computeDoubleSize(6, money_);
      }
      if (date_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(7, date_);
      }
      {
        int dataSize = 0;
        for (int i = 0; i < imagesData_.size(); i++) {
          dataSize += computeStringSizeNoTag(imagesData_.getRaw(i));
        }
        size += dataSize;
        size += 1 * getImagesDataList().size();
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @Override
    public boolean equals(final Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof Record)) {
        return super.equals(obj);
      }
      Record other = (Record) obj;

      if (getId()
          != other.getId()) return false;
      if (!getGroupname()
          .equals(other.getGroupname())) return false;
      if (!getUsername()
          .equals(other.getUsername())) return false;
      if (!getTitle()
          .equals(other.getTitle())) return false;
      if (!getComment()
          .equals(other.getComment())) return false;
      if (Double.doubleToLongBits(getMoney())
          != Double.doubleToLongBits(
              other.getMoney())) return false;
      if (getDate()
          != other.getDate()) return false;
      if (!getImagesDataList()
          .equals(other.getImagesDataList())) return false;
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + ID_FIELD_NUMBER;
      hash = (53 * hash) + getId();
      hash = (37 * hash) + GROUPNAME_FIELD_NUMBER;
      hash = (53 * hash) + getGroupname().hashCode();
      hash = (37 * hash) + USERNAME_FIELD_NUMBER;
      hash = (53 * hash) + getUsername().hashCode();
      hash = (37 * hash) + TITLE_FIELD_NUMBER;
      hash = (53 * hash) + getTitle().hashCode();
      hash = (37 * hash) + COMMENT_FIELD_NUMBER;
      hash = (53 * hash) + getComment().hashCode();
      hash = (37 * hash) + MONEY_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          Double.doubleToLongBits(getMoney()));
      hash = (37 * hash) + DATE_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getDate());
      if (getImagesDataCount() > 0) {
        hash = (37 * hash) + IMAGES_DATA_FIELD_NUMBER;
        hash = (53 * hash) + getImagesDataList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static Record parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static Record parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static Record parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static Record parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static Record parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static Record parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static Record parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static Record parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static Record parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static Record parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static Record parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static Record parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(Record prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @Override
    protected Builder newBuilderForType(
        BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code Record}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:Record)
        RecordOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return CBMessage.internal_static_Record_descriptor;
      }

      @Override
      protected FieldAccessorTable
          internalGetFieldAccessorTable() {
        return CBMessage.internal_static_Record_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                Record.class, Builder.class);
      }

      // Construct using CBMessage.Record.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      @Override
      public Builder clear() {
        super.clear();
        id_ = 0;

        groupname_ = "";

        username_ = "";

        title_ = "";

        comment_ = "";

        money_ = 0D;

        date_ = 0L;

        imagesData_ = com.google.protobuf.LazyStringArrayList.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000080);
        return this;
      }

      @Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return CBMessage.internal_static_Record_descriptor;
      }

      @Override
      public Record getDefaultInstanceForType() {
        return Record.getDefaultInstance();
      }

      @Override
      public Record build() {
        Record result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @Override
      public Record buildPartial() {
        Record result = new Record(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        result.id_ = id_;
        result.groupname_ = groupname_;
        result.username_ = username_;
        result.title_ = title_;
        result.comment_ = comment_;
        result.money_ = money_;
        result.date_ = date_;
        if (((bitField0_ & 0x00000080) != 0)) {
          imagesData_ = imagesData_.getUnmodifiableView();
          bitField0_ = (bitField0_ & ~0x00000080);
        }
        result.imagesData_ = imagesData_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      @Override
      public Builder clone() {
        return super.clone();
      }
      @Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return super.setField(field, value);
      }
      @Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return super.addRepeatedField(field, value);
      }
      @Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof Record) {
          return mergeFrom((Record)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(Record other) {
        if (other == Record.getDefaultInstance()) return this;
        if (other.getId() != 0) {
          setId(other.getId());
        }
        if (!other.getGroupname().isEmpty()) {
          groupname_ = other.groupname_;
          onChanged();
        }
        if (!other.getUsername().isEmpty()) {
          username_ = other.username_;
          onChanged();
        }
        if (!other.getTitle().isEmpty()) {
          title_ = other.title_;
          onChanged();
        }
        if (!other.getComment().isEmpty()) {
          comment_ = other.comment_;
          onChanged();
        }
        if (other.getMoney() != 0D) {
          setMoney(other.getMoney());
        }
        if (other.getDate() != 0L) {
          setDate(other.getDate());
        }
        if (!other.imagesData_.isEmpty()) {
          if (imagesData_.isEmpty()) {
            imagesData_ = other.imagesData_;
            bitField0_ = (bitField0_ & ~0x00000080);
          } else {
            ensureImagesDataIsMutable();
            imagesData_.addAll(other.imagesData_);
          }
          onChanged();
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @Override
      public final boolean isInitialized() {
        return true;
      }

      @Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        Record parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (Record) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private int id_ ;
      /**
       * <code>int32 id = 1;</code>
       */
      public int getId() {
        return id_;
      }
      /**
       * <code>int32 id = 1;</code>
       */
      public Builder setId(int value) {
        
        id_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 id = 1;</code>
       */
      public Builder clearId() {
        
        id_ = 0;
        onChanged();
        return this;
      }

      private Object groupname_ = "";
      /**
       * <code>string groupname = 2;</code>
       */
      public String getGroupname() {
        Object ref = groupname_;
        if (!(ref instanceof String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          String s = bs.toStringUtf8();
          groupname_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      /**
       * <code>string groupname = 2;</code>
       */
      public com.google.protobuf.ByteString
          getGroupnameBytes() {
        Object ref = groupname_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (String) ref);
          groupname_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string groupname = 2;</code>
       */
      public Builder setGroupname(
          String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        groupname_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string groupname = 2;</code>
       */
      public Builder clearGroupname() {
        
        groupname_ = getDefaultInstance().getGroupname();
        onChanged();
        return this;
      }
      /**
       * <code>string groupname = 2;</code>
       */
      public Builder setGroupnameBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        groupname_ = value;
        onChanged();
        return this;
      }

      private Object username_ = "";
      /**
       * <code>string username = 3;</code>
       */
      public String getUsername() {
        Object ref = username_;
        if (!(ref instanceof String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          String s = bs.toStringUtf8();
          username_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      /**
       * <code>string username = 3;</code>
       */
      public com.google.protobuf.ByteString
          getUsernameBytes() {
        Object ref = username_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (String) ref);
          username_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string username = 3;</code>
       */
      public Builder setUsername(
          String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        username_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string username = 3;</code>
       */
      public Builder clearUsername() {
        
        username_ = getDefaultInstance().getUsername();
        onChanged();
        return this;
      }
      /**
       * <code>string username = 3;</code>
       */
      public Builder setUsernameBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        username_ = value;
        onChanged();
        return this;
      }

      private Object title_ = "";
      /**
       * <code>string title = 4;</code>
       */
      public String getTitle() {
        Object ref = title_;
        if (!(ref instanceof String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          String s = bs.toStringUtf8();
          title_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      /**
       * <code>string title = 4;</code>
       */
      public com.google.protobuf.ByteString
          getTitleBytes() {
        Object ref = title_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (String) ref);
          title_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string title = 4;</code>
       */
      public Builder setTitle(
          String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        title_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string title = 4;</code>
       */
      public Builder clearTitle() {
        
        title_ = getDefaultInstance().getTitle();
        onChanged();
        return this;
      }
      /**
       * <code>string title = 4;</code>
       */
      public Builder setTitleBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        title_ = value;
        onChanged();
        return this;
      }

      private Object comment_ = "";
      /**
       * <code>string comment = 5;</code>
       */
      public String getComment() {
        Object ref = comment_;
        if (!(ref instanceof String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          String s = bs.toStringUtf8();
          comment_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      /**
       * <code>string comment = 5;</code>
       */
      public com.google.protobuf.ByteString
          getCommentBytes() {
        Object ref = comment_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (String) ref);
          comment_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string comment = 5;</code>
       */
      public Builder setComment(
          String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        comment_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string comment = 5;</code>
       */
      public Builder clearComment() {
        
        comment_ = getDefaultInstance().getComment();
        onChanged();
        return this;
      }
      /**
       * <code>string comment = 5;</code>
       */
      public Builder setCommentBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        comment_ = value;
        onChanged();
        return this;
      }

      private double money_ ;
      /**
       * <code>double money = 6;</code>
       */
      public double getMoney() {
        return money_;
      }
      /**
       * <code>double money = 6;</code>
       */
      public Builder setMoney(double value) {
        
        money_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>double money = 6;</code>
       */
      public Builder clearMoney() {
        
        money_ = 0D;
        onChanged();
        return this;
      }

      private long date_ ;
      /**
       * <code>int64 date = 7;</code>
       */
      public long getDate() {
        return date_;
      }
      /**
       * <code>int64 date = 7;</code>
       */
      public Builder setDate(long value) {
        
        date_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int64 date = 7;</code>
       */
      public Builder clearDate() {
        
        date_ = 0L;
        onChanged();
        return this;
      }

      private com.google.protobuf.LazyStringList imagesData_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      private void ensureImagesDataIsMutable() {
        if (!((bitField0_ & 0x00000080) != 0)) {
          imagesData_ = new com.google.protobuf.LazyStringArrayList(imagesData_);
          bitField0_ |= 0x00000080;
         }
      }
      /**
       * <code>repeated string images_data = 8;</code>
       */
      public com.google.protobuf.ProtocolStringList
          getImagesDataList() {
        return imagesData_.getUnmodifiableView();
      }
      /**
       * <code>repeated string images_data = 8;</code>
       */
      public int getImagesDataCount() {
        return imagesData_.size();
      }
      /**
       * <code>repeated string images_data = 8;</code>
       */
      public String getImagesData(int index) {
        return imagesData_.get(index);
      }
      /**
       * <code>repeated string images_data = 8;</code>
       */
      public com.google.protobuf.ByteString
          getImagesDataBytes(int index) {
        return imagesData_.getByteString(index);
      }
      /**
       * <code>repeated string images_data = 8;</code>
       */
      public Builder setImagesData(
          int index, String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  ensureImagesDataIsMutable();
        imagesData_.set(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated string images_data = 8;</code>
       */
      public Builder addImagesData(
          String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  ensureImagesDataIsMutable();
        imagesData_.add(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated string images_data = 8;</code>
       */
      public Builder addAllImagesData(
          Iterable<String> values) {
        ensureImagesDataIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, imagesData_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated string images_data = 8;</code>
       */
      public Builder clearImagesData() {
        imagesData_ = com.google.protobuf.LazyStringArrayList.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000080);
        onChanged();
        return this;
      }
      /**
       * <code>repeated string images_data = 8;</code>
       */
      public Builder addImagesDataBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        ensureImagesDataIsMutable();
        imagesData_.add(value);
        onChanged();
        return this;
      }
      @Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:Record)
    }

    // @@protoc_insertion_point(class_scope:Record)
    private static final Record DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new Record();
    }

    public static Record getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Record>
        PARSER = new com.google.protobuf.AbstractParser<Record>() {
      @Override
      public Record parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new Record(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<Record> parser() {
      return PARSER;
    }

    @Override
    public com.google.protobuf.Parser<Record> getParserForType() {
      return PARSER;
    }

    @Override
    public Record getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface RequestOrBuilder extends
      // @@protoc_insertion_point(interface_extends:Request)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.RequestConnect requestConnect = 1;</code>
     */
    boolean hasRequestConnect();
    /**
     * <code>.RequestConnect requestConnect = 1;</code>
     */
    RequestConnect getRequestConnect();
    /**
     * <code>.RequestConnect requestConnect = 1;</code>
     */
    RequestConnectOrBuilder getRequestConnectOrBuilder();

    /**
     * <code>.RequestHeartbeat requestHeartbeat = 2;</code>
     */
    boolean hasRequestHeartbeat();
    /**
     * <code>.RequestHeartbeat requestHeartbeat = 2;</code>
     */
    RequestHeartbeat getRequestHeartbeat();
    /**
     * <code>.RequestHeartbeat requestHeartbeat = 2;</code>
     */
    RequestHeartbeatOrBuilder getRequestHeartbeatOrBuilder();

    /**
     * <code>.RequestCreateGroup requestCreateGroup = 3;</code>
     */
    boolean hasRequestCreateGroup();
    /**
     * <code>.RequestCreateGroup requestCreateGroup = 3;</code>
     */
    RequestCreateGroup getRequestCreateGroup();
    /**
     * <code>.RequestCreateGroup requestCreateGroup = 3;</code>
     */
    RequestCreateGroupOrBuilder getRequestCreateGroupOrBuilder();

    /**
     * <code>.RequestEnterGroup requestEnterGroup = 4;</code>
     */
    boolean hasRequestEnterGroup();
    /**
     * <code>.RequestEnterGroup requestEnterGroup = 4;</code>
     */
    RequestEnterGroup getRequestEnterGroup();
    /**
     * <code>.RequestEnterGroup requestEnterGroup = 4;</code>
     */
    RequestEnterGroupOrBuilder getRequestEnterGroupOrBuilder();

    /**
     * <code>.RequestAddRecord requestAddRecord = 5;</code>
     */
    boolean hasRequestAddRecord();
    /**
     * <code>.RequestAddRecord requestAddRecord = 5;</code>
     */
    RequestAddRecord getRequestAddRecord();
    /**
     * <code>.RequestAddRecord requestAddRecord = 5;</code>
     */
    RequestAddRecordOrBuilder getRequestAddRecordOrBuilder();

    /**
     * <code>.RequestRemoveRecord requestRemoveRecord = 6;</code>
     */
    boolean hasRequestRemoveRecord();
    /**
     * <code>.RequestRemoveRecord requestRemoveRecord = 6;</code>
     */
    RequestRemoveRecord getRequestRemoveRecord();
    /**
     * <code>.RequestRemoveRecord requestRemoveRecord = 6;</code>
     */
    RequestRemoveRecordOrBuilder getRequestRemoveRecordOrBuilder();

    /**
     * <code>.RequestAddAccount requestAddAccount = 7;</code>
     */
    boolean hasRequestAddAccount();
    /**
     * <code>.RequestAddAccount requestAddAccount = 7;</code>
     */
    RequestAddAccount getRequestAddAccount();
    /**
     * <code>.RequestAddAccount requestAddAccount = 7;</code>
     */
    RequestAddAccountOrBuilder getRequestAddAccountOrBuilder();

    /**
     * <code>.RequestRemoveAccount requestRemoveAccount = 8;</code>
     */
    boolean hasRequestRemoveAccount();
    /**
     * <code>.RequestRemoveAccount requestRemoveAccount = 8;</code>
     */
    RequestRemoveAccount getRequestRemoveAccount();
    /**
     * <code>.RequestRemoveAccount requestRemoveAccount = 8;</code>
     */
    RequestRemoveAccountOrBuilder getRequestRemoveAccountOrBuilder();

    /**
     * <code>.RequestGetAccounts requestGetAccounts = 9;</code>
     */
    boolean hasRequestGetAccounts();
    /**
     * <code>.RequestGetAccounts requestGetAccounts = 9;</code>
     */
    RequestGetAccounts getRequestGetAccounts();
    /**
     * <code>.RequestGetAccounts requestGetAccounts = 9;</code>
     */
    RequestGetAccountsOrBuilder getRequestGetAccountsOrBuilder();

    /**
     * <code>.RequestEditNickname requestEditNickname = 10;</code>
     */
    boolean hasRequestEditNickname();
    /**
     * <code>.RequestEditNickname requestEditNickname = 10;</code>
     */
    RequestEditNickname getRequestEditNickname();
    /**
     * <code>.RequestEditNickname requestEditNickname = 10;</code>
     */
    RequestEditNicknameOrBuilder getRequestEditNicknameOrBuilder();

    /**
     * <code>.RequestGetRecords requestGetRecords = 11;</code>
     */
    boolean hasRequestGetRecords();
    /**
     * <code>.RequestGetRecords requestGetRecords = 11;</code>
     */
    RequestGetRecords getRequestGetRecords();
    /**
     * <code>.RequestGetRecords requestGetRecords = 11;</code>
     */
    RequestGetRecordsOrBuilder getRequestGetRecordsOrBuilder();

    /**
     * <code>.Type type = 12;</code>
     */
    int getTypeValue();
    /**
     * <code>.Type type = 12;</code>
     */
    Type getType();

    /**
     * <code>string client_id = 13;</code>
     */
    String getClientId();
    /**
     * <code>string client_id = 13;</code>
     */
    com.google.protobuf.ByteString
        getClientIdBytes();

    /**
     * <code>string tip = 14;</code>
     */
    String getTip();
    /**
     * <code>string tip = 14;</code>
     */
    com.google.protobuf.ByteString
        getTipBytes();

    /**
     * <code>int64 timestamp = 15;</code>
     */
    long getTimestamp();

    /**
     * <code>int32 request_id = 16;</code>
     */
    int getRequestId();

    public Request.DataBodyCase getDataBodyCase();
  }
  /**
   * Protobuf type {@code Request}
   */
  public  static final class Request extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:Request)
      RequestOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Request.newBuilder() to construct.
    private Request(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Request() {
      type_ = 0;
      clientId_ = "";
      tip_ = "";
    }

    @Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private Request(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new NullPointerException();
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
            case 10: {
              RequestConnect.Builder subBuilder = null;
              if (dataBodyCase_ == 1) {
                subBuilder = ((RequestConnect) dataBody_).toBuilder();
              }
              dataBody_ =
                  input.readMessage(RequestConnect.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom((RequestConnect) dataBody_);
                dataBody_ = subBuilder.buildPartial();
              }
              dataBodyCase_ = 1;
              break;
            }
            case 18: {
              RequestHeartbeat.Builder subBuilder = null;
              if (dataBodyCase_ == 2) {
                subBuilder = ((RequestHeartbeat) dataBody_).toBuilder();
              }
              dataBody_ =
                  input.readMessage(RequestHeartbeat.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom((RequestHeartbeat) dataBody_);
                dataBody_ = subBuilder.buildPartial();
              }
              dataBodyCase_ = 2;
              break;
            }
            case 26: {
              RequestCreateGroup.Builder subBuilder = null;
              if (dataBodyCase_ == 3) {
                subBuilder = ((RequestCreateGroup) dataBody_).toBuilder();
              }
              dataBody_ =
                  input.readMessage(RequestCreateGroup.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom((RequestCreateGroup) dataBody_);
                dataBody_ = subBuilder.buildPartial();
              }
              dataBodyCase_ = 3;
              break;
            }
            case 34: {
              RequestEnterGroup.Builder subBuilder = null;
              if (dataBodyCase_ == 4) {
                subBuilder = ((RequestEnterGroup) dataBody_).toBuilder();
              }
              dataBody_ =
                  input.readMessage(RequestEnterGroup.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom((RequestEnterGroup) dataBody_);
                dataBody_ = subBuilder.buildPartial();
              }
              dataBodyCase_ = 4;
              break;
            }
            case 42: {
              RequestAddRecord.Builder subBuilder = null;
              if (dataBodyCase_ == 5) {
                subBuilder = ((RequestAddRecord) dataBody_).toBuilder();
              }
              dataBody_ =
                  input.readMessage(RequestAddRecord.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom((RequestAddRecord) dataBody_);
                dataBody_ = subBuilder.buildPartial();
              }
              dataBodyCase_ = 5;
              break;
            }
            case 50: {
              RequestRemoveRecord.Builder subBuilder = null;
              if (dataBodyCase_ == 6) {
                subBuilder = ((RequestRemoveRecord) dataBody_).toBuilder();
              }
              dataBody_ =
                  input.readMessage(RequestRemoveRecord.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom((RequestRemoveRecord) dataBody_);
                dataBody_ = subBuilder.buildPartial();
              }
              dataBodyCase_ = 6;
              break;
            }
            case 58: {
              RequestAddAccount.Builder subBuilder = null;
              if (dataBodyCase_ == 7) {
                subBuilder = ((RequestAddAccount) dataBody_).toBuilder();
              }
              dataBody_ =
                  input.readMessage(RequestAddAccount.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom((RequestAddAccount) dataBody_);
                dataBody_ = subBuilder.buildPartial();
              }
              dataBodyCase_ = 7;
              break;
            }
            case 66: {
              RequestRemoveAccount.Builder subBuilder = null;
              if (dataBodyCase_ == 8) {
                subBuilder = ((RequestRemoveAccount) dataBody_).toBuilder();
              }
              dataBody_ =
                  input.readMessage(RequestRemoveAccount.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom((RequestRemoveAccount) dataBody_);
                dataBody_ = subBuilder.buildPartial();
              }
              dataBodyCase_ = 8;
              break;
            }
            case 74: {
              RequestGetAccounts.Builder subBuilder = null;
              if (dataBodyCase_ == 9) {
                subBuilder = ((RequestGetAccounts) dataBody_).toBuilder();
              }
              dataBody_ =
                  input.readMessage(RequestGetAccounts.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom((RequestGetAccounts) dataBody_);
                dataBody_ = subBuilder.buildPartial();
              }
              dataBodyCase_ = 9;
              break;
            }
            case 82: {
              RequestEditNickname.Builder subBuilder = null;
              if (dataBodyCase_ == 10) {
                subBuilder = ((RequestEditNickname) dataBody_).toBuilder();
              }
              dataBody_ =
                  input.readMessage(RequestEditNickname.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom((RequestEditNickname) dataBody_);
                dataBody_ = subBuilder.buildPartial();
              }
              dataBodyCase_ = 10;
              break;
            }
            case 90: {
              RequestGetRecords.Builder subBuilder = null;
              if (dataBodyCase_ == 11) {
                subBuilder = ((RequestGetRecords) dataBody_).toBuilder();
              }
              dataBody_ =
                  input.readMessage(RequestGetRecords.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom((RequestGetRecords) dataBody_);
                dataBody_ = subBuilder.buildPartial();
              }
              dataBodyCase_ = 11;
              break;
            }
            case 96: {
              int rawValue = input.readEnum();

              type_ = rawValue;
              break;
            }
            case 106: {
              String s = input.readStringRequireUtf8();

              clientId_ = s;
              break;
            }
            case 114: {
              String s = input.readStringRequireUtf8();

              tip_ = s;
              break;
            }
            case 120: {

              timestamp_ = input.readInt64();
              break;
            }
            case 128: {

              requestId_ = input.readInt32();
              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
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
            e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return CBMessage.internal_static_Request_descriptor;
    }

    @Override
    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return CBMessage.internal_static_Request_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              Request.class, Builder.class);
    }

    private int dataBodyCase_ = 0;
    private Object dataBody_;
    public enum DataBodyCase
        implements com.google.protobuf.Internal.EnumLite {
      REQUESTCONNECT(1),
      REQUESTHEARTBEAT(2),
      REQUESTCREATEGROUP(3),
      REQUESTENTERGROUP(4),
      REQUESTADDRECORD(5),
      REQUESTREMOVERECORD(6),
      REQUESTADDACCOUNT(7),
      REQUESTREMOVEACCOUNT(8),
      REQUESTGETACCOUNTS(9),
      REQUESTEDITNICKNAME(10),
      REQUESTGETRECORDS(11),
      DATABODY_NOT_SET(0);
      private final int value;
      private DataBodyCase(int value) {
        this.value = value;
      }
      /**
       * @deprecated Use {@link #forNumber(int)} instead.
       */
      @Deprecated
      public static DataBodyCase valueOf(int value) {
        return forNumber(value);
      }

      public static DataBodyCase forNumber(int value) {
        switch (value) {
          case 1: return REQUESTCONNECT;
          case 2: return REQUESTHEARTBEAT;
          case 3: return REQUESTCREATEGROUP;
          case 4: return REQUESTENTERGROUP;
          case 5: return REQUESTADDRECORD;
          case 6: return REQUESTREMOVERECORD;
          case 7: return REQUESTADDACCOUNT;
          case 8: return REQUESTREMOVEACCOUNT;
          case 9: return REQUESTGETACCOUNTS;
          case 10: return REQUESTEDITNICKNAME;
          case 11: return REQUESTGETRECORDS;
          case 0: return DATABODY_NOT_SET;
          default: return null;
        }
      }
      public int getNumber() {
        return this.value;
      }
    };

    public DataBodyCase
    getDataBodyCase() {
      return DataBodyCase.forNumber(
          dataBodyCase_);
    }

    public static final int REQUESTCONNECT_FIELD_NUMBER = 1;
    /**
     * <code>.RequestConnect requestConnect = 1;</code>
     */
    public boolean hasRequestConnect() {
      return dataBodyCase_ == 1;
    }
    /**
     * <code>.RequestConnect requestConnect = 1;</code>
     */
    public RequestConnect getRequestConnect() {
      if (dataBodyCase_ == 1) {
         return (RequestConnect) dataBody_;
      }
      return RequestConnect.getDefaultInstance();
    }
    /**
     * <code>.RequestConnect requestConnect = 1;</code>
     */
    public RequestConnectOrBuilder getRequestConnectOrBuilder() {
      if (dataBodyCase_ == 1) {
         return (RequestConnect) dataBody_;
      }
      return RequestConnect.getDefaultInstance();
    }

    public static final int REQUESTHEARTBEAT_FIELD_NUMBER = 2;
    /**
     * <code>.RequestHeartbeat requestHeartbeat = 2;</code>
     */
    public boolean hasRequestHeartbeat() {
      return dataBodyCase_ == 2;
    }
    /**
     * <code>.RequestHeartbeat requestHeartbeat = 2;</code>
     */
    public RequestHeartbeat getRequestHeartbeat() {
      if (dataBodyCase_ == 2) {
         return (RequestHeartbeat) dataBody_;
      }
      return RequestHeartbeat.getDefaultInstance();
    }
    /**
     * <code>.RequestHeartbeat requestHeartbeat = 2;</code>
     */
    public RequestHeartbeatOrBuilder getRequestHeartbeatOrBuilder() {
      if (dataBodyCase_ == 2) {
         return (RequestHeartbeat) dataBody_;
      }
      return RequestHeartbeat.getDefaultInstance();
    }

    public static final int REQUESTCREATEGROUP_FIELD_NUMBER = 3;
    /**
     * <code>.RequestCreateGroup requestCreateGroup = 3;</code>
     */
    public boolean hasRequestCreateGroup() {
      return dataBodyCase_ == 3;
    }
    /**
     * <code>.RequestCreateGroup requestCreateGroup = 3;</code>
     */
    public RequestCreateGroup getRequestCreateGroup() {
      if (dataBodyCase_ == 3) {
         return (RequestCreateGroup) dataBody_;
      }
      return RequestCreateGroup.getDefaultInstance();
    }
    /**
     * <code>.RequestCreateGroup requestCreateGroup = 3;</code>
     */
    public RequestCreateGroupOrBuilder getRequestCreateGroupOrBuilder() {
      if (dataBodyCase_ == 3) {
         return (RequestCreateGroup) dataBody_;
      }
      return RequestCreateGroup.getDefaultInstance();
    }

    public static final int REQUESTENTERGROUP_FIELD_NUMBER = 4;
    /**
     * <code>.RequestEnterGroup requestEnterGroup = 4;</code>
     */
    public boolean hasRequestEnterGroup() {
      return dataBodyCase_ == 4;
    }
    /**
     * <code>.RequestEnterGroup requestEnterGroup = 4;</code>
     */
    public RequestEnterGroup getRequestEnterGroup() {
      if (dataBodyCase_ == 4) {
         return (RequestEnterGroup) dataBody_;
      }
      return RequestEnterGroup.getDefaultInstance();
    }
    /**
     * <code>.RequestEnterGroup requestEnterGroup = 4;</code>
     */
    public RequestEnterGroupOrBuilder getRequestEnterGroupOrBuilder() {
      if (dataBodyCase_ == 4) {
         return (RequestEnterGroup) dataBody_;
      }
      return RequestEnterGroup.getDefaultInstance();
    }

    public static final int REQUESTADDRECORD_FIELD_NUMBER = 5;
    /**
     * <code>.RequestAddRecord requestAddRecord = 5;</code>
     */
    public boolean hasRequestAddRecord() {
      return dataBodyCase_ == 5;
    }
    /**
     * <code>.RequestAddRecord requestAddRecord = 5;</code>
     */
    public RequestAddRecord getRequestAddRecord() {
      if (dataBodyCase_ == 5) {
         return (RequestAddRecord) dataBody_;
      }
      return RequestAddRecord.getDefaultInstance();
    }
    /**
     * <code>.RequestAddRecord requestAddRecord = 5;</code>
     */
    public RequestAddRecordOrBuilder getRequestAddRecordOrBuilder() {
      if (dataBodyCase_ == 5) {
         return (RequestAddRecord) dataBody_;
      }
      return RequestAddRecord.getDefaultInstance();
    }

    public static final int REQUESTREMOVERECORD_FIELD_NUMBER = 6;
    /**
     * <code>.RequestRemoveRecord requestRemoveRecord = 6;</code>
     */
    public boolean hasRequestRemoveRecord() {
      return dataBodyCase_ == 6;
    }
    /**
     * <code>.RequestRemoveRecord requestRemoveRecord = 6;</code>
     */
    public RequestRemoveRecord getRequestRemoveRecord() {
      if (dataBodyCase_ == 6) {
         return (RequestRemoveRecord) dataBody_;
      }
      return RequestRemoveRecord.getDefaultInstance();
    }
    /**
     * <code>.RequestRemoveRecord requestRemoveRecord = 6;</code>
     */
    public RequestRemoveRecordOrBuilder getRequestRemoveRecordOrBuilder() {
      if (dataBodyCase_ == 6) {
         return (RequestRemoveRecord) dataBody_;
      }
      return RequestRemoveRecord.getDefaultInstance();
    }

    public static final int REQUESTADDACCOUNT_FIELD_NUMBER = 7;
    /**
     * <code>.RequestAddAccount requestAddAccount = 7;</code>
     */
    public boolean hasRequestAddAccount() {
      return dataBodyCase_ == 7;
    }
    /**
     * <code>.RequestAddAccount requestAddAccount = 7;</code>
     */
    public RequestAddAccount getRequestAddAccount() {
      if (dataBodyCase_ == 7) {
         return (RequestAddAccount) dataBody_;
      }
      return RequestAddAccount.getDefaultInstance();
    }
    /**
     * <code>.RequestAddAccount requestAddAccount = 7;</code>
     */
    public RequestAddAccountOrBuilder getRequestAddAccountOrBuilder() {
      if (dataBodyCase_ == 7) {
         return (RequestAddAccount) dataBody_;
      }
      return RequestAddAccount.getDefaultInstance();
    }

    public static final int REQUESTREMOVEACCOUNT_FIELD_NUMBER = 8;
    /**
     * <code>.RequestRemoveAccount requestRemoveAccount = 8;</code>
     */
    public boolean hasRequestRemoveAccount() {
      return dataBodyCase_ == 8;
    }
    /**
     * <code>.RequestRemoveAccount requestRemoveAccount = 8;</code>
     */
    public RequestRemoveAccount getRequestRemoveAccount() {
      if (dataBodyCase_ == 8) {
         return (RequestRemoveAccount) dataBody_;
      }
      return RequestRemoveAccount.getDefaultInstance();
    }
    /**
     * <code>.RequestRemoveAccount requestRemoveAccount = 8;</code>
     */
    public RequestRemoveAccountOrBuilder getRequestRemoveAccountOrBuilder() {
      if (dataBodyCase_ == 8) {
         return (RequestRemoveAccount) dataBody_;
      }
      return RequestRemoveAccount.getDefaultInstance();
    }

    public static final int REQUESTGETACCOUNTS_FIELD_NUMBER = 9;
    /**
     * <code>.RequestGetAccounts requestGetAccounts = 9;</code>
     */
    public boolean hasRequestGetAccounts() {
      return dataBodyCase_ == 9;
    }
    /**
     * <code>.RequestGetAccounts requestGetAccounts = 9;</code>
     */
    public RequestGetAccounts getRequestGetAccounts() {
      if (dataBodyCase_ == 9) {
         return (RequestGetAccounts) dataBody_;
      }
      return RequestGetAccounts.getDefaultInstance();
    }
    /**
     * <code>.RequestGetAccounts requestGetAccounts = 9;</code>
     */
    public RequestGetAccountsOrBuilder getRequestGetAccountsOrBuilder() {
      if (dataBodyCase_ == 9) {
         return (RequestGetAccounts) dataBody_;
      }
      return RequestGetAccounts.getDefaultInstance();
    }

    public static final int REQUESTEDITNICKNAME_FIELD_NUMBER = 10;
    /**
     * <code>.RequestEditNickname requestEditNickname = 10;</code>
     */
    public boolean hasRequestEditNickname() {
      return dataBodyCase_ == 10;
    }
    /**
     * <code>.RequestEditNickname requestEditNickname = 10;</code>
     */
    public RequestEditNickname getRequestEditNickname() {
      if (dataBodyCase_ == 10) {
         return (RequestEditNickname) dataBody_;
      }
      return RequestEditNickname.getDefaultInstance();
    }
    /**
     * <code>.RequestEditNickname requestEditNickname = 10;</code>
     */
    public RequestEditNicknameOrBuilder getRequestEditNicknameOrBuilder() {
      if (dataBodyCase_ == 10) {
         return (RequestEditNickname) dataBody_;
      }
      return RequestEditNickname.getDefaultInstance();
    }

    public static final int REQUESTGETRECORDS_FIELD_NUMBER = 11;
    /**
     * <code>.RequestGetRecords requestGetRecords = 11;</code>
     */
    public boolean hasRequestGetRecords() {
      return dataBodyCase_ == 11;
    }
    /**
     * <code>.RequestGetRecords requestGetRecords = 11;</code>
     */
    public RequestGetRecords getRequestGetRecords() {
      if (dataBodyCase_ == 11) {
         return (RequestGetRecords) dataBody_;
      }
      return RequestGetRecords.getDefaultInstance();
    }
    /**
     * <code>.RequestGetRecords requestGetRecords = 11;</code>
     */
    public RequestGetRecordsOrBuilder getRequestGetRecordsOrBuilder() {
      if (dataBodyCase_ == 11) {
         return (RequestGetRecords) dataBody_;
      }
      return RequestGetRecords.getDefaultInstance();
    }

    public static final int TYPE_FIELD_NUMBER = 12;
    private int type_;
    /**
     * <code>.Type type = 12;</code>
     */
    public int getTypeValue() {
      return type_;
    }
    /**
     * <code>.Type type = 12;</code>
     */
    public Type getType() {
      @SuppressWarnings("deprecation")
      Type result = Type.valueOf(type_);
      return result == null ? Type.UNRECOGNIZED : result;
    }

    public static final int CLIENT_ID_FIELD_NUMBER = 13;
    private volatile Object clientId_;
    /**
     * <code>string client_id = 13;</code>
     */
    public String getClientId() {
      Object ref = clientId_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        clientId_ = s;
        return s;
      }
    }
    /**
     * <code>string client_id = 13;</code>
     */
    public com.google.protobuf.ByteString
        getClientIdBytes() {
      Object ref = clientId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        clientId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int TIP_FIELD_NUMBER = 14;
    private volatile Object tip_;
    /**
     * <code>string tip = 14;</code>
     */
    public String getTip() {
      Object ref = tip_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        tip_ = s;
        return s;
      }
    }
    /**
     * <code>string tip = 14;</code>
     */
    public com.google.protobuf.ByteString
        getTipBytes() {
      Object ref = tip_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        tip_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int TIMESTAMP_FIELD_NUMBER = 15;
    private long timestamp_;
    /**
     * <code>int64 timestamp = 15;</code>
     */
    public long getTimestamp() {
      return timestamp_;
    }

    public static final int REQUEST_ID_FIELD_NUMBER = 16;
    private int requestId_;
    /**
     * <code>int32 request_id = 16;</code>
     */
    public int getRequestId() {
      return requestId_;
    }

    private byte memoizedIsInitialized = -1;
    @Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (dataBodyCase_ == 1) {
        output.writeMessage(1, (RequestConnect) dataBody_);
      }
      if (dataBodyCase_ == 2) {
        output.writeMessage(2, (RequestHeartbeat) dataBody_);
      }
      if (dataBodyCase_ == 3) {
        output.writeMessage(3, (RequestCreateGroup) dataBody_);
      }
      if (dataBodyCase_ == 4) {
        output.writeMessage(4, (RequestEnterGroup) dataBody_);
      }
      if (dataBodyCase_ == 5) {
        output.writeMessage(5, (RequestAddRecord) dataBody_);
      }
      if (dataBodyCase_ == 6) {
        output.writeMessage(6, (RequestRemoveRecord) dataBody_);
      }
      if (dataBodyCase_ == 7) {
        output.writeMessage(7, (RequestAddAccount) dataBody_);
      }
      if (dataBodyCase_ == 8) {
        output.writeMessage(8, (RequestRemoveAccount) dataBody_);
      }
      if (dataBodyCase_ == 9) {
        output.writeMessage(9, (RequestGetAccounts) dataBody_);
      }
      if (dataBodyCase_ == 10) {
        output.writeMessage(10, (RequestEditNickname) dataBody_);
      }
      if (dataBodyCase_ == 11) {
        output.writeMessage(11, (RequestGetRecords) dataBody_);
      }
      if (type_ != Type.UNKNOWN.getNumber()) {
        output.writeEnum(12, type_);
      }
      if (!getClientIdBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 13, clientId_);
      }
      if (!getTipBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 14, tip_);
      }
      if (timestamp_ != 0L) {
        output.writeInt64(15, timestamp_);
      }
      if (requestId_ != 0) {
        output.writeInt32(16, requestId_);
      }
      unknownFields.writeTo(output);
    }

    @Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (dataBodyCase_ == 1) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, (RequestConnect) dataBody_);
      }
      if (dataBodyCase_ == 2) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, (RequestHeartbeat) dataBody_);
      }
      if (dataBodyCase_ == 3) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(3, (RequestCreateGroup) dataBody_);
      }
      if (dataBodyCase_ == 4) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(4, (RequestEnterGroup) dataBody_);
      }
      if (dataBodyCase_ == 5) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(5, (RequestAddRecord) dataBody_);
      }
      if (dataBodyCase_ == 6) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(6, (RequestRemoveRecord) dataBody_);
      }
      if (dataBodyCase_ == 7) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(7, (RequestAddAccount) dataBody_);
      }
      if (dataBodyCase_ == 8) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(8, (RequestRemoveAccount) dataBody_);
      }
      if (dataBodyCase_ == 9) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(9, (RequestGetAccounts) dataBody_);
      }
      if (dataBodyCase_ == 10) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(10, (RequestEditNickname) dataBody_);
      }
      if (dataBodyCase_ == 11) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(11, (RequestGetRecords) dataBody_);
      }
      if (type_ != Type.UNKNOWN.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(12, type_);
      }
      if (!getClientIdBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(13, clientId_);
      }
      if (!getTipBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(14, tip_);
      }
      if (timestamp_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(15, timestamp_);
      }
      if (requestId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(16, requestId_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @Override
    public boolean equals(final Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof Request)) {
        return super.equals(obj);
      }
      Request other = (Request) obj;

      if (type_ != other.type_) return false;
      if (!getClientId()
          .equals(other.getClientId())) return false;
      if (!getTip()
          .equals(other.getTip())) return false;
      if (getTimestamp()
          != other.getTimestamp()) return false;
      if (getRequestId()
          != other.getRequestId()) return false;
      if (!getDataBodyCase().equals(other.getDataBodyCase())) return false;
      switch (dataBodyCase_) {
        case 1:
          if (!getRequestConnect()
              .equals(other.getRequestConnect())) return false;
          break;
        case 2:
          if (!getRequestHeartbeat()
              .equals(other.getRequestHeartbeat())) return false;
          break;
        case 3:
          if (!getRequestCreateGroup()
              .equals(other.getRequestCreateGroup())) return false;
          break;
        case 4:
          if (!getRequestEnterGroup()
              .equals(other.getRequestEnterGroup())) return false;
          break;
        case 5:
          if (!getRequestAddRecord()
              .equals(other.getRequestAddRecord())) return false;
          break;
        case 6:
          if (!getRequestRemoveRecord()
              .equals(other.getRequestRemoveRecord())) return false;
          break;
        case 7:
          if (!getRequestAddAccount()
              .equals(other.getRequestAddAccount())) return false;
          break;
        case 8:
          if (!getRequestRemoveAccount()
              .equals(other.getRequestRemoveAccount())) return false;
          break;
        case 9:
          if (!getRequestGetAccounts()
              .equals(other.getRequestGetAccounts())) return false;
          break;
        case 10:
          if (!getRequestEditNickname()
              .equals(other.getRequestEditNickname())) return false;
          break;
        case 11:
          if (!getRequestGetRecords()
              .equals(other.getRequestGetRecords())) return false;
          break;
        case 0:
        default:
      }
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + TYPE_FIELD_NUMBER;
      hash = (53 * hash) + type_;
      hash = (37 * hash) + CLIENT_ID_FIELD_NUMBER;
      hash = (53 * hash) + getClientId().hashCode();
      hash = (37 * hash) + TIP_FIELD_NUMBER;
      hash = (53 * hash) + getTip().hashCode();
      hash = (37 * hash) + TIMESTAMP_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getTimestamp());
      hash = (37 * hash) + REQUEST_ID_FIELD_NUMBER;
      hash = (53 * hash) + getRequestId();
      switch (dataBodyCase_) {
        case 1:
          hash = (37 * hash) + REQUESTCONNECT_FIELD_NUMBER;
          hash = (53 * hash) + getRequestConnect().hashCode();
          break;
        case 2:
          hash = (37 * hash) + REQUESTHEARTBEAT_FIELD_NUMBER;
          hash = (53 * hash) + getRequestHeartbeat().hashCode();
          break;
        case 3:
          hash = (37 * hash) + REQUESTCREATEGROUP_FIELD_NUMBER;
          hash = (53 * hash) + getRequestCreateGroup().hashCode();
          break;
        case 4:
          hash = (37 * hash) + REQUESTENTERGROUP_FIELD_NUMBER;
          hash = (53 * hash) + getRequestEnterGroup().hashCode();
          break;
        case 5:
          hash = (37 * hash) + REQUESTADDRECORD_FIELD_NUMBER;
          hash = (53 * hash) + getRequestAddRecord().hashCode();
          break;
        case 6:
          hash = (37 * hash) + REQUESTREMOVERECORD_FIELD_NUMBER;
          hash = (53 * hash) + getRequestRemoveRecord().hashCode();
          break;
        case 7:
          hash = (37 * hash) + REQUESTADDACCOUNT_FIELD_NUMBER;
          hash = (53 * hash) + getRequestAddAccount().hashCode();
          break;
        case 8:
          hash = (37 * hash) + REQUESTREMOVEACCOUNT_FIELD_NUMBER;
          hash = (53 * hash) + getRequestRemoveAccount().hashCode();
          break;
        case 9:
          hash = (37 * hash) + REQUESTGETACCOUNTS_FIELD_NUMBER;
          hash = (53 * hash) + getRequestGetAccounts().hashCode();
          break;
        case 10:
          hash = (37 * hash) + REQUESTEDITNICKNAME_FIELD_NUMBER;
          hash = (53 * hash) + getRequestEditNickname().hashCode();
          break;
        case 11:
          hash = (37 * hash) + REQUESTGETRECORDS_FIELD_NUMBER;
          hash = (53 * hash) + getRequestGetRecords().hashCode();
          break;
        case 0:
        default:
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static Request parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static Request parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static Request parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static Request parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static Request parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static Request parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static Request parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static Request parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static Request parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static Request parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static Request parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static Request parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(Request prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @Override
    protected Builder newBuilderForType(
        BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code Request}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:Request)
        RequestOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return CBMessage.internal_static_Request_descriptor;
      }

      @Override
      protected FieldAccessorTable
          internalGetFieldAccessorTable() {
        return CBMessage.internal_static_Request_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                Request.class, Builder.class);
      }

      // Construct using CBMessage.Request.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      @Override
      public Builder clear() {
        super.clear();
        type_ = 0;

        clientId_ = "";

        tip_ = "";

        timestamp_ = 0L;

        requestId_ = 0;

        dataBodyCase_ = 0;
        dataBody_ = null;
        return this;
      }

      @Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return CBMessage.internal_static_Request_descriptor;
      }

      @Override
      public Request getDefaultInstanceForType() {
        return Request.getDefaultInstance();
      }

      @Override
      public Request build() {
        Request result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @Override
      public Request buildPartial() {
        Request result = new Request(this);
        if (dataBodyCase_ == 1) {
          if (requestConnectBuilder_ == null) {
            result.dataBody_ = dataBody_;
          } else {
            result.dataBody_ = requestConnectBuilder_.build();
          }
        }
        if (dataBodyCase_ == 2) {
          if (requestHeartbeatBuilder_ == null) {
            result.dataBody_ = dataBody_;
          } else {
            result.dataBody_ = requestHeartbeatBuilder_.build();
          }
        }
        if (dataBodyCase_ == 3) {
          if (requestCreateGroupBuilder_ == null) {
            result.dataBody_ = dataBody_;
          } else {
            result.dataBody_ = requestCreateGroupBuilder_.build();
          }
        }
        if (dataBodyCase_ == 4) {
          if (requestEnterGroupBuilder_ == null) {
            result.dataBody_ = dataBody_;
          } else {
            result.dataBody_ = requestEnterGroupBuilder_.build();
          }
        }
        if (dataBodyCase_ == 5) {
          if (requestAddRecordBuilder_ == null) {
            result.dataBody_ = dataBody_;
          } else {
            result.dataBody_ = requestAddRecordBuilder_.build();
          }
        }
        if (dataBodyCase_ == 6) {
          if (requestRemoveRecordBuilder_ == null) {
            result.dataBody_ = dataBody_;
          } else {
            result.dataBody_ = requestRemoveRecordBuilder_.build();
          }
        }
        if (dataBodyCase_ == 7) {
          if (requestAddAccountBuilder_ == null) {
            result.dataBody_ = dataBody_;
          } else {
            result.dataBody_ = requestAddAccountBuilder_.build();
          }
        }
        if (dataBodyCase_ == 8) {
          if (requestRemoveAccountBuilder_ == null) {
            result.dataBody_ = dataBody_;
          } else {
            result.dataBody_ = requestRemoveAccountBuilder_.build();
          }
        }
        if (dataBodyCase_ == 9) {
          if (requestGetAccountsBuilder_ == null) {
            result.dataBody_ = dataBody_;
          } else {
            result.dataBody_ = requestGetAccountsBuilder_.build();
          }
        }
        if (dataBodyCase_ == 10) {
          if (requestEditNicknameBuilder_ == null) {
            result.dataBody_ = dataBody_;
          } else {
            result.dataBody_ = requestEditNicknameBuilder_.build();
          }
        }
        if (dataBodyCase_ == 11) {
          if (requestGetRecordsBuilder_ == null) {
            result.dataBody_ = dataBody_;
          } else {
            result.dataBody_ = requestGetRecordsBuilder_.build();
          }
        }
        result.type_ = type_;
        result.clientId_ = clientId_;
        result.tip_ = tip_;
        result.timestamp_ = timestamp_;
        result.requestId_ = requestId_;
        result.dataBodyCase_ = dataBodyCase_;
        onBuilt();
        return result;
      }

      @Override
      public Builder clone() {
        return super.clone();
      }
      @Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return super.setField(field, value);
      }
      @Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return super.addRepeatedField(field, value);
      }
      @Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof Request) {
          return mergeFrom((Request)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(Request other) {
        if (other == Request.getDefaultInstance()) return this;
        if (other.type_ != 0) {
          setTypeValue(other.getTypeValue());
        }
        if (!other.getClientId().isEmpty()) {
          clientId_ = other.clientId_;
          onChanged();
        }
        if (!other.getTip().isEmpty()) {
          tip_ = other.tip_;
          onChanged();
        }
        if (other.getTimestamp() != 0L) {
          setTimestamp(other.getTimestamp());
        }
        if (other.getRequestId() != 0) {
          setRequestId(other.getRequestId());
        }
        switch (other.getDataBodyCase()) {
          case REQUESTCONNECT: {
            mergeRequestConnect(other.getRequestConnect());
            break;
          }
          case REQUESTHEARTBEAT: {
            mergeRequestHeartbeat(other.getRequestHeartbeat());
            break;
          }
          case REQUESTCREATEGROUP: {
            mergeRequestCreateGroup(other.getRequestCreateGroup());
            break;
          }
          case REQUESTENTERGROUP: {
            mergeRequestEnterGroup(other.getRequestEnterGroup());
            break;
          }
          case REQUESTADDRECORD: {
            mergeRequestAddRecord(other.getRequestAddRecord());
            break;
          }
          case REQUESTREMOVERECORD: {
            mergeRequestRemoveRecord(other.getRequestRemoveRecord());
            break;
          }
          case REQUESTADDACCOUNT: {
            mergeRequestAddAccount(other.getRequestAddAccount());
            break;
          }
          case REQUESTREMOVEACCOUNT: {
            mergeRequestRemoveAccount(other.getRequestRemoveAccount());
            break;
          }
          case REQUESTGETACCOUNTS: {
            mergeRequestGetAccounts(other.getRequestGetAccounts());
            break;
          }
          case REQUESTEDITNICKNAME: {
            mergeRequestEditNickname(other.getRequestEditNickname());
            break;
          }
          case REQUESTGETRECORDS: {
            mergeRequestGetRecords(other.getRequestGetRecords());
            break;
          }
          case DATABODY_NOT_SET: {
            break;
          }
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @Override
      public final boolean isInitialized() {
        return true;
      }

      @Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        Request parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (Request) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int dataBodyCase_ = 0;
      private Object dataBody_;
      public DataBodyCase
          getDataBodyCase() {
        return DataBodyCase.forNumber(
            dataBodyCase_);
      }

      public Builder clearDataBody() {
        dataBodyCase_ = 0;
        dataBody_ = null;
        onChanged();
        return this;
      }


      private com.google.protobuf.SingleFieldBuilderV3<
          RequestConnect, RequestConnect.Builder, RequestConnectOrBuilder> requestConnectBuilder_;
      /**
       * <code>.RequestConnect requestConnect = 1;</code>
       */
      public boolean hasRequestConnect() {
        return dataBodyCase_ == 1;
      }
      /**
       * <code>.RequestConnect requestConnect = 1;</code>
       */
      public RequestConnect getRequestConnect() {
        if (requestConnectBuilder_ == null) {
          if (dataBodyCase_ == 1) {
            return (RequestConnect) dataBody_;
          }
          return RequestConnect.getDefaultInstance();
        } else {
          if (dataBodyCase_ == 1) {
            return requestConnectBuilder_.getMessage();
          }
          return RequestConnect.getDefaultInstance();
        }
      }
      /**
       * <code>.RequestConnect requestConnect = 1;</code>
       */
      public Builder setRequestConnect(RequestConnect value) {
        if (requestConnectBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          dataBody_ = value;
          onChanged();
        } else {
          requestConnectBuilder_.setMessage(value);
        }
        dataBodyCase_ = 1;
        return this;
      }
      /**
       * <code>.RequestConnect requestConnect = 1;</code>
       */
      public Builder setRequestConnect(
          RequestConnect.Builder builderForValue) {
        if (requestConnectBuilder_ == null) {
          dataBody_ = builderForValue.build();
          onChanged();
        } else {
          requestConnectBuilder_.setMessage(builderForValue.build());
        }
        dataBodyCase_ = 1;
        return this;
      }
      /**
       * <code>.RequestConnect requestConnect = 1;</code>
       */
      public Builder mergeRequestConnect(RequestConnect value) {
        if (requestConnectBuilder_ == null) {
          if (dataBodyCase_ == 1 &&
              dataBody_ != RequestConnect.getDefaultInstance()) {
            dataBody_ = RequestConnect.newBuilder((RequestConnect) dataBody_)
                .mergeFrom(value).buildPartial();
          } else {
            dataBody_ = value;
          }
          onChanged();
        } else {
          if (dataBodyCase_ == 1) {
            requestConnectBuilder_.mergeFrom(value);
          }
          requestConnectBuilder_.setMessage(value);
        }
        dataBodyCase_ = 1;
        return this;
      }
      /**
       * <code>.RequestConnect requestConnect = 1;</code>
       */
      public Builder clearRequestConnect() {
        if (requestConnectBuilder_ == null) {
          if (dataBodyCase_ == 1) {
            dataBodyCase_ = 0;
            dataBody_ = null;
            onChanged();
          }
        } else {
          if (dataBodyCase_ == 1) {
            dataBodyCase_ = 0;
            dataBody_ = null;
          }
          requestConnectBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>.RequestConnect requestConnect = 1;</code>
       */
      public RequestConnect.Builder getRequestConnectBuilder() {
        return getRequestConnectFieldBuilder().getBuilder();
      }
      /**
       * <code>.RequestConnect requestConnect = 1;</code>
       */
      public RequestConnectOrBuilder getRequestConnectOrBuilder() {
        if ((dataBodyCase_ == 1) && (requestConnectBuilder_ != null)) {
          return requestConnectBuilder_.getMessageOrBuilder();
        } else {
          if (dataBodyCase_ == 1) {
            return (RequestConnect) dataBody_;
          }
          return RequestConnect.getDefaultInstance();
        }
      }
      /**
       * <code>.RequestConnect requestConnect = 1;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          RequestConnect, RequestConnect.Builder, RequestConnectOrBuilder>
          getRequestConnectFieldBuilder() {
        if (requestConnectBuilder_ == null) {
          if (!(dataBodyCase_ == 1)) {
            dataBody_ = RequestConnect.getDefaultInstance();
          }
          requestConnectBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              RequestConnect, RequestConnect.Builder, RequestConnectOrBuilder>(
                  (RequestConnect) dataBody_,
                  getParentForChildren(),
                  isClean());
          dataBody_ = null;
        }
        dataBodyCase_ = 1;
        onChanged();;
        return requestConnectBuilder_;
      }

      private com.google.protobuf.SingleFieldBuilderV3<
          RequestHeartbeat, RequestHeartbeat.Builder, RequestHeartbeatOrBuilder> requestHeartbeatBuilder_;
      /**
       * <code>.RequestHeartbeat requestHeartbeat = 2;</code>
       */
      public boolean hasRequestHeartbeat() {
        return dataBodyCase_ == 2;
      }
      /**
       * <code>.RequestHeartbeat requestHeartbeat = 2;</code>
       */
      public RequestHeartbeat getRequestHeartbeat() {
        if (requestHeartbeatBuilder_ == null) {
          if (dataBodyCase_ == 2) {
            return (RequestHeartbeat) dataBody_;
          }
          return RequestHeartbeat.getDefaultInstance();
        } else {
          if (dataBodyCase_ == 2) {
            return requestHeartbeatBuilder_.getMessage();
          }
          return RequestHeartbeat.getDefaultInstance();
        }
      }
      /**
       * <code>.RequestHeartbeat requestHeartbeat = 2;</code>
       */
      public Builder setRequestHeartbeat(RequestHeartbeat value) {
        if (requestHeartbeatBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          dataBody_ = value;
          onChanged();
        } else {
          requestHeartbeatBuilder_.setMessage(value);
        }
        dataBodyCase_ = 2;
        return this;
      }
      /**
       * <code>.RequestHeartbeat requestHeartbeat = 2;</code>
       */
      public Builder setRequestHeartbeat(
          RequestHeartbeat.Builder builderForValue) {
        if (requestHeartbeatBuilder_ == null) {
          dataBody_ = builderForValue.build();
          onChanged();
        } else {
          requestHeartbeatBuilder_.setMessage(builderForValue.build());
        }
        dataBodyCase_ = 2;
        return this;
      }
      /**
       * <code>.RequestHeartbeat requestHeartbeat = 2;</code>
       */
      public Builder mergeRequestHeartbeat(RequestHeartbeat value) {
        if (requestHeartbeatBuilder_ == null) {
          if (dataBodyCase_ == 2 &&
              dataBody_ != RequestHeartbeat.getDefaultInstance()) {
            dataBody_ = RequestHeartbeat.newBuilder((RequestHeartbeat) dataBody_)
                .mergeFrom(value).buildPartial();
          } else {
            dataBody_ = value;
          }
          onChanged();
        } else {
          if (dataBodyCase_ == 2) {
            requestHeartbeatBuilder_.mergeFrom(value);
          }
          requestHeartbeatBuilder_.setMessage(value);
        }
        dataBodyCase_ = 2;
        return this;
      }
      /**
       * <code>.RequestHeartbeat requestHeartbeat = 2;</code>
       */
      public Builder clearRequestHeartbeat() {
        if (requestHeartbeatBuilder_ == null) {
          if (dataBodyCase_ == 2) {
            dataBodyCase_ = 0;
            dataBody_ = null;
            onChanged();
          }
        } else {
          if (dataBodyCase_ == 2) {
            dataBodyCase_ = 0;
            dataBody_ = null;
          }
          requestHeartbeatBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>.RequestHeartbeat requestHeartbeat = 2;</code>
       */
      public RequestHeartbeat.Builder getRequestHeartbeatBuilder() {
        return getRequestHeartbeatFieldBuilder().getBuilder();
      }
      /**
       * <code>.RequestHeartbeat requestHeartbeat = 2;</code>
       */
      public RequestHeartbeatOrBuilder getRequestHeartbeatOrBuilder() {
        if ((dataBodyCase_ == 2) && (requestHeartbeatBuilder_ != null)) {
          return requestHeartbeatBuilder_.getMessageOrBuilder();
        } else {
          if (dataBodyCase_ == 2) {
            return (RequestHeartbeat) dataBody_;
          }
          return RequestHeartbeat.getDefaultInstance();
        }
      }
      /**
       * <code>.RequestHeartbeat requestHeartbeat = 2;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          RequestHeartbeat, RequestHeartbeat.Builder, RequestHeartbeatOrBuilder>
          getRequestHeartbeatFieldBuilder() {
        if (requestHeartbeatBuilder_ == null) {
          if (!(dataBodyCase_ == 2)) {
            dataBody_ = RequestHeartbeat.getDefaultInstance();
          }
          requestHeartbeatBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              RequestHeartbeat, RequestHeartbeat.Builder, RequestHeartbeatOrBuilder>(
                  (RequestHeartbeat) dataBody_,
                  getParentForChildren(),
                  isClean());
          dataBody_ = null;
        }
        dataBodyCase_ = 2;
        onChanged();;
        return requestHeartbeatBuilder_;
      }

      private com.google.protobuf.SingleFieldBuilderV3<
          RequestCreateGroup, RequestCreateGroup.Builder, RequestCreateGroupOrBuilder> requestCreateGroupBuilder_;
      /**
       * <code>.RequestCreateGroup requestCreateGroup = 3;</code>
       */
      public boolean hasRequestCreateGroup() {
        return dataBodyCase_ == 3;
      }
      /**
       * <code>.RequestCreateGroup requestCreateGroup = 3;</code>
       */
      public RequestCreateGroup getRequestCreateGroup() {
        if (requestCreateGroupBuilder_ == null) {
          if (dataBodyCase_ == 3) {
            return (RequestCreateGroup) dataBody_;
          }
          return RequestCreateGroup.getDefaultInstance();
        } else {
          if (dataBodyCase_ == 3) {
            return requestCreateGroupBuilder_.getMessage();
          }
          return RequestCreateGroup.getDefaultInstance();
        }
      }
      /**
       * <code>.RequestCreateGroup requestCreateGroup = 3;</code>
       */
      public Builder setRequestCreateGroup(RequestCreateGroup value) {
        if (requestCreateGroupBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          dataBody_ = value;
          onChanged();
        } else {
          requestCreateGroupBuilder_.setMessage(value);
        }
        dataBodyCase_ = 3;
        return this;
      }
      /**
       * <code>.RequestCreateGroup requestCreateGroup = 3;</code>
       */
      public Builder setRequestCreateGroup(
          RequestCreateGroup.Builder builderForValue) {
        if (requestCreateGroupBuilder_ == null) {
          dataBody_ = builderForValue.build();
          onChanged();
        } else {
          requestCreateGroupBuilder_.setMessage(builderForValue.build());
        }
        dataBodyCase_ = 3;
        return this;
      }
      /**
       * <code>.RequestCreateGroup requestCreateGroup = 3;</code>
       */
      public Builder mergeRequestCreateGroup(RequestCreateGroup value) {
        if (requestCreateGroupBuilder_ == null) {
          if (dataBodyCase_ == 3 &&
              dataBody_ != RequestCreateGroup.getDefaultInstance()) {
            dataBody_ = RequestCreateGroup.newBuilder((RequestCreateGroup) dataBody_)
                .mergeFrom(value).buildPartial();
          } else {
            dataBody_ = value;
          }
          onChanged();
        } else {
          if (dataBodyCase_ == 3) {
            requestCreateGroupBuilder_.mergeFrom(value);
          }
          requestCreateGroupBuilder_.setMessage(value);
        }
        dataBodyCase_ = 3;
        return this;
      }
      /**
       * <code>.RequestCreateGroup requestCreateGroup = 3;</code>
       */
      public Builder clearRequestCreateGroup() {
        if (requestCreateGroupBuilder_ == null) {
          if (dataBodyCase_ == 3) {
            dataBodyCase_ = 0;
            dataBody_ = null;
            onChanged();
          }
        } else {
          if (dataBodyCase_ == 3) {
            dataBodyCase_ = 0;
            dataBody_ = null;
          }
          requestCreateGroupBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>.RequestCreateGroup requestCreateGroup = 3;</code>
       */
      public RequestCreateGroup.Builder getRequestCreateGroupBuilder() {
        return getRequestCreateGroupFieldBuilder().getBuilder();
      }
      /**
       * <code>.RequestCreateGroup requestCreateGroup = 3;</code>
       */
      public RequestCreateGroupOrBuilder getRequestCreateGroupOrBuilder() {
        if ((dataBodyCase_ == 3) && (requestCreateGroupBuilder_ != null)) {
          return requestCreateGroupBuilder_.getMessageOrBuilder();
        } else {
          if (dataBodyCase_ == 3) {
            return (RequestCreateGroup) dataBody_;
          }
          return RequestCreateGroup.getDefaultInstance();
        }
      }
      /**
       * <code>.RequestCreateGroup requestCreateGroup = 3;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          RequestCreateGroup, RequestCreateGroup.Builder, RequestCreateGroupOrBuilder>
          getRequestCreateGroupFieldBuilder() {
        if (requestCreateGroupBuilder_ == null) {
          if (!(dataBodyCase_ == 3)) {
            dataBody_ = RequestCreateGroup.getDefaultInstance();
          }
          requestCreateGroupBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              RequestCreateGroup, RequestCreateGroup.Builder, RequestCreateGroupOrBuilder>(
                  (RequestCreateGroup) dataBody_,
                  getParentForChildren(),
                  isClean());
          dataBody_ = null;
        }
        dataBodyCase_ = 3;
        onChanged();;
        return requestCreateGroupBuilder_;
      }

      private com.google.protobuf.SingleFieldBuilderV3<
          RequestEnterGroup, RequestEnterGroup.Builder, RequestEnterGroupOrBuilder> requestEnterGroupBuilder_;
      /**
       * <code>.RequestEnterGroup requestEnterGroup = 4;</code>
       */
      public boolean hasRequestEnterGroup() {
        return dataBodyCase_ == 4;
      }
      /**
       * <code>.RequestEnterGroup requestEnterGroup = 4;</code>
       */
      public RequestEnterGroup getRequestEnterGroup() {
        if (requestEnterGroupBuilder_ == null) {
          if (dataBodyCase_ == 4) {
            return (RequestEnterGroup) dataBody_;
          }
          return RequestEnterGroup.getDefaultInstance();
        } else {
          if (dataBodyCase_ == 4) {
            return requestEnterGroupBuilder_.getMessage();
          }
          return RequestEnterGroup.getDefaultInstance();
        }
      }
      /**
       * <code>.RequestEnterGroup requestEnterGroup = 4;</code>
       */
      public Builder setRequestEnterGroup(RequestEnterGroup value) {
        if (requestEnterGroupBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          dataBody_ = value;
          onChanged();
        } else {
          requestEnterGroupBuilder_.setMessage(value);
        }
        dataBodyCase_ = 4;
        return this;
      }
      /**
       * <code>.RequestEnterGroup requestEnterGroup = 4;</code>
       */
      public Builder setRequestEnterGroup(
          RequestEnterGroup.Builder builderForValue) {
        if (requestEnterGroupBuilder_ == null) {
          dataBody_ = builderForValue.build();
          onChanged();
        } else {
          requestEnterGroupBuilder_.setMessage(builderForValue.build());
        }
        dataBodyCase_ = 4;
        return this;
      }
      /**
       * <code>.RequestEnterGroup requestEnterGroup = 4;</code>
       */
      public Builder mergeRequestEnterGroup(RequestEnterGroup value) {
        if (requestEnterGroupBuilder_ == null) {
          if (dataBodyCase_ == 4 &&
              dataBody_ != RequestEnterGroup.getDefaultInstance()) {
            dataBody_ = RequestEnterGroup.newBuilder((RequestEnterGroup) dataBody_)
                .mergeFrom(value).buildPartial();
          } else {
            dataBody_ = value;
          }
          onChanged();
        } else {
          if (dataBodyCase_ == 4) {
            requestEnterGroupBuilder_.mergeFrom(value);
          }
          requestEnterGroupBuilder_.setMessage(value);
        }
        dataBodyCase_ = 4;
        return this;
      }
      /**
       * <code>.RequestEnterGroup requestEnterGroup = 4;</code>
       */
      public Builder clearRequestEnterGroup() {
        if (requestEnterGroupBuilder_ == null) {
          if (dataBodyCase_ == 4) {
            dataBodyCase_ = 0;
            dataBody_ = null;
            onChanged();
          }
        } else {
          if (dataBodyCase_ == 4) {
            dataBodyCase_ = 0;
            dataBody_ = null;
          }
          requestEnterGroupBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>.RequestEnterGroup requestEnterGroup = 4;</code>
       */
      public RequestEnterGroup.Builder getRequestEnterGroupBuilder() {
        return getRequestEnterGroupFieldBuilder().getBuilder();
      }
      /**
       * <code>.RequestEnterGroup requestEnterGroup = 4;</code>
       */
      public RequestEnterGroupOrBuilder getRequestEnterGroupOrBuilder() {
        if ((dataBodyCase_ == 4) && (requestEnterGroupBuilder_ != null)) {
          return requestEnterGroupBuilder_.getMessageOrBuilder();
        } else {
          if (dataBodyCase_ == 4) {
            return (RequestEnterGroup) dataBody_;
          }
          return RequestEnterGroup.getDefaultInstance();
        }
      }
      /**
       * <code>.RequestEnterGroup requestEnterGroup = 4;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          RequestEnterGroup, RequestEnterGroup.Builder, RequestEnterGroupOrBuilder>
          getRequestEnterGroupFieldBuilder() {
        if (requestEnterGroupBuilder_ == null) {
          if (!(dataBodyCase_ == 4)) {
            dataBody_ = RequestEnterGroup.getDefaultInstance();
          }
          requestEnterGroupBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              RequestEnterGroup, RequestEnterGroup.Builder, RequestEnterGroupOrBuilder>(
                  (RequestEnterGroup) dataBody_,
                  getParentForChildren(),
                  isClean());
          dataBody_ = null;
        }
        dataBodyCase_ = 4;
        onChanged();;
        return requestEnterGroupBuilder_;
      }

      private com.google.protobuf.SingleFieldBuilderV3<
          RequestAddRecord, RequestAddRecord.Builder, RequestAddRecordOrBuilder> requestAddRecordBuilder_;
      /**
       * <code>.RequestAddRecord requestAddRecord = 5;</code>
       */
      public boolean hasRequestAddRecord() {
        return dataBodyCase_ == 5;
      }
      /**
       * <code>.RequestAddRecord requestAddRecord = 5;</code>
       */
      public RequestAddRecord getRequestAddRecord() {
        if (requestAddRecordBuilder_ == null) {
          if (dataBodyCase_ == 5) {
            return (RequestAddRecord) dataBody_;
          }
          return RequestAddRecord.getDefaultInstance();
        } else {
          if (dataBodyCase_ == 5) {
            return requestAddRecordBuilder_.getMessage();
          }
          return RequestAddRecord.getDefaultInstance();
        }
      }
      /**
       * <code>.RequestAddRecord requestAddRecord = 5;</code>
       */
      public Builder setRequestAddRecord(RequestAddRecord value) {
        if (requestAddRecordBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          dataBody_ = value;
          onChanged();
        } else {
          requestAddRecordBuilder_.setMessage(value);
        }
        dataBodyCase_ = 5;
        return this;
      }
      /**
       * <code>.RequestAddRecord requestAddRecord = 5;</code>
       */
      public Builder setRequestAddRecord(
          RequestAddRecord.Builder builderForValue) {
        if (requestAddRecordBuilder_ == null) {
          dataBody_ = builderForValue.build();
          onChanged();
        } else {
          requestAddRecordBuilder_.setMessage(builderForValue.build());
        }
        dataBodyCase_ = 5;
        return this;
      }
      /**
       * <code>.RequestAddRecord requestAddRecord = 5;</code>
       */
      public Builder mergeRequestAddRecord(RequestAddRecord value) {
        if (requestAddRecordBuilder_ == null) {
          if (dataBodyCase_ == 5 &&
              dataBody_ != RequestAddRecord.getDefaultInstance()) {
            dataBody_ = RequestAddRecord.newBuilder((RequestAddRecord) dataBody_)
                .mergeFrom(value).buildPartial();
          } else {
            dataBody_ = value;
          }
          onChanged();
        } else {
          if (dataBodyCase_ == 5) {
            requestAddRecordBuilder_.mergeFrom(value);
          }
          requestAddRecordBuilder_.setMessage(value);
        }
        dataBodyCase_ = 5;
        return this;
      }
      /**
       * <code>.RequestAddRecord requestAddRecord = 5;</code>
       */
      public Builder clearRequestAddRecord() {
        if (requestAddRecordBuilder_ == null) {
          if (dataBodyCase_ == 5) {
            dataBodyCase_ = 0;
            dataBody_ = null;
            onChanged();
          }
        } else {
          if (dataBodyCase_ == 5) {
            dataBodyCase_ = 0;
            dataBody_ = null;
          }
          requestAddRecordBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>.RequestAddRecord requestAddRecord = 5;</code>
       */
      public RequestAddRecord.Builder getRequestAddRecordBuilder() {
        return getRequestAddRecordFieldBuilder().getBuilder();
      }
      /**
       * <code>.RequestAddRecord requestAddRecord = 5;</code>
       */
      public RequestAddRecordOrBuilder getRequestAddRecordOrBuilder() {
        if ((dataBodyCase_ == 5) && (requestAddRecordBuilder_ != null)) {
          return requestAddRecordBuilder_.getMessageOrBuilder();
        } else {
          if (dataBodyCase_ == 5) {
            return (RequestAddRecord) dataBody_;
          }
          return RequestAddRecord.getDefaultInstance();
        }
      }
      /**
       * <code>.RequestAddRecord requestAddRecord = 5;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          RequestAddRecord, RequestAddRecord.Builder, RequestAddRecordOrBuilder>
          getRequestAddRecordFieldBuilder() {
        if (requestAddRecordBuilder_ == null) {
          if (!(dataBodyCase_ == 5)) {
            dataBody_ = RequestAddRecord.getDefaultInstance();
          }
          requestAddRecordBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              RequestAddRecord, RequestAddRecord.Builder, RequestAddRecordOrBuilder>(
                  (RequestAddRecord) dataBody_,
                  getParentForChildren(),
                  isClean());
          dataBody_ = null;
        }
        dataBodyCase_ = 5;
        onChanged();;
        return requestAddRecordBuilder_;
      }

      private com.google.protobuf.SingleFieldBuilderV3<
          RequestRemoveRecord, RequestRemoveRecord.Builder, RequestRemoveRecordOrBuilder> requestRemoveRecordBuilder_;
      /**
       * <code>.RequestRemoveRecord requestRemoveRecord = 6;</code>
       */
      public boolean hasRequestRemoveRecord() {
        return dataBodyCase_ == 6;
      }
      /**
       * <code>.RequestRemoveRecord requestRemoveRecord = 6;</code>
       */
      public RequestRemoveRecord getRequestRemoveRecord() {
        if (requestRemoveRecordBuilder_ == null) {
          if (dataBodyCase_ == 6) {
            return (RequestRemoveRecord) dataBody_;
          }
          return RequestRemoveRecord.getDefaultInstance();
        } else {
          if (dataBodyCase_ == 6) {
            return requestRemoveRecordBuilder_.getMessage();
          }
          return RequestRemoveRecord.getDefaultInstance();
        }
      }
      /**
       * <code>.RequestRemoveRecord requestRemoveRecord = 6;</code>
       */
      public Builder setRequestRemoveRecord(RequestRemoveRecord value) {
        if (requestRemoveRecordBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          dataBody_ = value;
          onChanged();
        } else {
          requestRemoveRecordBuilder_.setMessage(value);
        }
        dataBodyCase_ = 6;
        return this;
      }
      /**
       * <code>.RequestRemoveRecord requestRemoveRecord = 6;</code>
       */
      public Builder setRequestRemoveRecord(
          RequestRemoveRecord.Builder builderForValue) {
        if (requestRemoveRecordBuilder_ == null) {
          dataBody_ = builderForValue.build();
          onChanged();
        } else {
          requestRemoveRecordBuilder_.setMessage(builderForValue.build());
        }
        dataBodyCase_ = 6;
        return this;
      }
      /**
       * <code>.RequestRemoveRecord requestRemoveRecord = 6;</code>
       */
      public Builder mergeRequestRemoveRecord(RequestRemoveRecord value) {
        if (requestRemoveRecordBuilder_ == null) {
          if (dataBodyCase_ == 6 &&
              dataBody_ != RequestRemoveRecord.getDefaultInstance()) {
            dataBody_ = RequestRemoveRecord.newBuilder((RequestRemoveRecord) dataBody_)
                .mergeFrom(value).buildPartial();
          } else {
            dataBody_ = value;
          }
          onChanged();
        } else {
          if (dataBodyCase_ == 6) {
            requestRemoveRecordBuilder_.mergeFrom(value);
          }
          requestRemoveRecordBuilder_.setMessage(value);
        }
        dataBodyCase_ = 6;
        return this;
      }
      /**
       * <code>.RequestRemoveRecord requestRemoveRecord = 6;</code>
       */
      public Builder clearRequestRemoveRecord() {
        if (requestRemoveRecordBuilder_ == null) {
          if (dataBodyCase_ == 6) {
            dataBodyCase_ = 0;
            dataBody_ = null;
            onChanged();
          }
        } else {
          if (dataBodyCase_ == 6) {
            dataBodyCase_ = 0;
            dataBody_ = null;
          }
          requestRemoveRecordBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>.RequestRemoveRecord requestRemoveRecord = 6;</code>
       */
      public RequestRemoveRecord.Builder getRequestRemoveRecordBuilder() {
        return getRequestRemoveRecordFieldBuilder().getBuilder();
      }
      /**
       * <code>.RequestRemoveRecord requestRemoveRecord = 6;</code>
       */
      public RequestRemoveRecordOrBuilder getRequestRemoveRecordOrBuilder() {
        if ((dataBodyCase_ == 6) && (requestRemoveRecordBuilder_ != null)) {
          return requestRemoveRecordBuilder_.getMessageOrBuilder();
        } else {
          if (dataBodyCase_ == 6) {
            return (RequestRemoveRecord) dataBody_;
          }
          return RequestRemoveRecord.getDefaultInstance();
        }
      }
      /**
       * <code>.RequestRemoveRecord requestRemoveRecord = 6;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          RequestRemoveRecord, RequestRemoveRecord.Builder, RequestRemoveRecordOrBuilder>
          getRequestRemoveRecordFieldBuilder() {
        if (requestRemoveRecordBuilder_ == null) {
          if (!(dataBodyCase_ == 6)) {
            dataBody_ = RequestRemoveRecord.getDefaultInstance();
          }
          requestRemoveRecordBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              RequestRemoveRecord, RequestRemoveRecord.Builder, RequestRemoveRecordOrBuilder>(
                  (RequestRemoveRecord) dataBody_,
                  getParentForChildren(),
                  isClean());
          dataBody_ = null;
        }
        dataBodyCase_ = 6;
        onChanged();;
        return requestRemoveRecordBuilder_;
      }

      private com.google.protobuf.SingleFieldBuilderV3<
          RequestAddAccount, RequestAddAccount.Builder, RequestAddAccountOrBuilder> requestAddAccountBuilder_;
      /**
       * <code>.RequestAddAccount requestAddAccount = 7;</code>
       */
      public boolean hasRequestAddAccount() {
        return dataBodyCase_ == 7;
      }
      /**
       * <code>.RequestAddAccount requestAddAccount = 7;</code>
       */
      public RequestAddAccount getRequestAddAccount() {
        if (requestAddAccountBuilder_ == null) {
          if (dataBodyCase_ == 7) {
            return (RequestAddAccount) dataBody_;
          }
          return RequestAddAccount.getDefaultInstance();
        } else {
          if (dataBodyCase_ == 7) {
            return requestAddAccountBuilder_.getMessage();
          }
          return RequestAddAccount.getDefaultInstance();
        }
      }
      /**
       * <code>.RequestAddAccount requestAddAccount = 7;</code>
       */
      public Builder setRequestAddAccount(RequestAddAccount value) {
        if (requestAddAccountBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          dataBody_ = value;
          onChanged();
        } else {
          requestAddAccountBuilder_.setMessage(value);
        }
        dataBodyCase_ = 7;
        return this;
      }
      /**
       * <code>.RequestAddAccount requestAddAccount = 7;</code>
       */
      public Builder setRequestAddAccount(
          RequestAddAccount.Builder builderForValue) {
        if (requestAddAccountBuilder_ == null) {
          dataBody_ = builderForValue.build();
          onChanged();
        } else {
          requestAddAccountBuilder_.setMessage(builderForValue.build());
        }
        dataBodyCase_ = 7;
        return this;
      }
      /**
       * <code>.RequestAddAccount requestAddAccount = 7;</code>
       */
      public Builder mergeRequestAddAccount(RequestAddAccount value) {
        if (requestAddAccountBuilder_ == null) {
          if (dataBodyCase_ == 7 &&
              dataBody_ != RequestAddAccount.getDefaultInstance()) {
            dataBody_ = RequestAddAccount.newBuilder((RequestAddAccount) dataBody_)
                .mergeFrom(value).buildPartial();
          } else {
            dataBody_ = value;
          }
          onChanged();
        } else {
          if (dataBodyCase_ == 7) {
            requestAddAccountBuilder_.mergeFrom(value);
          }
          requestAddAccountBuilder_.setMessage(value);
        }
        dataBodyCase_ = 7;
        return this;
      }
      /**
       * <code>.RequestAddAccount requestAddAccount = 7;</code>
       */
      public Builder clearRequestAddAccount() {
        if (requestAddAccountBuilder_ == null) {
          if (dataBodyCase_ == 7) {
            dataBodyCase_ = 0;
            dataBody_ = null;
            onChanged();
          }
        } else {
          if (dataBodyCase_ == 7) {
            dataBodyCase_ = 0;
            dataBody_ = null;
          }
          requestAddAccountBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>.RequestAddAccount requestAddAccount = 7;</code>
       */
      public RequestAddAccount.Builder getRequestAddAccountBuilder() {
        return getRequestAddAccountFieldBuilder().getBuilder();
      }
      /**
       * <code>.RequestAddAccount requestAddAccount = 7;</code>
       */
      public RequestAddAccountOrBuilder getRequestAddAccountOrBuilder() {
        if ((dataBodyCase_ == 7) && (requestAddAccountBuilder_ != null)) {
          return requestAddAccountBuilder_.getMessageOrBuilder();
        } else {
          if (dataBodyCase_ == 7) {
            return (RequestAddAccount) dataBody_;
          }
          return RequestAddAccount.getDefaultInstance();
        }
      }
      /**
       * <code>.RequestAddAccount requestAddAccount = 7;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          RequestAddAccount, RequestAddAccount.Builder, RequestAddAccountOrBuilder>
          getRequestAddAccountFieldBuilder() {
        if (requestAddAccountBuilder_ == null) {
          if (!(dataBodyCase_ == 7)) {
            dataBody_ = RequestAddAccount.getDefaultInstance();
          }
          requestAddAccountBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              RequestAddAccount, RequestAddAccount.Builder, RequestAddAccountOrBuilder>(
                  (RequestAddAccount) dataBody_,
                  getParentForChildren(),
                  isClean());
          dataBody_ = null;
        }
        dataBodyCase_ = 7;
        onChanged();;
        return requestAddAccountBuilder_;
      }

      private com.google.protobuf.SingleFieldBuilderV3<
          RequestRemoveAccount, RequestRemoveAccount.Builder, RequestRemoveAccountOrBuilder> requestRemoveAccountBuilder_;
      /**
       * <code>.RequestRemoveAccount requestRemoveAccount = 8;</code>
       */
      public boolean hasRequestRemoveAccount() {
        return dataBodyCase_ == 8;
      }
      /**
       * <code>.RequestRemoveAccount requestRemoveAccount = 8;</code>
       */
      public RequestRemoveAccount getRequestRemoveAccount() {
        if (requestRemoveAccountBuilder_ == null) {
          if (dataBodyCase_ == 8) {
            return (RequestRemoveAccount) dataBody_;
          }
          return RequestRemoveAccount.getDefaultInstance();
        } else {
          if (dataBodyCase_ == 8) {
            return requestRemoveAccountBuilder_.getMessage();
          }
          return RequestRemoveAccount.getDefaultInstance();
        }
      }
      /**
       * <code>.RequestRemoveAccount requestRemoveAccount = 8;</code>
       */
      public Builder setRequestRemoveAccount(RequestRemoveAccount value) {
        if (requestRemoveAccountBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          dataBody_ = value;
          onChanged();
        } else {
          requestRemoveAccountBuilder_.setMessage(value);
        }
        dataBodyCase_ = 8;
        return this;
      }
      /**
       * <code>.RequestRemoveAccount requestRemoveAccount = 8;</code>
       */
      public Builder setRequestRemoveAccount(
          RequestRemoveAccount.Builder builderForValue) {
        if (requestRemoveAccountBuilder_ == null) {
          dataBody_ = builderForValue.build();
          onChanged();
        } else {
          requestRemoveAccountBuilder_.setMessage(builderForValue.build());
        }
        dataBodyCase_ = 8;
        return this;
      }
      /**
       * <code>.RequestRemoveAccount requestRemoveAccount = 8;</code>
       */
      public Builder mergeRequestRemoveAccount(RequestRemoveAccount value) {
        if (requestRemoveAccountBuilder_ == null) {
          if (dataBodyCase_ == 8 &&
              dataBody_ != RequestRemoveAccount.getDefaultInstance()) {
            dataBody_ = RequestRemoveAccount.newBuilder((RequestRemoveAccount) dataBody_)
                .mergeFrom(value).buildPartial();
          } else {
            dataBody_ = value;
          }
          onChanged();
        } else {
          if (dataBodyCase_ == 8) {
            requestRemoveAccountBuilder_.mergeFrom(value);
          }
          requestRemoveAccountBuilder_.setMessage(value);
        }
        dataBodyCase_ = 8;
        return this;
      }
      /**
       * <code>.RequestRemoveAccount requestRemoveAccount = 8;</code>
       */
      public Builder clearRequestRemoveAccount() {
        if (requestRemoveAccountBuilder_ == null) {
          if (dataBodyCase_ == 8) {
            dataBodyCase_ = 0;
            dataBody_ = null;
            onChanged();
          }
        } else {
          if (dataBodyCase_ == 8) {
            dataBodyCase_ = 0;
            dataBody_ = null;
          }
          requestRemoveAccountBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>.RequestRemoveAccount requestRemoveAccount = 8;</code>
       */
      public RequestRemoveAccount.Builder getRequestRemoveAccountBuilder() {
        return getRequestRemoveAccountFieldBuilder().getBuilder();
      }
      /**
       * <code>.RequestRemoveAccount requestRemoveAccount = 8;</code>
       */
      public RequestRemoveAccountOrBuilder getRequestRemoveAccountOrBuilder() {
        if ((dataBodyCase_ == 8) && (requestRemoveAccountBuilder_ != null)) {
          return requestRemoveAccountBuilder_.getMessageOrBuilder();
        } else {
          if (dataBodyCase_ == 8) {
            return (RequestRemoveAccount) dataBody_;
          }
          return RequestRemoveAccount.getDefaultInstance();
        }
      }
      /**
       * <code>.RequestRemoveAccount requestRemoveAccount = 8;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          RequestRemoveAccount, RequestRemoveAccount.Builder, RequestRemoveAccountOrBuilder>
          getRequestRemoveAccountFieldBuilder() {
        if (requestRemoveAccountBuilder_ == null) {
          if (!(dataBodyCase_ == 8)) {
            dataBody_ = RequestRemoveAccount.getDefaultInstance();
          }
          requestRemoveAccountBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              RequestRemoveAccount, RequestRemoveAccount.Builder, RequestRemoveAccountOrBuilder>(
                  (RequestRemoveAccount) dataBody_,
                  getParentForChildren(),
                  isClean());
          dataBody_ = null;
        }
        dataBodyCase_ = 8;
        onChanged();;
        return requestRemoveAccountBuilder_;
      }

      private com.google.protobuf.SingleFieldBuilderV3<
          RequestGetAccounts, RequestGetAccounts.Builder, RequestGetAccountsOrBuilder> requestGetAccountsBuilder_;
      /**
       * <code>.RequestGetAccounts requestGetAccounts = 9;</code>
       */
      public boolean hasRequestGetAccounts() {
        return dataBodyCase_ == 9;
      }
      /**
       * <code>.RequestGetAccounts requestGetAccounts = 9;</code>
       */
      public RequestGetAccounts getRequestGetAccounts() {
        if (requestGetAccountsBuilder_ == null) {
          if (dataBodyCase_ == 9) {
            return (RequestGetAccounts) dataBody_;
          }
          return RequestGetAccounts.getDefaultInstance();
        } else {
          if (dataBodyCase_ == 9) {
            return requestGetAccountsBuilder_.getMessage();
          }
          return RequestGetAccounts.getDefaultInstance();
        }
      }
      /**
       * <code>.RequestGetAccounts requestGetAccounts = 9;</code>
       */
      public Builder setRequestGetAccounts(RequestGetAccounts value) {
        if (requestGetAccountsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          dataBody_ = value;
          onChanged();
        } else {
          requestGetAccountsBuilder_.setMessage(value);
        }
        dataBodyCase_ = 9;
        return this;
      }
      /**
       * <code>.RequestGetAccounts requestGetAccounts = 9;</code>
       */
      public Builder setRequestGetAccounts(
          RequestGetAccounts.Builder builderForValue) {
        if (requestGetAccountsBuilder_ == null) {
          dataBody_ = builderForValue.build();
          onChanged();
        } else {
          requestGetAccountsBuilder_.setMessage(builderForValue.build());
        }
        dataBodyCase_ = 9;
        return this;
      }
      /**
       * <code>.RequestGetAccounts requestGetAccounts = 9;</code>
       */
      public Builder mergeRequestGetAccounts(RequestGetAccounts value) {
        if (requestGetAccountsBuilder_ == null) {
          if (dataBodyCase_ == 9 &&
              dataBody_ != RequestGetAccounts.getDefaultInstance()) {
            dataBody_ = RequestGetAccounts.newBuilder((RequestGetAccounts) dataBody_)
                .mergeFrom(value).buildPartial();
          } else {
            dataBody_ = value;
          }
          onChanged();
        } else {
          if (dataBodyCase_ == 9) {
            requestGetAccountsBuilder_.mergeFrom(value);
          }
          requestGetAccountsBuilder_.setMessage(value);
        }
        dataBodyCase_ = 9;
        return this;
      }
      /**
       * <code>.RequestGetAccounts requestGetAccounts = 9;</code>
       */
      public Builder clearRequestGetAccounts() {
        if (requestGetAccountsBuilder_ == null) {
          if (dataBodyCase_ == 9) {
            dataBodyCase_ = 0;
            dataBody_ = null;
            onChanged();
          }
        } else {
          if (dataBodyCase_ == 9) {
            dataBodyCase_ = 0;
            dataBody_ = null;
          }
          requestGetAccountsBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>.RequestGetAccounts requestGetAccounts = 9;</code>
       */
      public RequestGetAccounts.Builder getRequestGetAccountsBuilder() {
        return getRequestGetAccountsFieldBuilder().getBuilder();
      }
      /**
       * <code>.RequestGetAccounts requestGetAccounts = 9;</code>
       */
      public RequestGetAccountsOrBuilder getRequestGetAccountsOrBuilder() {
        if ((dataBodyCase_ == 9) && (requestGetAccountsBuilder_ != null)) {
          return requestGetAccountsBuilder_.getMessageOrBuilder();
        } else {
          if (dataBodyCase_ == 9) {
            return (RequestGetAccounts) dataBody_;
          }
          return RequestGetAccounts.getDefaultInstance();
        }
      }
      /**
       * <code>.RequestGetAccounts requestGetAccounts = 9;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          RequestGetAccounts, RequestGetAccounts.Builder, RequestGetAccountsOrBuilder>
          getRequestGetAccountsFieldBuilder() {
        if (requestGetAccountsBuilder_ == null) {
          if (!(dataBodyCase_ == 9)) {
            dataBody_ = RequestGetAccounts.getDefaultInstance();
          }
          requestGetAccountsBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              RequestGetAccounts, RequestGetAccounts.Builder, RequestGetAccountsOrBuilder>(
                  (RequestGetAccounts) dataBody_,
                  getParentForChildren(),
                  isClean());
          dataBody_ = null;
        }
        dataBodyCase_ = 9;
        onChanged();;
        return requestGetAccountsBuilder_;
      }

      private com.google.protobuf.SingleFieldBuilderV3<
          RequestEditNickname, RequestEditNickname.Builder, RequestEditNicknameOrBuilder> requestEditNicknameBuilder_;
      /**
       * <code>.RequestEditNickname requestEditNickname = 10;</code>
       */
      public boolean hasRequestEditNickname() {
        return dataBodyCase_ == 10;
      }
      /**
       * <code>.RequestEditNickname requestEditNickname = 10;</code>
       */
      public RequestEditNickname getRequestEditNickname() {
        if (requestEditNicknameBuilder_ == null) {
          if (dataBodyCase_ == 10) {
            return (RequestEditNickname) dataBody_;
          }
          return RequestEditNickname.getDefaultInstance();
        } else {
          if (dataBodyCase_ == 10) {
            return requestEditNicknameBuilder_.getMessage();
          }
          return RequestEditNickname.getDefaultInstance();
        }
      }
      /**
       * <code>.RequestEditNickname requestEditNickname = 10;</code>
       */
      public Builder setRequestEditNickname(RequestEditNickname value) {
        if (requestEditNicknameBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          dataBody_ = value;
          onChanged();
        } else {
          requestEditNicknameBuilder_.setMessage(value);
        }
        dataBodyCase_ = 10;
        return this;
      }
      /**
       * <code>.RequestEditNickname requestEditNickname = 10;</code>
       */
      public Builder setRequestEditNickname(
          RequestEditNickname.Builder builderForValue) {
        if (requestEditNicknameBuilder_ == null) {
          dataBody_ = builderForValue.build();
          onChanged();
        } else {
          requestEditNicknameBuilder_.setMessage(builderForValue.build());
        }
        dataBodyCase_ = 10;
        return this;
      }
      /**
       * <code>.RequestEditNickname requestEditNickname = 10;</code>
       */
      public Builder mergeRequestEditNickname(RequestEditNickname value) {
        if (requestEditNicknameBuilder_ == null) {
          if (dataBodyCase_ == 10 &&
              dataBody_ != RequestEditNickname.getDefaultInstance()) {
            dataBody_ = RequestEditNickname.newBuilder((RequestEditNickname) dataBody_)
                .mergeFrom(value).buildPartial();
          } else {
            dataBody_ = value;
          }
          onChanged();
        } else {
          if (dataBodyCase_ == 10) {
            requestEditNicknameBuilder_.mergeFrom(value);
          }
          requestEditNicknameBuilder_.setMessage(value);
        }
        dataBodyCase_ = 10;
        return this;
      }
      /**
       * <code>.RequestEditNickname requestEditNickname = 10;</code>
       */
      public Builder clearRequestEditNickname() {
        if (requestEditNicknameBuilder_ == null) {
          if (dataBodyCase_ == 10) {
            dataBodyCase_ = 0;
            dataBody_ = null;
            onChanged();
          }
        } else {
          if (dataBodyCase_ == 10) {
            dataBodyCase_ = 0;
            dataBody_ = null;
          }
          requestEditNicknameBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>.RequestEditNickname requestEditNickname = 10;</code>
       */
      public RequestEditNickname.Builder getRequestEditNicknameBuilder() {
        return getRequestEditNicknameFieldBuilder().getBuilder();
      }
      /**
       * <code>.RequestEditNickname requestEditNickname = 10;</code>
       */
      public RequestEditNicknameOrBuilder getRequestEditNicknameOrBuilder() {
        if ((dataBodyCase_ == 10) && (requestEditNicknameBuilder_ != null)) {
          return requestEditNicknameBuilder_.getMessageOrBuilder();
        } else {
          if (dataBodyCase_ == 10) {
            return (RequestEditNickname) dataBody_;
          }
          return RequestEditNickname.getDefaultInstance();
        }
      }
      /**
       * <code>.RequestEditNickname requestEditNickname = 10;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          RequestEditNickname, RequestEditNickname.Builder, RequestEditNicknameOrBuilder>
          getRequestEditNicknameFieldBuilder() {
        if (requestEditNicknameBuilder_ == null) {
          if (!(dataBodyCase_ == 10)) {
            dataBody_ = RequestEditNickname.getDefaultInstance();
          }
          requestEditNicknameBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              RequestEditNickname, RequestEditNickname.Builder, RequestEditNicknameOrBuilder>(
                  (RequestEditNickname) dataBody_,
                  getParentForChildren(),
                  isClean());
          dataBody_ = null;
        }
        dataBodyCase_ = 10;
        onChanged();;
        return requestEditNicknameBuilder_;
      }

      private com.google.protobuf.SingleFieldBuilderV3<
          RequestGetRecords, RequestGetRecords.Builder, RequestGetRecordsOrBuilder> requestGetRecordsBuilder_;
      /**
       * <code>.RequestGetRecords requestGetRecords = 11;</code>
       */
      public boolean hasRequestGetRecords() {
        return dataBodyCase_ == 11;
      }
      /**
       * <code>.RequestGetRecords requestGetRecords = 11;</code>
       */
      public RequestGetRecords getRequestGetRecords() {
        if (requestGetRecordsBuilder_ == null) {
          if (dataBodyCase_ == 11) {
            return (RequestGetRecords) dataBody_;
          }
          return RequestGetRecords.getDefaultInstance();
        } else {
          if (dataBodyCase_ == 11) {
            return requestGetRecordsBuilder_.getMessage();
          }
          return RequestGetRecords.getDefaultInstance();
        }
      }
      /**
       * <code>.RequestGetRecords requestGetRecords = 11;</code>
       */
      public Builder setRequestGetRecords(RequestGetRecords value) {
        if (requestGetRecordsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          dataBody_ = value;
          onChanged();
        } else {
          requestGetRecordsBuilder_.setMessage(value);
        }
        dataBodyCase_ = 11;
        return this;
      }
      /**
       * <code>.RequestGetRecords requestGetRecords = 11;</code>
       */
      public Builder setRequestGetRecords(
          RequestGetRecords.Builder builderForValue) {
        if (requestGetRecordsBuilder_ == null) {
          dataBody_ = builderForValue.build();
          onChanged();
        } else {
          requestGetRecordsBuilder_.setMessage(builderForValue.build());
        }
        dataBodyCase_ = 11;
        return this;
      }
      /**
       * <code>.RequestGetRecords requestGetRecords = 11;</code>
       */
      public Builder mergeRequestGetRecords(RequestGetRecords value) {
        if (requestGetRecordsBuilder_ == null) {
          if (dataBodyCase_ == 11 &&
              dataBody_ != RequestGetRecords.getDefaultInstance()) {
            dataBody_ = RequestGetRecords.newBuilder((RequestGetRecords) dataBody_)
                .mergeFrom(value).buildPartial();
          } else {
            dataBody_ = value;
          }
          onChanged();
        } else {
          if (dataBodyCase_ == 11) {
            requestGetRecordsBuilder_.mergeFrom(value);
          }
          requestGetRecordsBuilder_.setMessage(value);
        }
        dataBodyCase_ = 11;
        return this;
      }
      /**
       * <code>.RequestGetRecords requestGetRecords = 11;</code>
       */
      public Builder clearRequestGetRecords() {
        if (requestGetRecordsBuilder_ == null) {
          if (dataBodyCase_ == 11) {
            dataBodyCase_ = 0;
            dataBody_ = null;
            onChanged();
          }
        } else {
          if (dataBodyCase_ == 11) {
            dataBodyCase_ = 0;
            dataBody_ = null;
          }
          requestGetRecordsBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>.RequestGetRecords requestGetRecords = 11;</code>
       */
      public RequestGetRecords.Builder getRequestGetRecordsBuilder() {
        return getRequestGetRecordsFieldBuilder().getBuilder();
      }
      /**
       * <code>.RequestGetRecords requestGetRecords = 11;</code>
       */
      public RequestGetRecordsOrBuilder getRequestGetRecordsOrBuilder() {
        if ((dataBodyCase_ == 11) && (requestGetRecordsBuilder_ != null)) {
          return requestGetRecordsBuilder_.getMessageOrBuilder();
        } else {
          if (dataBodyCase_ == 11) {
            return (RequestGetRecords) dataBody_;
          }
          return RequestGetRecords.getDefaultInstance();
        }
      }
      /**
       * <code>.RequestGetRecords requestGetRecords = 11;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          RequestGetRecords, RequestGetRecords.Builder, RequestGetRecordsOrBuilder>
          getRequestGetRecordsFieldBuilder() {
        if (requestGetRecordsBuilder_ == null) {
          if (!(dataBodyCase_ == 11)) {
            dataBody_ = RequestGetRecords.getDefaultInstance();
          }
          requestGetRecordsBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              RequestGetRecords, RequestGetRecords.Builder, RequestGetRecordsOrBuilder>(
                  (RequestGetRecords) dataBody_,
                  getParentForChildren(),
                  isClean());
          dataBody_ = null;
        }
        dataBodyCase_ = 11;
        onChanged();;
        return requestGetRecordsBuilder_;
      }

      private int type_ = 0;
      /**
       * <code>.Type type = 12;</code>
       */
      public int getTypeValue() {
        return type_;
      }
      /**
       * <code>.Type type = 12;</code>
       */
      public Builder setTypeValue(int value) {
        type_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>.Type type = 12;</code>
       */
      public Type getType() {
        @SuppressWarnings("deprecation")
        Type result = Type.valueOf(type_);
        return result == null ? Type.UNRECOGNIZED : result;
      }
      /**
       * <code>.Type type = 12;</code>
       */
      public Builder setType(Type value) {
        if (value == null) {
          throw new NullPointerException();
        }
        
        type_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>.Type type = 12;</code>
       */
      public Builder clearType() {
        
        type_ = 0;
        onChanged();
        return this;
      }

      private Object clientId_ = "";
      /**
       * <code>string client_id = 13;</code>
       */
      public String getClientId() {
        Object ref = clientId_;
        if (!(ref instanceof String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          String s = bs.toStringUtf8();
          clientId_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      /**
       * <code>string client_id = 13;</code>
       */
      public com.google.protobuf.ByteString
          getClientIdBytes() {
        Object ref = clientId_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (String) ref);
          clientId_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string client_id = 13;</code>
       */
      public Builder setClientId(
          String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        clientId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string client_id = 13;</code>
       */
      public Builder clearClientId() {
        
        clientId_ = getDefaultInstance().getClientId();
        onChanged();
        return this;
      }
      /**
       * <code>string client_id = 13;</code>
       */
      public Builder setClientIdBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        clientId_ = value;
        onChanged();
        return this;
      }

      private Object tip_ = "";
      /**
       * <code>string tip = 14;</code>
       */
      public String getTip() {
        Object ref = tip_;
        if (!(ref instanceof String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          String s = bs.toStringUtf8();
          tip_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      /**
       * <code>string tip = 14;</code>
       */
      public com.google.protobuf.ByteString
          getTipBytes() {
        Object ref = tip_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (String) ref);
          tip_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string tip = 14;</code>
       */
      public Builder setTip(
          String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        tip_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string tip = 14;</code>
       */
      public Builder clearTip() {
        
        tip_ = getDefaultInstance().getTip();
        onChanged();
        return this;
      }
      /**
       * <code>string tip = 14;</code>
       */
      public Builder setTipBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        tip_ = value;
        onChanged();
        return this;
      }

      private long timestamp_ ;
      /**
       * <code>int64 timestamp = 15;</code>
       */
      public long getTimestamp() {
        return timestamp_;
      }
      /**
       * <code>int64 timestamp = 15;</code>
       */
      public Builder setTimestamp(long value) {
        
        timestamp_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int64 timestamp = 15;</code>
       */
      public Builder clearTimestamp() {
        
        timestamp_ = 0L;
        onChanged();
        return this;
      }

      private int requestId_ ;
      /**
       * <code>int32 request_id = 16;</code>
       */
      public int getRequestId() {
        return requestId_;
      }
      /**
       * <code>int32 request_id = 16;</code>
       */
      public Builder setRequestId(int value) {
        
        requestId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 request_id = 16;</code>
       */
      public Builder clearRequestId() {
        
        requestId_ = 0;
        onChanged();
        return this;
      }
      @Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:Request)
    }

    // @@protoc_insertion_point(class_scope:Request)
    private static final Request DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new Request();
    }

    public static Request getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Request>
        PARSER = new com.google.protobuf.AbstractParser<Request>() {
      @Override
      public Request parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new Request(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<Request> parser() {
      return PARSER;
    }

    @Override
    public com.google.protobuf.Parser<Request> getParserForType() {
      return PARSER;
    }

    @Override
    public Request getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface ResponseOrBuilder extends
      // @@protoc_insertion_point(interface_extends:Response)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.ResponseConnect responseConnect = 1;</code>
     */
    boolean hasResponseConnect();
    /**
     * <code>.ResponseConnect responseConnect = 1;</code>
     */
    ResponseConnect getResponseConnect();
    /**
     * <code>.ResponseConnect responseConnect = 1;</code>
     */
    ResponseConnectOrBuilder getResponseConnectOrBuilder();

    /**
     * <code>.ResponseHeartbeat responseHeartbeat = 2;</code>
     */
    boolean hasResponseHeartbeat();
    /**
     * <code>.ResponseHeartbeat responseHeartbeat = 2;</code>
     */
    ResponseHeartbeat getResponseHeartbeat();
    /**
     * <code>.ResponseHeartbeat responseHeartbeat = 2;</code>
     */
    ResponseHeartbeatOrBuilder getResponseHeartbeatOrBuilder();

    /**
     * <code>.ResponseCreateGroup responseCreateGroup = 3;</code>
     */
    boolean hasResponseCreateGroup();
    /**
     * <code>.ResponseCreateGroup responseCreateGroup = 3;</code>
     */
    ResponseCreateGroup getResponseCreateGroup();
    /**
     * <code>.ResponseCreateGroup responseCreateGroup = 3;</code>
     */
    ResponseCreateGroupOrBuilder getResponseCreateGroupOrBuilder();

    /**
     * <code>.ResponseEnterGroup responseEnterGroup = 4;</code>
     */
    boolean hasResponseEnterGroup();
    /**
     * <code>.ResponseEnterGroup responseEnterGroup = 4;</code>
     */
    ResponseEnterGroup getResponseEnterGroup();
    /**
     * <code>.ResponseEnterGroup responseEnterGroup = 4;</code>
     */
    ResponseEnterGroupOrBuilder getResponseEnterGroupOrBuilder();

    /**
     * <code>.ResponseAddRecord responseAddRecord = 5;</code>
     */
    boolean hasResponseAddRecord();
    /**
     * <code>.ResponseAddRecord responseAddRecord = 5;</code>
     */
    ResponseAddRecord getResponseAddRecord();
    /**
     * <code>.ResponseAddRecord responseAddRecord = 5;</code>
     */
    ResponseAddRecordOrBuilder getResponseAddRecordOrBuilder();

    /**
     * <code>.ResponseRemoveRecord responseRemoveRecord = 6;</code>
     */
    boolean hasResponseRemoveRecord();
    /**
     * <code>.ResponseRemoveRecord responseRemoveRecord = 6;</code>
     */
    ResponseRemoveRecord getResponseRemoveRecord();
    /**
     * <code>.ResponseRemoveRecord responseRemoveRecord = 6;</code>
     */
    ResponseRemoveRecordOrBuilder getResponseRemoveRecordOrBuilder();

    /**
     * <code>.ResponseAddAccount responseAddAccount = 7;</code>
     */
    boolean hasResponseAddAccount();
    /**
     * <code>.ResponseAddAccount responseAddAccount = 7;</code>
     */
    ResponseAddAccount getResponseAddAccount();
    /**
     * <code>.ResponseAddAccount responseAddAccount = 7;</code>
     */
    ResponseAddAccountOrBuilder getResponseAddAccountOrBuilder();

    /**
     * <code>.ResponseRemoveAccount responseRemoveAccount = 8;</code>
     */
    boolean hasResponseRemoveAccount();
    /**
     * <code>.ResponseRemoveAccount responseRemoveAccount = 8;</code>
     */
    ResponseRemoveAccount getResponseRemoveAccount();
    /**
     * <code>.ResponseRemoveAccount responseRemoveAccount = 8;</code>
     */
    ResponseRemoveAccountOrBuilder getResponseRemoveAccountOrBuilder();

    /**
     * <code>.ResponseGetAccounts responseGetAccounts = 9;</code>
     */
    boolean hasResponseGetAccounts();
    /**
     * <code>.ResponseGetAccounts responseGetAccounts = 9;</code>
     */
    ResponseGetAccounts getResponseGetAccounts();
    /**
     * <code>.ResponseGetAccounts responseGetAccounts = 9;</code>
     */
    ResponseGetAccountsOrBuilder getResponseGetAccountsOrBuilder();

    /**
     * <code>.ResponseEditNickname responseEditNickname = 10;</code>
     */
    boolean hasResponseEditNickname();
    /**
     * <code>.ResponseEditNickname responseEditNickname = 10;</code>
     */
    ResponseEditNickname getResponseEditNickname();
    /**
     * <code>.ResponseEditNickname responseEditNickname = 10;</code>
     */
    ResponseEditNicknameOrBuilder getResponseEditNicknameOrBuilder();

    /**
     * <code>.ResponseGetRecords responseGetRecords = 11;</code>
     */
    boolean hasResponseGetRecords();
    /**
     * <code>.ResponseGetRecords responseGetRecords = 11;</code>
     */
    ResponseGetRecords getResponseGetRecords();
    /**
     * <code>.ResponseGetRecords responseGetRecords = 11;</code>
     */
    ResponseGetRecordsOrBuilder getResponseGetRecordsOrBuilder();

    /**
     * <code>.Type type = 12;</code>
     */
    int getTypeValue();
    /**
     * <code>.Type type = 12;</code>
     */
    Type getType();

    /**
     * <code>string client_id = 13;</code>
     */
    String getClientId();
    /**
     * <code>string client_id = 13;</code>
     */
    com.google.protobuf.ByteString
        getClientIdBytes();

    /**
     * <code>string tip = 14;</code>
     */
    String getTip();
    /**
     * <code>string tip = 14;</code>
     */
    com.google.protobuf.ByteString
        getTipBytes();

    /**
     * <code>int64 timestamp = 15;</code>
     */
    long getTimestamp();

    /**
     * <code>int32 request_id = 16;</code>
     */
    int getRequestId();

    public Response.DataBodyCase getDataBodyCase();
  }
  /**
   * Protobuf type {@code Response}
   */
  public  static final class Response extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:Response)
      ResponseOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Response.newBuilder() to construct.
    private Response(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Response() {
      type_ = 0;
      clientId_ = "";
      tip_ = "";
    }

    @Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private Response(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new NullPointerException();
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
            case 10: {
              ResponseConnect.Builder subBuilder = null;
              if (dataBodyCase_ == 1) {
                subBuilder = ((ResponseConnect) dataBody_).toBuilder();
              }
              dataBody_ =
                  input.readMessage(ResponseConnect.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom((ResponseConnect) dataBody_);
                dataBody_ = subBuilder.buildPartial();
              }
              dataBodyCase_ = 1;
              break;
            }
            case 18: {
              ResponseHeartbeat.Builder subBuilder = null;
              if (dataBodyCase_ == 2) {
                subBuilder = ((ResponseHeartbeat) dataBody_).toBuilder();
              }
              dataBody_ =
                  input.readMessage(ResponseHeartbeat.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom((ResponseHeartbeat) dataBody_);
                dataBody_ = subBuilder.buildPartial();
              }
              dataBodyCase_ = 2;
              break;
            }
            case 26: {
              ResponseCreateGroup.Builder subBuilder = null;
              if (dataBodyCase_ == 3) {
                subBuilder = ((ResponseCreateGroup) dataBody_).toBuilder();
              }
              dataBody_ =
                  input.readMessage(ResponseCreateGroup.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom((ResponseCreateGroup) dataBody_);
                dataBody_ = subBuilder.buildPartial();
              }
              dataBodyCase_ = 3;
              break;
            }
            case 34: {
              ResponseEnterGroup.Builder subBuilder = null;
              if (dataBodyCase_ == 4) {
                subBuilder = ((ResponseEnterGroup) dataBody_).toBuilder();
              }
              dataBody_ =
                  input.readMessage(ResponseEnterGroup.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom((ResponseEnterGroup) dataBody_);
                dataBody_ = subBuilder.buildPartial();
              }
              dataBodyCase_ = 4;
              break;
            }
            case 42: {
              ResponseAddRecord.Builder subBuilder = null;
              if (dataBodyCase_ == 5) {
                subBuilder = ((ResponseAddRecord) dataBody_).toBuilder();
              }
              dataBody_ =
                  input.readMessage(ResponseAddRecord.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom((ResponseAddRecord) dataBody_);
                dataBody_ = subBuilder.buildPartial();
              }
              dataBodyCase_ = 5;
              break;
            }
            case 50: {
              ResponseRemoveRecord.Builder subBuilder = null;
              if (dataBodyCase_ == 6) {
                subBuilder = ((ResponseRemoveRecord) dataBody_).toBuilder();
              }
              dataBody_ =
                  input.readMessage(ResponseRemoveRecord.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom((ResponseRemoveRecord) dataBody_);
                dataBody_ = subBuilder.buildPartial();
              }
              dataBodyCase_ = 6;
              break;
            }
            case 58: {
              ResponseAddAccount.Builder subBuilder = null;
              if (dataBodyCase_ == 7) {
                subBuilder = ((ResponseAddAccount) dataBody_).toBuilder();
              }
              dataBody_ =
                  input.readMessage(ResponseAddAccount.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom((ResponseAddAccount) dataBody_);
                dataBody_ = subBuilder.buildPartial();
              }
              dataBodyCase_ = 7;
              break;
            }
            case 66: {
              ResponseRemoveAccount.Builder subBuilder = null;
              if (dataBodyCase_ == 8) {
                subBuilder = ((ResponseRemoveAccount) dataBody_).toBuilder();
              }
              dataBody_ =
                  input.readMessage(ResponseRemoveAccount.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom((ResponseRemoveAccount) dataBody_);
                dataBody_ = subBuilder.buildPartial();
              }
              dataBodyCase_ = 8;
              break;
            }
            case 74: {
              ResponseGetAccounts.Builder subBuilder = null;
              if (dataBodyCase_ == 9) {
                subBuilder = ((ResponseGetAccounts) dataBody_).toBuilder();
              }
              dataBody_ =
                  input.readMessage(ResponseGetAccounts.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom((ResponseGetAccounts) dataBody_);
                dataBody_ = subBuilder.buildPartial();
              }
              dataBodyCase_ = 9;
              break;
            }
            case 82: {
              ResponseEditNickname.Builder subBuilder = null;
              if (dataBodyCase_ == 10) {
                subBuilder = ((ResponseEditNickname) dataBody_).toBuilder();
              }
              dataBody_ =
                  input.readMessage(ResponseEditNickname.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom((ResponseEditNickname) dataBody_);
                dataBody_ = subBuilder.buildPartial();
              }
              dataBodyCase_ = 10;
              break;
            }
            case 90: {
              ResponseGetRecords.Builder subBuilder = null;
              if (dataBodyCase_ == 11) {
                subBuilder = ((ResponseGetRecords) dataBody_).toBuilder();
              }
              dataBody_ =
                  input.readMessage(ResponseGetRecords.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom((ResponseGetRecords) dataBody_);
                dataBody_ = subBuilder.buildPartial();
              }
              dataBodyCase_ = 11;
              break;
            }
            case 96: {
              int rawValue = input.readEnum();

              type_ = rawValue;
              break;
            }
            case 106: {
              String s = input.readStringRequireUtf8();

              clientId_ = s;
              break;
            }
            case 114: {
              String s = input.readStringRequireUtf8();

              tip_ = s;
              break;
            }
            case 120: {

              timestamp_ = input.readInt64();
              break;
            }
            case 128: {

              requestId_ = input.readInt32();
              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
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
            e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return CBMessage.internal_static_Response_descriptor;
    }

    @Override
    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return CBMessage.internal_static_Response_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              Response.class, Builder.class);
    }

    private int dataBodyCase_ = 0;
    private Object dataBody_;
    public enum DataBodyCase
        implements com.google.protobuf.Internal.EnumLite {
      RESPONSECONNECT(1),
      RESPONSEHEARTBEAT(2),
      RESPONSECREATEGROUP(3),
      RESPONSEENTERGROUP(4),
      RESPONSEADDRECORD(5),
      RESPONSEREMOVERECORD(6),
      RESPONSEADDACCOUNT(7),
      RESPONSEREMOVEACCOUNT(8),
      RESPONSEGETACCOUNTS(9),
      RESPONSEEDITNICKNAME(10),
      RESPONSEGETRECORDS(11),
      DATABODY_NOT_SET(0);
      private final int value;
      private DataBodyCase(int value) {
        this.value = value;
      }
      /**
       * @deprecated Use {@link #forNumber(int)} instead.
       */
      @Deprecated
      public static DataBodyCase valueOf(int value) {
        return forNumber(value);
      }

      public static DataBodyCase forNumber(int value) {
        switch (value) {
          case 1: return RESPONSECONNECT;
          case 2: return RESPONSEHEARTBEAT;
          case 3: return RESPONSECREATEGROUP;
          case 4: return RESPONSEENTERGROUP;
          case 5: return RESPONSEADDRECORD;
          case 6: return RESPONSEREMOVERECORD;
          case 7: return RESPONSEADDACCOUNT;
          case 8: return RESPONSEREMOVEACCOUNT;
          case 9: return RESPONSEGETACCOUNTS;
          case 10: return RESPONSEEDITNICKNAME;
          case 11: return RESPONSEGETRECORDS;
          case 0: return DATABODY_NOT_SET;
          default: return null;
        }
      }
      public int getNumber() {
        return this.value;
      }
    };

    public DataBodyCase
    getDataBodyCase() {
      return DataBodyCase.forNumber(
          dataBodyCase_);
    }

    public static final int RESPONSECONNECT_FIELD_NUMBER = 1;
    /**
     * <code>.ResponseConnect responseConnect = 1;</code>
     */
    public boolean hasResponseConnect() {
      return dataBodyCase_ == 1;
    }
    /**
     * <code>.ResponseConnect responseConnect = 1;</code>
     */
    public ResponseConnect getResponseConnect() {
      if (dataBodyCase_ == 1) {
         return (ResponseConnect) dataBody_;
      }
      return ResponseConnect.getDefaultInstance();
    }
    /**
     * <code>.ResponseConnect responseConnect = 1;</code>
     */
    public ResponseConnectOrBuilder getResponseConnectOrBuilder() {
      if (dataBodyCase_ == 1) {
         return (ResponseConnect) dataBody_;
      }
      return ResponseConnect.getDefaultInstance();
    }

    public static final int RESPONSEHEARTBEAT_FIELD_NUMBER = 2;
    /**
     * <code>.ResponseHeartbeat responseHeartbeat = 2;</code>
     */
    public boolean hasResponseHeartbeat() {
      return dataBodyCase_ == 2;
    }
    /**
     * <code>.ResponseHeartbeat responseHeartbeat = 2;</code>
     */
    public ResponseHeartbeat getResponseHeartbeat() {
      if (dataBodyCase_ == 2) {
         return (ResponseHeartbeat) dataBody_;
      }
      return ResponseHeartbeat.getDefaultInstance();
    }
    /**
     * <code>.ResponseHeartbeat responseHeartbeat = 2;</code>
     */
    public ResponseHeartbeatOrBuilder getResponseHeartbeatOrBuilder() {
      if (dataBodyCase_ == 2) {
         return (ResponseHeartbeat) dataBody_;
      }
      return ResponseHeartbeat.getDefaultInstance();
    }

    public static final int RESPONSECREATEGROUP_FIELD_NUMBER = 3;
    /**
     * <code>.ResponseCreateGroup responseCreateGroup = 3;</code>
     */
    public boolean hasResponseCreateGroup() {
      return dataBodyCase_ == 3;
    }
    /**
     * <code>.ResponseCreateGroup responseCreateGroup = 3;</code>
     */
    public ResponseCreateGroup getResponseCreateGroup() {
      if (dataBodyCase_ == 3) {
         return (ResponseCreateGroup) dataBody_;
      }
      return ResponseCreateGroup.getDefaultInstance();
    }
    /**
     * <code>.ResponseCreateGroup responseCreateGroup = 3;</code>
     */
    public ResponseCreateGroupOrBuilder getResponseCreateGroupOrBuilder() {
      if (dataBodyCase_ == 3) {
         return (ResponseCreateGroup) dataBody_;
      }
      return ResponseCreateGroup.getDefaultInstance();
    }

    public static final int RESPONSEENTERGROUP_FIELD_NUMBER = 4;
    /**
     * <code>.ResponseEnterGroup responseEnterGroup = 4;</code>
     */
    public boolean hasResponseEnterGroup() {
      return dataBodyCase_ == 4;
    }
    /**
     * <code>.ResponseEnterGroup responseEnterGroup = 4;</code>
     */
    public ResponseEnterGroup getResponseEnterGroup() {
      if (dataBodyCase_ == 4) {
         return (ResponseEnterGroup) dataBody_;
      }
      return ResponseEnterGroup.getDefaultInstance();
    }
    /**
     * <code>.ResponseEnterGroup responseEnterGroup = 4;</code>
     */
    public ResponseEnterGroupOrBuilder getResponseEnterGroupOrBuilder() {
      if (dataBodyCase_ == 4) {
         return (ResponseEnterGroup) dataBody_;
      }
      return ResponseEnterGroup.getDefaultInstance();
    }

    public static final int RESPONSEADDRECORD_FIELD_NUMBER = 5;
    /**
     * <code>.ResponseAddRecord responseAddRecord = 5;</code>
     */
    public boolean hasResponseAddRecord() {
      return dataBodyCase_ == 5;
    }
    /**
     * <code>.ResponseAddRecord responseAddRecord = 5;</code>
     */
    public ResponseAddRecord getResponseAddRecord() {
      if (dataBodyCase_ == 5) {
         return (ResponseAddRecord) dataBody_;
      }
      return ResponseAddRecord.getDefaultInstance();
    }
    /**
     * <code>.ResponseAddRecord responseAddRecord = 5;</code>
     */
    public ResponseAddRecordOrBuilder getResponseAddRecordOrBuilder() {
      if (dataBodyCase_ == 5) {
         return (ResponseAddRecord) dataBody_;
      }
      return ResponseAddRecord.getDefaultInstance();
    }

    public static final int RESPONSEREMOVERECORD_FIELD_NUMBER = 6;
    /**
     * <code>.ResponseRemoveRecord responseRemoveRecord = 6;</code>
     */
    public boolean hasResponseRemoveRecord() {
      return dataBodyCase_ == 6;
    }
    /**
     * <code>.ResponseRemoveRecord responseRemoveRecord = 6;</code>
     */
    public ResponseRemoveRecord getResponseRemoveRecord() {
      if (dataBodyCase_ == 6) {
         return (ResponseRemoveRecord) dataBody_;
      }
      return ResponseRemoveRecord.getDefaultInstance();
    }
    /**
     * <code>.ResponseRemoveRecord responseRemoveRecord = 6;</code>
     */
    public ResponseRemoveRecordOrBuilder getResponseRemoveRecordOrBuilder() {
      if (dataBodyCase_ == 6) {
         return (ResponseRemoveRecord) dataBody_;
      }
      return ResponseRemoveRecord.getDefaultInstance();
    }

    public static final int RESPONSEADDACCOUNT_FIELD_NUMBER = 7;
    /**
     * <code>.ResponseAddAccount responseAddAccount = 7;</code>
     */
    public boolean hasResponseAddAccount() {
      return dataBodyCase_ == 7;
    }
    /**
     * <code>.ResponseAddAccount responseAddAccount = 7;</code>
     */
    public ResponseAddAccount getResponseAddAccount() {
      if (dataBodyCase_ == 7) {
         return (ResponseAddAccount) dataBody_;
      }
      return ResponseAddAccount.getDefaultInstance();
    }
    /**
     * <code>.ResponseAddAccount responseAddAccount = 7;</code>
     */
    public ResponseAddAccountOrBuilder getResponseAddAccountOrBuilder() {
      if (dataBodyCase_ == 7) {
         return (ResponseAddAccount) dataBody_;
      }
      return ResponseAddAccount.getDefaultInstance();
    }

    public static final int RESPONSEREMOVEACCOUNT_FIELD_NUMBER = 8;
    /**
     * <code>.ResponseRemoveAccount responseRemoveAccount = 8;</code>
     */
    public boolean hasResponseRemoveAccount() {
      return dataBodyCase_ == 8;
    }
    /**
     * <code>.ResponseRemoveAccount responseRemoveAccount = 8;</code>
     */
    public ResponseRemoveAccount getResponseRemoveAccount() {
      if (dataBodyCase_ == 8) {
         return (ResponseRemoveAccount) dataBody_;
      }
      return ResponseRemoveAccount.getDefaultInstance();
    }
    /**
     * <code>.ResponseRemoveAccount responseRemoveAccount = 8;</code>
     */
    public ResponseRemoveAccountOrBuilder getResponseRemoveAccountOrBuilder() {
      if (dataBodyCase_ == 8) {
         return (ResponseRemoveAccount) dataBody_;
      }
      return ResponseRemoveAccount.getDefaultInstance();
    }

    public static final int RESPONSEGETACCOUNTS_FIELD_NUMBER = 9;
    /**
     * <code>.ResponseGetAccounts responseGetAccounts = 9;</code>
     */
    public boolean hasResponseGetAccounts() {
      return dataBodyCase_ == 9;
    }
    /**
     * <code>.ResponseGetAccounts responseGetAccounts = 9;</code>
     */
    public ResponseGetAccounts getResponseGetAccounts() {
      if (dataBodyCase_ == 9) {
         return (ResponseGetAccounts) dataBody_;
      }
      return ResponseGetAccounts.getDefaultInstance();
    }
    /**
     * <code>.ResponseGetAccounts responseGetAccounts = 9;</code>
     */
    public ResponseGetAccountsOrBuilder getResponseGetAccountsOrBuilder() {
      if (dataBodyCase_ == 9) {
         return (ResponseGetAccounts) dataBody_;
      }
      return ResponseGetAccounts.getDefaultInstance();
    }

    public static final int RESPONSEEDITNICKNAME_FIELD_NUMBER = 10;
    /**
     * <code>.ResponseEditNickname responseEditNickname = 10;</code>
     */
    public boolean hasResponseEditNickname() {
      return dataBodyCase_ == 10;
    }
    /**
     * <code>.ResponseEditNickname responseEditNickname = 10;</code>
     */
    public ResponseEditNickname getResponseEditNickname() {
      if (dataBodyCase_ == 10) {
         return (ResponseEditNickname) dataBody_;
      }
      return ResponseEditNickname.getDefaultInstance();
    }
    /**
     * <code>.ResponseEditNickname responseEditNickname = 10;</code>
     */
    public ResponseEditNicknameOrBuilder getResponseEditNicknameOrBuilder() {
      if (dataBodyCase_ == 10) {
         return (ResponseEditNickname) dataBody_;
      }
      return ResponseEditNickname.getDefaultInstance();
    }

    public static final int RESPONSEGETRECORDS_FIELD_NUMBER = 11;
    /**
     * <code>.ResponseGetRecords responseGetRecords = 11;</code>
     */
    public boolean hasResponseGetRecords() {
      return dataBodyCase_ == 11;
    }
    /**
     * <code>.ResponseGetRecords responseGetRecords = 11;</code>
     */
    public ResponseGetRecords getResponseGetRecords() {
      if (dataBodyCase_ == 11) {
         return (ResponseGetRecords) dataBody_;
      }
      return ResponseGetRecords.getDefaultInstance();
    }
    /**
     * <code>.ResponseGetRecords responseGetRecords = 11;</code>
     */
    public ResponseGetRecordsOrBuilder getResponseGetRecordsOrBuilder() {
      if (dataBodyCase_ == 11) {
         return (ResponseGetRecords) dataBody_;
      }
      return ResponseGetRecords.getDefaultInstance();
    }

    public static final int TYPE_FIELD_NUMBER = 12;
    private int type_;
    /**
     * <code>.Type type = 12;</code>
     */
    public int getTypeValue() {
      return type_;
    }
    /**
     * <code>.Type type = 12;</code>
     */
    public Type getType() {
      @SuppressWarnings("deprecation")
      Type result = Type.valueOf(type_);
      return result == null ? Type.UNRECOGNIZED : result;
    }

    public static final int CLIENT_ID_FIELD_NUMBER = 13;
    private volatile Object clientId_;
    /**
     * <code>string client_id = 13;</code>
     */
    public String getClientId() {
      Object ref = clientId_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        clientId_ = s;
        return s;
      }
    }
    /**
     * <code>string client_id = 13;</code>
     */
    public com.google.protobuf.ByteString
        getClientIdBytes() {
      Object ref = clientId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        clientId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int TIP_FIELD_NUMBER = 14;
    private volatile Object tip_;
    /**
     * <code>string tip = 14;</code>
     */
    public String getTip() {
      Object ref = tip_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        tip_ = s;
        return s;
      }
    }
    /**
     * <code>string tip = 14;</code>
     */
    public com.google.protobuf.ByteString
        getTipBytes() {
      Object ref = tip_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        tip_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int TIMESTAMP_FIELD_NUMBER = 15;
    private long timestamp_;
    /**
     * <code>int64 timestamp = 15;</code>
     */
    public long getTimestamp() {
      return timestamp_;
    }

    public static final int REQUEST_ID_FIELD_NUMBER = 16;
    private int requestId_;
    /**
     * <code>int32 request_id = 16;</code>
     */
    public int getRequestId() {
      return requestId_;
    }

    private byte memoizedIsInitialized = -1;
    @Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (dataBodyCase_ == 1) {
        output.writeMessage(1, (ResponseConnect) dataBody_);
      }
      if (dataBodyCase_ == 2) {
        output.writeMessage(2, (ResponseHeartbeat) dataBody_);
      }
      if (dataBodyCase_ == 3) {
        output.writeMessage(3, (ResponseCreateGroup) dataBody_);
      }
      if (dataBodyCase_ == 4) {
        output.writeMessage(4, (ResponseEnterGroup) dataBody_);
      }
      if (dataBodyCase_ == 5) {
        output.writeMessage(5, (ResponseAddRecord) dataBody_);
      }
      if (dataBodyCase_ == 6) {
        output.writeMessage(6, (ResponseRemoveRecord) dataBody_);
      }
      if (dataBodyCase_ == 7) {
        output.writeMessage(7, (ResponseAddAccount) dataBody_);
      }
      if (dataBodyCase_ == 8) {
        output.writeMessage(8, (ResponseRemoveAccount) dataBody_);
      }
      if (dataBodyCase_ == 9) {
        output.writeMessage(9, (ResponseGetAccounts) dataBody_);
      }
      if (dataBodyCase_ == 10) {
        output.writeMessage(10, (ResponseEditNickname) dataBody_);
      }
      if (dataBodyCase_ == 11) {
        output.writeMessage(11, (ResponseGetRecords) dataBody_);
      }
      if (type_ != Type.UNKNOWN.getNumber()) {
        output.writeEnum(12, type_);
      }
      if (!getClientIdBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 13, clientId_);
      }
      if (!getTipBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 14, tip_);
      }
      if (timestamp_ != 0L) {
        output.writeInt64(15, timestamp_);
      }
      if (requestId_ != 0) {
        output.writeInt32(16, requestId_);
      }
      unknownFields.writeTo(output);
    }

    @Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (dataBodyCase_ == 1) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, (ResponseConnect) dataBody_);
      }
      if (dataBodyCase_ == 2) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, (ResponseHeartbeat) dataBody_);
      }
      if (dataBodyCase_ == 3) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(3, (ResponseCreateGroup) dataBody_);
      }
      if (dataBodyCase_ == 4) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(4, (ResponseEnterGroup) dataBody_);
      }
      if (dataBodyCase_ == 5) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(5, (ResponseAddRecord) dataBody_);
      }
      if (dataBodyCase_ == 6) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(6, (ResponseRemoveRecord) dataBody_);
      }
      if (dataBodyCase_ == 7) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(7, (ResponseAddAccount) dataBody_);
      }
      if (dataBodyCase_ == 8) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(8, (ResponseRemoveAccount) dataBody_);
      }
      if (dataBodyCase_ == 9) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(9, (ResponseGetAccounts) dataBody_);
      }
      if (dataBodyCase_ == 10) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(10, (ResponseEditNickname) dataBody_);
      }
      if (dataBodyCase_ == 11) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(11, (ResponseGetRecords) dataBody_);
      }
      if (type_ != Type.UNKNOWN.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(12, type_);
      }
      if (!getClientIdBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(13, clientId_);
      }
      if (!getTipBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(14, tip_);
      }
      if (timestamp_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(15, timestamp_);
      }
      if (requestId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(16, requestId_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @Override
    public boolean equals(final Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof Response)) {
        return super.equals(obj);
      }
      Response other = (Response) obj;

      if (type_ != other.type_) return false;
      if (!getClientId()
          .equals(other.getClientId())) return false;
      if (!getTip()
          .equals(other.getTip())) return false;
      if (getTimestamp()
          != other.getTimestamp()) return false;
      if (getRequestId()
          != other.getRequestId()) return false;
      if (!getDataBodyCase().equals(other.getDataBodyCase())) return false;
      switch (dataBodyCase_) {
        case 1:
          if (!getResponseConnect()
              .equals(other.getResponseConnect())) return false;
          break;
        case 2:
          if (!getResponseHeartbeat()
              .equals(other.getResponseHeartbeat())) return false;
          break;
        case 3:
          if (!getResponseCreateGroup()
              .equals(other.getResponseCreateGroup())) return false;
          break;
        case 4:
          if (!getResponseEnterGroup()
              .equals(other.getResponseEnterGroup())) return false;
          break;
        case 5:
          if (!getResponseAddRecord()
              .equals(other.getResponseAddRecord())) return false;
          break;
        case 6:
          if (!getResponseRemoveRecord()
              .equals(other.getResponseRemoveRecord())) return false;
          break;
        case 7:
          if (!getResponseAddAccount()
              .equals(other.getResponseAddAccount())) return false;
          break;
        case 8:
          if (!getResponseRemoveAccount()
              .equals(other.getResponseRemoveAccount())) return false;
          break;
        case 9:
          if (!getResponseGetAccounts()
              .equals(other.getResponseGetAccounts())) return false;
          break;
        case 10:
          if (!getResponseEditNickname()
              .equals(other.getResponseEditNickname())) return false;
          break;
        case 11:
          if (!getResponseGetRecords()
              .equals(other.getResponseGetRecords())) return false;
          break;
        case 0:
        default:
      }
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + TYPE_FIELD_NUMBER;
      hash = (53 * hash) + type_;
      hash = (37 * hash) + CLIENT_ID_FIELD_NUMBER;
      hash = (53 * hash) + getClientId().hashCode();
      hash = (37 * hash) + TIP_FIELD_NUMBER;
      hash = (53 * hash) + getTip().hashCode();
      hash = (37 * hash) + TIMESTAMP_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getTimestamp());
      hash = (37 * hash) + REQUEST_ID_FIELD_NUMBER;
      hash = (53 * hash) + getRequestId();
      switch (dataBodyCase_) {
        case 1:
          hash = (37 * hash) + RESPONSECONNECT_FIELD_NUMBER;
          hash = (53 * hash) + getResponseConnect().hashCode();
          break;
        case 2:
          hash = (37 * hash) + RESPONSEHEARTBEAT_FIELD_NUMBER;
          hash = (53 * hash) + getResponseHeartbeat().hashCode();
          break;
        case 3:
          hash = (37 * hash) + RESPONSECREATEGROUP_FIELD_NUMBER;
          hash = (53 * hash) + getResponseCreateGroup().hashCode();
          break;
        case 4:
          hash = (37 * hash) + RESPONSEENTERGROUP_FIELD_NUMBER;
          hash = (53 * hash) + getResponseEnterGroup().hashCode();
          break;
        case 5:
          hash = (37 * hash) + RESPONSEADDRECORD_FIELD_NUMBER;
          hash = (53 * hash) + getResponseAddRecord().hashCode();
          break;
        case 6:
          hash = (37 * hash) + RESPONSEREMOVERECORD_FIELD_NUMBER;
          hash = (53 * hash) + getResponseRemoveRecord().hashCode();
          break;
        case 7:
          hash = (37 * hash) + RESPONSEADDACCOUNT_FIELD_NUMBER;
          hash = (53 * hash) + getResponseAddAccount().hashCode();
          break;
        case 8:
          hash = (37 * hash) + RESPONSEREMOVEACCOUNT_FIELD_NUMBER;
          hash = (53 * hash) + getResponseRemoveAccount().hashCode();
          break;
        case 9:
          hash = (37 * hash) + RESPONSEGETACCOUNTS_FIELD_NUMBER;
          hash = (53 * hash) + getResponseGetAccounts().hashCode();
          break;
        case 10:
          hash = (37 * hash) + RESPONSEEDITNICKNAME_FIELD_NUMBER;
          hash = (53 * hash) + getResponseEditNickname().hashCode();
          break;
        case 11:
          hash = (37 * hash) + RESPONSEGETRECORDS_FIELD_NUMBER;
          hash = (53 * hash) + getResponseGetRecords().hashCode();
          break;
        case 0:
        default:
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static Response parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static Response parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static Response parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static Response parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static Response parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static Response parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static Response parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static Response parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static Response parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static Response parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static Response parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static Response parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(Response prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @Override
    protected Builder newBuilderForType(
        BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code Response}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:Response)
        ResponseOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return CBMessage.internal_static_Response_descriptor;
      }

      @Override
      protected FieldAccessorTable
          internalGetFieldAccessorTable() {
        return CBMessage.internal_static_Response_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                Response.class, Builder.class);
      }

      // Construct using CBMessage.Response.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      @Override
      public Builder clear() {
        super.clear();
        type_ = 0;

        clientId_ = "";

        tip_ = "";

        timestamp_ = 0L;

        requestId_ = 0;

        dataBodyCase_ = 0;
        dataBody_ = null;
        return this;
      }

      @Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return CBMessage.internal_static_Response_descriptor;
      }

      @Override
      public Response getDefaultInstanceForType() {
        return Response.getDefaultInstance();
      }

      @Override
      public Response build() {
        Response result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @Override
      public Response buildPartial() {
        Response result = new Response(this);
        if (dataBodyCase_ == 1) {
          if (responseConnectBuilder_ == null) {
            result.dataBody_ = dataBody_;
          } else {
            result.dataBody_ = responseConnectBuilder_.build();
          }
        }
        if (dataBodyCase_ == 2) {
          if (responseHeartbeatBuilder_ == null) {
            result.dataBody_ = dataBody_;
          } else {
            result.dataBody_ = responseHeartbeatBuilder_.build();
          }
        }
        if (dataBodyCase_ == 3) {
          if (responseCreateGroupBuilder_ == null) {
            result.dataBody_ = dataBody_;
          } else {
            result.dataBody_ = responseCreateGroupBuilder_.build();
          }
        }
        if (dataBodyCase_ == 4) {
          if (responseEnterGroupBuilder_ == null) {
            result.dataBody_ = dataBody_;
          } else {
            result.dataBody_ = responseEnterGroupBuilder_.build();
          }
        }
        if (dataBodyCase_ == 5) {
          if (responseAddRecordBuilder_ == null) {
            result.dataBody_ = dataBody_;
          } else {
            result.dataBody_ = responseAddRecordBuilder_.build();
          }
        }
        if (dataBodyCase_ == 6) {
          if (responseRemoveRecordBuilder_ == null) {
            result.dataBody_ = dataBody_;
          } else {
            result.dataBody_ = responseRemoveRecordBuilder_.build();
          }
        }
        if (dataBodyCase_ == 7) {
          if (responseAddAccountBuilder_ == null) {
            result.dataBody_ = dataBody_;
          } else {
            result.dataBody_ = responseAddAccountBuilder_.build();
          }
        }
        if (dataBodyCase_ == 8) {
          if (responseRemoveAccountBuilder_ == null) {
            result.dataBody_ = dataBody_;
          } else {
            result.dataBody_ = responseRemoveAccountBuilder_.build();
          }
        }
        if (dataBodyCase_ == 9) {
          if (responseGetAccountsBuilder_ == null) {
            result.dataBody_ = dataBody_;
          } else {
            result.dataBody_ = responseGetAccountsBuilder_.build();
          }
        }
        if (dataBodyCase_ == 10) {
          if (responseEditNicknameBuilder_ == null) {
            result.dataBody_ = dataBody_;
          } else {
            result.dataBody_ = responseEditNicknameBuilder_.build();
          }
        }
        if (dataBodyCase_ == 11) {
          if (responseGetRecordsBuilder_ == null) {
            result.dataBody_ = dataBody_;
          } else {
            result.dataBody_ = responseGetRecordsBuilder_.build();
          }
        }
        result.type_ = type_;
        result.clientId_ = clientId_;
        result.tip_ = tip_;
        result.timestamp_ = timestamp_;
        result.requestId_ = requestId_;
        result.dataBodyCase_ = dataBodyCase_;
        onBuilt();
        return result;
      }

      @Override
      public Builder clone() {
        return super.clone();
      }
      @Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return super.setField(field, value);
      }
      @Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return super.addRepeatedField(field, value);
      }
      @Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof Response) {
          return mergeFrom((Response)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(Response other) {
        if (other == Response.getDefaultInstance()) return this;
        if (other.type_ != 0) {
          setTypeValue(other.getTypeValue());
        }
        if (!other.getClientId().isEmpty()) {
          clientId_ = other.clientId_;
          onChanged();
        }
        if (!other.getTip().isEmpty()) {
          tip_ = other.tip_;
          onChanged();
        }
        if (other.getTimestamp() != 0L) {
          setTimestamp(other.getTimestamp());
        }
        if (other.getRequestId() != 0) {
          setRequestId(other.getRequestId());
        }
        switch (other.getDataBodyCase()) {
          case RESPONSECONNECT: {
            mergeResponseConnect(other.getResponseConnect());
            break;
          }
          case RESPONSEHEARTBEAT: {
            mergeResponseHeartbeat(other.getResponseHeartbeat());
            break;
          }
          case RESPONSECREATEGROUP: {
            mergeResponseCreateGroup(other.getResponseCreateGroup());
            break;
          }
          case RESPONSEENTERGROUP: {
            mergeResponseEnterGroup(other.getResponseEnterGroup());
            break;
          }
          case RESPONSEADDRECORD: {
            mergeResponseAddRecord(other.getResponseAddRecord());
            break;
          }
          case RESPONSEREMOVERECORD: {
            mergeResponseRemoveRecord(other.getResponseRemoveRecord());
            break;
          }
          case RESPONSEADDACCOUNT: {
            mergeResponseAddAccount(other.getResponseAddAccount());
            break;
          }
          case RESPONSEREMOVEACCOUNT: {
            mergeResponseRemoveAccount(other.getResponseRemoveAccount());
            break;
          }
          case RESPONSEGETACCOUNTS: {
            mergeResponseGetAccounts(other.getResponseGetAccounts());
            break;
          }
          case RESPONSEEDITNICKNAME: {
            mergeResponseEditNickname(other.getResponseEditNickname());
            break;
          }
          case RESPONSEGETRECORDS: {
            mergeResponseGetRecords(other.getResponseGetRecords());
            break;
          }
          case DATABODY_NOT_SET: {
            break;
          }
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @Override
      public final boolean isInitialized() {
        return true;
      }

      @Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        Response parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (Response) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int dataBodyCase_ = 0;
      private Object dataBody_;
      public DataBodyCase
          getDataBodyCase() {
        return DataBodyCase.forNumber(
            dataBodyCase_);
      }

      public Builder clearDataBody() {
        dataBodyCase_ = 0;
        dataBody_ = null;
        onChanged();
        return this;
      }


      private com.google.protobuf.SingleFieldBuilderV3<
          ResponseConnect, ResponseConnect.Builder, ResponseConnectOrBuilder> responseConnectBuilder_;
      /**
       * <code>.ResponseConnect responseConnect = 1;</code>
       */
      public boolean hasResponseConnect() {
        return dataBodyCase_ == 1;
      }
      /**
       * <code>.ResponseConnect responseConnect = 1;</code>
       */
      public ResponseConnect getResponseConnect() {
        if (responseConnectBuilder_ == null) {
          if (dataBodyCase_ == 1) {
            return (ResponseConnect) dataBody_;
          }
          return ResponseConnect.getDefaultInstance();
        } else {
          if (dataBodyCase_ == 1) {
            return responseConnectBuilder_.getMessage();
          }
          return ResponseConnect.getDefaultInstance();
        }
      }
      /**
       * <code>.ResponseConnect responseConnect = 1;</code>
       */
      public Builder setResponseConnect(ResponseConnect value) {
        if (responseConnectBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          dataBody_ = value;
          onChanged();
        } else {
          responseConnectBuilder_.setMessage(value);
        }
        dataBodyCase_ = 1;
        return this;
      }
      /**
       * <code>.ResponseConnect responseConnect = 1;</code>
       */
      public Builder setResponseConnect(
          ResponseConnect.Builder builderForValue) {
        if (responseConnectBuilder_ == null) {
          dataBody_ = builderForValue.build();
          onChanged();
        } else {
          responseConnectBuilder_.setMessage(builderForValue.build());
        }
        dataBodyCase_ = 1;
        return this;
      }
      /**
       * <code>.ResponseConnect responseConnect = 1;</code>
       */
      public Builder mergeResponseConnect(ResponseConnect value) {
        if (responseConnectBuilder_ == null) {
          if (dataBodyCase_ == 1 &&
              dataBody_ != ResponseConnect.getDefaultInstance()) {
            dataBody_ = ResponseConnect.newBuilder((ResponseConnect) dataBody_)
                .mergeFrom(value).buildPartial();
          } else {
            dataBody_ = value;
          }
          onChanged();
        } else {
          if (dataBodyCase_ == 1) {
            responseConnectBuilder_.mergeFrom(value);
          }
          responseConnectBuilder_.setMessage(value);
        }
        dataBodyCase_ = 1;
        return this;
      }
      /**
       * <code>.ResponseConnect responseConnect = 1;</code>
       */
      public Builder clearResponseConnect() {
        if (responseConnectBuilder_ == null) {
          if (dataBodyCase_ == 1) {
            dataBodyCase_ = 0;
            dataBody_ = null;
            onChanged();
          }
        } else {
          if (dataBodyCase_ == 1) {
            dataBodyCase_ = 0;
            dataBody_ = null;
          }
          responseConnectBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>.ResponseConnect responseConnect = 1;</code>
       */
      public ResponseConnect.Builder getResponseConnectBuilder() {
        return getResponseConnectFieldBuilder().getBuilder();
      }
      /**
       * <code>.ResponseConnect responseConnect = 1;</code>
       */
      public ResponseConnectOrBuilder getResponseConnectOrBuilder() {
        if ((dataBodyCase_ == 1) && (responseConnectBuilder_ != null)) {
          return responseConnectBuilder_.getMessageOrBuilder();
        } else {
          if (dataBodyCase_ == 1) {
            return (ResponseConnect) dataBody_;
          }
          return ResponseConnect.getDefaultInstance();
        }
      }
      /**
       * <code>.ResponseConnect responseConnect = 1;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          ResponseConnect, ResponseConnect.Builder, ResponseConnectOrBuilder>
          getResponseConnectFieldBuilder() {
        if (responseConnectBuilder_ == null) {
          if (!(dataBodyCase_ == 1)) {
            dataBody_ = ResponseConnect.getDefaultInstance();
          }
          responseConnectBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              ResponseConnect, ResponseConnect.Builder, ResponseConnectOrBuilder>(
                  (ResponseConnect) dataBody_,
                  getParentForChildren(),
                  isClean());
          dataBody_ = null;
        }
        dataBodyCase_ = 1;
        onChanged();;
        return responseConnectBuilder_;
      }

      private com.google.protobuf.SingleFieldBuilderV3<
          ResponseHeartbeat, ResponseHeartbeat.Builder, ResponseHeartbeatOrBuilder> responseHeartbeatBuilder_;
      /**
       * <code>.ResponseHeartbeat responseHeartbeat = 2;</code>
       */
      public boolean hasResponseHeartbeat() {
        return dataBodyCase_ == 2;
      }
      /**
       * <code>.ResponseHeartbeat responseHeartbeat = 2;</code>
       */
      public ResponseHeartbeat getResponseHeartbeat() {
        if (responseHeartbeatBuilder_ == null) {
          if (dataBodyCase_ == 2) {
            return (ResponseHeartbeat) dataBody_;
          }
          return ResponseHeartbeat.getDefaultInstance();
        } else {
          if (dataBodyCase_ == 2) {
            return responseHeartbeatBuilder_.getMessage();
          }
          return ResponseHeartbeat.getDefaultInstance();
        }
      }
      /**
       * <code>.ResponseHeartbeat responseHeartbeat = 2;</code>
       */
      public Builder setResponseHeartbeat(ResponseHeartbeat value) {
        if (responseHeartbeatBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          dataBody_ = value;
          onChanged();
        } else {
          responseHeartbeatBuilder_.setMessage(value);
        }
        dataBodyCase_ = 2;
        return this;
      }
      /**
       * <code>.ResponseHeartbeat responseHeartbeat = 2;</code>
       */
      public Builder setResponseHeartbeat(
          ResponseHeartbeat.Builder builderForValue) {
        if (responseHeartbeatBuilder_ == null) {
          dataBody_ = builderForValue.build();
          onChanged();
        } else {
          responseHeartbeatBuilder_.setMessage(builderForValue.build());
        }
        dataBodyCase_ = 2;
        return this;
      }
      /**
       * <code>.ResponseHeartbeat responseHeartbeat = 2;</code>
       */
      public Builder mergeResponseHeartbeat(ResponseHeartbeat value) {
        if (responseHeartbeatBuilder_ == null) {
          if (dataBodyCase_ == 2 &&
              dataBody_ != ResponseHeartbeat.getDefaultInstance()) {
            dataBody_ = ResponseHeartbeat.newBuilder((ResponseHeartbeat) dataBody_)
                .mergeFrom(value).buildPartial();
          } else {
            dataBody_ = value;
          }
          onChanged();
        } else {
          if (dataBodyCase_ == 2) {
            responseHeartbeatBuilder_.mergeFrom(value);
          }
          responseHeartbeatBuilder_.setMessage(value);
        }
        dataBodyCase_ = 2;
        return this;
      }
      /**
       * <code>.ResponseHeartbeat responseHeartbeat = 2;</code>
       */
      public Builder clearResponseHeartbeat() {
        if (responseHeartbeatBuilder_ == null) {
          if (dataBodyCase_ == 2) {
            dataBodyCase_ = 0;
            dataBody_ = null;
            onChanged();
          }
        } else {
          if (dataBodyCase_ == 2) {
            dataBodyCase_ = 0;
            dataBody_ = null;
          }
          responseHeartbeatBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>.ResponseHeartbeat responseHeartbeat = 2;</code>
       */
      public ResponseHeartbeat.Builder getResponseHeartbeatBuilder() {
        return getResponseHeartbeatFieldBuilder().getBuilder();
      }
      /**
       * <code>.ResponseHeartbeat responseHeartbeat = 2;</code>
       */
      public ResponseHeartbeatOrBuilder getResponseHeartbeatOrBuilder() {
        if ((dataBodyCase_ == 2) && (responseHeartbeatBuilder_ != null)) {
          return responseHeartbeatBuilder_.getMessageOrBuilder();
        } else {
          if (dataBodyCase_ == 2) {
            return (ResponseHeartbeat) dataBody_;
          }
          return ResponseHeartbeat.getDefaultInstance();
        }
      }
      /**
       * <code>.ResponseHeartbeat responseHeartbeat = 2;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          ResponseHeartbeat, ResponseHeartbeat.Builder, ResponseHeartbeatOrBuilder>
          getResponseHeartbeatFieldBuilder() {
        if (responseHeartbeatBuilder_ == null) {
          if (!(dataBodyCase_ == 2)) {
            dataBody_ = ResponseHeartbeat.getDefaultInstance();
          }
          responseHeartbeatBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              ResponseHeartbeat, ResponseHeartbeat.Builder, ResponseHeartbeatOrBuilder>(
                  (ResponseHeartbeat) dataBody_,
                  getParentForChildren(),
                  isClean());
          dataBody_ = null;
        }
        dataBodyCase_ = 2;
        onChanged();;
        return responseHeartbeatBuilder_;
      }

      private com.google.protobuf.SingleFieldBuilderV3<
          ResponseCreateGroup, ResponseCreateGroup.Builder, ResponseCreateGroupOrBuilder> responseCreateGroupBuilder_;
      /**
       * <code>.ResponseCreateGroup responseCreateGroup = 3;</code>
       */
      public boolean hasResponseCreateGroup() {
        return dataBodyCase_ == 3;
      }
      /**
       * <code>.ResponseCreateGroup responseCreateGroup = 3;</code>
       */
      public ResponseCreateGroup getResponseCreateGroup() {
        if (responseCreateGroupBuilder_ == null) {
          if (dataBodyCase_ == 3) {
            return (ResponseCreateGroup) dataBody_;
          }
          return ResponseCreateGroup.getDefaultInstance();
        } else {
          if (dataBodyCase_ == 3) {
            return responseCreateGroupBuilder_.getMessage();
          }
          return ResponseCreateGroup.getDefaultInstance();
        }
      }
      /**
       * <code>.ResponseCreateGroup responseCreateGroup = 3;</code>
       */
      public Builder setResponseCreateGroup(ResponseCreateGroup value) {
        if (responseCreateGroupBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          dataBody_ = value;
          onChanged();
        } else {
          responseCreateGroupBuilder_.setMessage(value);
        }
        dataBodyCase_ = 3;
        return this;
      }
      /**
       * <code>.ResponseCreateGroup responseCreateGroup = 3;</code>
       */
      public Builder setResponseCreateGroup(
          ResponseCreateGroup.Builder builderForValue) {
        if (responseCreateGroupBuilder_ == null) {
          dataBody_ = builderForValue.build();
          onChanged();
        } else {
          responseCreateGroupBuilder_.setMessage(builderForValue.build());
        }
        dataBodyCase_ = 3;
        return this;
      }
      /**
       * <code>.ResponseCreateGroup responseCreateGroup = 3;</code>
       */
      public Builder mergeResponseCreateGroup(ResponseCreateGroup value) {
        if (responseCreateGroupBuilder_ == null) {
          if (dataBodyCase_ == 3 &&
              dataBody_ != ResponseCreateGroup.getDefaultInstance()) {
            dataBody_ = ResponseCreateGroup.newBuilder((ResponseCreateGroup) dataBody_)
                .mergeFrom(value).buildPartial();
          } else {
            dataBody_ = value;
          }
          onChanged();
        } else {
          if (dataBodyCase_ == 3) {
            responseCreateGroupBuilder_.mergeFrom(value);
          }
          responseCreateGroupBuilder_.setMessage(value);
        }
        dataBodyCase_ = 3;
        return this;
      }
      /**
       * <code>.ResponseCreateGroup responseCreateGroup = 3;</code>
       */
      public Builder clearResponseCreateGroup() {
        if (responseCreateGroupBuilder_ == null) {
          if (dataBodyCase_ == 3) {
            dataBodyCase_ = 0;
            dataBody_ = null;
            onChanged();
          }
        } else {
          if (dataBodyCase_ == 3) {
            dataBodyCase_ = 0;
            dataBody_ = null;
          }
          responseCreateGroupBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>.ResponseCreateGroup responseCreateGroup = 3;</code>
       */
      public ResponseCreateGroup.Builder getResponseCreateGroupBuilder() {
        return getResponseCreateGroupFieldBuilder().getBuilder();
      }
      /**
       * <code>.ResponseCreateGroup responseCreateGroup = 3;</code>
       */
      public ResponseCreateGroupOrBuilder getResponseCreateGroupOrBuilder() {
        if ((dataBodyCase_ == 3) && (responseCreateGroupBuilder_ != null)) {
          return responseCreateGroupBuilder_.getMessageOrBuilder();
        } else {
          if (dataBodyCase_ == 3) {
            return (ResponseCreateGroup) dataBody_;
          }
          return ResponseCreateGroup.getDefaultInstance();
        }
      }
      /**
       * <code>.ResponseCreateGroup responseCreateGroup = 3;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          ResponseCreateGroup, ResponseCreateGroup.Builder, ResponseCreateGroupOrBuilder>
          getResponseCreateGroupFieldBuilder() {
        if (responseCreateGroupBuilder_ == null) {
          if (!(dataBodyCase_ == 3)) {
            dataBody_ = ResponseCreateGroup.getDefaultInstance();
          }
          responseCreateGroupBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              ResponseCreateGroup, ResponseCreateGroup.Builder, ResponseCreateGroupOrBuilder>(
                  (ResponseCreateGroup) dataBody_,
                  getParentForChildren(),
                  isClean());
          dataBody_ = null;
        }
        dataBodyCase_ = 3;
        onChanged();;
        return responseCreateGroupBuilder_;
      }

      private com.google.protobuf.SingleFieldBuilderV3<
          ResponseEnterGroup, ResponseEnterGroup.Builder, ResponseEnterGroupOrBuilder> responseEnterGroupBuilder_;
      /**
       * <code>.ResponseEnterGroup responseEnterGroup = 4;</code>
       */
      public boolean hasResponseEnterGroup() {
        return dataBodyCase_ == 4;
      }
      /**
       * <code>.ResponseEnterGroup responseEnterGroup = 4;</code>
       */
      public ResponseEnterGroup getResponseEnterGroup() {
        if (responseEnterGroupBuilder_ == null) {
          if (dataBodyCase_ == 4) {
            return (ResponseEnterGroup) dataBody_;
          }
          return ResponseEnterGroup.getDefaultInstance();
        } else {
          if (dataBodyCase_ == 4) {
            return responseEnterGroupBuilder_.getMessage();
          }
          return ResponseEnterGroup.getDefaultInstance();
        }
      }
      /**
       * <code>.ResponseEnterGroup responseEnterGroup = 4;</code>
       */
      public Builder setResponseEnterGroup(ResponseEnterGroup value) {
        if (responseEnterGroupBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          dataBody_ = value;
          onChanged();
        } else {
          responseEnterGroupBuilder_.setMessage(value);
        }
        dataBodyCase_ = 4;
        return this;
      }
      /**
       * <code>.ResponseEnterGroup responseEnterGroup = 4;</code>
       */
      public Builder setResponseEnterGroup(
          ResponseEnterGroup.Builder builderForValue) {
        if (responseEnterGroupBuilder_ == null) {
          dataBody_ = builderForValue.build();
          onChanged();
        } else {
          responseEnterGroupBuilder_.setMessage(builderForValue.build());
        }
        dataBodyCase_ = 4;
        return this;
      }
      /**
       * <code>.ResponseEnterGroup responseEnterGroup = 4;</code>
       */
      public Builder mergeResponseEnterGroup(ResponseEnterGroup value) {
        if (responseEnterGroupBuilder_ == null) {
          if (dataBodyCase_ == 4 &&
              dataBody_ != ResponseEnterGroup.getDefaultInstance()) {
            dataBody_ = ResponseEnterGroup.newBuilder((ResponseEnterGroup) dataBody_)
                .mergeFrom(value).buildPartial();
          } else {
            dataBody_ = value;
          }
          onChanged();
        } else {
          if (dataBodyCase_ == 4) {
            responseEnterGroupBuilder_.mergeFrom(value);
          }
          responseEnterGroupBuilder_.setMessage(value);
        }
        dataBodyCase_ = 4;
        return this;
      }
      /**
       * <code>.ResponseEnterGroup responseEnterGroup = 4;</code>
       */
      public Builder clearResponseEnterGroup() {
        if (responseEnterGroupBuilder_ == null) {
          if (dataBodyCase_ == 4) {
            dataBodyCase_ = 0;
            dataBody_ = null;
            onChanged();
          }
        } else {
          if (dataBodyCase_ == 4) {
            dataBodyCase_ = 0;
            dataBody_ = null;
          }
          responseEnterGroupBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>.ResponseEnterGroup responseEnterGroup = 4;</code>
       */
      public ResponseEnterGroup.Builder getResponseEnterGroupBuilder() {
        return getResponseEnterGroupFieldBuilder().getBuilder();
      }
      /**
       * <code>.ResponseEnterGroup responseEnterGroup = 4;</code>
       */
      public ResponseEnterGroupOrBuilder getResponseEnterGroupOrBuilder() {
        if ((dataBodyCase_ == 4) && (responseEnterGroupBuilder_ != null)) {
          return responseEnterGroupBuilder_.getMessageOrBuilder();
        } else {
          if (dataBodyCase_ == 4) {
            return (ResponseEnterGroup) dataBody_;
          }
          return ResponseEnterGroup.getDefaultInstance();
        }
      }
      /**
       * <code>.ResponseEnterGroup responseEnterGroup = 4;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          ResponseEnterGroup, ResponseEnterGroup.Builder, ResponseEnterGroupOrBuilder>
          getResponseEnterGroupFieldBuilder() {
        if (responseEnterGroupBuilder_ == null) {
          if (!(dataBodyCase_ == 4)) {
            dataBody_ = ResponseEnterGroup.getDefaultInstance();
          }
          responseEnterGroupBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              ResponseEnterGroup, ResponseEnterGroup.Builder, ResponseEnterGroupOrBuilder>(
                  (ResponseEnterGroup) dataBody_,
                  getParentForChildren(),
                  isClean());
          dataBody_ = null;
        }
        dataBodyCase_ = 4;
        onChanged();;
        return responseEnterGroupBuilder_;
      }

      private com.google.protobuf.SingleFieldBuilderV3<
          ResponseAddRecord, ResponseAddRecord.Builder, ResponseAddRecordOrBuilder> responseAddRecordBuilder_;
      /**
       * <code>.ResponseAddRecord responseAddRecord = 5;</code>
       */
      public boolean hasResponseAddRecord() {
        return dataBodyCase_ == 5;
      }
      /**
       * <code>.ResponseAddRecord responseAddRecord = 5;</code>
       */
      public ResponseAddRecord getResponseAddRecord() {
        if (responseAddRecordBuilder_ == null) {
          if (dataBodyCase_ == 5) {
            return (ResponseAddRecord) dataBody_;
          }
          return ResponseAddRecord.getDefaultInstance();
        } else {
          if (dataBodyCase_ == 5) {
            return responseAddRecordBuilder_.getMessage();
          }
          return ResponseAddRecord.getDefaultInstance();
        }
      }
      /**
       * <code>.ResponseAddRecord responseAddRecord = 5;</code>
       */
      public Builder setResponseAddRecord(ResponseAddRecord value) {
        if (responseAddRecordBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          dataBody_ = value;
          onChanged();
        } else {
          responseAddRecordBuilder_.setMessage(value);
        }
        dataBodyCase_ = 5;
        return this;
      }
      /**
       * <code>.ResponseAddRecord responseAddRecord = 5;</code>
       */
      public Builder setResponseAddRecord(
          ResponseAddRecord.Builder builderForValue) {
        if (responseAddRecordBuilder_ == null) {
          dataBody_ = builderForValue.build();
          onChanged();
        } else {
          responseAddRecordBuilder_.setMessage(builderForValue.build());
        }
        dataBodyCase_ = 5;
        return this;
      }
      /**
       * <code>.ResponseAddRecord responseAddRecord = 5;</code>
       */
      public Builder mergeResponseAddRecord(ResponseAddRecord value) {
        if (responseAddRecordBuilder_ == null) {
          if (dataBodyCase_ == 5 &&
              dataBody_ != ResponseAddRecord.getDefaultInstance()) {
            dataBody_ = ResponseAddRecord.newBuilder((ResponseAddRecord) dataBody_)
                .mergeFrom(value).buildPartial();
          } else {
            dataBody_ = value;
          }
          onChanged();
        } else {
          if (dataBodyCase_ == 5) {
            responseAddRecordBuilder_.mergeFrom(value);
          }
          responseAddRecordBuilder_.setMessage(value);
        }
        dataBodyCase_ = 5;
        return this;
      }
      /**
       * <code>.ResponseAddRecord responseAddRecord = 5;</code>
       */
      public Builder clearResponseAddRecord() {
        if (responseAddRecordBuilder_ == null) {
          if (dataBodyCase_ == 5) {
            dataBodyCase_ = 0;
            dataBody_ = null;
            onChanged();
          }
        } else {
          if (dataBodyCase_ == 5) {
            dataBodyCase_ = 0;
            dataBody_ = null;
          }
          responseAddRecordBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>.ResponseAddRecord responseAddRecord = 5;</code>
       */
      public ResponseAddRecord.Builder getResponseAddRecordBuilder() {
        return getResponseAddRecordFieldBuilder().getBuilder();
      }
      /**
       * <code>.ResponseAddRecord responseAddRecord = 5;</code>
       */
      public ResponseAddRecordOrBuilder getResponseAddRecordOrBuilder() {
        if ((dataBodyCase_ == 5) && (responseAddRecordBuilder_ != null)) {
          return responseAddRecordBuilder_.getMessageOrBuilder();
        } else {
          if (dataBodyCase_ == 5) {
            return (ResponseAddRecord) dataBody_;
          }
          return ResponseAddRecord.getDefaultInstance();
        }
      }
      /**
       * <code>.ResponseAddRecord responseAddRecord = 5;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          ResponseAddRecord, ResponseAddRecord.Builder, ResponseAddRecordOrBuilder>
          getResponseAddRecordFieldBuilder() {
        if (responseAddRecordBuilder_ == null) {
          if (!(dataBodyCase_ == 5)) {
            dataBody_ = ResponseAddRecord.getDefaultInstance();
          }
          responseAddRecordBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              ResponseAddRecord, ResponseAddRecord.Builder, ResponseAddRecordOrBuilder>(
                  (ResponseAddRecord) dataBody_,
                  getParentForChildren(),
                  isClean());
          dataBody_ = null;
        }
        dataBodyCase_ = 5;
        onChanged();;
        return responseAddRecordBuilder_;
      }

      private com.google.protobuf.SingleFieldBuilderV3<
          ResponseRemoveRecord, ResponseRemoveRecord.Builder, ResponseRemoveRecordOrBuilder> responseRemoveRecordBuilder_;
      /**
       * <code>.ResponseRemoveRecord responseRemoveRecord = 6;</code>
       */
      public boolean hasResponseRemoveRecord() {
        return dataBodyCase_ == 6;
      }
      /**
       * <code>.ResponseRemoveRecord responseRemoveRecord = 6;</code>
       */
      public ResponseRemoveRecord getResponseRemoveRecord() {
        if (responseRemoveRecordBuilder_ == null) {
          if (dataBodyCase_ == 6) {
            return (ResponseRemoveRecord) dataBody_;
          }
          return ResponseRemoveRecord.getDefaultInstance();
        } else {
          if (dataBodyCase_ == 6) {
            return responseRemoveRecordBuilder_.getMessage();
          }
          return ResponseRemoveRecord.getDefaultInstance();
        }
      }
      /**
       * <code>.ResponseRemoveRecord responseRemoveRecord = 6;</code>
       */
      public Builder setResponseRemoveRecord(ResponseRemoveRecord value) {
        if (responseRemoveRecordBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          dataBody_ = value;
          onChanged();
        } else {
          responseRemoveRecordBuilder_.setMessage(value);
        }
        dataBodyCase_ = 6;
        return this;
      }
      /**
       * <code>.ResponseRemoveRecord responseRemoveRecord = 6;</code>
       */
      public Builder setResponseRemoveRecord(
          ResponseRemoveRecord.Builder builderForValue) {
        if (responseRemoveRecordBuilder_ == null) {
          dataBody_ = builderForValue.build();
          onChanged();
        } else {
          responseRemoveRecordBuilder_.setMessage(builderForValue.build());
        }
        dataBodyCase_ = 6;
        return this;
      }
      /**
       * <code>.ResponseRemoveRecord responseRemoveRecord = 6;</code>
       */
      public Builder mergeResponseRemoveRecord(ResponseRemoveRecord value) {
        if (responseRemoveRecordBuilder_ == null) {
          if (dataBodyCase_ == 6 &&
              dataBody_ != ResponseRemoveRecord.getDefaultInstance()) {
            dataBody_ = ResponseRemoveRecord.newBuilder((ResponseRemoveRecord) dataBody_)
                .mergeFrom(value).buildPartial();
          } else {
            dataBody_ = value;
          }
          onChanged();
        } else {
          if (dataBodyCase_ == 6) {
            responseRemoveRecordBuilder_.mergeFrom(value);
          }
          responseRemoveRecordBuilder_.setMessage(value);
        }
        dataBodyCase_ = 6;
        return this;
      }
      /**
       * <code>.ResponseRemoveRecord responseRemoveRecord = 6;</code>
       */
      public Builder clearResponseRemoveRecord() {
        if (responseRemoveRecordBuilder_ == null) {
          if (dataBodyCase_ == 6) {
            dataBodyCase_ = 0;
            dataBody_ = null;
            onChanged();
          }
        } else {
          if (dataBodyCase_ == 6) {
            dataBodyCase_ = 0;
            dataBody_ = null;
          }
          responseRemoveRecordBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>.ResponseRemoveRecord responseRemoveRecord = 6;</code>
       */
      public ResponseRemoveRecord.Builder getResponseRemoveRecordBuilder() {
        return getResponseRemoveRecordFieldBuilder().getBuilder();
      }
      /**
       * <code>.ResponseRemoveRecord responseRemoveRecord = 6;</code>
       */
      public ResponseRemoveRecordOrBuilder getResponseRemoveRecordOrBuilder() {
        if ((dataBodyCase_ == 6) && (responseRemoveRecordBuilder_ != null)) {
          return responseRemoveRecordBuilder_.getMessageOrBuilder();
        } else {
          if (dataBodyCase_ == 6) {
            return (ResponseRemoveRecord) dataBody_;
          }
          return ResponseRemoveRecord.getDefaultInstance();
        }
      }
      /**
       * <code>.ResponseRemoveRecord responseRemoveRecord = 6;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          ResponseRemoveRecord, ResponseRemoveRecord.Builder, ResponseRemoveRecordOrBuilder>
          getResponseRemoveRecordFieldBuilder() {
        if (responseRemoveRecordBuilder_ == null) {
          if (!(dataBodyCase_ == 6)) {
            dataBody_ = ResponseRemoveRecord.getDefaultInstance();
          }
          responseRemoveRecordBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              ResponseRemoveRecord, ResponseRemoveRecord.Builder, ResponseRemoveRecordOrBuilder>(
                  (ResponseRemoveRecord) dataBody_,
                  getParentForChildren(),
                  isClean());
          dataBody_ = null;
        }
        dataBodyCase_ = 6;
        onChanged();;
        return responseRemoveRecordBuilder_;
      }

      private com.google.protobuf.SingleFieldBuilderV3<
          ResponseAddAccount, ResponseAddAccount.Builder, ResponseAddAccountOrBuilder> responseAddAccountBuilder_;
      /**
       * <code>.ResponseAddAccount responseAddAccount = 7;</code>
       */
      public boolean hasResponseAddAccount() {
        return dataBodyCase_ == 7;
      }
      /**
       * <code>.ResponseAddAccount responseAddAccount = 7;</code>
       */
      public ResponseAddAccount getResponseAddAccount() {
        if (responseAddAccountBuilder_ == null) {
          if (dataBodyCase_ == 7) {
            return (ResponseAddAccount) dataBody_;
          }
          return ResponseAddAccount.getDefaultInstance();
        } else {
          if (dataBodyCase_ == 7) {
            return responseAddAccountBuilder_.getMessage();
          }
          return ResponseAddAccount.getDefaultInstance();
        }
      }
      /**
       * <code>.ResponseAddAccount responseAddAccount = 7;</code>
       */
      public Builder setResponseAddAccount(ResponseAddAccount value) {
        if (responseAddAccountBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          dataBody_ = value;
          onChanged();
        } else {
          responseAddAccountBuilder_.setMessage(value);
        }
        dataBodyCase_ = 7;
        return this;
      }
      /**
       * <code>.ResponseAddAccount responseAddAccount = 7;</code>
       */
      public Builder setResponseAddAccount(
          ResponseAddAccount.Builder builderForValue) {
        if (responseAddAccountBuilder_ == null) {
          dataBody_ = builderForValue.build();
          onChanged();
        } else {
          responseAddAccountBuilder_.setMessage(builderForValue.build());
        }
        dataBodyCase_ = 7;
        return this;
      }
      /**
       * <code>.ResponseAddAccount responseAddAccount = 7;</code>
       */
      public Builder mergeResponseAddAccount(ResponseAddAccount value) {
        if (responseAddAccountBuilder_ == null) {
          if (dataBodyCase_ == 7 &&
              dataBody_ != ResponseAddAccount.getDefaultInstance()) {
            dataBody_ = ResponseAddAccount.newBuilder((ResponseAddAccount) dataBody_)
                .mergeFrom(value).buildPartial();
          } else {
            dataBody_ = value;
          }
          onChanged();
        } else {
          if (dataBodyCase_ == 7) {
            responseAddAccountBuilder_.mergeFrom(value);
          }
          responseAddAccountBuilder_.setMessage(value);
        }
        dataBodyCase_ = 7;
        return this;
      }
      /**
       * <code>.ResponseAddAccount responseAddAccount = 7;</code>
       */
      public Builder clearResponseAddAccount() {
        if (responseAddAccountBuilder_ == null) {
          if (dataBodyCase_ == 7) {
            dataBodyCase_ = 0;
            dataBody_ = null;
            onChanged();
          }
        } else {
          if (dataBodyCase_ == 7) {
            dataBodyCase_ = 0;
            dataBody_ = null;
          }
          responseAddAccountBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>.ResponseAddAccount responseAddAccount = 7;</code>
       */
      public ResponseAddAccount.Builder getResponseAddAccountBuilder() {
        return getResponseAddAccountFieldBuilder().getBuilder();
      }
      /**
       * <code>.ResponseAddAccount responseAddAccount = 7;</code>
       */
      public ResponseAddAccountOrBuilder getResponseAddAccountOrBuilder() {
        if ((dataBodyCase_ == 7) && (responseAddAccountBuilder_ != null)) {
          return responseAddAccountBuilder_.getMessageOrBuilder();
        } else {
          if (dataBodyCase_ == 7) {
            return (ResponseAddAccount) dataBody_;
          }
          return ResponseAddAccount.getDefaultInstance();
        }
      }
      /**
       * <code>.ResponseAddAccount responseAddAccount = 7;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          ResponseAddAccount, ResponseAddAccount.Builder, ResponseAddAccountOrBuilder>
          getResponseAddAccountFieldBuilder() {
        if (responseAddAccountBuilder_ == null) {
          if (!(dataBodyCase_ == 7)) {
            dataBody_ = ResponseAddAccount.getDefaultInstance();
          }
          responseAddAccountBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              ResponseAddAccount, ResponseAddAccount.Builder, ResponseAddAccountOrBuilder>(
                  (ResponseAddAccount) dataBody_,
                  getParentForChildren(),
                  isClean());
          dataBody_ = null;
        }
        dataBodyCase_ = 7;
        onChanged();;
        return responseAddAccountBuilder_;
      }

      private com.google.protobuf.SingleFieldBuilderV3<
          ResponseRemoveAccount, ResponseRemoveAccount.Builder, ResponseRemoveAccountOrBuilder> responseRemoveAccountBuilder_;
      /**
       * <code>.ResponseRemoveAccount responseRemoveAccount = 8;</code>
       */
      public boolean hasResponseRemoveAccount() {
        return dataBodyCase_ == 8;
      }
      /**
       * <code>.ResponseRemoveAccount responseRemoveAccount = 8;</code>
       */
      public ResponseRemoveAccount getResponseRemoveAccount() {
        if (responseRemoveAccountBuilder_ == null) {
          if (dataBodyCase_ == 8) {
            return (ResponseRemoveAccount) dataBody_;
          }
          return ResponseRemoveAccount.getDefaultInstance();
        } else {
          if (dataBodyCase_ == 8) {
            return responseRemoveAccountBuilder_.getMessage();
          }
          return ResponseRemoveAccount.getDefaultInstance();
        }
      }
      /**
       * <code>.ResponseRemoveAccount responseRemoveAccount = 8;</code>
       */
      public Builder setResponseRemoveAccount(ResponseRemoveAccount value) {
        if (responseRemoveAccountBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          dataBody_ = value;
          onChanged();
        } else {
          responseRemoveAccountBuilder_.setMessage(value);
        }
        dataBodyCase_ = 8;
        return this;
      }
      /**
       * <code>.ResponseRemoveAccount responseRemoveAccount = 8;</code>
       */
      public Builder setResponseRemoveAccount(
          ResponseRemoveAccount.Builder builderForValue) {
        if (responseRemoveAccountBuilder_ == null) {
          dataBody_ = builderForValue.build();
          onChanged();
        } else {
          responseRemoveAccountBuilder_.setMessage(builderForValue.build());
        }
        dataBodyCase_ = 8;
        return this;
      }
      /**
       * <code>.ResponseRemoveAccount responseRemoveAccount = 8;</code>
       */
      public Builder mergeResponseRemoveAccount(ResponseRemoveAccount value) {
        if (responseRemoveAccountBuilder_ == null) {
          if (dataBodyCase_ == 8 &&
              dataBody_ != ResponseRemoveAccount.getDefaultInstance()) {
            dataBody_ = ResponseRemoveAccount.newBuilder((ResponseRemoveAccount) dataBody_)
                .mergeFrom(value).buildPartial();
          } else {
            dataBody_ = value;
          }
          onChanged();
        } else {
          if (dataBodyCase_ == 8) {
            responseRemoveAccountBuilder_.mergeFrom(value);
          }
          responseRemoveAccountBuilder_.setMessage(value);
        }
        dataBodyCase_ = 8;
        return this;
      }
      /**
       * <code>.ResponseRemoveAccount responseRemoveAccount = 8;</code>
       */
      public Builder clearResponseRemoveAccount() {
        if (responseRemoveAccountBuilder_ == null) {
          if (dataBodyCase_ == 8) {
            dataBodyCase_ = 0;
            dataBody_ = null;
            onChanged();
          }
        } else {
          if (dataBodyCase_ == 8) {
            dataBodyCase_ = 0;
            dataBody_ = null;
          }
          responseRemoveAccountBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>.ResponseRemoveAccount responseRemoveAccount = 8;</code>
       */
      public ResponseRemoveAccount.Builder getResponseRemoveAccountBuilder() {
        return getResponseRemoveAccountFieldBuilder().getBuilder();
      }
      /**
       * <code>.ResponseRemoveAccount responseRemoveAccount = 8;</code>
       */
      public ResponseRemoveAccountOrBuilder getResponseRemoveAccountOrBuilder() {
        if ((dataBodyCase_ == 8) && (responseRemoveAccountBuilder_ != null)) {
          return responseRemoveAccountBuilder_.getMessageOrBuilder();
        } else {
          if (dataBodyCase_ == 8) {
            return (ResponseRemoveAccount) dataBody_;
          }
          return ResponseRemoveAccount.getDefaultInstance();
        }
      }
      /**
       * <code>.ResponseRemoveAccount responseRemoveAccount = 8;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          ResponseRemoveAccount, ResponseRemoveAccount.Builder, ResponseRemoveAccountOrBuilder>
          getResponseRemoveAccountFieldBuilder() {
        if (responseRemoveAccountBuilder_ == null) {
          if (!(dataBodyCase_ == 8)) {
            dataBody_ = ResponseRemoveAccount.getDefaultInstance();
          }
          responseRemoveAccountBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              ResponseRemoveAccount, ResponseRemoveAccount.Builder, ResponseRemoveAccountOrBuilder>(
                  (ResponseRemoveAccount) dataBody_,
                  getParentForChildren(),
                  isClean());
          dataBody_ = null;
        }
        dataBodyCase_ = 8;
        onChanged();;
        return responseRemoveAccountBuilder_;
      }

      private com.google.protobuf.SingleFieldBuilderV3<
          ResponseGetAccounts, ResponseGetAccounts.Builder, ResponseGetAccountsOrBuilder> responseGetAccountsBuilder_;
      /**
       * <code>.ResponseGetAccounts responseGetAccounts = 9;</code>
       */
      public boolean hasResponseGetAccounts() {
        return dataBodyCase_ == 9;
      }
      /**
       * <code>.ResponseGetAccounts responseGetAccounts = 9;</code>
       */
      public ResponseGetAccounts getResponseGetAccounts() {
        if (responseGetAccountsBuilder_ == null) {
          if (dataBodyCase_ == 9) {
            return (ResponseGetAccounts) dataBody_;
          }
          return ResponseGetAccounts.getDefaultInstance();
        } else {
          if (dataBodyCase_ == 9) {
            return responseGetAccountsBuilder_.getMessage();
          }
          return ResponseGetAccounts.getDefaultInstance();
        }
      }
      /**
       * <code>.ResponseGetAccounts responseGetAccounts = 9;</code>
       */
      public Builder setResponseGetAccounts(ResponseGetAccounts value) {
        if (responseGetAccountsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          dataBody_ = value;
          onChanged();
        } else {
          responseGetAccountsBuilder_.setMessage(value);
        }
        dataBodyCase_ = 9;
        return this;
      }
      /**
       * <code>.ResponseGetAccounts responseGetAccounts = 9;</code>
       */
      public Builder setResponseGetAccounts(
          ResponseGetAccounts.Builder builderForValue) {
        if (responseGetAccountsBuilder_ == null) {
          dataBody_ = builderForValue.build();
          onChanged();
        } else {
          responseGetAccountsBuilder_.setMessage(builderForValue.build());
        }
        dataBodyCase_ = 9;
        return this;
      }
      /**
       * <code>.ResponseGetAccounts responseGetAccounts = 9;</code>
       */
      public Builder mergeResponseGetAccounts(ResponseGetAccounts value) {
        if (responseGetAccountsBuilder_ == null) {
          if (dataBodyCase_ == 9 &&
              dataBody_ != ResponseGetAccounts.getDefaultInstance()) {
            dataBody_ = ResponseGetAccounts.newBuilder((ResponseGetAccounts) dataBody_)
                .mergeFrom(value).buildPartial();
          } else {
            dataBody_ = value;
          }
          onChanged();
        } else {
          if (dataBodyCase_ == 9) {
            responseGetAccountsBuilder_.mergeFrom(value);
          }
          responseGetAccountsBuilder_.setMessage(value);
        }
        dataBodyCase_ = 9;
        return this;
      }
      /**
       * <code>.ResponseGetAccounts responseGetAccounts = 9;</code>
       */
      public Builder clearResponseGetAccounts() {
        if (responseGetAccountsBuilder_ == null) {
          if (dataBodyCase_ == 9) {
            dataBodyCase_ = 0;
            dataBody_ = null;
            onChanged();
          }
        } else {
          if (dataBodyCase_ == 9) {
            dataBodyCase_ = 0;
            dataBody_ = null;
          }
          responseGetAccountsBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>.ResponseGetAccounts responseGetAccounts = 9;</code>
       */
      public ResponseGetAccounts.Builder getResponseGetAccountsBuilder() {
        return getResponseGetAccountsFieldBuilder().getBuilder();
      }
      /**
       * <code>.ResponseGetAccounts responseGetAccounts = 9;</code>
       */
      public ResponseGetAccountsOrBuilder getResponseGetAccountsOrBuilder() {
        if ((dataBodyCase_ == 9) && (responseGetAccountsBuilder_ != null)) {
          return responseGetAccountsBuilder_.getMessageOrBuilder();
        } else {
          if (dataBodyCase_ == 9) {
            return (ResponseGetAccounts) dataBody_;
          }
          return ResponseGetAccounts.getDefaultInstance();
        }
      }
      /**
       * <code>.ResponseGetAccounts responseGetAccounts = 9;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          ResponseGetAccounts, ResponseGetAccounts.Builder, ResponseGetAccountsOrBuilder>
          getResponseGetAccountsFieldBuilder() {
        if (responseGetAccountsBuilder_ == null) {
          if (!(dataBodyCase_ == 9)) {
            dataBody_ = ResponseGetAccounts.getDefaultInstance();
          }
          responseGetAccountsBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              ResponseGetAccounts, ResponseGetAccounts.Builder, ResponseGetAccountsOrBuilder>(
                  (ResponseGetAccounts) dataBody_,
                  getParentForChildren(),
                  isClean());
          dataBody_ = null;
        }
        dataBodyCase_ = 9;
        onChanged();;
        return responseGetAccountsBuilder_;
      }

      private com.google.protobuf.SingleFieldBuilderV3<
          ResponseEditNickname, ResponseEditNickname.Builder, ResponseEditNicknameOrBuilder> responseEditNicknameBuilder_;
      /**
       * <code>.ResponseEditNickname responseEditNickname = 10;</code>
       */
      public boolean hasResponseEditNickname() {
        return dataBodyCase_ == 10;
      }
      /**
       * <code>.ResponseEditNickname responseEditNickname = 10;</code>
       */
      public ResponseEditNickname getResponseEditNickname() {
        if (responseEditNicknameBuilder_ == null) {
          if (dataBodyCase_ == 10) {
            return (ResponseEditNickname) dataBody_;
          }
          return ResponseEditNickname.getDefaultInstance();
        } else {
          if (dataBodyCase_ == 10) {
            return responseEditNicknameBuilder_.getMessage();
          }
          return ResponseEditNickname.getDefaultInstance();
        }
      }
      /**
       * <code>.ResponseEditNickname responseEditNickname = 10;</code>
       */
      public Builder setResponseEditNickname(ResponseEditNickname value) {
        if (responseEditNicknameBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          dataBody_ = value;
          onChanged();
        } else {
          responseEditNicknameBuilder_.setMessage(value);
        }
        dataBodyCase_ = 10;
        return this;
      }
      /**
       * <code>.ResponseEditNickname responseEditNickname = 10;</code>
       */
      public Builder setResponseEditNickname(
          ResponseEditNickname.Builder builderForValue) {
        if (responseEditNicknameBuilder_ == null) {
          dataBody_ = builderForValue.build();
          onChanged();
        } else {
          responseEditNicknameBuilder_.setMessage(builderForValue.build());
        }
        dataBodyCase_ = 10;
        return this;
      }
      /**
       * <code>.ResponseEditNickname responseEditNickname = 10;</code>
       */
      public Builder mergeResponseEditNickname(ResponseEditNickname value) {
        if (responseEditNicknameBuilder_ == null) {
          if (dataBodyCase_ == 10 &&
              dataBody_ != ResponseEditNickname.getDefaultInstance()) {
            dataBody_ = ResponseEditNickname.newBuilder((ResponseEditNickname) dataBody_)
                .mergeFrom(value).buildPartial();
          } else {
            dataBody_ = value;
          }
          onChanged();
        } else {
          if (dataBodyCase_ == 10) {
            responseEditNicknameBuilder_.mergeFrom(value);
          }
          responseEditNicknameBuilder_.setMessage(value);
        }
        dataBodyCase_ = 10;
        return this;
      }
      /**
       * <code>.ResponseEditNickname responseEditNickname = 10;</code>
       */
      public Builder clearResponseEditNickname() {
        if (responseEditNicknameBuilder_ == null) {
          if (dataBodyCase_ == 10) {
            dataBodyCase_ = 0;
            dataBody_ = null;
            onChanged();
          }
        } else {
          if (dataBodyCase_ == 10) {
            dataBodyCase_ = 0;
            dataBody_ = null;
          }
          responseEditNicknameBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>.ResponseEditNickname responseEditNickname = 10;</code>
       */
      public ResponseEditNickname.Builder getResponseEditNicknameBuilder() {
        return getResponseEditNicknameFieldBuilder().getBuilder();
      }
      /**
       * <code>.ResponseEditNickname responseEditNickname = 10;</code>
       */
      public ResponseEditNicknameOrBuilder getResponseEditNicknameOrBuilder() {
        if ((dataBodyCase_ == 10) && (responseEditNicknameBuilder_ != null)) {
          return responseEditNicknameBuilder_.getMessageOrBuilder();
        } else {
          if (dataBodyCase_ == 10) {
            return (ResponseEditNickname) dataBody_;
          }
          return ResponseEditNickname.getDefaultInstance();
        }
      }
      /**
       * <code>.ResponseEditNickname responseEditNickname = 10;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          ResponseEditNickname, ResponseEditNickname.Builder, ResponseEditNicknameOrBuilder>
          getResponseEditNicknameFieldBuilder() {
        if (responseEditNicknameBuilder_ == null) {
          if (!(dataBodyCase_ == 10)) {
            dataBody_ = ResponseEditNickname.getDefaultInstance();
          }
          responseEditNicknameBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              ResponseEditNickname, ResponseEditNickname.Builder, ResponseEditNicknameOrBuilder>(
                  (ResponseEditNickname) dataBody_,
                  getParentForChildren(),
                  isClean());
          dataBody_ = null;
        }
        dataBodyCase_ = 10;
        onChanged();;
        return responseEditNicknameBuilder_;
      }

      private com.google.protobuf.SingleFieldBuilderV3<
          ResponseGetRecords, ResponseGetRecords.Builder, ResponseGetRecordsOrBuilder> responseGetRecordsBuilder_;
      /**
       * <code>.ResponseGetRecords responseGetRecords = 11;</code>
       */
      public boolean hasResponseGetRecords() {
        return dataBodyCase_ == 11;
      }
      /**
       * <code>.ResponseGetRecords responseGetRecords = 11;</code>
       */
      public ResponseGetRecords getResponseGetRecords() {
        if (responseGetRecordsBuilder_ == null) {
          if (dataBodyCase_ == 11) {
            return (ResponseGetRecords) dataBody_;
          }
          return ResponseGetRecords.getDefaultInstance();
        } else {
          if (dataBodyCase_ == 11) {
            return responseGetRecordsBuilder_.getMessage();
          }
          return ResponseGetRecords.getDefaultInstance();
        }
      }
      /**
       * <code>.ResponseGetRecords responseGetRecords = 11;</code>
       */
      public Builder setResponseGetRecords(ResponseGetRecords value) {
        if (responseGetRecordsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          dataBody_ = value;
          onChanged();
        } else {
          responseGetRecordsBuilder_.setMessage(value);
        }
        dataBodyCase_ = 11;
        return this;
      }
      /**
       * <code>.ResponseGetRecords responseGetRecords = 11;</code>
       */
      public Builder setResponseGetRecords(
          ResponseGetRecords.Builder builderForValue) {
        if (responseGetRecordsBuilder_ == null) {
          dataBody_ = builderForValue.build();
          onChanged();
        } else {
          responseGetRecordsBuilder_.setMessage(builderForValue.build());
        }
        dataBodyCase_ = 11;
        return this;
      }
      /**
       * <code>.ResponseGetRecords responseGetRecords = 11;</code>
       */
      public Builder mergeResponseGetRecords(ResponseGetRecords value) {
        if (responseGetRecordsBuilder_ == null) {
          if (dataBodyCase_ == 11 &&
              dataBody_ != ResponseGetRecords.getDefaultInstance()) {
            dataBody_ = ResponseGetRecords.newBuilder((ResponseGetRecords) dataBody_)
                .mergeFrom(value).buildPartial();
          } else {
            dataBody_ = value;
          }
          onChanged();
        } else {
          if (dataBodyCase_ == 11) {
            responseGetRecordsBuilder_.mergeFrom(value);
          }
          responseGetRecordsBuilder_.setMessage(value);
        }
        dataBodyCase_ = 11;
        return this;
      }
      /**
       * <code>.ResponseGetRecords responseGetRecords = 11;</code>
       */
      public Builder clearResponseGetRecords() {
        if (responseGetRecordsBuilder_ == null) {
          if (dataBodyCase_ == 11) {
            dataBodyCase_ = 0;
            dataBody_ = null;
            onChanged();
          }
        } else {
          if (dataBodyCase_ == 11) {
            dataBodyCase_ = 0;
            dataBody_ = null;
          }
          responseGetRecordsBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>.ResponseGetRecords responseGetRecords = 11;</code>
       */
      public ResponseGetRecords.Builder getResponseGetRecordsBuilder() {
        return getResponseGetRecordsFieldBuilder().getBuilder();
      }
      /**
       * <code>.ResponseGetRecords responseGetRecords = 11;</code>
       */
      public ResponseGetRecordsOrBuilder getResponseGetRecordsOrBuilder() {
        if ((dataBodyCase_ == 11) && (responseGetRecordsBuilder_ != null)) {
          return responseGetRecordsBuilder_.getMessageOrBuilder();
        } else {
          if (dataBodyCase_ == 11) {
            return (ResponseGetRecords) dataBody_;
          }
          return ResponseGetRecords.getDefaultInstance();
        }
      }
      /**
       * <code>.ResponseGetRecords responseGetRecords = 11;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          ResponseGetRecords, ResponseGetRecords.Builder, ResponseGetRecordsOrBuilder>
          getResponseGetRecordsFieldBuilder() {
        if (responseGetRecordsBuilder_ == null) {
          if (!(dataBodyCase_ == 11)) {
            dataBody_ = ResponseGetRecords.getDefaultInstance();
          }
          responseGetRecordsBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              ResponseGetRecords, ResponseGetRecords.Builder, ResponseGetRecordsOrBuilder>(
                  (ResponseGetRecords) dataBody_,
                  getParentForChildren(),
                  isClean());
          dataBody_ = null;
        }
        dataBodyCase_ = 11;
        onChanged();;
        return responseGetRecordsBuilder_;
      }

      private int type_ = 0;
      /**
       * <code>.Type type = 12;</code>
       */
      public int getTypeValue() {
        return type_;
      }
      /**
       * <code>.Type type = 12;</code>
       */
      public Builder setTypeValue(int value) {
        type_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>.Type type = 12;</code>
       */
      public Type getType() {
        @SuppressWarnings("deprecation")
        Type result = Type.valueOf(type_);
        return result == null ? Type.UNRECOGNIZED : result;
      }
      /**
       * <code>.Type type = 12;</code>
       */
      public Builder setType(Type value) {
        if (value == null) {
          throw new NullPointerException();
        }
        
        type_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>.Type type = 12;</code>
       */
      public Builder clearType() {
        
        type_ = 0;
        onChanged();
        return this;
      }

      private Object clientId_ = "";
      /**
       * <code>string client_id = 13;</code>
       */
      public String getClientId() {
        Object ref = clientId_;
        if (!(ref instanceof String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          String s = bs.toStringUtf8();
          clientId_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      /**
       * <code>string client_id = 13;</code>
       */
      public com.google.protobuf.ByteString
          getClientIdBytes() {
        Object ref = clientId_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (String) ref);
          clientId_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string client_id = 13;</code>
       */
      public Builder setClientId(
          String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        clientId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string client_id = 13;</code>
       */
      public Builder clearClientId() {
        
        clientId_ = getDefaultInstance().getClientId();
        onChanged();
        return this;
      }
      /**
       * <code>string client_id = 13;</code>
       */
      public Builder setClientIdBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        clientId_ = value;
        onChanged();
        return this;
      }

      private Object tip_ = "";
      /**
       * <code>string tip = 14;</code>
       */
      public String getTip() {
        Object ref = tip_;
        if (!(ref instanceof String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          String s = bs.toStringUtf8();
          tip_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      /**
       * <code>string tip = 14;</code>
       */
      public com.google.protobuf.ByteString
          getTipBytes() {
        Object ref = tip_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (String) ref);
          tip_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string tip = 14;</code>
       */
      public Builder setTip(
          String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        tip_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string tip = 14;</code>
       */
      public Builder clearTip() {
        
        tip_ = getDefaultInstance().getTip();
        onChanged();
        return this;
      }
      /**
       * <code>string tip = 14;</code>
       */
      public Builder setTipBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        tip_ = value;
        onChanged();
        return this;
      }

      private long timestamp_ ;
      /**
       * <code>int64 timestamp = 15;</code>
       */
      public long getTimestamp() {
        return timestamp_;
      }
      /**
       * <code>int64 timestamp = 15;</code>
       */
      public Builder setTimestamp(long value) {
        
        timestamp_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int64 timestamp = 15;</code>
       */
      public Builder clearTimestamp() {
        
        timestamp_ = 0L;
        onChanged();
        return this;
      }

      private int requestId_ ;
      /**
       * <code>int32 request_id = 16;</code>
       */
      public int getRequestId() {
        return requestId_;
      }
      /**
       * <code>int32 request_id = 16;</code>
       */
      public Builder setRequestId(int value) {
        
        requestId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 request_id = 16;</code>
       */
      public Builder clearRequestId() {
        
        requestId_ = 0;
        onChanged();
        return this;
      }
      @Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:Response)
    }

    // @@protoc_insertion_point(class_scope:Response)
    private static final Response DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new Response();
    }

    public static Response getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Response>
        PARSER = new com.google.protobuf.AbstractParser<Response>() {
      @Override
      public Response parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new Response(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<Response> parser() {
      return PARSER;
    }

    @Override
    public com.google.protobuf.Parser<Response> getParserForType() {
      return PARSER;
    }

    @Override
    public Response getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface RequestConnectOrBuilder extends
      // @@protoc_insertion_point(interface_extends:RequestConnect)
      com.google.protobuf.MessageOrBuilder {
  }
  /**
   * Protobuf type {@code RequestConnect}
   */
  public  static final class RequestConnect extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:RequestConnect)
      RequestConnectOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use RequestConnect.newBuilder() to construct.
    private RequestConnect(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private RequestConnect() {
    }

    @Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private RequestConnect(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new NullPointerException();
      }
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
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
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
            e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return CBMessage.internal_static_RequestConnect_descriptor;
    }

    @Override
    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return CBMessage.internal_static_RequestConnect_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              RequestConnect.class, Builder.class);
    }

    private byte memoizedIsInitialized = -1;
    @Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      unknownFields.writeTo(output);
    }

    @Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @Override
    public boolean equals(final Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof RequestConnect)) {
        return super.equals(obj);
      }
      RequestConnect other = (RequestConnect) obj;

      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static RequestConnect parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static RequestConnect parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static RequestConnect parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static RequestConnect parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static RequestConnect parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static RequestConnect parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static RequestConnect parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static RequestConnect parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static RequestConnect parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static RequestConnect parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static RequestConnect parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static RequestConnect parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(RequestConnect prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @Override
    protected Builder newBuilderForType(
        BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code RequestConnect}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:RequestConnect)
        RequestConnectOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return CBMessage.internal_static_RequestConnect_descriptor;
      }

      @Override
      protected FieldAccessorTable
          internalGetFieldAccessorTable() {
        return CBMessage.internal_static_RequestConnect_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                RequestConnect.class, Builder.class);
      }

      // Construct using CBMessage.RequestConnect.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      @Override
      public Builder clear() {
        super.clear();
        return this;
      }

      @Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return CBMessage.internal_static_RequestConnect_descriptor;
      }

      @Override
      public RequestConnect getDefaultInstanceForType() {
        return RequestConnect.getDefaultInstance();
      }

      @Override
      public RequestConnect build() {
        RequestConnect result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @Override
      public RequestConnect buildPartial() {
        RequestConnect result = new RequestConnect(this);
        onBuilt();
        return result;
      }

      @Override
      public Builder clone() {
        return super.clone();
      }
      @Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return super.setField(field, value);
      }
      @Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return super.addRepeatedField(field, value);
      }
      @Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof RequestConnect) {
          return mergeFrom((RequestConnect)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(RequestConnect other) {
        if (other == RequestConnect.getDefaultInstance()) return this;
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @Override
      public final boolean isInitialized() {
        return true;
      }

      @Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        RequestConnect parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (RequestConnect) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      @Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:RequestConnect)
    }

    // @@protoc_insertion_point(class_scope:RequestConnect)
    private static final RequestConnect DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new RequestConnect();
    }

    public static RequestConnect getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<RequestConnect>
        PARSER = new com.google.protobuf.AbstractParser<RequestConnect>() {
      @Override
      public RequestConnect parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new RequestConnect(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<RequestConnect> parser() {
      return PARSER;
    }

    @Override
    public com.google.protobuf.Parser<RequestConnect> getParserForType() {
      return PARSER;
    }

    @Override
    public RequestConnect getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface ResponseConnectOrBuilder extends
      // @@protoc_insertion_point(interface_extends:ResponseConnect)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>bool result = 1;</code>
     */
    boolean getResult();

    /**
     * <code>string words = 2;</code>
     */
    String getWords();
    /**
     * <code>string words = 2;</code>
     */
    com.google.protobuf.ByteString
        getWordsBytes();
  }
  /**
   * Protobuf type {@code ResponseConnect}
   */
  public  static final class ResponseConnect extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:ResponseConnect)
      ResponseConnectOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ResponseConnect.newBuilder() to construct.
    private ResponseConnect(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ResponseConnect() {
      words_ = "";
    }

    @Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private ResponseConnect(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new NullPointerException();
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
            case 8: {

              result_ = input.readBool();
              break;
            }
            case 18: {
              String s = input.readStringRequireUtf8();

              words_ = s;
              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
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
            e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return CBMessage.internal_static_ResponseConnect_descriptor;
    }

    @Override
    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return CBMessage.internal_static_ResponseConnect_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ResponseConnect.class, Builder.class);
    }

    public static final int RESULT_FIELD_NUMBER = 1;
    private boolean result_;
    /**
     * <code>bool result = 1;</code>
     */
    public boolean getResult() {
      return result_;
    }

    public static final int WORDS_FIELD_NUMBER = 2;
    private volatile Object words_;
    /**
     * <code>string words = 2;</code>
     */
    public String getWords() {
      Object ref = words_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        words_ = s;
        return s;
      }
    }
    /**
     * <code>string words = 2;</code>
     */
    public com.google.protobuf.ByteString
        getWordsBytes() {
      Object ref = words_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        words_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    private byte memoizedIsInitialized = -1;
    @Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (result_ != false) {
        output.writeBool(1, result_);
      }
      if (!getWordsBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, words_);
      }
      unknownFields.writeTo(output);
    }

    @Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (result_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(1, result_);
      }
      if (!getWordsBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, words_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @Override
    public boolean equals(final Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof ResponseConnect)) {
        return super.equals(obj);
      }
      ResponseConnect other = (ResponseConnect) obj;

      if (getResult()
          != other.getResult()) return false;
      if (!getWords()
          .equals(other.getWords())) return false;
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + RESULT_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getResult());
      hash = (37 * hash) + WORDS_FIELD_NUMBER;
      hash = (53 * hash) + getWords().hashCode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static ResponseConnect parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static ResponseConnect parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static ResponseConnect parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static ResponseConnect parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static ResponseConnect parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static ResponseConnect parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static ResponseConnect parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static ResponseConnect parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static ResponseConnect parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static ResponseConnect parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static ResponseConnect parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static ResponseConnect parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(ResponseConnect prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @Override
    protected Builder newBuilderForType(
        BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code ResponseConnect}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:ResponseConnect)
        ResponseConnectOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return CBMessage.internal_static_ResponseConnect_descriptor;
      }

      @Override
      protected FieldAccessorTable
          internalGetFieldAccessorTable() {
        return CBMessage.internal_static_ResponseConnect_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                ResponseConnect.class, Builder.class);
      }

      // Construct using CBMessage.ResponseConnect.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      @Override
      public Builder clear() {
        super.clear();
        result_ = false;

        words_ = "";

        return this;
      }

      @Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return CBMessage.internal_static_ResponseConnect_descriptor;
      }

      @Override
      public ResponseConnect getDefaultInstanceForType() {
        return ResponseConnect.getDefaultInstance();
      }

      @Override
      public ResponseConnect build() {
        ResponseConnect result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @Override
      public ResponseConnect buildPartial() {
        ResponseConnect result = new ResponseConnect(this);
        result.result_ = result_;
        result.words_ = words_;
        onBuilt();
        return result;
      }

      @Override
      public Builder clone() {
        return super.clone();
      }
      @Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return super.setField(field, value);
      }
      @Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return super.addRepeatedField(field, value);
      }
      @Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof ResponseConnect) {
          return mergeFrom((ResponseConnect)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(ResponseConnect other) {
        if (other == ResponseConnect.getDefaultInstance()) return this;
        if (other.getResult() != false) {
          setResult(other.getResult());
        }
        if (!other.getWords().isEmpty()) {
          words_ = other.words_;
          onChanged();
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @Override
      public final boolean isInitialized() {
        return true;
      }

      @Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        ResponseConnect parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (ResponseConnect) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private boolean result_ ;
      /**
       * <code>bool result = 1;</code>
       */
      public boolean getResult() {
        return result_;
      }
      /**
       * <code>bool result = 1;</code>
       */
      public Builder setResult(boolean value) {
        
        result_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool result = 1;</code>
       */
      public Builder clearResult() {
        
        result_ = false;
        onChanged();
        return this;
      }

      private Object words_ = "";
      /**
       * <code>string words = 2;</code>
       */
      public String getWords() {
        Object ref = words_;
        if (!(ref instanceof String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          String s = bs.toStringUtf8();
          words_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      /**
       * <code>string words = 2;</code>
       */
      public com.google.protobuf.ByteString
          getWordsBytes() {
        Object ref = words_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (String) ref);
          words_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string words = 2;</code>
       */
      public Builder setWords(
          String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        words_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string words = 2;</code>
       */
      public Builder clearWords() {
        
        words_ = getDefaultInstance().getWords();
        onChanged();
        return this;
      }
      /**
       * <code>string words = 2;</code>
       */
      public Builder setWordsBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        words_ = value;
        onChanged();
        return this;
      }
      @Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:ResponseConnect)
    }

    // @@protoc_insertion_point(class_scope:ResponseConnect)
    private static final ResponseConnect DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new ResponseConnect();
    }

    public static ResponseConnect getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ResponseConnect>
        PARSER = new com.google.protobuf.AbstractParser<ResponseConnect>() {
      @Override
      public ResponseConnect parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new ResponseConnect(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<ResponseConnect> parser() {
      return PARSER;
    }

    @Override
    public com.google.protobuf.Parser<ResponseConnect> getParserForType() {
      return PARSER;
    }

    @Override
    public ResponseConnect getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface RequestHeartbeatOrBuilder extends
      // @@protoc_insertion_point(interface_extends:RequestHeartbeat)
      com.google.protobuf.MessageOrBuilder {
  }
  /**
   * Protobuf type {@code RequestHeartbeat}
   */
  public  static final class RequestHeartbeat extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:RequestHeartbeat)
      RequestHeartbeatOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use RequestHeartbeat.newBuilder() to construct.
    private RequestHeartbeat(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private RequestHeartbeat() {
    }

    @Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private RequestHeartbeat(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new NullPointerException();
      }
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
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
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
            e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return CBMessage.internal_static_RequestHeartbeat_descriptor;
    }

    @Override
    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return CBMessage.internal_static_RequestHeartbeat_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              RequestHeartbeat.class, Builder.class);
    }

    private byte memoizedIsInitialized = -1;
    @Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      unknownFields.writeTo(output);
    }

    @Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @Override
    public boolean equals(final Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof RequestHeartbeat)) {
        return super.equals(obj);
      }
      RequestHeartbeat other = (RequestHeartbeat) obj;

      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static RequestHeartbeat parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static RequestHeartbeat parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static RequestHeartbeat parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static RequestHeartbeat parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static RequestHeartbeat parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static RequestHeartbeat parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static RequestHeartbeat parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static RequestHeartbeat parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static RequestHeartbeat parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static RequestHeartbeat parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static RequestHeartbeat parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static RequestHeartbeat parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(RequestHeartbeat prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @Override
    protected Builder newBuilderForType(
        BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code RequestHeartbeat}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:RequestHeartbeat)
        RequestHeartbeatOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return CBMessage.internal_static_RequestHeartbeat_descriptor;
      }

      @Override
      protected FieldAccessorTable
          internalGetFieldAccessorTable() {
        return CBMessage.internal_static_RequestHeartbeat_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                RequestHeartbeat.class, Builder.class);
      }

      // Construct using CBMessage.RequestHeartbeat.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      @Override
      public Builder clear() {
        super.clear();
        return this;
      }

      @Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return CBMessage.internal_static_RequestHeartbeat_descriptor;
      }

      @Override
      public RequestHeartbeat getDefaultInstanceForType() {
        return RequestHeartbeat.getDefaultInstance();
      }

      @Override
      public RequestHeartbeat build() {
        RequestHeartbeat result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @Override
      public RequestHeartbeat buildPartial() {
        RequestHeartbeat result = new RequestHeartbeat(this);
        onBuilt();
        return result;
      }

      @Override
      public Builder clone() {
        return super.clone();
      }
      @Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return super.setField(field, value);
      }
      @Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return super.addRepeatedField(field, value);
      }
      @Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof RequestHeartbeat) {
          return mergeFrom((RequestHeartbeat)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(RequestHeartbeat other) {
        if (other == RequestHeartbeat.getDefaultInstance()) return this;
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @Override
      public final boolean isInitialized() {
        return true;
      }

      @Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        RequestHeartbeat parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (RequestHeartbeat) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      @Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:RequestHeartbeat)
    }

    // @@protoc_insertion_point(class_scope:RequestHeartbeat)
    private static final RequestHeartbeat DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new RequestHeartbeat();
    }

    public static RequestHeartbeat getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<RequestHeartbeat>
        PARSER = new com.google.protobuf.AbstractParser<RequestHeartbeat>() {
      @Override
      public RequestHeartbeat parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new RequestHeartbeat(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<RequestHeartbeat> parser() {
      return PARSER;
    }

    @Override
    public com.google.protobuf.Parser<RequestHeartbeat> getParserForType() {
      return PARSER;
    }

    @Override
    public RequestHeartbeat getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface ResponseHeartbeatOrBuilder extends
      // @@protoc_insertion_point(interface_extends:ResponseHeartbeat)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>bool result = 1;</code>
     */
    boolean getResult();

    /**
     * <code>string words = 2;</code>
     */
    String getWords();
    /**
     * <code>string words = 2;</code>
     */
    com.google.protobuf.ByteString
        getWordsBytes();
  }
  /**
   * Protobuf type {@code ResponseHeartbeat}
   */
  public  static final class ResponseHeartbeat extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:ResponseHeartbeat)
      ResponseHeartbeatOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ResponseHeartbeat.newBuilder() to construct.
    private ResponseHeartbeat(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ResponseHeartbeat() {
      words_ = "";
    }

    @Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private ResponseHeartbeat(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new NullPointerException();
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
            case 8: {

              result_ = input.readBool();
              break;
            }
            case 18: {
              String s = input.readStringRequireUtf8();

              words_ = s;
              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
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
            e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return CBMessage.internal_static_ResponseHeartbeat_descriptor;
    }

    @Override
    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return CBMessage.internal_static_ResponseHeartbeat_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ResponseHeartbeat.class, Builder.class);
    }

    public static final int RESULT_FIELD_NUMBER = 1;
    private boolean result_;
    /**
     * <code>bool result = 1;</code>
     */
    public boolean getResult() {
      return result_;
    }

    public static final int WORDS_FIELD_NUMBER = 2;
    private volatile Object words_;
    /**
     * <code>string words = 2;</code>
     */
    public String getWords() {
      Object ref = words_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        words_ = s;
        return s;
      }
    }
    /**
     * <code>string words = 2;</code>
     */
    public com.google.protobuf.ByteString
        getWordsBytes() {
      Object ref = words_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        words_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    private byte memoizedIsInitialized = -1;
    @Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (result_ != false) {
        output.writeBool(1, result_);
      }
      if (!getWordsBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, words_);
      }
      unknownFields.writeTo(output);
    }

    @Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (result_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(1, result_);
      }
      if (!getWordsBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, words_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @Override
    public boolean equals(final Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof ResponseHeartbeat)) {
        return super.equals(obj);
      }
      ResponseHeartbeat other = (ResponseHeartbeat) obj;

      if (getResult()
          != other.getResult()) return false;
      if (!getWords()
          .equals(other.getWords())) return false;
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + RESULT_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getResult());
      hash = (37 * hash) + WORDS_FIELD_NUMBER;
      hash = (53 * hash) + getWords().hashCode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static ResponseHeartbeat parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static ResponseHeartbeat parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static ResponseHeartbeat parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static ResponseHeartbeat parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static ResponseHeartbeat parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static ResponseHeartbeat parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static ResponseHeartbeat parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static ResponseHeartbeat parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static ResponseHeartbeat parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static ResponseHeartbeat parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static ResponseHeartbeat parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static ResponseHeartbeat parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(ResponseHeartbeat prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @Override
    protected Builder newBuilderForType(
        BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code ResponseHeartbeat}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:ResponseHeartbeat)
        ResponseHeartbeatOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return CBMessage.internal_static_ResponseHeartbeat_descriptor;
      }

      @Override
      protected FieldAccessorTable
          internalGetFieldAccessorTable() {
        return CBMessage.internal_static_ResponseHeartbeat_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                ResponseHeartbeat.class, Builder.class);
      }

      // Construct using CBMessage.ResponseHeartbeat.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      @Override
      public Builder clear() {
        super.clear();
        result_ = false;

        words_ = "";

        return this;
      }

      @Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return CBMessage.internal_static_ResponseHeartbeat_descriptor;
      }

      @Override
      public ResponseHeartbeat getDefaultInstanceForType() {
        return ResponseHeartbeat.getDefaultInstance();
      }

      @Override
      public ResponseHeartbeat build() {
        ResponseHeartbeat result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @Override
      public ResponseHeartbeat buildPartial() {
        ResponseHeartbeat result = new ResponseHeartbeat(this);
        result.result_ = result_;
        result.words_ = words_;
        onBuilt();
        return result;
      }

      @Override
      public Builder clone() {
        return super.clone();
      }
      @Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return super.setField(field, value);
      }
      @Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return super.addRepeatedField(field, value);
      }
      @Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof ResponseHeartbeat) {
          return mergeFrom((ResponseHeartbeat)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(ResponseHeartbeat other) {
        if (other == ResponseHeartbeat.getDefaultInstance()) return this;
        if (other.getResult() != false) {
          setResult(other.getResult());
        }
        if (!other.getWords().isEmpty()) {
          words_ = other.words_;
          onChanged();
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @Override
      public final boolean isInitialized() {
        return true;
      }

      @Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        ResponseHeartbeat parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (ResponseHeartbeat) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private boolean result_ ;
      /**
       * <code>bool result = 1;</code>
       */
      public boolean getResult() {
        return result_;
      }
      /**
       * <code>bool result = 1;</code>
       */
      public Builder setResult(boolean value) {
        
        result_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool result = 1;</code>
       */
      public Builder clearResult() {
        
        result_ = false;
        onChanged();
        return this;
      }

      private Object words_ = "";
      /**
       * <code>string words = 2;</code>
       */
      public String getWords() {
        Object ref = words_;
        if (!(ref instanceof String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          String s = bs.toStringUtf8();
          words_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      /**
       * <code>string words = 2;</code>
       */
      public com.google.protobuf.ByteString
          getWordsBytes() {
        Object ref = words_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (String) ref);
          words_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string words = 2;</code>
       */
      public Builder setWords(
          String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        words_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string words = 2;</code>
       */
      public Builder clearWords() {
        
        words_ = getDefaultInstance().getWords();
        onChanged();
        return this;
      }
      /**
       * <code>string words = 2;</code>
       */
      public Builder setWordsBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        words_ = value;
        onChanged();
        return this;
      }
      @Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:ResponseHeartbeat)
    }

    // @@protoc_insertion_point(class_scope:ResponseHeartbeat)
    private static final ResponseHeartbeat DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new ResponseHeartbeat();
    }

    public static ResponseHeartbeat getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ResponseHeartbeat>
        PARSER = new com.google.protobuf.AbstractParser<ResponseHeartbeat>() {
      @Override
      public ResponseHeartbeat parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new ResponseHeartbeat(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<ResponseHeartbeat> parser() {
      return PARSER;
    }

    @Override
    public com.google.protobuf.Parser<ResponseHeartbeat> getParserForType() {
      return PARSER;
    }

    @Override
    public ResponseHeartbeat getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface RequestCreateGroupOrBuilder extends
      // @@protoc_insertion_point(interface_extends:RequestCreateGroup)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>string groupname = 1;</code>
     */
    String getGroupname();
    /**
     * <code>string groupname = 1;</code>
     */
    com.google.protobuf.ByteString
        getGroupnameBytes();

    /**
     * <code>string admin_username = 2;</code>
     */
    String getAdminUsername();
    /**
     * <code>string admin_username = 2;</code>
     */
    com.google.protobuf.ByteString
        getAdminUsernameBytes();

    /**
     * <code>string admin_password = 3;</code>
     */
    String getAdminPassword();
    /**
     * <code>string admin_password = 3;</code>
     */
    com.google.protobuf.ByteString
        getAdminPasswordBytes();

    /**
     * <code>string admin_nickname = 4;</code>
     */
    String getAdminNickname();
    /**
     * <code>string admin_nickname = 4;</code>
     */
    com.google.protobuf.ByteString
        getAdminNicknameBytes();
  }
  /**
   * Protobuf type {@code RequestCreateGroup}
   */
  public  static final class RequestCreateGroup extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:RequestCreateGroup)
      RequestCreateGroupOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use RequestCreateGroup.newBuilder() to construct.
    private RequestCreateGroup(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private RequestCreateGroup() {
      groupname_ = "";
      adminUsername_ = "";
      adminPassword_ = "";
      adminNickname_ = "";
    }

    @Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private RequestCreateGroup(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new NullPointerException();
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
            case 10: {
              String s = input.readStringRequireUtf8();

              groupname_ = s;
              break;
            }
            case 18: {
              String s = input.readStringRequireUtf8();

              adminUsername_ = s;
              break;
            }
            case 26: {
              String s = input.readStringRequireUtf8();

              adminPassword_ = s;
              break;
            }
            case 34: {
              String s = input.readStringRequireUtf8();

              adminNickname_ = s;
              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
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
            e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return CBMessage.internal_static_RequestCreateGroup_descriptor;
    }

    @Override
    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return CBMessage.internal_static_RequestCreateGroup_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              RequestCreateGroup.class, Builder.class);
    }

    public static final int GROUPNAME_FIELD_NUMBER = 1;
    private volatile Object groupname_;
    /**
     * <code>string groupname = 1;</code>
     */
    public String getGroupname() {
      Object ref = groupname_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        groupname_ = s;
        return s;
      }
    }
    /**
     * <code>string groupname = 1;</code>
     */
    public com.google.protobuf.ByteString
        getGroupnameBytes() {
      Object ref = groupname_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        groupname_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int ADMIN_USERNAME_FIELD_NUMBER = 2;
    private volatile Object adminUsername_;
    /**
     * <code>string admin_username = 2;</code>
     */
    public String getAdminUsername() {
      Object ref = adminUsername_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        adminUsername_ = s;
        return s;
      }
    }
    /**
     * <code>string admin_username = 2;</code>
     */
    public com.google.protobuf.ByteString
        getAdminUsernameBytes() {
      Object ref = adminUsername_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        adminUsername_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int ADMIN_PASSWORD_FIELD_NUMBER = 3;
    private volatile Object adminPassword_;
    /**
     * <code>string admin_password = 3;</code>
     */
    public String getAdminPassword() {
      Object ref = adminPassword_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        adminPassword_ = s;
        return s;
      }
    }
    /**
     * <code>string admin_password = 3;</code>
     */
    public com.google.protobuf.ByteString
        getAdminPasswordBytes() {
      Object ref = adminPassword_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        adminPassword_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int ADMIN_NICKNAME_FIELD_NUMBER = 4;
    private volatile Object adminNickname_;
    /**
     * <code>string admin_nickname = 4;</code>
     */
    public String getAdminNickname() {
      Object ref = adminNickname_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        adminNickname_ = s;
        return s;
      }
    }
    /**
     * <code>string admin_nickname = 4;</code>
     */
    public com.google.protobuf.ByteString
        getAdminNicknameBytes() {
      Object ref = adminNickname_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        adminNickname_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    private byte memoizedIsInitialized = -1;
    @Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (!getGroupnameBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, groupname_);
      }
      if (!getAdminUsernameBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, adminUsername_);
      }
      if (!getAdminPasswordBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 3, adminPassword_);
      }
      if (!getAdminNicknameBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 4, adminNickname_);
      }
      unknownFields.writeTo(output);
    }

    @Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!getGroupnameBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, groupname_);
      }
      if (!getAdminUsernameBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, adminUsername_);
      }
      if (!getAdminPasswordBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, adminPassword_);
      }
      if (!getAdminNicknameBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, adminNickname_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @Override
    public boolean equals(final Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof RequestCreateGroup)) {
        return super.equals(obj);
      }
      RequestCreateGroup other = (RequestCreateGroup) obj;

      if (!getGroupname()
          .equals(other.getGroupname())) return false;
      if (!getAdminUsername()
          .equals(other.getAdminUsername())) return false;
      if (!getAdminPassword()
          .equals(other.getAdminPassword())) return false;
      if (!getAdminNickname()
          .equals(other.getAdminNickname())) return false;
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + GROUPNAME_FIELD_NUMBER;
      hash = (53 * hash) + getGroupname().hashCode();
      hash = (37 * hash) + ADMIN_USERNAME_FIELD_NUMBER;
      hash = (53 * hash) + getAdminUsername().hashCode();
      hash = (37 * hash) + ADMIN_PASSWORD_FIELD_NUMBER;
      hash = (53 * hash) + getAdminPassword().hashCode();
      hash = (37 * hash) + ADMIN_NICKNAME_FIELD_NUMBER;
      hash = (53 * hash) + getAdminNickname().hashCode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static RequestCreateGroup parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static RequestCreateGroup parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static RequestCreateGroup parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static RequestCreateGroup parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static RequestCreateGroup parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static RequestCreateGroup parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static RequestCreateGroup parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static RequestCreateGroup parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static RequestCreateGroup parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static RequestCreateGroup parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static RequestCreateGroup parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static RequestCreateGroup parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(RequestCreateGroup prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @Override
    protected Builder newBuilderForType(
        BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code RequestCreateGroup}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:RequestCreateGroup)
        RequestCreateGroupOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return CBMessage.internal_static_RequestCreateGroup_descriptor;
      }

      @Override
      protected FieldAccessorTable
          internalGetFieldAccessorTable() {
        return CBMessage.internal_static_RequestCreateGroup_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                RequestCreateGroup.class, Builder.class);
      }

      // Construct using CBMessage.RequestCreateGroup.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      @Override
      public Builder clear() {
        super.clear();
        groupname_ = "";

        adminUsername_ = "";

        adminPassword_ = "";

        adminNickname_ = "";

        return this;
      }

      @Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return CBMessage.internal_static_RequestCreateGroup_descriptor;
      }

      @Override
      public RequestCreateGroup getDefaultInstanceForType() {
        return RequestCreateGroup.getDefaultInstance();
      }

      @Override
      public RequestCreateGroup build() {
        RequestCreateGroup result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @Override
      public RequestCreateGroup buildPartial() {
        RequestCreateGroup result = new RequestCreateGroup(this);
        result.groupname_ = groupname_;
        result.adminUsername_ = adminUsername_;
        result.adminPassword_ = adminPassword_;
        result.adminNickname_ = adminNickname_;
        onBuilt();
        return result;
      }

      @Override
      public Builder clone() {
        return super.clone();
      }
      @Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return super.setField(field, value);
      }
      @Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return super.addRepeatedField(field, value);
      }
      @Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof RequestCreateGroup) {
          return mergeFrom((RequestCreateGroup)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(RequestCreateGroup other) {
        if (other == RequestCreateGroup.getDefaultInstance()) return this;
        if (!other.getGroupname().isEmpty()) {
          groupname_ = other.groupname_;
          onChanged();
        }
        if (!other.getAdminUsername().isEmpty()) {
          adminUsername_ = other.adminUsername_;
          onChanged();
        }
        if (!other.getAdminPassword().isEmpty()) {
          adminPassword_ = other.adminPassword_;
          onChanged();
        }
        if (!other.getAdminNickname().isEmpty()) {
          adminNickname_ = other.adminNickname_;
          onChanged();
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @Override
      public final boolean isInitialized() {
        return true;
      }

      @Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        RequestCreateGroup parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (RequestCreateGroup) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private Object groupname_ = "";
      /**
       * <code>string groupname = 1;</code>
       */
      public String getGroupname() {
        Object ref = groupname_;
        if (!(ref instanceof String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          String s = bs.toStringUtf8();
          groupname_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      /**
       * <code>string groupname = 1;</code>
       */
      public com.google.protobuf.ByteString
          getGroupnameBytes() {
        Object ref = groupname_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (String) ref);
          groupname_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string groupname = 1;</code>
       */
      public Builder setGroupname(
          String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        groupname_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string groupname = 1;</code>
       */
      public Builder clearGroupname() {
        
        groupname_ = getDefaultInstance().getGroupname();
        onChanged();
        return this;
      }
      /**
       * <code>string groupname = 1;</code>
       */
      public Builder setGroupnameBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        groupname_ = value;
        onChanged();
        return this;
      }

      private Object adminUsername_ = "";
      /**
       * <code>string admin_username = 2;</code>
       */
      public String getAdminUsername() {
        Object ref = adminUsername_;
        if (!(ref instanceof String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          String s = bs.toStringUtf8();
          adminUsername_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      /**
       * <code>string admin_username = 2;</code>
       */
      public com.google.protobuf.ByteString
          getAdminUsernameBytes() {
        Object ref = adminUsername_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (String) ref);
          adminUsername_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string admin_username = 2;</code>
       */
      public Builder setAdminUsername(
          String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        adminUsername_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string admin_username = 2;</code>
       */
      public Builder clearAdminUsername() {
        
        adminUsername_ = getDefaultInstance().getAdminUsername();
        onChanged();
        return this;
      }
      /**
       * <code>string admin_username = 2;</code>
       */
      public Builder setAdminUsernameBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        adminUsername_ = value;
        onChanged();
        return this;
      }

      private Object adminPassword_ = "";
      /**
       * <code>string admin_password = 3;</code>
       */
      public String getAdminPassword() {
        Object ref = adminPassword_;
        if (!(ref instanceof String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          String s = bs.toStringUtf8();
          adminPassword_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      /**
       * <code>string admin_password = 3;</code>
       */
      public com.google.protobuf.ByteString
          getAdminPasswordBytes() {
        Object ref = adminPassword_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (String) ref);
          adminPassword_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string admin_password = 3;</code>
       */
      public Builder setAdminPassword(
          String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        adminPassword_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string admin_password = 3;</code>
       */
      public Builder clearAdminPassword() {
        
        adminPassword_ = getDefaultInstance().getAdminPassword();
        onChanged();
        return this;
      }
      /**
       * <code>string admin_password = 3;</code>
       */
      public Builder setAdminPasswordBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        adminPassword_ = value;
        onChanged();
        return this;
      }

      private Object adminNickname_ = "";
      /**
       * <code>string admin_nickname = 4;</code>
       */
      public String getAdminNickname() {
        Object ref = adminNickname_;
        if (!(ref instanceof String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          String s = bs.toStringUtf8();
          adminNickname_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      /**
       * <code>string admin_nickname = 4;</code>
       */
      public com.google.protobuf.ByteString
          getAdminNicknameBytes() {
        Object ref = adminNickname_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (String) ref);
          adminNickname_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string admin_nickname = 4;</code>
       */
      public Builder setAdminNickname(
          String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        adminNickname_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string admin_nickname = 4;</code>
       */
      public Builder clearAdminNickname() {
        
        adminNickname_ = getDefaultInstance().getAdminNickname();
        onChanged();
        return this;
      }
      /**
       * <code>string admin_nickname = 4;</code>
       */
      public Builder setAdminNicknameBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        adminNickname_ = value;
        onChanged();
        return this;
      }
      @Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:RequestCreateGroup)
    }

    // @@protoc_insertion_point(class_scope:RequestCreateGroup)
    private static final RequestCreateGroup DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new RequestCreateGroup();
    }

    public static RequestCreateGroup getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<RequestCreateGroup>
        PARSER = new com.google.protobuf.AbstractParser<RequestCreateGroup>() {
      @Override
      public RequestCreateGroup parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new RequestCreateGroup(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<RequestCreateGroup> parser() {
      return PARSER;
    }

    @Override
    public com.google.protobuf.Parser<RequestCreateGroup> getParserForType() {
      return PARSER;
    }

    @Override
    public RequestCreateGroup getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface ResponseCreateGroupOrBuilder extends
      // @@protoc_insertion_point(interface_extends:ResponseCreateGroup)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>bool result = 1;</code>
     */
    boolean getResult();

    /**
     * <code>string words = 2;</code>
     */
    String getWords();
    /**
     * <code>string words = 2;</code>
     */
    com.google.protobuf.ByteString
        getWordsBytes();
  }
  /**
   * Protobuf type {@code ResponseCreateGroup}
   */
  public  static final class ResponseCreateGroup extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:ResponseCreateGroup)
      ResponseCreateGroupOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ResponseCreateGroup.newBuilder() to construct.
    private ResponseCreateGroup(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ResponseCreateGroup() {
      words_ = "";
    }

    @Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private ResponseCreateGroup(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new NullPointerException();
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
            case 8: {

              result_ = input.readBool();
              break;
            }
            case 18: {
              String s = input.readStringRequireUtf8();

              words_ = s;
              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
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
            e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return CBMessage.internal_static_ResponseCreateGroup_descriptor;
    }

    @Override
    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return CBMessage.internal_static_ResponseCreateGroup_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ResponseCreateGroup.class, Builder.class);
    }

    public static final int RESULT_FIELD_NUMBER = 1;
    private boolean result_;
    /**
     * <code>bool result = 1;</code>
     */
    public boolean getResult() {
      return result_;
    }

    public static final int WORDS_FIELD_NUMBER = 2;
    private volatile Object words_;
    /**
     * <code>string words = 2;</code>
     */
    public String getWords() {
      Object ref = words_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        words_ = s;
        return s;
      }
    }
    /**
     * <code>string words = 2;</code>
     */
    public com.google.protobuf.ByteString
        getWordsBytes() {
      Object ref = words_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        words_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    private byte memoizedIsInitialized = -1;
    @Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (result_ != false) {
        output.writeBool(1, result_);
      }
      if (!getWordsBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, words_);
      }
      unknownFields.writeTo(output);
    }

    @Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (result_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(1, result_);
      }
      if (!getWordsBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, words_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @Override
    public boolean equals(final Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof ResponseCreateGroup)) {
        return super.equals(obj);
      }
      ResponseCreateGroup other = (ResponseCreateGroup) obj;

      if (getResult()
          != other.getResult()) return false;
      if (!getWords()
          .equals(other.getWords())) return false;
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + RESULT_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getResult());
      hash = (37 * hash) + WORDS_FIELD_NUMBER;
      hash = (53 * hash) + getWords().hashCode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static ResponseCreateGroup parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static ResponseCreateGroup parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static ResponseCreateGroup parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static ResponseCreateGroup parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static ResponseCreateGroup parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static ResponseCreateGroup parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static ResponseCreateGroup parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static ResponseCreateGroup parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static ResponseCreateGroup parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static ResponseCreateGroup parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static ResponseCreateGroup parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static ResponseCreateGroup parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(ResponseCreateGroup prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @Override
    protected Builder newBuilderForType(
        BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code ResponseCreateGroup}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:ResponseCreateGroup)
        ResponseCreateGroupOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return CBMessage.internal_static_ResponseCreateGroup_descriptor;
      }

      @Override
      protected FieldAccessorTable
          internalGetFieldAccessorTable() {
        return CBMessage.internal_static_ResponseCreateGroup_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                ResponseCreateGroup.class, Builder.class);
      }

      // Construct using CBMessage.ResponseCreateGroup.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      @Override
      public Builder clear() {
        super.clear();
        result_ = false;

        words_ = "";

        return this;
      }

      @Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return CBMessage.internal_static_ResponseCreateGroup_descriptor;
      }

      @Override
      public ResponseCreateGroup getDefaultInstanceForType() {
        return ResponseCreateGroup.getDefaultInstance();
      }

      @Override
      public ResponseCreateGroup build() {
        ResponseCreateGroup result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @Override
      public ResponseCreateGroup buildPartial() {
        ResponseCreateGroup result = new ResponseCreateGroup(this);
        result.result_ = result_;
        result.words_ = words_;
        onBuilt();
        return result;
      }

      @Override
      public Builder clone() {
        return super.clone();
      }
      @Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return super.setField(field, value);
      }
      @Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return super.addRepeatedField(field, value);
      }
      @Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof ResponseCreateGroup) {
          return mergeFrom((ResponseCreateGroup)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(ResponseCreateGroup other) {
        if (other == ResponseCreateGroup.getDefaultInstance()) return this;
        if (other.getResult() != false) {
          setResult(other.getResult());
        }
        if (!other.getWords().isEmpty()) {
          words_ = other.words_;
          onChanged();
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @Override
      public final boolean isInitialized() {
        return true;
      }

      @Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        ResponseCreateGroup parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (ResponseCreateGroup) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private boolean result_ ;
      /**
       * <code>bool result = 1;</code>
       */
      public boolean getResult() {
        return result_;
      }
      /**
       * <code>bool result = 1;</code>
       */
      public Builder setResult(boolean value) {
        
        result_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool result = 1;</code>
       */
      public Builder clearResult() {
        
        result_ = false;
        onChanged();
        return this;
      }

      private Object words_ = "";
      /**
       * <code>string words = 2;</code>
       */
      public String getWords() {
        Object ref = words_;
        if (!(ref instanceof String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          String s = bs.toStringUtf8();
          words_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      /**
       * <code>string words = 2;</code>
       */
      public com.google.protobuf.ByteString
          getWordsBytes() {
        Object ref = words_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (String) ref);
          words_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string words = 2;</code>
       */
      public Builder setWords(
          String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        words_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string words = 2;</code>
       */
      public Builder clearWords() {
        
        words_ = getDefaultInstance().getWords();
        onChanged();
        return this;
      }
      /**
       * <code>string words = 2;</code>
       */
      public Builder setWordsBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        words_ = value;
        onChanged();
        return this;
      }
      @Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:ResponseCreateGroup)
    }

    // @@protoc_insertion_point(class_scope:ResponseCreateGroup)
    private static final ResponseCreateGroup DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new ResponseCreateGroup();
    }

    public static ResponseCreateGroup getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ResponseCreateGroup>
        PARSER = new com.google.protobuf.AbstractParser<ResponseCreateGroup>() {
      @Override
      public ResponseCreateGroup parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new ResponseCreateGroup(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<ResponseCreateGroup> parser() {
      return PARSER;
    }

    @Override
    public com.google.protobuf.Parser<ResponseCreateGroup> getParserForType() {
      return PARSER;
    }

    @Override
    public ResponseCreateGroup getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface RequestEnterGroupOrBuilder extends
      // @@protoc_insertion_point(interface_extends:RequestEnterGroup)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>string groupname = 1;</code>
     */
    String getGroupname();
    /**
     * <code>string groupname = 1;</code>
     */
    com.google.protobuf.ByteString
        getGroupnameBytes();

    /**
     * <code>string username = 2;</code>
     */
    String getUsername();
    /**
     * <code>string username = 2;</code>
     */
    com.google.protobuf.ByteString
        getUsernameBytes();

    /**
     * <code>string password = 3;</code>
     */
    String getPassword();
    /**
     * <code>string password = 3;</code>
     */
    com.google.protobuf.ByteString
        getPasswordBytes();
  }
  /**
   * Protobuf type {@code RequestEnterGroup}
   */
  public  static final class RequestEnterGroup extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:RequestEnterGroup)
      RequestEnterGroupOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use RequestEnterGroup.newBuilder() to construct.
    private RequestEnterGroup(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private RequestEnterGroup() {
      groupname_ = "";
      username_ = "";
      password_ = "";
    }

    @Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private RequestEnterGroup(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new NullPointerException();
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
            case 10: {
              String s = input.readStringRequireUtf8();

              groupname_ = s;
              break;
            }
            case 18: {
              String s = input.readStringRequireUtf8();

              username_ = s;
              break;
            }
            case 26: {
              String s = input.readStringRequireUtf8();

              password_ = s;
              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
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
            e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return CBMessage.internal_static_RequestEnterGroup_descriptor;
    }

    @Override
    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return CBMessage.internal_static_RequestEnterGroup_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              RequestEnterGroup.class, Builder.class);
    }

    public static final int GROUPNAME_FIELD_NUMBER = 1;
    private volatile Object groupname_;
    /**
     * <code>string groupname = 1;</code>
     */
    public String getGroupname() {
      Object ref = groupname_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        groupname_ = s;
        return s;
      }
    }
    /**
     * <code>string groupname = 1;</code>
     */
    public com.google.protobuf.ByteString
        getGroupnameBytes() {
      Object ref = groupname_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        groupname_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int USERNAME_FIELD_NUMBER = 2;
    private volatile Object username_;
    /**
     * <code>string username = 2;</code>
     */
    public String getUsername() {
      Object ref = username_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        username_ = s;
        return s;
      }
    }
    /**
     * <code>string username = 2;</code>
     */
    public com.google.protobuf.ByteString
        getUsernameBytes() {
      Object ref = username_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        username_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int PASSWORD_FIELD_NUMBER = 3;
    private volatile Object password_;
    /**
     * <code>string password = 3;</code>
     */
    public String getPassword() {
      Object ref = password_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        password_ = s;
        return s;
      }
    }
    /**
     * <code>string password = 3;</code>
     */
    public com.google.protobuf.ByteString
        getPasswordBytes() {
      Object ref = password_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        password_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    private byte memoizedIsInitialized = -1;
    @Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (!getGroupnameBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, groupname_);
      }
      if (!getUsernameBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, username_);
      }
      if (!getPasswordBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 3, password_);
      }
      unknownFields.writeTo(output);
    }

    @Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!getGroupnameBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, groupname_);
      }
      if (!getUsernameBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, username_);
      }
      if (!getPasswordBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, password_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @Override
    public boolean equals(final Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof RequestEnterGroup)) {
        return super.equals(obj);
      }
      RequestEnterGroup other = (RequestEnterGroup) obj;

      if (!getGroupname()
          .equals(other.getGroupname())) return false;
      if (!getUsername()
          .equals(other.getUsername())) return false;
      if (!getPassword()
          .equals(other.getPassword())) return false;
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + GROUPNAME_FIELD_NUMBER;
      hash = (53 * hash) + getGroupname().hashCode();
      hash = (37 * hash) + USERNAME_FIELD_NUMBER;
      hash = (53 * hash) + getUsername().hashCode();
      hash = (37 * hash) + PASSWORD_FIELD_NUMBER;
      hash = (53 * hash) + getPassword().hashCode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static RequestEnterGroup parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static RequestEnterGroup parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static RequestEnterGroup parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static RequestEnterGroup parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static RequestEnterGroup parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static RequestEnterGroup parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static RequestEnterGroup parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static RequestEnterGroup parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static RequestEnterGroup parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static RequestEnterGroup parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static RequestEnterGroup parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static RequestEnterGroup parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(RequestEnterGroup prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @Override
    protected Builder newBuilderForType(
        BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code RequestEnterGroup}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:RequestEnterGroup)
        RequestEnterGroupOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return CBMessage.internal_static_RequestEnterGroup_descriptor;
      }

      @Override
      protected FieldAccessorTable
          internalGetFieldAccessorTable() {
        return CBMessage.internal_static_RequestEnterGroup_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                RequestEnterGroup.class, Builder.class);
      }

      // Construct using CBMessage.RequestEnterGroup.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      @Override
      public Builder clear() {
        super.clear();
        groupname_ = "";

        username_ = "";

        password_ = "";

        return this;
      }

      @Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return CBMessage.internal_static_RequestEnterGroup_descriptor;
      }

      @Override
      public RequestEnterGroup getDefaultInstanceForType() {
        return RequestEnterGroup.getDefaultInstance();
      }

      @Override
      public RequestEnterGroup build() {
        RequestEnterGroup result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @Override
      public RequestEnterGroup buildPartial() {
        RequestEnterGroup result = new RequestEnterGroup(this);
        result.groupname_ = groupname_;
        result.username_ = username_;
        result.password_ = password_;
        onBuilt();
        return result;
      }

      @Override
      public Builder clone() {
        return super.clone();
      }
      @Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return super.setField(field, value);
      }
      @Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return super.addRepeatedField(field, value);
      }
      @Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof RequestEnterGroup) {
          return mergeFrom((RequestEnterGroup)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(RequestEnterGroup other) {
        if (other == RequestEnterGroup.getDefaultInstance()) return this;
        if (!other.getGroupname().isEmpty()) {
          groupname_ = other.groupname_;
          onChanged();
        }
        if (!other.getUsername().isEmpty()) {
          username_ = other.username_;
          onChanged();
        }
        if (!other.getPassword().isEmpty()) {
          password_ = other.password_;
          onChanged();
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @Override
      public final boolean isInitialized() {
        return true;
      }

      @Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        RequestEnterGroup parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (RequestEnterGroup) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private Object groupname_ = "";
      /**
       * <code>string groupname = 1;</code>
       */
      public String getGroupname() {
        Object ref = groupname_;
        if (!(ref instanceof String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          String s = bs.toStringUtf8();
          groupname_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      /**
       * <code>string groupname = 1;</code>
       */
      public com.google.protobuf.ByteString
          getGroupnameBytes() {
        Object ref = groupname_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (String) ref);
          groupname_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string groupname = 1;</code>
       */
      public Builder setGroupname(
          String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        groupname_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string groupname = 1;</code>
       */
      public Builder clearGroupname() {
        
        groupname_ = getDefaultInstance().getGroupname();
        onChanged();
        return this;
      }
      /**
       * <code>string groupname = 1;</code>
       */
      public Builder setGroupnameBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        groupname_ = value;
        onChanged();
        return this;
      }

      private Object username_ = "";
      /**
       * <code>string username = 2;</code>
       */
      public String getUsername() {
        Object ref = username_;
        if (!(ref instanceof String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          String s = bs.toStringUtf8();
          username_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      /**
       * <code>string username = 2;</code>
       */
      public com.google.protobuf.ByteString
          getUsernameBytes() {
        Object ref = username_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (String) ref);
          username_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string username = 2;</code>
       */
      public Builder setUsername(
          String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        username_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string username = 2;</code>
       */
      public Builder clearUsername() {
        
        username_ = getDefaultInstance().getUsername();
        onChanged();
        return this;
      }
      /**
       * <code>string username = 2;</code>
       */
      public Builder setUsernameBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        username_ = value;
        onChanged();
        return this;
      }

      private Object password_ = "";
      /**
       * <code>string password = 3;</code>
       */
      public String getPassword() {
        Object ref = password_;
        if (!(ref instanceof String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          String s = bs.toStringUtf8();
          password_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      /**
       * <code>string password = 3;</code>
       */
      public com.google.protobuf.ByteString
          getPasswordBytes() {
        Object ref = password_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (String) ref);
          password_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string password = 3;</code>
       */
      public Builder setPassword(
          String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        password_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string password = 3;</code>
       */
      public Builder clearPassword() {
        
        password_ = getDefaultInstance().getPassword();
        onChanged();
        return this;
      }
      /**
       * <code>string password = 3;</code>
       */
      public Builder setPasswordBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        password_ = value;
        onChanged();
        return this;
      }
      @Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:RequestEnterGroup)
    }

    // @@protoc_insertion_point(class_scope:RequestEnterGroup)
    private static final RequestEnterGroup DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new RequestEnterGroup();
    }

    public static RequestEnterGroup getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<RequestEnterGroup>
        PARSER = new com.google.protobuf.AbstractParser<RequestEnterGroup>() {
      @Override
      public RequestEnterGroup parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new RequestEnterGroup(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<RequestEnterGroup> parser() {
      return PARSER;
    }

    @Override
    public com.google.protobuf.Parser<RequestEnterGroup> getParserForType() {
      return PARSER;
    }

    @Override
    public RequestEnterGroup getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface ResponseEnterGroupOrBuilder extends
      // @@protoc_insertion_point(interface_extends:ResponseEnterGroup)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>bool result = 1;</code>
     */
    boolean getResult();

    /**
     * <code>string words = 2;</code>
     */
    String getWords();
    /**
     * <code>string words = 2;</code>
     */
    com.google.protobuf.ByteString
        getWordsBytes();

    /**
     * <code>.User user = 3;</code>
     */
    boolean hasUser();
    /**
     * <code>.User user = 3;</code>
     */
    User getUser();
    /**
     * <code>.User user = 3;</code>
     */
    UserOrBuilder getUserOrBuilder();
  }
  /**
   * Protobuf type {@code ResponseEnterGroup}
   */
  public  static final class ResponseEnterGroup extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:ResponseEnterGroup)
      ResponseEnterGroupOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ResponseEnterGroup.newBuilder() to construct.
    private ResponseEnterGroup(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ResponseEnterGroup() {
      words_ = "";
    }

    @Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private ResponseEnterGroup(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new NullPointerException();
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
            case 8: {

              result_ = input.readBool();
              break;
            }
            case 18: {
              String s = input.readStringRequireUtf8();

              words_ = s;
              break;
            }
            case 26: {
              User.Builder subBuilder = null;
              if (user_ != null) {
                subBuilder = user_.toBuilder();
              }
              user_ = input.readMessage(User.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(user_);
                user_ = subBuilder.buildPartial();
              }

              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
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
            e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return CBMessage.internal_static_ResponseEnterGroup_descriptor;
    }

    @Override
    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return CBMessage.internal_static_ResponseEnterGroup_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ResponseEnterGroup.class, Builder.class);
    }

    public static final int RESULT_FIELD_NUMBER = 1;
    private boolean result_;
    /**
     * <code>bool result = 1;</code>
     */
    public boolean getResult() {
      return result_;
    }

    public static final int WORDS_FIELD_NUMBER = 2;
    private volatile Object words_;
    /**
     * <code>string words = 2;</code>
     */
    public String getWords() {
      Object ref = words_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        words_ = s;
        return s;
      }
    }
    /**
     * <code>string words = 2;</code>
     */
    public com.google.protobuf.ByteString
        getWordsBytes() {
      Object ref = words_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        words_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int USER_FIELD_NUMBER = 3;
    private User user_;
    /**
     * <code>.User user = 3;</code>
     */
    public boolean hasUser() {
      return user_ != null;
    }
    /**
     * <code>.User user = 3;</code>
     */
    public User getUser() {
      return user_ == null ? User.getDefaultInstance() : user_;
    }
    /**
     * <code>.User user = 3;</code>
     */
    public UserOrBuilder getUserOrBuilder() {
      return getUser();
    }

    private byte memoizedIsInitialized = -1;
    @Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (result_ != false) {
        output.writeBool(1, result_);
      }
      if (!getWordsBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, words_);
      }
      if (user_ != null) {
        output.writeMessage(3, getUser());
      }
      unknownFields.writeTo(output);
    }

    @Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (result_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(1, result_);
      }
      if (!getWordsBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, words_);
      }
      if (user_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(3, getUser());
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @Override
    public boolean equals(final Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof ResponseEnterGroup)) {
        return super.equals(obj);
      }
      ResponseEnterGroup other = (ResponseEnterGroup) obj;

      if (getResult()
          != other.getResult()) return false;
      if (!getWords()
          .equals(other.getWords())) return false;
      if (hasUser() != other.hasUser()) return false;
      if (hasUser()) {
        if (!getUser()
            .equals(other.getUser())) return false;
      }
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + RESULT_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getResult());
      hash = (37 * hash) + WORDS_FIELD_NUMBER;
      hash = (53 * hash) + getWords().hashCode();
      if (hasUser()) {
        hash = (37 * hash) + USER_FIELD_NUMBER;
        hash = (53 * hash) + getUser().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static ResponseEnterGroup parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static ResponseEnterGroup parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static ResponseEnterGroup parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static ResponseEnterGroup parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static ResponseEnterGroup parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static ResponseEnterGroup parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static ResponseEnterGroup parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static ResponseEnterGroup parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static ResponseEnterGroup parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static ResponseEnterGroup parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static ResponseEnterGroup parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static ResponseEnterGroup parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(ResponseEnterGroup prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @Override
    protected Builder newBuilderForType(
        BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code ResponseEnterGroup}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:ResponseEnterGroup)
        ResponseEnterGroupOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return CBMessage.internal_static_ResponseEnterGroup_descriptor;
      }

      @Override
      protected FieldAccessorTable
          internalGetFieldAccessorTable() {
        return CBMessage.internal_static_ResponseEnterGroup_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                ResponseEnterGroup.class, Builder.class);
      }

      // Construct using CBMessage.ResponseEnterGroup.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      @Override
      public Builder clear() {
        super.clear();
        result_ = false;

        words_ = "";

        if (userBuilder_ == null) {
          user_ = null;
        } else {
          user_ = null;
          userBuilder_ = null;
        }
        return this;
      }

      @Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return CBMessage.internal_static_ResponseEnterGroup_descriptor;
      }

      @Override
      public ResponseEnterGroup getDefaultInstanceForType() {
        return ResponseEnterGroup.getDefaultInstance();
      }

      @Override
      public ResponseEnterGroup build() {
        ResponseEnterGroup result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @Override
      public ResponseEnterGroup buildPartial() {
        ResponseEnterGroup result = new ResponseEnterGroup(this);
        result.result_ = result_;
        result.words_ = words_;
        if (userBuilder_ == null) {
          result.user_ = user_;
        } else {
          result.user_ = userBuilder_.build();
        }
        onBuilt();
        return result;
      }

      @Override
      public Builder clone() {
        return super.clone();
      }
      @Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return super.setField(field, value);
      }
      @Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return super.addRepeatedField(field, value);
      }
      @Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof ResponseEnterGroup) {
          return mergeFrom((ResponseEnterGroup)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(ResponseEnterGroup other) {
        if (other == ResponseEnterGroup.getDefaultInstance()) return this;
        if (other.getResult() != false) {
          setResult(other.getResult());
        }
        if (!other.getWords().isEmpty()) {
          words_ = other.words_;
          onChanged();
        }
        if (other.hasUser()) {
          mergeUser(other.getUser());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @Override
      public final boolean isInitialized() {
        return true;
      }

      @Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        ResponseEnterGroup parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (ResponseEnterGroup) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private boolean result_ ;
      /**
       * <code>bool result = 1;</code>
       */
      public boolean getResult() {
        return result_;
      }
      /**
       * <code>bool result = 1;</code>
       */
      public Builder setResult(boolean value) {
        
        result_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool result = 1;</code>
       */
      public Builder clearResult() {
        
        result_ = false;
        onChanged();
        return this;
      }

      private Object words_ = "";
      /**
       * <code>string words = 2;</code>
       */
      public String getWords() {
        Object ref = words_;
        if (!(ref instanceof String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          String s = bs.toStringUtf8();
          words_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      /**
       * <code>string words = 2;</code>
       */
      public com.google.protobuf.ByteString
          getWordsBytes() {
        Object ref = words_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (String) ref);
          words_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string words = 2;</code>
       */
      public Builder setWords(
          String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        words_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string words = 2;</code>
       */
      public Builder clearWords() {
        
        words_ = getDefaultInstance().getWords();
        onChanged();
        return this;
      }
      /**
       * <code>string words = 2;</code>
       */
      public Builder setWordsBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        words_ = value;
        onChanged();
        return this;
      }

      private User user_;
      private com.google.protobuf.SingleFieldBuilderV3<
          User, User.Builder, UserOrBuilder> userBuilder_;
      /**
       * <code>.User user = 3;</code>
       */
      public boolean hasUser() {
        return userBuilder_ != null || user_ != null;
      }
      /**
       * <code>.User user = 3;</code>
       */
      public User getUser() {
        if (userBuilder_ == null) {
          return user_ == null ? User.getDefaultInstance() : user_;
        } else {
          return userBuilder_.getMessage();
        }
      }
      /**
       * <code>.User user = 3;</code>
       */
      public Builder setUser(User value) {
        if (userBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          user_ = value;
          onChanged();
        } else {
          userBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.User user = 3;</code>
       */
      public Builder setUser(
          User.Builder builderForValue) {
        if (userBuilder_ == null) {
          user_ = builderForValue.build();
          onChanged();
        } else {
          userBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.User user = 3;</code>
       */
      public Builder mergeUser(User value) {
        if (userBuilder_ == null) {
          if (user_ != null) {
            user_ =
              User.newBuilder(user_).mergeFrom(value).buildPartial();
          } else {
            user_ = value;
          }
          onChanged();
        } else {
          userBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.User user = 3;</code>
       */
      public Builder clearUser() {
        if (userBuilder_ == null) {
          user_ = null;
          onChanged();
        } else {
          user_ = null;
          userBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.User user = 3;</code>
       */
      public User.Builder getUserBuilder() {
        
        onChanged();
        return getUserFieldBuilder().getBuilder();
      }
      /**
       * <code>.User user = 3;</code>
       */
      public UserOrBuilder getUserOrBuilder() {
        if (userBuilder_ != null) {
          return userBuilder_.getMessageOrBuilder();
        } else {
          return user_ == null ?
              User.getDefaultInstance() : user_;
        }
      }
      /**
       * <code>.User user = 3;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          User, User.Builder, UserOrBuilder>
          getUserFieldBuilder() {
        if (userBuilder_ == null) {
          userBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              User, User.Builder, UserOrBuilder>(
                  getUser(),
                  getParentForChildren(),
                  isClean());
          user_ = null;
        }
        return userBuilder_;
      }
      @Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:ResponseEnterGroup)
    }

    // @@protoc_insertion_point(class_scope:ResponseEnterGroup)
    private static final ResponseEnterGroup DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new ResponseEnterGroup();
    }

    public static ResponseEnterGroup getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ResponseEnterGroup>
        PARSER = new com.google.protobuf.AbstractParser<ResponseEnterGroup>() {
      @Override
      public ResponseEnterGroup parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new ResponseEnterGroup(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<ResponseEnterGroup> parser() {
      return PARSER;
    }

    @Override
    public com.google.protobuf.Parser<ResponseEnterGroup> getParserForType() {
      return PARSER;
    }

    @Override
    public ResponseEnterGroup getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface RequestAddRecordOrBuilder extends
      // @@protoc_insertion_point(interface_extends:RequestAddRecord)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>string groupname = 1;</code>
     */
    String getGroupname();
    /**
     * <code>string groupname = 1;</code>
     */
    com.google.protobuf.ByteString
        getGroupnameBytes();

    /**
     * <code>.Record record = 2;</code>
     */
    boolean hasRecord();
    /**
     * <code>.Record record = 2;</code>
     */
    Record getRecord();
    /**
     * <code>.Record record = 2;</code>
     */
    RecordOrBuilder getRecordOrBuilder();
  }
  /**
   * Protobuf type {@code RequestAddRecord}
   */
  public  static final class RequestAddRecord extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:RequestAddRecord)
      RequestAddRecordOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use RequestAddRecord.newBuilder() to construct.
    private RequestAddRecord(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private RequestAddRecord() {
      groupname_ = "";
    }

    @Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private RequestAddRecord(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new NullPointerException();
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
            case 10: {
              String s = input.readStringRequireUtf8();

              groupname_ = s;
              break;
            }
            case 18: {
              Record.Builder subBuilder = null;
              if (record_ != null) {
                subBuilder = record_.toBuilder();
              }
              record_ = input.readMessage(Record.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(record_);
                record_ = subBuilder.buildPartial();
              }

              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
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
            e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return CBMessage.internal_static_RequestAddRecord_descriptor;
    }

    @Override
    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return CBMessage.internal_static_RequestAddRecord_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              RequestAddRecord.class, Builder.class);
    }

    public static final int GROUPNAME_FIELD_NUMBER = 1;
    private volatile Object groupname_;
    /**
     * <code>string groupname = 1;</code>
     */
    public String getGroupname() {
      Object ref = groupname_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        groupname_ = s;
        return s;
      }
    }
    /**
     * <code>string groupname = 1;</code>
     */
    public com.google.protobuf.ByteString
        getGroupnameBytes() {
      Object ref = groupname_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        groupname_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int RECORD_FIELD_NUMBER = 2;
    private Record record_;
    /**
     * <code>.Record record = 2;</code>
     */
    public boolean hasRecord() {
      return record_ != null;
    }
    /**
     * <code>.Record record = 2;</code>
     */
    public Record getRecord() {
      return record_ == null ? Record.getDefaultInstance() : record_;
    }
    /**
     * <code>.Record record = 2;</code>
     */
    public RecordOrBuilder getRecordOrBuilder() {
      return getRecord();
    }

    private byte memoizedIsInitialized = -1;
    @Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (!getGroupnameBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, groupname_);
      }
      if (record_ != null) {
        output.writeMessage(2, getRecord());
      }
      unknownFields.writeTo(output);
    }

    @Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!getGroupnameBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, groupname_);
      }
      if (record_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, getRecord());
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @Override
    public boolean equals(final Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof RequestAddRecord)) {
        return super.equals(obj);
      }
      RequestAddRecord other = (RequestAddRecord) obj;

      if (!getGroupname()
          .equals(other.getGroupname())) return false;
      if (hasRecord() != other.hasRecord()) return false;
      if (hasRecord()) {
        if (!getRecord()
            .equals(other.getRecord())) return false;
      }
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + GROUPNAME_FIELD_NUMBER;
      hash = (53 * hash) + getGroupname().hashCode();
      if (hasRecord()) {
        hash = (37 * hash) + RECORD_FIELD_NUMBER;
        hash = (53 * hash) + getRecord().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static RequestAddRecord parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static RequestAddRecord parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static RequestAddRecord parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static RequestAddRecord parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static RequestAddRecord parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static RequestAddRecord parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static RequestAddRecord parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static RequestAddRecord parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static RequestAddRecord parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static RequestAddRecord parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static RequestAddRecord parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static RequestAddRecord parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(RequestAddRecord prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @Override
    protected Builder newBuilderForType(
        BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code RequestAddRecord}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:RequestAddRecord)
        RequestAddRecordOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return CBMessage.internal_static_RequestAddRecord_descriptor;
      }

      @Override
      protected FieldAccessorTable
          internalGetFieldAccessorTable() {
        return CBMessage.internal_static_RequestAddRecord_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                RequestAddRecord.class, Builder.class);
      }

      // Construct using CBMessage.RequestAddRecord.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      @Override
      public Builder clear() {
        super.clear();
        groupname_ = "";

        if (recordBuilder_ == null) {
          record_ = null;
        } else {
          record_ = null;
          recordBuilder_ = null;
        }
        return this;
      }

      @Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return CBMessage.internal_static_RequestAddRecord_descriptor;
      }

      @Override
      public RequestAddRecord getDefaultInstanceForType() {
        return RequestAddRecord.getDefaultInstance();
      }

      @Override
      public RequestAddRecord build() {
        RequestAddRecord result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @Override
      public RequestAddRecord buildPartial() {
        RequestAddRecord result = new RequestAddRecord(this);
        result.groupname_ = groupname_;
        if (recordBuilder_ == null) {
          result.record_ = record_;
        } else {
          result.record_ = recordBuilder_.build();
        }
        onBuilt();
        return result;
      }

      @Override
      public Builder clone() {
        return super.clone();
      }
      @Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return super.setField(field, value);
      }
      @Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return super.addRepeatedField(field, value);
      }
      @Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof RequestAddRecord) {
          return mergeFrom((RequestAddRecord)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(RequestAddRecord other) {
        if (other == RequestAddRecord.getDefaultInstance()) return this;
        if (!other.getGroupname().isEmpty()) {
          groupname_ = other.groupname_;
          onChanged();
        }
        if (other.hasRecord()) {
          mergeRecord(other.getRecord());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @Override
      public final boolean isInitialized() {
        return true;
      }

      @Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        RequestAddRecord parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (RequestAddRecord) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private Object groupname_ = "";
      /**
       * <code>string groupname = 1;</code>
       */
      public String getGroupname() {
        Object ref = groupname_;
        if (!(ref instanceof String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          String s = bs.toStringUtf8();
          groupname_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      /**
       * <code>string groupname = 1;</code>
       */
      public com.google.protobuf.ByteString
          getGroupnameBytes() {
        Object ref = groupname_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (String) ref);
          groupname_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string groupname = 1;</code>
       */
      public Builder setGroupname(
          String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        groupname_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string groupname = 1;</code>
       */
      public Builder clearGroupname() {
        
        groupname_ = getDefaultInstance().getGroupname();
        onChanged();
        return this;
      }
      /**
       * <code>string groupname = 1;</code>
       */
      public Builder setGroupnameBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        groupname_ = value;
        onChanged();
        return this;
      }

      private Record record_;
      private com.google.protobuf.SingleFieldBuilderV3<
          Record, Record.Builder, RecordOrBuilder> recordBuilder_;
      /**
       * <code>.Record record = 2;</code>
       */
      public boolean hasRecord() {
        return recordBuilder_ != null || record_ != null;
      }
      /**
       * <code>.Record record = 2;</code>
       */
      public Record getRecord() {
        if (recordBuilder_ == null) {
          return record_ == null ? Record.getDefaultInstance() : record_;
        } else {
          return recordBuilder_.getMessage();
        }
      }
      /**
       * <code>.Record record = 2;</code>
       */
      public Builder setRecord(Record value) {
        if (recordBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          record_ = value;
          onChanged();
        } else {
          recordBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.Record record = 2;</code>
       */
      public Builder setRecord(
          Record.Builder builderForValue) {
        if (recordBuilder_ == null) {
          record_ = builderForValue.build();
          onChanged();
        } else {
          recordBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.Record record = 2;</code>
       */
      public Builder mergeRecord(Record value) {
        if (recordBuilder_ == null) {
          if (record_ != null) {
            record_ =
              Record.newBuilder(record_).mergeFrom(value).buildPartial();
          } else {
            record_ = value;
          }
          onChanged();
        } else {
          recordBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.Record record = 2;</code>
       */
      public Builder clearRecord() {
        if (recordBuilder_ == null) {
          record_ = null;
          onChanged();
        } else {
          record_ = null;
          recordBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.Record record = 2;</code>
       */
      public Record.Builder getRecordBuilder() {
        
        onChanged();
        return getRecordFieldBuilder().getBuilder();
      }
      /**
       * <code>.Record record = 2;</code>
       */
      public RecordOrBuilder getRecordOrBuilder() {
        if (recordBuilder_ != null) {
          return recordBuilder_.getMessageOrBuilder();
        } else {
          return record_ == null ?
              Record.getDefaultInstance() : record_;
        }
      }
      /**
       * <code>.Record record = 2;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          Record, Record.Builder, RecordOrBuilder>
          getRecordFieldBuilder() {
        if (recordBuilder_ == null) {
          recordBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              Record, Record.Builder, RecordOrBuilder>(
                  getRecord(),
                  getParentForChildren(),
                  isClean());
          record_ = null;
        }
        return recordBuilder_;
      }
      @Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:RequestAddRecord)
    }

    // @@protoc_insertion_point(class_scope:RequestAddRecord)
    private static final RequestAddRecord DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new RequestAddRecord();
    }

    public static RequestAddRecord getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<RequestAddRecord>
        PARSER = new com.google.protobuf.AbstractParser<RequestAddRecord>() {
      @Override
      public RequestAddRecord parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new RequestAddRecord(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<RequestAddRecord> parser() {
      return PARSER;
    }

    @Override
    public com.google.protobuf.Parser<RequestAddRecord> getParserForType() {
      return PARSER;
    }

    @Override
    public RequestAddRecord getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface ResponseAddRecordOrBuilder extends
      // @@protoc_insertion_point(interface_extends:ResponseAddRecord)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>bool result = 1;</code>
     */
    boolean getResult();

    /**
     * <code>string words = 2;</code>
     */
    String getWords();
    /**
     * <code>string words = 2;</code>
     */
    com.google.protobuf.ByteString
        getWordsBytes();
  }
  /**
   * Protobuf type {@code ResponseAddRecord}
   */
  public  static final class ResponseAddRecord extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:ResponseAddRecord)
      ResponseAddRecordOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ResponseAddRecord.newBuilder() to construct.
    private ResponseAddRecord(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ResponseAddRecord() {
      words_ = "";
    }

    @Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private ResponseAddRecord(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new NullPointerException();
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
            case 8: {

              result_ = input.readBool();
              break;
            }
            case 18: {
              String s = input.readStringRequireUtf8();

              words_ = s;
              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
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
            e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return CBMessage.internal_static_ResponseAddRecord_descriptor;
    }

    @Override
    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return CBMessage.internal_static_ResponseAddRecord_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ResponseAddRecord.class, Builder.class);
    }

    public static final int RESULT_FIELD_NUMBER = 1;
    private boolean result_;
    /**
     * <code>bool result = 1;</code>
     */
    public boolean getResult() {
      return result_;
    }

    public static final int WORDS_FIELD_NUMBER = 2;
    private volatile Object words_;
    /**
     * <code>string words = 2;</code>
     */
    public String getWords() {
      Object ref = words_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        words_ = s;
        return s;
      }
    }
    /**
     * <code>string words = 2;</code>
     */
    public com.google.protobuf.ByteString
        getWordsBytes() {
      Object ref = words_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        words_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    private byte memoizedIsInitialized = -1;
    @Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (result_ != false) {
        output.writeBool(1, result_);
      }
      if (!getWordsBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, words_);
      }
      unknownFields.writeTo(output);
    }

    @Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (result_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(1, result_);
      }
      if (!getWordsBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, words_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @Override
    public boolean equals(final Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof ResponseAddRecord)) {
        return super.equals(obj);
      }
      ResponseAddRecord other = (ResponseAddRecord) obj;

      if (getResult()
          != other.getResult()) return false;
      if (!getWords()
          .equals(other.getWords())) return false;
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + RESULT_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getResult());
      hash = (37 * hash) + WORDS_FIELD_NUMBER;
      hash = (53 * hash) + getWords().hashCode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static ResponseAddRecord parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static ResponseAddRecord parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static ResponseAddRecord parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static ResponseAddRecord parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static ResponseAddRecord parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static ResponseAddRecord parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static ResponseAddRecord parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static ResponseAddRecord parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static ResponseAddRecord parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static ResponseAddRecord parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static ResponseAddRecord parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static ResponseAddRecord parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(ResponseAddRecord prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @Override
    protected Builder newBuilderForType(
        BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code ResponseAddRecord}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:ResponseAddRecord)
        ResponseAddRecordOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return CBMessage.internal_static_ResponseAddRecord_descriptor;
      }

      @Override
      protected FieldAccessorTable
          internalGetFieldAccessorTable() {
        return CBMessage.internal_static_ResponseAddRecord_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                ResponseAddRecord.class, Builder.class);
      }

      // Construct using CBMessage.ResponseAddRecord.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      @Override
      public Builder clear() {
        super.clear();
        result_ = false;

        words_ = "";

        return this;
      }

      @Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return CBMessage.internal_static_ResponseAddRecord_descriptor;
      }

      @Override
      public ResponseAddRecord getDefaultInstanceForType() {
        return ResponseAddRecord.getDefaultInstance();
      }

      @Override
      public ResponseAddRecord build() {
        ResponseAddRecord result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @Override
      public ResponseAddRecord buildPartial() {
        ResponseAddRecord result = new ResponseAddRecord(this);
        result.result_ = result_;
        result.words_ = words_;
        onBuilt();
        return result;
      }

      @Override
      public Builder clone() {
        return super.clone();
      }
      @Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return super.setField(field, value);
      }
      @Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return super.addRepeatedField(field, value);
      }
      @Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof ResponseAddRecord) {
          return mergeFrom((ResponseAddRecord)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(ResponseAddRecord other) {
        if (other == ResponseAddRecord.getDefaultInstance()) return this;
        if (other.getResult() != false) {
          setResult(other.getResult());
        }
        if (!other.getWords().isEmpty()) {
          words_ = other.words_;
          onChanged();
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @Override
      public final boolean isInitialized() {
        return true;
      }

      @Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        ResponseAddRecord parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (ResponseAddRecord) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private boolean result_ ;
      /**
       * <code>bool result = 1;</code>
       */
      public boolean getResult() {
        return result_;
      }
      /**
       * <code>bool result = 1;</code>
       */
      public Builder setResult(boolean value) {
        
        result_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool result = 1;</code>
       */
      public Builder clearResult() {
        
        result_ = false;
        onChanged();
        return this;
      }

      private Object words_ = "";
      /**
       * <code>string words = 2;</code>
       */
      public String getWords() {
        Object ref = words_;
        if (!(ref instanceof String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          String s = bs.toStringUtf8();
          words_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      /**
       * <code>string words = 2;</code>
       */
      public com.google.protobuf.ByteString
          getWordsBytes() {
        Object ref = words_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (String) ref);
          words_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string words = 2;</code>
       */
      public Builder setWords(
          String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        words_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string words = 2;</code>
       */
      public Builder clearWords() {
        
        words_ = getDefaultInstance().getWords();
        onChanged();
        return this;
      }
      /**
       * <code>string words = 2;</code>
       */
      public Builder setWordsBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        words_ = value;
        onChanged();
        return this;
      }
      @Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:ResponseAddRecord)
    }

    // @@protoc_insertion_point(class_scope:ResponseAddRecord)
    private static final ResponseAddRecord DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new ResponseAddRecord();
    }

    public static ResponseAddRecord getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ResponseAddRecord>
        PARSER = new com.google.protobuf.AbstractParser<ResponseAddRecord>() {
      @Override
      public ResponseAddRecord parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new ResponseAddRecord(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<ResponseAddRecord> parser() {
      return PARSER;
    }

    @Override
    public com.google.protobuf.Parser<ResponseAddRecord> getParserForType() {
      return PARSER;
    }

    @Override
    public ResponseAddRecord getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface RequestRemoveRecordOrBuilder extends
      // @@protoc_insertion_point(interface_extends:RequestRemoveRecord)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>string groupname = 1;</code>
     */
    String getGroupname();
    /**
     * <code>string groupname = 1;</code>
     */
    com.google.protobuf.ByteString
        getGroupnameBytes();

    /**
     * <code>int32 record_id = 2;</code>
     */
    int getRecordId();
  }
  /**
   * Protobuf type {@code RequestRemoveRecord}
   */
  public  static final class RequestRemoveRecord extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:RequestRemoveRecord)
      RequestRemoveRecordOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use RequestRemoveRecord.newBuilder() to construct.
    private RequestRemoveRecord(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private RequestRemoveRecord() {
      groupname_ = "";
    }

    @Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private RequestRemoveRecord(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new NullPointerException();
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
            case 10: {
              String s = input.readStringRequireUtf8();

              groupname_ = s;
              break;
            }
            case 16: {

              recordId_ = input.readInt32();
              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
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
            e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return CBMessage.internal_static_RequestRemoveRecord_descriptor;
    }

    @Override
    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return CBMessage.internal_static_RequestRemoveRecord_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              RequestRemoveRecord.class, Builder.class);
    }

    public static final int GROUPNAME_FIELD_NUMBER = 1;
    private volatile Object groupname_;
    /**
     * <code>string groupname = 1;</code>
     */
    public String getGroupname() {
      Object ref = groupname_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        groupname_ = s;
        return s;
      }
    }
    /**
     * <code>string groupname = 1;</code>
     */
    public com.google.protobuf.ByteString
        getGroupnameBytes() {
      Object ref = groupname_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        groupname_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int RECORD_ID_FIELD_NUMBER = 2;
    private int recordId_;
    /**
     * <code>int32 record_id = 2;</code>
     */
    public int getRecordId() {
      return recordId_;
    }

    private byte memoizedIsInitialized = -1;
    @Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (!getGroupnameBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, groupname_);
      }
      if (recordId_ != 0) {
        output.writeInt32(2, recordId_);
      }
      unknownFields.writeTo(output);
    }

    @Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!getGroupnameBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, groupname_);
      }
      if (recordId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(2, recordId_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @Override
    public boolean equals(final Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof RequestRemoveRecord)) {
        return super.equals(obj);
      }
      RequestRemoveRecord other = (RequestRemoveRecord) obj;

      if (!getGroupname()
          .equals(other.getGroupname())) return false;
      if (getRecordId()
          != other.getRecordId()) return false;
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + GROUPNAME_FIELD_NUMBER;
      hash = (53 * hash) + getGroupname().hashCode();
      hash = (37 * hash) + RECORD_ID_FIELD_NUMBER;
      hash = (53 * hash) + getRecordId();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static RequestRemoveRecord parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static RequestRemoveRecord parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static RequestRemoveRecord parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static RequestRemoveRecord parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static RequestRemoveRecord parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static RequestRemoveRecord parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static RequestRemoveRecord parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static RequestRemoveRecord parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static RequestRemoveRecord parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static RequestRemoveRecord parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static RequestRemoveRecord parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static RequestRemoveRecord parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(RequestRemoveRecord prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @Override
    protected Builder newBuilderForType(
        BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code RequestRemoveRecord}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:RequestRemoveRecord)
        RequestRemoveRecordOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return CBMessage.internal_static_RequestRemoveRecord_descriptor;
      }

      @Override
      protected FieldAccessorTable
          internalGetFieldAccessorTable() {
        return CBMessage.internal_static_RequestRemoveRecord_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                RequestRemoveRecord.class, Builder.class);
      }

      // Construct using CBMessage.RequestRemoveRecord.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      @Override
      public Builder clear() {
        super.clear();
        groupname_ = "";

        recordId_ = 0;

        return this;
      }

      @Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return CBMessage.internal_static_RequestRemoveRecord_descriptor;
      }

      @Override
      public RequestRemoveRecord getDefaultInstanceForType() {
        return RequestRemoveRecord.getDefaultInstance();
      }

      @Override
      public RequestRemoveRecord build() {
        RequestRemoveRecord result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @Override
      public RequestRemoveRecord buildPartial() {
        RequestRemoveRecord result = new RequestRemoveRecord(this);
        result.groupname_ = groupname_;
        result.recordId_ = recordId_;
        onBuilt();
        return result;
      }

      @Override
      public Builder clone() {
        return super.clone();
      }
      @Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return super.setField(field, value);
      }
      @Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return super.addRepeatedField(field, value);
      }
      @Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof RequestRemoveRecord) {
          return mergeFrom((RequestRemoveRecord)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(RequestRemoveRecord other) {
        if (other == RequestRemoveRecord.getDefaultInstance()) return this;
        if (!other.getGroupname().isEmpty()) {
          groupname_ = other.groupname_;
          onChanged();
        }
        if (other.getRecordId() != 0) {
          setRecordId(other.getRecordId());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @Override
      public final boolean isInitialized() {
        return true;
      }

      @Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        RequestRemoveRecord parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (RequestRemoveRecord) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private Object groupname_ = "";
      /**
       * <code>string groupname = 1;</code>
       */
      public String getGroupname() {
        Object ref = groupname_;
        if (!(ref instanceof String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          String s = bs.toStringUtf8();
          groupname_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      /**
       * <code>string groupname = 1;</code>
       */
      public com.google.protobuf.ByteString
          getGroupnameBytes() {
        Object ref = groupname_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (String) ref);
          groupname_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string groupname = 1;</code>
       */
      public Builder setGroupname(
          String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        groupname_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string groupname = 1;</code>
       */
      public Builder clearGroupname() {
        
        groupname_ = getDefaultInstance().getGroupname();
        onChanged();
        return this;
      }
      /**
       * <code>string groupname = 1;</code>
       */
      public Builder setGroupnameBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        groupname_ = value;
        onChanged();
        return this;
      }

      private int recordId_ ;
      /**
       * <code>int32 record_id = 2;</code>
       */
      public int getRecordId() {
        return recordId_;
      }
      /**
       * <code>int32 record_id = 2;</code>
       */
      public Builder setRecordId(int value) {
        
        recordId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 record_id = 2;</code>
       */
      public Builder clearRecordId() {
        
        recordId_ = 0;
        onChanged();
        return this;
      }
      @Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:RequestRemoveRecord)
    }

    // @@protoc_insertion_point(class_scope:RequestRemoveRecord)
    private static final RequestRemoveRecord DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new RequestRemoveRecord();
    }

    public static RequestRemoveRecord getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<RequestRemoveRecord>
        PARSER = new com.google.protobuf.AbstractParser<RequestRemoveRecord>() {
      @Override
      public RequestRemoveRecord parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new RequestRemoveRecord(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<RequestRemoveRecord> parser() {
      return PARSER;
    }

    @Override
    public com.google.protobuf.Parser<RequestRemoveRecord> getParserForType() {
      return PARSER;
    }

    @Override
    public RequestRemoveRecord getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface ResponseRemoveRecordOrBuilder extends
      // @@protoc_insertion_point(interface_extends:ResponseRemoveRecord)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>bool result = 1;</code>
     */
    boolean getResult();

    /**
     * <code>string words = 2;</code>
     */
    String getWords();
    /**
     * <code>string words = 2;</code>
     */
    com.google.protobuf.ByteString
        getWordsBytes();
  }
  /**
   * Protobuf type {@code ResponseRemoveRecord}
   */
  public  static final class ResponseRemoveRecord extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:ResponseRemoveRecord)
      ResponseRemoveRecordOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ResponseRemoveRecord.newBuilder() to construct.
    private ResponseRemoveRecord(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ResponseRemoveRecord() {
      words_ = "";
    }

    @Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private ResponseRemoveRecord(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new NullPointerException();
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
            case 8: {

              result_ = input.readBool();
              break;
            }
            case 18: {
              String s = input.readStringRequireUtf8();

              words_ = s;
              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
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
            e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return CBMessage.internal_static_ResponseRemoveRecord_descriptor;
    }

    @Override
    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return CBMessage.internal_static_ResponseRemoveRecord_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ResponseRemoveRecord.class, Builder.class);
    }

    public static final int RESULT_FIELD_NUMBER = 1;
    private boolean result_;
    /**
     * <code>bool result = 1;</code>
     */
    public boolean getResult() {
      return result_;
    }

    public static final int WORDS_FIELD_NUMBER = 2;
    private volatile Object words_;
    /**
     * <code>string words = 2;</code>
     */
    public String getWords() {
      Object ref = words_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        words_ = s;
        return s;
      }
    }
    /**
     * <code>string words = 2;</code>
     */
    public com.google.protobuf.ByteString
        getWordsBytes() {
      Object ref = words_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        words_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    private byte memoizedIsInitialized = -1;
    @Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (result_ != false) {
        output.writeBool(1, result_);
      }
      if (!getWordsBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, words_);
      }
      unknownFields.writeTo(output);
    }

    @Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (result_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(1, result_);
      }
      if (!getWordsBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, words_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @Override
    public boolean equals(final Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof ResponseRemoveRecord)) {
        return super.equals(obj);
      }
      ResponseRemoveRecord other = (ResponseRemoveRecord) obj;

      if (getResult()
          != other.getResult()) return false;
      if (!getWords()
          .equals(other.getWords())) return false;
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + RESULT_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getResult());
      hash = (37 * hash) + WORDS_FIELD_NUMBER;
      hash = (53 * hash) + getWords().hashCode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static ResponseRemoveRecord parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static ResponseRemoveRecord parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static ResponseRemoveRecord parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static ResponseRemoveRecord parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static ResponseRemoveRecord parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static ResponseRemoveRecord parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static ResponseRemoveRecord parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static ResponseRemoveRecord parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static ResponseRemoveRecord parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static ResponseRemoveRecord parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static ResponseRemoveRecord parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static ResponseRemoveRecord parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(ResponseRemoveRecord prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @Override
    protected Builder newBuilderForType(
        BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code ResponseRemoveRecord}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:ResponseRemoveRecord)
        ResponseRemoveRecordOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return CBMessage.internal_static_ResponseRemoveRecord_descriptor;
      }

      @Override
      protected FieldAccessorTable
          internalGetFieldAccessorTable() {
        return CBMessage.internal_static_ResponseRemoveRecord_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                ResponseRemoveRecord.class, Builder.class);
      }

      // Construct using CBMessage.ResponseRemoveRecord.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      @Override
      public Builder clear() {
        super.clear();
        result_ = false;

        words_ = "";

        return this;
      }

      @Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return CBMessage.internal_static_ResponseRemoveRecord_descriptor;
      }

      @Override
      public ResponseRemoveRecord getDefaultInstanceForType() {
        return ResponseRemoveRecord.getDefaultInstance();
      }

      @Override
      public ResponseRemoveRecord build() {
        ResponseRemoveRecord result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @Override
      public ResponseRemoveRecord buildPartial() {
        ResponseRemoveRecord result = new ResponseRemoveRecord(this);
        result.result_ = result_;
        result.words_ = words_;
        onBuilt();
        return result;
      }

      @Override
      public Builder clone() {
        return super.clone();
      }
      @Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return super.setField(field, value);
      }
      @Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return super.addRepeatedField(field, value);
      }
      @Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof ResponseRemoveRecord) {
          return mergeFrom((ResponseRemoveRecord)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(ResponseRemoveRecord other) {
        if (other == ResponseRemoveRecord.getDefaultInstance()) return this;
        if (other.getResult() != false) {
          setResult(other.getResult());
        }
        if (!other.getWords().isEmpty()) {
          words_ = other.words_;
          onChanged();
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @Override
      public final boolean isInitialized() {
        return true;
      }

      @Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        ResponseRemoveRecord parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (ResponseRemoveRecord) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private boolean result_ ;
      /**
       * <code>bool result = 1;</code>
       */
      public boolean getResult() {
        return result_;
      }
      /**
       * <code>bool result = 1;</code>
       */
      public Builder setResult(boolean value) {
        
        result_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool result = 1;</code>
       */
      public Builder clearResult() {
        
        result_ = false;
        onChanged();
        return this;
      }

      private Object words_ = "";
      /**
       * <code>string words = 2;</code>
       */
      public String getWords() {
        Object ref = words_;
        if (!(ref instanceof String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          String s = bs.toStringUtf8();
          words_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      /**
       * <code>string words = 2;</code>
       */
      public com.google.protobuf.ByteString
          getWordsBytes() {
        Object ref = words_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (String) ref);
          words_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string words = 2;</code>
       */
      public Builder setWords(
          String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        words_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string words = 2;</code>
       */
      public Builder clearWords() {
        
        words_ = getDefaultInstance().getWords();
        onChanged();
        return this;
      }
      /**
       * <code>string words = 2;</code>
       */
      public Builder setWordsBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        words_ = value;
        onChanged();
        return this;
      }
      @Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:ResponseRemoveRecord)
    }

    // @@protoc_insertion_point(class_scope:ResponseRemoveRecord)
    private static final ResponseRemoveRecord DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new ResponseRemoveRecord();
    }

    public static ResponseRemoveRecord getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ResponseRemoveRecord>
        PARSER = new com.google.protobuf.AbstractParser<ResponseRemoveRecord>() {
      @Override
      public ResponseRemoveRecord parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new ResponseRemoveRecord(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<ResponseRemoveRecord> parser() {
      return PARSER;
    }

    @Override
    public com.google.protobuf.Parser<ResponseRemoveRecord> getParserForType() {
      return PARSER;
    }

    @Override
    public ResponseRemoveRecord getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface RequestAddAccountOrBuilder extends
      // @@protoc_insertion_point(interface_extends:RequestAddAccount)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>string groupname = 1;</code>
     */
    String getGroupname();
    /**
     * <code>string groupname = 1;</code>
     */
    com.google.protobuf.ByteString
        getGroupnameBytes();

    /**
     * <code>.User user = 2;</code>
     */
    boolean hasUser();
    /**
     * <code>.User user = 2;</code>
     */
    User getUser();
    /**
     * <code>.User user = 2;</code>
     */
    UserOrBuilder getUserOrBuilder();
  }
  /**
   * Protobuf type {@code RequestAddAccount}
   */
  public  static final class RequestAddAccount extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:RequestAddAccount)
      RequestAddAccountOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use RequestAddAccount.newBuilder() to construct.
    private RequestAddAccount(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private RequestAddAccount() {
      groupname_ = "";
    }

    @Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private RequestAddAccount(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new NullPointerException();
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
            case 10: {
              String s = input.readStringRequireUtf8();

              groupname_ = s;
              break;
            }
            case 18: {
              User.Builder subBuilder = null;
              if (user_ != null) {
                subBuilder = user_.toBuilder();
              }
              user_ = input.readMessage(User.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(user_);
                user_ = subBuilder.buildPartial();
              }

              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
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
            e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return CBMessage.internal_static_RequestAddAccount_descriptor;
    }

    @Override
    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return CBMessage.internal_static_RequestAddAccount_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              RequestAddAccount.class, Builder.class);
    }

    public static final int GROUPNAME_FIELD_NUMBER = 1;
    private volatile Object groupname_;
    /**
     * <code>string groupname = 1;</code>
     */
    public String getGroupname() {
      Object ref = groupname_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        groupname_ = s;
        return s;
      }
    }
    /**
     * <code>string groupname = 1;</code>
     */
    public com.google.protobuf.ByteString
        getGroupnameBytes() {
      Object ref = groupname_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        groupname_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int USER_FIELD_NUMBER = 2;
    private User user_;
    /**
     * <code>.User user = 2;</code>
     */
    public boolean hasUser() {
      return user_ != null;
    }
    /**
     * <code>.User user = 2;</code>
     */
    public User getUser() {
      return user_ == null ? User.getDefaultInstance() : user_;
    }
    /**
     * <code>.User user = 2;</code>
     */
    public UserOrBuilder getUserOrBuilder() {
      return getUser();
    }

    private byte memoizedIsInitialized = -1;
    @Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (!getGroupnameBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, groupname_);
      }
      if (user_ != null) {
        output.writeMessage(2, getUser());
      }
      unknownFields.writeTo(output);
    }

    @Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!getGroupnameBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, groupname_);
      }
      if (user_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, getUser());
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @Override
    public boolean equals(final Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof RequestAddAccount)) {
        return super.equals(obj);
      }
      RequestAddAccount other = (RequestAddAccount) obj;

      if (!getGroupname()
          .equals(other.getGroupname())) return false;
      if (hasUser() != other.hasUser()) return false;
      if (hasUser()) {
        if (!getUser()
            .equals(other.getUser())) return false;
      }
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + GROUPNAME_FIELD_NUMBER;
      hash = (53 * hash) + getGroupname().hashCode();
      if (hasUser()) {
        hash = (37 * hash) + USER_FIELD_NUMBER;
        hash = (53 * hash) + getUser().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static RequestAddAccount parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static RequestAddAccount parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static RequestAddAccount parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static RequestAddAccount parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static RequestAddAccount parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static RequestAddAccount parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static RequestAddAccount parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static RequestAddAccount parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static RequestAddAccount parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static RequestAddAccount parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static RequestAddAccount parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static RequestAddAccount parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(RequestAddAccount prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @Override
    protected Builder newBuilderForType(
        BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code RequestAddAccount}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:RequestAddAccount)
        RequestAddAccountOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return CBMessage.internal_static_RequestAddAccount_descriptor;
      }

      @Override
      protected FieldAccessorTable
          internalGetFieldAccessorTable() {
        return CBMessage.internal_static_RequestAddAccount_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                RequestAddAccount.class, Builder.class);
      }

      // Construct using CBMessage.RequestAddAccount.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      @Override
      public Builder clear() {
        super.clear();
        groupname_ = "";

        if (userBuilder_ == null) {
          user_ = null;
        } else {
          user_ = null;
          userBuilder_ = null;
        }
        return this;
      }

      @Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return CBMessage.internal_static_RequestAddAccount_descriptor;
      }

      @Override
      public RequestAddAccount getDefaultInstanceForType() {
        return RequestAddAccount.getDefaultInstance();
      }

      @Override
      public RequestAddAccount build() {
        RequestAddAccount result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @Override
      public RequestAddAccount buildPartial() {
        RequestAddAccount result = new RequestAddAccount(this);
        result.groupname_ = groupname_;
        if (userBuilder_ == null) {
          result.user_ = user_;
        } else {
          result.user_ = userBuilder_.build();
        }
        onBuilt();
        return result;
      }

      @Override
      public Builder clone() {
        return super.clone();
      }
      @Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return super.setField(field, value);
      }
      @Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return super.addRepeatedField(field, value);
      }
      @Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof RequestAddAccount) {
          return mergeFrom((RequestAddAccount)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(RequestAddAccount other) {
        if (other == RequestAddAccount.getDefaultInstance()) return this;
        if (!other.getGroupname().isEmpty()) {
          groupname_ = other.groupname_;
          onChanged();
        }
        if (other.hasUser()) {
          mergeUser(other.getUser());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @Override
      public final boolean isInitialized() {
        return true;
      }

      @Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        RequestAddAccount parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (RequestAddAccount) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private Object groupname_ = "";
      /**
       * <code>string groupname = 1;</code>
       */
      public String getGroupname() {
        Object ref = groupname_;
        if (!(ref instanceof String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          String s = bs.toStringUtf8();
          groupname_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      /**
       * <code>string groupname = 1;</code>
       */
      public com.google.protobuf.ByteString
          getGroupnameBytes() {
        Object ref = groupname_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (String) ref);
          groupname_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string groupname = 1;</code>
       */
      public Builder setGroupname(
          String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        groupname_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string groupname = 1;</code>
       */
      public Builder clearGroupname() {
        
        groupname_ = getDefaultInstance().getGroupname();
        onChanged();
        return this;
      }
      /**
       * <code>string groupname = 1;</code>
       */
      public Builder setGroupnameBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        groupname_ = value;
        onChanged();
        return this;
      }

      private User user_;
      private com.google.protobuf.SingleFieldBuilderV3<
          User, User.Builder, UserOrBuilder> userBuilder_;
      /**
       * <code>.User user = 2;</code>
       */
      public boolean hasUser() {
        return userBuilder_ != null || user_ != null;
      }
      /**
       * <code>.User user = 2;</code>
       */
      public User getUser() {
        if (userBuilder_ == null) {
          return user_ == null ? User.getDefaultInstance() : user_;
        } else {
          return userBuilder_.getMessage();
        }
      }
      /**
       * <code>.User user = 2;</code>
       */
      public Builder setUser(User value) {
        if (userBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          user_ = value;
          onChanged();
        } else {
          userBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.User user = 2;</code>
       */
      public Builder setUser(
          User.Builder builderForValue) {
        if (userBuilder_ == null) {
          user_ = builderForValue.build();
          onChanged();
        } else {
          userBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.User user = 2;</code>
       */
      public Builder mergeUser(User value) {
        if (userBuilder_ == null) {
          if (user_ != null) {
            user_ =
              User.newBuilder(user_).mergeFrom(value).buildPartial();
          } else {
            user_ = value;
          }
          onChanged();
        } else {
          userBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.User user = 2;</code>
       */
      public Builder clearUser() {
        if (userBuilder_ == null) {
          user_ = null;
          onChanged();
        } else {
          user_ = null;
          userBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.User user = 2;</code>
       */
      public User.Builder getUserBuilder() {
        
        onChanged();
        return getUserFieldBuilder().getBuilder();
      }
      /**
       * <code>.User user = 2;</code>
       */
      public UserOrBuilder getUserOrBuilder() {
        if (userBuilder_ != null) {
          return userBuilder_.getMessageOrBuilder();
        } else {
          return user_ == null ?
              User.getDefaultInstance() : user_;
        }
      }
      /**
       * <code>.User user = 2;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          User, User.Builder, UserOrBuilder>
          getUserFieldBuilder() {
        if (userBuilder_ == null) {
          userBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              User, User.Builder, UserOrBuilder>(
                  getUser(),
                  getParentForChildren(),
                  isClean());
          user_ = null;
        }
        return userBuilder_;
      }
      @Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:RequestAddAccount)
    }

    // @@protoc_insertion_point(class_scope:RequestAddAccount)
    private static final RequestAddAccount DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new RequestAddAccount();
    }

    public static RequestAddAccount getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<RequestAddAccount>
        PARSER = new com.google.protobuf.AbstractParser<RequestAddAccount>() {
      @Override
      public RequestAddAccount parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new RequestAddAccount(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<RequestAddAccount> parser() {
      return PARSER;
    }

    @Override
    public com.google.protobuf.Parser<RequestAddAccount> getParserForType() {
      return PARSER;
    }

    @Override
    public RequestAddAccount getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface ResponseAddAccountOrBuilder extends
      // @@protoc_insertion_point(interface_extends:ResponseAddAccount)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>bool result = 1;</code>
     */
    boolean getResult();

    /**
     * <code>string words = 2;</code>
     */
    String getWords();
    /**
     * <code>string words = 2;</code>
     */
    com.google.protobuf.ByteString
        getWordsBytes();
  }
  /**
   * Protobuf type {@code ResponseAddAccount}
   */
  public  static final class ResponseAddAccount extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:ResponseAddAccount)
      ResponseAddAccountOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ResponseAddAccount.newBuilder() to construct.
    private ResponseAddAccount(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ResponseAddAccount() {
      words_ = "";
    }

    @Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private ResponseAddAccount(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new NullPointerException();
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
            case 8: {

              result_ = input.readBool();
              break;
            }
            case 18: {
              String s = input.readStringRequireUtf8();

              words_ = s;
              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
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
            e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return CBMessage.internal_static_ResponseAddAccount_descriptor;
    }

    @Override
    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return CBMessage.internal_static_ResponseAddAccount_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ResponseAddAccount.class, Builder.class);
    }

    public static final int RESULT_FIELD_NUMBER = 1;
    private boolean result_;
    /**
     * <code>bool result = 1;</code>
     */
    public boolean getResult() {
      return result_;
    }

    public static final int WORDS_FIELD_NUMBER = 2;
    private volatile Object words_;
    /**
     * <code>string words = 2;</code>
     */
    public String getWords() {
      Object ref = words_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        words_ = s;
        return s;
      }
    }
    /**
     * <code>string words = 2;</code>
     */
    public com.google.protobuf.ByteString
        getWordsBytes() {
      Object ref = words_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        words_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    private byte memoizedIsInitialized = -1;
    @Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (result_ != false) {
        output.writeBool(1, result_);
      }
      if (!getWordsBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, words_);
      }
      unknownFields.writeTo(output);
    }

    @Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (result_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(1, result_);
      }
      if (!getWordsBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, words_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @Override
    public boolean equals(final Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof ResponseAddAccount)) {
        return super.equals(obj);
      }
      ResponseAddAccount other = (ResponseAddAccount) obj;

      if (getResult()
          != other.getResult()) return false;
      if (!getWords()
          .equals(other.getWords())) return false;
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + RESULT_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getResult());
      hash = (37 * hash) + WORDS_FIELD_NUMBER;
      hash = (53 * hash) + getWords().hashCode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static ResponseAddAccount parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static ResponseAddAccount parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static ResponseAddAccount parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static ResponseAddAccount parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static ResponseAddAccount parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static ResponseAddAccount parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static ResponseAddAccount parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static ResponseAddAccount parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static ResponseAddAccount parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static ResponseAddAccount parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static ResponseAddAccount parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static ResponseAddAccount parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(ResponseAddAccount prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @Override
    protected Builder newBuilderForType(
        BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code ResponseAddAccount}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:ResponseAddAccount)
        ResponseAddAccountOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return CBMessage.internal_static_ResponseAddAccount_descriptor;
      }

      @Override
      protected FieldAccessorTable
          internalGetFieldAccessorTable() {
        return CBMessage.internal_static_ResponseAddAccount_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                ResponseAddAccount.class, Builder.class);
      }

      // Construct using CBMessage.ResponseAddAccount.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      @Override
      public Builder clear() {
        super.clear();
        result_ = false;

        words_ = "";

        return this;
      }

      @Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return CBMessage.internal_static_ResponseAddAccount_descriptor;
      }

      @Override
      public ResponseAddAccount getDefaultInstanceForType() {
        return ResponseAddAccount.getDefaultInstance();
      }

      @Override
      public ResponseAddAccount build() {
        ResponseAddAccount result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @Override
      public ResponseAddAccount buildPartial() {
        ResponseAddAccount result = new ResponseAddAccount(this);
        result.result_ = result_;
        result.words_ = words_;
        onBuilt();
        return result;
      }

      @Override
      public Builder clone() {
        return super.clone();
      }
      @Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return super.setField(field, value);
      }
      @Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return super.addRepeatedField(field, value);
      }
      @Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof ResponseAddAccount) {
          return mergeFrom((ResponseAddAccount)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(ResponseAddAccount other) {
        if (other == ResponseAddAccount.getDefaultInstance()) return this;
        if (other.getResult() != false) {
          setResult(other.getResult());
        }
        if (!other.getWords().isEmpty()) {
          words_ = other.words_;
          onChanged();
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @Override
      public final boolean isInitialized() {
        return true;
      }

      @Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        ResponseAddAccount parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (ResponseAddAccount) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private boolean result_ ;
      /**
       * <code>bool result = 1;</code>
       */
      public boolean getResult() {
        return result_;
      }
      /**
       * <code>bool result = 1;</code>
       */
      public Builder setResult(boolean value) {
        
        result_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool result = 1;</code>
       */
      public Builder clearResult() {
        
        result_ = false;
        onChanged();
        return this;
      }

      private Object words_ = "";
      /**
       * <code>string words = 2;</code>
       */
      public String getWords() {
        Object ref = words_;
        if (!(ref instanceof String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          String s = bs.toStringUtf8();
          words_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      /**
       * <code>string words = 2;</code>
       */
      public com.google.protobuf.ByteString
          getWordsBytes() {
        Object ref = words_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (String) ref);
          words_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string words = 2;</code>
       */
      public Builder setWords(
          String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        words_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string words = 2;</code>
       */
      public Builder clearWords() {
        
        words_ = getDefaultInstance().getWords();
        onChanged();
        return this;
      }
      /**
       * <code>string words = 2;</code>
       */
      public Builder setWordsBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        words_ = value;
        onChanged();
        return this;
      }
      @Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:ResponseAddAccount)
    }

    // @@protoc_insertion_point(class_scope:ResponseAddAccount)
    private static final ResponseAddAccount DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new ResponseAddAccount();
    }

    public static ResponseAddAccount getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ResponseAddAccount>
        PARSER = new com.google.protobuf.AbstractParser<ResponseAddAccount>() {
      @Override
      public ResponseAddAccount parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new ResponseAddAccount(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<ResponseAddAccount> parser() {
      return PARSER;
    }

    @Override
    public com.google.protobuf.Parser<ResponseAddAccount> getParserForType() {
      return PARSER;
    }

    @Override
    public ResponseAddAccount getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface RequestRemoveAccountOrBuilder extends
      // @@protoc_insertion_point(interface_extends:RequestRemoveAccount)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>string groupname = 1;</code>
     */
    String getGroupname();
    /**
     * <code>string groupname = 1;</code>
     */
    com.google.protobuf.ByteString
        getGroupnameBytes();

    /**
     * <code>string username = 2;</code>
     */
    String getUsername();
    /**
     * <code>string username = 2;</code>
     */
    com.google.protobuf.ByteString
        getUsernameBytes();
  }
  /**
   * Protobuf type {@code RequestRemoveAccount}
   */
  public  static final class RequestRemoveAccount extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:RequestRemoveAccount)
      RequestRemoveAccountOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use RequestRemoveAccount.newBuilder() to construct.
    private RequestRemoveAccount(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private RequestRemoveAccount() {
      groupname_ = "";
      username_ = "";
    }

    @Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private RequestRemoveAccount(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new NullPointerException();
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
            case 10: {
              String s = input.readStringRequireUtf8();

              groupname_ = s;
              break;
            }
            case 18: {
              String s = input.readStringRequireUtf8();

              username_ = s;
              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
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
            e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return CBMessage.internal_static_RequestRemoveAccount_descriptor;
    }

    @Override
    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return CBMessage.internal_static_RequestRemoveAccount_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              RequestRemoveAccount.class, Builder.class);
    }

    public static final int GROUPNAME_FIELD_NUMBER = 1;
    private volatile Object groupname_;
    /**
     * <code>string groupname = 1;</code>
     */
    public String getGroupname() {
      Object ref = groupname_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        groupname_ = s;
        return s;
      }
    }
    /**
     * <code>string groupname = 1;</code>
     */
    public com.google.protobuf.ByteString
        getGroupnameBytes() {
      Object ref = groupname_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        groupname_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int USERNAME_FIELD_NUMBER = 2;
    private volatile Object username_;
    /**
     * <code>string username = 2;</code>
     */
    public String getUsername() {
      Object ref = username_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        username_ = s;
        return s;
      }
    }
    /**
     * <code>string username = 2;</code>
     */
    public com.google.protobuf.ByteString
        getUsernameBytes() {
      Object ref = username_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        username_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    private byte memoizedIsInitialized = -1;
    @Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (!getGroupnameBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, groupname_);
      }
      if (!getUsernameBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, username_);
      }
      unknownFields.writeTo(output);
    }

    @Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!getGroupnameBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, groupname_);
      }
      if (!getUsernameBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, username_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @Override
    public boolean equals(final Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof RequestRemoveAccount)) {
        return super.equals(obj);
      }
      RequestRemoveAccount other = (RequestRemoveAccount) obj;

      if (!getGroupname()
          .equals(other.getGroupname())) return false;
      if (!getUsername()
          .equals(other.getUsername())) return false;
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + GROUPNAME_FIELD_NUMBER;
      hash = (53 * hash) + getGroupname().hashCode();
      hash = (37 * hash) + USERNAME_FIELD_NUMBER;
      hash = (53 * hash) + getUsername().hashCode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static RequestRemoveAccount parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static RequestRemoveAccount parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static RequestRemoveAccount parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static RequestRemoveAccount parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static RequestRemoveAccount parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static RequestRemoveAccount parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static RequestRemoveAccount parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static RequestRemoveAccount parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static RequestRemoveAccount parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static RequestRemoveAccount parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static RequestRemoveAccount parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static RequestRemoveAccount parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(RequestRemoveAccount prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @Override
    protected Builder newBuilderForType(
        BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code RequestRemoveAccount}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:RequestRemoveAccount)
        RequestRemoveAccountOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return CBMessage.internal_static_RequestRemoveAccount_descriptor;
      }

      @Override
      protected FieldAccessorTable
          internalGetFieldAccessorTable() {
        return CBMessage.internal_static_RequestRemoveAccount_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                RequestRemoveAccount.class, Builder.class);
      }

      // Construct using CBMessage.RequestRemoveAccount.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      @Override
      public Builder clear() {
        super.clear();
        groupname_ = "";

        username_ = "";

        return this;
      }

      @Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return CBMessage.internal_static_RequestRemoveAccount_descriptor;
      }

      @Override
      public RequestRemoveAccount getDefaultInstanceForType() {
        return RequestRemoveAccount.getDefaultInstance();
      }

      @Override
      public RequestRemoveAccount build() {
        RequestRemoveAccount result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @Override
      public RequestRemoveAccount buildPartial() {
        RequestRemoveAccount result = new RequestRemoveAccount(this);
        result.groupname_ = groupname_;
        result.username_ = username_;
        onBuilt();
        return result;
      }

      @Override
      public Builder clone() {
        return super.clone();
      }
      @Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return super.setField(field, value);
      }
      @Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return super.addRepeatedField(field, value);
      }
      @Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof RequestRemoveAccount) {
          return mergeFrom((RequestRemoveAccount)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(RequestRemoveAccount other) {
        if (other == RequestRemoveAccount.getDefaultInstance()) return this;
        if (!other.getGroupname().isEmpty()) {
          groupname_ = other.groupname_;
          onChanged();
        }
        if (!other.getUsername().isEmpty()) {
          username_ = other.username_;
          onChanged();
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @Override
      public final boolean isInitialized() {
        return true;
      }

      @Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        RequestRemoveAccount parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (RequestRemoveAccount) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private Object groupname_ = "";
      /**
       * <code>string groupname = 1;</code>
       */
      public String getGroupname() {
        Object ref = groupname_;
        if (!(ref instanceof String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          String s = bs.toStringUtf8();
          groupname_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      /**
       * <code>string groupname = 1;</code>
       */
      public com.google.protobuf.ByteString
          getGroupnameBytes() {
        Object ref = groupname_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (String) ref);
          groupname_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string groupname = 1;</code>
       */
      public Builder setGroupname(
          String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        groupname_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string groupname = 1;</code>
       */
      public Builder clearGroupname() {
        
        groupname_ = getDefaultInstance().getGroupname();
        onChanged();
        return this;
      }
      /**
       * <code>string groupname = 1;</code>
       */
      public Builder setGroupnameBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        groupname_ = value;
        onChanged();
        return this;
      }

      private Object username_ = "";
      /**
       * <code>string username = 2;</code>
       */
      public String getUsername() {
        Object ref = username_;
        if (!(ref instanceof String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          String s = bs.toStringUtf8();
          username_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      /**
       * <code>string username = 2;</code>
       */
      public com.google.protobuf.ByteString
          getUsernameBytes() {
        Object ref = username_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (String) ref);
          username_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string username = 2;</code>
       */
      public Builder setUsername(
          String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        username_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string username = 2;</code>
       */
      public Builder clearUsername() {
        
        username_ = getDefaultInstance().getUsername();
        onChanged();
        return this;
      }
      /**
       * <code>string username = 2;</code>
       */
      public Builder setUsernameBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        username_ = value;
        onChanged();
        return this;
      }
      @Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:RequestRemoveAccount)
    }

    // @@protoc_insertion_point(class_scope:RequestRemoveAccount)
    private static final RequestRemoveAccount DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new RequestRemoveAccount();
    }

    public static RequestRemoveAccount getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<RequestRemoveAccount>
        PARSER = new com.google.protobuf.AbstractParser<RequestRemoveAccount>() {
      @Override
      public RequestRemoveAccount parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new RequestRemoveAccount(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<RequestRemoveAccount> parser() {
      return PARSER;
    }

    @Override
    public com.google.protobuf.Parser<RequestRemoveAccount> getParserForType() {
      return PARSER;
    }

    @Override
    public RequestRemoveAccount getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface ResponseRemoveAccountOrBuilder extends
      // @@protoc_insertion_point(interface_extends:ResponseRemoveAccount)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>bool result = 1;</code>
     */
    boolean getResult();

    /**
     * <code>string words = 2;</code>
     */
    String getWords();
    /**
     * <code>string words = 2;</code>
     */
    com.google.protobuf.ByteString
        getWordsBytes();
  }
  /**
   * Protobuf type {@code ResponseRemoveAccount}
   */
  public  static final class ResponseRemoveAccount extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:ResponseRemoveAccount)
      ResponseRemoveAccountOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ResponseRemoveAccount.newBuilder() to construct.
    private ResponseRemoveAccount(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ResponseRemoveAccount() {
      words_ = "";
    }

    @Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private ResponseRemoveAccount(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new NullPointerException();
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
            case 8: {

              result_ = input.readBool();
              break;
            }
            case 18: {
              String s = input.readStringRequireUtf8();

              words_ = s;
              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
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
            e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return CBMessage.internal_static_ResponseRemoveAccount_descriptor;
    }

    @Override
    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return CBMessage.internal_static_ResponseRemoveAccount_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ResponseRemoveAccount.class, Builder.class);
    }

    public static final int RESULT_FIELD_NUMBER = 1;
    private boolean result_;
    /**
     * <code>bool result = 1;</code>
     */
    public boolean getResult() {
      return result_;
    }

    public static final int WORDS_FIELD_NUMBER = 2;
    private volatile Object words_;
    /**
     * <code>string words = 2;</code>
     */
    public String getWords() {
      Object ref = words_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        words_ = s;
        return s;
      }
    }
    /**
     * <code>string words = 2;</code>
     */
    public com.google.protobuf.ByteString
        getWordsBytes() {
      Object ref = words_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        words_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    private byte memoizedIsInitialized = -1;
    @Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (result_ != false) {
        output.writeBool(1, result_);
      }
      if (!getWordsBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, words_);
      }
      unknownFields.writeTo(output);
    }

    @Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (result_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(1, result_);
      }
      if (!getWordsBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, words_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @Override
    public boolean equals(final Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof ResponseRemoveAccount)) {
        return super.equals(obj);
      }
      ResponseRemoveAccount other = (ResponseRemoveAccount) obj;

      if (getResult()
          != other.getResult()) return false;
      if (!getWords()
          .equals(other.getWords())) return false;
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + RESULT_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getResult());
      hash = (37 * hash) + WORDS_FIELD_NUMBER;
      hash = (53 * hash) + getWords().hashCode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static ResponseRemoveAccount parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static ResponseRemoveAccount parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static ResponseRemoveAccount parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static ResponseRemoveAccount parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static ResponseRemoveAccount parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static ResponseRemoveAccount parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static ResponseRemoveAccount parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static ResponseRemoveAccount parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static ResponseRemoveAccount parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static ResponseRemoveAccount parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static ResponseRemoveAccount parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static ResponseRemoveAccount parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(ResponseRemoveAccount prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @Override
    protected Builder newBuilderForType(
        BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code ResponseRemoveAccount}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:ResponseRemoveAccount)
        ResponseRemoveAccountOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return CBMessage.internal_static_ResponseRemoveAccount_descriptor;
      }

      @Override
      protected FieldAccessorTable
          internalGetFieldAccessorTable() {
        return CBMessage.internal_static_ResponseRemoveAccount_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                ResponseRemoveAccount.class, Builder.class);
      }

      // Construct using CBMessage.ResponseRemoveAccount.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      @Override
      public Builder clear() {
        super.clear();
        result_ = false;

        words_ = "";

        return this;
      }

      @Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return CBMessage.internal_static_ResponseRemoveAccount_descriptor;
      }

      @Override
      public ResponseRemoveAccount getDefaultInstanceForType() {
        return ResponseRemoveAccount.getDefaultInstance();
      }

      @Override
      public ResponseRemoveAccount build() {
        ResponseRemoveAccount result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @Override
      public ResponseRemoveAccount buildPartial() {
        ResponseRemoveAccount result = new ResponseRemoveAccount(this);
        result.result_ = result_;
        result.words_ = words_;
        onBuilt();
        return result;
      }

      @Override
      public Builder clone() {
        return super.clone();
      }
      @Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return super.setField(field, value);
      }
      @Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return super.addRepeatedField(field, value);
      }
      @Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof ResponseRemoveAccount) {
          return mergeFrom((ResponseRemoveAccount)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(ResponseRemoveAccount other) {
        if (other == ResponseRemoveAccount.getDefaultInstance()) return this;
        if (other.getResult() != false) {
          setResult(other.getResult());
        }
        if (!other.getWords().isEmpty()) {
          words_ = other.words_;
          onChanged();
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @Override
      public final boolean isInitialized() {
        return true;
      }

      @Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        ResponseRemoveAccount parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (ResponseRemoveAccount) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private boolean result_ ;
      /**
       * <code>bool result = 1;</code>
       */
      public boolean getResult() {
        return result_;
      }
      /**
       * <code>bool result = 1;</code>
       */
      public Builder setResult(boolean value) {
        
        result_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool result = 1;</code>
       */
      public Builder clearResult() {
        
        result_ = false;
        onChanged();
        return this;
      }

      private Object words_ = "";
      /**
       * <code>string words = 2;</code>
       */
      public String getWords() {
        Object ref = words_;
        if (!(ref instanceof String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          String s = bs.toStringUtf8();
          words_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      /**
       * <code>string words = 2;</code>
       */
      public com.google.protobuf.ByteString
          getWordsBytes() {
        Object ref = words_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (String) ref);
          words_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string words = 2;</code>
       */
      public Builder setWords(
          String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        words_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string words = 2;</code>
       */
      public Builder clearWords() {
        
        words_ = getDefaultInstance().getWords();
        onChanged();
        return this;
      }
      /**
       * <code>string words = 2;</code>
       */
      public Builder setWordsBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        words_ = value;
        onChanged();
        return this;
      }
      @Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:ResponseRemoveAccount)
    }

    // @@protoc_insertion_point(class_scope:ResponseRemoveAccount)
    private static final ResponseRemoveAccount DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new ResponseRemoveAccount();
    }

    public static ResponseRemoveAccount getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ResponseRemoveAccount>
        PARSER = new com.google.protobuf.AbstractParser<ResponseRemoveAccount>() {
      @Override
      public ResponseRemoveAccount parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new ResponseRemoveAccount(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<ResponseRemoveAccount> parser() {
      return PARSER;
    }

    @Override
    public com.google.protobuf.Parser<ResponseRemoveAccount> getParserForType() {
      return PARSER;
    }

    @Override
    public ResponseRemoveAccount getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface RequestGetAccountsOrBuilder extends
      // @@protoc_insertion_point(interface_extends:RequestGetAccounts)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>string groupname = 1;</code>
     */
    String getGroupname();
    /**
     * <code>string groupname = 1;</code>
     */
    com.google.protobuf.ByteString
        getGroupnameBytes();
  }
  /**
   * Protobuf type {@code RequestGetAccounts}
   */
  public  static final class RequestGetAccounts extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:RequestGetAccounts)
      RequestGetAccountsOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use RequestGetAccounts.newBuilder() to construct.
    private RequestGetAccounts(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private RequestGetAccounts() {
      groupname_ = "";
    }

    @Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private RequestGetAccounts(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new NullPointerException();
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
            case 10: {
              String s = input.readStringRequireUtf8();

              groupname_ = s;
              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
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
            e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return CBMessage.internal_static_RequestGetAccounts_descriptor;
    }

    @Override
    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return CBMessage.internal_static_RequestGetAccounts_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              RequestGetAccounts.class, Builder.class);
    }

    public static final int GROUPNAME_FIELD_NUMBER = 1;
    private volatile Object groupname_;
    /**
     * <code>string groupname = 1;</code>
     */
    public String getGroupname() {
      Object ref = groupname_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        groupname_ = s;
        return s;
      }
    }
    /**
     * <code>string groupname = 1;</code>
     */
    public com.google.protobuf.ByteString
        getGroupnameBytes() {
      Object ref = groupname_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        groupname_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    private byte memoizedIsInitialized = -1;
    @Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (!getGroupnameBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, groupname_);
      }
      unknownFields.writeTo(output);
    }

    @Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!getGroupnameBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, groupname_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @Override
    public boolean equals(final Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof RequestGetAccounts)) {
        return super.equals(obj);
      }
      RequestGetAccounts other = (RequestGetAccounts) obj;

      if (!getGroupname()
          .equals(other.getGroupname())) return false;
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + GROUPNAME_FIELD_NUMBER;
      hash = (53 * hash) + getGroupname().hashCode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static RequestGetAccounts parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static RequestGetAccounts parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static RequestGetAccounts parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static RequestGetAccounts parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static RequestGetAccounts parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static RequestGetAccounts parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static RequestGetAccounts parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static RequestGetAccounts parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static RequestGetAccounts parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static RequestGetAccounts parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static RequestGetAccounts parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static RequestGetAccounts parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(RequestGetAccounts prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @Override
    protected Builder newBuilderForType(
        BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code RequestGetAccounts}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:RequestGetAccounts)
        RequestGetAccountsOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return CBMessage.internal_static_RequestGetAccounts_descriptor;
      }

      @Override
      protected FieldAccessorTable
          internalGetFieldAccessorTable() {
        return CBMessage.internal_static_RequestGetAccounts_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                RequestGetAccounts.class, Builder.class);
      }

      // Construct using CBMessage.RequestGetAccounts.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      @Override
      public Builder clear() {
        super.clear();
        groupname_ = "";

        return this;
      }

      @Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return CBMessage.internal_static_RequestGetAccounts_descriptor;
      }

      @Override
      public RequestGetAccounts getDefaultInstanceForType() {
        return RequestGetAccounts.getDefaultInstance();
      }

      @Override
      public RequestGetAccounts build() {
        RequestGetAccounts result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @Override
      public RequestGetAccounts buildPartial() {
        RequestGetAccounts result = new RequestGetAccounts(this);
        result.groupname_ = groupname_;
        onBuilt();
        return result;
      }

      @Override
      public Builder clone() {
        return super.clone();
      }
      @Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return super.setField(field, value);
      }
      @Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return super.addRepeatedField(field, value);
      }
      @Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof RequestGetAccounts) {
          return mergeFrom((RequestGetAccounts)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(RequestGetAccounts other) {
        if (other == RequestGetAccounts.getDefaultInstance()) return this;
        if (!other.getGroupname().isEmpty()) {
          groupname_ = other.groupname_;
          onChanged();
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @Override
      public final boolean isInitialized() {
        return true;
      }

      @Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        RequestGetAccounts parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (RequestGetAccounts) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private Object groupname_ = "";
      /**
       * <code>string groupname = 1;</code>
       */
      public String getGroupname() {
        Object ref = groupname_;
        if (!(ref instanceof String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          String s = bs.toStringUtf8();
          groupname_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      /**
       * <code>string groupname = 1;</code>
       */
      public com.google.protobuf.ByteString
          getGroupnameBytes() {
        Object ref = groupname_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (String) ref);
          groupname_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string groupname = 1;</code>
       */
      public Builder setGroupname(
          String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        groupname_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string groupname = 1;</code>
       */
      public Builder clearGroupname() {
        
        groupname_ = getDefaultInstance().getGroupname();
        onChanged();
        return this;
      }
      /**
       * <code>string groupname = 1;</code>
       */
      public Builder setGroupnameBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        groupname_ = value;
        onChanged();
        return this;
      }
      @Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:RequestGetAccounts)
    }

    // @@protoc_insertion_point(class_scope:RequestGetAccounts)
    private static final RequestGetAccounts DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new RequestGetAccounts();
    }

    public static RequestGetAccounts getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<RequestGetAccounts>
        PARSER = new com.google.protobuf.AbstractParser<RequestGetAccounts>() {
      @Override
      public RequestGetAccounts parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new RequestGetAccounts(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<RequestGetAccounts> parser() {
      return PARSER;
    }

    @Override
    public com.google.protobuf.Parser<RequestGetAccounts> getParserForType() {
      return PARSER;
    }

    @Override
    public RequestGetAccounts getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface ResponseGetAccountsOrBuilder extends
      // @@protoc_insertion_point(interface_extends:ResponseGetAccounts)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>bool result = 1;</code>
     */
    boolean getResult();

    /**
     * <code>string words = 2;</code>
     */
    String getWords();
    /**
     * <code>string words = 2;</code>
     */
    com.google.protobuf.ByteString
        getWordsBytes();

    /**
     * <code>repeated .User accounts = 3;</code>
     */
    java.util.List<User>
        getAccountsList();
    /**
     * <code>repeated .User accounts = 3;</code>
     */
    User getAccounts(int index);
    /**
     * <code>repeated .User accounts = 3;</code>
     */
    int getAccountsCount();
    /**
     * <code>repeated .User accounts = 3;</code>
     */
    java.util.List<? extends UserOrBuilder>
        getAccountsOrBuilderList();
    /**
     * <code>repeated .User accounts = 3;</code>
     */
    UserOrBuilder getAccountsOrBuilder(
        int index);
  }
  /**
   * Protobuf type {@code ResponseGetAccounts}
   */
  public  static final class ResponseGetAccounts extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:ResponseGetAccounts)
      ResponseGetAccountsOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ResponseGetAccounts.newBuilder() to construct.
    private ResponseGetAccounts(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ResponseGetAccounts() {
      words_ = "";
      accounts_ = java.util.Collections.emptyList();
    }

    @Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private ResponseGetAccounts(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new NullPointerException();
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
            case 8: {

              result_ = input.readBool();
              break;
            }
            case 18: {
              String s = input.readStringRequireUtf8();

              words_ = s;
              break;
            }
            case 26: {
              if (!((mutable_bitField0_ & 0x00000004) != 0)) {
                accounts_ = new java.util.ArrayList<User>();
                mutable_bitField0_ |= 0x00000004;
              }
              accounts_.add(
                  input.readMessage(User.parser(), extensionRegistry));
              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
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
            e).setUnfinishedMessage(this);
      } finally {
        if (((mutable_bitField0_ & 0x00000004) != 0)) {
          accounts_ = java.util.Collections.unmodifiableList(accounts_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return CBMessage.internal_static_ResponseGetAccounts_descriptor;
    }

    @Override
    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return CBMessage.internal_static_ResponseGetAccounts_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ResponseGetAccounts.class, Builder.class);
    }

    private int bitField0_;
    public static final int RESULT_FIELD_NUMBER = 1;
    private boolean result_;
    /**
     * <code>bool result = 1;</code>
     */
    public boolean getResult() {
      return result_;
    }

    public static final int WORDS_FIELD_NUMBER = 2;
    private volatile Object words_;
    /**
     * <code>string words = 2;</code>
     */
    public String getWords() {
      Object ref = words_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        words_ = s;
        return s;
      }
    }
    /**
     * <code>string words = 2;</code>
     */
    public com.google.protobuf.ByteString
        getWordsBytes() {
      Object ref = words_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        words_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int ACCOUNTS_FIELD_NUMBER = 3;
    private java.util.List<User> accounts_;
    /**
     * <code>repeated .User accounts = 3;</code>
     */
    public java.util.List<User> getAccountsList() {
      return accounts_;
    }
    /**
     * <code>repeated .User accounts = 3;</code>
     */
    public java.util.List<? extends UserOrBuilder>
        getAccountsOrBuilderList() {
      return accounts_;
    }
    /**
     * <code>repeated .User accounts = 3;</code>
     */
    public int getAccountsCount() {
      return accounts_.size();
    }
    /**
     * <code>repeated .User accounts = 3;</code>
     */
    public User getAccounts(int index) {
      return accounts_.get(index);
    }
    /**
     * <code>repeated .User accounts = 3;</code>
     */
    public UserOrBuilder getAccountsOrBuilder(
        int index) {
      return accounts_.get(index);
    }

    private byte memoizedIsInitialized = -1;
    @Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (result_ != false) {
        output.writeBool(1, result_);
      }
      if (!getWordsBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, words_);
      }
      for (int i = 0; i < accounts_.size(); i++) {
        output.writeMessage(3, accounts_.get(i));
      }
      unknownFields.writeTo(output);
    }

    @Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (result_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(1, result_);
      }
      if (!getWordsBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, words_);
      }
      for (int i = 0; i < accounts_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(3, accounts_.get(i));
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @Override
    public boolean equals(final Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof ResponseGetAccounts)) {
        return super.equals(obj);
      }
      ResponseGetAccounts other = (ResponseGetAccounts) obj;

      if (getResult()
          != other.getResult()) return false;
      if (!getWords()
          .equals(other.getWords())) return false;
      if (!getAccountsList()
          .equals(other.getAccountsList())) return false;
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + RESULT_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getResult());
      hash = (37 * hash) + WORDS_FIELD_NUMBER;
      hash = (53 * hash) + getWords().hashCode();
      if (getAccountsCount() > 0) {
        hash = (37 * hash) + ACCOUNTS_FIELD_NUMBER;
        hash = (53 * hash) + getAccountsList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static ResponseGetAccounts parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static ResponseGetAccounts parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static ResponseGetAccounts parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static ResponseGetAccounts parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static ResponseGetAccounts parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static ResponseGetAccounts parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static ResponseGetAccounts parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static ResponseGetAccounts parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static ResponseGetAccounts parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static ResponseGetAccounts parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static ResponseGetAccounts parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static ResponseGetAccounts parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(ResponseGetAccounts prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @Override
    protected Builder newBuilderForType(
        BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code ResponseGetAccounts}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:ResponseGetAccounts)
        ResponseGetAccountsOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return CBMessage.internal_static_ResponseGetAccounts_descriptor;
      }

      @Override
      protected FieldAccessorTable
          internalGetFieldAccessorTable() {
        return CBMessage.internal_static_ResponseGetAccounts_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                ResponseGetAccounts.class, Builder.class);
      }

      // Construct using CBMessage.ResponseGetAccounts.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
          getAccountsFieldBuilder();
        }
      }
      @Override
      public Builder clear() {
        super.clear();
        result_ = false;

        words_ = "";

        if (accountsBuilder_ == null) {
          accounts_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000004);
        } else {
          accountsBuilder_.clear();
        }
        return this;
      }

      @Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return CBMessage.internal_static_ResponseGetAccounts_descriptor;
      }

      @Override
      public ResponseGetAccounts getDefaultInstanceForType() {
        return ResponseGetAccounts.getDefaultInstance();
      }

      @Override
      public ResponseGetAccounts build() {
        ResponseGetAccounts result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @Override
      public ResponseGetAccounts buildPartial() {
        ResponseGetAccounts result = new ResponseGetAccounts(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        result.result_ = result_;
        result.words_ = words_;
        if (accountsBuilder_ == null) {
          if (((bitField0_ & 0x00000004) != 0)) {
            accounts_ = java.util.Collections.unmodifiableList(accounts_);
            bitField0_ = (bitField0_ & ~0x00000004);
          }
          result.accounts_ = accounts_;
        } else {
          result.accounts_ = accountsBuilder_.build();
        }
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      @Override
      public Builder clone() {
        return super.clone();
      }
      @Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return super.setField(field, value);
      }
      @Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return super.addRepeatedField(field, value);
      }
      @Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof ResponseGetAccounts) {
          return mergeFrom((ResponseGetAccounts)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(ResponseGetAccounts other) {
        if (other == ResponseGetAccounts.getDefaultInstance()) return this;
        if (other.getResult() != false) {
          setResult(other.getResult());
        }
        if (!other.getWords().isEmpty()) {
          words_ = other.words_;
          onChanged();
        }
        if (accountsBuilder_ == null) {
          if (!other.accounts_.isEmpty()) {
            if (accounts_.isEmpty()) {
              accounts_ = other.accounts_;
              bitField0_ = (bitField0_ & ~0x00000004);
            } else {
              ensureAccountsIsMutable();
              accounts_.addAll(other.accounts_);
            }
            onChanged();
          }
        } else {
          if (!other.accounts_.isEmpty()) {
            if (accountsBuilder_.isEmpty()) {
              accountsBuilder_.dispose();
              accountsBuilder_ = null;
              accounts_ = other.accounts_;
              bitField0_ = (bitField0_ & ~0x00000004);
              accountsBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getAccountsFieldBuilder() : null;
            } else {
              accountsBuilder_.addAllMessages(other.accounts_);
            }
          }
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @Override
      public final boolean isInitialized() {
        return true;
      }

      @Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        ResponseGetAccounts parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (ResponseGetAccounts) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private boolean result_ ;
      /**
       * <code>bool result = 1;</code>
       */
      public boolean getResult() {
        return result_;
      }
      /**
       * <code>bool result = 1;</code>
       */
      public Builder setResult(boolean value) {
        
        result_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool result = 1;</code>
       */
      public Builder clearResult() {
        
        result_ = false;
        onChanged();
        return this;
      }

      private Object words_ = "";
      /**
       * <code>string words = 2;</code>
       */
      public String getWords() {
        Object ref = words_;
        if (!(ref instanceof String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          String s = bs.toStringUtf8();
          words_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      /**
       * <code>string words = 2;</code>
       */
      public com.google.protobuf.ByteString
          getWordsBytes() {
        Object ref = words_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (String) ref);
          words_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string words = 2;</code>
       */
      public Builder setWords(
          String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        words_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string words = 2;</code>
       */
      public Builder clearWords() {
        
        words_ = getDefaultInstance().getWords();
        onChanged();
        return this;
      }
      /**
       * <code>string words = 2;</code>
       */
      public Builder setWordsBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        words_ = value;
        onChanged();
        return this;
      }

      private java.util.List<User> accounts_ =
        java.util.Collections.emptyList();
      private void ensureAccountsIsMutable() {
        if (!((bitField0_ & 0x00000004) != 0)) {
          accounts_ = new java.util.ArrayList<User>(accounts_);
          bitField0_ |= 0x00000004;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          User, User.Builder, UserOrBuilder> accountsBuilder_;

      /**
       * <code>repeated .User accounts = 3;</code>
       */
      public java.util.List<User> getAccountsList() {
        if (accountsBuilder_ == null) {
          return java.util.Collections.unmodifiableList(accounts_);
        } else {
          return accountsBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .User accounts = 3;</code>
       */
      public int getAccountsCount() {
        if (accountsBuilder_ == null) {
          return accounts_.size();
        } else {
          return accountsBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .User accounts = 3;</code>
       */
      public User getAccounts(int index) {
        if (accountsBuilder_ == null) {
          return accounts_.get(index);
        } else {
          return accountsBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .User accounts = 3;</code>
       */
      public Builder setAccounts(
          int index, User value) {
        if (accountsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureAccountsIsMutable();
          accounts_.set(index, value);
          onChanged();
        } else {
          accountsBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .User accounts = 3;</code>
       */
      public Builder setAccounts(
          int index, User.Builder builderForValue) {
        if (accountsBuilder_ == null) {
          ensureAccountsIsMutable();
          accounts_.set(index, builderForValue.build());
          onChanged();
        } else {
          accountsBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .User accounts = 3;</code>
       */
      public Builder addAccounts(User value) {
        if (accountsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureAccountsIsMutable();
          accounts_.add(value);
          onChanged();
        } else {
          accountsBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .User accounts = 3;</code>
       */
      public Builder addAccounts(
          int index, User value) {
        if (accountsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureAccountsIsMutable();
          accounts_.add(index, value);
          onChanged();
        } else {
          accountsBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .User accounts = 3;</code>
       */
      public Builder addAccounts(
          User.Builder builderForValue) {
        if (accountsBuilder_ == null) {
          ensureAccountsIsMutable();
          accounts_.add(builderForValue.build());
          onChanged();
        } else {
          accountsBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .User accounts = 3;</code>
       */
      public Builder addAccounts(
          int index, User.Builder builderForValue) {
        if (accountsBuilder_ == null) {
          ensureAccountsIsMutable();
          accounts_.add(index, builderForValue.build());
          onChanged();
        } else {
          accountsBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .User accounts = 3;</code>
       */
      public Builder addAllAccounts(
          Iterable<? extends User> values) {
        if (accountsBuilder_ == null) {
          ensureAccountsIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, accounts_);
          onChanged();
        } else {
          accountsBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .User accounts = 3;</code>
       */
      public Builder clearAccounts() {
        if (accountsBuilder_ == null) {
          accounts_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000004);
          onChanged();
        } else {
          accountsBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .User accounts = 3;</code>
       */
      public Builder removeAccounts(int index) {
        if (accountsBuilder_ == null) {
          ensureAccountsIsMutable();
          accounts_.remove(index);
          onChanged();
        } else {
          accountsBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .User accounts = 3;</code>
       */
      public User.Builder getAccountsBuilder(
          int index) {
        return getAccountsFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .User accounts = 3;</code>
       */
      public UserOrBuilder getAccountsOrBuilder(
          int index) {
        if (accountsBuilder_ == null) {
          return accounts_.get(index);  } else {
          return accountsBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .User accounts = 3;</code>
       */
      public java.util.List<? extends UserOrBuilder>
           getAccountsOrBuilderList() {
        if (accountsBuilder_ != null) {
          return accountsBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(accounts_);
        }
      }
      /**
       * <code>repeated .User accounts = 3;</code>
       */
      public User.Builder addAccountsBuilder() {
        return getAccountsFieldBuilder().addBuilder(
            User.getDefaultInstance());
      }
      /**
       * <code>repeated .User accounts = 3;</code>
       */
      public User.Builder addAccountsBuilder(
          int index) {
        return getAccountsFieldBuilder().addBuilder(
            index, User.getDefaultInstance());
      }
      /**
       * <code>repeated .User accounts = 3;</code>
       */
      public java.util.List<User.Builder>
           getAccountsBuilderList() {
        return getAccountsFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          User, User.Builder, UserOrBuilder>
          getAccountsFieldBuilder() {
        if (accountsBuilder_ == null) {
          accountsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              User, User.Builder, UserOrBuilder>(
                  accounts_,
                  ((bitField0_ & 0x00000004) != 0),
                  getParentForChildren(),
                  isClean());
          accounts_ = null;
        }
        return accountsBuilder_;
      }
      @Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:ResponseGetAccounts)
    }

    // @@protoc_insertion_point(class_scope:ResponseGetAccounts)
    private static final ResponseGetAccounts DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new ResponseGetAccounts();
    }

    public static ResponseGetAccounts getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ResponseGetAccounts>
        PARSER = new com.google.protobuf.AbstractParser<ResponseGetAccounts>() {
      @Override
      public ResponseGetAccounts parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new ResponseGetAccounts(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<ResponseGetAccounts> parser() {
      return PARSER;
    }

    @Override
    public com.google.protobuf.Parser<ResponseGetAccounts> getParserForType() {
      return PARSER;
    }

    @Override
    public ResponseGetAccounts getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface RequestEditNicknameOrBuilder extends
      // @@protoc_insertion_point(interface_extends:RequestEditNickname)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>string groupname = 1;</code>
     */
    String getGroupname();
    /**
     * <code>string groupname = 1;</code>
     */
    com.google.protobuf.ByteString
        getGroupnameBytes();

    /**
     * <code>string username = 2;</code>
     */
    String getUsername();
    /**
     * <code>string username = 2;</code>
     */
    com.google.protobuf.ByteString
        getUsernameBytes();

    /**
     * <code>string nickname = 3;</code>
     */
    String getNickname();
    /**
     * <code>string nickname = 3;</code>
     */
    com.google.protobuf.ByteString
        getNicknameBytes();
  }
  /**
   * Protobuf type {@code RequestEditNickname}
   */
  public  static final class RequestEditNickname extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:RequestEditNickname)
      RequestEditNicknameOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use RequestEditNickname.newBuilder() to construct.
    private RequestEditNickname(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private RequestEditNickname() {
      groupname_ = "";
      username_ = "";
      nickname_ = "";
    }

    @Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private RequestEditNickname(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new NullPointerException();
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
            case 10: {
              String s = input.readStringRequireUtf8();

              groupname_ = s;
              break;
            }
            case 18: {
              String s = input.readStringRequireUtf8();

              username_ = s;
              break;
            }
            case 26: {
              String s = input.readStringRequireUtf8();

              nickname_ = s;
              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
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
            e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return CBMessage.internal_static_RequestEditNickname_descriptor;
    }

    @Override
    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return CBMessage.internal_static_RequestEditNickname_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              RequestEditNickname.class, Builder.class);
    }

    public static final int GROUPNAME_FIELD_NUMBER = 1;
    private volatile Object groupname_;
    /**
     * <code>string groupname = 1;</code>
     */
    public String getGroupname() {
      Object ref = groupname_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        groupname_ = s;
        return s;
      }
    }
    /**
     * <code>string groupname = 1;</code>
     */
    public com.google.protobuf.ByteString
        getGroupnameBytes() {
      Object ref = groupname_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        groupname_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int USERNAME_FIELD_NUMBER = 2;
    private volatile Object username_;
    /**
     * <code>string username = 2;</code>
     */
    public String getUsername() {
      Object ref = username_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        username_ = s;
        return s;
      }
    }
    /**
     * <code>string username = 2;</code>
     */
    public com.google.protobuf.ByteString
        getUsernameBytes() {
      Object ref = username_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        username_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int NICKNAME_FIELD_NUMBER = 3;
    private volatile Object nickname_;
    /**
     * <code>string nickname = 3;</code>
     */
    public String getNickname() {
      Object ref = nickname_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        nickname_ = s;
        return s;
      }
    }
    /**
     * <code>string nickname = 3;</code>
     */
    public com.google.protobuf.ByteString
        getNicknameBytes() {
      Object ref = nickname_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        nickname_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    private byte memoizedIsInitialized = -1;
    @Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (!getGroupnameBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, groupname_);
      }
      if (!getUsernameBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, username_);
      }
      if (!getNicknameBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 3, nickname_);
      }
      unknownFields.writeTo(output);
    }

    @Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!getGroupnameBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, groupname_);
      }
      if (!getUsernameBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, username_);
      }
      if (!getNicknameBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, nickname_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @Override
    public boolean equals(final Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof RequestEditNickname)) {
        return super.equals(obj);
      }
      RequestEditNickname other = (RequestEditNickname) obj;

      if (!getGroupname()
          .equals(other.getGroupname())) return false;
      if (!getUsername()
          .equals(other.getUsername())) return false;
      if (!getNickname()
          .equals(other.getNickname())) return false;
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + GROUPNAME_FIELD_NUMBER;
      hash = (53 * hash) + getGroupname().hashCode();
      hash = (37 * hash) + USERNAME_FIELD_NUMBER;
      hash = (53 * hash) + getUsername().hashCode();
      hash = (37 * hash) + NICKNAME_FIELD_NUMBER;
      hash = (53 * hash) + getNickname().hashCode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static RequestEditNickname parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static RequestEditNickname parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static RequestEditNickname parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static RequestEditNickname parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static RequestEditNickname parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static RequestEditNickname parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static RequestEditNickname parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static RequestEditNickname parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static RequestEditNickname parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static RequestEditNickname parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static RequestEditNickname parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static RequestEditNickname parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(RequestEditNickname prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @Override
    protected Builder newBuilderForType(
        BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code RequestEditNickname}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:RequestEditNickname)
        RequestEditNicknameOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return CBMessage.internal_static_RequestEditNickname_descriptor;
      }

      @Override
      protected FieldAccessorTable
          internalGetFieldAccessorTable() {
        return CBMessage.internal_static_RequestEditNickname_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                RequestEditNickname.class, Builder.class);
      }

      // Construct using CBMessage.RequestEditNickname.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      @Override
      public Builder clear() {
        super.clear();
        groupname_ = "";

        username_ = "";

        nickname_ = "";

        return this;
      }

      @Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return CBMessage.internal_static_RequestEditNickname_descriptor;
      }

      @Override
      public RequestEditNickname getDefaultInstanceForType() {
        return RequestEditNickname.getDefaultInstance();
      }

      @Override
      public RequestEditNickname build() {
        RequestEditNickname result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @Override
      public RequestEditNickname buildPartial() {
        RequestEditNickname result = new RequestEditNickname(this);
        result.groupname_ = groupname_;
        result.username_ = username_;
        result.nickname_ = nickname_;
        onBuilt();
        return result;
      }

      @Override
      public Builder clone() {
        return super.clone();
      }
      @Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return super.setField(field, value);
      }
      @Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return super.addRepeatedField(field, value);
      }
      @Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof RequestEditNickname) {
          return mergeFrom((RequestEditNickname)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(RequestEditNickname other) {
        if (other == RequestEditNickname.getDefaultInstance()) return this;
        if (!other.getGroupname().isEmpty()) {
          groupname_ = other.groupname_;
          onChanged();
        }
        if (!other.getUsername().isEmpty()) {
          username_ = other.username_;
          onChanged();
        }
        if (!other.getNickname().isEmpty()) {
          nickname_ = other.nickname_;
          onChanged();
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @Override
      public final boolean isInitialized() {
        return true;
      }

      @Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        RequestEditNickname parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (RequestEditNickname) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private Object groupname_ = "";
      /**
       * <code>string groupname = 1;</code>
       */
      public String getGroupname() {
        Object ref = groupname_;
        if (!(ref instanceof String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          String s = bs.toStringUtf8();
          groupname_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      /**
       * <code>string groupname = 1;</code>
       */
      public com.google.protobuf.ByteString
          getGroupnameBytes() {
        Object ref = groupname_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (String) ref);
          groupname_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string groupname = 1;</code>
       */
      public Builder setGroupname(
          String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        groupname_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string groupname = 1;</code>
       */
      public Builder clearGroupname() {
        
        groupname_ = getDefaultInstance().getGroupname();
        onChanged();
        return this;
      }
      /**
       * <code>string groupname = 1;</code>
       */
      public Builder setGroupnameBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        groupname_ = value;
        onChanged();
        return this;
      }

      private Object username_ = "";
      /**
       * <code>string username = 2;</code>
       */
      public String getUsername() {
        Object ref = username_;
        if (!(ref instanceof String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          String s = bs.toStringUtf8();
          username_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      /**
       * <code>string username = 2;</code>
       */
      public com.google.protobuf.ByteString
          getUsernameBytes() {
        Object ref = username_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (String) ref);
          username_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string username = 2;</code>
       */
      public Builder setUsername(
          String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        username_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string username = 2;</code>
       */
      public Builder clearUsername() {
        
        username_ = getDefaultInstance().getUsername();
        onChanged();
        return this;
      }
      /**
       * <code>string username = 2;</code>
       */
      public Builder setUsernameBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        username_ = value;
        onChanged();
        return this;
      }

      private Object nickname_ = "";
      /**
       * <code>string nickname = 3;</code>
       */
      public String getNickname() {
        Object ref = nickname_;
        if (!(ref instanceof String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          String s = bs.toStringUtf8();
          nickname_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      /**
       * <code>string nickname = 3;</code>
       */
      public com.google.protobuf.ByteString
          getNicknameBytes() {
        Object ref = nickname_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (String) ref);
          nickname_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string nickname = 3;</code>
       */
      public Builder setNickname(
          String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        nickname_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string nickname = 3;</code>
       */
      public Builder clearNickname() {
        
        nickname_ = getDefaultInstance().getNickname();
        onChanged();
        return this;
      }
      /**
       * <code>string nickname = 3;</code>
       */
      public Builder setNicknameBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        nickname_ = value;
        onChanged();
        return this;
      }
      @Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:RequestEditNickname)
    }

    // @@protoc_insertion_point(class_scope:RequestEditNickname)
    private static final RequestEditNickname DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new RequestEditNickname();
    }

    public static RequestEditNickname getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<RequestEditNickname>
        PARSER = new com.google.protobuf.AbstractParser<RequestEditNickname>() {
      @Override
      public RequestEditNickname parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new RequestEditNickname(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<RequestEditNickname> parser() {
      return PARSER;
    }

    @Override
    public com.google.protobuf.Parser<RequestEditNickname> getParserForType() {
      return PARSER;
    }

    @Override
    public RequestEditNickname getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface ResponseEditNicknameOrBuilder extends
      // @@protoc_insertion_point(interface_extends:ResponseEditNickname)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>bool result = 1;</code>
     */
    boolean getResult();

    /**
     * <code>string words = 2;</code>
     */
    String getWords();
    /**
     * <code>string words = 2;</code>
     */
    com.google.protobuf.ByteString
        getWordsBytes();

    /**
     * <code>string nickname = 3;</code>
     */
    String getNickname();
    /**
     * <code>string nickname = 3;</code>
     */
    com.google.protobuf.ByteString
        getNicknameBytes();
  }
  /**
   * Protobuf type {@code ResponseEditNickname}
   */
  public  static final class ResponseEditNickname extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:ResponseEditNickname)
      ResponseEditNicknameOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ResponseEditNickname.newBuilder() to construct.
    private ResponseEditNickname(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ResponseEditNickname() {
      words_ = "";
      nickname_ = "";
    }

    @Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private ResponseEditNickname(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new NullPointerException();
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
            case 8: {

              result_ = input.readBool();
              break;
            }
            case 18: {
              String s = input.readStringRequireUtf8();

              words_ = s;
              break;
            }
            case 26: {
              String s = input.readStringRequireUtf8();

              nickname_ = s;
              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
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
            e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return CBMessage.internal_static_ResponseEditNickname_descriptor;
    }

    @Override
    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return CBMessage.internal_static_ResponseEditNickname_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ResponseEditNickname.class, Builder.class);
    }

    public static final int RESULT_FIELD_NUMBER = 1;
    private boolean result_;
    /**
     * <code>bool result = 1;</code>
     */
    public boolean getResult() {
      return result_;
    }

    public static final int WORDS_FIELD_NUMBER = 2;
    private volatile Object words_;
    /**
     * <code>string words = 2;</code>
     */
    public String getWords() {
      Object ref = words_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        words_ = s;
        return s;
      }
    }
    /**
     * <code>string words = 2;</code>
     */
    public com.google.protobuf.ByteString
        getWordsBytes() {
      Object ref = words_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        words_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int NICKNAME_FIELD_NUMBER = 3;
    private volatile Object nickname_;
    /**
     * <code>string nickname = 3;</code>
     */
    public String getNickname() {
      Object ref = nickname_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        nickname_ = s;
        return s;
      }
    }
    /**
     * <code>string nickname = 3;</code>
     */
    public com.google.protobuf.ByteString
        getNicknameBytes() {
      Object ref = nickname_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        nickname_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    private byte memoizedIsInitialized = -1;
    @Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (result_ != false) {
        output.writeBool(1, result_);
      }
      if (!getWordsBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, words_);
      }
      if (!getNicknameBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 3, nickname_);
      }
      unknownFields.writeTo(output);
    }

    @Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (result_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(1, result_);
      }
      if (!getWordsBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, words_);
      }
      if (!getNicknameBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, nickname_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @Override
    public boolean equals(final Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof ResponseEditNickname)) {
        return super.equals(obj);
      }
      ResponseEditNickname other = (ResponseEditNickname) obj;

      if (getResult()
          != other.getResult()) return false;
      if (!getWords()
          .equals(other.getWords())) return false;
      if (!getNickname()
          .equals(other.getNickname())) return false;
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + RESULT_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getResult());
      hash = (37 * hash) + WORDS_FIELD_NUMBER;
      hash = (53 * hash) + getWords().hashCode();
      hash = (37 * hash) + NICKNAME_FIELD_NUMBER;
      hash = (53 * hash) + getNickname().hashCode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static ResponseEditNickname parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static ResponseEditNickname parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static ResponseEditNickname parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static ResponseEditNickname parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static ResponseEditNickname parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static ResponseEditNickname parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static ResponseEditNickname parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static ResponseEditNickname parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static ResponseEditNickname parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static ResponseEditNickname parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static ResponseEditNickname parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static ResponseEditNickname parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(ResponseEditNickname prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @Override
    protected Builder newBuilderForType(
        BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code ResponseEditNickname}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:ResponseEditNickname)
        ResponseEditNicknameOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return CBMessage.internal_static_ResponseEditNickname_descriptor;
      }

      @Override
      protected FieldAccessorTable
          internalGetFieldAccessorTable() {
        return CBMessage.internal_static_ResponseEditNickname_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                ResponseEditNickname.class, Builder.class);
      }

      // Construct using CBMessage.ResponseEditNickname.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      @Override
      public Builder clear() {
        super.clear();
        result_ = false;

        words_ = "";

        nickname_ = "";

        return this;
      }

      @Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return CBMessage.internal_static_ResponseEditNickname_descriptor;
      }

      @Override
      public ResponseEditNickname getDefaultInstanceForType() {
        return ResponseEditNickname.getDefaultInstance();
      }

      @Override
      public ResponseEditNickname build() {
        ResponseEditNickname result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @Override
      public ResponseEditNickname buildPartial() {
        ResponseEditNickname result = new ResponseEditNickname(this);
        result.result_ = result_;
        result.words_ = words_;
        result.nickname_ = nickname_;
        onBuilt();
        return result;
      }

      @Override
      public Builder clone() {
        return super.clone();
      }
      @Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return super.setField(field, value);
      }
      @Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return super.addRepeatedField(field, value);
      }
      @Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof ResponseEditNickname) {
          return mergeFrom((ResponseEditNickname)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(ResponseEditNickname other) {
        if (other == ResponseEditNickname.getDefaultInstance()) return this;
        if (other.getResult() != false) {
          setResult(other.getResult());
        }
        if (!other.getWords().isEmpty()) {
          words_ = other.words_;
          onChanged();
        }
        if (!other.getNickname().isEmpty()) {
          nickname_ = other.nickname_;
          onChanged();
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @Override
      public final boolean isInitialized() {
        return true;
      }

      @Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        ResponseEditNickname parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (ResponseEditNickname) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private boolean result_ ;
      /**
       * <code>bool result = 1;</code>
       */
      public boolean getResult() {
        return result_;
      }
      /**
       * <code>bool result = 1;</code>
       */
      public Builder setResult(boolean value) {
        
        result_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool result = 1;</code>
       */
      public Builder clearResult() {
        
        result_ = false;
        onChanged();
        return this;
      }

      private Object words_ = "";
      /**
       * <code>string words = 2;</code>
       */
      public String getWords() {
        Object ref = words_;
        if (!(ref instanceof String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          String s = bs.toStringUtf8();
          words_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      /**
       * <code>string words = 2;</code>
       */
      public com.google.protobuf.ByteString
          getWordsBytes() {
        Object ref = words_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (String) ref);
          words_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string words = 2;</code>
       */
      public Builder setWords(
          String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        words_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string words = 2;</code>
       */
      public Builder clearWords() {
        
        words_ = getDefaultInstance().getWords();
        onChanged();
        return this;
      }
      /**
       * <code>string words = 2;</code>
       */
      public Builder setWordsBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        words_ = value;
        onChanged();
        return this;
      }

      private Object nickname_ = "";
      /**
       * <code>string nickname = 3;</code>
       */
      public String getNickname() {
        Object ref = nickname_;
        if (!(ref instanceof String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          String s = bs.toStringUtf8();
          nickname_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      /**
       * <code>string nickname = 3;</code>
       */
      public com.google.protobuf.ByteString
          getNicknameBytes() {
        Object ref = nickname_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (String) ref);
          nickname_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string nickname = 3;</code>
       */
      public Builder setNickname(
          String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        nickname_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string nickname = 3;</code>
       */
      public Builder clearNickname() {
        
        nickname_ = getDefaultInstance().getNickname();
        onChanged();
        return this;
      }
      /**
       * <code>string nickname = 3;</code>
       */
      public Builder setNicknameBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        nickname_ = value;
        onChanged();
        return this;
      }
      @Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:ResponseEditNickname)
    }

    // @@protoc_insertion_point(class_scope:ResponseEditNickname)
    private static final ResponseEditNickname DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new ResponseEditNickname();
    }

    public static ResponseEditNickname getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ResponseEditNickname>
        PARSER = new com.google.protobuf.AbstractParser<ResponseEditNickname>() {
      @Override
      public ResponseEditNickname parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new ResponseEditNickname(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<ResponseEditNickname> parser() {
      return PARSER;
    }

    @Override
    public com.google.protobuf.Parser<ResponseEditNickname> getParserForType() {
      return PARSER;
    }

    @Override
    public ResponseEditNickname getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface RequestGetRecordsOrBuilder extends
      // @@protoc_insertion_point(interface_extends:RequestGetRecords)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>string groupname = 1;</code>
     */
    String getGroupname();
    /**
     * <code>string groupname = 1;</code>
     */
    com.google.protobuf.ByteString
        getGroupnameBytes();

    /**
     * <code>string username = 2;</code>
     */
    String getUsername();
    /**
     * <code>string username = 2;</code>
     */
    com.google.protobuf.ByteString
        getUsernameBytes();

    /**
     * <code>.SortType sort_type = 3;</code>
     */
    int getSortTypeValue();
    /**
     * <code>.SortType sort_type = 3;</code>
     */
    SortType getSortType();

    /**
     * <code>bool ascending = 4;</code>
     */
    boolean getAscending();

    /**
     * <code>repeated .SearchType search_types = 5;</code>
     */
    java.util.List<SearchType> getSearchTypesList();
    /**
     * <code>repeated .SearchType search_types = 5;</code>
     */
    int getSearchTypesCount();
    /**
     * <code>repeated .SearchType search_types = 5;</code>
     */
    SearchType getSearchTypes(int index);
    /**
     * <code>repeated .SearchType search_types = 5;</code>
     */
    java.util.List<Integer>
    getSearchTypesValueList();
    /**
     * <code>repeated .SearchType search_types = 5;</code>
     */
    int getSearchTypesValue(int index);

    /**
     * <code>repeated string search_values = 6;</code>
     */
    java.util.List<String>
        getSearchValuesList();
    /**
     * <code>repeated string search_values = 6;</code>
     */
    int getSearchValuesCount();
    /**
     * <code>repeated string search_values = 6;</code>
     */
    String getSearchValues(int index);
    /**
     * <code>repeated string search_values = 6;</code>
     */
    com.google.protobuf.ByteString
        getSearchValuesBytes(int index);

    /**
     * <code>int32 page_size = 7;</code>
     */
    int getPageSize();

    /**
     * <code>int32 page_idx = 8;</code>
     */
    int getPageIdx();

    /**
     * <code>bool only_count = 9;</code>
     */
    boolean getOnlyCount();
  }
  /**
   * Protobuf type {@code RequestGetRecords}
   */
  public  static final class RequestGetRecords extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:RequestGetRecords)
      RequestGetRecordsOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use RequestGetRecords.newBuilder() to construct.
    private RequestGetRecords(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private RequestGetRecords() {
      groupname_ = "";
      username_ = "";
      sortType_ = 0;
      searchTypes_ = java.util.Collections.emptyList();
      searchValues_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    }

    @Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private RequestGetRecords(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new NullPointerException();
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
            case 10: {
              String s = input.readStringRequireUtf8();

              groupname_ = s;
              break;
            }
            case 18: {
              String s = input.readStringRequireUtf8();

              username_ = s;
              break;
            }
            case 24: {
              int rawValue = input.readEnum();

              sortType_ = rawValue;
              break;
            }
            case 32: {

              ascending_ = input.readBool();
              break;
            }
            case 40: {
              int rawValue = input.readEnum();
              if (!((mutable_bitField0_ & 0x00000010) != 0)) {
                searchTypes_ = new java.util.ArrayList<Integer>();
                mutable_bitField0_ |= 0x00000010;
              }
              searchTypes_.add(rawValue);
              break;
            }
            case 42: {
              int length = input.readRawVarint32();
              int oldLimit = input.pushLimit(length);
              while(input.getBytesUntilLimit() > 0) {
                int rawValue = input.readEnum();
                if (!((mutable_bitField0_ & 0x00000010) != 0)) {
                  searchTypes_ = new java.util.ArrayList<Integer>();
                  mutable_bitField0_ |= 0x00000010;
                }
                searchTypes_.add(rawValue);
              }
              input.popLimit(oldLimit);
              break;
            }
            case 50: {
              String s = input.readStringRequireUtf8();
              if (!((mutable_bitField0_ & 0x00000020) != 0)) {
                searchValues_ = new com.google.protobuf.LazyStringArrayList();
                mutable_bitField0_ |= 0x00000020;
              }
              searchValues_.add(s);
              break;
            }
            case 56: {

              pageSize_ = input.readInt32();
              break;
            }
            case 64: {

              pageIdx_ = input.readInt32();
              break;
            }
            case 72: {

              onlyCount_ = input.readBool();
              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
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
            e).setUnfinishedMessage(this);
      } finally {
        if (((mutable_bitField0_ & 0x00000010) != 0)) {
          searchTypes_ = java.util.Collections.unmodifiableList(searchTypes_);
        }
        if (((mutable_bitField0_ & 0x00000020) != 0)) {
          searchValues_ = searchValues_.getUnmodifiableView();
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return CBMessage.internal_static_RequestGetRecords_descriptor;
    }

    @Override
    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return CBMessage.internal_static_RequestGetRecords_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              RequestGetRecords.class, Builder.class);
    }

    private int bitField0_;
    public static final int GROUPNAME_FIELD_NUMBER = 1;
    private volatile Object groupname_;
    /**
     * <code>string groupname = 1;</code>
     */
    public String getGroupname() {
      Object ref = groupname_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        groupname_ = s;
        return s;
      }
    }
    /**
     * <code>string groupname = 1;</code>
     */
    public com.google.protobuf.ByteString
        getGroupnameBytes() {
      Object ref = groupname_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        groupname_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int USERNAME_FIELD_NUMBER = 2;
    private volatile Object username_;
    /**
     * <code>string username = 2;</code>
     */
    public String getUsername() {
      Object ref = username_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        username_ = s;
        return s;
      }
    }
    /**
     * <code>string username = 2;</code>
     */
    public com.google.protobuf.ByteString
        getUsernameBytes() {
      Object ref = username_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        username_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int SORT_TYPE_FIELD_NUMBER = 3;
    private int sortType_;
    /**
     * <code>.SortType sort_type = 3;</code>
     */
    public int getSortTypeValue() {
      return sortType_;
    }
    /**
     * <code>.SortType sort_type = 3;</code>
     */
    public SortType getSortType() {
      @SuppressWarnings("deprecation")
      SortType result = SortType.valueOf(sortType_);
      return result == null ? SortType.UNRECOGNIZED : result;
    }

    public static final int ASCENDING_FIELD_NUMBER = 4;
    private boolean ascending_;
    /**
     * <code>bool ascending = 4;</code>
     */
    public boolean getAscending() {
      return ascending_;
    }

    public static final int SEARCH_TYPES_FIELD_NUMBER = 5;
    private java.util.List<Integer> searchTypes_;
    private static final com.google.protobuf.Internal.ListAdapter.Converter<
        Integer, SearchType> searchTypes_converter_ =
            new com.google.protobuf.Internal.ListAdapter.Converter<
                Integer, SearchType>() {
              public SearchType convert(Integer from) {
                @SuppressWarnings("deprecation")
                SearchType result = SearchType.valueOf(from);
                return result == null ? SearchType.UNRECOGNIZED : result;
              }
            };
    /**
     * <code>repeated .SearchType search_types = 5;</code>
     */
    public java.util.List<SearchType> getSearchTypesList() {
      return new com.google.protobuf.Internal.ListAdapter<
          Integer, SearchType>(searchTypes_, searchTypes_converter_);
    }
    /**
     * <code>repeated .SearchType search_types = 5;</code>
     */
    public int getSearchTypesCount() {
      return searchTypes_.size();
    }
    /**
     * <code>repeated .SearchType search_types = 5;</code>
     */
    public SearchType getSearchTypes(int index) {
      return searchTypes_converter_.convert(searchTypes_.get(index));
    }
    /**
     * <code>repeated .SearchType search_types = 5;</code>
     */
    public java.util.List<Integer>
    getSearchTypesValueList() {
      return searchTypes_;
    }
    /**
     * <code>repeated .SearchType search_types = 5;</code>
     */
    public int getSearchTypesValue(int index) {
      return searchTypes_.get(index);
    }
    private int searchTypesMemoizedSerializedSize;

    public static final int SEARCH_VALUES_FIELD_NUMBER = 6;
    private com.google.protobuf.LazyStringList searchValues_;
    /**
     * <code>repeated string search_values = 6;</code>
     */
    public com.google.protobuf.ProtocolStringList
        getSearchValuesList() {
      return searchValues_;
    }
    /**
     * <code>repeated string search_values = 6;</code>
     */
    public int getSearchValuesCount() {
      return searchValues_.size();
    }
    /**
     * <code>repeated string search_values = 6;</code>
     */
    public String getSearchValues(int index) {
      return searchValues_.get(index);
    }
    /**
     * <code>repeated string search_values = 6;</code>
     */
    public com.google.protobuf.ByteString
        getSearchValuesBytes(int index) {
      return searchValues_.getByteString(index);
    }

    public static final int PAGE_SIZE_FIELD_NUMBER = 7;
    private int pageSize_;
    /**
     * <code>int32 page_size = 7;</code>
     */
    public int getPageSize() {
      return pageSize_;
    }

    public static final int PAGE_IDX_FIELD_NUMBER = 8;
    private int pageIdx_;
    /**
     * <code>int32 page_idx = 8;</code>
     */
    public int getPageIdx() {
      return pageIdx_;
    }

    public static final int ONLY_COUNT_FIELD_NUMBER = 9;
    private boolean onlyCount_;
    /**
     * <code>bool only_count = 9;</code>
     */
    public boolean getOnlyCount() {
      return onlyCount_;
    }

    private byte memoizedIsInitialized = -1;
    @Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (!getGroupnameBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, groupname_);
      }
      if (!getUsernameBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, username_);
      }
      if (sortType_ != SortType.SORT_ID.getNumber()) {
        output.writeEnum(3, sortType_);
      }
      if (ascending_ != false) {
        output.writeBool(4, ascending_);
      }
      if (getSearchTypesList().size() > 0) {
        output.writeUInt32NoTag(42);
        output.writeUInt32NoTag(searchTypesMemoizedSerializedSize);
      }
      for (int i = 0; i < searchTypes_.size(); i++) {
        output.writeEnumNoTag(searchTypes_.get(i));
      }
      for (int i = 0; i < searchValues_.size(); i++) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 6, searchValues_.getRaw(i));
      }
      if (pageSize_ != 0) {
        output.writeInt32(7, pageSize_);
      }
      if (pageIdx_ != 0) {
        output.writeInt32(8, pageIdx_);
      }
      if (onlyCount_ != false) {
        output.writeBool(9, onlyCount_);
      }
      unknownFields.writeTo(output);
    }

    @Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!getGroupnameBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, groupname_);
      }
      if (!getUsernameBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, username_);
      }
      if (sortType_ != SortType.SORT_ID.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(3, sortType_);
      }
      if (ascending_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(4, ascending_);
      }
      {
        int dataSize = 0;
        for (int i = 0; i < searchTypes_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeEnumSizeNoTag(searchTypes_.get(i));
        }
        size += dataSize;
        if (!getSearchTypesList().isEmpty()) {  size += 1;
          size += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(dataSize);
        }searchTypesMemoizedSerializedSize = dataSize;
      }
      {
        int dataSize = 0;
        for (int i = 0; i < searchValues_.size(); i++) {
          dataSize += computeStringSizeNoTag(searchValues_.getRaw(i));
        }
        size += dataSize;
        size += 1 * getSearchValuesList().size();
      }
      if (pageSize_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(7, pageSize_);
      }
      if (pageIdx_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(8, pageIdx_);
      }
      if (onlyCount_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(9, onlyCount_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @Override
    public boolean equals(final Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof RequestGetRecords)) {
        return super.equals(obj);
      }
      RequestGetRecords other = (RequestGetRecords) obj;

      if (!getGroupname()
          .equals(other.getGroupname())) return false;
      if (!getUsername()
          .equals(other.getUsername())) return false;
      if (sortType_ != other.sortType_) return false;
      if (getAscending()
          != other.getAscending()) return false;
      if (!searchTypes_.equals(other.searchTypes_)) return false;
      if (!getSearchValuesList()
          .equals(other.getSearchValuesList())) return false;
      if (getPageSize()
          != other.getPageSize()) return false;
      if (getPageIdx()
          != other.getPageIdx()) return false;
      if (getOnlyCount()
          != other.getOnlyCount()) return false;
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + GROUPNAME_FIELD_NUMBER;
      hash = (53 * hash) + getGroupname().hashCode();
      hash = (37 * hash) + USERNAME_FIELD_NUMBER;
      hash = (53 * hash) + getUsername().hashCode();
      hash = (37 * hash) + SORT_TYPE_FIELD_NUMBER;
      hash = (53 * hash) + sortType_;
      hash = (37 * hash) + ASCENDING_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getAscending());
      if (getSearchTypesCount() > 0) {
        hash = (37 * hash) + SEARCH_TYPES_FIELD_NUMBER;
        hash = (53 * hash) + searchTypes_.hashCode();
      }
      if (getSearchValuesCount() > 0) {
        hash = (37 * hash) + SEARCH_VALUES_FIELD_NUMBER;
        hash = (53 * hash) + getSearchValuesList().hashCode();
      }
      hash = (37 * hash) + PAGE_SIZE_FIELD_NUMBER;
      hash = (53 * hash) + getPageSize();
      hash = (37 * hash) + PAGE_IDX_FIELD_NUMBER;
      hash = (53 * hash) + getPageIdx();
      hash = (37 * hash) + ONLY_COUNT_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getOnlyCount());
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static RequestGetRecords parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static RequestGetRecords parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static RequestGetRecords parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static RequestGetRecords parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static RequestGetRecords parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static RequestGetRecords parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static RequestGetRecords parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static RequestGetRecords parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static RequestGetRecords parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static RequestGetRecords parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static RequestGetRecords parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static RequestGetRecords parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(RequestGetRecords prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @Override
    protected Builder newBuilderForType(
        BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code RequestGetRecords}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:RequestGetRecords)
        RequestGetRecordsOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return CBMessage.internal_static_RequestGetRecords_descriptor;
      }

      @Override
      protected FieldAccessorTable
          internalGetFieldAccessorTable() {
        return CBMessage.internal_static_RequestGetRecords_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                RequestGetRecords.class, Builder.class);
      }

      // Construct using CBMessage.RequestGetRecords.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      @Override
      public Builder clear() {
        super.clear();
        groupname_ = "";

        username_ = "";

        sortType_ = 0;

        ascending_ = false;

        searchTypes_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000010);
        searchValues_ = com.google.protobuf.LazyStringArrayList.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000020);
        pageSize_ = 0;

        pageIdx_ = 0;

        onlyCount_ = false;

        return this;
      }

      @Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return CBMessage.internal_static_RequestGetRecords_descriptor;
      }

      @Override
      public RequestGetRecords getDefaultInstanceForType() {
        return RequestGetRecords.getDefaultInstance();
      }

      @Override
      public RequestGetRecords build() {
        RequestGetRecords result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @Override
      public RequestGetRecords buildPartial() {
        RequestGetRecords result = new RequestGetRecords(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        result.groupname_ = groupname_;
        result.username_ = username_;
        result.sortType_ = sortType_;
        result.ascending_ = ascending_;
        if (((bitField0_ & 0x00000010) != 0)) {
          searchTypes_ = java.util.Collections.unmodifiableList(searchTypes_);
          bitField0_ = (bitField0_ & ~0x00000010);
        }
        result.searchTypes_ = searchTypes_;
        if (((bitField0_ & 0x00000020) != 0)) {
          searchValues_ = searchValues_.getUnmodifiableView();
          bitField0_ = (bitField0_ & ~0x00000020);
        }
        result.searchValues_ = searchValues_;
        result.pageSize_ = pageSize_;
        result.pageIdx_ = pageIdx_;
        result.onlyCount_ = onlyCount_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      @Override
      public Builder clone() {
        return super.clone();
      }
      @Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return super.setField(field, value);
      }
      @Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return super.addRepeatedField(field, value);
      }
      @Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof RequestGetRecords) {
          return mergeFrom((RequestGetRecords)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(RequestGetRecords other) {
        if (other == RequestGetRecords.getDefaultInstance()) return this;
        if (!other.getGroupname().isEmpty()) {
          groupname_ = other.groupname_;
          onChanged();
        }
        if (!other.getUsername().isEmpty()) {
          username_ = other.username_;
          onChanged();
        }
        if (other.sortType_ != 0) {
          setSortTypeValue(other.getSortTypeValue());
        }
        if (other.getAscending() != false) {
          setAscending(other.getAscending());
        }
        if (!other.searchTypes_.isEmpty()) {
          if (searchTypes_.isEmpty()) {
            searchTypes_ = other.searchTypes_;
            bitField0_ = (bitField0_ & ~0x00000010);
          } else {
            ensureSearchTypesIsMutable();
            searchTypes_.addAll(other.searchTypes_);
          }
          onChanged();
        }
        if (!other.searchValues_.isEmpty()) {
          if (searchValues_.isEmpty()) {
            searchValues_ = other.searchValues_;
            bitField0_ = (bitField0_ & ~0x00000020);
          } else {
            ensureSearchValuesIsMutable();
            searchValues_.addAll(other.searchValues_);
          }
          onChanged();
        }
        if (other.getPageSize() != 0) {
          setPageSize(other.getPageSize());
        }
        if (other.getPageIdx() != 0) {
          setPageIdx(other.getPageIdx());
        }
        if (other.getOnlyCount() != false) {
          setOnlyCount(other.getOnlyCount());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @Override
      public final boolean isInitialized() {
        return true;
      }

      @Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        RequestGetRecords parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (RequestGetRecords) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private Object groupname_ = "";
      /**
       * <code>string groupname = 1;</code>
       */
      public String getGroupname() {
        Object ref = groupname_;
        if (!(ref instanceof String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          String s = bs.toStringUtf8();
          groupname_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      /**
       * <code>string groupname = 1;</code>
       */
      public com.google.protobuf.ByteString
          getGroupnameBytes() {
        Object ref = groupname_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (String) ref);
          groupname_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string groupname = 1;</code>
       */
      public Builder setGroupname(
          String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        groupname_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string groupname = 1;</code>
       */
      public Builder clearGroupname() {
        
        groupname_ = getDefaultInstance().getGroupname();
        onChanged();
        return this;
      }
      /**
       * <code>string groupname = 1;</code>
       */
      public Builder setGroupnameBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        groupname_ = value;
        onChanged();
        return this;
      }

      private Object username_ = "";
      /**
       * <code>string username = 2;</code>
       */
      public String getUsername() {
        Object ref = username_;
        if (!(ref instanceof String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          String s = bs.toStringUtf8();
          username_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      /**
       * <code>string username = 2;</code>
       */
      public com.google.protobuf.ByteString
          getUsernameBytes() {
        Object ref = username_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (String) ref);
          username_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string username = 2;</code>
       */
      public Builder setUsername(
          String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        username_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string username = 2;</code>
       */
      public Builder clearUsername() {
        
        username_ = getDefaultInstance().getUsername();
        onChanged();
        return this;
      }
      /**
       * <code>string username = 2;</code>
       */
      public Builder setUsernameBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        username_ = value;
        onChanged();
        return this;
      }

      private int sortType_ = 0;
      /**
       * <code>.SortType sort_type = 3;</code>
       */
      public int getSortTypeValue() {
        return sortType_;
      }
      /**
       * <code>.SortType sort_type = 3;</code>
       */
      public Builder setSortTypeValue(int value) {
        sortType_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>.SortType sort_type = 3;</code>
       */
      public SortType getSortType() {
        @SuppressWarnings("deprecation")
        SortType result = SortType.valueOf(sortType_);
        return result == null ? SortType.UNRECOGNIZED : result;
      }
      /**
       * <code>.SortType sort_type = 3;</code>
       */
      public Builder setSortType(SortType value) {
        if (value == null) {
          throw new NullPointerException();
        }
        
        sortType_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>.SortType sort_type = 3;</code>
       */
      public Builder clearSortType() {
        
        sortType_ = 0;
        onChanged();
        return this;
      }

      private boolean ascending_ ;
      /**
       * <code>bool ascending = 4;</code>
       */
      public boolean getAscending() {
        return ascending_;
      }
      /**
       * <code>bool ascending = 4;</code>
       */
      public Builder setAscending(boolean value) {
        
        ascending_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool ascending = 4;</code>
       */
      public Builder clearAscending() {
        
        ascending_ = false;
        onChanged();
        return this;
      }

      private java.util.List<Integer> searchTypes_ =
        java.util.Collections.emptyList();
      private void ensureSearchTypesIsMutable() {
        if (!((bitField0_ & 0x00000010) != 0)) {
          searchTypes_ = new java.util.ArrayList<Integer>(searchTypes_);
          bitField0_ |= 0x00000010;
        }
      }
      /**
       * <code>repeated .SearchType search_types = 5;</code>
       */
      public java.util.List<SearchType> getSearchTypesList() {
        return new com.google.protobuf.Internal.ListAdapter<
            Integer, SearchType>(searchTypes_, searchTypes_converter_);
      }
      /**
       * <code>repeated .SearchType search_types = 5;</code>
       */
      public int getSearchTypesCount() {
        return searchTypes_.size();
      }
      /**
       * <code>repeated .SearchType search_types = 5;</code>
       */
      public SearchType getSearchTypes(int index) {
        return searchTypes_converter_.convert(searchTypes_.get(index));
      }
      /**
       * <code>repeated .SearchType search_types = 5;</code>
       */
      public Builder setSearchTypes(
          int index, SearchType value) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureSearchTypesIsMutable();
        searchTypes_.set(index, value.getNumber());
        onChanged();
        return this;
      }
      /**
       * <code>repeated .SearchType search_types = 5;</code>
       */
      public Builder addSearchTypes(SearchType value) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureSearchTypesIsMutable();
        searchTypes_.add(value.getNumber());
        onChanged();
        return this;
      }
      /**
       * <code>repeated .SearchType search_types = 5;</code>
       */
      public Builder addAllSearchTypes(
          Iterable<? extends SearchType> values) {
        ensureSearchTypesIsMutable();
        for (SearchType value : values) {
          searchTypes_.add(value.getNumber());
        }
        onChanged();
        return this;
      }
      /**
       * <code>repeated .SearchType search_types = 5;</code>
       */
      public Builder clearSearchTypes() {
        searchTypes_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000010);
        onChanged();
        return this;
      }
      /**
       * <code>repeated .SearchType search_types = 5;</code>
       */
      public java.util.List<Integer>
      getSearchTypesValueList() {
        return java.util.Collections.unmodifiableList(searchTypes_);
      }
      /**
       * <code>repeated .SearchType search_types = 5;</code>
       */
      public int getSearchTypesValue(int index) {
        return searchTypes_.get(index);
      }
      /**
       * <code>repeated .SearchType search_types = 5;</code>
       */
      public Builder setSearchTypesValue(
          int index, int value) {
        ensureSearchTypesIsMutable();
        searchTypes_.set(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated .SearchType search_types = 5;</code>
       */
      public Builder addSearchTypesValue(int value) {
        ensureSearchTypesIsMutable();
        searchTypes_.add(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated .SearchType search_types = 5;</code>
       */
      public Builder addAllSearchTypesValue(
          Iterable<Integer> values) {
        ensureSearchTypesIsMutable();
        for (int value : values) {
          searchTypes_.add(value);
        }
        onChanged();
        return this;
      }

      private com.google.protobuf.LazyStringList searchValues_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      private void ensureSearchValuesIsMutable() {
        if (!((bitField0_ & 0x00000020) != 0)) {
          searchValues_ = new com.google.protobuf.LazyStringArrayList(searchValues_);
          bitField0_ |= 0x00000020;
         }
      }
      /**
       * <code>repeated string search_values = 6;</code>
       */
      public com.google.protobuf.ProtocolStringList
          getSearchValuesList() {
        return searchValues_.getUnmodifiableView();
      }
      /**
       * <code>repeated string search_values = 6;</code>
       */
      public int getSearchValuesCount() {
        return searchValues_.size();
      }
      /**
       * <code>repeated string search_values = 6;</code>
       */
      public String getSearchValues(int index) {
        return searchValues_.get(index);
      }
      /**
       * <code>repeated string search_values = 6;</code>
       */
      public com.google.protobuf.ByteString
          getSearchValuesBytes(int index) {
        return searchValues_.getByteString(index);
      }
      /**
       * <code>repeated string search_values = 6;</code>
       */
      public Builder setSearchValues(
          int index, String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  ensureSearchValuesIsMutable();
        searchValues_.set(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated string search_values = 6;</code>
       */
      public Builder addSearchValues(
          String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  ensureSearchValuesIsMutable();
        searchValues_.add(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated string search_values = 6;</code>
       */
      public Builder addAllSearchValues(
          Iterable<String> values) {
        ensureSearchValuesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, searchValues_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated string search_values = 6;</code>
       */
      public Builder clearSearchValues() {
        searchValues_ = com.google.protobuf.LazyStringArrayList.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000020);
        onChanged();
        return this;
      }
      /**
       * <code>repeated string search_values = 6;</code>
       */
      public Builder addSearchValuesBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        ensureSearchValuesIsMutable();
        searchValues_.add(value);
        onChanged();
        return this;
      }

      private int pageSize_ ;
      /**
       * <code>int32 page_size = 7;</code>
       */
      public int getPageSize() {
        return pageSize_;
      }
      /**
       * <code>int32 page_size = 7;</code>
       */
      public Builder setPageSize(int value) {
        
        pageSize_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 page_size = 7;</code>
       */
      public Builder clearPageSize() {
        
        pageSize_ = 0;
        onChanged();
        return this;
      }

      private int pageIdx_ ;
      /**
       * <code>int32 page_idx = 8;</code>
       */
      public int getPageIdx() {
        return pageIdx_;
      }
      /**
       * <code>int32 page_idx = 8;</code>
       */
      public Builder setPageIdx(int value) {
        
        pageIdx_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 page_idx = 8;</code>
       */
      public Builder clearPageIdx() {
        
        pageIdx_ = 0;
        onChanged();
        return this;
      }

      private boolean onlyCount_ ;
      /**
       * <code>bool only_count = 9;</code>
       */
      public boolean getOnlyCount() {
        return onlyCount_;
      }
      /**
       * <code>bool only_count = 9;</code>
       */
      public Builder setOnlyCount(boolean value) {
        
        onlyCount_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool only_count = 9;</code>
       */
      public Builder clearOnlyCount() {
        
        onlyCount_ = false;
        onChanged();
        return this;
      }
      @Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:RequestGetRecords)
    }

    // @@protoc_insertion_point(class_scope:RequestGetRecords)
    private static final RequestGetRecords DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new RequestGetRecords();
    }

    public static RequestGetRecords getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<RequestGetRecords>
        PARSER = new com.google.protobuf.AbstractParser<RequestGetRecords>() {
      @Override
      public RequestGetRecords parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new RequestGetRecords(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<RequestGetRecords> parser() {
      return PARSER;
    }

    @Override
    public com.google.protobuf.Parser<RequestGetRecords> getParserForType() {
      return PARSER;
    }

    @Override
    public RequestGetRecords getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface ResponseGetRecordsOrBuilder extends
      // @@protoc_insertion_point(interface_extends:ResponseGetRecords)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>bool result = 1;</code>
     */
    boolean getResult();

    /**
     * <code>string words = 2;</code>
     */
    String getWords();
    /**
     * <code>string words = 2;</code>
     */
    com.google.protobuf.ByteString
        getWordsBytes();

    /**
     * <code>string groupname = 3;</code>
     */
    String getGroupname();
    /**
     * <code>string groupname = 3;</code>
     */
    com.google.protobuf.ByteString
        getGroupnameBytes();

    /**
     * <code>string username = 4;</code>
     */
    String getUsername();
    /**
     * <code>string username = 4;</code>
     */
    com.google.protobuf.ByteString
        getUsernameBytes();

    /**
     * <code>repeated .Record records = 5;</code>
     */
    java.util.List<Record>
        getRecordsList();
    /**
     * <code>repeated .Record records = 5;</code>
     */
    Record getRecords(int index);
    /**
     * <code>repeated .Record records = 5;</code>
     */
    int getRecordsCount();
    /**
     * <code>repeated .Record records = 5;</code>
     */
    java.util.List<? extends RecordOrBuilder>
        getRecordsOrBuilderList();
    /**
     * <code>repeated .Record records = 5;</code>
     */
    RecordOrBuilder getRecordsOrBuilder(
        int index);

    /**
     * <code>.SortType sort_type = 6;</code>
     */
    int getSortTypeValue();
    /**
     * <code>.SortType sort_type = 6;</code>
     */
    SortType getSortType();

    /**
     * <code>bool ascending = 7;</code>
     */
    boolean getAscending();

    /**
     * <code>repeated .SearchType search_types = 8;</code>
     */
    java.util.List<SearchType> getSearchTypesList();
    /**
     * <code>repeated .SearchType search_types = 8;</code>
     */
    int getSearchTypesCount();
    /**
     * <code>repeated .SearchType search_types = 8;</code>
     */
    SearchType getSearchTypes(int index);
    /**
     * <code>repeated .SearchType search_types = 8;</code>
     */
    java.util.List<Integer>
    getSearchTypesValueList();
    /**
     * <code>repeated .SearchType search_types = 8;</code>
     */
    int getSearchTypesValue(int index);

    /**
     * <code>repeated string search_values = 9;</code>
     */
    java.util.List<String>
        getSearchValuesList();
    /**
     * <code>repeated string search_values = 9;</code>
     */
    int getSearchValuesCount();
    /**
     * <code>repeated string search_values = 9;</code>
     */
    String getSearchValues(int index);
    /**
     * <code>repeated string search_values = 9;</code>
     */
    com.google.protobuf.ByteString
        getSearchValuesBytes(int index);

    /**
     * <code>int32 page_size = 10;</code>
     */
    int getPageSize();

    /**
     * <code>int32 page_idx = 11;</code>
     */
    int getPageIdx();

    /**
     * <code>bool only_count = 12;</code>
     */
    boolean getOnlyCount();

    /**
     * <code>int32 count = 13;</code>
     */
    int getCount();
  }
  /**
   * Protobuf type {@code ResponseGetRecords}
   */
  public  static final class ResponseGetRecords extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:ResponseGetRecords)
      ResponseGetRecordsOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ResponseGetRecords.newBuilder() to construct.
    private ResponseGetRecords(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ResponseGetRecords() {
      words_ = "";
      groupname_ = "";
      username_ = "";
      records_ = java.util.Collections.emptyList();
      sortType_ = 0;
      searchTypes_ = java.util.Collections.emptyList();
      searchValues_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    }

    @Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private ResponseGetRecords(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new NullPointerException();
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
            case 8: {

              result_ = input.readBool();
              break;
            }
            case 18: {
              String s = input.readStringRequireUtf8();

              words_ = s;
              break;
            }
            case 26: {
              String s = input.readStringRequireUtf8();

              groupname_ = s;
              break;
            }
            case 34: {
              String s = input.readStringRequireUtf8();

              username_ = s;
              break;
            }
            case 42: {
              if (!((mutable_bitField0_ & 0x00000010) != 0)) {
                records_ = new java.util.ArrayList<Record>();
                mutable_bitField0_ |= 0x00000010;
              }
              records_.add(
                  input.readMessage(Record.parser(), extensionRegistry));
              break;
            }
            case 48: {
              int rawValue = input.readEnum();

              sortType_ = rawValue;
              break;
            }
            case 56: {

              ascending_ = input.readBool();
              break;
            }
            case 64: {
              int rawValue = input.readEnum();
              if (!((mutable_bitField0_ & 0x00000080) != 0)) {
                searchTypes_ = new java.util.ArrayList<Integer>();
                mutable_bitField0_ |= 0x00000080;
              }
              searchTypes_.add(rawValue);
              break;
            }
            case 66: {
              int length = input.readRawVarint32();
              int oldLimit = input.pushLimit(length);
              while(input.getBytesUntilLimit() > 0) {
                int rawValue = input.readEnum();
                if (!((mutable_bitField0_ & 0x00000080) != 0)) {
                  searchTypes_ = new java.util.ArrayList<Integer>();
                  mutable_bitField0_ |= 0x00000080;
                }
                searchTypes_.add(rawValue);
              }
              input.popLimit(oldLimit);
              break;
            }
            case 74: {
              String s = input.readStringRequireUtf8();
              if (!((mutable_bitField0_ & 0x00000100) != 0)) {
                searchValues_ = new com.google.protobuf.LazyStringArrayList();
                mutable_bitField0_ |= 0x00000100;
              }
              searchValues_.add(s);
              break;
            }
            case 80: {

              pageSize_ = input.readInt32();
              break;
            }
            case 88: {

              pageIdx_ = input.readInt32();
              break;
            }
            case 96: {

              onlyCount_ = input.readBool();
              break;
            }
            case 104: {

              count_ = input.readInt32();
              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
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
            e).setUnfinishedMessage(this);
      } finally {
        if (((mutable_bitField0_ & 0x00000010) != 0)) {
          records_ = java.util.Collections.unmodifiableList(records_);
        }
        if (((mutable_bitField0_ & 0x00000080) != 0)) {
          searchTypes_ = java.util.Collections.unmodifiableList(searchTypes_);
        }
        if (((mutable_bitField0_ & 0x00000100) != 0)) {
          searchValues_ = searchValues_.getUnmodifiableView();
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return CBMessage.internal_static_ResponseGetRecords_descriptor;
    }

    @Override
    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return CBMessage.internal_static_ResponseGetRecords_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ResponseGetRecords.class, Builder.class);
    }

    private int bitField0_;
    public static final int RESULT_FIELD_NUMBER = 1;
    private boolean result_;
    /**
     * <code>bool result = 1;</code>
     */
    public boolean getResult() {
      return result_;
    }

    public static final int WORDS_FIELD_NUMBER = 2;
    private volatile Object words_;
    /**
     * <code>string words = 2;</code>
     */
    public String getWords() {
      Object ref = words_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        words_ = s;
        return s;
      }
    }
    /**
     * <code>string words = 2;</code>
     */
    public com.google.protobuf.ByteString
        getWordsBytes() {
      Object ref = words_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        words_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int GROUPNAME_FIELD_NUMBER = 3;
    private volatile Object groupname_;
    /**
     * <code>string groupname = 3;</code>
     */
    public String getGroupname() {
      Object ref = groupname_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        groupname_ = s;
        return s;
      }
    }
    /**
     * <code>string groupname = 3;</code>
     */
    public com.google.protobuf.ByteString
        getGroupnameBytes() {
      Object ref = groupname_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        groupname_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int USERNAME_FIELD_NUMBER = 4;
    private volatile Object username_;
    /**
     * <code>string username = 4;</code>
     */
    public String getUsername() {
      Object ref = username_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        username_ = s;
        return s;
      }
    }
    /**
     * <code>string username = 4;</code>
     */
    public com.google.protobuf.ByteString
        getUsernameBytes() {
      Object ref = username_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        username_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int RECORDS_FIELD_NUMBER = 5;
    private java.util.List<Record> records_;
    /**
     * <code>repeated .Record records = 5;</code>
     */
    public java.util.List<Record> getRecordsList() {
      return records_;
    }
    /**
     * <code>repeated .Record records = 5;</code>
     */
    public java.util.List<? extends RecordOrBuilder>
        getRecordsOrBuilderList() {
      return records_;
    }
    /**
     * <code>repeated .Record records = 5;</code>
     */
    public int getRecordsCount() {
      return records_.size();
    }
    /**
     * <code>repeated .Record records = 5;</code>
     */
    public Record getRecords(int index) {
      return records_.get(index);
    }
    /**
     * <code>repeated .Record records = 5;</code>
     */
    public RecordOrBuilder getRecordsOrBuilder(
        int index) {
      return records_.get(index);
    }

    public static final int SORT_TYPE_FIELD_NUMBER = 6;
    private int sortType_;
    /**
     * <code>.SortType sort_type = 6;</code>
     */
    public int getSortTypeValue() {
      return sortType_;
    }
    /**
     * <code>.SortType sort_type = 6;</code>
     */
    public SortType getSortType() {
      @SuppressWarnings("deprecation")
      SortType result = SortType.valueOf(sortType_);
      return result == null ? SortType.UNRECOGNIZED : result;
    }

    public static final int ASCENDING_FIELD_NUMBER = 7;
    private boolean ascending_;
    /**
     * <code>bool ascending = 7;</code>
     */
    public boolean getAscending() {
      return ascending_;
    }

    public static final int SEARCH_TYPES_FIELD_NUMBER = 8;
    private java.util.List<Integer> searchTypes_;
    private static final com.google.protobuf.Internal.ListAdapter.Converter<
        Integer, SearchType> searchTypes_converter_ =
            new com.google.protobuf.Internal.ListAdapter.Converter<
                Integer, SearchType>() {
              public SearchType convert(Integer from) {
                @SuppressWarnings("deprecation")
                SearchType result = SearchType.valueOf(from);
                return result == null ? SearchType.UNRECOGNIZED : result;
              }
            };
    /**
     * <code>repeated .SearchType search_types = 8;</code>
     */
    public java.util.List<SearchType> getSearchTypesList() {
      return new com.google.protobuf.Internal.ListAdapter<
          Integer, SearchType>(searchTypes_, searchTypes_converter_);
    }
    /**
     * <code>repeated .SearchType search_types = 8;</code>
     */
    public int getSearchTypesCount() {
      return searchTypes_.size();
    }
    /**
     * <code>repeated .SearchType search_types = 8;</code>
     */
    public SearchType getSearchTypes(int index) {
      return searchTypes_converter_.convert(searchTypes_.get(index));
    }
    /**
     * <code>repeated .SearchType search_types = 8;</code>
     */
    public java.util.List<Integer>
    getSearchTypesValueList() {
      return searchTypes_;
    }
    /**
     * <code>repeated .SearchType search_types = 8;</code>
     */
    public int getSearchTypesValue(int index) {
      return searchTypes_.get(index);
    }
    private int searchTypesMemoizedSerializedSize;

    public static final int SEARCH_VALUES_FIELD_NUMBER = 9;
    private com.google.protobuf.LazyStringList searchValues_;
    /**
     * <code>repeated string search_values = 9;</code>
     */
    public com.google.protobuf.ProtocolStringList
        getSearchValuesList() {
      return searchValues_;
    }
    /**
     * <code>repeated string search_values = 9;</code>
     */
    public int getSearchValuesCount() {
      return searchValues_.size();
    }
    /**
     * <code>repeated string search_values = 9;</code>
     */
    public String getSearchValues(int index) {
      return searchValues_.get(index);
    }
    /**
     * <code>repeated string search_values = 9;</code>
     */
    public com.google.protobuf.ByteString
        getSearchValuesBytes(int index) {
      return searchValues_.getByteString(index);
    }

    public static final int PAGE_SIZE_FIELD_NUMBER = 10;
    private int pageSize_;
    /**
     * <code>int32 page_size = 10;</code>
     */
    public int getPageSize() {
      return pageSize_;
    }

    public static final int PAGE_IDX_FIELD_NUMBER = 11;
    private int pageIdx_;
    /**
     * <code>int32 page_idx = 11;</code>
     */
    public int getPageIdx() {
      return pageIdx_;
    }

    public static final int ONLY_COUNT_FIELD_NUMBER = 12;
    private boolean onlyCount_;
    /**
     * <code>bool only_count = 12;</code>
     */
    public boolean getOnlyCount() {
      return onlyCount_;
    }

    public static final int COUNT_FIELD_NUMBER = 13;
    private int count_;
    /**
     * <code>int32 count = 13;</code>
     */
    public int getCount() {
      return count_;
    }

    private byte memoizedIsInitialized = -1;
    @Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (result_ != false) {
        output.writeBool(1, result_);
      }
      if (!getWordsBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, words_);
      }
      if (!getGroupnameBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 3, groupname_);
      }
      if (!getUsernameBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 4, username_);
      }
      for (int i = 0; i < records_.size(); i++) {
        output.writeMessage(5, records_.get(i));
      }
      if (sortType_ != SortType.SORT_ID.getNumber()) {
        output.writeEnum(6, sortType_);
      }
      if (ascending_ != false) {
        output.writeBool(7, ascending_);
      }
      if (getSearchTypesList().size() > 0) {
        output.writeUInt32NoTag(66);
        output.writeUInt32NoTag(searchTypesMemoizedSerializedSize);
      }
      for (int i = 0; i < searchTypes_.size(); i++) {
        output.writeEnumNoTag(searchTypes_.get(i));
      }
      for (int i = 0; i < searchValues_.size(); i++) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 9, searchValues_.getRaw(i));
      }
      if (pageSize_ != 0) {
        output.writeInt32(10, pageSize_);
      }
      if (pageIdx_ != 0) {
        output.writeInt32(11, pageIdx_);
      }
      if (onlyCount_ != false) {
        output.writeBool(12, onlyCount_);
      }
      if (count_ != 0) {
        output.writeInt32(13, count_);
      }
      unknownFields.writeTo(output);
    }

    @Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (result_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(1, result_);
      }
      if (!getWordsBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, words_);
      }
      if (!getGroupnameBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, groupname_);
      }
      if (!getUsernameBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, username_);
      }
      for (int i = 0; i < records_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(5, records_.get(i));
      }
      if (sortType_ != SortType.SORT_ID.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(6, sortType_);
      }
      if (ascending_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(7, ascending_);
      }
      {
        int dataSize = 0;
        for (int i = 0; i < searchTypes_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeEnumSizeNoTag(searchTypes_.get(i));
        }
        size += dataSize;
        if (!getSearchTypesList().isEmpty()) {  size += 1;
          size += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(dataSize);
        }searchTypesMemoizedSerializedSize = dataSize;
      }
      {
        int dataSize = 0;
        for (int i = 0; i < searchValues_.size(); i++) {
          dataSize += computeStringSizeNoTag(searchValues_.getRaw(i));
        }
        size += dataSize;
        size += 1 * getSearchValuesList().size();
      }
      if (pageSize_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(10, pageSize_);
      }
      if (pageIdx_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(11, pageIdx_);
      }
      if (onlyCount_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(12, onlyCount_);
      }
      if (count_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(13, count_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @Override
    public boolean equals(final Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof ResponseGetRecords)) {
        return super.equals(obj);
      }
      ResponseGetRecords other = (ResponseGetRecords) obj;

      if (getResult()
          != other.getResult()) return false;
      if (!getWords()
          .equals(other.getWords())) return false;
      if (!getGroupname()
          .equals(other.getGroupname())) return false;
      if (!getUsername()
          .equals(other.getUsername())) return false;
      if (!getRecordsList()
          .equals(other.getRecordsList())) return false;
      if (sortType_ != other.sortType_) return false;
      if (getAscending()
          != other.getAscending()) return false;
      if (!searchTypes_.equals(other.searchTypes_)) return false;
      if (!getSearchValuesList()
          .equals(other.getSearchValuesList())) return false;
      if (getPageSize()
          != other.getPageSize()) return false;
      if (getPageIdx()
          != other.getPageIdx()) return false;
      if (getOnlyCount()
          != other.getOnlyCount()) return false;
      if (getCount()
          != other.getCount()) return false;
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + RESULT_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getResult());
      hash = (37 * hash) + WORDS_FIELD_NUMBER;
      hash = (53 * hash) + getWords().hashCode();
      hash = (37 * hash) + GROUPNAME_FIELD_NUMBER;
      hash = (53 * hash) + getGroupname().hashCode();
      hash = (37 * hash) + USERNAME_FIELD_NUMBER;
      hash = (53 * hash) + getUsername().hashCode();
      if (getRecordsCount() > 0) {
        hash = (37 * hash) + RECORDS_FIELD_NUMBER;
        hash = (53 * hash) + getRecordsList().hashCode();
      }
      hash = (37 * hash) + SORT_TYPE_FIELD_NUMBER;
      hash = (53 * hash) + sortType_;
      hash = (37 * hash) + ASCENDING_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getAscending());
      if (getSearchTypesCount() > 0) {
        hash = (37 * hash) + SEARCH_TYPES_FIELD_NUMBER;
        hash = (53 * hash) + searchTypes_.hashCode();
      }
      if (getSearchValuesCount() > 0) {
        hash = (37 * hash) + SEARCH_VALUES_FIELD_NUMBER;
        hash = (53 * hash) + getSearchValuesList().hashCode();
      }
      hash = (37 * hash) + PAGE_SIZE_FIELD_NUMBER;
      hash = (53 * hash) + getPageSize();
      hash = (37 * hash) + PAGE_IDX_FIELD_NUMBER;
      hash = (53 * hash) + getPageIdx();
      hash = (37 * hash) + ONLY_COUNT_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getOnlyCount());
      hash = (37 * hash) + COUNT_FIELD_NUMBER;
      hash = (53 * hash) + getCount();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static ResponseGetRecords parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static ResponseGetRecords parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static ResponseGetRecords parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static ResponseGetRecords parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static ResponseGetRecords parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static ResponseGetRecords parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static ResponseGetRecords parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static ResponseGetRecords parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static ResponseGetRecords parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static ResponseGetRecords parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static ResponseGetRecords parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static ResponseGetRecords parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(ResponseGetRecords prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @Override
    protected Builder newBuilderForType(
        BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code ResponseGetRecords}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:ResponseGetRecords)
        ResponseGetRecordsOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return CBMessage.internal_static_ResponseGetRecords_descriptor;
      }

      @Override
      protected FieldAccessorTable
          internalGetFieldAccessorTable() {
        return CBMessage.internal_static_ResponseGetRecords_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                ResponseGetRecords.class, Builder.class);
      }

      // Construct using CBMessage.ResponseGetRecords.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
          getRecordsFieldBuilder();
        }
      }
      @Override
      public Builder clear() {
        super.clear();
        result_ = false;

        words_ = "";

        groupname_ = "";

        username_ = "";

        if (recordsBuilder_ == null) {
          records_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000010);
        } else {
          recordsBuilder_.clear();
        }
        sortType_ = 0;

        ascending_ = false;

        searchTypes_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000080);
        searchValues_ = com.google.protobuf.LazyStringArrayList.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000100);
        pageSize_ = 0;

        pageIdx_ = 0;

        onlyCount_ = false;

        count_ = 0;

        return this;
      }

      @Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return CBMessage.internal_static_ResponseGetRecords_descriptor;
      }

      @Override
      public ResponseGetRecords getDefaultInstanceForType() {
        return ResponseGetRecords.getDefaultInstance();
      }

      @Override
      public ResponseGetRecords build() {
        ResponseGetRecords result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @Override
      public ResponseGetRecords buildPartial() {
        ResponseGetRecords result = new ResponseGetRecords(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        result.result_ = result_;
        result.words_ = words_;
        result.groupname_ = groupname_;
        result.username_ = username_;
        if (recordsBuilder_ == null) {
          if (((bitField0_ & 0x00000010) != 0)) {
            records_ = java.util.Collections.unmodifiableList(records_);
            bitField0_ = (bitField0_ & ~0x00000010);
          }
          result.records_ = records_;
        } else {
          result.records_ = recordsBuilder_.build();
        }
        result.sortType_ = sortType_;
        result.ascending_ = ascending_;
        if (((bitField0_ & 0x00000080) != 0)) {
          searchTypes_ = java.util.Collections.unmodifiableList(searchTypes_);
          bitField0_ = (bitField0_ & ~0x00000080);
        }
        result.searchTypes_ = searchTypes_;
        if (((bitField0_ & 0x00000100) != 0)) {
          searchValues_ = searchValues_.getUnmodifiableView();
          bitField0_ = (bitField0_ & ~0x00000100);
        }
        result.searchValues_ = searchValues_;
        result.pageSize_ = pageSize_;
        result.pageIdx_ = pageIdx_;
        result.onlyCount_ = onlyCount_;
        result.count_ = count_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      @Override
      public Builder clone() {
        return super.clone();
      }
      @Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return super.setField(field, value);
      }
      @Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return super.addRepeatedField(field, value);
      }
      @Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof ResponseGetRecords) {
          return mergeFrom((ResponseGetRecords)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(ResponseGetRecords other) {
        if (other == ResponseGetRecords.getDefaultInstance()) return this;
        if (other.getResult() != false) {
          setResult(other.getResult());
        }
        if (!other.getWords().isEmpty()) {
          words_ = other.words_;
          onChanged();
        }
        if (!other.getGroupname().isEmpty()) {
          groupname_ = other.groupname_;
          onChanged();
        }
        if (!other.getUsername().isEmpty()) {
          username_ = other.username_;
          onChanged();
        }
        if (recordsBuilder_ == null) {
          if (!other.records_.isEmpty()) {
            if (records_.isEmpty()) {
              records_ = other.records_;
              bitField0_ = (bitField0_ & ~0x00000010);
            } else {
              ensureRecordsIsMutable();
              records_.addAll(other.records_);
            }
            onChanged();
          }
        } else {
          if (!other.records_.isEmpty()) {
            if (recordsBuilder_.isEmpty()) {
              recordsBuilder_.dispose();
              recordsBuilder_ = null;
              records_ = other.records_;
              bitField0_ = (bitField0_ & ~0x00000010);
              recordsBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getRecordsFieldBuilder() : null;
            } else {
              recordsBuilder_.addAllMessages(other.records_);
            }
          }
        }
        if (other.sortType_ != 0) {
          setSortTypeValue(other.getSortTypeValue());
        }
        if (other.getAscending() != false) {
          setAscending(other.getAscending());
        }
        if (!other.searchTypes_.isEmpty()) {
          if (searchTypes_.isEmpty()) {
            searchTypes_ = other.searchTypes_;
            bitField0_ = (bitField0_ & ~0x00000080);
          } else {
            ensureSearchTypesIsMutable();
            searchTypes_.addAll(other.searchTypes_);
          }
          onChanged();
        }
        if (!other.searchValues_.isEmpty()) {
          if (searchValues_.isEmpty()) {
            searchValues_ = other.searchValues_;
            bitField0_ = (bitField0_ & ~0x00000100);
          } else {
            ensureSearchValuesIsMutable();
            searchValues_.addAll(other.searchValues_);
          }
          onChanged();
        }
        if (other.getPageSize() != 0) {
          setPageSize(other.getPageSize());
        }
        if (other.getPageIdx() != 0) {
          setPageIdx(other.getPageIdx());
        }
        if (other.getOnlyCount() != false) {
          setOnlyCount(other.getOnlyCount());
        }
        if (other.getCount() != 0) {
          setCount(other.getCount());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @Override
      public final boolean isInitialized() {
        return true;
      }

      @Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        ResponseGetRecords parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (ResponseGetRecords) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private boolean result_ ;
      /**
       * <code>bool result = 1;</code>
       */
      public boolean getResult() {
        return result_;
      }
      /**
       * <code>bool result = 1;</code>
       */
      public Builder setResult(boolean value) {
        
        result_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool result = 1;</code>
       */
      public Builder clearResult() {
        
        result_ = false;
        onChanged();
        return this;
      }

      private Object words_ = "";
      /**
       * <code>string words = 2;</code>
       */
      public String getWords() {
        Object ref = words_;
        if (!(ref instanceof String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          String s = bs.toStringUtf8();
          words_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      /**
       * <code>string words = 2;</code>
       */
      public com.google.protobuf.ByteString
          getWordsBytes() {
        Object ref = words_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (String) ref);
          words_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string words = 2;</code>
       */
      public Builder setWords(
          String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        words_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string words = 2;</code>
       */
      public Builder clearWords() {
        
        words_ = getDefaultInstance().getWords();
        onChanged();
        return this;
      }
      /**
       * <code>string words = 2;</code>
       */
      public Builder setWordsBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        words_ = value;
        onChanged();
        return this;
      }

      private Object groupname_ = "";
      /**
       * <code>string groupname = 3;</code>
       */
      public String getGroupname() {
        Object ref = groupname_;
        if (!(ref instanceof String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          String s = bs.toStringUtf8();
          groupname_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      /**
       * <code>string groupname = 3;</code>
       */
      public com.google.protobuf.ByteString
          getGroupnameBytes() {
        Object ref = groupname_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (String) ref);
          groupname_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string groupname = 3;</code>
       */
      public Builder setGroupname(
          String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        groupname_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string groupname = 3;</code>
       */
      public Builder clearGroupname() {
        
        groupname_ = getDefaultInstance().getGroupname();
        onChanged();
        return this;
      }
      /**
       * <code>string groupname = 3;</code>
       */
      public Builder setGroupnameBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        groupname_ = value;
        onChanged();
        return this;
      }

      private Object username_ = "";
      /**
       * <code>string username = 4;</code>
       */
      public String getUsername() {
        Object ref = username_;
        if (!(ref instanceof String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          String s = bs.toStringUtf8();
          username_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      /**
       * <code>string username = 4;</code>
       */
      public com.google.protobuf.ByteString
          getUsernameBytes() {
        Object ref = username_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (String) ref);
          username_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string username = 4;</code>
       */
      public Builder setUsername(
          String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        username_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string username = 4;</code>
       */
      public Builder clearUsername() {
        
        username_ = getDefaultInstance().getUsername();
        onChanged();
        return this;
      }
      /**
       * <code>string username = 4;</code>
       */
      public Builder setUsernameBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        username_ = value;
        onChanged();
        return this;
      }

      private java.util.List<Record> records_ =
        java.util.Collections.emptyList();
      private void ensureRecordsIsMutable() {
        if (!((bitField0_ & 0x00000010) != 0)) {
          records_ = new java.util.ArrayList<Record>(records_);
          bitField0_ |= 0x00000010;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          Record, Record.Builder, RecordOrBuilder> recordsBuilder_;

      /**
       * <code>repeated .Record records = 5;</code>
       */
      public java.util.List<Record> getRecordsList() {
        if (recordsBuilder_ == null) {
          return java.util.Collections.unmodifiableList(records_);
        } else {
          return recordsBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .Record records = 5;</code>
       */
      public int getRecordsCount() {
        if (recordsBuilder_ == null) {
          return records_.size();
        } else {
          return recordsBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .Record records = 5;</code>
       */
      public Record getRecords(int index) {
        if (recordsBuilder_ == null) {
          return records_.get(index);
        } else {
          return recordsBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .Record records = 5;</code>
       */
      public Builder setRecords(
          int index, Record value) {
        if (recordsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureRecordsIsMutable();
          records_.set(index, value);
          onChanged();
        } else {
          recordsBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .Record records = 5;</code>
       */
      public Builder setRecords(
          int index, Record.Builder builderForValue) {
        if (recordsBuilder_ == null) {
          ensureRecordsIsMutable();
          records_.set(index, builderForValue.build());
          onChanged();
        } else {
          recordsBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .Record records = 5;</code>
       */
      public Builder addRecords(Record value) {
        if (recordsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureRecordsIsMutable();
          records_.add(value);
          onChanged();
        } else {
          recordsBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .Record records = 5;</code>
       */
      public Builder addRecords(
          int index, Record value) {
        if (recordsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureRecordsIsMutable();
          records_.add(index, value);
          onChanged();
        } else {
          recordsBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .Record records = 5;</code>
       */
      public Builder addRecords(
          Record.Builder builderForValue) {
        if (recordsBuilder_ == null) {
          ensureRecordsIsMutable();
          records_.add(builderForValue.build());
          onChanged();
        } else {
          recordsBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .Record records = 5;</code>
       */
      public Builder addRecords(
          int index, Record.Builder builderForValue) {
        if (recordsBuilder_ == null) {
          ensureRecordsIsMutable();
          records_.add(index, builderForValue.build());
          onChanged();
        } else {
          recordsBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .Record records = 5;</code>
       */
      public Builder addAllRecords(
          Iterable<? extends Record> values) {
        if (recordsBuilder_ == null) {
          ensureRecordsIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, records_);
          onChanged();
        } else {
          recordsBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .Record records = 5;</code>
       */
      public Builder clearRecords() {
        if (recordsBuilder_ == null) {
          records_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000010);
          onChanged();
        } else {
          recordsBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .Record records = 5;</code>
       */
      public Builder removeRecords(int index) {
        if (recordsBuilder_ == null) {
          ensureRecordsIsMutable();
          records_.remove(index);
          onChanged();
        } else {
          recordsBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .Record records = 5;</code>
       */
      public Record.Builder getRecordsBuilder(
          int index) {
        return getRecordsFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .Record records = 5;</code>
       */
      public RecordOrBuilder getRecordsOrBuilder(
          int index) {
        if (recordsBuilder_ == null) {
          return records_.get(index);  } else {
          return recordsBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .Record records = 5;</code>
       */
      public java.util.List<? extends RecordOrBuilder>
           getRecordsOrBuilderList() {
        if (recordsBuilder_ != null) {
          return recordsBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(records_);
        }
      }
      /**
       * <code>repeated .Record records = 5;</code>
       */
      public Record.Builder addRecordsBuilder() {
        return getRecordsFieldBuilder().addBuilder(
            Record.getDefaultInstance());
      }
      /**
       * <code>repeated .Record records = 5;</code>
       */
      public Record.Builder addRecordsBuilder(
          int index) {
        return getRecordsFieldBuilder().addBuilder(
            index, Record.getDefaultInstance());
      }
      /**
       * <code>repeated .Record records = 5;</code>
       */
      public java.util.List<Record.Builder>
           getRecordsBuilderList() {
        return getRecordsFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          Record, Record.Builder, RecordOrBuilder>
          getRecordsFieldBuilder() {
        if (recordsBuilder_ == null) {
          recordsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              Record, Record.Builder, RecordOrBuilder>(
                  records_,
                  ((bitField0_ & 0x00000010) != 0),
                  getParentForChildren(),
                  isClean());
          records_ = null;
        }
        return recordsBuilder_;
      }

      private int sortType_ = 0;
      /**
       * <code>.SortType sort_type = 6;</code>
       */
      public int getSortTypeValue() {
        return sortType_;
      }
      /**
       * <code>.SortType sort_type = 6;</code>
       */
      public Builder setSortTypeValue(int value) {
        sortType_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>.SortType sort_type = 6;</code>
       */
      public SortType getSortType() {
        @SuppressWarnings("deprecation")
        SortType result = SortType.valueOf(sortType_);
        return result == null ? SortType.UNRECOGNIZED : result;
      }
      /**
       * <code>.SortType sort_type = 6;</code>
       */
      public Builder setSortType(SortType value) {
        if (value == null) {
          throw new NullPointerException();
        }
        
        sortType_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>.SortType sort_type = 6;</code>
       */
      public Builder clearSortType() {
        
        sortType_ = 0;
        onChanged();
        return this;
      }

      private boolean ascending_ ;
      /**
       * <code>bool ascending = 7;</code>
       */
      public boolean getAscending() {
        return ascending_;
      }
      /**
       * <code>bool ascending = 7;</code>
       */
      public Builder setAscending(boolean value) {
        
        ascending_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool ascending = 7;</code>
       */
      public Builder clearAscending() {
        
        ascending_ = false;
        onChanged();
        return this;
      }

      private java.util.List<Integer> searchTypes_ =
        java.util.Collections.emptyList();
      private void ensureSearchTypesIsMutable() {
        if (!((bitField0_ & 0x00000080) != 0)) {
          searchTypes_ = new java.util.ArrayList<Integer>(searchTypes_);
          bitField0_ |= 0x00000080;
        }
      }
      /**
       * <code>repeated .SearchType search_types = 8;</code>
       */
      public java.util.List<SearchType> getSearchTypesList() {
        return new com.google.protobuf.Internal.ListAdapter<
            Integer, SearchType>(searchTypes_, searchTypes_converter_);
      }
      /**
       * <code>repeated .SearchType search_types = 8;</code>
       */
      public int getSearchTypesCount() {
        return searchTypes_.size();
      }
      /**
       * <code>repeated .SearchType search_types = 8;</code>
       */
      public SearchType getSearchTypes(int index) {
        return searchTypes_converter_.convert(searchTypes_.get(index));
      }
      /**
       * <code>repeated .SearchType search_types = 8;</code>
       */
      public Builder setSearchTypes(
          int index, SearchType value) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureSearchTypesIsMutable();
        searchTypes_.set(index, value.getNumber());
        onChanged();
        return this;
      }
      /**
       * <code>repeated .SearchType search_types = 8;</code>
       */
      public Builder addSearchTypes(SearchType value) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureSearchTypesIsMutable();
        searchTypes_.add(value.getNumber());
        onChanged();
        return this;
      }
      /**
       * <code>repeated .SearchType search_types = 8;</code>
       */
      public Builder addAllSearchTypes(
          Iterable<? extends SearchType> values) {
        ensureSearchTypesIsMutable();
        for (SearchType value : values) {
          searchTypes_.add(value.getNumber());
        }
        onChanged();
        return this;
      }
      /**
       * <code>repeated .SearchType search_types = 8;</code>
       */
      public Builder clearSearchTypes() {
        searchTypes_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000080);
        onChanged();
        return this;
      }
      /**
       * <code>repeated .SearchType search_types = 8;</code>
       */
      public java.util.List<Integer>
      getSearchTypesValueList() {
        return java.util.Collections.unmodifiableList(searchTypes_);
      }
      /**
       * <code>repeated .SearchType search_types = 8;</code>
       */
      public int getSearchTypesValue(int index) {
        return searchTypes_.get(index);
      }
      /**
       * <code>repeated .SearchType search_types = 8;</code>
       */
      public Builder setSearchTypesValue(
          int index, int value) {
        ensureSearchTypesIsMutable();
        searchTypes_.set(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated .SearchType search_types = 8;</code>
       */
      public Builder addSearchTypesValue(int value) {
        ensureSearchTypesIsMutable();
        searchTypes_.add(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated .SearchType search_types = 8;</code>
       */
      public Builder addAllSearchTypesValue(
          Iterable<Integer> values) {
        ensureSearchTypesIsMutable();
        for (int value : values) {
          searchTypes_.add(value);
        }
        onChanged();
        return this;
      }

      private com.google.protobuf.LazyStringList searchValues_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      private void ensureSearchValuesIsMutable() {
        if (!((bitField0_ & 0x00000100) != 0)) {
          searchValues_ = new com.google.protobuf.LazyStringArrayList(searchValues_);
          bitField0_ |= 0x00000100;
         }
      }
      /**
       * <code>repeated string search_values = 9;</code>
       */
      public com.google.protobuf.ProtocolStringList
          getSearchValuesList() {
        return searchValues_.getUnmodifiableView();
      }
      /**
       * <code>repeated string search_values = 9;</code>
       */
      public int getSearchValuesCount() {
        return searchValues_.size();
      }
      /**
       * <code>repeated string search_values = 9;</code>
       */
      public String getSearchValues(int index) {
        return searchValues_.get(index);
      }
      /**
       * <code>repeated string search_values = 9;</code>
       */
      public com.google.protobuf.ByteString
          getSearchValuesBytes(int index) {
        return searchValues_.getByteString(index);
      }
      /**
       * <code>repeated string search_values = 9;</code>
       */
      public Builder setSearchValues(
          int index, String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  ensureSearchValuesIsMutable();
        searchValues_.set(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated string search_values = 9;</code>
       */
      public Builder addSearchValues(
          String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  ensureSearchValuesIsMutable();
        searchValues_.add(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated string search_values = 9;</code>
       */
      public Builder addAllSearchValues(
          Iterable<String> values) {
        ensureSearchValuesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, searchValues_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated string search_values = 9;</code>
       */
      public Builder clearSearchValues() {
        searchValues_ = com.google.protobuf.LazyStringArrayList.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000100);
        onChanged();
        return this;
      }
      /**
       * <code>repeated string search_values = 9;</code>
       */
      public Builder addSearchValuesBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        ensureSearchValuesIsMutable();
        searchValues_.add(value);
        onChanged();
        return this;
      }

      private int pageSize_ ;
      /**
       * <code>int32 page_size = 10;</code>
       */
      public int getPageSize() {
        return pageSize_;
      }
      /**
       * <code>int32 page_size = 10;</code>
       */
      public Builder setPageSize(int value) {
        
        pageSize_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 page_size = 10;</code>
       */
      public Builder clearPageSize() {
        
        pageSize_ = 0;
        onChanged();
        return this;
      }

      private int pageIdx_ ;
      /**
       * <code>int32 page_idx = 11;</code>
       */
      public int getPageIdx() {
        return pageIdx_;
      }
      /**
       * <code>int32 page_idx = 11;</code>
       */
      public Builder setPageIdx(int value) {
        
        pageIdx_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 page_idx = 11;</code>
       */
      public Builder clearPageIdx() {
        
        pageIdx_ = 0;
        onChanged();
        return this;
      }

      private boolean onlyCount_ ;
      /**
       * <code>bool only_count = 12;</code>
       */
      public boolean getOnlyCount() {
        return onlyCount_;
      }
      /**
       * <code>bool only_count = 12;</code>
       */
      public Builder setOnlyCount(boolean value) {
        
        onlyCount_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool only_count = 12;</code>
       */
      public Builder clearOnlyCount() {
        
        onlyCount_ = false;
        onChanged();
        return this;
      }

      private int count_ ;
      /**
       * <code>int32 count = 13;</code>
       */
      public int getCount() {
        return count_;
      }
      /**
       * <code>int32 count = 13;</code>
       */
      public Builder setCount(int value) {
        
        count_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 count = 13;</code>
       */
      public Builder clearCount() {
        
        count_ = 0;
        onChanged();
        return this;
      }
      @Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:ResponseGetRecords)
    }

    // @@protoc_insertion_point(class_scope:ResponseGetRecords)
    private static final ResponseGetRecords DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new ResponseGetRecords();
    }

    public static ResponseGetRecords getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ResponseGetRecords>
        PARSER = new com.google.protobuf.AbstractParser<ResponseGetRecords>() {
      @Override
      public ResponseGetRecords parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new ResponseGetRecords(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<ResponseGetRecords> parser() {
      return PARSER;
    }

    @Override
    public com.google.protobuf.Parser<ResponseGetRecords> getParserForType() {
      return PARSER;
    }

    @Override
    public ResponseGetRecords getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_User_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_User_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Record_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Record_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Request_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Request_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Response_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Response_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_RequestConnect_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_RequestConnect_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ResponseConnect_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ResponseConnect_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_RequestHeartbeat_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_RequestHeartbeat_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ResponseHeartbeat_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ResponseHeartbeat_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_RequestCreateGroup_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_RequestCreateGroup_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ResponseCreateGroup_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ResponseCreateGroup_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_RequestEnterGroup_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_RequestEnterGroup_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ResponseEnterGroup_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ResponseEnterGroup_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_RequestAddRecord_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_RequestAddRecord_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ResponseAddRecord_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ResponseAddRecord_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_RequestRemoveRecord_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_RequestRemoveRecord_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ResponseRemoveRecord_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ResponseRemoveRecord_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_RequestAddAccount_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_RequestAddAccount_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ResponseAddAccount_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ResponseAddAccount_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_RequestRemoveAccount_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_RequestRemoveAccount_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ResponseRemoveAccount_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ResponseRemoveAccount_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_RequestGetAccounts_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_RequestGetAccounts_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ResponseGetAccounts_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ResponseGetAccounts_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_RequestEditNickname_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_RequestEditNickname_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ResponseEditNickname_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ResponseEditNickname_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_RequestGetRecords_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_RequestGetRecords_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ResponseGetRecords_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ResponseGetRecords_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    String[] descriptorData = {
      "\n\017CBMessage.proto\"{\n\004User\022\021\n\tgroupname\030\001" +
      " \001(\t\022\020\n\010username\030\002 \001(\t\022\020\n\010nickname\030\003 \001(\t" +
      "\022\020\n\010password\030\004 \001(\t\022\r\n\005admin\030\005 \001(\010\022\014\n\004rea" +
      "d\030\006 \001(\010\022\r\n\005write\030\007 \001(\010\"\213\001\n\006Record\022\n\n\002id\030" +
      "\001 \001(\005\022\021\n\tgroupname\030\002 \001(\t\022\020\n\010username\030\003 \001" +
      "(\t\022\r\n\005title\030\004 \001(\t\022\017\n\007comment\030\005 \001(\t\022\r\n\005mo" +
      "ney\030\006 \001(\001\022\014\n\004date\030\007 \001(\003\022\023\n\013images_data\030\010" +
      " \003(\t\"\225\005\n\007Request\022)\n\016requestConnect\030\001 \001(\013" +
      "2\017.RequestConnectH\000\022-\n\020requestHeartbeat\030" +
      "\002 \001(\0132\021.RequestHeartbeatH\000\0221\n\022requestCre" +
      "ateGroup\030\003 \001(\0132\023.RequestCreateGroupH\000\022/\n" +
      "\021requestEnterGroup\030\004 \001(\0132\022.RequestEnterG" +
      "roupH\000\022-\n\020requestAddRecord\030\005 \001(\0132\021.Reque" +
      "stAddRecordH\000\0223\n\023requestRemoveRecord\030\006 \001" +
      "(\0132\024.RequestRemoveRecordH\000\022/\n\021requestAdd" +
      "Account\030\007 \001(\0132\022.RequestAddAccountH\000\0225\n\024r" +
      "equestRemoveAccount\030\010 \001(\0132\025.RequestRemov" +
      "eAccountH\000\0221\n\022requestGetAccounts\030\t \001(\0132\023" +
      ".RequestGetAccountsH\000\0223\n\023requestEditNick" +
      "name\030\n \001(\0132\024.RequestEditNicknameH\000\022/\n\021re" +
      "questGetRecords\030\013 \001(\0132\022.RequestGetRecord" +
      "sH\000\022\023\n\004type\030\014 \001(\0162\005.Type\022\021\n\tclient_id\030\r " +
      "\001(\t\022\013\n\003tip\030\016 \001(\t\022\021\n\ttimestamp\030\017 \001(\003\022\022\n\nr" +
      "equest_id\030\020 \001(\005B\013\n\tdata_body\"\254\005\n\010Respons" +
      "e\022+\n\017responseConnect\030\001 \001(\0132\020.ResponseCon" +
      "nectH\000\022/\n\021responseHeartbeat\030\002 \001(\0132\022.Resp" +
      "onseHeartbeatH\000\0223\n\023responseCreateGroup\030\003" +
      " \001(\0132\024.ResponseCreateGroupH\000\0221\n\022response" +
      "EnterGroup\030\004 \001(\0132\023.ResponseEnterGroupH\000\022" +
      "/\n\021responseAddRecord\030\005 \001(\0132\022.ResponseAdd" +
      "RecordH\000\0225\n\024responseRemoveRecord\030\006 \001(\0132\025" +
      ".ResponseRemoveRecordH\000\0221\n\022responseAddAc" +
      "count\030\007 \001(\0132\023.ResponseAddAccountH\000\0227\n\025re" +
      "sponseRemoveAccount\030\010 \001(\0132\026.ResponseRemo" +
      "veAccountH\000\0223\n\023responseGetAccounts\030\t \001(\013" +
      "2\024.ResponseGetAccountsH\000\0225\n\024responseEdit" +
      "Nickname\030\n \001(\0132\025.ResponseEditNicknameH\000\022" +
      "1\n\022responseGetRecords\030\013 \001(\0132\023.ResponseGe" +
      "tRecordsH\000\022\023\n\004type\030\014 \001(\0162\005.Type\022\021\n\tclien" +
      "t_id\030\r \001(\t\022\013\n\003tip\030\016 \001(\t\022\021\n\ttimestamp\030\017 \001" +
      "(\003\022\022\n\nrequest_id\030\020 \001(\005B\013\n\tdata_body\"\020\n\016R" +
      "equestConnect\"0\n\017ResponseConnect\022\016\n\006resu" +
      "lt\030\001 \001(\010\022\r\n\005words\030\002 \001(\t\"\022\n\020RequestHeartb" +
      "eat\"2\n\021ResponseHeartbeat\022\016\n\006result\030\001 \001(\010" +
      "\022\r\n\005words\030\002 \001(\t\"o\n\022RequestCreateGroup\022\021\n" +
      "\tgroupname\030\001 \001(\t\022\026\n\016admin_username\030\002 \001(\t" +
      "\022\026\n\016admin_password\030\003 \001(\t\022\026\n\016admin_nickna" +
      "me\030\004 \001(\t\"4\n\023ResponseCreateGroup\022\016\n\006resul" +
      "t\030\001 \001(\010\022\r\n\005words\030\002 \001(\t\"J\n\021RequestEnterGr" +
      "oup\022\021\n\tgroupname\030\001 \001(\t\022\020\n\010username\030\002 \001(\t" +
      "\022\020\n\010password\030\003 \001(\t\"H\n\022ResponseEnterGroup" +
      "\022\016\n\006result\030\001 \001(\010\022\r\n\005words\030\002 \001(\t\022\023\n\004user\030" +
      "\003 \001(\0132\005.User\">\n\020RequestAddRecord\022\021\n\tgrou" +
      "pname\030\001 \001(\t\022\027\n\006record\030\002 \001(\0132\007.Record\"2\n\021" +
      "ResponseAddRecord\022\016\n\006result\030\001 \001(\010\022\r\n\005wor" +
      "ds\030\002 \001(\t\";\n\023RequestRemoveRecord\022\021\n\tgroup" +
      "name\030\001 \001(\t\022\021\n\trecord_id\030\002 \001(\005\"5\n\024Respons" +
      "eRemoveRecord\022\016\n\006result\030\001 \001(\010\022\r\n\005words\030\002" +
      " \001(\t\";\n\021RequestAddAccount\022\021\n\tgroupname\030\001" +
      " \001(\t\022\023\n\004user\030\002 \001(\0132\005.User\"3\n\022ResponseAdd" +
      "Account\022\016\n\006result\030\001 \001(\010\022\r\n\005words\030\002 \001(\t\";" +
      "\n\024RequestRemoveAccount\022\021\n\tgroupname\030\001 \001(" +
      "\t\022\020\n\010username\030\002 \001(\t\"6\n\025ResponseRemoveAcc" +
      "ount\022\016\n\006result\030\001 \001(\010\022\r\n\005words\030\002 \001(\t\"\'\n\022R" +
      "equestGetAccounts\022\021\n\tgroupname\030\001 \001(\t\"M\n\023" +
      "ResponseGetAccounts\022\016\n\006result\030\001 \001(\010\022\r\n\005w" +
      "ords\030\002 \001(\t\022\027\n\010accounts\030\003 \003(\0132\005.User\"L\n\023R" +
      "equestEditNickname\022\021\n\tgroupname\030\001 \001(\t\022\020\n" +
      "\010username\030\002 \001(\t\022\020\n\010nickname\030\003 \001(\t\"G\n\024Res" +
      "ponseEditNickname\022\016\n\006result\030\001 \001(\010\022\r\n\005wor" +
      "ds\030\002 \001(\t\022\020\n\010nickname\030\003 \001(\t\"\334\001\n\021RequestGe" +
      "tRecords\022\021\n\tgroupname\030\001 \001(\t\022\020\n\010username\030" +
      "\002 \001(\t\022\034\n\tsort_type\030\003 \001(\0162\t.SortType\022\021\n\ta" +
      "scending\030\004 \001(\010\022!\n\014search_types\030\005 \003(\0162\013.S" +
      "earchType\022\025\n\rsearch_values\030\006 \003(\t\022\021\n\tpage" +
      "_size\030\007 \001(\005\022\020\n\010page_idx\030\010 \001(\005\022\022\n\nonly_co" +
      "unt\030\t \001(\010\"\245\002\n\022ResponseGetRecords\022\016\n\006resu" +
      "lt\030\001 \001(\010\022\r\n\005words\030\002 \001(\t\022\021\n\tgroupname\030\003 \001" +
      "(\t\022\020\n\010username\030\004 \001(\t\022\030\n\007records\030\005 \003(\0132\007." +
      "Record\022\034\n\tsort_type\030\006 \001(\0162\t.SortType\022\021\n\t" +
      "ascending\030\007 \001(\010\022!\n\014search_types\030\010 \003(\0162\013." +
      "SearchType\022\025\n\rsearch_values\030\t \003(\t\022\021\n\tpag" +
      "e_size\030\n \001(\005\022\020\n\010page_idx\030\013 \001(\005\022\022\n\nonly_c" +
      "ount\030\014 \001(\010\022\r\n\005count\030\r \001(\005*\320\001\n\004Type\022\013\n\007UN" +
      "KNOWN\020\000\022\013\n\007CONNECT\020\001\022\r\n\tHEARTBEAT\020\002\022\020\n\014C" +
      "REATE_GROUP\020\003\022\017\n\013ENTER_GROUP\020\004\022\016\n\nADD_RE" +
      "CORD\020\005\022\021\n\rREMOVE_RECORD\020\006\022\017\n\013ADD_ACCOUNT" +
      "\020\007\022\022\n\016REMOVE_ACCOUNT\020\010\022\020\n\014GET_ACCOUNTS\020\t" +
      "\022\021\n\rEDIT_NICKNAME\020\n\022\017\n\013GET_RECORDS\020\013*Y\n\010" +
      "SortType\022\013\n\007SORT_ID\020\000\022\016\n\nSORT_TITLE\020\001\022\016\n" +
      "\nSORT_MONEY\020\002\022\021\n\rSORT_USERNAME\020\003\022\r\n\tSORT" +
      "_DATE\020\004*e\n\nSearchType\022\r\n\tSEARCH_ID\020\000\022\020\n\014" +
      "SEARCH_TITLE\020\001\022\020\n\014SEARCH_MONEY\020\002\022\023\n\017SEAR" +
      "CH_USERNAME\020\003\022\017\n\013SEARCH_DATE\020\004b\006proto3"
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
    internal_static_User_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_User_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_User_descriptor,
        new String[] { "Groupname", "Username", "Nickname", "Password", "Admin", "Read", "Write", });
    internal_static_Record_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_Record_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Record_descriptor,
        new String[] { "Id", "Groupname", "Username", "Title", "Comment", "Money", "Date", "ImagesData", });
    internal_static_Request_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_Request_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Request_descriptor,
        new String[] { "RequestConnect", "RequestHeartbeat", "RequestCreateGroup", "RequestEnterGroup", "RequestAddRecord", "RequestRemoveRecord", "RequestAddAccount", "RequestRemoveAccount", "RequestGetAccounts", "RequestEditNickname", "RequestGetRecords", "Type", "ClientId", "Tip", "Timestamp", "RequestId", "DataBody", });
    internal_static_Response_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_Response_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Response_descriptor,
        new String[] { "ResponseConnect", "ResponseHeartbeat", "ResponseCreateGroup", "ResponseEnterGroup", "ResponseAddRecord", "ResponseRemoveRecord", "ResponseAddAccount", "ResponseRemoveAccount", "ResponseGetAccounts", "ResponseEditNickname", "ResponseGetRecords", "Type", "ClientId", "Tip", "Timestamp", "RequestId", "DataBody", });
    internal_static_RequestConnect_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_RequestConnect_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_RequestConnect_descriptor,
        new String[] { });
    internal_static_ResponseConnect_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_ResponseConnect_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ResponseConnect_descriptor,
        new String[] { "Result", "Words", });
    internal_static_RequestHeartbeat_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_RequestHeartbeat_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_RequestHeartbeat_descriptor,
        new String[] { });
    internal_static_ResponseHeartbeat_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_ResponseHeartbeat_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ResponseHeartbeat_descriptor,
        new String[] { "Result", "Words", });
    internal_static_RequestCreateGroup_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_RequestCreateGroup_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_RequestCreateGroup_descriptor,
        new String[] { "Groupname", "AdminUsername", "AdminPassword", "AdminNickname", });
    internal_static_ResponseCreateGroup_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_ResponseCreateGroup_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ResponseCreateGroup_descriptor,
        new String[] { "Result", "Words", });
    internal_static_RequestEnterGroup_descriptor =
      getDescriptor().getMessageTypes().get(10);
    internal_static_RequestEnterGroup_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_RequestEnterGroup_descriptor,
        new String[] { "Groupname", "Username", "Password", });
    internal_static_ResponseEnterGroup_descriptor =
      getDescriptor().getMessageTypes().get(11);
    internal_static_ResponseEnterGroup_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ResponseEnterGroup_descriptor,
        new String[] { "Result", "Words", "User", });
    internal_static_RequestAddRecord_descriptor =
      getDescriptor().getMessageTypes().get(12);
    internal_static_RequestAddRecord_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_RequestAddRecord_descriptor,
        new String[] { "Groupname", "Record", });
    internal_static_ResponseAddRecord_descriptor =
      getDescriptor().getMessageTypes().get(13);
    internal_static_ResponseAddRecord_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ResponseAddRecord_descriptor,
        new String[] { "Result", "Words", });
    internal_static_RequestRemoveRecord_descriptor =
      getDescriptor().getMessageTypes().get(14);
    internal_static_RequestRemoveRecord_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_RequestRemoveRecord_descriptor,
        new String[] { "Groupname", "RecordId", });
    internal_static_ResponseRemoveRecord_descriptor =
      getDescriptor().getMessageTypes().get(15);
    internal_static_ResponseRemoveRecord_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ResponseRemoveRecord_descriptor,
        new String[] { "Result", "Words", });
    internal_static_RequestAddAccount_descriptor =
      getDescriptor().getMessageTypes().get(16);
    internal_static_RequestAddAccount_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_RequestAddAccount_descriptor,
        new String[] { "Groupname", "User", });
    internal_static_ResponseAddAccount_descriptor =
      getDescriptor().getMessageTypes().get(17);
    internal_static_ResponseAddAccount_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ResponseAddAccount_descriptor,
        new String[] { "Result", "Words", });
    internal_static_RequestRemoveAccount_descriptor =
      getDescriptor().getMessageTypes().get(18);
    internal_static_RequestRemoveAccount_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_RequestRemoveAccount_descriptor,
        new String[] { "Groupname", "Username", });
    internal_static_ResponseRemoveAccount_descriptor =
      getDescriptor().getMessageTypes().get(19);
    internal_static_ResponseRemoveAccount_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ResponseRemoveAccount_descriptor,
        new String[] { "Result", "Words", });
    internal_static_RequestGetAccounts_descriptor =
      getDescriptor().getMessageTypes().get(20);
    internal_static_RequestGetAccounts_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_RequestGetAccounts_descriptor,
        new String[] { "Groupname", });
    internal_static_ResponseGetAccounts_descriptor =
      getDescriptor().getMessageTypes().get(21);
    internal_static_ResponseGetAccounts_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ResponseGetAccounts_descriptor,
        new String[] { "Result", "Words", "Accounts", });
    internal_static_RequestEditNickname_descriptor =
      getDescriptor().getMessageTypes().get(22);
    internal_static_RequestEditNickname_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_RequestEditNickname_descriptor,
        new String[] { "Groupname", "Username", "Nickname", });
    internal_static_ResponseEditNickname_descriptor =
      getDescriptor().getMessageTypes().get(23);
    internal_static_ResponseEditNickname_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ResponseEditNickname_descriptor,
        new String[] { "Result", "Words", "Nickname", });
    internal_static_RequestGetRecords_descriptor =
      getDescriptor().getMessageTypes().get(24);
    internal_static_RequestGetRecords_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_RequestGetRecords_descriptor,
        new String[] { "Groupname", "Username", "SortType", "Ascending", "SearchTypes", "SearchValues", "PageSize", "PageIdx", "OnlyCount", });
    internal_static_ResponseGetRecords_descriptor =
      getDescriptor().getMessageTypes().get(25);
    internal_static_ResponseGetRecords_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ResponseGetRecords_descriptor,
        new String[] { "Result", "Words", "Groupname", "Username", "Records", "SortType", "Ascending", "SearchTypes", "SearchValues", "PageSize", "PageIdx", "OnlyCount", "Count", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
