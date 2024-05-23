package intro;

public class Pizza {

    void deliver(){
        System.out.println("Your pizza is ready for pick-up at the store");
    }

    String deliver(String address){
        //System.out.printf("Your pizza will be delivered to %s", address);
        return String.format("Your pizza will be delivered to %s", address);
    }

    String deliver(String address, int time){

        return deliver(address) + " in " + time + " minutes";
    }

}
