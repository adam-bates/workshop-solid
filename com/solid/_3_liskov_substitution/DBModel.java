package com.solid._3_liskov_substitution;

abstract class DBModel <T extends DBModel> extends Model {
    abstract public boolean save();
    abstract public T refresh();
}
