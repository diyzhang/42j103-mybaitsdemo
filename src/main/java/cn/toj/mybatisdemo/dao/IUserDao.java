package cn.toj.mybatisdemo.dao;

import cn.toj.mybatisdemo.domain.User;

import java.util.List;

/**
 *  用户的持久层接口
 */
public interface IUserDao {

    /**
     * 查询所有用户
     * @return
     */
    List<User> findAll();

}
