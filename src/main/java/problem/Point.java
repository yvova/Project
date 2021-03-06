package problem;

import javax.media.opengl.GL2;
import java.util.Random;

/**
 * Класс точки
 */
public class Point {

    double x;
    /**
     * y - координата точки
     */
    double y;

    /**
     * Конструктор точки
     *
     * @param x         координата x
     * @param y         координата y
     */
    Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Получить случайную точку
     *
     * @return случайная точка
     */
    static Point getRandomPoint() {
        Random r = new Random();
        double nx = (double) r.nextDouble() * 2 - 1;
        double ny = (double) r.nextDouble() * 2 - 1;
        return new Point(nx, ny);
    }

    /**
     * Рисование точки
     *
     * @param gl переменная OpenGl для рисования
     */
    void render(GL2 gl)
    {
        gl.glColor3d(1,1,1);
        Figures.renderPoint(gl, new Point(x,y), 3);
    }

    /**
     * Получить строковое представление точки
     *
     * @return строковое представление точки
     */
    @Override
    public String toString() {
        return "Точка с координатами: {" + x + "," + y + "}";
    }
}
