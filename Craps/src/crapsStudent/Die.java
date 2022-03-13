package crapsStudent;
public class Die {

    private int x;
    public void roll() {
        x = (int) ((Math.random() * 6) + 1);
    }

    public int getNumDots() {
        return x;
    }
}