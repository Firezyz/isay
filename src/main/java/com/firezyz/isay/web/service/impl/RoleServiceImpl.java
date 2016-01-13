package com.firezyz.isay.web.service.impl;

import com.firezyz.isay.core.generic.GenericDao;
import com.firezyz.isay.core.generic.GenericServiceImpl;
import com.firezyz.isay.web.dao.RoleMapper;
import com.firezyz.isay.web.model.Role;
import com.firezyz.isay.web.service.RoleService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 角色Service实现类
 *
 * @author Firezyz
 */
@Service
public class RoleServiceImpl extends GenericServiceImpl<Role, Long> implements RoleService {

    @Resource
    private RoleMapper roleMapper;

    @Override
    public GenericDao<Role, Long> getDao() {
        return roleMapper;
    }

    @Override
    public List<Role> selectRolesByUserId(Long userId) {
        return roleMapper.selectRolesByUserId(userId);
    }

}
