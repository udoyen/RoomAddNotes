package com.connectsystems.georgek.roomaddnotes;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;

@Entity
public class User {
    @PrimaryKey(autoGenerate = true)
    private int user_id;

    private String username;

    private String useremail;

    public User(int user_id, String username, String useremail) {
        this.setUser_id(user_id);
        this.setUsername(username);
        this.setUseremail(useremail);
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUseremail() {
        return useremail;
    }

    public void setUseremail(String useremail) {
        this.useremail = useremail;
    }

    @Override
    public int hashCode() {
        int result = user_id;
        result = 31 * result + (useremail != null ? useremail.hashCode() : 0);
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if(!(obj instanceof User)) return false;

        User user = (User) obj;
        if(user_id != user.user_id) return false;
        return useremail != null ? useremail.equals(user.useremail) : user.useremail == null;

    }

    @NonNull
    @Override
    public String toString() {
        return "User{" +
                "user_id=" + user_id +
                ", username'" + username + '\'' +
                ", useremail='" + useremail + '\'' +
                '}';
    }
}
