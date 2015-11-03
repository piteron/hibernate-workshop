package org.perform.hibernate.config.profiles;

import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;

@Profile("javadb")
@PropertySource({ "classpath:javadb.properties" })
public class JavaDB {

}
