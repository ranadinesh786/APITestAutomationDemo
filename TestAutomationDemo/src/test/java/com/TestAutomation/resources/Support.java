
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
@JsonPropertyOrder({ "url", "text" })
@Generated("jsonschema2pojo")
public class Support implements Serializable {

	@JsonProperty("url")
	private String url;
	@JsonProperty("text")
	private String text;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();
	private final static long serialVersionUID = -4602941401418269057L;

	/**
	 * No args constructor for use in serialization
	 * 
	 */
	public Support() {
	}

	/**
	 * 
	 * @param text
	 * @param url
	 */
	public Support(String url, String text) {
		super();
		this.url = url;
		this.text = text;
	}

	@JsonProperty("url")
	public String getUrl() {
		return url;
	}

	@JsonProperty("url")
	public void setUrl(String url) {
		this.url = url;
	}

	public Support withUrl(String url) {
		this.url = url;
		return this;
	}

	@JsonProperty("text")
	public String getText() {
		return text;
	}

	@JsonProperty("text")
	public void setText(String text) {
		this.text = text;
	}

	public Support withText(String text) {
		this.text = text;
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

	public Support withAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
		return this;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(Support.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this)))
				.append('[');
		sb.append("url");
		sb.append('=');
		sb.append(((this.url == null) ? "<null>" : this.url));
		sb.append(',');
		sb.append("text");
		sb.append('=');
		sb.append(((this.text == null) ? "<null>" : this.text));
		sb.append(',');
		sb.append("additionalProperties");
		sb.append('=');
		sb.append(((this.additionalProperties == null) ? "<null>" : this.additionalProperties));
		sb.append(',');
		if (sb.charAt((sb.length() - 1)) == ',') {
			sb.setCharAt((sb.length() - 1), ']');
		} else {
			sb.append(']');
		}
		return sb.toString();
	}

}
