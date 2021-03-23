public class Circle extends ScalableFigure {

    public Circle(int x, int y, int r) {
        super(x, y, r);
    }

    @Override
    public void show() {
        System.out.println("Окружность показалась с координатами: " + getX() + "," + getY() + " и размером:" + getSize());
    }

    @Override
    public void hide() {
        System.out.println("Окружность спряталась с координатами: " + getX() + "," + getY() + " и размером:" + getSize());
    }
}
