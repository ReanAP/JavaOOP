public class Car {

    String maker;
    String model;
    int year;
    String colour;

    Car(String maker, String model, int year, String colour){

        this.maker = maker;
        this.model = model;
        this.year = year;
        this.colour = colour;

    }

    @Override
    public String toString(){
        return this.maker + " " + this.model + " " + this.year + " " + this.colour;
    }
}
