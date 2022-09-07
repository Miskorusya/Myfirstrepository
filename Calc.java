public class Calc {
    static void calcswitchcase(double paramA, double paramB, char operation) {
        double result = 0;
        switch (operation) {
            case '+':
                result = paramA + paramB;
                break;
            case '-':
                result = paramA - paramB;
                break;
            case '/':
                result = paramA / paramB;
                break;
            case '*':
                result = paramA * paramB;
                break;
            default:
                System.out.println("Incorrect operation");
        }
        System.out.println("Результат операции " + operation + " = " + result);
    }


    static void calcifelse(double paramA, double paramB, char operation){
        if (operation == '+') {
            System.out.println(paramA + paramB);
        } else if (operation == '-') {
            System.out.println(paramA - paramB);
        } else if (operation == '*') {
            System.out.println(paramA * paramB);
        } else if (operation == '/') {
            System.out.println(paramA / paramB);
        } else {
            System.out.println("Incorrect type of operation");
    }
    }
    public static void main(String[] args) {
        calcswitchcase(1, 5, '+');
        calcswitchcase(2, 5, '-');
        calcswitchcase(3, 5, '*');
        calcswitchcase(5, 0, '/');
        calcifelse(5,6,'+');
        calcifelse(5,8,'-');
        calcifelse(7,5,'*');
        calcifelse(9,3,'/');


    }
}

