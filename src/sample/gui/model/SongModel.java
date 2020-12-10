package sample.gui.model;

import sample.bll.util.LogicFacade;

public class SongModel {

    private LogicFacade lF = new LogicFacade();

    public void playSong(){
       lF.playSong();
    }
}
