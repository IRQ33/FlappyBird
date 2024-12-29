package com.irq3.multiplayer.Managers;

import com.irq3.multiplayer.Models.Element;

import java.util.ArrayList;
import java.util.List;

public class HierarchyManager {

    public HierarchyManager()
    {
        elementList = new ArrayList<>();
    }

    private final List<Element> elementList;

    public List<Element> getElementList() {
        return elementList;
    }


    public void addElement(Element element)
    {
        elementList.add(element);
    }
    public void deleteElement(Element element) { elementList.remove(element);}

}
