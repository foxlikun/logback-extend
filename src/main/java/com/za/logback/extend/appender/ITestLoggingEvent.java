package com.za.logback.extend.appender;

import java.util.Map;

import org.slf4j.Marker;

import ch.qos.logback.classic.Level;
import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.classic.spi.IThrowableProxy;
import ch.qos.logback.classic.spi.LoggerContextVO;

public class ITestLoggingEvent implements ILoggingEvent {

    public void setFormattedMessage(String formattedMessage) {
        this.formattedMessage = formattedMessage;
    }

    public ILoggingEvent proxy;
    private String       formattedMessage;

    public ITestLoggingEvent(ILoggingEvent proxy) {
        this.proxy = proxy;
    }

    public String getThreadName() {
        // TODO Auto-generated method stub
        return proxy.getThreadName();
    }

    public Level getLevel() {
        // TODO Auto-generated method stub
        return proxy.getLevel();
    }

    public String getMessage() {
        // TODO Auto-generated method stub
        return proxy.getMessage();
    }

    public Object[] getArgumentArray() {
        // TODO Auto-generated method stub
        return proxy.getArgumentArray();
    }

    public String getFormattedMessage() {
        // TODO Auto-generated method stub
        return formattedMessage == null ? proxy.getFormattedMessage() : formattedMessage;
    }

    public String getLoggerName() {
        return proxy.getLoggerName();
    }

    public LoggerContextVO getLoggerContextVO() {
        return proxy.getLoggerContextVO();
    }

    public IThrowableProxy getThrowableProxy() {
        return proxy.getThrowableProxy();
    }

    public StackTraceElement[] getCallerData() {
        return proxy.getCallerData();
    }

    public boolean hasCallerData() {
        return proxy.hasCallerData();
    }

    public Marker getMarker() {
        return proxy.getMarker();
    }

    public Map<String, String> getMDCPropertyMap() {
        return proxy.getMDCPropertyMap();
    }

    public Map<String, String> getMdc() {
        return proxy.getMdc();
    }

    public long getTimeStamp() {
        return proxy.getTimeStamp();
    }

    public void prepareForDeferredProcessing() {
        proxy.prepareForDeferredProcessing();

    }

}
