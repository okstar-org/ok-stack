package org.okstar.platform.org.rbac.mapper;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import org.okstar.platform.org.rbac.domain.OrgRbacResource;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class OrgRbacResourceMapper implements PanacheRepository<OrgRbacResource> {
}
