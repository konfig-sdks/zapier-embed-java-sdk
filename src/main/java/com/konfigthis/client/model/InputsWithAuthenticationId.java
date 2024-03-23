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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

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
 * The common data object that includes inputs and an authentication id.
 */
@ApiModel(description = "The common data object that includes inputs and an authentication id.")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class InputsWithAuthenticationId {
  public static final String SERIALIZED_NAME_AUTHENTICATION = "authentication";
  @SerializedName(SERIALIZED_NAME_AUTHENTICATION)
  private Object authentication = null;

  public static final String SERIALIZED_NAME_INPUTS = "inputs";
  @SerializedName(SERIALIZED_NAME_INPUTS)
  private Object inputs;

  public static final String SERIALIZED_NAME_LIMIT = "limit";
  @SerializedName(SERIALIZED_NAME_LIMIT)
  private Integer limit;

  public static final String SERIALIZED_NAME_OFFSET = "offset";
  @SerializedName(SERIALIZED_NAME_OFFSET)
  private Integer offset;

  public InputsWithAuthenticationId() {
  }

  public InputsWithAuthenticationId authentication(Object authentication) {
    
    
    
    
    this.authentication = authentication;
    return this;
  }

   /**
   * An Authentication ID, as provided by the &#x60;/authentications&#x60; endpoint.
   * @return authentication
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "An Authentication ID, as provided by the `/authentications` endpoint.")

  public Object getAuthentication() {
    return authentication;
  }


  public void setAuthentication(Object authentication) {
    
    
    
    this.authentication = authentication;
  }


  public InputsWithAuthenticationId inputs(Object inputs) {
    
    
    
    
    this.inputs = inputs;
    return this;
  }

   /**
   * The current set of input fields in a JSON object, where each key is the &#x60;id&#x60; of an Input Field, and the corresponding value the current value of the field.
   * @return inputs
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The current set of input fields in a JSON object, where each key is the `id` of an Input Field, and the corresponding value the current value of the field.")

  public Object getInputs() {
    return inputs;
  }


  public void setInputs(Object inputs) {
    
    
    
    this.inputs = inputs;
  }


  public InputsWithAuthenticationId limit(Integer limit) {
    
    
    
    
    this.limit = limit;
    return this;
  }

   /**
   * Used for paginating results. Specifies the maximum number of items to return per page.
   * @return limit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Used for paginating results. Specifies the maximum number of items to return per page.")

  public Integer getLimit() {
    return limit;
  }


  public void setLimit(Integer limit) {
    
    
    
    this.limit = limit;
  }


  public InputsWithAuthenticationId offset(Integer offset) {
    
    
    
    
    this.offset = offset;
    return this;
  }

   /**
   * Used for paginating results. Specifies the offset to use.
   * @return offset
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Used for paginating results. Specifies the offset to use.")

  public Integer getOffset() {
    return offset;
  }


  public void setOffset(Integer offset) {
    
    
    
    this.offset = offset;
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
   * @return the InputsWithAuthenticationId instance itself
   */
  public InputsWithAuthenticationId putAdditionalProperty(String key, Object value) {
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
    InputsWithAuthenticationId inputsWithAuthenticationId = (InputsWithAuthenticationId) o;
    return Objects.equals(this.authentication, inputsWithAuthenticationId.authentication) &&
        Objects.equals(this.inputs, inputsWithAuthenticationId.inputs) &&
        Objects.equals(this.limit, inputsWithAuthenticationId.limit) &&
        Objects.equals(this.offset, inputsWithAuthenticationId.offset)&&
        Objects.equals(this.additionalProperties, inputsWithAuthenticationId.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authentication, inputs, limit, offset, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InputsWithAuthenticationId {\n");
    sb.append("    authentication: ").append(toIndentedString(authentication)).append("\n");
    sb.append("    inputs: ").append(toIndentedString(inputs)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
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
    openapiFields.add("authentication");
    openapiFields.add("inputs");
    openapiFields.add("limit");
    openapiFields.add("offset");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("authentication");
    openapiRequiredFields.add("inputs");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to InputsWithAuthenticationId
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!InputsWithAuthenticationId.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in InputsWithAuthenticationId is not found in the empty JSON string", InputsWithAuthenticationId.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : InputsWithAuthenticationId.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!InputsWithAuthenticationId.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'InputsWithAuthenticationId' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<InputsWithAuthenticationId> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(InputsWithAuthenticationId.class));

       return (TypeAdapter<T>) new TypeAdapter<InputsWithAuthenticationId>() {
           @Override
           public void write(JsonWriter out, InputsWithAuthenticationId value) throws IOException {
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
           public InputsWithAuthenticationId read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             InputsWithAuthenticationId instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of InputsWithAuthenticationId given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of InputsWithAuthenticationId
  * @throws IOException if the JSON string is invalid with respect to InputsWithAuthenticationId
  */
  public static InputsWithAuthenticationId fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, InputsWithAuthenticationId.class);
  }

 /**
  * Convert an instance of InputsWithAuthenticationId to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

