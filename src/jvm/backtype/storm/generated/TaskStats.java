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

public class TaskStats implements TBase<TaskStats, TaskStats._Fields>, java.io.Serializable, Cloneable {
  private static final TStruct STRUCT_DESC = new TStruct("TaskStats");

  private static final TField EMITTED_FIELD_DESC = new TField("emitted", TType.MAP, (short)1);
  private static final TField TRANSFERRED_FIELD_DESC = new TField("transferred", TType.MAP, (short)2);
  private static final TField SPECIFIC_FIELD_DESC = new TField("specific", TType.STRUCT, (short)3);

  private Map<String,Map<Integer,Long>> emitted;
  private Map<String,Map<Integer,Long>> transferred;
  private TaskSpecificStats specific;

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements TFieldIdEnum {
    EMITTED((short)1, "emitted"),
    TRANSFERRED((short)2, "transferred"),
    SPECIFIC((short)3, "specific");

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
        case 1: // EMITTED
          return EMITTED;
        case 2: // TRANSFERRED
          return TRANSFERRED;
        case 3: // SPECIFIC
          return SPECIFIC;
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
    tmpMap.put(_Fields.EMITTED, new FieldMetaData("emitted", TFieldRequirementType.REQUIRED, 
        new MapMetaData(TType.MAP, 
            new FieldValueMetaData(TType.STRING), 
            new MapMetaData(TType.MAP, 
                new FieldValueMetaData(TType.I32), 
                new FieldValueMetaData(TType.I64)))));
    tmpMap.put(_Fields.TRANSFERRED, new FieldMetaData("transferred", TFieldRequirementType.REQUIRED, 
        new MapMetaData(TType.MAP, 
            new FieldValueMetaData(TType.STRING), 
            new MapMetaData(TType.MAP, 
                new FieldValueMetaData(TType.I32), 
                new FieldValueMetaData(TType.I64)))));
    tmpMap.put(_Fields.SPECIFIC, new FieldMetaData("specific", TFieldRequirementType.REQUIRED, 
        new StructMetaData(TType.STRUCT, TaskSpecificStats.class)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    FieldMetaData.addStructMetaDataMap(TaskStats.class, metaDataMap);
  }

  public TaskStats() {
  }

  public TaskStats(
    Map<String,Map<Integer,Long>> emitted,
    Map<String,Map<Integer,Long>> transferred,
    TaskSpecificStats specific)
  {
    this();
    this.emitted = emitted;
    this.transferred = transferred;
    this.specific = specific;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TaskStats(TaskStats other) {
    if (other.is_set_emitted()) {
      Map<String,Map<Integer,Long>> __this__emitted = new HashMap<String,Map<Integer,Long>>();
      for (Map.Entry<String, Map<Integer,Long>> other_element : other.emitted.entrySet()) {

        String other_element_key = other_element.getKey();
        Map<Integer,Long> other_element_value = other_element.getValue();

        String __this__emitted_copy_key = other_element_key;

        Map<Integer,Long> __this__emitted_copy_value = new HashMap<Integer,Long>();
        for (Map.Entry<Integer, Long> other_element_value_element : other_element_value.entrySet()) {

          Integer other_element_value_element_key = other_element_value_element.getKey();
          Long other_element_value_element_value = other_element_value_element.getValue();

          Integer __this__emitted_copy_value_copy_key = other_element_value_element_key;

          Long __this__emitted_copy_value_copy_value = other_element_value_element_value;

          __this__emitted_copy_value.put(__this__emitted_copy_value_copy_key, __this__emitted_copy_value_copy_value);
        }

        __this__emitted.put(__this__emitted_copy_key, __this__emitted_copy_value);
      }
      this.emitted = __this__emitted;
    }
    if (other.is_set_transferred()) {
      Map<String,Map<Integer,Long>> __this__transferred = new HashMap<String,Map<Integer,Long>>();
      for (Map.Entry<String, Map<Integer,Long>> other_element : other.transferred.entrySet()) {

        String other_element_key = other_element.getKey();
        Map<Integer,Long> other_element_value = other_element.getValue();

        String __this__transferred_copy_key = other_element_key;

        Map<Integer,Long> __this__transferred_copy_value = new HashMap<Integer,Long>();
        for (Map.Entry<Integer, Long> other_element_value_element : other_element_value.entrySet()) {

          Integer other_element_value_element_key = other_element_value_element.getKey();
          Long other_element_value_element_value = other_element_value_element.getValue();

          Integer __this__transferred_copy_value_copy_key = other_element_value_element_key;

          Long __this__transferred_copy_value_copy_value = other_element_value_element_value;

          __this__transferred_copy_value.put(__this__transferred_copy_value_copy_key, __this__transferred_copy_value_copy_value);
        }

        __this__transferred.put(__this__transferred_copy_key, __this__transferred_copy_value);
      }
      this.transferred = __this__transferred;
    }
    if (other.is_set_specific()) {
      this.specific = new TaskSpecificStats(other.specific);
    }
  }

  public TaskStats deepCopy() {
    return new TaskStats(this);
  }

  @Deprecated
  public TaskStats clone() {
    return new TaskStats(this);
  }

  public int get_emitted_size() {
    return (this.emitted == null) ? 0 : this.emitted.size();
  }

  public void put_to_emitted(String key, Map<Integer,Long> val) {
    if (this.emitted == null) {
      this.emitted = new HashMap<String,Map<Integer,Long>>();
    }
    this.emitted.put(key, val);
  }

  public Map<String,Map<Integer,Long>> get_emitted() {
    return this.emitted;
  }

  public void set_emitted(Map<String,Map<Integer,Long>> emitted) {
    this.emitted = emitted;
  }

  public void unset_emitted() {
    this.emitted = null;
  }

  /** Returns true if field emitted is set (has been asigned a value) and false otherwise */
  public boolean is_set_emitted() {
    return this.emitted != null;
  }

  public void set_emitted_isSet(boolean value) {
    if (!value) {
      this.emitted = null;
    }
  }

  public int get_transferred_size() {
    return (this.transferred == null) ? 0 : this.transferred.size();
  }

  public void put_to_transferred(String key, Map<Integer,Long> val) {
    if (this.transferred == null) {
      this.transferred = new HashMap<String,Map<Integer,Long>>();
    }
    this.transferred.put(key, val);
  }

  public Map<String,Map<Integer,Long>> get_transferred() {
    return this.transferred;
  }

  public void set_transferred(Map<String,Map<Integer,Long>> transferred) {
    this.transferred = transferred;
  }

  public void unset_transferred() {
    this.transferred = null;
  }

  /** Returns true if field transferred is set (has been asigned a value) and false otherwise */
  public boolean is_set_transferred() {
    return this.transferred != null;
  }

  public void set_transferred_isSet(boolean value) {
    if (!value) {
      this.transferred = null;
    }
  }

  public TaskSpecificStats get_specific() {
    return this.specific;
  }

  public void set_specific(TaskSpecificStats specific) {
    this.specific = specific;
  }

  public void unset_specific() {
    this.specific = null;
  }

  /** Returns true if field specific is set (has been asigned a value) and false otherwise */
  public boolean is_set_specific() {
    return this.specific != null;
  }

  public void set_specific_isSet(boolean value) {
    if (!value) {
      this.specific = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case EMITTED:
      if (value == null) {
        unset_emitted();
      } else {
        set_emitted((Map<String,Map<Integer,Long>>)value);
      }
      break;

    case TRANSFERRED:
      if (value == null) {
        unset_transferred();
      } else {
        set_transferred((Map<String,Map<Integer,Long>>)value);
      }
      break;

    case SPECIFIC:
      if (value == null) {
        unset_specific();
      } else {
        set_specific((TaskSpecificStats)value);
      }
      break;

    }
  }

  public void setFieldValue(int fieldID, Object value) {
    setFieldValue(_Fields.findByThriftIdOrThrow(fieldID), value);
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case EMITTED:
      return get_emitted();

    case TRANSFERRED:
      return get_transferred();

    case SPECIFIC:
      return get_specific();

    }
    throw new IllegalStateException();
  }

  public Object getFieldValue(int fieldId) {
    return getFieldValue(_Fields.findByThriftIdOrThrow(fieldId));
  }

  /** Returns true if field corresponding to fieldID is set (has been asigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    switch (field) {
    case EMITTED:
      return is_set_emitted();
    case TRANSFERRED:
      return is_set_transferred();
    case SPECIFIC:
      return is_set_specific();
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
    if (that instanceof TaskStats)
      return this.equals((TaskStats)that);
    return false;
  }

  public boolean equals(TaskStats that) {
    if (that == null)
      return false;

    boolean this_present_emitted = true && this.is_set_emitted();
    boolean that_present_emitted = true && that.is_set_emitted();
    if (this_present_emitted || that_present_emitted) {
      if (!(this_present_emitted && that_present_emitted))
        return false;
      if (!this.emitted.equals(that.emitted))
        return false;
    }

    boolean this_present_transferred = true && this.is_set_transferred();
    boolean that_present_transferred = true && that.is_set_transferred();
    if (this_present_transferred || that_present_transferred) {
      if (!(this_present_transferred && that_present_transferred))
        return false;
      if (!this.transferred.equals(that.transferred))
        return false;
    }

    boolean this_present_specific = true && this.is_set_specific();
    boolean that_present_specific = true && that.is_set_specific();
    if (this_present_specific || that_present_specific) {
      if (!(this_present_specific && that_present_specific))
        return false;
      if (!this.specific.equals(that.specific))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    HashCodeBuilder builder = new HashCodeBuilder();

    boolean present_emitted = true && (is_set_emitted());
    builder.append(present_emitted);
    if (present_emitted)
      builder.append(emitted);

    boolean present_transferred = true && (is_set_transferred());
    builder.append(present_transferred);
    if (present_transferred)
      builder.append(transferred);

    boolean present_specific = true && (is_set_specific());
    builder.append(present_specific);
    if (present_specific)
      builder.append(specific);

    return builder.toHashCode();
  }

  public int compareTo(TaskStats other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    TaskStats typedOther = (TaskStats)other;

    lastComparison = Boolean.valueOf(is_set_emitted()).compareTo(typedOther.is_set_emitted());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (is_set_emitted()) {      lastComparison = TBaseHelper.compareTo(this.emitted, typedOther.emitted);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(is_set_transferred()).compareTo(typedOther.is_set_transferred());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (is_set_transferred()) {      lastComparison = TBaseHelper.compareTo(this.transferred, typedOther.transferred);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(is_set_specific()).compareTo(typedOther.is_set_specific());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (is_set_specific()) {      lastComparison = TBaseHelper.compareTo(this.specific, typedOther.specific);
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
        case 1: // EMITTED
          if (field.type == TType.MAP) {
            {
              TMap _map101 = iprot.readMapBegin();
              this.emitted = new HashMap<String,Map<Integer,Long>>(2*_map101.size);
              for (int _i102 = 0; _i102 < _map101.size; ++_i102)
              {
                String _key103;
                Map<Integer,Long> _val104;
                _key103 = iprot.readString();
                {
                  TMap _map105 = iprot.readMapBegin();
                  _val104 = new HashMap<Integer,Long>(2*_map105.size);
                  for (int _i106 = 0; _i106 < _map105.size; ++_i106)
                  {
                    int _key107;
                    long _val108;
                    _key107 = iprot.readI32();
                    _val108 = iprot.readI64();
                    _val104.put(_key107, _val108);
                  }
                  iprot.readMapEnd();
                }
                this.emitted.put(_key103, _val104);
              }
              iprot.readMapEnd();
            }
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 2: // TRANSFERRED
          if (field.type == TType.MAP) {
            {
              TMap _map109 = iprot.readMapBegin();
              this.transferred = new HashMap<String,Map<Integer,Long>>(2*_map109.size);
              for (int _i110 = 0; _i110 < _map109.size; ++_i110)
              {
                String _key111;
                Map<Integer,Long> _val112;
                _key111 = iprot.readString();
                {
                  TMap _map113 = iprot.readMapBegin();
                  _val112 = new HashMap<Integer,Long>(2*_map113.size);
                  for (int _i114 = 0; _i114 < _map113.size; ++_i114)
                  {
                    int _key115;
                    long _val116;
                    _key115 = iprot.readI32();
                    _val116 = iprot.readI64();
                    _val112.put(_key115, _val116);
                  }
                  iprot.readMapEnd();
                }
                this.transferred.put(_key111, _val112);
              }
              iprot.readMapEnd();
            }
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 3: // SPECIFIC
          if (field.type == TType.STRUCT) {
            this.specific = new TaskSpecificStats();
            this.specific.read(iprot);
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
    if (this.emitted != null) {
      oprot.writeFieldBegin(EMITTED_FIELD_DESC);
      {
        oprot.writeMapBegin(new TMap(TType.STRING, TType.MAP, this.emitted.size()));
        for (Map.Entry<String, Map<Integer,Long>> _iter117 : this.emitted.entrySet())
        {
          oprot.writeString(_iter117.getKey());
          {
            oprot.writeMapBegin(new TMap(TType.I32, TType.I64, _iter117.getValue().size()));
            for (Map.Entry<Integer, Long> _iter118 : _iter117.getValue().entrySet())
            {
              oprot.writeI32(_iter118.getKey());
              oprot.writeI64(_iter118.getValue());
            }
            oprot.writeMapEnd();
          }
        }
        oprot.writeMapEnd();
      }
      oprot.writeFieldEnd();
    }
    if (this.transferred != null) {
      oprot.writeFieldBegin(TRANSFERRED_FIELD_DESC);
      {
        oprot.writeMapBegin(new TMap(TType.STRING, TType.MAP, this.transferred.size()));
        for (Map.Entry<String, Map<Integer,Long>> _iter119 : this.transferred.entrySet())
        {
          oprot.writeString(_iter119.getKey());
          {
            oprot.writeMapBegin(new TMap(TType.I32, TType.I64, _iter119.getValue().size()));
            for (Map.Entry<Integer, Long> _iter120 : _iter119.getValue().entrySet())
            {
              oprot.writeI32(_iter120.getKey());
              oprot.writeI64(_iter120.getValue());
            }
            oprot.writeMapEnd();
          }
        }
        oprot.writeMapEnd();
      }
      oprot.writeFieldEnd();
    }
    if (this.specific != null) {
      oprot.writeFieldBegin(SPECIFIC_FIELD_DESC);
      this.specific.write(oprot);
      oprot.writeFieldEnd();
    }
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("TaskStats(");
    boolean first = true;

    sb.append("emitted:");
    if (this.emitted == null) {
      sb.append("null");
    } else {
      sb.append(this.emitted);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("transferred:");
    if (this.transferred == null) {
      sb.append("null");
    } else {
      sb.append(this.transferred);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("specific:");
    if (this.specific == null) {
      sb.append("null");
    } else {
      sb.append(this.specific);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws TException {
    // check for required fields
    if (!is_set_emitted()) {
      throw new TProtocolException("Required field 'emitted' is unset! Struct:" + toString());
    }

    if (!is_set_transferred()) {
      throw new TProtocolException("Required field 'transferred' is unset! Struct:" + toString());
    }

    if (!is_set_specific()) {
      throw new TProtocolException("Required field 'specific' is unset! Struct:" + toString());
    }

  }

}

