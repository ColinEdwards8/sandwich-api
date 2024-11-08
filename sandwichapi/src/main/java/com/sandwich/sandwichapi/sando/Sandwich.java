package com.sandwich.sandwichapi.sando;

public class Sandwich {
    private Long id;
    private String name;
    private String meat;
    private String topping;

    public Sandwich() {

    }

    public Sandwich(Long id, String name, String meat, String topping) {
        this.id = id;
        this.name = name;
        this.meat = meat;
        this.topping = topping;
    }

    public Sandwich(String name, String meat, String topping) {
        this.name = name;
        this.meat = meat;
        this.topping = topping;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMeat() {
        return meat;
    }

    public void setMeat(String meat) {
        this.meat = meat;
    }

    public String getTopping() {
        return topping;
    }

    public void setToppings(String topping) {
        this.topping = topping;
    }

    @Override
    public String toString() {
        return "Sandwich{" +
            "id=" + id + ", name=" + name + "meat=" + meat + "toppings=" + topping + "}";
    }
}
