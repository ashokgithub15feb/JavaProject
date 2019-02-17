package com.durga.program.search.game;

public abstract class Player {
    void playTurn(int pl,int turn){}
    void playerInit(){}
    void notifyWin(int pl){}
    void notifyLose(int pl){}
}