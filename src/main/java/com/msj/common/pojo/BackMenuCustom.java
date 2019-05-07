package com.msj.common.pojo;


import com.msj.common.entity.BackMenu;

import java.util.List;

public class BackMenuCustom extends BackMenu {
    private List<BackMenuCustom> children;

    public List<BackMenuCustom> getChildren() {
        return children;
    }

    public void setChildren(List<BackMenuCustom> children) {
        this.children = children;
    }
}
