package com.films.Films.Entity.MoviesUtils;

import java.util.Date;

public class Tomatoes {

    private Viewer viewer;
    private Date lastupdated;

    public Tomatoes(Viewer viewer, Date lastupdated) {
        this.viewer = viewer;
        this.lastupdated = lastupdated;
    }

    public Viewer getViewer() {
        return viewer;
    }

    public void setViewer(Viewer viewer) {
        this.viewer = viewer;
    }

    public Date getLastupdated() {
        return lastupdated;
    }

    public void setLastupdated(Date lastupdated) {
        this.lastupdated = lastupdated;
    }
}
