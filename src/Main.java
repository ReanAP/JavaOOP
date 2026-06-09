import java.util.Scanner;

public class Main {
    public  static void main(String[] args){

//        fish fish = new fish();
//        hawk hawk = new hawk();
//        rabbit rabbit = new rabbit();
//
//
//
//        fish.flee();
//        fish.hunt();
//        hawk.hunt();
//        rabbit.flee();


        Scanner scanner = new Scanner(System.in);

        Animal animal;

        System.out.print("Choose 1 for Dog and 2 for Cat! ");
        int data = scanner.nextInt();

        if (data == 1){
            animal = new Dog();
            animal.speak();
        } else if (data == 2) {
            animal = new Cat();
            animal.speak();
        }

    }
}
