public class HomeWorkApp {
        public static void main(String[] args) {
            printTreeWord();
            checkSumSing();
            printColor();
            compareNumbers();
            System.out.println("Hello, World");
        }
        private static void printTreeWord() {
            System.out.println("Orange");
            System.out.println("Banana");
            System.out.println("Apple");
        }

        private static void checkSumSing() {
            int a = 55;
            int b = 29;
            int c = a + b;
            if (c >= 0){
                System.out.println("Сумма положительная");
            }else{
                System.out.println("Сумма отрицательная");
            }

        }

        private static void printColor() {
            int value = 10;

            if (value <= 0) {
                System.out.println("Красный");
            }else if (value > 0 && value < 100) {
                System.out.println("Желтый");

            }else if (value > 100) {
                System.out.println("Зеленый");
            }else{
                System.out.println("Finish");
            }
        }



        private static void compareNumbers() {
            int a = 16;
            int b = 35;
            if ( a >= b){
                System.out.println("a>=b");
            }else {
                System.out.println("a<b");
            }
        }
    }
