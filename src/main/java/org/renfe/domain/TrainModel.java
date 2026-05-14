package org.renfe.domain;

public class TrainModel {
    private  String id ;
    private String name ;
    private  String type ;
    private  String destination ;

    public TrainModel(String id, String name, String type, String destination) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.destination = destination;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    @Override
    public String toString() {
        return "TrainModel{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", destination='" + destination + '\'' +
                '}';
    }
}
