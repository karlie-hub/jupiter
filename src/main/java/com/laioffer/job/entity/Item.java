package com.laioffer.job.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Set;

/**
 * @author yutong wang
 * @create 2020-10-29-8:58 PM
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Item {
    private String id;
    private String title;
    private String location;
    private String companyLogo;
    private String url;
    private String description;
    private Set<String> keywords;
    private boolean favorite;

    public Item() {
    }

    public Item(String id, String title, String location, String companyLogo, String url, String description, Set<String> keywords, boolean favorite) {
        this.id = id;
        this.title = title;
        this.location = location;
        this.companyLogo = companyLogo;
        this.url = url;
        this.description = description;
        this.keywords = keywords;
        this.favorite = favorite;
    }

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("title")
    public String getTitle() {
        return title;
    }
    @JsonProperty("location")
    public String getLocation() {
        return location;
    }
    @JsonProperty("company_logo")
    public String getCompanyLogo() {
        return companyLogo;
    }
    @JsonProperty("url")
    public String getUrl() {
        return url;
    }

    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    public Set<String> getKeywords() {
        return keywords;
    }

    public boolean isFavorite() {
        return favorite;
    }

    public void setKeywords(Set<String> keywords) {
        this.keywords = keywords;
    }

    public void setFavorite(boolean favorite) {
        this.favorite = favorite;
    }

    @Override
    public String toString() {
        return "Item{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", location='" + location + '\'' +
                ", companyLogo='" + companyLogo + '\'' +
                ", url='" + url + '\'' +
                ", description='" + description + '\'' +
                ", keywords=" + keywords +
                ", favorite=" + favorite +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Item item = (Item) o;

        if (favorite != item.favorite) return false;
        if (id != null ? !id.equals(item.id) : item.id != null) return false;
        if (title != null ? !title.equals(item.title) : item.title != null) return false;
        if (location != null ? !location.equals(item.location) : item.location != null) return false;
        if (companyLogo != null ? !companyLogo.equals(item.companyLogo) : item.companyLogo != null) return false;
        if (url != null ? !url.equals(item.url) : item.url != null) return false;
        if (description != null ? !description.equals(item.description) : item.description != null) return false;
        return keywords != null ? keywords.equals(item.keywords) : item.keywords == null;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (location != null ? location.hashCode() : 0);
        result = 31 * result + (companyLogo != null ? companyLogo.hashCode() : 0);
        result = 31 * result + (url != null ? url.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (keywords != null ? keywords.hashCode() : 0);
        result = 31 * result + (favorite ? 1 : 0);
        return result;
    }
}
