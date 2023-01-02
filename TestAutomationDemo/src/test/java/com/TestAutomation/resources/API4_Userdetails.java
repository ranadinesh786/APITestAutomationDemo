package com.TestAutomation.resources;

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
@JsonPropertyOrder({ "email", "password" })
@Generated("jsonschema2pojo")
public class API4_Userdetails {
	public API4_Userdetails(String email, String password) {
			super();
			this.email = email;
			this.password = password;
			}

		@JsonProperty("email")
		private String email;
		@JsonProperty("password")
		private String password;
		@JsonIgnore
		private Map<String, Object> additionalProperties = new HashMap<String, Object>();

		@JsonProperty("email")
		public String getemail() {
			return email;
		}

		@JsonProperty("email")
		public void setemail(String email) {
			this.email = email;
		}

		@JsonProperty("password")
		public String getpassword() {
			return password;
		}

		@JsonProperty("password")
		public void setpassword(String password) {
			this.password = password;
		}

		@JsonAnyGetter
		public Map<String, Object> getAdditionalProperties() {
			return this.additionalProperties;
		}

		@JsonAnySetter
		public void setAdditionalProperty(String email, Object value) {
			this.additionalProperties.put(email, value);
		}

	}
