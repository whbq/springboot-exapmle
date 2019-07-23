package com.qianshan.modal;

import java.io.Serializable;

/**
 * @author support1
 */
public class User implements Serializable {

    private Long userId;
    private String userNmae;

    public String getUserNmae() {
        return userNmae;
    }

    public void setUserNmae(String userNmae) {
        this.userNmae = userNmae;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }
}
