package com.laioffer.job.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author yutong wang
 * @create 2020-11-04-12:46 PM
 */
public class HistoryRequestBody {
    @JsonProperty("user_id")
    public String userId;
    public Item favorite;
}



