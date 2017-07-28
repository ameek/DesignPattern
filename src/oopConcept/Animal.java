package oopConcept;

public class Animal {

    private String name;
    private double height;
    private int weight;
    private String favoriteFood;
    private double speed;

    public Animal(String name,double height,int weight,String favoriteFood,double speed){
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.favoriteFood = favoriteFood;
        this.speed = speed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getFavoriteFood() {
        return favoriteFood;
    }

    public void setFavoriteFood(String favoriteFood) {
        this.favoriteFood = favoriteFood;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }
    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                ", favoriteFood='" + favoriteFood + '\'' +
                ", speed=" + speed +
                '}';
    }

}
