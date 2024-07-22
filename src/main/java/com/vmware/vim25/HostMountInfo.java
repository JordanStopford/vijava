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
 * The HostMountInfo data object provides information related to a configured mount point.
 * This object does not include information about the mounted file system. (See HostFileSystemMountInfo.)
 *
 * @author Steve Jin (http://www.doublecloud.org)
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @version 8.0.0
 */
@SuppressWarnings("unused")
public class HostMountInfo extends DynamicData {

    private String path;
    private String accessMode;
    private Boolean mounted;
    private Boolean accessible;
    private HostMountInfoInaccessibleReason inaccessibleReason;
    private HostMountInfoMountFailedReason mountFailedReason;

    @Override
    public String toString() {
        return "HostMountInfo{" +
                "path='" + path + '\'' +
                ", accessMode='" + accessMode + '\'' +
                ", mounted=" + mounted +
                ", accessible=" + accessible +
                ", inaccessibleReason=" + inaccessibleReason +
                ", mountFailedReason=" + mountFailedReason +
                '}';
    }

    public String getPath() {
        return path;
    }

    public void setPath(final String path) {
        this.path = path;
    }

    public String getAccessMode() {
        return accessMode;
    }

    public void setAccessMode(final String accessMode) {
        this.accessMode = accessMode;
    }

    public Boolean getMounted() {
        return mounted;
    }

    public void setMounted(final Boolean mounted) {
        this.mounted = mounted;
    }

    public Boolean getAccessible() {
        return accessible;
    }

    public void setAccessible(final Boolean accessible) {
        this.accessible = accessible;
    }

    public HostMountInfoInaccessibleReason getInaccessibleReason() {
        return inaccessibleReason;
    }

    public void setInaccessibleReason(final HostMountInfoInaccessibleReason inaccessibleReason) {
        this.inaccessibleReason = inaccessibleReason;
    }

    public HostMountInfoMountFailedReason getMountFailedReason() {
        return mountFailedReason;
    }

    public void setMountFailedReason(final HostMountInfoMountFailedReason mountFailedReason) {
        this.mountFailedReason = mountFailedReason;
    }

}
