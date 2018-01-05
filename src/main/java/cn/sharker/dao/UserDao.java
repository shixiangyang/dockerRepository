package cn.sharker.dao;

import cn.sharker.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by shixiangyang on 2017/12/29.
 */
@Repository
public interface UserDao extends JpaRepository<User, Long> {
}
