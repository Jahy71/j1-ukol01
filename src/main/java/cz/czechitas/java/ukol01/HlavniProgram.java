package cz.czechitas.java.ukol01;

import cz.czechitas.java.ukol01.engine.*;

public class HlavniProgram {

    public void nakresliPrasatko() {
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

    public void osmiuhelnik() {
        Turtle zofka = new Turtle();

        zofka.penUp();
        zofka.turnLeft(180);
        zofka.move(150);
        zofka.penDown();

        for (int i = 0; i < 8; i++) {
            zofka.move(35);
            zofka.turnLeft(45);
            zofka.move(35);
        }
    }

    public void kolecko() {
        Turtle zofka = new Turtle();
        zofka.penUp();
        zofka.turnRight(90);
        zofka.move(300);
        zofka.turnRight(90);
        zofka.move(150);
        zofka.penDown();

        for (int i = 0; i < 18; i++) {
            zofka.move(30);
            zofka.turnLeft(20);
        }
    }

    public void slunicko() {
        Turtle zofka = new Turtle();
        zofka.penUp();
        zofka.turnRight(90);
        zofka.move(250);
        zofka.penDown();

        for (int i = 0; i < 18; i++) {
            zofka.turnRight(90);
            zofka.move(35);
            zofka.turnRight(180);
            zofka.move(35);
            zofka.turnRight(90);
            zofka.move(30);
            zofka.turnLeft(20);
        }

    }

    public static void main(String[] args) {
        new HlavniProgram().nakresliPrasatko();
        new HlavniProgram().osmiuhelnik();
        new HlavniProgram().kolecko();
        new HlavniProgram().slunicko();
    }
}