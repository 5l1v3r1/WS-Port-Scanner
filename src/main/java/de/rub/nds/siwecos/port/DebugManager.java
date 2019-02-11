/**
 *  WS-Port-Scanner - A Webservice for NMAP in the SIWECOS-Project
 *
 *  Copyright 2019-2019 Ruhr University Bochum / Hackmanit GmbH
 *
 *  Licensed under Apache License 2.0
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 */
package de.rub.nds.siwecos.port;

public class DebugManager {

    private boolean debugEnabled = false;

    private static DebugManager instance = null;

    private DebugManager() {
    }

    public synchronized boolean isDebugEnabled() {
        return debugEnabled;
    }

    public synchronized void setDebugEnabled(boolean debugEnabled) {
        this.debugEnabled = debugEnabled;
    }

    public static DebugManager getInstance() {
        if (instance == null) {
            instance = new DebugManager();
        }
        return instance;
    }
}
