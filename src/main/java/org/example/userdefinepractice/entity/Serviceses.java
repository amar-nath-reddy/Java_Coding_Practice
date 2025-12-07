package org.example.userdefinepractice.entity;

public class Serviceses {
    int id;
    String serviceName;
    double cost;
    String description;

    public Serviceses(int id, String serviceName, double cost, String description) {
        this.id = id;
        this.serviceName = serviceName;
        this.cost = cost;
        this.description = description;
    }

    @Override
    public String toString() {
        return "Serviceses{" +
                "id=" + id +
                ", serviceName='" + serviceName + '\'' +
                ", cost=" + cost +
                ", description='" + description + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
