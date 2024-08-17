package main;
import java.awt.Color;
import java.awt.Graphics2D;

public class Ant {
    // Параметры муравья
    int x, y;
    int speed;
    int size;

    public Ant() {
        // Инициализация начальных параметров муравья
        x = 200;
        y = 200;
        speed = 2;
        size = 24; // размер муравья
    }

    public void update() {
        // Простая логика движения муравья
        x += speed;

        // Если муравей достигает края экрана, меняем направление
        if (x < 0 || x + size > 768) {
            speed = -speed; // Меняем направление движения
        }
    }

    public void draw(Graphics2D g2) {
        // Отрисовка муравья в виде красного круга
        g2.setColor(Color.red);
        g2.fillOval(x, y, size, size);
    }
}
