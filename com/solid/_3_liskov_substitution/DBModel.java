package com.solid._3_liskov_substitution;

abstract class DBModel extends Model {
    abstract public boolean save();
}
