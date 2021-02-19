/*================================================================================
Copyright (c) 2008 VMware, Inc. All Rights Reserved.

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

package com.vmware.vim25.mo;

import com.vmware.vim25.*;

import java.rmi.RemoteException;

/**
 * ManagedEntity represents the managed objects that can be listed in the inventory tree.
 *
 * @author Steve JIN (http://www.doublecloud.org)
 * @author Stefan Dilk
 */
@SuppressWarnings("unused")
public class ManagedEntity extends ExtensibleManagedObject {

    private String name;

    public ManagedEntity(final ServerConnection sc, final ManagedObjectReference mor) {
        super(sc, mor);
    }

    public String getRealName() {
        return getCurrentProperty("name", String.class);
    }

    /* =========================Accessors=================================*/

    /**
     * @since SDK4.0
     */
    public boolean getAlarmActionEabled() {
        final Boolean aae = getCurrentProperty("alarmActionsEnabled", Boolean.class);
        return aae != null && aae;
    }

    public Event[] getConfigIssue() {
        return (Event[]) getCurrentProperty("configIssue");
    }

    public ManagedEntityStatus getConfigStatus() {
        return (ManagedEntityStatus) getCurrentProperty("configStatus");
    }

    public CustomFieldValue[] getCustomValue() {
        return (CustomFieldValue[]) getCurrentProperty("customValue");
    }

    public AlarmState[] getDeclaredAlarmState() {
        return (AlarmState[]) getCurrentProperty("declaredAlarmState");
    }

    public String[] getDisabledMethod() {
        return (String[]) getCurrentProperty("disabledMethod");
    }

    public int[] getEffectiveRole() {
        return (int[]) getCurrentProperty("effectiveRole");
    }

    public String getName() {
        if (this.name == null) {
            this.name = this.getRealName();
        }
        return this.name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public ManagedEntityStatus getOverallStatus() {
        return (ManagedEntityStatus) getCurrentProperty("overallStatus");
    }

    public ManagedEntity getParent() {
        return (ManagedEntity) this.getManagedObject("parent");
    }

    public Permission[] getPermission() {
        return (Permission[]) getCurrentProperty("permission");
    }

    public Task[] getRecentTasks() {
        return getTasks("recentTask");
    }

    /**
     * @since SDK4.0
     */
    public Tag[] getTag() {
        return (Tag[]) getCurrentProperty("tag");
    }

    public AlarmState[] getTriggeredAlarmState() {
        return (AlarmState[]) getCurrentProperty("triggeredAlarmState");
    }

    /* =========================Methods=================================*/

    public Task destroy_Task() throws VimFault, RuntimeFault, RemoteException {
        final ManagedObjectReference taskMor = getVimService().destroy_Task(getMOR());
        return new Task(getServerConnection(), taskMor);
    }

    public void reload() throws RuntimeFault, RemoteException {
        getVimService().reload(getMOR());
    }

    public Task rename_Task(final String name) throws InvalidName, DuplicateName, RuntimeFault, RemoteException {
        final ManagedObjectReference taskMor = getVimService().rename_Task(getMOR(), name);
        return new Task(getServerConnection(), taskMor);
    }


}
