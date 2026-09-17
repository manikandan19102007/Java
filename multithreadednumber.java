import java.util.Random;

class NumberGenerator extends Thread {
    static int number;

    public void run() {
        Random r = new Random();

        while (true) {
            number = r.nextInt(10) + 1;
            System.out.println("Generated Number = " + number);

            if (number % 2 == 0) {
                new SquareThread(number).start();
            } else {
                new CubeThread(number).start();
            }

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

class SquareThread extends Thread {
    int number;

    SquareThread(int number) {
        this.number = number;
    }

    public void run() {
        System.out.println("Square of " + number + " = " + (number * number));
    }
}

class CubeThread extends Thread {
    int number;

    CubeThread(int number) {
        this.number = number;
    }

    public void run() {
        System.out.println("Cube of " + number + " = " + (number * number * number));
    }
}

public class Main {
    public static void main(String[] args) {
        NumberGenerator t1 = new NumberGenerator();
        t1.start();
    }
