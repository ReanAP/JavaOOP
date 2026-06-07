public class fish implements prey, predator{

    @Override
    public void flee(){
        System.out.println("The Fish Is Swimming Away");
    }
    @Override
    public void hunt(){
        System.out.println("The Fish Is Eating Smaller Fishes!");
    }
}
