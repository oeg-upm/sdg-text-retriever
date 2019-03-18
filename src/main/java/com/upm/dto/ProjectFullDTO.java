/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.upm.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 *
 * @author Alberto Sánchez Ruiz
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "about",
    "amount",
    "costs",
    "currency",
    "currency-rate",
    "date-closed",
    "date-created",
    "date-passed",
    "date-published",
    "date-succeeded",
    "date-updated",
    "description",
    "description-short",
    "goal",
    "id",
    "image-gallery",
    "image-url",
    "image-url-big",
    "lang",
    "location",
    "minimum",
    "motivation",
    "name",
    "needs",
    "node",
    "optimum",
    "owner",
    "owner-name",
    "project-url",
    "rewards",
    "scope",
    "status",
    "time-elapsed",
    "translations",
    "user",
    "video-url",
    "widget-url"
})
public class ProjectFullDTO {

    @JsonProperty("about")
    private String about;
    @JsonProperty("amount")
    private Double amount;
    @JsonProperty("costs")
    private List<Cost> costs = null;
    @JsonProperty("currency")
    private String currency;
    @JsonProperty("currency-rate")
    private Double currencyRate;
    @JsonProperty("date-closed")
    private Object dateClosed;
    @JsonProperty("date-created")
    private String dateCreated;
    @JsonProperty("date-passed")
    private String datePassed;
    @JsonProperty("date-published")
    private String datePublished;
    @JsonProperty("date-succeeded")
    private String dateSucceeded;
    @JsonProperty("date-updated")
    private Object dateUpdated;
    @JsonProperty("description")
    private String description;
    @JsonProperty("description-short")
    private String descriptionShort;
    @JsonProperty("goal")
    private String goal;
    @JsonProperty("id")
    private String id;
    @JsonProperty("image-gallery")
    private List<ImageGallery> imageGallery = null;
    @JsonProperty("image-url")
    private String imageUrl;
    @JsonProperty("image-url-big")
    private String imageUrlBig;
    @JsonProperty("lang")
    private String lang;
    @JsonProperty("location")
    private Object location;
    @JsonProperty("minimum")
    private Double minimum;
    @JsonProperty("motivation")
    private String motivation;
    @JsonProperty("name")
    private String name;
    @JsonProperty("needs")
    private List<Need> needs = null;
    @JsonProperty("node")
    private String node;
    @JsonProperty("optimum")
    private Double optimum;
    @JsonProperty("owner")
    private String owner;
    @JsonProperty("owner-name")
    private String ownerName;
    @JsonProperty("project-url")
    private String projectUrl;
    @JsonProperty("rewards")
    private List<Reward> rewards = null;
    @JsonProperty("scope")
    private String scope;
    @JsonProperty("status")
    private String status;
    @JsonProperty("time-elapsed")
    private Double timeElapsed;
    @JsonProperty("translations")
    private Translations translations;
    @JsonProperty("user")
    private User user;
    @JsonProperty("video-url")
    private String videoUrl;
    @JsonProperty("widget-url")
    private String widgetUrl;

    @JsonProperty("about")
    public String getAbout() {
        return about;
    }

    @JsonProperty("about")
    public void setAbout(String about) {
        this.about = about;
    }

    @JsonProperty("amount")
    public Double getAmount() {
        return amount;
    }

    @JsonProperty("amount")
    public void setAmount(Double amount) {
        this.amount = amount;
    }

    @JsonProperty("costs")
    public List<Cost> getCosts() {
        return costs;
    }

    @JsonProperty("costs")
    public void setCosts(List<Cost> costs) {
        this.costs = costs;
    }

    @JsonProperty("currency")
    public String getCurrency() {
        return currency;
    }

    @JsonProperty("currency")
    public void setCurrency(String currency) {
        this.currency = currency;
    }

    @JsonProperty("currency-rate")
    public Double getCurrencyRate() {
        return currencyRate;
    }

    @JsonProperty("currency-rate")
    public void setCurrencyRate(Double currencyRate) {
        this.currencyRate = currencyRate;
    }

    @JsonProperty("date-closed")
    public Object getDateClosed() {
        return dateClosed;
    }

    @JsonProperty("date-closed")
    public void setDateClosed(Object dateClosed) {
        this.dateClosed = dateClosed;
    }

    @JsonProperty("date-created")
    public String getDateCreated() {
        return dateCreated;
    }

    @JsonProperty("date-created")
    public void setDateCreated(String dateCreated) {
        this.dateCreated = dateCreated;
    }

    @JsonProperty("date-passed")
    public String getDatePassed() {
        return datePassed;
    }

    @JsonProperty("date-passed")
    public void setDatePassed(String datePassed) {
        this.datePassed = datePassed;
    }

    @JsonProperty("date-published")
    public String getDatePublished() {
        return datePublished;
    }

    @JsonProperty("date-published")
    public void setDatePublished(String datePublished) {
        this.datePublished = datePublished;
    }

    @JsonProperty("date-succeeded")
    public String getDateSucceeded() {
        return dateSucceeded;
    }

    @JsonProperty("date-succeeded")
    public void setDateSucceeded(String dateSucceeded) {
        this.dateSucceeded = dateSucceeded;
    }

    @JsonProperty("date-updated")
    public Object getDateUpdated() {
        return dateUpdated;
    }

    @JsonProperty("date-updated")
    public void setDateUpdated(Object dateUpdated) {
        this.dateUpdated = dateUpdated;
    }

    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    @JsonProperty("description-short")
    public String getDescriptionShort() {
        return descriptionShort;
    }

    @JsonProperty("description-short")
    public void setDescriptionShort(String descriptionShort) {
        this.descriptionShort = descriptionShort;
    }

    @JsonProperty("goal")
    public String getGoal() {
        return goal;
    }

    @JsonProperty("goal")
    public void setGoal(String goal) {
        this.goal = goal;
    }

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("image-gallery")
    public List<ImageGallery> getImageGallery() {
        return imageGallery;
    }

    @JsonProperty("image-gallery")
    public void setImageGallery(List<ImageGallery> imageGallery) {
        this.imageGallery = imageGallery;
    }

    @JsonProperty("image-url")
    public String getImageUrl() {
        return imageUrl;
    }

    @JsonProperty("image-url")
    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    @JsonProperty("image-url-big")
    public String getImageUrlBig() {
        return imageUrlBig;
    }

    @JsonProperty("image-url-big")
    public void setImageUrlBig(String imageUrlBig) {
        this.imageUrlBig = imageUrlBig;
    }

    @JsonProperty("lang")
    public String getLang() {
        return lang;
    }

    @JsonProperty("lang")
    public void setLang(String lang) {
        this.lang = lang;
    }

    @JsonProperty("location")
    public Object getLocation() {
        return location;
    }

    @JsonProperty("location")
    public void setLocation(Object location) {
        this.location = location;
    }

    @JsonProperty("minimum")
    public Double getMinimum() {
        return minimum;
    }

    @JsonProperty("minimum")
    public void setMinimum(Double minimum) {
        this.minimum = minimum;
    }

    @JsonProperty("motivation")
    public String getMotivation() {
        return motivation;
    }

    @JsonProperty("motivation")
    public void setMotivation(String motivation) {
        this.motivation = motivation;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("needs")
    public List<Need> getNeeds() {
        return needs;
    }

    @JsonProperty("needs")
    public void setNeeds(List<Need> needs) {
        this.needs = needs;
    }

    @JsonProperty("node")
    public String getNode() {
        return node;
    }

    @JsonProperty("node")
    public void setNode(String node) {
        this.node = node;
    }

    @JsonProperty("optimum")
    public Double getOptimum() {
        return optimum;
    }

    @JsonProperty("optimum")
    public void setOptimum(Double optimum) {
        this.optimum = optimum;
    }

    @JsonProperty("owner")
    public String getOwner() {
        return owner;
    }

    @JsonProperty("owner")
    public void setOwner(String owner) {
        this.owner = owner;
    }

    @JsonProperty("owner-name")
    public String getOwnerName() {
        return ownerName;
    }

    @JsonProperty("owner-name")
    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    @JsonProperty("project-url")
    public String getProjectUrl() {
        return projectUrl;
    }

    @JsonProperty("project-url")
    public void setProjectUrl(String projectUrl) {
        this.projectUrl = projectUrl;
    }

    @JsonProperty("rewards")
    public List<Reward> getRewards() {
        return rewards;
    }

    @JsonProperty("rewards")
    public void setRewards(List<Reward> rewards) {
        this.rewards = rewards;
    }

    @JsonProperty("scope")
    public String getScope() {
        return scope;
    }

    @JsonProperty("scope")
    public void setScope(String scope) {
        this.scope = scope;
    }

    @JsonProperty("status")
    public String getStatus() {
        return status;
    }

    @JsonProperty("status")
    public void setStatus(String status) {
        this.status = status;
    }

    @JsonProperty("time-elapsed")
    public Double getTimeElapsed() {
        return timeElapsed;
    }

    @JsonProperty("time-elapsed")
    public void setTimeElapsed(Double timeElapsed) {
        this.timeElapsed = timeElapsed;
    }

    @JsonProperty("translations")
    public Translations getTranslations() {
        return translations;
    }

    @JsonProperty("translations")
    public void setTranslations(Translations translations) {
        this.translations = translations;
    }

    @JsonProperty("user")
    public User getUser() {
        return user;
    }

    @JsonProperty("user")
    public void setUser(User user) {
        this.user = user;
    }

    @JsonProperty("video-url")
    public String getVideoUrl() {
        return videoUrl;
    }

    @JsonProperty("video-url")
    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
    }

    @JsonProperty("widget-url")
    public String getWidgetUrl() {
        return widgetUrl;
    }

    @JsonProperty("widget-url")
    public void setWidgetUrl(String widgetUrl) {
        this.widgetUrl = widgetUrl;
    }

}
