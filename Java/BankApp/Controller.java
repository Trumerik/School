//Erik Hellman
//2021-03-30

public class Controller {
    Menu menu = new Menu();
    AccountManager accountManager = new AccountManager();
    FileManager fileManager = new FileManager();

    public void startProgram() {
        accountManager.loadAccounts(fileManager.readFile());
        int val = 0;
        while (val != 3) {
            val = menu.startMenu();
            if (val == 1) {
                login();
            }
            if (val == 2) {
                register();
            }
            if (val == 3) {
                menu.close();

            }
        }
        fileManager.writeToFile(accountManager.getAccounts());
    }

    private void loggedIn(Account account) {
        int val = 0;
        while (val != 1){
            val = menu.loggedIn(account);
        }
    }

    private void login(){
        Account account = menu.login();
        if (accountManager.checkAccount(account)){
            loggedIn(account);
        }
        else{
            menu.failLogin();
        }
    }

    private void register(){
        if (!accountManager.saveAccount(menu.register())){
            menu.failRegister();
        }
        else{
            menu.succesfullRegister();
        }
    }

}
