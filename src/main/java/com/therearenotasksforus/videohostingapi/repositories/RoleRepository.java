package com.therearenotasksforus.videohostingapi.repositories;

import com.therearenotasksforus.videohostingapi.models.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Role findByName(String name);
}
