package com.laioffer.job.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

/**
 * @author yutong wang
 * @create 2020-11-02-6:32 PM
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ExtractResponseItem {
    public List<Extraction> extractions;

}
