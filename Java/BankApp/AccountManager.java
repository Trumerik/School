//Erik Hellman
//2021-03-30

import java.util.ArrayList;

public class AccountManager {
    ArrayList<Account> accounts = new ArrayList<>();

    public void loadAccounts(ArrayList<Account> accounts){
        this.accounts = accounts;
    }

    public ArrayList<Account> getAccounts(){
        return accounts;
    }

    public boolean saveAccount(Account account){
        for(Account x : accounts){
            if(x.getUsername().equals(account.getUsername())){
                return false;
            }
        }
        accounts.add(account);
        return true;
    }

    public boolean checkAccount(Account account){
        for(Account x : accounts){
            if(x.getUsername().equals(account.getUsername()) && x.getPassword().equals(account.getPassword())){
                return true;
            }
        }
        return false;
    }

}
