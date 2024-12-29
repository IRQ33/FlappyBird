package com.irq3.multiplayer.Managers;

import com.irq3.multiplayer.FastConfig;
import com.irq3.multiplayer.Objects.Pipe.Pipe;
import com.irq3.multiplayer.Screens.MainScreen;

import java.util.ArrayList;
import java.util.Iterator;

public class PipeManager {

    public static ArrayList<Pipe> pipeArrayList;

    public PipeManager()
    {
        pipeArrayList = new ArrayList<>();
    }

    public void Create(Pipe pipe)
    {
        MainScreen.hierarchyManager.addElement(pipe);
        pipeArrayList.add(pipe);

    }
    public void PipeMoveAndDelete() {
        Iterator<Pipe> iterator = pipeArrayList.iterator();
        while (iterator.hasNext()) {
            Pipe pipe = iterator.next();
            pipe.setElementX(pipe.getElementX() - FastConfig.pipeSpeed);
            if (pipe.getElementX() <= -300) {
                MainScreen.hierarchyManager.deleteElement(pipe);
                iterator.remove(); // Bezpieczne usuwanie elementu
            }
        }
    }


}
