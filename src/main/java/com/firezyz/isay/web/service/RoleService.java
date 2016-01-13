package com.firezyz.isay.web.service;

import com.firezyz.isay.core.generic.GenericService;
import com.firezyz.isay.web.model.Role;

import java.util.List;

/**
 * 角色 业务接口
 * 
 * @author Firezyz
 **/
public interface RoleService extends GenericService<Role, Long> {
    /**
     * 通过用户id 查询用户 拥有的角色
     * 
     * @param userId
     * @return
     */
    List<Role> selectRolesByUserId(Long userId);
}
