package com.fardindadev.CHIP8;

import jdk.jfr.Unsigned;

public class CHIP8 {

    private short opcode;
    private char[] memory = new char[4096];
    private char[] V = new char[16];
    private short I;
    private short pc;
    private char gfx[] = new char[64 * 32];
    private char delay_timer;
    private char sound_timer;
    private short[] stack = new short[16];
    private short sp;
    private char[] key = new char[16];

    public CHIP8() {
        //Init?
        pc = 0x200;
        opcode = 0;
        I = 0;
        sp = 0;

    }

    public void emulateCycle() {

    }

    //opcodes

    public void NNN() {

    }

}
