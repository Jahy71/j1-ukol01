package cz.czechitas.java.ukol01;

import cz.czechitas.java.ukol01.engine.*;

public class HlavniProgram {

    public void castTreti() {
        Turtle zofka = new Turtle();

        zofka.penUp();
        zofka.turnRight(90);
        zofka.move(200);
        zofka.turnRight(90);
        zofka.move(100);
        zofka.turnRight(180);
        zofka.penDown();

        // nakreslení prasátka
        for (int i = 0; i < 2; i++) {
            zofka.move(50);
            zofka.turnRight(90);
            zofka.move(100);
            zofka.turnRight(90);
        }
        zofka.turnLeft(45);
        zofka.move(35);
        zofka.turnRight(90);
        zofka.move(35);
        zofka.penUp();
        zofka.turnRight(135);
        zofka.penDown();
        zofka.move(50);
        zofka.turnRight(25);
        zofka.move(20);
        zofka.turnLeft(180);
        zofka.move(20);
        zofka.turnRight(130);
        zofka.move(20);
        zofka.turnLeft(180);
        zofka.move(20);
        zofka.penUp();
        zofka.turnRight(115);
        zofka.move(100);
        zofka.turnRight(65);
        zofka.penDown();
        zofka.move(20);
        zofka.turnRight(180);
        zofka.move(20);
        zofka.turnLeft(140);
        zofka.move(20);

        // nakresleni domecku
        zofka.penUp();
        zofka.turnRight(75);
        zofka.move(300);
        zofka.penDown();

        // nakresledni 1. domecku
        for (int i = 0; i < 4; i++) {
            zofka.turnRight(90);
            zofka.move(50);
        }
        zofka.turnRight(90);
        zofka.move(50);
        zofka.turnRight(45);
        zofka.move(35);
        zofka.turnRight(90);
        zofka.move(35);

        zofka.penUp();
        zofka.turnRight(225);
        zofka.move(150);

        // nakresleni 2. domecku
        zofka.penDown();
        for (int i = 0; i < 4; i++) {
            zofka.turnLeft(90);
            zofka.move(50);
        }
        zofka.turnLeft(45);
        zofka.move(35);
        zofka.turnLeft(90);
        zofka.move(35);
        zofka.penUp();

        zofka.turnLeft(135);
        zofka.move(150);

        // nakresleni 3. domecku
        zofka.penDown();
        for (int i = 0; i < 4; i++) {
            zofka.move(50);
            zofka.turnRight(90);
        }
        zofka.turnLeft(45);
        zofka.move(35);
        zofka.turnRight(90);
        zofka.move(35);

        zofka.penUp();
        zofka.turnLeft(45);
        zofka.move(100);
        zofka.penDown();

        // nakresleni 4. domecku
        for (int i = 0; i < 4; i++) {
            zofka.move(50);
            zofka.turnRight(90);
        }
        zofka.turnLeft(45);
        zofka.move(35);
        zofka.turnRight(90);
        zofka.move(35);

        zofka.penUp();
        zofka.turnLeft(45);
        zofka.move(100);
        zofka.penDown();

        // nakresleni 5. domecku
        for (int i = 0; i < 4; i++) {
            zofka.move(50);
            zofka.turnRight(90);
        }
        zofka.turnLeft(45);
        zofka.move(35);
        zofka.turnRight(90);
        zofka.move(35);

        zofka.penUp();
        zofka.turnRight(45);
        zofka.move(150);
        zofka.penDown();

        // nakresleni 6. domecku
        for (int i = 0; i < 4; i++) {
            zofka.move(50);
            zofka.turnRight(90);
        }
        zofka.turnRight(135);
        zofka.move(35);
        zofka.turnLeft(90);
        zofka.move(35);
        zofka.penUp();

        // nakresleni slunicka
        zofka.turnRight(45);
        zofka.move(500);
        zofka.turnRight(90);
        zofka.move(200);
        zofka.penDown();

        for (int i = 0; i < 18; i++) {
            zofka.turnRight(90);
            zofka.move(25);
            zofka.turnRight(180);
            zofka.move(25);
            zofka.turnRight(90);
            zofka.move(20);
            zofka.turnLeft(20);
        }

    }

    public static void main(String[] args) {
        new HlavniProgram().castTreti();
    }
}