import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

/*
Разработать программу регистрации пользователей на основе
эталона биометрического пароля пользователей, предварительно
сформировав вектор биометрических параметров, с использованием
предоставленных образцов клавиатурного почерка. Удалить
зарегистрированных пользователей, в парольной фразе которых содержится
символы «asdfg»
 */
public class Main {
    public static boolean checking_passwd(String passwd){
        return passwd.length() >= 6;
    }


    public static void main(String[] args) {
        /*
        HashMap<String, String> users = new HashMap<>();

        Scanner scanner = new Scanner(System.in);
        System.out.println("имя пользователя");
        String login = scanner.next();

        System.out.println("пароль");
        String passwd = scanner.next();
        boolean bad = true;
        while (bad){
            if (checking_passwd(passwd)){
                bad = false;
                users.put(login, passwd);
            }
        }
        System.out.println(users.get(login));

        User user = new User(login, passwd);
        List<User> users1 = new ArrayList<>();

         */
        List<User> users1 = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("номер действия");
        int n = scanner.nextInt();
        switch (n){
            case 1:
                System.out.println("логин введи");
                String login = scanner.next();
                System.out.println("пароль");
                String pass = scanner.next();
                User user = new User(login, pass);
                users1.add(user);

            case 2:
                System.out.println("fff");
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + n);
        }
        System.out.println(users1.get(0));

    }
}