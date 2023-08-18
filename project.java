import java.util.*;
public class project{
    public static void main(String[] args) {
        calculator b = new calculator();
        Scanner scan = new Scanner(System.in);
        System.out.println("What kind of math do you want?\n1 for add\n 2 for subtract\n3 for multiply\n4 for divide\n5 for modulate");
        int x = scan.nextInt();
        System.out.println("What numbers r u using? input 2 nubers");
        double y = scan.nextDouble();
        double z = scan.nextDouble();
        if(x == 1){
            System.out.println("The answer to "+y+" plus "+z+" is "+b.calcadd(y,z));
        }
        else if(x == 2){
            System.out.println("The answer to "+y+" minus "+z+" is "+b.calcsub(y,z));
        }
        else if(x == 3){
            System.out.println("The answer to "+y+" times "+z+" is "+b.calcmlt(y,z));
        }
        else if(x == 4){
            System.out.println("The answer to "+y+" divided by "+z+" is "+b.calcdiv(y,z));
        }
        else if(x == 5){
            System.out.println("The answer to "+y+" mod "+z+" is "+b.calcmod(y,z));
        }
        else{
            System.out.println("That's not an option. Try again");
        }
        scan.close();
    }
}

class calculator{
    public double calcadd(double num1, double num2){
        return num1 + num2;
    }
    public double calcsub(double num1, double num2){
        return num1 - num2;
    }
    public double calcmlt(double num1, double num2){
        return num1 * num2;
    }
    public double calcdiv(double num1, double num2){
        return num1 / num2;
    }
    public double calcmod(double num1, double num2){
        return num1 % num2;
    }
}//fin.