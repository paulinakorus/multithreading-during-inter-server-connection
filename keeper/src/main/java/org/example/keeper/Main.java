package org.example.keeper;

import org.example.keeper.service.KeeperGUI;

public class Main {
    public static void main(String[] args){
        try{
            KeeperGUI keeperGUI = new KeeperGUI();
        }catch (Exception exception){
            exception.printStackTrace();
        }
    }
}