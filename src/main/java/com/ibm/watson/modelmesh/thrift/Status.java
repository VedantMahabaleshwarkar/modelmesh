/**
 * Autogenerated by Thrift Compiler (0.14.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.ibm.watson.modelmesh.thrift;


@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.14.2)")
public enum Status implements org.apache.thrift.TEnum {
  NOT_FOUND(0),
  NOT_LOADED(1),
  LOADING(2),
  LOADED(3),
  LOADING_FAILED(4),
  NOT_CHECKED(5);

  private final int value;

  private Status(int value) {
    this.value = value;
  }

  /**
   * Get the integer value of this enum value, as defined in the Thrift IDL.
   */
  public int getValue() {
    return value;
  }

  /**
   * Find a the enum type by its integer value, as defined in the Thrift IDL.
   * @return null if the value is not found.
   */
  @org.apache.thrift.annotation.Nullable
  public static Status findByValue(int value) { 
    switch (value) {
      case 0:
        return NOT_FOUND;
      case 1:
        return NOT_LOADED;
      case 2:
        return LOADING;
      case 3:
        return LOADED;
      case 4:
        return LOADING_FAILED;
      case 5:
        return NOT_CHECKED;
      default:
        return null;
    }
  }
}