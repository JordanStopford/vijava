/*================================================================================
Copyright (c) 2011 VMware, Inc. All Rights Reserved.

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

import com.vmware.vim25.GuestAuthentication;
import com.vmware.vim25.ManagedObjectReference;


/**
 * provides access to three different APIs to managed guests: file, process, auth, alias and registry
 *
 * @author Steve Jin (http://www.doublecloud.org)
 * @since SDK5.0
 */

public class GuestOperationsManager extends ManagedObject {
    public GuestOperationsManager(ServerConnection sc, ManagedObjectReference mor) {
        super(sc, mor);
    }

    /**
     *
     * @param vm VirtualMachine
     * @param auth GuestAuthentication
     * @return the GuestAliasManager
     * @since 6.0
     */
    public GuestAliasManager getAliasManager(final VirtualMachine vm, final GuestAuthentication auth) {
        final ManagedObjectReference mor = (ManagedObjectReference) getCurrentProperty("aliasManager");
        if (mor == null) {
            return null;
        }
        return new GuestAliasManager(getServerConnection(), mor, vm, auth);
    }

    public GuestAuthManager getAuthManager(VirtualMachine vm) {
        ManagedObjectReference mor = (ManagedObjectReference) getCurrentProperty("authManager");
        return new GuestAuthManager(getServerConnection(), mor, vm);
    }

    public GuestFileManager getFileManager(VirtualMachine vm) {
        ManagedObjectReference mor = (ManagedObjectReference) getCurrentProperty("fileManager");
        return new GuestFileManager(getServerConnection(), mor, vm);
    }

    /**
     *
     * @param vm VirtualMachine
     * @param auth GuestAuthentication
     * @return GuestWindowsRegistryManager
     * @since 6.0
     */
    public GuestWindowsRegistryManager getGuestWindowsRegistryManager(final VirtualMachine vm, final GuestAuthentication auth) {
        final ManagedObjectReference mor = (ManagedObjectReference) getCurrentProperty("guestWindowsRegistryManager");
        if (mor == null) {
            return null;
        }
        return new GuestWindowsRegistryManager(getServerConnection(), mor, vm, auth);
    }

    public GuestProcessManager getProcessManager(VirtualMachine vm) {
        ManagedObjectReference mor = (ManagedObjectReference) getCurrentProperty("processManager");
        return new GuestProcessManager(getServerConnection(), mor, vm);
    }

}