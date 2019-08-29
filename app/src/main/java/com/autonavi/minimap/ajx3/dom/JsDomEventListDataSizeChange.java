package com.autonavi.minimap.ajx3.dom;

public class JsDomEventListDataSizeChange extends JsDomEventListData {
    public final JsDomNode node;

    private native long nativeGetNode(long j);

    JsDomEventListDataSizeChange(int i, long j) {
        super(i, j);
        long nativeGetNode = nativeGetNode(j);
        this.node = nativeGetNode != 0 ? new JsDomNode(nativeGetNode) : null;
    }
}
