public class Calc{

    public static void calc(double paramA, double paramB, char operation){
    if(operation == '+') {
        System.out.println(paramA + paramB);
    } else if(operation == '-') {
        System.out.println(paramA - paramB);
    } else if(operation == '/' ) {
        System.out.println(paramA / paramB);
    } else if(operation =='*') {
        System.out.println(paramA * paramB);
    } else {
        System.out.println("Incorrect operation");
        }
    }
    public static void main(String[] args) {
        calc(5,7, '*');
        calc(5,7, '/');
        calc(5,7, '-');
        calc(5,7, '+');
        calc(5,5, '-');
        calc(5,0, '/');
        }
}