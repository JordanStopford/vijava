/*================================================================================
Copyright (c) 2013 Steve Jin. All Rights Reserved.

Redistribution and use in source and binary forms, with or without modification, 
are permitted provided that the following conditions are met:

* Redistributions of source code must retain the above copyright notice, 
this list of conditions and the following disclaimer.

* Redistributions in binary form must reproduce the above copyright notice, 
this list of conditions and the following disclaimer in the documentation 
and/or other materials provided with the distribution.

* Neither the name of VMware, Inc. nor the names of its contributors may be used
to endorse or promote products derived from this software without specific prior 
written permission.

THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND 
ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED 
WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. 
IN NO EVENT SHALL VMWARE, INC. OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, 
INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT 
LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR 
PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, 
WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) 
ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE 
POSSIBILITY OF SUCH DAMAGE.
================================================================================*/

package com.vmware.vim25;

/**
 * @author Steve Jin (http://www.doublecloud.org)
 * @author Stefan Dilk
 * @version 6.5
 */
@SuppressWarnings("all")
public class VirtualMachineFlagInfo extends DynamicData {

    public Boolean disableAcceleration;
    public Boolean enableLogging;
    public Boolean useToe;
    @Deprecated
    public Boolean runWithDebugInfo;
    public String monitorType;
    public String htSharing;
    @Deprecated
    public Boolean snapshotDisabled;
    public Boolean snapshotLocked;
    public Boolean diskUuidEnabled;
    public String virtualMmuUsage;
    public String virtualExecUsage;
    public String snapshotPowerOffBehavior;
    @Deprecated
    public Boolean recordReplayEnabled;
    public Boolean cbrcCacheEnabled;
    public String faultToleranceType;

    public String getMonitorType() {
        return this.monitorType;
    }

    public void setMonitorType(String monitorType) {
        this.monitorType = monitorType;
    }

    public String getHtSharing() {
        return this.htSharing;
    }

    public void setHtSharing(String htSharing) {
        this.htSharing = htSharing;
    }

    public String getVirtualMmuUsage() {
        return this.virtualMmuUsage;
    }

    public void setVirtualMmuUsage(String virtualMmuUsage) {
        this.virtualMmuUsage = virtualMmuUsage;
    }

    public String getVirtualExecUsage() {
        return this.virtualExecUsage;
    }

    public void setVirtualExecUsage(String virtualExecUsage) {
        this.virtualExecUsage = virtualExecUsage;
    }

    public String getSnapshotPowerOffBehavior() {
        return this.snapshotPowerOffBehavior;
    }

    public void setSnapshotPowerOffBehavior(String snapshotPowerOffBehavior) {
        this.snapshotPowerOffBehavior = snapshotPowerOffBehavior;
    }

    public Boolean isDisableAcceleration() {
        return disableAcceleration;
    }

    public void setDisableAcceleration(Boolean disableAcceleration) {
        this.disableAcceleration = disableAcceleration;
    }

    public Boolean isEnableLogging() {
        return enableLogging;
    }

    public void setEnableLogging(Boolean enableLogging) {
        this.enableLogging = enableLogging;
    }

    public Boolean isUseToe() {
        return useToe;
    }

    public void setUseToe(Boolean useToe) {
        this.useToe = useToe;
    }

    @Deprecated
    public Boolean isRunWithDebugInfo() {
        return runWithDebugInfo;
    }

    @Deprecated
    public void setRunWithDebugInfo(Boolean runWithDebugInfo) {
        this.runWithDebugInfo = runWithDebugInfo;
    }

    @Deprecated
    public Boolean isSnapshotDisabled() {
        return snapshotDisabled;
    }

    @Deprecated
    public void setSnapshotDisabled(Boolean snapshotDisabled) {
        this.snapshotDisabled = snapshotDisabled;
    }

    public Boolean isSnapshotLocked() {
        return snapshotLocked;
    }

    public void setSnapshotLocked(Boolean snapshotLocked) {
        this.snapshotLocked = snapshotLocked;
    }

    public Boolean isDiskUuidEnabled() {
        return diskUuidEnabled;
    }

    public void setDiskUuidEnabled(Boolean diskUuidEnabled) {
        this.diskUuidEnabled = diskUuidEnabled;
    }

    @Deprecated
    public Boolean isRecordReplayEnabled() {
        return recordReplayEnabled;
    }

    @Deprecated
    public void setRecordReplayEnabled(Boolean recordReplayEnabled) {
        this.recordReplayEnabled = recordReplayEnabled;
    }

    public Boolean isCbrcCacheEnabled() {
        return cbrcCacheEnabled;
    }

    public void setCbrcCacheEnabled(final Boolean cbrcCacheEnabled) {
        this.cbrcCacheEnabled = cbrcCacheEnabled;
    }

    public String getFaultToleranceType() {
        return faultToleranceType;
    }

    public void setFaultToleranceType(final String faultToleranceType) {
        this.faultToleranceType = faultToleranceType;
    }
}