package com.za.logback.extend.appender;

import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.core.ConsoleAppender;

public class RegReplaceConsoleAppender extends ConsoleAppender<ILoggingEvent> {
    private String regStr;
    private String regStrReplace;

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

    @Override
    protected void append(ILoggingEvent eventObject) {
        ITestLoggingEvent loggingEvent = new ITestLoggingEvent(eventObject);
        if (this.regStr != null && this.regStrReplace != null)
            loggingEvent.setFormattedMessage(eventObject.getFormattedMessage().replaceAll(regStr, regStrReplace));
        // System.out.println(loggingEvent.getFormattedMessage());
        super.append(loggingEvent);
    }

}
