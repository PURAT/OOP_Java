public class Ellipse extends StretchableFigure {

    public Ellipse(int x, int y, int width, int height) {
        super(x, y, width, height);
    }

    @Override
    public void show() {
        System.out.println("Эллипс показался с координатами: " + getX() + "," + getY() + " и размерами:" + getWidth() + "," + getHeight());
    }

    @Override
    public void hide() {
        System.out.println("Эллипс спрятался с координатами: " + getX() + "," + getY() + " и размерами:" + getWidth() + "," + getHeight());
    }
}
