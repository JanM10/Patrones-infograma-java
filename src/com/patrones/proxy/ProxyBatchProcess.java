package com.patrones.proxy;

public class ProxyBatchProcess extends BatchProcess {

    private BatchProcessImp1 batchProcess;
    private String fileName;

    public ProxyBatchProcess(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void process() {
        if (batchProcess == null) {
            batchProcess = new BatchProcessImp1(fileName);
        }
        batchProcess.process();
    }
}
