package com.anakrusis.multiplayertest;

import java.io.Serializable;
import java.util.HashMap;
import java.util.UUID;

public class World implements Serializable {
    private HashMap<UUID, Entity> entities;

    private static final long serialVersionUID = 3898234898092L;

    public World(){
        entities = new HashMap<>();
    }

    public HashMap<UUID, Entity> getEntities() {
        return entities;
    }
}
