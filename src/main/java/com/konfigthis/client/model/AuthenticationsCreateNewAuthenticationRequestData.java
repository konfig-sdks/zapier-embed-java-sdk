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
import java.util.UUID;

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
 * AuthenticationsCreateNewAuthenticationRequestData
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class AuthenticationsCreateNewAuthenticationRequestData {
  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public static final String SERIALIZED_NAME_APP = "app";
  @SerializedName(SERIALIZED_NAME_APP)
  private UUID app;

  public static final String SERIALIZED_NAME_AUTHENTICATION_FIELDS = "authentication_fields";
  @SerializedName(SERIALIZED_NAME_AUTHENTICATION_FIELDS)
  private Object authenticationFields;

  public AuthenticationsCreateNewAuthenticationRequestData() {
  }

  public AuthenticationsCreateNewAuthenticationRequestData title(String title) {
    
    
    
    
    this.title = title;
    return this;
  }

   /**
   * The title of the authentication.
   * @return title
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "SuperExampleCRM (example@zapier.com)", required = true, value = "The title of the authentication.")

  public String getTitle() {
    return title;
  }


  public void setTitle(String title) {
    
    
    
    this.title = title;
  }


  public AuthenticationsCreateNewAuthenticationRequestData app(UUID app) {
    
    
    
    
    this.app = app;
    return this;
  }

   /**
   * A canonical App ID, as provided by the &#x60;/apps&#x60; endpoint.
   * @return app
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "868f9d3c-2ea0-4f19-a32d-a61b276ab8de", required = true, value = "A canonical App ID, as provided by the `/apps` endpoint.")

  public UUID getApp() {
    return app;
  }


  public void setApp(UUID app) {
    
    
    
    this.app = app;
  }


  public AuthenticationsCreateNewAuthenticationRequestData authenticationFields(Object authenticationFields) {
    
    
    
    
    this.authenticationFields = authenticationFields;
    return this;
  }

   /**
   * Required values to create an authentication. These values will be used by the target integration to successfully create the Authentication https://platform.zapier.com/build/auth.
   * @return authenticationFields
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Required values to create an authentication. These values will be used by the target integration to successfully create the Authentication https://platform.zapier.com/build/auth.")

  public Object getAuthenticationFields() {
    return authenticationFields;
  }


  public void setAuthenticationFields(Object authenticationFields) {
    
    
    
    this.authenticationFields = authenticationFields;
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
   * @return the AuthenticationsCreateNewAuthenticationRequestData instance itself
   */
  public AuthenticationsCreateNewAuthenticationRequestData putAdditionalProperty(String key, Object value) {
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
    AuthenticationsCreateNewAuthenticationRequestData authenticationsCreateNewAuthenticationRequestData = (AuthenticationsCreateNewAuthenticationRequestData) o;
    return Objects.equals(this.title, authenticationsCreateNewAuthenticationRequestData.title) &&
        Objects.equals(this.app, authenticationsCreateNewAuthenticationRequestData.app) &&
        Objects.equals(this.authenticationFields, authenticationsCreateNewAuthenticationRequestData.authenticationFields)&&
        Objects.equals(this.additionalProperties, authenticationsCreateNewAuthenticationRequestData.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, app, authenticationFields, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthenticationsCreateNewAuthenticationRequestData {\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    app: ").append(toIndentedString(app)).append("\n");
    sb.append("    authenticationFields: ").append(toIndentedString(authenticationFields)).append("\n");
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
    openapiFields.add("app");
    openapiFields.add("authentication_fields");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("title");
    openapiRequiredFields.add("app");
    openapiRequiredFields.add("authentication_fields");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AuthenticationsCreateNewAuthenticationRequestData
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!AuthenticationsCreateNewAuthenticationRequestData.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AuthenticationsCreateNewAuthenticationRequestData is not found in the empty JSON string", AuthenticationsCreateNewAuthenticationRequestData.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : AuthenticationsCreateNewAuthenticationRequestData.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("title").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `title` to be a primitive type in the JSON string but got `%s`", jsonObj.get("title").toString()));
      }
      if (!jsonObj.get("app").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `app` to be a primitive type in the JSON string but got `%s`", jsonObj.get("app").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AuthenticationsCreateNewAuthenticationRequestData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AuthenticationsCreateNewAuthenticationRequestData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AuthenticationsCreateNewAuthenticationRequestData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AuthenticationsCreateNewAuthenticationRequestData.class));

       return (TypeAdapter<T>) new TypeAdapter<AuthenticationsCreateNewAuthenticationRequestData>() {
           @Override
           public void write(JsonWriter out, AuthenticationsCreateNewAuthenticationRequestData value) throws IOException {
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
           public AuthenticationsCreateNewAuthenticationRequestData read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             AuthenticationsCreateNewAuthenticationRequestData instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of AuthenticationsCreateNewAuthenticationRequestData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AuthenticationsCreateNewAuthenticationRequestData
  * @throws IOException if the JSON string is invalid with respect to AuthenticationsCreateNewAuthenticationRequestData
  */
  public static AuthenticationsCreateNewAuthenticationRequestData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AuthenticationsCreateNewAuthenticationRequestData.class);
  }

 /**
  * Convert an instance of AuthenticationsCreateNewAuthenticationRequestData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

