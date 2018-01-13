package ua.nure.ponomarev.dao;

import ua.nure.ponomarev.criteria.UserCriteria;
import ua.nure.ponomarev.entity.Account;
import ua.nure.ponomarev.exception.DBException;

import java.util.List;
/**
 * @author Bogdan_Ponamarev.
 */
public interface AccountDao {
    List<Account> getAccounts(UserCriteria userCriteria) throws DBException;

    void putAccount(Account account, int userId) throws DBException;

    boolean isExist(int id,String cardNumber) throws DBException;

    void delete(int id) throws DBException;
}