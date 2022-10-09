import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n=sc.nextInt();
        boolean b = true;
        for(int i=2; i<n; i++){
            if(n%i == 0){
                b = false;
                break;
            }
        }
        if(b){
            System.out.println("the given number "+n+" is prime number");
        }
        else{
            System.out.println("the given number "+n+" is NOT prime number");
        }
    }
}
