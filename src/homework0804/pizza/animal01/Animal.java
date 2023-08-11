package homework0804.pizza.animal01;

public abstract   class Animal {
    private String name;
    private String color;
    private String type;//哺乳类、非哺乳类

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Animal(String name, String color, String type) {
        this.name = name;
        this.color = color;
        this.type = type;
    }

    public abstract void eat();
    public abstract void bark();

}
