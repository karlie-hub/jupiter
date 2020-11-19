package com.laioffer.job.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author yutong wang
 * @create 2020-11-04-9:17 PM
 */
public class RegisterRequestBody {
    @JsonProperty("user_id")
    public String userId;

    public String password;

    @JsonProperty("first_name")
    public String firstName;

    @JsonProperty("last_name")
    public String lastName;

}
