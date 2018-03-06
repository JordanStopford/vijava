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
public class VirtualVideoCardOption extends VirtualDeviceOption {

    public LongOption videoRamSizeInKB;
    public LongOption graphicsMemorySizeInKB;
    public BoolOption graphicsMemorySizeSupported;
    public IntOption numDisplays;
    public BoolOption useAutoDetect;
    public BoolOption support3D;
    public BoolOption use3dRendererSupported;

    public LongOption getVideoRamSizeInKB() {
        return this.videoRamSizeInKB;
    }

    public void setVideoRamSizeInKB(LongOption videoRamSizeInKB) {
        this.videoRamSizeInKB = videoRamSizeInKB;
    }

    public IntOption getNumDisplays() {
        return this.numDisplays;
    }

    public void setNumDisplays(IntOption numDisplays) {
        this.numDisplays = numDisplays;
    }

    public BoolOption getUseAutoDetect() {
        return this.useAutoDetect;
    }

    public void setUseAutoDetect(BoolOption useAutoDetect) {
        this.useAutoDetect = useAutoDetect;
    }

    public BoolOption getSupport3D() {
        return this.support3D;
    }

    public void setSupport3D(BoolOption support3D) {
        this.support3D = support3D;
    }

    public BoolOption getUse3dRendererSupported() {
        return this.use3dRendererSupported;
    }

    public void setUse3dRendererSupported(BoolOption use3dRendererSupported) {
        this.use3dRendererSupported = use3dRendererSupported;
    }

    public LongOption getGraphicsMemorySizeInKB() {
        return graphicsMemorySizeInKB;
    }

    public void setGraphicsMemorySizeInKB(final LongOption graphicsMemorySizeInKB) {
        this.graphicsMemorySizeInKB = graphicsMemorySizeInKB;
    }

    public BoolOption getGraphicsMemorySizeSupported() {
        return graphicsMemorySizeSupported;
    }

    public void setGraphicsMemorySizeSupported(final BoolOption graphicsMemorySizeSupported) {
        this.graphicsMemorySizeSupported = graphicsMemorySizeSupported;
    }
}