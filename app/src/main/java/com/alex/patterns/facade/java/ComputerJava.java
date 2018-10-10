package com.alex.patterns.facade.java;

import android.content.Context;

public class ComputerJava {

    private CPUJava cpu = new CPUJava();
    private MemoryJava memory = new MemoryJava();
    private HardDriveJava hardDrive = new HardDriveJava();

    public void startComputer(Context context){
        cpu.freeze(context);
        memory.load(context, "BOOT_ADDRESS", hardDrive.read(context, "BOOT_SECTOR" , "SECTOR_SIZE"));
        cpu.jump(context, "BOOT_ADDRESS");
        cpu.execute(context);
    }
}
