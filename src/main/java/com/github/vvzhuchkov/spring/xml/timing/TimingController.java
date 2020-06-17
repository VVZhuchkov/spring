package com.github.vvzhuchkov.spring.xml.timing;

public class TimingController implements TimingControllerMBean {
    private boolean enabled = true;

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }
}
