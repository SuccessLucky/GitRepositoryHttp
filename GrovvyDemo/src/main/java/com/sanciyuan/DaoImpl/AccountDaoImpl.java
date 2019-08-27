package com.sanciyuan.DaoImpl;

import com.sanciyuan.Dao.AccountDao;

import java.util.List;

/**
 * @Author：
 * @Date：2019/8/15 15:32
 */
public class AccountDaoImpl implements AccountDao {

    @Override
    public List findAll() {
        System.out.println("查询成功!");
        return null;
    }
}
