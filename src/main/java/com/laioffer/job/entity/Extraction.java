package com.laioffer.job.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author yutong wang
 * @create 2020-11-02-6:26 PM
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Extraction {
    @JsonProperty("tag_name")
    public String tagName;
    @JsonProperty("parsed_value")
    public String parsedValue;
    public int count;
    public String relevance;
}
