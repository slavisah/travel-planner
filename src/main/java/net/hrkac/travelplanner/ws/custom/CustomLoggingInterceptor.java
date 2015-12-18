package net.hrkac.travelplanner.ws.custom;

import javax.xml.transform.Source;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ws.WebServiceMessage;
import org.springframework.ws.server.endpoint.AbstractLoggingInterceptor;

public class CustomLoggingInterceptor extends AbstractLoggingInterceptor {

    private static final Logger LOG = LoggerFactory.getLogger(CustomLoggingInterceptor.class);

    @Override
    protected Source getSource(WebServiceMessage message) {
        return message.getPayloadSource();
    }

    @Override
    protected void logMessage(String message) {
        LOG.debug(message);
    }



}
