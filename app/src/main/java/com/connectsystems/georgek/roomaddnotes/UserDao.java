package com.connectsystems.georgek.roomaddnotes;

import android.arch.persistence.room.Dao;

import java.util.List;

@Dao
public interface UserDao {
    List<User> getAll();
}
