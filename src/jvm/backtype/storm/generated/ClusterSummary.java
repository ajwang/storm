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

public class ClusterSummary implements TBase<ClusterSummary, ClusterSummary._Fields>, java.io.Serializable, Cloneable {
  private static final TStruct STRUCT_DESC = new TStruct("ClusterSummary");

  private static final TField SUPERVISORS_FIELD_DESC = new TField("supervisors", TType.LIST, (short)1);
  private static final TField NIMBUS_UPTIME_SECS_FIELD_DESC = new TField("nimbus_uptime_secs", TType.I32, (short)2);
  private static final TField TOPOLOGIES_FIELD_DESC = new TField("topologies", TType.LIST, (short)3);

  private List<SupervisorSummary> supervisors;
  private int nimbus_uptime_secs;
  private List<TopologySummary> topologies;

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements TFieldIdEnum {
    SUPERVISORS((short)1, "supervisors"),
    NIMBUS_UPTIME_SECS((short)2, "nimbus_uptime_secs"),
    TOPOLOGIES((short)3, "topologies");

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
        case 1: // SUPERVISORS
          return SUPERVISORS;
        case 2: // NIMBUS_UPTIME_SECS
          return NIMBUS_UPTIME_SECS;
        case 3: // TOPOLOGIES
          return TOPOLOGIES;
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
  private static final int __NIMBUS_UPTIME_SECS_ISSET_ID = 0;
  private BitSet __isset_bit_vector = new BitSet(1);

  public static final Map<_Fields, FieldMetaData> metaDataMap;
  static {
    Map<_Fields, FieldMetaData> tmpMap = new EnumMap<_Fields, FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.SUPERVISORS, new FieldMetaData("supervisors", TFieldRequirementType.REQUIRED, 
        new ListMetaData(TType.LIST, 
            new StructMetaData(TType.STRUCT, SupervisorSummary.class))));
    tmpMap.put(_Fields.NIMBUS_UPTIME_SECS, new FieldMetaData("nimbus_uptime_secs", TFieldRequirementType.REQUIRED, 
        new FieldValueMetaData(TType.I32)));
    tmpMap.put(_Fields.TOPOLOGIES, new FieldMetaData("topologies", TFieldRequirementType.REQUIRED, 
        new ListMetaData(TType.LIST, 
            new StructMetaData(TType.STRUCT, TopologySummary.class))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    FieldMetaData.addStructMetaDataMap(ClusterSummary.class, metaDataMap);
  }

  public ClusterSummary() {
  }

  public ClusterSummary(
    List<SupervisorSummary> supervisors,
    int nimbus_uptime_secs,
    List<TopologySummary> topologies)
  {
    this();
    this.supervisors = supervisors;
    this.nimbus_uptime_secs = nimbus_uptime_secs;
    set_nimbus_uptime_secs_isSet(true);
    this.topologies = topologies;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public ClusterSummary(ClusterSummary other) {
    __isset_bit_vector.clear();
    __isset_bit_vector.or(other.__isset_bit_vector);
    if (other.is_set_supervisors()) {
      List<SupervisorSummary> __this__supervisors = new ArrayList<SupervisorSummary>();
      for (SupervisorSummary other_element : other.supervisors) {
        __this__supervisors.add(new SupervisorSummary(other_element));
      }
      this.supervisors = __this__supervisors;
    }
    this.nimbus_uptime_secs = other.nimbus_uptime_secs;
    if (other.is_set_topologies()) {
      List<TopologySummary> __this__topologies = new ArrayList<TopologySummary>();
      for (TopologySummary other_element : other.topologies) {
        __this__topologies.add(new TopologySummary(other_element));
      }
      this.topologies = __this__topologies;
    }
  }

  public ClusterSummary deepCopy() {
    return new ClusterSummary(this);
  }

  @Deprecated
  public ClusterSummary clone() {
    return new ClusterSummary(this);
  }

  public int get_supervisors_size() {
    return (this.supervisors == null) ? 0 : this.supervisors.size();
  }

  public java.util.Iterator<SupervisorSummary> get_supervisors_iterator() {
    return (this.supervisors == null) ? null : this.supervisors.iterator();
  }

  public void add_to_supervisors(SupervisorSummary elem) {
    if (this.supervisors == null) {
      this.supervisors = new ArrayList<SupervisorSummary>();
    }
    this.supervisors.add(elem);
  }

  public List<SupervisorSummary> get_supervisors() {
    return this.supervisors;
  }

  public void set_supervisors(List<SupervisorSummary> supervisors) {
    this.supervisors = supervisors;
  }

  public void unset_supervisors() {
    this.supervisors = null;
  }

  /** Returns true if field supervisors is set (has been asigned a value) and false otherwise */
  public boolean is_set_supervisors() {
    return this.supervisors != null;
  }

  public void set_supervisors_isSet(boolean value) {
    if (!value) {
      this.supervisors = null;
    }
  }

  public int get_nimbus_uptime_secs() {
    return this.nimbus_uptime_secs;
  }

  public void set_nimbus_uptime_secs(int nimbus_uptime_secs) {
    this.nimbus_uptime_secs = nimbus_uptime_secs;
    set_nimbus_uptime_secs_isSet(true);
  }

  public void unset_nimbus_uptime_secs() {
    __isset_bit_vector.clear(__NIMBUS_UPTIME_SECS_ISSET_ID);
  }

  /** Returns true if field nimbus_uptime_secs is set (has been asigned a value) and false otherwise */
  public boolean is_set_nimbus_uptime_secs() {
    return __isset_bit_vector.get(__NIMBUS_UPTIME_SECS_ISSET_ID);
  }

  public void set_nimbus_uptime_secs_isSet(boolean value) {
    __isset_bit_vector.set(__NIMBUS_UPTIME_SECS_ISSET_ID, value);
  }

  public int get_topologies_size() {
    return (this.topologies == null) ? 0 : this.topologies.size();
  }

  public java.util.Iterator<TopologySummary> get_topologies_iterator() {
    return (this.topologies == null) ? null : this.topologies.iterator();
  }

  public void add_to_topologies(TopologySummary elem) {
    if (this.topologies == null) {
      this.topologies = new ArrayList<TopologySummary>();
    }
    this.topologies.add(elem);
  }

  public List<TopologySummary> get_topologies() {
    return this.topologies;
  }

  public void set_topologies(List<TopologySummary> topologies) {
    this.topologies = topologies;
  }

  public void unset_topologies() {
    this.topologies = null;
  }

  /** Returns true if field topologies is set (has been asigned a value) and false otherwise */
  public boolean is_set_topologies() {
    return this.topologies != null;
  }

  public void set_topologies_isSet(boolean value) {
    if (!value) {
      this.topologies = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case SUPERVISORS:
      if (value == null) {
        unset_supervisors();
      } else {
        set_supervisors((List<SupervisorSummary>)value);
      }
      break;

    case NIMBUS_UPTIME_SECS:
      if (value == null) {
        unset_nimbus_uptime_secs();
      } else {
        set_nimbus_uptime_secs((Integer)value);
      }
      break;

    case TOPOLOGIES:
      if (value == null) {
        unset_topologies();
      } else {
        set_topologies((List<TopologySummary>)value);
      }
      break;

    }
  }

  public void setFieldValue(int fieldID, Object value) {
    setFieldValue(_Fields.findByThriftIdOrThrow(fieldID), value);
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case SUPERVISORS:
      return get_supervisors();

    case NIMBUS_UPTIME_SECS:
      return new Integer(get_nimbus_uptime_secs());

    case TOPOLOGIES:
      return get_topologies();

    }
    throw new IllegalStateException();
  }

  public Object getFieldValue(int fieldId) {
    return getFieldValue(_Fields.findByThriftIdOrThrow(fieldId));
  }

  /** Returns true if field corresponding to fieldID is set (has been asigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    switch (field) {
    case SUPERVISORS:
      return is_set_supervisors();
    case NIMBUS_UPTIME_SECS:
      return is_set_nimbus_uptime_secs();
    case TOPOLOGIES:
      return is_set_topologies();
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
    if (that instanceof ClusterSummary)
      return this.equals((ClusterSummary)that);
    return false;
  }

  public boolean equals(ClusterSummary that) {
    if (that == null)
      return false;

    boolean this_present_supervisors = true && this.is_set_supervisors();
    boolean that_present_supervisors = true && that.is_set_supervisors();
    if (this_present_supervisors || that_present_supervisors) {
      if (!(this_present_supervisors && that_present_supervisors))
        return false;
      if (!this.supervisors.equals(that.supervisors))
        return false;
    }

    boolean this_present_nimbus_uptime_secs = true;
    boolean that_present_nimbus_uptime_secs = true;
    if (this_present_nimbus_uptime_secs || that_present_nimbus_uptime_secs) {
      if (!(this_present_nimbus_uptime_secs && that_present_nimbus_uptime_secs))
        return false;
      if (this.nimbus_uptime_secs != that.nimbus_uptime_secs)
        return false;
    }

    boolean this_present_topologies = true && this.is_set_topologies();
    boolean that_present_topologies = true && that.is_set_topologies();
    if (this_present_topologies || that_present_topologies) {
      if (!(this_present_topologies && that_present_topologies))
        return false;
      if (!this.topologies.equals(that.topologies))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    HashCodeBuilder builder = new HashCodeBuilder();

    boolean present_supervisors = true && (is_set_supervisors());
    builder.append(present_supervisors);
    if (present_supervisors)
      builder.append(supervisors);

    boolean present_nimbus_uptime_secs = true;
    builder.append(present_nimbus_uptime_secs);
    if (present_nimbus_uptime_secs)
      builder.append(nimbus_uptime_secs);

    boolean present_topologies = true && (is_set_topologies());
    builder.append(present_topologies);
    if (present_topologies)
      builder.append(topologies);

    return builder.toHashCode();
  }

  public int compareTo(ClusterSummary other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    ClusterSummary typedOther = (ClusterSummary)other;

    lastComparison = Boolean.valueOf(is_set_supervisors()).compareTo(typedOther.is_set_supervisors());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (is_set_supervisors()) {      lastComparison = TBaseHelper.compareTo(this.supervisors, typedOther.supervisors);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(is_set_nimbus_uptime_secs()).compareTo(typedOther.is_set_nimbus_uptime_secs());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (is_set_nimbus_uptime_secs()) {      lastComparison = TBaseHelper.compareTo(this.nimbus_uptime_secs, typedOther.nimbus_uptime_secs);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(is_set_topologies()).compareTo(typedOther.is_set_topologies());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (is_set_topologies()) {      lastComparison = TBaseHelper.compareTo(this.topologies, typedOther.topologies);
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
        case 1: // SUPERVISORS
          if (field.type == TType.LIST) {
            {
              TList _list33 = iprot.readListBegin();
              this.supervisors = new ArrayList<SupervisorSummary>(_list33.size);
              for (int _i34 = 0; _i34 < _list33.size; ++_i34)
              {
                SupervisorSummary _elem35;
                _elem35 = new SupervisorSummary();
                _elem35.read(iprot);
                this.supervisors.add(_elem35);
              }
              iprot.readListEnd();
            }
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 2: // NIMBUS_UPTIME_SECS
          if (field.type == TType.I32) {
            this.nimbus_uptime_secs = iprot.readI32();
            set_nimbus_uptime_secs_isSet(true);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 3: // TOPOLOGIES
          if (field.type == TType.LIST) {
            {
              TList _list36 = iprot.readListBegin();
              this.topologies = new ArrayList<TopologySummary>(_list36.size);
              for (int _i37 = 0; _i37 < _list36.size; ++_i37)
              {
                TopologySummary _elem38;
                _elem38 = new TopologySummary();
                _elem38.read(iprot);
                this.topologies.add(_elem38);
              }
              iprot.readListEnd();
            }
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
    if (this.supervisors != null) {
      oprot.writeFieldBegin(SUPERVISORS_FIELD_DESC);
      {
        oprot.writeListBegin(new TList(TType.STRUCT, this.supervisors.size()));
        for (SupervisorSummary _iter39 : this.supervisors)
        {
          _iter39.write(oprot);
        }
        oprot.writeListEnd();
      }
      oprot.writeFieldEnd();
    }
    oprot.writeFieldBegin(NIMBUS_UPTIME_SECS_FIELD_DESC);
    oprot.writeI32(this.nimbus_uptime_secs);
    oprot.writeFieldEnd();
    if (this.topologies != null) {
      oprot.writeFieldBegin(TOPOLOGIES_FIELD_DESC);
      {
        oprot.writeListBegin(new TList(TType.STRUCT, this.topologies.size()));
        for (TopologySummary _iter40 : this.topologies)
        {
          _iter40.write(oprot);
        }
        oprot.writeListEnd();
      }
      oprot.writeFieldEnd();
    }
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("ClusterSummary(");
    boolean first = true;

    sb.append("supervisors:");
    if (this.supervisors == null) {
      sb.append("null");
    } else {
      sb.append(this.supervisors);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("nimbus_uptime_secs:");
    sb.append(this.nimbus_uptime_secs);
    first = false;
    if (!first) sb.append(", ");
    sb.append("topologies:");
    if (this.topologies == null) {
      sb.append("null");
    } else {
      sb.append(this.topologies);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws TException {
    // check for required fields
    if (!is_set_supervisors()) {
      throw new TProtocolException("Required field 'supervisors' is unset! Struct:" + toString());
    }

    if (!is_set_nimbus_uptime_secs()) {
      throw new TProtocolException("Required field 'nimbus_uptime_secs' is unset! Struct:" + toString());
    }

    if (!is_set_topologies()) {
      throw new TProtocolException("Required field 'topologies' is unset! Struct:" + toString());
    }

  }

}

