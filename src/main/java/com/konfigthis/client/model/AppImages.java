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
import java.net.URI;

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
 * Images/icons of various resolutions to represent the app.
 */
@ApiModel(description = "Images/icons of various resolutions to represent the app.")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class AppImages {
  public static final String SERIALIZED_NAME_URL16X16 = "url_16x16";
  @SerializedName(SERIALIZED_NAME_URL16X16)
  private URI url16x16;

  public static final String SERIALIZED_NAME_URL32X32 = "url_32x32";
  @SerializedName(SERIALIZED_NAME_URL32X32)
  private URI url32x32;

  public static final String SERIALIZED_NAME_URL64X64 = "url_64x64";
  @SerializedName(SERIALIZED_NAME_URL64X64)
  private URI url64x64;

  public static final String SERIALIZED_NAME_URL128X128 = "url_128x128";
  @SerializedName(SERIALIZED_NAME_URL128X128)
  private URI url128x128;

  public AppImages() {
  }

  public AppImages url16x16(URI url16x16) {
    
    
    
    
    this.url16x16 = url16x16;
    return this;
  }

   /**
   * Get url16x16
   * @return url16x16
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "https://zapier-images.imgix.net/storage/developer/cde9764aa8d19fdd6d591455dbe5a78d.png?auto=format%2Ccompress&fit=crop&h=16&ixlib=python-3.0.0&q=50&w=16", value = "")

  public URI getUrl16x16() {
    return url16x16;
  }


  public void setUrl16x16(URI url16x16) {
    
    
    
    this.url16x16 = url16x16;
  }


  public AppImages url32x32(URI url32x32) {
    
    
    
    
    this.url32x32 = url32x32;
    return this;
  }

   /**
   * Get url32x32
   * @return url32x32
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "https://zapier-images.imgix.net/storage/developer/cde9764aa8d19fdd6d591455dbe5a78d.png?auto=format%2Ccompress&fit=crop&h=32&ixlib=python-3.0.0&q=50&w=32", value = "")

  public URI getUrl32x32() {
    return url32x32;
  }


  public void setUrl32x32(URI url32x32) {
    
    
    
    this.url32x32 = url32x32;
  }


  public AppImages url64x64(URI url64x64) {
    
    
    
    
    this.url64x64 = url64x64;
    return this;
  }

   /**
   * Get url64x64
   * @return url64x64
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "https://zapier-images.imgix.net/storage/developer/cde9764aa8d19fdd6d591455dbe5a78d.png?auto=format%2Ccompress&fit=crop&h=64&ixlib=python-3.0.0&q=50&w=64", value = "")

  public URI getUrl64x64() {
    return url64x64;
  }


  public void setUrl64x64(URI url64x64) {
    
    
    
    this.url64x64 = url64x64;
  }


  public AppImages url128x128(URI url128x128) {
    
    
    
    
    this.url128x128 = url128x128;
    return this;
  }

   /**
   * Get url128x128
   * @return url128x128
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "https://zapier-images.imgix.net/storage/developer/cde9764aa8d19fdd6d591455dbe5a78d.png?auto=format%2Ccompress&fit=crop&h=128&ixlib=python-3.0.0&q=50&w=128", value = "")

  public URI getUrl128x128() {
    return url128x128;
  }


  public void setUrl128x128(URI url128x128) {
    
    
    
    this.url128x128 = url128x128;
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
   * @return the AppImages instance itself
   */
  public AppImages putAdditionalProperty(String key, Object value) {
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
    AppImages appImages = (AppImages) o;
    return Objects.equals(this.url16x16, appImages.url16x16) &&
        Objects.equals(this.url32x32, appImages.url32x32) &&
        Objects.equals(this.url64x64, appImages.url64x64) &&
        Objects.equals(this.url128x128, appImages.url128x128)&&
        Objects.equals(this.additionalProperties, appImages.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(url16x16, url32x32, url64x64, url128x128, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AppImages {\n");
    sb.append("    url16x16: ").append(toIndentedString(url16x16)).append("\n");
    sb.append("    url32x32: ").append(toIndentedString(url32x32)).append("\n");
    sb.append("    url64x64: ").append(toIndentedString(url64x64)).append("\n");
    sb.append("    url128x128: ").append(toIndentedString(url128x128)).append("\n");
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
    openapiFields.add("url_16x16");
    openapiFields.add("url_32x32");
    openapiFields.add("url_64x64");
    openapiFields.add("url_128x128");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AppImages
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!AppImages.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AppImages is not found in the empty JSON string", AppImages.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("url_16x16") != null && !jsonObj.get("url_16x16").isJsonNull()) && !jsonObj.get("url_16x16").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `url_16x16` to be a primitive type in the JSON string but got `%s`", jsonObj.get("url_16x16").toString()));
      }
      if ((jsonObj.get("url_32x32") != null && !jsonObj.get("url_32x32").isJsonNull()) && !jsonObj.get("url_32x32").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `url_32x32` to be a primitive type in the JSON string but got `%s`", jsonObj.get("url_32x32").toString()));
      }
      if ((jsonObj.get("url_64x64") != null && !jsonObj.get("url_64x64").isJsonNull()) && !jsonObj.get("url_64x64").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `url_64x64` to be a primitive type in the JSON string but got `%s`", jsonObj.get("url_64x64").toString()));
      }
      if ((jsonObj.get("url_128x128") != null && !jsonObj.get("url_128x128").isJsonNull()) && !jsonObj.get("url_128x128").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `url_128x128` to be a primitive type in the JSON string but got `%s`", jsonObj.get("url_128x128").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AppImages.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AppImages' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AppImages> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AppImages.class));

       return (TypeAdapter<T>) new TypeAdapter<AppImages>() {
           @Override
           public void write(JsonWriter out, AppImages value) throws IOException {
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
           public AppImages read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             AppImages instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of AppImages given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AppImages
  * @throws IOException if the JSON string is invalid with respect to AppImages
  */
  public static AppImages fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AppImages.class);
  }

 /**
  * Convert an instance of AppImages to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
