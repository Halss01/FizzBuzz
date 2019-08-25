public class FizzBuzz {

    public static void main (String[] args) {

       float[] D = new float[] {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34};

    int t= 0;
    int p= 0;

        float i;
        for (i = 0; i<=100; i++) {

            boolean T = false;
            boolean P = false;


            if (i / 3 == D[t]) {
                T = true;
                t++;
            }

            if (i / 5 == D[p]){
                P = true;
                p++;
            }

            if (!P & T){
                System.out.println("Fizz");
            }

            if (P & !T){
                System.out.println("Buzz");
            }

             if (P & T){
                System.out.println("FizzBuzz");
            }

            if (!P & !T) {
                System.out.println(i);
            }


                                 }
    }
}
