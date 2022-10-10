package com.techscribbler.messaging;

import com.amazonaws.services.iot.client.AWSIotMessage;
import com.amazonaws.services.iot.client.AWSIotQos;
import com.amazonaws.services.iot.client.AWSIotTopic;
import com.techscribbler.config.AwsMqttSpringConfiguration;
import org.apache.commons.codec.binary.Hex;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class AWSIoTMQTTSubscriber extends AWSIotTopic {


    private static final Logger LOGGER = LoggerFactory.getLogger(AWSIoTMQTTSubscriber.class);
    public AWSIoTMQTTSubscriber(final AwsMqttSpringConfiguration awsMqttSpringConfiguration) {
        super(awsMqttSpringConfiguration.getFromDeviceTopic(),
                AWSIotQos.valueOf(awsMqttSpringConfiguration.getMqttQosLevel()));

    }

    public void onMessage(AWSIotMessage message) {
        String mqttTopic = message.getTopic();
        LOGGER.info("Received MQTT message for Hermes on {} topic with the payload: {}", mqttTopic,
                Hex.encodeHexString(message.getPayload()));

    }
}
