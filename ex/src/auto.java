public class auto {
    String brand="bmw";
    String color="black";
    String model="m5";
    int totalgears=6;
    int currentgear=3;
    boolean engineon=true;

    auto(){

    }
    void turnengineon(){
        engineon=true;

    }
    void  turnengineof(){
        engineon=false;
    }
    void increasegear(){
        if (currentgear<totalgears){
            currentgear++;
        }
    }
    void decreasegear(){
        if (currentgear>0){
            currentgear--;
        }
    }


}
