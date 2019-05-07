package com.msj.common.pojo;

import com.msj.common.entity.Product;
import com.msj.common.enums.ProductStatus;

public class ProductCustom extends Product {
    private ProductStatus productStatus;

    public ProductStatus getProductStatus() {
        return productStatus;
    }

    public void setProductStatus(ProductStatus productStatus) {
        this.productStatus = productStatus;
    }
}
