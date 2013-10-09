package controllers;

import java.net.UnknownHostException;

import play.GlobalSettings;
import play.Logger;


public class ApplicationSetup extends GlobalSettings {

    @Override
    public void onStart(play.Application arg0) {
        super.beforeStart(arg0);
        Logger.debug("** Starting hola mundo .... **");
    }
}