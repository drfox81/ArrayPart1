public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();

    }

    private static void task4() {
        System.out.println("Задание 1-4");
        int[] first = {1, 2, 3};
        for (int i = 0; i < first.length; i++) {
            if (first[i] % 2 != 0) {
                first[i] += 1;
            }
            System.out.print(first[i] + " ");
        }
        System.out.println();
        System.out.println();

    }

    private static void task3() {
        System.out.println("Задание 1-3");
        int[] first = {1, 2, 3};
        for (int i = first.length - 1; i > 0; i--) {
            System.out.print(first[i] + ", ");
        }
        System.out.print(first[0]);
        System.out.println();
        double[] second = {1.57, 7.654, 9.986};
        for (int i = second.length - 1; i > 0; i--) {
            System.out.print(second[i] + ", ");
        }
        System.out.print(second[0]);
        System.out.println();
        boolean[] three = new boolean[3];
        for (int i = three.length - 1; i > 0; i--) {
            System.out.print(three[i] + ", ");
        }
        System.out.print(three[0]);
        System.out.println();
        System.out.println();
    }

    private static void task2() {
        System.out.println("Задание 1-2");
        int[] first = {1, 2, 3};
        for (int i = 0; i < first.length - 1; i++) {
            System.out.print(first[i] + ", ");
        }
        System.out.print(first[first.length - 1]);
        System.out.println();
        double[] second = {1.57, 7.654, 9.986};
        for (int i = 0; i < second.length - 1; i++) {
            System.out.print(second[i] + ", ");
        }
        System.out.print(second[second.length - 1]);
        System.out.println();
        boolean[] three = new boolean[3];
        for (int i = 0; i < three.length - 1; i++) {
            System.out.print(three[i] + ", ");
        }
        System.out.print(three[three.length - 1]);
        System.out.println();
        System.out.println();

    }

    private static void task1() {
        //System.out.println("Задание 1-1");
        int[] first = {1, 2, 3};
        double[] second = {1.57, 7.654, 9.986};
        boolean[] three = new boolean[3];
    }
}
