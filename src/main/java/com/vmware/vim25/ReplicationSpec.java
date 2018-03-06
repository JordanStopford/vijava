package com.vmware.vim25;

/**
 * Created by Stefan Dilk {@literal <stefan.dilk@freenet.ag>} on 05.04.2018
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 6.5
 */
public class ReplicationSpec extends DynamicData {

    public ReplicationGroupId replicationGroupId;

    public ReplicationGroupId getReplicationGroupId() {
        return replicationGroupId;
    }

    public void setReplicationGroupId(final ReplicationGroupId replicationGroupId) {
        this.replicationGroupId = replicationGroupId;
    }
}
