public class Eagle extends Bird implements Fly {

    private boolean flying;
    private int altitude;

    public Eagle(String name) {
        super(name);
        this.flying = false;
        this.altitude = 0;
    }

    

    public int getAltitude() {
        return altitude;
    }

    public boolean isFlying() {
        return flying;
    }

    @Override
    public String sing() {
        return "Screech!";
    }


    @Override 
    public void takeOff() {
        if (!this.flying && this.altitude == 0) {
            this.flying = true;
            System.out.println(this.getName() + " takes off in the sky");
        }
    }

    @Override
    public int ascend(int meters) {
        if (this.flying) {
            this.altitude = Math.min(this.altitude + meters, 325);
            System.out.println(this.getName() + " flies upward, altitude : " + this.altitude);
        }
        return this.altitude;
    } 

    
    
    @Override
    public void glide() {
        System.out.println("It glides into the air.");
    }

    @Override
    public int descend(int meters) {
        if (this.flying) {
            this.altitude = Math.max(this.altitude - meters, 0);
            System.out.println(this.getName() + "flies downward, altitude : " + this.altitude);
        }
        return this.altitude;
    }

    @Override
    public void land() {
        if (this.altitude > 9) {
            System.out.println(this.getName() + "is too hight, it can't lands");
        }
        else{
            System.out.println(this.getName() + " lands on the ground");
        }
    }
}
