public class RunNIgga {
    public static void main(String[] args){
        Vehical[] vehicals = {new Carey(), new Bikey(), new Boatey()};

        for(Vehical vehical : vehicals){
            vehical.go();
        }
    }
}
