package com.solid._4_interface_segregation;

abstract class DBModel <T extends DBModel> extends Model implements Savable, Refreshable <T> {}
