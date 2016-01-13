package com.firezyz.isay.web.service;

import com.firezyz.isay.core.generic.GenericService;
import com.firezyz.isay.web.model.Permission;

import java.util.List;

/**
 * 权限 业务接口
 * 
 * @author Firezyz
 **/
public interface PermissionService extends GenericService<Permission, Long> {

    /**
     * 通过角色id 查询角色 拥有的权限
     * 
     * @param roleId
     * @return
     */
    List<Permission> selectPermissionsByRoleId(Long roleId);

}
