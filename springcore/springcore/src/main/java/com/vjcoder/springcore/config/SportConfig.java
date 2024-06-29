package com.vjcoder.springcore.config;

import com.vjcoder.springcore.common.Coach;
import com.vjcoder.springcore.common.SwimCoach;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfig {

    @Bean("aquatic")
    public Coach swimCoach(){
        return  new SwimCoach();
    }
}
