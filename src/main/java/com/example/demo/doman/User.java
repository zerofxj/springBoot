package com.example.demo.doman;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by zero-j on 2017/7/18.
 */
@Entity
public class User {
    @Id
    @GeneratedValue
    private Long id;

    private String name;

}
