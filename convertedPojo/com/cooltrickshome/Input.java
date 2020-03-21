
package com.cooltrickshome;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "id",
    "iso2Code",
    "name",
    "region",
    "adminregion",
    "incomeLevel",
    "lendingType",
    "capitalCity",
    "longitude",
    "latitude"
})
public class Input {

    @JsonProperty("id")
    private String id;
    @JsonProperty("iso2Code")
    private String iso2Code;
    @JsonProperty("name")
    private String name;
    @JsonProperty("region")
    private Region region;
    @JsonProperty("adminregion")
    private Adminregion adminregion;
    @JsonProperty("incomeLevel")
    private IncomeLevel incomeLevel;
    @JsonProperty("lendingType")
    private LendingType lendingType;
    @JsonProperty("capitalCity")
    private String capitalCity;
    @JsonProperty("longitude")
    private String longitude;
    @JsonProperty("latitude")
    private String latitude;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public Input withId(String id) {
        this.id = id;
        return this;
    }

    @JsonProperty("iso2Code")
    public String getIso2Code() {
        return iso2Code;
    }

    @JsonProperty("iso2Code")
    public void setIso2Code(String iso2Code) {
        this.iso2Code = iso2Code;
    }

    public Input withIso2Code(String iso2Code) {
        this.iso2Code = iso2Code;
        return this;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    public Input withName(String name) {
        this.name = name;
        return this;
    }

    @JsonProperty("region")
    public Region getRegion() {
        return region;
    }

    @JsonProperty("region")
    public void setRegion(Region region) {
        this.region = region;
    }

    public Input withRegion(Region region) {
        this.region = region;
        return this;
    }

    @JsonProperty("adminregion")
    public Adminregion getAdminregion() {
        return adminregion;
    }

    @JsonProperty("adminregion")
    public void setAdminregion(Adminregion adminregion) {
        this.adminregion = adminregion;
    }

    public Input withAdminregion(Adminregion adminregion) {
        this.adminregion = adminregion;
        return this;
    }

    @JsonProperty("incomeLevel")
    public IncomeLevel getIncomeLevel() {
        return incomeLevel;
    }

    @JsonProperty("incomeLevel")
    public void setIncomeLevel(IncomeLevel incomeLevel) {
        this.incomeLevel = incomeLevel;
    }

    public Input withIncomeLevel(IncomeLevel incomeLevel) {
        this.incomeLevel = incomeLevel;
        return this;
    }

    @JsonProperty("lendingType")
    public LendingType getLendingType() {
        return lendingType;
    }

    @JsonProperty("lendingType")
    public void setLendingType(LendingType lendingType) {
        this.lendingType = lendingType;
    }

    public Input withLendingType(LendingType lendingType) {
        this.lendingType = lendingType;
        return this;
    }

    @JsonProperty("capitalCity")
    public String getCapitalCity() {
        return capitalCity;
    }

    @JsonProperty("capitalCity")
    public void setCapitalCity(String capitalCity) {
        this.capitalCity = capitalCity;
    }

    public Input withCapitalCity(String capitalCity) {
        this.capitalCity = capitalCity;
        return this;
    }

    @JsonProperty("longitude")
    public String getLongitude() {
        return longitude;
    }

    @JsonProperty("longitude")
    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public Input withLongitude(String longitude) {
        this.longitude = longitude;
        return this;
    }

    @JsonProperty("latitude")
    public String getLatitude() {
        return latitude;
    }

    @JsonProperty("latitude")
    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public Input withLatitude(String latitude) {
        this.latitude = latitude;
        return this;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return HashCodeBuilder.reflectionHashCode(this);
    }

    @Override
    public boolean equals(Object other) {
        return EqualsBuilder.reflectionEquals(this, other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
