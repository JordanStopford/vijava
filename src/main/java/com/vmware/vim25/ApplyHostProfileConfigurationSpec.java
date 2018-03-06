package com.vmware.vim25;

/**
 * Created by Stefan Dilk {@literal <stefan.dilk@freenet.ag>} on 05.04.2018
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 6.5
 */
public class ApplyHostProfileConfigurationSpec extends ProfileExecuteResult {

    public ManagedObjectReference host;
    public String[] taskListRequirement;
    public LocalizableMessage[] taskDescription;
    public Boolean rebootStateless;
    public Boolean rebootHost;
    public LocalizedMethodFault faultData;

    public LocalizedMethodFault getFaultData() {
        return faultData;
    }

    public void setFaultData(final LocalizedMethodFault faultData) {
        this.faultData = faultData;
    }

    public ManagedObjectReference getHost() {
        return host;
    }

    public void setHost(final ManagedObjectReference host) {
        this.host = host;
    }

    public Boolean isRebootHost() {
        return rebootHost;
    }

    public void setRebootHost(final Boolean rebootHost) {
        this.rebootHost = rebootHost;
    }

    public Boolean isRebootStateless() {
        return rebootStateless;
    }

    public void setRebootStateless(final Boolean rebootStateless) {
        this.rebootStateless = rebootStateless;
    }

    public LocalizableMessage[] getTaskDescription() {
        return taskDescription;
    }

    public void setTaskDescription(final LocalizableMessage[] taskDescription) {
        this.taskDescription = taskDescription;
    }

    public String[] getTaskListRequirement() {
        return taskListRequirement;
    }

    public void setTaskListRequirement(final String[] taskListRequirement) {
        this.taskListRequirement = taskListRequirement;
    }
}
