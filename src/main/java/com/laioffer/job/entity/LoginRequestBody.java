package com.laioffer.job.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author yutong wang
 * @create 2020-11-04-9:40 PM
 */
public class LoginRequestBody {
    @JsonProperty("user_id")
    public String userId;

    public String password;

}
