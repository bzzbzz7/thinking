package com.zz.java.thinking.behavior.command.command;

import com.zz.java.thinking.behavior.command.device.Stereo;

public class StereoOnCommand implements Command {
    private Stereo setreo;

    public StereoOnCommand(Stereo setreo) {
        this.setreo = setreo;
    }

    @Override
    public void execute() {
        // TODO Auto-generated method stub
        setreo.On();
        setreo.SetCd();

    }

    @Override
    public void undo() {
        // TODO Auto-generated method stub
        setreo.Off();
    }

}