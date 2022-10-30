import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Director director = new Director("Zhyldyzbek", "17072002");
        System.out.println(director.getLogin() + " " + director.getPassword());
    }
}
