public class HelloLambda{
    public static void main(String[] args) {

    }
    public void m1(){
        System.out.println("Hello Normal function..!");
    }

    //LambdaExpression -> no name, No return type, no access modifiers

    () -> System.out.println("Hello Lambda expression");
}
}