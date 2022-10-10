package com.techscribbler.config;


import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Getter
@Setter
@ConfigurationProperties(prefix = "awsmqttconfiguration")
@Component
public class AwsMqttSpringConfiguration {
    private String region;
    private String httpEndPoint;
    private String awsAccessKey;
    private String awsSecretKey;
    private int keepAlive;
    private int threadCount;
    private int mqttQosLevel;
    private String fromDeviceTopic;
    private String toDeviceTopic;

}