package com.irq3.multiplayer.Managers;

import com.irq3.multiplayer.Models.Element;
import com.irq3.multiplayer.Objects.Pipe.Pipe;

import java.util.ArrayList;
import java.util.List;

public class PipeManager {

    public List<Element> pipemanager;
    public ArrayList<Pipe> pipeArrayList;

    public PipeManager(List<Element> pipemanager)
    {
        this.pipemanager = pipemanager;
        pipeArrayList = new ArrayList<>();
    }

    public void Create(Pipe pipe)
    {
        pipemanager.add(pipe);
        pipeArrayList.add(pipe);

    }
    public void PipeMoveAndDelete()
    {
        for (Pipe pipe : pipeArrayList)
        {
            pipe.setElementX(pipe.getElementX()-1);
            if(pipe.getElementX()== -300)
            {
                pipemanager.remove(pipe);
                pipeArrayList.remove(pipe);

            }
        }
    }


}
