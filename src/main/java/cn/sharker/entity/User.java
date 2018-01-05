package cn.sharker.entity;

import lombok.Data;

import javax.persistence.*;

/**
 * Created by shixiangyang on 2017/12/29.
 */
@Data @Entity
public class User {

    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private String username;

    @Column
    private Integer age;
}
