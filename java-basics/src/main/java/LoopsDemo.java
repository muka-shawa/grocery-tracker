public class LoopsDemo {

    public static void main(String[] args) {

        //iterates (rotates) thru the for loop from 0 ---> 10

        System.out.println("For Loop Example:");
        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
        }

        System.out.println("While Loop Example:");
        int i = 0;
        while (i <= 10) {
            System.out.println(i);
            i++; //increment by 1
        }

        System.out.println("All multiples of 5 from 0 ---> 100 ");
        for (int idx = 0; idx <= 100; idx++) {
            //use modulus division to check for a remainder
            if (idx % 5 == 0) {
                System.out.println(idx);
            }

        }
        }
    }