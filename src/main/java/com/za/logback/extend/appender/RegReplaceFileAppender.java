package com.za.logback.extend.appender;

import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.core.rolling.RollingFileAppender;

public class RegReplaceFileAppender extends RollingFileAppender<ILoggingEvent> {
    private String regStr;
    private String regStrReplace;

    @Override
    protected void append(ILoggingEvent eventObject) {

        ITestLoggingEvent loggingEvent = new ITestLoggingEvent(eventObject);

        loggingEvent.setFormattedMessage(eventObject.getFormattedMessage().replaceAll(regStr, regStrReplace));

        super.append(loggingEvent);
    }

    public String getRegStr() {
        return regStr;
    }

    public void setRegStr(String regStr) {
        this.regStr = regStr;
    }

    public String getRegStrReplace() {
        return regStrReplace;
    }

    public void setRegStrReplace(String regStrReplace) {
        this.regStrReplace = regStrReplace;
    }

}
