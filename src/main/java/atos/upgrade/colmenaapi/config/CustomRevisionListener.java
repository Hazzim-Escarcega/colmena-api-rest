package atos.upgrade.colmenaapi.config;

import org.hibernate.envers.RevisionListener;

import atos.upgrade.colmenaapi.entities.audit.Revision;

public class CustomRevisionListener implements RevisionListener {

    @Override
    public void newRevision(Object revisionEntity) {
        final Revision revision = (Revision) revisionEntity;
    }

}
