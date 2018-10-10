package com.alex.patterns.facade.kotlin

import android.content.Context


class ComputerKotlin {

    private val cpu = CPUKotlin()
    private val memory = MemoryKotlin()
    private val hardDrive = HardDriveKotlin()

    fun startComputer(context : Context){
        cpu.freeze(context)
        memory.load(context, "BOOT_ADDRESS", hardDrive.read(context, "BOOT_SECTOR" , "SECTOR_SIZE"))
        cpu.jump(context, "BOOT_ADDRESS")
        cpu.execute(context)
    }
}