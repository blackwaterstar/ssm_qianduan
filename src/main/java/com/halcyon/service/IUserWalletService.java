package com.halcyon.service;

import com.halcyon.entity.TUserWallet;

public interface IUserWalletService {
    TUserWallet getTUserWallet(Long userId);
}