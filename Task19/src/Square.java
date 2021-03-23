public class Square extends ScalableFigure {

    public Square(int x, int y, int side) {
        super(x, y, side);
    }

    @Override
    public void show() {
        System.out.println("Квадрат показался с координатами: " + getX() + "," + getY() + " и размером:" + getSize());
    }

    @Override
    public void hide() {
        System.out.println("Квадрат спрятался с координатами: " + getX() + "," + getY() + " и размером:" + getSize());
    }
}
