/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

/**
 *
 * @author phandungtri
 */
public class DTO_Product {
    private String id;
    private String name;
    private String description;
    private String publisherID;
    private String genreID;
    private String platform;
    private String releaseDate;
    private int quantity;
    private double price;

    public DTO_Product(){}
    public DTO_Product(String id, String name, String description, String publisherID, 
            String genre, String platform, String releaseDate, int quantity, double price) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.publisherID = publisherID;
        this.genreID = genre;
        this.platform = platform;
        this.releaseDate = releaseDate;
        this.quantity = quantity;
        this.price = price;
    }
    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getPublisherID() {
        return publisherID;
    }

    public String getGenreID() {
        return genreID;
    }

    public String getPlatform() {
        return platform;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPublisherID(String publisher) {
        this.publisherID = publisher;
    }

    public void setGenreID(String genre) {
        this.genreID = genre;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
