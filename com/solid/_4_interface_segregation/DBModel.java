package com.solid._4_interface_segregation;

abstract class DBModel extends Model implements Savable, Refreshable {}
