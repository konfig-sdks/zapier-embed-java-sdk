/*
 * Zapier Embed API
 * The Zapier Embed API.
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: contact@zapier.com
 *
 * NOTE: This class is auto generated by Konfig (https://konfigthis.com).
 * Do not edit the class manually.
 */


package com.konfigthis.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.konfigthis.client.model.InputFieldItems;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import org.apache.commons.lang3.StringUtils;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.konfigthis.client.JSON;

/**
 * A field that is an input to an Action, often eventually used to form the HTTP request that is made to a Partner API.
 */
@ApiModel(description = "A field that is an input to an Action, often eventually used to form the HTTP request that is made to a Partner API.")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class IField {
  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  /**
   * The type of this object.
   */
  @JsonAdapter(TypeEnum.Adapter.class)
 public enum TypeEnum {
    INPUT_FIELD("input_field"),
    
    INFO_FIELD("info_field"),
    
    FIELDSET("fieldset");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return TypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private TypeEnum type;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_DEFAULT_VALUE = "default_value";
  @SerializedName(SERIALIZED_NAME_DEFAULT_VALUE)
  private String defaultValue;

  public static final String SERIALIZED_NAME_DEPENDS_ON = "depends_on";
  @SerializedName(SERIALIZED_NAME_DEPENDS_ON)
  private List<String> dependsOn = null;

  /**
   * An optional formatting hint, only provided when the &#x60;value_type&#x60; field is &#x60;STRING&#x60;. Useful for displaying more friendly inputs to a user. If the format is &#x60;SELECT&#x60;, you are expected to fetch the possible Choices from the &#x60;/choices&#x60; endpoint.
   */
  @JsonAdapter(FormatEnum.Adapter.class)
 public enum FormatEnum {
    DATETIME("DATETIME"),
    
    MULTILINE("MULTILINE"),
    
    PASSWORD("PASSWORD"),
    
    CODE("CODE"),
    
    FILE("FILE"),
    
    SELECT("SELECT");

    private String value;

    FormatEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static FormatEnum fromValue(String value) {
      for (FormatEnum b : FormatEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<FormatEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final FormatEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public FormatEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return FormatEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_FORMAT = "format";
  @SerializedName(SERIALIZED_NAME_FORMAT)
  private FormatEnum format;

  public static final String SERIALIZED_NAME_INVALIDATES_INPUT_FIELDS = "invalidates_input_fields";
  @SerializedName(SERIALIZED_NAME_INVALIDATES_INPUT_FIELDS)
  private Boolean invalidatesInputFields;

  public static final String SERIALIZED_NAME_IS_REQUIRED = "is_required";
  @SerializedName(SERIALIZED_NAME_IS_REQUIRED)
  private Boolean isRequired;

  public static final String SERIALIZED_NAME_ITEMS = "items";
  @SerializedName(SERIALIZED_NAME_ITEMS)
  private InputFieldItems items;

  public static final String SERIALIZED_NAME_PLACEHOLDER = "placeholder";
  @SerializedName(SERIALIZED_NAME_PLACEHOLDER)
  private String placeholder;

  /**
   * The type of this Input Field. The &#x60;OBJECT&#x60; type accepts a flat key-value dictionary where the values can only be strings. The &#x60;ARRAY&#x60; type accepts an array of values - see &#x60;items&#x60; for the type. All other types accept string values.
   */
  @JsonAdapter(ValueTypeEnum.Adapter.class)
 public enum ValueTypeEnum {
    STRING("STRING"),
    
    NUMBER("NUMBER"),
    
    INTEGER("INTEGER"),
    
    BOOLEAN("BOOLEAN"),
    
    ARRAY("ARRAY"),
    
    OBJECT("OBJECT");

    private String value;

    ValueTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ValueTypeEnum fromValue(String value) {
      for (ValueTypeEnum b : ValueTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ValueTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ValueTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ValueTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ValueTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_VALUE_TYPE = "value_type";
  @SerializedName(SERIALIZED_NAME_VALUE_TYPE)
  private ValueTypeEnum valueType;

  public static final String SERIALIZED_NAME_FIELDS = "fields";
  @SerializedName(SERIALIZED_NAME_FIELDS)
  private List<IField> fields = null;

  public IField() {
  }

  
  public IField(
     TypeEnum type
  ) {
    this();
    this.type = type;
  }

  public IField title(String title) {
    
    
    
    
    this.title = title;
    return this;
  }

   /**
   * The title of this Input Field
   * @return title
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Organisation", value = "The title of this Input Field")

  public String getTitle() {
    return title;
  }


  public void setTitle(String title) {
    
    
    
    this.title = title;
  }


  public IField description(String description) {
    
    
    
    
    this.description = description;
    return this;
  }

   /**
   * A longer markdown formatted description of this Input Field, often containing helpful hints on how to fill this particular field in.
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Which organisation should new leads come from.", value = "A longer markdown formatted description of this Input Field, often containing helpful hints on how to fill this particular field in.")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    
    
    
    this.description = description;
  }


   /**
   * The type of this object.
   * @return type
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "INPUT_FIELD", required = true, value = "The type of this object.")

  public TypeEnum getType() {
    return type;
  }




  public IField id(String id) {
    
    
    
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "organisation", required = true, value = "")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    
    
    
    this.id = id;
  }


  public IField defaultValue(String defaultValue) {
    
    
    
    
    this.defaultValue = defaultValue;
    return this;
  }

   /**
   * The default value of this Input Field
   * @return defaultValue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "My Organisation", value = "The default value of this Input Field")

  public String getDefaultValue() {
    return defaultValue;
  }


  public void setDefaultValue(String defaultValue) {
    
    
    
    this.defaultValue = defaultValue;
  }


  public IField dependsOn(List<String> dependsOn) {
    
    
    
    
    this.dependsOn = dependsOn;
    return this;
  }

  public IField addDependsOnItem(String dependsOnItem) {
    if (this.dependsOn == null) {
      this.dependsOn = new ArrayList<>();
    }
    this.dependsOn.add(dependsOnItem);
    return this;
  }

   /**
   * An array of ids that this field has a dependency on. If the value of these fields changes, the value of this field is no longer valid.
   * @return dependsOn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An array of ids that this field has a dependency on. If the value of these fields changes, the value of this field is no longer valid.")

  public List<String> getDependsOn() {
    return dependsOn;
  }


  public void setDependsOn(List<String> dependsOn) {
    
    
    
    this.dependsOn = dependsOn;
  }


  public IField format(FormatEnum format) {
    
    
    
    
    this.format = format;
    return this;
  }

   /**
   * An optional formatting hint, only provided when the &#x60;value_type&#x60; field is &#x60;STRING&#x60;. Useful for displaying more friendly inputs to a user. If the format is &#x60;SELECT&#x60;, you are expected to fetch the possible Choices from the &#x60;/choices&#x60; endpoint.
   * @return format
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "MULTILINE", value = "An optional formatting hint, only provided when the `value_type` field is `STRING`. Useful for displaying more friendly inputs to a user. If the format is `SELECT`, you are expected to fetch the possible Choices from the `/choices` endpoint.")

  public FormatEnum getFormat() {
    return format;
  }


  public void setFormat(FormatEnum format) {
    
    
    
    this.format = format;
  }


  public IField invalidatesInputFields(Boolean invalidatesInputFields) {
    
    
    
    
    this.invalidatesInputFields = invalidatesInputFields;
    return this;
  }

   /**
   * If true, changes to this field invalidate the presence of all other fields for this action and they must be refetched.
   * @return invalidatesInputFields
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "If true, changes to this field invalidate the presence of all other fields for this action and they must be refetched.")

  public Boolean getInvalidatesInputFields() {
    return invalidatesInputFields;
  }


  public void setInvalidatesInputFields(Boolean invalidatesInputFields) {
    
    
    
    this.invalidatesInputFields = invalidatesInputFields;
  }


  public IField isRequired(Boolean isRequired) {
    
    
    
    
    this.isRequired = isRequired;
    return this;
  }

   /**
   * If true, this field must be filled in for the action to execute.
   * @return isRequired
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "If true, this field must be filled in for the action to execute.")

  public Boolean getIsRequired() {
    return isRequired;
  }


  public void setIsRequired(Boolean isRequired) {
    
    
    
    this.isRequired = isRequired;
  }


  public IField items(InputFieldItems items) {
    
    
    
    
    this.items = items;
    return this;
  }

   /**
   * Get items
   * @return items
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public InputFieldItems getItems() {
    return items;
  }


  public void setItems(InputFieldItems items) {
    
    
    
    this.items = items;
  }


  public IField placeholder(String placeholder) {
    
    
    
    
    this.placeholder = placeholder;
    return this;
  }

   /**
   * A placeholder for this Input Field.
   * @return placeholder
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Type your Organisation name here!", value = "A placeholder for this Input Field.")

  public String getPlaceholder() {
    return placeholder;
  }


  public void setPlaceholder(String placeholder) {
    
    
    
    this.placeholder = placeholder;
  }


  public IField valueType(ValueTypeEnum valueType) {
    
    
    
    
    this.valueType = valueType;
    return this;
  }

   /**
   * The type of this Input Field. The &#x60;OBJECT&#x60; type accepts a flat key-value dictionary where the values can only be strings. The &#x60;ARRAY&#x60; type accepts an array of values - see &#x60;items&#x60; for the type. All other types accept string values.
   * @return valueType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "STRING", value = "The type of this Input Field. The `OBJECT` type accepts a flat key-value dictionary where the values can only be strings. The `ARRAY` type accepts an array of values - see `items` for the type. All other types accept string values.")

  public ValueTypeEnum getValueType() {
    return valueType;
  }


  public void setValueType(ValueTypeEnum valueType) {
    
    
    
    this.valueType = valueType;
  }


  public IField fields(List<IField> fields) {
    
    
    
    
    this.fields = fields;
    return this;
  }

  public IField addFieldsItem(IField fieldsItem) {
    if (this.fields == null) {
      this.fields = new ArrayList<>();
    }
    this.fields.add(fieldsItem);
    return this;
  }

   /**
   * Get fields
   * @return fields
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<IField> getFields() {
    return fields;
  }


  public void setFields(List<IField> fields) {
    
    
    
    this.fields = fields;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key name of the property
   * @param value value of the property
   * @return the IField instance itself
   */
  public IField putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   *
   * @return a map of objects
   */
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   *
   * @param key name of the property
   * @return an object
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
        return null;
    }
    return this.additionalProperties.get(key);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IField ifield = (IField) o;
    return Objects.equals(this.title, ifield.title) &&
        Objects.equals(this.description, ifield.description) &&
        Objects.equals(this.type, ifield.type) &&
        Objects.equals(this.id, ifield.id) &&
        Objects.equals(this.defaultValue, ifield.defaultValue) &&
        Objects.equals(this.dependsOn, ifield.dependsOn) &&
        Objects.equals(this.format, ifield.format) &&
        Objects.equals(this.invalidatesInputFields, ifield.invalidatesInputFields) &&
        Objects.equals(this.isRequired, ifield.isRequired) &&
        Objects.equals(this.items, ifield.items) &&
        Objects.equals(this.placeholder, ifield.placeholder) &&
        Objects.equals(this.valueType, ifield.valueType) &&
        Objects.equals(this.fields, ifield.fields)&&
        Objects.equals(this.additionalProperties, ifield.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, description, type, id, defaultValue, dependsOn, format, invalidatesInputFields, isRequired, items, placeholder, valueType, fields, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IField {\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    defaultValue: ").append(toIndentedString(defaultValue)).append("\n");
    sb.append("    dependsOn: ").append(toIndentedString(dependsOn)).append("\n");
    sb.append("    format: ").append(toIndentedString(format)).append("\n");
    sb.append("    invalidatesInputFields: ").append(toIndentedString(invalidatesInputFields)).append("\n");
    sb.append("    isRequired: ").append(toIndentedString(isRequired)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    placeholder: ").append(toIndentedString(placeholder)).append("\n");
    sb.append("    valueType: ").append(toIndentedString(valueType)).append("\n");
    sb.append("    fields: ").append(toIndentedString(fields)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("title");
    openapiFields.add("description");
    openapiFields.add("type");
    openapiFields.add("id");
    openapiFields.add("default_value");
    openapiFields.add("depends_on");
    openapiFields.add("format");
    openapiFields.add("invalidates_input_fields");
    openapiFields.add("is_required");
    openapiFields.add("items");
    openapiFields.add("placeholder");
    openapiFields.add("value_type");
    openapiFields.add("fields");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("type");
    openapiRequiredFields.add("id");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to IField
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!IField.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in IField is not found in the empty JSON string", IField.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : IField.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if ((jsonObj.get("title") != null && !jsonObj.get("title").isJsonNull()) && !jsonObj.get("title").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `title` to be a primitive type in the JSON string but got `%s`", jsonObj.get("title").toString()));
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if (!jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      if (!jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("default_value") != null && !jsonObj.get("default_value").isJsonNull()) && !jsonObj.get("default_value").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `default_value` to be a primitive type in the JSON string but got `%s`", jsonObj.get("default_value").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("depends_on") != null && !jsonObj.get("depends_on").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `depends_on` to be an array in the JSON string but got `%s`", jsonObj.get("depends_on").toString()));
      }
      if ((jsonObj.get("format") != null && !jsonObj.get("format").isJsonNull()) && !jsonObj.get("format").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `format` to be a primitive type in the JSON string but got `%s`", jsonObj.get("format").toString()));
      }
      // validate the optional field `items`
      if (jsonObj.get("items") != null && !jsonObj.get("items").isJsonNull()) {
        InputFieldItems.validateJsonObject(jsonObj.getAsJsonObject("items"));
      }
      if ((jsonObj.get("placeholder") != null && !jsonObj.get("placeholder").isJsonNull()) && !jsonObj.get("placeholder").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `placeholder` to be a primitive type in the JSON string but got `%s`", jsonObj.get("placeholder").toString()));
      }
      if ((jsonObj.get("value_type") != null && !jsonObj.get("value_type").isJsonNull()) && !jsonObj.get("value_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `value_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("value_type").toString()));
      }
      if (jsonObj.get("fields") != null && !jsonObj.get("fields").isJsonNull()) {
        JsonArray jsonArrayfields = jsonObj.getAsJsonArray("fields");
        if (jsonArrayfields != null) {
          // ensure the json data is an array
          if (!jsonObj.get("fields").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `fields` to be an array in the JSON string but got `%s`", jsonObj.get("fields").toString()));
          }

          // validate the optional field `fields` (array)
          for (int i = 0; i < jsonArrayfields.size(); i++) {
            IField.validateJsonObject(jsonArrayfields.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!IField.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'IField' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<IField> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(IField.class));

       return (TypeAdapter<T>) new TypeAdapter<IField>() {
           @Override
           public void write(JsonWriter out, IField value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             obj.remove("additionalProperties");
             // serialize additonal properties
             if (value.getAdditionalProperties() != null) {
               for (Map.Entry<String, Object> entry : value.getAdditionalProperties().entrySet()) {
                 if (entry.getValue() instanceof String)
                   obj.addProperty(entry.getKey(), (String) entry.getValue());
                 else if (entry.getValue() instanceof Number)
                   obj.addProperty(entry.getKey(), (Number) entry.getValue());
                 else if (entry.getValue() instanceof Boolean)
                   obj.addProperty(entry.getKey(), (Boolean) entry.getValue());
                 else if (entry.getValue() instanceof Character)
                   obj.addProperty(entry.getKey(), (Character) entry.getValue());
                 else {
                   obj.add(entry.getKey(), gson.toJsonTree(entry.getValue()).getAsJsonObject());
                 }
               }
             }
             elementAdapter.write(out, obj);
           }

           @Override
           public IField read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             IField instance = thisAdapter.fromJsonTree(jsonObj);
             for (Map.Entry<String, JsonElement> entry : jsonObj.entrySet()) {
               if (!openapiFields.contains(entry.getKey())) {
                 if (entry.getValue().isJsonPrimitive()) { // primitive type
                   if (entry.getValue().getAsJsonPrimitive().isString())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsString());
                   else if (entry.getValue().getAsJsonPrimitive().isNumber())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsNumber());
                   else if (entry.getValue().getAsJsonPrimitive().isBoolean())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsBoolean());
                   else
                     throw new IllegalArgumentException(String.format("The field `%s` has unknown primitive type. Value: %s", entry.getKey(), entry.getValue().toString()));
                 } else if (entry.getValue().isJsonArray()) {
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), List.class));
                 } else { // JSON object
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), HashMap.class));
                 }
               }
             }
             return instance;
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of IField given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of IField
  * @throws IOException if the JSON string is invalid with respect to IField
  */
  public static IField fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, IField.class);
  }

 /**
  * Convert an instance of IField to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

