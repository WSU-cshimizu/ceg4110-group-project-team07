package com.teamseven07.geosyncra_backend.model;

public class ImageDto {

    private Integer id;
    private String name;
    private String location;
    private String description;
//    @Lob
//    private byte[] imageData;

    public ImageDto(Integer id,String name, String location, String description) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.description = description;
    }


    public Integer getId() {
        return id;
    }
    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public String getDescription() {
        return description;
    }
}
