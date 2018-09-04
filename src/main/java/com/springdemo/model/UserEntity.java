package com.springdemo.model;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "user", schema = "kingshang", catalog = "")
public class UserEntity {
    private String userid;
    private String username;
    private String password;
    private Timestamp createTime;
    private Timestamp expireTime;

    @Id
    @Column(name = "userid", nullable = false, length = 100)
    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    @Basic
    @Column(name = "username", nullable = true, length = 100)
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Basic
    @Column(name = "password", nullable = true, length = 256)
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Basic
    @Column(name = "createTime", nullable = true)
    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    @Basic
    @Column(name = "expireTime", nullable = true)
    public Timestamp getExpireTime() {
        return expireTime;
    }

    public void setExpireTime(Timestamp expireTime) {
        this.expireTime = expireTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserEntity that = (UserEntity) o;
        return Objects.equals(userid, that.userid) &&
                Objects.equals(username, that.username) &&
                Objects.equals(password, that.password) &&
                Objects.equals(createTime, that.createTime) &&
                Objects.equals(expireTime, that.expireTime);
    }

    @Override
    public int hashCode() {

        return Objects.hash(userid, username, password, createTime, expireTime);
    }
}
