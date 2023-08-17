import java.util.*;
public class project{
    public static void main(String[] args) {
        calculator b = new calculator();
        Scanner scan = new Scanner(System.in);
        System.out.println("What kind of math do you want?\n1 for add\n 2 for subtract\n3 for multiply\n4 for divide\n5 for modulate");
        int x = scan.nextInt();
        System.out.println("What numbers r u using? input 2 nubers");
        int y = scan.nextInt();
        int z = scan.nextInt();
        if(x == 1){
            b.calcadd()
        }
    }
}
public class calculator{

}