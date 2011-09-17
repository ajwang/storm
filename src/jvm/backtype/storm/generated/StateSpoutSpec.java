/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 */
package backtype.storm.generated;

import org.apache.commons.lang.builder.HashCodeBuilder;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.apache.thrift.*;
import org.apache.thrift.async.*;
import org.apache.thrift.meta_data.*;
import org.apache.thrift.transport.*;
import org.apache.thrift.protocol.*;

public class StateSpoutSpec implements TBase<StateSpoutSpec, StateSpoutSpec._Fields>, java.io.Serializable, Cloneable {
  private static final TStruct STRUCT_DESC = new TStruct("StateSpoutSpec");

  private static final TField STATE_SPOUT_OBJECT_FIELD_DESC = new TField("state_spout_object", TType.STRUCT, (short)1);
  private static final TField COMMON_FIELD_DESC = new TField("common", TType.STRUCT, (short)2);

  private ComponentObject state_spout_object;
  private ComponentCommon common;

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements TFieldIdEnum {
    STATE_SPOUT_OBJECT((short)1, "state_spout_object"),
    COMMON((short)2, "common");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // STATE_SPOUT_OBJECT
          return STATE_SPOUT_OBJECT;
        case 2: // COMMON
          return COMMON;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments

  public static final Map<_Fields, FieldMetaData> metaDataMap;
  static {
    Map<_Fields, FieldMetaData> tmpMap = new EnumMap<_Fields, FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.STATE_SPOUT_OBJECT, new FieldMetaData("state_spout_object", TFieldRequirementType.REQUIRED, 
        new StructMetaData(TType.STRUCT, ComponentObject.class)));
    tmpMap.put(_Fields.COMMON, new FieldMetaData("common", TFieldRequirementType.REQUIRED, 
        new StructMetaData(TType.STRUCT, ComponentCommon.class)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    FieldMetaData.addStructMetaDataMap(StateSpoutSpec.class, metaDataMap);
  }

  public StateSpoutSpec() {
  }

  public StateSpoutSpec(
    ComponentObject state_spout_object,
    ComponentCommon common)
  {
    this();
    this.state_spout_object = state_spout_object;
    this.common = common;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public StateSpoutSpec(StateSpoutSpec other) {
    if (other.is_set_state_spout_object()) {
      this.state_spout_object = new ComponentObject(other.state_spout_object);
    }
    if (other.is_set_common()) {
      this.common = new ComponentCommon(other.common);
    }
  }

  public StateSpoutSpec deepCopy() {
    return new StateSpoutSpec(this);
  }

  @Deprecated
  public StateSpoutSpec clone() {
    return new StateSpoutSpec(this);
  }

  public ComponentObject get_state_spout_object() {
    return this.state_spout_object;
  }

  public void set_state_spout_object(ComponentObject state_spout_object) {
    this.state_spout_object = state_spout_object;
  }

  public void unset_state_spout_object() {
    this.state_spout_object = null;
  }

  /** Returns true if field state_spout_object is set (has been asigned a value) and false otherwise */
  public boolean is_set_state_spout_object() {
    return this.state_spout_object != null;
  }

  public void set_state_spout_object_isSet(boolean value) {
    if (!value) {
      this.state_spout_object = null;
    }
  }

  public ComponentCommon get_common() {
    return this.common;
  }

  public void set_common(ComponentCommon common) {
    this.common = common;
  }

  public void unset_common() {
    this.common = null;
  }

  /** Returns true if field common is set (has been asigned a value) and false otherwise */
  public boolean is_set_common() {
    return this.common != null;
  }

  public void set_common_isSet(boolean value) {
    if (!value) {
      this.common = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case STATE_SPOUT_OBJECT:
      if (value == null) {
        unset_state_spout_object();
      } else {
        set_state_spout_object((ComponentObject)value);
      }
      break;

    case COMMON:
      if (value == null) {
        unset_common();
      } else {
        set_common((ComponentCommon)value);
      }
      break;

    }
  }

  public void setFieldValue(int fieldID, Object value) {
    setFieldValue(_Fields.findByThriftIdOrThrow(fieldID), value);
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case STATE_SPOUT_OBJECT:
      return get_state_spout_object();

    case COMMON:
      return get_common();

    }
    throw new IllegalStateException();
  }

  public Object getFieldValue(int fieldId) {
    return getFieldValue(_Fields.findByThriftIdOrThrow(fieldId));
  }

  /** Returns true if field corresponding to fieldID is set (has been asigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    switch (field) {
    case STATE_SPOUT_OBJECT:
      return is_set_state_spout_object();
    case COMMON:
      return is_set_common();
    }
    throw new IllegalStateException();
  }

  public boolean isSet(int fieldID) {
    return isSet(_Fields.findByThriftIdOrThrow(fieldID));
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof StateSpoutSpec)
      return this.equals((StateSpoutSpec)that);
    return false;
  }

  public boolean equals(StateSpoutSpec that) {
    if (that == null)
      return false;

    boolean this_present_state_spout_object = true && this.is_set_state_spout_object();
    boolean that_present_state_spout_object = true && that.is_set_state_spout_object();
    if (this_present_state_spout_object || that_present_state_spout_object) {
      if (!(this_present_state_spout_object && that_present_state_spout_object))
        return false;
      if (!this.state_spout_object.equals(that.state_spout_object))
        return false;
    }

    boolean this_present_common = true && this.is_set_common();
    boolean that_present_common = true && that.is_set_common();
    if (this_present_common || that_present_common) {
      if (!(this_present_common && that_present_common))
        return false;
      if (!this.common.equals(that.common))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    HashCodeBuilder builder = new HashCodeBuilder();

    boolean present_state_spout_object = true && (is_set_state_spout_object());
    builder.append(present_state_spout_object);
    if (present_state_spout_object)
      builder.append(state_spout_object);

    boolean present_common = true && (is_set_common());
    builder.append(present_common);
    if (present_common)
      builder.append(common);

    return builder.toHashCode();
  }

  public int compareTo(StateSpoutSpec other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    StateSpoutSpec typedOther = (StateSpoutSpec)other;

    lastComparison = Boolean.valueOf(is_set_state_spout_object()).compareTo(typedOther.is_set_state_spout_object());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (is_set_state_spout_object()) {      lastComparison = TBaseHelper.compareTo(this.state_spout_object, typedOther.state_spout_object);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(is_set_common()).compareTo(typedOther.is_set_common());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (is_set_common()) {      lastComparison = TBaseHelper.compareTo(this.common, typedOther.common);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public void read(TProtocol iprot) throws TException {
    TField field;
    iprot.readStructBegin();
    while (true)
    {
      field = iprot.readFieldBegin();
      if (field.type == TType.STOP) { 
        break;
      }
      switch (field.id) {
        case 1: // STATE_SPOUT_OBJECT
          if (field.type == TType.STRUCT) {
            this.state_spout_object = new ComponentObject();
            this.state_spout_object.read(iprot);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 2: // COMMON
          if (field.type == TType.STRUCT) {
            this.common = new ComponentCommon();
            this.common.read(iprot);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        default:
          TProtocolUtil.skip(iprot, field.type);
      }
      iprot.readFieldEnd();
    }
    iprot.readStructEnd();
    validate();
  }

  public void write(TProtocol oprot) throws TException {
    validate();

    oprot.writeStructBegin(STRUCT_DESC);
    if (this.state_spout_object != null) {
      oprot.writeFieldBegin(STATE_SPOUT_OBJECT_FIELD_DESC);
      this.state_spout_object.write(oprot);
      oprot.writeFieldEnd();
    }
    if (this.common != null) {
      oprot.writeFieldBegin(COMMON_FIELD_DESC);
      this.common.write(oprot);
      oprot.writeFieldEnd();
    }
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("StateSpoutSpec(");
    boolean first = true;

    sb.append("state_spout_object:");
    if (this.state_spout_object == null) {
      sb.append("null");
    } else {
      sb.append(this.state_spout_object);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("common:");
    if (this.common == null) {
      sb.append("null");
    } else {
      sb.append(this.common);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws TException {
    // check for required fields
    if (!is_set_state_spout_object()) {
      throw new TProtocolException("Required field 'state_spout_object' is unset! Struct:" + toString());
    }

    if (!is_set_common()) {
      throw new TProtocolException("Required field 'common' is unset! Struct:" + toString());
    }

  }

}

