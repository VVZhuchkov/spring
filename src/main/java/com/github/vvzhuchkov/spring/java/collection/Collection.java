package com.github.vvzhuchkov.spring.java.collection;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Collection {
    private List<String> list;
    private Set<String> set;
    private Map<String, String> map;
    private Properties properties;

    public Collection() {
    }

    public Collection(List<String> list, Set<String> set, Map<String, String> map, Properties properties) {
        this.list = list;
        this.set = set;
        this.map = map;
        this.properties = properties;
    }

    public List<String> getList() {
        return list;
    }
    public void setList(List<String> list) {
        this.list = list;
    }

    public Set<String> getSet() {
        return set;
    }
    public void setSet(Set<String> set) {
        this.set = set;
    }

    public Map<String, String> getMap() {
        return map;
    }
    public void setMap(Map<String, String> map) {
        this.map = map;
    }

    public Properties getProperties() {
        return properties;
    }
    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    @Override
    public String toString() {
        return "Collection{" +
                "list=" + list +
                ", set=" + set +
                ", map=" + map +
                ", properties=" + properties +
                '}';
    }
}