package com.techscribbler.messaging;

import com.amazonaws.services.iot.client.AWSIotException;
import com.amazonaws.services.iot.client.AWSIotQos;

import com.techscribbler.config.AwsMqttSpringConfiguration;
import org.apache.commons.codec.binary.Base64;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.amazonaws.services.iot.client.AWSIotMqttClient;
@Service
public class AWSIoTMQTTPublisher {
    private static final Logger LOGGER = LoggerFactory.getLogger(AWSIoTMQTTPublisher.class);

    @Autowired
    private final AWSIotMqttClient awsIotMqttClient;
    private final AwsMqttSpringConfiguration mqttSpringConfiguration;
    public AWSIoTMQTTPublisher(final AWSIotMqttClient awsIotMqttClient,
                                   final AwsMqttSpringConfiguration mqttSpringConfiguration) throws AWSIotException {
        this.awsIotMqttClient = awsIotMqttClient;
        this.mqttSpringConfiguration = mqttSpringConfiguration;
    }

    public void publish(final String macAddress, final byte[] payload) throws AWSIotException {
        final String toDeviceTopic = getMqttTopic(macAddress);
        awsIotMqttClient.publish(toDeviceTopic,
                AWSIotQos.valueOf(mqttSpringConfiguration.getMqttQosLevel()), payload);
        LOGGER.info("The published the message in base64 encoded: {} to the topic: {}",
                Base64.encodeBase64String(payload)
                , toDeviceTopic);
    }

    public String getMqttTopic(final String macAddress) {
        return String.format(mqttSpringConfiguration.getToDeviceTopic(), macAddress);
    }
}
