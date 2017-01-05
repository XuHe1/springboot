package com.kyx.app.spring.conf;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Created by XuHe on 17/1/5.
 */
@Component
@ConfigurationProperties(prefix = "mybatis")
public class AppConf {
    private String typeAliasPackage;
    private String mapperLocations;

    public String getTypeAliasPackage() {
        return typeAliasPackage;
    }

    public void setTypeAliasPackage(String typeAliasPackage) {
        this.typeAliasPackage = typeAliasPackage;
    }

    public String getMapperLocations() {
        return mapperLocations;
    }

    public void setMapperLocations(String mapperLocations) {
        this.mapperLocations = mapperLocations;
    }
}
