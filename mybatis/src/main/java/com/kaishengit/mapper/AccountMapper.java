package com.kaishengit.mapper;

import com.kaishengit.entity.Account;

/**
 * @author zh
 * Created by Administrator on 2017/11/4.
 */
public interface AccountMapper {
    Account findById(Long id);
    Account findById2(Long id);
    Account findByIdWithTag(Long id);
}
