package Repository;

import CBS.Account;

import java.util.HashMap;

public class AccountsRepo {
    //account Storage
    HashMap<Long, Account> acc_repo = new HashMap<>();

    //this saves the entry of the account in the Hashmap
    public void saveAccount (long account_number,Account object) {
        acc_repo.put(account_number,object);
    }

    //return an object of type Account by providing key account number
    public Account returnObject_for_AccountNumber(long account_number){
        if (acc_repo.containsKey(account_number)) {
            return acc_repo.get(account_number);
        }
        else
            return null;
    }

}
