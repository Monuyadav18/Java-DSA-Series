package methods;

public class Method {

static void print2Table () {
    for (int i = 1; i <= 10; i++) {
        int sum = 2*i;
        System.out.println("2" + " * " + i + " => " + sum);
    }
}
// parameter
static void printSum (int a, int b ) {
    System.out.println("Sum => " + (a+b));
}

static void solve(int num) {
    System.out.println(num);
    num = num * 10;
    System.out.println(num);
}
static void sol(){
    int num = 5;
    System.out.println(num);
}

// HomeWork
    static void printWelcomeMessage() {
    System.out.println("Welcome to  the method/function part of Java!");
    }

    static int add(int a, int b) {
    int sum  = a+b;
    return sum;
    }

    static boolean isEven(int a){
    if(a%2==0){
        System.out.println("True");
    }
    return true;
    }

    static void getMaxium(int a, int b){
    if(a>b){
        System.out.println("A is Greater : " + a);
    }
    else{
        System.out.println("B is Greater : " + b);
    }
    return;
    }

    static void calculatePercentage(int obtained, int total){
    float percentage = (obtained*100)/total;
    System.out.println(percentage);
    }

    public static void main(String[] args) {
//        print2Table();

        //argument
//        printSum(10, 5);
//
//        int num = 5;
//        System.out.println(num);
//        solve(5);
//        System.out.println(num);
//        sol();

//        Homework

//        printWelcomeMessage();
//        add(5, 9);
//        isEven(10);
//        getMaxium(5, 9);
        calculatePercentage(342,500);




    }
}
