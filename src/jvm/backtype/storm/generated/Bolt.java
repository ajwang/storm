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

public class Bolt implements TBase<Bolt, Bolt._Fields>, java.io.Serializable, Cloneable {
  private static final TStruct STRUCT_DESC = new TStruct("Bolt");

  private static final TField INPUTS_FIELD_DESC = new TField("inputs", TType.MAP, (short)1);
  private static final TField BOLT_OBJECT_FIELD_DESC = new TField("bolt_object", TType.STRUCT, (short)2);
  private static final TField COMMON_FIELD_DESC = new TField("common", TType.STRUCT, (short)3);

  private Map<GlobalStreamId,Grouping> inputs;
  private ComponentObject bolt_object;
  private ComponentCommon common;

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements TFieldIdEnum {
    INPUTS((short)1, "inputs"),
    BOLT_OBJECT((short)2, "bolt_object"),
    COMMON((short)3, "common");

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
        case 1: // INPUTS
          return INPUTS;
        case 2: // BOLT_OBJECT
          return BOLT_OBJECT;
        case 3: // COMMON
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
    tmpMap.put(_Fields.INPUTS, new FieldMetaData("inputs", TFieldRequirementType.REQUIRED, 
        new MapMetaData(TType.MAP, 
            new StructMetaData(TType.STRUCT, GlobalStreamId.class), 
            new StructMetaData(TType.STRUCT, Grouping.class))));
    tmpMap.put(_Fields.BOLT_OBJECT, new FieldMetaData("bolt_object", TFieldRequirementType.REQUIRED, 
        new StructMetaData(TType.STRUCT, ComponentObject.class)));
    tmpMap.put(_Fields.COMMON, new FieldMetaData("common", TFieldRequirementType.REQUIRED, 
        new StructMetaData(TType.STRUCT, ComponentCommon.class)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    FieldMetaData.addStructMetaDataMap(Bolt.class, metaDataMap);
  }

  public Bolt() {
  }

  public Bolt(
    Map<GlobalStreamId,Grouping> inputs,
    ComponentObject bolt_object,
    ComponentCommon common)
  {
    this();
    this.inputs = inputs;
    this.bolt_object = bolt_object;
    this.common = common;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public Bolt(Bolt other) {
    if (other.is_set_inputs()) {
      Map<GlobalStreamId,Grouping> __this__inputs = new HashMap<GlobalStreamId,Grouping>();
      for (Map.Entry<GlobalStreamId, Grouping> other_element : other.inputs.entrySet()) {

        GlobalStreamId other_element_key = other_element.getKey();
        Grouping other_element_value = other_element.getValue();

        GlobalStreamId __this__inputs_copy_key = new GlobalStreamId(other_element_key);

        Grouping __this__inputs_copy_value = new Grouping(other_element_value);

        __this__inputs.put(__this__inputs_copy_key, __this__inputs_copy_value);
      }
      this.inputs = __this__inputs;
    }
    if (other.is_set_bolt_object()) {
      this.bolt_object = new ComponentObject(other.bolt_object);
    }
    if (other.is_set_common()) {
      this.common = new ComponentCommon(other.common);
    }
  }

  public Bolt deepCopy() {
    return new Bolt(this);
  }

  @Deprecated
  public Bolt clone() {
    return new Bolt(this);
  }

  public int get_inputs_size() {
    return (this.inputs == null) ? 0 : this.inputs.size();
  }

  public void put_to_inputs(GlobalStreamId key, Grouping val) {
    if (this.inputs == null) {
      this.inputs = new HashMap<GlobalStreamId,Grouping>();
    }
    this.inputs.put(key, val);
  }

  public Map<GlobalStreamId,Grouping> get_inputs() {
    return this.inputs;
  }

  public void set_inputs(Map<GlobalStreamId,Grouping> inputs) {
    this.inputs = inputs;
  }

  public void unset_inputs() {
    this.inputs = null;
  }

  /** Returns true if field inputs is set (has been asigned a value) and false otherwise */
  public boolean is_set_inputs() {
    return this.inputs != null;
  }

  public void set_inputs_isSet(boolean value) {
    if (!value) {
      this.inputs = null;
    }
  }

  public ComponentObject get_bolt_object() {
    return this.bolt_object;
  }

  public void set_bolt_object(ComponentObject bolt_object) {
    this.bolt_object = bolt_object;
  }

  public void unset_bolt_object() {
    this.bolt_object = null;
  }

  /** Returns true if field bolt_object is set (has been asigned a value) and false otherwise */
  public boolean is_set_bolt_object() {
    return this.bolt_object != null;
  }

  public void set_bolt_object_isSet(boolean value) {
    if (!value) {
      this.bolt_object = null;
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
    case INPUTS:
      if (value == null) {
        unset_inputs();
      } else {
        set_inputs((Map<GlobalStreamId,Grouping>)value);
      }
      break;

    case BOLT_OBJECT:
      if (value == null) {
        unset_bolt_object();
      } else {
        set_bolt_object((ComponentObject)value);
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
    case INPUTS:
      return get_inputs();

    case BOLT_OBJECT:
      return get_bolt_object();

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
    case INPUTS:
      return is_set_inputs();
    case BOLT_OBJECT:
      return is_set_bolt_object();
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
    if (that instanceof Bolt)
      return this.equals((Bolt)that);
    return false;
  }

  public boolean equals(Bolt that) {
    if (that == null)
      return false;

    boolean this_present_inputs = true && this.is_set_inputs();
    boolean that_present_inputs = true && that.is_set_inputs();
    if (this_present_inputs || that_present_inputs) {
      if (!(this_present_inputs && that_present_inputs))
        return false;
      if (!this.inputs.equals(that.inputs))
        return false;
    }

    boolean this_present_bolt_object = true && this.is_set_bolt_object();
    boolean that_present_bolt_object = true && that.is_set_bolt_object();
    if (this_present_bolt_object || that_present_bolt_object) {
      if (!(this_present_bolt_object && that_present_bolt_object))
        return false;
      if (!this.bolt_object.equals(that.bolt_object))
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

    boolean present_inputs = true && (is_set_inputs());
    builder.append(present_inputs);
    if (present_inputs)
      builder.append(inputs);

    boolean present_bolt_object = true && (is_set_bolt_object());
    builder.append(present_bolt_object);
    if (present_bolt_object)
      builder.append(bolt_object);

    boolean present_common = true && (is_set_common());
    builder.append(present_common);
    if (present_common)
      builder.append(common);

    return builder.toHashCode();
  }

  public int compareTo(Bolt other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    Bolt typedOther = (Bolt)other;

    lastComparison = Boolean.valueOf(is_set_inputs()).compareTo(typedOther.is_set_inputs());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (is_set_inputs()) {      lastComparison = TBaseHelper.compareTo(this.inputs, typedOther.inputs);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(is_set_bolt_object()).compareTo(typedOther.is_set_bolt_object());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (is_set_bolt_object()) {      lastComparison = TBaseHelper.compareTo(this.bolt_object, typedOther.bolt_object);
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
        case 1: // INPUTS
          if (field.type == TType.MAP) {
            {
              TMap _map13 = iprot.readMapBegin();
              this.inputs = new HashMap<GlobalStreamId,Grouping>(2*_map13.size);
              for (int _i14 = 0; _i14 < _map13.size; ++_i14)
              {
                GlobalStreamId _key15;
                Grouping _val16;
                _key15 = new GlobalStreamId();
                _key15.read(iprot);
                _val16 = new Grouping();
                _val16.read(iprot);
                this.inputs.put(_key15, _val16);
              }
              iprot.readMapEnd();
            }
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 2: // BOLT_OBJECT
          if (field.type == TType.STRUCT) {
            this.bolt_object = new ComponentObject();
            this.bolt_object.read(iprot);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 3: // COMMON
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
    if (this.inputs != null) {
      oprot.writeFieldBegin(INPUTS_FIELD_DESC);
      {
        oprot.writeMapBegin(new TMap(TType.STRUCT, TType.STRUCT, this.inputs.size()));
        for (Map.Entry<GlobalStreamId, Grouping> _iter17 : this.inputs.entrySet())
        {
          _iter17.getKey().write(oprot);
          _iter17.getValue().write(oprot);
        }
        oprot.writeMapEnd();
      }
      oprot.writeFieldEnd();
    }
    if (this.bolt_object != null) {
      oprot.writeFieldBegin(BOLT_OBJECT_FIELD_DESC);
      this.bolt_object.write(oprot);
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
    StringBuilder sb = new StringBuilder("Bolt(");
    boolean first = true;

    sb.append("inputs:");
    if (this.inputs == null) {
      sb.append("null");
    } else {
      sb.append(this.inputs);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("bolt_object:");
    if (this.bolt_object == null) {
      sb.append("null");
    } else {
      sb.append(this.bolt_object);
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
    if (!is_set_inputs()) {
      throw new TProtocolException("Required field 'inputs' is unset! Struct:" + toString());
    }

    if (!is_set_bolt_object()) {
      throw new TProtocolException("Required field 'bolt_object' is unset! Struct:" + toString());
    }

    if (!is_set_common()) {
      throw new TProtocolException("Required field 'common' is unset! Struct:" + toString());
    }

  }

}

