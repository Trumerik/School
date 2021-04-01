//Erik Hellman
//2021-03-30

import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {

    public int startMenu(){
        return displayMenu();
    }

    public void failLogin(){
        System.out.println(
                "┌══════════════════════════════════════════════════════════┐\n" +
                "║              Fel Användarnamn eller lösenord             ║");
    }

    public void failRegister(){
        System.out.println(
                "┌══════════════════════════════════════════════════════════┐\n" +
                        "║              Användarnamnet är redan taget               ║");
    }

    public void succesfullRegister(){
        System.out.println(
                "┌══════════════════════════════════════════════════════════┐\n" +
                        "║                 Användare har registrats                 ║");
    }
    public void close(){
        System.out.println(
                "┌══════════════════════════════════════════════════════════┐\n" +
                "║                                                          ║\n" +
                "║                   Avslutar programmet                    ║\n" +
                "║                                                          ║\n" +
                "└══════════════════════════════════════════════════════════┘\n");
    }


    public Account register(){
        System.out.println("Select your username:");
        String username = getString();
        System.out.println("Select your password:");
        String password = getString();
        return new Account(username, password);
    }
    public Account login(){
        System.out.println("Enter your username:");
        String username = getString();
        System.out.println("Enter your password:");
        String password = getString();
        return new Account(username, password);
    }

    public int getInt(){
        Scanner keyboard = new Scanner(System.in);
        try {
            int nextint = keyboard.nextInt();
            return nextint;
        } catch (InputMismatchException Exc) {
            return 0;
        }
    }
    public String getString(){
        Scanner keyboard = new Scanner(System.in);
        String nextString = keyboard.nextLine();
        return nextString;
    }

    public int displayMenu(){
        System.out.print(
                        "├══════════════════════════════════════════════════════════┤\n" +
                        "║    ███╗   ███╗ █████╗ ██████╗ ████████╗██╗███╗   ██╗     ║\n" +
                        "║    ████╗ ████║██╔══██╗██╔══██╗╚══██╔══╝██║████╗  ██║     ║\n" +
                        "║    ██╔████╔██║███████║██████╔╝   ██║   ██║██╔██╗ ██║     ║\n" +
                        "║    ██║╚██╔╝██║██╔══██║██╔══██╗   ██║   ██║██║╚██╗██║     ║\n" +
                        "║    ██║ ╚═╝ ██║██║  ██║██║  ██║   ██║   ██║██║ ╚████║     ║\n" +
                        "║    ╚═╝     ╚═╝╚═╝  ╚═╝╚═╝  ╚═╝   ╚═╝   ╚═╝╚═╝  ╚═══╝     ║\n" +
                        "║  ██████╗  █████╗ ███╗   ██╗██╗  ██╗     █████╗ ██████╗   ║\n" +
                        "║  ██╔══██╗██╔══██╗████╗  ██║██║ ██╔╝    ██╔══██╗██╔══██╗  ║\n" +
                        "║  ██████╔╝███████║██╔██╗ ██║█████╔╝     ███████║██████╔╝  ║\n" +
                        "║  ██╔══██╗██╔══██║██║╚██╗██║██╔═██╗     ██╔══██║██╔══██╗  ║\n" +
                        "║  ██████╔╝██║  ██║██║ ╚████║██║  ██╗    ██║  ██║██████╔╝  ║\n" +
                        "║  ╚═════╝ ╚═╝  ╚═╝╚═╝  ╚═══╝╚═╝  ╚═╝    ╚═╝  ╚═╝╚═════╝   ║\n" +
                        "├══════════════════════════════════════════════════════════┤\n" +
                        "║                                                          ║\n" +
                        "║                      1) Logga In                         ║\n" +
                        "║                      2) Registrera                       ║\n" +
                        "║                      3) Avsluta                          ║\n" +
                        "║                                                          ║\n" +
                        "└══════════════════════════════════════════════════════════┘\n" + "\nSkriv ett nummer: ");
        return getInt();

    }

    public int loggedIn(Account account){
        System.out.print(
                        "┌══════════════════════════════════════════════════════════─\n" +
                        "║ Logged in as: " + account.getUsername() + "\n" +
                        "├══════════════════════════════════════════════════════════┬\n" +
                        "║    ███╗   ███╗ █████╗ ██████╗ ████████╗██╗███╗   ██╗     ║\n" +
                        "║    ████╗ ████║██╔══██╗██╔══██╗╚══██╔══╝██║████╗  ██║     ║\n" +
                        "║    ██╔████╔██║███████║██████╔╝   ██║   ██║██╔██╗ ██║     ║\n" +
                        "║    ██║╚██╔╝██║██╔══██║██╔══██╗   ██║   ██║██║╚██╗██║     ║\n" +
                        "║    ██║ ╚═╝ ██║██║  ██║██║  ██║   ██║   ██║██║ ╚████║     ║\n" +
                        "║    ╚═╝     ╚═╝╚═╝  ╚═╝╚═╝  ╚═╝   ╚═╝   ╚═╝╚═╝  ╚═══╝     ║\n" +
                        "║  ██████╗  █████╗ ███╗   ██╗██╗  ██╗     █████╗ ██████╗   ║\n" +
                        "║  ██╔══██╗██╔══██╗████╗  ██║██║ ██╔╝    ██╔══██╗██╔══██╗  ║\n" +
                        "║  ██████╔╝███████║██╔██╗ ██║█████╔╝     ███████║██████╔╝  ║\n" +
                        "║  ██╔══██╗██╔══██║██║╚██╗██║██╔═██╗     ██╔══██║██╔══██╗  ║\n" +
                        "║  ██████╔╝██║  ██║██║ ╚████║██║  ██╗    ██║  ██║██████╔╝  ║\n" +
                        "║  ╚═════╝ ╚═╝  ╚═╝╚═╝  ╚═══╝╚═╝  ╚═╝    ╚═╝  ╚═╝╚═════╝   ║\n" +
                        "├══════════════════════════════════════════════════════════┤\n" +
                        "║                      Banksaldo: 0kr                      ║\n" +
                        "║                                                          ║\n" +
                        "║                       1) Logga ut                        ║\n" +
                        "║                                                          ║\n" +
                        "└══════════════════════════════════════════════════════════┘\n" + "\nSkriv ett nummer: ");
        return getInt();
    }
}
