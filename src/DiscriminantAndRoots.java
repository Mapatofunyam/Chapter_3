public class DiscriminantAndRoots {
    public static String roots(int a, int b, int c) {

        double root = Math.pow(b,2) - 4 * a * c;
        if   (root > 0){
            return a + "x^2 + " + b + "x + " + c + " has 2 real root";
        } else if (root < 0) {
            return a + "x^2 + " + b + "x + " + c + " has 2 imaginary root";
        } else {
            return a + "x^2 + " + b + "x + " + c + " has 1 real root";
        }

    }
    public static void main(String[] args){

        System.out.println(roots(1,4,4));
        System.out.println(roots(1,2,3));
        System.out.println(roots(1,5,6));


    }


}
