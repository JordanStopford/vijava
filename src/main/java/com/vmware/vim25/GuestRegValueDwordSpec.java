package com.vmware.vim25;

/**
 * Created by Stefan Dilk {@literal <stefan.dilk@freenet.ag>} on 31.03.2018
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 6.0
 */
public class GuestRegValueDwordSpec extends GuestRegValueDataSpec {

    public int value;

    public int getValue() {
        return value;
    }

    public void setValue(final int value) {
        this.value = value;
    }
}
