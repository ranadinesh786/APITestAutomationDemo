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
"email"
})
@Generated("jsonschema2pojo")
public class API3Emaildetail implements Serializable
{

@JsonProperty("email")
private String email;
@JsonIgnore
private Map<String, Object> additionalProperties = new HashMap<String, Object>();
private final static long serialVersionUID = -4838413413931255561L;

/**
* No args constructor for use in serialization
*
*/
public API3Emaildetail() {
}

/**
*
* @param email
*/
public API3Emaildetail(String email) {
super();
this.email = email;
}

@JsonProperty("email")
public String getEmail() {
return email;
}

@JsonProperty("email")
public void setEmail(String email) {
this.email = email;
}

public API3Emaildetail withEmail(String email) {
this.email = email;
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

public API3Emaildetail withAdditionalProperty(String name, Object value) {
this.additionalProperties.put(name, value);
return this;
}

@Override
public String toString() {
StringBuilder sb = new StringBuilder();
sb.append(API3Emaildetail.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
sb.append("email");
sb.append('=');
sb.append(((this.email == null)?"<null>":this.email));
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