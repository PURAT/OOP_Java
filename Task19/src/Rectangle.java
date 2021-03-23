
public class Rectangle extends StretchableFigure {

    public Rectangle(int x1, int y1, int width, int height) {
        super(x1, y1, width, height);
    }

    @Override
    public void show() {
        System.out.println("Прямоугольник показался с координатами: " + getX() + "," + getY() + " и размерами:" + getWidth() + "," + getHeight());
    }

    @Override
    public void hide() {
        System.out.println("Прямоугольник спрятался с координатами: " + getX() + "," + getY() + " и размерами:" + getWidth() + "," + getHeight());
    }
}