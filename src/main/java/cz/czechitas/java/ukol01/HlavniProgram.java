package cz.czechitas.java.ukol01;

import cz.czechitas.java.ukol01.engine.*;

public class HlavniProgram {

    public void start() {
        Turtle zofka = new Turtle();

        for (int i = 0; i < 2; i++) {
            zofka.move(100);
            zofka.turnRight(90);
            zofka.move(200);
            zofka.turnRight(90);
        }

        zofka.turnLeft(45);
        zofka.move(70);
        zofka.turnRight(90);
        zofka.move(70);
        zofka.penUp();
        zofka.turnRight(135);

        zofka.penDown();
        zofka.move(100);
        zofka.turnRight(25);
        zofka.move(40);
        zofka.turnLeft(180);
        zofka.move(40);
        zofka.turnRight(130);
        zofka.move(40);
        zofka.turnLeft(180);
        zofka.move(40);
        zofka.penUp();
        zofka.turnRight(115);
        zofka.move(200);
        zofka.turnRight(65);
        zofka.penDown();
        zofka.move(40);
        zofka.turnRight(180);
        zofka.move(40);
        zofka.turnLeft(140);
        zofka.move(40);



    }

    public static void main(String[] args) {
        new HlavniProgram().start();
    }

}
