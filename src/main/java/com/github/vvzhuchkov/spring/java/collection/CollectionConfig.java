package com.github.vvzhuchkov.spring.java.collection;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.*;

@Configuration
public class CollectionConfig {

    @Bean
    public Collection collectionProp() {

        final Properties itemProps = new Properties();
        itemProps.setProperty("1", "Honda");

        final HashMap<String, String> itemMap = new HashMap<String, String>();
        itemMap.put("1", "Honda");

        final List<String> itemList = Arrays.asList("Honda");

        final Set<String> set = Collections.singleton("Honda");

        return new Collection(
                itemList,
                set,
                itemMap,
                itemProps);
    }
}
