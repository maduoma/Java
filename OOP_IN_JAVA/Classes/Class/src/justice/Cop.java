package justice;

public class Cop {
    private int gun;
    public int getGun(){
        return gun;
    }
    protected void fire(){
        System.out.println("shoot!");
    }
}