package com.alipay.android.phone.mobilecommon.multimediabiz.biz.client.module.req;

public class FileChunksInfoReq extends AbstractHttpReq {
    private String fileId;

    public FileChunksInfoReq(String fileId2) {
        this.fileId = fileId2;
    }

    public String getFileId() {
        return this.fileId;
    }

    public void setFileId(String fileId2) {
        this.fileId = fileId2;
    }
}
