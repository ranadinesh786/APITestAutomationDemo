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
"error"
})
@Generated("jsonschema2pojo")
public class API3_postRequestResponse implements Serializable
{

@JsonProperty("error")
private String error;
@JsonIgnore
private Map<String, Object> additionalProperties = new HashMap<String, Object>();
private final static long serialVersionUID = -588526712849116657L;

/**
* No args constructor for use in serialization
*
*/
public API3_postRequestResponse() {
}

/**
*
* @param error
*/
public API3_postRequestResponse(String error) {
super();
this.error = error;
}

@JsonProperty("error")
public String getError() {
return error;
}

@JsonProperty("error")
public void setError(String error) {
this.error = error;
}

public API3_postRequestResponse withError(String error) {
this.error = error;
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

public API3_postRequestResponse withAdditionalProperty(String name, Object value) {
this.additionalProperties.put(name, value);
return this;
}

@Override
public String toString() {
StringBuilder sb = new StringBuilder();
sb.append(API3_postRequestResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
sb.append("error");
sb.append('=');
sb.append(((this.error == null)?"<null>":this.error));
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