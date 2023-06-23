/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/type/decimal.proto

package com.google.type;

/**
 *
 *
 * <pre>
 * A representation of a decimal value, such as 2.5. Clients may convert values
 * into language-native decimal formats, such as Java's [BigDecimal][] or
 * Python's [decimal.Decimal][].
 *
 * [BigDecimal]:
 * https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/math/BigDecimal.html
 * [decimal.Decimal]: https://docs.python.org/3/library/decimal.html
 * </pre>
 *
 * Protobuf type {@code google.type.Decimal}
 */
public final class Decimal extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.type.Decimal)
    DecimalOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use Decimal.newBuilder() to construct.
  private Decimal(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private Decimal() {
    value_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new Decimal();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.type.DecimalProto.internal_static_google_type_Decimal_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.type.DecimalProto.internal_static_google_type_Decimal_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.type.Decimal.class, com.google.type.Decimal.Builder.class);
  }

  public static final int VALUE_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object value_ = "";
  /**
   *
   *
   * <pre>
   * The decimal value, as a string.
   *
   * The string representation consists of an optional sign, `+` (`U+002B`)
   * or `-` (`U+002D`), followed by a sequence of zero or more decimal digits
   * ("the integer"), optionally followed by a fraction, optionally followed
   * by an exponent.
   *
   * The fraction consists of a decimal point followed by zero or more decimal
   * digits. The string must contain at least one digit in either the integer
   * or the fraction. The number formed by the sign, the integer and the
   * fraction is referred to as the significand.
   *
   * The exponent consists of the character `e` (`U+0065`) or `E` (`U+0045`)
   * followed by one or more decimal digits.
   *
   * Services **should** normalize decimal values before storing them by:
   *
   *   - Removing an explicitly-provided `+` sign (`+2.5` -&gt; `2.5`).
   *   - Replacing a zero-length integer value with `0` (`.5` -&gt; `0.5`).
   *   - Coercing the exponent character to lower-case (`2.5E8` -&gt; `2.5e8`).
   *   - Removing an explicitly-provided zero exponent (`2.5e0` -&gt; `2.5`).
   *
   * Services **may** perform additional normalization based on its own needs
   * and the internal decimal implementation selected, such as shifting the
   * decimal point and exponent value together (example: `2.5e-1` &lt;-&gt; `0.25`).
   * Additionally, services **may** preserve trailing zeroes in the fraction
   * to indicate increased precision, but are not required to do so.
   *
   * Note that only the `.` character is supported to divide the integer
   * and the fraction; `,` **should not** be supported regardless of locale.
   * Additionally, thousand separators **should not** be supported. If a
   * service does support them, values **must** be normalized.
   *
   * The ENBF grammar is:
   *
   *     DecimalString =
   *       [Sign] Significand [Exponent];
   *
   *     Sign = '+' | '-';
   *
   *     Significand =
   *       Digits ['.'] [Digits] | [Digits] '.' Digits;
   *
   *     Exponent = ('e' | 'E') [Sign] Digits;
   *
   *     Digits = { '0' | '1' | '2' | '3' | '4' | '5' | '6' | '7' | '8' | '9' };
   *
   * Services **should** clearly document the range of supported values, the
   * maximum supported precision (total number of digits), and, if applicable,
   * the scale (number of digits after the decimal point), as well as how it
   * behaves when receiving out-of-bounds values.
   *
   * Services **may** choose to accept values passed as input even when the
   * value has a higher precision or scale than the service supports, and
   * **should** round the value to fit the supported scale. Alternatively, the
   * service **may** error with `400 Bad Request` (`INVALID_ARGUMENT` in gRPC)
   * if precision would be lost.
   *
   * Services **should** error with `400 Bad Request` (`INVALID_ARGUMENT` in
   * gRPC) if the service receives a value outside of the supported range.
   * </pre>
   *
   * <code>string value = 1;</code>
   *
   * @return The value.
   */
  @java.lang.Override
  public java.lang.String getValue() {
    java.lang.Object ref = value_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      value_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * The decimal value, as a string.
   *
   * The string representation consists of an optional sign, `+` (`U+002B`)
   * or `-` (`U+002D`), followed by a sequence of zero or more decimal digits
   * ("the integer"), optionally followed by a fraction, optionally followed
   * by an exponent.
   *
   * The fraction consists of a decimal point followed by zero or more decimal
   * digits. The string must contain at least one digit in either the integer
   * or the fraction. The number formed by the sign, the integer and the
   * fraction is referred to as the significand.
   *
   * The exponent consists of the character `e` (`U+0065`) or `E` (`U+0045`)
   * followed by one or more decimal digits.
   *
   * Services **should** normalize decimal values before storing them by:
   *
   *   - Removing an explicitly-provided `+` sign (`+2.5` -&gt; `2.5`).
   *   - Replacing a zero-length integer value with `0` (`.5` -&gt; `0.5`).
   *   - Coercing the exponent character to lower-case (`2.5E8` -&gt; `2.5e8`).
   *   - Removing an explicitly-provided zero exponent (`2.5e0` -&gt; `2.5`).
   *
   * Services **may** perform additional normalization based on its own needs
   * and the internal decimal implementation selected, such as shifting the
   * decimal point and exponent value together (example: `2.5e-1` &lt;-&gt; `0.25`).
   * Additionally, services **may** preserve trailing zeroes in the fraction
   * to indicate increased precision, but are not required to do so.
   *
   * Note that only the `.` character is supported to divide the integer
   * and the fraction; `,` **should not** be supported regardless of locale.
   * Additionally, thousand separators **should not** be supported. If a
   * service does support them, values **must** be normalized.
   *
   * The ENBF grammar is:
   *
   *     DecimalString =
   *       [Sign] Significand [Exponent];
   *
   *     Sign = '+' | '-';
   *
   *     Significand =
   *       Digits ['.'] [Digits] | [Digits] '.' Digits;
   *
   *     Exponent = ('e' | 'E') [Sign] Digits;
   *
   *     Digits = { '0' | '1' | '2' | '3' | '4' | '5' | '6' | '7' | '8' | '9' };
   *
   * Services **should** clearly document the range of supported values, the
   * maximum supported precision (total number of digits), and, if applicable,
   * the scale (number of digits after the decimal point), as well as how it
   * behaves when receiving out-of-bounds values.
   *
   * Services **may** choose to accept values passed as input even when the
   * value has a higher precision or scale than the service supports, and
   * **should** round the value to fit the supported scale. Alternatively, the
   * service **may** error with `400 Bad Request` (`INVALID_ARGUMENT` in gRPC)
   * if precision would be lost.
   *
   * Services **should** error with `400 Bad Request` (`INVALID_ARGUMENT` in
   * gRPC) if the service receives a value outside of the supported range.
   * </pre>
   *
   * <code>string value = 1;</code>
   *
   * @return The bytes for value.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getValueBytes() {
    java.lang.Object ref = value_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      value_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

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
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(value_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, value_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(value_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, value_);
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
    if (!(obj instanceof com.google.type.Decimal)) {
      return super.equals(obj);
    }
    com.google.type.Decimal other = (com.google.type.Decimal) obj;

    if (!getValue().equals(other.getValue())) return false;
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
    hash = (37 * hash) + VALUE_FIELD_NUMBER;
    hash = (53 * hash) + getValue().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.type.Decimal parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.type.Decimal parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.type.Decimal parseFrom(com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.type.Decimal parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.type.Decimal parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.type.Decimal parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.type.Decimal parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.type.Decimal parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.type.Decimal parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.type.Decimal parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.type.Decimal parseFrom(com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.type.Decimal parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(com.google.type.Decimal prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   *
   *
   * <pre>
   * A representation of a decimal value, such as 2.5. Clients may convert values
   * into language-native decimal formats, such as Java's [BigDecimal][] or
   * Python's [decimal.Decimal][].
   *
   * [BigDecimal]:
   * https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/math/BigDecimal.html
   * [decimal.Decimal]: https://docs.python.org/3/library/decimal.html
   * </pre>
   *
   * Protobuf type {@code google.type.Decimal}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.type.Decimal)
      com.google.type.DecimalOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.type.DecimalProto.internal_static_google_type_Decimal_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.type.DecimalProto.internal_static_google_type_Decimal_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.type.Decimal.class, com.google.type.Decimal.Builder.class);
    }

    // Construct using com.google.type.Decimal.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      value_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.type.DecimalProto.internal_static_google_type_Decimal_descriptor;
    }

    @java.lang.Override
    public com.google.type.Decimal getDefaultInstanceForType() {
      return com.google.type.Decimal.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.type.Decimal build() {
      com.google.type.Decimal result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.type.Decimal buildPartial() {
      com.google.type.Decimal result = new com.google.type.Decimal(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.type.Decimal result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.value_ = value_;
      }
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }

    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.type.Decimal) {
        return mergeFrom((com.google.type.Decimal) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.type.Decimal other) {
      if (other == com.google.type.Decimal.getDefaultInstance()) return this;
      if (!other.getValue().isEmpty()) {
        value_ = other.value_;
        bitField0_ |= 0x00000001;
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
            case 10:
              {
                value_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            default:
              {
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

    private java.lang.Object value_ = "";
    /**
     *
     *
     * <pre>
     * The decimal value, as a string.
     *
     * The string representation consists of an optional sign, `+` (`U+002B`)
     * or `-` (`U+002D`), followed by a sequence of zero or more decimal digits
     * ("the integer"), optionally followed by a fraction, optionally followed
     * by an exponent.
     *
     * The fraction consists of a decimal point followed by zero or more decimal
     * digits. The string must contain at least one digit in either the integer
     * or the fraction. The number formed by the sign, the integer and the
     * fraction is referred to as the significand.
     *
     * The exponent consists of the character `e` (`U+0065`) or `E` (`U+0045`)
     * followed by one or more decimal digits.
     *
     * Services **should** normalize decimal values before storing them by:
     *
     *   - Removing an explicitly-provided `+` sign (`+2.5` -&gt; `2.5`).
     *   - Replacing a zero-length integer value with `0` (`.5` -&gt; `0.5`).
     *   - Coercing the exponent character to lower-case (`2.5E8` -&gt; `2.5e8`).
     *   - Removing an explicitly-provided zero exponent (`2.5e0` -&gt; `2.5`).
     *
     * Services **may** perform additional normalization based on its own needs
     * and the internal decimal implementation selected, such as shifting the
     * decimal point and exponent value together (example: `2.5e-1` &lt;-&gt; `0.25`).
     * Additionally, services **may** preserve trailing zeroes in the fraction
     * to indicate increased precision, but are not required to do so.
     *
     * Note that only the `.` character is supported to divide the integer
     * and the fraction; `,` **should not** be supported regardless of locale.
     * Additionally, thousand separators **should not** be supported. If a
     * service does support them, values **must** be normalized.
     *
     * The ENBF grammar is:
     *
     *     DecimalString =
     *       [Sign] Significand [Exponent];
     *
     *     Sign = '+' | '-';
     *
     *     Significand =
     *       Digits ['.'] [Digits] | [Digits] '.' Digits;
     *
     *     Exponent = ('e' | 'E') [Sign] Digits;
     *
     *     Digits = { '0' | '1' | '2' | '3' | '4' | '5' | '6' | '7' | '8' | '9' };
     *
     * Services **should** clearly document the range of supported values, the
     * maximum supported precision (total number of digits), and, if applicable,
     * the scale (number of digits after the decimal point), as well as how it
     * behaves when receiving out-of-bounds values.
     *
     * Services **may** choose to accept values passed as input even when the
     * value has a higher precision or scale than the service supports, and
     * **should** round the value to fit the supported scale. Alternatively, the
     * service **may** error with `400 Bad Request` (`INVALID_ARGUMENT` in gRPC)
     * if precision would be lost.
     *
     * Services **should** error with `400 Bad Request` (`INVALID_ARGUMENT` in
     * gRPC) if the service receives a value outside of the supported range.
     * </pre>
     *
     * <code>string value = 1;</code>
     *
     * @return The value.
     */
    public java.lang.String getValue() {
      java.lang.Object ref = value_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        value_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The decimal value, as a string.
     *
     * The string representation consists of an optional sign, `+` (`U+002B`)
     * or `-` (`U+002D`), followed by a sequence of zero or more decimal digits
     * ("the integer"), optionally followed by a fraction, optionally followed
     * by an exponent.
     *
     * The fraction consists of a decimal point followed by zero or more decimal
     * digits. The string must contain at least one digit in either the integer
     * or the fraction. The number formed by the sign, the integer and the
     * fraction is referred to as the significand.
     *
     * The exponent consists of the character `e` (`U+0065`) or `E` (`U+0045`)
     * followed by one or more decimal digits.
     *
     * Services **should** normalize decimal values before storing them by:
     *
     *   - Removing an explicitly-provided `+` sign (`+2.5` -&gt; `2.5`).
     *   - Replacing a zero-length integer value with `0` (`.5` -&gt; `0.5`).
     *   - Coercing the exponent character to lower-case (`2.5E8` -&gt; `2.5e8`).
     *   - Removing an explicitly-provided zero exponent (`2.5e0` -&gt; `2.5`).
     *
     * Services **may** perform additional normalization based on its own needs
     * and the internal decimal implementation selected, such as shifting the
     * decimal point and exponent value together (example: `2.5e-1` &lt;-&gt; `0.25`).
     * Additionally, services **may** preserve trailing zeroes in the fraction
     * to indicate increased precision, but are not required to do so.
     *
     * Note that only the `.` character is supported to divide the integer
     * and the fraction; `,` **should not** be supported regardless of locale.
     * Additionally, thousand separators **should not** be supported. If a
     * service does support them, values **must** be normalized.
     *
     * The ENBF grammar is:
     *
     *     DecimalString =
     *       [Sign] Significand [Exponent];
     *
     *     Sign = '+' | '-';
     *
     *     Significand =
     *       Digits ['.'] [Digits] | [Digits] '.' Digits;
     *
     *     Exponent = ('e' | 'E') [Sign] Digits;
     *
     *     Digits = { '0' | '1' | '2' | '3' | '4' | '5' | '6' | '7' | '8' | '9' };
     *
     * Services **should** clearly document the range of supported values, the
     * maximum supported precision (total number of digits), and, if applicable,
     * the scale (number of digits after the decimal point), as well as how it
     * behaves when receiving out-of-bounds values.
     *
     * Services **may** choose to accept values passed as input even when the
     * value has a higher precision or scale than the service supports, and
     * **should** round the value to fit the supported scale. Alternatively, the
     * service **may** error with `400 Bad Request` (`INVALID_ARGUMENT` in gRPC)
     * if precision would be lost.
     *
     * Services **should** error with `400 Bad Request` (`INVALID_ARGUMENT` in
     * gRPC) if the service receives a value outside of the supported range.
     * </pre>
     *
     * <code>string value = 1;</code>
     *
     * @return The bytes for value.
     */
    public com.google.protobuf.ByteString getValueBytes() {
      java.lang.Object ref = value_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        value_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The decimal value, as a string.
     *
     * The string representation consists of an optional sign, `+` (`U+002B`)
     * or `-` (`U+002D`), followed by a sequence of zero or more decimal digits
     * ("the integer"), optionally followed by a fraction, optionally followed
     * by an exponent.
     *
     * The fraction consists of a decimal point followed by zero or more decimal
     * digits. The string must contain at least one digit in either the integer
     * or the fraction. The number formed by the sign, the integer and the
     * fraction is referred to as the significand.
     *
     * The exponent consists of the character `e` (`U+0065`) or `E` (`U+0045`)
     * followed by one or more decimal digits.
     *
     * Services **should** normalize decimal values before storing them by:
     *
     *   - Removing an explicitly-provided `+` sign (`+2.5` -&gt; `2.5`).
     *   - Replacing a zero-length integer value with `0` (`.5` -&gt; `0.5`).
     *   - Coercing the exponent character to lower-case (`2.5E8` -&gt; `2.5e8`).
     *   - Removing an explicitly-provided zero exponent (`2.5e0` -&gt; `2.5`).
     *
     * Services **may** perform additional normalization based on its own needs
     * and the internal decimal implementation selected, such as shifting the
     * decimal point and exponent value together (example: `2.5e-1` &lt;-&gt; `0.25`).
     * Additionally, services **may** preserve trailing zeroes in the fraction
     * to indicate increased precision, but are not required to do so.
     *
     * Note that only the `.` character is supported to divide the integer
     * and the fraction; `,` **should not** be supported regardless of locale.
     * Additionally, thousand separators **should not** be supported. If a
     * service does support them, values **must** be normalized.
     *
     * The ENBF grammar is:
     *
     *     DecimalString =
     *       [Sign] Significand [Exponent];
     *
     *     Sign = '+' | '-';
     *
     *     Significand =
     *       Digits ['.'] [Digits] | [Digits] '.' Digits;
     *
     *     Exponent = ('e' | 'E') [Sign] Digits;
     *
     *     Digits = { '0' | '1' | '2' | '3' | '4' | '5' | '6' | '7' | '8' | '9' };
     *
     * Services **should** clearly document the range of supported values, the
     * maximum supported precision (total number of digits), and, if applicable,
     * the scale (number of digits after the decimal point), as well as how it
     * behaves when receiving out-of-bounds values.
     *
     * Services **may** choose to accept values passed as input even when the
     * value has a higher precision or scale than the service supports, and
     * **should** round the value to fit the supported scale. Alternatively, the
     * service **may** error with `400 Bad Request` (`INVALID_ARGUMENT` in gRPC)
     * if precision would be lost.
     *
     * Services **should** error with `400 Bad Request` (`INVALID_ARGUMENT` in
     * gRPC) if the service receives a value outside of the supported range.
     * </pre>
     *
     * <code>string value = 1;</code>
     *
     * @param value The value to set.
     * @return This builder for chaining.
     */
    public Builder setValue(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      value_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The decimal value, as a string.
     *
     * The string representation consists of an optional sign, `+` (`U+002B`)
     * or `-` (`U+002D`), followed by a sequence of zero or more decimal digits
     * ("the integer"), optionally followed by a fraction, optionally followed
     * by an exponent.
     *
     * The fraction consists of a decimal point followed by zero or more decimal
     * digits. The string must contain at least one digit in either the integer
     * or the fraction. The number formed by the sign, the integer and the
     * fraction is referred to as the significand.
     *
     * The exponent consists of the character `e` (`U+0065`) or `E` (`U+0045`)
     * followed by one or more decimal digits.
     *
     * Services **should** normalize decimal values before storing them by:
     *
     *   - Removing an explicitly-provided `+` sign (`+2.5` -&gt; `2.5`).
     *   - Replacing a zero-length integer value with `0` (`.5` -&gt; `0.5`).
     *   - Coercing the exponent character to lower-case (`2.5E8` -&gt; `2.5e8`).
     *   - Removing an explicitly-provided zero exponent (`2.5e0` -&gt; `2.5`).
     *
     * Services **may** perform additional normalization based on its own needs
     * and the internal decimal implementation selected, such as shifting the
     * decimal point and exponent value together (example: `2.5e-1` &lt;-&gt; `0.25`).
     * Additionally, services **may** preserve trailing zeroes in the fraction
     * to indicate increased precision, but are not required to do so.
     *
     * Note that only the `.` character is supported to divide the integer
     * and the fraction; `,` **should not** be supported regardless of locale.
     * Additionally, thousand separators **should not** be supported. If a
     * service does support them, values **must** be normalized.
     *
     * The ENBF grammar is:
     *
     *     DecimalString =
     *       [Sign] Significand [Exponent];
     *
     *     Sign = '+' | '-';
     *
     *     Significand =
     *       Digits ['.'] [Digits] | [Digits] '.' Digits;
     *
     *     Exponent = ('e' | 'E') [Sign] Digits;
     *
     *     Digits = { '0' | '1' | '2' | '3' | '4' | '5' | '6' | '7' | '8' | '9' };
     *
     * Services **should** clearly document the range of supported values, the
     * maximum supported precision (total number of digits), and, if applicable,
     * the scale (number of digits after the decimal point), as well as how it
     * behaves when receiving out-of-bounds values.
     *
     * Services **may** choose to accept values passed as input even when the
     * value has a higher precision or scale than the service supports, and
     * **should** round the value to fit the supported scale. Alternatively, the
     * service **may** error with `400 Bad Request` (`INVALID_ARGUMENT` in gRPC)
     * if precision would be lost.
     *
     * Services **should** error with `400 Bad Request` (`INVALID_ARGUMENT` in
     * gRPC) if the service receives a value outside of the supported range.
     * </pre>
     *
     * <code>string value = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearValue() {
      value_ = getDefaultInstance().getValue();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The decimal value, as a string.
     *
     * The string representation consists of an optional sign, `+` (`U+002B`)
     * or `-` (`U+002D`), followed by a sequence of zero or more decimal digits
     * ("the integer"), optionally followed by a fraction, optionally followed
     * by an exponent.
     *
     * The fraction consists of a decimal point followed by zero or more decimal
     * digits. The string must contain at least one digit in either the integer
     * or the fraction. The number formed by the sign, the integer and the
     * fraction is referred to as the significand.
     *
     * The exponent consists of the character `e` (`U+0065`) or `E` (`U+0045`)
     * followed by one or more decimal digits.
     *
     * Services **should** normalize decimal values before storing them by:
     *
     *   - Removing an explicitly-provided `+` sign (`+2.5` -&gt; `2.5`).
     *   - Replacing a zero-length integer value with `0` (`.5` -&gt; `0.5`).
     *   - Coercing the exponent character to lower-case (`2.5E8` -&gt; `2.5e8`).
     *   - Removing an explicitly-provided zero exponent (`2.5e0` -&gt; `2.5`).
     *
     * Services **may** perform additional normalization based on its own needs
     * and the internal decimal implementation selected, such as shifting the
     * decimal point and exponent value together (example: `2.5e-1` &lt;-&gt; `0.25`).
     * Additionally, services **may** preserve trailing zeroes in the fraction
     * to indicate increased precision, but are not required to do so.
     *
     * Note that only the `.` character is supported to divide the integer
     * and the fraction; `,` **should not** be supported regardless of locale.
     * Additionally, thousand separators **should not** be supported. If a
     * service does support them, values **must** be normalized.
     *
     * The ENBF grammar is:
     *
     *     DecimalString =
     *       [Sign] Significand [Exponent];
     *
     *     Sign = '+' | '-';
     *
     *     Significand =
     *       Digits ['.'] [Digits] | [Digits] '.' Digits;
     *
     *     Exponent = ('e' | 'E') [Sign] Digits;
     *
     *     Digits = { '0' | '1' | '2' | '3' | '4' | '5' | '6' | '7' | '8' | '9' };
     *
     * Services **should** clearly document the range of supported values, the
     * maximum supported precision (total number of digits), and, if applicable,
     * the scale (number of digits after the decimal point), as well as how it
     * behaves when receiving out-of-bounds values.
     *
     * Services **may** choose to accept values passed as input even when the
     * value has a higher precision or scale than the service supports, and
     * **should** round the value to fit the supported scale. Alternatively, the
     * service **may** error with `400 Bad Request` (`INVALID_ARGUMENT` in gRPC)
     * if precision would be lost.
     *
     * Services **should** error with `400 Bad Request` (`INVALID_ARGUMENT` in
     * gRPC) if the service receives a value outside of the supported range.
     * </pre>
     *
     * <code>string value = 1;</code>
     *
     * @param value The bytes for value to set.
     * @return This builder for chaining.
     */
    public Builder setValueBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      value_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.type.Decimal)
  }

  // @@protoc_insertion_point(class_scope:google.type.Decimal)
  private static final com.google.type.Decimal DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.type.Decimal();
  }

  public static com.google.type.Decimal getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Decimal> PARSER =
      new com.google.protobuf.AbstractParser<Decimal>() {
        @java.lang.Override
        public Decimal parsePartialFrom(
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

  public static com.google.protobuf.Parser<Decimal> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Decimal> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.type.Decimal getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
