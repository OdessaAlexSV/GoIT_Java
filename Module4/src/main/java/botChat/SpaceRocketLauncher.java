package main.java.botChat;

public class SpaceRocketLauncher {

    private int bigRocketCount;
    private int smallRocketCount;

    public int getBigRocketCount() {
        return bigRocketCount;
    }

    public void setBigRocketCount(int bigRocketCount) {
        if (bigRocketCount<0 || bigRocketCount>100){
            return;
        }
        this.bigRocketCount = bigRocketCount;
    }

    public int getSmallRocketCount() {
        return smallRocketCount;
    }

    public void setSmallRocketCount(int smallRocketCount) {
        if (smallRocketCount < 0 || smallRocketCount > 100){
            return;
        }
        this.smallRocketCount = smallRocketCount;
    }

    public void launchBigRocket() {
        if (bigRocketCount > 0){
            int newAmount=getBigRocketCount()-1;
            setBigRocketCount(newAmount);
            System.out.println("Launch big rocket");
        }
    }

    public void launchSmallRocket() {
        if (smallRocketCount > 0){
            int newAmount=getSmallRocketCount()-1;
            setSmallRocketCount(newAmount);
            System.out.println("Launch small rocket");
        }
    }

    public int getTotalPower() {
        return ((getBigRocketCount() * 100) + (getSmallRocketCount() * 50));
    }
}
