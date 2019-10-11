package self;
inport robocode.*;

public class Man extends Robot {
    public void run(){
        while(true){
            ahead(100);
            turnGunRight(360);
            back(100);
            turnGunRight(360);
        }
    }

    public void onScannedRobot(onScannedRobotEvent e){
        fire(1);
    }
}
