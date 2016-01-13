package com.firezyz.isay.web.service.impl;

import com.firezyz.isay.core.generic.GenericDao;
import com.firezyz.isay.core.generic.GenericServiceImpl;
import com.firezyz.isay.web.dao.PermissionMapper;
import com.firezyz.isay.web.model.Permission;
import com.firezyz.isay.web.service.PermissionService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 权限Service实现类
 *
 * @author Firezyz
 */
@Service
public class PermissionServiceImpl extends GenericServiceImpl<Permission, Long> implements PermissionService {

    @Resource
    private PermissionMapper permissionMapper;


    @Override
    public GenericDao<Permission, Long> getDao() {
        return permissionMapper;
    }

    @Override
    public List<Permission> selectPermissionsByRoleId(Long roleId) {
        return permissionMapper.selectPermissionsByRoleId(roleId);
    }
}
