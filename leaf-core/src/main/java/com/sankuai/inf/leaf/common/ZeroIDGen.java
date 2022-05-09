package com.sankuai.inf.leaf.common;

import com.sankuai.inf.leaf.IDGen;

public class ZeroIDGen implements IDGen {
    @Override
    public Result get() {
        return new Result(0, Status.SUCCESS);
    }

    @Override
    public Result get(String key) {
        return null;
    }

    @Override
    public boolean init() {
        return true;
    }
}
