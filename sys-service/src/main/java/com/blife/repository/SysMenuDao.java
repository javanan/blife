package com.blife.repository;


import com.blife.model.SysMenu;
import org.springframework.stereotype.Component;

/**
 * Created by chen on 2017/3/13.
 * <p>
 * Email 122741482@qq.com
 * <p>
 * Describe: 菜单dao
 */
@Component
public interface SysMenuDao extends TreeDao<SysMenu> {
}
