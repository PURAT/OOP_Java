public class Triangle extends StretchableFigure {

    public Triangle(int x, int y, int size, int width, int height) {
        super(x, y, width, height);
    }

    @Override
    public void show() {
        System.out.println("Треугольник показался с координатами: " + getX() + "," + getY() + " и размерами:" + getWidth() + "," + getHeight());
    }

    @Override
    public void hide() {
        System.out.println("Треугольник спрятался с координатами: " + getX() + "," + getY() + " и размерами:" + getWidth() + "," + getHeight());
    }
}
