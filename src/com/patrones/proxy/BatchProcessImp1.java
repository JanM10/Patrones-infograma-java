package com.patrones.proxy;

public class BatchProcessImp1 extends BatchProcess {

    private final String fileName;

    public BatchProcessImp1(String fileName) {
        this.fileName = fileName;
        loadFromDisk(fileName);
    }

    @Override
    public void process() {
        System.out.println("Processing file " + fileName);
    }

    private void loadFromDisk(String fileName) {
        System.out.println("Expensive and hard process...");

        for (int i = 0; i < 10; i++) {
            System.out.println("Loading " + fileName + " " + i * 10 + "%");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
        }

        System.out.println("Loaded " + fileName);
    }
}
