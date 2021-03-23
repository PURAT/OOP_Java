public class Dot extends Figure{

    public Dot(int x, int y) {
        super(x, y);
    }

    @Override
    public void show() {
        System.out.println("Точка показалась с координатами: " + getX() + "," + getY());
    }

    @Override
    public void hide() {
        System.out.println("Точка спряталась с координатами: " + getX() + "," + getY());
    }
}
