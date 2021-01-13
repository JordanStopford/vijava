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

import java.util.Arrays;
import java.util.Calendar;

/**
 * This data object type encapsulates configuration settings when creating or reconfiguring a virtual machine.
 * To support incremental changes, these properties are all optional.
 * If an optional property is unset, or any nested optional property is unset, the property will not be changed unless 'unset' is a valid value for the property.
 * To determine whether 'unset' is a valid value for a particular property, refer to the documentation for that property.
 *
 * @author Steve Jin (http://www.doublecloud.org)
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @version 6.7
 */
@SuppressWarnings("all")
public class VirtualMachineConfigSpec extends DynamicData {

    private String changeVersion;
    private String name;
    private String version;
    private Calendar createDate;
    private String uuid;
    private String instanceUuid;
    private Short npivDesiredNodeWwns;
    private Short npivDesiredPortWwns;
    private Long[] npivNodeWorldWideName;
    private Boolean npivOnNonRdmDisks;
    private Long[] npivPortWorldWideName;
    private Boolean npivTemporaryDisabled;
    private String npivWorldWideNameOp;
    private String npivWorldWideNameType;
    private String locationId;
    private String guestId;
    private String alternateGuestName;
    private String annotation;
    private VirtualMachineFileInfo files;
    private ToolsConfigInfo tools;
    private VirtualMachineFlagInfo flags;
    private VirtualMachineConsolePreferences consolePreferences;
    private VirtualMachineDefaultPowerOpInfo powerOpInfo;
    private Integer numCPUs;
    private Integer numCoresPerSocket;
    private Long memoryMB;
    private Boolean memoryHotAddEnabled;
    private Boolean cpuHotAddEnabled;
    private Boolean cpuHotRemoveEnabled;
    private Boolean virtualICH7MPresent;
    private Boolean virtualSMCPresent;
    private VirtualDeviceConfigSpec[] deviceChange;
    private ResourceAllocationInfo cpuAllocation;
    private ResourceAllocationInfo memoryAllocation;
    private LatencySensitivity latencySensitivity;
    private VirtualMachineAffinityInfo cpuAffinity;
    private VirtualMachineAffinityInfo memoryAffinity;
    @Deprecated
    private VirtualMachineNetworkShaperInfo networkShaper;
    private VirtualMachineCpuIdInfoSpec[] cpuFeatureMask;
    private OptionValue[] extraConfig;
    private String swapPlacement;
    private VirtualMachineBootOptions bootOptions;
    private VmConfigSpec vAppConfig;
    private FaultToleranceConfigInfo ftInfo;
    private ReplicationConfigSpec repConfig;
    private Boolean vAppConfigRemoved;
    private Boolean vAssertsEnabled;
    private Boolean changeTrackingEnabled;
    private String firmware;
    private Integer maxMksConnections;
    private Boolean guestAutoLockEnabled;
    private ManagedByInfo managedBy;
    @Deprecated
    private Boolean memoryReservationLockedToMax;
    private Boolean nestedHVEnabled;
    private Boolean vPMCEnabled;
    private ScheduledHardwareUpgradeInfo scheduledHardwareUpgradeInfo;
    private VirtualMachineProfileSpec[] vmProfile;
    private Boolean messageBusTunnelEnabled;
    private CryptoSpec crypto;
    private String migrateEncryption;

    @Override
    public String toString() {
        return "VirtualMachineConfigSpec{" +
                "alternateGuestName='" + alternateGuestName + '\'' +
                ", annotation='" + annotation + '\'' +
                ", bootOptions=" + bootOptions +
                ", changeTrackingEnabled=" + changeTrackingEnabled +
                ", changeVersion='" + changeVersion + '\'' +
                ", consolePreferences=" + consolePreferences +
                ", cpuAffinity=" + cpuAffinity +
                ", cpuAllocation=" + cpuAllocation +
                ", cpuFeatureMask=" + Arrays.toString(cpuFeatureMask) +
                ", cpuHotAddEnabled=" + cpuHotAddEnabled +
                ", cpuHotRemoveEnabled=" + cpuHotRemoveEnabled +
                ", createDate=" + createDate +
                ", crypto=" + crypto +
                ", deviceChange=" + Arrays.toString(deviceChange) +
                ", extraConfig=" + Arrays.toString(extraConfig) +
                ", files=" + files +
                ", firmware='" + firmware + '\'' +
                ", flags=" + flags +
                ", ftInfo=" + ftInfo +
                ", guestAutoLockEnabled=" + guestAutoLockEnabled +
                ", guestId='" + guestId + '\'' +
                ", instanceUuid='" + instanceUuid + '\'' +
                ", latencySensitivity=" + latencySensitivity +
                ", locationId='" + locationId + '\'' +
                ", managedBy=" + managedBy +
                ", maxMksConnections=" + maxMksConnections +
                ", memoryAffinity=" + memoryAffinity +
                ", memoryAllocation=" + memoryAllocation +
                ", memoryHotAddEnabled=" + memoryHotAddEnabled +
                ", memoryMB=" + memoryMB +
                ", memoryReservationLockedToMax=" + memoryReservationLockedToMax +
                ", messageBusTunnelEnabled=" + messageBusTunnelEnabled +
                ", migrateEncryption='" + migrateEncryption + '\'' +
                ", name='" + name + '\'' +
                ", nestedHVEnabled=" + nestedHVEnabled +
                ", networkShaper=" + networkShaper +
                ", npivDesiredNodeWwns=" + npivDesiredNodeWwns +
                ", npivDesiredPortWwns=" + npivDesiredPortWwns +
                ", npivNodeWorldWideName=" + Arrays.toString(npivNodeWorldWideName) +
                ", npivOnNonRdmDisks=" + npivOnNonRdmDisks +
                ", npivPortWorldWideName=" + Arrays.toString(npivPortWorldWideName) +
                ", npivTemporaryDisabled=" + npivTemporaryDisabled +
                ", npivWorldWideNameOp='" + npivWorldWideNameOp + '\'' +
                ", npivWorldWideNameType='" + npivWorldWideNameType + '\'' +
                ", numCoresPerSocket=" + numCoresPerSocket +
                ", numCPUs=" + numCPUs +
                ", powerOpInfo=" + powerOpInfo +
                ", repConfig=" + repConfig +
                ", scheduledHardwareUpgradeInfo=" + scheduledHardwareUpgradeInfo +
                ", swapPlacement='" + swapPlacement + '\'' +
                ", tools=" + tools +
                ", uuid='" + uuid + '\'' +
                ", vAppConfig=" + vAppConfig +
                ", vAppConfigRemoved=" + vAppConfigRemoved +
                ", vAssertsEnabled=" + vAssertsEnabled +
                ", version='" + version + '\'' +
                ", virtualICH7MPresent=" + virtualICH7MPresent +
                ", virtualSMCPresent=" + virtualSMCPresent +
                ", vmProfile=" + Arrays.toString(vmProfile) +
                ", vPMCEnabled=" + vPMCEnabled +
                "} " + super.toString();
    }

    public String getAlternateGuestName() {
        return alternateGuestName;
    }

    public void setAlternateGuestName(final String alternateGuestName) {
        this.alternateGuestName = alternateGuestName;
    }

    public String getAnnotation() {
        return annotation;
    }

    public void setAnnotation(final String annotation) {
        this.annotation = annotation;
    }

    public VirtualMachineBootOptions getBootOptions() {
        return bootOptions;
    }

    public void setBootOptions(final VirtualMachineBootOptions bootOptions) {
        this.bootOptions = bootOptions;
    }

    public Boolean getChangeTrackingEnabled() {
        return changeTrackingEnabled;
    }

    public void setChangeTrackingEnabled(final Boolean changeTrackingEnabled) {
        this.changeTrackingEnabled = changeTrackingEnabled;
    }

    public String getChangeVersion() {
        return changeVersion;
    }

    public void setChangeVersion(final String changeVersion) {
        this.changeVersion = changeVersion;
    }

    public VirtualMachineConsolePreferences getConsolePreferences() {
        return consolePreferences;
    }

    public void setConsolePreferences(final VirtualMachineConsolePreferences consolePreferences) {
        this.consolePreferences = consolePreferences;
    }

    public VirtualMachineAffinityInfo getCpuAffinity() {
        return cpuAffinity;
    }

    public void setCpuAffinity(final VirtualMachineAffinityInfo cpuAffinity) {
        this.cpuAffinity = cpuAffinity;
    }

    public ResourceAllocationInfo getCpuAllocation() {
        return cpuAllocation;
    }

    public void setCpuAllocation(final ResourceAllocationInfo cpuAllocation) {
        this.cpuAllocation = cpuAllocation;
    }

    public VirtualMachineCpuIdInfoSpec[] getCpuFeatureMask() {
        return cpuFeatureMask;
    }

    public void setCpuFeatureMask(final VirtualMachineCpuIdInfoSpec[] cpuFeatureMask) {
        this.cpuFeatureMask = cpuFeatureMask;
    }

    public Boolean getCpuHotAddEnabled() {
        return cpuHotAddEnabled;
    }

    public void setCpuHotAddEnabled(final Boolean cpuHotAddEnabled) {
        this.cpuHotAddEnabled = cpuHotAddEnabled;
    }

    public Boolean getCpuHotRemoveEnabled() {
        return cpuHotRemoveEnabled;
    }

    public void setCpuHotRemoveEnabled(final Boolean cpuHotRemoveEnabled) {
        this.cpuHotRemoveEnabled = cpuHotRemoveEnabled;
    }

    public Calendar getCreateDate() {
        return createDate;
    }

    public void setCreateDate(final Calendar createDate) {
        this.createDate = createDate;
    }

    public CryptoSpec getCrypto() {
        return crypto;
    }

    public void setCrypto(final CryptoSpec crypto) {
        this.crypto = crypto;
    }

    public VirtualDeviceConfigSpec[] getDeviceChange() {
        return deviceChange;
    }

    public void setDeviceChange(final VirtualDeviceConfigSpec[] deviceChange) {
        this.deviceChange = deviceChange;
    }

    public OptionValue[] getExtraConfig() {
        return extraConfig;
    }

    public void setExtraConfig(final OptionValue[] extraConfig) {
        this.extraConfig = extraConfig;
    }

    public VirtualMachineFileInfo getFiles() {
        return files;
    }

    public void setFiles(final VirtualMachineFileInfo files) {
        this.files = files;
    }

    public String getFirmware() {
        return firmware;
    }

    public void setFirmware(final String firmware) {
        this.firmware = firmware;
    }

    public VirtualMachineFlagInfo getFlags() {
        return flags;
    }

    public void setFlags(final VirtualMachineFlagInfo flags) {
        this.flags = flags;
    }

    public FaultToleranceConfigInfo getFtInfo() {
        return ftInfo;
    }

    public void setFtInfo(final FaultToleranceConfigInfo ftInfo) {
        this.ftInfo = ftInfo;
    }

    public Boolean getGuestAutoLockEnabled() {
        return guestAutoLockEnabled;
    }

    public void setGuestAutoLockEnabled(final Boolean guestAutoLockEnabled) {
        this.guestAutoLockEnabled = guestAutoLockEnabled;
    }

    public String getGuestId() {
        return guestId;
    }

    public void setGuestId(final String guestId) {
        this.guestId = guestId;
    }

    public String getInstanceUuid() {
        return instanceUuid;
    }

    public void setInstanceUuid(final String instanceUuid) {
        this.instanceUuid = instanceUuid;
    }

    public LatencySensitivity getLatencySensitivity() {
        return latencySensitivity;
    }

    public void setLatencySensitivity(final LatencySensitivity latencySensitivity) {
        this.latencySensitivity = latencySensitivity;
    }

    public String getLocationId() {
        return locationId;
    }

    public void setLocationId(final String locationId) {
        this.locationId = locationId;
    }

    public ManagedByInfo getManagedBy() {
        return managedBy;
    }

    public void setManagedBy(final ManagedByInfo managedBy) {
        this.managedBy = managedBy;
    }

    public Integer getMaxMksConnections() {
        return maxMksConnections;
    }

    public void setMaxMksConnections(final Integer maxMksConnections) {
        this.maxMksConnections = maxMksConnections;
    }

    public VirtualMachineAffinityInfo getMemoryAffinity() {
        return memoryAffinity;
    }

    public void setMemoryAffinity(final VirtualMachineAffinityInfo memoryAffinity) {
        this.memoryAffinity = memoryAffinity;
    }

    public ResourceAllocationInfo getMemoryAllocation() {
        return memoryAllocation;
    }

    public void setMemoryAllocation(final ResourceAllocationInfo memoryAllocation) {
        this.memoryAllocation = memoryAllocation;
    }

    public Boolean getMemoryHotAddEnabled() {
        return memoryHotAddEnabled;
    }

    public void setMemoryHotAddEnabled(final Boolean memoryHotAddEnabled) {
        this.memoryHotAddEnabled = memoryHotAddEnabled;
    }

    public Long getMemoryMB() {
        return memoryMB;
    }

    public void setMemoryMB(final Long memoryMB) {
        this.memoryMB = memoryMB;
    }

    public Boolean getMemoryReservationLockedToMax() {
        return memoryReservationLockedToMax;
    }

    public void setMemoryReservationLockedToMax(final Boolean memoryReservationLockedToMax) {
        this.memoryReservationLockedToMax = memoryReservationLockedToMax;
    }

    public Boolean getMessageBusTunnelEnabled() {
        return messageBusTunnelEnabled;
    }

    public void setMessageBusTunnelEnabled(final Boolean messageBusTunnelEnabled) {
        this.messageBusTunnelEnabled = messageBusTunnelEnabled;
    }

    public String getMigrateEncryption() {
        return migrateEncryption;
    }

    public void setMigrateEncryption(final String migrateEncryption) {
        this.migrateEncryption = migrateEncryption;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public Boolean getNestedHVEnabled() {
        return nestedHVEnabled;
    }

    public void setNestedHVEnabled(final Boolean nestedHVEnabled) {
        this.nestedHVEnabled = nestedHVEnabled;
    }

    public VirtualMachineNetworkShaperInfo getNetworkShaper() {
        return networkShaper;
    }

    public void setNetworkShaper(final VirtualMachineNetworkShaperInfo networkShaper) {
        this.networkShaper = networkShaper;
    }

    public Short getNpivDesiredNodeWwns() {
        return npivDesiredNodeWwns;
    }

    public void setNpivDesiredNodeWwns(final Short npivDesiredNodeWwns) {
        this.npivDesiredNodeWwns = npivDesiredNodeWwns;
    }

    public Short getNpivDesiredPortWwns() {
        return npivDesiredPortWwns;
    }

    public void setNpivDesiredPortWwns(final Short npivDesiredPortWwns) {
        this.npivDesiredPortWwns = npivDesiredPortWwns;
    }

    public Long[] getNpivNodeWorldWideName() {
        return npivNodeWorldWideName;
    }

    public void setNpivNodeWorldWideName(final Long[] npivNodeWorldWideName) {
        this.npivNodeWorldWideName = npivNodeWorldWideName;
    }

    public Boolean getNpivOnNonRdmDisks() {
        return npivOnNonRdmDisks;
    }

    public void setNpivOnNonRdmDisks(final Boolean npivOnNonRdmDisks) {
        this.npivOnNonRdmDisks = npivOnNonRdmDisks;
    }

    public Long[] getNpivPortWorldWideName() {
        return npivPortWorldWideName;
    }

    public void setNpivPortWorldWideName(final Long[] npivPortWorldWideName) {
        this.npivPortWorldWideName = npivPortWorldWideName;
    }

    public Boolean getNpivTemporaryDisabled() {
        return npivTemporaryDisabled;
    }

    public void setNpivTemporaryDisabled(final Boolean npivTemporaryDisabled) {
        this.npivTemporaryDisabled = npivTemporaryDisabled;
    }

    public String getNpivWorldWideNameOp() {
        return npivWorldWideNameOp;
    }

    public void setNpivWorldWideNameOp(final String npivWorldWideNameOp) {
        this.npivWorldWideNameOp = npivWorldWideNameOp;
    }

    public String getNpivWorldWideNameType() {
        return npivWorldWideNameType;
    }

    public void setNpivWorldWideNameType(final String npivWorldWideNameType) {
        this.npivWorldWideNameType = npivWorldWideNameType;
    }

    public Integer getNumCoresPerSocket() {
        return numCoresPerSocket;
    }

    public void setNumCoresPerSocket(final Integer numCoresPerSocket) {
        this.numCoresPerSocket = numCoresPerSocket;
    }

    public Integer getNumCPUs() {
        return numCPUs;
    }

    public void setNumCPUs(final Integer numCPUs) {
        this.numCPUs = numCPUs;
    }

    public VirtualMachineDefaultPowerOpInfo getPowerOpInfo() {
        return powerOpInfo;
    }

    public void setPowerOpInfo(final VirtualMachineDefaultPowerOpInfo powerOpInfo) {
        this.powerOpInfo = powerOpInfo;
    }

    public ReplicationConfigSpec getRepConfig() {
        return repConfig;
    }

    public void setRepConfig(final ReplicationConfigSpec repConfig) {
        this.repConfig = repConfig;
    }

    public ScheduledHardwareUpgradeInfo getScheduledHardwareUpgradeInfo() {
        return scheduledHardwareUpgradeInfo;
    }

    public void setScheduledHardwareUpgradeInfo(final ScheduledHardwareUpgradeInfo scheduledHardwareUpgradeInfo) {
        this.scheduledHardwareUpgradeInfo = scheduledHardwareUpgradeInfo;
    }

    public String getSwapPlacement() {
        return swapPlacement;
    }

    public void setSwapPlacement(final String swapPlacement) {
        this.swapPlacement = swapPlacement;
    }

    public ToolsConfigInfo getTools() {
        return tools;
    }

    public void setTools(final ToolsConfigInfo tools) {
        this.tools = tools;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(final String uuid) {
        this.uuid = uuid;
    }

    public VmConfigSpec getvAppConfig() {
        return vAppConfig;
    }

    public void setvAppConfig(final VmConfigSpec vAppConfig) {
        this.vAppConfig = vAppConfig;
    }

    public Boolean getvAppConfigRemoved() {
        return vAppConfigRemoved;
    }

    public void setvAppConfigRemoved(final Boolean vAppConfigRemoved) {
        this.vAppConfigRemoved = vAppConfigRemoved;
    }

    public Boolean getvAssertsEnabled() {
        return vAssertsEnabled;
    }

    public void setvAssertsEnabled(final Boolean vAssertsEnabled) {
        this.vAssertsEnabled = vAssertsEnabled;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(final String version) {
        this.version = version;
    }

    public Boolean getVirtualICH7MPresent() {
        return virtualICH7MPresent;
    }

    public void setVirtualICH7MPresent(final Boolean virtualICH7MPresent) {
        this.virtualICH7MPresent = virtualICH7MPresent;
    }

    public Boolean getVirtualSMCPresent() {
        return virtualSMCPresent;
    }

    public void setVirtualSMCPresent(final Boolean virtualSMCPresent) {
        this.virtualSMCPresent = virtualSMCPresent;
    }

    public VirtualMachineProfileSpec[] getVmProfile() {
        return vmProfile;
    }

    public void setVmProfile(final VirtualMachineProfileSpec[] vmProfile) {
        this.vmProfile = vmProfile;
    }

    public Boolean getvPMCEnabled() {
        return vPMCEnabled;
    }

    public void setvPMCEnabled(final Boolean vPMCEnabled) {
        this.vPMCEnabled = vPMCEnabled;
    }

}
