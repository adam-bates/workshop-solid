package com.solid._5_dependency_inversion;

abstract class DBModel <T extends DBModel> extends Model implements Savable, Refreshable <T> {}
