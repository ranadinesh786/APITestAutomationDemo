package com.TestAutomation.resources;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"token"
})
@Generated("jsonschema2pojo")
public class API4PostRequestResponse implements Serializable
{

@JsonProperty("token")
private String token;
@JsonIgnore
private Map<String, Object> additionalProperties = new HashMap<String, Object>();
private final static long serialVersionUID = 4340708320125023872L;

/**
* No args constructor for use in serialization
*
*/
public API4PostRequestResponse() {
}

/**
*
* @param token
*/
public API4PostRequestResponse(String token) {
super();
this.token = token;
}

@JsonProperty("token")
public String getToken() {
return token;
}

@JsonProperty("token")
public void setToken(String token) {
this.token = token;
}

public API4PostRequestResponse withToken(String token) {
this.token = token;
return this;
}

@JsonAnyGetter
public Map<String, Object> getAdditionalProperties() {
return this.additionalProperties;
}

@JsonAnySetter
public void setAdditionalProperty(String name, Object value) {
this.additionalProperties.put(name, value);
}

public API4PostRequestResponse withAdditionalProperty(String name, Object value) {
this.additionalProperties.put(name, value);
return this;
}

@Override
public String toString() {
StringBuilder sb = new StringBuilder();
sb.append(API4PostRequestResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
sb.append("token");
sb.append('=');
sb.append(((this.token == null)?"<null>":this.token));
sb.append(',');
sb.append("additionalProperties");
sb.append('=');
sb.append(((this.additionalProperties == null)?"<null>":this.additionalProperties));
sb.append(',');
if (sb.charAt((sb.length()- 1)) == ',') {
sb.setCharAt((sb.length()- 1), ']');
} else {
sb.append(']');
}
return sb.toString();
}

}